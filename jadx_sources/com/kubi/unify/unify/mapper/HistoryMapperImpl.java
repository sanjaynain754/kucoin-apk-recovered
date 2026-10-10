package com.kubi.unify.unify.mapper;

import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.unify.unify.common.history.UnifyPositionDetailEntity;
import com.kubi.unify.unify.common.history.UnifyProfitRecordEntity;
import com.kubi.unify.unify.common.history.UnifyTradeRecordEntity;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes52.dex */
public class HistoryMapperImpl implements HistoryMapper {
    @Override // com.kubi.unify.unify.mapper.HistoryMapper
    public ProfitDetailItemEntity toProfitDetailItemEntity(UnifyPositionDetailEntity unifyPositionDetailEntity) {
        if (unifyPositionDetailEntity == null) {
            return null;
        }
        return new ProfitDetailItemEntity(unifyPositionDetailEntity.getSymbol(), unifyPositionDetailEntity.getCurrency(), unifyPositionDetailEntity.getSide(), unifyPositionDetailEntity.getSize(), unifyPositionDetailEntity.getPrice(), unifyPositionDetailEntity.getTradeFee(), unifyPositionDetailEntity.getRealisedGrossCost(), unifyPositionDetailEntity.getRealisedGrossCost(), unifyPositionDetailEntity.getCreatedAt(), unifyPositionDetailEntity.getTax(), unifyPositionDetailEntity.getLiquidAmount(), unifyPositionDetailEntity.getType());
    }

    @Override // com.kubi.unify.unify.mapper.HistoryMapper
    public ProfitRecordEntity toProfitRecordEntity(UnifyProfitRecordEntity unifyProfitRecordEntity) {
        if (unifyProfitRecordEntity == null) {
            return null;
        }
        return new ProfitRecordEntity(unifyProfitRecordEntity.getPositionId(), unifyProfitRecordEntity.getSymbol(), unifyProfitRecordEntity.getCurrency(), 0, null, unifyProfitRecordEntity.getCloseTime(), unifyProfitRecordEntity.getRealisedCost(), unifyProfitRecordEntity.getDealComm(), unifyProfitRecordEntity.getFundingFee(), unifyProfitRecordEntity.getRealisedGrossCost(), unifyProfitRecordEntity.getRealisedGrossCost(), null, false, null, unifyProfitRecordEntity.getMarginMode(), unifyProfitRecordEntity.getTax(), unifyProfitRecordEntity.getRoe(), unifyProfitRecordEntity.getLiquidAmount(), unifyProfitRecordEntity.getLiquidPrice(), unifyProfitRecordEntity.getLeverage(), unifyProfitRecordEntity.getSide(), unifyProfitRecordEntity.getCloseType(), unifyProfitRecordEntity.getOpenTime(), null);
    }

    @Override // com.kubi.unify.unify.mapper.HistoryMapper
    public TradeRecordEntity toTradeRecordEntity(UnifyTradeRecordEntity unifyTradeRecordEntity) {
        if (unifyTradeRecordEntity == null) {
            return null;
        }
        String lowerCaseCustom = toLowerCaseCustom(unifyTradeRecordEntity.getOrderType());
        Long executionTime = unifyTradeRecordEntity.getExecutionTime();
        String lowerCaseCustom2 = toLowerCaseCustom(unifyTradeRecordEntity.getSide());
        BigDecimal fillPnl = unifyTradeRecordEntity.getFillPnl();
        String lowerCaseCustom3 = toLowerCaseCustom(unifyTradeRecordEntity.getLiquidityRole());
        TradeRecordEntity tradeRecordEntity = new TradeRecordEntity(unifyTradeRecordEntity.getTradeId(), unifyTradeRecordEntity.getOrderId(), unifyTradeRecordEntity.getSymbol(), lowerCaseCustom2, lowerCaseCustom, unifyTradeRecordEntity.getFillType(), null, executionTime, unifyTradeRecordEntity.getPrice(), unifyTradeRecordEntity.getFee(), unifyTradeRecordEntity.getFeeCurrency(), lowerCaseCustom3, unifyTradeRecordEntity.getTax(), unifyTradeRecordEntity.getTaxCurrency(), unifyTradeRecordEntity.getSize(), unifyTradeRecordEntity.getValue(), unifyTradeRecordEntity.getLiquidationPrice(), false, null, null, "BOTH", fillPnl, null);
        afterMapping(tradeRecordEntity, unifyTradeRecordEntity);
        return tradeRecordEntity;
    }
}
