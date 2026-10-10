package p799yj;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.host.core.C15180b;
import com.kubi.host.core.IHostMonitor;
import com.kubi.host.core.IRemoteConfig;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yj.b */
/* JADX INFO: compiled from: HostConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lyj/b;", "", "<init>", "()V", "Lyj/a;", "config", "", "c", "(Lyj/a;)V", "", "d", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "name", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/reactivex/Observable;", "e", "()Lio/reactivex/Observable;", "Lcom/kubi/host/core/b;", "Lcom/kubi/host/core/b;", "hostMonitor", "Lcom/kubi/host/core/IRemoteConfig;", "Lcom/kubi/host/core/IRemoteConfig;", "remoteConfig", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46510b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46510b f104278a = new C46510b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static C15180b hostMonitor = IHostMonitor.INSTANCE.getImplement();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static IRemoteConfig remoteConfig = IRemoteConfig.INSTANCE.getImplement();

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m102600d() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m102597a() {
        remoteConfig.m31378a();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m102598b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return remoteConfig.m31380c(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m102599c(@NotNull C46509a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        remoteConfig.m31381d(config);
        hostMonitor.m31399c(config);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Observable<Boolean> m102601e() {
        return remoteConfig.m31379b();
    }
}
