package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: loaded from: classes60.dex */
public class CustomViewCallbackFlutterApiImpl {
    private GeneratedAndroidWebView.CustomViewCallbackFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public void create(@NonNull WebChromeClient.CustomViewCallback customViewCallback, @NonNull GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(customViewCallback)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(customViewCallback)), reply);
    }

    @VisibleForTesting
    public void setApi(@NonNull GeneratedAndroidWebView.CustomViewCallbackFlutterApi customViewCallbackFlutterApi) {
        this.api = customViewCallbackFlutterApi;
    }

    public CustomViewCallbackFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.CustomViewCallbackFlutterApi(binaryMessenger);
    }
}
