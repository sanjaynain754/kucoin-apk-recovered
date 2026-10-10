package androidx.window.layout.util;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(28)
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, m90084d2 = {"Landroidx/window/layout/util/DisplayCompatHelperApi28;", "", "()V", "safeInsetBottom", "", "displayCutout", "Landroid/view/DisplayCutout;", "safeInsetLeft", "safeInsetRight", "safeInsetTop", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DisplayCompatHelperApi28 {

    @NotNull
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    public final int safeInsetBottom(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int safeInsetLeft(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetRight(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetTop(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }

    private DisplayCompatHelperApi28() {
    }
}
