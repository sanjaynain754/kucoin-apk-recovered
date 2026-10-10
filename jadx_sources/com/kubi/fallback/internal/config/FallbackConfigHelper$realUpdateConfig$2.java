package com.kubi.fallback.internal.config;

import com.kubi.config.RemoteConfig;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wf.C45825b;

/* JADX INFO: compiled from: FallbackConfigHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.fallback.internal.config.FallbackConfigHelper$realUpdateConfig$2", m90122f = "FallbackConfigHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFallbackConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper$realUpdateConfig$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n774#2:206\n865#2,2:207\n774#2:209\n865#2,2:210\n*S KotlinDebug\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper$realUpdateConfig$2\n*L\n111#1:206\n111#1:207,2\n117#1:209\n117#1:210,2\n*E\n"})
public final class FallbackConfigHelper$realUpdateConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public FallbackConfigHelper$realUpdateConfig$2(Continuation<? super FallbackConfigHelper$realUpdateConfig$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackConfigHelper$realUpdateConfig$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FallbackConfigHelper$realUpdateConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean enabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<FallbackData> errorCodes;
        String path;
        List<FallbackData> dynamicRoutes;
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C45825b.f103310a.m101239b("Disaster recovery configuration data changes,start updating.");
            FallbackRemoteConfig fallbackRemoteConfig = (FallbackRemoteConfig) RemoteConfig.m20457a("fallbackConfig", FallbackRemoteConfig.class);
            FallbackConfigHelper fallbackConfigHelper = FallbackConfigHelper.f21941a;
            FallbackData globalFallback = null;
            if (fallbackRemoteConfig != null) {
                enabled = fallbackRemoteConfig.getEnabled();
            } else {
                enabled = null;
            }
            FallbackConfigHelper.f21943c = C27025c.m66567e(enabled, false);
            FallbackConfigHelper.f21944d.clear();
            CopyOnWriteArrayList copyOnWriteArrayList = FallbackConfigHelper.f21944d;
            if (fallbackRemoteConfig != null && (dynamicRoutes = fallbackRemoteConfig.getDynamicRoutes()) != null) {
                arrayList = new ArrayList();
                for (Object obj2 : dynamicRoutes) {
                    String path2 = ((FallbackData) obj2).getPath();
                    if (path2 != null && path2.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            copyOnWriteArrayList.addAll(C27024b.m66560c(arrayList));
            FallbackConfigHelper.f21945e.clear();
            CopyOnWriteArrayList copyOnWriteArrayList2 = FallbackConfigHelper.f21945e;
            if (fallbackRemoteConfig != null && (errorCodes = fallbackRemoteConfig.getErrorCodes()) != null) {
                arrayList2 = new ArrayList();
                for (Object obj3 : errorCodes) {
                    FallbackData fallbackData = (FallbackData) obj3;
                    String errorCode = fallbackData.getErrorCode();
                    if (errorCode != null && errorCode.length() != 0 && (path = fallbackData.getPath()) != null && path.length() != 0) {
                        arrayList2.add(obj3);
                    }
                }
            } else {
                arrayList2 = null;
            }
            copyOnWriteArrayList2.addAll(C27024b.m66560c(arrayList2));
            if (fallbackRemoteConfig != null) {
                globalFallback = fallbackRemoteConfig.getGlobalFallback();
            }
            FallbackConfigHelper fallbackConfigHelper2 = FallbackConfigHelper.f21941a;
            if (globalFallback == null || !FallbackConfigHelper.f21941a.m23764m(globalFallback)) {
                globalFallback = FallbackConfigHelper.f21942b;
            }
            FallbackConfigHelper.f21946f = globalFallback;
            C45825b.f103310a.m101239b("Disaster recovery configuration data changes,update completed.");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
