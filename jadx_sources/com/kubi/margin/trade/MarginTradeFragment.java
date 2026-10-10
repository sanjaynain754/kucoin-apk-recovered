package com.kubi.margin.trade;

import af.C0296a;
import android.annotation.SuppressLint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.delegation.MarginTradeOpenOrdersFragment;
import com.kubi.margin.trade.position.MarginWholePositionFragment;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36947x;
import p318hp.C38236a;
import p318hp.C38274t;
import p429lf.C42180b;
import p569qq.InterfaceC43850k;
import p603rp.AbstractC44151k0;
import p603rp.C44153l0;
import p698vp.C45612b;
import p757xd.InterfaceC46140b;
import p830zf.InterfaceC46815o0;
import p838zo.C46897a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MarginTradeFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/margin/trade/MarginTradeFragment;", "Lcom/kubi/margin/trade/BaseMarginFragment;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "positionFragment", "Lcom/kubi/margin/trade/position/MarginWholePositionFragment;", "tradeType", "", "getLayout", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onPositionGet", "", "onChildRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkIsBuyLong", "", "()Ljava/lang/Boolean;", "getMenuItemsProvider", "Lcom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider;", "onResume", "getTrackPageId", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"SetTextI18n"})
@SourceDebugExtension({"SMAP\nMarginTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTradeFragment.kt\ncom/kubi/margin/trade/MarginTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,128:1\n147#2,16:129\n17#3,2:145\n*S KotlinDebug\n*F\n+ 1 MarginTradeFragment.kt\ncom/kubi/margin/trade/MarginTradeFragment\n*L\n35#1:129,16\n74#1:145,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_lever")
public final class MarginTradeFragment extends BaseMarginFragment {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f33695s0 = {Reflection.property1(new PropertyReference1Impl(MarginTradeFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarginTradeBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f33696q0 = C45681e.m100799e(this, new Function1<MarginTradeFragment, C36947x>() { // from class: com.kubi.margin.trade.MarginTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36947x invoke(@NotNull MarginTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36947x.m82763a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36947x, Unit>() { // from class: com.kubi.margin.trade.MarginTradeFragment$special$$inlined$viewBindingFragment$1
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
    public final MarginWholePositionFragment f33697r0;

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.margin.trade.IMarginBehavior
    /* JADX INFO: renamed from: A0 */
    public int mo39705A0() {
        return 1;
    }

    /* JADX INFO: renamed from: m7 */
    public static final void m39911m7(MarginTradeFragment marginTradeFragment) {
        C38236a.f85935a.m86316a(marginTradeFragment);
    }

    /* JADX INFO: renamed from: y5 */
    private final C36947x m39912y5() {
        return (C36947x) this.f33696q0.getValue(this, f33695s0[0]);
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    @NotNull
    /* JADX INFO: renamed from: D5 */
    public AbstractC44151k0 mo39711D5() {
        return new C44153l0(this, m39713F5(), getDestroyDisposable(), getF33649W(), m39709C5());
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    @NotNull
    /* JADX INFO: renamed from: E5 */
    public C27103z mo39712E5() {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(MarginTradeOpenOrdersFragment.f32835Y.newInstance(mo39705A0()), this.f33697r0);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.todo_delegation));
        arrayList.add(getString(R$string.margin_asset_manage));
        Unit unit = Unit.INSTANCE;
        return new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public String mo39907P0() {
        return "B4tradingCross";
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    /* JADX INFO: renamed from: S5 */
    public void mo39730S5() {
        LeverBalance leverBalanceM39879Y0 = MarginConfigManager.f33681a.m39879Y0();
        MarginSubmitFragment marginSubmitFragmentM39713F5 = m39713F5();
        BigDecimal userLeverage = leverBalanceM39879Y0.getUserLeverage();
        if (userLeverage == null) {
            userLeverage = new BigDecimal(5);
        }
        MarginSubmitFragment.H4(marginSubmitFragmentM39713F5, userLeverage, false, 2, (Object) null);
        this.f33697r0.m40578h4(leverBalanceM39879Y0.isOpenStatus(), C27025c.m66566d(leverBalanceM39879Y0.isAutoRepay()));
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_margin_trade;
    }

    public MarginTradeFragment() {
        setPageId("B4tradingCross");
        this.f33697r0 = new MarginWholePositionFragment();
    }

    @Override // com.kubi.margin.trade.IMarginBehavior
    @Nullable
    /* JADX INFO: renamed from: O2 */
    public Boolean mo39906O2() {
        double dM66647g = C27039d.m66647g(C46897a.m103299k(getF33651Y()));
        double dM66647g2 = C27039d.m66647g(C46897a.m103299k(getF33652Z()));
        if (dM66647g == 0.0d || dM66647g2 == 0.0d) {
            if (dM66647g != 0.0d && dM66647g2 == 0.0d) {
                return Boolean.FALSE;
            }
            if (dM66647g == 0.0d && dM66647g2 != 0.0d) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.FALSE;
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment
    /* JADX INFO: renamed from: R5 */
    public void mo39729R5() {
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        ImageView f104635k;
        C36947x c36947xM39912y5 = m39912y5();
        if (c36947xM39912y5 != null && (symbolBarLayout = c36947xM39912y5.f82040m) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104635k = f20880b.getF104635k()) != null) {
            f104635k.post(new Runnable() { // from class: com.kubi.margin.trade.c5
                @Override // java.lang.Runnable
                public final void run() {
                    MarginTradeFragment.m39911m7(this.f33729b);
                }
            });
        }
        this.f33697r0.m40568I3();
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        C38274t.f85990a.m86367y(this);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42470e("open_lever", "load_lever", "加载：杠杆页");
    }

    @Override // com.kubi.margin.trade.BaseMarginFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        boolean zMo102977a;
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b f20880b;
        TextView f104632h;
        C36947x c36947xM39912y5;
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
        if (!zMo102977a && (c36947xM39912y5 = m39912y5()) != null && (symbolBarLayout2 = c36947xM39912y5.f82040m) != null && (f20880b2 = symbolBarLayout2.getF20880b()) != null && (f104632h2 = f20880b2.getF104632h()) != null) {
            f104632h2.setText(C42180b.m92640e(MarginConfigManager.f33681a.m39877W0().getMaxLeverage(), null, 4, false, false, false, 0, null, 125, null) + 'x');
        }
        C36947x c36947xM39912y6 = m39912y5();
        if (c36947xM39912y6 != null && (symbolBarLayout = c36947xM39912y6.f82040m) != null && (f20880b = symbolBarLayout.getF20880b()) != null && (f104632h = f20880b.getF104632h()) != null) {
            C0296a.m1042d(f104632h, !zMo102977a);
        }
        mo39729R5();
        String symbol = getF33649W().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        C45612b.m100698d(symbol);
    }
}
