package com.kubi.futures.data.market;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceAggregationEntity;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.market.model.RecentDealEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.futures.data.market.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarketService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006H&J0\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\tH&J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H&J&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0019H&J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\t2\u0006\u0010!\u001a\u00020\"H¦@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010%J\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\t0'2\u0006\u0010!\u001a\u00020\"H¦@¢\u0006\u0002\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/IMarketService;", "Lcom/kubi/futures/data/market/IMarketApi;", "observeFundingRate", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "symbol", "", "observePrices", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "symbols", "observePrice", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "observeTicker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getMexCurrencyIconUrl", FirebaseAnalytics.Param.CURRENCY, "observeQuotesList", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "tradingArea", "quotes", "observeBook", "Lcom/kubi/kumex/logic/book/BookEntity;", "precision", "", "observeDeal", "Lcom/kubi/kumex/data/market/model/RecentDealEntity;", TUIConstants.TUIContact.LIMIT, "observeMarkPrices", "", "getTradingAreaFromCache", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "isRobot", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQuotesListResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTradingArea", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketService extends IMarketApi {
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BookEntity> mo24801a(@NotNull String str, int i11);

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<TickerEntity> mo24802b(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo24804d(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<FundingRateEntity> mo24805e(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<Object> mo24806f(@NotNull List<String> list);

    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<PriceEntity> mo24807g(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<List<RecentDealEntity>> mo24808h(@NotNull String str, int i11);

    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<List<QuotesEntity>> mo24810l(@Nullable String str, @NotNull List<QuotesEntity> list);

    @Nullable
    /* JADX INFO: renamed from: m */
    Object mo24811m(boolean z11, @NotNull Continuation<? super List<AvailableTradeAreaEntity>> continuation);

    @Nullable
    /* JADX INFO: renamed from: p */
    Object mo24815p(boolean z11, @NotNull Continuation<? super C19334f<List<AvailableTradeAreaEntity>>> continuation);

    @NotNull
    /* JADX INFO: renamed from: u */
    InterfaceC41634e<List<PriceAggregationEntity>> mo24824u(@NotNull List<String> list);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    static /* synthetic */ Observable m24859o(IMarketService iMarketService, String str, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeQuotesList");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return iMarketService.mo24810l(str, list);
    }
}
