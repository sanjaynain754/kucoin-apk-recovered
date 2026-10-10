package com.kubi.quotefacade.favorites;

import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import p569qq.C43852m;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.a1 */
/* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"isAiRankingTabShow", "", "jumpAiRankingPage", "", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21938a1 {
    /* JADX INFO: renamed from: a */
    public static final boolean m51382a() {
        return C24129b.m58030b(SiteVisibleConfigKey.AiRanking) && IUserService.a.get().c();
    }

    /* JADX INFO: renamed from: b */
    public static final void m51383b() {
        Router.f46192a.m56184f("krn/router").m4038a("needLogin", Boolean.TRUE).m4038a(Constants.BIZ, "kia").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_kia_rn").m4038a("route", "KiaPage?businessIdentify=CURRENCY_SELECTION_RECOMMEND&preSpmId=" + C43852m.m96602n("B5MarketsFavorites", "KiaCryptorSelector", null, 4, null)).m4048k();
        C43852m.m96591c("B5MarketsFavorites", "KiaCryptorSelector", "1", null, 8, null);
    }
}
