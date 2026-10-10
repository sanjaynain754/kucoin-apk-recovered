package com.kubi.quotefacade.chance;

import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.chance.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceSiteConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/ChanceSiteConfig;", "", "<init>", "()V", "isShowTradeChance", "", "isShowSentimentOverview", "isShowChanceTab", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceSiteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChanceSiteConfig f41642a = new ChanceSiteConfig();

    /* JADX INFO: renamed from: b */
    public final boolean m51041b() {
        return C24129b.m58030b(SiteVisibleConfigKey.SentimentOverview);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51042c() {
        return C24129b.m58030b(SiteVisibleConfigKey.TradeSetups);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51040a() {
        if (!m51041b() && !m51042c()) {
            return false;
        }
        return true;
    }
}
