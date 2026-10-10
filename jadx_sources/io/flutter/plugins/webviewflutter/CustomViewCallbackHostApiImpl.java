package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class CustomViewCallbackHostApiImpl implements GeneratedAndroidWebView.CustomViewCallbackHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    private WebChromeClient.CustomViewCallback getCustomViewCallbackInstance(@NonNull Long l11) {
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    public CustomViewCallbackHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi
    public void onCustomViewHidden(@NonNull Long l11) {
        getCustomViewCallbackInstance(l11).onCustomViewHidden();
    }
}
