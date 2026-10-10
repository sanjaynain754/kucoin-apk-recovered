package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class PathView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public Path f13029b;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f13029b;
    }

    public PathView(ReactContext reactContext) {
        super(reactContext);
        C9239g.f13228a = this.mScale;
        this.f13029b = new Path();
    }

    /* JADX INFO: renamed from: f */
    public void m14097f(String str) {
        this.f13029b = C9239g.m14254o(str);
        ArrayList<C9238f> arrayList = C9239g.f13233f;
        this.elements = arrayList;
        Iterator<C9238f> it = arrayList.iterator();
        while (it.hasNext()) {
            for (C9240h c9240h : it.next().f13227b) {
                double d11 = c9240h.f13241a;
                float f11 = this.mScale;
                c9240h.f13241a = d11 * ((double) f11);
                c9240h.f13242b *= (double) f11;
            }
        }
        invalidate();
    }
}
