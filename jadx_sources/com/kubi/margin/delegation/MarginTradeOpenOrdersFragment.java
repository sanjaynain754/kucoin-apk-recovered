package com.kubi.margin.delegation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36922k0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MarginTradeOpenOrdersFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*J\u001e\u0010+\u001a\u00020$2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010-J\u0006\u0010.\u001a\u00020$J\b\u0010/\u001a\u00020$H\u0016J\u001a\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0002J\u001c\u00105\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u000204J\u001c\u0010:\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u000204J\u0006\u0010;\u001a\u00020\u0014R#\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u001c¨\u0006="}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginTradeOpenOrdersFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bmarginFragmentTradeOpenOrdersBinding", "Lcom/kubi/margin/databinding/BmarginFragmentTradeOpenOrdersBinding;", "getBmarginFragmentTradeOpenOrdersBinding$annotations", "getBmarginFragmentTradeOpenOrdersBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentTradeOpenOrdersBinding;", "bmarginFragmentTradeOpenOrdersBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "todoFragment", "Lcom/kubi/margin/delegation/MarginDelegationChildFragment;", "getTodoFragment", "()Lcom/kubi/margin/delegation/MarginDelegationChildFragment;", "todoFragment$delegate", "stopFragment", "getStopFragment", "stopFragment$delegate", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showGuideLayout", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "refreshEntrance", "delegationCount", "Lkotlin/Pair;", "reloadData", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "refreshData", "symbol", "Lcom/kubi/data/entity/TradeItemBean;", "checked", "", "trackOpenOrderCall", "data", "", "Lcom/kubi/spot/entity/DelegationEntity;", "isTodo", "onDataLoadOver", "currentPosition", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginTradeOpenOrdersFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTradeOpenOrdersFragment.kt\ncom/kubi/margin/delegation/MarginTradeOpenOrdersFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n147#2,16:235\n153#3,7:251\n76#3,7:258\n808#4,11:265\n774#4:276\n865#4,2:277\n1869#4,2:279\n808#4,11:281\n774#4:292\n865#4,2:293\n1869#4,2:295\n1#5:297\n*S KotlinDebug\n*F\n+ 1 MarginTradeOpenOrdersFragment.kt\ncom/kubi/margin/delegation/MarginTradeOpenOrdersFragment\n*L\n39#1:235,16\n115#1:251,7\n121#1:258,7\n135#1:265,11\n136#1:276\n136#1:277,2\n136#1:279,2\n146#1:281,11\n147#1:292\n147#1:293,2\n147#1:295,2\n*E\n"})
public final class MarginTradeOpenOrdersFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f32837U = C45681e.m100799e(this, new Function1<MarginTradeOpenOrdersFragment, C36922k0>() { // from class: com.kubi.margin.delegation.MarginTradeOpenOrdersFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36922k0 invoke(@NotNull MarginTradeOpenOrdersFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36922k0.m82712a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36922k0, Unit>() { // from class: com.kubi.margin.delegation.MarginTradeOpenOrdersFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36922k0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36922k0 c36922k0) {
            invoke(c36922k0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f32838V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginTradeOpenOrdersFragment.m38095E3(this.f32935b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f32839W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginTradeOpenOrdersFragment.m38094C3(this.f32938b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f32840X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginTradeOpenOrdersFragment.m38093B3(this.f32984b);
        }
    });

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f32836Z = {Reflection.property1(new PropertyReference1Impl(MarginTradeOpenOrdersFragment.class, "bmarginFragmentTradeOpenOrdersBinding", "getBmarginFragmentTradeOpenOrdersBinding()Lcom/kubi/margin/databinding/BmarginFragmentTradeOpenOrdersBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f32835Y = new Companion(null);

    /* JADX INFO: compiled from: MarginTradeOpenOrdersFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginTradeOpenOrdersFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/delegation/MarginTradeOpenOrdersFragment;", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginTradeOpenOrdersFragment newInstance(int tradeType) {
            Bundle bundle = new Bundle();
            bundle.putInt("tradeType", tradeType);
            MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment = new MarginTradeOpenOrdersFragment();
            marginTradeOpenOrdersFragment.setArguments(bundle);
            return marginTradeOpenOrdersFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.delegation.MarginTradeOpenOrdersFragment$a */
    /* JADX INFO: compiled from: MarginTradeOpenOrdersFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/delegation/MarginTradeOpenOrdersFragment$onViewCreated$1$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17504a extends ViewPager.SimpleOnPageChangeListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C36922k0 f32842c;

        public C17504a(C36922k0 c36922k0) {
            this.f32842c = c36922k0;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            MarginTradeOpenOrdersFragment.this.m38114y3();
            BaseTextView cancelAll = this.f32842c.f81770b;
            Intrinsics.checkNotNullExpressionValue(cancelAll, "cancelAll");
            ViewExtKt.m66577h(cancelAll);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final MarginDelegationChildFragment m38093B3(MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment) {
        return MarginDelegationChildFragment.f32818k0.newInstance(InterfaceC33730j9.f70350a, marginTradeOpenOrdersFragment.getTradeType());
    }

    /* JADX INFO: renamed from: C3 */
    public static final MarginDelegationChildFragment m38094C3(MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment) {
        return MarginDelegationChildFragment.f32818k0.newInstance("active", marginTradeOpenOrdersFragment.getTradeType());
    }

    private final int getTradeType() {
        return ((Number) this.f32838V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m38102u3(C36922k0 c36922k0, MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment) {
        TradeItemBean tradeItemBeanMo39717J;
        String symbol = null;
        if (c36922k0.f81771c.isChecked()) {
            Fragment parentFragment = marginTradeOpenOrdersFragment.getParentFragment();
            BaseMarginFragment baseMarginFragment = parentFragment instanceof BaseMarginFragment ? (BaseMarginFragment) parentFragment : null;
            if (baseMarginFragment != null && (tradeItemBeanMo39717J = baseMarginFragment.mo39717J()) != null) {
                symbol = tradeItemBeanMo39717J.getSymbol();
            }
        }
        if (c36922k0.f81775g.getCurrentItem() == 0) {
            marginTradeOpenOrdersFragment.m38110s3().m38068e4(symbol);
        } else {
            marginTradeOpenOrdersFragment.m38109r3().m38068e4(symbol);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m38103x3(MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment, Pair pair, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pair = null;
        }
        marginTradeOpenOrdersFragment.m38113w3(pair);
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m38104z3(MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment, TradeItemBean tradeItemBean, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        marginTradeOpenOrdersFragment.m38112v3(tradeItemBean, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m38106D3(@NotNull List<DelegationEntity> data, boolean z11) {
        Object next;
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator<T> it = data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((DelegationEntity) next).getOrderId(), com.kubi.margin.trade.holder.businessTrack.a.a.b()));
        if (next != null) {
            com.kubi.margin.trade.holder.businessTrack.a.a.d(z11 ? 11 : 22);
        } else {
            com.kubi.margin.trade.holder.businessTrack.a.a.d(z11 ? 1 : 2);
        }
        com.kubi.margin.trade.holder.businessTrack.a.a.c((String) null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_trade_open_orders, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36922k0 c36922k0M38108p3 = m38108p3();
        if (c36922k0M38108p3 != null) {
            c36922k0M38108p3.f81775g.setAdapter(m38101q3());
            c36922k0M38108p3.f81773e.setNeedBold(true);
            c36922k0M38108p3.f81773e.setViewPager(c36922k0M38108p3.f81775g);
            c36922k0M38108p3.f81775g.addOnPageChangeListener(new C17504a(c36922k0M38108p3));
            BaseTextView cancelAll = c36922k0M38108p3.f81770b;
            Intrinsics.checkNotNullExpressionValue(cancelAll, "cancelAll");
            C27046k.m66711z(cancelAll, 0L, new Function0() { // from class: com.kubi.margin.delegation.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginTradeOpenOrdersFragment.m38102u3(c36922k0M38108p3, this);
                }
            }, 1, null);
            C12573b c12573b = C12573b.f21598a;
            if (c12573b.m23696a()) {
                "action_order_debounce_refresh".length();
            }
            C12572a.m23692a(this, false, new C17505xbbcaf6f6("action_order_debounce_refresh", null, this));
            if (c12573b.m23696a()) {
                "action_order_open_or_end".length();
            }
            C12572a.m23692a(this, false, new C17506xbbcaf6f7("action_order_open_or_end", null, this, c36922k0M38108p3));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public final C36922k0 m38108p3() {
        return (C36922k0) this.f32837U.getValue(this, f32836Z[0]);
    }

    /* JADX INFO: renamed from: r3 */
    public final MarginDelegationChildFragment m38109r3() {
        return (MarginDelegationChildFragment) this.f32840X.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final MarginDelegationChildFragment m38110s3() {
        return (MarginDelegationChildFragment) this.f32839W.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m38111t3(@NotNull List<DelegationEntity> data, boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C36922k0 c36922k0M38108p3;
        CustomViewPager customViewPager;
        C36922k0 c36922k0M38108p4;
        CustomViewPager customViewPager2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (getView() == null) {
            return;
        }
        boolean z12 = false;
        boolean z13 = z11 && (c36922k0M38108p4 = m38108p3()) != null && (customViewPager2 = c36922k0M38108p4.f81775g) != null && customViewPager2.getCurrentItem() == 0;
        if (!z11 && (c36922k0M38108p3 = m38108p3()) != null && (customViewPager = c36922k0M38108p3.f81775g) != null && customViewPager.getCurrentItem() == 1) {
            z12 = true;
        }
        if (z13 || z12) {
            if (data.isEmpty()) {
                C36922k0 c36922k0M38108p5 = m38108p3();
                if (c36922k0M38108p5 == null || (baseTextView2 = c36922k0M38108p5.f81770b) == null) {
                    return;
                }
                ViewExtKt.m66577h(baseTextView2);
                return;
            }
            C36922k0 c36922k0M38108p6 = m38108p3();
            if (c36922k0M38108p6 == null || (baseTextView = c36922k0M38108p6.f81770b) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m38112v3(TradeItemBean tradeItemBean, boolean z11) {
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        if (z11) {
            MarginDelegationChildFragment marginDelegationChildFragmentM38110s3 = m38110s3();
            String symbol = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            if (symbol == null) {
                symbol = "";
            }
            marginDelegationChildFragmentM38110s3.m38079w4(symbol);
            MarginDelegationChildFragment marginDelegationChildFragmentM38109r3 = m38109r3();
            String symbol2 = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            marginDelegationChildFragmentM38109r3.m38079w4(symbol2 != null ? symbol2 : "");
        } else {
            m38110s3().m38079w4("");
            m38109r3().m38079w4("");
        }
        if (C42579a.f94275a.m93347g().c()) {
            C36922k0 c36922k0M38108p3 = m38108p3();
            if (c36922k0M38108p3 != null && (customViewPager2 = c36922k0M38108p3.f81775g) != null && customViewPager2.getCurrentItem() == 0) {
                m38110s3().mo15906F3();
            }
            C36922k0 c36922k0M38108p4 = m38108p3();
            if (c36922k0M38108p4 == null || (customViewPager = c36922k0M38108p4.f81775g) == null || customViewPager.getCurrentItem() != 1) {
                return;
            }
            m38109r3().mo15906F3();
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final int m38095E3(MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment) {
        Integer numValueOf;
        Bundle arguments = marginTradeOpenOrdersFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: q3 */
    private final C27103z m38101q3() {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(m38110s3(), m38109r3());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.open_order));
        arrayList.add(getString(R$string.advanced_order));
        Unit unit = Unit.INSTANCE;
        return new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m38105A3(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof MarginDelegationChildFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((MarginDelegationChildFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((MarginDelegationChildFragment) it.next()).m38080x4(bigDecimal, charSequence);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final int m38107o3() {
        Integer numValueOf;
        CustomViewPager customViewPager;
        C36922k0 c36922k0M38108p3 = m38108p3();
        if (c36922k0M38108p3 != null && (customViewPager = c36922k0M38108p3.f81775g) != null) {
            numValueOf = Integer.valueOf(customViewPager.getCurrentItem());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        m38114y3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m38113w3(@Nullable Pair<Integer, Integer> pair) {
        String string;
        PagerAdapter adapter;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        if (getView() != null) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof MarginDelegationChildFragment) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((MarginDelegationChildFragment) obj2).isAdded()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((MarginDelegationChildFragment) it.next()).m38078v4();
            }
            if (pair != null) {
                ArrayList arrayList3 = new ArrayList();
                if (!C42579a.f94275a.m93347g().c()) {
                    arrayList3.add(getString(R$string.open_order));
                    arrayList3.add(getString(R$string.advanced_order));
                } else {
                    int iIntValue = pair.getFirst().intValue();
                    int iIntValue2 = pair.getSecond().intValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getString(R$string.open_order));
                    String string2 = "(99+)";
                    if (iIntValue > 99) {
                        string = "(99+)";
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('(');
                        sb3.append(iIntValue);
                        sb3.append(')');
                        string = sb3.toString();
                    }
                    sb2.append(string);
                    arrayList3.add(sb2.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(getString(R$string.advanced_order));
                    if (iIntValue2 <= 99) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append('(');
                        sb5.append(iIntValue2);
                        sb5.append(')');
                        string2 = sb5.toString();
                    }
                    sb4.append(string2);
                    arrayList3.add(sb4.toString());
                }
                C36922k0 c36922k0M38108p3 = m38108p3();
                if (c36922k0M38108p3 != null && (customViewPager = c36922k0M38108p3.f81775g) != null) {
                    adapter = customViewPager.getAdapter();
                } else {
                    adapter = null;
                }
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.utils.InnerPagerAdapter");
                ((C27103z) adapter).m66940b(arrayList3);
                C36922k0 c36922k0M38108p4 = m38108p3();
                if (c36922k0M38108p4 != null && (slidingTabLayout = c36922k0M38108p4.f81773e) != null) {
                    slidingTabLayout.m55291w();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m38114y3() {
        BaseMarginFragment baseMarginFragment;
        final TradeItemBean tradeItemBeanMo39717J;
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        if (getView() == null) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        Boolean boolValueOf = null;
        if (parentFragment instanceof BaseMarginFragment) {
            baseMarginFragment = (BaseMarginFragment) parentFragment;
        } else {
            baseMarginFragment = null;
        }
        if (baseMarginFragment != null) {
            tradeItemBeanMo39717J = baseMarginFragment.mo39717J();
        } else {
            tradeItemBeanMo39717J = null;
        }
        C36922k0 c36922k0M38108p3 = m38108p3();
        if (c36922k0M38108p3 != null && (kuCheckBox2 = c36922k0M38108p3.f81771c) != null) {
            C27046k.m66708w(kuCheckBox2, new Function2() { // from class: com.kubi.margin.delegation.j0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginTradeOpenOrdersFragment.m38104z3(this.f32931b, tradeItemBeanMo39717J, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C36922k0 c36922k0M38108p4 = m38108p3();
        if (c36922k0M38108p4 != null && (kuCheckBox = c36922k0M38108p4.f81771c) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        }
        m38112v3(tradeItemBeanMo39717J, C27025c.m66566d(boolValueOf));
    }
}
