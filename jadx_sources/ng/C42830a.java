package ng;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;

/* JADX INFO: renamed from: ng.a */
/* JADX INFO: compiled from: SystemBootTimePlugin.java */
/* JADX INFO: loaded from: classes.dex */
public class C42830a implements FlutterPlugin, C42832c.a {
    @Override // ng.C42832c.a
    /* JADX INFO: renamed from: b */
    public Long mo93923b() {
        return Long.valueOf(SystemClock.elapsedRealtime() / 1000);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C42832c.a.m93926a(flutterPluginBinding.getBinaryMessenger(), this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C42832c.a.m93926a(flutterPluginBinding.getBinaryMessenger(), null);
    }
}
