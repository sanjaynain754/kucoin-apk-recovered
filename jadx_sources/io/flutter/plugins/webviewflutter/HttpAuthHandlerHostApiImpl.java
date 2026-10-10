package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class HttpAuthHandlerHostApiImpl implements GeneratedAndroidWebView.HttpAuthHandlerHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    private HttpAuthHandler getHttpAuthHandlerInstance(@NonNull Long l11) {
        HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(httpAuthHandler);
        return httpAuthHandler;
    }

    public HttpAuthHandlerHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void cancel(@NonNull Long l11) {
        getHttpAuthHandlerInstance(l11).cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void proceed(@NonNull Long l11, @NonNull String str, @NonNull String str2) {
        getHttpAuthHandlerInstance(l11).proceed(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    @NonNull
    public Boolean useHttpAuthUsernamePassword(@NonNull Long l11) {
        return Boolean.valueOf(getHttpAuthHandlerInstance(l11).useHttpAuthUsernamePassword());
    }
}
