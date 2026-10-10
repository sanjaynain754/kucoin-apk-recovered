package com.kubi.kumex.record;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36779i3;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SettlementRecordFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u000bH\u0016J\b\u0010,\u001a\u00020'H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, m90084d2 = {"Lcom/kubi/kumex/record/SettlementRecordFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "titleGroup", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "getTitleGroup", "()Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "titleGroup$delegate", "Lkotlin/Lazy;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "profitFragment", "Landroidx/fragment/app/Fragment;", "getProfitFragment", "()Landroidx/fragment/app/Fragment;", "profitFragment$delegate", "fundsFragment", "getFundsFragment", "fundsFragment$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentSettleRecordBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentSettleRecordBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getDefaultCheckedIndex", "", "onBackPressed", "initTitleBar", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettlementRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettlementRecordFragment.kt\ncom/kubi/kumex/record/SettlementRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,111:1\n143#2,20:112\n*S KotlinDebug\n*F\n+ 1 SettlementRecordFragment.kt\ncom/kubi/kumex/record/SettlementRecordFragment\n*L\n51#1:112,20\n*E\n"})
public final class SettlementRecordFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f29920Z = {Reflection.property1(new PropertyReference1Impl(SettlementRecordFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentSettleRecordBinding;", 0))};

    /* JADX INFO: renamed from: V */
    public boolean f29922V;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f29921U = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.f1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettlementRecordFragment.m35259u3(this.f30235b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29923W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.g1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettlementRecordFragment.m35258t3(this.f30288b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29924X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettlementRecordFragment.m35255m3(this.f30291b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f29925Y = C45681e.m100799e(this, new Function1<SettlementRecordFragment, C36779i3>() { // from class: com.kubi.kumex.record.SettlementRecordFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36779i3 invoke(@NotNull SettlementRecordFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36779i3.m82416a(fragment.requireView());
        }
    }, new Function1<C36779i3, Unit>() { // from class: com.kubi.kumex.record.SettlementRecordFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36779i3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36779i3 c36779i3) {
            invoke(c36779i3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.kumex.record.SettlementRecordFragment$a */
    /* JADX INFO: compiled from: SettlementRecordFragment.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/record/SettlementRecordFragment$initTitleBar$2", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16537a extends C45938b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36779i3 f29926a;

        public C16537a(C36779i3 c36779i3) {
            this.f29926a = c36779i3;
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            super.mo18273b(i11);
            this.f29926a.f80260b.setCurrentItem(i11, true);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static final FundsRecordFragment m35255m3(SettlementRecordFragment settlementRecordFragment) {
        FundsRecordFragment.Companion companion = FundsRecordFragment.f29899h0;
        Bundle bundleRequireArguments = settlementRecordFragment.requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
        return companion.newInstance(bundleRequireArguments);
    }

    /* JADX INFO: renamed from: t3 */
    public static final ProfitRecordFragment m35258t3(SettlementRecordFragment settlementRecordFragment) {
        return ProfitRecordFragment.f29913b0.newInstance(settlementRecordFragment.requireArguments());
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF29922V() {
        return this.f29922V;
    }

    /* JADX INFO: renamed from: o3 */
    public final Fragment m35260o3() {
        return (Fragment) this.f29924X.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_settle_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m35257s3();
    }

    /* JADX INFO: renamed from: p3 */
    public final Fragment m35261p3() {
        return (Fragment) this.f29923W.getValue();
    }

    /* JADX INFO: renamed from: q3 */
    public final SlidingTabLayout m35262q3() {
        return (SlidingTabLayout) this.f29921U.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final C36779i3 m35263r3() {
        return (C36779i3) this.f29925Y.getValue(this, f29920Z[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f29922V = z11;
    }

    /* JADX INFO: renamed from: n3 */
    private final int m35256n3() {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56226Q(arguments, "type", 0));
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (iM66650j > 1) {
            return 0;
        }
        return iM66650j;
    }

    /* JADX INFO: renamed from: s3 */
    private final void m35257s3() {
        C36779i3 c36779i3M35263r3 = m35263r3();
        if (c36779i3M35263r3 == null) {
            return;
        }
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(m35261p3(), m35260o3());
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{getString(R$string.pnl_history), getString(R$string.funds_record)});
        TitleBar titleBar = getTitleBar();
        SlidingTabLayout slidingTabLayoutM35262q3 = m35262q3();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C27029c.m66603f(this, 36));
        layoutParams.gravity = 17;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        layoutParams.setMarginStart((int) C27025c.m66565c(contextRequireContext, 4));
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        layoutParams.setMarginEnd((int) C27025c.m66565c(contextRequireContext2, 4));
        Unit unit = Unit.INSTANCE;
        titleBar.m58940m(slidingTabLayoutM35262q3, layoutParams);
        m35262q3().setOnTabSelectListener(new C16537a(c36779i3M35263r3));
        RtlViewPager rtlViewPager = c36779i3M35263r3.f80260b;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, arrayListArrayListOf, listListOf));
        m35262q3().setNeedBold(true);
        m35262q3().setViewPager(c36779i3M35263r3.f80260b);
        m35262q3().m55291w();
        m35262q3().setCurrentTab(m35256n3());
    }

    /* JADX INFO: renamed from: u3 */
    public static final SlidingTabLayout m35259u3(SettlementRecordFragment settlementRecordFragment) {
        View viewInflate = LayoutInflater.from(settlementRecordFragment.getActivity()).inflate(R$layout.bkumex_title_settlement_record, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.kubi.resources.widget.flyco.SlidingTabLayout");
        return (SlidingTabLayout) viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
            return false;
        }
        return false;
    }
}
