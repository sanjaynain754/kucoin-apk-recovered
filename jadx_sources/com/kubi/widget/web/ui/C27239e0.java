package com.kubi.widget.web.ui;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.kubi.sdk.web.KWebView;
import com.kubi.utils.C27100x0;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.widget.web.ui.e0 */
/* JADX INFO: compiled from: KWebContainer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, m90084d2 = {"safeDestroy", "", "Lcom/kubi/sdk/web/KWebView;", "shouldBypassDestroyForKnownCrash", "", "Landroid/webkit/WebView;", "LWebWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C27239e0 {
    /* JADX INFO: renamed from: m */
    public static final Unit m67546m(KWebView kWebView) {
        kWebView.setWebChromeClient(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m67542i(final KWebView kWebView) {
        C43840a.m96550d("[destroy] safeDestroy currentUrl=" + kWebView.getUrl(), "KWebContainer");
        kWebView.m58576p();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67543j(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67544k(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67545l(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67546m(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67547n(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27239e0.m67548o(kWebView);
            }
        });
        if (!m67550q(kWebView)) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C27239e0.m67549p(kWebView);
                }
            });
            return;
        }
        C43840a.m96550d("[destroy] bypass destroy for known webview crash brand=" + Build.BRAND + " manufacturer=" + Build.MANUFACTURER + " sdk=" + Build.VERSION.SDK_INT, "KWebContainer");
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m67550q(WebView webView) {
        if (Build.VERSION.SDK_INT != 35) {
            return false;
        }
        return StringsKt.equals(Build.MODEL, "Redmi 13C", true);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m67543j(KWebView kWebView) {
        kWebView.stopLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m67544k(KWebView kWebView) {
        kWebView.onPause();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m67545l(KWebView kWebView) {
        kWebView.clearHistory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m67547n(KWebView kWebView) {
        kWebView.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m67548o(KWebView kWebView) {
        ViewGroup viewGroup;
        ViewParent parent = kWebView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(kWebView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m67549p(KWebView kWebView) {
        kWebView.destroy();
        return Unit.INSTANCE;
    }
}
