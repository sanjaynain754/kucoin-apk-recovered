package com.reactnativecommunity.webview;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNCWebViewWrapper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "webView", "Lcom/reactnativecommunity/webview/RNCWebView;", "<init>", "(Landroid/content/Context;Lcom/reactnativecommunity/webview/RNCWebView;)V", "getWebView", "()Lcom/reactnativecommunity/webview/RNCWebView;", "Companion", "react-native-webview_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNCWebViewWrapper extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final RNCWebView webView;

    /* JADX INFO: compiled from: RNCWebViewWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewWrapper$Companion;", "", "<init>", "()V", "getReactTagFromWebView", "", "webView", "Landroid/webkit/WebView;", "react-native-webview_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final int getReactTagFromWebView(@NotNull WebView webView) {
            View view;
            Intrinsics.checkNotNullParameter(webView, "webView");
            Object parent = webView.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view != null) {
                return view.getId();
            }
            return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCWebViewWrapper(@NotNull Context context, @NotNull RNCWebView webView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setBackgroundColor(0);
        addView(webView);
        View childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.webView = (RNCWebView) childAt;
    }

    @JvmStatic
    public static final int getReactTagFromWebView(@NotNull WebView webView) {
        return INSTANCE.getReactTagFromWebView(webView);
    }

    @NotNull
    public final RNCWebView getWebView() {
        return this.webView;
    }
}
