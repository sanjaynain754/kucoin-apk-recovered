package com.kubi.core.biz.compliance;

import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import be.InterfaceC4578a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.view.SpotTradeComplianceInfoView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$layout;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45376d;
import w00.C45681e;

/* JADX INFO: compiled from: ComplianceInfoFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoFragmentBase;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiState;", "Lcom/kubi/core/biz/compliance/ComplianceInfoVM;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotComplianceInfoLayoutBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotComplianceInfoLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getLayout", "", "bindState", "", "onAgainShow", "onRefresh", "refreshData", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nComplianceInfoFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplianceInfoFragmentBase.kt\ncom/kubi/core/biz/compliance/ComplianceInfoFragmentBase\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,89:1\n143#2,20:90\n49#3:110\n51#3:114\n46#4:111\n51#4:113\n105#5:112\n*S KotlinDebug\n*F\n+ 1 ComplianceInfoFragmentBase.kt\ncom/kubi/core/biz/compliance/ComplianceInfoFragmentBase\n*L\n28#1:90,20\n44#1:110\n44#1:114\n44#1:111\n44#1:113\n44#1:112\n*E\n"})
public final class ComplianceInfoFragmentBase extends AbsTradeBaseBizFragment<ComplianceInfoContract$UiIntent, UiState, ComplianceInfoVM> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f20359Y = C45681e.m100799e(this, new Function1<ComplianceInfoFragmentBase, C45376d>() { // from class: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45376d invoke(@NotNull ComplianceInfoFragmentBase fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45376d.m100282a(fragment.requireView());
        }
    }, new Function1<C45376d, Unit>() { // from class: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45376d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45376d c45376d) {
            invoke(c45376d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC4578a f20360Z = InterfaceC4578a.c.f4048a;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f20358b0 = {Reflection.property1(new PropertyReference1Impl(ComplianceInfoFragmentBase.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotComplianceInfoLayoutBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f20357a0 = new Companion(null);

    /* JADX INFO: compiled from: ComplianceInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoFragmentBase$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/compliance/ComplianceInfoFragmentBase;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ComplianceInfoFragmentBase newInstance() {
            return new ComplianceInfoFragmentBase();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$3 */
    /* JADX INFO: compiled from: ComplianceInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$3", m90122f = "ComplianceInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118553 extends SuspendLambda implements Function2<Double, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Double d11, Continuation<? super Unit> continuation) {
            return ((C118553) create(d11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C118553(Continuation<? super C118553> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118553 c118553 = ComplianceInfoFragmentBase.this.new C118553(continuation);
            c118553.L$0 = obj;
            return c118553;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Double d11 = (Double) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ISpotCommonService iSpotCommonService = ISpotCommonService.f49644a.get();
            final ComplianceInfoFragmentBase complianceInfoFragmentBase = ComplianceInfoFragmentBase.this;
            iSpotCommonService.mo59980y(new Function0() { // from class: com.kubi.core.biz.compliance.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComplianceInfoFragmentBase.C118553.m21696f(complianceInfoFragmentBase, d11);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m21696f(ComplianceInfoFragmentBase complianceInfoFragmentBase, Double d11) {
            SpotTradeComplianceInfoView spotTradeComplianceInfoView;
            C45376d c45376dM21694O3 = complianceInfoFragmentBase.m21694O3();
            if (c45376dM21694O3 != null && (spotTradeComplianceInfoView = c45376dM21694O3.f102039b) != null) {
                complianceInfoFragmentBase.m21015H3(spotTradeComplianceInfoView.m23393b(true, d11));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$5 */
    /* JADX INFO: compiled from: ComplianceInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$5", m90122f = "ComplianceInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118565 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C118565) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C118565(Continuation<? super C118565> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118565 c118565 = ComplianceInfoFragmentBase.this.new C118565(continuation);
            c118565.L$0 = obj;
            return c118565;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ISpotCommonService iSpotCommonService = ISpotCommonService.f49644a.get();
            final ComplianceInfoFragmentBase complianceInfoFragmentBase = ComplianceInfoFragmentBase.this;
            iSpotCommonService.mo59980y(new Function0() { // from class: com.kubi.core.biz.compliance.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComplianceInfoFragmentBase.C118565.m21698f(complianceInfoFragmentBase, symbolBizUiState);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m21698f(ComplianceInfoFragmentBase complianceInfoFragmentBase, SymbolBizUiState symbolBizUiState) {
            ComplianceInfoVM complianceInfoVMM21011A3 = complianceInfoFragmentBase.m21011A3();
            if (complianceInfoVMM21011A3 != null) {
                complianceInfoVMM21011A3.m21710A(new ComplianceInfoContract$UiIntent.SymbolChange(symbolBizUiState.getSymbol()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$7 */
    /* JADX INFO: compiled from: ComplianceInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$7", m90122f = "ComplianceInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118587 extends SuspendLambda implements Function2<ComplianceInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ComplianceInfoEntity complianceInfoEntity, Continuation<? super Unit> continuation) {
            return ((C118587) create(complianceInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C118587(Continuation<? super C118587> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118587 c118587 = ComplianceInfoFragmentBase.this.new C118587(continuation);
            c118587.L$0 = obj;
            return c118587;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ComplianceInfoEntity complianceInfoEntity = (ComplianceInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ISpotCommonService iSpotCommonService = ISpotCommonService.f49644a.get();
            final ComplianceInfoFragmentBase complianceInfoFragmentBase = ComplianceInfoFragmentBase.this;
            iSpotCommonService.mo59980y(new Function0() { // from class: com.kubi.core.biz.compliance.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComplianceInfoFragmentBase.C118587.m21700f(complianceInfoFragmentBase, complianceInfoEntity);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m21700f(ComplianceInfoFragmentBase complianceInfoFragmentBase, ComplianceInfoEntity complianceInfoEntity) {
            SpotTradeComplianceInfoView spotTradeComplianceInfoView;
            SpotTradeComplianceInfoView spotTradeComplianceInfoView2;
            C45376d c45376dM21694O3 = complianceInfoFragmentBase.m21694O3();
            if (c45376dM21694O3 != null && (spotTradeComplianceInfoView2 = c45376dM21694O3.f102039b) != null) {
                complianceInfoFragmentBase.m21015H3(spotTradeComplianceInfoView2.m23394d(complianceInfoEntity));
            }
            C45376d c45376dM21694O4 = complianceInfoFragmentBase.m21694O3();
            if (c45376dM21694O4 != null && (spotTradeComplianceInfoView = c45376dM21694O4.f102039b) != null) {
                FragmentManager childFragmentManager = complianceInfoFragmentBase.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                spotTradeComplianceInfoView.setQuestionListener(childFragmentManager);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static final Double m21690L3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradeItemBean tradeItemBean = it.getTradeItemBean();
        if (tradeItemBean != null) {
            return tradeItemBean.getChangeRate();
        }
        return null;
    }

    /* JADX INFO: renamed from: M3 */
    public static final String m21691M3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public ComplianceInfoVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new ComplianceInfoVM(manager);
    }

    /* JADX INFO: renamed from: O3 */
    public final C45376d m21694O3() {
        return (C45376d) this.f20359Y.getValue(this, f20358b0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkcoin_core_spot_compliance_info_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<ComplianceInfoVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ComplianceInfoVM.class);
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20711Z() {
        return this.f20360Z;
    }

    /* JADX INFO: renamed from: P3 */
    private final void m21692P3() {
        ComplianceInfoVM complianceInfoVMM21011A3;
        String symbol = m21013D3().m22740t().getSymbol();
        if (symbol != null && (complianceInfoVMM21011A3 = m21011A3()) != null) {
            complianceInfoVMM21011A3.m21710A(new ComplianceInfoContract$UiIntent.GetComplianceInfo(symbol));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        final InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.compliance.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComplianceInfoFragmentBase.m21690L3((SymbolBizUiState) obj);
            }
        });
        m21016u3(new InterfaceC41634e<Double>() { // from class: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ComplianceInfoFragmentBase.kt\ncom/kubi/core/biz/compliance/ComplianceInfoFragmentBase\n*L\n1#1,49:1\n50#2:50\n44#3:51\n*E\n"})
            public static final class C118542<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20362b;

                /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoFragmentBase$bindState$$inlined$map$1$2", m90122f = "ComplianceInfoFragmentBase.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C118542.this.emit(null, this);
                    }
                }

                public C118542(InterfaceC41635f interfaceC41635f) {
                    this.f20362b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20362b;
                        TradeItemBean tradeItemBean = ((SymbolBizUiState) obj).getTradeItemBean();
                        Double changeRate = tradeItemBean != null ? tradeItemBean.getChangeRate() : null;
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(changeRate, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Double> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90941x.collect(new C118542(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new C118553(null));
        m21016u3(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.compliance.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComplianceInfoFragmentBase.m21691M3((SymbolBizUiState) obj);
            }
        }), new C118565(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.compliance.ComplianceInfoFragmentBase.bindState.6
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getComplianceInfo();
            }
        }, new C118587(null));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        m21692P3();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m21692P3();
    }
}
