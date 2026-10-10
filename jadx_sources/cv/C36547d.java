package cv;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv.d */
/* JADX INFO: compiled from: FutureTradeItemBean.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"convert", "Lcom/kubi/data/entity/TradeItemBean;", "input", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36547d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TradeItemBean m81813a(@NotNull AllTradeItemBean input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TradeItemBean tradeItemBean = new TradeItemBean();
        tradeItemBean.isChecked = input.isChecked;
        tradeItemBean.index = input.index;
        tradeItemBean.setSymbolInfoEntity(input.getSymbolInfoEntity());
        tradeItemBean.setChangeRate(input.getChangeRate());
        tradeItemBean.setLastDealPrice(input.getLastDealPrice());
        tradeItemBean.setSymbol(input.getSymbol());
        tradeItemBean.setValue(input.getValue());
        tradeItemBean.setAlarm(input.isAlarm());
        tradeItemBean.setMark(input.getMark());
        tradeItemBean.setFavor(input.isFavor());
        tradeItemBean.setPlus(input.getPlus());
        tradeItemBean.setTop(input.isTop());
        tradeItemBean.setShowSymbol(input.getShowSymbol());
        tradeItemBean.empty = input.empty;
        tradeItemBean.isEnableAuctionTrade = input.isEnableAuctionTrade;
        tradeItemBean.setCoinLabel(input.getCoinLabel());
        return tradeItemBean;
    }
}
