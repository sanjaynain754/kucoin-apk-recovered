package com.kubi.spot.business.delegation;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
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
import t20.C44641g0;
import w00.C45681e;

/* JADX INFO: compiled from: TradeOpenOrdersFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ.\u0010\u001f\u001a\u00020\u00182&\b\u0002\u0010 \u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0018\u00010!J\u0006\u0010$\u001a\u00020\u0018J\u001a\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)J\u0006\u0010-\u001a\u00020.R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeOpenOrdersFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/FragmentTradeOpenOrdersBinding;", "getBinding", "()Lcom/kubi/spot/databinding/FragmentTradeOpenOrdersBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "todoFragment", "Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment;", "stopFragment", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "buyOrTransfer", "balanceDisplayStr", "", FirebaseAnalytics.Param.CURRENCY, "", "refreshEntrance", "pair", "Lkotlin/Pair;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationEntity;", "reloadData", "refreshData", "symbol", "Lcom/kubi/data/entity/TradeItemBean;", "checked", "", "onDataLoadOver", "empty", "isTodo", "currentPosition", "", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeOpenOrdersFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeOpenOrdersFragment.kt\ncom/kubi/spot/business/delegation/TradeOpenOrdersFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n147#2,16:172\n808#3,11:188\n774#3:199\n865#3,2:200\n1869#3,2:202\n808#3,11:204\n774#3:215\n865#3,2:216\n1869#3,2:218\n1#4:220\n*S KotlinDebug\n*F\n+ 1 TradeOpenOrdersFragment.kt\ncom/kubi/spot/business/delegation/TradeOpenOrdersFragment\n*L\n35#1:172,16\n103#1:188,11\n104#1:199\n104#1:200,2\n104#1:202,2\n108#1:204,11\n109#1:215\n109#1:216,2\n109#1:218,2\n*E\n"})
public final class TradeOpenOrdersFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f49944U = C45681e.m100799e(this, new Function1<TradeOpenOrdersFragment, C44641g0>() { // from class: com.kubi.spot.business.delegation.TradeOpenOrdersFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44641g0 invoke(@NotNull TradeOpenOrdersFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44641g0.m98759a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44641g0, Unit>() { // from class: com.kubi.spot.business.delegation.TradeOpenOrdersFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44641g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44641g0 c44641g0) {
            invoke(c44641g0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final DelegationChildFragment f49945V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final DelegationChildFragment f49946W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f49943Y = {Reflection.property1(new PropertyReference1Impl(TradeOpenOrdersFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentTradeOpenOrdersBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f49942X = new Companion(null);

    /* JADX INFO: compiled from: TradeOpenOrdersFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeOpenOrdersFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/business/delegation/TradeOpenOrdersFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TradeOpenOrdersFragment newInstance() {
            Bundle bundle = new Bundle();
            TradeOpenOrdersFragment tradeOpenOrdersFragment = new TradeOpenOrdersFragment();
            tradeOpenOrdersFragment.setArguments(bundle);
            return tradeOpenOrdersFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeOpenOrdersFragment$a */
    /* JADX INFO: compiled from: TradeOpenOrdersFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/delegation/TradeOpenOrdersFragment$onViewCreated$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24803a extends ViewPager.SimpleOnPageChangeListener {
        public C24803a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            BaseTextView baseTextView;
            super.onPageSelected(position);
            TradeOpenOrdersFragment.this.m60762v3();
            C44641g0 c44641g0M60759o3 = TradeOpenOrdersFragment.this.m60759o3();
            if (c44641g0M60759o3 != null && (baseTextView = c44641g0M60759o3.f99071b) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m60760q3(boolean z11, boolean z12) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C44641g0 c44641g0M60759o3;
        CustomViewPager customViewPager;
        C44641g0 c44641g0M60759o4;
        CustomViewPager customViewPager2;
        boolean z13 = false;
        boolean z14 = z12 && (c44641g0M60759o4 = m60759o3()) != null && (customViewPager2 = c44641g0M60759o4.f99076g) != null && customViewPager2.getCurrentItem() == 0;
        if (!z12 && (c44641g0M60759o3 = m60759o3()) != null && (customViewPager = c44641g0M60759o3.f99076g) != null && customViewPager.getCurrentItem() == 1) {
            z13 = true;
        }
        if (z14 || z13) {
            if (z11) {
                C44641g0 c44641g0M60759o5 = m60759o3();
                if (c44641g0M60759o5 == null || (baseTextView2 = c44641g0M60759o5.f99071b) == null) {
                    return;
                }
                ViewExtKt.m66577h(baseTextView2);
                return;
            }
            C44641g0 c44641g0M60759o6 = m60759o3();
            if (c44641g0M60759o6 == null || (baseTextView = c44641g0M60759o6.f99071b) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView);
        }
    }

    /* JADX INFO: renamed from: p3 */
    private final C27103z m60752p3() {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(this.f49945V, this.f49946W);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.open_order));
        arrayList.add(getString(R$string.advanced_order));
        Unit unit = Unit.INSTANCE;
        return new C27103z(childFragmentManager, arrayListArrayListOf, arrayList);
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m60753r3(TradeOpenOrdersFragment tradeOpenOrdersFragment) {
        CustomViewPager customViewPager;
        KuCheckBox kuCheckBox;
        TradeItemBean tradeItemBeanMo60180J;
        C43852m.m96591c("B5trading", "openOrderTabCancelAll", null, null, 12, null);
        C44641g0 c44641g0M60759o3 = tradeOpenOrdersFragment.m60759o3();
        String symbol = null;
        if (c44641g0M60759o3 != null && (kuCheckBox = c44641g0M60759o3.f99072c) != null && kuCheckBox.isChecked()) {
            Fragment parentFragment = tradeOpenOrdersFragment.getParentFragment();
            BaseTradeFragment baseTradeFragment = parentFragment instanceof BaseTradeFragment ? (BaseTradeFragment) parentFragment : null;
            if (baseTradeFragment != null && (tradeItemBeanMo60180J = baseTradeFragment.mo60180J()) != null) {
                symbol = tradeItemBeanMo60180J.getSymbol();
            }
        }
        C44641g0 c44641g0M60759o4 = tradeOpenOrdersFragment.m60759o3();
        if (c44641g0M60759o4 == null || (customViewPager = c44641g0M60759o4.f99076g) == null || customViewPager.getCurrentItem() != 0) {
            tradeOpenOrdersFragment.f49946W.m60794Y3(symbol);
        } else {
            tradeOpenOrdersFragment.f49945V.m60794Y3(symbol);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    private final void m60754s3(TradeItemBean tradeItemBean, boolean z11) {
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        if (z11) {
            C43852m.m96591c("B5trading", "openOrderTabHideOthers", null, null, 12, null);
            DelegationChildFragment delegationChildFragment = this.f49945V;
            String symbol = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            if (symbol == null) {
                symbol = "";
            }
            delegationChildFragment.m60800l4(symbol);
            DelegationChildFragment delegationChildFragment2 = this.f49946W;
            String symbol2 = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            delegationChildFragment2.m60800l4(symbol2 != null ? symbol2 : "");
        } else {
            this.f49945V.m60800l4("");
            this.f49946W.m60800l4("");
        }
        if (IUserService.a.get().c()) {
            C44641g0 c44641g0M60759o3 = m60759o3();
            if (c44641g0M60759o3 != null && (customViewPager2 = c44641g0M60759o3.f99076g) != null && customViewPager2.getCurrentItem() == 0) {
                this.f49945V.mo15906F3();
            }
            C44641g0 c44641g0M60759o4 = m60759o3();
            if (c44641g0M60759o4 == null || (customViewPager = c44641g0M60759o4.f99076g) == null || customViewPager.getCurrentItem() != 1) {
                return;
            }
            this.f49946W.mo15906F3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m60755u3(TradeOpenOrdersFragment tradeOpenOrdersFragment, Pair pair, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pair = null;
        }
        tradeOpenOrdersFragment.m60761t3(pair);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m60756w3(TradeOpenOrdersFragment tradeOpenOrdersFragment, TradeItemBean tradeItemBean, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        tradeOpenOrdersFragment.m60754s3(tradeItemBean, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public final C44641g0 m60759o3() {
        return (C44641g0) this.f49944U.getValue(this, f49943Y[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_trade_open_orders, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        CustomViewPager customViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        CustomViewPager customViewPager2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44641g0 c44641g0M60759o3 = m60759o3();
        if (c44641g0M60759o3 != null && (customViewPager2 = c44641g0M60759o3.f99076g) != null) {
            customViewPager2.setAdapter(m60752p3());
        }
        C44641g0 c44641g0M60759o4 = m60759o3();
        if (c44641g0M60759o4 != null && (slidingTabLayout2 = c44641g0M60759o4.f99074e) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        C44641g0 c44641g0M60759o5 = m60759o3();
        if (c44641g0M60759o5 != null && (slidingTabLayout = c44641g0M60759o5.f99074e) != null) {
            C44641g0 c44641g0M60759o6 = m60759o3();
            slidingTabLayout.setViewPager(c44641g0M60759o6 != null ? c44641g0M60759o6.f99076g : null);
        }
        C44641g0 c44641g0M60759o7 = m60759o3();
        if (c44641g0M60759o7 != null && (customViewPager = c44641g0M60759o7.f99076g) != null) {
            customViewPager.addOnPageChangeListener(new C24803a());
        }
        C44641g0 c44641g0M60759o8 = m60759o3();
        if (c44641g0M60759o8 == null || (baseTextView = c44641g0M60759o8.f99071b) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeOpenOrdersFragment.m60753r3(this.f50076b);
            }
        }, 1, null);
    }

    public TradeOpenOrdersFragment() {
        DelegationChildFragment.Companion companion = DelegationChildFragment.f49961h0;
        this.f49945V = companion.newInstance("active");
        this.f49946W = companion.newInstance(InterfaceC33730j9.f70350a);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m60757m3(@Nullable CharSequence charSequence, @Nullable String str) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DelegationChildFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((DelegationChildFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((DelegationChildFragment) it.next()).m60801m4(charSequence, str);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final int m60758n3() {
        Integer numValueOf;
        CustomViewPager customViewPager;
        C44641g0 c44641g0M60759o3 = m60759o3();
        if (c44641g0M60759o3 != null && (customViewPager = c44641g0M60759o3.f99076g) != null) {
            numValueOf = Integer.valueOf(customViewPager.getCurrentItem());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m60761t3(@Nullable Pair<? extends BasePageEntity<DelegationEntity>, ? extends BasePageEntity<DelegationEntity>> pair) {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DelegationChildFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((DelegationChildFragment) obj2).isAdded()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((DelegationChildFragment) it.next()).m60799k4();
        }
        if (pair != null) {
            if (pair.getFirst() != null || pair.getSecond() != null) {
                ArrayList arrayList3 = new ArrayList();
                PagerAdapter adapter = null;
                if (!IUserService.a.get().c()) {
                    arrayList3.add(getString(R$string.open_order));
                    arrayList3.add(getString(R$string.advanced_order));
                } else {
                    BasePageEntity<DelegationEntity> first = pair.getFirst();
                    if (first != null) {
                        numValueOf = Integer.valueOf(first.getTotalNum());
                    } else {
                        numValueOf = null;
                    }
                    int iM66650j = C27039d.m66650j(numValueOf);
                    BasePageEntity<DelegationEntity> second = pair.getSecond();
                    if (second != null) {
                        numValueOf2 = Integer.valueOf(second.getTotalNum());
                    } else {
                        numValueOf2 = null;
                    }
                    int iM66650j2 = C27039d.m66650j(numValueOf2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getString(R$string.open_order));
                    String str2 = " (99+) ";
                    if (iM66650j > 99) {
                        str = " (99+) ";
                    } else {
                        str = " (" + iM66650j + ") ";
                    }
                    sb2.append(str);
                    arrayList3.add(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(getString(R$string.advanced_order));
                    if (iM66650j2 <= 99) {
                        str2 = " (" + iM66650j2 + ") ";
                    }
                    sb3.append(str2);
                    arrayList3.add(sb3.toString());
                }
                C44641g0 c44641g0M60759o3 = m60759o3();
                if (c44641g0M60759o3 != null && (customViewPager = c44641g0M60759o3.f99076g) != null) {
                    adapter = customViewPager.getAdapter();
                }
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.utils.InnerPagerAdapter");
                ((C27103z) adapter).m66940b(arrayList3);
                C44641g0 c44641g0M60759o4 = m60759o3();
                if (c44641g0M60759o4 != null && (slidingTabLayout = c44641g0M60759o4.f99074e) != null) {
                    slidingTabLayout.m55291w();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m60762v3() {
        BaseTradeFragment baseTradeFragment;
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        Fragment parentFragment = getParentFragment();
        final TradeItemBean tradeItemBeanMo60180J = null;
        if (parentFragment instanceof BaseTradeFragment) {
            baseTradeFragment = (BaseTradeFragment) parentFragment;
        } else {
            baseTradeFragment = null;
        }
        if (baseTradeFragment != null) {
            tradeItemBeanMo60180J = baseTradeFragment.mo60180J();
        }
        C44641g0 c44641g0M60759o3 = m60759o3();
        if (c44641g0M60759o3 != null && (kuCheckBox2 = c44641g0M60759o3.f99072c) != null) {
            C27046k.m66708w(kuCheckBox2, new Function2() { // from class: com.kubi.spot.business.delegation.l1
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeOpenOrdersFragment.m60756w3(this.f50078b, tradeItemBeanMo60180J, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C44641g0 c44641g0M60759o4 = m60759o3();
        if (c44641g0M60759o4 != null && (kuCheckBox = c44641g0M60759o4.f99072c) != null) {
            m60754s3(tradeItemBeanMo60180J, kuCheckBox.isChecked());
        }
    }
}
