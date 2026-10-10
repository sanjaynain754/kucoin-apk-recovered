package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.blankj.utilcode.util.q */
/* JADX INFO: compiled from: ImageUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5290q {
    /* JADX INFO: renamed from: f */
    public static Bitmap m6355f(byte[] bArr, int i11) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i11, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m6350a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m6351b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(C5287o0.m6331a().getResources(), bitmap);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m6352c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6356g(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6359j(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return m6360k(bitmap, str, compressFormat, 100, false);
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m6362m(View view) {
        Bitmap bitmapCreateBitmap;
        if (view == null) {
            return null;
        }
        boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean zWillNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache2);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                view.draw(new Canvas(bitmapCreateBitmap));
            }
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
        }
        view.destroyDrawingCache();
        view.setWillNotCacheDrawing(zWillNotCacheDrawing);
        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m6353d(byte[] bArr) {
        return m6351b(m6352c(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m6354e(@DrawableRes int i11) {
        Drawable drawable = ContextCompat.getDrawable(C5287o0.m6331a(), i11);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m6357h(Bitmap bitmap, int i11, float f11, float f12, boolean z11) {
        if (m6356g(bitmap)) {
            return null;
        }
        if (i11 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i11, f11, f12);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z11 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6358i(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i11, boolean z11) throws Throwable {
        boolean zCompress = false;
        if (m6356g(bitmap)) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        if (!C5299u0.m6481d(file)) {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        zCompress = bitmap.compress(compressFormat, i11, bufferedOutputStream2);
                        if (z11 && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        bufferedOutputStream2.close();
                    } catch (IOException e11) {
                        e = e11;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        return zCompress;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return zCompress;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6360k(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i11, boolean z11) {
        return m6358i(bitmap, C5299u0.m6495r(str), compressFormat, i11, z11);
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m6361l(Bitmap bitmap, int i11, int i12, boolean z11) {
        if (m6356g(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        if (z11 && !bitmap.isRecycled() && bitmapCreateScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }
}
