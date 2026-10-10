package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ad */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class ServiceConnectionC7809ad implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C7810ae f12091a;

    public /* synthetic */ ServiceConnectionC7809ad(C7810ae c7810ae, C7808ac c7808ac) {
        this.f12091a = c7810ae;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12091a.f12094c.m13326d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12091a.m13293c().post(new C7806aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f12091a.f12094c.m13326d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12091a.m13293c().post(new C7807ab(this));
    }
}
