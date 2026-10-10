package com.kubi.core.biz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.offline.SymbolOfflineData;
import com.kubi.core.biz.offline.SymbolOfflineUtilsExtKt;
import com.kubi.core.biz.symbol.C12247g;
import com.kubi.core.biz.symbol.ICallAuctionStateChangeListener;
import com.kubi.core.biz.symbol.ShareSymbolBizVM;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import id.C38519a;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p827zc.InterfaceC46752b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: compiled from: BaseTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\tH&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0006\u0010\u001c\u001a\u00020\u001dJ$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u000200H\u0002J\n\u00101\u001a\u0004\u0018\u000102H$J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\tH$J\u001a\u00106\u001a\u0004\u0018\u00010\t2\u0006\u00105\u001a\u00020\t2\u0006\u00107\u001a\u000204H\u0014J\u0010\u00108\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u00010\tJ\b\u00109\u001a\u00020\tH\u0002J\b\u0010:\u001a\u000200H\u0002R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006;"}, m90084d2 = {"Lcom/kubi/core/biz/BaseTradeCoreFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/core/base/arch/repo/IRepoProvider;", "Lcom/kubi/core/biz/symbol/ICallAuctionStateChangeListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "getLastSymbolStorageKey", "Lcom/kubi/utils/storage/StorageId;", "", "symbolBizVM", "Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "getSymbolBizVM", "()Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "symbolBizVM$delegate", "Lkotlin/Lazy;", "coreBizShareVM", "Lcom/kubi/core/biz/CoreBizShareViewModel;", "getCoreBizShareVM", "()Lcom/kubi/core/biz/CoreBizShareViewModel;", "coreBizShareVM$delegate", "getLayout", "", "getTracePageBizName", "getAppBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getRefreshLayout", "Lcom/kubi/resources/widget/KuCoinRefreshLayout;", "scrollToTop", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initUI", "onPullRefreshExtra", "autoFinishRefresh", "refreshAllChildFragment", "startCollectData", "Lkotlinx/coroutines/Job;", "getSymbolOfflineBannerView", "Lcom/kubi/core/biz/offline/SymbolOfflineBannerView;", "getSymbolOfflineData", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "symbol", "buildOfflineTipContent", "offlineData", "updateSymbolOfflineBanner", "getSymbolOfflineTradeType", "observeCallAuctionState", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeCoreFragment.kt\ncom/kubi/core/biz/BaseTradeCoreFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n106#2,15:299\n808#3,11:314\n1869#3,2:325\n774#3:327\n865#3,2:328\n808#3,11:330\n1869#3,2:341\n*S KotlinDebug\n*F\n+ 1 BaseTradeCoreFragment.kt\ncom/kubi/core/biz/BaseTradeCoreFragment\n*L\n64#1:299,15\n161#1:314,11\n162#1:325,2\n208#1:327\n208#1:328,2\n209#1:330,11\n210#1:341,2\n*E\n"})
public abstract class BaseTradeCoreFragment extends BaseFragment implements InterfaceC46752b, ICallAuctionStateChangeListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f20132U = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseTradeCoreFragment.m21224J3(this.f20136b);
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f20133V;

    /* JADX INFO: renamed from: com.kubi.core.biz.BaseTradeCoreFragment$a */
    /* JADX INFO: compiled from: BaseTradeCoreFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/biz/BaseTradeCoreFragment$initUI$1", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$DragCallback;", "canDrag", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11678a extends AppBarLayout.Behavior.DragCallback {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            return true;
        }
    }

    public abstract int getLayout();

    @Nullable
    /* JADX INFO: renamed from: s3 */
    public abstract AppBarLayout mo21240s3();

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public abstract KuCoinRefreshLayout mo21243v3();

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public abstract SymbolOfflineBannerView mo21245x3();

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public abstract SymbolOfflineData mo21246y3(@NotNull String str);

    /* JADX INFO: renamed from: B3 */
    public static final void m21220B3(BaseTradeCoreFragment baseTradeCoreFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseTradeCoreFragment.onRefresh();
        baseTradeCoreFragment.m21238p3();
        baseTradeCoreFragment.mo21234D3();
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m21225L3(BaseTradeCoreFragment baseTradeCoreFragment, SymbolOfflineData symbolOfflineData, String str, String str2) {
        SymbolOfflineUtilsExtKt.m22077m(baseTradeCoreFragment, symbolOfflineData, str, str2, false, null, 24, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m21237K3(@Nullable final String str) {
        SymbolOfflineBannerView symbolOfflineBannerViewMo21245x3;
        if (str == null || str.length() == 0 || (symbolOfflineBannerViewMo21245x3 = mo21245x3()) == null) {
            return;
        }
        final SymbolOfflineData symbolOfflineDataMo21246y3 = mo21246y3(str);
        if (symbolOfflineDataMo21246y3 == null) {
            symbolOfflineBannerViewMo21245x3.m22062f();
            return;
        }
        final String strMo21239r3 = mo21239r3(str, symbolOfflineDataMo21246y3);
        symbolOfflineBannerViewMo21245x3.m22060d(symbolOfflineDataMo21246y3);
        C27046k.m66711z(symbolOfflineBannerViewMo21245x3, 0L, new Function0() { // from class: com.kubi.core.biz.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradeCoreFragment.m21225L3(this.f20387b, symbolOfflineDataMo21246y3, str, strMo21239r3);
            }
        }, 1, null);
        SymbolOfflineUtilsExtKt.m22073i(this, symbolOfflineDataMo21246y3, str, strMo21239r3, SymbolOfflineUtilsExtKt.m22067c(m21247z3(), str));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21219A3();
        m21223I3();
        m21233C3();
    }

    @Nullable
    /* JADX INFO: renamed from: r3 */
    public String mo21239r3(@NotNull String symbol, @NotNull SymbolOfflineData offlineData) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(offlineData, "offlineData");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t3 */
    public final CoreBizShareViewModel m21241t3() {
        return (CoreBizShareViewModel) this.f20133V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u3 */
    public StorageId<String> mo21242u3() {
        return C38519a.f86479a.m87132g();
    }

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public final ShareSymbolBizVM m21244w3() {
        return (ShareSymbolBizVM) this.f20132U.getValue();
    }

    public BaseTradeCoreFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.core.biz.BaseTradeCoreFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.BaseTradeCoreFragment$special$$inlined$viewModels$default$2
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
        this.f20133V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CoreBizShareViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.BaseTradeCoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.BaseTradeCoreFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.BaseTradeCoreFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: A3 */
    private final void m21219A3() {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior;
        View view;
        View viewFindViewById;
        AppBarLayout appBarLayoutMo21240s3 = mo21240s3();
        AppBarLayout.Behavior behavior2 = null;
        if (appBarLayoutMo21240s3 != null) {
            layoutParams = appBarLayoutMo21240s3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            behavior = layoutParams2.getBehavior();
        } else {
            behavior = null;
        }
        if (behavior instanceof AppBarLayout.Behavior) {
            behavior2 = (AppBarLayout.Behavior) behavior;
        }
        if (behavior2 != null) {
            behavior2.setDragCallback(new C11678a());
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (viewFindViewById = view.findViewById(R$id.root_view)) != null) {
            viewFindViewById.setBackgroundResource(R$color.c_overlay);
        }
        KuCoinRefreshLayout kuCoinRefreshLayoutMo21243v3 = mo21243v3();
        if (kuCoinRefreshLayoutMo21243v3 != null) {
            kuCoinRefreshLayoutMo21243v3.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.core.biz.b
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    BaseTradeCoreFragment.m21220B3(this.f20137b, interfaceC38162f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m21221E3(BaseTradeCoreFragment baseTradeCoreFragment, Boolean bool) {
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) baseTradeCoreFragment.m21244w3().m22742v().mo86421a());
        if (symbolBizUiState != null && Intrinsics.areEqual(CallAuctionSwitch.f20317a.m21640f(), symbolBizUiState.getSymbol())) {
            baseTradeCoreFragment.m21244w3().m22745y(baseTradeCoreFragment.getArguments());
            baseTradeCoreFragment.m21244w3().m22731E(baseTradeCoreFragment);
            baseTradeCoreFragment.getF54186Y().getF104577b().mo85486d(baseTradeCoreFragment.getArguments());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m21222F3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    private final InterfaceC41775x1 m21223I3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseTradeCoreFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: J3 */
    public static final ShareSymbolBizVM m21224J3(BaseTradeCoreFragment baseTradeCoreFragment) {
        return C12247g.m22749a(baseTradeCoreFragment, baseTradeCoreFragment.mo21242u3());
    }

    /* JADX INFO: renamed from: q3 */
    public static final void m21232q3(BaseTradeCoreFragment baseTradeCoreFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayoutMo21243v3 = baseTradeCoreFragment.mo21243v3();
        if (kuCoinRefreshLayoutMo21243v3 != null) {
            kuCoinRefreshLayoutMo21243v3.setRefreshing(false);
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final InterfaceC41775x1 m21233C3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseTradeCoreFragment$observeCallAuctionState$1(this, null));
    }

    /* JADX INFO: renamed from: G3 */
    public final void m21235G3() {
        if (isVisible()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (((Fragment) obj).isAdded()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof SwipeRefreshLayout.OnRefreshListener) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((SwipeRefreshLayout.OnRefreshListener) it.next()).onRefresh();
            }
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m21236H3() {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior;
        AppBarLayout appBarLayoutMo21240s3 = mo21240s3();
        AppBarLayout.Behavior behavior2 = null;
        if (appBarLayoutMo21240s3 != null) {
            layoutParams = appBarLayoutMo21240s3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            behavior = layoutParams2.getBehavior();
        } else {
            behavior = null;
        }
        if (behavior instanceof AppBarLayout.Behavior) {
            behavior2 = (AppBarLayout.Behavior) behavior;
        }
        if (behavior2 != null) {
            behavior2.setTopAndBottomOffset(0);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        if (getView() != null) {
            m21244w3().m22734J();
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof DialogFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DialogFragment) it.next()).dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m21244w3().m22745y(getArguments());
        m21235G3();
        m21244w3().m22731E(this);
        getF54186Y().getF104577b().mo85486d(getArguments());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m21244w3().m22745y(getArguments());
        m21244w3().m22731E(this);
        getF54186Y().getF104577b().mo85486d(getArguments());
        CompositeDisposable visibleDisposable = getVisibleDisposable();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseTradeCoreFragment.m21221E3(this.f20281b, (Boolean) obj);
            }
        };
        visibleDisposable.add(publishSubjectM21641g.subscribe(new Consumer() { // from class: com.kubi.core.biz.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseTradeCoreFragment.m21222F3(function1, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m21238p3() {
        KuCoinRefreshLayout kuCoinRefreshLayoutMo21243v3;
        if (isVisible() && (kuCoinRefreshLayoutMo21243v3 = mo21243v3()) != null) {
            kuCoinRefreshLayoutMo21243v3.postDelayed(new Runnable() { // from class: com.kubi.core.biz.f
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTradeCoreFragment.m21232q3(this.f20391b);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final String m21247z3() {
        if (Intrinsics.areEqual(mo21242u3(), C38519a.f86479a.m87131f())) {
            return TradeAccountType.Margin.INSTANCE.getType();
        }
        return TradeAccountType.ClassicSpot.INSTANCE.getType();
    }

    /* JADX INFO: renamed from: D3 */
    public void mo21234D3() {
    }
}
