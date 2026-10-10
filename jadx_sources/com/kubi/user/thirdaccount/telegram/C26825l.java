package com.kubi.user.thirdaccount.telegram;

import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.kubi.utils.C27100x0;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.user.thirdaccount.telegram.l */
/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0005"}, m90084d2 = {"safeDestroy", "", "Landroid/webkit/WebView;", "wrapActionModeCallback", "Landroid/view/ActionMode$Callback;", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26825l {
    /* JADX INFO: renamed from: n */
    public static final Unit m65829n(WebView webView) {
        webView.setWebChromeClient(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m65825j(final WebView webView) {
        C43840a.m96550d("[destroy] safeDestroy currentUrl=" + webView.getUrl(), "TelegramAuthActivity");
        SafeWebView safeWebView = webView instanceof SafeWebView ? (SafeWebView) webView : null;
        if (safeWebView != null) {
            safeWebView.m65789b();
        }
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65826k(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65827l(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65828m(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65829n(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65830o(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65831p(webView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.user.thirdaccount.telegram.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C26825l.m65832q(webView);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final ActionMode.Callback m65833r(ActionMode.Callback callback) {
        if (callback == null) {
            return null;
        }
        return callback instanceof SafeCallback ? callback : new SafeCallback(callback);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m65826k(WebView webView) {
        webView.stopLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m65827l(WebView webView) {
        webView.onPause();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m65828m(WebView webView) {
        webView.clearHistory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m65830o(WebView webView) {
        webView.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m65831p(WebView webView) {
        ViewGroup viewGroup;
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m65832q(WebView webView) {
        webView.destroy();
        return Unit.INSTANCE;
    }
}
