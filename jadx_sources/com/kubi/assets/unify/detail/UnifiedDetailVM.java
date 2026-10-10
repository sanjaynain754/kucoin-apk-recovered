package com.kubi.assets.unify.detail;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.CurrencyAssetsEntity;
import com.kubi.assets.entity.MaxWithdrawData;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import f00.C37304a;
import g00.InterfaceC37749a;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p311hf.C38184b;
import p365jb.RecommendSymbolQuoteUiData;
import p365jb.UnifiedAccountDetailUiData;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: UnifiedDetailVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J!\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0002\u0010,J&\u0010-\u001a\u00020'*\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)2\u000e\u0010.\u001a\n\u0012\u0006\b\u0000\u0012\u0002000/H\u0002J\u001f\u00101\u001a\u00020\"2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0002J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u0002052\u0006\u00102\u001a\u000203H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006;"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UnifiedDetailVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "unifiedApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getUnifiedApi$AssetsCenterLib_googleRelease", "()Lcom/kubi/assets/AssetV2Api;", "unifiedApi$delegate", "Lkotlin/Lazy;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDestroyDisposable$AssetsCenterLib_googleRelease", "()Lio/reactivex/disposables/CompositeDisposable;", "_coinBottomFuncListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/kubi/assets/unify/detail/BottomFunctionData;", "coinBottomFuncListFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCoinBottomFuncListFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "_currencyAssetsEntityFlow", "Lcom/kubi/assets/unify/detail/data/UnifiedAccountDetailUiData;", "currencyAssetsEntityFlow", "getCurrencyAssetsEntityFlow", "internalRecommendSymbolsFlow", "Lcom/kubi/assets/unify/detail/data/RecommendSymbolQuoteUiData;", "getInternalRecommendSymbolsFlow$AssetsCenterLib_googleRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "recommendSymbolsFlow", "getRecommendSymbolsFlow", "onCleared", "", "sendIntent", "intent", "Lcom/kubi/assets/unify/detail/UiIntent;", "fetchAccountDetail", "Lkotlinx/coroutines/Job;", "code", "", "collateralStatus", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/coroutines/Job;", "startLoadRecommendSymbolsData", "onError", "Lio/reactivex/functions/Consumer;", "", "queryByCurrency", "codeEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "isShowCFlashTrade", "", "(Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/Boolean;)V", "queryMaxWithdraw", "updateBottomCoinFuncList", "(Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/Boolean;)Ljava/util/List;", "isDisplayRepayFunc", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifiedDetailVM extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18966V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedDetailVM.m19815T();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f18967W = new CompositeDisposable();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41669n<List<BottomFunctionData>> f18968X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41678w<List<BottomFunctionData>> f18969Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41669n<UnifiedAccountDetailUiData> f18970Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC41678w<UnifiedAccountDetailUiData> f18971a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC41669n<RecommendSymbolQuoteUiData> f18972b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC41678w<RecommendSymbolQuoteUiData> f18973c0;

    /* JADX INFO: renamed from: I */
    public static final Unit m19807I(UnifiedDetailVM unifiedDetailVM, CoinInfoEntity coinInfoEntity, Boolean bool, CurrencyAssetsEntity currencyAssetsEntity) {
        UnifiedAccountDetailUiData value = unifiedDetailVM.f18970Z.getValue();
        UnifiedAccountDetailUiData unifiedAccountDetailUiData = value == null ? new UnifiedAccountDetailUiData(coinInfoEntity.getCode(), coinInfoEntity.getIconUrl(), coinInfoEntity.getName(), null, null, null, null, null, null, null, 1016, null) : value;
        InterfaceC41669n<UnifiedAccountDetailUiData> interfaceC41669n = unifiedDetailVM.f18970Z;
        BigDecimal equity = currencyAssetsEntity.getEquity();
        BigDecimal liability = currencyAssetsEntity.getLiability();
        BigDecimal unrealisedPnl = currencyAssetsEntity.getUnrealisedPnl();
        BigDecimal hold = currencyAssetsEntity.getHold();
        if (hold == null) {
            hold = BigDecimal.ZERO;
        }
        BigDecimal locked = currencyAssetsEntity.getLocked();
        if (locked == null) {
            locked = BigDecimal.ZERO;
        }
        interfaceC41669n.setValue(UnifiedAccountDetailUiData.m88950b(unifiedAccountDetailUiData, null, null, null, equity, null, liability, unrealisedPnl, hold.add(locked), null, null, 791, null));
        unifiedDetailVM.f18968X.setValue(unifiedDetailVM.m19847U(coinInfoEntity, bool));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m19811N(UnifiedDetailVM unifiedDetailVM, CoinInfoEntity coinInfoEntity, MaxWithdrawData maxWithdrawData) {
        UnifiedAccountDetailUiData value = unifiedDetailVM.f18970Z.getValue();
        unifiedDetailVM.f18970Z.setValue(UnifiedAccountDetailUiData.m88950b(value == null ? new UnifiedAccountDetailUiData(coinInfoEntity.getCode(), coinInfoEntity.getIconUrl(), coinInfoEntity.getName(), null, null, null, null, null, null, null, 1016, null) : value, null, null, null, null, maxWithdrawData.getMaxWithdraw(), null, null, null, null, null, 1007, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m19816V(CoinInfoEntity coinInfoEntity, Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C37304a c37304a = C37304a.f82764a;
        String code = coinInfoEntity.getCode();
        if (code == null) {
            code = C38184b.f85884a.m86146a();
        }
        InterfaceC37749a.a.m85117l(c37304a, code, null, "UNIFIED", null, null, null, null, 122, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m19817W(UnifiedDetailVM unifiedDetailVM, Fragment fragment) {
        Context context;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        UnifiedAccountDetailUiData value = unifiedDetailVM.f18971a0.getValue();
        if (value != null && (context = fragment.getContext()) != null) {
            IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
            String currency = value.getCurrency();
            BigDecimal liability = value.getLiability();
            if (liability == null) {
                liability = BigDecimal.ZERO;
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            iUnifyAccountService.mo65006v(context, currency, liability, childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m19818X(CoinInfoEntity coinInfoEntity, Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        String code = coinInfoEntity.getCode();
        if (code == null) {
            code = "";
        }
        AssetsHelper.m19136C(assetsHelper, code, C38184b.f85884a.m86146a(), false, 4, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final InterfaceC41678w<List<BottomFunctionData>> m19836A() {
        return this.f18969Y;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final InterfaceC41678w<UnifiedAccountDetailUiData> m19837B() {
        return this.f18971a0;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final CompositeDisposable getF18967W() {
        return this.f18967W;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final InterfaceC41669n<RecommendSymbolQuoteUiData> m19839D() {
        return this.f18972b0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final InterfaceC41678w<RecommendSymbolQuoteUiData> m19840E() {
        return this.f18973c0;
    }

    /* JADX INFO: renamed from: F */
    public final AssetV2Api m19841F() {
        return (AssetV2Api) this.f18966V.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m19842G(CoinInfoEntity coinInfoEntity) {
        UnifiedAccountDetailUiData value = this.f18971a0.getValue();
        if (value != null && value.getLiability() != null) {
            return false;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final void m19845R(@NotNull UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof UiIntent.LoadRecommendSymbolsData) {
            UiIntent.LoadRecommendSymbolsData loadRecommendSymbolsData = (UiIntent.LoadRecommendSymbolsData) intent;
            m19846S(this, loadRecommendSymbolsData.getCode(), loadRecommendSymbolsData.m19854b());
        } else {
            if (!(intent instanceof UiIntent.FetchAccountDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            UiIntent.FetchAccountDetail fetchAccountDetail = (UiIntent.FetchAccountDetail) intent;
            m19848z(fetchAccountDetail.getCode(), fetchAccountDetail.getCollateralStatus());
        }
    }

    /* JADX INFO: renamed from: U */
    public final List<BottomFunctionData> m19847U(final CoinInfoEntity coinInfoEntity, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (C24129b.m58030b(SiteVisibleConfigKey.Convert) && coinInfoEntity.isDigital() && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            arrayList.add(new BottomFunctionData(C27017c.f54310a.m66516f(R$string.coin_convert, new Object[0]), new Function1() { // from class: com.kubi.assets.unify.detail.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UnifiedDetailVM.m19818X(coinInfoEntity, (Fragment) obj);
                }
            }));
        }
        C27017c c27017c = C27017c.f54310a;
        arrayList.add(new BottomFunctionData(c27017c.m66516f(R$string.transfer, new Object[0]), new Function1() { // from class: com.kubi.assets.unify.detail.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedDetailVM.m19816V(coinInfoEntity, (Fragment) obj);
            }
        }));
        if (m19842G(coinInfoEntity)) {
            arrayList.add(new BottomFunctionData(c27017c.m66516f(R$string.repay_coin, new Object[0]), new Function1() { // from class: com.kubi.assets.unify.detail.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UnifiedDetailVM.m19817W(this.f19007b, (Fragment) obj);
                }
            }));
        }
        return arrayList;
    }

    public UnifiedDetailVM() {
        InterfaceC41669n<List<BottomFunctionData>> interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f18968X = interfaceC41669nM91009a;
        this.f18969Y = interfaceC41669nM91009a;
        InterfaceC41669n<UnifiedAccountDetailUiData> interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f18970Z = interfaceC41669nM91009a2;
        this.f18971a0 = C41636g.m90907c(interfaceC41669nM91009a2);
        InterfaceC41669n<RecommendSymbolQuoteUiData> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f18972b0 = interfaceC41669nM91009a3;
        this.f18973c0 = C41636g.m90907c(interfaceC41669nM91009a3);
    }

    /* JADX INFO: renamed from: J */
    public static final void m19808J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m19809K(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m19810L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static final void m19812O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m19813P(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m19814Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final AssetV2Api m19815T() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: H */
    public final void m19843H(final CoinInfoEntity coinInfoEntity, final Boolean bool) {
        AssetV2Api assetV2ApiM19841F = m19841F();
        String code = coinInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        Observable<R> observableCompose = assetV2ApiM19841F.m17072A0(code).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.detail.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedDetailVM.m19807I(this.f19008b, coinInfoEntity, bool, (CurrencyAssetsEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.unify.detail.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifiedDetailVM.m19808J(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.unify.detail.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedDetailVM.m19809K((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.unify.detail.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifiedDetailVM.m19810L(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f18967W);
    }

    /* JADX INFO: renamed from: M */
    public final void m19844M(final CoinInfoEntity coinInfoEntity) {
        AssetV2Api assetV2ApiM19841F = m19841F();
        String code = coinInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        Observable<R> observableCompose = assetV2ApiM19841F.m17084G0(code).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.detail.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedDetailVM.m19811N(this.f19001b, coinInfoEntity, (MaxWithdrawData) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.unify.detail.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifiedDetailVM.m19812O(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.unify.detail.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedDetailVM.m19813P((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.unify.detail.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifiedDetailVM.m19814Q(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f18967W);
    }

    /* JADX INFO: renamed from: S */
    public final InterfaceC41775x1 m19846S(UnifiedDetailVM unifiedDetailVM, String str, Consumer<? super Throwable> consumer) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(unifiedDetailVM), null, null, new UnifiedDetailVM$startLoadRecommendSymbolsData$1(str, unifiedDetailVM, consumer, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f18967W.clear();
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC41775x1 m19848z(String str, Integer num) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new UnifiedDetailVM$fetchAccountDetail$1(str, this, num, null), 3, null);
    }
}
