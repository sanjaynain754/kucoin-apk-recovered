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
class LineView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public SVGLength f12996b;

    /* JADX INFO: renamed from: c */
    public SVGLength f12997c;

    /* JADX INFO: renamed from: d */
    public SVGLength f12998d;

    /* JADX INFO: renamed from: e */
    public SVGLength f12999e;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f12996b);
        double dRelativeOnHeight = relativeOnHeight(this.f12997c);
        double dRelativeOnWidth2 = relativeOnWidth(this.f12998d);
        double dRelativeOnHeight2 = relativeOnHeight(this.f12999e);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<C9238f> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C9238f(ElementType.kCGPathElementMoveToPoint, new C9240h[]{new C9240h(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new C9238f(ElementType.kCGPathElementAddLineToPoint, new C9240h[]{new C9240h(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public LineView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: f */
    public void m14069f(Dynamic dynamic) {
        this.f12996b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m14070g(Dynamic dynamic) {
        this.f12998d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m14071h(Dynamic dynamic) {
        this.f12997c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m14072i(Dynamic dynamic) {
        this.f12999e = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
