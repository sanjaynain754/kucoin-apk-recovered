package a3d20260409;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p387k.C40826a;

/* JADX INFO: renamed from: a3d20260409.d */
/* JADX INFO: loaded from: classes23.dex */
public class C0067d extends YuvImage {

    /* JADX INFO: renamed from: a */
    public int f130a;

    /* JADX INFO: renamed from: b */
    public final long f131b;

    /* JADX INFO: renamed from: c */
    public final int f132c;

    /* JADX INFO: renamed from: d */
    public Rect f133d;

    /* JADX INFO: renamed from: e */
    public final boolean f134e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, ByteArrayOutputStream> f135f;

    public C0067d(byte[] bArr, int i11, int i12, int i13, int i14, boolean z11) {
        super(bArr, i11, i12, i13, null);
        this.f131b = System.currentTimeMillis();
        this.f135f = new ConcurrentHashMap();
        this.f132c = i14;
        this.f134e = z11;
        int width = (getWidth() - getHeight()) / 2;
        m122g(new Rect(width, 0, getHeight() + width, getHeight()));
    }

    public C0067d(byte[] bArr, int i11, int i12, int i13, boolean z11) {
        this(bArr, 17, i11, i12, i13, z11);
    }

    /* JADX INFO: renamed from: a */
    public int m116a() {
        return this.f130a;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m117b(int i11) {
        byte[] bArr = new byte[i11 * i11 * 4];
        if (C0109v.m537k(getYuvData(), getYuvFormat(), getWidth(), getHeight(), bArr, i11, true, this.f132c) == -1) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public int m119d() {
        return this.f132c;
    }

    /* JADX INFO: renamed from: f */
    public Bitmap m121f(int i11, int i12, boolean z11) {
        Bitmap bitmapM117b;
        return (!z11 || (bitmapM117b = m117b(i12)) == null) ? C40826a.m89326l(m120e(i11), i12, C0109v.m515D(), C0109v.m516E()) : bitmapM117b;
    }

    /* JADX INFO: renamed from: g */
    public void m122g(Rect rect) {
        this.f133d = rect;
    }

    /* JADX INFO: renamed from: h */
    public void m123h(int i11) {
        this.f130a = i11;
    }

    /* JADX INFO: renamed from: i */
    public long m124i() {
        return this.f131b;
    }

    /* JADX INFO: renamed from: j */
    public Bitmap m125j(int i11, int i12, boolean z11) {
        Bitmap bitmapM129n;
        if (z11 && (bitmapM129n = m129n(i12)) != null) {
            return bitmapM129n;
        }
        Bitmap bitmapM127l = m127l(i11);
        Bitmap bitmapM89326l = C40826a.m89326l(bitmapM127l, i12, C0109v.m517F(), C0109v.m518G());
        if (!bitmapM127l.isRecycled()) {
            bitmapM127l.recycle();
        }
        return bitmapM89326l;
    }

    /* JADX INFO: renamed from: k */
    public ByteArrayOutputStream m126k(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = this.f135f.get(Integer.valueOf(i11));
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Rect rect = this.f133d;
        if (rect == null) {
            rect = new Rect(0, 0, getWidth(), getHeight());
        }
        compressToJpeg(rect, i11, byteArrayOutputStream2);
        this.f135f.put(Integer.valueOf(i11), byteArrayOutputStream2);
        return byteArrayOutputStream2;
    }

    /* JADX INFO: renamed from: l */
    public Bitmap m127l(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        compressToJpeg(C0106s.m483i() == C40826a.m89321g() ? new Rect(0, 0, getWidth(), getHeight()) : new Rect(0, 0, getWidth(), getHeight()), i11, byteArrayOutputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return C40826a.m89320f(C40826a.m89319e(C40826a.m89318d(byteArrayOutputStream, options), this.f134e, this.f132c));
    }

    /* JADX INFO: renamed from: m */
    public byte[] m128m(int i11, int i12, boolean z11) {
        byte[] bArrM118c;
        if (z11 && (bArrM118c = m118c(i12)) != null) {
            return bArrM118c;
        }
        if (j3d20260409.oo0ooO(getYuvData())) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        float f11 = i12;
        options.inSampleSize = (int) (getWidth() / f11);
        Bitmap bitmapM89320f = C40826a.m89320f(C40826a.m89319e(C40826a.m89318d(m126k(i11), options), this.f134e, this.f132c));
        Matrix matrix = new Matrix();
        float width = f11 / bitmapM89320f.getWidth();
        matrix.setScale(width, width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM89320f, 0, 0, bitmapM89320f.getWidth(), bitmapM89320f.getHeight(), matrix, true);
        bitmapM89320f.recycle();
        byte[] bArrM89322h = C40826a.m89322h(bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
        return bArrM89322h;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m118c(int i11) {
        if (j3d20260409.oo0ooO(getYuvData())) {
            return null;
        }
        byte[] bArr = new byte[i11 * i11 * 4];
        if (C0109v.m537k(getYuvData(), getYuvFormat(), getWidth(), getHeight(), bArr, i11, true, this.f132c) == -1) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m120e(int i11) {
        ByteArrayOutputStream byteArrayOutputStreamM126k = m126k(i11);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return C40826a.m89320f(C40826a.m89319e(C40826a.m89318d(byteArrayOutputStreamM126k, options), this.f134e, this.f132c));
    }

    /* JADX INFO: renamed from: n */
    public final Bitmap m129n(int i11) {
        int width = (int) ((getWidth() * i11) / getHeight());
        byte[] bArr = new byte[i11 * width * 4];
        if (C0109v.m537k(getYuvData(), getYuvFormat(), getWidth(), getHeight(), bArr, i11, false, this.f132c) != -1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, width, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            return bitmapCreateBitmap;
        }
        return null;
    }
}
