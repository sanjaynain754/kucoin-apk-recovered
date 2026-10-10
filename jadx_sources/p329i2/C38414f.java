package p329i2;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* JADX INFO: renamed from: i2.f */
/* JADX INFO: compiled from: DefaultConnectivityMonitorFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C38414f implements InterfaceC38412d {
    @Override // p329i2.InterfaceC38412d
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC38411c mo86607a(@NonNull Context context, @NonNull InterfaceC38411c.a aVar) {
        boolean z11 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z11 ? new C38413e(context, aVar) : new C38422n();
    }
}
