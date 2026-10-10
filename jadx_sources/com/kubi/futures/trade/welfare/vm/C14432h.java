package com.kubi.futures.trade.welfare.vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.futures.trade.submit.FuturesSubmitFragment;
import com.kubi.kumex.market.p091v2.KuMexSubmitBottomSheetFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.h */
/* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"findSelectFuturesWelfareViewModel", "Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectFuturesWelfareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n220#2,5:548\n1869#3:553\n1870#3:555\n1#4:554\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModelKt\n*L\n533#1:548,5\n535#1:553\n535#1:555\n*E\n"})
public final class C14432h {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final SelectFuturesWelfareViewModel m28810a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if ((fragment instanceof FuturesSubmitFragment) || (fragment instanceof KuMexSubmitBottomSheetFragment)) {
            return (SelectFuturesWelfareViewModel) new ViewModelProvider(fragment).get(SelectFuturesWelfareViewModel.class);
        }
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment2 : fragments) {
            Intrinsics.checkNotNull(fragment2);
            SelectFuturesWelfareViewModel selectFuturesWelfareViewModelM28810a = m28810a(fragment2);
            if (selectFuturesWelfareViewModelM28810a != null) {
                return selectFuturesWelfareViewModelM28810a;
            }
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return m28810a(parentFragment);
        }
        return null;
    }
}
