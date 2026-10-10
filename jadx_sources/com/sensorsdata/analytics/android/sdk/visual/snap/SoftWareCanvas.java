package com.sensorsdata.analytics.android.sdk.visual.snap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.WeakSet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;

/* JADX INFO: loaded from: classes59.dex */
public class SoftWareCanvas extends Canvas {
    private static final String TAG = "SA.SoftWareCanvas";
    private WeakSet<Bitmap> bitmapWeakSet;
    private Bitmap mBitmap;

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f11, float f12, Paint paint) {
        Bitmap bitmapDrawOnSFCanvas = drawOnSFCanvas(bitmap);
        if (bitmapDrawOnSFCanvas.getDensity() == this.mBitmap.getDensity()) {
            super.drawBitmap(bitmapDrawOnSFCanvas, f11, f12, replaceBitmapShader(paint));
            return;
        }
        int i11 = (int) f11;
        int i12 = (int) f12;
        Rect rect = new Rect(i11, i12, bitmapDrawOnSFCanvas.getWidth() + i11, bitmapDrawOnSFCanvas.getHeight() + i12);
        super.drawBitmap(bitmapDrawOnSFCanvas, rect, rect, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i11, int i12, Paint paint) {
        super.drawLines(fArr, i11, i12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        super.drawOval(rectF, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i11, int i12, Paint paint) {
        super.drawPoints(fArr, i11, i12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i11, int i12, float[] fArr, Paint paint) {
        super.drawPosText(cArr, i11, i12, fArr, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        super.drawRect(rectF, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f11, float f12, Paint paint) {
        super.drawRoundRect(rectF, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i11, int i12, float f11, float f12, Paint paint) {
        super.drawText(cArr, i11, i12, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i11, int i12, Path path, float f11, float f12, Paint paint) {
        super.drawTextOnPath(cArr, i11, i12, path, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i11) {
        return super.saveLayer(rectF, replaceBitmapShader(paint), i11);
    }

    private Bitmap drawOnSFCanvas(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            return bitmap;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.bitmapWeakSet.add(bitmapCopy);
        return bitmapCopy;
    }

    private Paint replaceBitmapShader(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26 && (paint.getShader() instanceof BitmapShader)) {
            Paint paint2 = new Paint(paint);
            BitmapShader bitmapShader = (BitmapShader) paint2.getShader();
            try {
                Field field = BitmapShader.class.getField("mBitmap");
                field.setAccessible(true);
                if (((Bitmap) field.get(bitmapShader)).getConfig() == Bitmap.Config.HARDWARE) {
                    Field declaredField = BitmapShader.class.getDeclaredField("mTileX");
                    Field declaredField2 = BitmapShader.class.getDeclaredField("mTileY");
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    Bitmap bitmapCopy = ((Bitmap) field.get(bitmapShader)).copy(Bitmap.Config.ARGB_8888, false);
                    this.bitmapWeakSet.add(bitmapCopy);
                    Class cls = Integer.TYPE;
                    Constructor declaredConstructor = BitmapShader.class.getDeclaredConstructor(Bitmap.class, cls, cls);
                    declaredConstructor.setAccessible(true);
                    BitmapShader bitmapShader2 = (BitmapShader) declaredConstructor.newInstance(bitmapCopy, declaredField.get(bitmapShader), declaredField2.get(bitmapShader));
                    Matrix matrix = new Matrix();
                    paint.getShader().getLocalMatrix(matrix);
                    bitmapShader2.setLocalMatrix(matrix);
                    paint2.setShader(bitmapShader2);
                    return paint2;
                }
            } catch (Exception e11) {
                SALog.m68589i(TAG, e11.toString());
            }
        }
        return paint;
    }

    public void destroy() {
        Iterator<Bitmap> it = this.bitmapWeakSet.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        this.bitmapWeakSet.clear();
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        super.drawLines(fArr, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f11, float f12, float f13, float f14, Paint paint) {
        super.drawOval(f11, f12, f13, f14, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        super.drawPoints(fArr, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        super.drawPosText(str, fArr, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        super.drawRect(rect, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, Paint paint) {
        super.drawRoundRect(f11, f12, f13, f14, f15, f16, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f11, float f12, Paint paint) {
        super.drawText(str, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f11, float f12, Paint paint) {
        super.drawTextOnPath(str, path, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        return super.saveLayer(rectF, replaceBitmapShader(paint));
    }

    public SoftWareCanvas(Bitmap bitmap) {
        super(bitmap);
        this.bitmapWeakSet = new WeakSet<>();
        this.mBitmap = bitmap;
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f11, float f12, boolean z11, Paint paint) {
        super.drawArc(rectF, f11, f12, z11, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i11, int i12, float[] fArr, int i13, int[] iArr, int i14, Paint paint) {
        super.drawBitmapMesh(drawOnSFCanvas(bitmap), i11, i12, fArr, i13, iArr, i14, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f11, float f12, float f13, Paint paint) {
        super.drawCircle(f11, f12, f13, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f11, float f12, float f13, float f14, Paint paint) {
        super.drawLine(f11, f12, f13, f14, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        super.drawPaint(replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        super.drawPath(path, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f11, float f12, Paint paint) {
        super.drawPoint(f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f11, float f12, float f13, float f14, Paint paint) {
        super.drawRect(f11, f12, f13, f14, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i11, int i12, float f11, float f12, Paint paint) {
        super.drawText(str, i11, i12, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f11, float f12, float f13, float f14, Paint paint, int i11) {
        return super.saveLayer(f11, f12, f13, f14, replaceBitmapShader(paint), i11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        super.setBitmap(drawOnSFCanvas(bitmap));
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i11, int i12, float f11, float f12, Paint paint) {
        super.drawText(charSequence, i11, i12, f11, f12, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f11, float f12, float f13, float f14, Paint paint) {
        return super.saveLayer(f11, f12, f13, f14, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        super.drawBitmap(drawOnSFCanvas(bitmap), rect, rectF, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        super.drawBitmap(drawOnSFCanvas(bitmap), rect, rect2, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i11, int i12, float f11, float f12, int i13, int i14, boolean z11, Paint paint) {
        super.drawBitmap(iArr, i11, i12, f11, f12, i13, i14, z11, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Paint paint) {
        super.drawBitmap(iArr, i11, i12, i13, i14, i15, i16, z11, replaceBitmapShader(paint));
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        super.drawBitmap(drawOnSFCanvas(bitmap), matrix, replaceBitmapShader(paint));
    }
}
