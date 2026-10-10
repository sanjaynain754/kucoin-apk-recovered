package p264fh;

import com.kubi.futures.trade.position.adapter.OrderItemViewExpand;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.extensions.C27025c;
import java.util.Iterator;
import java.util.List;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fh.m */
/* JADX INFO: compiled from: PositionServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m90084d2 = {"bindPositionSnapshot", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "snapshot", "filterPosition", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37479m {
    /* JADX INFO: renamed from: c */
    public static final PositionEntity m84300c(PositionEntity positionEntity, PositionEntity positionEntity2) {
        if (positionEntity2.getCurrentQty() == null) {
            positionEntity.setUnrealisedPnl(positionEntity2.getUnrealisedPnl());
            positionEntity.setMarkPrice(positionEntity2.getMarkPrice());
            positionEntity.setMarkValue(positionEntity2.getMarkValue());
            positionEntity.setMaintMargin(positionEntity2.getMaintMargin());
            positionEntity.setRealLeverage(positionEntity2.getRealLeverage());
            positionEntity.setDelevPercentage(positionEntity2.getDelevPercentage());
            positionEntity.setUnrealisedRoePcnt(positionEntity2.getUnrealisedRoePcnt());
            return positionEntity;
        }
        positionEntity2.setTrialCoupon(positionEntity.getTrialCoupon());
        positionEntity2.setWithdrawPnl(positionEntity.getWithdrawPnl());
        if (C27025c.m66566d(Boolean.valueOf(positionEntity2.isTrialFunds()))) {
            positionEntity2.setMaintMargin(positionEntity.getMaintMargin());
            positionEntity2.setRiskRatio(positionEntity.getRiskRatio());
        }
        return positionEntity2;
    }

    /* JADX INFO: renamed from: d */
    public static final List<PositionEntity> m84301d(List<PositionEntity> list, PositionEntity positionEntity) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                PositionEntity positionEntity2 = (PositionEntity) next;
                if (Intrinsics.areEqual(positionEntity2.getSymbol(), positionEntity.getSymbol()) && positionEntity2.isTrialFunds() == positionEntity.isTrialFunds() && Intrinsics.areEqual(positionEntity2.getPositionSide(), positionEntity.getPositionSide())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PositionEntity positionEntity3 = (PositionEntity) next;
        if (positionEntity3 != null && list.set(list.indexOf(positionEntity3), m84300c(positionEntity3, positionEntity)) != null) {
            return list;
        }
        list.add(0, positionEntity);
        return list;
    }

    /* JADX INFO: renamed from: e */
    public static final List<PositionEntity> m84302e(List<PositionEntity> list) {
        Iterator<PositionEntity> it = list.iterator();
        while (it.hasNext()) {
            PositionEntity next = it.next();
            if (!C27025c.m66566d(next.isOpen()) || C41014a.m89922G(next.getCurrentQty(), null, 1, null).doubleValue() == 0.0d) {
                it.remove();
                OrderItemViewExpand.Companion.get().delete(next);
            }
        }
        return list;
    }
}
