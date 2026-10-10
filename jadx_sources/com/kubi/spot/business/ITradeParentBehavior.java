package com.kubi.spot.business;

import com.google.firebase.messaging.Constants;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.business.b2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeBehavior.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J@\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000e0\u0018H&J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H&J\b\u0010\u001f\u001a\u00020\u0019H&J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H&J\b\u0010!\u001a\u00020\u0019H&J\b\u0010\"\u001a\u00020\u0019H&J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0019H&J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/ITradeParentBehavior;", "Lcom/kubi/spot/business/ITradeBehavior;", "getActiveDelegationList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "lastTradeMode", "", "lastTradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "bboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "lastPrecision", "refreshButtonStatus", "", "showOrderBookAmountDialog", "showOrderPrecisionDialog", "requestOrder", "marketOderParams", "", "", "tradeTypeRequestOrder", "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "onClickOrderBookPrice", "value", "Ljava/math/BigDecimal;", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "setOcoStopLimitPriceFocused", "isOcoStopLimitPriceFocused", "isBuy", "setIsBuy", "onTradeTypeChanged", Constants.ScionAnalytics.PARAM_LABEL, "index", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeParentBehavior extends ITradeBehavior {
    @NotNull
    /* JADX INFO: renamed from: G */
    OrderBookCenterEntity mo60304G();

    /* JADX INFO: renamed from: L */
    boolean mo60305L();

    /* JADX INFO: renamed from: T */
    void mo60306T(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: X */
    int mo60307X();

    /* JADX INFO: renamed from: Y */
    void mo60308Y();

    /* JADX INFO: renamed from: f0 */
    void mo60309f0();

    /* JADX INFO: renamed from: l0 */
    void mo60310l0();

    /* JADX INFO: renamed from: p0 */
    void mo60311p0(@NotNull String str, int i11);

    /* JADX INFO: renamed from: s0 */
    int mo60312s0();

    @NotNull
    /* JADX INFO: renamed from: v0 */
    TradeType mo60313v0();

    @NotNull
    /* JADX INFO: renamed from: z0 */
    ArrayList<OrderBookIndex> mo60314z0();
}
