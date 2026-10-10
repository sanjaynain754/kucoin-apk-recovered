package com.kubi.margin.trade;

import com.google.firebase.messaging.Constants;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.margin.trade.d3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarginBehavior.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J@\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\n0\u0013H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0014H&J\b\u0010\u001c\u001a\u00020\u0014H&J\b\u0010\u001d\u001a\u00020\u0019H&J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H&J\b\u0010\"\u001a\u00020\u0014H&J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0014H&J\b\u0010$\u001a\u00020\nH&J\u0018\u0010%\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0014H&J\b\u0010(\u001a\u00020\nH&J\b\u0010)\u001a\u00020\nH&J\b\u0010*\u001a\u00020\u0019H&J\b\u0010+\u001a\u00020\u0019H&J\u0018\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/IMarginParentBehavior;", "Lcom/kubi/margin/trade/IMarginBehavior;", "lastTradeMode", "", "lastTradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "bboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "lastPrecision", "showOrderBookAmountDialog", "", "showOrderPrecisionDialog", "requestOrder", "marketOderParams", "", "", "tradeTypeRequestOrder", "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "orderMode", "isIsolateTrade", "onClickOrderBookPrice", "value", "Ljava/math/BigDecimal;", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "currentLeverage", "showResetLeverageDialog", "baseAsset", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quoteAsset", "isBuy", "setIsBuy", "showBorrowModeDialog", "showAvailableTips", "showBorrowTips", "isStop", "showRepayTips", "showDebtTips", "getBestAskPrice", "getBestBidPrice", "onTradeTypeChanged", Constants.ScionAnalytics.PARAM_LABEL, "index", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarginParentBehavior extends IMarginBehavior {
    @NotNull
    /* JADX INFO: renamed from: G */
    OrderBookCenterEntity m40035G();

    @NotNull
    /* JADX INFO: renamed from: G1 */
    BigDecimal m40036G1();

    /* JADX INFO: renamed from: L */
    boolean m40037L();

    /* JADX INFO: renamed from: N0 */
    void m40038N0(boolean z11);

    /* JADX INFO: renamed from: S0 */
    boolean m40039S0();

    /* JADX INFO: renamed from: T */
    void m40040T(@NotNull BigDecimal bigDecimal);

    @NotNull
    /* JADX INFO: renamed from: T1 */
    BigDecimal m40041T1();

    /* JADX INFO: renamed from: W0 */
    int m40042W0();

    /* JADX INFO: renamed from: X */
    int m40043X();

    /* JADX INFO: renamed from: Y */
    void m40044Y();

    /* JADX INFO: renamed from: Z1 */
    void m40045Z1(@NotNull CurrencyBalance currencyBalance, @NotNull CurrencyBalance currencyBalance2);

    @NotNull
    /* JADX INFO: renamed from: a1 */
    BigDecimal m40046a1();

    /* JADX INFO: renamed from: i1 */
    void m40047i1();

    /* JADX INFO: renamed from: i2 */
    void m40048i2();

    /* JADX INFO: renamed from: l0 */
    void m40049l0();

    /* JADX INFO: renamed from: p0 */
    void m40050p0(@NotNull String str, int i11);

    @NotNull
    /* JADX INFO: renamed from: v0 */
    TradeType m40051v0();

    /* JADX INFO: renamed from: z2 */
    void m40052z2();
}
