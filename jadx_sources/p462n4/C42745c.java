package p462n4;

/* JADX INFO: renamed from: n4.c */
/* JADX INFO: compiled from: RetryManager.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42745c {

    /* JADX INFO: renamed from: a */
    public boolean f94696a;

    /* JADX INFO: renamed from: b */
    public int f94697b;

    /* JADX INFO: renamed from: c */
    public int f94698c;

    /* JADX INFO: renamed from: a */
    public void m93671a() {
        this.f94696a = false;
        this.f94697b = 4;
        m93673c();
    }

    /* JADX INFO: renamed from: c */
    public void m93673c() {
        this.f94698c = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m93672b() {
        this.f94698c++;
    }

    /* JADX INFO: renamed from: d */
    public void m93674d(boolean z11) {
        this.f94696a = z11;
    }

    /* JADX INFO: renamed from: e */
    public boolean m93675e() {
        return this.f94696a && this.f94698c < this.f94697b;
    }

    public C42745c() {
        m93671a();
    }
}
