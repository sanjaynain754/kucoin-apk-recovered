package com.kubi.kumex.record.currentDelegate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.record.PageInfo;
import com.kubi.kumex.record.currentDelegate.viewModel.FiltersInfo;
import com.kubi.kumex.record.currentDelegate.viewModel.TodoDelegateViewModel;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36873y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.C36694b;
import p203di.C36699g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TodoDelegateHistFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u0010/\u001a\u00020,2\b\b\u0001\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020.H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentCurrentDelegateBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentCurrentDelegateBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "contractFilter", "Lcom/kubi/futures/history/filter/ContractClickFilter;", "getContractFilter", "()Lcom/kubi/futures/history/filter/ContractClickFilter;", "contractFilter$delegate", "Lkotlin/Lazy;", "assetTypeFilter", "Lcom/kubi/futures/history/filter/AssetTypeClickFilterOfDelegation;", "getAssetTypeFilter", "()Lcom/kubi/futures/history/filter/AssetTypeClickFilterOfDelegation;", "assetTypeFilter$delegate", "todoDelegateViewModel", "Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "getTodoDelegateViewModel", "()Lcom/kubi/kumex/record/currentDelegate/viewModel/TodoDelegateViewModel;", "todoDelegateViewModel$delegate", "pageInfos", "", "Lcom/kubi/kumex/record/PageInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initListeners", "initObservers", "initView", "getDefaultCheckedIndex", "", "initDisplayType", "", "indexOf", "titleResId", "updateRevokeAllStatus", "curFundsType", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTodoDelegateHistFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n147#2,16:245\n106#3,15:261\n1563#4:276\n1634#4,3:277\n1563#4:280\n1634#4,3:281\n1563#4:284\n1634#4,3:285\n*S KotlinDebug\n*F\n+ 1 TodoDelegateHistFragment.kt\ncom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment\n*L\n63#1:245,16\n79#1:261,15\n204#1:276\n204#1:277,3\n207#1:280\n207#1:281,3\n226#1:284\n226#1:285,3\n*E\n"})
public final class TodoDelegateHistFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29974U = C45681e.m100799e(this, new Function1<TodoDelegateHistFragment, C36873y1>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36873y1 invoke(@NotNull TodoDelegateHistFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36873y1.m82614a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36873y1, Unit>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36873y1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36873y1 c36873y1) {
            invoke(c36873y1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29975V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TodoDelegateHistFragment.m35406v3(this.f30020b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29976W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TodoDelegateHistFragment.m35405u3(this.f30023b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29977X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<PageInfo> f29978Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f29973a0 = {Reflection.property1(new PropertyReference1Impl(TodoDelegateHistFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentCurrentDelegateBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f29972Z = new Companion(null);

    /* JADX INFO: compiled from: TodoDelegateHistFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$Companion;", "", "<init>", "()V", "ORDERS_TYPE", "", "PAGE_ACTIVE_DELEGATES", "PAGE_ADVANCED_DELEGATES", "PAGE_TWAP_DELEGATES", "newInstance", "Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TodoDelegateHistFragment newInstance(@Nullable Bundle bundle) {
            TodoDelegateHistFragment todoDelegateHistFragment = new TodoDelegateHistFragment();
            todoDelegateHistFragment.setArguments(bundle);
            return todoDelegateHistFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$a */
    /* JADX INFO: compiled from: TodoDelegateHistFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$initListeners$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16563a extends ViewPager.SimpleOnPageChangeListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C36873y1 f29980c;

        public C16563a(C36873y1 c36873y1) {
            this.f29980c = c36873y1;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            TodoDelegateHistFragment.this.m35408M3();
            if (position != TodoDelegateHistFragment.this.m35384C3(R$string.kumex_order_twap) && BrokerConfig.f19211a.m20201d().mo20229O()) {
                BaseTextView assetTypeFilterTv = this.f29980c.f81362b;
                Intrinsics.checkNotNullExpressionValue(assetTypeFilterTv, "assetTypeFilterTv");
                C27046k.m66685H(assetTypeFilterTv);
            } else {
                BaseTextView assetTypeFilterTv2 = this.f29980c.f81362b;
                Intrinsics.checkNotNullExpressionValue(assetTypeFilterTv2, "assetTypeFilterTv");
                C27046k.m66700o(assetTypeFilterTv2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$b */
    /* JADX INFO: compiled from: TodoDelegateHistFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16564b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29981b;

        public C16564b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29981b = function;
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
            return this.f29981b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29981b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: B3 */
    private final TodoDelegateViewModel m35383B3() {
        return (TodoDelegateViewModel) this.f29977X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public final int m35384C3(@StringRes int i11) {
        List<PageInfo> list = this.f29978Y;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PageInfo) it.next()).getTitle());
        }
        return arrayList.indexOf(getString(i11));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_current_delegate, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m35385D3();
        m35387F3();
    }

    /* JADX INFO: renamed from: x3 */
    public final C36694b m35410x3() {
        return (C36694b) this.f29976W.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final C36873y1 m35411y3() {
        return (C36873y1) this.f29974U.getValue(this, f29973a0[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final C36699g m35412z3() {
        return (C36699g) this.f29975V.getValue();
    }

    public TodoDelegateHistFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewModels$default$2
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
        this.f29977X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TodoDelegateViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.currentDelegate.TodoDelegateHistFragment$special$$inlined$viewModels$default$5
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
        this.f29978Y = new ArrayList();
    }

    /* JADX INFO: renamed from: D3 */
    private final void m35385D3() {
        final C36873y1 c36873y1M35411y3 = m35411y3();
        if (c36873y1M35411y3 == null) {
            return;
        }
        BaseTextView cancelAll = c36873y1M35411y3.f81363c;
        Intrinsics.checkNotNullExpressionValue(cancelAll, "cancelAll");
        C27046k.m66711z(cancelAll, 0L, new Function0() { // from class: com.kubi.kumex.record.currentDelegate.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodoDelegateHistFragment.m35386E3(c36873y1M35411y3, this);
            }
        }, 1, null);
        c36873y1M35411y3.f81371k.addOnPageChangeListener(new C16563a(c36873y1M35411y3));
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m35386E3(C36873y1 c36873y1, TodoDelegateHistFragment todoDelegateHistFragment) {
        C43852m.m96591c(C17060n0.m36552b(), "BatchOrderCancel", null, null, 12, null);
        if (c36873y1.f81371k.getCurrentItem() == todoDelegateHistFragment.m35384C3(R$string.basic_delegaion)) {
            todoDelegateHistFragment.m35383B3().m35586y();
        } else if (c36873y1.f81371k.getCurrentItem() == todoDelegateHistFragment.m35384C3(R$string.advanced_order)) {
            todoDelegateHistFragment.m35383B3().m35585x();
        } else {
            todoDelegateHistFragment.m35383B3().m35587z();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    private final void m35387F3() {
        m35383B3().m35578q().observe(getViewLifecycleOwner(), new C16564b(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TodoDelegateHistFragment.m35388G3(this.f30026b, (String) obj);
            }
        }));
        m35383B3().m35583v().observe(getViewLifecycleOwner(), new C16564b(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TodoDelegateHistFragment.m35389H3(this.f30029b, (Boolean) obj);
            }
        }));
        m35383B3().m35582u().observe(getViewLifecycleOwner(), new C16564b(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TodoDelegateHistFragment.m35390I3(this.f30032b, (Boolean) obj);
            }
        }));
        m35383B3().m35584w().observe(getViewLifecycleOwner(), new C16564b(new Function1() { // from class: com.kubi.kumex.record.currentDelegate.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TodoDelegateHistFragment.m35391J3(this.f30034b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m35388G3(TodoDelegateHistFragment todoDelegateHistFragment, String str) {
        C36694b c36694bM35410x3 = todoDelegateHistFragment.m35410x3();
        if (c36694bM35410x3 != null) {
            c36694bM35410x3.m82230m(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m35389H3(TodoDelegateHistFragment todoDelegateHistFragment, Boolean bool) {
        todoDelegateHistFragment.m35408M3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m35390I3(TodoDelegateHistFragment todoDelegateHistFragment, Boolean bool) {
        todoDelegateHistFragment.m35408M3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m35391J3(TodoDelegateHistFragment todoDelegateHistFragment, Boolean bool) {
        todoDelegateHistFragment.m35408M3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m35392K3(TodoDelegateHistFragment todoDelegateHistFragment, C36873y1 c36873y1) {
        String f79596c;
        TodoDelegateViewModel todoDelegateViewModelM35383B3 = todoDelegateHistFragment.m35383B3();
        C36699g c36699gM35412z3 = todoDelegateHistFragment.m35412z3();
        if (c36699gM35412z3 != null) {
            f79596c = c36699gM35412z3.getF79596c();
        } else {
            f79596c = null;
        }
        todoDelegateViewModelM35383B3.m35576E(new FiltersInfo(f79596c, todoDelegateHistFragment.m35409w3()));
        if (c36873y1.f81371k.getCurrentItem() == 0) {
            C43852m.m96591c("B6FuturesTradeOrder", "BasicOrder", "1", null, 8, null);
        } else {
            C43852m.m96591c("B6FuturesTradeOrder", "ConditionalOrder", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m35393L3(TodoDelegateHistFragment todoDelegateHistFragment, C36873y1 c36873y1) {
        String f79596c;
        TodoDelegateViewModel todoDelegateViewModelM35383B3 = todoDelegateHistFragment.m35383B3();
        C36699g c36699gM35412z3 = todoDelegateHistFragment.m35412z3();
        if (c36699gM35412z3 != null) {
            f79596c = c36699gM35412z3.getF79596c();
        } else {
            f79596c = null;
        }
        todoDelegateViewModelM35383B3.m35576E(new FiltersInfo(f79596c, todoDelegateHistFragment.m35409w3()));
        if (c36873y1.f81371k.getCurrentItem() == 0) {
            C43852m.m96591c("B6FuturesTradeOrder", "BasicOrder", "2", null, 8, null);
        } else {
            C43852m.m96591c("B6FuturesTradeOrder", "ConditionalOrder", "2", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    private final void initView() {
        String strM56284y;
        String strM56284y2;
        C36699g c36699gM35412z3;
        final C36873y1 c36873y1M35411y3 = m35411y3();
        if (c36873y1M35411y3 == null) {
            return;
        }
        if (BrokerConfig.f19211a.m20201d().mo20229O()) {
            BaseTextView assetTypeFilterTv = c36873y1M35411y3.f81362b;
            Intrinsics.checkNotNullExpressionValue(assetTypeFilterTv, "assetTypeFilterTv");
            ViewExtKt.m66594y(assetTypeFilterTv);
            View divider1 = c36873y1M35411y3.f81365e;
            Intrinsics.checkNotNullExpressionValue(divider1, "divider1");
            ViewExtKt.m66594y(divider1);
        } else {
            BaseTextView assetTypeFilterTv2 = c36873y1M35411y3.f81362b;
            Intrinsics.checkNotNullExpressionValue(assetTypeFilterTv2, "assetTypeFilterTv");
            ViewExtKt.m66577h(assetTypeFilterTv2);
            View divider2 = c36873y1M35411y3.f81365e;
            Intrinsics.checkNotNullExpressionValue(divider2, "divider1");
            ViewExtKt.m66577h(divider2);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (strM56284y = RouteExKt.m56284y(arguments, "ordersType")) == null) {
            strM56284y = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments2, "symbol");
        } else {
            strM56284y2 = null;
        }
        String typeName = OrderAssetType.SelfFunds.getTypeName();
        m35383B3().m35576E(new FiltersInfo(strM56284y2, typeName));
        if (strM56284y2 != null && strM56284y2.length() != 0 && (c36699gM35412z3 = m35412z3()) != null) {
            c36699gM35412z3.m82177k(strM56284y2);
        }
        C36699g c36699gM35412z4 = m35412z3();
        if (c36699gM35412z4 != null) {
            c36699gM35412z4.m82174e(new Function0() { // from class: com.kubi.kumex.record.currentDelegate.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TodoDelegateHistFragment.m35392K3(this.f30036b, c36873y1M35411y3);
                }
            });
        }
        C36694b c36694bM35410x3 = m35410x3();
        if (c36694bM35410x3 != null) {
            c36694bM35410x3.m82228g(typeName, new Function0() { // from class: com.kubi.kumex.record.currentDelegate.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TodoDelegateHistFragment.m35393L3(this.f30039b, c36873y1M35411y3);
                }
            });
        }
        this.f29978Y.add(new PageInfo(getStringRes(R$string.basic_delegaion, new Object[0]), BasicDelegateHistFragment.f29970a0.newInstance()));
        this.f29978Y.add(new PageInfo(getStringRes(R$string.advanced_order, new Object[0]), AdvancedDelegateHistFragment.f29968a0.newInstance()));
        if (com.kubi.futures.trade.submit.panel.tradeType.twap.z.a()) {
            this.f29978Y.add(new PageInfo(getStringRes(R$string.kumex_order_twap, new Object[0]), TwapDelegateHistFragment.f29982Y.newInstance()));
        }
        ArrayList arrayList = new ArrayList();
        List<PageInfo> list = this.f29978Y;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PageInfo) it.next()).getFragment());
        }
        arrayList.addAll(arrayList2);
        CustomViewPager customViewPager = c36873y1M35411y3.f81371k;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List<PageInfo> list2 = this.f29978Y;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((PageInfo) it2.next()).getTitle());
        }
        customViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList3));
        c36873y1M35411y3.f81371k.setOffscreenPageLimit(arrayList.size() - 1);
        c36873y1M35411y3.f81369i.setNeedBold(true);
        c36873y1M35411y3.f81369i.setViewPager(c36873y1M35411y3.f81371k);
        c36873y1M35411y3.f81371k.setCurrentItem(m35407A3(strM56284y));
    }

    /* JADX INFO: renamed from: u3 */
    public static final C36694b m35405u3(TodoDelegateHistFragment todoDelegateHistFragment) {
        C36873y1 c36873y1M35411y3 = todoDelegateHistFragment.m35411y3();
        if (c36873y1M35411y3 != null) {
            BaseTextView assetTypeFilterTv = c36873y1M35411y3.f81362b;
            Intrinsics.checkNotNullExpressionValue(assetTypeFilterTv, "assetTypeFilterTv");
            View line = c36873y1M35411y3.f81368h;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36694b(assetTypeFilterTv, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: v3 */
    public static final C36699g m35406v3(TodoDelegateHistFragment todoDelegateHistFragment) {
        C36873y1 c36873y1M35411y3 = todoDelegateHistFragment.m35411y3();
        if (c36873y1M35411y3 != null) {
            BaseTextView contractFilterTv = c36873y1M35411y3.f81364d;
            Intrinsics.checkNotNullExpressionValue(contractFilterTv, "contractFilterTv");
            View line = c36873y1M35411y3.f81368h;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36699g(contractFilterTv, line);
        }
        return null;
    }

    /* JADX INFO: renamed from: A3 */
    public final int m35407A3(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -2102186596) {
            if (iHashCode != -1702178452) {
                if (iHashCode == -932007160 && str.equals("ActiveDelegates")) {
                    return m35384C3(R$string.basic_delegaion);
                }
            } else if (str.equals("AdvancedDelegates")) {
                return m35384C3(R$string.advanced_order);
            }
        } else if (str.equals("TwapDelegates")) {
            return m35384C3(R$string.kumex_order_twap);
        }
        return m35384C3(R$string.basic_delegaion);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m35408M3() {
        boolean zBooleanValue;
        BaseTextView baseTextView;
        CustomViewPager customViewPager;
        boolean zBooleanValue2;
        BaseTextView baseTextView2;
        CustomViewPager customViewPager2;
        boolean zBooleanValue3;
        BaseTextView baseTextView3;
        C36873y1 c36873y1M35411y3 = m35411y3();
        if (c36873y1M35411y3 != null && (customViewPager2 = c36873y1M35411y3.f81371k) != null && customViewPager2.getCurrentItem() == m35384C3(R$string.basic_delegaion)) {
            Boolean value = m35383B3().m35583v().getValue();
            if (value != null) {
                zBooleanValue3 = value.booleanValue();
            } else {
                zBooleanValue3 = true;
            }
            C36873y1 c36873y1M35411y4 = m35411y3();
            if (c36873y1M35411y4 != null && (baseTextView3 = c36873y1M35411y4.f81363c) != null) {
                baseTextView3.setEnabled(!zBooleanValue3);
                return;
            }
            return;
        }
        C36873y1 c36873y1M35411y5 = m35411y3();
        if (c36873y1M35411y5 != null && (customViewPager = c36873y1M35411y5.f81371k) != null && customViewPager.getCurrentItem() == m35384C3(R$string.advanced_order)) {
            Boolean value2 = m35383B3().m35582u().getValue();
            if (value2 != null) {
                zBooleanValue2 = value2.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
            C36873y1 c36873y1M35411y6 = m35411y3();
            if (c36873y1M35411y6 != null && (baseTextView2 = c36873y1M35411y6.f81363c) != null) {
                baseTextView2.setEnabled(!zBooleanValue2);
                return;
            }
            return;
        }
        Boolean value3 = m35383B3().m35584w().getValue();
        if (value3 != null) {
            zBooleanValue = value3.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C36873y1 c36873y1M35411y7 = m35411y3();
        if (c36873y1M35411y7 != null && (baseTextView = c36873y1M35411y7.f81363c) != null) {
            baseTextView.setEnabled(!zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final String m35409w3() {
        String f79626c;
        C36694b c36694bM35410x3 = m35410x3();
        if (c36694bM35410x3 != null && (f79626c = c36694bM35410x3.getF79626c()) != null) {
            return f79626c;
        }
        return OrderAssetType.SelfFunds.getTypeName();
    }
}
