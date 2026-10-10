package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.squareup.picasso.r */
/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27834r {

    /* JADX INFO: renamed from: u */
    public static final long f56799u = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: a */
    public int f56800a;

    /* JADX INFO: renamed from: b */
    public long f56801b;

    /* JADX INFO: renamed from: c */
    public int f56802c;

    /* JADX INFO: renamed from: d */
    public final Uri f56803d;

    /* JADX INFO: renamed from: e */
    public final int f56804e;

    /* JADX INFO: renamed from: f */
    public final String f56805f;

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC27840x> f56806g;

    /* JADX INFO: renamed from: h */
    public final int f56807h;

    /* JADX INFO: renamed from: i */
    public final int f56808i;

    /* JADX INFO: renamed from: j */
    public final boolean f56809j;

    /* JADX INFO: renamed from: k */
    public final int f56810k;

    /* JADX INFO: renamed from: l */
    public final boolean f56811l;

    /* JADX INFO: renamed from: m */
    public final boolean f56812m;

    /* JADX INFO: renamed from: n */
    public final float f56813n;

    /* JADX INFO: renamed from: o */
    public final float f56814o;

    /* JADX INFO: renamed from: p */
    public final float f56815p;

    /* JADX INFO: renamed from: q */
    public final boolean f56816q;

    /* JADX INFO: renamed from: r */
    public final boolean f56817r;

    /* JADX INFO: renamed from: s */
    public final Bitmap.Config f56818s;

    /* JADX INFO: renamed from: t */
    public final Picasso.Priority f56819t;

    /* JADX INFO: renamed from: com.squareup.picasso.r$b */
    /* JADX INFO: compiled from: Request.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Uri f56820a;

        /* JADX INFO: renamed from: b */
        public int f56821b;

        /* JADX INFO: renamed from: c */
        public String f56822c;

        /* JADX INFO: renamed from: d */
        public int f56823d;

        /* JADX INFO: renamed from: e */
        public int f56824e;

        /* JADX INFO: renamed from: f */
        public boolean f56825f;

        /* JADX INFO: renamed from: g */
        public int f56826g;

        /* JADX INFO: renamed from: h */
        public boolean f56827h;

        /* JADX INFO: renamed from: i */
        public boolean f56828i;

        /* JADX INFO: renamed from: j */
        public float f56829j;

        /* JADX INFO: renamed from: k */
        public float f56830k;

        /* JADX INFO: renamed from: l */
        public float f56831l;

        /* JADX INFO: renamed from: m */
        public boolean f56832m;

        /* JADX INFO: renamed from: n */
        public boolean f56833n;

        /* JADX INFO: renamed from: o */
        public List<InterfaceC27840x> f56834o;

        /* JADX INFO: renamed from: p */
        public Bitmap.Config f56835p;

        /* JADX INFO: renamed from: q */
        public Picasso.Priority f56836q;

        public b(@NonNull Uri uri) {
            m68902e(uri);
        }

        /* JADX INFO: renamed from: a */
        public C27834r m68898a() {
            boolean z11 = this.f56827h;
            if (z11 && this.f56825f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f56825f && this.f56823d == 0 && this.f56824e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z11 && this.f56823d == 0 && this.f56824e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f56836q == null) {
                this.f56836q = Picasso.Priority.NORMAL;
            }
            return new C27834r(this.f56820a, this.f56821b, this.f56822c, this.f56834o, this.f56823d, this.f56824e, this.f56825f, this.f56827h, this.f56826g, this.f56828i, this.f56829j, this.f56830k, this.f56831l, this.f56832m, this.f56833n, this.f56835p, this.f56836q);
        }

        /* JADX INFO: renamed from: b */
        public boolean m68899b() {
            return (this.f56820a == null && this.f56821b == 0) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m68900c() {
            return (this.f56823d == 0 && this.f56824e == 0) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public b m68901d(@Px int i11, @Px int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i12 == 0 && i11 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f56823d = i11;
            this.f56824e = i12;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m68902e(@NonNull Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.f56820a = uri;
            this.f56821b = 0;
            return this;
        }

        public b(Uri uri, int i11, Bitmap.Config config) {
            this.f56820a = uri;
            this.f56821b = i11;
            this.f56835p = config;
        }
    }

    public C27834r(Uri uri, int i11, String str, List<InterfaceC27840x> list, int i12, int i13, boolean z11, boolean z12, int i14, boolean z13, float f11, float f12, float f13, boolean z14, boolean z15, Bitmap.Config config, Picasso.Priority priority) {
        this.f56803d = uri;
        this.f56804e = i11;
        this.f56805f = str;
        if (list == null) {
            this.f56806g = null;
        } else {
            this.f56806g = Collections.unmodifiableList(list);
        }
        this.f56807h = i12;
        this.f56808i = i13;
        this.f56809j = z11;
        this.f56811l = z12;
        this.f56810k = i14;
        this.f56812m = z13;
        this.f56813n = f11;
        this.f56814o = f12;
        this.f56815p = f13;
        this.f56816q = z14;
        this.f56817r = z15;
        this.f56818s = config;
        this.f56819t = priority;
    }

    /* JADX INFO: renamed from: a */
    public String m68891a() {
        Uri uri = this.f56803d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f56804e);
    }

    /* JADX INFO: renamed from: b */
    public boolean m68892b() {
        return this.f56806g != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m68893c() {
        return (this.f56807h == 0 && this.f56808i == 0) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public String m68897g() {
        return "[R" + this.f56800a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i11 = this.f56804e;
        if (i11 > 0) {
            sb2.append(i11);
        } else {
            sb2.append(this.f56803d);
        }
        List<InterfaceC27840x> list = this.f56806g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC27840x interfaceC27840x : this.f56806g) {
                sb2.append(' ');
                sb2.append(interfaceC27840x.key());
            }
        }
        if (this.f56805f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f56805f);
            sb2.append(')');
        }
        if (this.f56807h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f56807h);
            sb2.append(',');
            sb2.append(this.f56808i);
            sb2.append(')');
        }
        if (this.f56809j) {
            sb2.append(" centerCrop");
        }
        if (this.f56811l) {
            sb2.append(" centerInside");
        }
        if (this.f56813n != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f56813n);
            if (this.f56816q) {
                sb2.append(" @ ");
                sb2.append(this.f56814o);
                sb2.append(',');
                sb2.append(this.f56815p);
            }
            sb2.append(')');
        }
        if (this.f56817r) {
            sb2.append(" purgeable");
        }
        if (this.f56818s != null) {
            sb2.append(' ');
            sb2.append(this.f56818s);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public String m68894d() {
        long jNanoTime = System.nanoTime() - this.f56801b;
        if (jNanoTime > f56799u) {
            return m68897g() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return m68897g() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    /* JADX INFO: renamed from: e */
    public boolean m68895e() {
        if (!m68893c() && this.f56813n == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m68896f() {
        if (!m68895e() && !m68892b()) {
            return false;
        }
        return true;
    }
}
