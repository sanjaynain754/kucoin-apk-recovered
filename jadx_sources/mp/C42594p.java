package mp;

import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.margin.api.entity.MarginBridgeConfig;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.entity.LeverConfig;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: mp.p */
/* JADX INFO: compiled from: MarginService.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"toBridgeConfig", "Lcom/kubi/margin/api/entity/MarginBridgeConfig;", "Lcom/kubi/margin/entity/LeverConfig;", "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "tradeEnable", "", "(Lcom/kubi/margin/entity/IsolateMarginPositionConfig;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42594p {
    /* JADX INFO: renamed from: c */
    public static final IsolatedMarginBridgeConfig m93384c(IsolateMarginPositionConfig isolateMarginPositionConfig, Boolean bool) {
        return new IsolatedMarginBridgeConfig(isolateMarginPositionConfig.getSymbol(), isolateMarginPositionConfig.getFlDebtRatio(), isolateMarginPositionConfig.getDefaultLeverage(), isolateMarginPositionConfig.getMaxLeverage(), isolateMarginPositionConfig.getRiskLeverage(), isolateMarginPositionConfig.getBaseBorrowEnable(), isolateMarginPositionConfig.getQuoteBorrowEnable(), isolateMarginPositionConfig.getBaseMaxBorrowAmount(), isolateMarginPositionConfig.getQuoteMaxBorrowAmount(), isolateMarginPositionConfig.getAutoRenewMaxDebtRatio(), isolateMarginPositionConfig.getBaseMaxBuyAmount(), isolateMarginPositionConfig.getQuoteMaxBuyAmount(), isolateMarginPositionConfig.getBorrowBufferRatio(), isolateMarginPositionConfig.getWarnDebtRatio(), isolateMarginPositionConfig.getTransferOutMaxDebtRatio(), isolateMarginPositionConfig.getTransferOutBufferRatio(), isolateMarginPositionConfig.getBaseBorrowCoefficient(), isolateMarginPositionConfig.getQuoteBorrowCoefficient(), isolateMarginPositionConfig.getBaseMarginCoefficient(), isolateMarginPositionConfig.getQuoteMarginCoefficient(), isolateMarginPositionConfig.getEnable(), bool, isolateMarginPositionConfig.getBaseTransferInEnable(), isolateMarginPositionConfig.getQuoteTransferInEnable(), isolateMarginPositionConfig.getPnlPrecision());
    }

    /* JADX INFO: renamed from: d */
    public static final MarginBridgeConfig m93385d(LeverConfig leverConfig) {
        return new MarginBridgeConfig(leverConfig.getBorrowableDebtBufferRatio(), leverConfig.getEarlyWarningDebtRatio(), leverConfig.getLiquidationDebtRatio(), leverConfig.getMaxAutoLoanDebtRatio(), leverConfig.getMaxLeverage(), leverConfig.getDefaultLeverage(), leverConfig.getTransferableAmountDebtBufferRatio(), leverConfig.getTransferableAmountDebtRatio(), leverConfig.getRiskLeverage(), leverConfig.getRiskGrade(), leverConfig.getRemindPriceDeviateRatio());
    }
}
