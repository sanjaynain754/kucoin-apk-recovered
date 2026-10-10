package com.kubi.assets;

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

/* JADX INFO: renamed from: com.kubi.assets.z0 */
/* JADX INFO: compiled from: PnlCloudConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u001a\u0006\u0010\u0000\u001a\u00020\u0001\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u0014\u0010\f\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0005\"\u0014\u0010\u000e\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0014\u0010\u0010\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0005\"\u0014\u0010\u0012\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0005\"\u0014\u0010\u0014\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0005\"\u0014\u0010\u0016\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m90084d2 = {"isRnPnlopen", "", "RN_PNL_BASE_URL_NO_ROUTE", "", "getRN_PNL_BASE_URL_NO_ROUTE", "()Ljava/lang/String;", "RN_PNL_BASE_URL", "getRN_PNL_BASE_URL", "RN_PNL_SUB_ASSETS", "getRN_PNL_SUB_ASSETS", "RN_PNL_SUB_FUTURES", "getRN_PNL_SUB_FUTURES", "RN_PNL_SUB_SPOT", "getRN_PNL_SUB_SPOT", "RN_PNL_SUB_ISOLATED", "getRN_PNL_SUB_ISOLATED", "RN_PNL_SUB_CROSS", "getRN_PNL_SUB_CROSS", "RN_PNL_UTA_SUB_PATH", "getRN_PNL_UTA_SUB_PATH", "RN_PNL_UTA_SUB_SPOT_PATH", "getRN_PNL_UTA_SUB_SPOT_PATH", "RN_PNL_UTA_SUB_FUTURES_PATH", "getRN_PNL_UTA_SUB_FUTURES_PATH", "AssetsCenterApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPnlCloudConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PnlCloudConfig.kt\ncom/kubi/assets/PnlCloudConfigKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,56:1\n35#2,4:57\n39#2:63\n44#3,2:61\n*S KotlinDebug\n*F\n+ 1 PnlCloudConfig.kt\ncom/kubi/assets/PnlCloudConfigKt\n*L\n14#1:57,4\n14#1:63\n14#1:61,2\n*E\n"})
public final class C11351z0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f19201a = "krn/router?biz=pnl&entry=main&component=kucoin_pnl_rn";

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f19202b = "krn/router?biz=pnl&entry=main&component=kucoin_pnl_rn&route=";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f19203c = "AssetsPnlPage";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f19204d = "FuturesPnlPage";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f19205e = "SpotPnlPage";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f19206f = "MarginPnlPage%3FmarginType%3DISOLATED";

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String f19207g = "MarginPnlPage%3FmarginType%3DCROSS";

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String f19208h = "UnifiedAccountPnlPage%3Ftab%3Dassets";

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f19209i = "UnifiedAccountPnlPage%3Ftab%3Dspot";

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final String f19210j = "UnifiedAccountPnlPage%3Ftab%3Dfutures";

    /* JADX INFO: renamed from: com.kubi.assets.z0$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m20186a() {
        return f19202b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m20187b() {
        return f19201a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m20188c() {
        return f19203c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m20189d() {
        return f19207g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m20190e() {
        return f19204d;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m20191f() {
        return f19206f;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m20192g() {
        return f19205e;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m20193h() {
        return f19210j;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m20194i() {
        return f19208h;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m20195j() {
        return f19209i;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m20196k() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("trade_pnl_analyzer", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }
}
