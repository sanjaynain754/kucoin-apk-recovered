package p520p;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes23.dex */
public class C43341b extends AbstractC43343d {

    /* JADX INFO: renamed from: a */
    public final String f95684a;

    /* JADX INFO: renamed from: p.b$a */
    public static class a extends AbstractC43343d.a {

        /* JADX INFO: renamed from: a */
        public String f95685a;

        /* JADX INFO: renamed from: b */
        public C43341b m95418b() {
            return new C43341b(this);
        }

        /* JADX INFO: renamed from: c */
        public a m95419c(String str) {
            this.f95685a = str;
            return this;
        }
    }

    @Override // p520p.AbstractC43343d
    /* JADX INFO: renamed from: a */
    public int mo95414a() {
        String str = this.f95684a;
        if (str == null) {
            return 0;
        }
        return str.getBytes().length;
    }

    /* JADX INFO: renamed from: b */
    public String m95416b() {
        return this.f95684a;
    }

    public C43341b(a aVar) {
        super(aVar);
        this.f95684a = aVar.f95685a;
    }
}
