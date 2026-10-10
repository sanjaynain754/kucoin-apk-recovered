package com.kubi.sdk.pkg.task;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.PackageException;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DownloadTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/DownloadTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/task/d;", "info", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/d;Lcom/kubi/sdk/pkg/task/DownloadPriority;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "()V", "d", "f", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/kubi/sdk/pkg/task/d;", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "", "Ljava/lang/String;", "downloadPath", "e", "()Ljava/lang/String;", "downloadFile", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDownloadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadTask.kt\ncom/kubi/sdk/pkg/task/DownloadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 4 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,122:1\n1#2:123\n62#3:124\n22#4,2:125\n22#4,2:127\n*S KotlinDebug\n*F\n+ 1 DownloadTask.kt\ncom/kubi/sdk/pkg/task/DownloadTask\n*L\n31#1:124\n51#1:125,2\n116#1:127,2\n*E\n"})
public final class DownloadTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final DownloadInfo info;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DownloadPriority priority;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String downloadPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String downloadFile;

    public DownloadTask(@NotNull Context context, @NotNull DownloadInfo info, @NotNull DownloadPriority priority) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.context = context;
        this.info = info;
        this.priority = priority;
        String strM57795e = TaskCommonKt.m57795e(context);
        String deployPath = info.getDeployPath();
        StringBuilder sb2 = new StringBuilder();
        String version = info.getVersion();
        sb2.append(version.length() == 0 ? info.getName() : version);
        sb2.append(priority == DownloadPriority.VERY_HIGH ? "_fg" : "");
        String strM57796f = TaskCommonKt.m57796f(strM57795e, deployPath, "download", sb2.toString());
        this.downloadPath = strM57796f;
        this.downloadFile = strM57796f + File.separator + info.getFileName();
    }

    /* JADX INFO: renamed from: a */
    public final void m57768a() {
        try {
            File file = new File(this.downloadFile);
            if (this.info.getLength() != null && this.info.getLength().longValue() > 0) {
                long length = file.length();
                Long length2 = this.info.getLength();
                if (length2 == null || length != length2.longValue()) {
                    throw new TaskException(1504, "校验下载文件长度错误 " + length + "!=" + this.info.getLength());
                }
            }
            String hash = this.info.getHash();
            if (hash != null && hash.length() != 0) {
                if (!this.info.getHashType().compareFile(file, this.info.getHash())) {
                    throw new TaskException(1506, "校验下载文件hash错误");
                }
                C43840a.m96550d(this.info.getName() + " 校验下载文件 " + this.downloadFile + " 成功", "package_update");
                return;
            }
            C43840a.m96552g(this.info.getName() + " 无校验字段，跳过 " + this.downloadFile + ' ', "package_update");
        } catch (TaskException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new TaskException(1506, "校验下载文件异常 " + e12.getMessage(), e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57769b() {
        try {
            C43840a.m96550d(this.info.getName() + " 清理下载目录 " + this.downloadPath, "package_update");
            C23984a c23984a = C23984a.f47488a;
            c23984a.m57863b(new File(this.downloadPath));
            File parentFile = new File(this.downloadPath).getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                String[] list = parentFile.list();
                if (list != null && list.length != 0) {
                    return;
                }
                c23984a.m57863b(parentFile);
            }
        } catch (Exception e11) {
            C43840a.m96548b(this.info.getName() + " 清理下载目录异常 " + this.downloadPath + ' ' + e11.getMessage(), "package_update");
            C43846g.m96568c(new PackageException(e11, "package_update", false, null, 8, null), null, 2, null);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 3581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m57770c(@org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r14) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.pkg.task.DownloadTask.m57770c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final Object m57771d(Continuation<? super Unit> continuation) {
        Object objM57783i = HttpHelperKt.m57783i(this.info.getName(), this.info.getUrl(), this.downloadFile, this.priority, continuation);
        return objM57783i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM57783i : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDownloadFile() {
        return this.downloadFile;
    }

    /* JADX INFO: renamed from: f */
    public final void m57773f() throws Exception {
        try {
            C43840a.m96550d(this.info.getName() + " 准备下载目录 " + this.downloadPath, "package_update");
            File file = new File(this.downloadPath);
            if (file.exists()) {
                C23984a.f47488a.m57862a(new File(this.downloadPath));
            } else {
                file.mkdirs();
            }
        } catch (Exception e11) {
            C43840a.m96548b(this.info.getName() + " 无法下载目录异常 " + this.downloadPath + ' ' + e11.getMessage(), "package_update");
            throw e11;
        }
    }
}
