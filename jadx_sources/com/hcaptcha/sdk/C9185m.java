package com.hcaptcha.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import lombok.Generated;
import lombok.NonNull;

/* JADX INFO: renamed from: com.hcaptcha.sdk.m */
/* JADX INFO: loaded from: classes56.dex */
public final class C9185m {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Context f12898a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HCaptchaConfig f12899b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final InterfaceC9187o f12900c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final HCaptchaWebView f12901d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final IHCaptchaHtmlProvider f12902e;

    /* JADX INFO: renamed from: com.hcaptcha.sdk.m$b */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
            if (z12) {
                try {
                    WebView.HitTestResult hitTestResult = webView.getHitTestResult();
                    if (hitTestResult.getType() == 7) {
                        Uri uri = Uri.parse(hitTestResult.getExtra());
                        Intent intent = new Intent("android.intent.action.VIEW", uri);
                        intent.addFlags(268435456);
                        C9185m.this.f12898a.startActivity(intent);
                        Objects.toString(uri);
                        return true;
                    }
                } catch (Exception e11) {
                    e11.getMessage();
                }
            }
            return super.onCreateWindow(webView, z11, z12, message);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
        }
    }

    /* JADX INFO: renamed from: com.hcaptcha.sdk.m$c */
    @RequiresApi(21)
    public class c extends WebViewClient {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Handler f12904a;

        public c(Handler handler) {
            if (handler == null) {
                throw new NullPointerException("handler is marked non-null but is null");
            }
            this.f12904a = handler;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13975a(c cVar, Uri uri) {
            C9185m.this.f12901d.removeJavascriptInterface(HCaptchaJSInterface.JS_INTERFACE_TAG);
            C9185m.this.f12901d.removeJavascriptInterface(HCaptchaDebugInfo.JS_INTERFACE_TAG);
            C9185m.this.f12900c.mo13945w(new HCaptchaException(HCaptchaError.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + uri + " requested"));
        }

        /* JADX INFO: renamed from: b */
        public final String m13976b(String str) {
            return str.split("[?#]")[0] + "...";
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            m13976b(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            m13976b(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            m13976b(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            super.onReceivedError(webView, i11, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            final Uri url = webResourceRequest.getUrl();
            if (url != null && url.getScheme() != null && url.getScheme().equals("http")) {
                this.f12904a.post(new Runnable() { // from class: com.hcaptcha.sdk.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9185m.c.m13975a(this.f12906b, url);
                    }
                });
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (string.startsWith("sms:")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                    intent.addFlags(268435456);
                    C9185m.this.f12898a.startActivity(intent);
                    return true;
                } catch (Exception e11) {
                    e11.getMessage();
                    C9185m.this.f12900c.mo13945w(new HCaptchaException(HCaptchaError.INTERNAL_ERROR, "Messaging app cannot be launched"));
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13967d() {
        try {
            this.f12901d.loadUrl("javascript:execute();");
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    /* JADX INFO: renamed from: e */
    public HCaptchaConfig m13968e() {
        return this.f12899b;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    /* JADX INFO: renamed from: f */
    public HCaptchaWebView m13969f() {
        return this.f12901d;
    }

    /* JADX INFO: renamed from: g */
    public void m13970g() {
        try {
            this.f12901d.loadUrl("javascript:reset();");
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13972i(@Nullable HCaptchaVerifyParams hCaptchaVerifyParams) {
        String rqdata;
        if (hCaptchaVerifyParams == null) {
            hCaptchaVerifyParams = new HCaptchaVerifyParams();
        }
        String rqdata2 = hCaptchaVerifyParams.getRqdata();
        if ((rqdata2 == null || rqdata2.isEmpty()) && (rqdata = this.f12899b.getRqdata()) != null && !rqdata.isEmpty()) {
            hCaptchaVerifyParams.setRqdata(rqdata);
        }
        try {
            String strWriteValueAsString = new ObjectMapper().writeValueAsString(hCaptchaVerifyParams);
            this.f12901d.loadUrl("javascript:setData(" + strWriteValueAsString + ");");
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /* JADX INFO: renamed from: j */
    public final void m13973j(@NonNull Handler handler) {
        if (handler == null) {
            throw new NullPointerException("handler is marked non-null but is null");
        }
        this.f12901d.setId(R$id.webView);
        HCaptchaJSInterface hCaptchaJSInterface = new HCaptchaJSInterface(handler, this.f12899b, this.f12900c);
        HCaptchaDebugInfo hCaptchaDebugInfo = new HCaptchaDebugInfo(this.f12898a);
        WebSettings settings = this.f12901d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportMultipleWindows(true);
        this.f12901d.setWebViewClient(new c(handler));
        this.f12901d.setWebChromeClient(new b());
        this.f12901d.setBackgroundColor(0);
        if (this.f12899b.getDisableHardwareAcceleration().booleanValue()) {
            this.f12901d.setLayerType(1, null);
        }
        this.f12901d.addJavascriptInterface(hCaptchaJSInterface, HCaptchaJSInterface.JS_INTERFACE_TAG);
        this.f12901d.addJavascriptInterface(hCaptchaDebugInfo, HCaptchaDebugInfo.JS_INTERFACE_TAG);
        this.f12901d.loadDataWithBaseURL(this.f12899b.getBaseUrl(), this.f12902e.getHtml(), "text/html", "UTF-8", null);
        this.f12901d.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: k */
    public boolean m13974k(HCaptchaException hCaptchaException) {
        return this.f12899b.getRetryPredicate().shouldRetry(this.f12899b, hCaptchaException);
    }

    public C9185m(@NonNull Handler handler, @NonNull Context context, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull HCaptchaInternalConfig hCaptchaInternalConfig, @NonNull InterfaceC9187o interfaceC9187o, @NonNull HCaptchaWebView hCaptchaWebView) {
        if (handler != null) {
            if (context != null) {
                if (hCaptchaConfig != null) {
                    if (hCaptchaInternalConfig != null) {
                        if (interfaceC9187o != null) {
                            if (hCaptchaWebView != null) {
                                this.f12898a = context;
                                this.f12899b = hCaptchaConfig;
                                this.f12900c = interfaceC9187o;
                                this.f12901d = hCaptchaWebView;
                                this.f12902e = hCaptchaInternalConfig.getHtmlProvider();
                                m13973j(handler);
                                return;
                            }
                            throw new NullPointerException("webView is marked non-null but is null");
                        }
                        throw new NullPointerException("captchaVerifier is marked non-null but is null");
                    }
                    throw new NullPointerException("internalConfig is marked non-null but is null");
                }
                throw new NullPointerException("config is marked non-null but is null");
            }
            throw new NullPointerException("context is marked non-null but is null");
        }
        throw new NullPointerException("handler is marked non-null but is null");
    }

    /* JADX INFO: renamed from: h */
    public void m13971h(@Nullable HCaptchaVerifyParams hCaptchaVerifyParams) {
        m13970g();
        m13972i(hCaptchaVerifyParams);
        m13967d();
    }
}
