package com.kubi.core.biz.bottomtab.order;

import cd.InterfaceC4934a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.utils.C12463b;
import com.kubi.data.coin.info.SymbolsInfo;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.BalanceData;
import p756xc.C46135i;
import p756xc.TradeSymbolBalance;
import p793yc.InterfaceC46460b;
import p793yc.InterfaceC46463e;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BottomOrderTabsSharedVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0002H\u0016J\u0018\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0002J\u0012\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020\u001cH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsSharedVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;", "repoManager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$BizEvent;", "eventSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventSharedFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "balanceCollectJob", "Lkotlinx/coroutines/Job;", "orderChangeCollectJob", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "initState", "getInitState", "()Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "isOnlyCurrentSymbol", "", "pageIndex", "", "pageSize", "orderLevel", "Lcom/kubi/core/base/order/data/OrderLevelType;", "sendBizIntent", "", "intent", "updateCancelAllEnable", "orderLevelType", "isCancelAllBtnEnable", "onCleared", "collectOrderChangeSocket", "executeActiveOrdersCount", "sendUpdateDepositEntrance", "quoteBalance", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "isBuy", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BottomOrderTabsSharedVM extends AbsTradeBaseBizVM<BottomOrderTabsContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41668m<InterfaceC11746a> f20217X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41673r<InterfaceC11746a> f20218Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f20219Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC41775x1 f20220a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final CompositeDisposable f20221b0;

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C */
    public final Observable<BasePageEntity<OrderItem>> m21412C(boolean z11, int i11, int i12, @Nullable OrderLevelType orderLevelType) {
        InterfaceC46463e<Request, OrderItem, OrderItem> f101560d;
        String strM66668h = z11 ? C27041f.m66668h(((UiState) getState()).getSymbol()) : null;
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().mo96893b();
        if (interfaceC4934aMo96893b == null || (f101560d = interfaceC4934aMo96893b.getF101560d()) == null) {
            return null;
        }
        return f101560d.mo66265a(new Request(strM66668h, null, orderLevelType, i11, i12, null, null, 98, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m21418y() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20220a0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().mo96893b();
        if (interfaceC4934aMo96893b == null) {
            return;
        }
        this.f20220a0 = m21022b(C41636g.m90894R(interfaceC4934aMo96893b.mo5160h(), interfaceC4934aMo96893b.mo5155c()), new BottomOrderTabsSharedVM$collectOrderChangeSocket$1(this, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrderTabsSharedVM(@NotNull AbstractC46753c repoManager) {
        super(repoManager);
        Intrinsics.checkNotNullParameter(repoManager, "repoManager");
        InterfaceC41668m<InterfaceC11746a> interfaceC41668mM91001b = C41674s.m91001b(0, 1, null, 5, null);
        this.f20217X = interfaceC41668mM91001b;
        this.f20218Y = interfaceC41668mM91001b;
        this.f20221b0 = new CompositeDisposable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final Unit m21398A(BottomOrderTabsSharedVM bottomOrderTabsSharedVM, final Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer activeOrderCount = it.getActiveOrderCount();
        int iIntValue = activeOrderCount != null ? activeOrderCount.intValue() : 0;
        Integer activeAdvancedOrderCount = it.getActiveAdvancedOrderCount();
        final int iIntValue2 = iIntValue + (activeAdvancedOrderCount != null ? activeAdvancedOrderCount.intValue() : 0);
        bottomOrderTabsSharedVM.updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.order.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomOrderTabsSharedVM.m21399B(it, iIntValue2, (UiState) obj);
            }
        });
        bottomOrderTabsSharedVM.m21416I(((UiState) bottomOrderTabsSharedVM.getState()).getQuoteBalance());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final UiState m21399B(Response response, int i11, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, false, false, false, response.getActiveOrderCount(), response.getActiveAdvancedOrderCount(), i11, 127, null);
    }

    /* JADX INFO: renamed from: G */
    public static final UiState m21400G(BottomOrderTabsContract$UiIntent bottomOrderTabsContract$UiIntent, BalanceData balanceData, BalanceData balanceData2, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((BottomOrderTabsContract$UiIntent.ChangeSymbol) bottomOrderTabsContract$UiIntent).getSymbolInfoEntity().getCode(), balanceData, balanceData2, false, false, false, false, null, null, 0, 1016, null);
    }

    /* JADX INFO: renamed from: H */
    public static final UiState m21401H(BottomOrderTabsContract$UiIntent bottomOrderTabsContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        BottomOrderTabsContract$UiIntent.BalanceChange balanceChange = (BottomOrderTabsContract$UiIntent.BalanceChange) bottomOrderTabsContract$UiIntent;
        TradeSymbolBalance tradeBalance = balanceChange.getTradeBalance();
        BalanceData base = tradeBalance != null ? tradeBalance.getBase() : null;
        TradeSymbolBalance tradeBalance2 = balanceChange.getTradeBalance();
        return UiState.copy$default(updateState, null, base, tradeBalance2 != null ? tradeBalance2.getQuote() : null, false, false, false, false, null, null, 0, 1017, null);
    }

    /* JADX INFO: renamed from: K */
    public static final UiState m21402K(boolean z11, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, false, false, z11, null, null, 0, 959, null);
    }

    /* JADX INFO: renamed from: L */
    public static final UiState m21403L(boolean z11, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, null, null, false, false, z11, false, null, null, 0, 991, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final InterfaceC41673r<InterfaceC11746a> m21413D() {
        return this.f20218Y;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, null, null, false, false, false, false, null, null, 0, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public void m21415F(@NotNull final BottomOrderTabsContract$UiIntent intent) {
        BalanceData quote;
        BalanceData base;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof BottomOrderTabsContract$UiIntent.ChangeSymbol) {
            BottomOrderTabsContract$UiIntent.ChangeSymbol changeSymbol = (BottomOrderTabsContract$UiIntent.ChangeSymbol) intent;
            final BalanceData balanceDataM101678a = C46135i.m101678a(changeSymbol.getSymbolInfoEntity(), false);
            final BalanceData balanceDataM101678a2 = C46135i.m101678a(changeSymbol.getSymbolInfoEntity(), true);
            updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.order.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderTabsSharedVM.m21400G(intent, balanceDataM101678a, balanceDataM101678a2, (UiState) obj);
                }
            });
            return;
        }
        if (intent instanceof BottomOrderTabsContract$UiIntent.StopSubOrderChange) {
            InterfaceC41775x1 interfaceC41775x1 = this.f20220a0;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                return;
            }
            return;
        }
        if (intent instanceof BottomOrderTabsContract$UiIntent.StopSubBalance) {
            InterfaceC41775x1 interfaceC41775x2 = this.f20219Z;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
                return;
            }
            return;
        }
        if (intent instanceof BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable) {
            BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable supportCancelAllBtnEnable = (BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable) intent;
            m21417J(supportCancelAllBtnEnable.getOrderLevelType(), supportCancelAllBtnEnable.getIsSupport());
            return;
        }
        if (intent instanceof BottomOrderTabsContract$UiIntent.JumpToTransfer) {
            getF20069V().getF97158h().mo873b(((BottomOrderTabsContract$UiIntent.JumpToTransfer) intent).getCurrencyCode());
            return;
        }
        if (intent instanceof BottomOrderTabsContract$UiIntent.RefreshData) {
            m21419z();
            m21418y();
            return;
        }
        if (!(intent instanceof BottomOrderTabsContract$UiIntent.BalanceChange)) {
            throw new NoWhenBranchMatchedException();
        }
        BottomOrderTabsContract$UiIntent.BalanceChange balanceChange = (BottomOrderTabsContract$UiIntent.BalanceChange) intent;
        TradeSymbolBalance tradeBalance = balanceChange.getTradeBalance();
        String currencyCode = (tradeBalance == null || (base = tradeBalance.getBase()) == null) ? null : base.getCurrencyCode();
        BalanceData baseBalance = ((UiState) getState()).getBaseBalance();
        if (Intrinsics.areEqual(currencyCode, baseBalance != null ? baseBalance.getCurrencyCode() : null)) {
            TradeSymbolBalance tradeBalance2 = balanceChange.getTradeBalance();
            String currencyCode2 = (tradeBalance2 == null || (quote = tradeBalance2.getQuote()) == null) ? null : quote.getCurrencyCode();
            BalanceData quoteBalance = ((UiState) getState()).getQuoteBalance();
            if (Intrinsics.areEqual(currencyCode2, quoteBalance != null ? quoteBalance.getCurrencyCode() : null)) {
                updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.order.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BottomOrderTabsSharedVM.m21401H(intent, (UiState) obj);
                    }
                });
                TradeSymbolBalance tradeBalance3 = balanceChange.getTradeBalance();
                m21416I(tradeBalance3 != null ? tradeBalance3.getQuote() : null);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m21417J(OrderLevelType orderLevelType, final boolean z11) {
        if (Intrinsics.areEqual(orderLevelType, OrderLevelType.Normal.INSTANCE)) {
            updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.order.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderTabsSharedVM.m21402K(z11, (UiState) obj);
                }
            });
        } else if (Intrinsics.areEqual(orderLevelType, OrderLevelType.Advanced.INSTANCE)) {
            updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.order.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderTabsSharedVM.m21403L(z11, (UiState) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final void m21416I(BalanceData balanceData) {
        boolean z11;
        String currencyCode;
        String strM85578b;
        String str;
        if (((UiState) getState()).getDelegationCount() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int iM23403a = C12463b.m23403a(SymbolsInfo.f21457a.m23635y(((UiState) getState()).getSymbol()));
        if (balanceData != null && (currencyCode = balanceData.getCurrencyCode()) != null) {
            InterfaceC41668m<InterfaceC11746a> interfaceC41668m = this.f20217X;
            BigDecimal availableBalance = balanceData.getAvailableBalance();
            if (availableBalance != null) {
                strM85578b = C37886j.m85578b(availableBalance, currencyCode, null, false, false, false, 0, null, iM23403a, 126, null);
            } else {
                strM85578b = null;
            }
            String strM66669i = C27041f.m66669i(strM85578b, "--");
            String currencyName = balanceData.getCurrencyName();
            if (currencyName == null) {
                str = currencyCode;
            } else {
                str = currencyName;
            }
            String strM93906g = C42828b.m93906g(strM66669i, str, true, false, 4, null);
            String currencyName2 = balanceData.getCurrencyName();
            if (currencyName2 != null) {
                currencyCode = currencyName2;
            }
            interfaceC41668m.mo90855d(new InterfaceC11746a.UpdateDepositEntrance(z11, strM93906g, currencyCode, C27039d.m66656p(balanceData.getAvailableBalance())));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f20220a0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x2 = this.f20219Z;
        if (interfaceC41775x2 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
        }
        this.f20221b0.clear();
    }

    /* JADX INFO: renamed from: z */
    public final void m21419z() {
        InterfaceC46460b<com.kubi.core.base.order.data.Request, Response> f101561e;
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().mo96893b();
        if (interfaceC4934aMo96893b != null && (f101561e = interfaceC4934aMo96893b.getF101561e()) != null) {
            f101561e.mo21152a(new com.kubi.core.base.order.data.Request(null, 1, null), this.f20221b0, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderTabsSharedVM.m21398A(this.f20278b, (Response) obj);
                }
            });
        }
    }
}
