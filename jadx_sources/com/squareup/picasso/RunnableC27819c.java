package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: renamed from: com.squareup.picasso.c */
/* JADX INFO: compiled from: BitmapHunter.java */
/* JADX INFO: loaded from: classes59.dex */
public class RunnableC27819c implements Runnable {

    /* JADX INFO: renamed from: u */
    public static final Object f56723u = new Object();

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal<StringBuilder> f56724v = new a();

    /* JADX INFO: renamed from: w */
    public static final AtomicInteger f56725w = new AtomicInteger();

    /* JADX INFO: renamed from: x */
    public static final AbstractC27836t f56726x = new b();

    /* JADX INFO: renamed from: b */
    public final int f56727b = f56725w.incrementAndGet();

    /* JADX INFO: renamed from: c */
    public final Picasso f56728c;

    /* JADX INFO: renamed from: d */
    public final C27825i f56729d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC27820d f56730e;

    /* JADX INFO: renamed from: f */
    public final C27838v f56731f;

    /* JADX INFO: renamed from: g */
    public final String f56732g;

    /* JADX INFO: renamed from: h */
    public final C27834r f56733h;

    /* JADX INFO: renamed from: i */
    public final int f56734i;

    /* JADX INFO: renamed from: j */
    public int f56735j;

    /* JADX INFO: renamed from: k */
    public final AbstractC27836t f56736k;

    /* JADX INFO: renamed from: l */
    public AbstractC27817a f56737l;

    /* JADX INFO: renamed from: m */
    public List<AbstractC27817a> f56738m;

    /* JADX INFO: renamed from: n */
    public Bitmap f56739n;

    /* JADX INFO: renamed from: o */
    public Future<?> f56740o;

    /* JADX INFO: renamed from: p */
    public Picasso.LoadedFrom f56741p;

    /* JADX INFO: renamed from: q */
    public Exception f56742q;

    /* JADX INFO: renamed from: r */
    public int f56743r;

    /* JADX INFO: renamed from: s */
    public int f56744s;

    /* JADX INFO: renamed from: t */
    public Picasso.Priority f56745t;

    /* JADX INFO: renamed from: com.squareup.picasso.c$a */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$b */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class b extends AbstractC27836t {
        @Override // com.squareup.picasso.AbstractC27836t
        /* JADX INFO: renamed from: c */
        public boolean mo68781c(C27834r c27834r) {
            return true;
        }

        @Override // com.squareup.picasso.AbstractC27836t
        /* JADX INFO: renamed from: f */
        public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + c27834r);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$c */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC27840x f56746b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RuntimeException f56747c;

        public c(InterfaceC27840x interfaceC27840x, RuntimeException runtimeException) {
            this.f56746b = interfaceC27840x;
            this.f56747c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f56746b.key() + " crashed with exception.", this.f56747c);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$d */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StringBuilder f56748b;

        public d(StringBuilder sb2) {
            this.f56748b = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f56748b.toString());
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$e */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC27840x f56749b;

