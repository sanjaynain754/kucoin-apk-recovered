package p037b9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.PlanarYUVLuminanceSource;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: b9.n */
/* JADX INFO: compiled from: SourceData.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4520n {

    /* JADX INFO: renamed from: a */
    public byte[] f3951a;

    /* JADX INFO: renamed from: b */
    public int f3952b;

    /* JADX INFO: renamed from: c */
    public int f3953c;

    /* JADX INFO: renamed from: d */
    public int f3954d;

    /* JADX INFO: renamed from: e */
    public int f3955e;

    /* JADX INFO: renamed from: f */
    public Rect f3956f;

    /* JADX INFO: renamed from: e */
    public static byte[] m4354e(byte[] bArr, int i11, int i12) {
        int i13 = i11 * i12;
        byte[] bArr2 = new byte[i13];
        int i14 = i13 - 1;
        for (int i15 = 0; i15 < i13; i15++) {
            bArr2[i14] = bArr[i15];
            i14--;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m4355f(byte[] bArr, int i11, int i12) {
        int i13 = i11 * i12;
        byte[] bArr2 = new byte[i13];
        int i14 = i13 - 1;
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = i12 - 1; i16 >= 0; i16--) {
                bArr2[i14] = bArr[(i16 * i11) + i15];
                i14--;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m4356g(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i11 * i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = i12 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i11) + i14];
                i13++;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m4357h(int i11, byte[] bArr, int i12, int i13) {
        if (i11 == 90) {
            return m4356g(bArr, i12, i13);
        }
        if (i11 != 180) {
            return i11 != 270 ? bArr : m4355f(bArr, i12, i13);
        }
        return m4354e(bArr, i12, i13);
    }

    /* JADX INFO: renamed from: a */
    public PlanarYUVLuminanceSource m4358a() {
        byte[] bArrM4357h = m4357h(this.f3955e, this.f3951a, this.f3952b, this.f3953c);
        if (m4361d()) {
            int i11 = this.f3953c;
            int i12 = this.f3952b;
            Rect rect = this.f3956f;
            return new PlanarYUVLuminanceSource(bArrM4357h, i11, i12, rect.left, rect.top, rect.width(), this.f3956f.height(), false);
        }
        int i13 = this.f3952b;
        int i14 = this.f3953c;
        Rect rect2 = this.f3956f;
        return new PlanarYUVLuminanceSource(bArrM4357h, i13, i14, rect2.left, rect2.top, rect2.width(), this.f3956f.height(), false);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m4359b(int i11) {
        return m4360c(this.f3956f, i11);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4361d() {
        return this.f3955e % 180 != 0;
    }

    /* JADX INFO: renamed from: i */
    public void m4362i(Rect rect) {
        this.f3956f = rect;
    }

    public C4520n(byte[] bArr, int i11, int i12, int i13, int i14) {
        this.f3951a = bArr;
        this.f3952b = i11;
        this.f3953c = i12;
        this.f3955e = i14;
        this.f3954d = i13;
        if (i11 * i12 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i11 + "x" + i12 + " > " + bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m4360c(Rect rect, int i11) {
        if (m4361d()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f3951a, this.f3954d, this.f3952b, this.f3953c, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i11;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f3955e != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f3955e);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        }
        return bitmapDecodeByteArray;
    }
}
