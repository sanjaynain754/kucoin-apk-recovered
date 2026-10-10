package com.kubi.unify.unify.mapper;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.unify.entity.UnifyOrderEntity;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes52.dex */
public class OrderMapperImpl implements OrderMapper {
    @Override // com.kubi.unify.unify.mapper.OrderMapper
    public OrderEntity toOrderEntity(UnifyOrderEntity unifyOrderEntity) {
        if (unifyOrderEntity == null) {
            return null;
        }
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(unifyOrderEntity.getOrderId());
        orderEntity.setType(toLowerCaseCustom(unifyOrderEntity.getOrderType()));
        orderEntity.setSide(toLowerCaseCustom(unifyOrderEntity.getSide()));
        orderEntity.setStop(toLowerCaseCustom(unifyOrderEntity.getTriggerDirection()));
        orderEntity.setStopPrice(unifyOrderEntity.getTriggerPrice());
        orderEntity.setCloseOnly(unifyOrderEntity.getReduceOnly());
        orderEntity.setStopPriceType(unifyOrderEntity.getTriggerPriceType());
        orderEntity.setCreatedAt(unifyOrderEntity.getOrderTime());
        orderEntity.setDealSize(unifyOrderEntity.getFilledSize());
        orderEntity.setDealValue(unifyOrderEntity.getFilledFunds());
        orderEntity.setSymbol(unifyOrderEntity.getSymbol());
        if (unifyOrderEntity.getLeverage() != null) {
            orderEntity.setLeverage(new BigDecimal(unifyOrderEntity.getLeverage()));
        }
        orderEntity.setChannel(unifyOrderEntity.getChannel());
        orderEntity.setTimeInForce(unifyOrderEntity.getTimeInForce());
        orderEntity.setFromReduce(unifyOrderEntity.getFromReduce());
        orderEntity.setCloseOrder(unifyOrderEntity.getCloseOrder());
        orderEntity.setPostOnly(unifyOrderEntity.getPostOnly());
        orderEntity.setShortcut(unifyOrderEntity.getShortcut());
        orderEntity.setHidden(unifyOrderEntity.getHidden());
        orderEntity.setIceberg(unifyOrderEntity.getIceberg());
        orderEntity.setPrice(unifyOrderEntity.getPrice());
        orderEntity.setCancelSize(unifyOrderEntity.getCancelSize());
        orderEntity.setSize(unifyOrderEntity.getSize());
        orderEntity.setVisibleSize(unifyOrderEntity.getVisibleSize());
        orderEntity.setTriggerOrderId(unifyOrderEntity.getTriggerOrderId());
        orderEntity.setMarginMode(unifyOrderEntity.getMarginMode());
        orderEntity.setPositionSide(unifyOrderEntity.getPositionSide());
        if (unifyOrderEntity.getStatus() != null) {
            orderEntity.setStatus(String.valueOf(unifyOrderEntity.getStatus()));
        }
        orderEntity.setFee(unifyOrderEntity.getFee());
        orderEntity.setFeeCurrency(unifyOrderEntity.getFeeCurrency());
        orderEntity.setTax(unifyOrderEntity.getTax());
        orderEntity.setTaxCurrency(unifyOrderEntity.getTaxCurrency());
        orderEntity.setPnl(unifyOrderEntity.getPnl());
        orderEntity.setCancelReason(unifyOrderEntity.getCancelReason());
        afterMapping(orderEntity, unifyOrderEntity);
        return orderEntity;
    }
}
