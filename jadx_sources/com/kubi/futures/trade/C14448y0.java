package com.kubi.futures.trade;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.kumex.market.p091v2.KuMexSubmitBottomSheetFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.trade.y0 */
/* JADX INFO: compiled from: FuturesTradeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"findFuturesTradeViewModel", "Lcom/kubi/futures/trade/FuturesTradeViewModel;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,596:1\n220#2,5:597\n220#2,5:602\n*S KotlinDebug\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModelKt\n*L\n591#1:597,5\n593#1:602,5\n*E\n"})
public final class C14448y0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final FuturesTradeViewModel m28812a(@NotNull Fragment fragment) {
        FuturesTradeViewModel futuresTradeViewModelM28812a;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if ((fragment instanceof FuturesTradeFragment) || (fragment instanceof KuMexSubmitBottomSheetFragment)) {
            return (FuturesTradeViewModel) new ViewModelProvider(fragment).get(FuturesTradeViewModel.class);
        }
        Fragment parentFragment = fragment.getParentFragment();
        return (parentFragment == null || (futuresTradeViewModelM28812a = m28812a(parentFragment)) == null) ? (FuturesTradeViewModel) new ViewModelProvider(fragment).get(FuturesTradeViewModel.class) : futuresTradeViewModelM28812a;
    }
}
