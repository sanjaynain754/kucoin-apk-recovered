package p781y0;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.network.NetworkObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(21)
@Metadata(m90083d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0006*\u0001\u0016\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Ly0/c;", "Lcoil/network/NetworkObserver;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lcoil/network/NetworkObserver$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/net/ConnectivityManager;Lcoil/network/NetworkObserver$a;)V", "", "shutdown", "()V", "Landroid/net/Network;", "network", "", "isOnline", "d", "(Landroid/net/Network;Z)V", "c", "(Landroid/net/Network;)Z", "b", "Landroid/net/ConnectivityManager;", "Lcoil/network/NetworkObserver$a;", "y0/c$a", "Ly0/c$a;", "networkCallback", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
@SuppressLint({"MissingPermission"})
public final class C46360c implements NetworkObserver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NetworkObserver.InterfaceC5048a listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final a networkCallback;

    /* JADX INFO: renamed from: y0.c$a */
    /* JADX INFO: compiled from: NetworkObserver.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m90084d2 = {"y0/c$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C46360c.this.m102234d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C46360c.this.m102234d(network, false);
        }
    }

    public C46360c(@NotNull ConnectivityManager connectivityManager, @NotNull NetworkObserver.InterfaceC5048a listener) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.connectivityManager = connectivityManager;
        this.listener = listener;
        a aVar = new a();
        this.networkCallback = aVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar);
    }

    @Override // coil.network.NetworkObserver
    /* JADX INFO: renamed from: a */
    public boolean mo5500a() {
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        for (Network it : allNetworks) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (m102233c(it)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m102233c(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: renamed from: d */
    public final void m102234d(Network network, boolean isOnline) {
        boolean zM102233c;
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        boolean z11 = false;
        for (Network it : allNetworks) {
            if (Intrinsics.areEqual(it, network)) {
                zM102233c = isOnline;
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                zM102233c = m102233c(it);
            }
            if (zM102233c) {
                z11 = true;
                break;
            }
        }
        this.listener.mo5501a(z11);
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }
}
