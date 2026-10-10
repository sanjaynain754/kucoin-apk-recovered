package com.kubi.quotefacade.rank.config;

import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4392c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.config.g */
/* JADX INFO: compiled from: RankTopicConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a(\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002\u001a \u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\"7\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, m90084d2 = {"topicMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getTopicMap", "()Ljava/util/HashMap;", "topicMap$delegate", "Lkotlin/Lazy;", "getRankTopic", "rankType", "catalog", "from", "market", "getKey", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22446g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Lazy f42430a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.config.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C22446g.m52741e();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final String m52738b(String str, String str2, String str3) {
        return str + '-' + str2 + '-' + str3;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m52739c(@NotNull String rankType, @NotNull String catalog, @NotNull String from, @NotNull String market) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(market, "market");
        String str = m52740d().get(m52738b(rankType, catalog, from));
        if (str == null || !C4392c.m4018f(catalog)) {
            return str;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{market}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public static final HashMap<String, String> m52740d() {
        return (HashMap) f42430a.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final HashMap m52741e() {
        HashMap map = new HashMap();
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "COIN", "HOMEPAGE"), "/app-home/home-list:price_change_rate_24h_up_coin");
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "COIN", "DETAIL"), "/app-home/home-list:price_change_rate_24h_up_detail_coin");
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "SPOT", "HOMEPAGE"), "/app-home/home-list:price_up_spot_%s");
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "SPOT", "DETAIL"), "/app-home/home-list:price_up_detail_spot_%s");
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "CONTRACT", "HOMEPAGE"), "/app-home-contract/home-list:top_gainers_futures");
        map.put(m52738b("PRICE_CHANGE_24H_UP_RATE", "CONTRACT", "DETAIL"), "/app-home-contract/home-list:top_gainers_futures");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "COIN", "HOMEPAGE"), "/app-home/home-list:price_change_rate_24h_down_coin");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "COIN", "DETAIL"), "/app-home/home-list:price_down_detail_coin");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "SPOT", "HOMEPAGE"), "/app-home/home-list:price_down_spot_%s");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "SPOT", "DETAIL"), "/app-home/home-list:price_down_detail_spot_%s");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "CONTRACT", "HOMEPAGE"), "/app-home-contract/home-list:top_losers_futures");
        map.put(m52738b("PRICE_CHANGE_24H_DOWN_RATE", "CONTRACT", "DETAIL"), "/app-home-contract/home-list:top_losers_futures");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "COIN", "HOMEPAGE"), "/app-home/home-list:volume_change_rate_24h_up_coin");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "COIN", "DETAIL"), "/app-home/home-list:vol_up_detail_coin");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "SPOT", "HOMEPAGE"), "/app-home/home-list:volume_up_spot_%s");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "SPOT", "DETAIL"), "/app-home/home-list:volume_up_detail_spot_%s");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "CONTRACT", "HOMEPAGE"), "/app-home-contract/home-list:24h_trading_volume_futures");
        map.put(m52738b("VOLUME_CHANGE_24H_UP_RATE", "CONTRACT", "DETAIL"), "/app-home-contract/home-list:24h_trading_volume_futures");
        map.put(m52738b("NEW_CURRENCY_V2", "COIN", "HOMEPAGE"), "/app-home/home-list:new_currency_coin");
        map.put(m52738b("NEW_CURRENCY_V2", "COIN", "DETAIL"), "/app-home/home-list:new_currency_detail_coin");
        map.put(m52738b("NEW_CURRENCY_V2", "CONTRACT", "HOMEPAGE"), "/app-home-contract/home-list:new_crypto_futures");
        map.put(m52738b("NEW_CURRENCY_V2", "CONTRACT", "DETAIL"), "/app-home-contract/home-list:new_crypto_futures");
        map.put(m52738b("SEARCH_HOT", "COIN", "HOMEPAGE"), "/app-home/home-list:search_hot_coin");
        map.put(m52738b("SEARCH_HOT", "COIN", "DETAIL"), "/app-home/home-list:search_hot_detail_coin");
        map.put(m52738b("SEARCH_HOT", "CONTRACT", "HOMEPAGE"), "/app-home-contract/home-list:hot_search_futures");
        map.put(m52738b("SEARCH_HOT", "CONTRACT", "DETAIL"), "/app-home-contract/home-list:hot_search_futures");
        map.put(m52738b("MARKET_CAP", "COIN", "HOMEPAGE"), "/app-home/home-list:market_cap");
        map.put(m52738b("MARKET_CAP", "COIN", "DETAIL"), "/app-home/home-list:market_cap_detail");
        return map;
    }
}
