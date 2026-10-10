package p414kv;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.FutureQuoteEntity;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kv.b */
/* JADX INFO: compiled from: FavTradeBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/mapper/FavAllFutureTradeBeanMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "<init>", "()V", "map", "input", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41986b implements InterfaceC41991g<FutureQuoteEntity, AllTradeItemBean> {
    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AllTradeItemBean mo51723a(@NotNull FutureQuoteEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        AllTradeItemBean allTradeItemBean = new AllTradeItemBean(0, 0L, null, 7, null);
        allTradeItemBean.setCollectType(2);
        ContractEntityOpenData contractEntityOpenDataMo33295y = BQuoteFacadeDepend.f42592a.m53023c().mo33295y(C27041f.m66668h(input.getSymbol()));
        allTradeItemBean.isChecked = false;
        BigDecimal priceChgPct = input.getPriceChgPct();
        allTradeItemBean.setChangeRate(priceChgPct != null ? Double.valueOf(priceChgPct.doubleValue()) : null);
        Number lastPrice = input.getLastPrice();
        if (lastPrice == null) {
            lastPrice = Double.valueOf(0.0d);
        }
        allTradeItemBean.setLastDealPrice(lastPrice.doubleValue());
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        allTradeItemBean.setSymbol(symbol);
        Double dM92063c = m92063c(contractEntityOpenDataMo33295y, input);
        allTradeItemBean.setValue(dM92063c != null ? dM92063c.doubleValue() : 0.0d);
        allTradeItemBean.setFavor(true);
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
        allTradeItemBean.setSymbolInfoEntity(symbolInfoEntity);
        return allTradeItemBean;
    }

    /* JADX INFO: renamed from: c */
    public static final Double m92063c(ContractEntityOpenData contractEntityOpenData, FutureQuoteEntity futureQuoteEntity) {
        BigDecimal turnover;
        if (C27025c.m66566d(Boolean.valueOf(contractEntityOpenData.isInverse()))) {
            turnover = futureQuoteEntity.getVolume();
        } else {
            turnover = futureQuoteEntity.getTurnover();
        }
        if (turnover != null) {
            return Double.valueOf(turnover.doubleValue());
        }
        return null;
    }
}
