package a3d20260409;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.nio.ByteBuffer;
import p387k.C40826a;
import we0.C45819f;

/* JADX INFO: renamed from: a3d20260409.c */
/* JADX INFO: loaded from: classes23.dex */
public class C0066c {

    /* JADX INFO: renamed from: a */
    public byte[] f121a;

    /* JADX INFO: renamed from: b */
    public int f122b;

    /* JADX INFO: renamed from: c */
    public int f123c;

    /* JADX INFO: renamed from: d */
    public int f124d;

    /* JADX INFO: renamed from: e */
    public int f125e;

    /* JADX INFO: renamed from: f */
    public C0068e f126f;

    /* JADX INFO: renamed from: g */
    public C0067d f127g;

    /* JADX INFO: renamed from: h */
    public long f128h;

    /* JADX INFO: renamed from: a3d20260409.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f129a;

        static {
            int[] iArr = new int[oOooooooo0000000000.values().length];
            f129a = iArr;
            try {
                iArr[oOooooooo0000000000.FAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129a[oOooooooo0000000000.FAR_ORIGINAL_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129a[oOooooooo0000000000.NEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129a[oOooooooo0000000000.BLINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129a[oOooooooo0000000000.ORIGINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129a[oOooooooo0000000000.LOG_PICTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129a[oOooooooo0000000000.AUDIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m106b() {
        Bitmap bitmapM125j = this.f127g.m125j(C0109v.m512A(), 300, C0109v.m547v());
        byte[] bArrM89315a = C40826a.m89315a(bitmapM125j, C0109v.m545s(), C0109v.m512A());
        bitmapM125j.recycle();
        return bArrM89315a;
    }

    /* JADX INFO: renamed from: d */
    public byte[] m108d(oOooooooo0000000000 ooooooooo0000000000) {
        switch (a.f129a[ooooooooo0000000000.ordinal()]) {
            case 1:
                return m114j();
            case 2:
                return m107c();
            case 3:
                return m106b();
            case 4:
                return m113i();
            case 5:
                return m115k();
            case 6:
                return m111g();
            case 7:
                return m112h();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m109e(Bitmap bitmap) {
        C0068e c0068e = this.f126f;
        if (c0068e == null) {
            return null;
        }
        try {
            RectF rectF = c0068e.f136a;
            float f11 = rectF.right;
            float f12 = rectF.left;
            float width = ((((f11 - f12) / 2.0f) + f12) / this.f122b) * bitmap.getWidth();
            float height = (this.f126f.f136a.top / this.f123c) * bitmap.getHeight();
            RectF rectF2 = this.f126f.f136a;
            int height2 = (int) (((rectF2.bottom - rectF2.top) / this.f123c) * bitmap.getHeight() * 1.1f);
            if (height2 < bitmap.getWidth() && height2 < bitmap.getHeight()) {
                int i11 = (int) height;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) (width - (height2 / 2)), i11, height2, i11 + height2 > bitmap.getHeight() ? bitmap.getHeight() - i11 : height2);
                Bitmap bitmapM89325k = C40826a.m89325k(bitmapCreateBitmap, 300);
                bitmapCreateBitmap.recycle();
                byte[] bArrM89315a = C40826a.m89315a(bitmapM89325k, C0109v.m545s(), C0109v.m512A());
                bitmapM89325k.recycle();
                return bArrM89315a;
            }
            Bitmap bitmapM89325k2 = C40826a.m89325k(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null, false), 300);
            byte[] bArrM89315a2 = C40826a.m89315a(bitmapM89325k2, C0109v.m545s(), C0109v.m512A());
            bitmapM89325k2.recycle();
            return bArrM89315a2;
        } catch (Exception e11) {
            C45819f.m101227J().m83492H(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public byte[][] m110f() {
        Bitmap bitmapM121f = this.f127g.m121f(C0109v.m512A(), this.f127g.getHeight(), C0109v.m547v());
        byte[] bArrM109e = m109e(bitmapM121f);
        byte[] bArrM89315a = C40826a.m89315a(bitmapM121f, C0109v.m545s(), C0109v.m512A());
        Bitmap bitmapM89326l = C40826a.m89326l(bitmapM121f, C0106s.m486l(), C0109v.m515D(), C0109v.m516E());
        byte[] bArrM89315a2 = C40826a.m89315a(bitmapM89326l, C0109v.m545s(), C0109v.m512A());
        bitmapM89326l.recycle();
        if (!bitmapM121f.isRecycled()) {
            bitmapM121f.recycle();
        }
        return new byte[][]{bArrM89315a2, bArrM89315a, bArrM109e};
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m112h() {
        boolean z11 = C0106s.f424d;
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m113i() {
        Bitmap bitmapM121f = this.f127g.m121f(C0109v.m512A(), C0109v.m548w(), C0109v.m547v());
        byte[] bArrM89315a = C40826a.m89315a(bitmapM121f, C0109v.m545s(), C0109v.m512A());
        bitmapM121f.recycle();
        return bArrM89315a;
    }

    /* JADX INFO: renamed from: j */
    public final byte[] m114j() {
        Bitmap bitmapM121f = this.f127g.m121f(C0109v.m512A(), C0106s.m486l(), C0109v.m547v());
        byte[] bArrM89315a = C40826a.m89315a(bitmapM121f, C0109v.m545s(), C0109v.m512A());
        bitmapM121f.recycle();
        return bArrM89315a;
    }

    /* JADX INFO: renamed from: k */
    public final byte[] m115k() {
        Bitmap bitmapM120e = this.f127g.m120e(C0109v.m512A());
        byte[] bArrM89315a = C40826a.m89315a(bitmapM120e, C0109v.m545s(), C0109v.m512A());
        bitmapM120e.recycle();
        return bArrM89315a;
    }

    public C0066c(C0067d c0067d) {
        this.f127g = c0067d;
        this.f128h = c0067d.m124i();
        this.f124d = c0067d.m119d();
    }

    /* JADX INFO: renamed from: a */
    public void m105a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f121a = this.f127g.m128m(80, 300, C0109v.m547v());
        this.f122b = 300;
        this.f123c = 300;
        this.f125e = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m107c() {
        int i11;
        if (C0109v.m530S()) {
            i11 = 70;
        } else {
            i11 = 50;
        }
        Bitmap bitmapM125j = this.f127g.m125j(i11, 256, C0109v.m547v());
        byte[] bArrM89315a = C40826a.m89315a(bitmapM125j, C0109v.m545s(), i11);
        bitmapM125j.recycle();
        return bArrM89315a;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m111g() {
        int iOOOO = j3d20260409.oOOO();
        if (iOOOO == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f122b, this.f123c, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.f121a));
        Bitmap bitmapM89325k = C40826a.m89325k(bitmapCreateBitmap, iOOOO);
        byte[] bArrM89315a = C40826a.m89315a(bitmapM89325k, C0109v.m545s(), 50);
        bitmapM89325k.recycle();
        return bArrM89315a;
    }
}
