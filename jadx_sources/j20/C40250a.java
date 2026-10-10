package j20;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.business.callAuction.bean.CallAuctionConfigBean;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$Phase;
import com.kubi.spot.entity.callAuction.CallAuctionConfigEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import f30.C37347r;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j20.a */
/* JADX INFO: compiled from: CallAuctionConfigMapper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/mapper/CallAuctionConfigMapper;", "Lcom/kubi/spot/business/callAuction/mapper/IMapper;", "Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", "<init>", "()V", "map", "input", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40250a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public CallAuctionConfigBean m88604a(@NotNull CallAuctionConfigEntity input) {
        SymbolInfoEntity symbolInfoEntity;
        Intrinsics.checkNotNullParameter(input, "input");
        CallAuctionConfigBean callAuctionConfigBean = new CallAuctionConfigBean(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        String strM89946t = null;
        numValueOf = null;
        Integer numValueOf = null;
        callAuctionConfigBean.setFirstStageStartTime(C37347r.m83943c(C27039d.m66652l(input.getFirstStageStartTime()), null, 2, null));
        callAuctionConfigBean.setFirstStageEndTime(C37347r.m83943c(C27039d.m66652l(input.getSecondStageStartTime()), null, 2, null));
        callAuctionConfigBean.setSecondStageStartTime(C37347r.m83943c(C27039d.m66652l(input.getSecondStageStartTime()), null, 2, null));
        callAuctionConfigBean.setSecondStageEndTime(C37347r.m83943c(C27039d.m66652l(input.getSecondStageEndTime()), null, 2, null));
        callAuctionConfigBean.setThirdStageStartTime(C37347r.m83943c(C27039d.m66652l(input.getThirdStageStartTime()), null, 2, null));
        callAuctionConfigBean.setThirdStageEndTime(C37347r.m83943c(C27039d.m66652l(input.getThirdStageEndTime()), null, 2, null));
        callAuctionConfigBean.setOpeningTime(C37347r.m83943c(C27039d.m66652l(input.getThirdStageEndTime()), null, 2, null));
        callAuctionConfigBean.setPriceCeiling(input.getPriceCeiling());
        callAuctionConfigBean.setPriceFloor(input.getPriceFloor());
        BigDecimal costPrice = input.getCostPrice();
        if (costPrice != null) {
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(C27041f.m66668h(input.getSymbolCode()));
            if (tradeItemBeanM85603D != null && (symbolInfoEntity = tradeItemBeanM85603D.getSymbolInfoEntity()) != null) {
                numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
            }
            strM89946t = C41014a.m89946t(costPrice, null, C27039d.m66651k(numValueOf, 8), true, false, false, false, false, null, 0, 505, null);
        }
        callAuctionConfigBean.setIssuePrice(C27041f.m66668h(strM89946t));
        Long remainingTimeFromFirstStageEnd = input.getRemainingTimeFromFirstStageEnd();
        if (remainingTimeFromFirstStageEnd == null || remainingTimeFromFirstStageEnd.longValue() != 0) {
            callAuctionConfigBean.setCountdown(input.getRemainingTimeFromFirstStageEnd());
            callAuctionConfigBean.setPhase(CallAuctionContract$Phase.Phase1);
            CallAuctionSwitch.f20317a.m21645l(false);
            return callAuctionConfigBean;
        }
        Long remainingTimeFromSecondStageEnd = input.getRemainingTimeFromSecondStageEnd();
        if (remainingTimeFromSecondStageEnd == null || remainingTimeFromSecondStageEnd.longValue() != 0) {
            callAuctionConfigBean.setCountdown(input.getRemainingTimeFromSecondStageEnd());
            callAuctionConfigBean.setPhase(CallAuctionContract$Phase.Phase2);
            CallAuctionSwitch.f20317a.m21645l(false);
            return callAuctionConfigBean;
        }
        Long remainingTimeFromThirdStageEnd = input.getRemainingTimeFromThirdStageEnd();
        if (remainingTimeFromThirdStageEnd != null && remainingTimeFromThirdStageEnd.longValue() == 0) {
            callAuctionConfigBean.setCountdown(0L);
            callAuctionConfigBean.setPhase(CallAuctionContract$Phase.OPENING);
            CallAuctionSwitch.f20317a.m21645l(false);
            return callAuctionConfigBean;
        }
        callAuctionConfigBean.setCountdown(input.getRemainingTimeFromThirdStageEnd());
        callAuctionConfigBean.setPhase(CallAuctionContract$Phase.Phase3);
        CallAuctionSwitch.f20317a.m21645l(true);
        return callAuctionConfigBean;
    }
}
