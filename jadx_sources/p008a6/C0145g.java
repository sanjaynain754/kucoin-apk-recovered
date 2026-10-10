package p008a6;

import android.graphics.Bitmap;
import p006a4.InterfaceC0117h;
import p284g6.C37818c;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.g */
/* JADX INFO: compiled from: BitmapCounter.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0145g {

    /* JADX INFO: renamed from: a */
    public int f495a;

    /* JADX INFO: renamed from: b */
    public long f496b;

    /* JADX INFO: renamed from: c */
    public final int f497c;

    /* JADX INFO: renamed from: d */
    public final int f498d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0117h<Bitmap> f499e;

    /* JADX INFO: renamed from: a6.g$a */
    /* JADX INFO: compiled from: BitmapCounter.java */
    public class a implements InterfaceC0117h<Bitmap> {
        public a() {
        }

        @Override // p006a4.InterfaceC0117h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                C0145g.this.m661a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m661a(Bitmap bitmap) {
        int iM85341j = C37818c.m85341j(bitmap);
        C45708h.m100892c(this.f495a > 0, "No bitmaps registered.");
        long j11 = iM85341j;
        C45708h.m100893d(j11 <= this.f496b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iM85341j), Long.valueOf(this.f496b));
        this.f496b -= j11;
        this.f495a--;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m662b() {
        return this.f495a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m663c() {
        return this.f497c;
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m664d() {
        return this.f498d;
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m666f() {
        return this.f496b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m667g(Bitmap bitmap) {
        int iM85341j = C37818c.m85341j(bitmap);
        int i11 = this.f495a;
        if (i11 < this.f497c) {
            long j11 = this.f496b;
            long j12 = iM85341j;
            if (j11 + j12 <= this.f498d) {
                this.f495a = i11 + 1;
                this.f496b = j11 + j12;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0117h<Bitmap> m665e() {
        return this.f499e;
    }

    public C0145g(int i11, int i12) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        C45708h.m100891b(Boolean.valueOf(i12 > 0));
        this.f497c = i11;
        this.f498d = i12;
        this.f499e = new a();
    }
}
