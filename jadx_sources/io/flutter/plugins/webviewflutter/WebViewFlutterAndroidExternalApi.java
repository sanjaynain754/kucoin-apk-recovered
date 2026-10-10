package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterEngine;

/* JADX INFO: loaded from: classes60.dex */
public interface WebViewFlutterAndroidExternalApi {
    @Nullable
    static WebView getWebView(@NonNull FlutterEngine flutterEngine, long j11) {
        WebViewFlutterPlugin webViewFlutterPlugin = (WebViewFlutterPlugin) flutterEngine.getPlugins().get(WebViewFlutterPlugin.class);
        if (webViewFlutterPlugin != null && webViewFlutterPlugin.getInstanceManager() != null) {
            Object instanceManager = webViewFlutterPlugin.getInstanceManager().getInstance(j11);
            if (instanceManager instanceof WebView) {
                return (WebView) instanceManager;
            }
            return null;
        }
        return null;
    }
}
