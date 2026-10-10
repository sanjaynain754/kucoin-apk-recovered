package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.MainThread;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.util.Constants;
import kotlin.C4447d;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p781y0.C46358a;
import p781y0.C46360c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0002\t\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcoil/network/NetworkObserver;", "", "", "shutdown", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "isOnline", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface NetworkObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5819a;

    /* JADX INFO: compiled from: NetworkObserver.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcoil/network/NetworkObserver$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", Constants.ENABLE_DISABLE, "Lcoil/network/NetworkObserver$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lb1/g;", "logger", "Lcoil/network/NetworkObserver;", "invoke", "(Landroid/content/Context;ZLcoil/network/NetworkObserver$a;Lb1/g;)Lcoil/network/NetworkObserver;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5819a = new Companion();

        @NotNull
        public final NetworkObserver invoke(@NotNull Context context, boolean isEnabled, @NotNull InterfaceC5048a listener, @Nullable InterfaceC4450g logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!isEnabled) {
                return C46358a.f103946b;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                if (logger != null && logger.getLevel() <= 5) {
                    logger.m4240a("NetworkObserver", 5, "Unable to register network observer.", null);
                }
                return C46358a.f103946b;
            }
            try {
                return new C46360c(connectivityManager, listener);
            } catch (Exception e11) {
                if (logger != null) {
                    C4447d.m4236a(logger, "NetworkObserver", new RuntimeException("Failed to register network observer.", e11));
                }
                return C46358a.f103946b;
            }
        }
    }

    /* JADX INFO: renamed from: coil.network.NetworkObserver$a */
    /* JADX INFO: compiled from: NetworkObserver.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcoil/network/NetworkObserver$a;", "", "", "isOnline", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public interface InterfaceC5048a {
        @MainThread
        /* JADX INFO: renamed from: a */
        void mo5501a(boolean isOnline);
    }

    /* JADX INFO: renamed from: a */
    boolean mo5500a();

    void shutdown();
}
