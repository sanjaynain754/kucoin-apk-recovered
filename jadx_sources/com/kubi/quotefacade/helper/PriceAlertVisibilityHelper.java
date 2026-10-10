package com.kubi.quotefacade.helper;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.t1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PriceAlertVisibilityHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/PriceAlertVisibilityHelper;", "", "<init>", "()V", "REMOTE_CONFIG_MARKET_ALERT_RN_ENABLE_V2", "", "isSitePriceAlertEnabled", "", "isFuturesRemoteEnabled", "isFeatureEnabled", "isFutures", "isListIconVisible", "isAlarm", "isTrade", "isBubbleVisible", "isPreview", "isKlineIconVisible", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPriceAlertVisibilityHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceAlertVisibilityHelper.kt\ncom/kubi/quotefacade/helper/PriceAlertVisibilityHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,42:1\n35#2,4:43\n39#2:49\n44#3,2:47\n*S KotlinDebug\n*F\n+ 1 PriceAlertVisibilityHelper.kt\ncom/kubi/quotefacade/helper/PriceAlertVisibilityHelper\n*L\n18#1:43,4\n18#1:49\n18#1:47,2\n*E\n"})
public final class PriceAlertVisibilityHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PriceAlertVisibilityHelper f42102a = new PriceAlertVisibilityHelper();

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.t1$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52114a(boolean z11, boolean z12) {
        if (z12) {
            return false;
        }
        return m52115b(z11);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m52116c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("market_alert_rn_enable_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52117d(boolean z11, boolean z12, boolean z13) {
        return z12 && z13 && m52115b(z11);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52118e() {
        return C24129b.m58030b(SiteVisibleConfigKey.PriceAlert);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m52115b(boolean z11) {
        if (!m52118e()) {
            return false;
        }
        if (z11) {
            return m52116c();
        }
        return true;
    }
}
