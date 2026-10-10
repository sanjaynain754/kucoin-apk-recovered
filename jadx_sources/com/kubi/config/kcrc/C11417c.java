package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.Config;
import com.kubi.config.core.IRemoteConfig;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.config.kcrc.c */
/* JADX INFO: compiled from: KCRemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000e0\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/config/kcrc/c;", "Lcom/kubi/config/core/IRemoteConfig;", "<init>", "()V", "Lcom/kubi/config/Config;", "config", "", "b", "(Lcom/kubi/config/Config;)V", "", "name", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "c", "()Lio/reactivex/Observable;", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/PublishSubject;", "configSubject", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11417c implements IRemoteConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PublishSubject<Boolean> configSubject;

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m20555a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return KCRemoteConfigFetcher.f19652a.m20529I(name);
    }

    /* JADX INFO: renamed from: b */
    public void m20556b(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        KCRemoteConfigFetcher.f19652a.m20531K(config, this.configSubject);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public Observable<Boolean> m20557c() {
        return this.configSubject;
    }

    public C11417c() {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Boolean>()");
        this.configSubject = publishSubjectCreate;
    }
}
