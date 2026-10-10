package com.kubi.quotefacade.favorites.recommend;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.quotefacade.entity.RecommendQuoteEntity;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p414kv.InterfaceC41991g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.recommend.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecommendBeanMapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendBeanMapper;", "Lcom/kubi/quotefacade/mapper/IMapper;", "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "<init>", "()V", "map", "input", "getBaseName", "", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getQuoteName", "getQuoteCurrencyName", "symbol", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendBeanMapper implements InterfaceC41991g<RecommendQuoteEntity, RecommendItemBean> {
    /* JADX INFO: renamed from: b */
    public final String m51724b(SymbolInfoEntity symbolInfoEntity) {
        return C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrencyName() : null);
    }

    /* JADX INFO: renamed from: c */
    public final String m51725c(SymbolInfoEntity symbolInfoEntity, String str) {
        return C27041f.m66669i(symbolInfoEntity != null ? symbolInfoEntity.getShowSymbol() : null, str);
    }

    /* JADX INFO: renamed from: d */
    public final String m51726d(SymbolInfoEntity symbolInfoEntity) {
        return C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrencyName() : null);
    }

    @Override // p414kv.InterfaceC41991g
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public RecommendItemBean mo51723a(@NotNull RecommendQuoteEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String symbol = input.getSymbol();
        BigDecimal currentPrice = input.getCurrentPrice();
        BigDecimal increaseDndDecrease = input.getIncreaseDndDecrease();
        RecommendItemBean recommendItemBean = new RecommendItemBean(symbol, null, input.getBaseCurrency(), null, input.getQuoteCurrency(), null, currentPrice, increaseDndDecrease, null, input.getCollectType(), input.getIconUrl(), null, 2346, null);
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(input.getSymbol()));
        Integer collectType = recommendItemBean.getCollectType();
        if (collectType != null && collectType.intValue() == 2) {
            recommendItemBean.setBaseCurrencyName(C27041f.m66668h(input.getBaseCurrency()));
            recommendItemBean.setSymbolName(C27041f.m66668h(input.getBaseCurrency()));
            recommendItemBean.setQuoteCurrencyName(C27041f.m66668h(input.getQuoteCurrency()));
            return recommendItemBean;
        }
        recommendItemBean.setBaseCurrencyName(m51724b(symbolInfoEntityM85601B));
        recommendItemBean.setSymbolName(m51725c(symbolInfoEntityM85601B, C27041f.m66668h(input.getSymbol())));
        recommendItemBean.setQuoteCurrencyName(m51726d(symbolInfoEntityM85601B));
        return recommendItemBean;
    }
}
