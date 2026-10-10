package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class GeolocationPermissionsCallbackHostApiImpl implements GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    private GeolocationPermissions.Callback getGeolocationPermissionsCallbackInstance(@NonNull Long l11) {
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(callback);
        return callback;
    }

    public GeolocationPermissionsCallbackHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi
    public void invoke(@NonNull Long l11, @NonNull String str, @NonNull Boolean bool, @NonNull Boolean bool2) {
        getGeolocationPermissionsCallbackInstance(l11).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
