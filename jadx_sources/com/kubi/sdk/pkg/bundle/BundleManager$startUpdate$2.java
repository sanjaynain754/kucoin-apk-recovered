package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
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

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdate$2", m90122f = "BundleManager.kt", m90123i = {0, 0}, m90124l = {401}, m90125m = "invokeSuspend", m90126n = {"jsonUrl", "startTime"}, m90127s = {"L$0", "J$0"})
public final class BundleManager$startUpdate$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ String $biz;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $entry;
    final /* synthetic */ DownloadPriority $priority;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$startUpdate$2(String str, String str2, DownloadPriority downloadPriority, Context context, Continuation<? super BundleManager$startUpdate$2> continuation) {
        super(2, continuation);
        this.$biz = str;
        this.$entry = str2;
        this.$priority = downloadPriority;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$startUpdate$2(this.$biz, this.$entry, this.$priority, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleManager$startUpdate$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = this.J$0;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String strM57473H = BundleManager.f47277a.m57473H(this.$biz);
            if (strM57473H != null && strM57473H.length() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C23985b.f47489a.m57877e("bundleDownload", "startUpdate cloud path biz=" + this.$biz + " entry=" + this.$entry + " priority=" + this.$priority + " jsonUrl=" + strM57473H);
                BundleUpdateTask bundleUpdateTask = new BundleUpdateTask(this.$context, strM57473H, this.$priority, null, 8, null);
                this.L$0 = strM57473H;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                obj = bundleUpdateTask.m57504j(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strM57473H;
                j11 = jCurrentTimeMillis;
            } else {
                C23985b.f47489a.m57877e("metaJson", "startUpdate 加载Bundle的配置失败,没有可用的下载地址: " + this.$biz + '-' + this.$entry);
                return TaskStatus.INSTANCE.result(1500, "启动特定更新失败,没有可用的下载地址");
            }
        }
        TaskStatus taskStatus = (TaskStatus) obj;
        BundleManager bundleManager = BundleManager.f47277a;
        bundleManager.m57481U(this.$biz, taskStatus.getCode());
        if (taskStatus.m57807h()) {
            C23985b.f47489a.m57877e("loadBundle", "startUpdate success code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage());
            bundleManager.m57482V(this.$biz, System.currentTimeMillis() - j11);
            return taskStatus;
        }
        C23985b.m57873d(C23985b.f47489a, "loadBundle", "startUpdate error code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage() + ", jsonUrl:" + str, null, 4, null);
        return taskStatus;
    }
}
