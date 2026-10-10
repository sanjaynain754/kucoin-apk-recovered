package com.kubi.resources.widget;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.resources.widget.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BuySellRatioView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u0005J+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/BuySellRatioMath;", "", "<init>", "()V", "MAX_ORDER_BOOK_LEVELS", "", "calculateRatioFromOrderBook", "Lkotlin/Pair;", "", "bids", "", "", "asks", "maxLevels", "normalizeRates", "buyPercent", "sellPercent", "(Ljava/lang/Float;Ljava/lang/Float;)Lkotlin/Pair;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuySellRatioMath {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BuySellRatioMath f44987a = new BuySellRatioMath();

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Pair<Float, Float> m55415c(@Nullable Float f11, @Nullable Float f12) {
        Float fValueOf = f11 != null ? Float.valueOf(RangesKt.coerceIn(f11.floatValue(), 0.0f, 100.0f)) : null;
        Float fValueOf2 = f12 != null ? Float.valueOf(RangesKt.coerceIn(f12.floatValue(), 0.0f, 100.0f)) : null;
        if (fValueOf == null && fValueOf2 == null) {
            return TuplesKt.m90091to(Float.valueOf(50.0f), Float.valueOf(50.0f));
        }
        if (fValueOf != null && fValueOf2 == null) {
            return TuplesKt.m90091to(fValueOf, Float.valueOf(100.0f - fValueOf.floatValue()));
        }
        if (fValueOf == null && fValueOf2 != null) {
            return TuplesKt.m90091to(Float.valueOf(100.0f - fValueOf2.floatValue()), fValueOf2);
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 50.0f;
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 50.0f;
        float f13 = fFloatValue + fFloatValue2;
        if (f13 <= 0.0f) {
            return TuplesKt.m90091to(Float.valueOf(50.0f), Float.valueOf(50.0f));
        }
        if (f13 == 100.0f) {
            return TuplesKt.m90091to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
        }
        float fMin = Math.min(100.0f, Math.max(0.0f, (fFloatValue / f13) * 100.0f));
        return TuplesKt.m90091to(Float.valueOf(fMin), Float.valueOf(100.0f - fMin));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Pair m55413b(BuySellRatioMath buySellRatioMath, List list, List list2, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 20;
        }
        return buySellRatioMath.m55414a(list, list2, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Pair<Float, Float> m55414a(@NotNull List<double[]> bids, @NotNull List<double[]> asks, int i11) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        int iMin = Math.min(bids.size(), i11);
        double d11 = 0.0d;
        for (int i12 = 0; i12 < iMin; i12++) {
            if (bids.get(i12).length > 1 && ArraysKt.getOrNull(bids.get(i12), 1) != null) {
                d11 += bids.get(i12)[1];
            }
        }
        int size = asks.size();
        double d12 = 0.0d;
        for (int size2 = asks.size() > i11 ? asks.size() - i11 : 0; size2 < size; size2++) {
            if (asks.get(size2).length > 1 && ArraysKt.getOrNull(asks.get(size2), 1) != null) {
                d12 += asks.get(size2)[1];
            }
        }
        double d13 = d12 + d11;
        if (d13 <= 0.0d) {
            return TuplesKt.m90091to(Float.valueOf(50.0f), Float.valueOf(50.0f));
        }
        float f11 = (float) ((d11 / d13) * 100.0d);
        return m55415c(Float.valueOf(f11), Float.valueOf(100.0f - f11));
    }
}
