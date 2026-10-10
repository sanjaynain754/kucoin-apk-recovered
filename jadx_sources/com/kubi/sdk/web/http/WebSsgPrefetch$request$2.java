package com.kubi.sdk.web.http;

import android.content.Context;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.helper.C24308d;
import com.kubi.sdk.web.util.C24336i;
import com.kubi.sdk.web.util.OKHttpUtilsKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
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
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$request$2", m90122f = "WebSsgPrefetch.kt", m90123i = {0, 0}, m90124l = {127}, m90125m = "invokeSuspend", m90126n = {"uri", "startTime"}, m90127s = {"L$0", "J$0"})
@SourceDebugExtension({"SMAP\nWebSsgPrefetch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$request$2\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,199:1\n86#2,3:200\n*S KotlinDebug\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$request$2\n*L\n160#1:200,3\n*E\n"})
public final class WebSsgPrefetch$request$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super WebSsgPrefetch.FetchData>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $type;
    final /* synthetic */ String $ua;
    final /* synthetic */ String $url;
    long J$0;
    Object L$0;
    int label;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long jCurrentTimeMillis;
        Object objM58849a;
        String str;
        Throwable th2;
        WebSsgPrefetch.FetchData fetchData;
        WebSsgPrefetch.FetchData fetchData2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                String strM58706e = C24308d.m58706e(this.$url);
                OkHttpClient okHttpClientM58742a = C24315a.f48460a.m58742a(this.$context);
                Request.Builder builderUrl = new Request.Builder().url(strM58706e);
                String strM58731f = this.$ua;
                if (strM58731f == null) {
                    strM58731f = WebSsgPrefetch.f48451a.m58731f();
                }
                Request.Builder builderHeader = builderUrl.header("User-Agent", strM58731f).header("Accept", "text/html,application/xhtml+xml,application/xml");
                builderHeader.header("x-app-theme", WebConfig.f48355a.m58599j());
                Request requestBuild = builderHeader.build();
                jCurrentTimeMillis = System.currentTimeMillis();
                Call callNewCall = okHttpClientM58742a.newCall(requestBuild);
                this.L$0 = strM58706e;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                objM58849a = OKHttpUtilsKt.m58849a(callNewCall, this);
                if (objM58849a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strM58706e;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.J$0;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                jCurrentTimeMillis = j11;
                objM58849a = obj;
            }
            Response response = (Response) objM58849a;
            String str2 = this.$type;
            String str3 = this.$url;
            try {
                Response responseNetworkResponse = response.networkResponse();
                int iCode = responseNetworkResponse != null ? responseNetworkResponse.code() : response.code();
                if (response.isSuccessful() && !response.isRedirect()) {
                    ResponseBody responseBodyBody = response.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (strString == null || strString.length() == 0) {
                        C43840a.m96548b("WebSsgPrefetch " + str + '[' + iCode + "] is empty ", "WebSsgPrefetch");
                        WebSsgPrefetch.m58730k(WebSsgPrefetch.f48451a, str2, str3, 202, 0L, null, 24, null);
                    } else {
                        WebSsgPrefetch webSsgPrefetch = WebSsgPrefetch.f48451a;
                        if (webSsgPrefetch.m58732g(strString)) {
                            C43840a.m96550d("WebSsgPrefetch " + str + '[' + iCode + "] is SSG-html cost=" + jCurrentTimeMillis2, "WebSsgPrefetch");
                            WebSsgPrefetch.m58730k(webSsgPrefetch, str2, str3, iCode == 304 ? 304 : 200, jCurrentTimeMillis2, null, 16, null);
                            fetchData2 = new WebSsgPrefetch.FetchData(strString, true, iCode != 304);
                        } else {
                            C43840a.m96548b("WebSsgPrefetch " + str + '[' + iCode + "] is not SSG-html ", "WebSsgPrefetch");
                            WebSsgPrefetch.m58730k(webSsgPrefetch, str2, str3, 201, jCurrentTimeMillis2, null, 16, null);
                            fetchData2 = new WebSsgPrefetch.FetchData(strString, false, iCode != 304);
                        }
                        fetchData = fetchData2;
                        th2 = null;
                    }
                    CloseableKt.closeFinally(response, th2);
                    return fetchData;
                }
                C43840a.m96548b("WebSsgPrefetch", "requestUrl " + str3 + " failed code=" + response.code());
                WebSsgPrefetch.m58730k(WebSsgPrefetch.f48451a, str2, str3, iCode, 0L, null, 24, null);
                th2 = null;
                fetchData = null;
                CloseableKt.closeFinally(response, th2);
                return fetchData;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(response, th3);
                    throw th4;
                }
            }
        } catch (CancellationException unused) {
            return null;
        } catch (Throwable th5) {
            C44128b.m97263g("WebSsgPrefetch", th5);
            WebSsgPrefetch.m58730k(WebSsgPrefetch.f48451a, this.$type, this.$url, 999, 0L, th5.getMessage(), 8, null);
            if (!C24336i.f48570a.m58890a(th5)) {
                C43846g.m96568c(new WebCoreException(th5, "WebSsgPrefetch", false, "requestUrl " + this.$url + " req_error", 4, null), null, 2, null);
                return null;
            }
            C43840a.m96548b("WebSsgPrefetch requestUrl " + this.$url + " req_error: " + th5.getMessage(), "WebSsgPrefetch");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSsgPrefetch$request$2(String str, Context context, String str2, String str3, Continuation<? super WebSsgPrefetch$request$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$context = context;
        this.$ua = str2;
        this.$type = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebSsgPrefetch$request$2(this.$url, this.$context, this.$ua, this.$type, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super WebSsgPrefetch.FetchData> continuation) {
        return ((WebSsgPrefetch$request$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
