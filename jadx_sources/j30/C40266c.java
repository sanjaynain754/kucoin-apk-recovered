package j30;

import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: j30.c */
/* JADX INFO: compiled from: SegmentOrderCalculator.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010J0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010J0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010JP\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010J \u0010!\u001a\u0004\u0018\u00010\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0005J&\u0010#\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0002J\u001a\u0010)\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J \u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J.\u0010-\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005J\u0014\u00100\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/tradebase/api/segment/SegmentOrderCalculator;", "", "<init>", "()V", "MIN_ORDER_COUNT", "", "MAX_ORDER_COUNT", "PRICE_STEP_EXTRA_SCALE", "QTY_WEIGHT_EXTRA_SCALE", "AVG_PRICE_DIV_SCALE", "AVG_PRICE_RESULT_SCALE", "clampedOrderCount", "count", "clampedOrderCountOnEditingEnd", "calcPricesFromAnchor", "", "Ljava/math/BigDecimal;", "basePrice", "orderCount", "pricePrecision", "calcPrices", "priceMin", "priceMax", "calcUniformQtys", "totalQty", "qtyPrecision", "qtyStep", "calcIncreasingQtys", "calcDecreasingQtys", "buildOrders", "Lcom/kubi/tradebase/api/segment/SegmentOrder;", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "calcAvgPrice", "orders", "calcMinTotalQty", "baseMinSize", "defaultTickSize", "alignPriceToTickDown", FirebaseAnalytics.Param.PRICE, "tickSize", "normalizeQtyStep", "alignQtyToStepDown", "qty", "step", "calcMinTotalQtyByAmount", "minQuoteAmount", "minPrice", "calcTotalCost", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentOrderCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentOrderCalculator.kt\ncom/kubi/tradebase/api/segment/SegmentOrderCalculator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1563#2:295\n1634#2,3:296\n1563#2:299\n1634#2,3:300\n1803#2,3:303\n1563#2:306\n1634#2,3:307\n1563#2:310\n1634#2,3:311\n1803#2,3:314\n1573#2:317\n1604#2,4:318\n1803#2,3:322\n1803#2,3:325\n1803#2,3:328\n*S KotlinDebug\n*F\n+ 1 SegmentOrderCalculator.kt\ncom/kubi/tradebase/api/segment/SegmentOrderCalculator\n*L\n46#1:295\n46#1:296,3\n140#1:299\n140#1:300,3\n141#1:303,3\n142#1:306\n142#1:307,3\n146#1:310\n146#1:311,3\n150#1:314,3\n191#1:317\n191#1:318,4\n200#1:322,3\n202#1:325,3\n291#1:328,3\n*E\n"})
public final class C40266c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40266c f89505a = new C40266c();

    /* JADX INFO: renamed from: n */
    public final BigDecimal m88656n(int i11) {
        BigDecimal bigDecimalMovePointLeft = BigDecimal.ONE.movePointLeft(RangesKt.coerceAtLeast(i11, 0));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointLeft, "movePointLeft(...)");
        return bigDecimalMovePointLeft;
    }

    /* JADX INFO: renamed from: j30.c$a */
    /* JADX INFO: compiled from: SegmentOrderCalculator.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentDistributionType.values().length];
            try {
                iArr[SegmentDistributionType.Uniform.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentDistributionType.Increasing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentDistributionType.Decreasing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ BigDecimal m88644f(C40266c c40266c, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 16;
        }
        return c40266c.m88648e(list, i11);
    }

    /* JADX INFO: renamed from: a */
    public final BigDecimal m88645a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal2.compareTo(BigDecimal.ZERO) <= 0) {
            return bigDecimal;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.divide(bigDecimal2, 0, RoundingMode.DOWN).multiply(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    /* JADX INFO: renamed from: b */
    public final BigDecimal m88646b(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal3) <= 0) {
            BigDecimal scale = bigDecimal3.setScale(i11, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return scale;
        }
        if (bigDecimal2.compareTo(bigDecimal3) <= 0) {
            BigDecimal scale2 = bigDecimal.setScale(i11, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            return scale2;
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale3 = bigDecimal.divide(bigDecimal2, 0, roundingMode).multiply(bigDecimal2).setScale(i11, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale3, "setScale(...)");
        return scale3;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<SegmentOrder> m88647c(@NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, @NotNull BigDecimal totalQty, @NotNull SegmentDistributionType distributionType, int i12, int i13, @Nullable BigDecimal bigDecimal) {
        List<BigDecimal> listM88655m;
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        List<BigDecimal> listM88653k = m88653k(priceMin, priceMax, i11, i12);
        int i14 = a.$EnumSwitchMapping$0[distributionType.ordinal()];
        if (i14 == 1) {
            listM88655m = m88655m(totalQty, i11, i13, bigDecimal);
        } else if (i14 == 2) {
            listM88655m = m88650h(totalQty, i11, i13, bigDecimal);
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listM88655m = m88649g(totalQty, i11, i13, bigDecimal);
        }
        List listZip = CollectionsKt.zip(listM88653k, listM88655m);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        int i15 = 0;
        for (Object obj : listZip) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            arrayList.add(new SegmentOrder(i16, (BigDecimal) pair.component1(), (BigDecimal) pair.component2()));
            i15 = i16;
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final BigDecimal m88648e(@NotNull List<SegmentOrder> orders, int i11) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (SegmentOrder segmentOrder : orders) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(segmentOrder.getQty());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
        if (bigDecimalAdd.compareTo(bigDecimalAdd2) == 0) {
            return null;
        }
        for (SegmentOrder segmentOrder2 : orders) {
            Intrinsics.checkNotNull(bigDecimalAdd2);
            BigDecimal bigDecimalMultiply = segmentOrder2.getPrice().multiply(segmentOrder2.getQty());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        }
        return bigDecimalAdd2.divide(bigDecimalAdd, i11, RoundingMode.DOWN);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<BigDecimal> m88649g(@NotNull BigDecimal totalQty, int i11, int i12, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        return CollectionsKt.reversed(m88650h(totalQty, i11, i12, bigDecimal));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<BigDecimal> m88650h(@NotNull BigDecimal totalQty, int i11, int i12, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        if (i11 <= 0) {
            return CollectionsKt.emptyList();
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimal2.setScale(i12, roundingMode);
        BigDecimal bigDecimalM88657o = m88657o(bigDecimal, i12);
        BigDecimal scale2 = totalQty.setScale(i12, roundingMode);
        if (i11 == 1) {
            return CollectionsKt.listOf(scale2);
        }
        IntRange intRange = new IntRange(1, i11);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(BigDecimal.valueOf(((IntIterator) it).nextInt()));
        }
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add((BigDecimal) it2.next());
        }
        ArrayList<BigDecimal> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            RoundingMode roundingMode2 = RoundingMode.DOWN;
            arrayList2.add(scale2.multiply((BigDecimal) it3.next()).divide(bigDecimalAdd, i12 + 8, roundingMode2).setScale(i12, roundingMode2).max(scale));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (BigDecimal bigDecimal3 : arrayList2) {
            C40266c c40266c = f89505a;
            Intrinsics.checkNotNull(bigDecimal3);
            arrayList3.add(c40266c.m88646b(bigDecimal3, bigDecimalM88657o, i12));
        }
        List<BigDecimal> mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
        BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
        Iterator<T> it4 = mutableList.iterator();
        while (it4.hasNext()) {
            bigDecimalAdd2 = bigDecimalAdd2.add((BigDecimal) it4.next());
        }
        BigDecimal bigDecimalSubtract = scale2.subtract(bigDecimalAdd2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        int i13 = i11 - 1;
        BigDecimal scale3 = mutableList.get(i13).add(m88646b(bigDecimalSubtract, bigDecimalM88657o, i12)).setScale(i12, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale3, "setScale(...)");
        mutableList.set(i13, scale3);
        return mutableList;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final BigDecimal m88651i(int i11, @NotNull SegmentDistributionType distributionType, @NotNull BigDecimal baseMinSize, int i12) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        Intrinsics.checkNotNullParameter(baseMinSize, "baseMinSize");
        if (i11 <= 0 || baseMinSize.compareTo(BigDecimal.ZERO) <= 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        int i13 = a.$EnumSwitchMapping$0[distributionType.ordinal()];
        if (i13 == 1) {
            bigDecimalMultiply = baseMinSize.multiply(new BigDecimal(i11));
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalMultiply = baseMinSize.multiply(new BigDecimal(((long) i11) * ((long) (i11 + 1))).divide(new BigDecimal(2)));
        }
        BigDecimal scale = bigDecimalMultiply.setScale(i12, RoundingMode.UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final BigDecimal m88652j(int i11, @NotNull SegmentDistributionType distributionType, @NotNull BigDecimal minQuoteAmount, @NotNull BigDecimal minPrice, int i12) {
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        Intrinsics.checkNotNullParameter(minQuoteAmount, "minQuoteAmount");
        Intrinsics.checkNotNullParameter(minPrice, "minPrice");
        BigDecimal ZERO = BigDecimal.ZERO;
        if (minPrice.compareTo(ZERO) <= 0) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        int i13 = a.$EnumSwitchMapping$0[distributionType.ordinal()];
        if (i13 == 1) {
            ZERO = minQuoteAmount.multiply(new BigDecimal(i11)).divide(minPrice, i12 + 16, RoundingMode.UP);
        } else if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal scale = ZERO.setScale(i12, RoundingMode.UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<BigDecimal> m88653k(@NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, int i12) {
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        BigDecimal bigDecimalM88656n = m88656n(i12);
        BigDecimal bigDecimalMin = priceMin.min(priceMax);
        BigDecimal bigDecimalMax = priceMax.max(priceMin);
        Intrinsics.checkNotNull(bigDecimalMin);
        BigDecimal bigDecimalMax2 = m88645a(bigDecimalMin, bigDecimalM88656n).max(bigDecimalM88656n);
        if (i11 <= 1) {
            return CollectionsKt.listOf(bigDecimalMax2.setScale(i12, RoundingMode.DOWN));
        }
        Intrinsics.checkNotNull(bigDecimalMax);
        BigDecimal bigDecimalM88645a = m88645a(bigDecimalMax, bigDecimalM88656n);
        if (bigDecimalM88645a.compareTo(bigDecimalMax2) < 0) {
            return CollectionsKt.listOf(bigDecimalMax2.setScale(i12, RoundingMode.DOWN));
        }
        int i13 = i11 - 1;
        BigDecimal bigDecimalDivide = bigDecimalM88645a.subtract(bigDecimalMax2).divide(new BigDecimal(i13), i12 + 8, RoundingMode.DOWN);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < i11; i14++) {
            BigDecimal bigDecimalAdd = bigDecimalMax2.add(bigDecimalDivide.multiply(new BigDecimal(i14)));
            Intrinsics.checkNotNull(bigDecimalAdd);
            BigDecimal bigDecimalMax3 = m88645a(bigDecimalAdd, bigDecimalM88656n).max(bigDecimalM88656n);
            if (!arrayList.isEmpty()) {
                bigDecimalMax3 = bigDecimalMax3.max((BigDecimal) CollectionsKt.last((List) arrayList));
            }
            BigDecimal bigDecimalMin2 = bigDecimalMax3.min(bigDecimalM88645a);
            Intrinsics.checkNotNull(bigDecimalMin2);
            arrayList.add(bigDecimalMin2);
        }
        if (i11 >= 2) {
            RoundingMode roundingMode = RoundingMode.DOWN;
            BigDecimal scale = bigDecimalMax2.setScale(i12, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            arrayList.set(0, scale);
            BigDecimal scale2 = bigDecimalM88645a.setScale(i12, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            arrayList.set(i13, scale2);
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final BigDecimal m88654l(@NotNull List<SegmentOrder> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (SegmentOrder segmentOrder : orders) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            BigDecimal bigDecimalMultiply = segmentOrder.getPrice().multiply(segmentOrder.getQty());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "fold(...)");
        return bigDecimalAdd;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<BigDecimal> m88655m(@NotNull BigDecimal totalQty, int i11, int i12, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        BigDecimal scale = BigDecimal.ZERO.setScale(i12);
        BigDecimal bigDecimalM88657o = m88657o(bigDecimal, i12);
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale2 = totalQty.setScale(i12, roundingMode);
        BigDecimal bigDecimalDivide = scale2.divide(new BigDecimal(i11), i12, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalM88646b = m88646b(bigDecimalDivide, bigDecimalM88657o, i12);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < i11; i13++) {
            if (scale2.compareTo(scale) <= 0) {
                Intrinsics.checkNotNull(scale);
                arrayList.add(scale);
            } else if (i13 == i11 - 1) {
                Intrinsics.checkNotNull(scale2);
                arrayList.add(m88646b(scale2, bigDecimalM88657o, i12));
            } else {
                Intrinsics.checkNotNull(scale2);
                BigDecimal bigDecimalMin = bigDecimalM88646b.min(m88646b(scale2, bigDecimalM88657o, i12));
                Intrinsics.checkNotNull(bigDecimalMin);
                arrayList.add(bigDecimalMin);
                Intrinsics.checkNotNull(scale2);
                BigDecimal bigDecimalSubtract = scale2.subtract(bigDecimalMin);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                scale2 = bigDecimalSubtract.setScale(i12, RoundingMode.DOWN);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final BigDecimal m88657o(BigDecimal bigDecimal, int i11) {
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            BigDecimal bigDecimalMovePointLeft = BigDecimal.ONE.movePointLeft(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointLeft, "movePointLeft(...)");
            return bigDecimalMovePointLeft;
        }
        BigDecimal bigDecimalM11724a = C6447a.m11724a(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return bigDecimalM11724a;
    }
}
