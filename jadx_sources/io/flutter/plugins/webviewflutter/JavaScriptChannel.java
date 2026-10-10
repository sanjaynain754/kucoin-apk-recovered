package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes60.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    final String javaScriptChannelName;
    private final Handler platformThreadHandler;

    @JavascriptInterface
    public void postMessage(@NonNull final String str) {
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.c3
            @Override // java.lang.Runnable
            public final void run() {
                JavaScriptChannel javaScriptChannel = this.f86884b;
                javaScriptChannel.flutterApi.postMessage(javaScriptChannel, str, new GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.b3
                    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply
                    public final void reply(Object obj) {
                        JavaScriptChannel.m87738b((Void) obj);
                    }
                });
            }
        };
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.platformThreadHandler.post(runnable);
        }
    }

    public JavaScriptChannel(@NonNull JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, @NonNull String str, @NonNull Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m87738b(Void r11) {
    }
}
