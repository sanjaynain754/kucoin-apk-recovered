package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class RectView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public SVGLength f13055b;

    /* JADX INFO: renamed from: c */
    public SVGLength f13056c;

    /* JADX INFO: renamed from: d */
    public SVGLength f13057d;

    /* JADX INFO: renamed from: e */
    public SVGLength f13058e;

    /* JADX INFO: renamed from: f */
    public SVGLength f13059f;

    /* JADX INFO: renamed from: g */
    public SVGLength f13060g;

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d11;
        double d12;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f13055b);
        double dRelativeOnHeight2 = relativeOnHeight(this.f13056c);
        double dRelativeOnWidth3 = relativeOnWidth(this.f13057d);
        double dRelativeOnHeight3 = relativeOnHeight(this.f13058e);
        SVGLength sVGLength = this.f13059f;
        if (sVGLength == null && this.f13060g == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (sVGLength == null) {
                dRelativeOnWidth = relativeOnHeight(this.f13060g);
            } else {
                if (this.f13060g == null) {
                    dRelativeOnWidth = relativeOnWidth(sVGLength);
                } else {
                    dRelativeOnWidth = relativeOnWidth(sVGLength);
                    dRelativeOnHeight = relativeOnHeight(this.f13060g);
                }
                d11 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d11) {
                    dRelativeOnWidth = d11;
                }
                d12 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d12) {
                    dRelativeOnHeight = d12;
                }
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d11 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d11) {
                dRelativeOnWidth = d11;
            }
            d12 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d12) {
                dRelativeOnHeight = d12;
            }
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<C9238f> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C9238f(ElementType.kCGPathElementMoveToPoint, new C9240h[]{new C9240h(dRelativeOnWidth2, dRelativeOnHeight2)}));
        ArrayList<C9238f> arrayList2 = this.elements;
        ElementType elementType = ElementType.kCGPathElementAddLineToPoint;
        double d13 = dRelativeOnWidth3 + dRelativeOnWidth2;
        arrayList2.add(new C9238f(elementType, new C9240h[]{new C9240h(d13, dRelativeOnHeight2)}));
        double d14 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(d13, d14)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(dRelativeOnWidth2, d14)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public RectView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: f */
    public void m14115f(Dynamic dynamic) {
        this.f13058e = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m14116g(Dynamic dynamic) {
        this.f13059f = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m14117h(Dynamic dynamic) {
        this.f13060g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m14118i(Dynamic dynamic) {
        this.f13057d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m14119j(Dynamic dynamic) {
        this.f13055b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m14120k(Dynamic dynamic) {
        this.f13056c = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
