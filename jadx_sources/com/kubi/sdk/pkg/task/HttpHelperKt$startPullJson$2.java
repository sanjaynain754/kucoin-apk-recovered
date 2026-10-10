package com.kubi.sdk.pkg.task;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.TimeoutCancellationException;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.HttpHelperKt$startPullJson$2", m90122f = "HttpHelper.kt", m90123i = {}, m90124l = {187}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHttpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt$startPullJson$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n1855#2,2:306\n*S KotlinDebug\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt$startPullJson$2\n*L\n181#1:306,2\n*E\n"})
public final class HttpHelperKt$startPullJson$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $jsonUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHelperKt$startPullJson$2(String str, Continuation<? super HttpHelperKt$startPullJson$2> continuation) {
        super(2, continuation);
        this.$jsonUrl = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HttpHelperKt$startPullJson$2(this.$jsonUrl, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super String> continuation) {
        return ((HttpHelperKt$startPullJson$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String strString;
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
                OkHttpClient.Builder builderNewBuilder = HttpHelperKt.m57780f().newBuilder();
                builderNewBuilder.readTimeout(30000L, TimeUnit.MILLISECONDS);
                Iterator<T> it = PackageDownloadSetting.f47421a.m57786a().iterator();
                while (it.hasNext()) {
                    builderNewBuilder.addInterceptor((Interceptor) it.next());
                }
                Call callNewCall = builderNewBuilder.build().newCall(new Request.Builder().header("User-Agent", PackageDownloadSetting.f47421a.m57787b()).url(this.$jsonUrl).build());
                this.label = 1;
                obj = TaskCommonKt.m57791a(callNewCall, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Response response = (Response) obj;
            C43840a.m96550d("读取JSON " + this.$jsonUrl, "package_update");
            if (response.isSuccessful()) {
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                    return strString;
                }
                throw new TaskException(1501, "拉取JSON失败, body=null");
            }
            throw new TaskException(1501, "拉取JSON失败, 返回" + response.code());
        } catch (TimeoutCancellationException unused) {
            throw new TaskException(1501, "拉取JSON失败, 处理超时");
        } catch (CancellationException unused2) {
            throw new TaskException(1501, "拉取JSON失败, 取消执行");
        } catch (Throwable th2) {
            throw new TaskException(1501, "拉取JSON失败, 异常, error=" + th2.getMessage() + ", errorType:= " + th2.getClass().getSimpleName(), th2);
        }
    }
}
