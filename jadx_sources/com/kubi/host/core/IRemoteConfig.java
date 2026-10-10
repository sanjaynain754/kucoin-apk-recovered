package com.kubi.host.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p799yj.C46509a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IRemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/host/core/IRemoteConfig;", "", "Lyj/a;", "config", "", "d", "(Lyj/a;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;", "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface IRemoteConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f27116a;

    /* JADX INFO: compiled from: IRemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/host/core/IRemoteConfig$Companion;", "", "<init>", "()V", "Lcom/kubi/host/core/IRemoteConfig;", "b", "Lcom/kubi/host/core/IRemoteConfig;", "getImplement", "()Lcom/kubi/host/core/IRemoteConfig;", "implement", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27116a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final IRemoteConfig implement = new RemoteConfig();

        @NotNull
        public final IRemoteConfig getImplement() {
            return implement;
        }
    }

    /* JADX INFO: renamed from: a */
    void m31378a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<Boolean> m31379b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String m31380c(@NotNull String name);

    /* JADX INFO: renamed from: d */
    void m31381d(@NotNull C46509a config);
}
