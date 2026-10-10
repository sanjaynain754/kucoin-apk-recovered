package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.view.TransformExperimental;

/* JADX INFO: loaded from: classes23.dex */
@TransformExperimental
public final class OutputTransform {
    final Matrix mMatrix;
    final Size mViewPortSize;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public Size getViewPortSize() {
        return this.mViewPortSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OutputTransform(Matrix matrix, Size size) {
        this.mMatrix = matrix;
        this.mViewPortSize = size;
    }
}
