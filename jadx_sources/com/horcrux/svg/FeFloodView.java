package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeFloodView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: f */
    public static final Pattern f12942f = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: d */
    public ReadableArray f12943d;

    /* JADX INFO: renamed from: e */
    public float f12944e;

    public final void setupPaint(Paint paint, float f11, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f11) * 255.0d : f11 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
            paint.setColor((Math.round((iIntValue >>> 24) * f11) << 24) | (iIntValue & 16777215));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14011n(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f12943d = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            m14012o(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i11 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f12943d = JavaOnlyArray.m10207of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f12943d = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f12942f.matcher(dynamic.asString());
            while (matcher.find()) {
                double d11 = Double.parseDouble(matcher.group());
                int i12 = i11 + 1;
                if (i11 < 3) {
                    d11 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d11);
                i11 = i12;
            }
            this.f12943d = javaOnlyArray;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m14012o(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f12943d = null;
            invalidate();
            return;
        }
        int i11 = readableMap.getInt("type");
        if (i11 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f12943d = JavaOnlyArray.m10207of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f12943d = JavaOnlyArray.m10207of(0, readableMap.getMap("payload"));
            }
        } else if (i11 == 1) {
            this.f12943d = JavaOnlyArray.m10207of(1, readableMap.getString("brushRef"));
        } else {
            this.f12943d = JavaOnlyArray.m10207of(Integer.valueOf(i11));
        }
        invalidate();
    }

    /* JADX INFO: renamed from: p */
    public void m14013p(float f11) {
        this.f12944e = f11;
        invalidate();
    }

    public FeFloodView(ReactContext reactContext) {
        super(reactContext);
        this.f12944e = 1.0f;
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f12944e, this.f12943d);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }
}
