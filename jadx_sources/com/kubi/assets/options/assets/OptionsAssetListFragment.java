package com.kubi.assets.options.assets;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetResponse;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.options.AssetOptionsViewModel;
import com.kubi.assets.options.OptionsAssetInfoAdapter;
import com.kubi.assets.options.UIState;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44863s5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: OptionsAssetListFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0014J\b\u0010)\u001a\u00020'H\u0014J\u0018\u0010*\u001a\u00020'2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u001aH\u0003R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020!0 8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/options/assets/OptionsAssetListFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/options/assets/OptionsAssetListContract$UIState;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "optionsAssetsVm", "Lcom/kubi/assets/options/AssetOptionsViewModel;", "getOptionsAssetsVm", "()Lcom/kubi/assets/options/AssetOptionsViewModel;", "optionsAssetsVm$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/assets/databinding/OptionsAssetListFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/OptionsAssetListFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "adapter", "Lcom/kubi/assets/options/OptionsAssetInfoAdapter;", "getAdapter", "()Lcom/kubi/assets/options/OptionsAssetInfoAdapter;", "adapter$delegate", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onRefresh", "", "initView", "bindState", "showAssetListUI", "assets", "", "Lcom/kubi/assets/entity/AssetResponse;", "hideNumbers", "uiHideNumberFlag", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOptionsAssetListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsAssetListFragment.kt\ncom/kubi/assets/options/assets/OptionsAssetListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,105:1\n106#2,15:106\n147#3,16:121\n*S KotlinDebug\n*F\n+ 1 OptionsAssetListFragment.kt\ncom/kubi/assets/options/assets/OptionsAssetListFragment\n*L\n34#1:106,15\n38#1:121,16\n*E\n"})
public final class OptionsAssetListFragment extends SimpleStateFragment<OptionsAssetListContract$UIState> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f18135U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f18136V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public WrapperLoadingView f18137W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18138X;

    /* JADX INFO: renamed from: Y */
    public boolean f18139Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f18134a0 = {Reflection.property1(new PropertyReference1Impl(OptionsAssetListFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/OptionsAssetListFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f18133Z = new Companion(null);

    /* JADX INFO: compiled from: OptionsAssetListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/options/assets/OptionsAssetListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/options/assets/OptionsAssetListFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OptionsAssetListFragment newInstance() {
            return new OptionsAssetListFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1 */
    /* JADX INFO: compiled from: OptionsAssetListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1", m90122f = "OptionsAssetListFragment.kt", m90123i = {}, m90124l = {67, 74}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105211 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: OptionsAssetListFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/options/AssetOptionsContract$UIState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1$1", m90122f = "OptionsAssetListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsAssetListFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(UIState uIState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uIState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OptionsAssetListFragment optionsAssetListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsAssetListFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                UIState uIState = (UIState) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.m18121w3(uIState.getUiHideNumberFlag());
                OptionsAssetListFragment optionsAssetListFragment = this.this$0;
                OptionsOverviewEntity optionsOverviewEntity = uIState.getOptionsOverviewEntity();
                optionsAssetListFragment.m18122y3(optionsOverviewEntity != null ? optionsOverviewEntity.getAssets() : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: OptionsAssetListFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mvi/event/ISingleEvent;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.options.assets.OptionsAssetListFragment$bindState$1$2", m90122f = "OptionsAssetListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC36952a, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsAssetListFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC36952a interfaceC36952a, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC36952a, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OptionsAssetListFragment optionsAssetListFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsAssetListFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                WrapperLoadingView wrapperLoadingView;
                InterfaceC36952a interfaceC36952a = (InterfaceC36952a) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(interfaceC36952a, SingleEvent.C19247c.f35626b) && (wrapperLoadingView = this.this$0.f18137W) != null) {
                    wrapperLoadingView.showContent();
                }
                return Unit.INSTANCE;
            }
        }

        public C105211(Continuation<? super C105211> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsAssetListFragment.this.new C105211(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C105211) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (kotlinx.coroutines.flow.C41636g.m90925l(r7, r1, r6) == r0) goto L15;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<UIState> stateFlow = OptionsAssetListFragment.this.m18120v3().getStateFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsAssetListFragment.this, null);
            this.label = 1;
            if (C41636g.m90925l(stateFlow, anonymousClass1, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            InterfaceC41634e<InterfaceC36952a> singleEventFlow = OptionsAssetListFragment.this.m18120v3().getSingleEventFlow();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsAssetListFragment.this, null);
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static final OptionsAssetInfoAdapter m18116s3(OptionsAssetListFragment optionsAssetListFragment) {
        return new OptionsAssetInfoAdapter(optionsAssetListFragment);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.options_asset_list_fragment;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18139Y() {
        return this.f18139Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<OptionsAssetListContract$UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(OptionsAssetsViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18139Y = z11;
    }

    /* JADX INFO: renamed from: t3 */
    public final OptionsAssetInfoAdapter m18118t3() {
        return (OptionsAssetInfoAdapter) this.f18138X.getValue();
    }

    /* JADX INFO: renamed from: u3 */
    public final C44863s5 m18119u3() {
        return (C44863s5) this.f18136V.getValue(this, f18134a0[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final AssetOptionsViewModel m18120v3() {
        return (AssetOptionsViewModel) this.f18135U.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m18122y3(List<AssetResponse> list) {
        WrapperLoadingView wrapperLoadingView = this.f18137W;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
        if (list != null && !list.isEmpty()) {
            m18118t3().replaceData(list);
            return;
        }
        OptionsAssetInfoAdapter optionsAssetInfoAdapterM18118t3 = m18118t3();
        int i11 = R$layout.view_empty;
        C44863s5 c44863s5M18119u3 = m18119u3();
        optionsAssetInfoAdapterM18118t3.setEmptyView(i11, c44863s5M18119u3 != null ? c44863s5M18119u3.f100845b : null);
    }

    public OptionsAssetListFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.assets.options.assets.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsAssetListFragment.m18117x3(this.f18140b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewModels$default$1
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
        this.f18135U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AssetOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewModels$default$4
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
        this.f18136V = C45681e.m100799e(this, new Function1<OptionsAssetListFragment, C44863s5>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44863s5 invoke(@NotNull OptionsAssetListFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44863s5.m99250a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C44863s5, Unit>() { // from class: com.kubi.assets.options.assets.OptionsAssetListFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C44863s5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44863s5 c44863s5) {
                invoke(c44863s5);
                return Unit.INSTANCE;
            }
        });
        this.f18138X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.assets.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsAssetListFragment.m18116s3(this.f18141b);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static final ViewModelStoreOwner m18117x3(OptionsAssetListFragment optionsAssetListFragment) {
        Fragment fragmentRequireParentFragment = optionsAssetListFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C105211(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.initView();
        C44863s5 c44863s5M18119u3 = m18119u3();
        RecyclerView recyclerView3 = null;
        if (c44863s5M18119u3 != null) {
            recyclerView = c44863s5M18119u3.f100845b;
        } else {
            recyclerView = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(recyclerView);
        this.f18137W = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44863s5 c44863s5M18119u4 = m18119u3();
        if (c44863s5M18119u4 != null && (recyclerView2 = c44863s5M18119u4.f100845b) != null) {
            recyclerView2.setAdapter(m18118t3());
        }
        OptionsAssetInfoAdapter optionsAssetInfoAdapterM18118t3 = m18118t3();
        int i11 = R$layout.view_empty;
        C44863s5 c44863s5M18119u5 = m18119u3();
        if (c44863s5M18119u5 != null) {
            recyclerView3 = c44863s5M18119u5.f100845b;
        }
        optionsAssetInfoAdapterM18118t3.setEmptyView(i11, recyclerView3);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: w3 */
    public final void m18121w3(boolean z11) {
        m18118t3().m18109j(z11);
        m18118t3().notifyDataSetChanged();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
    }
}
