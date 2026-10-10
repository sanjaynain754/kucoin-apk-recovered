package com.kubi.sdk.site.config;

import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: SupportSiteManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.SupportSiteManager$loadData$1", m90122f = "SupportSiteManager.kt", m90123i = {0, 0, 0, 0}, m90124l = {128}, m90125m = "invokeSuspend", m90126n = {"configString", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nSupportSiteManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSiteManager.kt\ncom/kubi/sdk/site/config/SupportSiteManager$loadData$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,125:1\n196#2,3:126\n*S KotlinDebug\n*F\n+ 1 SupportSiteManager.kt\ncom/kubi/sdk/site/config/SupportSiteManager$loadData$1\n*L\n46#1:126,3\n*E\n"})
public final class SupportSiteManager$loadData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public SupportSiteManager$loadData$1(Continuation<? super SupportSiteManager$loadData$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportSiteManager$loadData$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SupportSiteManager$loadData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        List listEmptyList = null;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C44128b.m97270n("SiteConfig::SupportSiteManager", "supportSites loadData supportSites=" + SupportSiteManager.f47894c);
                Object obj2 = SupportSiteManager.f47894c.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                if (!((Collection) obj2).isEmpty()) {
                    C44128b.m97270n("SiteConfig::SupportSiteManager", "supportSites not empty, return!!!");
                    return Unit.INSTANCE;
                }
                String strM102326h = C46392a.m102326h(SupportSiteManager.f47892a.m58059c(), "");
                C44128b.m97270n("SiteConfig::SupportSiteManager", "configString=" + strM102326h);
                if (strM102326h.length() == 0) {
                    C44128b.m97270n("SiteConfig::SupportSiteManager", "load config error: configString is null");
                    return Unit.INSTANCE;
                }
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C24131x168e63cc(strM102326h, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ArrayList arrayList = (ArrayList) obj;
            AtomicReference atomicReference = SupportSiteManager.f47894c;
            if (arrayList != null) {
                listEmptyList = CollectionsKt.toList(arrayList);
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            atomicReference.set(listEmptyList);
        } catch (Exception e11) {
            C44128b.m97261e("SiteConfig::SupportSiteManager", "load config from cache error: " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}
