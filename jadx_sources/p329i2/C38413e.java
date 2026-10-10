package p329i2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import p523p2.C43363j;

/* JADX INFO: renamed from: i2.e */
/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C38413e implements InterfaceC38411c {

    /* JADX INFO: renamed from: b */
    public final Context f86203b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38411c.a f86204c;

    /* JADX INFO: renamed from: d */
    public boolean f86205d;

    /* JADX INFO: renamed from: e */
    public boolean f86206e;

    /* JADX INFO: renamed from: f */
    public final BroadcastReceiver f86207f = new a();

    /* JADX INFO: renamed from: i2.e$a */
    /* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            C38413e c38413e = C38413e.this;
            boolean z11 = c38413e.f86205d;
            c38413e.f86205d = c38413e.m86608b(context);
            if (z11 != C38413e.this.f86205d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C38413e.this.f86205d);
                }
                C38413e c38413e2 = C38413e.this;
                c38413e2.f86204c.mo6642a(c38413e2.f86205d);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public boolean m86608b(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C43363j.m95506d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e11) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e11);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m86609d() {
        if (this.f86206e) {
            return;
        }
        this.f86205d = m86608b(this.f86203b);
        try {
            this.f86203b.registerReceiver(this.f86207f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f86206e = true;
        } catch (SecurityException e11) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e11);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m86610j() {
        if (this.f86206e) {
            this.f86203b.unregisterReceiver(this.f86207f);
            this.f86206e = false;
        }
    }

    public C38413e(@NonNull Context context, @NonNull InterfaceC38411c.a aVar) {
        this.f86203b = context.getApplicationContext();
        this.f86204c = aVar;
    }

    @Override // p329i2.InterfaceC38421m
    public void onStart() {
        m86609d();
    }

    @Override // p329i2.InterfaceC38421m
    public void onStop() {
        m86610j();
    }

    @Override // p329i2.InterfaceC38421m
    public void onDestroy() {
    }
}
