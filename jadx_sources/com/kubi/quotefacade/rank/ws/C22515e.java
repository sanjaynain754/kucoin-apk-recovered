package com.kubi.quotefacade.rank.ws;

import androidx.media3.exoplayer.RendererCapabilities;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsRankFutureSnapshotEntity;
import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.network.restful.C19321b;
import com.kucoin.discover.rankings.AlphaRankingItemApp;
import com.kucoin.discover.rankings.AlphaRankingItemsApp;
import com.kucoin.discover.rankings.CryptoRankingItemApp;
import com.kucoin.discover.rankings.CryptoRankingListApp;
import com.kucoin.discover.rankings.FuturesRankingItemApp;
import com.kucoin.discover.rankings.FuturesRankingItemsApp;
import com.tencent.bugly.proguard.C33844oi;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.ws.e */
/* JADX INFO: compiled from: RankPbWsApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0010\u001a\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e*\u00020\u0014\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e*\u00020\u0017\u001a\b\u0010\u0018\u001a\u00020\u0019H\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"buildRankPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IRankPbWsApi;", "buildAlphaRankPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IAlphaRankPbWsApi;", "buildFuturesRankPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IFuturesRankPbWsApi;", "RANK_PB_TOPIC_PREFIX", "", "COIN_TOPIC_SUFFIX_TO_PB_PARAM", "", "SPOT_TOPIC_PREFIX_TO_PB_PREFIX", "jsonTopicToRankPbParam", "jsonTopic", "toRankMarketSnapshotList", "", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "Lcom/kucoin/discover/rankings/CryptoRankingListApp;", "ALPHA_HOME_PB_TOPIC", "toAlphaSnapshotList", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "Lcom/kucoin/discover/rankings/AlphaRankingItemsApp;", "toFuturesSnapshotList", "Lcom/kubi/data/entity/WsRankFutureSnapshotEntity;", "Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;", "isRankPbEnabled", "", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankPbWsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankPbWsApi.kt\ncom/kubi/quotefacade/rank/ws/RankPbWsApiKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,239:1\n1#2:240\n1573#3:241\n1604#3,4:242\n1563#3:246\n1634#3,3:247\n1573#3:250\n1604#3,4:251\n35#4,4:255\n39#4:261\n44#5,2:259\n*S KotlinDebug\n*F\n+ 1 RankPbWsApi.kt\ncom/kubi/quotefacade/rank/ws/RankPbWsApiKt\n*L\n173#1:241\n173#1:242,4\n197#1:246\n197#1:247,3\n218#1:250\n218#1:251,4\n238#1:255,4\n238#1:261\n238#1:259,2\n*E\n"})
public final class C22515e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<String, String> f42582a = MapsKt.mapOf(TuplesKt.m90091to("price_change_rate_24h_up_coin", "cryptoTopGainers"), TuplesKt.m90091to("price_change_rate_24h_up_detail_coin", "moreCryptoTopGainers"), TuplesKt.m90091to("price_change_rate_24h_down_coin", "cryptoTopLosers"), TuplesKt.m90091to("price_down_detail_coin", "moreCryptoTopLosers"), TuplesKt.m90091to("volume_change_rate_24h_up_coin", "crypto24hTv"), TuplesKt.m90091to("vol_up_detail_coin", "moreCrypto24hTv"), TuplesKt.m90091to("new_currency_coin", "cryptoNewCrypto"), TuplesKt.m90091to("new_currency_detail_coin", "moreCryptoNewCrypto"), TuplesKt.m90091to("search_hot_coin", "cryptoHotSearch"), TuplesKt.m90091to("search_hot_detail_coin", "moreCryptoHotSearch"), TuplesKt.m90091to("market_cap", "cryptoMarketCap"), TuplesKt.m90091to("market_cap_detail", "moreCryptoMarketCap"), TuplesKt.m90091to("top_gainers_futures", "futuresTopGainers"), TuplesKt.m90091to("top_losers_futures", "futuresTopLosers"), TuplesKt.m90091to("24h_trading_volume_futures", "futures24hTv"), TuplesKt.m90091to("hot_search_futures", "futuresHotSearch"), TuplesKt.m90091to("new_crypto_futures", "futuresNewCrypto"));

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, String> f42583b = MapsKt.mapOf(TuplesKt.m90091to("price_up_spot_", "spotTopGainers"), TuplesKt.m90091to("price_down_spot_", "spotTopLosers"), TuplesKt.m90091to("volume_up_spot_", "spot24hTv"), TuplesKt.m90091to("price_up_detail_spot_", "moreSpotTopGainers"), TuplesKt.m90091to("price_down_detail_spot_", "moreSpotTopLosers"), TuplesKt.m90091to("volume_up_detail_spot_", "moreSpot24hTv"));

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.ws.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IAlphaRankPbWsApi m52952a() {
        return (IAlphaRankPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(IAlphaRankPbWsApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final IFuturesRankPbWsApi m52953b() {
        return (IFuturesRankPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(IFuturesRankPbWsApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final IRankPbWsApi m52954c() {
        return (IRankPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(IRankPbWsApi.class);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m52955d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_socket_protobuf_market_v1", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m52956e(@NotNull String jsonTopic) {
        Intrinsics.checkNotNullParameter(jsonTopic, "jsonTopic");
        String strSubstringAfterLast = StringsKt.substringAfterLast(jsonTopic, C33844oi.f71346o, "");
        if (strSubstringAfterLast.length() == 0) {
            return null;
        }
        String str = f42582a.get(strSubstringAfterLast);
        if (str != null) {
            return str;
        }
        for (Map.Entry<String, String> entry : f42583b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (StringsKt.startsWith$default(strSubstringAfterLast, key, false, 2, (Object) null)) {
                String strRemovePrefix = StringsKt.removePrefix(strSubstringAfterLast, (CharSequence) key);
                if (strRemovePrefix.length() > 0) {
                    return value + strRemovePrefix;
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<WsAlphaSnapshotEntity> m52957f(@NotNull AlphaRankingItemsApp alphaRankingItemsApp) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(alphaRankingItemsApp, "<this>");
        List<AlphaRankingItemApp> itemsList = alphaRankingItemsApp.getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList, "getItemsList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
        for (AlphaRankingItemApp alphaRankingItemApp : itemsList) {
            String strValueOf = String.valueOf(alphaRankingItemApp.getTokenBridgeId());
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(alphaRankingItemApp.getPrice()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                objM103844constructorimpl = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl, "getOrElse(...)");
            BigDecimal bigDecimal = (BigDecimal) objM103844constructorimpl;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(alphaRankingItemApp.getTradingVolume());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(alphaRankingItemApp.getPriceRate());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            String displayToken = alphaRankingItemApp.getDisplayToken();
            Intrinsics.checkNotNull(displayToken);
            String str = displayToken.length() > 0 ? displayToken : null;
            String tokenIcon = alphaRankingItemApp.getTokenIcon();
            Intrinsics.checkNotNull(tokenIcon);
            String str2 = tokenIcon.length() > 0 ? tokenIcon : null;
            String chainIcon = alphaRankingItemApp.getChainIcon();
            Intrinsics.checkNotNull(chainIcon);
            arrayList.add(new WsAlphaSnapshotEntity(str2, chainIcon.length() > 0 ? chainIcon : null, strValueOf, bigDecimal, bigDecimalValueOf, bigDecimalValueOf2, str, null, 128, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<WsRankFutureSnapshotEntity> m52958g(@NotNull FuturesRankingItemsApp futuresRankingItemsApp) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(futuresRankingItemsApp, "<this>");
        List<FuturesRankingItemApp> itemsList = futuresRankingItemsApp.getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList, "getItemsList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
        int i11 = 0;
        for (Object obj : itemsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FuturesRankingItemApp futuresRankingItemApp = (FuturesRankingItemApp) obj;
            String crypto = futuresRankingItemApp.getCrypto();
            Intrinsics.checkNotNull(crypto);
            String str = crypto.length() > 0 ? crypto : null;
            String quoteCrypto = futuresRankingItemApp.getQuoteCrypto();
            Intrinsics.checkNotNull(quoteCrypto);
            String str2 = quoteCrypto.length() > 0 ? quoteCrypto : null;
            String symbol = futuresRankingItemApp.getSymbol();
            Intrinsics.checkNotNull(symbol);
            String str3 = symbol.length() > 0 ? symbol : null;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(futuresRankingItemApp.getLastPrice()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            BigDecimal bigDecimal = (BigDecimal) objM103844constructorimpl;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(futuresRankingItemApp.getLast24HourRate());
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(futuresRankingItemApp.getLast24HourTradingVolume());
            List<String> futuresMarksList = futuresRankingItemApp.getFuturesMarksList();
            Intrinsics.checkNotNull(futuresMarksList);
            arrayList.add(new WsRankFutureSnapshotEntity(Integer.valueOf(i12), str, str2, bigDecimal, bigDecimalValueOf, str3, bigDecimalValueOf2, false, null, !futuresMarksList.isEmpty() ? futuresMarksList : null, RendererCapabilities.DECODER_SUPPORT_MASK, null));
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<WsRankMarketSnapshotEntity> m52959h(@NotNull CryptoRankingListApp cryptoRankingListApp) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(cryptoRankingListApp, "<this>");
        List<CryptoRankingItemApp> itemsList = cryptoRankingListApp.getItemsList();
        Intrinsics.checkNotNullExpressionValue(itemsList, "getItemsList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
        int i11 = 0;
        for (Object obj : itemsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CryptoRankingItemApp cryptoRankingItemApp = (CryptoRankingItemApp) obj;
            String symbol = cryptoRankingItemApp.getSymbol();
            String symbol2 = cryptoRankingItemApp.getSymbol();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(cryptoRankingItemApp.getLast24HourRate());
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(cryptoRankingItemApp.getLastPrice()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(cryptoRankingItemApp.getLast24HourTradingVolume());
            long openAt = cryptoRankingItemApp.getOpenAt() * ((long) 1000);
            arrayList.add(new WsRankMarketSnapshotEntity(Integer.valueOf(i12), null, symbol2, symbol, null, bigDecimalValueOf, (BigDecimal) objM103844constructorimpl, null, null, bigDecimalValueOf2, Long.valueOf(openAt), null, cryptoRankingItemApp.getIcon(), 2450, null));
            i11 = i12;
        }
        return arrayList;
    }
}
