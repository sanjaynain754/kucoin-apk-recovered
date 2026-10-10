package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public class JavaScriptChannelHostApiImpl implements GeneratedAndroidWebView.JavaScriptChannelHostApi {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final JavaScriptChannelCreator javaScriptChannelCreator;
    private Handler platformThreadHandler;

    public static class JavaScriptChannelCreator {
        @NonNull
        public JavaScriptChannel createJavaScriptChannel(@NonNull JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, @NonNull String str, @NonNull Handler handler) {
            return new JavaScriptChannel(javaScriptChannelFlutterApiImpl, str, handler);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi
    public void create(@NonNull Long l11, @NonNull String str) {
        this.instanceManager.addDartCreatedInstance(this.javaScriptChannelCreator.createJavaScriptChannel(this.flutterApi, str, this.platformThreadHandler), l11.longValue());
    }

    public void setPlatformThreadHandler(@NonNull Handler handler) {
        this.platformThreadHandler = handler;
    }

    public JavaScriptChannelHostApiImpl(@NonNull InstanceManager instanceManager, @NonNull JavaScriptChannelCreator javaScriptChannelCreator, @NonNull JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, @NonNull Handler handler) {
        this.instanceManager = instanceManager;
        this.javaScriptChannelCreator = javaScriptChannelCreator;
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.platformThreadHandler = handler;
    }
}
