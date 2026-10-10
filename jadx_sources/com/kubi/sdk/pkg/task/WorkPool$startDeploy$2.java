package com.kubi.sdk.pkg.task;

import android.content.Context;
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

/* JADX INFO: compiled from: WorkPool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.WorkPool$startDeploy$2", m90122f = "WorkPool.kt", m90123i = {}, m90124l = {66}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WorkPool$startDeploy$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DeployInfo $deployInfo;
    final /* synthetic */ long $enqueueTime;
    final /* synthetic */ String $id;
    final /* synthetic */ DownloadPriority $priority;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkPool$startDeploy$2(String str, DownloadPriority downloadPriority, long j11, Context context, DeployInfo deployInfo, Continuation<? super WorkPool$startDeploy$2> continuation) {
        super(2, continuation);
        this.$id = str;
        this.$priority = downloadPriority;
        this.$enqueueTime = j11;
        this.$context = context;
        this.$deployInfo = deployInfo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WorkPool$startDeploy$2(this.$id, this.$priority, this.$enqueueTime, this.$context, this.$deployInfo, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((WorkPool$startDeploy$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$id;
        DownloadPriority downloadPriority = this.$priority;
        long j11 = this.$enqueueTime;
        Context context = this.$context;
        DeployInfo deployInfo = this.$deployInfo;
        this.label = 1;
        Object objM57810e = WorkPool.m57810e(str, downloadPriority, j11, context, deployInfo, this);
        if (objM57810e == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM57810e;
    }
}
