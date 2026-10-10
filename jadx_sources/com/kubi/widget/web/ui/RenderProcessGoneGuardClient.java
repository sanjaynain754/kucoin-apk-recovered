package com.kubi.widget.web.ui;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.messaging.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.ui.g0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebContainer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0015\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J.\u0010\u0019\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0019\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\"\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020\u0006H\u0016J&\u0010$\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0016J0\u0010(\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010%\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\r2\b\u0010+\u001a\u0004\u0018\u00010\rH\u0016J0\u0010,\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\r2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010/\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\u001c\u00103\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001c\u00106\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001c\u00107\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/widget/web/ui/RenderProcessGoneGuardClient;", "Landroid/webkit/WebViewClient;", "delegate", "onRenderProcessGoneHandler", "Lkotlin/Function1;", "Landroid/webkit/RenderProcessGoneDetail;", "", "<init>", "(Landroid/webkit/WebViewClient;Lkotlin/jvm/functions/Function1;)V", "shouldOverrideUrlLoading", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebView;", "url", "", "request", "Landroid/webkit/WebResourceRequest;", "onPageStarted", "", "favicon", "Landroid/graphics/Bitmap;", "onPageFinished", "onLoadResource", "onPageCommitVisible", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "onReceivedError", "errorCode", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "failingUrl", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "doUpdateVisitedHistory", "isReload", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onReceivedHttpAuthRequest", "Landroid/webkit/HttpAuthHandler;", "host", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, "onReceivedLoginRequest", JAnalysisConstants.Account.KEY_ACCOUNT, "args", "onScaleChanged", "oldScale", "", "newScale", "shouldOverrideKeyEvent", "event", "Landroid/view/KeyEvent;", "onUnhandledKeyEvent", "onRenderProcessGone", C33556b3.f68963J, "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RenderProcessGoneGuardClient extends WebViewClient {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final WebViewClient f55326a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<RenderProcessGoneDetail, Boolean> f55327b;

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, int errorCode, @Nullable String description, @Nullable String failingUrl) {
        this.f55326a.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
        return this.f55326a.shouldInterceptRequest(view, url);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
        return this.f55326a.shouldOverrideUrlLoading(view, url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderProcessGoneGuardClient(@NotNull WebViewClient delegate, @NotNull Function1<? super RenderProcessGoneDetail, Boolean> onRenderProcessGoneHandler) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onRenderProcessGoneHandler, "onRenderProcessGoneHandler");
        this.f55326a = delegate;
        this.f55327b = onRenderProcessGoneHandler;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(@Nullable WebView view, @Nullable String url, boolean isReload) {
        this.f55326a.doUpdateVisitedHistory(view, url, isReload);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(@Nullable WebView view, @Nullable String url) {
        this.f55326a.onLoadResource(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@Nullable WebView view, @Nullable String url) {
        this.f55326a.onPageCommitVisible(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        this.f55326a.onPageFinished(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        this.f55326a.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        this.f55326a.onReceivedError(view, request, error);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(@Nullable WebView view, @Nullable HttpAuthHandler handler, @Nullable String host, @Nullable String realm) {
        this.f55326a.onReceivedHttpAuthRequest(view, handler, host, realm);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceResponse errorResponse) {
        this.f55326a.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(@Nullable WebView view, @Nullable String realm, @Nullable String account, @Nullable String args) {
        this.f55326a.onReceivedLoginRequest(view, realm, account, args);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@Nullable WebView view, @Nullable SslErrorHandler handler, @Nullable SslError error) {
        this.f55326a.onReceivedSslError(view, handler, error);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
        return this.f55327b.invoke(detail).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(@Nullable WebView view, float oldScale, float newScale) {
        this.f55326a.onScaleChanged(view, oldScale, newScale);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(@Nullable WebView view, @Nullable KeyEvent event) {
        this.f55326a.onUnhandledKeyEvent(view, event);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        return this.f55326a.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(@Nullable WebView view, @Nullable KeyEvent event) {
        return this.f55326a.shouldOverrideKeyEvent(view, event);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
        return this.f55326a.shouldOverrideUrlLoading(view, request);
    }
}
