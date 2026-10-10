package p814yz;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: yz.a */
/* JADX INFO: compiled from: NetworkRecoveryMonitor.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\b\u0010\u0018\u001a\u00020\u0006H\u0003J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "", "logTag", "", "onNetworkRecovered", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "lastNetworkConnected", "", "networkCallbackRegistered", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "networkRequest", "Landroid/net/NetworkRequest;", "networkCallback", "com/kubi/sdk/network/NetworkRecoveryMonitor$networkCallback$1", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor$networkCallback$1;", "onVmShow", "onVmHide", "onVmCleared", "registerNetworkCallback", "unregisterNetworkCallback", "onConnectivityChanged", "source", "network", "Landroid/net/Network;", "isNetworkConnected", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46614a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f104367a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Unit> f104368b;

    /* JADX INFO: renamed from: c */
    public boolean f104369c;

    /* JADX INFO: renamed from: d */
    public boolean f104370d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NetworkRequest f104371e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final a f104372f;

    /* JADX INFO: renamed from: yz.a$a */
    /* JADX INFO: compiled from: NetworkRecoveryMonitor.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/network/NetworkRecoveryMonitor$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C46614a.this.m102778d("onAvailable", network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            C46614a.this.m102778d("onCapabilitiesChanged", network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C46614a.this.m102778d("onLost", network);
        }
    }

    public C46614a(@NotNull String logTag, @NotNull Function0<Unit> onNetworkRecovered) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(onNetworkRecovered, "onNetworkRecovered");
        this.f104367a = logTag;
        this.f104368b = onNetworkRecovered;
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
        this.f104371e = networkRequestBuild;
        this.f104372f = new a();
    }

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager m102776b() {
        Object systemService = BaseApplication.INSTANCE.get().getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public final void m102782h() {
        Object objM103844constructorimpl;
        if (this.f104370d) {
            C44128b.m97266j(this.f104367a, "registerNetworkCallback: skip, already registered");
            return;
        }
        ConnectivityManager connectivityManagerM102776b = m102776b();
        if (connectivityManagerM102776b == null) {
            C44128b.m97266j(this.f104367a, "registerNetworkCallback: skip, ConnectivityManager null");
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            connectivityManagerM102776b.registerNetworkCallback(this.f104371e, this.f104372f);
            this.f104369c = m102777c();
            this.f104370d = true;
            C44128b.m97266j(this.f104367a, "registerNetworkCallback: ok, initialConnected=" + this.f104369c);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j(this.f104367a, "registerNetworkCallback failed: " + thM103847exceptionOrNullimpl);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m102783i() {
        Object objM103844constructorimpl;
        if (!this.f104370d) {
            C44128b.m97266j(this.f104367a, "unregisterNetworkCallback: skip, not registered");
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ConnectivityManager connectivityManagerM102776b = m102776b();
            if (connectivityManagerM102776b != null) {
                connectivityManagerM102776b.unregisterNetworkCallback(this.f104372f);
            }
            C44128b.m97266j(this.f104367a, "unregisterNetworkCallback: ok");
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j(this.f104367a, "unregisterNetworkCallback failed: " + thM103847exceptionOrNullimpl);
        }
        this.f104370d = false;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public final boolean m102777c() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManagerM102776b = m102776b();
        if (connectivityManagerM102776b == null || (activeNetwork = connectivityManagerM102776b.getActiveNetwork()) == null || (networkCapabilities = connectivityManagerM102776b.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m102778d(String str, Network network) {
        boolean z11;
        boolean zM102777c = m102777c();
        boolean z12 = this.f104369c;
        if (!z12 && zM102777c) {
            z11 = true;
        } else {
            z11 = false;
        }
        C44128b.m97266j(this.f104367a, "network event=" + str + " net=" + network + " wasConnected=" + z12 + " nowConnected=" + zM102777c + " recovered=" + z11);
        this.f104369c = zM102777c;
        if (z11) {
            this.f104368b.invoke();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m102779e() {
        m102783i();
    }

    /* JADX INFO: renamed from: f */
    public final void m102780f() {
        m102783i();
    }

    /* JADX INFO: renamed from: g */
    public final void m102781g() {
        m102782h();
    }
}
