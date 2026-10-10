package dev.fluttercommunity.plus.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.List;
import se0.C44396a;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectivityBroadcastReceiver extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: b */
    public final Context f79466b;

    /* JADX INFO: renamed from: c */
    public final C44396a f79467c;

    /* JADX INFO: renamed from: d */
    public EventChannel.EventSink f79468d;

    /* JADX INFO: renamed from: e */
    public final Handler f79469e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public ConnectivityManager.NetworkCallback f79470f;

    /* JADX INFO: renamed from: dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver$a */
    public class C36668a extends ConnectivityManager.NetworkCallback {
        public C36668a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            connectivityBroadcastReceiver.m82041i(connectivityBroadcastReceiver.f79467c.m97926a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            connectivityBroadcastReceiver.m82041i(connectivityBroadcastReceiver.f79467c.m97927b(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            ConnectivityBroadcastReceiver.this.m82040h();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m82038f() {
        this.f79468d.success(this.f79467c.m97929d());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m82039g(List list) {
        this.f79468d.success(list);
    }

    /* JADX INFO: renamed from: h */
    public final void m82040h() {
        this.f79469e.postDelayed(new Runnable() { // from class: se0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f98067b.m82038f();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: i */
    public final void m82041i(final List<String> list) {
        this.f79469e.post(new Runnable() { // from class: se0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f98065b.m82039g(list);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (this.f79470f != null) {
            this.f79467c.m97928c().unregisterNetworkCallback(this.f79470f);
            this.f79470f = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f79468d = eventSink;
        this.f79470f = new C36668a();
        this.f79467c.m97928c().registerDefaultNetworkCallback(this.f79470f);
        m82041i(this.f79467c.m97929d());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f79468d;
        if (eventSink != null) {
            eventSink.success(this.f79467c.m97929d());
        }
    }

    public ConnectivityBroadcastReceiver(Context context, C44396a c44396a) {
        this.f79466b = context;
        this.f79467c = c44396a;
    }
}
