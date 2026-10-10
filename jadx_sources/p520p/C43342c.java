package p520p;

import java.util.ArrayList;
import java.util.List;
import p457n.C42691l;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes23.dex */
public class C43342c extends AbstractC43343d {

    /* JADX INFO: renamed from: a */
    public final List<b> f95686a;

    /* JADX INFO: renamed from: b */
    public byte[] f95687b;

    /* JADX INFO: renamed from: p.c$a */
    public static class a extends AbstractC43343d.a {

        /* JADX INFO: renamed from: a */
        public final List<b> f95688a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public byte[] f95689b;

        /* JADX INFO: renamed from: e */
        public a m95428e(byte[] bArr) {
            this.f95689b = bArr;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m95429f(String str, String str2, String str3, byte[] bArr) {
            this.f95688a.add(new b(str, str2, str3, bArr));
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C43342c m95430g() {
            return new C43342c(this);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ c m95424a(a aVar) {
            aVar.getClass();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ d m95426c(a aVar) {
            aVar.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: p.c$b */
    public static class b extends e {

        /* JADX INFO: renamed from: c */
        public final String f95690c;

        /* JADX INFO: renamed from: d */
        public final byte[] f95691d;

        /* JADX INFO: renamed from: c */
        public byte[] m95431c() {
            return this.f95691d;
        }

        /* JADX INFO: renamed from: d */
        public String m95432d() {
            return this.f95690c;
        }

        public b(String str, String str2, String str3, byte[] bArr) {
            super(str, str3);
            this.f95690c = str2;
            this.f95691d = bArr;
        }
    }

    /* JADX INFO: renamed from: p.c$c */
    public static class c extends e {
    }

    /* JADX INFO: renamed from: p.c$d */
    public static class d extends e {
    }

    /* JADX INFO: renamed from: p.c$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final String f95692a;

        /* JADX INFO: renamed from: b */
        public final String f95693b;

        /* JADX INFO: renamed from: a */
        public String m95433a() {
            return this.f95693b;
        }

        /* JADX INFO: renamed from: b */
        public String m95434b() {
            return this.f95692a;
        }

        public e(String str, String str2) {
            this.f95692a = str;
            this.f95693b = str2;
        }
    }

    /* JADX INFO: renamed from: d */
    public c m95422d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public d m95423e() {
        return null;
    }

    @Override // p520p.AbstractC43343d
    /* JADX INFO: renamed from: a */
    public int mo95414a() {
        return this.f95687b.length;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m95420b() {
        return this.f95687b;
    }

    /* JADX INFO: renamed from: c */
    public List<b> m95421c() {
        return this.f95686a;
    }

    public C43342c(a aVar) {
        super(aVar);
        a.m95424a(aVar);
        this.f95686a = aVar.f95688a;
        a.m95426c(aVar);
        byte[] bArr = aVar.f95689b;
        this.f95687b = bArr;
        if (bArr == null) {
            this.f95687b = C42691l.m93561a(this);
        }
    }
}
