package ib0;

/* JADX INFO: renamed from: ib0.a */
/* JADX INFO: compiled from: DimensionStatus.java */
/* JADX INFO: loaded from: classes23.dex */
public class C38509a {

    /* JADX INFO: renamed from: c */
    public static final C38509a f86454c;

    /* JADX INFO: renamed from: d */
    public static final C38509a f86455d;

    /* JADX INFO: renamed from: e */
    public static final C38509a f86456e;

    /* JADX INFO: renamed from: f */
    public static final C38509a f86457f;

    /* JADX INFO: renamed from: g */
    public static final C38509a f86458g;

    /* JADX INFO: renamed from: h */
    public static final C38509a f86459h;

    /* JADX INFO: renamed from: i */
    public static final C38509a f86460i;

    /* JADX INFO: renamed from: j */
    public static final C38509a f86461j;

    /* JADX INFO: renamed from: k */
    public static final C38509a f86462k;

    /* JADX INFO: renamed from: l */
    public static final C38509a f86463l;

    /* JADX INFO: renamed from: m */
    public static final C38509a f86464m;

    /* JADX INFO: renamed from: n */
    public static final C38509a f86465n;

    /* JADX INFO: renamed from: o */
    public static final C38509a[] f86466o;

    /* JADX INFO: renamed from: a */
    public final int f86467a;

    /* JADX INFO: renamed from: b */
    public final boolean f86468b;

    static {
        C38509a c38509a = new C38509a(0, false);
        f86454c = c38509a;
        C38509a c38509a2 = new C38509a(1, true);
        f86455d = c38509a2;
        C38509a c38509a3 = new C38509a(2, false);
        f86456e = c38509a3;
        C38509a c38509a4 = new C38509a(3, true);
        f86457f = c38509a4;
        C38509a c38509a5 = new C38509a(4, false);
        f86458g = c38509a5;
        C38509a c38509a6 = new C38509a(5, true);
        f86459h = c38509a6;
        C38509a c38509a7 = new C38509a(6, false);
        f86460i = c38509a7;
        C38509a c38509a8 = new C38509a(7, true);
        f86461j = c38509a8;
        C38509a c38509a9 = new C38509a(8, false);
        f86462k = c38509a9;
        C38509a c38509a10 = new C38509a(9, true);
        f86463l = c38509a10;
        C38509a c38509a11 = new C38509a(10, false);
        f86464m = c38509a11;
        C38509a c38509a12 = new C38509a(10, true);
        f86465n = c38509a12;
        f86466o = new C38509a[]{c38509a, c38509a2, c38509a3, c38509a4, c38509a5, c38509a6, c38509a7, c38509a8, c38509a9, c38509a10, c38509a11, c38509a12};
    }

    /* JADX INFO: renamed from: a */
    public boolean m87109a(C38509a c38509a) {
        int i11 = this.f86467a;
        int i12 = c38509a.f86467a;
        if (i11 >= i12) {
            return (!this.f86468b || f86463l == this) && i11 == i12;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C38509a m87110b() {
        return !this.f86468b ? f86466o[this.f86467a + 1] : this;
    }

    /* JADX INFO: renamed from: c */
    public C38509a m87111c() {
        if (!this.f86468b) {
            return this;
        }
        C38509a c38509a = f86466o[this.f86467a - 1];
        return !c38509a.f86468b ? c38509a : f86454c;
    }

    public C38509a(int i11, boolean z11) {
        this.f86467a = i11;
        this.f86468b = z11;
    }
}
