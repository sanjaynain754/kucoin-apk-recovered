package com.kubi.otc.fiat;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37696v;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FiatHistoryListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0010H\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m90084d2 = {"Lcom/kubi/otc/fiat/FiatHistoryListFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "rechargeFragment", "Lcom/kubi/otc/fiat/FiatRechargeChildHistoryFragment;", "getRechargeFragment", "()Lcom/kubi/otc/fiat/FiatRechargeChildHistoryFragment;", "rechargeFragment$delegate", "Lkotlin/Lazy;", "withdrawFragment", "Lcom/kubi/otc/fiat/FiatWithdrawChildHistoryFragment;", "getWithdrawFragment", "()Lcom/kubi/otc/fiat/FiatWithdrawChildHistoryFragment;", "withdrawFragment$delegate", "tabIndex", "", "getTabIndex", "()Ljava/lang/Integer;", "tabIndex$delegate", "fiat", "", "getFiat", "()Ljava/lang/String;", "fiat$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeHistoryBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatHistoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatHistoryListFragment.kt\ncom/kubi/otc/fiat/FiatHistoryListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,140:1\n147#2,16:141\n*S KotlinDebug\n*F\n+ 1 FiatHistoryListFragment.kt\ncom/kubi/otc/fiat/FiatHistoryListFragment\n*L\n45#1:141,16\n*E\n"})
public final class FiatHistoryListFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37284U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatHistoryListFragment.m44022u3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37285V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatHistoryListFragment.m44024w3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37286W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatHistoryListFragment.m44023v3(this.f37293b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f37287X = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatHistoryListFragment.m44021o3(this.f37294b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f37288Y = C45681e.m100799e(this, new Function1<FiatHistoryListFragment, C37696v>() { // from class: com.kubi.otc.fiat.FiatHistoryListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37696v invoke(@NotNull FiatHistoryListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37696v.m84982a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37696v, Unit>() { // from class: com.kubi.otc.fiat.FiatHistoryListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37696v it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37696v c37696v) {
            invoke(c37696v);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f37283a0 = {Reflection.property1(new PropertyReference1Impl(FiatHistoryListFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeHistoryBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f37282Z = new Companion(null);

    /* JADX INFO: compiled from: FiatHistoryListFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/otc/fiat/FiatHistoryListFragment$Companion;", "", "<init>", "()V", "EXTRA_FIAT", "", "EXTRA_INDEX", "INDEX_RECHAGR", "", "INDEX_WITHDRAW", "startFragment", "", "fiatCurrency", "isWithdraw", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void startFragment$default(Companion companion, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bool = Boolean.FALSE;
            }
            companion.startFragment(str, bool);
        }

        public final void startFragment(@Nullable String fiatCurrency, @Nullable Boolean isWithdraw) {
            InterfaceC37758j.a.m85156e(C37304a.f82764a, C27025c.m66566d(isWithdraw) ? 1L : 0L, fiatCurrency, null, null, null, 28, null);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final FiatRechargeChildHistoryFragment m44022u3() {
        return new FiatRechargeChildHistoryFragment();
    }

    /* JADX INFO: renamed from: w3 */
    public static final FiatWithdrawChildHistoryFragment m44024w3() {
        return new FiatWithdrawChildHistoryFragment();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_history;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        RtlViewPager rtlViewPager;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.in_out_record));
        } else {
            getTitleBar().setTitle(getString(R$string.in_out_record));
        }
        C37696v c37696vM44025p3 = m44025p3();
        if (c37696vM44025p3 != null && (slidingTabLayout2 = c37696vM44025p3.f84746c) != null) {
            C37696v c37696vM44025p4 = m44025p3();
            if (c37696vM44025p4 == null || (rtlViewPager = c37696vM44025p4.f84745b) == null) {
                rtlViewPager = null;
            } else {
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                rtlViewPager.setAdapter(new C27103z(childFragmentManager, CollectionsKt.arrayListOf(m44027r3(), m44029t3()), CollectionsKt.arrayListOf(getString(R$string.fiat_charge), getString(R$string.fiat_withdrawal))));
            }
            slidingTabLayout2.setViewPager(rtlViewPager);
        }
        C37696v c37696vM44025p5 = m44025p3();
        if (c37696vM44025p5 == null || (slidingTabLayout = c37696vM44025p5.f84746c) == null) {
            return;
        }
        slidingTabLayout.setCurrentTab(C27039d.m66650j(m44028s3()));
    }

    /* JADX INFO: renamed from: p3 */
    public final C37696v m44025p3() {
        return (C37696v) this.f37288Y.getValue(this, f37283a0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: q3 */
    public final String m44026q3() {
        return (String) this.f37287X.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final FiatRechargeChildHistoryFragment m44027r3() {
        return (FiatRechargeChildHistoryFragment) this.f37284U.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final Integer m44028s3() {
        return (Integer) this.f37286W.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public final FiatWithdrawChildHistoryFragment m44029t3() {
        return (FiatWithdrawChildHistoryFragment) this.f37285V.getValue();
    }

    /* JADX INFO: renamed from: o3 */
    public static final String m44021o3(FiatHistoryListFragment fiatHistoryListFragment) {
        String strM56284y;
        Bundle arguments = fiatHistoryListFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fiat");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: v3 */
    public static final Integer m44023v3(FiatHistoryListFragment fiatHistoryListFragment) {
        Bundle arguments = fiatHistoryListFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(RouteExKt.m56262n(arguments, "index", 0));
        }
        return null;
    }
}
