package com.kubi.home.common;

import com.kubi.home.banner.BannerCard;
import com.kubi.home.banner.BannerCardViewHolder;
import com.kubi.home.banner.BannerData;
import com.kubi.home.buycrypto.BuyCryptoCard;
import com.kubi.home.buycrypto.BuyCryptoCardData;
import com.kubi.home.buycrypto.BuyCryptoViewHolder;
import com.kubi.home.empty.EmptyCard;
import com.kubi.home.empty.EmptyCardData;
import com.kubi.home.empty.EmptyCardViewHolder;
import com.kubi.home.gembox.GemboxCard;
import com.kubi.home.gembox.GemboxCardData;
import com.kubi.home.gembox.GemboxCardViewHolder;
import com.kubi.home.message.MessageBoxCardInterceptor;
import com.kubi.home.message.MessageBoxCardViewHolder;
import com.kubi.home.message.card.MessageBoxCard;
import com.kubi.home.message.card.MessageBoxData;
import com.kubi.home.mood.MoodCard;
import com.kubi.home.mood.MoodCardData;
import com.kubi.home.mood.MoodCardViewHolder;
import com.kubi.home.newcoin.NewCoinCard;
import com.kubi.home.newcoin.NewCoinCardViewHolder;
import com.kubi.home.newcoin.NewCoinData;
import com.kubi.home.news.NewsCard;
import com.kubi.home.news.NewsCardViewHolder;
import com.kubi.home.news.NewsData;
import com.kubi.home.rank.RankCard;
import com.kubi.home.rank.RankCardViewHolder;
import com.kubi.home.rank.RankData;
import com.kubi.home.recommend.FunctionCard;
import com.kubi.home.recommend.FunctionCardData;
import com.kubi.home.recommend.FunctionCardLong;
import com.kubi.home.recommend.FunctionCardLongViewHolder;
import com.kubi.home.recommend.FunctionCardPrimary;
import com.kubi.home.recommend.FunctionCardPrimaryViewHolder;
import com.kubi.home.recommend.FunctionCardViewHolder;
import com.kubi.home.search.SearchCard;
import com.kubi.home.search.SearchCardData;
import com.kubi.home.search.SearchCardViewHolder;
import com.kubi.home.setting.SettingCard;
import com.kubi.home.setting.SettingCardData;
import com.kubi.home.setting.SettingCardViewHolder;
import com.kubi.home.shortcut.ShortcutCard;
import com.kubi.home.shortcut.ShortcutCardViewHolder;
import com.kubi.home.shortcut.ShortcutData;
import com.kubi.home.trade.TradeCard;
import com.kubi.home.trade.TradeCardViewHolder;
import com.kubi.home.trade.TradeData;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.operation.api.IOperationService;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.kubi.home.common.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeCardsRegistry.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/home/common/HomeCardsRegistry;", "", "<init>", "()V", "registry", "Ljava/util/HashMap;", "", "Lcom/kubi/kucoin/home/cards/ClassMapping;", "Lkotlin/collections/HashMap;", "getRegistry", "()Ljava/util/HashMap;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeCardsRegistry {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeCardsRegistry f25589a = new HomeCardsRegistry();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<String, ClassMapping> f25590b;

    static {
        Pair pairM90091to = TuplesKt.m90091to("SETTING", new ClassMapping(SettingCardViewHolder.class, SettingCard.class, SettingCardData.class, null, 8, null));
        Pair pairM90091to2 = TuplesKt.m90091to("EMPTY", new ClassMapping(EmptyCardViewHolder.class, EmptyCard.class, EmptyCardData.class, null, 8, null));
        Pair pairM90091to3 = TuplesKt.m90091to("SEARCH", new ClassMapping(SearchCardViewHolder.class, SearchCard.class, SearchCardData.class, null, 8, null));
        Pair pairM90091to4 = TuplesKt.m90091to("BANNER", new ClassMapping(BannerCardViewHolder.class, BannerCard.class, BannerData.class, null, 8, null));
        Pair pairM90091to5 = TuplesKt.m90091to("HOT_SYMBOL", new ClassMapping(TradeCardViewHolder.class, TradeCard.class, TradeData.class, null, 8, null));
        Pair pairM90091to6 = TuplesKt.m90091to("MARKETING_EMOTION", new ClassMapping(MoodCardViewHolder.class, MoodCard.class, MoodCardData.class, null, 8, null));
        Pair pairM90091to7 = TuplesKt.m90091to("NEWS", new ClassMapping(NewsCardViewHolder.class, NewsCard.class, NewsData.class, null, 8, null));
        Pair pairM90091to8 = TuplesKt.m90091to("MENU", new ClassMapping(ShortcutCardViewHolder.class, ShortcutCard.class, ShortcutData.class, null, 8, null));
        Pair pairM90091to9 = TuplesKt.m90091to("CURRENCY_RECOMMEND", new ClassMapping(NewCoinCardViewHolder.class, NewCoinCard.class, NewCoinData.class, null, 8, null));
        Pair pairM90091to10 = TuplesKt.m90091to("RANKING_LIST", new ClassMapping(RankCardViewHolder.class, RankCard.class, RankData.class, null, 8, null));
        Pair pairM90091to11 = TuplesKt.m90091to("GEM_BOX", new ClassMapping(GemboxCardViewHolder.class, GemboxCard.class, GemboxCardData.class, null, 8, null));
        Pair pairM90091to12 = TuplesKt.m90091to("BUY_CRYPTO", new ClassMapping(BuyCryptoViewHolder.class, BuyCryptoCard.class, BuyCryptoCardData.class, null, 8, null));
        Pair pairM90091to13 = TuplesKt.m90091to("RECOMMENDED_POSITION", new ClassMapping(FunctionCardViewHolder.class, FunctionCard.class, FunctionCardData.class, null, 8, null));
        Pair pairM90091to14 = TuplesKt.m90091to("RECOMMENDED_POSITION_LONG", new ClassMapping(FunctionCardLongViewHolder.class, FunctionCardLong.class, FunctionCardData.class, null, 8, null));
        Pair pairM90091to15 = TuplesKt.m90091to("RECOMMENDED_POSITION_PRIMARY", new ClassMapping(FunctionCardPrimaryViewHolder.class, FunctionCardPrimary.class, FunctionCardData.class, null, 8, null));
        Pair pairM90091to16 = TuplesKt.m90091to("MESSAGE_BOX", new ClassMapping(MessageBoxCardViewHolder.class, MessageBoxCard.class, MessageBoxData.class, new MessageBoxCardInterceptor()));
        IOperationService.Companion companion = IOperationService.f36504a;
        f25590b = MapsKt.hashMapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, pairM90091to8, pairM90091to9, pairM90091to10, pairM90091to11, pairM90091to12, pairM90091to13, pairM90091to14, pairM90091to15, pairM90091to16, TuplesKt.m90091to("BREAKING_NEWS", companion.get().mo4610l()), TuplesKt.m90091to("WELFARE", companion.get().mo4607i()), TuplesKt.m90091to("NO_LOGINED_WELFARE", companion.get().mo4603e()), TuplesKt.m90091to("NO_LOGINED_CURRENCY", companion.get().mo4601c()));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, ClassMapping> m29044a() {
        return f25590b;
    }
}
