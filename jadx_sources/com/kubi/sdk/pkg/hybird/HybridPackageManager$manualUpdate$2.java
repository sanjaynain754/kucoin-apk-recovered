package com.kubi.sdk.pkg.hybird;

import android.content.Context;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: HybridPackageManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.hybird.HybridPackageManager$manualUpdate$2", m90122f = "HybridPackageManager.kt", m90123i = {0, 0, 1}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS, 140}, m90125m = "invokeSuspend", m90126n = {"offlineUrlInfo", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$0"})
@SourceDebugExtension({"SMAP\nHybridPackageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$manualUpdate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,187:1\n288#2,2:188\n108#3,10:190\n*S KotlinDebug\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$manualUpdate$2\n*L\n128#1:188,2\n135#1:190,10\n*E\n"})
public final class HybridPackageManager$manualUpdate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $packageName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridPackageManager$manualUpdate$2(String str, Context context, Continuation<? super HybridPackageManager$manualUpdate$2> continuation) {
        super(2, continuation);
        this.$packageName = str;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HybridPackageManager$manualUpdate$2(this.$packageName, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Boolean> continuation) {
        return ((HybridPackageManager$manualUpdate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object next;
        OfflineUrlInfo offlineUrlInfo;
        InterfaceC44082a interfaceC44082a;
        String str;
        Context context;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean zM57807h = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zM57807h = ((TaskStatus) obj).m57807h();
                            Boolean boolBoxBoolean = Boxing.boxBoolean(zM57807h);
                            interfaceC44082a2.mo91345e(null);
                            return boolBoxBoolean;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44082a2.mo91345e(null);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.L$3;
                str = (String) this.L$2;
                InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) this.L$1;
                offlineUrlInfo = (OfflineUrlInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = interfaceC44082a3;
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$packageName.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySet = HybridPackageManager.sourceSet;
                    String str2 = this.$packageName;
                    Iterator it = copyOnWriteArraySet.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                            break;
                        }
                    } while (!Intrinsics.areEqual(((OfflineUrlInfo) next).getPackageName(), str2));
                    offlineUrlInfo = (OfflineUrlInfo) next;
                    if (offlineUrlInfo == null) {
                        C43840a.m96548b("package_update", "更新的sourceJsonList 为null");
                        return Boxing.boxBoolean(false);
                    }
                    HybridVersionManager.f47398a.m57749i(this.$packageName);
                    interfaceC44082a = HybridPackageManager.updateLock;
                    str = this.$packageName;
                    context = this.$context;
                    this.L$0 = offlineUrlInfo;
                    this.L$1 = interfaceC44082a;
                    this.L$2 = str;
                    this.L$3 = context;
                    this.label = 1;
                    if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(false);
            }
            if (!HybridVersionManager.f47398a.m57746f(str)) {
                C43840a.m96552g("package_update", str + " 已经更新过了");
                interfaceC44082a2 = interfaceC44082a;
            } else {
                HybridUpdateTask hybridUpdateTask = new HybridUpdateTask(context, offlineUrlInfo.getUrl());
                this.L$0 = interfaceC44082a;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objM57734m = hybridUpdateTask.m57734m(this);
                if (objM57734m != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    obj = objM57734m;
                    zM57807h = ((TaskStatus) obj).m57807h();
                }
                return coroutine_suspended;
            }
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(zM57807h);
            interfaceC44082a2.mo91345e(null);
            return boolBoxBoolean2;
        } catch (Throwable th4) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th4;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }
}
