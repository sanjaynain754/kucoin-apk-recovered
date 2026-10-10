package p008a6;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.BitmapPoolBackend;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: a6.v */
/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0162v implements InterfaceC0149i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0140d0<Bitmap> f546a = new BitmapPoolBackend();

    /* JADX INFO: renamed from: b */
    public final int f547b;

    /* JADX INFO: renamed from: c */
    public int f548c;

    /* JADX INFO: renamed from: d */
    public final PoolStatsTracker f549d;

    /* JADX INFO: renamed from: e */
    public int f550e;

    @Override // p819z3.InterfaceC46677f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i11) {
        try {
            int i12 = this.f550e;
            int i13 = this.f547b;
            if (i12 > i13) {
                m726j(i13);
            }
            Bitmap bitmap = this.f546a.get(i11);
            if (bitmap == null) {
                return m723g(i11);
            }
            int iMo626a = this.f546a.mo626a(bitmap);
            this.f550e -= iMo626a;
            this.f549d.mo616b(iMo626a);
            return bitmap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m726j(int i11) {
        Bitmap bitmapPop;
        while (this.f550e > i11 && (bitmapPop = this.f546a.pop()) != null) {
            int iMo626a = this.f546a.mo626a(bitmapPop);
            this.f550e -= iMo626a;
            this.f549d.mo619e(iMo626a);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    private Bitmap m723g(int i11) {
        this.f549d.mo615a(i11);
        return Bitmap.createBitmap(1, i11, Bitmap.Config.ALPHA_8);
    }

    @Override // p819z3.InterfaceC46677f, p006a4.InterfaceC0117h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int iMo626a = this.f546a.mo626a(bitmap);
        if (iMo626a <= this.f548c) {
            this.f549d.mo620f(iMo626a);
            this.f546a.put(bitmap);
            synchronized (this) {
                this.f550e += iMo626a;
            }
        }
    }

    public C0162v(int i11, int i12, PoolStatsTracker poolStatsTracker, InterfaceC46675d interfaceC46675d) {
        this.f547b = i11;
        this.f548c = i12;
        this.f549d = poolStatsTracker;
        if (interfaceC46675d != null) {
            interfaceC46675d.mo102897a(this);
        }
    }
}
