package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebResourceRequestAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* JADX INFO: loaded from: classes34.dex */
public class WebResourceRequestCompat {
    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest) {
        ApiFeature.C4164N c4164n = WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (c4164n.isSupportedByFramework()) {
            return ApiHelperForN.isRedirect(webResourceRequest);
        }
        if (c4164n.isSupportedByWebView()) {
            return getAdapter(webResourceRequest).isRedirect();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private WebResourceRequestCompat() {
    }

    private static WebResourceRequestAdapter getAdapter(WebResourceRequest webResourceRequest) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(webResourceRequest);
    }
}
