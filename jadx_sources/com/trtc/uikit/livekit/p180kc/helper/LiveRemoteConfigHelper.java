package com.trtc.uikit.livekit.p180kc.helper;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiveRemoteConfigHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/helper/LiveRemoteConfigHelper;", "", "<init>", "()V", "isPiPEnabled", "", "isLiveRnFlowEnabled", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveRemoteConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRemoteConfigHelper.kt\ncom/trtc/uikit/livekit/kc/helper/LiveRemoteConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,25:1\n35#2,4:26\n39#2:32\n35#2,4:33\n39#2:39\n44#3,2:30\n44#3,2:37\n*S KotlinDebug\n*F\n+ 1 LiveRemoteConfigHelper.kt\ncom/trtc/uikit/livekit/kc/helper/LiveRemoteConfigHelper\n*L\n11#1:26,4\n11#1:32\n13#1:33,4\n13#1:39\n11#1:30,2\n13#1:37,2\n*E\n"})
public final class LiveRemoteConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiveRemoteConfigHelper f79162a = new LiveRemoteConfigHelper();

    /* JADX INFO: renamed from: b */
    public static final boolean f79163b;

    /* JADX INFO: renamed from: c */
    public static final boolean f79164c;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.c$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    static {
        Object objM20457a;
        Object objM20457a2 = null;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("live_pip_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        f79163b = C27025c.m66567e((Boolean) objM20457a, false);
        try {
            RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
            Type type2 = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
            objM20457a2 = RemoteConfig.m20457a("platform_live_rn_flow", type2);
        } catch (Throwable th3) {
            C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
        }
        f79164c = C27025c.m66567e((Boolean) objM20457a2, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81519a() {
        return f79164c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81520b() {
        return f79163b;
    }
}
