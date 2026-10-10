package com.kubi.sdk.pkg.task;

import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.util.C23985b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.HttpHelperKt$startDownload$2", m90122f = "HttpHelper.kt", m90123i = {}, m90124l = {275}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HttpHelperKt$startDownload$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $downloadFile;
    final /* synthetic */ String $downloadUrl;
    final /* synthetic */ String $name;
    final /* synthetic */ DownloadPriority $priority;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHelperKt$startDownload$2(String str, DownloadPriority downloadPriority, String str2, String str3, Continuation<? super HttpHelperKt$startDownload$2> continuation) {
        super(2, continuation);
        this.$name = str;
        this.$priority = downloadPriority;
        this.$downloadFile = str2;
        this.$downloadUrl = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HttpHelperKt$startDownload$2(this.$name, this.$priority, this.$downloadFile, this.$downloadUrl, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Boolean> continuation) {
        return ((HttpHelperKt$startDownload$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C23985b.f47489a.m57877e("bundleDownload", "startDownload " + this.$name + " 开始下载, priority=" + this.$priority + ", downloadPriorityEnabled=" + PackConfigManager.f47378a.m57689c());
                C43840a.m96550d(this.$name + " 开始下载文件 " + this.$downloadFile + " [priority=" + this.$priority + ']', "package_update");
                Call callNewCall = HttpHelperKt.m57776b(this.$priority).newCall(new Request.Builder().header("User-Agent", PackageDownloadSetting.f47421a.m57787b()).url(this.$downloadUrl).build());
                this.label = 1;
                obj = TaskCommonKt.m57791a(callNewCall, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful() && response.body() != null) {
                BufferedSink bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(new File(this.$downloadFile), false, 1, null));
                try {
                    ResponseBody responseBodyBody = response.body();
                    Intrinsics.checkNotNull(responseBodyBody);
                    bufferedSinkBuffer.writeAll(responseBodyBody.getSource());
                    CloseableKt.closeFinally(bufferedSinkBuffer, null);
                    C23985b.f47489a.m57877e("bundleDownload", "startDownload " + this.$name + " 下载文件成功 " + this.$downloadFile + " [priority=" + this.$priority + ']');
                    return Boxing.boxBoolean(true);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedSinkBuffer, th2);
                        throw th3;
                    }
                }
            }
            C23985b.m57873d(C23985b.f47489a, "bundleDownload", "startDownload " + this.$name + " 下载文件失败 " + this.$downloadUrl + " code=" + response.code() + " [priority=" + this.$priority + ']', null, 4, null);
            throw new TaskException(1503, "下载文件失败 code=" + response.code());
        } catch (TaskException e11) {
            throw e11;
        } catch (IOException e12) {
            C23985b.m57873d(C23985b.f47489a, "bundleDownload", "startDownload " + this.$name + " IO异常 [priority=" + this.$priority + "]: " + e12.getMessage(), null, 4, null);
            throw e12;
        } catch (CancellationException e13) {
            C23985b.m57873d(C23985b.f47489a, "bundleDownload", "startDownload " + this.$name + " 下载被取消 [priority=" + this.$priority + ']', null, 4, null);
            throw e13;
        } catch (Throwable th4) {
            C23985b.m57873d(C23985b.f47489a, "bundleDownload", "startDownload " + this.$name + ' ' + this.$downloadUrl + " 下载异常 " + th4.getMessage() + ", errorType:= " + th4.getClass().getSimpleName(), null, 4, null);
            throw new TaskException(1503, "下载异常 " + th4.getMessage() + ", errorType:= " + th4.getClass().getSimpleName(), th4);
        }
    }
}
