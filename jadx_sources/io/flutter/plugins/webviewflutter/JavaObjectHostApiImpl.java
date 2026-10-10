package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public class JavaObjectHostApiImpl implements GeneratedAndroidWebView.JavaObjectHostApi {
    private final InstanceManager instanceManager;

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi
    public void dispose(@NonNull Long l11) {
        Object instanceManager = this.instanceManager.getInstance(l11.longValue());
        if (instanceManager instanceof WebViewHostApiImpl.WebViewPlatformView) {
            ((WebViewHostApiImpl.WebViewPlatformView) instanceManager).destroy();
        }
        this.instanceManager.remove(l11.longValue());
    }

    public JavaObjectHostApiImpl(@NonNull InstanceManager instanceManager) {
        this.instanceManager = instanceManager;
    }
}
