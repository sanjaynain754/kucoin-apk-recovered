package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.HashType;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PkgPlatformManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager$downloadSubPackage$2", m90122f = "PkgPlatformManager.kt", m90123i = {0}, m90124l = {577}, m90125m = "invokeSuspend", m90126n = {"info"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nPkgPlatformManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$downloadSubPackage$2\n+ 2 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,605:1\n32#2:606\n30#2:608\n62#3:607\n1#4:609\n22#5,2:610\n*S KotlinDebug\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$downloadSubPackage$2\n*L\n558#1:606\n567#1:608\n558#1:607\n600#1:610,2\n*E\n"})
public final class PkgPlatformManager$downloadSubPackage$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $subPackageName;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformManager$downloadSubPackage$2(String str, Context context, Continuation<? super PkgPlatformManager$downloadSubPackage$2> continuation) {
        super(2, continuation);
        this.$subPackageName = str;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformManager$downloadSubPackage$2(this.$subPackageName, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformManager$downloadSubPackage$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        Object objM57814f;
        SubPackageRegistry.SubPackageInfo subPackageInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                SubPackageRegistry subPackageRegistry = SubPackageRegistry.f47367a;
                SubPackageRegistry.SubPackageInfo subPackageInfoM57670f = subPackageRegistry.m57670f(this.$subPackageName);
                if (subPackageInfoM57670f == null) {
                    return TaskStatus.INSTANCE.result(1404, "downloadSubPackage: 未找到子包元信息: " + this.$subPackageName);
                }
                if (subPackageRegistry.m57671g(this.$context, this.$subPackageName) != null) {
                    C23985b.f47489a.m57877e("pkgPlatform", "downloadSubPackage 子包已存在，跳过下载: " + this.$subPackageName + ' ' + subPackageInfoM57670f.getVersionDir());
                    return TaskStatus.INSTANCE.getOK();
                }
                if (subPackageInfoM57670f.getParentBiz() == null || subPackageInfoM57670f.getParentVersionDir() == null) {
                    String biz = subPackageInfoM57670f.getBiz();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jsbundles");
                    String str2 = File.separator;
                    sb2.append(str2);
                    sb2.append(biz);
                    str = sb2.toString() + str2 + "main";
                } else {
                    str = "jsbundles/" + subPackageInfoM57670f.getParentBiz() + "/main/" + subPackageInfoM57670f.getParentVersionDir() + '/' + subPackageInfoM57670f.getBiz() + "/main";
                }
                String str3 = str;
                C23985b.f47489a.m57877e("pkgPlatform", "downloadSubPackage 开始下载子包: " + this.$subPackageName + ' ' + subPackageInfoM57670f.getVersionDir() + " deployPath=" + str3 + " url=" + subPackageInfoM57670f.getUrl());
                String biz2 = subPackageInfoM57670f.getBiz();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(biz2);
                sb3.append('-');
                sb3.append("main");
                String string = sb3.toString();
                String versionDir = subPackageInfoM57670f.getVersionDir();
                String url = subPackageInfoM57670f.getUrl();
                Long lBoxLong = Boxing.boxLong(subPackageInfoM57670f.getPackageSize());
                PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(str3, string, versionDir, url, lBoxLong.longValue() > 0 ? lBoxLong : null, subPackageInfoM57670f.getPackageHash(), HashType.Rsa, null, true, 128, null);
                WorkPool workPool = WorkPool.f47436a;
                Context context = this.$context;
                DownloadPriority downloadPriority = DownloadPriority.VERY_HIGH;
                this.L$0 = subPackageInfoM57670f;
                this.label = 1;
                objM57814f = workPool.m57814f(context, packageUpdateInfo, downloadPriority, this);
                if (objM57814f == coroutine_suspended) {
                    return coroutine_suspended;
                }
                subPackageInfo = subPackageInfoM57670f;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                subPackageInfo = (SubPackageRegistry.SubPackageInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM57814f = obj;
            }
            TaskStatus taskStatus = (TaskStatus) objM57814f;
            if (!taskStatus.m57807h()) {
                C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "downloadSubPackage 子包下载失败: " + this.$subPackageName + ", code=" + taskStatus.getCode(), null, 4, null);
                return taskStatus;
            }
            if (SubPackageRegistry.f47367a.m57671g(this.$context, this.$subPackageName) == null) {
                return TaskStatus.INSTANCE.result(1404, "downloadSubPackage: 子包下载后 bundle 文件不存在: " + this.$subPackageName);
            }
            C23985b.f47489a.m57877e("pkgPlatform", "downloadSubPackage 子包下载成功: " + this.$subPackageName + ' ' + subPackageInfo.getVersionDir());
            return taskStatus;
        } catch (CancellationException unused) {
            return TaskStatus.INSTANCE.result(1303, "downloadSubPackage 下载被取消: " + this.$subPackageName);
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "pkgPlatform", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.result(1501, "downloadSubPackage 异常: " + this.$subPackageName + ", " + e11.getMessage());
        }
    }
}
