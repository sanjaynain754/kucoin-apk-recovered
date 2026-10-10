package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.DeployInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleInstallTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleInstallTask$execute$2$status$1$1", m90122f = "BundleInstallTask.kt", m90123i = {}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBundleInstallTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask$execute$2$status$1$1\n+ 2 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,284:1\n74#2:285\n41#2:287\n37#2:288\n30#2:290\n41#2:292\n37#2:293\n30#2:295\n28#3:286\n28#3:291\n62#4:289\n62#4:294\n22#5,2:296\n*S KotlinDebug\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask$execute$2$status$1$1\n*L\n65#1:285\n65#1:287\n65#1:288\n65#1:290\n69#1:292\n69#1:293\n69#1:295\n65#1:286\n69#1:291\n65#1:289\n69#1:294\n88#1:296,2\n*E\n"})
public final class BundleInstallTask$execute$2$status$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ BundleInstallTask.C23924a $it;
    int label;
    final /* synthetic */ BundleInstallTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleInstallTask$execute$2$status$1$1(BundleInstallTask bundleInstallTask, BundleInstallTask.C23924a c23924a, Continuation<? super BundleInstallTask$execute$2$status$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bundleInstallTask;
        this.$it = c23924a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleInstallTask$execute$2$status$1$1(this.this$0, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleInstallTask$execute$2$status$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM57809d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            WorkPool workPool = WorkPool.f47436a;
            Context context = this.this$0.context;
            DeployInfo deployInfo = this.$it.getDeployInfo();
            this.label = 1;
            objM57809d = WorkPool.m57809d(workPool, context, deployInfo, null, this, 4, null);
            if (objM57809d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM57809d = obj;
        }
        TaskStatus taskStatus = (TaskStatus) objM57809d;
        if (!taskStatus.m57807h()) {
            return taskStatus;
        }
        BundleInfo bundleInfo = this.$it.getBundleInfo();
        Context context2 = this.this$0.context;
        String biz = bundleInfo.getBiz();
        String entry = bundleInfo.getEntry();
        String version = bundleInfo.getVersion();
        String strM57795e = TaskCommonKt.m57795e(context2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        String str2 = ((sb2.toString() + str + biz) + str + entry) + str + version;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(biz + '-' + entry);
        sb3.append(".android.hbc");
        if (TaskCommonKt.m57792b(str2 + str + sb3.toString())) {
            BundleVersionManager.f47295a.m57531t(this.$it.getBundleInfo());
            return taskStatus;
        }
        BundleInfo bundleInfo2 = this.$it.getBundleInfo();
        Context context3 = this.this$0.context;
        String biz2 = bundleInfo2.getBiz();
        String entry2 = bundleInfo2.getEntry();
        String version2 = bundleInfo2.getVersion();
        String str3 = (((TaskCommonKt.m57795e(context3) + str + "jsbundles") + str + biz2) + str + entry2) + str + version2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(biz2 + '-' + entry2);
        sb4.append(".android.hbc");
        String str4 = str3 + str + sb4.toString();
        File file = new File(str4);
        C23985b c23985b = C23985b.f47489a;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("postDeploy hbc missing: source=assets, name=");
        sb5.append(this.$it.getBundleInfo().getName());
        sb5.append(", version=");
        sb5.append(this.$it.getBundleInfo().getVersion());
        sb5.append(", resultCode=");
        sb5.append(taskStatus.getCode());
        sb5.append(", path=");
        sb5.append(str4);
        sb5.append(", versionDirExists=");
        File parentFile = file.getParentFile();
        sb5.append(parentFile != null && parentFile.exists());
        sb5.append(", hbcExists=");
        sb5.append(file.exists());
        sb5.append(", hbcIsFile=");
        sb5.append(file.isFile());
        sb5.append(", hbcLength=");
        sb5.append(file.length());
        C23985b.m57873d(c23985b, "saveBundle", sb5.toString(), null, 4, null);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("cause=POST_DEPLOY_HBC_MISSING, source=assets, name=");
        sb6.append(this.$it.getBundleInfo().getName());
        sb6.append(", version=");
        sb6.append(this.$it.getBundleInfo().getVersion());
        sb6.append(", resultCode=");
        sb6.append(taskStatus.getCode());
        sb6.append(", path=");
        sb6.append(str4);
        sb6.append(", versionDirExists=");
        File parentFile2 = file.getParentFile();
        sb6.append(parentFile2 != null && parentFile2.exists());
        sb6.append(", hbcExists=");
        sb6.append(file.exists());
        sb6.append(", hbcIsFile=");
        sb6.append(file.isFile());
        sb6.append(", hbcLength=");
        sb6.append(file.length());
        sb6.append(", action=REJECT_LOCAL_RECORD");
        C23985b.m57873d(c23985b, "hbcTrace", sb6.toString(), null, 4, null);
        TaskException taskException = new TaskException(1404, this.$it.getBundleInfo().getName() + "安装解压后没有对应的 bundle文件");
        C43846g.m96568c(new PackageException(taskException, "package_install", false, null, 8, null), null, 2, null);
        return TaskStatus.INSTANCE.result(taskException.getCode(), taskException.getMessage());
    }
}
