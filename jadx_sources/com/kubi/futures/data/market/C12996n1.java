package com.kubi.futures.data.market;

import com.futures.market.protobuf.AggL2DeptData;
import com.futures.market.protobuf.PriceLevel;
import com.futures.tradebiz.core.model.p063pb.TradeStatisticsPb;
import com.kubi.kumex.data.market.model.WsQuotesEntity;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.futures.data.market.n1 */
/* JADX INFO: compiled from: TradePbSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006\u000f"}, m90084d2 = {"buildTradePbSocketApi", "Lcom/kubi/futures/data/market/ITradePbSocketApi;", "toBookEntity", "Lcom/kubi/kumex/logic/book/BookEntity;", "Lcom/futures/market/protobuf/AggL2DeptData;", "defaultSymbol", "", "toWsQuotesEntity", "Lcom/kubi/kumex/data/market/model/WsQuotesEntity;", "Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;", "toSortedBookLevels", "", "", "", "Lcom/futures/market/protobuf/PriceLevel;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradePbSocketApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradePbSocketApi.kt\ncom/kubi/futures/data/market/TradePbSocketApiKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1#2:57\n1#2:68\n1617#3,9:58\n1869#3:67\n1870#3:69\n1626#3:70\n*S KotlinDebug\n*F\n+ 1 TradePbSocketApi.kt\ncom/kubi/futures/data/market/TradePbSocketApiKt\n*L\n50#1:68\n50#1:58,9\n50#1:67\n50#1:69\n50#1:70\n*E\n"})
public final class C12996n1 {

    /* JADX INFO: renamed from: com.kubi.futures.data.market.n1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradePbSocketApi.kt\ncom/kubi/futures/data/market/TradePbSocketApiKt\n*L\n1#1,328:1\n55#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ITradePbSocketApi m24850a() {
        return (ITradePbSocketApi) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42778c(new C38003e()).m42776a().m42772b(ITradePbSocketApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BookEntity m24851b(@NotNull AggL2DeptData aggL2DeptData, @NotNull String defaultSymbol) {
        Intrinsics.checkNotNullParameter(aggL2DeptData, "<this>");
        Intrinsics.checkNotNullParameter(defaultSymbol, "defaultSymbol");
        Long lValueOf = Long.valueOf(aggL2DeptData.getSequence());
        Long l11 = lValueOf.longValue() != 0 ? lValueOf : null;
        Long lValueOf2 = Long.valueOf(aggL2DeptData.getTs());
        Long l12 = lValueOf2.longValue() != 0 ? lValueOf2 : null;
        Long lValueOf3 = Long.valueOf(aggL2DeptData.getTs());
        Long l13 = lValueOf3.longValue() != 0 ? lValueOf3 : null;
        List<PriceLevel> bidsList = aggL2DeptData.getBidsList();
        Intrinsics.checkNotNullExpressionValue(bidsList, "getBidsList(...)");
        List<double[]> listM24852c = m24852c(bidsList);
        List<PriceLevel> asksList = aggL2DeptData.getAsksList();
        Intrinsics.checkNotNullExpressionValue(asksList, "getAsksList(...)");
        return new BookEntity(defaultSymbol, l11, l12, l13, listM24852c, m24852c(asksList));
    }

    /* JADX INFO: renamed from: c */
    public static final List<double[]> m24852c(List<PriceLevel> list) {
        ArrayList arrayList = new ArrayList();
        for (PriceLevel priceLevel : list) {
            String price = priceLevel.getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "getPrice(...)");
            Double doubleOrNull = StringsKt.toDoubleOrNull(price);
            double[] dArr = null;
            if (doubleOrNull != null) {
                double dDoubleValue = doubleOrNull.doubleValue();
                double size = priceLevel.getSize();
                if (dDoubleValue != 0.0d && size != 0.0d) {
                    dArr = new double[]{dDoubleValue, size};
                }
            }
            if (dArr != null) {
                arrayList.add(dArr);
            }
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList, new a()));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final WsQuotesEntity m24853d(@NotNull TradeStatisticsPb tradeStatisticsPb) {
        Intrinsics.checkNotNullParameter(tradeStatisticsPb, "<this>");
        String symbol = tradeStatisticsPb.getSymbol();
        String volume = tradeStatisticsPb.getVolume();
        Intrinsics.checkNotNullExpressionValue(volume, "getVolume(...)");
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(volume);
        String turnover = tradeStatisticsPb.getTurnover();
        Intrinsics.checkNotNullExpressionValue(turnover, "getTurnover(...)");
        BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(turnover);
        String lastPrice = tradeStatisticsPb.getLastPrice();
        Intrinsics.checkNotNullExpressionValue(lastPrice, "getLastPrice(...)");
        BigDecimal bigDecimalOrNull3 = StringsKt.toBigDecimalOrNull(lastPrice);
        String lowPrice = tradeStatisticsPb.getLowPrice();
        Intrinsics.checkNotNullExpressionValue(lowPrice, "getLowPrice(...)");
        BigDecimal bigDecimalOrNull4 = StringsKt.toBigDecimalOrNull(lowPrice);
        String highPrice = tradeStatisticsPb.getHighPrice();
        Intrinsics.checkNotNullExpressionValue(highPrice, "getHighPrice(...)");
        BigDecimal bigDecimalOrNull5 = StringsKt.toBigDecimalOrNull(highPrice);
        String priceChg = tradeStatisticsPb.getPriceChg();
        Intrinsics.checkNotNullExpressionValue(priceChg, "getPriceChg(...)");
        BigDecimal bigDecimalOrNull6 = StringsKt.toBigDecimalOrNull(priceChg);
        String priceChgPct = tradeStatisticsPb.getPriceChgPct();
        Intrinsics.checkNotNullExpressionValue(priceChgPct, "getPriceChgPct(...)");
        BigDecimal bigDecimalOrNull7 = StringsKt.toBigDecimalOrNull(priceChgPct);
        Long lValueOf = Long.valueOf(tradeStatisticsPb.getTs());
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        return new WsQuotesEntity(symbol, bigDecimalOrNull, bigDecimalOrNull2, bigDecimalOrNull3, bigDecimalOrNull4, bigDecimalOrNull5, bigDecimalOrNull6, bigDecimalOrNull7, lValueOf);
    }
}
