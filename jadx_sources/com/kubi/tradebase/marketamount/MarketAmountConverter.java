package com.kubi.tradebase.marketamount;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketAmountConverter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ0\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountConverter;", "", "<init>", "()V", "businessUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "side", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "toBusinessValue", "Ljava/math/BigDecimal;", "displayValue", "selectedUnit", "context", "Lcom/kubi/tradebase/marketamount/MarketAmountContext;", "toDisplayValue", "businessValue", "convert", "value", "from", TypedValues.TransitionType.S_TO, "CALCULATION_SCALE", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAmountConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAmountConverter.kt\ncom/kubi/tradebase/marketamount/MarketAmountConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class MarketAmountConverter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketAmountConverter f51569a = new MarketAmountConverter();

    /* JADX INFO: renamed from: com.kubi.tradebase.marketamount.b$a */
    /* JADX INFO: compiled from: MarketAmountConverter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MarketAmountSide.values().length];
            try {
                iArr[MarketAmountSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketAmountSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketAmountUnit.values().length];
            try {
                iArr2[MarketAmountUnit.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MarketAmountUnit.QUOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final MarketAmountUnit m63235a(@NotNull MarketAmountSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return side == MarketAmountSide.BUY ? MarketAmountUnit.QUOTE : MarketAmountUnit.BASE;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final BigDecimal m63236b(@NotNull BigDecimal value, @NotNull MarketAmountUnit from, @NotNull MarketAmountUnit to2, @NotNull MarketAmountSide side, @NotNull MarketAmountContext context) {
        BigDecimal bestAsk;
        BigDecimal bigDecimalMultiply;
        BigDecimal baseIncrement;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(context, "context");
        if (value.signum() < 0) {
            return null;
        }
        if (from == to2) {
            return value;
        }
        int i11 = a.$EnumSwitchMapping$0[side.ordinal()];
        if (i11 == 1) {
            bestAsk = context.getBestAsk();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bestAsk = context.getBestBid();
        }
        if (bestAsk != null) {
            if (bestAsk.signum() <= 0) {
                bestAsk = null;
            }
            if (bestAsk != null) {
                MarketAmountUnit marketAmountUnit = MarketAmountUnit.QUOTE;
                if (from == marketAmountUnit && to2 == MarketAmountUnit.BASE) {
                    bigDecimalMultiply = value.divide(bestAsk, 32, RoundingMode.DOWN);
                } else if (from == MarketAmountUnit.BASE && to2 == marketAmountUnit) {
                    bigDecimalMultiply = value.multiply(bestAsk);
                }
                int i12 = a.$EnumSwitchMapping$1[to2.ordinal()];
                if (i12 == 1) {
                    baseIncrement = context.getBaseIncrement();
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseIncrement = context.getQuoteIncrement();
                }
                if (baseIncrement.signum() <= 0) {
                    baseIncrement = null;
                }
                if (baseIncrement == null) {
                    return null;
                }
                return bigDecimalMultiply.divide(baseIncrement, 0, RoundingMode.DOWN).multiply(baseIncrement);
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final BigDecimal m63237c(@NotNull BigDecimal displayValue, @NotNull MarketAmountUnit selectedUnit, @NotNull MarketAmountSide side, @NotNull MarketAmountContext context) {
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        Intrinsics.checkNotNullParameter(selectedUnit, "selectedUnit");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(context, "context");
        return m63236b(displayValue, selectedUnit, m63235a(side), side, context);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final BigDecimal m63238d(@NotNull BigDecimal businessValue, @NotNull MarketAmountUnit selectedUnit, @NotNull MarketAmountSide side, @NotNull MarketAmountContext context) {
        Intrinsics.checkNotNullParameter(businessValue, "businessValue");
        Intrinsics.checkNotNullParameter(selectedUnit, "selectedUnit");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(context, "context");
        return m63236b(businessValue, m63235a(side), selectedUnit, side, context);
    }
}
