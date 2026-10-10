package com.kubi.margin.delegation;

import android.os.Bundle;
import android.view.View;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36940t0;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MarginDelegationBothFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginDelegationBothFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "bmarginLayoutSwitchFragmentbarBinding", "Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", "getBmarginLayoutSwitchFragmentbarBinding", "()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", "bmarginLayoutSwitchFragmentbarBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isIsolated", "", "()Z", "isIsolated$delegate", "Lkotlin/Lazy;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationBothFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationBothFragment.kt\ncom/kubi/margin/delegation/MarginDelegationBothFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,111:1\n147#2,16:112\n*S KotlinDebug\n*F\n+ 1 MarginDelegationBothFragment.kt\ncom/kubi/margin/delegation/MarginDelegationBothFragment\n*L\n36#1:112,16\n*E\n"})
public final class MarginDelegationBothFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f32815W = {Reflection.property1(new PropertyReference1Impl(MarginDelegationBothFragment.class, "bmarginLayoutSwitchFragmentbarBinding", "getBmarginLayoutSwitchFragmentbarBinding()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f32816U = C45681e.m100799e(this, new Function1<MarginDelegationBothFragment, C36940t0>() { // from class: com.kubi.margin.delegation.MarginDelegationBothFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36940t0 invoke(@NotNull MarginDelegationBothFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36940t0.m82749a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36940t0, Unit>() { // from class: com.kubi.margin.delegation.MarginDelegationBothFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36940t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36940t0 c36940t0) {
            invoke(c36940t0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f32817V;

    /* JADX INFO: renamed from: n3 */
    private final C36940t0 m38029n3() {
        return (C36940t0) this.f32816U.getValue(this, f32815W[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m38031q3() {
        C43852m.m96591c("B4TradeHistory", "crossMarginHistory", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m38032r3() {
        C43852m.m96591c("B4TradeHistory", "isolatedMarginHistory", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_layout_switch_fragmentbar;
    }

    /* JADX INFO: renamed from: o3 */
    public final boolean m38033o3() {
        return ((Boolean) this.f32817V.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ArrayList arrayList = new ArrayList();
        C36940t0 c36940t0M38029n3 = m38029n3();
        if (c36940t0M38029n3 != null) {
            c36940t0M38029n3.f81983b.setTextOneLabel(getString(R$string.margin_whole));
            c36940t0M38029n3.f81983b.setTextTwoLabel(getString(R$string.margin_single));
            NavigationBar navigationBar = getNavigationBar();
            if (navigationBar != null) {
                ViewExtKt.m66577h(navigationBar);
            }
            MarginDelegationFragment.Companion companion = MarginDelegationFragment.f32834e0;
            Bundle bundle = new Bundle();
            Bundle arguments = getArguments();
            bundle.putInt("index", C27039d.m66651k(arguments != null ? RouteExKt.m56228S(arguments, "index") : null, 0));
            Bundle arguments2 = getArguments();
            bundle.putString("symbol", arguments2 != null ? RouteExKt.m56239b0(arguments2, "symbol") : null);
            Bundle arguments3 = getArguments();
            bundle.putString("fromSymbol", arguments3 != null ? RouteExKt.m56239b0(arguments3, "fromSymbol") : null);
            Bundle arguments4 = getArguments();
            bundle.putString("side", arguments4 != null ? RouteExKt.m56239b0(arguments4, "side") : null);
            bundle.putString("tradeType", "MARGIN_TRADE");
            Unit unit = Unit.INSTANCE;
            arrayList.add(companion.newInstance(bundle));
            Bundle bundle2 = new Bundle();
            Bundle arguments5 = getArguments();
            bundle2.putInt("index", C27039d.m66651k(arguments5 != null ? RouteExKt.m56228S(arguments5, "index") : null, 0));
            Bundle arguments6 = getArguments();
            bundle2.putString("symbol", arguments6 != null ? RouteExKt.m56239b0(arguments6, "symbol") : null);
            Bundle arguments7 = getArguments();
            bundle2.putString("fromSymbol", arguments7 != null ? RouteExKt.m56239b0(arguments7, "fromSymbol") : null);
            Bundle arguments8 = getArguments();
            bundle2.putString("side", arguments8 != null ? RouteExKt.m56239b0(arguments8, "side") : null);
            bundle2.putString("tradeType", "MARGIN_ISOLATED_TRADE");
            bundle2.putString("positionType", "isolated");
            arrayList.add(companion.newInstance(bundle2));
            c36940t0M38029n3.f81983b.m54803h(arrayList, getChildFragmentManager());
            if (m38033o3()) {
                c36940t0M38029n3.f81983b.setCurrentItem(1);
            }
            View viewFindViewById = c36940t0M38029n3.f81983b.findViewById(R$id.rb_one);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.margin.delegation.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationBothFragment.m38031q3();
                }
            }, 1, null);
            View viewFindViewById2 = c36940t0M38029n3.f81983b.findViewById(R$id.rb_two);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.margin.delegation.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationBothFragment.m38032r3();
                }
            }, 1, null);
        }
    }

    public MarginDelegationBothFragment() {
        setPageId("B4TradeHistory");
        this.f32817V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(MarginDelegationBothFragment.m38030p3(this.f32987b));
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public static final boolean m38030p3(MarginDelegationBothFragment marginDelegationBothFragment) {
        String strM56284y;
        Bundle arguments = marginDelegationBothFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "positionType");
        } else {
            strM56284y = null;
        }
        return Intrinsics.areEqual(strM56284y, "isolated");
    }
}
