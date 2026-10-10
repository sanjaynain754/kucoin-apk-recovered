package j20;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import i20.CallAuctionInfo;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: j20.b */
/* JADX INFO: compiled from: CallAuctionEstimateInfoMapper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/mapper/CallAuctionEstimateInfoMapper;", "Lcom/kubi/spot/business/callAuction/mapper/IMapper;", "Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;", "<init>", "()V", "map", "input", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40251b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public CallAuctionInfo m88605a(@Nullable CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity) {
        String strM89946t;
        String strM89946t2;
        String strM89946t3;
        String strM89946t4;
        String strM89946t5;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        SymbolInfoEntity symbolInfoEntity3;
        SymbolInfoEntity symbolInfoEntity4;
        SymbolInfoEntity symbolInfoEntity5;
        SymbolInfoEntity symbolInfoEntity6;
        String strM89946t6 = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (callAuctionEstimateInfoEntity == null) {
            return null;
        }
        CallAuctionInfo callAuctionInfo = new CallAuctionInfo(null, null, null, null, null, null, 63, null);
        BigDecimal estimatedDealPrice = callAuctionEstimateInfoEntity.getEstimatedDealPrice();
        if (estimatedDealPrice != null) {
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            strM89946t = C41014a.m89946t(estimatedDealPrice, null, C27039d.m66651k((tradeItemBeanM85603D == null || (symbolInfoEntity6 = tradeItemBeanM85603D.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity6.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t = null;
        }
        callAuctionInfo.m86655j(C27041f.m66668h(strM89946t));
        BigDecimal estimatedDealSize = callAuctionEstimateInfoEntity.getEstimatedDealSize();
        if (estimatedDealSize != null) {
            TradeItemBean tradeItemBeanM85603D2 = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            strM89946t2 = C41014a.m89946t(estimatedDealSize, null, C27039d.m66651k((tradeItemBeanM85603D2 == null || (symbolInfoEntity5 = tradeItemBeanM85603D2.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity5.getBaseIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t2 = null;
        }
        callAuctionInfo.m86656k(C27041f.m66668h(strM89946t2));
        BigDecimal lowestBuyDeclaredPrice = callAuctionEstimateInfoEntity.getLowestBuyDeclaredPrice();
        if (lowestBuyDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D3 = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            strM89946t3 = C41014a.m89946t(lowestBuyDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D3 == null || (symbolInfoEntity4 = tradeItemBeanM85603D3.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity4.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t3 = null;
        }
        callAuctionInfo.m86653h(C27041f.m66668h(strM89946t3));
        BigDecimal highestBuyDeclaredPrice = callAuctionEstimateInfoEntity.getHighestBuyDeclaredPrice();
        if (highestBuyDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D4 = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            strM89946t4 = C41014a.m89946t(highestBuyDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D4 == null || (symbolInfoEntity3 = tradeItemBeanM85603D4.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity3.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t4 = null;
        }
        callAuctionInfo.m86654i(C27041f.m66668h(strM89946t4));
        BigDecimal lowestSellDeclaredPrice = callAuctionEstimateInfoEntity.getLowestSellDeclaredPrice();
        if (lowestSellDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D5 = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            strM89946t5 = C41014a.m89946t(lowestSellDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D5 == null || (symbolInfoEntity2 = tradeItemBeanM85603D5.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity2.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t5 = null;
        }
        callAuctionInfo.m86657l(C27041f.m66668h(strM89946t5));
        BigDecimal highestSellDeclaredPrice = callAuctionEstimateInfoEntity.getHighestSellDeclaredPrice();
        if (highestSellDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D6 = C37890n.f85269a.m85603D(C27041f.m66668h(callAuctionEstimateInfoEntity.getSymbol()));
            if (tradeItemBeanM85603D6 != null && (symbolInfoEntity = tradeItemBeanM85603D6.getSymbolInfoEntity()) != null) {
                numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
            }
            strM89946t6 = C41014a.m89946t(highestSellDeclaredPrice, null, C27039d.m66651k(numValueOf, 8), false, false, false, false, false, null, 0, 509, null);
        }
        callAuctionInfo.m86658m(C27041f.m66668h(strM89946t6));
        return callAuctionInfo;
    }
}
