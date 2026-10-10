package com.kubi.agora;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.agora.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ScreenShareConfig.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/agora/ScreenShareConfig;", "", "<init>", "()V", "CONFIG_KEY", "", "config", "Lcom/kubi/agora/ScreenShareConfigData;", "getConfig", "()Lcom/kubi/agora/ScreenShareConfigData;", "config$delegate", "Lkotlin/Lazy;", "getFps", "", "getJpegQuality", "getFrameIntervalMs", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenShareConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenShareConfig.kt\ncom/kubi/agora/ScreenShareConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,33:1\n35#2,4:34\n39#2:40\n44#3,2:38\n*S KotlinDebug\n*F\n+ 1 ScreenShareConfig.kt\ncom/kubi/agora/ScreenShareConfig\n*L\n19#1:34,4\n19#1:40\n19#1:38,2\n*E\n"})
public final class ScreenShareConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ScreenShareConfig f15335a = new ScreenShareConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f15336b = LazyKt.lazy(new Function0() { // from class: com.kubi.agora.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScreenShareConfig.m14954b();
        }
    });

    /* JADX INFO: renamed from: com.kubi.agora.v$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<ScreenShareConfigData> {
    }

    /* JADX INFO: renamed from: b */
    public static final ScreenShareConfigData m14954b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("help_center_screen_share_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        ScreenShareConfigData screenShareConfigData = (ScreenShareConfigData) objM20457a;
        return screenShareConfigData == null ? new ScreenShareConfigData(0, 0, 3, null) : screenShareConfigData;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ScreenShareConfigData m14955c() {
        return (ScreenShareConfigData) f15336b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m14956d() {
        return m14955c().getFps();
    }

    /* JADX INFO: renamed from: e */
    public final long m14957e() {
        return 1000 / ((long) m14956d());
    }

    /* JADX INFO: renamed from: f */
    public final int m14958f() {
        return m14955c().getJpegQuality();
    }
}
