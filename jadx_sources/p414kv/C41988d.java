package p414kv;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.d */
/* JADX INFO: compiled from: FavTradeBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/FavTradeBeanMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "()V", "map", "input", "getSymbolEntityByCode", "Lcom/kubi/data/entity/SymbolInfoEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41988d implements InterfaceC41991g<FavMarketQuoteEntity, TradeItemBean> {
    /* JADX INFO: renamed from: b */
    public final SymbolInfoEntity m92067b(FavMarketQuoteEntity favMarketQuoteEntity) {
        C37890n c37890n = C37890n.f85269a;
        String symbol = favMarketQuoteEntity.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(symbol);
        if (symbolInfoEntityM85601B == null) {
            return null;
        }
        Integer mark = favMarketQuoteEntity.getMark();
        symbolInfoEntityM85601B.setMark(mark != null ? mark.intValue() : 0);
        Integer board = favMarketQuoteEntity.getBoard();
        symbolInfoEntityM85601B.setBoard(board != null ? board.intValue() : 0);
        Boolean trading = favMarketQuoteEntity.getTrading();
        symbolInfoEntityM85601B.setEnableTrading(trading != null ? trading.booleanValue() : false);
        symbolInfoEntityM85601B.setMarket(favMarketQuoteEntity.getMarket());
        Boolean boolIsMarginEnable = favMarketQuoteEntity.isMarginEnable();
        symbolInfoEntityM85601B.setMarginEnabled(boolIsMarginEnable != null ? boolIsMarginEnable.booleanValue() : true);
        return symbolInfoEntityM85601B;
    }

    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TradeItemBean mo51723a(@NotNull FavMarketQuoteEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TradeItemBean tradeItemBean = new TradeItemBean();
        tradeItemBean.isChecked = false;
        String changeRate = input.getChangeRate();
        tradeItemBean.setChangeRate(changeRate != null ? Double.valueOf(Double.parseDouble(changeRate)) : null);
        String lastTradedPrice = input.getLastTradedPrice();
        tradeItemBean.setLastDealPrice(lastTradedPrice != null ? Double.parseDouble(lastTradedPrice) : 0.0d);
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        tradeItemBean.setSymbol(symbol);
        String volValue = input.getVolValue();
        tradeItemBean.setValue(volValue != null ? Double.parseDouble(volValue) : 0.0d);
        Boolean alarm = input.getAlarm();
        tradeItemBean.setAlarm(alarm != null ? alarm.booleanValue() : false);
        Integer mark = input.getMark();
        tradeItemBean.setMark(mark != null ? mark.intValue() : 0);
        tradeItemBean.setFavor(true);
        String coinLabel = input.getCoinLabel();
        tradeItemBean.setCoinLabel(coinLabel != null ? coinLabel : "");
        tradeItemBean.setSymbolInfoEntity(m92067b(input));
        tradeItemBean.setMaxLeverage(input.getMaxLeverageByAccountStatus());
        return tradeItemBean;
    }
}
