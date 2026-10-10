package p583r3;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.InterfaceC5553a;
import java.io.IOException;
import p547q3.InterfaceC43595a;

/* JADX INFO: renamed from: r3.f */
/* JADX INFO: compiled from: SettableCacheEvent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43913f implements InterfaceC5553a {

    /* JADX INFO: renamed from: i */
    public static final Object f97064i = new Object();

    /* JADX INFO: renamed from: j */
    public static C43913f f97065j;

    /* JADX INFO: renamed from: k */
    public static int f97066k;

    /* JADX INFO: renamed from: a */
    public InterfaceC43595a f97067a;

    /* JADX INFO: renamed from: b */
    public String f97068b;

    /* JADX INFO: renamed from: c */
    public long f97069c;

    /* JADX INFO: renamed from: d */
    public long f97070d;

    /* JADX INFO: renamed from: e */
    public long f97071e;

    /* JADX INFO: renamed from: f */
    public IOException f97072f;

    /* JADX INFO: renamed from: g */
    public CacheEventListener.EvictionReason f97073g;

    /* JADX INFO: renamed from: h */
    public C43913f f97074h;

    /* JADX INFO: renamed from: c */
    public final void m96750c() {
        this.f97067a = null;
        this.f97068b = null;
        this.f97069c = 0L;
        this.f97070d = 0L;
        this.f97071e = 0L;
        this.f97072f = null;
        this.f97073g = null;
    }

    /* JADX INFO: renamed from: a */
    public static C43913f m96748a() {
        synchronized (f97064i) {
            try {
                C43913f c43913f = f97065j;
                if (c43913f == null) {
                    return new C43913f();
                }
                f97065j = c43913f.f97074h;
                c43913f.f97074h = null;
                f97066k--;
                return c43913f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m96749b() {
        synchronized (f97064i) {
            try {
                if (f97066k < 5) {
                    m96750c();
                    f97066k++;
                    C43913f c43913f = f97065j;
                    if (c43913f != null) {
                        this.f97074h = c43913f;
                    }
                    f97065j = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C43913f m96751d(InterfaceC43595a interfaceC43595a) {
        this.f97067a = interfaceC43595a;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C43913f m96752e(long j11) {
        this.f97070d = j11;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C43913f m96753f(long j11) {
        this.f97071e = j11;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C43913f m96754g(CacheEventListener.EvictionReason evictionReason) {
        this.f97073g = evictionReason;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C43913f m96755h(IOException iOException) {
        this.f97072f = iOException;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C43913f m96756i(long j11) {
        this.f97069c = j11;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C43913f m96757j(String str) {
        this.f97068b = str;
        return this;
    }
}
