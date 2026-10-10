package com.kubi.otc.otc.merchant;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27103z;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import ht.C38346y;
import i10.Menu;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37606d;
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
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: OtcManageFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u000eH\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcManageFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "upFragment", "Lcom/kubi/otc/otc/merchant/OtcManageChildFragment;", "getUpFragment", "()Lcom/kubi/otc/otc/merchant/OtcManageChildFragment;", "upFragment$delegate", "Lkotlin/Lazy;", "downFragment", "getDownFragment", "downFragment$delegate", ViewProps.POSITION, "", "getPosition", "()I", "position$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentAdManageBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentAdManageBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcManageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcManageFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,98:1\n147#2,16:99\n*S KotlinDebug\n*F\n+ 1 OtcManageFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageFragment\n*L\n43#1:99,16\n*E\n"})
public final class OtcManageFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f37695Z = {Reflection.property1(new PropertyReference1Impl(OtcManageFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentAdManageBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37696U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.e3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageFragment.m44949C3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37697V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.f3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageFragment.m44957r3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37698W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.g3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(OtcManageFragment.m44948B3(this.f37732b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37699X = C45681e.m100799e(this, new Function1<OtcManageFragment, C37606d>() { // from class: com.kubi.otc.otc.merchant.OtcManageFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37606d invoke(@NotNull OtcManageFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37606d.m84794a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37606d, Unit>() { // from class: com.kubi.otc.otc.merchant.OtcManageFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37606d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37606d c37606d) {
            invoke(c37606d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f37700Y = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.h3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageFragment.m44947A3();
        }
    });

    /* JADX INFO: renamed from: C3 */
    public static final OtcManageChildFragment m44949C3() {
        return OtcManageChildFragment.f37685e0.newInstance("PUTUP");
    }

    /* JADX INFO: renamed from: r3 */
    public static final OtcManageChildFragment m44957r3() {
        return OtcManageChildFragment.f37685e0.newInstance("PUTDOWN");
    }

    /* JADX INFO: renamed from: u3 */
    private final InterfaceC37241c m44958u3() {
        return (InterfaceC37241c) this.f37700Y.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m44960y3(final OtcManageFragment otcManageFragment, final ArrayList arrayList) throws Exception {
        if (arrayList == null || arrayList.isEmpty()) {
            ToastCompat.m66437C(R$string.pay_otc_un_available_market);
            return;
        }
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C38346y.m86538y(otcManageFragment, (String) obj, new Consumer() { // from class: com.kubi.otc.otc.merchant.j3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                OtcManageFragment.m44961z3(this.f37748b, arrayList, (ArrayList) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m44961z3(OtcManageFragment otcManageFragment, ArrayList arrayList, ArrayList arrayList2) {
        BaseFragmentActivity.m56574n0(otcManageFragment.mContext, otcManageFragment.getString(R$string.publish_ad), OtcAdPublishFragment.class.getName(), new C27051h().m66725i("legals", arrayList).m66722f("symbols", arrayList2).m66717a());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_ad_manage;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TitleBar titleBar;
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        RtlViewPager rtlViewPager2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.advertise_manage));
        } else {
            getTitleBar().setTitle(getString(R$string.advertise_manage));
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, CollectionsKt.arrayListOf(m44965w3(), m44963t3()), CollectionsKt.arrayListOf(getString(R$string.state_putaway), getString(R$string.state_not_putaway)));
        C37606d c37606dM44962s3 = m44962s3();
        if (c37606dM44962s3 != null && (rtlViewPager2 = c37606dM44962s3.f83760c) != null) {
            rtlViewPager2.setAdapter(c27103z);
        }
        C37606d c37606dM44962s4 = m44962s3();
        if (c37606dM44962s4 != null && (slidingTabLayout3 = c37606dM44962s4.f83759b) != null) {
            slidingTabLayout3.setMinimumWidth(C5267e0.m6183e());
        }
        C37606d c37606dM44962s5 = m44962s3();
        if (c37606dM44962s5 != null && (slidingTabLayout2 = c37606dM44962s5.f83759b) != null) {
            C37606d c37606dM44962s6 = m44962s3();
            slidingTabLayout2.setViewPager(c37606dM44962s6 != null ? c37606dM44962s6.f83760c : null);
        }
        C37606d c37606dM44962s7 = m44962s3();
        if (c37606dM44962s7 != null && (slidingTabLayout = c37606dM44962s7.f83759b) != null) {
            slidingTabLayout.m55291w();
        }
        C37606d c37606dM44962s8 = m44962s3();
        if (c37606dM44962s8 != null && (rtlViewPager = c37606dM44962s8.f83760c) != null) {
            rtlViewPager.setCurrentItem(RangesKt.coerceAtMost(m44964v3(), 1));
        }
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity == null || (titleBar = baseActivity.getTitleBar()) == null) {
            return;
        }
        int i11 = R$drawable.ic2_add_filled_20;
        int i12 = R$string.payment_p2p_post_new_ad;
        titleBar.setMenu(new Menu(0, Integer.valueOf(i11), Integer.valueOf(R$color.c_text), 0, Integer.valueOf(i12), 0, 14, new View.OnClickListener() { // from class: com.kubi.otc.otc.merchant.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OtcManageFragment.m44959x3(this.f37721b, view2);
            }
        }, C27040e.m66658b(6), 41, null));
    }

    /* JADX INFO: renamed from: s3 */
    public final C37606d m44962s3() {
        return (C37606d) this.f37699X.getValue(this, f37695Z[0]);
    }

    /* JADX INFO: renamed from: t3 */
    public final OtcManageChildFragment m44963t3() {
        return (OtcManageChildFragment) this.f37697V.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public final int m44964v3() {
        return ((Number) this.f37698W.getValue()).intValue();
    }

    /* JADX INFO: renamed from: w3 */
    public final OtcManageChildFragment m44965w3() {
        return (OtcManageChildFragment) this.f37696U.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final InterfaceC37241c m44947A3() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: B3 */
    public static final int m44948B3(OtcManageFragment otcManageFragment) {
        Integer numValueOf;
        Bundle arguments = otcManageFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56260m(arguments, "type"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m44959x3(final OtcManageFragment otcManageFragment, View view) {
        Disposable disposableSubscribe = otcManageFragment.m44958u3().m83338q().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.i3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OtcManageFragment.m44960y3(this.f37743b, (ArrayList) obj);
            }
        }, new C24223c1(otcManageFragment));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = otcManageFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }
}
