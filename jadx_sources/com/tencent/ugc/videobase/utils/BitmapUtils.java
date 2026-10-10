package com.tencent.ugc.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class BitmapUtils {
    public static Bitmap createBitmapFromBuffer(ByteBuffer byteBuffer, int i11, int i12) {
        try {
            byteBuffer.position(0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            LiteavLog.m76084e("BitmapUtils", "build bitmap failed.", th2);
            return null;
        }
    }

    public static Bitmap createBitmap(Bitmap bitmap, Matrix matrix, boolean z11) {
        if (bitmap == null) {
            return null;
        }
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!z11) {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, paint);
        return bitmapCreateBitmap;
    }
}
