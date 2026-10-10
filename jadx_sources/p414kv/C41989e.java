package p414kv;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.utils.extensions.C27039d;
import gf.C37890n;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.e */
/* JADX INFO: compiled from: FavTradeBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\b"}, m90084d2 = {"convert", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "input", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "type", "", "Lcom/kubi/data/entity/TradeItemBean;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41989e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AllTradeItemBean m92069a(@NotNull AllTradeItemBean allTradeItemBean, @NotNull TradeItemBean input, int i11) {
        Intrinsics.checkNotNullParameter(allTradeItemBean, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        allTradeItemBean.setCollectType(i11);
        allTradeItemBean.isChecked = false;
        allTradeItemBean.setChangeRate(input.getChangeRate());
        allTradeItemBean.setLastDealPrice(input.getLastDealPrice());
        allTradeItemBean.setSymbol(input.getSymbol());
        allTradeItemBean.setValue(input.getValue());
        allTradeItemBean.setAlarm(input.isAlarm());
        allTradeItemBean.setMark(input.getMark());
        allTradeItemBean.setFavor(true);
        allTradeItemBean.setCoinLabel(input.getCoinLabel());
        allTradeItemBean.setSymbolInfoEntity(input.getSymbolInfoEntity());
        allTradeItemBean.setMaxLeverage(input.getMaxLeverage());
        return allTradeItemBean;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AllTradeItemBean m92070b(@NotNull AllTradeItemBean allTradeItemBean, @NotNull AlphaItemEntity input, int i11) {
        Intrinsics.checkNotNullParameter(allTradeItemBean, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        allTradeItemBean.setCollectType(i11);
        allTradeItemBean.isChecked = false;
        allTradeItemBean.setChangeRate(Double.valueOf(C27039d.m66647g(input.getPriceRate())));
        allTradeItemBean.setLastDealPrice(C27039d.m66647g(input.getPrice()));
        allTradeItemBean.setShowSymbol(input.getDisplayToken());
        allTradeItemBean.setValue(C27039d.m66647g(input.getTradingVolume()));
        allTradeItemBean.setAlarm(false);
        allTradeItemBean.setMark(0);
        allTradeItemBean.setFavor(true);
        allTradeItemBean.setCoinLabel("");
        allTradeItemBean.setAlphaMarks(input.getAlphaMarks());
        SymbolInfoEntity symbolInfoEntity = new SymbolInfoEntity();
        symbolInfoEntity.setQuoteCurrency(input.getCurrencyUnit());
        symbolInfoEntity.setFeeCode(input.getToken());
        symbolInfoEntity.setQuoteCurrencyName(input.getKcChain());
        symbolInfoEntity.setPriceIncrement(input.getExternalChain());
        symbolInfoEntity.setMarket(input.getTokenBridgeId());
        symbolInfoEntity.setBaseCurrency(input.getCollectTypeOrCategory());
        allTradeItemBean.setSymbolInfoEntity(symbolInfoEntity);
        return allTradeItemBean;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AllTradeItemBean m92071c(@NotNull AllTradeItemBean allTradeItemBean, @NotNull MarketListEntityItem input, int i11) {
        boolean alarmingPersonal;
        Intrinsics.checkNotNullParameter(allTradeItemBean, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        allTradeItemBean.setCollectType(i11);
        allTradeItemBean.isChecked = false;
        String last24HourRate = input.getLast24HourRate();
        SymbolInfoEntity symbolInfoEntity = null;
        allTradeItemBean.setChangeRate(last24HourRate != null ? Double.valueOf(Double.parseDouble(last24HourRate)) : null);
        String lastPrice = input.getLastPrice();
        allTradeItemBean.setLastDealPrice(lastPrice != null ? Double.parseDouble(lastPrice) : 0.0d);
        allTradeItemBean.setSymbol(input.getSymbol());
        String last24HourTradingVolume = input.getLast24HourTradingVolume();
        allTradeItemBean.setValue(last24HourTradingVolume != null ? Double.parseDouble(last24HourTradingVolume) : 0.0d);
        if (i11 == 2) {
            List<String> futuresMarks = input.getFuturesMarks();
            alarmingPersonal = futuresMarks != null ? futuresMarks.contains("Price_Alarm") : false;
        } else {
            alarmingPersonal = input.getAlarmingPersonal();
        }
        allTradeItemBean.setAlarm(alarmingPersonal);
        Integer symbolMark = input.getSymbolMark();
        allTradeItemBean.setMark(symbolMark != null ? symbolMark.intValue() : 0);
        allTradeItemBean.setFavor(true);
        allTradeItemBean.setCoinLabel(input.getSymbolLabel());
        C37890n c37890n = C37890n.f85269a;
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(symbol);
        if (symbolInfoEntityM85601B != null) {
            Integer symbolMark2 = input.getSymbolMark();
            symbolInfoEntityM85601B.setMark(symbolMark2 != null ? symbolMark2.intValue() : 0);
            Integer symbolBoard = input.getSymbolBoard();
            symbolInfoEntityM85601B.setBoard(symbolBoard != null ? symbolBoard.intValue() : 0);
            Boolean tradingEnabled = input.getTradingEnabled();
            Boolean bool = Boolean.TRUE;
            symbolInfoEntityM85601B.setEnableTrading(Intrinsics.areEqual(tradingEnabled, bool));
            Long openAt = input.getOpenAt();
            symbolInfoEntityM85601B.setPreviewEnableShow((openAt != null ? openAt.longValue() : 0L) * ((long) 1000) > TimeSyncManager.f48123a.m58366p());
            symbolInfoEntityM85601B.setMarginEnabled(Intrinsics.areEqual(input.getMarginEnabled(), bool));
            symbolInfoEntityM85601B.setIsolatedMarginEnabled(Intrinsics.areEqual(input.getIsolatedEnabled(), bool));
            symbolInfoEntityM85601B.setEnableAuctionTrade(Boolean.valueOf(Intrinsics.areEqual(input.getCallAuctionSymbol(), bool)));
            symbolInfoEntity = symbolInfoEntityM85601B;
        }
        allTradeItemBean.setSymbolInfoEntity(symbolInfoEntity);
        allTradeItemBean.setMaxLeverage(input.getMaxLeverageByAccountStatus());
        return allTradeItemBean;
    }
}
