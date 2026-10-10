package com.kubi.sdk.pkg.task;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.util.C23985b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PackageUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/PackageUpdateTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/task/e;", "packageInfo", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/e;Lcom/kubi/sdk/pkg/task/DownloadPriority;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Lcom/kubi/sdk/pkg/task/e;", "c", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PackageUpdateTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PackageUpdateInfo packageInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DownloadPriority priority;

    public PackageUpdateTask(@NotNull Context context, @NotNull PackageUpdateInfo packageInfo, @NotNull DownloadPriority priority) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.context = context;
        this.packageInfo = packageInfo;
        this.priority = priority;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.kubi.sdk.pkg.task.DownloadTask] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.kubi.sdk.pkg.task.DownloadTask] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.kubi.sdk.pkg.task.DownloadTask] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.kubi.sdk.pkg.task.DownloadTask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object m57790a(@NotNull Continuation<? super TaskStatus> continuation) throws Throwable {
        PackageUpdateTask$execute$1 packageUpdateTask$execute$1;
        ?? r11;
        PackageUpdateTask packageUpdateTask;
        PackageUpdateTask packageUpdateTask2;
        if (continuation instanceof PackageUpdateTask$execute$1) {
            packageUpdateTask$execute$1 = (PackageUpdateTask$execute$1) continuation;
            int i11 = packageUpdateTask$execute$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                packageUpdateTask$execute$1.label = i11 - Integer.MIN_VALUE;
            } else {
                packageUpdateTask$execute$1 = new PackageUpdateTask$execute$1(this, continuation);
            }
        } else {
            packageUpdateTask$execute$1 = new PackageUpdateTask$execute$1(this, continuation);
        }
        Object objM57770c = packageUpdateTask$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = packageUpdateTask$execute$1.label;
        try {
            if (r12 == 0) {
                ResultKt.throwOnFailure(objM57770c);
                DownloadTask downloadTask = new DownloadTask(this.context, this.packageInfo.m57837d(), this.priority);
                C23985b.f47489a.m57877e("bundleDownload", "PackageUpdateTask 开始下载: " + this.packageInfo.getName() + ' ' + this.packageInfo.getVersion());
                packageUpdateTask$execute$1.L$0 = this;
                packageUpdateTask$execute$1.L$1 = downloadTask;
                packageUpdateTask$execute$1.label = 1;
                objM57770c = downloadTask.m57770c(packageUpdateTask$execute$1);
                if (objM57770c != coroutine_suspended) {
                    packageUpdateTask = this;
                    r12 = downloadTask;
                }
                return coroutine_suspended;
            }
            if (r12 == 1) {
                DownloadTask downloadTask2 = (DownloadTask) packageUpdateTask$execute$1.L$1;
                packageUpdateTask = (PackageUpdateTask) packageUpdateTask$execute$1.L$0;
                ResultKt.throwOnFailure(objM57770c);
                r12 = downloadTask2;
            } else {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r11 = (DownloadTask) packageUpdateTask$execute$1.L$1;
                packageUpdateTask2 = (PackageUpdateTask) packageUpdateTask$execute$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM57770c);
                    r11 = r11;
                    TaskStatus taskStatus = (TaskStatus) objM57770c;
                    C23985b.f47489a.m57877e("bundleDownload", "PackageUpdateTask 部署完成: " + packageUpdateTask2.packageInfo.getName() + ' ' + packageUpdateTask2.packageInfo.getVersion() + ", code=" + taskStatus.getCode());
                    r11.m57769b();
                    return taskStatus;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            TaskStatus taskStatus2 = (TaskStatus) objM57770c;
            C23985b c23985b = C23985b.f47489a;
            c23985b.m57877e("bundleDownload", "PackageUpdateTask 下载完成: " + packageUpdateTask.packageInfo.getName() + ' ' + packageUpdateTask.packageInfo.getVersion() + ", code=" + taskStatus2.getCode());
            if (!taskStatus2.m57807h()) {
                r12.m57769b();
                return taskStatus2;
            }
            DeployInfo deployInfoM57836c = packageUpdateTask.packageInfo.m57836c(r12.getDownloadFile());
            c23985b.m57877e("bundleDownload", "PackageUpdateTask 提交部署: " + packageUpdateTask.packageInfo.getName() + ' ' + packageUpdateTask.packageInfo.getVersion() + ", priority=" + packageUpdateTask.priority + ", deployFile=" + r12.getDownloadFile());
            WorkPool workPool = WorkPool.f47436a;
            Context context = packageUpdateTask.context;
            DownloadPriority downloadPriority = packageUpdateTask.priority;
            packageUpdateTask$execute$1.L$0 = packageUpdateTask;
            packageUpdateTask$execute$1.L$1 = r12;
            packageUpdateTask$execute$1.label = 2;
            objM57770c = workPool.m57813c(context, deployInfoM57836c, downloadPriority, packageUpdateTask$execute$1);
            if (objM57770c != coroutine_suspended) {
                r11 = r12;
                packageUpdateTask2 = packageUpdateTask;
                TaskStatus taskStatus3 = (TaskStatus) objM57770c;
                C23985b.f47489a.m57877e("bundleDownload", "PackageUpdateTask 部署完成: " + packageUpdateTask2.packageInfo.getName() + ' ' + packageUpdateTask2.packageInfo.getVersion() + ", code=" + taskStatus3.getCode());
                r11.m57769b();
                return taskStatus3;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            r11 = r12;
        }
        r11.m57769b();
        throw th;
    }
}
