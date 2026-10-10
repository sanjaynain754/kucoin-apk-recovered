package p401kd;

import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.TriggerDirection;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kd.l */
/* JADX INFO: compiled from: OrderItemData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\f*\u00020\u0002\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u001a\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0000\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¨\u0006\u001c"}, m90084d2 = {"isMarket", "", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "isBuy", "getShowSymbol", "", "getTriggerPriceDisplay", "getTriggerDirectionDisplay", "triggerDirection", "getOrderTypeName", "getDealPercent", "getDealPercentValue", "Ljava/math/BigDecimal;", "getDealProgress", "", "getTriggerPriceFormatterStr", "getPriceFormatterStr", "getShowHideTag", "getDealAmount", "getTotalAmount", "isFunds", "getAmountFormatterStr", "value", "getAmountUnit", "item", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41008l {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m89878b(boolean z11, @Nullable OrderItem orderItem, @Nullable SymbolInfoEntity symbolInfoEntity) {
        BigDecimal funds;
        BigDecimal size;
        if (z11) {
            if (orderItem == null || (funds = orderItem.getFunds()) == null) {
                funds = BigDecimal.ZERO;
            }
            if (orderItem == null || (size = orderItem.getSize()) == null) {
                size = BigDecimal.ZERO;
            }
            if (funds.compareTo(size) > 0) {
                return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrencyName() : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
            }
        }
        return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrencyName() : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m89877a(@NotNull InterfaceC41007k interfaceC41007k, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return C27041f.m66669i(bigDecimal != null ? C42180b.m92640e(bigDecimal, RoundingMode.DOWN, C27039d.m66651k(m89891o(interfaceC41007k) ? interfaceC41007k.getQuoteIncrementPrecision() : interfaceC41007k.getBaseIncrementPrecision(), 8), false, true, false, 2, null, 80, null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final BigDecimal m89879c(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return m89891o(interfaceC41007k) ? interfaceC41007k.getFilledFunds() : interfaceC41007k.getFilledSize();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m89880d(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return C42180b.m92642g(m89881e(interfaceC41007k), null, null, 0, false, false, false, 63, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final BigDecimal m89881e(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        BigDecimal bigDecimalM89922G = C41014a.m89922G(interfaceC41007k.getSize(), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) == 0) {
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        BigDecimal bigDecimalDivide = C41014a.m89922G(interfaceC41007k.getFilledSize(), null, 1, null).divide(C41014a.m89922G(interfaceC41007k.getSize(), null, 1, null), 4, RoundingMode.DOWN);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }

    /* JADX INFO: renamed from: f */
    public static final int m89882f(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        if (C41014a.m89922G(interfaceC41007k.getSize(), null, 1, null).compareTo(BigDecimal.ZERO) == 0) {
            return 0;
        }
        return C41014a.m89922G(interfaceC41007k.getFilledSize(), null, 1, null).divide(C41014a.m89922G(interfaceC41007k.getSize(), null, 1, null), 2, 4).multiply(new BigDecimal(C33556b3.f68995S)).intValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m89883g(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        String orderDisplayType = interfaceC41007k.getOrderDisplayType();
        if (orderDisplayType != null) {
            switch (orderDisplayType.hashCode()) {
                case 48:
                    if (orderDisplayType.equals("0")) {
                        return C27017c.f54310a.m66516f(R$string.limit_price_trade, new Object[0]);
                    }
                    break;
                case 49:
                    if (orderDisplayType.equals("1")) {
                        return C27017c.f54310a.m66516f(R$string.market_price_trade, new Object[0]);
                    }
                    break;
                case 50:
                    if (orderDisplayType.equals("2")) {
                        return C27017c.f54310a.m66516f(R$string.limit_price_stop, new Object[0]);
                    }
                    break;
                case 51:
                    if (orderDisplayType.equals("3")) {
                        return C27017c.f54310a.m66516f(R$string.market_price_stop, new Object[0]);
                    }
                    break;
                case 52:
                    if (orderDisplayType.equals("4")) {
                        return C27017c.f54310a.m66516f(R$string.kc_advanced_limit_order, new Object[0]);
                    }
                    break;
            }
        }
        return C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m89884h(@NotNull InterfaceC41007k interfaceC41007k) {
        BigDecimal bigDecimal;
        BigDecimal price;
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        if (m89892p(interfaceC41007k)) {
            return C27017c.f54310a.m66516f(R$string.market_price, new Object[0]);
        }
        if (!(interfaceC41007k instanceof InterfaceC41007k.Limit)) {
            if (interfaceC41007k instanceof InterfaceC41007k.ConditionalLimit) {
                price = ((InterfaceC41007k.ConditionalLimit) interfaceC41007k).getPrice();
            } else {
                bigDecimal = null;
            }
            return C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, interfaceC41007k.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
        }
        price = ((InterfaceC41007k.Limit) interfaceC41007k).getPrice();
        bigDecimal = price;
        return C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, interfaceC41007k.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m89885i(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return interfaceC41007k.getIsHidden() || interfaceC41007k.getIsIceberg();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m89886j(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        String showSymbol = interfaceC41007k.getShowSymbol();
        if (showSymbol != null && showSymbol.length() != 0) {
            return C27041f.m66669i(interfaceC41007k.getShowSymbol(), C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
        }
        String symbol = interfaceC41007k.getSymbol();
        return C27041f.m66669i(symbol != null ? StringsKt.replace$default(symbol, C33820nf.f71144W, "/", false, 4, (Object) null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final BigDecimal m89887k(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return m89891o(interfaceC41007k) ? interfaceC41007k.getFunds() : interfaceC41007k.getSize();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m89888l(@Nullable String str) {
        if (Intrinsics.areEqual(str, TriggerDirection.C11622UP.INSTANCE.getParam())) {
            return "≥";
        }
        return Intrinsics.areEqual(str, TriggerDirection.DOWN.INSTANCE.getParam()) ? "≤" : "";
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m89889m(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        if (interfaceC41007k instanceof InterfaceC41007k.ConditionalLimit) {
            return m89888l(((InterfaceC41007k.ConditionalLimit) interfaceC41007k).getTriggerDirection()) + m89890n(interfaceC41007k);
        }
        if (!(interfaceC41007k instanceof InterfaceC41007k.ConditionalMarket)) {
            return m89890n(interfaceC41007k);
        }
        return m89888l(((InterfaceC41007k.ConditionalMarket) interfaceC41007k).getTriggerDirection()) + m89890n(interfaceC41007k);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m89890n(@NotNull InterfaceC41007k interfaceC41007k) {
        BigDecimal bigDecimal;
        BigDecimal triggerPrice;
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        if (!(interfaceC41007k instanceof InterfaceC41007k.ConditionalMarket)) {
            if (interfaceC41007k instanceof InterfaceC41007k.ConditionalLimit) {
                triggerPrice = ((InterfaceC41007k.ConditionalLimit) interfaceC41007k).getTriggerPrice();
            } else {
                bigDecimal = null;
            }
            return C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, interfaceC41007k.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
        }
        triggerPrice = ((InterfaceC41007k.ConditionalMarket) interfaceC41007k).getTriggerPrice();
        bigDecimal = triggerPrice;
        return C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, interfaceC41007k.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m89891o(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        if (!m89892p(interfaceC41007k)) {
            return false;
        }
        BigDecimal funds = interfaceC41007k.getFunds();
        if (funds == null) {
            funds = BigDecimal.ZERO;
        }
        BigDecimal size = interfaceC41007k.getSize();
        if (size == null) {
            size = BigDecimal.ZERO;
        }
        return funds.compareTo(size) > 0;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m89892p(@NotNull InterfaceC41007k interfaceC41007k) {
        Intrinsics.checkNotNullParameter(interfaceC41007k, "<this>");
        return (interfaceC41007k instanceof InterfaceC41007k.Market) || (interfaceC41007k instanceof InterfaceC41007k.ConditionalMarket);
    }
}
