package com.geetest.captcha.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.geetest.captcha.C6661c0;
import com.geetest.captcha.C6662d;
import com.geetest.captcha.C6674j;
import com.geetest.captcha.EnumC6672i;
import com.geetest.captcha.utils.LogUtils;
import com.google.android.material.timepicker.TimeModel;
import com.hcaptcha.sdk.HCaptchaJSInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, m90084d2 = {"Lcom/geetest/captcha/views/GTC4WebView;", "Landroid/webkit/WebView;", "Lcom/geetest/captcha/c0;", "observable", "", "setWebViewObservable", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "captcha_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class GTC4WebView extends WebView {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f11213f = 0;

    /* JADX INFO: renamed from: a */
    @Nullable
    public C6694b f11214a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Handler f11215b;

    /* JADX INFO: renamed from: c */
    public int f11216c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C6695c f11217d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C6696d f11218e;

    /* JADX INFO: renamed from: com.geetest.captcha.views.GTC4WebView$b */
    public static final class C6694b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f11219a;

        /* JADX INFO: renamed from: b */
        public final int f11220b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public C6661c0 f11221c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final Function0<Unit> f11222d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final Function0<Unit> f11223e;

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError error) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedError(view, request, error);
            LogUtils.f11200a.release("WebViewClient.onReceivedError: URL: " + request.getUrl() + ", Method: " + request.getMethod() + ", ErrorCode: " + error.getErrorCode() + ", Description: " + ((Object) error.getDescription()));
            if (Intrinsics.areEqual(request.getUrl().toString(), this.f11219a)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(error.getErrorCode()))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                C6661c0 c6661c0 = this.f11221c;
                String str2 = EnumC6672i.WEB_VIEW_HTTP.getType() + str;
                String str3 = C6674j.f11170b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", request.getUrl());
                jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, error.getDescription());
                Unit unit = Unit.INSTANCE;
                c6661c0.m12529a(str2, str3, jSONObject);
            }
            this.f11223e.invoke();
        }

        public C6694b(@NotNull String loadUrl, int i11, @NotNull C6661c0 observable, @NotNull C6695c startTimeout, @NotNull C6696d stopTimeout) {
            Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
            Intrinsics.checkNotNullParameter(observable, "observable");
            Intrinsics.checkNotNullParameter(startTimeout, "startTimeout");
            Intrinsics.checkNotNullParameter(stopTimeout, "stopTimeout");
            this.f11219a = loadUrl;
            this.f11220b = i11;
            this.f11221c = observable;
            this.f11222d = startTimeout;
            this.f11223e = stopTimeout;
        }

        /* JADX INFO: renamed from: a */
        public final void m12572a() throws JSONException {
            LogUtils.f11200a.release("WebViewClient.onTimedOut. Timeout ms: " + this.f11220b + '.');
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(-8))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            C6661c0 c6661c0 = this.f11221c;
            String str2 = EnumC6672i.WEB_VIEW_HTTP.getType() + str;
            String str3 = C6674j.f11171c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.f11219a);
            jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, C6674j.f11171c + ", Timeout ms: " + this.f11220b + '.');
            Unit unit = Unit.INSTANCE;
            c6661c0.m12529a(str2, str3, jSONObject);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            LogUtils logUtils = LogUtils.f11200a;
            StringBuilder sb2 = new StringBuilder("shouldInterceptRequest(high): ");
            sb2.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            logUtils.release(sb2.toString());
            if (Intrinsics.areEqual(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), this.f11219a)) {
                this.f11222d.invoke();
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Context context;
            LogUtils logUtils = LogUtils.f11200a;
            StringBuilder sb2 = new StringBuilder("shouldOverrideUrlLoading(high): ");
            sb2.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            logUtils.release(sb2.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)));
                if (webView == null || (context = webView.getContext()) == null) {
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(@NotNull WebView view, @NotNull String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onLoadResource(view, url);
            LogUtils.f11200a.release("onLoadResource: " + url);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView view, @NotNull String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            LogUtils.f11200a.release("onPageFinished: " + url);
            if (Intrinsics.areEqual(url, this.f11219a)) {
                this.f11223e.invoke();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            LogUtils.f11200a.release("onPageStarted: " + str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            super.onReceivedHttpError(view, request, errorResponse);
            LogUtils.f11200a.release("WebViewClient.onReceivedHttpError: URL: " + request.getUrl() + ", Code: " + errorResponse.getStatusCode() + ", Message: " + errorResponse.getReasonPhrase());
            if (Intrinsics.areEqual(request.getUrl().toString(), this.f11219a)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(errorResponse.getStatusCode()))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                C6661c0 c6661c0 = this.f11221c;
                String str2 = C6674j.f11170b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", request.getUrl());
                jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, errorResponse.getReasonPhrase());
                Unit unit = Unit.INSTANCE;
                c6661c0.m12529a(str, str2, jSONObject);
                this.f11223e.invoke();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) throws JSONException {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            LogUtils.f11200a.release("WebViewClient.onReceivedSslError: URL: " + error.getUrl() + ", ErrorCode: " + error.getPrimaryError() + ", Description: " + error);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(error.getPrimaryError()))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            C6661c0 c6661c0 = this.f11221c;
            String str2 = EnumC6672i.WEB_VIEW_SSL.getType() + str;
            String str3 = C6674j.f11172d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", error.getUrl());
            jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, error.toString());
            Unit unit = Unit.INSTANCE;
            c6661c0.m12529a(str2, str3, jSONObject);
            this.f11223e.invoke();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, int i11, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i11, description, failingUrl);
            this.f11223e.invoke();
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.views.GTC4WebView$c */
    public static final class C6695c extends Lambda implements Function0<Unit> {
        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        public C6695c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            GTC4WebView gTC4WebView = GTC4WebView.this;
            int i11 = GTC4WebView.f11213f;
            gTC4WebView.getClass();
            final GTC4WebView gTC4WebView2 = GTC4WebView.this;
            gTC4WebView2.f11215b.postDelayed(new Runnable() { // from class: com.geetest.captcha.views.b
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    GTC4WebView.C6695c.m12573a(gTC4WebView2);
                }
            }, GTC4WebView.this.f11216c);
        }

        /* JADX INFO: renamed from: a */
        public static final void m12573a(GTC4WebView this$0) throws JSONException {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i11 = GTC4WebView.f11213f;
            this$0.getClass();
            this$0.stopLoading();
            C6694b c6694b = this$0.f11214a;
            if (c6694b != null) {
                c6694b.m12572a();
            }
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.views.GTC4WebView$d */
    public static final class C6696d extends Lambda implements Function0<Unit> {
        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        public C6696d() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            GTC4WebView.this.f11215b.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.views.GTC4WebView$a */
    public static final class C6693a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@NotNull WebView view, int i11) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onProgressChanged(view, i11);
            LogUtils.f11200a.m12556d("GTC4WebView", "onProgressChanged: " + i11);
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@NotNull WebView view, @NotNull String title) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(title, "title");
            super.onReceivedTitle(view, title);
            LogUtils.f11200a.m12555d("onReceivedTitle: " + title);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    public final void m12571a(@NotNull C6661c0 observable, @NotNull C6662d dataBean, @NotNull String loadUrl) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(dataBean, "dataBean");
        Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(2);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(new C6693a());
        this.f11216c = dataBean.f11156j;
        C6694b c6694b = new C6694b(loadUrl, dataBean.f11156j, observable, this.f11217d, this.f11218e);
        this.f11214a = c6694b;
        setWebViewClient(c6694b);
        setBackgroundColor(dataBean.f11157k);
        if (dataBean.f11149c) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        super.onResume();
        resumeTimers();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LogUtils.f11200a.release("GTC4WebView.onDetachedFromWindow");
        super.onDetachedFromWindow();
        removeJavascriptInterface(HCaptchaJSInterface.JS_INTERFACE_TAG);
        removeAllViews();
        removeAllViewsInLayout();
        stopLoading();
        this.f11215b.removeCallbacksAndMessages(null);
    }

    public final void setWebViewObservable(@NotNull C6661c0 observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        C6694b c6694b = this.f11214a;
        if (c6694b != null) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            c6694b.f11221c = observable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTC4WebView(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
        this.f11215b = new Handler(Looper.getMainLooper());
        this.f11216c = 10000;
        this.f11217d = new C6695c();
        this.f11218e = new C6696d();
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        resumeTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        LogUtils.f11200a.m12556d("GTC4WebView", "newWidth: " + i11 + ", newHeight: " + i12 + ", oldWidth: " + i13 + ", oldHeight: " + i14);
    }
}
