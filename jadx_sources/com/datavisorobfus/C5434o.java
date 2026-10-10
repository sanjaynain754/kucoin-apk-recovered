package com.datavisorobfus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.datavisor.vangogh.bridge.crypto;

/* JADX INFO: renamed from: com.datavisorobfus.o */
/* JADX INFO: loaded from: classes34.dex */
public class C5434o extends WebView {

    /* JADX INFO: renamed from: a */
    private final c f7335a;

    /* JADX INFO: renamed from: com.datavisorobfus.o$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C5434o.this.loadUrl("javascript:findWebRTCinfo()");
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.o$b */
    public class b {
        private b() {
        }

        public /* synthetic */ b(C5434o c5434o, a aVar) {
            this();
        }

        @JavascriptInterface
        public void receiveIP(String str) {
            try {
                if (C5434o.this.f7335a != null) {
                    if (C5457z0.m7480a(str)) {
                        str = "empty";
                    }
                    C5434o.this.f7335a.mo7241a(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.o$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7241a(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m7240a() {
        C5415f0.m7136a("DVWRWebView now destroy itself");
        try {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
            stopLoading();
            clearHistory();
            clearCache(true);
            loadUrl("about:blank");
            setVisibility(8);
            super.onDetachedFromWindow();
            destroy();
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    public C5434o(Context context, c cVar) {
        super(context);
        this.f7335a = cVar;
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new b(this, null), "dvCandidate");
        setWebViewClient(new a());
        loadData(crypto.convert("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"), "text/html", "UTF-8");
    }
}
