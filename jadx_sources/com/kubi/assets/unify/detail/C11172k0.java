package com.kubi.assets.unify.detail;

import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p365jb.InterfaceC40366c;
import p365jb.RecommendSymbolQuoteUiData;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.assets.unify.detail.k0 */
/* JADX INFO: compiled from: UnifiedDetailVMExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\b0\u0007H\u0000\u001a*\u0010\t\u001a\u00020\u0001*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\b0\u0007H\u0000\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006\u0011"}, m90084d2 = {"fetchSpotCodeSymbols", "", "Lcom/kubi/assets/unify/detail/UnifiedDetailVM;", "supportSpotSymbols", "", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "onError", "Lio/reactivex/functions/Consumer;", "", "fetchContractCodeSymbols", "supportContractSymbols", "createSupportSpotSymbolList", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "sendRecommendSymbolsInfoFlow", "changeList", "createSupportContractSymbolList", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedDetailVMExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedDetailVMExt.kt\ncom/kubi/assets/unify/detail/UnifiedDetailVMExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1563#2:177\n1634#2,3:178\n1617#2,9:181\n1869#2:190\n1870#2:192\n1626#2:193\n1617#2,9:194\n1869#2:203\n1870#2:205\n1626#2:206\n1617#2,9:207\n1869#2:216\n1870#2:218\n1626#2:219\n1563#2:220\n1634#2,3:221\n1563#2:224\n1634#2,2:225\n1636#2:228\n1563#2:229\n1634#2,3:230\n1068#2:233\n1563#2:234\n1634#2,3:235\n1068#2:238\n1563#2:239\n1634#2,3:240\n1#3:191\n1#3:204\n1#3:217\n1#3:227\n*S KotlinDebug\n*F\n+ 1 UnifiedDetailVMExt.kt\ncom/kubi/assets/unify/detail/UnifiedDetailVMExtKt\n*L\n77#1:177\n77#1:178,3\n110#1:181,9\n110#1:190\n110#1:192\n110#1:193\n113#1:194,9\n113#1:203\n113#1:205\n113#1:206\n117#1:207,9\n117#1:216\n117#1:218\n117#1:219\n121#1:220\n121#1:221,3\n135#1:224\n135#1:225,2\n135#1:228\n168#1:229\n168#1:230,3\n45#1:233\n46#1:234\n46#1:235,3\n79#1:238\n81#1:239\n81#1:240,3\n110#1:191\n113#1:204\n117#1:217\n*E\n"})
public final class C11172k0 {

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.k0$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 UnifiedDetailVMExt.kt\ncom/kubi/assets/unify/detail/UnifiedDetailVMExtKt\n*L\n1#1,328:1\n80#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((QuotesEntity) t12).getPriceChgPct(), ((QuotesEntity) t11).getPriceChgPct());
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.k0$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 UnifiedDetailVMExt.kt\ncom/kubi/assets/unify/detail/UnifiedDetailVMExtKt\n*L\n1#1,328:1\n45#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final List<InterfaceC40366c> m19865k(@NotNull UnifiedDetailVM unifiedDetailVM, @NotNull CoinInfoEntity coinInfoEntity) {
        String str;
        Intrinsics.checkNotNullParameter(unifiedDetailVM, "<this>");
        Intrinsics.checkNotNullParameter(coinInfoEntity, "coinInfoEntity");
        String str2 = "XBTUSDTM";
        if (!Intrinsics.areEqual(coinInfoEntity.getCode(), "USDT")) {
            if (Intrinsics.areEqual(coinInfoEntity.getCode(), "USDC")) {
                str2 = "XBTUSDCM";
            } else {
                String code = coinInfoEntity.getCode();
                if (code != null && (str = (String) CollectionsKt.firstOrNull((List) AssetsDepend.m19180c().mo33266P(code))) != null) {
                    str2 = str;
                }
            }
        }
        List<String> listListOf = CollectionsKt.listOf(str2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        for (String str3 : listListOf) {
            boolean z11 = false;
            C27096v0 c27096v0M33249T = IKuMexService.m33249T(AssetsDepend.m19180c(), str3, false, 2, null);
            String string = c27096v0M33249T.toString();
            if (c27096v0M33249T.length() == 0) {
                z11 = true;
            }
            arrayList.add(new InterfaceC40366c.Contract(str3, string, null, null, null, z11, 28, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final List<InterfaceC40366c> m19866l(@NotNull UnifiedDetailVM unifiedDetailVM, @NotNull CoinInfoEntity coinInfoEntity) {
        ArrayList<SymbolInfoEntity> arrayList;
        Intrinsics.checkNotNullParameter(unifiedDetailVM, "<this>");
        Intrinsics.checkNotNullParameter(coinInfoEntity, "coinInfoEntity");
        if (Intrinsics.areEqual(coinInfoEntity.getCode(), "USDT")) {
            List listListOf = CollectionsKt.listOf("BTC-USDT");
            arrayList = new ArrayList();
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B((String) it.next());
                if (symbolInfoEntityM85601B != null) {
                    arrayList.add(symbolInfoEntityM85601B);
                }
            }
        } else if (Intrinsics.areEqual(coinInfoEntity.getCode(), "USDC")) {
            List listListOf2 = CollectionsKt.listOf("BTC-USDC");
            arrayList = new ArrayList();
            Iterator it2 = listListOf2.iterator();
            while (it2.hasNext()) {
                SymbolInfoEntity symbolInfoEntityM85601B2 = C37890n.f85269a.m85601B((String) it2.next());
                if (symbolInfoEntityM85601B2 != null) {
                    arrayList.add(symbolInfoEntityM85601B2);
                }
            }
        } else {
            List listListOf3 = CollectionsKt.listOf(coinInfoEntity.getCode() + "-USDT");
            arrayList = new ArrayList();
            Iterator it3 = listListOf3.iterator();
            while (it3.hasNext()) {
                SymbolInfoEntity symbolInfoEntityM85601B3 = C37890n.f85269a.m85601B((String) it3.next());
                if (symbolInfoEntityM85601B3 != null) {
                    arrayList.add(symbolInfoEntityM85601B3);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SymbolInfoEntity symbolInfoEntity : arrayList) {
            String code = symbolInfoEntity.getCode();
            String showSymbol = symbolInfoEntity.getShowSymbol();
            String code2 = symbolInfoEntity.getCode();
            Intrinsics.checkNotNullExpressionValue(code2, "getCode(...)");
            arrayList2.add(new InterfaceC40366c.Spot(code, C27041f.m66669i(showSymbol, StringsKt.replace$default(code2, C33820nf.f71144W, "/", false, 4, (Object) null)), null, null, null, symbolInfoEntity.getShowSymbol() == null, 28, null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public static final void m19867m(@NotNull final UnifiedDetailVM unifiedDetailVM, @NotNull List<? extends InterfaceC40366c> supportContractSymbols, @NotNull Consumer<? super Throwable> onError) {
        Intrinsics.checkNotNullParameter(unifiedDetailVM, "<this>");
        Intrinsics.checkNotNullParameter(supportContractSymbols, "supportContractSymbols");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (supportContractSymbols.isEmpty()) {
            return;
        }
        IKuMexService iKuMexServiceM19180c = AssetsDepend.m19180c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportContractSymbols, 10));
        Iterator<T> it = supportContractSymbols.iterator();
        while (it.hasNext()) {
            String symbol = ((InterfaceC40366c) it.next()).getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            arrayList.add(symbol);
        }
        Observable<List<QuotesEntity>> observableMo33294x = iKuMexServiceM19180c.mo33294x(arrayList);
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.detail.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11172k0.m19868n((List) obj);
            }
        };
        Observable<R> map = observableMo33294x.map(new Function() { // from class: com.kubi.assets.unify.detail.b0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11172k0.m19869o(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.unify.detail.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11172k0.m19870p(unifiedDetailVM, (List) obj);
            }
        };
        Disposable disposableSubscribe = map.subscribe(new Consumer() { // from class: com.kubi.assets.unify.detail.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11172k0.m19871q(function2, obj);
            }
        }, onError);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, unifiedDetailVM.getF18967W());
    }

    /* JADX INFO: renamed from: n */
    public static final List m19868n(List list) {
        C27096v0 c27096v0M33249T;
        Intrinsics.checkNotNullParameter(list, "list");
        List<QuotesEntity> listSortedWith = CollectionsKt.sortedWith(list, new a());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (QuotesEntity quotesEntity : listSortedWith) {
            String symbol = quotesEntity.getSymbol();
            boolean z11 = false;
            String string = (symbol == null || (c27096v0M33249T = IKuMexService.m33249T(AssetsDepend.m19180c(), symbol, false, 2, null)) == null) ? null : c27096v0M33249T.toString();
            BigDecimal priceChgPct = quotesEntity.getPriceChgPct();
            String strM93915p = C42828b.m93915p(C27041f.m66669i(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, true, false, true, 23, null) : null, "--"));
            String symbol2 = quotesEntity.getSymbol();
            BigDecimal lastPrice = quotesEntity.getLastPrice();
            BigDecimal priceChgPct2 = quotesEntity.getPriceChgPct();
            if (string == null) {
                z11 = true;
            }
            arrayList.add(new InterfaceC40366c.Contract(symbol2, string, lastPrice, strM93915p, priceChgPct2, z11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final List m19869o(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: r */
    public static final void m19872r(@NotNull final UnifiedDetailVM unifiedDetailVM, @NotNull List<? extends InterfaceC40366c> supportSpotSymbols, @NotNull Consumer<? super Throwable> onError) {
        Intrinsics.checkNotNullParameter(unifiedDetailVM, "<this>");
        Intrinsics.checkNotNullParameter(supportSpotSymbols, "supportSpotSymbols");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (supportSpotSymbols.isEmpty()) {
            return;
        }
        Observable<R> observableCompose = unifiedDetailVM.m19841F().m17115a(CollectionsKt.joinToString$default(supportSpotSymbols, null, null, null, 0, null, new Function1() { // from class: com.kubi.assets.unify.detail.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11172k0.m19873s((InterfaceC40366c) obj);
            }
        }, 31, null), "android/trade_info").compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.detail.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11172k0.m19874t((ArrayList) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.assets.unify.detail.g0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11172k0.m19875u(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.unify.detail.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11172k0.m19876v(unifiedDetailVM, (List) obj);
            }
        };
        Disposable disposableSubscribe = map.subscribe(new Consumer() { // from class: com.kubi.assets.unify.detail.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11172k0.m19877w(function2, obj);
            }
        }, onError);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, unifiedDetailVM.getF18967W());
    }

    /* JADX INFO: renamed from: s */
    public static final CharSequence m19873s(InterfaceC40366c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        return symbol != null ? symbol : "";
    }

    /* JADX INFO: renamed from: t */
    public static final List m19874t(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<TradeItemBean> listSortedWith = CollectionsKt.sortedWith(list, new b());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (TradeItemBean tradeItemBean : listSortedWith) {
            String showSymbol = tradeItemBean.getShowSymbol();
            if (showSymbol == null) {
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                showSymbol = StringsKt.replace$default(symbol, C33820nf.f71144W, "/", false, 4, (Object) null);
            }
            String str = showSymbol;
            String symbol2 = tradeItemBean.getSymbol();
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice()));
            String formatChangeRate = tradeItemBean.getFormatChangeRate();
            Double changeRate = tradeItemBean.getChangeRate();
            BigDecimal bigDecimal2 = changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null;
            String symbol3 = tradeItemBean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
            arrayList.add(new InterfaceC40366c.Spot(symbol2, str, bigDecimal, formatChangeRate, bigDecimal2, symbol3.length() == 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static final List m19875u(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: x */
    public static final void m19878x(@NotNull UnifiedDetailVM unifiedDetailVM, @NotNull List<? extends InterfaceC40366c> changeList) {
        List<InterfaceC40366c> listM88949b;
        Object next;
        Intrinsics.checkNotNullParameter(unifiedDetailVM, "<this>");
        Intrinsics.checkNotNullParameter(changeList, "changeList");
        RecommendSymbolQuoteUiData value = unifiedDetailVM.m19839D().getValue();
        if (value != null && (listM88949b = value.m88949b()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM88949b, 10));
            for (InterfaceC40366c interfaceC40366c : listM88949b) {
                Iterator<T> it = changeList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(interfaceC40366c.getSymbol(), ((InterfaceC40366c) next).getSymbol()));
                InterfaceC40366c interfaceC40366c2 = (InterfaceC40366c) next;
                if (interfaceC40366c2 != null) {
                    interfaceC40366c = interfaceC40366c2;
                }
                arrayList.add(interfaceC40366c);
            }
            changeList = arrayList;
        }
        unifiedDetailVM.m19839D().setValue(new RecommendSymbolQuoteUiData(changeList, new Consumer() { // from class: com.kubi.assets.unify.detail.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11172k0.m19879y((InterfaceC40366c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static final void m19879y(InterfaceC40366c interfaceC40366c) {
        if (interfaceC40366c instanceof InterfaceC40366c.Spot) {
            InterfaceC37754f.a.m85140l(C37304a.f82764a, ((InterfaceC40366c.Spot) interfaceC40366c).getSymbol(), null, null, null, null, null, 62, null);
        } else {
            if (!(interfaceC40366c instanceof InterfaceC40366c.Contract)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC37754f.a.m85131c(C37304a.f82764a, ((InterfaceC40366c.Contract) interfaceC40366c).getSymbol(), null, null, null, null, null, null, null, null, 510, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m19870p(UnifiedDetailVM unifiedDetailVM, List list) {
        Intrinsics.checkNotNull(list);
        m19878x(unifiedDetailVM, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m19871q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m19876v(UnifiedDetailVM unifiedDetailVM, List list) {
        Intrinsics.checkNotNull(list);
        m19878x(unifiedDetailVM, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m19877w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
