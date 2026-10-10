package com.kubi.kumex.trade.menu.p092vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.trade.menu.vm.a */
/* JADX INFO: compiled from: AnnouncementViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"findAnnouncementViewModel", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnnouncementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,89:1\n220#2,5:90\n*S KotlinDebug\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModelKt\n*L\n88#1:90,5\n*E\n"})
public final class C16943a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AnnouncementViewModel m36402a(@NotNull Fragment fragment) {
        AnnouncementViewModel announcementViewModelM36402a;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Fragment parentFragment = fragment.getParentFragment();
        return (parentFragment == null || (announcementViewModelM36402a = m36402a(parentFragment)) == null) ? (AnnouncementViewModel) new ViewModelProvider(fragment).get(AnnouncementViewModel.class) : announcementViewModelM36402a;
    }
}
