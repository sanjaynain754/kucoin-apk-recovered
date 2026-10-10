package com.kubi.spot.business.delegation;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.Resource;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import f00.C37304a;
import f30.C37340k;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p311hf.C38184b;
import p402kf.C41014a;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeFundsListViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010%\u001a\u00020&J\u001e\u0010'\u001a\u00020\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010%\u001a\u00020&H\u0002J\u001e\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010%\u001a\u00020&H\u0002J\u001e\u0010+\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010,\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\n\u0010.\u001a\u0004\u0018\u00010/H\u0002J\n\u00100\u001a\u0004\u0018\u000101H\u0002J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00162\u0006\u00104\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u00066"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "tradeFundsRepo", "Lcom/kubi/spot/business/delegation/ITradeFundsRepo;", "_hideSmallFunds", "Landroidx/lifecycle/MutableLiveData;", "", "hideSmallFunds", "Landroidx/lifecycle/LiveData;", "getHideSmallFunds", "()Landroidx/lifecycle/LiveData;", "_fundSortRule", "", "fundSortRule", "getFundSortRule", "accountItemList", "", "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "_displayAccountItemList", "Lcom/kubi/sdk/Resource;", "", "Lcom/kubi/spot/business/delegation/AccountItemEntityWrapper;", "displayAccountItemList", "getDisplayAccountItemList", "updateHideSmallFunds", "", "isHide", "currentTradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "updateSortRule", "type", "fetchCurrencyList", "refreshAccountItemList", "filterFunds", "allData", "currentSymbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "sortFundsByRule", "filterData", "addQuote", "filter", "addBase", "addFundLabel", "filterWrapperData", "gitSmallQuoteLimit", "Ljava/math/BigDecimal;", "getSmallCoinCurrency", "", "getAddFundsItems", "Lcom/kubi/spot/business/delegation/AddFundsItem;", "amountItem", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFundsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n1563#2:435\n1634#2,3:436\n774#2:439\n865#2,2:440\n774#2:442\n865#2,2:443\n*S KotlinDebug\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n*L\n157#1:435\n157#1:436,3\n177#1:439\n177#1:440,2\n182#1:442\n182#1:443,2\n*E\n"})
public final class TradeFundsListViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f49931f0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ITradeFundsRepo f49932X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f49933Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<Boolean> f49934Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Integer> f49935a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<Integer> f49936b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final List<AccountItemEntity> f49937c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Resource<List<AccountItemEntityWrapper>>> f49938d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Resource<List<AccountItemEntityWrapper>>> f49939e0;

    /* JADX INFO: compiled from: TradeFundsListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeFundsListViewModel$Companion;", "", "<init>", "()V", "TAG", "", "FUNDS_SORT_RULE_DEFAULT", "", "FUNDS_SORT_RULE_BY_MONEY", "FUNDS_SORT_RULE_BY_NAME", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListViewModel$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n*L\n1#1,328:1\n248#2:329\n*E\n"})
    public static final class C24799a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((AccountItemEntity) t11).getCurrency(), ((AccountItemEntity) t12).getCurrency());
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListViewModel$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n*L\n1#1,328:1\n210#2,2:329\n*E\n"})
    public static final class C24800b<T> implements Comparator {
        public C24800b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            AccountItemEntity accountItemEntity = (AccountItemEntity) t12;
            AccountItemEntity accountItemEntity2 = (AccountItemEntity) t11;
            return ComparisonsKt.compareValues(C41014a.m89916A(C41014a.m89922G(accountItemEntity.getTotalBalance(), null, 1, null), accountItemEntity.getCurrency(), TradeFundsListViewModel.this.m60743N()), C41014a.m89916A(C41014a.m89922G(accountItemEntity2.getTotalBalance(), null, 1, null), accountItemEntity2.getCurrency(), TradeFundsListViewModel.this.m60743N()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListViewModel$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n*L\n1#1,328:1\n239#2,2:329\n*E\n"})
    public static final class C24801c<T> implements Comparator {
        public C24801c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            AccountItemEntity accountItemEntity = (AccountItemEntity) t12;
            AccountItemEntity accountItemEntity2 = (AccountItemEntity) t11;
            return ComparisonsKt.compareValues(C41014a.m89916A(C41014a.m89922G(accountItemEntity.getTotalBalance(), null, 1, null), accountItemEntity.getCurrency(), TradeFundsListViewModel.this.m60743N()), C41014a.m89916A(C41014a.m89922G(accountItemEntity2.getTotalBalance(), null, 1, null), accountItemEntity2.getCurrency(), TradeFundsListViewModel.this.m60743N()));
        }
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m60717G(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C37340k.f82854a.m83929f(currency);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m60718H(AccountItemEntity accountItemEntity, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (Intrinsics.areEqual(Boolean.TRUE, accountItemEntity.isDigital())) {
            InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), currency, null, null, null, null, 121, null);
        } else {
            InterfaceC37758j.a.m85163l(C37304a.f82764a, null, currency, null, null, null, null, null, 125, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m60719I(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        InterfaceC37749a.a.m85117l(C37304a.f82764a, currency, null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m60720J(String str, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage?from=" + str + "&to=" + currency)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Comparable m60721R(SymbolInfoEntity symbolInfoEntity, AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!Intrinsics.areEqual(it.getCurrency(), symbolInfoEntity.getBaseCurrency()));
    }

    /* JADX INFO: renamed from: S */
    public static final Comparable m60722S(SymbolInfoEntity symbolInfoEntity, AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!Intrinsics.areEqual(it.getCurrency(), symbolInfoEntity.getQuoteCurrency()));
    }

    /* JADX INFO: renamed from: A */
    public final void m60734A(List<AccountItemEntity> list, SymbolInfoEntity symbolInfoEntity) {
        C37890n c37890n = C37890n.f85269a;
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(baseCurrency);
        list.add(0, new AccountItemEntity(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getName() : null, false, null, null, null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, null, null, null, null, null, 7996, null));
    }

    /* JADX INFO: renamed from: B */
    public final void m60735B(List<AccountItemEntityWrapper> list) {
        Integer value = this.f49935a0.getValue();
        if (value != null && value.intValue() == 0) {
            if (!list.isEmpty()) {
                list.get(0).setLabelText(C27017c.f54310a.m66516f(R$string.unify_fund_current_pair, new Object[0]));
            }
            if (list.size() >= 3) {
                list.get(2).setLabelText(C27017c.f54310a.m66516f(R$string.kc_trade_funds_other, new Object[0]));
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m60736C(List<AccountItemEntity> list, SymbolInfoEntity symbolInfoEntity) {
        C37890n c37890n = C37890n.f85269a;
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(quoteCurrency);
        list.add(1, new AccountItemEntity(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getName() : null, false, null, null, null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, null, null, null, null, null, 7996, null));
    }

    /* JADX INFO: renamed from: D */
    public final void m60737D(@NotNull TradeItemBean currentTradeItem) {
        Intrinsics.checkNotNullParameter(currentTradeItem, "currentTradeItem");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeFundsListViewModel$fetchCurrencyList$1(this, currentTradeItem, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final List<AccountItemEntity> m60738E(@NotNull List<AccountItemEntity> allData, @NotNull SymbolInfoEntity currentSymbol) {
        Intrinsics.checkNotNullParameter(allData, "allData");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        ArrayList arrayList = new ArrayList();
        for (Object obj : allData) {
            AccountItemEntity accountItemEntity = (AccountItemEntity) obj;
            if (Intrinsics.areEqual(accountItemEntity.getCurrency(), currentSymbol.getBaseCurrency()) || Intrinsics.areEqual(accountItemEntity.getCurrency(), currentSymbol.getQuoteCurrency()) || C41014a.m89916A(accountItemEntity.getTotalBalance(), accountItemEntity.getCurrency(), m60743N()).compareTo(new BigDecimal(0)) > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            AccountItemEntity accountItemEntity2 = (AccountItemEntity) obj2;
            if (!Intrinsics.areEqual(this.f49933Y.getValue(), Boolean.TRUE) || C41014a.m89916A(accountItemEntity2.getTotalBalance(), accountItemEntity2.getCurrency(), m60743N()).compareTo(m60744O()) >= 0) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final List<AddFundsItem> m60739F(@NotNull final AccountItemEntity amountItem) {
        Intrinsics.checkNotNullParameter(amountItem, "amountItem");
        Context contextM66513b = C27017c.f54310a.m66513b();
        final String strM86146a = C38184b.f85884a.m86146a();
        ArrayList arrayList = new ArrayList();
        String string = contextM66513b.getString(R$string.transfer);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = contextM66513b.getString(R$string.unify_transfer_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new AddFundsItem(string, string2, R$drawable.ic2_transfer_20, new Function1() { // from class: com.kubi.spot.business.delegation.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListViewModel.m60719I((String) obj);
            }
        }));
        if (C24129b.m58030b(SiteVisibleConfigKey.Convert) && !Intrinsics.areEqual(amountItem.getCurrency(), strM86146a)) {
            String string3 = contextM66513b.getString(R$string.coin_convert);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = contextM66513b.getString(R$string.unify_convert_desc);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new AddFundsItem(string3, string4, R$drawable.ic2_convert_20, new Function1() { // from class: com.kubi.spot.business.delegation.f1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeFundsListViewModel.m60720J(strM86146a, (String) obj);
                }
            }));
        }
        String string5 = contextM66513b.getString(R$string.deposit_coin);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = contextM66513b.getString(R$string.unify_deposit_desc);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new AddFundsItem(string5, string6, R$drawable.ic2_deposit_20, new Function1() { // from class: com.kubi.spot.business.delegation.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListViewModel.m60717G((String) obj);
            }
        }));
        if (C24129b.m58030b(SiteVisibleConfigKey.FastTrade)) {
            String string7 = contextM66513b.getString(R$string.otc_fast_trade);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = contextM66513b.getString(R$string.unify_fast_trade_desc);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            arrayList.add(new AddFundsItem(string7, string8, R$drawable.ic2_buy_crypto2_20, new Function1() { // from class: com.kubi.spot.business.delegation.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeFundsListViewModel.m60718H(amountItem, (String) obj);
                }
            }));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveData<Resource<List<AccountItemEntityWrapper>>> m60740K() {
        return this.f49939e0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LiveData<Integer> m60741L() {
        return this.f49936b0;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LiveData<Boolean> m60742M() {
        return this.f49934Z;
    }

    /* JADX INFO: renamed from: N */
    public final String m60743N() {
        return SpotDepend.f51244a.m63031a().mo15339d();
    }

    /* JADX INFO: renamed from: O */
    public final BigDecimal m60744O() {
        return SpotDepend.f51244a.m63031a().mo15336a();
    }

    /* JADX INFO: renamed from: P */
    public final void m60745P(TradeItemBean tradeItemBean) {
        List<AccountItemEntity> listM66558a = C27024b.m66558a(this.f49937c0);
        SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
        C44128b.m97259c(getF46844V(), "refreshAccountItemList: allData: " + listM66558a.size());
        C44128b.m97259c(getF46844V(), "refreshAccountItemList: 是否过滤小额资产: " + this.f49933Y.getValue());
        Intrinsics.checkNotNull(symbolInfoEntity);
        List<AccountItemEntity> listM60738E = m60738E(listM66558a, symbolInfoEntity);
        C44128b.m97259c(getF46844V(), "refreshAccountItemList: 排序规则: " + this.f49935a0.getValue());
        m60746Q(listM60738E, symbolInfoEntity);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM60738E, 10));
        Iterator<T> it = listM60738E.iterator();
        while (it.hasNext()) {
            arrayList.add(new AccountItemEntityWrapper((AccountItemEntity) it.next(), null, 2, null));
        }
        m60735B(arrayList);
        C44128b.m97259c(getF46844V(), "refreshAccountItemList: 最终数量: " + listM60738E.size());
        this.f49938d0.postValue(Resource.f46439d.success(arrayList));
    }

    /* JADX INFO: renamed from: Q */
    public final void m60746Q(List<AccountItemEntity> list, final SymbolInfoEntity symbolInfoEntity) {
        Integer value = this.f49935a0.getValue();
        if (value == null || value.intValue() != 0) {
            if (value != null && value.intValue() == 1) {
                CollectionsKt.sortWith(list, new C24801c());
                return;
            } else {
                if (value != null && value.intValue() == 2) {
                    CollectionsKt.sortWith(list, new C24799a());
                    return;
                }
                return;
            }
        }
        CollectionsKt.sortWith(list, new C24800b());
        CollectionsKt.sortWith(list, ComparisonsKt.compareBy(new Function1() { // from class: com.kubi.spot.business.delegation.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListViewModel.m60721R(symbolInfoEntity, (AccountItemEntity) obj);
            }
        }, new Function1() { // from class: com.kubi.spot.business.delegation.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListViewModel.m60722S(symbolInfoEntity, (AccountItemEntity) obj);
            }
        }));
        if (!list.isEmpty()) {
            AccountItemEntity accountItemEntity = (AccountItemEntity) CollectionsKt.firstOrNull((List) list);
            if (!Intrinsics.areEqual(accountItemEntity != null ? accountItemEntity.getCurrency() : null, symbolInfoEntity.getBaseCurrency())) {
                m60734A(list, symbolInfoEntity);
            }
        }
        if (list.size() >= 2 && !Intrinsics.areEqual(list.get(1).getCurrency(), symbolInfoEntity.getQuoteCurrency())) {
            m60736C(list, symbolInfoEntity);
        }
        if (list.isEmpty()) {
            m60734A(list, symbolInfoEntity);
            m60736C(list, symbolInfoEntity);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m60747T(boolean z11, @NotNull TradeItemBean currentTradeItem) {
        Intrinsics.checkNotNullParameter(currentTradeItem, "currentTradeItem");
        C44128b.m97259c(getF46844V(), "updateHideSmallFunds: isHide: " + z11);
        this.f49933Y.setValue(Boolean.valueOf(z11));
        this.f49932X.mo60961b(z11);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeFundsListViewModel$updateHideSmallFunds$1(this, currentTradeItem, null), 2, null);
    }

    /* JADX INFO: renamed from: U */
    public final void m60748U(int i11, @NotNull TradeItemBean currentTradeItem) {
        Intrinsics.checkNotNullParameter(currentTradeItem, "currentTradeItem");
        this.f49935a0.setValue(Integer.valueOf(i11));
        this.f49932X.mo60964e(i11);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeFundsListViewModel$updateSortRule$1(this, currentTradeItem, null), 2, null);
    }

    public TradeFundsListViewModel() {
        TradeFundsRepo tradeFundsRepo = new TradeFundsRepo();
        this.f49932X = tradeFundsRepo;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.f49933Y = mutableLiveData;
        this.f49934Z = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.f49935a0 = mutableLiveData2;
        this.f49936b0 = mutableLiveData2;
        this.f49937c0 = new ArrayList();
        MutableLiveData<Resource<List<AccountItemEntityWrapper>>> mutableLiveData3 = new MutableLiveData<>();
        this.f49938d0 = mutableLiveData3;
        this.f49939e0 = mutableLiveData3;
        mutableLiveData.setValue(Boolean.valueOf(tradeFundsRepo.mo60963d()));
        mutableLiveData2.setValue(Integer.valueOf(tradeFundsRepo.mo60960a()));
    }
}
