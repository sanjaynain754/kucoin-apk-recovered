package com.kubi.log.core;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.log.core.a */
/* JADX INFO: compiled from: LogConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/log/core/a;", "", "<init>", "()V", "Lcom/kubi/log/core/LogConfig;", "logConfig", "", "b", "(Lcom/kubi/log/core/LogConfig;)V", "Lcom/kubi/log/core/LogConfig;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/log/core/LogConfig;", "setLogConfig", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C17473a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C17473a f32591a = new C17473a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static LogConfig logConfig = new LogConfig.C17472a().m37841a();

    /* JADX INFO: renamed from: com.kubi.log.core.a$a */
    /* JADX INFO: compiled from: LogConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/log/core/a$a;", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "b", "()Ljava/util/Map;", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        String mo37854a();

        @NotNull
        /* JADX INFO: renamed from: b */
        Map<String, String> mo37855b();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LogConfig m37856a() {
        return logConfig;
    }

    /* JADX INFO: renamed from: b */
    public final void m37857b(@NotNull LogConfig logConfig2) {
        Intrinsics.checkNotNullParameter(logConfig2, "logConfig");
        if (TextUtils.isEmpty(logConfig2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String())) {
            throw new IllegalArgumentException("appId is null");
        }
        logConfig = logConfig2;
    }
}
