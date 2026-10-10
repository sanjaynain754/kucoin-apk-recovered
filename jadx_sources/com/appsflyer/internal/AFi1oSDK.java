package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(31)
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi31.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi31.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi31\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class AFi1oSDK extends AFi1qSDK {

    @NotNull
    private String getMonetizationNetwork;

    @Nullable
    private Network getRevenue;

    public static final class AFa1zSDK extends ConnectivityManager.NetworkCallback {
        public AFa1zSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1oSDK.this.getRevenue = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1oSDK.this.getRevenue = network;
            AFi1oSDK.this.getMonetizationNetwork = "NetworkLost";
        }
    }

    /* JADX INFO: renamed from: y_ */
    private static boolean m5986y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1oSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getMonetizationNetwork = "unknown";
        AFa1zSDK aFa1zSDK = new AFa1zSDK();
        try {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1zSDK);
            }
        } catch (Throwable th2) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th2, true, false, false, false, 96, null);
        }
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    @NotNull
    public final String AFAdRevenueData() {
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMonetizationNetwork() {
        Network network = this.getRevenue;
        if (network == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.getMonetizationNetwork, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.AFAdRevenueData;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return m5986y_(networkCapabilities);
        }
        return false;
    }
}
