package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.annotation.IntRange;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ViewPorts {
    private static RectF correctStartOrEnd(boolean z11, @IntRange(from = 0, m1553to = 359) int i11, RectF rectF, RectF rectF2) {
        boolean z12 = false;
        boolean z13 = i11 == 0 && !z11;
        boolean z14 = i11 == 90 && z11;
        if (z13 || z14) {
            return rectF2;
        }
        boolean z15 = i11 == 0 && z11;
        boolean z16 = i11 == 270 && !z11;
        if (z15 || z16) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z17 = i11 == 90 && !z11;
        boolean z18 = i11 == 180 && z11;
        if (z17 || z18) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z19 = i11 == 180 && !z11;
        if (i11 == 270 && z11) {
            z12 = true;
        }
        if (z19 || z12) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z11 + " rotation " + i11);
    }

    private static float flipX(float f11, float f12) {
        return (f12 + f12) - f11;
    }

    private static float flipY(float f11, float f12) {
        return (f12 + f12) - f11;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(RectF rectF, Rational rational, int i11, boolean z11, int i12, @IntRange(from = 0, m1553to = 359) int i13) {
        if (i11 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i11 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i11 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i11);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z11, i12), i13, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z11, int i11) {
        return z11 ^ (i11 == 1);
    }

    private static RectF flipHorizontally(RectF rectF, float f11) {
        return new RectF(flipX(rectF.right, f11), rectF.top, flipX(rectF.left, f11), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f11) {
        return new RectF(rectF.left, flipY(rectF.bottom, f11), rectF.right, flipY(rectF.top, f11));
    }

    private ViewPorts() {
    }

    public static Map<UseCase, Rect> calculateViewPortRects(Rect rect, boolean z11, Rational rational, @IntRange(from = 0, m1553to = 359) int i11, int i12, int i13, Map<UseCase, StreamSpec> map) {
        boolean z12;
        if (rect.width() > 0 && rect.height() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkArgument(z12, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i11, rational), i12, z11, i13, i11);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }
}
