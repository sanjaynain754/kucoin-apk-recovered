package com.kubi.spot.business.delegation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$array;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment;
import com.kubi.spot.business.delegation.delegationList.DelegationListFragment;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import t20.C44645i0;
import w00.C45681e;

/* JADX INFO: compiled from: DelegationFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u00020\u001dH\u0014J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u001dH\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u00105\u001a\u00020+H\u0016J\b\u00106\u001a\u00020\u0012H\u0002J \u00107\u001a\u00020+2\u0006\u00101\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J\u0016\u0010;\u001a\u00020+2\u0006\u00107\u001a\u00020<2\u0006\u0010=\u001a\u00020<R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\rR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b\"\u0010\rR\u001d\u0010$\u001a\u0004\u0018\u00010%8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'¨\u0006?"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/DelegationFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinDelegationManagerLayoutBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinDelegationManagerLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mSymbol", "", "getMSymbol", "()Ljava/lang/String;", "mSymbol$delegate", "Lkotlin/Lazy;", "tabFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "getTabFragments", "()Ljava/util/ArrayList;", "mFromSymbol", "getMFromSymbol", "mFromSymbol$delegate", "mSide", "getMSide", "mSide$delegate", "mIndex", "", "getMIndex", "()I", "mIndex$delegate", "tradeType", "getTradeType", "tradeType$delegate", "unifyRecord", "Lcom/kubi/sdk/BaseFragment;", "getUnifyRecord", "()Lcom/kubi/sdk/BaseFragment;", "unifyRecord$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "trackPosition", ViewProps.POSITION, "getFragmentTitles", "", "", "addOtherFragment", "getSpotDelegationHistoryFragment", "showCancelAll", "todoFragment", "Lcom/kubi/spot/business/delegation/delegationList/DelegationListFragment;", "stopFragment", "onDataLoadOver", "", "isTodo", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationFragment.kt\ncom/kubi/spot/business/delegation/DelegationFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n147#2,16:222\n1#3:238\n1869#4,2:239\n*S KotlinDebug\n*F\n+ 1 DelegationFragment.kt\ncom/kubi/spot/business/delegation/DelegationFragment\n*L\n33#1:222,16\n117#1:239,2\n*E\n"})
public class DelegationFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f49903U = C45681e.m100799e(this, new Function1<DelegationFragment, C44645i0>() { // from class: com.kubi.spot.business.delegation.DelegationFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44645i0 invoke(@NotNull DelegationFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44645i0.m98766a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44645i0, Unit>() { // from class: com.kubi.spot.business.delegation.DelegationFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44645i0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44645i0 c44645i0) {
            invoke(c44645i0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f49904V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationFragment.m60581G3(this.f49956b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<Fragment> f49905W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f49906X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationFragment.m60578D3(this.f49958b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f49907Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationFragment.m60580F3(this.f50061b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f49908Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(DelegationFragment.m60579E3(this.f50063b));
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49909a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationFragment.m60584M3(this.f50066b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49910b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationFragment.m60585N3(this.f50068b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f49902d0 = {Reflection.property1(new PropertyReference1Impl(DelegationFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinDelegationManagerLayoutBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f49901c0 = new Companion(null);

    /* JADX INFO: compiled from: DelegationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/DelegationFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/business/delegation/DelegationFragment;", "bundle", "Landroid/os/Bundle;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DelegationFragment newInstance(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            DelegationFragment delegationFragment = new DelegationFragment();
            delegationFragment.setArguments(bundle);
            return delegationFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.DelegationFragment$a */
    /* JADX INFO: compiled from: DelegationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/delegation/DelegationFragment$onViewCreated$1$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24794a extends C45938b {
        public C24794a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            super.mo18273b(i11);
            DelegationFragment.this.mo38089L3(i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.DelegationFragment$b */
    /* JADX INFO: compiled from: DelegationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/spot/business/delegation/DelegationFragment$onViewCreated$1$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24795b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C44645i0 f49912b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ DelegationFragment f49913c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DelegationListFragment f49914d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DelegationListFragment f49915e;

        public C24795b(C44645i0 c44645i0, DelegationFragment delegationFragment, DelegationListFragment delegationListFragment, DelegationListFragment delegationListFragment2) {
            this.f49912b = c44645i0;
            this.f49913c = delegationFragment;
            this.f49914d = delegationListFragment;
            this.f49915e = delegationListFragment2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            BaseTextView tvCancel = this.f49912b.f99135g;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66700o(tvCancel);
            if (position >= 2) {
                KuCheckBox ctxCurrent = this.f49912b.f99130b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent, "ctxCurrent");
                C27046k.m66700o(ctxCurrent);
                View line = this.f49912b.f99134f;
                Intrinsics.checkNotNullExpressionValue(line, "line");
                C27046k.m66700o(line);
                return;
            }
            String strM60604z3 = this.f49913c.m60604z3();
            if (strM60604z3 != null && strM60604z3.length() != 0) {
                KuCheckBox ctxCurrent2 = this.f49912b.f99130b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent2, "ctxCurrent");
                C27046k.m66685H(ctxCurrent2);
                View line2 = this.f49912b.f99134f;
                Intrinsics.checkNotNullExpressionValue(line2, "line");
                C27046k.m66685H(line2);
            }
            this.f49913c.m60599K3(position, this.f49914d, this.f49915e);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m60598H3(boolean z11, boolean z12) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C44645i0 c44645i0M60600u3;
        RtlViewPager rtlViewPager;
        C44645i0 c44645i0M60600u4;
        RtlViewPager rtlViewPager2;
        boolean z13 = false;
        boolean z14 = z12 && (c44645i0M60600u4 = m60600u3()) != null && (rtlViewPager2 = c44645i0M60600u4.f99132d) != null && rtlViewPager2.getCurrentItem() == 0;
        if (!z12 && (c44645i0M60600u3 = m60600u3()) != null && (rtlViewPager = c44645i0M60600u3.f99132d) != null && rtlViewPager.getCurrentItem() == 1) {
            z13 = true;
        }
        if (z14 || z13) {
            if (z11) {
                C44645i0 c44645i0M60600u5 = m60600u3();
                if (c44645i0M60600u5 == null || (baseTextView = c44645i0M60600u5.f99135g) == null) {
                    return;
                }
                ViewExtKt.m66594y(baseTextView);
                return;
            }
            C44645i0 c44645i0M60600u6 = m60600u3();
            if (c44645i0M60600u6 == null || (baseTextView2 = c44645i0M60600u6.f99135g) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView2);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m60582I3(DelegationFragment delegationFragment) {
        Iterator it = CollectionsKt.filterIsInstance(delegationFragment.f49905W, DelegationListFragment.class).iterator();
        while (it.hasNext()) {
            ((DelegationListFragment) it.next()).mo15906F3();
        }
        if (Intrinsics.areEqual(delegationFragment.m60596B3(), "TRADE")) {
            C43852m.m96591c("B5orderList", "only", null, null, 12, null);
        } else {
            C43852m.m96591c("B4TradeHistory", "onlyDisplay", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m60583J3(C44645i0 c44645i0, DelegationListFragment delegationListFragment, DelegationListFragment delegationListFragment2) {
        if (c44645i0.f99132d.getCurrentItem() == 0) {
            delegationListFragment.m60946W3();
        } else {
            delegationListFragment2.m60946W3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final BaseFragment m60585N3(DelegationFragment delegationFragment) {
        return IUnifyAccountService.f53155a.get().mo64984H(delegationFragment.getArguments());
    }

    /* JADX INFO: renamed from: A3 */
    public final Fragment m60595A3() {
        if (IUnifyAccountService.f53155a.get().mo64991e() && (Intrinsics.areEqual(m60596B3(), "TRADE") || Intrinsics.areEqual(m60596B3(), "MARGIN_TRADE"))) {
            return IUtaSpotService.f54014a.get().mo65994h(m60601w3(), m60603y3(), Intrinsics.areEqual(m60596B3(), "TRADE") ? "SPOT" : "MARGIN");
        }
        return DelegationHistoryFragment.Companion.newInstance$default(DelegationHistoryFragment.f49999u0, m60596B3(), m60601w3(), m60603y3(), false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: B3 */
    public final String m60596B3() {
        return (String) this.f49909a0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public final BaseFragment m60597C3() {
        return (BaseFragment) this.f49910b0.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final void m60599K3(int i11, DelegationListFragment delegationListFragment, DelegationListFragment delegationListFragment2) {
        if (i11 == 0) {
            delegationListFragment.m60950i4();
        } else {
            delegationListFragment2.m60950i4();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void mo38089L3(int i11) {
        C43852m.m96591c("B5orderList", "orderType", String.valueOf(i11 + 1), null, 8, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_delegation_manager_layout;
    }

    @NotNull
    public final ArrayList<Fragment> getTabFragments() {
        return this.f49905W;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DelegationListFragment.Companion companion = DelegationListFragment.f50053f0;
        final DelegationListFragment delegationListFragmentNewInstance = companion.newInstance("active", m60604z3(), m60596B3());
        final DelegationListFragment delegationListFragmentNewInstance2 = companion.newInstance(InterfaceC33730j9.f70350a, m60604z3(), m60596B3());
        this.f49905W.add(delegationListFragmentNewInstance);
        this.f49905W.add(delegationListFragmentNewInstance2);
        this.f49905W.add(m60595A3());
        mo38091t3();
        final C44645i0 c44645i0M60600u3 = m60600u3();
        if (c44645i0M60600u3 != null) {
            RtlViewPager rtlViewPager = c44645i0M60600u3.f99132d;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rtlViewPager.setAdapter(new C27103z(childFragmentManager, this.f49905W, mo38092v3()));
            c44645i0M60600u3.f99131c.setNeedBold(true);
            c44645i0M60600u3.f99131c.setTabMaxLine(1);
            c44645i0M60600u3.f99132d.setOffscreenPageLimit(this.f49905W.size() - 1);
            c44645i0M60600u3.f99131c.setViewPager(c44645i0M60600u3.f99132d);
            c44645i0M60600u3.f99131c.setOnTabSelectListener(new C24794a());
            c44645i0M60600u3.f99132d.addOnPageChangeListener(new C24795b(c44645i0M60600u3, this, delegationListFragmentNewInstance, delegationListFragmentNewInstance2));
            c44645i0M60600u3.f99132d.setCurrentItem(m60602x3());
            String strM60604z3 = m60604z3();
            if (strM60604z3 == null || strM60604z3.length() == 0) {
                KuCheckBox ctxCurrent = c44645i0M60600u3.f99130b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent, "ctxCurrent");
                ViewExtKt.m66577h(ctxCurrent);
            } else {
                KuCheckBox ctxCurrent2 = c44645i0M60600u3.f99130b;
                Intrinsics.checkNotNullExpressionValue(ctxCurrent2, "ctxCurrent");
                ViewExtKt.m66594y(ctxCurrent2);
                KuCheckBox kuCheckBox = c44645i0M60600u3.f99130b;
                int i11 = R$string.show_current_symbol;
                C37890n c37890n = C37890n.f85269a;
                String strM60604z4 = m60604z3();
                if (strM60604z4 == null) {
                    strM60604z4 = "";
                }
                SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(strM60604z4);
                String showSymbol = symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null;
                String strM60604z5 = m60604z3();
                kuCheckBox.setText(getString(i11, C27041f.m66669i(showSymbol, StringsKt.replace$default(strM60604z5 == null ? "" : strM60604z5, C33820nf.f71144W, "/", false, 4, (Object) null))));
            }
            KuCheckBox ctxCurrent3 = c44645i0M60600u3.f99130b;
            Intrinsics.checkNotNullExpressionValue(ctxCurrent3, "ctxCurrent");
            C27046k.m66711z(ctxCurrent3, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DelegationFragment.m60582I3(this.f49948b);
                }
            }, 1, null);
            BaseTextView tvCancel = c44645i0M60600u3.f99135g;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66711z(tvCancel, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DelegationFragment.m60583J3(c44645i0M60600u3, delegationListFragmentNewInstance, delegationListFragmentNewInstance2);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public void mo38091t3() {
        BaseFragment baseFragmentM60597C3;
        if (IUnifyAccountService.f53155a.get().mo64991e() && Intrinsics.areEqual(m60596B3(), "TRADE") && (baseFragmentM60597C3 = m60597C3()) != null) {
            this.f49905W.add(baseFragmentM60597C3);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u3 */
    public final C44645i0 m60600u3() {
        return (C44645i0) this.f49903U.getValue(this, f49902d0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: v3 */
    public List<CharSequence> mo38092v3() {
        if (!IUnifyAccountService.f53155a.get().mo64991e() || !Intrinsics.areEqual(m60596B3(), "TRADE")) {
            String[] stringArray = getResources().getStringArray(R$array.kucoin_delegation_titles);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            return ArraysKt.toMutableList(stringArray);
        }
        String[] stringArray2 = getResources().getStringArray(R$array.kucoin_delegation_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        List<CharSequence> mutableList = ArraysKt.toMutableList(stringArray2);
        if (m60597C3() != null) {
            mutableList.add(getString(R$string.unify_borrow_label));
        }
        return mutableList;
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public final String m60601w3() {
        return (String) this.f49906X.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final int m60602x3() {
        return ((Number) this.f49908Z.getValue()).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final String m60603y3() {
        return (String) this.f49907Y.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final String m60604z3() {
        return (String) this.f49904V.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public static final String m60578D3(DelegationFragment delegationFragment) {
        Bundle arguments = delegationFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("fromSymbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public static final int m60579E3(DelegationFragment delegationFragment) {
        Integer numValueOf;
        Bundle arguments = delegationFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("index"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 0);
    }

    /* JADX INFO: renamed from: F3 */
    public static final String m60580F3(DelegationFragment delegationFragment) {
        Bundle arguments = delegationFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("side");
        }
        return null;
    }

    /* JADX INFO: renamed from: G3 */
    public static final String m60581G3(DelegationFragment delegationFragment) {
        Bundle arguments = delegationFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: M3 */
    public static final String m60584M3(DelegationFragment delegationFragment) {
        String string;
        Bundle arguments = delegationFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }
}
