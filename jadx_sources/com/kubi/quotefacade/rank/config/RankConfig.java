package com.kubi.quotefacade.rank.config;

import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p321hv.InterfaceC38358h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.config.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"J\u0006\u0010#\u001a\u00020$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001fj\b\u0012\u0004\u0012\u00020\u000b` X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/config/RankConfig;", "", "<init>", "()V", "coinItemConfig", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "getCoinItemConfig", "()Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "spotItemConfig", "futuresItemConfig", "favTabConfig", "Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "getFavTabConfig", "()Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "favTabConfig$delegate", "Lkotlin/Lazy;", "hotTabConfig", "getHotTabConfig", "hotTabConfig$delegate", "alphaTabConfig", "getAlphaTabConfig", "alphaTabConfig$delegate", "newTabConfig", "getNewTabConfig", "newTabConfig$delegate", "rankGainTabConfig", "getRankGainTabConfig", "loseTabConfig", "volTabConfig", "marketTabConfig", "curTabs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTabs", "", "reset", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankConfig.kt\ncom/kubi/quotefacade/rank/config/RankConfig\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,239:1\n33#2:240\n17#2,2:241\n34#2,3:243\n33#2:246\n17#2,2:247\n34#2,3:249\n*S KotlinDebug\n*F\n+ 1 RankConfig.kt\ncom/kubi/quotefacade/rank/config/RankConfig\n*L\n154#1:240\n154#1:241,2\n154#1:243,3\n164#1:246\n164#1:247,2\n164#1:249,3\n*E\n"})
public final class RankConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RankConfig f42417a = new RankConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final RankSubTabItemConfig f42418b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final RankSubTabItemConfig f42419c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final RankSubTabItemConfig f42420d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f42421e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f42422f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f42423g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f42424h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final RankTabConfig f42425i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final RankTabConfig f42426j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final RankTabConfig f42427k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final RankTabConfig f42428l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final ArrayList<RankTabConfig> f42429m;

    static {
        RankSubTabItemConfig rankSubTabItemConfig = new RankSubTabItemConfig(R$string.coin, "COIN");
        f42418b = rankSubTabItemConfig;
        RankSubTabItemConfig rankSubTabItemConfig2 = new RankSubTabItemConfig(R$string.coin_spot, "SPOT");
        f42419c = rankSubTabItemConfig2;
        RankSubTabItemConfig rankSubTabItemConfig3 = new RankSubTabItemConfig(R$string.futures, "CONTRACT");
        f42420d = rankSubTabItemConfig3;
        f42421e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.config.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankConfig.m52726f();
            }
        });
        f42422f = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.config.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankConfig.m52727n();
            }
        });
        f42423g = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.config.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankConfig.m52725e();
            }
        });
        f42424h = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.config.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankConfig.m52728o();
            }
        });
        RankTabItemConfig rankTabItemConfig = new RankTabItemConfig(R$string.rank_gain_label, "PRICE_CHANGE_24H_UP_RATE");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(rankSubTabItemConfig);
        SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.Spot;
        if (C24129b.m58030b(siteVisibleConfigKey)) {
            listCreateListBuilder.add(rankSubTabItemConfig2);
        }
        QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
        if (quoteConfigHelper.m51927g()) {
            listCreateListBuilder.add(rankSubTabItemConfig3);
        }
        f42425i = new RankTabConfig(rankTabItemConfig, CollectionsKt.build(listCreateListBuilder), false, 4, null);
        RankTabItemConfig rankTabItemConfig2 = new RankTabItemConfig(R$string.rank_lose_label, "PRICE_CHANGE_24H_DOWN_RATE");
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        listCreateListBuilder2.add(rankSubTabItemConfig);
        if (C24129b.m58030b(siteVisibleConfigKey)) {
            listCreateListBuilder2.add(rankSubTabItemConfig2);
        }
        if (quoteConfigHelper.m51927g()) {
            listCreateListBuilder2.add(rankSubTabItemConfig3);
        }
        f42426j = new RankTabConfig(rankTabItemConfig2, CollectionsKt.build(listCreateListBuilder2), false, 4, null);
        RankTabItemConfig rankTabItemConfig3 = new RankTabItemConfig(R$string.rank_vol_label, "VOLUME_CHANGE_24H_UP_RATE");
        List listCreateListBuilder3 = CollectionsKt.createListBuilder();
        listCreateListBuilder3.add(rankSubTabItemConfig);
        if (C24129b.m58030b(siteVisibleConfigKey)) {
            listCreateListBuilder3.add(rankSubTabItemConfig2);
        }
        if (quoteConfigHelper.m51927g()) {
            listCreateListBuilder3.add(rankSubTabItemConfig3);
        }
        f42427k = new RankTabConfig(rankTabItemConfig3, CollectionsKt.build(listCreateListBuilder3), false, 4, null);
        f42428l = new RankTabConfig(new RankTabItemConfig(R$string.rank_hot_label_marketcap, "MARKET_CAP"), CollectionsKt.listOf(rankSubTabItemConfig), false, 4, null);
        f42429m = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e */
    public static final RankTabConfig m52725e() {
        return new RankTabConfig(new RankTabItemConfig(R$string.market_alpha, "rank_type_alpha"), null, false, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public static final RankTabConfig m52726f() {
        return new RankTabConfig(new RankTabItemConfig(R$string.favorites, "rank_type_fav"), null, false, 2, null);
    }

    /* JADX INFO: renamed from: n */
    public static final RankTabConfig m52727n() {
        RankTabItemConfig rankTabItemConfig = new RankTabItemConfig(R$string.rank_hot_label_market, "SEARCH_HOT");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(f42418b);
        if (QuoteConfigHelper.f41987a.m51927g()) {
            listCreateListBuilder.add(f42420d);
        }
        return new RankTabConfig(rankTabItemConfig, CollectionsKt.build(listCreateListBuilder), false, 4, null);
    }

    /* JADX INFO: renamed from: o */
    public static final RankTabConfig m52728o() {
        RankTabItemConfig rankTabItemConfig = new RankTabItemConfig(R$string.rank_new_label_market, "NEW_CURRENCY_V2");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(f42418b);
        if (QuoteConfigHelper.f41987a.m51927g()) {
            listCreateListBuilder.add(f42420d);
        }
        return new RankTabConfig(rankTabItemConfig, CollectionsKt.build(listCreateListBuilder), false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final RankTabConfig m52729g() {
        return (RankTabConfig) f42423g.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final RankSubTabItemConfig m52730h() {
        return f42418b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final RankTabConfig m52731i() {
        return (RankTabConfig) f42421e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final RankTabConfig m52732j() {
        return (RankTabConfig) f42422f.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final RankTabConfig m52733k() {
        return (RankTabConfig) f42424h.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RankTabConfig m52734l() {
        return f42425i;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<RankTabConfig> m52735m() {
        ArrayList<RankTabConfig> arrayList = f42429m;
        if (arrayList.isEmpty()) {
            QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
            if (quoteConfigHelper.m51930j() && quoteConfigHelper.m51928h()) {
                arrayList.add(m52731i());
            }
            Router router = Router.f46192a;
            SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
            Object objM56186h = router.m56186h(InterfaceC38358h.class, siteInfoManager.m58109c());
            if ((objM56186h != null ? ((InterfaceC38358h) objM56186h).m86554b() : true) && C24129b.m58030b(SiteVisibleConfigKey.Hot)) {
                arrayList.add(f42417a.m52732j());
            }
            if (quoteConfigHelper.m51937q()) {
                arrayList.add(m52729g());
            }
            Object objM56186h2 = router.m56186h(InterfaceC38358h.class, siteInfoManager.m58109c());
            if ((objM56186h2 != null ? ((InterfaceC38358h) objM56186h2).m86553a() : true) && C24129b.m58030b(SiteVisibleConfigKey.NewBoard)) {
                arrayList.add(f42417a.m52733k());
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.Gainers)) {
                arrayList.add(f42425i);
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.Losers)) {
                arrayList.add(f42426j);
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.VolumeBoard)) {
                arrayList.add(f42427k);
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.MarketCap)) {
                arrayList.add(f42428l);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m52736p() {
        f42429m.clear();
    }
}
