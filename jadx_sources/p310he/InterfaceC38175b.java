package p310he;

import com.google.firebase.messaging.Constants;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: he.b */
/* JADX INFO: compiled from: ITradeBehavior.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH&J@\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0017H&J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0018H&J\b\u0010\u001e\u001a\u00020\u0018H&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0018H&J\b\u0010 \u001a\u00020\u0018H&J\b\u0010!\u001a\u00020\u0018H&J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0018H&J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/ITradeParentBehavior;", "", "getActiveDelegationList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "bboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "lastPrecision", "", "showOrderBookAmountDialog", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "showOrderPrecisionDialog", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "requestOrder", "marketOderParams", "", "", "tradeTypeRequestOrder", "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "onClickOrderBookPrice", "value", "Ljava/math/BigDecimal;", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "setOcoStopLimitPriceFocused", "isOcoStopLimitPriceFocused", "isBuy", "setIsBuy", "onTradeTypeChanged", Constants.ScionAnalytics.PARAM_LABEL, "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38175b {
    /* JADX INFO: renamed from: D */
    void mo22355D(@NotNull SymbolInfoEntity symbolInfoEntity);

    @NotNull
    /* JADX INFO: renamed from: G */
    OrderBookCenterEntity mo22356G();

    /* JADX INFO: renamed from: L */
    boolean mo22362L();

    /* JADX INFO: renamed from: T */
    void mo22369T(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: e */
    void mo22376e(@NotNull String str, @NotNull TradeType tradeType);

    /* JADX INFO: renamed from: n */
    void mo22384n(@NotNull SymbolInfoEntity symbolInfoEntity);

    /* JADX INFO: renamed from: s0 */
    int mo22387s0();

    @NotNull
    /* JADX INFO: renamed from: z0 */
    ArrayList<OrderBookIndex> mo22391z0();
}
