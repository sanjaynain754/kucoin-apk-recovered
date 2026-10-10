package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeMergeView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public ReadableArray f12949d;

    /* JADX INFO: renamed from: n */
    public void m14019n(ReadableArray readableArray) {
        this.f12949d = readableArray;
        invalidate();
    }

    public FeMergeView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f12949d.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = this.f12949d.getString(i11);
            if (string.isEmpty()) {
                bitmap2 = bitmap;
            } else {
                bitmap2 = map.get(string);
            }
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
