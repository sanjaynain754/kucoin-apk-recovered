package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkApi21.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(21)
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0001¨\u0006\r"}, m90084d2 = {"getNetworkCapabilitiesCompat", "Landroid/net/NetworkCapabilities;", "Landroid/net/ConnectivityManager;", "network", "Landroid/net/Network;", "hasCapabilityCompat", "", "capability", "", "unregisterNetworkCallbackCompat", "", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
@JvmName(name = "NetworkApi21")
public final class NetworkApi21 {
    @DoNotInline
    @Nullable
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @DoNotInline
    public static final boolean hasCapabilityCompat(@NotNull NetworkCapabilities networkCapabilities, int i11) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i11);
    }

    @DoNotInline
    public static final void unregisterNetworkCallbackCompat(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
