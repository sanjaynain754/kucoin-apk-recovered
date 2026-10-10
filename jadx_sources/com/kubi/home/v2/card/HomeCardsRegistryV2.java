package com.kubi.home.v2.card;

import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.v2.WidgetsMapping;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.kubi.home.v2.card.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeCardsRegistryV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/v2/card/HomeCardsRegistryV2;", "", "<init>", "()V", "registry", "", "", "Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "getRegistry", "()Ljava/util/Map;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeCardsRegistryV2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeCardsRegistryV2 f26511a = new HomeCardsRegistryV2();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, Map<String, CardStyle>> f26512b;

    static {
        String code = HomeWidgetCode.Search.getCode();
        WidgetsMapping widgetsMapping = WidgetsMapping.f26617a;
        f26512b = MapsKt.mapOf(TuplesKt.m90091to(code, MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31016m0(), 1)))), TuplesKt.m90091to(HomeWidgetCode.NewUser.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31012i0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.Learn.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31010g0(), 1)))), TuplesKt.m90091to(HomeWidgetCode.UserStatus.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31017n0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.Menu.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31011h0(), 1)))), TuplesKt.m90091to(HomeWidgetCode.Banner.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m30992O(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m30993P(), 0)))), TuplesKt.m90091to(HomeWidgetCode.Gembox.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31005b0(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m31015l0(), 1)), C15000n.m30813c(new CardStyle("style_3", widgetsMapping.m31013j0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.RankingList.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31013j0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.RecommendedPosition.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31015l0(), 1)))), TuplesKt.m90091to(HomeWidgetCode.ChangeDistribution.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m30997T(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m30998U(), 0)))), TuplesKt.m90091to(HomeWidgetCode.FearAndGreedIndex.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31002Y(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m31003Z(), 0)))), TuplesKt.m90091to(HomeWidgetCode.HotSections.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31007d0(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m31008e0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.RealTime.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31014k0(), 1)))), TuplesKt.m90091to(HomeWidgetCode.HomeFeed.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31006c0(), 0)))), TuplesKt.m90091to(HomeWidgetCode.CopyTrading.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m30999V(), 2)))), TuplesKt.m90091to(HomeWidgetCode.TradingRobot.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31000W(), 2)))), TuplesKt.m90091to(HomeWidgetCode.Calendar.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m30995R(), 2)), C15000n.m30813c(new CardStyle("style_2", widgetsMapping.m30996S(), 1)))), TuplesKt.m90091to(HomeWidgetCode.KuMining.getCode(), MapsKt.mapOf(C15000n.m30813c(new CardStyle("style_1", widgetsMapping.m31009f0(), 0)))));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Map<String, CardStyle>> m30810a() {
        return f26512b;
    }
}
