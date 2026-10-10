package com.kubi.core.biz.margininfo;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import be.InterfaceC4578a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.core.biz.leverbar.LeverageSettingData;
import com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog;
import com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.api.IMarginService;
import com.kubi.p110rn.Constants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p827zc.AbstractC46753c;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45410w;
import w00.C45681e;

/* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\u0018\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020%H\u0002J\b\u00101\u001a\u00020%H\u0002J\u001a\u00102\u001a\u0004\u0018\u00010.2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020%H\u0014J\b\u00106\u001a\u00020%H\u0014J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u00103\u001a\u000204H\u0002J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006>"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/MarginInfoFragmentBase;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiIntent;", "Lcom/kubi/core/biz/margininfo/MarginInfoContract$UiState;", "Lcom/kubi/core/biz/margininfo/MarginInfoVM;", "<init>", "()V", "utaMarginTradeCoreViewModel", "Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "getUtaMarginTradeCoreViewModel", "()Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "utaMarginTradeCoreViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentMarginInfoBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentMarginInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentLeverage", "Ljava/math/BigDecimal;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getLayout", "", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initLeverageSettingBar", "showHourlyInterestRate", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "onMarginTypeClick", "onMarginLeverClick", "getBorrowableCurrency", "isBuy", "", "bindFlowEvent", "bindState", "onTradePanelModelChanged", "panelModel", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "onSideChanged", "onMarginLeverageChanged", "onRefresh", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginInfoFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginInfoFragmentBase.kt\ncom/kubi/core/biz/margininfo/MarginInfoFragmentBase\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,305:1\n106#2,15:306\n147#3,16:321\n49#4:337\n51#4:341\n46#5:338\n51#5:340\n105#6:339\n81#7,2:342\n*S KotlinDebug\n*F\n+ 1 MarginInfoFragmentBase.kt\ncom/kubi/core/biz/margininfo/MarginInfoFragmentBase\n*L\n57#1:306,15\n60#1:321,16\n89#1:337\n89#1:341\n89#1:338\n89#1:340\n89#1:339\n216#1:342,2\n*E\n"})
public final class MarginInfoFragmentBase extends AbsTradeBaseBizFragment<Object, UiState, MarginInfoVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20438Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f20439Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public BigDecimal f20440a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public SymbolInfoEntity f20441b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC4578a f20442c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f20437e0 = {Reflection.property1(new PropertyReference1Impl(MarginInfoFragmentBase.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentMarginInfoBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f20436d0 = new Companion(null);

    /* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/MarginInfoFragmentBase$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/margininfo/MarginInfoFragmentBase;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginInfoFragmentBase newInstance() {
            return new MarginInfoFragmentBase();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$a */
    /* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11921a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f20443b;

        public C11921a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f20443b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f20443b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f20443b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$bindState$2 */
    /* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$bindState$2", m90122f = "MarginInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119222 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C119222) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C119222(Continuation<? super C119222> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119222 c119222 = MarginInfoFragmentBase.this.new C119222(continuation);
            c119222.L$0 = obj;
            return c119222;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginInfoFragmentBase.this.f20441b0 = symbolBizUiState.getSymbolInfo();
            if (symbolBizUiState.getSymbol() != null) {
                MarginInfoFragmentBase marginInfoFragmentBase = MarginInfoFragmentBase.this;
                SymbolInfoEntity symbolInfo = symbolBizUiState.getSymbolInfo();
                String strM66668h = C27041f.m66668h(symbolInfo != null ? symbolInfo.getQuoteCurrency() : null);
                SymbolInfoEntity symbolInfo2 = symbolBizUiState.getSymbolInfo();
                marginInfoFragmentBase.m21867l4(strM66668h, C27041f.m66668h(symbolInfo2 != null ? symbolInfo2.getQuoteCurrencyName() : null));
                marginInfoFragmentBase.m21863h4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$bindState$3 */
    /* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$bindState$3", m90122f = "MarginInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119233 extends SuspendLambda implements Function2<Map<String, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
        int label;

        public C119233(Continuation<? super C119233> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginInfoFragmentBase.this.new C119233(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Map<String, ? extends BigDecimal> map, Continuation<? super Unit> continuation) {
            return ((C119233) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarginInfoFragmentBase.this.m21863h4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static final String m21851W3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public MarginInfoVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new MarginInfoVM(manager);
    }

    /* JADX INFO: renamed from: Y3 */
    public final C45410w m21858Y3() {
        return (C45410w) this.f20439Z.getValue(this, f20437e0[0]);
    }

    /* JADX INFO: renamed from: a4 */
    public final UtaMarginTradeCoreViewModel m21860a4() {
        return (UtaMarginTradeCoreViewModel) this.f20438Y.getValue();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m21861b4() {
        LeverageSettingBar leverageSettingBar;
        LeverageSettingData leverageSettingData = new LeverageSettingData(1, null, 0, true, 6, null);
        C45410w c45410wM21858Y3 = m21858Y3();
        if (c45410wM21858Y3 == null || (leverageSettingBar = c45410wM21858Y3.f102377e) == null) {
            return;
        }
        leverageSettingBar.m21825e(leverageSettingData);
        LeverageSettingBar.m21820g(leverageSettingBar, new Function0() { // from class: com.kubi.core.biz.margininfo.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginInfoFragmentBase.m21852c4(this.f20448b);
            }
        }, new Function0() { // from class: com.kubi.core.biz.margininfo.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginInfoFragmentBase.m21853d4(this.f20493b);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m21862g4() {
        String strM21859Z3;
        SymbolInfoEntity symbolInfoEntity = this.f20441b0;
        if (symbolInfoEntity == null || (strM21859Z3 = m21859Z3(symbolInfoEntity, C27025c.m66566d(m21860a4().m22511w().getValue()))) == null) {
            return;
        }
        UtaLeverageSettingDialog utaLeverageSettingDialogNewInstance = UtaLeverageSettingDialog.f20464C0.newInstance(this.f20440a0, strM21859Z3, symbolInfoEntity.getBaseCurrency(), symbolInfoEntity.getQuoteCurrency());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        utaLeverageSettingDialogNewInstance.show(childFragmentManager, "UtaLeverageSettingDialog");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_margin_info;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<MarginInfoVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MarginInfoVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21861b4();
        m21854e4();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20442c0() {
        return this.f20442c0;
    }

    public MarginInfoFragmentBase() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.margininfo.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginInfoFragmentBase.m21856m4(this.f20446b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f20438Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UtaMarginTradeCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f20439Z = C45681e.m100799e(this, new Function1<MarginInfoFragmentBase, C45410w>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45410w invoke(@NotNull MarginInfoFragmentBase fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45410w.m100357a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C45410w, Unit>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C45410w it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45410w c45410w) {
                invoke(c45410w);
                return Unit.INSTANCE;
            }
        });
        this.f20440a0 = new BigDecimal(10);
        this.f20442c0 = InterfaceC4578a.f.f4051a;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m21852c4(MarginInfoFragmentBase marginInfoFragmentBase) {
        marginInfoFragmentBase.m21864i4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m21853d4(MarginInfoFragmentBase marginInfoFragmentBase) {
        marginInfoFragmentBase.m21862g4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    private final void m21854e4() {
        m21860a4().m22511w().observe(getViewLifecycleOwner(), new C11921a(new Function1() { // from class: com.kubi.core.biz.margininfo.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInfoFragmentBase.m21855f4(this.f20447b, (Boolean) obj);
            }
        }));
        final InterfaceC41678w<TradeSettingsBean> interfaceC41678wMo85483a = m21011A3().getF20069V().getF97156f().mo85483a();
        m21016u3(new InterfaceC41634e<InterfaceC38170b>() { // from class: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$initObserver$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$initObserver$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MarginInfoFragmentBase.kt\ncom/kubi/core/biz/margininfo/MarginInfoFragmentBase\n*L\n1#1,49:1\n50#2:50\n89#3:51\n*E\n"})
            public static final class C119242<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20445b;

                /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.MarginInfoFragmentBase$initObserver$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$initObserver$$inlined$map$1$2", m90122f = "MarginInfoFragmentBase.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C119242.this.emit(null, this);
                    }
                }

                public C119242(InterfaceC41635f interfaceC41635f) {
                    this.f20445b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f20445b;
                        InterfaceC38170b tradePanelModel = ((TradeSettingsBean) obj).getTradePanelModel();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(tradePanelModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super InterfaceC38170b> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wMo85483a.collect(new C119242(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new MarginInfoFragmentBase$initObserver$3(this, null));
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m21855f4(MarginInfoFragmentBase marginInfoFragmentBase, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        marginInfoFragmentBase.m21865j4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final ViewModelStoreOwner m21856m4(MarginInfoFragmentBase marginInfoFragmentBase) {
        Fragment fragmentRequireParentFragment = marginInfoFragmentBase.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: Z3 */
    public final String m21859Z3(SymbolInfoEntity symbolInfoEntity, boolean z11) {
        Pair pairM90091to;
        List<BigDecimal> listEmptyList;
        List<BigDecimal> listEmptyList2;
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        if (z11) {
            pairM90091to = TuplesKt.m90091to(quoteCurrency, baseCurrency);
        } else {
            pairM90091to = TuplesKt.m90091to(baseCurrency, quoteCurrency);
        }
        String str = (String) pairM90091to.component1();
        String str2 = (String) pairM90091to.component2();
        if (str == null || (listEmptyList = IUnifyAccountService.f53155a.get().mo64988b(str)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.isEmpty()) {
            return str;
        }
        if (str2 == null || (listEmptyList2 = IUnifyAccountService.f53155a.get().mo64988b(str2)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        if (!listEmptyList2.isEmpty()) {
            return str2;
        }
        return null;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "unify_account_leverage_setting_success".length();
        }
        C12572a.m23692a(this, true, new MarginInfoFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1("unify_account_leverage_setting_success", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90881E(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.margininfo.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInfoFragmentBase.m21851W3((SymbolBizUiState) obj);
            }
        })), new C119222(null));
        m21016u3(IUnifyAccountService.f53155a.get().mo65005u(), new C119233(null));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m21863h4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarginInfoFragmentBase$onMarginLeverageChanged$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m21864i4() {
        Fragment parentFragment;
        boolean zIsMarginEnabled;
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null && (parentFragment = parentFragment2.getParentFragment()) != null) {
            IMarginService iMarginService = IMarginService.f32724a.get();
            SymbolInfoEntity symbolInfoEntity = this.f20441b0;
            boolean zIsIsolatedMarginEnabled = false;
            if (symbolInfoEntity != null) {
                zIsMarginEnabled = symbolInfoEntity.isMarginEnabled();
            } else {
                zIsMarginEnabled = false;
            }
            SymbolInfoEntity symbolInfoEntity2 = this.f20441b0;
            if (symbolInfoEntity2 != null) {
                zIsIsolatedMarginEnabled = symbolInfoEntity2.isIsolatedMarginEnabled();
            }
            iMarginService.mo37973z0(parentFragment, zIsMarginEnabled, zIsIsolatedMarginEnabled);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m21865j4(boolean z11) {
        m21863h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21866k4(InterfaceC38170b interfaceC38170b) {
        m21863h4();
    }

    /* JADX INFO: renamed from: l4 */
    public final void m21867l4(String str, String str2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45410w c45410wM21858Y3 = m21858Y3();
        if (c45410wM21858Y3 != null && (baseTextView2 = c45410wM21858Y3.f102374b) != null) {
            baseTextView2.setText(getString(R$string.unify_hourly_rate_reference_unit, str2));
        }
        C45410w c45410wM21858Y4 = m21858Y3();
        if (c45410wM21858Y4 != null && (baseTextView = c45410wM21858Y4.f102375c) != null) {
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
        }
        IUnifyAccountService.f53155a.get().mo64982F(str);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarginInfoFragmentBase$showHourlyInterestRate$1(str, this, null), 3, null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
    }
}
