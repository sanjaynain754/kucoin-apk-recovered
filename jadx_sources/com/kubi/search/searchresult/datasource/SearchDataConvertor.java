package com.kubi.search.searchresult.datasource;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.entity.ContractEntityOpenData;
import com.kubi.margin.api.IMarginService;
import com.kubi.search.config.DataSource;
import com.kubi.search.entity.ContractEntity;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38183a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.search.searchresult.datasource.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchDataConvertor.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/search/searchresult/datasource/SearchDataConvertor;", "", "<init>", "()V", "convertSpotRemote", "Lcom/kubi/search/entity/SearchItemData;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/search/entity/SearchEntity;", "wrapSpot", "item", "Lcom/kubi/data/entity/TradeItemBean;", "convertFutureRemote", "wrapFuture", "contractInfo", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "contract", "Lcom/kubi/search/entity/ContractEntity;", "convertEarnRemote", "convertWeb3Remote", "convertAlphaRemote", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchDataConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchDataConvertor.kt\ncom/kubi/search/searchresult/datasource/SearchDataConvertor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n295#2,2:183\n295#2,2:185\n*S KotlinDebug\n*F\n+ 1 SearchDataConvertor.kt\ncom/kubi/search/searchresult/datasource/SearchDataConvertor\n*L\n34#1:183,2\n71#1:185,2\n*E\n"})
public final class SearchDataConvertor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchDataConvertor f49054a = new SearchDataConvertor();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SearchItemData m59499a(@NotNull SearchEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        ExtendEntity resourceExtend = entity.getResourceExtend();
        String strM66668h = C27041f.m66668h(entity.getResourceId());
        StringBuilder sb2 = new StringBuilder();
        String name = resourceExtend != null ? resourceExtend.getName() : null;
        if (name == null) {
            name = "";
        }
        sb2.append(name);
        sb2.append(" - ");
        String aveChainName = resourceExtend != null ? resourceExtend.getAveChainName() : null;
        sb2.append(aveChainName != null ? aveChainName : "");
        return new SearchItemData("alpha", "", "", "", false, "", false, "", "", 0.0d, strM66668h, sb2.toString(), C27041f.m66668h(entity.getCoinLabel()), null, null, entity, resourceExtend, 24576, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final SearchItemData m59500b(@NotNull SearchEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        ExtendEntity resourceExtend = entity.getResourceExtend();
        if (resourceExtend == null) {
            return null;
        }
        return new SearchItemData(SearchCategory$Companion.EARN, resourceExtend.getIcon(), C27041f.m66668h(resourceExtend.getName()), "", false, "", false, "", "", 0.0d, C27041f.m66668h(entity.getResourceId()), resourceExtend.showName(), C27041f.m66668h(entity.getCoinLabel()), null, resourceExtend, entity, null, 73728, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final SearchItemData m59501c(@NotNull SearchEntity entity) {
        Object objM103844constructorimpl;
        Object next;
        ContractEntity contractEntity;
        Intrinsics.checkNotNullParameter(entity, "entity");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = DataSource.f48855a.m59113e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                contractEntity = (ContractEntity) next;
            } while (!Intrinsics.areEqual(contractEntity != null ? contractEntity.getSymbol() : null, entity.getResourceId()));
            objM103844constructorimpl = Result.m103844constructorimpl((ContractEntity) next);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        ContractEntity contractEntity2 = (ContractEntity) objM103844constructorimpl;
        if (contractEntity2 == null) {
            return null;
        }
        ContractEntityOpenData contractEntityOpenDataMo33295y = IKuMexService.f28731a.get().mo33295y(C27041f.m66668h(contractEntity2.getSymbol()));
        String symbol = contractEntityOpenDataMo33295y.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        if (symbol.length() == 0) {
            return null;
        }
        return m59504f(contractEntityOpenDataMo33295y, contractEntity2, entity);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final SearchItemData m59502d(@NotNull SearchEntity entity) {
        Object objM103844constructorimpl;
        Object next;
        TradeItemBean tradeItemBean;
        Intrinsics.checkNotNullParameter(entity, "entity");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = DataSource.f48855a.m59114f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                tradeItemBean = (TradeItemBean) next;
            } while (!Intrinsics.areEqual(tradeItemBean != null ? tradeItemBean.getSymbol() : null, entity.getResourceId()));
            objM103844constructorimpl = Result.m103844constructorimpl((TradeItemBean) next);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        TradeItemBean tradeItemBean2 = (TradeItemBean) objM103844constructorimpl;
        if (tradeItemBean2 == null) {
            return null;
        }
        return m59505g(tradeItemBean2, entity);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final SearchItemData m59503e(@NotNull SearchEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        ExtendEntity resourceExtend = entity.getResourceExtend();
        String strM66668h = C27041f.m66668h(entity.getResourceId());
        StringBuilder sb2 = new StringBuilder();
        String name = resourceExtend != null ? resourceExtend.getName() : null;
        if (name == null) {
            name = "";
        }
        sb2.append(name);
        sb2.append(" - ");
        String chainName = resourceExtend != null ? resourceExtend.getChainName() : null;
        sb2.append(chainName != null ? chainName : "");
        return new SearchItemData(SearchCategory$Companion.WEB3, "", "", "", false, "", false, "", "", 0.0d, strM66668h, sb2.toString(), C27041f.m66668h(entity.getCoinLabel()), null, null, entity, resourceExtend, 24576, null);
    }

    /* JADX INFO: renamed from: f */
    public final SearchItemData m59504f(ContractEntityOpenData contractEntityOpenData, ContractEntity contractEntity, SearchEntity searchEntity) {
        ExtendEntity resourceExtend;
        ContractTradeItemBean contractTradeItemBean = new ContractTradeItemBean(contractEntity, contractEntityOpenData);
        return new SearchItemData(SearchCategory$Companion.FUTURES, (searchEntity == null || (resourceExtend = searchEntity.getResourceExtend()) == null) ? null : resourceExtend.getIcon(), C27041f.m66668h(C27041f.m66677q(contractEntityOpenData.getBaseCurrency())), C27041f.m66668h(C27041f.m66677q(contractEntityOpenData.getQuoteCurrency())), false, "", false, contractTradeItemBean.formatPrice(), contractTradeItemBean.formatChangeRate(), C27039d.m66646f(contractEntity != null ? contractEntity.getPriceChgPct() : null), C27041f.m66668h(contractEntityOpenData.getSymbol()), C27041f.m66668h(C27041f.m66677q(contractEntityOpenData.getBaseCurrency())) + C27041f.m66668h(C27041f.m66677q(contractEntityOpenData.getQuoteCurrency())), C27041f.m66668h(searchEntity != null ? searchEntity.getCoinLabel() : null), contractTradeItemBean, null, searchEntity, null, 81920, null);
    }

    /* JADX INFO: renamed from: g */
    public final SearchItemData m59505g(TradeItemBean tradeItemBean, SearchEntity searchEntity) {
        String strM92642g;
        ExtendEntity resourceExtend;
        String icon = (searchEntity == null || (resourceExtend = searchEntity.getResourceExtend()) == null) ? null : resourceExtend.getIcon();
        String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        String quoteCurrencyName = tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        boolean z11 = tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel() && C38183a.m86145a();
        String strMo37960t = IMarginService.f32724a.get().mo37960t(tradeItemBean);
        boolean zIsPreviewEnableShow = tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow();
        String str = "--";
        String strM59535q = tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() ? "--" : SearchExKt.m59535q(Double.valueOf(tradeItemBean.getLastDealPrice()), tradeItemBean.getSymbol());
        Double changeRate = tradeItemBean.getChangeRate();
        if (changeRate != null && (strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(changeRate.doubleValue())), null, null, 0, true, false, false, 55, null)) != null) {
            str = strM92642g;
        }
        double dM66646f = C27039d.m66646f(tradeItemBean.getChangeRate());
        String str2 = strM59535q;
        String str3 = str;
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        String showSymbol = tradeItemBean.getShowSymbol();
        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
        return new SearchItemData(SearchCategory$Companion.SPOT, icon, baseCurrencyName, quoteCurrencyName, z11, strMo37960t, zIsPreviewEnableShow, str2, str3, dM66646f, symbol, showSymbol, C27041f.m66668h(searchEntity != null ? searchEntity.getCoinLabel() : null), null, null, searchEntity, null, 90112, null);
    }
}
