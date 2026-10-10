package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36773h3;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p274fx.C37727a;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u00020:2\u0006\u0010;\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010<\u001a\u00020:H\u0002J\b\u0010=\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020:2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010?\u001a\u00020:H\u0002J\b\u0010@\u001a\u00020:H\u0002J\b\u0010A\u001a\u00020:H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001fj\b\u0012\u0004\u0012\u00020\u000b` X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/futures/settings/SettingRiskLimitFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentSettingRiskLimitBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentSettingRiskLimitBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "blockId", "", "marginMode", "getMarginMode", "()Ljava/lang/String;", "marginMode$delegate", "Lkotlin/Lazy;", "isTrial", "", "()Z", "isTrial$delegate", "retailFromArgs", "getRetailFromArgs", "()Ljava/lang/Boolean;", "futuresTrialViewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getFuturesTrialViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "futuresTrialViewModel$delegate", "symbol", "trialContractList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "crossFragment", "Lcom/kubi/futures/settings/CrossRiskLimitFragment;", "getCrossFragment", "()Lcom/kubi/futures/settings/CrossRiskLimitFragment;", "crossFragment$delegate", "isolatedFragment", "Lcom/kubi/futures/settings/IsolatedRiskLimitFragment;", "getIsolatedFragment", "()Lcom/kubi/futures/settings/IsolatedRiskLimitFragment;", "isolatedFragment$delegate", "retailFragment", "Lcom/kubi/futures/settings/RetailRiskLimitFragment;", "getRetailFragment", "()Lcom/kubi/futures/settings/RetailRiskLimitFragment;", "retailFragment$delegate", "isRetailUser", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "fetchAuUserCategory", "initObserver", "setSymbol", "initView", "applyRetailUi", "setupTabsForNonRetail", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingRiskLimitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingRiskLimitFragment.kt\ncom/kubi/futures/settings/SettingRiskLimitFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,316:1\n147#2,16:317\n106#3,15:333\n1#4:348\n1869#5,2:349\n*S KotlinDebug\n*F\n+ 1 SettingRiskLimitFragment.kt\ncom/kubi/futures/settings/SettingRiskLimitFragment\n*L\n49#1:317,16\n69#1:333,15\n174#1:349,2\n*E\n"})
public final class SettingRiskLimitFragment extends BaseFragment {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f23204f0 = {Reflection.property1(new PropertyReference1Impl(SettingRiskLimitFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentSettingRiskLimitBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23205U = C45681e.m100799e(this, new Function1<SettingRiskLimitFragment, C36773h3>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36773h3 invoke(@NotNull SettingRiskLimitFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36773h3.m82403a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36773h3, Unit>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36773h3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36773h3 c36773h3) {
            invoke(c36773h3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f23206V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f23207W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f23208X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23209Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f23210Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final ArrayList<String> f23211a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f23212b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f23213c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f23214d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f23215e0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.SettingRiskLimitFragment$a */
    /* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/settings/SettingRiskLimitFragment$setupTabsForNonRetail$5", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13267a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C36773h3 f23216b;

        public C13267a(C36773h3 c36773h3) {
            this.f23216b = c36773h3;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (position == 0) {
                this.f23216b.f80204d.setChecked(true);
            } else {
                this.f23216b.f80205e.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m25952Y3(String str) {
        AppCompatTextView appCompatTextView;
        this.f23210Z = str;
        C36773h3 c36773h3M25976I3 = m25976I3();
        if (c36773h3M25976I3 != null && (appCompatTextView = c36773h3M25976I3.f80208h) != null) {
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
            appCompatTextView.setText(C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, str));
        }
        for (BaseFragment baseFragment : this.f23215e0 ? CollectionsKt.arrayListOf(m25981N3()) : CollectionsKt.arrayListOf(m25977J3(), m25979L3())) {
            Bundle arguments = baseFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("symbol", str);
            arguments.putBoolean("data_1", m25939E0());
            baseFragment.setArguments(arguments);
            if (baseFragment instanceof IsolatedRiskLimitFragment) {
                ((IsolatedRiskLimitFragment) baseFragment).m25865H3(str);
            }
            if (baseFragment instanceof RetailRiskLimitFragment) {
                ((RetailRiskLimitFragment) baseFragment).m25901s3(str);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25939E0() {
        return ((Boolean) this.f23208X.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G3 */
    public static final CrossRiskLimitFragment m25942G3(SettingRiskLimitFragment settingRiskLimitFragment) {
        CrossRiskLimitFragment crossRiskLimitFragment = new CrossRiskLimitFragment();
        crossRiskLimitFragment.setArguments(BundleKt.bundleOf(new Pair("symbol", settingRiskLimitFragment.f23210Z)));
        return crossRiskLimitFragment;
    }

    /* JADX INFO: renamed from: U3 */
    public static final IsolatedRiskLimitFragment m25948U3(SettingRiskLimitFragment settingRiskLimitFragment) {
        IsolatedRiskLimitFragment isolatedRiskLimitFragment = new IsolatedRiskLimitFragment();
        isolatedRiskLimitFragment.setArguments(BundleKt.bundleOf(new Pair("symbol", settingRiskLimitFragment.f23210Z), new Pair("data_1", Boolean.valueOf(settingRiskLimitFragment.m25939E0()))));
        return isolatedRiskLimitFragment;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m25950W3(String str, SettingRiskLimitFragment settingRiskLimitFragment, String requestKey, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Intrinsics.areEqual(str, requestKey) && (string = bundle.getString("symbol")) != null) {
            settingRiskLimitFragment.m25952Y3(string);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final RetailRiskLimitFragment m25951X3(SettingRiskLimitFragment settingRiskLimitFragment) {
        RetailRiskLimitFragment retailRiskLimitFragment = new RetailRiskLimitFragment();
        retailRiskLimitFragment.setArguments(BundleKt.bundleOf(new Pair("symbol", settingRiskLimitFragment.f23210Z), new Pair("data_1", Boolean.valueOf(settingRiskLimitFragment.m25939E0()))));
        return retailRiskLimitFragment;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m25955c4(C36773h3 c36773h3, SettingRiskLimitFragment settingRiskLimitFragment, CompoundButton compoundButton, boolean z11) {
        c36773h3.f80204d.setTextColor(settingRiskLimitFragment.getColorRes(z11 ? R$color.c_text : R$color.c_text60));
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m25956d4(C36773h3 c36773h3, SettingRiskLimitFragment settingRiskLimitFragment, CompoundButton compoundButton, boolean z11) {
        c36773h3.f80205e.setTextColor(settingRiskLimitFragment.getColorRes(z11 ? R$color.c_text : R$color.c_text60));
    }

    /* JADX INFO: renamed from: I3 */
    public final C36773h3 m25976I3() {
        return (C36773h3) this.f23205U.getValue(this, f23204f0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final CrossRiskLimitFragment m25977J3() {
        return (CrossRiskLimitFragment) this.f23212b0.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final FuturesTrialViewModel m25978K3() {
        return (FuturesTrialViewModel) this.f23209Y.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public final IsolatedRiskLimitFragment m25979L3() {
        return (IsolatedRiskLimitFragment) this.f23213c0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final String m25980M3() {
        return (String) this.f23207W.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final RetailRiskLimitFragment m25981N3() {
        return (RetailRiskLimitFragment) this.f23214d0.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_setting_risk_limit, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AuUserCategoryVO f101778e = RepositoryServiceLocator.f19236a.m20290i().getF101778e();
        Boolean boolM25982O3 = m25982O3();
        if (boolM25982O3 != null) {
            zBooleanValue = boolM25982O3.booleanValue();
        } else {
            zBooleanValue = f101778e != null && f101778e.isRetail();
        }
        this.f23215e0 = zBooleanValue;
        initView();
        final String name = SearchContractDialog.class.getName();
        getChildFragmentManager().setFragmentResultListener(name, this, new FragmentResultListener() { // from class: com.kubi.futures.settings.c3
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                SettingRiskLimitFragment.m25950W3(name, this, str, bundle);
            }
        });
        m25943P3();
        if (m25939E0()) {
            FuturesTrialViewModel.m28754q(m25978K3(), 0, 0, 3, null);
        }
        if (m25982O3() == null && f101778e == null) {
            m25975H3();
        }
    }

    public SettingRiskLimitFragment() {
        setPageId(C17060n0.m36556f());
        this.f23206V = "RiskLimit";
        this.f23207W = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.r2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25949V3(this.f23435b);
            }
        });
        this.f23208X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.y2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SettingRiskLimitFragment.m25947T3(this.f23581b));
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewModels$default$2
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
        this.f23209Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesTrialViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.SettingRiskLimitFragment$special$$inlined$viewModels$default$5
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
        this.f23210Z = C46527h0.f104291a.m102677L();
        this.f23211a0 = new ArrayList<>();
        this.f23212b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.z2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25942G3(this.f23589b);
            }
        });
        this.f23213c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.a3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25948U3(this.f23282b);
            }
        });
        this.f23214d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.b3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25951X3(this.f23290b);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final Fragment m25938D3(SettingRiskLimitFragment settingRiskLimitFragment, int i11) {
        return settingRiskLimitFragment.m25981N3();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Fragment m25940E3(SettingRiskLimitFragment settingRiskLimitFragment, int i11) {
        return settingRiskLimitFragment.m25977J3();
    }

    /* JADX INFO: renamed from: F3 */
    public static final Fragment m25941F3(SettingRiskLimitFragment settingRiskLimitFragment, int i11) {
        return settingRiskLimitFragment.m25979L3();
    }

    /* JADX INFO: renamed from: P3 */
    private final void m25943P3() {
        m25978K3().m28769v().observe(getViewLifecycleOwner(), new C13396j3.a(new Function1() { // from class: com.kubi.futures.settings.d3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRiskLimitFragment.m25944Q3(this.f23313b, (FuturesWelfareTrialEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m25944Q3(SettingRiskLimitFragment settingRiskLimitFragment, FuturesWelfareTrialEntity futuresWelfareTrialEntity) {
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        List<String> contractList;
        List<FuturesWelfareTrialItemEntity> items = futuresWelfareTrialEntity.getItems();
        if (items != null && (futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) CollectionsKt.firstOrNull((List) items)) != null && (contractList = futuresWelfareTrialItemEntity.getContractList()) != null) {
            settingRiskLimitFragment.f23211a0.addAll(contractList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m25945R3(SettingRiskLimitFragment settingRiskLimitFragment, View view) {
        FragmentActivity activity = settingRiskLimitFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m25946S3(SettingRiskLimitFragment settingRiskLimitFragment) {
        C43852m.m96591c(C17060n0.m36556f(), settingRiskLimitFragment.f23206V, "3", null, 8, null);
        SearchContractDialog searchContractDialogNewInstance = SearchContractDialog.f23190u0.newInstance(settingRiskLimitFragment.f23210Z, settingRiskLimitFragment.f23211a0);
        FragmentManager childFragmentManager = settingRiskLimitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        searchContractDialogNewInstance.show(childFragmentManager, "SearchContractDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final boolean m25947T3(SettingRiskLimitFragment settingRiskLimitFragment) {
        Boolean boolValueOf;
        Bundle arguments = settingRiskLimitFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: V3 */
    public static final String m25949V3(SettingRiskLimitFragment settingRiskLimitFragment) {
        Bundle arguments = settingRiskLimitFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m25953a4(SettingRiskLimitFragment settingRiskLimitFragment, C36773h3 c36773h3) {
        C43852m.m96591c(C17060n0.m36556f(), settingRiskLimitFragment.f23206V, "5", null, 8, null);
        c36773h3.f80210j.setCurrentItem(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m25954b4(SettingRiskLimitFragment settingRiskLimitFragment, C36773h3 c36773h3) {
        C43852m.m96591c(C17060n0.m36556f(), settingRiskLimitFragment.f23206V, "4", null, 8, null);
        c36773h3.f80210j.setCurrentItem(1);
        return Unit.INSTANCE;
    }

    private final void initView() {
        C36773h3 c36773h3M25976I3 = m25976I3();
        if (c36773h3M25976I3 == null) {
            return;
        }
        AppCompatTextView appCompatTextView = c36773h3M25976I3.f80208h;
        C27096v0 c27096v0M24440e = null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), this.f23210Z, false, 2, null);
        if (contractEntityM99529O != null) {
            c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O);
        }
        appCompatTextView.setText(C27041f.m66667g(c27096v0M24440e, this.f23210Z));
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        if (brokerConfig.m20201d().mo4515x() == MultiBizType.UNIFIED) {
            BaseTextView title = c36773h3M25976I3.f80209i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            ViewExtKt.m66577h(title);
            LinearLayout llSymbol = c36773h3M25976I3.f80203c;
            Intrinsics.checkNotNullExpressionValue(llSymbol, "llSymbol");
            ViewExtKt.m66577h(llSymbol);
            BaseTextView contractsLabel = c36773h3M25976I3.f80202b;
            Intrinsics.checkNotNullExpressionValue(contractsLabel, "contractsLabel");
            ViewExtKt.m66577h(contractsLabel);
        }
        if (!brokerConfig.m20201d().mo20224E0()) {
            AppCompatImageView symbolIv = c36773h3M25976I3.f80207g;
            Intrinsics.checkNotNullExpressionValue(symbolIv, "symbolIv");
            C27046k.m66700o(symbolIv);
            c36773h3M25976I3.f80203c.setEnabled(false);
        } else {
            AppCompatImageView symbolIv2 = c36773h3M25976I3.f80207g;
            Intrinsics.checkNotNullExpressionValue(symbolIv2, "symbolIv");
            C27046k.m66685H(symbolIv2);
            c36773h3M25976I3.f80203c.setEnabled(true);
        }
        getTitleBar().setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.futures.settings.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRiskLimitFragment.m25945R3(this.f23443b, view);
            }
        });
        LinearLayout llSymbol2 = c36773h3M25976I3.f80203c;
        Intrinsics.checkNotNullExpressionValue(llSymbol2, "llSymbol");
        C27046k.m66711z(llSymbol2, 0L, new Function0() { // from class: com.kubi.futures.settings.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25946S3(this.f23455b);
            }
        }, 1, null);
        m25974C3();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m25974C3() {
        C36773h3 c36773h3M25976I3 = m25976I3();
        if (c36773h3M25976I3 == null) {
            return;
        }
        IsolatedRiskLimitFragment isolatedRiskLimitFragmentM25979L3 = m25979L3();
        Bundle arguments = m25979L3().getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("symbol", this.f23210Z);
        arguments.putBoolean("data_1", m25939E0());
        isolatedRiskLimitFragmentM25979L3.setArguments(arguments);
        RetailRiskLimitFragment retailRiskLimitFragmentM25981N3 = m25981N3();
        Bundle arguments2 = m25981N3().getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putString("symbol", this.f23210Z);
        arguments2.putBoolean("data_1", m25939E0());
        retailRiskLimitFragmentM25981N3.setArguments(arguments2);
        if (this.f23215e0) {
            c36773h3M25976I3.f80202b.setTextColor(getColorRes(R$color.c_text60));
            RadioGroup rgp = c36773h3M25976I3.f80206f;
            Intrinsics.checkNotNullExpressionValue(rgp, "rgp");
            C27046k.m66700o(rgp);
            c36773h3M25976I3.f80210j.setUserInputEnabled(false);
            ViewPager2 viewPager2 = c36773h3M25976I3.f80210j;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle).m85027g(new Function1() { // from class: com.kubi.futures.settings.e3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SettingRiskLimitFragment.m25938D3(this.f23323b, ((Integer) obj).intValue());
                }
            }));
            c36773h3M25976I3.f80210j.setCurrentItem(0, false);
            return;
        }
        c36773h3M25976I3.f80202b.setTextColor(getColorRes(R$color.c_text));
        RadioGroup rgp2 = c36773h3M25976I3.f80206f;
        Intrinsics.checkNotNullExpressionValue(rgp2, "rgp");
        C27046k.m66685H(rgp2);
        c36773h3M25976I3.f80210j.setUserInputEnabled(true);
        ViewPager2 viewPager3 = c36773h3M25976I3.f80210j;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        viewPager3.setAdapter(new C37727a(childFragmentManager2, lifecycle2).m85027g(new Function1() { // from class: com.kubi.futures.settings.f3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRiskLimitFragment.m25940E3(this.f23333b, ((Integer) obj).intValue());
            }
        }).m85027g(new Function1() { // from class: com.kubi.futures.settings.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingRiskLimitFragment.m25941F3(this.f23341b, ((Integer) obj).intValue());
            }
        }));
        m25983Z3();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m25975H3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SettingRiskLimitFragment$fetchAuUserCategory$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: O3 */
    public final Boolean m25982O3() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.containsKey("data_2")) {
                arguments = null;
            }
            if (arguments != null) {
                return Boolean.valueOf(arguments.getBoolean("data_2"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m25983Z3() {
        final C36773h3 c36773h3M25976I3 = m25976I3();
        if (c36773h3M25976I3 == null) {
            return;
        }
        RadioButton rbCross = c36773h3M25976I3.f80204d;
        Intrinsics.checkNotNullExpressionValue(rbCross, "rbCross");
        C27046k.m66711z(rbCross, 0L, new Function0() { // from class: com.kubi.futures.settings.u2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25953a4(this.f23463b, c36773h3M25976I3);
            }
        }, 1, null);
        RadioButton rbIsolated = c36773h3M25976I3.f80205e;
        Intrinsics.checkNotNullExpressionValue(rbIsolated, "rbIsolated");
        C27046k.m66711z(rbIsolated, 0L, new Function0() { // from class: com.kubi.futures.settings.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingRiskLimitFragment.m25954b4(this.f23472b, c36773h3M25976I3);
            }
        }, 1, null);
        c36773h3M25976I3.f80204d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.futures.settings.w2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingRiskLimitFragment.m25955c4(c36773h3M25976I3, this, compoundButton, z11);
            }
        });
        c36773h3M25976I3.f80205e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.futures.settings.x2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingRiskLimitFragment.m25956d4(c36773h3M25976I3, this, compoundButton, z11);
            }
        });
        c36773h3M25976I3.f80210j.registerOnPageChangeCallback(new C13267a(c36773h3M25976I3));
        if (Intrinsics.areEqual(m25980M3(), "CROSS")) {
            c36773h3M25976I3.f80204d.performClick();
        } else {
            c36773h3M25976I3.f80205e.performClick();
        }
    }
}
