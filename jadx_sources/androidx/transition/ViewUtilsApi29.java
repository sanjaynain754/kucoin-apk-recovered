package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(29)
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19
    public float getTransitionAlpha(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsApi19
    public void setLeftTopRightBottom(@NonNull View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionAlpha(@NonNull View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(@NonNull View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
