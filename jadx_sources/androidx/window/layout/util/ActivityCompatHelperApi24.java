package androidx.window.layout.util;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityCompatHelperApi24.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(24)
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Landroidx/window/layout/util/ActivityCompatHelperApi24;", "", "()V", "isInMultiWindowMode", "", "activity", "Landroid/app/Activity;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityCompatHelperApi24 {

    @NotNull
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    public final boolean isInMultiWindowMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.isInMultiWindowMode();
    }

    private ActivityCompatHelperApi24() {
    }
}
