package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebViewFlutterApiImpl {
    private GeneratedAndroidWebView.WebViewFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public void create(@NonNull WebView webView, @NonNull GeneratedAndroidWebView.WebViewFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(webView)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(webView)), reply);
    }

    public void onScrollChanged(@NonNull WebView webView, @NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull Long l14, @NonNull GeneratedAndroidWebView.WebViewFlutterApi.Reply<Void> reply) {
        GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi = this.api;
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        webViewFlutterApi.onScrollChanged(identifierForStrongReference, l11, l12, l13, l14, reply);
    }

    @VisibleForTesting
    public void setApi(@NonNull GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi) {
        this.api = webViewFlutterApi;
    }

    public WebViewFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.WebViewFlutterApi(binaryMessenger);
    }
}
