package p008a6;

import com.facebook.imagepipeline.memory.PoolStatsTracker;
import p192d6.C36621b;
import p819z3.C46676e;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: a6.e0 */
/* JADX INFO: compiled from: PoolConfig.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0142e0 {

    /* JADX INFO: renamed from: a */
    public final C0148h0 f466a;

    /* JADX INFO: renamed from: b */
    public final PoolStatsTracker f467b;

    /* JADX INFO: renamed from: c */
    public final C0148h0 f468c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC46675d f469d;

    /* JADX INFO: renamed from: e */
    public final C0148h0 f470e;

    /* JADX INFO: renamed from: f */
    public final PoolStatsTracker f471f;

    /* JADX INFO: renamed from: g */
    public final C0148h0 f472g;

    /* JADX INFO: renamed from: h */
    public final PoolStatsTracker f473h;

    /* JADX INFO: renamed from: i */
    public final String f474i;

    /* JADX INFO: renamed from: j */
    public final int f475j;

    /* JADX INFO: renamed from: k */
    public final int f476k;

    /* JADX INFO: renamed from: l */
    public final boolean f477l;

    /* JADX INFO: renamed from: m */
    public final boolean f478m;

    /* JADX INFO: renamed from: a6.e0$a */
    /* JADX INFO: compiled from: PoolConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C0148h0 f479a;

        /* JADX INFO: renamed from: b */
        public PoolStatsTracker f480b;

        /* JADX INFO: renamed from: c */
        public C0148h0 f481c;

        /* JADX INFO: renamed from: d */
        public InterfaceC46675d f482d;

        /* JADX INFO: renamed from: e */
        public C0148h0 f483e;

        /* JADX INFO: renamed from: f */
        public PoolStatsTracker f484f;

        /* JADX INFO: renamed from: g */
        public C0148h0 f485g;

        /* JADX INFO: renamed from: h */
        public PoolStatsTracker f486h;

        /* JADX INFO: renamed from: i */
        public String f487i;

        /* JADX INFO: renamed from: j */
        public int f488j;

        /* JADX INFO: renamed from: k */
        public int f489k;

        /* JADX INFO: renamed from: l */
        public boolean f490l;

        /* JADX INFO: renamed from: m */
        public boolean f491m;

        public a() {
        }

        /* JADX INFO: renamed from: m */
        public C0142e0 m654m() {
            return new C0142e0(this);
        }
    }

    public C0142e0(a aVar) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("PoolConfig()");
        }
        this.f466a = aVar.f479a == null ? C0155o.m707a() : aVar.f479a;
        this.f467b = aVar.f480b == null ? C0136b0.m614h() : aVar.f480b;
        this.f468c = aVar.f481c == null ? C0157q.m711b() : aVar.f481c;
        this.f469d = aVar.f482d == null ? C46676e.m102898b() : aVar.f482d;
        this.f470e = aVar.f483e == null ? C0158r.m712a() : aVar.f483e;
        this.f471f = aVar.f484f == null ? C0136b0.m614h() : aVar.f484f;
        this.f472g = aVar.f485g == null ? C0156p.m709a() : aVar.f485g;
        this.f473h = aVar.f486h == null ? C0136b0.m614h() : aVar.f486h;
        this.f474i = aVar.f487i == null ? "legacy" : aVar.f487i;
        this.f475j = aVar.f488j;
        this.f476k = aVar.f489k > 0 ? aVar.f489k : 4194304;
        this.f477l = aVar.f490l;
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        this.f478m = aVar.f491m;
    }

    /* JADX INFO: renamed from: n */
    public static a m628n() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public int m629a() {
        return this.f476k;
    }

    /* JADX INFO: renamed from: b */
    public int m630b() {
        return this.f475j;
    }

    /* JADX INFO: renamed from: c */
    public C0148h0 m631c() {
        return this.f466a;
    }

    /* JADX INFO: renamed from: d */
    public PoolStatsTracker m632d() {
        return this.f467b;
    }

    /* JADX INFO: renamed from: e */
    public String m633e() {
        return this.f474i;
    }

    /* JADX INFO: renamed from: f */
    public C0148h0 m634f() {
        return this.f468c;
    }

    /* JADX INFO: renamed from: g */
    public C0148h0 m635g() {
        return this.f470e;
    }

    /* JADX INFO: renamed from: h */
    public PoolStatsTracker m636h() {
        return this.f471f;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC46675d m637i() {
        return this.f469d;
    }

    /* JADX INFO: renamed from: j */
    public C0148h0 m638j() {
        return this.f472g;
    }

    /* JADX INFO: renamed from: k */
    public PoolStatsTracker m639k() {
        return this.f473h;
    }

    /* JADX INFO: renamed from: l */
    public boolean m640l() {
        return this.f478m;
    }

    /* JADX INFO: renamed from: m */
    public boolean m641m() {
        return this.f477l;
    }
}
