package com.tencent.mmkv;

import android.os.Build;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes23.dex */
public class MMKVPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private static boolean isLibraryLoaded;
    private MethodChannel channel;

    private int getSdkVersion() {
        return Integer.parseInt(Build.VERSION.SDK);
    }

    private static void loadLibrary() {
        if (isLibraryLoaded) {
            return;
        }
        System.loadLibrary("mmkv");
        isLibraryLoaded = true;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        if (methodCall.method.equals("initializeMMKV")) {
            result.success(MMKV.initialize((String) methodCall.argument("rootDir"), MMKVLogLevel.values()[((Integer) methodCall.argument("logLevel")).intValue()]));
        } else if (methodCall.method.equals("getSdkVersion")) {
            result.success(Integer.valueOf(getSdkVersion()));
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        loadLibrary();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "mmkv");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }
}
