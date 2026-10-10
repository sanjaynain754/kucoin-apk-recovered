package com.kubi.unify.funds;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24252m0;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import i60.InterfaceC38459b;
import java.util.List;
import l60.C42108c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: UnifyFundsInfoFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\u001c\u0010'\u001a\u00020#2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)H\u0016J\b\u0010+\u001a\u00020#H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyFundsInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/unify/api/ICurrentSymbolChanged;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyFundsInfoBinding;", "getBinding", "()Lcom/kubi/unify/databinding/FragmentUnifyFundsInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/unify/funds/UnifyFundsInfoViewModel;", "getVm", "()Lcom/kubi/unify/funds/UnifyFundsInfoViewModel;", "vm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/unify/funds/UnifyFundsInfoAdapter;", "getAdapter", "()Lcom/kubi/unify/funds/UnifyFundsInfoAdapter;", "emptyView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getEmptyView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "emptyView$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCurrentSymbolChanged", "pair", "Lkotlin/Pair;", "", "initSymbolPair", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyFundsInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyFundsInfoFragment.kt\ncom/kubi/unify/funds/UnifyFundsInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n147#2,16:118\n106#3,15:134\n1#4:149\n*S KotlinDebug\n*F\n+ 1 UnifyFundsInfoFragment.kt\ncom/kubi/unify/funds/UnifyFundsInfoFragment\n*L\n30#1:118,16\n31#1:134,15\n*E\n"})
public final class UnifyFundsInfoFragment extends BaseFragment implements InterfaceC38459b {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f53189U = C45681e.m100799e(this, new Function1<UnifyFundsInfoFragment, C42108c>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42108c invoke(@NotNull UnifyFundsInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42108c.m92371a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42108c, Unit>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42108c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42108c c42108c) {
            invoke(c42108c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53190V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final UnifyFundsInfoAdapter f53191W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f53192X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f53188Z = {Reflection.property1(new PropertyReference1Impl(UnifyFundsInfoFragment.class, "binding", "getBinding()Lcom/kubi/unify/databinding/FragmentUnifyFundsInfoBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f53187Y = new Companion(null);

    /* JADX INFO: compiled from: UnifyFundsInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyFundsInfoFragment$Companion;", "", "<init>", "()V", "BASE_CURRENCY", "", "QUOTE_CURRENCY", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.funds.UnifyFundsInfoFragment$a */
    /* JADX INFO: compiled from: UnifyFundsInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26527a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f53193b;

        public C26527a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53193b = function;
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
            return this.f53193b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53193b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final WrapperLoadingView m65175o3(UnifyFundsInfoFragment unifyFundsInfoFragment) {
        return new WrapperLoadingView(unifyFundsInfoFragment.requireContext(), new View(unifyFundsInfoFragment.requireContext()));
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m65176t3(final UnifyFundsInfoFragment unifyFundsInfoFragment, List list) {
        if (list != null) {
            unifyFundsInfoFragment.f53191W.replaceData(list);
            if (unifyFundsInfoFragment.f53191W.getData().isEmpty()) {
                ViewExtKt.m66594y(unifyFundsInfoFragment.m65181q3());
                unifyFundsInfoFragment.m65181q3().showEmpty(R$string.common_no_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            } else {
                ViewExtKt.m66577h(unifyFundsInfoFragment.m65181q3());
                unifyFundsInfoFragment.m65181q3().showContent();
            }
        } else {
            ViewExtKt.m66594y(unifyFundsInfoFragment.m65181q3());
            unifyFundsInfoFragment.m65181q3().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.unify.funds.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnifyFundsInfoFragment.m65177u3(this.f53200b, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m65178v3(UnifyAccountRiskRatioView unifyAccountRiskRatioView, UnifyFundsInfoFragment unifyFundsInfoFragment, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        if (unifyAccountOverviewEntity != null) {
            FragmentManager childFragmentManager = unifyFundsInfoFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            unifyAccountRiskRatioView.m65078k(unifyAccountOverviewEntity, childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    @Override // i60.InterfaceC38459b
    /* JADX INFO: renamed from: B2 */
    public void mo21309B2(@NotNull Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        m65182r3().m65210y(pair);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_unify_funds_info, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42108c c42108cM65180p3 = m65180p3();
        if (c42108cM65180p3 != null && (recyclerView = c42108cM65180p3.f93472b) != null) {
            recyclerView.setAdapter(this.f53191W);
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UnifyHideSmallView unifyHideSmallView = new UnifyHideSmallView(context);
        unifyHideSmallView.m65194f(this, m65182r3());
        this.f53191W.addHeaderView(unifyHideSmallView);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        final UnifyAccountRiskRatioView unifyAccountRiskRatioView = new UnifyAccountRiskRatioView(context2);
        this.f53191W.addHeaderView(unifyAccountRiskRatioView);
        this.f53191W.addFooterView(m65181q3());
        m65181q3().showLoading();
        C24252m0.m58486v(m65182r3().m65206r()).observe(getViewLifecycleOwner(), new C26527a(new Function1() { // from class: com.kubi.unify.funds.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoFragment.m65176t3(this.f53289b, (List) obj);
            }
        }));
        m65182r3().m65202n().observe(getViewLifecycleOwner(), new C26527a(new Function1() { // from class: com.kubi.unify.funds.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoFragment.m65178v3(unifyAccountRiskRatioView, this, (UnifyAccountOverviewEntity) obj);
            }
        }));
        m65182r3().m65203o().observe(getViewLifecycleOwner(), new C26527a(new Function1() { // from class: com.kubi.unify.funds.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoFragment.m65179w3(this.f53294b, (List) obj);
            }
        }));
        m65183s3();
    }

    /* JADX INFO: renamed from: p3 */
    public final C42108c m65180p3() {
        return (C42108c) this.f53189U.getValue(this, f53188Z[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public final WrapperLoadingView m65181q3() {
        return (WrapperLoadingView) this.f53192X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public final UnifyFundsInfoViewModel m65182r3() {
        return (UnifyFundsInfoViewModel) this.f53190V.getValue();
    }

    public UnifyFundsInfoFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewModels$default$2
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
        this.f53190V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnifyFundsInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.unify.funds.UnifyFundsInfoFragment$special$$inlined$viewModels$default$5
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
        this.f53191W = new UnifyFundsInfoAdapter(this);
        this.f53192X = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.funds.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoFragment.m65175o3(this.f53286b);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m65177u3(UnifyFundsInfoFragment unifyFundsInfoFragment, View view) {
        unifyFundsInfoFragment.m65181q3().showLoading();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m65179w3(UnifyFundsInfoFragment unifyFundsInfoFragment, List list) {
        unifyFundsInfoFragment.m65182r3().m65209u();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m65182r3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        m65182r3().onShow();
    }

    /* JADX INFO: renamed from: s3 */
    public final void m65183s3() {
        String string;
        Bundle arguments;
        String string2;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("BASE_CURRENCY")) != null && (arguments = getArguments()) != null && (string2 = arguments.getString("QUOTE_CURRENCY")) != null) {
            m65182r3().m65210y(new Pair<>(string, string2));
        }
    }
}
