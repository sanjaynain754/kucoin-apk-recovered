package p583r3;

import android.content.Context;
import com.facebook.cache.common.C5554b;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.C5560a;
import com.tencent.bugly.proguard.C33557b4;
import java.io.File;
import p547q3.C43598d;
import p630t3.C44680c;
import p630t3.InterfaceC44679b;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: r3.b */
/* JADX INFO: compiled from: DiskCacheConfig.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43909b {

    /* JADX INFO: renamed from: a */
    public final int f97039a;

    /* JADX INFO: renamed from: b */
    public final String f97040b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45711k<File> f97041c;

    /* JADX INFO: renamed from: d */
    public final long f97042d;

    /* JADX INFO: renamed from: e */
    public final long f97043e;

    /* JADX INFO: renamed from: f */
    public final long f97044f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC43911d f97045g;

    /* JADX INFO: renamed from: h */
    public final CacheErrorLogger f97046h;

    /* JADX INFO: renamed from: i */
    public final CacheEventListener f97047i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC44679b f97048j;

    /* JADX INFO: renamed from: k */
    public final Context f97049k;

    /* JADX INFO: renamed from: l */
    public final boolean f97050l;

    /* JADX INFO: renamed from: r3.b$a */
    /* JADX INFO: compiled from: DiskCacheConfig.java */
    public class a implements InterfaceC45711k<File> {
        public a() {
        }

        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            C45708h.m100896g(C43909b.this.f97049k);
            return C43909b.this.f97049k.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: renamed from: r3.b$b */
    /* JADX INFO: compiled from: DiskCacheConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f97052a;

        /* JADX INFO: renamed from: b */
        public String f97053b;

        /* JADX INFO: renamed from: c */
        public InterfaceC45711k<File> f97054c;

        /* JADX INFO: renamed from: d */
        public long f97055d;

        /* JADX INFO: renamed from: e */
        public long f97056e;

        /* JADX INFO: renamed from: f */
        public long f97057f;

        /* JADX INFO: renamed from: g */
        public InterfaceC43911d f97058g;

        /* JADX INFO: renamed from: h */
        public CacheErrorLogger f97059h;

        /* JADX INFO: renamed from: i */
        public CacheEventListener f97060i;

        /* JADX INFO: renamed from: j */
        public InterfaceC44679b f97061j;

        /* JADX INFO: renamed from: k */
        public boolean f97062k;

        /* JADX INFO: renamed from: l */
        public final Context f97063l;

        public b(Context context) {
            this.f97052a = 1;
            this.f97053b = "image_cache";
            this.f97055d = 41943040L;
            this.f97056e = C33557b4.f69134v;
            this.f97057f = 2097152L;
            this.f97058g = new C5560a();
            this.f97063l = context;
        }

        /* JADX INFO: renamed from: n */
        public C43909b m96747n() {
            return new C43909b(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public static b m96721m(Context context) {
        return new b(context);
    }

    /* JADX INFO: renamed from: b */
    public String m96722b() {
        return this.f97040b;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC45711k<File> m96723c() {
        return this.f97041c;
    }

    /* JADX INFO: renamed from: d */
    public CacheErrorLogger m96724d() {
        return this.f97046h;
    }

    /* JADX INFO: renamed from: e */
    public CacheEventListener m96725e() {
        return this.f97047i;
    }

    /* JADX INFO: renamed from: f */
    public long m96726f() {
        return this.f97042d;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC44679b m96727g() {
        return this.f97048j;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC43911d m96728h() {
        return this.f97045g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m96729i() {
        return this.f97050l;
    }

    /* JADX INFO: renamed from: j */
    public long m96730j() {
        return this.f97043e;
    }

    /* JADX INFO: renamed from: k */
    public long m96731k() {
        return this.f97044f;
    }

    /* JADX INFO: renamed from: l */
    public int m96732l() {
        return this.f97039a;
    }

    public C43909b(b bVar) {
        boolean z11;
        CacheErrorLogger cacheErrorLoggerM8455b;
        CacheEventListener cacheEventListenerM95954i;
        InterfaceC44679b interfaceC44679bM98833b;
        Context context = bVar.f97063l;
        this.f97049k = context;
        if (bVar.f97054c == null && context == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        C45708h.m100899j(z11, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f97054c == null && context != null) {
            bVar.f97054c = new a();
        }
        this.f97039a = bVar.f97052a;
        this.f97040b = (String) C45708h.m100896g(bVar.f97053b);
        this.f97041c = (InterfaceC45711k) C45708h.m100896g(bVar.f97054c);
        this.f97042d = bVar.f97055d;
        this.f97043e = bVar.f97056e;
        this.f97044f = bVar.f97057f;
        this.f97045g = (InterfaceC43911d) C45708h.m100896g(bVar.f97058g);
        if (bVar.f97059h != null) {
            cacheErrorLoggerM8455b = bVar.f97059h;
        } else {
            cacheErrorLoggerM8455b = C5554b.m8455b();
        }
        this.f97046h = cacheErrorLoggerM8455b;
        if (bVar.f97060i != null) {
            cacheEventListenerM95954i = bVar.f97060i;
        } else {
            cacheEventListenerM95954i = C43598d.m95954i();
        }
        this.f97047i = cacheEventListenerM95954i;
        if (bVar.f97061j != null) {
            interfaceC44679bM98833b = bVar.f97061j;
        } else {
            interfaceC44679bM98833b = C44680c.m98833b();
        }
        this.f97048j = interfaceC44679bM98833b;
        this.f97050l = bVar.f97062k;
    }
}
