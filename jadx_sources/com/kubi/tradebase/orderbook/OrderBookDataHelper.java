package com.kubi.tradebase.orderbook;

import android.content.Context;
import com.kubi.resources.widget.OrderBookType;
import com.kubi.tradebase.R$dimen;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l30.C42049b;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.tradebase.orderbook.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderBookDataHelper.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\tJ,\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002J:\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u001a*\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/OrderBookDataHelper;", "", "<init>", "()V", "convertDisplayData", "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;", "orderData", "Lcom/kubi/tradebase/orderbook/IOrderBookData;", "pricePrecision", "", "amountPrecision", "orderBookType", "Lcom/kubi/resources/widget/OrderBookType;", "delegationPriceList", "", "Lcom/kubi/tradebase/orderbook/OrderBookDelegation;", "defaultSize", "calculateProgressWithMaxAndMarkDelegation", "buildOrderBookData", "Lcom/kubi/tradebase/orderbook/OrderBookItemData;", "data", "", "Ljava/math/BigDecimal;", "isBids", "", "formatterDisplayAmount", "", "formatterOrderBookPrice", "getTextSizeByPricePrecision", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderBookDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1563#2:239\n1634#2,3:240\n1999#2,14:243\n1563#2:257\n1634#2,3:258\n1999#2,14:261\n1563#2:275\n1634#2,3:276\n1999#2,14:279\n1563#2:293\n1634#2,3:294\n1999#2,14:297\n1869#2:311\n1870#2:313\n1869#2,2:314\n1869#2,2:316\n1068#2:318\n1056#2:319\n1563#2:320\n1634#2,3:321\n1878#2,3:324\n1#3:312\n*S KotlinDebug\n*F\n+ 1 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n*L\n83#1:239\n83#1:240,3\n84#1:243,14\n86#1:257\n86#1:258,3\n87#1:261,14\n90#1:275\n90#1:276,3\n90#1:279,14\n93#1:293\n93#1:294,3\n93#1:297,14\n96#1:311\n96#1:313\n106#1:314,2\n135#1:316,2\n145#1:318\n147#1:319\n148#1:320\n148#1:321,3\n162#1:324,3\n*E\n"})
public final class OrderBookDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OrderBookDataHelper f51601a = new OrderBookDataHelper();

    /* JADX INFO: renamed from: com.kubi.tradebase.orderbook.b$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n*L\n1#1,328:1\n147#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(C41014a.m89922G(C42180b.m92637b((String) t11, null, 1, null), null, 1, null), C41014a.m89922G(C42180b.m92637b((String) t12, null, 1, null), null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.orderbook.b$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n*L\n1#1,328:1\n146#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(C41014a.m89922G(C42180b.m92637b((String) t12, null, 1, null), null, 1, null), C41014a.m89922G(C42180b.m92637b((String) t11, null, 1, null), null, 1, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0255  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e1  */
    /* JADX INFO: renamed from: b */
    public final DisplayOrderBookData m63275b(DisplayOrderBookData displayOrderBookData, OrderBookType orderBookType, List<OrderBookDelegation> list, int i11) {
        Object next;
        BigDecimal bigDecimalM89922G;
        Object next2;
        boolean z11;
        Object next3;
        Float fValueOf;
        BigDecimal valueAmount;
        BigDecimal bigDecimalDivide;
        boolean z12;
        Object next4;
        Float fValueOf2;
        BigDecimal valueAmount2;
        BigDecimal bigDecimalDivide2;
        Object next5;
        Object next6;
        int i12 = 1;
        if (Intrinsics.areEqual(orderBookType, OrderBookType.C22935a.f43984b)) {
            List listTake = CollectionsKt.take(displayOrderBookData.getDisplayBids(), i11);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it = listTake.iterator();
            while (it.hasNext()) {
                DisPlayAmount totalAmount = ((OrderBookItemData) it.next()).getTotalAmount();
                arrayList.add(C41014a.m89922G(totalAmount != null ? totalAmount.getValueAmount() : null, null, 1, null));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next5 = it2.next();
                if (it2.hasNext()) {
                    BigDecimal bigDecimal = (BigDecimal) next5;
                    do {
                        Object next7 = it2.next();
                        BigDecimal bigDecimal2 = (BigDecimal) next7;
                        if (bigDecimal.compareTo(bigDecimal2) < 0) {
                            next5 = next7;
                            bigDecimal = bigDecimal2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next5 = null;
            }
            double dM66647g = C27039d.m66647g((BigDecimal) next5);
            List listTake2 = CollectionsKt.take(displayOrderBookData.getDisplayAsks(), i11);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake2, 10));
            Iterator it3 = listTake2.iterator();
            while (it3.hasNext()) {
                DisPlayAmount totalAmount2 = ((OrderBookItemData) it3.next()).getTotalAmount();
                arrayList2.add(C41014a.m89922G(totalAmount2 != null ? totalAmount2.getValueAmount() : null, null, 1, null));
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                next6 = it4.next();
                if (it4.hasNext()) {
                    BigDecimal bigDecimal3 = (BigDecimal) next6;
                    do {
                        Object next8 = it4.next();
                        BigDecimal bigDecimal4 = (BigDecimal) next8;
                        if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            next6 = next8;
                            bigDecimal3 = bigDecimal4;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next6 = null;
            }
            bigDecimalM89922G = new BigDecimal(String.valueOf(Math.max(dM66647g, C27039d.m66647g((BigDecimal) next6))));
        } else if (Intrinsics.areEqual(orderBookType, OrderBookType.C22936b.f43985b)) {
            List<OrderBookItemData> displayBids = displayOrderBookData.getDisplayBids();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(displayBids, 10));
            Iterator<T> it5 = displayBids.iterator();
            while (it5.hasNext()) {
                DisPlayAmount totalAmount3 = ((OrderBookItemData) it5.next()).getTotalAmount();
                arrayList3.add(C41014a.m89922G(totalAmount3 != null ? totalAmount3.getValueAmount() : null, null, 1, null));
            }
            Iterator it6 = arrayList3.iterator();
            if (it6.hasNext()) {
                next2 = it6.next();
                if (it6.hasNext()) {
                    BigDecimal bigDecimal5 = (BigDecimal) next2;
                    do {
                        Object next9 = it6.next();
                        BigDecimal bigDecimal6 = (BigDecimal) next9;
                        if (bigDecimal5.compareTo(bigDecimal6) < 0) {
                            next2 = next9;
                            bigDecimal5 = bigDecimal6;
                        }
                    } while (it6.hasNext());
                }
            } else {
                next2 = null;
            }
            bigDecimalM89922G = C41014a.m89922G((BigDecimal) next2, null, 1, null);
        } else {
            List<OrderBookItemData> displayAsks = displayOrderBookData.getDisplayAsks();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(displayAsks, 10));
            Iterator<T> it7 = displayAsks.iterator();
            while (it7.hasNext()) {
                DisPlayAmount totalAmount4 = ((OrderBookItemData) it7.next()).getTotalAmount();
                arrayList4.add(C41014a.m89922G(totalAmount4 != null ? totalAmount4.getValueAmount() : null, null, 1, null));
            }
            Iterator it8 = arrayList4.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    BigDecimal bigDecimal7 = (BigDecimal) next;
                    do {
                        Object next10 = it8.next();
                        BigDecimal bigDecimal8 = (BigDecimal) next10;
                        if (bigDecimal7.compareTo(bigDecimal8) < 0) {
                            next = next10;
                            bigDecimal7 = bigDecimal8;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            bigDecimalM89922G = C41014a.m89922G((BigDecimal) next, null, 1, null);
        }
        for (OrderBookItemData orderBookItemData : displayOrderBookData.getDisplayBids()) {
            if (bigDecimalM89922G.doubleValue() != 0.0d) {
                DisPlayAmount totalAmount5 = orderBookItemData.getTotalAmount();
                if (totalAmount5 == null || (valueAmount2 = totalAmount5.getValueAmount()) == null || (bigDecimalDivide2 = valueAmount2.divide(bigDecimalM89922G, 2, RoundingMode.DOWN)) == null) {
                    fValueOf2 = null;
                } else {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100L);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    BigDecimal bigDecimalMultiply = bigDecimalDivide2.multiply(bigDecimalValueOf);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    if (bigDecimalMultiply != null) {
                        fValueOf2 = Float.valueOf(bigDecimalMultiply.floatValue());
                    } else {
                        fValueOf2 = null;
                    }
                }
                orderBookItemData.setDisplayProgress(C27039d.m66649i(fValueOf2, 0.0f, 1, null));
            }
            if (list.isEmpty()) {
                z12 = false;
            } else {
                Iterator<T> it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it9.next();
                    OrderBookDelegation orderBookDelegation = (OrderBookDelegation) next4;
                    if (orderBookDelegation.isBuy() && Intrinsics.areEqual(orderBookDelegation.getDisplayPrice(), orderBookItemData.getDisplayPrice())) {
                        break;
                    }
                }
                if (next4 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            orderBookItemData.setDelegationMark(z12);
        }
        for (OrderBookItemData orderBookItemData2 : displayOrderBookData.getDisplayAsks()) {
            if (bigDecimalM89922G.doubleValue() != 0.0d) {
                DisPlayAmount totalAmount6 = orderBookItemData2.getTotalAmount();
                if (totalAmount6 == null || (valueAmount = totalAmount6.getValueAmount()) == null || (bigDecimalDivide = valueAmount.divide(bigDecimalM89922G, 2, RoundingMode.DOWN)) == null) {
                    fValueOf = null;
                } else {
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(100L);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal bigDecimalMultiply2 = bigDecimalDivide.multiply(bigDecimalValueOf2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    if (bigDecimalMultiply2 != null) {
                        fValueOf = Float.valueOf(bigDecimalMultiply2.floatValue());
                    } else {
                        fValueOf = null;
                    }
                }
                orderBookItemData2.setDisplayProgress(C27039d.m66649i(fValueOf, 0.0f, i12, null));
            }
            if (list.isEmpty()) {
                z11 = false;
            } else {
                Iterator<T> it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it10.next();
                    OrderBookDelegation orderBookDelegation2 = (OrderBookDelegation) next3;
                    if (!orderBookDelegation2.isBuy() && Intrinsics.areEqual(orderBookDelegation2.getDisplayPrice(), orderBookItemData2.getDisplayPrice())) {
                        break;
                    }
                }
                if (next3 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            orderBookItemData2.setDelegationMark(z11);
            i12 = 1;
        }
        return displayOrderBookData;
    }

    /* JADX INFO: renamed from: a */
    public final List<OrderBookItemData> m63274a(List<BigDecimal[]> list, int i11, int i12, boolean z11) {
        int i13;
        List<String> listSortedWith;
        BigDecimal bigDecimalAdd;
        BigDecimal valueAmount;
        BigDecimal valueAmount2;
        HashMap map = new HashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            BigDecimal[] bigDecimalArr = (BigDecimal[]) it.next();
            String strM63278e = f51601a.m63278e(bigDecimalArr[0], i11, z11);
            if (map.containsKey(strM63278e)) {
                Object obj = map.get(strM63278e);
                Intrinsics.checkNotNull(obj);
                BigDecimal bigDecimalAdd2 = ((BigDecimal) obj).add(bigDecimalArr[1]);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                map.put(strM63278e, bigDecimalAdd2);
            } else {
                map.put(strM63278e, bigDecimalArr[1]);
            }
        }
        float fM63279f = f51601a.m63279f(i11);
        if (z11) {
            Set setKeySet = map.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            listSortedWith = CollectionsKt.sortedWith(setKeySet, new b());
        } else {
            Set setKeySet2 = map.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet2, "<get-keys>(...)");
            listSortedWith = CollectionsKt.sortedWith(setKeySet2, new a());
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (String str : listSortedWith) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G((BigDecimal) map.get(str), null, 1, null);
            arrayList.add(new OrderBookItemData(str, new DisPlayAmount(f51601a.m63277d(bigDecimalM89922G, i11, i12), bigDecimalM89922G), null, 0.0f, false, fM63279f, 28, null));
        }
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OrderBookItemData orderBookItemData = (OrderBookItemData) obj2;
            if (i13 == 0) {
                DisPlayAmount totalAmount = orderBookItemData.getTotalAmount();
                if (totalAmount != null) {
                    DisPlayAmount singleAmount = orderBookItemData.getSingleAmount();
                    totalAmount.setValueAmount(C41014a.m89922G(singleAmount != null ? singleAmount.getValueAmount() : null, null, 1, null));
                }
            } else {
                DisPlayAmount totalAmount2 = orderBookItemData.getTotalAmount();
                if (totalAmount2 != null) {
                    DisPlayAmount singleAmount2 = orderBookItemData.getSingleAmount();
                    if (singleAmount2 == null || (valueAmount = singleAmount2.getValueAmount()) == null) {
                        bigDecimalAdd = null;
                    } else {
                        DisPlayAmount totalAmount3 = ((OrderBookItemData) arrayList.get(i13 - 1)).getTotalAmount();
                        bigDecimalAdd = valueAmount.add(C41014a.m89922G(totalAmount3 != null ? totalAmount3.getValueAmount() : null, null, 1, null));
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    }
                    totalAmount2.setValueAmount(C41014a.m89922G(bigDecimalAdd, null, 1, null));
                }
            }
            DisPlayAmount totalAmount4 = orderBookItemData.getTotalAmount();
            if (totalAmount4 != null) {
                DisPlayAmount totalAmount5 = orderBookItemData.getTotalAmount();
                totalAmount4.setDisplayAmount(C27041f.m66668h((totalAmount5 == null || (valueAmount2 = totalAmount5.getValueAmount()) == null) ? null : f51601a.m63277d(valueAmount2, i11, i12)));
            }
            i13 = i14;
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DisplayOrderBookData m63276c(@NotNull IOrderBookData orderData, int i11, int i12, @NotNull OrderBookType orderBookType, @NotNull List<OrderBookDelegation> delegationPriceList, int i13) {
        Intrinsics.checkNotNullParameter(orderData, "orderData");
        Intrinsics.checkNotNullParameter(orderBookType, "orderBookType");
        Intrinsics.checkNotNullParameter(delegationPriceList, "delegationPriceList");
        List<BigDecimal[]> bids = orderData.getBids();
        if (bids == null) {
            bids = CollectionsKt.emptyList();
        }
        List<OrderBookItemData> listM63274a = m63274a(bids, i11, i12, true);
        List<BigDecimal[]> asks = orderData.getAsks();
        if (asks == null) {
            asks = CollectionsKt.emptyList();
        }
        return m63275b(new DisplayOrderBookData(orderData.getSymbol(), orderData.getBids(), orderData.getAsks(), listM63274a, m63274a(asks, i11, i12, false)), orderBookType, delegationPriceList, i13);
    }

    /* JADX INFO: renamed from: d */
    public final String m63277d(BigDecimal bigDecimal, int i11, int i12) {
        return C42049b.f92327a.m92253b(i11).mo92251a(bigDecimal.doubleValue(), i12);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m63278e(@NotNull BigDecimal bigDecimal, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal.doubleValue() != 0.0d) {
            return C42180b.m92640e(bigDecimal, z11 ? RoundingMode.DOWN : RoundingMode.UP, i11, true, false, true, 0, null, 104, null);
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Typography.less);
            BigDecimal bigDecimalPow = BigDecimal.TEN.pow(Math.abs(i11));
            Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
            sb2.append(C42180b.m92640e(bigDecimalPow, null, 20, false, false, false, 0, null, 125, null));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Typography.less);
        BigDecimal bigDecimalPow2 = new BigDecimal("0.1").pow(i11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow2, "pow(...)");
        sb3.append(C42180b.m92640e(bigDecimalPow2, null, 20, false, false, false, 0, null, 125, null));
        return sb3.toString();
    }

    /* JADX INFO: renamed from: f */
    public final float m63279f(int i11) {
        Context contextM66513b = C27017c.f54310a.m66513b();
        if (i11 <= 8) {
            return contextM66513b.getResources().getDimension(R$dimen.order_book_text_size_big);
        }
        return i11 <= 10 ? contextM66513b.getResources().getDimension(R$dimen.order_book_text_size_medium) : contextM66513b.getResources().getDimension(R$dimen.order_book_text_size_small);
    }
}
