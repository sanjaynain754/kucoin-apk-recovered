package com.kubi.sdk.pkg.hybird;

import android.content.Context;
import com.kubi.sdk.pkg.task.TaskStatus;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: HybridPackageManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.hybird.HybridPackageManager$updateAll$2$1$status$2$1", m90122f = "HybridPackageManager.kt", m90123i = {1, 2}, m90124l = {105, 196, 105}, m90125m = "invokeSuspend", m90126n = {"$this$withPermit$iv$iv", "$this$withPermit$iv$iv"}, m90127s = {"L$2", "L$0"})
@SourceDebugExtension({"SMAP\nHybridPackageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$updateAll$2$1$status$2$1\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,187:1\n173#2,4:188\n177#2:199\n180#2:201\n81#3,7:192\n89#3:200\n*S KotlinDebug\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager$updateAll$2$1$status$2$1\n*L\n104#1:188,4\n104#1:199\n104#1:201\n104#1:192,7\n104#1:200\n*E\n"})
public final class HybridPackageManager$updateAll$2$1$status$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ OfflineUrlInfo $it;
    final /* synthetic */ InterfaceC44088g $semaphore;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridPackageManager$updateAll$2$1$status$2$1(InterfaceC44088g interfaceC44088g, Context context, OfflineUrlInfo offlineUrlInfo, Continuation<? super HybridPackageManager$updateAll$2$1$status$2$1> continuation) {
        super(2, continuation);
        this.$semaphore = interfaceC44088g;
        this.$context = context;
        this.$it = offlineUrlInfo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HybridPackageManager$updateAll$2$1$status$2$1(this.$semaphore, this.$context, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((HybridPackageManager$updateAll$2$1$status$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 == r0) goto L29;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC44088g interfaceC44088g;
        Context context;
        OfflineUrlInfo offlineUrlInfo;
        InterfaceC44088g interfaceC44088g2;
        Throwable th2;
        Object objM57734m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        interfaceC44088g2 = (InterfaceC44088g) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            TaskStatus taskStatus = (TaskStatus) obj;
                            interfaceC44088g2.release();
                            return taskStatus;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44088g2.release();
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC44088g interfaceC44088g3 = (InterfaceC44088g) this.L$2;
                offlineUrlInfo = (OfflineUrlInfo) this.L$1;
                context = (Context) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = interfaceC44088g3;
                try {
                    HybridUpdateTask hybridUpdateTask = new HybridUpdateTask(context, offlineUrlInfo.getUrl());
                    this.L$0 = interfaceC44088g;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objM57734m = hybridUpdateTask.m57734m(this);
                    if (objM57734m != coroutine_suspended) {
                        interfaceC44088g2 = interfaceC44088g;
                        obj = objM57734m;
                        TaskStatus taskStatus2 = (TaskStatus) obj;
                        interfaceC44088g2.release();
                        return taskStatus2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    interfaceC44088g2 = interfaceC44088g;
                    th2 = th4;
                    interfaceC44088g2.release();
                    throw th2;
                }
            }
            ResultKt.throwOnFailure(obj);
            return (TaskStatus) obj;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC44088g = this.$semaphore;
        Context context2 = this.$context;
        OfflineUrlInfo offlineUrlInfo2 = this.$it;
        if (interfaceC44088g == null) {
            HybridUpdateTask hybridUpdateTask2 = new HybridUpdateTask(context2, offlineUrlInfo2.getUrl());
            this.label = 1;
            obj = hybridUpdateTask2.m57734m(this);
        } else {
            this.L$0 = context2;
            this.L$1 = offlineUrlInfo2;
            this.L$2 = interfaceC44088g;
            this.label = 2;
            if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                context = context2;
                offlineUrlInfo = offlineUrlInfo2;
                HybridUpdateTask hybridUpdateTask3 = new HybridUpdateTask(context, offlineUrlInfo.getUrl());
                this.L$0 = interfaceC44088g;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                objM57734m = hybridUpdateTask3.m57734m(this);
                if (objM57734m != coroutine_suspended) {
                    interfaceC44088g2 = interfaceC44088g;
                    obj = objM57734m;
                    TaskStatus taskStatus3 = (TaskStatus) obj;
                    interfaceC44088g2.release();
                    return taskStatus3;
                }
            }
        }
        return coroutine_suspended;
    }
}
