package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.PackageDownloadSetting;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager$startUpdateFromQrCode$2", m90122f = "PkgPlatformManager.kt", m90123i = {0}, m90124l = {503}, m90125m = "invokeSuspend", m90126n = {"qrData"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nPkgPlatformManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$startUpdateFromQrCode$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,605:1\n1855#2,2:606\n22#3,2:608\n*S KotlinDebug\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$startUpdateFromQrCode$2\n*L\n440#1:606,2\n518#1:608,2\n*E\n"})
public final class PkgPlatformManager$startUpdateFromQrCode$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $qrCodeUrl;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformManager$startUpdateFromQrCode$2(String str, Context context, Continuation<? super PkgPlatformManager$startUpdateFromQrCode$2> continuation) {
        super(2, continuation);
        this.$qrCodeUrl = str;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformManager$startUpdateFromQrCode$2(this.$qrCodeUrl, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformManager$startUpdateFromQrCode$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String strString;
        Object objM57655t;
        PkgPlatformManager.QrCodeData qrCodeData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C23985b.f47489a.m57877e("pkgPlatform", "startUpdateFromQrCode url=" + this.$qrCodeUrl);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                Iterator<T> it = PackageDownloadSetting.f47421a.m57786a().iterator();
                while (it.hasNext()) {
                    builder.addInterceptor((Interceptor) it.next());
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                builder.connectTimeout(30000L, timeUnit);
                builder.readTimeout(30000L, timeUnit);
                ResponseBody responseBodyBody = FirebasePerfOkHttpClient.execute(builder.build().newCall(new Request.Builder().url(this.$qrCodeUrl).header("User-Agent", PackageDownloadSetting.f47421a.m57787b()).get().build())).body();
                if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                    PkgPlatformManager.QrCodeResponse qrCodeResponse = (PkgPlatformManager.QrCodeResponse) new Gson().fromJson(strString, PkgPlatformManager.QrCodeResponse.class);
                    if (qrCodeResponse == null) {
                        return TaskStatus.INSTANCE.result(1501, "qrCode 响应解析失败");
                    }
                    if (qrCodeResponse.getSuccess() && qrCodeResponse.getData() != null) {
                        PkgPlatformManager.QrCodeData data = qrCodeResponse.getData();
                        String version = data.getVersion();
                        if (version == null) {
                            version = null;
                        } else if (data.getBuildNo() > 0) {
                            version = version + '-' + data.getBuildNo();
                        }
                        List<PkgBasicDep> subPackages = data.getSubPackages();
                        if (subPackages != null && !subPackages.isEmpty() && data.getBiz() != null && version != null) {
                            SubPackageRegistry.f47367a.m57676l(data.getBiz(), version, data.getSubPackages());
                        }
                        CalcBundleResponse calcBundleResponse = new CalcBundleResponse(true, "200", new CalcBundleData(CollectionsKt.listOf(new PkgBundleUpdateItem(data.getBiz(), data.getVersion(), data.getBuildNo(), data.getUrl(), data.getPackageHash(), data.getPackageSize(), data.getSdkVersion(), data.getLeadUpgrade(), data.getBasicDeps(), null, null, 1536, null)), CollectionsKt.emptyList()));
                        String biz = data.getBiz();
                        if (biz != null && data.getLeadUpgrade()) {
                            PkgPlatformManager.leadUpgradeCache.put(biz, Boxing.boxBoolean(true));
                        }
                        C23985b.f47489a.m57877e("pkgPlatform", "startUpdateFromQrCode biz=" + data.getBiz() + " version=" + data.getVersion() + " buildNo=" + data.getBuildNo());
                        PkgPlatformUpdateTask pkgPlatformUpdateTask = new PkgPlatformUpdateTask(this.$context, calcBundleResponse, CollectionsKt.emptyList(), DownloadPriority.VERY_HIGH, null, 16, null);
                        this.L$0 = data;
                        this.label = 1;
                        objM57655t = pkgPlatformUpdateTask.m57655t(this);
                        if (objM57655t == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        qrCodeData = data;
                    }
                    return TaskStatus.INSTANCE.result(1501, "qrCode 服务端返回失败: code=" + qrCodeResponse.getCode());
                }
                return TaskStatus.INSTANCE.result(1501, "qrCode 响应 body 为空");
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qrCodeData = (PkgPlatformManager.QrCodeData) this.L$0;
            ResultKt.throwOnFailure(obj);
            objM57655t = obj;
            TaskStatus taskStatus = (TaskStatus) objM57655t;
            if (!taskStatus.m57807h() || qrCodeData.getVersion() == null) {
                return taskStatus;
            }
            qrCodeData.getBuildNo();
            String str = qrCodeData.getVersion() + '-' + qrCodeData.getBuildNo();
            C23985b.f47489a.m57877e("pkgPlatform", "startUpdateFromQrCode 安装成功，lockedVersion=" + str);
            return TaskStatus.INSTANCE.locked(str);
        } catch (TaskException e11) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "startUpdateFromQrCode 请求失败: " + e11.getMessage(), null, 4, null);
            return TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage());
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "pkgPlatform", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.result(2000, "qrCode 请求异常: " + e12.getMessage());
        }
    }
}