        public e(InterfaceC27840x interfaceC27840x) {
            this.f56749b = interfaceC27840x;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f56749b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$f */
    /* JADX INFO: compiled from: BitmapHunter.java */
    public static class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC27840x f56750b;

        public f(InterfaceC27840x interfaceC27840x) {
            this.f56750b = interfaceC27840x;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f56750b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m68824m(int i11) {
        return (i11 == 2 || i11 == 7 || i11 == 4 || i11 == 5) ? -1 : 1;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m68825v(boolean z11, int i11, int i12, int i13, int i14) {
        if (!z11) {
            return true;
        }
        if (i13 == 0 || i11 <= i13) {
            return i14 != 0 && i12 > i14;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276  */
    /* JADX INFO: renamed from: y */
    public static Bitmap m68826y(C27834r c27834r, Bitmap bitmap, int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i16;
        int i17;
        float f19;
        float f21;
        float f22;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z12 = c27834r.f56812m;
        Matrix matrix = new Matrix();
        if (c27834r.m68895e() || i11 != 0) {
            int iFloor = c27834r.f56807h;
            int iFloor2 = c27834r.f56808i;
            float f23 = c27834r.f56813n;
            if (f23 != 0.0f) {
                double d11 = f23;
                double dCos = Math.cos(Math.toRadians(d11));
                double dSin = Math.sin(Math.toRadians(d11));
                if (c27834r.f56816q) {
                    matrix.setRotate(f23, c27834r.f56814o, c27834r.f56815p);
                    float f24 = c27834r.f56814o;
                    double d12 = 1.0d - dCos;
                    float f25 = c27834r.f56815p;
                    double d13 = (((double) f24) * d12) + (((double) f25) * dSin);
                    double d14 = (((double) f25) * d12) - (((double) f24) * dSin);
                    int i26 = c27834r.f56807h;
                    double d15 = (((double) i26) * dCos) + d13;
                    double d16 = (((double) i26) * dSin) + d14;
                    int i27 = c27834r.f56808i;
                    double d17 = ((((double) i26) * dCos) + d13) - (((double) i27) * dSin);
                    i12 = width;
                    double d18 = (((double) i26) * dSin) + d14 + (((double) i27) * dCos);
                    i13 = height;
                    double d19 = d13 - (((double) i27) * dSin);
                    double d21 = (((double) i27) * dCos) + d14;
                    double dMax = Math.max(d19, Math.max(d17, Math.max(d13, d15)));
                    double dMin = Math.min(d19, Math.min(d17, Math.min(d13, d15)));
                    double dMax2 = Math.max(d21, Math.max(d18, Math.max(d14, d16)));
                    double dMin2 = Math.min(d21, Math.min(d18, Math.min(d14, d16)));
                    int iFloor3 = (int) Math.floor(dMax - dMin);
                    iFloor2 = (int) Math.floor(dMax2 - dMin2);
                    iFloor = iFloor3;
                    z11 = z12;
                } else {
                    i12 = width;
                    i13 = height;
                    matrix.setRotate(f23);
                    int i28 = c27834r.f56807h;
                    double d22 = ((double) i28) * dCos;
                    double d23 = ((double) i28) * dSin;
                    int i29 = c27834r.f56808i;
                    double d24 = (((double) i28) * dCos) - (((double) i29) * dSin);
                    double d25 = (((double) i28) * dSin) + (((double) i29) * dCos);
                    double d26 = -(((double) i29) * dSin);
                    double d27 = ((double) i29) * dCos;
                    z11 = z12;
                    double dMax3 = Math.max(d26, Math.max(d24, Math.max(0.0d, d22)));
                    double dMin3 = Math.min(d26, Math.min(d24, Math.min(0.0d, d22)));
                    double dMax4 = Math.max(d27, Math.max(d25, Math.max(0.0d, d23)));
                    double dMin4 = Math.min(d27, Math.min(d25, Math.min(0.0d, d23)));
                    iFloor = (int) Math.floor(dMax3 - dMin3);
                    iFloor2 = (int) Math.floor(dMax4 - dMin4);
                }
            } else {
                i12 = width;
                i13 = height;
                z11 = z12;
            }
            if (i11 != 0) {
                int iM68823l = m68823l(i11);
                int iM68824m = m68824m(i11);
                if (iM68823l != 0) {
                    matrix.preRotate(iM68823l);
                    if (iM68823l == 90 || iM68823l == 270) {
                        matrix = matrix;
                        matrix = matrix;
                        int i31 = iFloor2;
                        iFloor2 = iFloor;
                        iFloor = i31;
                    }
                } else {
                    matrix = matrix;
                }
                matrix = matrix;
                if (iM68824m != 1) {
                    matrix.postScale(iM68824m, 1.0f);
                }
            } else {
                matrix = matrix;
            }
            if (c27834r.f56809j) {
                if (iFloor != 0) {
                    i16 = i12;
                    f19 = iFloor / i16;
                    i17 = i13;
                } else {
                    i16 = i12;
                    i17 = i13;
                    f19 = iFloor2 / i17;
                }
                if (iFloor2 != 0) {
                    f21 = iFloor2;
                    f22 = i17;
                } else {
                    f21 = iFloor;
                    f22 = i16;
                }
                float f26 = f21 / f22;
                if (f19 > f26) {
                    int iCeil = (int) Math.ceil(i17 * (f26 / f19));
                    int i32 = c27834r.f56810k;
                    if ((i32 & 48) == 48) {
                        i19 = 0;
                    } else {
                        i19 = (i32 & 80) == 80 ? i17 - iCeil : (i17 - iCeil) / 2;
                    }
                    i18 = iCeil;
                    f26 = iFloor2 / iCeil;
                } else {
                    if (f19 < f26) {
                        int iCeil2 = (int) Math.ceil(i16 * (f19 / f26));
                        int i33 = c27834r.f56810k;
                        if ((i33 & 3) == 3) {
                            i21 = 0;
                        } else {
                            i21 = (i33 & 5) == 5 ? i16 - iCeil2 : (i16 - iCeil2) / 2;
                        }
                        i22 = i21;
                        i16 = iCeil2;
                        i18 = i17;
                        f19 = iFloor / iCeil2;
                        z11 = z11;
                        i19 = 0;
                    } else {
                        f19 = f26;
                        i18 = i17;
                        i19 = 0;
                    }
                    if (m68825v(z11, i16, i17, iFloor, iFloor2)) {
                        matrix.preScale(f19, f26);
                    }
                    i23 = i19;
                    i24 = i22;
                    i14 = i16;
                    i25 = i18;
                }
                i22 = 0;
                if (m68825v(z11, i16, i17, iFloor, iFloor2)) {
                    matrix.preScale(f19, f26);
                }
                i23 = i19;
                i24 = i22;
                i14 = i16;
                i25 = i18;
            } else {
                boolean z13 = z11;
                i14 = i12;
                i15 = i13;
                if (c27834r.f56811l) {
                    if (iFloor != 0) {
                        f15 = iFloor;
                        f16 = i14;
                    } else {
                        f15 = iFloor2;
                        f16 = i15;
                    }
                    float f27 = f15 / f16;
                    if (iFloor2 != 0) {
                        f17 = iFloor2;
                        f18 = i15;
                    } else {
                        f17 = iFloor;
                        f18 = i14;
                    }
                    float f28 = f17 / f18;
                    if (f27 >= f28) {
                        f27 = f28;
                    }
                    if (m68825v(z13, i14, i15, iFloor, iFloor2)) {
                        matrix.preScale(f27, f27);
                    }
                } else if ((iFloor != 0 || iFloor2 != 0) && (iFloor != i14 || iFloor2 != i15)) {
                    if (iFloor != 0) {
                        f11 = iFloor;
                        f12 = i14;
                    } else {
                        f11 = iFloor2;
                        f12 = i15;
                    }
                    float f29 = f11 / f12;
                    if (iFloor2 != 0) {
                        f13 = iFloor2;
                        f14 = i15;
                    } else {
                        f13 = iFloor;
                        f14 = i14;
                    }
                    float f31 = f13 / f14;
                    if (m68825v(z13, i14, i15, iFloor, iFloor2)) {
                        matrix.preScale(f29, f31);
                    }
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i24, i23, i14, i25, matrix, true);
            if (bitmapCreateBitmap != bitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        i14 = width;
        i15 = height;
        i25 = i15;
        i24 = 0;
        i23 = 0;
        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i24, i23, i14, i25, matrix, true);
        if (bitmapCreateBitmap != bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public void m68828b(AbstractC27817a abstractC27817a) {
        boolean z11 = this.f56728c.f56687n;
        C27834r c27834r = abstractC27817a.f56707b;
        if (this.f56737l == null) {
            this.f56737l = abstractC27817a;
            if (z11) {
                List<AbstractC27817a> list = this.f56738m;
                if (list == null || list.isEmpty()) {
                    C27841y.m68954t("Hunter", "joined", c27834r.m68894d(), "to empty hunter");
                    return;
                } else {
                    C27841y.m68954t("Hunter", "joined", c27834r.m68894d(), C27841y.m68945k(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f56738m == null) {
            this.f56738m = new ArrayList(3);
        }
        this.f56738m.add(abstractC27817a);
        if (z11) {
            C27841y.m68954t("Hunter", "joined", c27834r.m68894d(), C27841y.m68945k(this, "to "));
        }
        Picasso.Priority priorityM68813h = abstractC27817a.m68813h();
        if (priorityM68813h.ordinal() > this.f56745t.ordinal()) {
            this.f56745t = priorityM68813h;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m68829c() {
        List<AbstractC27817a> list;
        Future<?> future;
        return this.f56737l == null && ((list = this.f56738m) == null || list.isEmpty()) && (future = this.f56740o) != null && future.cancel(false);
    }

    /* JADX INFO: renamed from: d */
    public final Picasso.Priority m68830d() {
        Picasso.Priority priorityM68813h = Picasso.Priority.LOW;
        List<AbstractC27817a> list = this.f56738m;
        boolean z11 = (list == null || list.isEmpty()) ? false : true;
        AbstractC27817a abstractC27817a = this.f56737l;
        if (abstractC27817a == null && !z11) {
            return priorityM68813h;
        }
        if (abstractC27817a != null) {
            priorityM68813h = abstractC27817a.m68813h();
        }
        if (z11) {
            int size = this.f56738m.size();
            for (int i11 = 0; i11 < size; i11++) {
                Picasso.Priority priorityM68813h2 = this.f56738m.get(i11).m68813h();
                if (priorityM68813h2.ordinal() > priorityM68813h.ordinal()) {
                    priorityM68813h = priorityM68813h2;
                }
            }
        }
        return priorityM68813h;
    }

    /* JADX INFO: renamed from: f */
    public void m68831f(AbstractC27817a abstractC27817a) {
        boolean zRemove;
        if (this.f56737l == abstractC27817a) {
            this.f56737l = null;
            zRemove = true;
        } else {
            List<AbstractC27817a> list = this.f56738m;
            zRemove = list != null ? list.remove(abstractC27817a) : false;
        }
        if (zRemove && abstractC27817a.m68813h() == this.f56745t) {
            this.f56745t = m68830d();
        }
        if (this.f56728c.f56687n) {
            C27841y.m68954t("Hunter", "removed", abstractC27817a.f56707b.m68894d(), C27841y.m68945k(this, "from "));
        }
    }

    /* JADX INFO: renamed from: h */
    public AbstractC27817a m68832h() {
        return this.f56737l;
    }

    /* JADX INFO: renamed from: i */
    public List<AbstractC27817a> m68833i() {
        return this.f56738m;
    }

    /* JADX INFO: renamed from: j */
    public C27834r m68834j() {
        return this.f56733h;
    }

    /* JADX INFO: renamed from: k */
    public Exception m68835k() {
        return this.f56742q;
    }

    /* JADX INFO: renamed from: n */
    public String m68836n() {
        return this.f56732g;
    }

    /* JADX INFO: renamed from: o */
    public Picasso.LoadedFrom m68837o() {
        return this.f56741p;
    }

    /* JADX INFO: renamed from: p */
    public int m68838p() {
        return this.f56734i;
    }

    /* JADX INFO: renamed from: q */
    public Picasso m68839q() {
        return this.f56728c;
    }

    /* JADX INFO: renamed from: r */
    public Picasso.Priority m68840r() {
        return this.f56745t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m68827z(this.f56733h);
            if (this.f56728c.f56687n) {
                C27841y.m68953s("Hunter", "executing", C27841y.m68944j(this));
            }
            Bitmap bitmapM68842t = m68842t();
            this.f56739n = bitmapM68842t;
            if (bitmapM68842t == null) {
                this.f56729d.m68856e(this);
            } else {
                this.f56729d.m68855d(this);
            }
        } catch (IOException e11) {
            this.f56742q = e11;
            this.f56729d.m68858g(this);
        } catch (NetworkRequestHandler.ResponseException e12) {
            if (!NetworkPolicy.isOfflineOnly(e12.networkPolicy) || e12.code != 504) {
                this.f56742q = e12;
            }
            this.f56729d.m68856e(this);
        } catch (Exception e13) {
            this.f56742q = e13;
            this.f56729d.m68856e(this);
        } catch (OutOfMemoryError e14) {
            StringWriter stringWriter = new StringWriter();
            this.f56731f.m68921a().m68933a(new PrintWriter(stringWriter));
            this.f56742q = new RuntimeException(stringWriter.toString(), e14);
            this.f56729d.m68856e(this);
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* JADX INFO: renamed from: s */
    public Bitmap m68841s() {
        return this.f56739n;
    }

    /* JADX INFO: renamed from: t */
    public Bitmap m68842t() throws IOException {
        Bitmap bitmapM68826y;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f56734i)) {
            bitmapM68826y = this.f56730e.get(this.f56732g);
            if (bitmapM68826y != null) {
                this.f56731f.m68924d();
                this.f56741p = Picasso.LoadedFrom.MEMORY;
                if (this.f56728c.f56687n) {
                    C27841y.m68954t("Hunter", "decoded", this.f56733h.m68894d(), "from cache");
                }
                return bitmapM68826y;
            }
        } else {
            bitmapM68826y = null;
        }
        int i11 = this.f56744s == 0 ? NetworkPolicy.OFFLINE.index : this.f56735j;
        this.f56735j = i11;
        AbstractC27836t.a aVarMo68782f = this.f56736k.mo68782f(this.f56733h, i11);
        if (aVarMo68782f != null) {
            this.f56741p = aVarMo68782f.m68917c();
            this.f56743r = aVarMo68782f.m68916b();
            bitmapM68826y = aVarMo68782f.m68915a();
            if (bitmapM68826y == null) {
                Source sourceM68918d = aVarMo68782f.m68918d();
                try {
                    Bitmap bitmapM68821e = m68821e(sourceM68918d, this.f56733h);
                    try {
                        sourceM68918d.close();
                    } catch (IOException unused) {
                    }
                    bitmapM68826y = bitmapM68821e;
                } catch (Throwable th2) {
                    try {
                        sourceM68918d.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            }
        }
        if (bitmapM68826y != null) {
            if (this.f56728c.f56687n) {
                C27841y.m68953s("Hunter", "decoded", this.f56733h.m68894d());
            }
            this.f56731f.m68922b(bitmapM68826y);
            if (this.f56733h.m68896f() || this.f56743r != 0) {
                synchronized (f56723u) {
                    try {
                        if (this.f56733h.m68895e() || this.f56743r != 0) {
                            bitmapM68826y = m68826y(this.f56733h, bitmapM68826y, this.f56743r);
                            if (this.f56728c.f56687n) {
                                C27841y.m68953s("Hunter", "transformed", this.f56733h.m68894d());
                            }
                        }
                        if (this.f56733h.m68892b()) {
                            bitmapM68826y = m68820a(this.f56733h.f56806g, bitmapM68826y);
                            if (this.f56728c.f56687n) {
                                C27841y.m68954t("Hunter", "transformed", this.f56733h.m68894d(), "from custom transformations");
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (bitmapM68826y != null) {
                    this.f56731f.m68923c(bitmapM68826y);
                }
            }
        }
        return bitmapM68826y;
    }

    /* JADX INFO: renamed from: u */
    public boolean m68843u() {
        Future<?> future = this.f56740o;
        return future != null && future.isCancelled();
    }

    /* JADX INFO: renamed from: w */
    public boolean m68844w(boolean z11, NetworkInfo networkInfo) {
        int i11 = this.f56744s;
        if (i11 <= 0) {
            return false;
        }
        this.f56744s = i11 - 1;
        return this.f56736k.mo68785h(z11, networkInfo);
    }

    /* JADX INFO: renamed from: x */
    public boolean m68845x() {
        return this.f56736k.mo68786i();
    }

    public RunnableC27819c(Picasso picasso, C27825i c27825i, InterfaceC27820d interfaceC27820d, C27838v c27838v, AbstractC27817a abstractC27817a, AbstractC27836t abstractC27836t) {
        this.f56728c = picasso;
        this.f56729d = c27825i;
        this.f56730e = interfaceC27820d;
        this.f56731f = c27838v;
        this.f56737l = abstractC27817a;
        this.f56732g = abstractC27817a.m68809d();
        this.f56733h = abstractC27817a.m68814i();
        this.f56745t = abstractC27817a.m68813h();
        this.f56734i = abstractC27817a.m68810e();
        this.f56735j = abstractC27817a.m68811f();
        this.f56736k = abstractC27836t;
        this.f56744s = abstractC27836t.mo68784e();
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m68820a(List<InterfaceC27840x> list, Bitmap bitmap) {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            InterfaceC27840x interfaceC27840x = list.get(i11);
            try {
                Bitmap bitmapM68934a = interfaceC27840x.m68934a(bitmap);
                if (bitmapM68934a == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(interfaceC27840x.key());
                    sb2.append(" returned null after ");
                    sb2.append(i11);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<InterfaceC27840x> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().key());
                        sb2.append('\n');
                    }
                    Picasso.f56672p.post(new d(sb2));
                    return null;
                }
                if (bitmapM68934a == bitmap && bitmap.isRecycled()) {
                    Picasso.f56672p.post(new e(interfaceC27840x));
                    return null;
                }
                if (bitmapM68934a != bitmap && !bitmap.isRecycled()) {
                    Picasso.f56672p.post(new f(interfaceC27840x));
                    return null;
                }
                i11++;
                bitmap = bitmapM68934a;
            } catch (RuntimeException e11) {
                Picasso.f56672p.post(new c(interfaceC27840x, e11));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m68821e(Source source, C27834r c27834r) throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        boolean zM68952r = C27841y.m68952r(bufferedSourceBuffer);
        boolean z11 = c27834r.f56817r;
        BitmapFactory.Options optionsM68913d = AbstractC27836t.m68913d(c27834r);
        boolean zM68914g = AbstractC27836t.m68914g(optionsM68913d);
        if (!zM68952r) {
            InputStream inputStream = bufferedSourceBuffer.inputStream();
            if (zM68914g) {
                C27830n c27830n = new C27830n(inputStream);
                c27830n.m68879a(false);
                long jM68881g = c27830n.m68881g(1024);
                BitmapFactory.decodeStream(c27830n, null, optionsM68913d);
                AbstractC27836t.m68912b(c27834r.f56807h, c27834r.f56808i, optionsM68913d, c27834r);
                c27830n.m68880b(jM68881g);
                c27830n.m68879a(true);
                inputStream = c27830n;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, optionsM68913d);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] byteArray = bufferedSourceBuffer.readByteArray();
        if (zM68914g) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsM68913d);
            AbstractC27836t.m68912b(c27834r.f56807h, c27834r.f56808i, optionsM68913d, c27834r);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsM68913d);
    }

    /* JADX INFO: renamed from: g */
    public static RunnableC27819c m68822g(Picasso picasso, C27825i c27825i, InterfaceC27820d interfaceC27820d, C27838v c27838v, AbstractC27817a abstractC27817a) {
        C27834r c27834rM68814i = abstractC27817a.m68814i();
        List<AbstractC27836t> listM68793g = picasso.m68793g();
        int size = listM68793g.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC27836t abstractC27836t = listM68793g.get(i11);
            if (abstractC27836t.mo68781c(c27834rM68814i)) {
                return new RunnableC27819c(picasso, c27825i, interfaceC27820d, c27838v, abstractC27817a, abstractC27836t);
            }
        }
        return new RunnableC27819c(picasso, c27825i, interfaceC27820d, c27838v, abstractC27817a, f56726x);
    }

    /* JADX INFO: renamed from: l */
    public static int m68823l(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m68827z(C27834r c27834r) {
        String strM68891a = c27834r.m68891a();
        StringBuilder sb2 = f56724v.get();
        sb2.ensureCapacity(strM68891a.length() + 8);
        sb2.replace(8, sb2.length(), strM68891a);
        Thread.currentThread().setName(sb2.toString());
    }
}
