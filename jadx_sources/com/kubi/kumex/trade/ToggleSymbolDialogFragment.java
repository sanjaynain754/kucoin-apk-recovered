package com.kubi.kumex.trade;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5286o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.market.p091v2.drawer.MarketContractDrawerFragment;
import com.kubi.kumex.market.tradingArea.ContractDrawerFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ToggleSymbolDialogFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/trade/ToggleSymbolDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "isMarket", "", "()Z", "isMarket$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ToggleSymbolDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f30439s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f30440q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.e5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ToggleSymbolDialogFragment.m36213m4(this.f30494b));
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f30441r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.f5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolDialogFragment.m36214n4(this.f30504b);
        }
    });

    /* JADX INFO: compiled from: ToggleSymbolDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/trade/ToggleSymbolDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/trade/ToggleSymbolDialogFragment;", "isMarket", "", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ToggleSymbolDialogFragment newInstance$default(Companion companion, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.newInstance(z11, str);
        }

        @NotNull
        public final ToggleSymbolDialogFragment newInstance(boolean isMarket, @Nullable String symbol) {
            ToggleSymbolDialogFragment toggleSymbolDialogFragment = new ToggleSymbolDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.fragment_futures_toggle_symbol);
            bundle.putBoolean("isBottomSheet", true);
            bundle.putBoolean("isMarket", isMarket);
            bundle.putString("symbol", symbol);
            toggleSymbolDialogFragment.setArguments(bundle);
            return toggleSymbolDialogFragment;
        }
    }

    private final boolean isMarket() {
        return ((Boolean) this.f30440q0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    private final String m36212l4() {
        return (String) this.f30441r0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment contractDrawerFragment = !isMarket() ? new ContractDrawerFragment() : MarketContractDrawerFragment.f29771j0.newInstance(m36212l4());
        int i11 = R$id.toggleContainer;
        C5286o.m6317a(childFragmentManager, contractDrawerFragment, i11);
        View viewFindViewById = view.findViewById(i11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66578i(viewFindViewById, (int) (C5267e0.m6182d() * 0.9f));
    }

    /* JADX INFO: renamed from: m4 */
    public static final boolean m36213m4(ToggleSymbolDialogFragment toggleSymbolDialogFragment) {
        Boolean boolValueOf;
        Bundle arguments = toggleSymbolDialogFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "isMarket"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m36214n4(ToggleSymbolDialogFragment toggleSymbolDialogFragment) {
        String strM56284y;
        Bundle arguments = toggleSymbolDialogFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "symbol");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
        }
    }
}
