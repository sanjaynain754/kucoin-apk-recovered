package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FilterView extends DefinitionView {

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Bitmap> f12970b;

    /* JADX INFO: renamed from: c */
    public FilterProperties$Units f12971c;

    /* JADX INFO: renamed from: d */
    public FilterProperties$Units f12972d;

    /* JADX INFO: renamed from: e */
    public final FilterRegion f12973e;

    /* JADX INFO: renamed from: f */
    public Bitmap m14035f(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f12970b.clear();
        this.f12970b.put("SourceGraphic", bitmap);
        this.f12970b.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f12970b.put("BackgroundImage", bitmap2);
        this.f12970b.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect cropRect = this.f12973e.getCropRect(this, this.f12971c, rectF);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof FilterPrimitiveView) {
                FilterPrimitiveView filterPrimitiveView = (FilterPrimitiveView) childAt;
                bitmapCreateBitmap.eraseColor(0);
                FilterRegion filterRegion = filterPrimitiveView.f12954c;
                FilterProperties$Units filterProperties$Units = this.f12972d;
                Rect cropRect2 = filterRegion.getCropRect(filterPrimitiveView, filterProperties$Units, filterProperties$Units == FilterProperties$Units.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(filterPrimitiveView.mo13997f(this.f12970b, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strM14024g = filterPrimitiveView.m14024g();
                if (strM14024g != null) {
                    this.f12970b.put(strM14024g, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: h */
    public void m14037h(Dynamic dynamic) {
        this.f12973e.setHeight(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m14039j(Dynamic dynamic) {
        this.f12973e.setWidth(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m14040k(Dynamic dynamic) {
        this.f12973e.setX(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m14041l(Dynamic dynamic) {
        this.f12973e.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }

    public FilterView(ReactContext reactContext) {
        super(reactContext);
        this.f12970b = new HashMap<>();
        this.f12973e = new FilterRegion();
    }

    /* JADX INFO: renamed from: g */
    public void m14036g(String str) {
        this.f12971c = FilterProperties$Units.getEnum(str);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m14038i(String str) {
        this.f12972d = FilterProperties$Units.getEnum(str);
        invalidate();
    }
}
