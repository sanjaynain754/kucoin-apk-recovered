package p749x5;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.BytesRange;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p006a4.AbstractC0110a;
import p284g6.C37818c;
import p284g6.C37819d;
import p284g6.C37820e;
import p284g6.C37821f;
import p284g6.C37824i;
import p422l5.C42054a;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;
import p819z3.C46680i;
import p852kotlin.Pair;

/* JADX INFO: renamed from: x5.i */
/* JADX INFO: compiled from: EncodedImage.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46075i implements Closeable {

    /* JADX INFO: renamed from: o */
    public static boolean f103508o;

    /* JADX INFO: renamed from: b */
    public final AbstractC0110a<PooledByteBuffer> f103509b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45711k<FileInputStream> f103510c;

    /* JADX INFO: renamed from: d */
    public ImageFormat f103511d;

    /* JADX INFO: renamed from: e */
    public int f103512e;

    /* JADX INFO: renamed from: f */
    public int f103513f;

    /* JADX INFO: renamed from: g */
    public int f103514g;

    /* JADX INFO: renamed from: h */
    public int f103515h;

    /* JADX INFO: renamed from: i */
    public int f103516i;

    /* JADX INFO: renamed from: j */
    public int f103517j;

    /* JADX INFO: renamed from: k */
    public BytesRange f103518k;

    /* JADX INFO: renamed from: l */
    public ColorSpace f103519l;

    /* JADX INFO: renamed from: m */
    public String f103520m;

    /* JADX INFO: renamed from: n */
    public boolean f103521n;

    public C46075i(AbstractC0110a<PooledByteBuffer> abstractC0110a) {
        this.f103511d = ImageFormat.f8817d;
        this.f103512e = -1;
        this.f103513f = 0;
        this.f103514g = -1;
        this.f103515h = -1;
        this.f103516i = 1;
        this.f103517j = -1;
        C45708h.m100891b(Boolean.valueOf(AbstractC0110a.m557o(abstractC0110a)));
        this.f103509b = abstractC0110a.clone();
        this.f103510c = null;
    }

    /* JADX INFO: renamed from: C */
    public synchronized boolean m101558C() {
        return AbstractC0110a.m557o(this.f103509b) || this.f103510c != null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m101554E(C46075i c46075i) {
        return c46075i != null && c46075i.m101558C();
    }

    /* JADX INFO: renamed from: b */
    public static C46075i m101555b(C46075i c46075i) {
        if (c46075i != null) {
            return c46075i.m101572a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m101556g(C46075i c46075i) {
        if (c46075i != null) {
            c46075i.close();
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m101557z(C46075i c46075i) {
        return c46075i.f103512e >= 0 && c46075i.f103514g >= 0 && c46075i.f103515h >= 0;
    }

    /* JADX INFO: renamed from: J */
    public void m101560J() {
        if (!f103508o) {
            m101586w();
        } else {
            if (this.f103521n) {
                return;
            }
            m101586w();
            this.f103521n = true;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m101561L() {
        if (this.f103514g < 0 || this.f103515h < 0) {
            m101560J();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m101564P(BytesRange bytesRange) {
        this.f103518k = bytesRange;
    }

    /* JADX INFO: renamed from: Q */
    public void m101565Q(int i11) {
        this.f103513f = i11;
    }

    /* JADX INFO: renamed from: R */
    public void m101566R(int i11) {
        this.f103515h = i11;
    }

    /* JADX INFO: renamed from: S */
    public void m101567S(ImageFormat imageFormat) {
        this.f103511d = imageFormat;
    }

    /* JADX INFO: renamed from: T */
    public void m101568T(int i11) {
        this.f103512e = i11;
    }

    /* JADX INFO: renamed from: U */
    public void m101569U(int i11) {
        this.f103516i = i11;
    }

    /* JADX INFO: renamed from: V */
    public void m101570V(String str) {
        this.f103520m = str;
    }

    /* JADX INFO: renamed from: W */
    public void m101571W(int i11) {
        this.f103514g = i11;
    }

    /* JADX INFO: renamed from: a */
    public C46075i m101572a() {
        C46075i c46075i;
        InterfaceC45711k<FileInputStream> interfaceC45711k = this.f103510c;
        if (interfaceC45711k != null) {
            c46075i = new C46075i(interfaceC45711k, this.f103517j);
        } else {
            AbstractC0110a abstractC0110aM553h = AbstractC0110a.m553h(this.f103509b);
            if (abstractC0110aM553h == null) {
                c46075i = null;
            } else {
                try {
                    c46075i = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM553h);
                } catch (Throwable th2) {
                    AbstractC0110a.m555j(abstractC0110aM553h);
                    throw th2;
                }
            }
            AbstractC0110a.m555j(abstractC0110aM553h);
        }
        if (c46075i != null) {
            c46075i.m101573h(this);
        }
        return c46075i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0110a.m555j(this.f103509b);
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0110a<PooledByteBuffer> m101574i() {
        return AbstractC0110a.m553h(this.f103509b);
    }

    /* JADX INFO: renamed from: j */
    public BytesRange m101575j() {
        return this.f103518k;
    }

    /* JADX INFO: renamed from: n */
    public InputStream m101579n() {
        InterfaceC45711k<FileInputStream> interfaceC45711k = this.f103510c;
        if (interfaceC45711k != null) {
            return interfaceC45711k.get();
        }
        AbstractC0110a abstractC0110aM553h = AbstractC0110a.m553h(this.f103509b);
        if (abstractC0110aM553h == null) {
            return null;
        }
        try {
            return new C46680i((PooledByteBuffer) abstractC0110aM553h.m565l());
        } finally {
            AbstractC0110a.m555j(abstractC0110aM553h);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m101581p() {
        return this.f103516i;
    }

    /* JADX INFO: renamed from: q */
    public int m101582q() {
        AbstractC0110a<PooledByteBuffer> abstractC0110a = this.f103509b;
        return (abstractC0110a == null || abstractC0110a.m565l() == null) ? this.f103517j : this.f103509b.m565l().size();
    }

    /* JADX INFO: renamed from: u */
    public String m101584u() {
        return this.f103520m;
    }

    /* JADX INFO: renamed from: v */
    public boolean m101585v() {
        return this.f103521n;
    }

    /* JADX INFO: renamed from: x */
    public boolean m101587x(int i11) {
        ImageFormat imageFormat = this.f103511d;
        if ((imageFormat != C42054a.JPEG && imageFormat != C42054a.DNG) || this.f103510c != null) {
            return true;
        }
        C45708h.m100896g(this.f103509b);
        PooledByteBuffer pooledByteBufferM565l = this.f103509b.m565l();
        return i11 >= 2 && pooledByteBufferM565l.mo733e(i11 + (-2)) == -1 && pooledByteBufferM565l.mo733e(i11 - 1) == -39;
    }

    /* JADX INFO: renamed from: F */
    public int m101559F() {
        m101561L();
        return this.f103512e;
    }

    /* JADX INFO: renamed from: M */
    public final C37820e m101562M() throws Throwable {
        InputStream inputStreamM101579n;
        try {
            inputStreamM101579n = m101579n();
            try {
                C37820e c37820eM85338e = C37818c.m85338e(inputStreamM101579n);
                this.f103519l = c37820eM85338e.getColorSpace();
                Pair<Integer, Integer> pairM85349b = c37820eM85338e.m85349b();
                if (pairM85349b != null) {
                    this.f103514g = pairM85349b.component1().intValue();
                    this.f103515h = pairM85349b.component2().intValue();
                }
                if (inputStreamM101579n != null) {
                    try {
                        inputStreamM101579n.close();
                    } catch (IOException unused) {
                    }
                }
                return c37820eM85338e;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamM101579n != null) {
                    try {
                        inputStreamM101579n.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamM101579n = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public final Pair<Integer, Integer> m101563O() {
        InputStream inputStreamM101579n = m101579n();
        if (inputStreamM101579n == null) {
            return null;
        }
        Pair<Integer, Integer> pairM85368f = C37824i.m85368f(inputStreamM101579n);
        if (pairM85368f != null) {
            this.f103514g = pairM85368f.component1().intValue();
            this.f103515h = pairM85368f.component2().intValue();
        }
        return pairM85368f;
    }

    public int getHeight() {
        m101561L();
        return this.f103515h;
    }

    public int getWidth() {
        m101561L();
        return this.f103514g;
    }

    /* JADX INFO: renamed from: h */
    public void m101573h(C46075i c46075i) {
        this.f103511d = c46075i.m101578m();
        this.f103514g = c46075i.getWidth();
        this.f103515h = c46075i.getHeight();
        this.f103512e = c46075i.m101559F();
        this.f103513f = c46075i.m101583t();
        this.f103516i = c46075i.m101581p();
        this.f103517j = c46075i.m101582q();
        this.f103518k = c46075i.m101575j();
        this.f103519l = c46075i.m101576k();
        this.f103521n = c46075i.m101585v();
    }

    /* JADX INFO: renamed from: k */
    public ColorSpace m101576k() {
        m101561L();
        return this.f103519l;
    }

    /* JADX INFO: renamed from: l */
    public String m101577l(int i11) {
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = m101574i();
        if (abstractC0110aM101574i == null) {
            return "";
        }
        int iMin = Math.min(m101582q(), i11);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBufferM565l = abstractC0110aM101574i.m565l();
            if (pooledByteBufferM565l == null) {
                abstractC0110aM101574i.close();
                return "";
            }
            pooledByteBufferM565l.mo732d(0, bArr, 0, iMin);
            abstractC0110aM101574i.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i12 = 0; i12 < iMin; i12++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i12])));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            abstractC0110aM101574i.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public ImageFormat m101578m() {
        m101561L();
        return this.f103511d;
    }

    /* JADX INFO: renamed from: o */
    public InputStream m101580o() {
        return (InputStream) C45708h.m100896g(m101579n());
    }

    /* JADX INFO: renamed from: t */
    public int m101583t() {
        m101561L();
        return this.f103513f;
    }

    /* JADX INFO: renamed from: w */
    public final void m101586w() {
        Pair<Integer, Integer> pairM85349b;
        ImageFormat imageFormatM9096d = ImageFormatChecker.m9096d(m101579n());
        this.f103511d = imageFormatM9096d;
        if (C42054a.m92261b(imageFormatM9096d)) {
            pairM85349b = m101563O();
        } else {
            pairM85349b = m101562M().m85349b();
        }
        if (imageFormatM9096d == C42054a.JPEG && this.f103512e == -1) {
            if (pairM85349b != null) {
                int iM85351b = C37821f.m85351b(m101579n());
                this.f103513f = iM85351b;
                this.f103512e = C37821f.m85350a(iM85351b);
                return;
            }
            return;
        }
        if (imageFormatM9096d == C42054a.HEIF && this.f103512e == -1) {
            int iM85347a = C37819d.m85347a(m101579n());
            this.f103513f = iM85347a;
            this.f103512e = C37821f.m85350a(iM85347a);
        } else if (this.f103512e == -1) {
            this.f103512e = 0;
        }
    }

    public C46075i(InterfaceC45711k<FileInputStream> interfaceC45711k) {
        this.f103511d = ImageFormat.f8817d;
        this.f103512e = -1;
        this.f103513f = 0;
        this.f103514g = -1;
        this.f103515h = -1;
        this.f103516i = 1;
        this.f103517j = -1;
        C45708h.m100896g(interfaceC45711k);
        this.f103509b = null;
        this.f103510c = interfaceC45711k;
    }

    public C46075i(InterfaceC45711k<FileInputStream> interfaceC45711k, int i11) {
        this(interfaceC45711k);
        this.f103517j = i11;
    }
}
