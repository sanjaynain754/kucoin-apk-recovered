package se0;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: renamed from: se0.e */
/* JADX INFO: compiled from: ConnectivityPlugin.java */
/* JADX INFO: loaded from: classes23.dex */
public class C44400e implements FlutterPlugin {

    /* JADX INFO: renamed from: b */
    public MethodChannel f98069b;

    /* JADX INFO: renamed from: c */
    public EventChannel f98070c;

    /* JADX INFO: renamed from: d */
    public ConnectivityBroadcastReceiver f98071d;

    /* JADX INFO: renamed from: a */
    public final void m97930a(BinaryMessenger binaryMessenger, Context context) {
        this.f98069b = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f98070c = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        C44396a c44396a = new C44396a((ConnectivityManager) context.getSystemService("connectivity"));
        C44399d c44399d = new C44399d(c44396a);
        this.f98071d = new ConnectivityBroadcastReceiver(context, c44396a);
        this.f98069b.setMethodCallHandler(c44399d);
        this.f98070c.setStreamHandler(this.f98071d);
    }

    /* JADX INFO: renamed from: b */
    public final void m97931b() {
        this.f98069b.setMethodCallHandler(null);
        this.f98070c.setStreamHandler(null);
        this.f98071d.onCancel(null);
        this.f98069b = null;
        this.f98070c = null;
        this.f98071d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m97930a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m97931b();
    }
}
