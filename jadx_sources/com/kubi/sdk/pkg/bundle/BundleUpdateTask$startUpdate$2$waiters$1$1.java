package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23985b;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleUpdateTask$startUpdate$2$waiters$1$1", m90122f = "BundleUpdateTask.kt", m90123i = {}, m90124l = {100}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBundleUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$startUpdate$2$waiters$1$1\n+ 2 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 DebugUtil.kt\ncom/kubi/sdk/pkg/bundle/BundleDebugUtil\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n74#2:234\n41#2:236\n37#2:237\n30#2:239\n74#2:240\n41#2:242\n37#2:243\n30#2:245\n41#2:251\n37#2:252\n30#2:254\n28#3:235\n28#3:241\n28#3:250\n62#4:238\n62#4:244\n62#4:253\n59#5,2:246\n61#5:249\n1#6:248\n*S KotlinDebug\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$startUpdate$2$waiters$1$1\n*L\n89#1:234\n89#1:236\n89#1:237\n89#1:239\n103#1:240\n103#1:242\n103#1:243\n103#1:245\n108#1:251\n108#1:252\n108#1:254\n89#1:235\n103#1:241\n108#1:250\n89#1:238\n103#1:244\n108#1:253\n105#1:246,2\n105#1:249\n105#1:248\n*E\n"})
public final class BundleUpdateTask$startUpdate$2$waiters$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ BundleUpdateTask.C23933a $it;
    int label;
    final /* synthetic */ BundleUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdateTask$startUpdate$2$waiters$1$1(BundleUpdateTask.C23933a c23933a, BundleUpdateTask bundleUpdateTask, Continuation<? super BundleUpdateTask$startUpdate$2$waiters$1$1> continuation) {
        super(2, continuation);
        this.$it = c23933a;
        this.this$0 = bundleUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleUpdateTask$startUpdate$2$waiters$1$1(this.$it, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleUpdateTask$startUpdate$2$waiters$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x015d  */
    /* JADX WARN: Code duplicated, block: B:19:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:25:0x021e  */
    /* JADX WARN: Code duplicated, block: B:30:0x030e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0395  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x015d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x021e, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM57814f;
        TaskStatus taskStatusResult;
        String str;
        String str2;
        StringBuilder sb2;
        File parentFile;
        boolean z11;
        Function1<String, Unit> function1M57547a;
        String debugMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            BundleInfo bundleInfo = this.$it.getBundleInfo();
            Context context = this.this$0.context;
            String biz = bundleInfo.getBiz();
            String entry = bundleInfo.getEntry();
            String version = bundleInfo.getVersion();
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strM57795e);
            String str3 = File.separator;
            sb3.append(str3);
            sb3.append("jsbundles");
            String str4 = ((sb3.toString() + str3 + biz) + str3 + entry) + str3 + version;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(biz + '-' + entry);
            sb4.append(".android.hbc");
            if (TaskCommonKt.m57792b(str4 + str3 + sb4.toString())) {
                BundleVersionManager.f47295a.m57531t(this.$it.getBundleInfo());
                C23985b.f47489a.m57877e("bundleDownload", "BundleUpdateTask 同版本已安装，跳过下载: " + this.$it.getBundleInfo().getName() + ' ' + this.$it.getBundleInfo().getVersion());
                taskStatusResult = TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, this.$it.getBundleInfo().getName() + ' ' + this.$it.getBundleInfo().getVersion() + " 已安装");
            } else {
                WorkPool workPool = WorkPool.f47436a;
                Context context2 = this.this$0.context;
                PackageUpdateInfo updateInfo = this.$it.getUpdateInfo();
                DownloadPriority downloadPriority = this.this$0.priority;
                this.label = 1;
                objM57814f = workPool.m57814f(context2, updateInfo, downloadPriority, this);
                if (objM57814f == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (taskStatusResult.m57807h()) {
                BundleInfo bundleInfo2 = this.$it.getBundleInfo();
                Context context3 = this.this$0.context;
                String biz2 = bundleInfo2.getBiz();
                String entry2 = bundleInfo2.getEntry();
                String version2 = bundleInfo2.getVersion();
                String strM57795e2 = TaskCommonKt.m57795e(context3);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(strM57795e2);
                str = File.separator;
                sb5.append(str);
                sb5.append("jsbundles");
                str2 = ((sb5.toString() + str + biz2) + str + entry2) + str + version2;
                sb2 = new StringBuilder();
                sb2.append(biz2 + '-' + entry2);
                sb2.append(".android.hbc");
                if (TaskCommonKt.m57792b(str2 + str + sb2.toString())) {
                    BundleVersionManager.f47295a.m57531t(this.$it.getBundleInfo());
                    C23936b c23936b = C23936b.f47308a;
                    BundleUpdateTask.C23933a c23933a = this.$it;
                    function1M57547a = c23936b.m57547a();
                    if (function1M57547a != null && (debugMessage = c23933a.getDebugMessage()) != null) {
                        function1M57547a.invoke(debugMessage);
                    }
                } else {
                    BundleInfo bundleInfo3 = this.$it.getBundleInfo();
                    Context context4 = this.this$0.context;
                    String biz3 = bundleInfo3.getBiz();
                    String entry3 = bundleInfo3.getEntry();
                    String version3 = bundleInfo3.getVersion();
                    String str5 = (((TaskCommonKt.m57795e(context4) + str + "jsbundles") + str + biz3) + str + entry3) + str + version3;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(biz3 + '-' + entry3);
                    sb6.append(".android.hbc");
                    String str6 = str5 + str + sb6.toString();
                    File file = new File(str6);
                    C23985b c23985b = C23985b.f47489a;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("postDeploy hbc missing: source=cloud, name=");
                    sb7.append(this.$it.getBundleInfo().getName());
                    sb7.append(", version=");
                    sb7.append(this.$it.getBundleInfo().getVersion());
                    sb7.append(", resultCode=");
                    sb7.append(taskStatusResult.getCode());
                    sb7.append(", path=");
                    sb7.append(str6);
                    sb7.append(", versionDirExists=");
                    parentFile = file.getParentFile();
                    if (parentFile == null && parentFile.exists()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sb7.append(z11);
                    sb7.append(", hbcExists=");
                    sb7.append(file.exists());
                    sb7.append(", hbcIsFile=");
                    sb7.append(file.isFile());
                    sb7.append(", hbcLength=");
                    sb7.append(file.length());
                    C23985b.m57873d(c23985b, "saveBundle", sb7.toString(), null, 4, null);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("cause=POST_DEPLOY_HBC_MISSING, source=cloud, name=");
                    sb8.append(this.$it.getBundleInfo().getName());
                    sb8.append(", version=");
                    sb8.append(this.$it.getBundleInfo().getVersion());
                    sb8.append(", resultCode=");
                    sb8.append(taskStatusResult.getCode());
                    sb8.append(", path=");
                    sb8.append(str6);
                    sb8.append(", versionDirExists=");
                    File parentFile2 = file.getParentFile();
                    sb8.append(parentFile2 == null && parentFile2.exists());
                    sb8.append(", hbcExists=");
                    sb8.append(file.exists());
                    sb8.append(", hbcIsFile=");
                    sb8.append(file.isFile());
                    sb8.append(", hbcLength=");
                    sb8.append(file.length());
                    sb8.append(", action=REJECT_LOCAL_RECORD");
                    C23985b.m57873d(c23985b, "hbcTrace", sb8.toString(), null, 4, null);
                    taskStatusResult = TaskStatus.INSTANCE.result(1404, "解压后没有对应的 bundle文件");
                }
            }
            return this.this$0.m57508n(taskStatusResult, this.$it.getUpdateInfo().getName(), this.$it.getUpdateInfo().getVersion());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objM57814f = obj;
        taskStatusResult = (TaskStatus) objM57814f;
        if (taskStatusResult.m57807h()) {
            BundleInfo bundleInfo4 = this.$it.getBundleInfo();
            Context context5 = this.this$0.context;
            String biz4 = bundleInfo4.getBiz();
            String entry4 = bundleInfo4.getEntry();
            String version4 = bundleInfo4.getVersion();
            String strM57795e3 = TaskCommonKt.m57795e(context5);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(strM57795e3);
            str = File.separator;
            sb9.append(str);
            sb9.append("jsbundles");
            str2 = ((sb9.toString() + str + biz4) + str + entry4) + str + version4;
            sb2 = new StringBuilder();
            sb2.append(biz4 + '-' + entry4);
            sb2.append(".android.hbc");
            if (TaskCommonKt.m57792b(str2 + str + sb2.toString())) {
                BundleVersionManager.f47295a.m57531t(this.$it.getBundleInfo());
                C23936b c23936b2 = C23936b.f47308a;
                BundleUpdateTask.C23933a c23933a2 = this.$it;
                function1M57547a = c23936b2.m57547a();
                if (function1M57547a != null) {
                    function1M57547a.invoke(debugMessage);
                }
            } else {
                BundleInfo bundleInfo5 = this.$it.getBundleInfo();
                Context context6 = this.this$0.context;
                String biz5 = bundleInfo5.getBiz();
                String entry5 = bundleInfo5.getEntry();
                String version5 = bundleInfo5.getVersion();
                String str7 = (((TaskCommonKt.m57795e(context6) + str + "jsbundles") + str + biz5) + str + entry5) + str + version5;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(biz5 + '-' + entry5);
                sb10.append(".android.hbc");
                String str8 = str7 + str + sb10.toString();
                File file2 = new File(str8);
                C23985b c23985b2 = C23985b.f47489a;
                StringBuilder sb11 = new StringBuilder();
                sb11.append("postDeploy hbc missing: source=cloud, name=");
                sb11.append(this.$it.getBundleInfo().getName());
                sb11.append(", version=");
                sb11.append(this.$it.getBundleInfo().getVersion());
                sb11.append(", resultCode=");
                sb11.append(taskStatusResult.getCode());
                sb11.append(", path=");
                sb11.append(str8);
                sb11.append(", versionDirExists=");
                parentFile = file2.getParentFile();
                if (parentFile == null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                sb11.append(z11);
                sb11.append(", hbcExists=");
                sb11.append(file2.exists());
                sb11.append(", hbcIsFile=");
                sb11.append(file2.isFile());
                sb11.append(", hbcLength=");
                sb11.append(file2.length());
                C23985b.m57873d(c23985b2, "saveBundle", sb11.toString(), null, 4, null);
                StringBuilder sb12 = new StringBuilder();
                sb12.append("cause=POST_DEPLOY_HBC_MISSING, source=cloud, name=");
                sb12.append(this.$it.getBundleInfo().getName());
                sb12.append(", version=");
                sb12.append(this.$it.getBundleInfo().getVersion());
                sb12.append(", resultCode=");
                sb12.append(taskStatusResult.getCode());
                sb12.append(", path=");
                sb12.append(str8);
                sb12.append(", versionDirExists=");
                File parentFile3 = file2.getParentFile();
                sb12.append(parentFile3 == null && parentFile3.exists());
                sb12.append(", hbcExists=");
                sb12.append(file2.exists());
                sb12.append(", hbcIsFile=");
                sb12.append(file2.isFile());
                sb12.append(", hbcLength=");
                sb12.append(file2.length());
                sb12.append(", action=REJECT_LOCAL_RECORD");
                C23985b.m57873d(c23985b2, "hbcTrace", sb12.toString(), null, 4, null);
                taskStatusResult = TaskStatus.INSTANCE.result(1404, "解压后没有对应的 bundle文件");
            }
        }
        return this.this$0.m57508n(taskStatusResult, this.$it.getUpdateInfo().getName(), this.$it.getUpdateInfo().getVersion());
    }
}
