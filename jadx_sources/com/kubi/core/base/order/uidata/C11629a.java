package com.kubi.core.base.order.uidata;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.order.data.TradeSide;
import com.kubi.core.base.order.data.TriggerDirection;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.core.base.order.uidata.a */
/* JADX INFO: compiled from: HistoryOrdersUiDataExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0007\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\n\u0010\u0018\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0019\u001a\u00020\f*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u001c\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0002\u001a\u001c\u0010\u001e\u001a\u00020\u0005*\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u0001\u001a\u001e\u0010!\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u0001\u001a\u0014\u0010\"\u001a\u00020\u0005*\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u000f\u001a\n\u0010$\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010%\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010&\u001a\u00020\u0005*\u00020\u0002¨\u0006'"}, m90084d2 = {"isMarket", "", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "isBuy", "getTriggerPriceFormatterStr", "", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;", "getStatusDetailDisplay", "context", "Landroid/content/Context;", "getStatusStrRes", "", "getStatusCancelReasonTip", "getDealAmount", "Ljava/math/BigDecimal;", "getTotalAmount", "isFunds", "getAmountUnitDisplay", "getDealPercentStr", "getDealPercent", "scale", "roundingMode", "Ljava/math/RoundingMode;", "getSubType", "getSideDisplayRes", "isMatchPriceLimit", "getShowSymbol", "getTypeString", "needShowHideTag", "getAmountFormatterStr", "value", "isQuote", "getAmountFormatNumber", "getPriceFormatterStr", FirebaseAnalytics.Param.PRICE, "getFeeDisplayStr", "needShowTaxTag", "getTaxDisplayStr", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11629a {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m21098a(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, @Nullable BigDecimal bigDecimal, boolean z11) {
        int baseIncrementPrecision;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        SymbolInfoEntity symbolInfo = historyOrdersUiData$ItemEntity.getSymbolInfo();
        if (z11) {
            if (symbolInfo != null) {
                baseIncrementPrecision = symbolInfo.getQuoteIncrementPrecision();
                numValueOf = Integer.valueOf(baseIncrementPrecision);
            } else {
                numValueOf = null;
            }
        } else if (symbolInfo != null) {
            baseIncrementPrecision = symbolInfo.getBaseIncrementPrecision();
            numValueOf = Integer.valueOf(baseIncrementPrecision);
        } else {
            numValueOf = null;
        }
        if (bigDecimal != null) {
            return C42180b.m92640e(bigDecimal, RoundingMode.DOWN, C27039d.m66651k(numValueOf, 8), false, true, false, 2, null, 80, null);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m21099b(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, @Nullable BigDecimal bigDecimal, boolean z11) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return C27041f.m66669i(m21098a(historyOrdersUiData$ItemEntity, bigDecimal, z11), C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m21100c(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if (m21118u(historyOrdersUiData$ItemEntity)) {
            SymbolInfoEntity symbolInfo = historyOrdersUiData$ItemEntity.getSymbolInfo();
            return C27041f.m66669i(symbolInfo != null ? symbolInfo.getQuoteCurrencyName() : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
        }
        SymbolInfoEntity symbolInfo2 = historyOrdersUiData$ItemEntity.getSymbolInfo();
        return C27041f.m66669i(symbolInfo2 != null ? symbolInfo2.getBaseCurrencyName() : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final BigDecimal m21101d(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if (m21118u(historyOrdersUiData$ItemEntity)) {
            String filledFunds = historyOrdersUiData$ItemEntity.getFilledFunds();
            if (filledFunds != null) {
                return StringsKt.toBigDecimalOrNull(filledFunds);
            }
            return null;
        }
        String dealSize = historyOrdersUiData$ItemEntity.getDealSize();
        if (dealSize != null) {
            return StringsKt.toBigDecimalOrNull(dealSize);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m21103f(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return C42180b.m92642g(m21102e(historyOrdersUiData$ItemEntity, 4, RoundingMode.DOWN), null, null, 0, false, false, false, 63, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m21104g(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        BigDecimal bigDecimalM66535e;
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        String fee = historyOrdersUiData$ItemEntity.getFee();
        String str = null;
        String strM21098a = m21098a(historyOrdersUiData$ItemEntity, (fee == null || (bigDecimalM66535e = DowngradeExKt.m66535e(fee, null, 1, null)) == null) ? null : bigDecimalM66535e.negate(), true);
        if (strM21098a != null) {
            str = strM21098a + ' ' + historyOrdersUiData$ItemEntity.getFeeCurrency();
        }
        return C27041f.m66669i(str, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m21105h(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, historyOrdersUiData$ItemEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m21106i(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        SymbolInfoEntity symbolInfo = historyOrdersUiData$ItemEntity.getSymbolInfo();
        return C27041f.m66669i(symbolInfo != null ? symbolInfo.getShowSymbol() : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    /* JADX INFO: renamed from: j */
    public static final int m21107j(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if (StringsKt.equals(historyOrdersUiData$ItemEntity.getSide(), TradeSide.BUY.INSTANCE.getParam(), true)) {
            return R$string.buy;
        }
        return StringsKt.equals(historyOrdersUiData$ItemEntity.getSide(), TradeSide.SELL.INSTANCE.getParam(), true) ? R$string.sell : R$string.other;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final String m21108k(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return historyOrdersUiData$ItemEntity.getCancelReason();
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final String m21109l(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if ((historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopLimit) || (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopMarket)) {
            if (context != null) {
                return context.getString(m21110m(historyOrdersUiData$ItemEntity));
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context != null ? context.getString(m21110m(historyOrdersUiData$ItemEntity)) : null);
        sb2.append('(');
        sb2.append(C42828b.m93915p(m21103f(historyOrdersUiData$ItemEntity)));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public static final int m21110m(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        String status = historyOrdersUiData$ItemEntity.getStatus();
        if (status != null) {
            int iHashCode = status.hashCode();
            if (iHashCode != 49) {
                if (iHashCode != 51) {
                    return iHashCode != 53 ? R$string.canceled_order : R$string.canceled_order;
                }
                if (status.equals("3")) {
                    return R$string.completed;
                }
            } else if (status.equals("1")) {
                return R$string.unified_triggered_order;
            }
        }
        return R$string.stub;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m21111n(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        String timeInForce;
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if ((historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.AdvancedLimit) && (timeInForce = ((HistoryOrdersUiData$ItemEntity.AdvancedLimit) historyOrdersUiData$ItemEntity).getTimeInForce()) != null) {
            int iHashCode = timeInForce.hashCode();
            if (iHashCode != 69794) {
                if (iHashCode != 70902) {
                    if (iHashCode == 72669 && timeInForce.equals(AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC)) {
                        return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_ioc_key, new Object[0]) + ')';
                    }
                } else if (timeInForce.equals("GTC")) {
                    return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_post_only_key, new Object[0]) + ')';
                }
            } else if (timeInForce.equals(AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK)) {
                return '(' + C27017c.f54310a.m66516f(R$string.kc_advanced_limit_fok_key, new Object[0]) + ')';
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m21112o(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        BigDecimal bigDecimalM66535e;
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        String tax = historyOrdersUiData$ItemEntity.getTax();
        String str = null;
        String strM21098a = m21098a(historyOrdersUiData$ItemEntity, (tax == null || (bigDecimalM66535e = DowngradeExKt.m66535e(tax, null, 1, null)) == null) ? null : bigDecimalM66535e.negate(), true);
        if (strM21098a != null) {
            str = strM21098a + ' ' + historyOrdersUiData$ItemEntity.getTaxCurrency();
        }
        return C27041f.m66669i(str, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static final BigDecimal m21113p(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if (m21118u(historyOrdersUiData$ItemEntity)) {
            String funds = historyOrdersUiData$ItemEntity.getFunds();
            if (funds != null) {
                return StringsKt.toBigDecimalOrNull(funds);
            }
            return null;
        }
        String size = historyOrdersUiData$ItemEntity.getSize();
        if (size != null) {
            return StringsKt.toBigDecimalOrNull(size);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m21114q(@NotNull HistoryOrdersUiData$ItemEntity.StopLimit stopLimit) {
        Intrinsics.checkNotNullParameter(stopLimit, "<this>");
        String triggerDirection = stopLimit.getTriggerDirection();
        if (Intrinsics.areEqual(triggerDirection, TriggerDirection.C11622UP.INSTANCE.getParam())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Typography.greaterOrEqual);
            String triggerPrice = stopLimit.getTriggerPrice();
            sb2.append(m21105h(stopLimit, triggerPrice != null ? StringsKt.toBigDecimalOrNull(triggerPrice) : null));
            return sb2.toString();
        }
        if (!Intrinsics.areEqual(triggerDirection, TriggerDirection.DOWN.INSTANCE.getParam())) {
            String triggerPrice2 = stopLimit.getTriggerPrice();
            return m21105h(stopLimit, triggerPrice2 != null ? StringsKt.toBigDecimalOrNull(triggerPrice2) : null);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Typography.lessOrEqual);
        String triggerPrice3 = stopLimit.getTriggerPrice();
        sb3.append(m21105h(stopLimit, triggerPrice3 != null ? StringsKt.toBigDecimalOrNull(triggerPrice3) : null));
        return sb3.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m21115r(@NotNull HistoryOrdersUiData$ItemEntity.StopMarket stopMarket) {
        Intrinsics.checkNotNullParameter(stopMarket, "<this>");
        String triggerDirection = stopMarket.getTriggerDirection();
        if (Intrinsics.areEqual(triggerDirection, TriggerDirection.C11622UP.INSTANCE.getParam())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Typography.greaterOrEqual);
            String triggerPrice = stopMarket.getTriggerPrice();
            sb2.append(m21105h(stopMarket, triggerPrice != null ? StringsKt.toBigDecimalOrNull(triggerPrice) : null));
            return sb2.toString();
        }
        if (!Intrinsics.areEqual(triggerDirection, TriggerDirection.DOWN.INSTANCE.getParam())) {
            String triggerPrice2 = stopMarket.getTriggerPrice();
            return m21105h(stopMarket, triggerPrice2 != null ? StringsKt.toBigDecimalOrNull(triggerPrice2) : null);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Typography.lessOrEqual);
        String triggerPrice3 = stopMarket.getTriggerPrice();
        sb3.append(m21105h(stopMarket, triggerPrice3 != null ? StringsKt.toBigDecimalOrNull(triggerPrice3) : null));
        return sb3.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m21116s(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.Limit) {
            return C27017c.f54310a.m66516f(R$string.limit_price_trade, new Object[0]);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopLimit) {
            return C27017c.f54310a.m66516f(R$string.limit_price_stop, new Object[0]);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.AdvancedLimit) {
            return C27017c.f54310a.m66516f(R$string.kc_advanced_limit_order, new Object[0]);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.Market) {
            return C27017c.f54310a.m66516f(R$string.market_price_trade, new Object[0]);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopMarket) {
            return C27017c.f54310a.m66516f(R$string.market_price_stop, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m21117t(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return StringsKt.equals(TradeSide.BUY.INSTANCE.getParam(), historyOrdersUiData$ItemEntity.getSide(), true);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m21118u(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        String funds = historyOrdersUiData$ItemEntity.getFunds();
        BigDecimal bigDecimalOrNull = funds != null ? StringsKt.toBigDecimalOrNull(funds) : null;
        String size = historyOrdersUiData$ItemEntity.getSize();
        BigDecimal bigDecimalOrNull2 = size != null ? StringsKt.toBigDecimalOrNull(size) : null;
        if (!m21119v(historyOrdersUiData$ItemEntity)) {
            return false;
        }
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = BigDecimal.ZERO;
        }
        if (bigDecimalOrNull2 == null) {
            bigDecimalOrNull2 = BigDecimal.ZERO;
        }
        return bigDecimalOrNull.compareTo(bigDecimalOrNull2) > 0;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m21119v(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.Market) || (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopMarket);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m21120w(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return StringsKt.equals("PriceLimited", historyOrdersUiData$ItemEntity.getCancelReason(), true);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m21121x(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        Boolean hidden = historyOrdersUiData$ItemEntity.getHidden();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.areEqual(hidden, bool) || Intrinsics.areEqual(historyOrdersUiData$ItemEntity.getIceberg(), bool);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m21122y(@NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        Intrinsics.checkNotNullParameter(historyOrdersUiData$ItemEntity, "<this>");
        return !C41014a.m89919D(DowngradeExKt.m66535e(historyOrdersUiData$ItemEntity.getTax(), null, 1, null));
    }

    /* JADX INFO: renamed from: e */
    public static final BigDecimal m21102e(HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, int i11, RoundingMode roundingMode) {
        BigDecimal bigDecimalM89922G = C41014a.m89922G(m21101d(historyOrdersUiData$ItemEntity), null, 1, null);
        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(m21113p(historyOrdersUiData$ItemEntity), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G2.compareTo(bigDecimal) == 0) {
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        BigDecimal bigDecimalDivide = bigDecimalM89922G.divide(bigDecimalM89922G2, i11, roundingMode);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }
}
