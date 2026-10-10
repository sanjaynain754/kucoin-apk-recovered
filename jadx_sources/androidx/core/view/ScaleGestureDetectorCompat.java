package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes23.dex */
public final class ScaleGestureDetectorCompat {
    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z11) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z11);
    }

    @ReplaceWith(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @ReplaceWith(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z11) {
        scaleGestureDetector.setQuickScaleEnabled(z11);
    }

    private ScaleGestureDetectorCompat() {
    }
}
