package k30;

import com.kubi.tradebase.available.AvailableTradeAmountStatus;
import com.kubi.tradebase.available.AvailableTradeSide;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: k30.e */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\rJ&\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011J\u001a\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fJ\u001a\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeAmountStore;", "", "<init>", "()V", "context", "Lcom/kubi/tradebase/available/AvailableTradeAmountContext;", "feeRate", "Ljava/math/BigDecimal;", "bestAsk", "bestBid", "capacities", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "Lcom/kubi/tradebase/available/AvailableTradeCapacity;", "executionPrices", "Lkotlin/Pair;", "Lcom/kubi/tradebase/available/AvailableTradeSide;", "", "cachedStates", "", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "updateContext", "", "value", "updateCapacity", "type", "updateExecutionPrices", "side", "prices", "updateBbo", "ask", C33556b3.f69046g2, "updateFeeRate", "invalidateAll", "", "state", "resolveExecutionPrice", "invalidState", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAvailableTradeAmount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvailableTradeAmount.kt\ncom/kubi/tradebase/available/AvailableTradeAmountStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1563#2:296\n1634#2,3:297\n1563#2:300\n1634#2,3:301\n774#2:305\n865#2,2:306\n1#3:304\n*S KotlinDebug\n*F\n+ 1 AvailableTradeAmount.kt\ncom/kubi/tradebase/available/AvailableTradeAmountStore\n*L\n155#1:296\n155#1:297,3\n157#1:300\n157#1:301,3\n250#1:305\n250#1:306,2\n*E\n"})
public final class C40883e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public AvailableTradeAmountContext f90902a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BigDecimal f90903b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BigDecimal f90904c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BigDecimal f90905d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<TradeType, AvailableTradeCapacity> f90906e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Map<Pair<TradeType, AvailableTradeSide>, List<BigDecimal>> f90907f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<TradeType, Pair<String, AvailableTradeAmountState>> f90908g = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final AvailableTradeAmountState m89501a(AvailableTradeAmountContext availableTradeAmountContext) {
        return new AvailableTradeAmountState(new AvailableTradeAmountValue(null, availableTradeAmountContext.getBaseCurrency(), availableTradeAmountContext.getBasePrecision(), null, 9, null), new AvailableTradeAmountValue(null, availableTradeAmountContext.getQuoteCurrency(), availableTradeAmountContext.getQuotePrecision(), null, 9, null));
    }

    /* JADX INFO: renamed from: b */
    public final BigDecimal m89502b(TradeType tradeType, AvailableTradeSide availableTradeSide) {
        if (tradeType == TradeType.MARKET || tradeType == TradeType.MARKET_STOP) {
            return availableTradeSide == AvailableTradeSide.BUY ? this.f90904c : this.f90905d;
        }
        List<BigDecimal> listEmptyList = this.f90907f.get(TuplesKt.m90091to(tradeType, availableTradeSide));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(listEmptyList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((BigDecimal) obj).signum() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        TradeType tradeType2 = TradeType.OCO;
        if (tradeType == tradeType2 && availableTradeSide == AvailableTradeSide.BUY) {
            return (BigDecimal) CollectionsKt.maxOrNull((Iterable) arrayList);
        }
        return (tradeType == tradeType2 && availableTradeSide == AvailableTradeSide.SELL) ? (BigDecimal) CollectionsKt.minOrNull((Iterable) arrayList) : (BigDecimal) CollectionsKt.first((List) arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AvailableTradeAmountState m89503c(@NotNull TradeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        AvailableTradeAmountContext availableTradeAmountContext = this.f90902a;
        if (availableTradeAmountContext == null) {
            return new AvailableTradeAmountState(null, null, 3, null);
        }
        AvailableTradeCapacity availableTradeCapacity = this.f90906e.get(type);
        if (availableTradeCapacity == null) {
            return m89501a(availableTradeAmountContext);
        }
        BigDecimal bigDecimalM89502b = m89502b(type, AvailableTradeSide.BUY);
        BigDecimal bigDecimalM89502b2 = m89502b(type, AvailableTradeSide.SELL);
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf(availableTradeAmountContext, type, C40881c.m89498h(availableTradeCapacity.getQuoteAvailable()), C40881c.m89498h(availableTradeCapacity.getBaseAvailable()), C40881c.m89498h(bigDecimalM89502b), C40881c.m89498h(bigDecimalM89502b2), C40881c.m89498h(this.f90903b)), "|", null, null, 0, null, null, 62, null);
        Pair<String, AvailableTradeAmountState> pair = this.f90908g.get(type);
        if (pair != null) {
            Pair<String, AvailableTradeAmountState> pair2 = Intrinsics.areEqual(pair.getFirst(), strJoinToString$default) ? pair : null;
            if (pair2 != null) {
                return pair2.getSecond();
            }
        }
        C40879a c40879a = C40879a.f90891a;
        BigDecimal bigDecimalM89478b = c40879a.m89478b(availableTradeCapacity.getQuoteAvailable(), bigDecimalM89502b, this.f90903b, availableTradeAmountContext.getBaseIncrement());
        BigDecimal bigDecimalM89479c = c40879a.m89479c(availableTradeCapacity.getBaseAvailable(), bigDecimalM89502b2, availableTradeAmountContext.getQuoteIncrement());
        BigDecimal bigDecimal = bigDecimalM89478b == null ? BigDecimal.ZERO : bigDecimalM89478b;
        Intrinsics.checkNotNull(bigDecimal);
        AvailableTradeAmountValue availableTradeAmountValue = new AvailableTradeAmountValue(bigDecimal, availableTradeAmountContext.getBaseCurrency(), availableTradeAmountContext.getBasePrecision(), bigDecimalM89478b == null ? AvailableTradeAmountStatus.INVALID : AvailableTradeAmountStatus.VALID);
        BigDecimal bigDecimal2 = bigDecimalM89479c == null ? BigDecimal.ZERO : bigDecimalM89479c;
        Intrinsics.checkNotNull(bigDecimal2);
        AvailableTradeAmountState availableTradeAmountState = new AvailableTradeAmountState(availableTradeAmountValue, new AvailableTradeAmountValue(bigDecimal2, availableTradeAmountContext.getQuoteCurrency(), availableTradeAmountContext.getQuotePrecision(), bigDecimalM89479c == null ? AvailableTradeAmountStatus.INVALID : AvailableTradeAmountStatus.VALID));
        this.f90908g.put(type, TuplesKt.m90091to(strJoinToString$default, availableTradeAmountState));
        return availableTradeAmountState;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m89505e(@NotNull TradeType type, @NotNull AvailableTradeCapacity value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        if (C40881c.m89497g(this.f90906e.get(type), value)) {
            return false;
        }
        this.f90906e.put(type, value);
        this.f90908g.remove(type);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: f */
    public final boolean m89506f(@NotNull AvailableTradeAmountContext value) {
        boolean z11;
        Intrinsics.checkNotNullParameter(value, "value");
        if (C40881c.m89496f(this.f90902a, value)) {
            return false;
        }
        AvailableTradeAmountContext availableTradeAmountContext = this.f90902a;
        if (Intrinsics.areEqual(availableTradeAmountContext != null ? availableTradeAmountContext.getSymbol() : null, value.getSymbol())) {
            AvailableTradeAmountContext availableTradeAmountContext2 = this.f90902a;
            z11 = Intrinsics.areEqual(availableTradeAmountContext2 != null ? availableTradeAmountContext2.getAccountMode() : null, value.getAccountMode()) ? false : true;
        }
        this.f90902a = value;
        this.f90908g.clear();
        if (z11) {
            this.f90906e.clear();
            this.f90907f.clear();
            this.f90904c = null;
            this.f90905d = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m89507g(@NotNull TradeType type, @NotNull AvailableTradeSide side, @NotNull List<? extends BigDecimal> prices) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(prices, "prices");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(prices, 10));
        Iterator<T> it = prices.iterator();
        while (it.hasNext()) {
            arrayList2.add(C40881c.m89495e((BigDecimal) it.next()));
        }
        Pair<TradeType, AvailableTradeSide> pairM90091to = TuplesKt.m90091to(type, side);
        List<BigDecimal> list = this.f90907f.get(pairM90091to);
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C40881c.m89495e((BigDecimal) it2.next()));
            }
        } else {
            arrayList = null;
        }
        if (Intrinsics.areEqual(arrayList, arrayList2)) {
            return false;
        }
        this.f90907f.put(pairM90091to, arrayList2);
        this.f90908g.remove(type);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89504d(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        BigDecimal bigDecimalM89495e = C40881c.m89495e(bigDecimal);
        BigDecimal bigDecimalM89495e2 = C40881c.m89495e(bigDecimal2);
        if (Intrinsics.areEqual(C40881c.m89495e(this.f90904c), bigDecimalM89495e) && Intrinsics.areEqual(C40881c.m89495e(this.f90905d), bigDecimalM89495e2)) {
            return false;
        }
        this.f90904c = bigDecimalM89495e;
        this.f90905d = bigDecimalM89495e2;
        this.f90908g.remove(TradeType.MARKET);
        this.f90908g.remove(TradeType.MARKET_STOP);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m89508h(@Nullable BigDecimal bigDecimal) {
        BigDecimal bigDecimalM89495e = C40881c.m89495e(bigDecimal);
        if (Intrinsics.areEqual(C40881c.m89495e(this.f90903b), bigDecimalM89495e)) {
            return false;
        }
        this.f90903b = bigDecimalM89495e;
        this.f90908g.clear();
        return true;
    }
}
