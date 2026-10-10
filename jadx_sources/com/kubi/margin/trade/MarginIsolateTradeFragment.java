package com.kubi.margin.trade;

import af.C0296a;
import android.annotation.SuppressLint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.delegation.MarginTradeOpenOrdersFragment;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.entity.MarginPermission;
import com.kubi.margin.trade.position.MarginIsolatedPositionFragment;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36947x;
import p318hp.C38236a;
import p318hp.C38274t;
import p402kf.C41014a;
import p429lf.C42180b;
import p603rp.AbstractC44151k0;
import p603rp.C44155m0;
import p698vp.C45612b;
import p698vp.C45618h;
import p757xd.InterfaceC46140b;
import p768xo.InterfaceC46305f;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MarginIsolateTradeFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000eJ\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R#\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/margin/trade/MarginIsolateTradeFragment;", "Lcom/kubi/margin/trade/BaseMarginFragment;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "positionFragment", "Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "tradeType", "", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onChildRefresh", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onPositionGet", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "getMenuItemsProvider", "Lcom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider;", "updatePositionTitle", "positionCount", "checkIsBuyLong", "", "()Ljava/lang/Boolean;", "getLayout", "getTrackPageId", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"SetTextI18n"})
@SourceDebugExtension({"SMAP\nMarginIsolateTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginIsolateTradeFragment.kt\ncom/kubi/margin/trade/MarginIsolateTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,153:1\n147#2,16:154\n17#3,2:170\n135#4,2:172\n126#4,2:174\n*S KotlinDebug\n*F\n+ 1 MarginIsolateTradeFragment.kt\ncom/kubi/margin/trade/MarginIsolateTradeFragment\n*L\n43#1:154,16\n77#1:170,2\n87#1:172,2\n92#1:174,2\n*E\n"})
public final class MarginIsolateTradeFragment extends BaseMarginFragment {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f33692s0 = {Reflection.property1(new PropertyReference1Impl(MarginIsolateTradeFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f33693q0 = C45681e.m100799e(this, new Function1<MarginIsolateTradeFragment, C36947x>() { // from class: com.kubi.margin.trade.MarginIsolateTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36947x invoke(@NotNull MarginIsolateTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36947x.m82763a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36947x, Unit>() { // from class: com.kubi.margin.trade.MarginIsolateTradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36947x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36947x c36947x) {
            invoke(c36947x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final MarginIsolatedPositionFragment f33694r0;

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: A0 */
    public int mo39705A0() {
        return 2;
    }

    /* JADX INFO: renamed from: q7 */
    public static final void m39901q7(MarginIsolateTradeFragment marginIsolateTradeFragment) {
        C38236a.f85935a.m86316a(marginIsolateTradeFragment);
    }

    /* JADX INFO: renamed from: r7 */
    public static final Unit m39902r7(MarginIsolateTradeFragment marginIsolateTradeFragment, MarginPermission marginPermission) {
        C46392a.m102328k(C45618h.f102740a.m100719g(), true);
        if (!C27025c.m66566d(marginPermission.getAllowed())) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(C27041f.m66668h(marginPermission.getMsg())).m54163T4(marginIsolateTradeFragment.getString(R$string.i_already_know), null);
            FragmentManager childFragmentManager = marginIsolateTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54163T4.show(childFragmentManager, "isolated_permission");
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    @NotNull
    /* JADX INFO: renamed from: D5 */
    public AbstractC44151k0 mo39711D5() {
        return new C44155m0(this, m39713F5(), getDestroyDisposable(), getF33649W(), m39709C5());
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    @NotNull
    /* JADX INFO: renamed from: E5 */
    public C27103z mo39712E5() {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(MarginTradeOpenOrdersFragment.f32835Y.newInstance(mo39705A0()), this.f33694r0);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.todo_delegation));
        arrayList.add(getString(R$string.margin_asset_manage));
        Unit unit = Unit.INSTANCE;
        return new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @Nullable
    /* JADX INFO: renamed from: O2 */
    public Boolean mo39906O2() {
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        String code = mo39722N().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        MarginPosition marginPositionM39874T0 = marginConfigManager.m39874T0(code);
        if (marginPositionM39874T0 != null) {
            return marginPositionM39874T0.isShowDirection();
        }
        return null;
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public String mo39907P0() {
        return "B4tradingIsolated";
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    /* JADX INFO: renamed from: S5 */
    public void mo39730S5() {
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        String code = mo39722N().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        MarginPosition marginPositionM39874T0 = marginConfigManager.m39874T0(code);
        if (marginPositionM39874T0 != null) {
            MarginSubmitFragment marginSubmitFragmentM39713F5 = m39713F5();
            BigDecimal userLeverage = marginPositionM39874T0.getUserLeverage();
            if (userLeverage == null) {
                userLeverage = new BigDecimal(5);
            }
            MarginSubmitFragment.H4(marginSubmitFragmentM39713F5, userLeverage, false, 2, (Object) null);
            this.f33694r0.m40500F4();
        }
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_margin_trade;
    }

    @Nullable
    /* JADX INFO: renamed from: y5 */
    public final C36947x m39909y5() {
        return (C36947x) this.f33693q0.getValue(this, f33692s0[0]);
    }

    public MarginIsolateTradeFragment() {
        setPageId("B4tradingIsolated");
        this.f33694r0 = new MarginIsolatedPositionFragment();
    }

    /* JADX INFO: renamed from: s7 */
    public static final void m39903s7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t7 */
    public static final Unit m39904t7(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u7 */
    public static final void m39905u7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    /* JADX INFO: renamed from: R5 */
    public void mo39729R5() {
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        ImageView f104635k;
        C36947x c36947xM39909y5 = m39909y5();
        if (c36947xM39909y5 != null && (symbolBarLayout = c36947xM39909y5.f82040m) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104635k = f20880b.getF104635k()) != null) {
            f104635k.post(new Runnable() { // from class: com.kubi.margin.trade.b5
                @Override // java.lang.Runnable
                public final void run() {
                    MarginIsolateTradeFragment.m39901q7(this.f33724b);
                }
            });
        }
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        C38274t.f85990a.m86367y(this);
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        boolean zMo102977a;
        final MarginIsolateTradeFragment marginIsolateTradeFragment;
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        TextView f104632h;
        C36947x c36947xM39909y5;
        SymbolBarLayout symbolBarLayout2;
        InterfaceC46140b f20880b2;
        TextView f104632h2;
        super.onShow();
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo102977a = ((InterfaceC46815o0) objM56186h).mo102977a();
        } else {
            zMo102977a = false;
        }
        if (!zMo102977a) {
            MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
            String symbol = getF33649W().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = marginConfigManager.m39872S0(symbol);
            if (isolateMarginPositionConfigM39872S0 != null && (c36947xM39909y5 = m39909y5()) != null && (symbolBarLayout2 = c36947xM39909y5.f82040m) != null && (f20880b2 = symbolBarLayout2.getF20880b()) != null && (f104632h2 = f20880b2.getF104632h()) != null) {
                f104632h2.setText(C42180b.m92640e(C41014a.m89921F(isolateMarginPositionConfigM39872S0.getMaxLeverage(), "10"), null, 4, false, false, false, 0, null, 125, null) + 'x');
            }
        }
        C36947x c36947xM39909y6 = m39909y5();
        if (c36947xM39909y6 != null && (symbolBarLayout = c36947xM39909y6.f82040m) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104632h = f20880b.getF104632h()) != null) {
            C0296a.m1042d(f104632h, !zMo102977a);
        }
        mo39729R5();
        if (C42579a.f94275a.m93347g().c() && !C46392a.m102322d(C45618h.f102740a.m100719g(), false)) {
            Observable observableCompose = InterfaceC46305f.m102063D(MarginConfigManager.f33681a.m39876V0(), null, 1, null).compose(C24217a1.m58389m());
            marginIsolateTradeFragment = this;
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.x4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginIsolateTradeFragment.m39902r7(this.f34208b, (MarginPermission) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.y4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginIsolateTradeFragment.m39903s7(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.z4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginIsolateTradeFragment.m39904t7((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.a5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginIsolateTradeFragment.m39905u7(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, marginIsolateTradeFragment.getDestroyDisposable());
        } else {
            marginIsolateTradeFragment = this;
        }
        String symbol2 = marginIsolateTradeFragment.getF33649W().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        C45612b.m100698d(symbol2);
    }

    /* JADX INFO: renamed from: v7 */
    public final void m39908v7(int i11) {
        PagerAdapter adapter;
        String string;
        String string2;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        C36947x c36947xM39909y5 = m39909y5();
        if (c36947xM39909y5 != null && (customViewPager = c36947xM39909y5.f82037j) != null) {
            adapter = customViewPager.getAdapter();
        } else {
            adapter = null;
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.utils.InnerPagerAdapter");
        C27103z c27103z = (C27103z) adapter;
        if (!C42579a.f94275a.m93347g().c()) {
            string2 = getString(R$string.margin_asset_manage);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.margin_asset_manage));
            if (i11 > 99) {
                string = "(99+)";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('(');
                sb3.append(i11);
                sb3.append(')');
                string = sb3.toString();
            }
            sb2.append(string);
            string2 = sb2.toString();
        }
        Intrinsics.checkNotNull(string2);
        if (c27103z.m66939a().size() > 1) {
            List<CharSequence> listM66939a = c27103z.m66939a();
            Intrinsics.checkNotNull(listM66939a, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.CharSequence>");
            TypeIntrinsics.asMutableList(listM66939a).set(1, string2);
        }
        C36947x c36947xM39909y6 = m39909y5();
        if (c36947xM39909y6 != null && (slidingTabLayout = c36947xM39909y6.f82029b) != null) {
            slidingTabLayout.m55291w();
        }
    }
}
