package com.kubi.operation.lib.cards.maincoin;

import com.kubi.operation.lib.entity.ChartPoint;
import com.kubi.operation.lib.entity.LabelScale;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.operation.lib.cards.maincoin.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MainCoinLineHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005J.\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinLineHelper;", "", "<init>", "()V", "toDataPointList", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "list", "Lcom/kubi/operation/lib/entity/ChartPoint;", "createComparator", "Ljava/util/Comparator;", "Lkotlin/collections/IndexedValue;", "Lkotlin/Comparator;", "compareMax", "", "OFFSET", "", "getLabelList", "Lcom/kubi/resources/widget/chart/data/Label;", "count", "", "pointList", "calculateYAxisScale", "Lcom/kubi/operation/lib/entity/LabelScale;", "high", "low", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainCoinLineHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainCoinLineHelper.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinLineHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1573#2:110\n1604#2,4:111\n2756#2:116\n1#3:115\n1#3:117\n*S KotlinDebug\n*F\n+ 1 MainCoinLineHelper.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinLineHelper\n*L\n33#1:110\n33#1:111,4\n84#1:116\n84#1:117\n*E\n"})
public final class MainCoinLineHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MainCoinLineHelper f36716a = new MainCoinLineHelper();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Comparator m43377d(MainCoinLineHelper mainCoinLineHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return mainCoinLineHelper.m43380c(z11);
    }

    /* JADX INFO: renamed from: c */
    public final Comparator<IndexedValue<ChartPoint>> m43380c(final boolean z11) {
        return new Comparator() { // from class: com.kubi.operation.lib.cards.maincoin.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MainCoinLineHelper.m43378e(z11, (IndexedValue) obj, (IndexedValue) obj2);
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<Label> m43381f(int i11, @Nullable List<DataPoint> list) {
        Object next;
        Object next2;
        LabelScale labelScaleM43379b;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((DataPoint) next).isMax());
            DataPoint dataPoint = (DataPoint) next;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((DataPoint) next2).isMin());
            DataPoint dataPoint2 = (DataPoint) next2;
            Double dValueOf = dataPoint != null ? Double.valueOf(dataPoint.getValue()) : null;
            Double dValueOf2 = dataPoint2 != null ? Double.valueOf(dataPoint2.getValue()) : null;
            if (dValueOf != null && dValueOf2 != null) {
                if (Intrinsics.areEqual(dValueOf, dValueOf2)) {
                    labelScaleM43379b = new LabelScale(C27039d.m66646f(Double.valueOf(dataPoint2.getValue() - 10.0d)), C27039d.m66646f(Double.valueOf(dataPoint2.getValue())), C27039d.m66646f(Double.valueOf(dataPoint.getValue() + 10.0d)));
                } else {
                    labelScaleM43379b = m43379b(dValueOf.doubleValue(), dValueOf2.doubleValue());
                }
                ArrayList arrayList = new ArrayList();
                int i12 = i11 / 2;
                Iterator it3 = CollectionsKt.toList(RangesKt.until(0, i11)).iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    if (iIntValue == 0) {
                        arrayList.add(new Label(null, 0.0f, 0.0f, true, labelScaleM43379b.getMin(), 7, null));
                    } else if (iIntValue == i11 - 1) {
                        arrayList.add(new Label(null, 0.0f, 0.0f, true, labelScaleM43379b.getMax(), 7, null));
                    } else if (iIntValue == i12) {
                        arrayList.add(new Label(null, 0.0f, 0.0f, true, labelScaleM43379b.getMiddle(), 7, null));
                    } else {
                        arrayList.add(new Label(null, 0.0f, 0.0f, false, labelScaleM43379b.getMin(), 7, null));
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<DataPoint> m43382g(@Nullable List<ChartPoint> list) {
        BigDecimal bigDecimalM66671k;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        Comparator comparatorM43377d = m43377d(this, false, 1, null);
        Comparator<IndexedValue<ChartPoint>> comparatorM43380c = m43380c(false);
        IndexedValue indexedValue = (IndexedValue) CollectionsKt.maxWithOrNull(CollectionsKt.withIndex(list), comparatorM43377d);
        IndexedValue indexedValue2 = (IndexedValue) CollectionsKt.minWithOrNull(CollectionsKt.withIndex(list), comparatorM43380c);
        Integer numValueOf = indexedValue != null ? Integer.valueOf(indexedValue.getIndex()) : null;
        Integer numValueOf2 = indexedValue2 != null ? Integer.valueOf(indexedValue2.getIndex()) : null;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartPoint chartPoint = (ChartPoint) obj;
            String strValueOf = String.valueOf(chartPoint.getClosePrice());
            String closePrice = chartPoint.getClosePrice();
            double dDoubleValue = (closePrice == null || (bigDecimalM66671k = C27041f.m66671k(closePrice)) == null) ? 0.0d : bigDecimalM66671k.doubleValue();
            String strM66424k = TimeUtils.m66424k(C27039d.m66652l(chartPoint.getTime()));
            Intrinsics.checkNotNullExpressionValue(strM66424k, "getTimeDetail(...)");
            arrayList.add(new DataPoint(i11, dDoubleValue, numValueOf != null && i11 == numValueOf.intValue(), numValueOf2 != null && i11 == numValueOf2.intValue(), (numValueOf != null && i11 == numValueOf.intValue()) || (numValueOf2 != null && i11 == numValueOf2.intValue()), false, false, false, false, 0.0f, strValueOf, strValueOf, strM66424k, strValueOf, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4178912, null));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final int m43378e(boolean z11, IndexedValue indexedValue, IndexedValue indexedValue2) {
        int iCompareTo;
        BigDecimal bigDecimalM66671k;
        BigDecimal bigDecimalM66671k2;
        String closePrice = ((ChartPoint) indexedValue.getValue()).getClosePrice();
        if (closePrice != null && (bigDecimalM66671k = C27041f.m66671k(closePrice)) != null) {
            String closePrice2 = ((ChartPoint) indexedValue2.getValue()).getClosePrice();
            if (closePrice2 == null || (bigDecimalM66671k2 = C27041f.m66671k(closePrice2)) == null) {
                bigDecimalM66671k2 = BigDecimal.ZERO;
            }
            iCompareTo = bigDecimalM66671k.compareTo(bigDecimalM66671k2);
        } else {
            iCompareTo = 0;
        }
        if (iCompareTo == 0) {
            if (z11) {
                return Intrinsics.compare(indexedValue.getIndex(), indexedValue2.getIndex());
            }
            return Intrinsics.compare(indexedValue2.getIndex(), indexedValue.getIndex());
        }
        return iCompareTo;
    }

    /* JADX INFO: renamed from: b */
    public final LabelScale m43379b(double d11, double d12) {
        double dCeil;
        int iLog10 = ((int) Math.log10(d11)) - 1;
        double dFloor = 0.0d;
        if (d11 == 0.0d) {
            dCeil = 0.0d;
        } else {
            double d13 = iLog10;
            dCeil = Math.ceil(d11 / Math.pow(10.0d, d13)) * Math.pow(10.0d, d13);
        }
        int iLog11 = ((int) Math.log10(d12)) - 1;
        if (d12 != 0.0d) {
            double d14 = iLog11;
            dFloor = Math.floor(d12 / Math.pow(10.0d, d14)) * Math.pow(10.0d, d14);
        }
        double d15 = dFloor;
        return new LabelScale(d15, (dCeil + d15) / ((double) 2), dCeil);
    }
}
