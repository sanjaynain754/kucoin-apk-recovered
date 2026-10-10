package p387k;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes23.dex */
public class C40826a {

    /* JADX INFO: renamed from: a */
    public static Bitmap.Config f90694a = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: b */
    public static Integer f90695b = null;

    /* JADX INFO: renamed from: c */
    public static Integer f90696c = null;

    /* JADX INFO: renamed from: j */
    public static Bitmap m89324j(Bitmap bitmap, float f11) {
        if (f11 == 0.0f) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m89315a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m89316b(byte[] bArr, BitmapFactory.Options options) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Bitmap bitmap = (Bitmap) new SoftReference(BitmapFactory.decodeStream(byteArrayInputStream, null, options)).get();
        try {
            byteArrayInputStream.close();
        } catch (Exception unused) {
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m89317c(ByteArrayOutputStream byteArrayOutputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = f90694a;
        return m89318d(byteArrayOutputStream, options);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m89319e(Bitmap bitmap, boolean z11, int i11) {
        if (z11) {
            i11 -= 180;
        }
        return m89324j(bitmap, i11);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m89320f(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public static int m89321g() {
        if (f90695b == null) {
            f90695b = Integer.valueOf(C40828c.m89330d());
        }
        return f90695b.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m89323i(byte[] bArr, int i11, int i12, int i13, boolean z11, boolean z12) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 80, byteArrayOutputStream);
        Bitmap bitmapM89317c = m89317c(byteArrayOutputStream);
        if (z11) {
            i13 -= z12 ? 180 : TXVodDownloadDataSource.QUALITY_360P;
        }
        return m89324j(bitmapM89317c, i13);
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m89325k(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        float width = i11 / bitmap.getWidth();
        matrix.setScale(width, width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m89326l(Bitmap bitmap, int i11, boolean z11, float f11) {
        if (!z11 || f11 < 0.0f) {
            return m89325k(bitmap, i11);
        }
        int width = bitmap.getWidth();
        while (width > i11) {
            width = (int) (width * f11);
            if (width < i11) {
                width = i11;
            }
            bitmap = m89325k(bitmap, width);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m89318d(ByteArrayOutputStream byteArrayOutputStream, BitmapFactory.Options options) {
        Bitmap bitmapM89316b = m89316b(byteArrayOutputStream.toByteArray(), options);
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
        return bitmapM89316b;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m89322h(Bitmap bitmap) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return byteBufferAllocate.array();
    }
}
