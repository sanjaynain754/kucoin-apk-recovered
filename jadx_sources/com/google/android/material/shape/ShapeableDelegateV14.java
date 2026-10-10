package com.google.android.material.shape;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
class ShapeableDelegateV14 extends ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return true;
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@NonNull View view) {
        if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
            return;
        }
        view.invalidate();
    }
}
