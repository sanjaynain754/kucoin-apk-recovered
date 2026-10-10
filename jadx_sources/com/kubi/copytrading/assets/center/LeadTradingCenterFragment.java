package com.kubi.copytrading.assets.center;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.CopyTradingViewModel;
import com.kubi.copytrading.assets.LeaderTraderAccountInfoEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p532pc.C43435d;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: LeadTradingCenterFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\b\u0010 \u001a\u00020\u001bH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/copytrading/assets/center/LeadTradingCenterFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/copytrading/databinding/FragmentCprdLeadCenterBinding;", "getBinding", "()Lcom/kubi/copytrading/databinding/FragmentCprdLeadCenterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "getViewModel", "()Lcom/kubi/copytrading/assets/CopyTradingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getLayout", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindView", "leader", "Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeadTradingCenterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeadTradingCenterFragment.kt\ncom/kubi/copytrading/assets/center/LeadTradingCenterFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n147#2,16:120\n106#3,15:136\n1#4:151\n*S KotlinDebug\n*F\n+ 1 LeadTradingCenterFragment.kt\ncom/kubi/copytrading/assets/center/LeadTradingCenterFragment\n*L\n34#1:120,16\n35#1:136,15\n*E\n"})
public final class LeadTradingCenterFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f19817W = {Reflection.property1(new PropertyReference1Impl(LeadTradingCenterFragment.class, "binding", "getBinding()Lcom/kubi/copytrading/databinding/FragmentCprdLeadCenterBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f19818U = C45681e.m100799e(this, new Function1<LeadTradingCenterFragment, C43435d>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43435d invoke(@NotNull LeadTradingCenterFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43435d.m95631a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43435d, Unit>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43435d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43435d c43435d) {
            invoke(c43435d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f19819V;

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$a */
    /* JADX INFO: compiled from: LeadTradingCenterFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11451a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f19820b;

        public C11451a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f19820b = function;
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
            return this.f19820b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19820b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m20676t3(LeadTradingCenterFragment leadTradingCenterFragment, View view) {
        BaseFragment.showLoadingView$default(leadTradingCenterFragment, 0, 0, 3, null);
        leadTradingCenterFragment.m20679q3().m20652s();
    }

    private final int getLayout() {
        return R$layout.fragment_cprd_lead_center;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m20673o3() {
        CopyTradingConfig.f19710a.m20588B("myLeading");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m20674r3(LeadTradingCenterFragment leadTradingCenterFragment, LeaderTraderAccountInfoEntity leaderTraderAccountInfoEntity) {
        if (leaderTraderAccountInfoEntity != null) {
            leadTradingCenterFragment.m20677n3(leaderTraderAccountInfoEntity);
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n3 */
    public final void m20677n3(LeaderTraderAccountInfoEntity leaderTraderAccountInfoEntity) {
        String str;
        int i11;
        int i12;
        String strM92640e;
        showContentView();
        C43435d c43435dM20678p3 = m20678p3();
        if (c43435dM20678p3 != null) {
            String noNullCurrency = leaderTraderAccountInfoEntity.getNoNullCurrency();
            int iMo15349o = IAssetsCenterService.f16464a.get().mo15349o(noNullCurrency);
            c43435dM20678p3.f95906h.setText(getString(R$string.copytd_total_pnl, noNullCurrency));
            c43435dM20678p3.f95904f.setText(getString(R$string.copytd_today_pnl, noNullCurrency));
            c43435dM20678p3.f95910l.setText(getString(R$string.copytd_total_unpnl, noNullCurrency));
            c43435dM20678p3.f95908j.setText(getString(R$string.copytd_total_profit, noNullCurrency));
            c43435dM20678p3.f95912n.setText(getString(R$string.copytd_un_profit_share, noNullCurrency));
            c43435dM20678p3.f95902d.setText(getString(R$string.cprd_current_lead_size, "USDT"));
            KcPrimaryButton btnScanLeading = c43435dM20678p3.f95900b;
            Intrinsics.checkNotNullExpressionValue(btnScanLeading, "btnScanLeading");
            C27046k.m66711z(btnScanLeading, 0L, new Function0() { // from class: com.kubi.copytrading.assets.center.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeadTradingCenterFragment.m20673o3();
                }
            }, 1, null);
            BaseTextView baseTextView = c43435dM20678p3.f95907i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27039d.m66644d(leaderTraderAccountInfoEntity.getTotalPnl()));
            BigDecimal totalPnl = leaderTraderAccountInfoEntity.getTotalPnl();
            sb2.append(C27041f.m66669i(totalPnl != null ? C42180b.m92640e(totalPnl, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            baseTextView.setText(sb2.toString());
            BaseTextView baseTextView2 = c43435dM20678p3.f95907i;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            BigDecimal bigDecimalM89922G = C41014a.m89922G(leaderTraderAccountInfoEntity.getTotalPnl(), null, 1, null);
            int i13 = R$color.c_text;
            baseTextView2.setTextColor(C22890g.m54280e(contextRequireContext, bigDecimalM89922G, i13));
            BaseTextView baseTextView3 = c43435dM20678p3.f95911m;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            baseTextView3.setTextColor(C22890g.m54280e(contextRequireContext2, C41014a.m89922G(leaderTraderAccountInfoEntity.getUnrealizedPnl(), null, 1, null), i13));
            BaseTextView baseTextView4 = c43435dM20678p3.f95911m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C27039d.m66644d(leaderTraderAccountInfoEntity.getUnrealizedPnl()));
            BigDecimal unrealizedPnl = leaderTraderAccountInfoEntity.getUnrealizedPnl();
            if (unrealizedPnl != null) {
                str = "requireContext(...)";
                i11 = 1;
                i12 = i13;
                strM92640e = C42180b.m92640e(unrealizedPnl, null, iMo15349o, false, false, false, 2, null, 93, null);
            } else {
                str = "requireContext(...)";
                i11 = 1;
                i12 = i13;
                strM92640e = null;
            }
            sb3.append(C27041f.m66669i(strM92640e, "--"));
            baseTextView4.setText(sb3.toString());
            BaseTextView baseTextView5 = c43435dM20678p3.f95905g;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, str);
            baseTextView5.setTextColor(C22890g.m54280e(contextRequireContext3, C41014a.m89922G(leaderTraderAccountInfoEntity.getTodayPnl(), null, i11, null), i12));
            BaseTextView baseTextView6 = c43435dM20678p3.f95905g;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C27039d.m66644d(leaderTraderAccountInfoEntity.getTodayPnl()));
            BigDecimal todayPnl = leaderTraderAccountInfoEntity.getTodayPnl();
            sb4.append(C27041f.m66669i(todayPnl != null ? C42180b.m92640e(todayPnl, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            baseTextView6.setText(sb4.toString());
            BaseTextView baseTextView7 = c43435dM20678p3.f95909k;
            BigDecimal cumulativeProfitSharingAmount = leaderTraderAccountInfoEntity.getCumulativeProfitSharingAmount();
            baseTextView7.setText(C27041f.m66669i(cumulativeProfitSharingAmount != null ? C42180b.m92640e(cumulativeProfitSharingAmount, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            BaseTextView baseTextView8 = c43435dM20678p3.f95913o;
            BigDecimal unrealizedProfitSharingAmount = leaderTraderAccountInfoEntity.getUnrealizedProfitSharingAmount();
            baseTextView8.setText(C27041f.m66669i(unrealizedProfitSharingAmount != null ? C42180b.m92640e(unrealizedProfitSharingAmount, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            BaseTextView baseTextView9 = c43435dM20678p3.f95903e;
            BigDecimal aum = leaderTraderAccountInfoEntity.getAum();
            baseTextView9.setText(C27041f.m66669i(aum != null ? C42180b.m92640e(aum, null, iMo15349o, false, false, false, 2, null, 93, null) : null, "--"));
            c43435dM20678p3.f95914p.m20958b(leaderTraderAccountInfoEntity.getAvatar(), leaderTraderAccountInfoEntity.getNickName());
            c43435dM20678p3.f95915q.setText(leaderTraderAccountInfoEntity.getNickName());
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
        LoadingViewUtils.f48255a.m58509b(this);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m20679q3().m20658y().observe(getViewLifecycleOwner(), new C11451a(new Function1() { // from class: com.kubi.copytrading.assets.center.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeadTradingCenterFragment.m20674r3(this.f19821b, (LeaderTraderAccountInfoEntity) obj);
            }
        }));
        m20679q3().m20659z().observe(getViewLifecycleOwner(), new C11451a(new Function1() { // from class: com.kubi.copytrading.assets.center.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeadTradingCenterFragment.m20675s3(this.f19822b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public final C43435d m20678p3() {
        return (C43435d) this.f19818U.getValue(this, f19817W[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public final CopyTradingViewModel m20679q3() {
        return (CopyTradingViewModel) this.f19819V.getValue();
    }

    public LeadTradingCenterFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewModels$default$2
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
        this.f19819V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CopyTradingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.copytrading.assets.center.LeadTradingCenterFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: s3 */
    public static final Unit m20675s3(final LeadTradingCenterFragment leadTradingCenterFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showFailView$default(leadTradingCenterFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.copytrading.assets.center.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeadTradingCenterFragment.m20676t3(this.f19823b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m20679q3().m20652s();
    }
}
