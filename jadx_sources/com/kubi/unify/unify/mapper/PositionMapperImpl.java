package com.kubi.unify.unify.mapper;

import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.unify.entity.UnifyPositionEntity;

/* JADX INFO: loaded from: classes52.dex */
public class PositionMapperImpl implements PositionMapper {
    @Override // com.kubi.unify.unify.mapper.PositionMapper
    public PositionEntity toPositionEntity(UnifyPositionEntity unifyPositionEntity) {
        if (unifyPositionEntity == null) {
            return null;
        }
        PositionEntity positionEntity = new PositionEntity();
        positionEntity.setId(unifyPositionEntity.getPositionId());
        positionEntity.setCurrentQty(unifyPositionEntity.getCurrentQuantity());
        positionEntity.setAvgEntryPrice(unifyPositionEntity.getAvgPrice());
        positionEntity.setRealLeverage(unifyPositionEntity.getLeverage());
        positionEntity.setUnrealisedPnl(unifyPositionEntity.getUnrealisedCost());
        positionEntity.setOpeningTimestamp(unifyPositionEntity.getOpenTime());
        positionEntity.setTax(unifyPositionEntity.getCumulativeTax());
        positionEntity.setFundingFee(unifyPositionEntity.getCumulativeFundingFee());
        positionEntity.setDealComm(unifyPositionEntity.getCumulativeTradeFee());
        positionEntity.setRealisedPnl(unifyPositionEntity.getRealisedCost());
        positionEntity.setDelevPercentage(unifyPositionEntity.getAdlPercentage());
        positionEntity.setRealisedGrossPnl(unifyPositionEntity.getRealisedGrossCost());
        positionEntity.setMaintMargin(unifyPositionEntity.getPosMargin());
        positionEntity.setCrossIMR(unifyPositionEntity.getImr());
        positionEntity.setCrossMMR(unifyPositionEntity.getMmr());
        positionEntity.setSymbol(unifyPositionEntity.getSymbol());
        positionEntity.setOpen(unifyPositionEntity.isOpen());
        positionEntity.setCurrentCost(unifyPositionEntity.getCurrentCost());
        positionEntity.setLiquidationPrice(unifyPositionEntity.getLiquidationPrice());
        positionEntity.setMarkPrice(unifyPositionEntity.getMarkPrice());
        positionEntity.setMarkValue(unifyPositionEntity.getMarkValue());
        positionEntity.setPosComm(unifyPositionEntity.getPosComm());
        positionEntity.setPosCost(unifyPositionEntity.getPosCost());
        positionEntity.setPosInit(unifyPositionEntity.getPosInit());
        positionEntity.setPosMaint(unifyPositionEntity.getPosMaint());
        positionEntity.setPosMargin(unifyPositionEntity.getPosMargin());
        positionEntity.setRealisedGrossCost(unifyPositionEntity.getRealisedGrossCost());
        positionEntity.setUnrealisedRoePcnt(unifyPositionEntity.getUnrealisedRoePcnt());
        positionEntity.setSettleCurrency(unifyPositionEntity.getSettleCurrency());
        if (unifyPositionEntity.isTrialFunds() != null) {
            positionEntity.setTrialFunds(unifyPositionEntity.isTrialFunds().booleanValue());
        }
        positionEntity.setMarginMode(unifyPositionEntity.getMarginMode());
        positionEntity.setRiskRatio(unifyPositionEntity.getRiskRatio());
        positionEntity.setLatestPrice(unifyPositionEntity.getLatestPrice());
        positionEntity.setLatestUnrealisedPnl(unifyPositionEntity.getLatestUnrealisedPnl());
        positionEntity.setLatestUnrealisedRoePcnt(unifyPositionEntity.getLatestUnrealisedRoePcnt());
        positionEntity.setPositionSide(unifyPositionEntity.getPositionSide());
        return positionEntity;
    }
}
