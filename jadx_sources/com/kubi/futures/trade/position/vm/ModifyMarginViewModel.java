package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.MutableLiveData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.position.PositionRenderInfo;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import fm.C37567b;
import fm.C37569d;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ug.InterfaceC45233b;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.e2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ModifyMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/ModifyMarginViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "currentPositionRender", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "getCurrentPositionRender", "()Landroidx/lifecycle/MutableLiveData;", "currentRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "fetchUserLimitConfig", "", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getTaxRate", "Ljava/math/BigDecimal;", "trialFunds", "", "getUserMMr", "sendCurrentPositionInfo", "refreshPositionList", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ModifyMarginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public class ModifyMarginViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<PositionRenderInfo> f24348X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @Nullable
    public ContractRiskLimitEntity f24349Y;

    /* JADX INFO: renamed from: A */
    public static final ContractRiskLimitEntity m28005A(PositionEntity positionEntity) {
        InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
        boolean zM66566d = C27025c.m66566d(positionEntity != null ? Boolean.valueOf(positionEntity.isTrialFunds()) : null);
        String symbol = positionEntity != null ? positionEntity.getSymbol() : null;
        if (symbol == null) {
            symbol = "";
        }
        return interfaceC45233bM20259p.mo93811h0(zM66566d, symbol);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m28006B(ModifyMarginViewModel modifyMarginViewModel, PositionEntity positionEntity, ContractRiskLimitEntity contractRiskLimitEntity) {
        contractRiskLimitEntity.setTrial(positionEntity != null ? Boolean.valueOf(positionEntity.isTrialFunds()) : null);
        modifyMarginViewModel.f24349Y = contractRiskLimitEntity;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m28011K() {
        MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93939m0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m28012L(Unit unit) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m28014N(Throwable th2) {
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final MutableLiveData<PositionRenderInfo> m28025F() {
        return this.f24348X;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final BigDecimal m28026G(boolean z11) {
        return RepositoryServiceLocator.f19236a.m20290i().mo99995w(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final BigDecimal m28027H(@NotNull PositionEntity position) {
        BigDecimal maintainMargin;
        Intrinsics.checkNotNullParameter(position, "position");
        ContractRiskLimitEntity contractRiskLimitEntity = this.f24349Y;
        if (contractRiskLimitEntity != null && (maintainMargin = contractRiskLimitEntity.getMaintainMargin()) != null) {
            return maintainMargin;
        }
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        BigDecimal maintainMargin2 = contractEntityM84661b != null ? contractEntityM84661b.getMaintainMargin() : null;
        if (maintainMargin2 != null) {
            return maintainMargin2;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: renamed from: I */
    public final void m28028I() {
        Flowable flowableSubscribeOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.trade.position.vm.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginViewModel.m28011K();
            }
        }).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.a2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginViewModel.m28012L((Unit) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.b2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ModifyMarginViewModel.m28013M(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginViewModel.m28014N((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.d2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ModifyMarginViewModel.m28010J(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    /* JADX INFO: renamed from: O */
    public final void m28029O(@NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(position, "position");
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        MutableLiveData<PositionRenderInfo> mutableLiveData = this.f24348X;
        BigDecimal bigDecimalM66656p = C27039d.m66656p(position.getPosMargin());
        int iM84613c = C37567b.m84613c(contractEntityM84661b);
        RoundingMode roundingMode = RoundingMode.DOWN;
        mutableLiveData.postValue(new PositionRenderInfo(C42180b.m92640e(bigDecimalM66656p, roundingMode, iM84613c, true, true, true, 0, null, 96, null), C17054k0.m36530d(C27039d.m66656p(position.getRealLeverage()), false, 1, null), C17054k0.m36540n(C27039d.m66656p(position.getLiquidationPrice()), contractEntityM84661b, C37569d.m84683x(position), false, false, 12, null), C42180b.m92640e(C27039d.m66656p(position.getAvgEntryPrice()), roundingMode, C27039d.m66651k(contractEntityM84661b != null ? Integer.valueOf(C37567b.m84618h(contractEntityM84661b)) : null, 2), true, true, true, 0, null, 96, null)));
    }

    /* JADX INFO: renamed from: z */
    public final void m28030z(@Nullable final PositionEntity positionEntity) {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.trade.position.vm.u1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifyMarginViewModel.m28005A(positionEntity);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.v1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModifyMarginViewModel.m28006B(this.f24416b, positionEntity, (ContractRiskLimitEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.w1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ModifyMarginViewModel.m28007C(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.x1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModifyMarginViewModel.m28008D((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.y1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ModifyMarginViewModel.m28009E(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getF46845W());
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m28007C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m28008D(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final void m28009E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public static final void m28010J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static final void m28013M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
