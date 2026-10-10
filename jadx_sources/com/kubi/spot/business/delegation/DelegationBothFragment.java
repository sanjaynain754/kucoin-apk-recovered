package com.kubi.spot.business.delegation;

import android.os.Bundle;
import android.view.View;
import com.kubi.resources.widget.SwitchFragmentBar;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import t20.C44659p0;
import w00.C45681e;

/* JADX INFO: compiled from: DelegationBothFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/DelegationBothFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinLayoutSwitchFragmentbarBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinLayoutSwitchFragmentbarBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationBothFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationBothFragment.kt\ncom/kubi/spot/business/delegation/DelegationBothFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,64:1\n147#2,16:65\n*S KotlinDebug\n*F\n+ 1 DelegationBothFragment.kt\ncom/kubi/spot/business/delegation/DelegationBothFragment\n*L\n29#1:65,16\n*E\n"})
public final class DelegationBothFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f49899V = {Reflection.property1(new PropertyReference1Impl(DelegationBothFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinLayoutSwitchFragmentbarBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f49900U = C45681e.m100799e(this, new Function1<DelegationBothFragment, C44659p0>() { // from class: com.kubi.spot.business.delegation.DelegationBothFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44659p0 invoke(@NotNull DelegationBothFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44659p0.m98794a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44659p0, Unit>() { // from class: com.kubi.spot.business.delegation.DelegationBothFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44659p0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44659p0 c44659p0) {
            invoke(c44659p0);
            return Unit.INSTANCE;
        }
    });

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_layout_switch_fragmentbar;
    }

    /* JADX INFO: renamed from: k3 */
    public final C44659p0 m60577k3() {
        return (C44659p0) this.f49900U.getValue(this, f49899V[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SwitchFragmentBar switchFragmentBar;
        SwitchFragmentBar switchFragmentBar2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ArrayList arrayList = new ArrayList();
        getTitleBar().setTitle(getString(R$string.assets_coin_exchange));
        C44659p0 c44659p0M60577k3 = m60577k3();
        if (c44659p0M60577k3 != null && (switchFragmentBar2 = c44659p0M60577k3.f99283b) != null) {
            switchFragmentBar2.m54799d();
        }
        DelegationFragment.Companion companion = DelegationFragment.f49901c0;
        Bundle bundle = new Bundle();
        Bundle arguments = getArguments();
        bundle.putInt("index", C27039d.m66651k(arguments != null ? Integer.valueOf(RouteExKt.m56260m(arguments, "index")) : null, 0));
        Bundle arguments2 = getArguments();
        bundle.putString("symbol", arguments2 != null ? RouteExKt.m56284y(arguments2, "symbol") : null);
        Bundle arguments3 = getArguments();
        bundle.putString("fromSymbol", arguments3 != null ? RouteExKt.m56284y(arguments3, "fromSymbol") : null);
        Bundle arguments4 = getArguments();
        bundle.putString("side", arguments4 != null ? RouteExKt.m56284y(arguments4, "side") : null);
        bundle.putString("tradeType", "TRADE");
        Unit unit = Unit.INSTANCE;
        arrayList.add(companion.newInstance(bundle));
        C44659p0 c44659p0M60577k4 = m60577k3();
        if (c44659p0M60577k4 == null || (switchFragmentBar = c44659p0M60577k4.f99283b) == null) {
            return;
        }
        switchFragmentBar.m54803h(arrayList, getChildFragmentManager());
    }

    public DelegationBothFragment() {
        setPageId("B5orderList");
    }
}
