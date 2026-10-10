package p710w1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: w1.j */
/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes.dex */
public class C45692j implements InterfaceC45686d {

    /* JADX INFO: renamed from: k */
    public static final Bitmap.Config f103009k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public final InterfaceC45693k f103010a;

    /* JADX INFO: renamed from: b */
    public final Set<Bitmap.Config> f103011b;

    /* JADX INFO: renamed from: c */
    public final long f103012c;

    /* JADX INFO: renamed from: d */
    public final a f103013d;

    /* JADX INFO: renamed from: e */
    public long f103014e;

    /* JADX INFO: renamed from: f */
    public long f103015f;

    /* JADX INFO: renamed from: g */
    public int f103016g;

    /* JADX INFO: renamed from: h */
    public int f103017h;

    /* JADX INFO: renamed from: i */
    public int f103018i;

    /* JADX INFO: renamed from: j */
    public int f103019j;

    /* JADX INFO: renamed from: w1.j$a */
    /* JADX INFO: compiled from: LruBitmapPool.java */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo100856b(Bitmap bitmap);

        /* JADX INFO: renamed from: c */
        void mo100857c(Bitmap bitmap);
    }

    public C45692j(long j11, InterfaceC45693k interfaceC45693k, Set<Bitmap.Config> set) {
        this.f103012c = j11;
        this.f103014e = j11;
        this.f103010a = interfaceC45693k;
        this.f103011b = set;
        this.f103013d = new b();
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: o */
    public static void m100848o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* JADX INFO: renamed from: p */
    public static void m100849p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m100848o(bitmap);
    }

    @Override // p710w1.InterfaceC45686d
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo100811a(int i11) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i11);
        }
        if (i11 >= 40 || i11 >= 20) {
            mo100812c();
        } else if (i11 >= 20 || i11 == 15) {
            m100855q(m100854n() / 2);
        }
    }

    @Override // p710w1.InterfaceC45686d
    /* JADX INFO: renamed from: b */
    public synchronized void mo4893b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f103010a.mo100860c(bitmap) <= this.f103014e && this.f103011b.contains(bitmap.getConfig())) {
                int iMo100860c = this.f103010a.mo100860c(bitmap);
                this.f103010a.mo100859b(bitmap);
                this.f103013d.mo100857c(bitmap);
                this.f103018i++;
                this.f103015f += (long) iMo100860c;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f103010a.mo100862e(bitmap));
                }
                m100850h();
                m100852j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f103010a.mo100862e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f103011b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p710w1.InterfaceC45686d
    /* JADX INFO: renamed from: c */
    public void mo100812c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m100855q(0L);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final synchronized Bitmap m100853m(int i11, int i12, @Nullable Bitmap.Config config) {
        Bitmap bitmapMo100861d;
        try {
            m100844f(config);
            bitmapMo100861d = this.f103010a.mo100861d(i11, i12, config != null ? config : f103009k);
            if (bitmapMo100861d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f103010a.mo100858a(i11, i12, config));
                }
                this.f103017h++;
            } else {
                this.f103016g++;
                this.f103015f -= (long) this.f103010a.mo100860c(bitmapMo100861d);
                this.f103013d.mo100856b(bitmapMo100861d);
                m100849p(bitmapMo100861d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f103010a.mo100858a(i11, i12, config));
            }
            m100850h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapMo100861d;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m100855q(long j11) {
        while (this.f103015f > j11) {
            try {
                Bitmap bitmapRemoveLast = this.f103010a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m100851i();
                    }
                    this.f103015f = 0L;
                    return;
                }
                this.f103013d.mo100856b(bitmapRemoveLast);
                this.f103015f -= (long) this.f103010a.mo100860c(bitmapRemoveLast);
                this.f103019j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f103010a.mo100862e(bitmapRemoveLast));
                }
                m100850h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: f */
    public static void m100844f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static Bitmap m100845g(int i11, int i12, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f103009k;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: k */
    public static Set<Bitmap.Config> m100846k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i11 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i11 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC45693k m100847l() {
        return new C45695m();
    }

    /* JADX INFO: renamed from: h */
    public final void m100850h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m100851i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m100851i() {
        Log.v("LruBitmapPool", "Hits=" + this.f103016g + ", misses=" + this.f103017h + ", puts=" + this.f103018i + ", evictions=" + this.f103019j + ", currentSize=" + this.f103015f + ", maxSize=" + this.f103014e + "\nStrategy=" + this.f103010a);
    }

    /* JADX INFO: renamed from: j */
    public final void m100852j() {
        m100855q(this.f103014e);
    }

    /* JADX INFO: renamed from: n */
    public long m100854n() {
        return this.f103014e;
    }

    @Override // p710w1.InterfaceC45686d
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo100813d(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapM100853m = m100853m(i11, i12, config);
        if (bitmapM100853m != null) {
            bitmapM100853m.eraseColor(0);
            return bitmapM100853m;
        }
        return m100845g(i11, i12, config);
    }

    @Override // p710w1.InterfaceC45686d
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo100814e(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapM100853m = m100853m(i11, i12, config);
        if (bitmapM100853m == null) {
            return m100845g(i11, i12, config);
        }
        return bitmapM100853m;
    }

    public C45692j(long j11) {
        this(j11, m100847l(), m100846k());
    }

    /* JADX INFO: renamed from: w1.j$b */
    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static final class b implements a {
        @Override // p710w1.C45692j.a
        /* JADX INFO: renamed from: b */
        public void mo100856b(Bitmap bitmap) {
        }

        @Override // p710w1.C45692j.a
        /* JADX INFO: renamed from: c */
        public void mo100857c(Bitmap bitmap) {
        }
    }
}
