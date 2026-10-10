package com.kubi.copytrading.assets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5286o;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.assets.copy.AssetCopyTradingFragment;
import com.kubi.copytrading.assets.lead.AssetLeadTradingFragment;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetCopyTradingMainFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020 H\u0007J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0016J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\bJ\u001c\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/copytrading/assets/AssetCopyTradingMainFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "getLayout", "", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "copyTradingViewModel", "Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "getCopyTradingViewModel", "()Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "copyTradingViewModel$delegate", "Lkotlin/Lazy;", "copyTradingFragment", "Lcom/kubi/copytrading/assets/copy/AssetCopyTradingFragment;", "leadTradingFragment", "Lcom/kubi/copytrading/assets/lead/AssetLeadTradingFragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initFragment", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", "showLeadOrCopy", "isCopy", "showHide", TIMPushProvider.f75062n, TIMPushProvider.f75063o, "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCopyTradingMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCopyTradingMainFragment.kt\ncom/kubi/copytrading/assets/AssetCopyTradingMainFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n106#2,15:109\n135#3,2:124\n295#4,2:126\n*S KotlinDebug\n*F\n+ 1 AssetCopyTradingMainFragment.kt\ncom/kubi/copytrading/assets/AssetCopyTradingMainFragment\n*L\n37#1:109,15\n84#1:124,2\n89#1:126,2\n*E\n"})
public final class AssetCopyTradingMainFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f19802Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    public boolean f19803U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19804V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetCopyTradingFragment f19805W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public AssetLeadTradingFragment f19806X;

    /* JADX INFO: compiled from: AssetCopyTradingMainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/copytrading/assets/AssetCopyTradingMainFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/copytrading/assets/AssetCopyTradingMainFragment;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetCopyTradingMainFragment newInstance() {
            return new AssetCopyTradingMainFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$onViewCreated$1 */
    /* JADX INFO: compiled from: AssetCopyTradingMainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.assets.AssetCopyTradingMainFragment$onViewCreated$1", m90122f = "AssetCopyTradingMainFragment.kt", m90123i = {}, m90124l = {52}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C114371 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$onViewCreated$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AssetCopyTradingMainFragment.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.copytrading.assets.AssetCopyTradingMainFragment$onViewCreated$1$1", m90122f = "AssetCopyTradingMainFragment.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AssetCopyTradingMainFragment this$0;

            /* JADX INFO: renamed from: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$onViewCreated$1$1$a */
            /* JADX INFO: compiled from: AssetCopyTradingMainFragment.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class a<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AssetCopyTradingMainFragment f19807b;

                public a(AssetCopyTradingMainFragment assetCopyTradingMainFragment) {
                    this.f19807b = assetCopyTradingMainFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<LeadUserEntity, LeadUserEntity> pair, Continuation<? super Unit> continuation) {
                    this.f19807b.m20640k3();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AssetCopyTradingMainFragment assetCopyTradingMainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetCopyTradingMainFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e interfaceC41634eM90942y = C41636g.m90942y(CopyTradingConfig.f19710a.m20595k(), 1);
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (interfaceC41634eM90942y.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C114371(Continuation<? super C114371> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AssetCopyTradingMainFragment.this.new C114371(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C114371) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = AssetCopyTradingMainFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AssetCopyTradingMainFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final int getLayout() {
        return R$layout.fragment_assetv2_copy_trading_main;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f19803U;
    }

    /* JADX INFO: renamed from: j3 */
    public final CopyTradingViewModel m20639j3() {
        return (CopyTradingViewModel) this.f19804V.getValue();
    }

    /* JADX INFO: renamed from: l3 */
    public final void m20641l3(BaseFragment baseFragment, BaseFragment baseFragment2) {
        if (baseFragment == null || baseFragment2 == null) {
            return;
        }
        C5286o.m6330n(baseFragment, baseFragment2);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m20642m3(boolean z11) {
        if (CopyTradingConfig.f19710a.m20608y()) {
            if (z11) {
                m20641l3(this.f19805W, this.f19806X);
            } else {
                m20641l3(this.f19806X, this.f19805W);
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m20640k3();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C114371(null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f19803U = z11;
    }

    public AssetCopyTradingMainFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$special$$inlined$viewModels$default$2
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
        this.f19804V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CopyTradingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.copytrading.assets.AssetCopyTradingMainFragment$special$$inlined$viewModels$default$5
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
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k3 */
    public final void m20640k3() {
        C5286o.m6326j(getChildFragmentManager());
        if (CopyTradingConfig.f19710a.m20608y()) {
            AssetCopyTradingFragment assetCopyTradingFragmentNewInstance = AssetCopyTradingFragment.f19833b0.newInstance();
            FragmentManager childFragmentManager = getChildFragmentManager();
            int i11 = R$id.fragmentContainer;
            C5286o.m6317a(childFragmentManager, assetCopyTradingFragmentNewInstance, i11);
            this.f19805W = assetCopyTradingFragmentNewInstance;
            AssetLeadTradingFragment assetLeadTradingFragmentNewInstance = AssetLeadTradingFragment.f19865b0.newInstance();
            C5286o.m6317a(getChildFragmentManager(), assetLeadTradingFragmentNewInstance, i11);
            this.f19806X = assetLeadTradingFragmentNewInstance;
            m20642m3(false);
            return;
        }
        C5286o.m6317a(getChildFragmentManager(), AssetCopyTradingFragment.f19833b0.newInstance(), R$id.fragmentContainer);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        SwipeRefreshLayout.OnRefreshListener onRefreshListener;
        Object next;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        while (true) {
            onRefreshListener = null;
            if (it.hasNext()) {
                next = it.next();
                Fragment fragment = (Fragment) next;
                if ((fragment instanceof BaseFragment) && ((BaseFragment) fragment).isShowing()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof SwipeRefreshLayout.OnRefreshListener) {
            onRefreshListener = (SwipeRefreshLayout.OnRefreshListener) next;
        }
        if (onRefreshListener != null) {
            onRefreshListener.onRefresh();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m20639j3().m20649C().setValue(Boolean.valueOf(C46392a.m102322d(IAssetsCenterService.f16464a.get().mo15354t(), false)));
        CopyTradingConfig.f19710a.m20597n();
    }
}
