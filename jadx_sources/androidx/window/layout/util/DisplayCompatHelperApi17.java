package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DisplayCompatHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(17)
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m90084d2 = {"Landroidx/window/layout/util/DisplayCompatHelperApi17;", "", "()V", "getRealSize", "", "display", "Landroid/view/Display;", "point", "Landroid/graphics/Point;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DisplayCompatHelperApi17 {

    @NotNull
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    public final void getRealSize(@NotNull Display display, @NotNull Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }

    private DisplayCompatHelperApi17() {
    }
}
