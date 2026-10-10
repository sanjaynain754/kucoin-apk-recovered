package p199dd;

import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: compiled from: HistoryOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, m90084d2 = {"toHistoryOrdersUiDataItemEntity", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "getAmountUnit", "", "isMarket", "", "side", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36661a {
    /* JADX INFO: renamed from: a */
    public static final String m82026a(boolean z11, String str, SymbolInfoEntity symbolInfoEntity) {
        if (!z11) {
            return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null, "--");
        }
        if (StringsKt.equals("buy", str, true)) {
            return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null, "--");
        }
        return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null, "--");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final HistoryOrdersUiData$ItemEntity m82027b(@NotNull ResponseItemEntity responseItemEntity) {
        Intrinsics.checkNotNullParameter(responseItemEntity, "<this>");
        String orderId = responseItemEntity.getOrderId();
        String symbol = responseItemEntity.getSymbol();
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbol);
        String side = responseItemEntity.getSide();
        Long orderTime = responseItemEntity.getOrderTime();
        Boolean hidden = responseItemEntity.getHidden();
        Boolean iceberg = responseItemEntity.getIceberg();
        String avgPrice = responseItemEntity.getAvgPrice();
        String filledSize = responseItemEntity.getFilledSize();
        String size = responseItemEntity.getSize();
        String orderType = responseItemEntity.getOrderType();
        String stp = responseItemEntity.getStp();
        String status = responseItemEntity.getStatus();
        String orderDisplayType = responseItemEntity.getOrderDisplayType();
        if (orderDisplayType == null) {
            return null;
        }
        switch (orderDisplayType.hashCode()) {
            case 48:
                if (orderDisplayType.equals("0")) {
                    return new HistoryOrdersUiData$ItemEntity.Limit(responseItemEntity.getPrice(), orderId, symbol, symbolInfoEntityM85601B, hidden, iceberg, side, orderTime, avgPrice, filledSize, size, orderType, stp, status, responseItemEntity.getFunds(), responseItemEntity.getFilledFunds(), m82026a(false, side, symbolInfoEntityM85601B), responseItemEntity.getFee(), responseItemEntity.getFeeCurrency(), responseItemEntity.getTax(), responseItemEntity.getTaxCurrency(), responseItemEntity.getCancelReason());
                }
                return null;
            case 49:
                if (orderDisplayType.equals("1")) {
                    return new HistoryOrdersUiData$ItemEntity.Market(orderId, symbol, symbolInfoEntityM85601B, hidden, iceberg, side, orderTime, avgPrice, filledSize, size, orderType, stp, status, responseItemEntity.getFunds(), responseItemEntity.getFilledFunds(), m82026a(true, side, symbolInfoEntityM85601B), responseItemEntity.getFee(), responseItemEntity.getFeeCurrency(), responseItemEntity.getTax(), responseItemEntity.getTaxCurrency(), responseItemEntity.getCancelReason());
                }
                return null;
            case 50:
                if (!orderDisplayType.equals("2")) {
                    return null;
                }
                return new HistoryOrdersUiData$ItemEntity.StopLimit(responseItemEntity.getPrice(), responseItemEntity.getTriggerDirection(), responseItemEntity.getTriggerPrice(), responseItemEntity.getTriggerPriceType(), orderId, symbol, symbolInfoEntityM85601B, hidden, iceberg, side, orderTime, avgPrice, filledSize, size, orderType, stp, status, responseItemEntity.getFunds(), responseItemEntity.getFilledFunds(), m82026a(false, side, symbolInfoEntityM85601B), responseItemEntity.getFee(), responseItemEntity.getFeeCurrency(), responseItemEntity.getTax(), responseItemEntity.getTaxCurrency(), responseItemEntity.getCancelReason());
            case 51:
                if (!orderDisplayType.equals("3")) {
                    return null;
                }
                return new HistoryOrdersUiData$ItemEntity.StopMarket(responseItemEntity.getTriggerDirection(), responseItemEntity.getTriggerPrice(), responseItemEntity.getTriggerPriceType(), orderId, symbol, symbolInfoEntityM85601B, hidden, iceberg, side, orderTime, avgPrice, filledSize, size, orderType, stp, status, responseItemEntity.getFunds(), responseItemEntity.getFilledFunds(), m82026a(true, side, symbolInfoEntityM85601B), responseItemEntity.getFee(), responseItemEntity.getFeeCurrency(), responseItemEntity.getTax(), responseItemEntity.getTaxCurrency(), responseItemEntity.getCancelReason());
            case 52:
                if (orderDisplayType.equals("4")) {
                    return new HistoryOrdersUiData$ItemEntity.AdvancedLimit(responseItemEntity.getPrice(), responseItemEntity.getTimeInForce(), orderId, symbol, symbolInfoEntityM85601B, hidden, iceberg, side, orderTime, avgPrice, filledSize, size, orderType, stp, status, responseItemEntity.getFunds(), responseItemEntity.getFilledFunds(), m82026a(false, side, symbolInfoEntityM85601B), responseItemEntity.getFee(), responseItemEntity.getFeeCurrency(), responseItemEntity.getTax(), responseItemEntity.getTaxCurrency(), responseItemEntity.getCancelReason());
                }
                return null;
            default:
                return null;
        }
    }
}
