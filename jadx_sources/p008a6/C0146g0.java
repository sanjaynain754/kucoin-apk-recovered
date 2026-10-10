package p008a6;

import com.facebook.imagepipeline.memory.AbstractC5659b;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C5658a;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import java.lang.reflect.InvocationTargetException;
import p617s5.C44347s;
import p712w3.C45708h;
import p747x3.C45999a;
import p819z3.C46682k;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46675d;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: a6.g0 */
/* JADX INFO: compiled from: PoolFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0146g0 {

    /* JADX INFO: renamed from: a */
    public final C0142e0 f501a;

    /* JADX INFO: renamed from: b */
    public AbstractC5659b f502b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0149i f503c;

    /* JADX INFO: renamed from: d */
    public AbstractC5659b f504d;

    /* JADX INFO: renamed from: e */
    public C0161u f505e;

    /* JADX INFO: renamed from: f */
    public AbstractC5659b f506f;

    /* JADX INFO: renamed from: g */
    public InterfaceC46679h f507g;

    /* JADX INFO: renamed from: h */
    public C46682k f508h;

    /* JADX INFO: renamed from: i */
    public InterfaceC46672a f509i;

    /* JADX INFO: renamed from: a */
    public final AbstractC5659b m669a() {
        if (this.f502b == null) {
            try {
                this.f502b = (AbstractC5659b) AshmemMemoryChunkPool.class.getConstructor(InterfaceC46675d.class, C0148h0.class, PoolStatsTracker.class).newInstance(this.f501a.m637i(), this.f501a.m635g(), this.f501a.m636h());
            } catch (ClassNotFoundException unused) {
                this.f502b = null;
            } catch (IllegalAccessException unused2) {
                this.f502b = null;
            } catch (InstantiationException unused3) {
                this.f502b = null;
            } catch (NoSuchMethodException unused4) {
                this.f502b = null;
            } catch (InvocationTargetException unused5) {
                this.f502b = null;
            }
        }
        return this.f502b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX INFO: renamed from: b */
    public InterfaceC0149i m670b() {
        byte b11;
        if (this.f503c == null) {
            switch (this.f501a.m633e()) {
                case "legacy_default_params":
                    b11 = 3;
                    break;
                case "legacy":
                    b11 = 4;
                    break;
                case "experimental":
                    b11 = 2;
                    break;
                case "dummy_with_tracking":
                    b11 = 1;
                    break;
                case "dummy":
                    b11 = 0;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            if (b11 == 0) {
                this.f503c = new C0159s();
            } else if (b11 == 1) {
                this.f503c = new C0160t();
            } else if (b11 == 2) {
                this.f503c = new C0162v(this.f501a.m630b(), this.f501a.m629a(), C0136b0.m614h(), this.f501a.m641m() ? this.f501a.m637i() : null);
            } else if (b11 != 3) {
                this.f503c = new C0153m(this.f501a.m637i(), this.f501a.m631c(), this.f501a.m632d(), this.f501a.m640l());
            } else {
                this.f503c = new C0153m(this.f501a.m637i(), C0155o.m707a(), this.f501a.m632d(), this.f501a.m640l());
            }
        }
        return this.f503c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC5659b m671c() {
        if (this.f504d == null) {
            try {
                this.f504d = (AbstractC5659b) BufferMemoryChunkPool.class.getConstructor(InterfaceC46675d.class, C0148h0.class, PoolStatsTracker.class).newInstance(this.f501a.m637i(), this.f501a.m635g(), this.f501a.m636h());
            } catch (ClassNotFoundException unused) {
                this.f504d = null;
            } catch (IllegalAccessException unused2) {
                this.f504d = null;
            } catch (InstantiationException unused3) {
                this.f504d = null;
            } catch (NoSuchMethodException unused4) {
                this.f504d = null;
            } catch (InvocationTargetException unused5) {
                this.f504d = null;
            }
        }
        return this.f504d;
    }

    /* JADX INFO: renamed from: d */
    public C0161u m672d() {
        if (this.f505e == null) {
            this.f505e = new C0161u(this.f501a.m637i(), this.f501a.m634f());
        }
        return this.f505e;
    }

    /* JADX INFO: renamed from: e */
    public int m673e() {
        return this.f501a.m634f().f520g;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC5659b m674f(int i11) {
        if (i11 == 0) {
            return m675g();
        }
        if (i11 == 1) {
            return m671c();
        }
        if (i11 == 2) {
            return m669a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX INFO: renamed from: g */
    public AbstractC5659b m675g() {
        if (this.f506f == null) {
            try {
                this.f506f = (AbstractC5659b) NativeMemoryChunkPool.class.getConstructor(InterfaceC46675d.class, C0148h0.class, PoolStatsTracker.class).newInstance(this.f501a.m637i(), this.f501a.m635g(), this.f501a.m636h());
            } catch (ClassNotFoundException e11) {
                C45999a.m101508n("PoolFactory", "", e11);
                this.f506f = null;
            } catch (IllegalAccessException e12) {
                C45999a.m101508n("PoolFactory", "", e12);
                this.f506f = null;
            } catch (InstantiationException e13) {
                C45999a.m101508n("PoolFactory", "", e13);
                this.f506f = null;
            } catch (NoSuchMethodException e14) {
                C45999a.m101508n("PoolFactory", "", e14);
                this.f506f = null;
            } catch (InvocationTargetException e15) {
                C45999a.m101508n("PoolFactory", "", e15);
                this.f506f = null;
            }
        }
        return this.f506f;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC46679h m677i(int i11) {
        if (this.f507g == null) {
            AbstractC5659b abstractC5659bM674f = m674f(i11);
            C45708h.m100897h(abstractC5659bM674f, "failed to get pool for chunk type: " + i11);
            this.f507g = new C0134a0(abstractC5659bM674f, m678j());
        }
        return this.f507g;
    }

    /* JADX INFO: renamed from: j */
    public C46682k m678j() {
        if (this.f508h == null) {
            this.f508h = new C46682k(m679k());
        }
        return this.f508h;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC46672a m679k() {
        if (this.f509i == null) {
            this.f509i = new C5658a(this.f501a.m637i(), this.f501a.m638j(), this.f501a.m639k());
        }
        return this.f509i;
    }

    public C0146g0(C0142e0 c0142e0) {
        this.f501a = (C0142e0) C45708h.m100896g(c0142e0);
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC46679h m676h() {
        return m677i(!C44347s.m97812a() ? 1 : 0);
    }
}
