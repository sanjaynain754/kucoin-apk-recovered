package com.kubi.kumex.record;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.done.viewModel.DelegateRecordViewModel;
import com.kubi.kumex.record.done.viewModel.FiltersInfo;
import com.kubi.kumex.trade.CommonDecoration;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.util.C24252m0;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36736b2;
import hb0.InterfaceC38162f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.InterfaceC46192a;
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

/* JADX INFO: compiled from: DelegationRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020!H\u0002J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017*\b\u0012\u0004\u0012\u00020.0\u0017H\u0002J4\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/kumex/record/DelegationRecordFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentDelegationRecordBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentDelegationRecordBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "delegateRecordVM", "Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "getDelegateRecordVM", "()Lcom/kubi/kumex/record/done/viewModel/DelegateRecordViewModel;", "delegateRecordVM$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "lastPageEntity", "Lcom/kubi/sdk/PageEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObservers", "initView", "refresh", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "fetchPageData", "page", "", "size", "initListener", "toDisplayList", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "buildFetchParams", "", "pageEntity", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationRecordFragment.kt\ncom/kubi/kumex/record/DelegationRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n147#2,16:277\n106#3,15:293\n1563#4:308\n1634#4,3:309\n1563#4:312\n1634#4,3:313\n*S KotlinDebug\n*F\n+ 1 DelegationRecordFragment.kt\ncom/kubi/kumex/record/DelegationRecordFragment\n*L\n49#1:277,16\n61#1:293,15\n217#1:308\n217#1:309,3\n222#1:312\n222#1:313,3\n*E\n"})
public final class DelegationRecordFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f29894X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29895Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29896Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public PageEntity<Object> f29897a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f29893c0 = {Reflection.property1(new PropertyReference1Impl(DelegationRecordFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentDelegationRecordBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f29892b0 = new Companion(null);

    /* JADX INFO: compiled from: DelegationRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/DelegationRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/DelegationRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DelegationRecordFragment newInstance(@Nullable Bundle bundle) {
            DelegationRecordFragment delegationRecordFragment = new DelegationRecordFragment();
            delegationRecordFragment.setArguments(bundle);
            return delegationRecordFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.DelegationRecordFragment$a */
    /* JADX INFO: compiled from: DelegationRecordFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16533a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29898b;

        public C16533a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29898b = function;
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
            return this.f29898b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29898b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegationRecordFragment() {
        super(false, 1, null);
        final Function0 function0 = null;
        this.f29894X = C45681e.m100799e(this, new Function1<DelegationRecordFragment, C36736b2>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36736b2 invoke(@NotNull DelegationRecordFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36736b2.m82322a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36736b2, Unit>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36736b2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36736b2 c36736b2) {
                invoke(c36736b2);
                return Unit.INSTANCE;
            }
        });
        final Function0 function1 = new Function0() { // from class: com.kubi.kumex.record.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationRecordFragment.m35169D3(this.f30324b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        this.f29895Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DelegateRecordViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function0;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.record.DelegationRecordFragment$special$$inlined$viewModels$default$4
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
        this.f29896Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationRecordFragment.m35176L3(this.f30326b);
            }
        });
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: B0 */
    public void mo25620B0() {
        this.f29897a0 = null;
        super.mo25620B0();
    }

    /* JADX INFO: renamed from: F3 */
    private final DelegateRecordViewModel m35170F3() {
        return (DelegateRecordViewModel) this.f29895Y.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m35172H3(final DelegationRecordFragment delegationRecordFragment, final C36736b2 c36736b2, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        delegationRecordFragment.mo25620B0();
        BaseFragment.runOnUiThread$default(delegationRecordFragment, new Function0() { // from class: com.kubi.kumex.record.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationRecordFragment.m35173I3(this.f30339b, c36736b2);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: C3 */
    public final Map<String, String> m35181C3(int i11, int i12, PageEntity<Object> pageEntity) {
        InterfaceC46192a time;
        InterfaceC46192a time2;
        HashMap map = new HashMap();
        map.put("status", "done");
        map.put(TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getOffset()) : null)));
        map.put("trialOffset", String.valueOf(C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getTrialOffset()) : null)));
        map.put("isUseOffset", CredentialEntry.TRUE_STRING);
        map.put("currentPage", String.valueOf(i11));
        map.put("pageSize", String.valueOf(i12));
        FiltersInfo value = m35170F3().m35716p().getValue();
        map.put("start", String.valueOf((value == null || (time2 = value.getTime()) == null) ? null : Long.valueOf(time2.getF103727a())));
        FiltersInfo value2 = m35170F3().m35716p().getValue();
        map.put("end", String.valueOf((value2 == null || (time = value2.getTime()) == null) ? null : Long.valueOf(time.getF103728b())));
        FiltersInfo value3 = m35170F3().m35716p().getValue();
        String symbol = value3 != null ? value3.getSymbol() : null;
        if (!TextUtils.isEmpty(symbol)) {
            map.put("symbol", C27041f.m66668h(symbol));
        }
        FiltersInfo value4 = m35170F3().m35716p().getValue();
        String type = value4 != null ? value4.getType() : null;
        if (!TextUtils.isEmpty(type)) {
            map.put("type", C27041f.m66668h(type));
        }
        return map;
    }

    /* JADX INFO: renamed from: E3 */
    public final C36736b2 m35182E3() {
        return (C36736b2) this.f29894X.getValue(this, f29893c0[0]);
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        MultiBizType accountType;
        PageEntity<Object> pageEntity;
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        FiltersInfo value = m35170F3().m35716p().getValue();
        if (value == null || (accountType = value.getAccountType()) == null) {
            accountType = MultiBizType.CLASSIC;
        }
        PageEntity<OrderEntity> pageEntityMo4508j = multiBizFacadeManager.m20275r(accountType).mo4508j(m35181C3(i11, i12, this.f29897a0));
        if (pageEntityMo4508j == null || (pageEntity = m35177M3(pageEntityMo4508j)) == null) {
            pageEntity = new PageEntity<>(null, false, null, 0, 0, null, 33, null);
        }
        this.f29897a0 = pageEntity;
        return pageEntity;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_delegation_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m35171G3();
        m35174J3();
    }

    /* JADX INFO: renamed from: D3 */
    public static final ViewModelStoreOwner m35169D3(DelegationRecordFragment delegationRecordFragment) {
        Fragment parentFragment = delegationRecordFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return delegationRecordFragment;
    }

    /* JADX INFO: renamed from: G3 */
    private final void m35171G3() {
        final C36736b2 c36736b2M35182E3;
        FragmentActivity activity = getActivity();
        if (activity == null || (c36736b2M35182E3 = m35182E3()) == null) {
            return;
        }
        c36736b2M35182E3.f79745c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.s
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                DelegationRecordFragment.m35172H3(this.f30331b, c36736b2M35182E3, interfaceC38162f);
            }
        });
        c36736b2M35182E3.f79744b.setAdapter(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), CommonFootObject.class, CommonFootObjectProxy.class, null, null, 12, null), OrderEntity.class, DelegationRecordObjectProxy.class, null, null, 12, null).m57045a(new OrderItemCallback()));
        RecyclerView list = c36736b2M35182E3.f79744b;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36736b2M35182E3.f79744b.addItemDecoration(new CommonDecoration(0, 0, (int) C27025c.m66565c(activity, 16), (int) C27025c.m66565c(activity, 16), 3, null));
        c36736b2M35182E3.f79744b.setLayoutManager(new LinearLayoutManager(activity, 1, false));
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m35173I3(DelegationRecordFragment delegationRecordFragment, C36736b2 c36736b2) {
        if (delegationRecordFragment.getView() != null) {
            c36736b2.f79745c.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    private final void m35174J3() {
        C24252m0.m58486v(m35170F3().m35716p()).observe(getViewLifecycleOwner(), new C16533a(new Function1() { // from class: com.kubi.kumex.record.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationRecordFragment.m35175K3(this.f30335b, (FiltersInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m35175K3(DelegationRecordFragment delegationRecordFragment, FiltersInfo filtersInfo) {
        delegationRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final String m35176L3(DelegationRecordFragment delegationRecordFragment) {
        Bundle arguments = delegationRecordFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: M3 */
    private final PageEntity<Object> m35177M3(PageEntity<OrderEntity> pageEntity) {
        MultiBizType accountType;
        FiltersInfo value = m35170F3().m35716p().getValue();
        if (value == null || (accountType = value.getAccountType()) == null) {
            accountType = MultiBizType.CLASSIC;
        }
        List<OrderEntity> listM66560c = C27024b.m66560c(pageEntity.getItems());
        ArrayList<OrderEntity> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        for (OrderEntity orderEntity : listM66560c) {
            orderEntity.setMultiBizType(accountType);
            arrayList.add(orderEntity);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (OrderEntity orderEntity2 : arrayList) {
            Intrinsics.checkNotNull(orderEntity2, "null cannot be cast to non-null type kotlin.Any");
            arrayList2.add(orderEntity2);
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        if (mutableList != null && !mutableList.isEmpty() && !pageEntity.getHasNext()) {
            mutableList.add(new CommonFootObject(null, 1, null));
        }
        return new PageEntity<>(mutableList, pageEntity.getHasNext(), pageEntity.getContext(), pageEntity.getOffset(), pageEntity.getTrialOffset(), null, 32, null);
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        C36736b2 c36736b2M35182E3 = m35182E3();
        if (c36736b2M35182E3 != null) {
            return c36736b2M35182E3.f79744b;
        }
        return null;
    }

    private final void initView() {
    }
}
