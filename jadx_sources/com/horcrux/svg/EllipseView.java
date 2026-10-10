package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class EllipseView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public SVGLength f12922b;

    /* JADX INFO: renamed from: c */
    public SVGLength f12923c;

    /* JADX INFO: renamed from: d */
    public SVGLength f12924d;

    /* JADX INFO: renamed from: e */
    public SVGLength f12925e;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f12922b);
        double dRelativeOnHeight = relativeOnHeight(this.f12923c);
        double dRelativeOnWidth2 = relativeOnWidth(this.f12924d);
        double dRelativeOnHeight2 = relativeOnHeight(this.f12925e);
        double d11 = dRelativeOnWidth - dRelativeOnWidth2;
        double d12 = dRelativeOnHeight - dRelativeOnHeight2;
        double d13 = dRelativeOnWidth + dRelativeOnWidth2;
        double d14 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d11, (float) d12, (float) d13, (float) d14), Path.Direction.CW);
        ArrayList<C9238f> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C9238f(ElementType.kCGPathElementMoveToPoint, new C9240h[]{new C9240h(dRelativeOnWidth, d12)}));
        ArrayList<C9238f> arrayList2 = this.elements;
        ElementType elementType = ElementType.kCGPathElementAddLineToPoint;
        arrayList2.add(new C9238f(elementType, new C9240h[]{new C9240h(dRelativeOnWidth, d12), new C9240h(d13, dRelativeOnHeight)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(d13, dRelativeOnHeight), new C9240h(dRelativeOnWidth, d14)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(dRelativeOnWidth, d14), new C9240h(d11, dRelativeOnHeight)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(d11, dRelativeOnHeight), new C9240h(dRelativeOnWidth, d12)}));
        return path;
    }

    public EllipseView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: f */
    public void m13992f(Dynamic dynamic) {
        this.f12922b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m13993g(Dynamic dynamic) {
        this.f12923c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m13994h(Dynamic dynamic) {
        this.f12924d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m13995i(Dynamic dynamic) {
        this.f12925e = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
