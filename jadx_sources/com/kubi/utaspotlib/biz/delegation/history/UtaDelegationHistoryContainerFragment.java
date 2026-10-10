package com.kubi.utaspotlib.biz.delegation.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.core.biz.order.record.history.DelegationTradeAccount;
import com.kubi.core.biz.order.record.history.HistoryDelegationContract$Intent;
import com.kubi.core.biz.order.record.history.MixAccountHistoryDelegationVM;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660ud.FilterData;
import p827zc.AbstractC46753c;
import p827zc.C46755e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r70.C43942e;

/* JADX INFO: compiled from: UtaDelegationHistoryContainerFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0001H\u0002J\b\u0010 \u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bizVm", "Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "getBizVm", "()Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "bizVm$delegate", "Lkotlin/Lazy;", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "collectData", "Lkotlinx/coroutines/Job;", "initHistoryOrderArgs", "initFilterData", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "getClassicSpotFragment", "getUnifiedSpotFragment", "Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment;", "Companion", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaDelegationHistoryContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaDelegationHistoryContainerFragment.kt\ncom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ITradeCoreDataRepoProvider.kt\ncom/kubi/core/base/arch/repo/ITradeCoreDataRepoProviderKt\n*L\n1#1,152:1\n106#2,15:153\n1#3:168\n64#4,2:169\n*S KotlinDebug\n*F\n+ 1 UtaDelegationHistoryContainerFragment.kt\ncom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment\n*L\n34#1:153,15\n35#1:169,2\n*E\n"})
public final class UtaDelegationHistoryContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f54125W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f54126U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f54127V;

    /* JADX INFO: compiled from: UtaDelegationHistoryContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment;", "fromSymbol", "", "side", "tradeType", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final UtaDelegationHistoryContainerFragment newInstance(@Nullable String fromSymbol, @Nullable String side, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            UtaDelegationHistoryContainerFragment utaDelegationHistoryContainerFragment = new UtaDelegationHistoryContainerFragment();
            C27051h c27051hM66719c = new C27051h().m66719c("isTrade", false);
            String str = "MARGIN_TRADE";
            if (!Intrinsics.areEqual(tradeType, "MARGIN") && !Intrinsics.areEqual(tradeType, "MARGIN_TRADE")) {
                str = "TRADE";
            }
            utaDelegationHistoryContainerFragment.setArguments(c27051hM66719c.m66724h("tradeType", str).m66724h("fromSymbol", fromSymbol).m66724h("side", side).m66717a());
            return utaDelegationHistoryContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$a */
    /* JADX INFO: compiled from: ITradeCoreDataRepoProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b¸\u0006\u0000"}, m90084d2 = {"com/kubi/core/base/arch/repo/ITradeCoreDataRepoProviderKt$repoViewModelFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nITradeCoreDataRepoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITradeCoreDataRepoProvider.kt\ncom/kubi/core/base/arch/repo/ITradeCoreDataRepoProviderKt$repoViewModelFactory$1\n+ 2 UtaDelegationHistoryContainerFragment.kt\ncom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryContainerFragment\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n36#2:78\n1#3:79\n*E\n"})
    public static final class C26870a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC46753c f54128a;

        public C26870a(AbstractC46753c abstractC46753c) {
            this.f54128a = abstractC46753c;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            AbstractC46753c abstractC46753c = this.f54128a;
            MixAccountHistoryDelegationVM mixAccountHistoryDelegationVM = new MixAccountHistoryDelegationVM();
            mixAccountHistoryDelegationVM.m22243q(abstractC46753c);
            return mixAccountHistoryDelegationVM;
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final ViewModelProvider.Factory m66047o3(UtaDelegationHistoryContainerFragment utaDelegationHistoryContainerFragment) {
        return new C26870a(C46755e.m103017b(utaDelegationHistoryContainerFragment, new C43942e(utaDelegationHistoryContainerFragment.getArguments())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public final MixAccountHistoryDelegationVM m66048q3() {
        return (MixAccountHistoryDelegationVM) this.f54126U.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    private final String m66049s3() {
        return (String) this.f54127V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.uta_history_delegation_container_layout, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m66055v3();
        m66051p3();
    }

    /* JADX INFO: renamed from: r3 */
    public final BaseFragment m66052r3() {
        return ISpotCommonService.f49644a.get().mo59979w(m66049s3(), m66048q3().m22240n().getFilterData().getSymbol(), m66048q3().m22240n().getFilterData().getSide());
    }

    /* JADX INFO: renamed from: t3 */
    public final UtaDelegationHistoryFragment m66053t3() {
        return UtaDelegationHistoryFragment.f54129h0.newInstance(m66049s3());
    }

    /* JADX INFO: renamed from: v3 */
    public final void m66055v3() {
        DelegationTradeAccount delegationTradeAccount = DelegationTradeAccount.b.f20621a;
        if (!IUnifyAccountService.f53155a.get().mo64979C()) {
            delegationTradeAccount = null;
        }
        if (delegationTradeAccount == null) {
            delegationTradeAccount = DelegationTradeAccount.a.f20619a;
        }
        m66048q3().m22244r(new HistoryDelegationContract$Intent.InitRequestArgs(delegationTradeAccount, m66054u3()));
    }

    public UtaDelegationHistoryContainerFragment() {
        Function0 function0 = new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationHistoryContainerFragment.m66047o3(this.f54139b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$special$$inlined$viewModels$default$2
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
        final Function0 function2 = null;
        this.f54126U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MixAccountHistoryDelegationVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        this.f54127V = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationHistoryContainerFragment.m66050w3(this.f54140b);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public static final String m66050w3(UtaDelegationHistoryContainerFragment utaDelegationHistoryContainerFragment) {
        String string;
        Bundle arguments = utaDelegationHistoryContainerFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }

    /* JADX INFO: renamed from: p3 */
    public final InterfaceC41775x1 m66051p3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UtaDelegationHistoryContainerFragment$collectData$1(this, null));
    }

    /* JADX INFO: renamed from: u3 */
    public final FilterData m66054u3() {
        String string;
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("fromSymbol");
        } else {
            string = null;
        }
        String strM66668h = C27041f.m66668h(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("side");
        }
        return new FilterData(strM66668h, null, "THREE_MONTH", C27041f.m66668h(string2), "", "", 2, null);
    }
}
