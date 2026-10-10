package io.flutter.plugins.webviewflutter;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: loaded from: classes60.dex */
public class ViewFlutterApiImpl {
    private GeneratedAndroidWebView.ViewFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public void create(@NonNull View view, @NonNull GeneratedAndroidWebView.ViewFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(view)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(view)), reply);
    }

    @VisibleForTesting
    public void setApi(@NonNull GeneratedAndroidWebView.ViewFlutterApi viewFlutterApi) {
        this.api = viewFlutterApi;
    }

    public ViewFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.ViewFlutterApi(binaryMessenger);
    }
}
