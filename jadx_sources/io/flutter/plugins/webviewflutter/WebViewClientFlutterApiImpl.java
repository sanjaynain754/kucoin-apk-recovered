package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebViewClientFlutterApiImpl extends GeneratedAndroidWebView.WebViewClientFlutterApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final WebViewFlutterApiImpl webViewFlutterApi;

    @RequiresApi(api = 23)
    public static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(WebResourceError webResourceError) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf(webResourceError.getErrorCode())).setDescription(webResourceError.getDescription().toString()).build();
    }

    @RequiresApi(api = 23)
    public void onReceivedRequestError(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.b4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87761n((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceError), reply);
    }

    @RequiresApi(api = 21)
    public static GeneratedAndroidWebView.WebResourceRequestData createWebResourceRequestData(WebResourceRequest webResourceRequest) {
        GeneratedAndroidWebView.WebResourceRequestData.Builder requestHeaders = new GeneratedAndroidWebView.WebResourceRequestData.Builder().setUrl(webResourceRequest.getUrl().toString()).setIsForMainFrame(Boolean.valueOf(webResourceRequest.isForMainFrame())).setHasGesture(Boolean.valueOf(webResourceRequest.hasGesture())).setMethod(webResourceRequest.getMethod()).setRequestHeaders(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new HashMap<>());
        requestHeaders.setIsRedirect(Boolean.valueOf(webResourceRequest.isRedirect()));
        return requestHeaders.build();
    }

    @RequiresApi(api = 21)
    public static GeneratedAndroidWebView.WebResourceResponseData createWebResourceResponseData(WebResourceResponse webResourceResponse) {
        return new GeneratedAndroidWebView.WebResourceResponseData.Builder().setStatusCode(Long.valueOf(webResourceResponse.getStatusCode())).build();
    }

    private long getIdentifierForClient(WebViewClient webViewClient) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webViewClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    public void doUpdateVisitedHistory(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull String str, boolean z11, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.d4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87759l((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        doUpdateVisitedHistory(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, Boolean.valueOf(z11), reply);
    }

    public void onPageFinished(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull String str, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.w3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87764q((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onPageFinished(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onPageStarted(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull String str, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.z3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87763p((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onPageStarted(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onReceivedError(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull Long l11, @NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.c4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87765r((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, l11, str, str2, reply);
    }

    public void onReceivedHttpAuthRequest(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull HttpAuthHandler httpAuthHandler, @NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        new HttpAuthHandlerFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(httpAuthHandler, new GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.y3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87766s((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webViewClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(httpAuthHandler);
        Objects.requireNonNull(identifierForStrongReference3);
        onReceivedHttpAuthRequest(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, str, str2, reply);
    }

    @RequiresApi(api = 21)
    public void onReceivedHttpError(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.v3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87757j((Void) obj);
            }
        });
        onReceivedHttpError(Long.valueOf(getIdentifierForClient(webViewClient)), this.instanceManager.getIdentifierForStrongReference(webView), createWebResourceRequestData(webResourceRequest), createWebResourceResponseData(webResourceResponse), reply);
    }

    @RequiresApi(api = 21)
    public void requestLoading(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.x3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87760m((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        requestLoading(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), reply);
    }

    public void urlLoading(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull String str, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.e4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87758k((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        urlLoading(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public WebViewClientFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        super(binaryMessenger);
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.webViewFlutterApi = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
    }

    @SuppressLint({"RequiresFeature"})
    public static GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(WebResourceErrorCompat webResourceErrorCompat) {
        return new GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(Long.valueOf(webResourceErrorCompat.getErrorCode())).setDescription(webResourceErrorCompat.getDescription().toString()).build();
    }

    @RequiresApi(api = 21)
    public void onReceivedRequestError(@NonNull WebViewClient webViewClient, @NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceErrorCompat webResourceErrorCompat, @NonNull GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.a4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebViewClientFlutterApiImpl.m87762o((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceErrorCompat), reply);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m87757j(Void r11) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m87758k(Void r11) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m87759l(Void r11) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m87760m(Void r11) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m87761n(Void r11) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m87762o(Void r11) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m87763p(Void r11) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m87764q(Void r11) {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m87765r(Void r11) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m87766s(Void r11) {
    }
}
