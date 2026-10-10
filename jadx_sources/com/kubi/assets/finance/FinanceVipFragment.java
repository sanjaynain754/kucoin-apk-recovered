package com.kubi.assets.finance;

import android.annotation.SuppressLint;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.entity.PwmFixedProd;
import com.kubi.assets.entity.PwmProductEntity;
import com.kubi.assets.entity.QuantFundProd;
import com.kubi.assets.finance.product.FinanceVipDefaultAdapter;
import com.kubi.assets.finance.product.FinanceVipProductAdapter;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.host.HostManager;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44793j0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
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
import w00.C45681e;

/* JADX INFO: compiled from: FinanceVipFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0015J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020$H\u0016J\u0018\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020$R\"\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceVipFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/finance/FinanceVipContract$UIState;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "<init>", "()V", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/assets/databinding/AssetFinanceVipFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFinanceVipFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/finance/product/FinanceVipProductAdapter;", "defaultPlaceAdapter", "Lcom/kubi/assets/finance/product/FinanceVipDefaultAdapter;", "lastBaseCurrency", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onRefresh", "onHideZeroListener", TIMPushProvider.f75063o, "", "onEyesChangedListener", ViewProps.VISIBLE, "autoClickItemAtPosition", FirebaseAnalytics.Param.CURRENCY, "isFirstItem", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceVipFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceVipFragment.kt\ncom/kubi/assets/finance/FinanceVipFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,159:1\n147#2,16:160\n*S KotlinDebug\n*F\n+ 1 FinanceVipFragment.kt\ncom/kubi/assets/finance/FinanceVipFragment\n*L\n52#1:160,16\n*E\n"})
public final class FinanceVipFragment extends SimpleStateFragment<UIState> implements SwipeRefreshLayout.OnRefreshListener, AssetV2OverviewAdapter.InterfaceC10586a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17402U = C45681e.m100799e(this, new Function1<FinanceVipFragment, C44793j0>() { // from class: com.kubi.assets.finance.FinanceVipFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44793j0 invoke(@NotNull FinanceVipFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44793j0.m99104a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44793j0, Unit>() { // from class: com.kubi.assets.finance.FinanceVipFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44793j0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44793j0 c44793j0) {
            invoke(c44793j0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final FinanceVipProductAdapter f17403V = new FinanceVipProductAdapter();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final FinanceVipDefaultAdapter f17404W = new FinanceVipDefaultAdapter(new ArrayList());

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f17405X = "";

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f17401Z = {Reflection.property1(new PropertyReference1Impl(FinanceVipFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFinanceVipFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f17400Y = new Companion(null);

    /* JADX INFO: compiled from: FinanceVipFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceVipFragment$Companion;", "", "<init>", "()V", "PWM_FUND", "", "PWM_FIXED", "newInstance", "Lcom/kubi/assets/finance/FinanceVipFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FinanceVipFragment newInstance() {
            return new FinanceVipFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceVipFragment$bindState$2 */
    /* JADX INFO: compiled from: FinanceVipFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "datalist", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipFragment$bindState$2", m90122f = "FinanceVipFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99632 extends SuspendLambda implements Function2<ArrayList<FinanceProductEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C99632(Continuation<? super C99632> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99632 c99632 = FinanceVipFragment.this.new C99632(continuation);
            c99632.L$0 = obj;
            return c99632;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<FinanceProductEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C99632) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NestedScrollView nestedScrollView;
            RecyclerView recyclerView;
            NestedScrollView nestedScrollView2;
            RecyclerView recyclerView2;
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                FinanceVipFragment financeVipFragment = FinanceVipFragment.this;
                if (arrayList.isEmpty()) {
                    C44793j0 c44793j0M16725r3 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r3 != null && (recyclerView = c44793j0M16725r3.f100205e) != null) {
                        ViewExtKt.m66577h(recyclerView);
                    }
                    C44793j0 c44793j0M16725r4 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r4 != null && (nestedScrollView = c44793j0M16725r4.f100203c) != null) {
                        ViewExtKt.m66594y(nestedScrollView);
                    }
                } else {
                    C44793j0 c44793j0M16725r5 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r5 != null && (recyclerView2 = c44793j0M16725r5.f100205e) != null) {
                        ViewExtKt.m66594y(recyclerView2);
                    }
                    C44793j0 c44793j0M16725r6 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r6 != null && (nestedScrollView2 = c44793j0M16725r6.f100203c) != null) {
                        ViewExtKt.m66577h(nestedScrollView2);
                    }
                    financeVipFragment.f17403V.replaceData(arrayList);
                    financeVipFragment.f17403V.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceVipFragment$bindState$4 */
    /* JADX INFO: compiled from: FinanceVipFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "defaultData", "Lcom/kubi/assets/entity/PwmProductEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipFragment$bindState$4", m90122f = "FinanceVipFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99654 extends SuspendLambda implements Function2<PwmProductEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(PwmProductEntity pwmProductEntity, Continuation<? super Unit> continuation) {
            return ((C99654) create(pwmProductEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C99654(Continuation<? super C99654> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99654 c99654 = FinanceVipFragment.this.new C99654(continuation);
            c99654.L$0 = obj;
            return c99654;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NestedScrollView nestedScrollView;
            NestedScrollView nestedScrollView2;
            PwmProductEntity pwmProductEntity = (PwmProductEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (pwmProductEntity != null) {
                FinanceVipFragment financeVipFragment = FinanceVipFragment.this;
                ArrayList arrayList = new ArrayList();
                List<PwmFixedProd> pwmFixedProdList = pwmProductEntity.getPwmFixedProdList();
                if (pwmFixedProdList == null) {
                    pwmFixedProdList = CollectionsKt.emptyList();
                }
                arrayList.addAll(pwmFixedProdList);
                List<QuantFundProd> quantFundProdList = pwmProductEntity.getQuantFundProdList();
                if (quantFundProdList == null) {
                    quantFundProdList = CollectionsKt.emptyList();
                }
                arrayList.addAll(quantFundProdList);
                if (arrayList.isEmpty()) {
                    C44793j0 c44793j0M16725r3 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r3 != null && (nestedScrollView2 = c44793j0M16725r3.f100203c) != null) {
                        ViewExtKt.m66577h(nestedScrollView2);
                    }
                    financeVipFragment.showEmpty();
                } else {
                    C44793j0 c44793j0M16725r4 = financeVipFragment.m16725r3();
                    if (c44793j0M16725r4 != null && (nestedScrollView = c44793j0M16725r4.f100203c) != null) {
                        ViewExtKt.m66594y(nestedScrollView);
                    }
                    financeVipFragment.f17404W.replaceData(arrayList);
                    financeVipFragment.f17404W.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        this.f17403V.m16849l(z11);
        this.f17403V.notifyDataSetChanged();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_finance_vip_fragment;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FinanceVipViewModel.class);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        sendIntent(FinanceVipContract$UiIntent.LoadData.INSTANCE);
    }

    /* JADX INFO: renamed from: r3 */
    public final C44793j0 m16725r3() {
        return (C44793j0) this.f17402U.getValue(this, f17401Z[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s3 */
    public static final Unit m16723s3(FinanceVipFragment financeVipFragment) {
        String viewMoreJumpUrl;
        PwmProductEntity defaultData = ((UIState) financeVipFragment.getState()).getDefaultData();
        if (defaultData != null) {
            viewMoreJumpUrl = defaultData.getViewMoreJumpUrl();
        } else {
            viewMoreJumpUrl = null;
        }
        String strM66669i = C27041f.m66669i(viewMoreJumpUrl, "/earn/premium-wealth-management?appNeedLang=true&loading=2");
        Router.f46192a.m56184f(HostManager.a.m() + strM66669i).m4048k();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceVipFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new C99632(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceVipFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDefaultData();
            }
        }, new C99654(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        showLoading();
        C44793j0 c44793j0M16725r3 = m16725r3();
        if (c44793j0M16725r3 != null) {
            c44793j0M16725r3.f100205e.setAdapter(this.f17403V);
            c44793j0M16725r3.f100204d.setAdapter(this.f17404W);
            KcPrimaryButton btnMore = c44793j0M16725r3.f100202b;
            Intrinsics.checkNotNullExpressionValue(btnMore, "btnMore");
            C27046k.m66711z(btnMore, 0L, new Function0() { // from class: com.kubi.assets.finance.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceVipFragment.m16723s3(this.f17449b);
                }
            }, 1, null);
        }
        sendIntent(FinanceVipContract$UiIntent.LoadData.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (((UIState) getState()).getDefaultData() == null || ((UIState) getState()).getDataList() == null || (this.f17405X.length() > 0 && !Intrinsics.areEqual(this.f17405X, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency()))) {
            sendIntent(FinanceVipContract$UiIntent.LoadData.INSTANCE);
        }
        this.f17405X = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m16724q3(@Nullable String str, boolean z11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new FinanceVipFragment$autoClickItemAtPosition$1(z11, this, str, null));
    }
}
