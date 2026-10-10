package com.kubi.monitor.helper;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.monitor.helper.b */
/* JADX INFO: compiled from: FragmentLifecycleMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/monitor/helper/b;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Context;", "context", "", "onFragmentAttached", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V", "onFragmentDetached", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "Landroid/os/Bundle;", "savedInstanceState", "onFragmentCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "onFragmentStarted", "onFragmentResumed", "onFragmentPaused", "onFragmentStopped", "onFragmentViewDestroyed", "onFragmentDestroyed", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19224b extends FragmentManager.FragmentLifecycleCallbacks {
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, "context");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.attached", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.created", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.destroyed", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.detached", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.paused", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.resumed", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.started", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.stopped", "ui.fragment.lifecycle");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C43840a.m96550d("LCA: " + C19227e.m42479b(fragment) + " fmt.view destroyed", "ui.fragment.lifecycle");
    }
}
