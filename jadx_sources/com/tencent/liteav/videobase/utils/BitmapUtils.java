package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class BitmapUtils {
    public static Bitmap createBitmap(Bitmap bitmap, Matrix matrix, boolean z11) {
        if (bitmap == null) {
            return null;
        }
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        try {
            if (!z11) {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, paint);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            LiteavLog.m76084e("BitmapUtils", "build bitmap failed.", th2);
            return null;
        }
    }

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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap createBitmapFromFile(String str, int i11, int i12) {
        int i13;
        try {
            int i14 = 1;
            int i15 = 0;
            switch (new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1)) {
                case 1:
                    i14 = 0;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 2:
                    i13 = i15;
                    i15 = i14;
                    break;
                case 3:
                    i14 = 0;
                    i15 = 180;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 4:
                    i15 = 180;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 5:
                    i15 = 270;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 6:
                    i14 = 0;
                    i15 = 90;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 7:
                    i15 = 90;
                    i13 = i15;
                    i15 = i14;
                    break;
                case 8:
                    i14 = 0;
                    i15 = 270;
                    i13 = i15;
                    i15 = i14;
                    break;
                default:
                    i13 = 0;
                    break;
            }
            Matrix matrix = new Matrix();
            if (i15 != 0) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (i13 != 0) {
                matrix.postRotate(i13);
            }
            Bitmap bitmapLoadBitmapFile = loadBitmapFile(str, i11, i12, i13);
            return Bitmap.createBitmap(bitmapLoadBitmapFile, 0, 0, bitmapLoadBitmapFile.getWidth(), bitmapLoadBitmapFile.getHeight(), matrix, true);
        } catch (Throwable th2) {
            LiteavLog.m76084e("BitmapUtils", "build bitmap failed, path: ".concat(String.valueOf(str)), th2);
            return null;
        }
    }

    private static Bitmap loadBitmapFile(String str, int i11, int i12, int i13) throws Throwable {
        if (i11 <= 0 || i12 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i14 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        boolean z11 = i13 == 90 || i13 == 270;
        int i15 = z11 ? options.outHeight : options.outWidth;
        int i16 = z11 ? options.outWidth : options.outHeight;
        if (i15 > i11 || i16 > i12) {
            int i17 = i15 / ((i11 / 2) + 1);
            int i18 = i16 / ((i12 / 2) + 1);
            i14 = i18 > i17 ? i17 : i18;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void saveBitmapToFile(Bitmap bitmap, String str) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    C34741f.m76109a(fileOutputStream2);
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    LiteavLog.m76084e("BitmapUtils", "save jpg file failed.", e);
                    C34741f.m76109a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    C34741f.m76109a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
