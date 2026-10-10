package com.kubi.sdk.web.core;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.util.C24329b;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BridgeWebViewClient.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J-\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020!2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/web/core/BridgeWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Landroid/webkit/WebView;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onPageCommitVisible", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/web/core/WebBridge;", "b", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBridgeWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeWebViewClient.kt\ncom/kubi/sdk/web/core/BridgeWebViewClient\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,105:1\n86#2,3:106\n86#2,3:109\n*S KotlinDebug\n*F\n+ 1 BridgeWebViewClient.kt\ncom/kubi/sdk/web/core/BridgeWebViewClient\n*L\n68#1:106,3\n101#1:109,3\n*E\n"})
public final class BridgeWebViewClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
        if (view != null && request != null) {
            try {
                C24329b.f48558a.m58864d("redirectURL", "nav redirect " + request.getUrl());
                return this.bridge.m58659b0(request);
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "BridgeWebViewClient", false, "shouldOverrideUrlLoading err", 4, null), null, 2, null);
            }
        }
        return false;
    }

    public BridgeWebViewClient(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@Nullable WebView view, @Nullable String url) {
        if (view == null || url == null) {
            return;
        }
        C44128b.m97259c("BridgeWebViewClient", url + " onPageCommitVisible");
        this.bridge.m58635E(url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        C24329b.f48558a.m58864d("loadFinish", "onPageFinished " + url);
        if (view == null || url == null || url.length() == 0 || view.getProgress() < 100) {
            return;
        }
        this.bridge.m58643M(url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        C24329b.f48558a.m58864d("loadStart", "onPageStarted " + url);
        if (view == null || url == null || url.length() == 0) {
            return;
        }
        this.bridge.m58645O(url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        if (view == null || request == null || error == null) {
            return;
        }
        this.bridge.m58646P(request, error);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceResponse errorResponse) {
        if (view == null || request == null || errorResponse == null) {
            return;
        }
        this.bridge.m58647Q(request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@Nullable WebView view, @Nullable SslErrorHandler handler, @Nullable SslError error) {
        if (view == null || error == null) {
            return;
        }
        this.bridge.m58648R(error);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        if (view != null && request != null) {
            try {
                if (Intrinsics.areEqual(request.getUrl().getScheme(), "data")) {
                    C44128b.m97259c("kweb_load", "WebResource [" + request.getUrl() + "] from webview[data]");
                    return null;
                }
                String method = request.getMethod();
                Intrinsics.checkNotNullExpressionValue(method, "request.method");
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String upperCase = method.toUpperCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (!Intrinsics.areEqual(upperCase, "GET")) {
                    C44128b.m97259c("kweb_load", "WebResource [" + request.getUrl() + "] from webview[" + request.getMethod() + ']');
                    return null;
                }
                WebBridge webBridge = this.bridge;
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
                webBridge.m58634D(string);
                WebResourceResponse webResourceResponseMo4847g = this.bridge.getScene().mo4847g(request);
                if (webResourceResponseMo4847g != null) {
                    WebBridge webBridge2 = this.bridge;
                    String string2 = request.getUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "request.url.toString()");
                    webBridge2.m58635E(string2);
                }
                if (webResourceResponseMo4847g == null) {
                    C44128b.m97259c("kweb_load", "WebResource [" + request.getUrl() + "] from webview[noProxy]");
                    return webResourceResponseMo4847g;
                }
                C44128b.m97259c("kweb_load", "WebResource [" + request.getUrl() + "] from webview[local]");
                return webResourceResponseMo4847g;
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "BridgeWebViewClient", false, "shouldInterceptRequest err", 4, null), null, 2, null);
            }
        }
        return null;
    }
}
