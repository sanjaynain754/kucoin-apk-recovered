package com.kubi.kumex.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.s */
/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"isInActive", "", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17067s {
    /* JADX INFO: renamed from: a */
    public static final boolean m36608a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (fragment.isAdded()) {
            return fragment.isDetached() && fragment.isRemoving() && fragment.getLifecycle().getState() == Lifecycle.State.DESTROYED;
        }
        return true;
    }
}
