package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(29)
public class ApiHelperForQ {
    @DoNotInline
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(executor, webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    private ApiHelperForQ() {
    }

    @DoNotInline
    @Deprecated
    public static int getForceDark(@NonNull WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    @Nullable
    @DoNotInline
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    @Nullable
    @DoNotInline
    public static android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @DoNotInline
    @Deprecated
    public static void setForceDark(@NonNull WebSettings webSettings, int i11) {
        webSettings.setForceDark(i11);
    }

    @DoNotInline
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    @DoNotInline
    public static boolean terminate(@NonNull WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
