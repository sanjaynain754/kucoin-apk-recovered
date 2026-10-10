package p414kv;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.i */
/* JADX INFO: compiled from: MarketTradeBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/MarketTradeBeanMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "()V", "TAG", "", "map", "input", "getSymbolEntityByCode", "Lcom/kubi/data/entity/SymbolInfoEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41993i implements InterfaceC41991g<MarketListEntityItem, TradeItemBean> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f92195a = "MarketTradeBeanMapper";

    /* JADX INFO: renamed from: b */
    public final SymbolInfoEntity m92074b(MarketListEntityItem marketListEntityItem) {
        C37890n c37890n = C37890n.f85269a;
        String symbol = marketListEntityItem.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(symbol);
        if (symbolInfoEntityM85601B == null) {
            return null;
        }
        Integer symbolMark = marketListEntityItem.getSymbolMark();
        symbolInfoEntityM85601B.setMark(symbolMark != null ? symbolMark.intValue() : 0);
        Integer symbolBoard = marketListEntityItem.getSymbolBoard();
        symbolInfoEntityM85601B.setBoard(symbolBoard != null ? symbolBoard.intValue() : 0);
        Boolean tradingEnabled = marketListEntityItem.getTradingEnabled();
        Boolean bool = Boolean.TRUE;
        symbolInfoEntityM85601B.setEnableTrading(Intrinsics.areEqual(tradingEnabled, bool));
        symbolInfoEntityM85601B.setPreviewEnableShow(Intrinsics.areEqual(marketListEntityItem.getTradingSoonEnabled(), bool));
        symbolInfoEntityM85601B.setMarginEnabled(Intrinsics.areEqual(marketListEntityItem.getMarginEnabled(), bool));
        symbolInfoEntityM85601B.setIsolatedMarginEnabled(Intrinsics.areEqual(marketListEntityItem.getIsolatedEnabled(), bool));
        symbolInfoEntityM85601B.setEnableAuctionTrade(Boolean.valueOf(Intrinsics.areEqual(marketListEntityItem.getCallAuctionSymbol(), bool)));
        return symbolInfoEntityM85601B;
    }

    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TradeItemBean mo51723a(@NotNull MarketListEntityItem input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TradeItemBean tradeItemBean = new TradeItemBean();
        tradeItemBean.isChecked = false;
        String last24HourRate = input.getLast24HourRate();
        tradeItemBean.setChangeRate(last24HourRate != null ? Double.valueOf(Double.parseDouble(last24HourRate)) : null);
        String lastPrice = input.getLastPrice();
        tradeItemBean.setLastDealPrice(lastPrice != null ? Double.parseDouble(lastPrice) : 0.0d);
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        tradeItemBean.setSymbol(symbol);
        String last24HourTradingVolume = input.getLast24HourTradingVolume();
        tradeItemBean.setValue(last24HourTradingVolume != null ? Double.parseDouble(last24HourTradingVolume) : 0.0d);
        tradeItemBean.setAlarm(input.getAlarmingPersonal());
        Integer symbolMark = input.getSymbolMark();
        tradeItemBean.setMark(symbolMark != null ? symbolMark.intValue() : 0);
        tradeItemBean.setFavor(input.getFavoritePersonal());
        Integer symbolBoard = input.getSymbolBoard();
        tradeItemBean.setPlus(symbolBoard != null ? symbolBoard.intValue() : 0);
        tradeItemBean.isEnableAuctionTrade = Intrinsics.areEqual(input.getCallAuctionSymbol(), Boolean.TRUE);
        tradeItemBean.setCoinLabel(input.getSymbolLabel());
        tradeItemBean.setSymbolInfoEntity(m92074b(input));
        tradeItemBean.updateSpotMarks(input.getSpotMarks());
        tradeItemBean.setMaxLeverage(input.getMaxLeverageByAccountStatus());
        return tradeItemBean;
    }
}
