package com.kubi.sdk.pkg.task;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/a;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/a;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.HttpHelperKt$startPullJsonConditionally$2", m90122f = "HttpHelper.kt", m90123i = {}, m90124l = {227}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHttpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt$startPullJsonConditionally$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1855#2,2:306\n1#3:308\n*S KotlinDebug\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt$startPullJsonConditionally$2\n*L\n216#1:306,2\n*E\n"})
public final class HttpHelperKt$startPullJsonConditionally$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ConditionalJsonResponse>, Object> {
    final /* synthetic */ String $etag;
    final /* synthetic */ String $jsonUrl;
    final /* synthetic */ String $lastModified;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHelperKt$startPullJsonConditionally$2(String str, String str2, String str3, Continuation<? super HttpHelperKt$startPullJsonConditionally$2> continuation) {
        super(2, continuation);
        this.$jsonUrl = str;
        this.$etag = str2;
        this.$lastModified = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HttpHelperKt$startPullJsonConditionally$2(this.$jsonUrl, this.$etag, this.$lastModified, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super ConditionalJsonResponse> continuation) {
        return ((HttpHelperKt$startPullJsonConditionally$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM57791a;
        String strString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                OkHttpClient.Builder builderNewBuilder = HttpHelperKt.m57782h().newBuilder();
                builderNewBuilder.readTimeout(30000L, TimeUnit.MILLISECONDS);
                Iterator<T> it = PackageDownloadSetting.f47421a.m57786a().iterator();
                while (it.hasNext()) {
                    builderNewBuilder.addInterceptor((Interceptor) it.next());
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Request.Builder builderHeader = new Request.Builder().header("User-Agent", PackageDownloadSetting.f47421a.m57787b());
                String str = this.$etag;
                String str2 = this.$lastModified;
                if (str != null) {
                    if (StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        builderHeader.header(HttpHeaders.IF_NONE_MATCH, str);
                    }
                }
                if (str2 != null) {
                    if (StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        builderHeader.header(HttpHeaders.IF_MODIFIED_SINCE, str2);
                    }
                }
                Call callNewCall = okHttpClientBuild.newCall(builderHeader.url(this.$jsonUrl).build());
                this.label = 1;
                objM57791a = TaskCommonKt.m57791a(callNewCall, this);
                if (objM57791a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM57791a = obj;
            }
            Closeable closeable = (Closeable) objM57791a;
            String str3 = this.$jsonUrl;
            try {
                Response response = (Response) closeable;
                if (response.code() == 304) {
                    ConditionalJsonResponse conditionalJsonResponse = new ConditionalJsonResponse(true, null, Response.header$default(response, HttpHeaders.ETAG, null, 2, null), Response.header$default(response, HttpHeaders.LAST_MODIFIED, null, 2, null), 2, null);
                    CloseableKt.closeFinally(closeable, null);
                    return conditionalJsonResponse;
                }
                if (!response.isSuccessful()) {
                    throw new TaskException(1501, "条件拉取JSON失败, 返回" + response.code() + ", " + str3);
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                    ConditionalJsonResponse conditionalJsonResponse2 = new ConditionalJsonResponse(false, strString, Response.header$default(response, HttpHeaders.ETAG, null, 2, null), Response.header$default(response, HttpHeaders.LAST_MODIFIED, null, 2, null));
                    CloseableKt.closeFinally(closeable, null);
                    return conditionalJsonResponse2;
                }
                throw new TaskException(1501, "条件拉取JSON失败, body=null, " + str3);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(closeable, th2);
                    throw th3;
                }
            }
        } catch (TaskException e11) {
            throw e11;
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th4) {
            throw new TaskException(1501, "条件拉取JSON异常, " + this.$jsonUrl + ", error=" + th4.getMessage() + ", errorType=" + th4.getClass().getSimpleName(), th4);
        }
    }
}
