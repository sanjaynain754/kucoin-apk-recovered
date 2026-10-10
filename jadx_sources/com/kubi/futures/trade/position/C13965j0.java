package com.kubi.futures.trade.position;

import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionTrialEntity;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p371ji.C40410a;
import p429lf.C42180b;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import uk.C45259d;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.j0 */
/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a(\u0010\t\u001a\u00020\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u0012"}, m90084d2 = {"calculateEstPnlForOrder", "Lkotlin/Pair;", "", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "toAggregateEntity", "Lcom/kubi/futures/trade/position/FuturesPositionWithTpSlEntity;", "tpOrders", "", "slOrders", "logLong", "", "tag", "msg", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesPositionAggregateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1563#2:475\n1634#2,3:476\n1563#2:479\n1634#2,3:480\n*S KotlinDebug\n*F\n+ 1 FuturesPositionAggregateManager.kt\ncom/kubi/futures/trade/position/FuturesPositionAggregateManagerKt\n*L\n448#1:475\n448#1:476,3\n454#1:479\n454#1:480,3\n*E\n"})
public final class C13965j0 {
    /* JADX INFO: renamed from: b */
    public static final Pair<String, String> m27748b(OrderEntity orderEntity, PositionEntity positionEntity, ContractEntity contractEntity) throws Throwable {
        BigDecimal decimal;
        BigDecimal decimal2;
        if (contractEntity == null) {
            return new Pair<>(null, null);
        }
        BigDecimal stopPrice = orderEntity.getStopPrice();
        if (stopPrice != null) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (stopPrice.compareTo(bigDecimal) > 0) {
                if (C37569d.m84649A(positionEntity)) {
                    decimal = positionEntity.getRealLeverage();
                } else {
                    C45259d c45259d = C45259d.f101800a;
                    boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse()));
                    BigDecimal multiplier = contractEntity.getMultiplier();
                    C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
                    BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
                    C44110b c44110bM97192c = avgEntryPrice != null ? C44111c.m97192c(avgEntryPrice) : null;
                    BigDecimal currentQty = positionEntity.getCurrentQty();
                    C44110b c44110bM97192c2 = currentQty != null ? C44111c.m97192c(currentQty) : null;
                    BigDecimal posInit = positionEntity.getPosInit();
                    C44110b c44110bM100046a = c45259d.m100046a(zM66566d, c44110bM97191b, c44110bM97192c2, c44110bM97192c, posInit != null ? C44111c.m97192c(posInit) : null);
                    decimal = c44110bM100046a != null ? c44110bM100046a.getDecimal() : null;
                }
                C45259d c45259d2 = C45259d.f101800a;
                boolean zM66566d2 = C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse()));
                boolean zM84685z = C37569d.m84685z(positionEntity);
                BigDecimal avgEntryPrice2 = positionEntity.getAvgEntryPrice();
                C44110b c44110bM100049d = c45259d2.m100049d(zM66566d2, zM84685z, avgEntryPrice2 != null ? C44111c.m97192c(avgEntryPrice2) : null, decimal != null ? C44111c.m97192c(decimal) : null, C44111c.m97192c(stopPrice));
                BigDecimal bigDecimalDivide = (c44110bM100049d == null || (decimal2 = c44110bM100049d.getDecimal()) == null) ? null : decimal2.divide(new BigDecimal(C33556b3.f68995S));
                boolean zM66566d3 = C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse()));
                BigDecimal multiplier2 = contractEntity.getMultiplier();
                C44110b c44110bM97191b2 = C44111c.m97191b(multiplier2 != null ? C44111c.m97192c(multiplier2) : null, null, 1, null);
                BigDecimal avgEntryPrice3 = positionEntity.getAvgEntryPrice();
                C44110b c44110bM97192c3 = avgEntryPrice3 != null ? C44111c.m97192c(avgEntryPrice3) : null;
                C44110b c44110bM97192c4 = C44111c.m97192c(stopPrice);
                BigDecimal currentQty2 = positionEntity.getCurrentQty();
                C44110b c44110bM100047b = c45259d2.m100047b(zM66566d3, c44110bM97191b2, c44110bM97192c3, c44110bM97192c4, currentQty2 != null ? C44111c.m97192c(currentQty2) : null);
                BigDecimal decimal3 = c44110bM100047b != null ? c44110bM100047b.getDecimal() : null;
                String strM92640e = decimal3 != null ? C42180b.m92640e(decimal3, null, C37567b.m84613c(contractEntity), true, true, true, 0, null, 97, null) : null;
                if (decimal3 != null && decimal3.compareTo(bigDecimal) > 0 && strM92640e != null) {
                    strM92640e = '+' + strM92640e;
                }
                return new Pair<>(strM92640e, bigDecimalDivide != null ? C42180b.m92642g(bigDecimalDivide, null, null, 0, true, false, false, 55, null) : null);
            }
        }
        return new Pair<>(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m27749c(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int length = msg.length();
        int i11 = 0;
        while (i11 < length) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i11 + 3000, length);
            Log log = Log.f30813a;
            String strSubstring = msg.substring(i11, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            log.m36615a(tag, strSubstring);
            i11 = iCoerceAtMost;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX INFO: renamed from: d */
    public static final FuturesPositionWithTpSlEntity m27750d(PositionEntity positionEntity, List<OrderEntity> list, List<OrderEntity> list2) throws Throwable {
        String str;
        String str2;
        String strM93902c;
        String strM93906g;
        String strM93915p;
        String strM92640e;
        String strM93902c2;
        ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
        int iM66651k = C27039d.m66651k(contractEntityM84661b != null ? Integer.valueOf(C37567b.m84623m(contractEntityM84661b)) : null, 2);
        String strM66677q = C27041f.m66677q(positionEntity.getSettleCurrency());
        if (strM66677q == null) {
            strM66677q = contractEntityM84661b != null ? C37567b.m84620j(contractEntityM84661b) : null;
        }
        C40410a.f89722a.m89054c();
        BigDecimal bigDecimalM84658J = C37569d.m84658J(positionEntity);
        BigDecimal bigDecimalM84659K = C37569d.m84659K(positionEntity);
        String strM93915p2 = (bigDecimalM84658J == null || (strM92640e = C42180b.m92640e(bigDecimalM84658J, null, iM66651k, true, true, true, 0, null, 97, null)) == null || (strM93902c2 = C42828b.m93902c(strM92640e)) == null) ? null : C42828b.m93915p(strM93902c2);
        if (bigDecimalM84658J != null && bigDecimalM84658J.compareTo(BigDecimal.ZERO) > 0 && strM93915p2 != null) {
            strM93915p2 = '+' + strM93915p2;
        }
        String strM66669i = C27041f.m66669i(strM93915p2, "--");
        if (bigDecimalM84659K != null) {
            BigDecimal scale = bigDecimalM84659K.multiply(new BigDecimal(100)).setScale(2, 1);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            String str3 = (bigDecimalM84659K.compareTo(bigDecimal) > 0 ? "+" : bigDecimalM84659K.compareTo(bigDecimal) < 0 ? C33820nf.f71144W : "") + C6447a.m11724a(scale.abs()).toPlainString() + '%';
            if (str3 == null) {
                str = "--";
                str2 = str;
            } else {
                str2 = str3;
                str = "--";
            }
        } else {
            str = "--";
            str2 = str;
        }
        BigDecimal realisedPnl = positionEntity.getRealisedPnl();
        if (realisedPnl != null) {
            String str4 = str;
            String strM92640e2 = C42180b.m92640e(realisedPnl, null, iM66651k, true, true, true, 0, null, 97, null);
            if (strM92640e2 != null && (strM93902c = C42828b.m93902c(strM92640e2)) != null && (strM93906g = C42828b.m93906g(strM93902c, C27041f.m66668h(strM66677q), true, false, 4, null)) != null && (strM93915p = C42828b.m93915p(strM93906g)) != null) {
                C27041f.m66669i(strM93915p, str4);
            }
        }
        String strM84664e = C37569d.m84664e(positionEntity, contractEntityM84661b);
        String strM84663d = C37569d.m84663d(positionEntity);
        String strM84670k = C37569d.m84670k(positionEntity, contractEntityM84661b);
        String strM84673n = C37569d.m84673n(positionEntity, contractEntityM84661b, null, 2, null);
        BigDecimal maintMargin = positionEntity.getMaintMargin();
        KLineShowEntity kLineShowEntity = new KLineShowEntity(strM66669i, str2, strM84664e, strM84663d, strM84670k, strM84673n, maintMargin != null ? C42180b.m92640e(maintMargin, null, iM66651k, false, false, false, 0, null, 125, null) : null);
        String id2 = positionEntity.getId();
        String symbol = positionEntity.getSymbol();
        Boolean boolIsOpen = positionEntity.isOpen();
        Boolean autoDeposit = positionEntity.getAutoDeposit();
        BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
        BigDecimal currentCost = positionEntity.getCurrentCost();
        BigDecimal currentQty = positionEntity.getCurrentQty();
        BigDecimal delevPercentage = positionEntity.getDelevPercentage();
        BigDecimal liquidationPrice = positionEntity.getLiquidationPrice();
        BigDecimal maintMargin2 = positionEntity.getMaintMargin();
        BigDecimal markPrice = positionEntity.getMarkPrice();
        BigDecimal markValue = positionEntity.getMarkValue();
        Long openingTimestamp = positionEntity.getOpeningTimestamp();
        BigDecimal posComm = positionEntity.getPosComm();
        BigDecimal posCost = positionEntity.getPosCost();
        BigDecimal posCross = positionEntity.getPosCross();
        BigDecimal posInit = positionEntity.getPosInit();
        BigDecimal posLoss = positionEntity.getPosLoss();
        BigDecimal posMaint = positionEntity.getPosMaint();
        BigDecimal aggRate = positionEntity.getAggRate();
        BigDecimal posMargin = positionEntity.getPosMargin();
        BigDecimal realLeverage = positionEntity.getRealLeverage();
        BigDecimal realisedGrossCost = positionEntity.getRealisedGrossCost();
        BigDecimal realisedGrossPnl = positionEntity.getRealisedGrossPnl();
        BigDecimal realisedPnl2 = positionEntity.getRealisedPnl();
        BigDecimal riskLimit = positionEntity.getRiskLimit();
        BigDecimal unrealisedPnl = positionEntity.getUnrealisedPnl();
        BigDecimal unrealisedRoePcnt = positionEntity.getUnrealisedRoePcnt();
        String settleCurrency = positionEntity.getSettleCurrency();
        boolean zIsTrialFunds = positionEntity.isTrialFunds();
        String prizeType = positionEntity.getPrizeType();
        PositionTrialEntity trialCoupon = positionEntity.getTrialCoupon();
        String marginMode = positionEntity.getMarginMode();
        BigDecimal riskRatio = positionEntity.getRiskRatio();
        BigDecimal crossIMR = positionEntity.getCrossIMR();
        BigDecimal crossMMR = positionEntity.getCrossMMR();
        BigDecimal adjustCrossIMR = positionEntity.getAdjustCrossIMR();
        BigDecimal adjustCrossMMR = positionEntity.getAdjustCrossMMR();
        BigDecimal latestPrice = positionEntity.getLatestPrice();
        BigDecimal latestUnrealisedPnl = positionEntity.getLatestUnrealisedPnl();
        BigDecimal latestUnrealisedRoePcnt = positionEntity.getLatestUnrealisedRoePcnt();
        BigDecimal withdrawPnl = positionEntity.getWithdrawPnl();
        BigDecimal dealComm = positionEntity.getDealComm();
        BigDecimal fundingFee = positionEntity.getFundingFee();
        BigDecimal tax = positionEntity.getTax();
        String positionSide = positionEntity.getPositionSide();
        BigDecimal bestAskPrice = positionEntity.getBestAskPrice();
        BigDecimal bestBidPrice = positionEntity.getBestBidPrice();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OrderEntity orderEntity : list) {
            Pair<String, String> pairM27748b = m27748b(orderEntity, positionEntity, contractEntityM84661b);
            String strComponent1 = pairM27748b.component1();
            String strComponent2 = pairM27748b.component2();
            orderEntity.setEstPnl(strComponent1);
            orderEntity.setEstPnlRate(strComponent2);
            arrayList.add(orderEntity);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (OrderEntity orderEntity2 : list2) {
            Pair<String, String> pairM27748b2 = m27748b(orderEntity2, positionEntity, contractEntityM84661b);
            String strComponent3 = pairM27748b2.component1();
            String strComponent4 = pairM27748b2.component2();
            orderEntity2.setEstPnl(strComponent3);
            orderEntity2.setEstPnlRate(strComponent4);
            arrayList2.add(orderEntity2);
        }
        return new FuturesPositionWithTpSlEntity(id2, symbol, boolIsOpen, autoDeposit, null, avgEntryPrice, currentCost, currentQty, delevPercentage, liquidationPrice, maintMargin2, markPrice, markValue, openingTimestamp, posComm, posCost, posCross, posInit, posLoss, posMaint, aggRate, posMargin, realLeverage, realisedGrossCost, realisedGrossPnl, realisedPnl2, riskLimit, unrealisedPnl, unrealisedRoePcnt, settleCurrency, zIsTrialFunds, prizeType, trialCoupon, marginMode, riskRatio, crossIMR, crossMMR, adjustCrossIMR, adjustCrossMMR, latestPrice, latestUnrealisedPnl, latestUnrealisedRoePcnt, withdrawPnl, dealComm, fundingFee, tax, positionSide, bestAskPrice, bestBidPrice, new TpslOrderData(arrayList, arrayList2), kLineShowEntity, 16, 0, null);
    }
}
