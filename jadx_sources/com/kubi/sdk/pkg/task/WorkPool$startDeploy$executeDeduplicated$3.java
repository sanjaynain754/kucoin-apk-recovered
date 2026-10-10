package com.kubi.sdk.pkg.task;

import android.content.Context;
import com.kubi.sdk.pkg.util.C23985b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WorkPool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.WorkPool$startDeploy$executeDeduplicated$3", m90122f = "WorkPool.kt", m90123i = {}, m90124l = {57}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WorkPool$startDeploy$executeDeduplicated$3 extends SuspendLambda implements Function1<Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DeployInfo $deployInfo;
    final /* synthetic */ long $enqueueTime;
    final /* synthetic */ String $id;
    final /* synthetic */ DownloadPriority $priority;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkPool$startDeploy$executeDeduplicated$3(String str, DownloadPriority downloadPriority, long j11, Context context, DeployInfo deployInfo, Continuation<? super WorkPool$startDeploy$executeDeduplicated$3> continuation) {
        super(1, continuation);
        this.$id = str;
        this.$priority = downloadPriority;
        this.$enqueueTime = j11;
        this.$context = context;
        this.$deployInfo = deployInfo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new WorkPool$startDeploy$executeDeduplicated$3(this.$id, this.$priority, this.$enqueueTime, this.$context, this.$deployInfo, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super TaskStatus> continuation) {
        return ((WorkPool$startDeploy$executeDeduplicated$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        C23985b.f47489a.m57877e("bundleDownload", "WorkPool.startDeploy 开始执行: key=" + this.$id + ", priority=" + this.$priority + ", queueWaitMs=" + (System.currentTimeMillis() - this.$enqueueTime));
        DeployTask deployTask = new DeployTask(this.$context, this.$deployInfo);
        this.label = 1;
        Object objM57762c = deployTask.m57762c(this);
        if (objM57762c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM57762c;
    }
}
