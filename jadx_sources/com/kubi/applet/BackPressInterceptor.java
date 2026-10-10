package com.kubi.applet;

import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.applet.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/applet/BackPressInterceptor;", "", "<init>", "()V", "interceptedActivities", "", "", "getKey", "activity", "Landroidx/fragment/app/FragmentActivity;", "markIntercepted", "", "isIntercepted", "", "clearIntercepted", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BackPressInterceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BackPressInterceptor f16310a = new BackPressInterceptor();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f16311b = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final void m15085a(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f16311b.remove(m15086b(activity));
    }

    /* JADX INFO: renamed from: b */
    public final String m15086b(FragmentActivity fragmentActivity) {
        return fragmentActivity.getClass().getName() + fragmentActivity.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15087c(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return f16311b.contains(m15086b(activity));
    }

    /* JADX INFO: renamed from: d */
    public final void m15088d(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f16311b.add(m15086b(activity));
    }
}
