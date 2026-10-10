package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class DefsView extends DefinitionView {
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    public DefsView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.DefinitionView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
    }
}
