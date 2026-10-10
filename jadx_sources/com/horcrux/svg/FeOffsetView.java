package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeOffsetView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public String f12950d;

    /* JADX INFO: renamed from: e */
    public SVGLength f12951e;

    /* JADX INFO: renamed from: f */
    public SVGLength f12952f;

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapM14023h = FilterPrimitiveView.m14023h(map, bitmap, this.f12950d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.f12951e;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f12952f;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapM14023h, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: p */
    public void m14022p(String str) {
        this.f12950d = str;
        invalidate();
    }

    public FeOffsetView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: n */
    public void m14020n(Dynamic dynamic) {
        this.f12951e = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m14021o(Dynamic dynamic) {
        this.f12952f = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
