package com.kubi.assets.finance.product;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.finance.FinanceCommonFragment;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44859s1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FinanceProductFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0010H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010,\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010.R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020%0$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/finance/product/FinanceProductContract$UIState;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/finance/product/FinanceProductAdapter;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLayout", "", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "initView", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onRefresh", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "autoClickItemAtPosition", "type", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nFinanceProductFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceProductFragment.kt\ncom/kubi/assets/finance/product/FinanceProductFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,130:1\n147#2,16:131\n135#3,2:147\n93#4,4:149\n*S KotlinDebug\n*F\n+ 1 FinanceProductFragment.kt\ncom/kubi/assets/finance/product/FinanceProductFragment\n*L\n34#1:131,16\n56#1:147,2\n88#1:149,4\n*E\n"})
public final class FinanceProductFragment extends SimpleStateFragment<UIState> implements SwipeRefreshLayout.OnRefreshListener, AssetV2OverviewAdapter.InterfaceC10586a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17465U = C45681e.m100799e(this, new Function1<FinanceProductFragment, C44859s1>() { // from class: com.kubi.assets.finance.product.FinanceProductFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44859s1 invoke(@NotNull FinanceProductFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44859s1.m99242a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44859s1, Unit>() { // from class: com.kubi.assets.finance.product.FinanceProductFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44859s1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44859s1 c44859s1) {
            invoke(c44859s1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final FinanceProductAdapter f17466V = new FinanceProductAdapter();

    /* JADX INFO: renamed from: W */
    public boolean f17467W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f17468X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f17464Z = {Reflection.property1(new PropertyReference1Impl(FinanceProductFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetListBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f17463Y = new Companion(null);

    /* JADX INFO: compiled from: FinanceProductFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/finance/product/FinanceProductFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FinanceProductFragment newInstance() {
            return new FinanceProductFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductFragment$bindState$2 */
    /* JADX INFO: compiled from: FinanceProductFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductFragment$bindState$2", m90122f = "FinanceProductFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100102 extends SuspendLambda implements Function2<ArrayList<FinanceProductEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C100102(Continuation<? super C100102> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100102 c100102 = FinanceProductFragment.this.new C100102(continuation);
            c100102.L$0 = obj;
            return c100102;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<FinanceProductEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C100102) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                FinanceProductFragment financeProductFragment = FinanceProductFragment.this;
                WrapperLoadingView wrapperLoadingView = financeProductFragment.f17468X;
                if (wrapperLoadingView != null) {
                    wrapperLoadingView.showContent();
                }
                C44859s1 c44859s1M16818q3 = financeProductFragment.m16818q3();
                if (c44859s1M16818q3 != null && (recyclerView = c44859s1M16818q3.f100772f) != null) {
                    ViewExtKt.m66594y(recyclerView);
                }
                financeProductFragment.f17466V.replaceData(arrayList);
                Fragment parentFragment = financeProductFragment.getParentFragment();
                FinanceCommonFragment financeCommonFragment = parentFragment instanceof FinanceCommonFragment ? (FinanceCommonFragment) parentFragment : null;
                if (financeCommonFragment != null) {
                    financeCommonFragment.m16637x3(!arrayList.isEmpty());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductFragment$bindState$4 */
    /* JADX INFO: compiled from: FinanceProductFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductFragment$bindState$4", m90122f = "FinanceProductFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100124 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C100124(Continuation<? super C100124> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100124 c100124 = FinanceProductFragment.this.new C100124(continuation);
            c100124.Z$0 = ((Boolean) obj).booleanValue();
            return c100124;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C100124) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinanceProductFragment.this.f17466V.m16798k(z11);
            FinanceProductFragment.this.f17466V.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public final C44859s1 m16818q3() {
        return (C44859s1) this.f17465U.getValue(this, f17464Z[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            WrapperLoadingView wrapperLoadingView = this.f17468X;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            C44859s1 c44859s1M16818q3 = m16818q3();
            if (c44859s1M16818q3 == null || (recyclerView = c44859s1M16818q3.f100772f) == null) {
                return;
            }
            ViewExtKt.m66594y(recyclerView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19803U() {
        return this.f17467W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FinanceProductViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17467W = z11;
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (!isShowing()) {
            return;
        }
        this.f17466V.m16798k(z11);
        this.f17466V.notifyDataSetChanged();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.finance.product.FinanceProductFragment.bindState.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setData((ArrayList) obj2);
            }
        }, new C100102(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.product.FinanceProductFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C100124(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        View view;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.initView();
        C44859s1 c44859s1M16818q3 = m16818q3();
        RecyclerView recyclerView3 = null;
        if (c44859s1M16818q3 != null) {
            view = c44859s1M16818q3.f100771e;
        } else {
            view = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(view);
        this.f17468X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        FinanceProductAdapter financeProductAdapter = this.f17466V;
        int i11 = R$layout.view_empty;
        C44859s1 c44859s1M16818q4 = m16818q3();
        if (c44859s1M16818q4 != null) {
            recyclerView3 = c44859s1M16818q4.f100772f;
        }
        financeProductAdapter.setEmptyView(i11, recyclerView3);
        C44859s1 c44859s1M16818q5 = m16818q3();
        if (c44859s1M16818q5 != null && (recyclerView2 = c44859s1M16818q5.f100772f) != null) {
            recyclerView2.setItemViewCacheSize(20);
        }
        C44859s1 c44859s1M16818q6 = m16818q3();
        if (c44859s1M16818q6 != null && (recyclerView = c44859s1M16818q6.f100772f) != null) {
            recyclerView.setAdapter(this.f17466V);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        if (isShowing()) {
            onShow();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(FinanceProductContract$UiIntent.GetProductList.INSTANCE);
        sendIntent(new FinanceProductContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m16819p3(@Nullable String str) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new FinanceProductFragment$autoClickItemAtPosition$1(this, str, null));
    }
}
