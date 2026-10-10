package com.kubi.core.base.order.data;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.a */
/* JADX INFO: compiled from: CommonData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000b\u001a\u0018\u0010\u000f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u0010"}, m90084d2 = {"toTradeSide", "Lcom/kubi/core/base/order/data/TradeSide;", "", "toOrderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "default", "getTriggerQuoteFormatterStr", "Lcom/kubi/core/base/order/data/TriggerDirection;", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "triggerPrice", "Ljava/math/BigDecimal;", "getQuoteFormatterStr", "value", "getBaseFormatterStr", "getPriceFormatterStr", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11623a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m21082a(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return C27041f.m66669i(C42180b.m92640e(value, RoundingMode.DOWN, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getBaseIncrementPrecision()) : null, 8), false, false, false, 2, null, 88, null), "--");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m21083b(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return C27041f.m66669i(C42180b.m92640e(value, RoundingMode.DOWN, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(RangesKt.coerceAtLeast(symbolInfoEntity.getPriceIncrementPrecisionTrade(), symbolInfoEntity.getBaseIncrementPrecisionTrade())) : null, 8), false, false, false, 2, null, 88, null), "--");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m21084c(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return C27041f.m66669i(C42180b.m92640e(value, RoundingMode.DOWN, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getQuoteIncrementPrecision()) : null, 8), false, false, false, 2, null, 88, null), "--");
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m21085d(@NotNull TriggerDirection triggerDirection, @Nullable SymbolInfoEntity symbolInfoEntity, @NotNull BigDecimal triggerPrice) {
        Intrinsics.checkNotNullParameter(triggerDirection, "<this>");
        Intrinsics.checkNotNullParameter(triggerPrice, "triggerPrice");
        if (Intrinsics.areEqual(triggerDirection, TriggerDirection.C11622UP.INSTANCE)) {
            return Typography.greaterOrEqual + m21083b(symbolInfoEntity, triggerPrice);
        }
        if (!Intrinsics.areEqual(triggerDirection, TriggerDirection.DOWN.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Typography.lessOrEqual + m21083b(symbolInfoEntity, triggerPrice);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final OrderLevelType m21086e(@Nullable String str, @NotNull OrderLevelType orderLevelType) {
        Intrinsics.checkNotNullParameter(orderLevelType, "default");
        OrderLevelType.Normal normal = OrderLevelType.Normal.INSTANCE;
        if (Intrinsics.areEqual(str, normal.getParam())) {
            return normal;
        }
        OrderLevelType.Advanced advanced = OrderLevelType.Advanced.INSTANCE;
        return Intrinsics.areEqual(str, advanced.getParam()) ? advanced : orderLevelType;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final TradeSide m21087f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        TradeSide.BUY buy = TradeSide.BUY.INSTANCE;
        if (Intrinsics.areEqual(str, buy.getParam())) {
            return buy;
        }
        TradeSide.SELL sell = TradeSide.SELL.INSTANCE;
        if (Intrinsics.areEqual(str, sell.getParam())) {
            return sell;
        }
        return null;
    }
}
