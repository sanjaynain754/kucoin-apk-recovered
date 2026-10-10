package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeGaussianBlurView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public String f12945d;

    /* JADX INFO: renamed from: e */
    public float f12946e;

    /* JADX INFO: renamed from: f */
    public float f12947f;

    /* JADX INFO: renamed from: g */
    public FilterProperties$EdgeMode f12948g;

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return m14014n(getContext(), FilterPrimitiveView.m14023h(map, bitmap, this.f12945d));
    }

    /* JADX INFO: renamed from: n */
    public final Bitmap m14014n(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f12946e, this.f12947f) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* JADX INFO: renamed from: p */
    public void m14016p(String str) {
        this.f12945d = str;
        invalidate();
    }

    /* JADX INFO: renamed from: q */
    public void m14017q(float f11) {
        this.f12946e = f11;
        invalidate();
    }

    /* JADX INFO: renamed from: r */
    public void m14018r(float f11) {
        this.f12947f = f11;
        invalidate();
    }

    public FeGaussianBlurView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: o */
    public void m14015o(String str) {
        this.f12948g = FilterProperties$EdgeMode.getEnum(str);
        invalidate();
    }
}
