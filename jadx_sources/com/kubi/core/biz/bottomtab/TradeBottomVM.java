package com.kubi.core.biz.bottomtab;

import ad.InterfaceC0240b;
import cd.InterfaceC4934a;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.router.model.IRedirect;
import com.kubi.user.api.IUserService;
import f00.C37304a;
import g00.InterfaceC37756h;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.TradeSettingsBean;
import p793yc.InterfaceC46460b;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeBottomVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/TradeBottomVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiState;", "repoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "settingsChangeFollowJob", "Lkotlinx/coroutines/Job;", "orderCountRequestJobs", "orderChangeSubJob", "initState", "getInitState", "()Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiState;", "onCleared", "", "sendBizIntent", "intent", "subOrderChangeSocket", "executeOrderCountJob", "executeSettingsJob", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeBottomVM extends AbsTradeBaseBizVM<BottomBizGroupContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f20188X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC41775x1 f20189Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f20190Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC41775x1 f20191a0;

    /* JADX INFO: renamed from: G */
    public final void m21354G() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20191a0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().mo96893b();
        if (interfaceC4934aMo96893b == null) {
            return;
        }
        this.f20191a0 = m21022b(C41636g.m90894R(interfaceC4934aMo96893b.mo5160h(), interfaceC4934aMo96893b.mo5155c()), new TradeBottomVM$subOrderChangeSocket$1(this, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBottomVM(@NotNull AbstractC46753c repoProvider) {
        super(repoProvider);
        Intrinsics.checkNotNullParameter(repoProvider, "repoProvider");
        this.f20188X = new CompositeDisposable();
        m21351A();
        m21355x();
        m21354G();
    }

    /* JADX INFO: renamed from: B */
    public static final List m21339B(TradeSettingsBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.m86132d();
    }

    /* JADX INFO: renamed from: E */
    public static final UiState m21340E(BottomBizGroupContract$UiIntent bottomBizGroupContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, ((BottomBizGroupContract$UiIntent.SelectedTabBiz) bottomBizGroupContract$UiIntent).getOrderLevelType(), 0, null, null, 0, 0, 62, null);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m21349y(TradeBottomVM tradeBottomVM, Response it) {
        final String str;
        Intrinsics.checkNotNullParameter(it, "it");
        Integer activeOrderCount = it.getActiveOrderCount();
        final int iIntValue = activeOrderCount != null ? activeOrderCount.intValue() : 0;
        Integer activeAdvancedOrderCount = it.getActiveAdvancedOrderCount();
        final int iIntValue2 = activeAdvancedOrderCount != null ? activeAdvancedOrderCount.intValue() : 0;
        int i11 = iIntValue + iIntValue2;
        if (i11 == 0) {
            str = " (0) ";
        } else if (i11 > 99) {
            str = " (99+) ";
        } else {
            str = " (" + i11 + ") ";
        }
        tradeBottomVM.updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeBottomVM.m21350z(str, iIntValue, iIntValue2, (UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final UiState m21350z(String str, int i11, int i12, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UiState.copy$default(updateState, null, 0, null, str, i11, i12, 7, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m21351A() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20189Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f20189Y = m21022b(C41636g.m90941x(C41636g.m90881E(getF20069V().getF97156f().mo85483a()), new Function1() { // from class: com.kubi.core.biz.bottomtab.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeBottomVM.m21339B((TradeSettingsBean) obj);
            }
        }), new TradeBottomVM$executeSettingsJob$2(this, null));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, 0, null, null, 0, 0, 63, null);
    }

    /* JADX INFO: renamed from: D */
    public void m21353D(@NotNull final BottomBizGroupContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        if (intent instanceof BottomBizGroupContract$UiIntent.PageHide) {
            InterfaceC41775x1 interfaceC41775x1 = this.f20189Y;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            InterfaceC41775x1 interfaceC41775x2 = this.f20190Z;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            InterfaceC41775x1 interfaceC41775x3 = this.f20191a0;
            if (interfaceC41775x3 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x3, null, 1, null);
                return;
            }
            return;
        }
        if (intent instanceof BottomBizGroupContract$UiIntent.RefreshData) {
            m21351A();
            m21355x();
            m21354G();
        } else if (intent instanceof BottomBizGroupContract$UiIntent.SelectedTabBiz) {
            updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBottomVM.m21340E(intent, (UiState) obj);
                }
            });
        } else {
            if (!(intent instanceof BottomBizGroupContract$UiIntent.JumpOrderRecordPage)) {
                throw new NoWhenBranchMatchedException();
            }
            IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.core.biz.bottomtab.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBottomVM.m21341F(this.f20199b, intent);
                }
            }), 1, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final Unit m21341F(TradeBottomVM tradeBottomVM, BottomBizGroupContract$UiIntent bottomBizGroupContract$UiIntent) {
        InterfaceC0240b interfaceC0240b;
        long j11;
        OrderLevelType orderLevelType = ((UiState) tradeBottomVM.getState()).getOrderLevelType();
        if (Intrinsics.areEqual(orderLevelType, OrderLevelType.Normal.INSTANCE)) {
            interfaceC0240b = InterfaceC0240b.b.f704a;
        } else if (Intrinsics.areEqual(orderLevelType, OrderLevelType.Advanced.INSTANCE)) {
            interfaceC0240b = InterfaceC0240b.a.f703a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(tradeBottomVM.getF20070W(), TradeAccountType.Margin.INSTANCE)) {
            if (interfaceC0240b instanceof InterfaceC0240b.b) {
                j11 = 0L;
            } else if (interfaceC0240b instanceof InterfaceC0240b.a) {
                j11 = 1L;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC37756h.a.m85146d(C37304a.f82764a, "cross", j11, ((BottomBizGroupContract$UiIntent.JumpOrderRecordPage) bottomBizGroupContract$UiIntent).getSymbol(), null, null, null, null, null, 248, null);
        } else {
            BottomBizGroupContract$UiIntent.JumpOrderRecordPage jumpOrderRecordPage = (BottomBizGroupContract$UiIntent.JumpOrderRecordPage) bottomBizGroupContract$UiIntent;
            tradeBottomVM.getF20069V().getF97158h().mo872a(jumpOrderRecordPage.getContext(), jumpOrderRecordPage.getSymbol(), interfaceC0240b, "SPOT");
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f20189Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x2 = this.f20190Z;
        if (interfaceC41775x2 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x3 = this.f20191a0;
        if (interfaceC41775x3 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x3, null, 1, null);
        }
        this.f20188X.clear();
    }

    /* JADX INFO: renamed from: x */
    public final void m21355x() {
        InterfaceC46460b<Request, Response> f101561e;
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().mo96893b();
        if (interfaceC4934aMo96893b != null && (f101561e = interfaceC4934aMo96893b.getF101561e()) != null) {
            f101561e.mo21152a(new Request("SPOT"), this.f20188X, new Function1() { // from class: com.kubi.core.biz.bottomtab.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBottomVM.m21349y(this.f20201b, (Response) obj);
                }
            });
        }
    }
}
