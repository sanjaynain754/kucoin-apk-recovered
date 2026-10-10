package com.kubi.sdk.pkg.task;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5288p;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.sdk.pkg.util.Sha1Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.p407io.OnErrorAction;

/* JADX INFO: compiled from: DeployTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/DeployTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/task/c;", "info", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/c;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "()V", "b", "g", "f", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "Lcom/kubi/sdk/pkg/task/c;", "", "Ljava/lang/String;", "deployFullPath", "versionPath", "tmpPath", "manifestFile", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeployTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeployTask.kt\ncom/kubi/sdk/pkg/task/DeployTask\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n62#2:210\n62#2:211\n62#2:212\n62#2:213\n62#2:216\n62#2:220\n22#3,2:214\n1549#4:217\n1620#4,2:218\n1622#4:221\n*S KotlinDebug\n*F\n+ 1 DeployTask.kt\ncom/kubi/sdk/pkg/task/DeployTask\n*L\n30#1:210\n31#1:211\n32#1:212\n33#1:213\n92#1:216\n162#1:220\n53#1:214,2\n161#1:217\n161#1:218,2\n161#1:221\n*E\n"})
public final class DeployTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final DeployInfo info;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String deployFullPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String versionPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String tmpPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String manifestFile;

    public DeployTask(@NotNull Context context, @NotNull DeployInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        this.context = context;
        this.info = info;
        String strM57795e = TaskCommonKt.m57795e(context);
        String deployPath = info.getDeployPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append(deployPath);
        String string = sb2.toString();
        this.deployFullPath = string;
        this.versionPath = string + str + info.getVersion();
        String str2 = string + str + (ConstantsKt.TEMP_FILE_PREFIX + info.getVersion());
        this.tmpPath = str2;
        this.manifestFile = str2 + str + "package.manifest";
    }

    /* JADX INFO: renamed from: b */
    public final Object m57761b(Continuation<? super Unit> continuation) {
        String patchCoverVersion = this.info.getPatchCoverVersion();
        if (patchCoverVersion == null || patchCoverVersion.length() == 0) {
            C23985b.f47489a.m57877e("saveBundle", "copyOld " + this.info.getDeployPath() + " 非patch包，跳过复制老版本");
            return Unit.INSTANCE;
        }
        String str = this.deployFullPath + File.separator + this.info.getPatchCoverVersion();
        C23985b c23985b = C23985b.f47489a;
        c23985b.m57877e("saveBundle", "copyOld " + this.info.getDeployPath() + " 准备复制" + str + " 到 " + this.tmpPath + ' ');
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            boolean zCopyRecursively = FilesKt.copyRecursively(new File(str), new File(this.tmpPath), true, new Function2<File, IOException, OnErrorAction>() { // from class: com.kubi.sdk.pkg.task.DeployTask$copyOld$2$success$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p852kotlin.jvm.functions.Function2
                @NotNull
                public final OnErrorAction invoke(@NotNull File file, @NotNull IOException e11) {
                    Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(e11, "e");
                    Continuation<Unit> continuation2 = safeContinuation;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                    return OnErrorAction.TERMINATE;
                }
            });
            c23985b.m57877e("saveBundle", "copyOld " + this.info.getDeployPath() + " 复制 " + str + " 完成 " + zCopyRecursively);
            if (zCopyRecursively) {
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new TaskException(1410, "复制旧版本文件失败"))));
            }
        } catch (Exception e11) {
            Result.Companion companion3 = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new TaskException(1410, "无法复制到临时目录 " + e11.getMessage(), e11))));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object m57762c(@NotNull Continuation<? super TaskStatus> continuation) {
        DeployTask$execute$1 deployTask$execute$1;
        DeployTask deployTask;
        DeployTask deployTask2;
        String patchCoverVersion;
        if (continuation instanceof DeployTask$execute$1) {
            deployTask$execute$1 = (DeployTask$execute$1) continuation;
            int i11 = deployTask$execute$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                deployTask$execute$1.label = i11 - Integer.MIN_VALUE;
            } else {
                deployTask$execute$1 = new DeployTask$execute$1(this, continuation);
            }
        } else {
            deployTask$execute$1 = new DeployTask$execute$1(this, continuation);
        }
        Object obj = deployTask$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = deployTask$execute$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                m57763d();
                deployTask$execute$1.L$0 = this;
                deployTask$execute$1.label = 1;
                if (m57761b(deployTask$execute$1) != coroutine_suspended) {
                    deployTask = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                deployTask = (DeployTask) deployTask$execute$1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                deployTask2 = (DeployTask) deployTask$execute$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            deployTask2.m57764e();
            patchCoverVersion = deployTask2.info.getPatchCoverVersion();
            if (patchCoverVersion != null && patchCoverVersion.length() != 0) {
                return TaskStatus.Companion.result$default(TaskStatus.INSTANCE, 201, null, 2, null);
            }
            return TaskStatus.INSTANCE.getOK();
            deployTask.m57766g();
            deployTask$execute$1.L$0 = deployTask;
            deployTask$execute$1.label = 2;
            if (deployTask.m57765f(deployTask$execute$1) != coroutine_suspended) {
                deployTask2 = deployTask;
                deployTask2.m57764e();
                patchCoverVersion = deployTask2.info.getPatchCoverVersion();
                if (patchCoverVersion != null) {
                    return TaskStatus.Companion.result$default(TaskStatus.INSTANCE, 201, null, 2, null);
                }
                return TaskStatus.INSTANCE.getOK();
            }
            return coroutine_suspended;
        } catch (TaskException e11) {
            return TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage());
        } catch (CancellationException unused) {
            return TaskStatus.INSTANCE.result(1303, "部署流程被取消");
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "package_deploy", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.error("部署异常");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57763d() {
        try {
            C23985b c23985b = C23985b.f47489a;
            c23985b.m57877e("saveBundle", "prepare " + this.info.getDeployPath() + " 准备临时解压目录");
            C23984a c23984a = C23984a.f47488a;
            c23984a.m57862a(new File(this.tmpPath));
            File file = new File(this.versionPath);
            try {
                if (file.exists()) {
                    C23985b.m57873d(c23985b, "saveBundle", "prepare " + this.info.getDeployPath() + " 安装新版本的目录 " + this.versionPath + " 已存在，删除", null, 4, null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.info.getName());
                    sb2.append(".android.hbc");
                    File file2 = new File(file, sb2.toString());
                    C23985b.m57873d(c23985b, "hbcTrace", "cause=BUNDLE_DELETE, source=deployPrepare, name=" + this.info.getName() + ", version=" + this.info.getVersion() + ", path=" + file2.getAbsolutePath() + ", hbcExistedBefore=" + file2.exists() + ", deleteResult=" + c23984a.m57863b(file) + ", action=REPLACE_TARGET_VERSION", null, 4, null);
                }
            } catch (Exception e11) {
                throw new TaskException(1402, "无法清理目标目录", e11);
            }
        } catch (Exception e12) {
            throw new TaskException(1400, "无法准备临时解压目录, error=" + e12.getMessage(), e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m57764e() {
        C23985b c23985b = C23985b.f47489a;
        c23985b.m57877e("saveBundle", "sha1Check " + this.info.getName() + " 目录重命名 " + this.versionPath);
        try {
            File file = new File(this.tmpPath);
            File file2 = new File(this.versionPath);
            if (file.renameTo(file2)) {
                return;
            }
            C23985b.m57873d(c23985b, "saveBundle", "renameTo failed: name=" + this.info.getName() + ", version=" + this.info.getVersion() + ", src=" + this.tmpPath + ", srcExists=" + file.exists() + ", srcIsDirectory=" + file.isDirectory() + ", dest=" + this.versionPath + ", destExists=" + file2.exists() + ", destIsDirectory=" + file2.isDirectory(), null, 4, null);
            C23985b.m57873d(c23985b, "hbcTrace", "cause=RENAME_FAILED, name=" + this.info.getName() + ", version=" + this.info.getVersion() + ", src=" + this.tmpPath + ", srcExists=" + file.exists() + ", srcIsDirectory=" + file.isDirectory() + ", dest=" + this.versionPath + ", destExists=" + file2.exists() + ", destIsDirectory=" + file2.isDirectory() + ", action=DEPLOY_RESULT_INVALID", null, 4, null);
        } catch (Exception e11) {
            C23985b c23985b2 = C23985b.f47489a;
            C23985b.m57873d(c23985b2, "saveBundle", "renameTo exception: name=" + this.info.getName() + ", version=" + this.info.getVersion() + ", src=" + this.tmpPath + ", dest=" + this.versionPath + ", error=" + e11.getMessage(), null, 4, null);
            C23985b.m57873d(c23985b2, "hbcTrace", "cause=RENAME_EXCEPTION, name=" + this.info.getName() + ", version=" + this.info.getVersion() + ", src=" + this.tmpPath + ", dest=" + this.versionPath + ", error=" + e11.getMessage() + ", action=DEPLOY_FAILED", null, 4, null);
            throw new TaskException(1403, "目录重命名失败", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m57765f(Continuation<? super Unit> continuation) {
        DeployTask$sha1Check$1 deployTask$sha1Check$1;
        String str;
        DeployTask deployTask;
        if (continuation instanceof DeployTask$sha1Check$1) {
            deployTask$sha1Check$1 = (DeployTask$sha1Check$1) continuation;
            int i11 = deployTask$sha1Check$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                deployTask$sha1Check$1.label = i11 - Integer.MIN_VALUE;
            } else {
                deployTask$sha1Check$1 = new DeployTask$sha1Check$1(this, continuation);
            }
        } else {
            deployTask$sha1Check$1 = new DeployTask$sha1Check$1(this, continuation);
        }
        Object objM57839b = deployTask$sha1Check$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = deployTask$sha1Check$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57839b);
            File file = new File(this.manifestFile);
            if (file.exists()) {
                str = "sha1Check ";
                C23985b.f47489a.m57877e("saveBundle", str + this.info.getName() + " 检查文件夹各个hash " + this.tmpPath);
                Object objM6343e = C5288p.m6343e(C23984a.f47488a.m57869h(new FileInputStream(file)), C5288p.m6346h(ManifestItem.class));
                Intrinsics.checkNotNullExpressionValue(objM6343e, "fromJson(jsonStr, GsonUt…anifestItem::class.java))");
                List<ManifestItem> list = (List) objM6343e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ManifestItem manifestItem : list) {
                    arrayList.add(new Sha1Util.C23977a(this.tmpPath + File.separator + manifestItem.getPath(), manifestItem.getLength(), manifestItem.getSha1()));
                }
                deployTask$sha1Check$1.L$0 = this;
                deployTask$sha1Check$1.label = 1;
                objM57839b = Sha1Util.m57839b(arrayList, deployTask$sha1Check$1);
                if (objM57839b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deployTask = this;
            } else if (this.info.getArchiveHashVerified()) {
                C23985b.f47489a.m57877e("saveBundle", "sha1Check " + this.info.getName() + " 未提供文件清单，整包hash已校验，跳过文件级hash检查 " + this.tmpPath);
            } else {
                C23985b.m57873d(C23985b.f47489a, "saveBundle", "sha1Check " + this.info.getName() + " 没有清单文件且整包未校验，跳过文件级hash检查 " + this.tmpPath, null, 4, null);
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        deployTask = (DeployTask) deployTask$sha1Check$1.L$0;
        ResultKt.throwOnFailure(objM57839b);
        str = "sha1Check ";
        boolean zBooleanValue = ((Boolean) objM57839b).booleanValue();
        C23985b.f47489a.m57877e("saveBundle", str + deployTask.info.getName() + " 检查文件夹hash结果：" + zBooleanValue);
        if (!zBooleanValue) {
            throw new TaskException(1411, "检查hash失败");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m57766g() {
        InputStream fileInputStream;
        try {
            if (this.info.getIsInAsset()) {
                C23985b.f47489a.m57877e("saveBundle", "unzipFile " + this.info.getDeployPath() + " 解压文件夹 asset://" + this.info.getZipPath());
                fileInputStream = this.context.getAssets().open(this.info.getZipPath());
            } else {
                C23985b.f47489a.m57877e("saveBundle", "unzipFile " + this.info.getDeployPath() + " 解压文件夹 " + this.info.getZipPath());
                fileInputStream = new FileInputStream(this.info.getZipPath());
            }
            Intrinsics.checkNotNullExpressionValue(fileInputStream, "try {\n            if (in…e.message}\", e)\n        }");
            String patchCoverVersion = this.info.getPatchCoverVersion();
            try {
                if (!C23984a.f47488a.m57871j(fileInputStream, (patchCoverVersion == null || patchCoverVersion.length() == 0) ? this.info.getName() : "patch", this.tmpPath)) {
                    throw new TaskException(1401, "解压失败");
                }
                C43840a.m96550d(this.info.getDeployPath() + " 解压成功", "package_deploy");
            } catch (Exception e11) {
                throw new TaskException(1401, "解压失败, error=" + e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new TaskException(1401, "解压文件打开失败, error=" + e12.getMessage(), e12);
        }
    }
}
