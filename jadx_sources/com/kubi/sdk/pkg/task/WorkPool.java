package com.kubi.sdk.pkg.task;

import android.content.Context;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.SingleDeferredCache;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: WorkPool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/WorkPool;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/task/c;", "deployInfo", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "c", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/c;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/task/e;", "updateInfo", "f", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/e;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "jsonUrl", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/util/SingleDeferredCache;", "Lcom/kubi/sdk/pkg/util/SingleDeferredCache;", "deployTaskCache", "updateTaskCache", "d", "pullJsonCache", "", "e", "J", "JSON_CACHE_TIME", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WorkPool {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WorkPool f47436a = new WorkPool();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final SingleDeferredCache<TaskStatus> deployTaskCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final SingleDeferredCache<TaskStatus> updateTaskCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final SingleDeferredCache<String> pullJsonCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final long JSON_CACHE_TIME;

    static {
        SingleDeferredCache.Companion companion = SingleDeferredCache.INSTANCE;
        deployTaskCache = companion.create();
        updateTaskCache = companion.create();
        pullJsonCache = companion.create();
        JSON_CACHE_TIME = 60000L;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m57809d(WorkPool workPool, Context context, DeployInfo deployInfo, DownloadPriority downloadPriority, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            downloadPriority = null;
        }
        return workPool.m57813c(context, deployInfo, downloadPriority, continuation);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m57810e(final String str, final DownloadPriority downloadPriority, long j11, Context context, DeployInfo deployInfo, Continuation<? super TaskStatus> continuation) {
        return deployTaskCache.m57847c(str, new Function0<Unit>() { // from class: com.kubi.sdk.pkg.task.WorkPool$startDeploy$executeDeduplicated$2
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C23985b.f47489a.m57877e("bundleDownload", "WorkPool.startDeploy 复用同版本部署任务: key=" + str + ", requestedPriority=" + downloadPriority);
            }
        }, new WorkPool$startDeploy$executeDeduplicated$3(str, downloadPriority, j11, context, deployInfo, null), continuation);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m57811g(WorkPool workPool, Context context, PackageUpdateInfo packageUpdateInfo, DownloadPriority downloadPriority, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            downloadPriority = DownloadPriority.NORMAL;
        }
        return workPool.m57814f(context, packageUpdateInfo, downloadPriority, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m57812b(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return pullJsonCache.m57845a(str, JSON_CACHE_TIME, new WorkPool$pullJson$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m57813c(@NotNull Context context, @NotNull DeployInfo deployInfo, @Nullable DownloadPriority downloadPriority, @NotNull Continuation<? super TaskStatus> continuation) {
        String str = deployInfo.getName() + '_' + deployInfo.getVersion();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C23985b.f47489a.m57877e("bundleDownload", "WorkPool.startDeploy 部署入队: key=" + str + ", priority=" + downloadPriority);
        AbstractC41697j0 abstractC41697j0M57788a = PackageTaskDispatchers.f47424a.m57788a(downloadPriority);
        return abstractC41697j0M57788a == null ? m57810e(str, downloadPriority, jCurrentTimeMillis, context, deployInfo, continuation) : C41686h.m91049g(abstractC41697j0M57788a, new WorkPool$startDeploy$2(str, downloadPriority, jCurrentTimeMillis, context, deployInfo, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m57814f(@NotNull Context context, @NotNull PackageUpdateInfo packageUpdateInfo, @NotNull final DownloadPriority downloadPriority, @NotNull Continuation<? super TaskStatus> continuation) {
        final String str = packageUpdateInfo.getName() + '_' + packageUpdateInfo.getVersion();
        return updateTaskCache.m57847c(str, new Function0<Unit>() { // from class: com.kubi.sdk.pkg.task.WorkPool$startUpdate$2
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C23985b.f47489a.m57877e("bundleDownload", "WorkPool.startUpdate 复用同版本下载任务: key=" + str + ", requestedPriority=" + downloadPriority);
            }
        }, new WorkPool$startUpdate$3(context, packageUpdateInfo, downloadPriority, null), continuation);
    }
}
