package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.RealImageLoader;
import coil.network.NetworkObserver;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SystemCallbacks.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR.\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00030\u00030\u001b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m90084d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$a;", "Lcoil/RealImageLoader;", "imageLoader", "Landroid/content/Context;", "context", "", "isNetworkObserverEnabled", "<init>", "(Lcoil/RealImageLoader;Landroid/content/Context;Z)V", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", FirebaseAnalytics.Param.LEVEL, "onTrimMemory", "(I)V", "onLowMemory", "()V", "isOnline", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)V", "b", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "c", "Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release", "()Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release$annotations", "Lcoil/network/NetworkObserver;", "d", "Lcoil/network/NetworkObserver;", "networkObserver", "e", "Z", "_isOnline", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isShutdown", "g", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.InterfaceC5048a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<RealImageLoader> imageLoader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final NetworkObserver networkObserver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile boolean _isOnline;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean _isShutdown;

    public SystemCallbacks(@NotNull RealImageLoader imageLoader, @NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.imageLoader = new WeakReference<>(imageLoader);
        NetworkObserver.Companion companion = NetworkObserver.INSTANCE;
        imageLoader.m5447b();
        NetworkObserver networkObserverInvoke = companion.invoke(context, z11, this, null);
        this.networkObserver = networkObserverInvoke;
        this._isOnline = networkObserverInvoke.mo5500a();
        this._isShutdown = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    @Override // coil.network.NetworkObserver.InterfaceC5048a
    /* JADX INFO: renamed from: a */
    public void mo5501a(boolean isOnline) {
        RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader == null) {
            m5510b();
        } else {
            this._isOnline = isOnline;
            realImageLoader.m5447b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5510b() {
        if (this._isShutdown.getAndSet(true)) {
            return;
        }
        this.context.unregisterComponentCallbacks(this);
        this.networkObserver.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.imageLoader.get() == null) {
            m5510b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        Unit unit;
        RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader == null) {
            unit = null;
        } else {
            realImageLoader.m5449d(level);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m5510b();
        }
    }
}
