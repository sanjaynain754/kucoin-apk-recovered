package ky;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ky.e */
/* JADX INFO: compiled from: IFragmentLifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/delegate/IFragmentLifecycle;", "", "onFragmentAttached", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "onFragmentCreated", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentActivityCreated", "onFragmentViewCreated", "v", "Landroid/view/View;", "onFragmentStarted", "onFragmentResumed", "onFragmentPaused", "onFragmentStopped", "onFragmentSaveInstanceState", "outState", "onFragmentViewDestroyed", "onFragmentDestroyed", "onFragmentDetached", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42006e {
    /* JADX INFO: renamed from: a */
    default void m92082a(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    /* JADX INFO: renamed from: b */
    default void m92083b(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: c */
    default void m92084c(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: d */
    default void m92085d(@NotNull FragmentManager fm2, @NotNull Fragment f11, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: e */
    default void m92086e(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: f */
    default void m92087f(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    default void m92088g(@NotNull FragmentManager fm2, @NotNull Fragment f11, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: h */
    default void m92089h(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: i */
    default void m92090i(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull View v11, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(v11, "v");
    }

    /* JADX INFO: renamed from: j */
    default void m92091j(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: k */
    default void m92092k(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }

    /* JADX INFO: renamed from: l */
    default void m92093l(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
    }
}
