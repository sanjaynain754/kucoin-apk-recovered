package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes.dex */
public class MaterialShapeUtils {
    public static void setParentAbsoluteElevation(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(view, (MaterialShapeDrawable) background);
        }
    }

    @NonNull
    public static CornerTreatment createCornerTreatment(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? createDefaultCornerTreatment() : new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    @NonNull
    public static CornerTreatment createDefaultCornerTreatment() {
        return new RoundedCornerTreatment();
    }

    @NonNull
    public static EdgeTreatment createDefaultEdgeTreatment() {
        return new EdgeTreatment();
    }

    private MaterialShapeUtils() {
    }

    public static void setElevation(@NonNull View view, float f11) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f11);
        }
    }

    public static void setParentAbsoluteElevation(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view));
        }
    }
}
