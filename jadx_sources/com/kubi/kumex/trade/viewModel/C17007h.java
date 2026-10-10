package com.kubi.kumex.trade.viewModel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.kumex.trade.FuturesFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.trade.viewModel.h */
/* JADX INFO: compiled from: OrdersNumViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"findFuturesOrdersNumViewModel", "Lcom/kubi/kumex/trade/viewModel/OrdersNumViewModel;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrdersNumViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersNumViewModel.kt\ncom/kubi/kumex/trade/viewModel/OrdersNumViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,156:1\n220#2,5:157\n220#2,5:162\n*S KotlinDebug\n*F\n+ 1 OrdersNumViewModel.kt\ncom/kubi/kumex/trade/viewModel/OrdersNumViewModelKt\n*L\n152#1:157,5\n154#1:162,5\n*E\n"})
public final class C17007h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final OrdersNumViewModel m36432a(@NotNull Fragment fragment) {
        OrdersNumViewModel ordersNumViewModelM36432a;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (fragment instanceof FuturesFragment) {
            return (OrdersNumViewModel) new ViewModelProvider(fragment).get(OrdersNumViewModel.class);
        }
        Fragment parentFragment = fragment.getParentFragment();
        return (parentFragment == null || (ordersNumViewModelM36432a = m36432a(parentFragment)) == null) ? (OrdersNumViewModel) new ViewModelProvider(fragment).get(OrdersNumViewModel.class) : ordersNumViewModelM36432a;
    }
}
