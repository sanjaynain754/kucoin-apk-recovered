package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 21)
public class PermissionRequestHostApiImpl implements GeneratedAndroidWebView.PermissionRequestHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    private PermissionRequest getPermissionRequestInstance(@NonNull Long l11) {
        PermissionRequest permissionRequest = (PermissionRequest) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(permissionRequest);
        return permissionRequest;
    }

    public PermissionRequestHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void deny(@NonNull Long l11) {
        getPermissionRequestInstance(l11).deny();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void grant(@NonNull Long l11, @NonNull List<String> list) {
        getPermissionRequestInstance(l11).grant((String[]) list.toArray(new String[0]));
    }
}
