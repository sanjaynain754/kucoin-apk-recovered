package se0;

import androidx.annotation.NonNull;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: renamed from: se0.d */
/* JADX INFO: compiled from: ConnectivityMethodChannelHandler.java */
/* JADX INFO: loaded from: classes23.dex */
public class C44399d implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b */
    public final C44396a f98068b;

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f98068b.m97929d());
        } else {
            result.notImplemented();
        }
    }

    public C44399d(C44396a c44396a) {
        this.f98068b = c44396a;
    }
}
