package p414kv;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.quotefacade.entity.FutureTradeItemBean;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.h */
/* JADX INFO: compiled from: MarketTradeBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/MarketFuturesTradeBeanMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;", "<init>", "()V", "map", "input", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41992h implements InterfaceC41991g<MarketListEntityItem, FutureTradeItemBean> {
    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FutureTradeItemBean mo51723a(@NotNull MarketListEntityItem input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ContractEntityOpenData contractEntityOpenDataMo33295y = BQuoteFacadeDepend.f42592a.m53023c().mo33295y(C27041f.m66668h(input.getSymbol()));
        FutureTradeItemBean futureTradeItemBean = new FutureTradeItemBean(contractEntityOpenDataMo33295y, null, 2, null);
        List<String> futuresMarks = input.getFuturesMarks();
        futureTradeItemBean.fundingRate = futuresMarks != null ? futuresMarks.contains("Mask_Funding_Rate") : false ? null : input.getFundingRate();
        futureTradeItemBean.marketCap = C27039d.m66656p(input.getMarketCap()).compareTo(BigDecimal.ZERO) <= 0 ? null : input.getMarketCap();
        futureTradeItemBean.isChecked = false;
        String last24HourRate = input.getLast24HourRate();
        futureTradeItemBean.setChangeRate(last24HourRate != null ? Double.valueOf(Double.parseDouble(last24HourRate)) : null);
        String lastPrice = input.getLastPrice();
        futureTradeItemBean.setLastDealPrice(lastPrice != null ? Double.parseDouble(lastPrice) : 0.0d);
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        futureTradeItemBean.setSymbol(symbol);
        String last24HourTradingVolume = input.getLast24HourTradingVolume();
        futureTradeItemBean.setValue(last24HourTradingVolume != null ? Double.parseDouble(last24HourTradingVolume) : 0.0d);
        List<String> futuresMarks2 = input.getFuturesMarks();
        futureTradeItemBean.setAlarm(futuresMarks2 != null ? futuresMarks2.contains("Price_Alarm") : false);
        futureTradeItemBean.setFavor(input.getFavoritePersonal());
        String statusIcon = input.getStatusIcon();
        if (statusIcon == null) {
            statusIcon = "Common";
        }
        futureTradeItemBean.setStatusIcon(statusIcon);
        SymbolInfoEntity symbolInfoEntity = new SymbolInfoEntity();
        String symbol2 = input.getSymbol();
        if (symbol2 == null) {
            symbol2 = "";
        }
        symbolInfoEntity.setCode(symbol2);
        String symbol3 = input.getSymbol();
        symbolInfoEntity.setSymbol(symbol3 != null ? symbol3 : "");
        symbolInfoEntity.setBaseCurrency(contractEntityOpenDataMo33295y.getBaseCurrency());
        symbolInfoEntity.setQuoteCurrency(contractEntityOpenDataMo33295y.getQuoteCurrency());
        symbolInfoEntity.setQuoteCurrencyName(C27041f.m66669i(contractEntityOpenDataMo33295y.getQuoteCurrency(), "USDT"));
        symbolInfoEntity.setIsolatedMarginEnabled(false);
        symbolInfoEntity.setIsolatedMarginTradeEnabled(false);
        futureTradeItemBean.setSymbolInfoEntity(symbolInfoEntity);
        return futureTradeItemBean;
    }
}
