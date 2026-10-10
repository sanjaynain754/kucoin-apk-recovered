package com.kubi.search.lifecycle;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.search.utils.SearchExKt;
import ky.InterfaceC42005d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchMainActLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/search/lifecycle/SearchMainActLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "loadData", "Landroidx/fragment/app/FragmentActivity;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchMainActLifecycle implements InterfaceC42005d {
    /* JADX INFO: renamed from: a */
    public final void m59125a(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LifecycleOwnerKt.getLifecycleScope(activity).launchWhenResumed(new SearchMainActLifecycle$loadData$1(null));
        SearchExKt.m59510D(LifecycleOwnerKt.getLifecycleScope(activity), new SearchMainActLifecycle$loadData$2(null));
    }

    @Override // ky.InterfaceC42005d
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityResumed(activity);
        if ((activity instanceof IMainActivity) && (activity instanceof FragmentActivity)) {
            m59125a((FragmentActivity) activity);
        }
    }
}
