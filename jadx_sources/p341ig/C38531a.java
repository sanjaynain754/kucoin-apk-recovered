package p341ig;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ig.a */
/* JADX INFO: compiled from: ScreenshotCallbackPlugin.java */
/* JADX INFO: loaded from: classes.dex */
public class C38531a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: g */
    public static MethodChannel f86503g;

    /* JADX INFO: renamed from: b */
    public Context f86504b;

    /* JADX INFO: renamed from: c */
    public Handler f86505c;

    /* JADX INFO: renamed from: d */
    public C38532b f86506d;

    /* JADX INFO: renamed from: e */
    public String f86507e;

    /* JADX INFO: renamed from: f */
    public ActivityPluginBinding f86508f;

    /* JADX INFO: renamed from: ig.a$a */
    /* JADX INFO: compiled from: ScreenshotCallbackPlugin.java */
    /* JADX INFO: loaded from: classes13.dex */
    public class a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: ig.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScreenshotCallbackPlugin.java */
        public class RunnableC47009a implements Runnable {
            public RunnableC47009a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C38531a.f86503g != null) {
                    C38531a.f86503g.invokeMethod("onCallback", null);
                }
            }
        }

        public a() {
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(String str) {
            if (str.equals(C38531a.this.f86507e)) {
                return null;
            }
            C38531a.this.f86507e = str;
            C38531a.this.f86505c.post(new RunnableC47009a());
            return null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f86504b = null;
        MethodChannel methodChannel = f86503g;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            f86503g = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m87165e(Context context, BinaryMessenger binaryMessenger) {
        this.f86504b = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter/screenshot_callback");
        f86503g = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.f86508f = activityPluginBinding;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("initialize")) {
            this.f86505c = new Handler(Looper.getMainLooper());
            C38532b c38532b = new C38532b(this.f86504b, new a());
            this.f86506d = c38532b;
            c38532b.m87173g();
            result.success("initialize");
            return;
        }
        if (!methodCall.method.equals("dispose")) {
            if (methodCall.method.equals("checkPermission")) {
                result.success(Boolean.valueOf(ContextCompat.checkSelfPermission(this.f86508f.getActivity(), "android.permission.READ_EXTERNAL_STORAGE") == 0));
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        C38532b c38532b2 = this.f86506d;
        if (c38532b2 != null) {
            c38532b2.m87174h();
        }
        this.f86506d = null;
        this.f86507e = null;
        result.success("dispose");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m87165e(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
    }
}
