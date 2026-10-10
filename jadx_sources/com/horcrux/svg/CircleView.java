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
class CircleView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public SVGLength f12918b;

    /* JADX INFO: renamed from: c */
    public SVGLength f12919c;

    /* JADX INFO: renamed from: d */
    public SVGLength f12920d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f12918b);
        double dRelativeOnHeight = relativeOnHeight(this.f12919c);
        double dRelativeOnOther = relativeOnOther(this.f12920d);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<C9238f> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d11 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new C9238f(ElementType.kCGPathElementMoveToPoint, new C9240h[]{new C9240h(dRelativeOnWidth, d11)}));
        ArrayList<C9238f> arrayList2 = this.elements;
        ElementType elementType = ElementType.kCGPathElementAddLineToPoint;
        double d12 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new C9238f(elementType, new C9240h[]{new C9240h(dRelativeOnWidth, d11), new C9240h(d12, dRelativeOnHeight)}));
        double d13 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(d12, dRelativeOnHeight), new C9240h(dRelativeOnWidth, d13)}));
        ArrayList<C9238f> arrayList3 = this.elements;
        C9240h c9240h = new C9240h(dRelativeOnWidth, d13);
        double d14 = dRelativeOnWidth - dRelativeOnOther;
        arrayList3.add(new C9238f(elementType, new C9240h[]{c9240h, new C9240h(d14, dRelativeOnHeight)}));
        this.elements.add(new C9238f(elementType, new C9240h[]{new C9240h(d14, dRelativeOnHeight), new C9240h(dRelativeOnWidth, d11)}));
        return path;
    }

    public CircleView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: f */
    public void m13988f(Dynamic dynamic) {
        this.f12918b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m13989g(Dynamic dynamic) {
        this.f12919c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m13990h(Dynamic dynamic) {
        this.f12920d = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
