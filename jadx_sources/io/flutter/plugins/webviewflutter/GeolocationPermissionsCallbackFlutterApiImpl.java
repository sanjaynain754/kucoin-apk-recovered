package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: loaded from: classes60.dex */
public class GeolocationPermissionsCallbackFlutterApiImpl {
    private GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public void create(@NonNull GeolocationPermissions.Callback callback, @NonNull GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(callback)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(callback)), reply);
    }

    @VisibleForTesting
    public void setApi(@NonNull GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi geolocationPermissionsCallbackFlutterApi) {
        this.api = geolocationPermissionsCallbackFlutterApi;
    }

    public GeolocationPermissionsCallbackFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi(binaryMessenger);
    }
}
