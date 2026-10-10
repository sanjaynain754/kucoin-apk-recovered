package se0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: se0.a */
/* JADX INFO: compiled from: Connectivity.java */
/* JADX INFO: loaded from: classes23.dex */
public class C44396a {

    /* JADX INFO: renamed from: a */
    public final ConnectivityManager f98064a;

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public List<String> m97926a(Network network) {
        return m97927b(this.f98064a.getNetworkCapabilities(network));
    }

    @NonNull
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: b */
    public List<String> m97927b(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public ConnectivityManager m97928c() {
        return this.f98064a;
    }

    /* JADX INFO: renamed from: d */
    public List<String> m97929d() {
        return m97926a(this.f98064a.getActiveNetwork());
    }

    public C44396a(ConnectivityManager connectivityManager) {
        this.f98064a = connectivityManager;
    }
}
