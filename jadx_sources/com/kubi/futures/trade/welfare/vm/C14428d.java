package com.kubi.futures.trade.welfare.vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.d */
/* JADX INFO: compiled from: FuturesTrialViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"findTrialViewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,305:1\n220#2,5:306\n*S KotlinDebug\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModelKt\n*L\n304#1:306,5\n*E\n"})
public final class C14428d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final FuturesTrialViewModel m28809a(@NotNull Fragment fragment) {
        FuturesTrialViewModel futuresTrialViewModelM28809a;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        return (parentFragment == null || (futuresTrialViewModelM28809a = m28809a(parentFragment)) == null) ? (FuturesTrialViewModel) new ViewModelProvider(fragment).get(FuturesTrialViewModel.class) : futuresTrialViewModelM28809a;
    }
}
