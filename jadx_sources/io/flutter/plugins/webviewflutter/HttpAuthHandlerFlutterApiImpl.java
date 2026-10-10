package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: loaded from: classes60.dex */
public class HttpAuthHandlerFlutterApiImpl {
    private final GeneratedAndroidWebView.HttpAuthHandlerFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public void create(@NonNull HttpAuthHandler httpAuthHandler, @NonNull GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(httpAuthHandler)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(httpAuthHandler)), reply);
    }

    public HttpAuthHandlerFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.HttpAuthHandlerFlutterApi(binaryMessenger);
    }
}
