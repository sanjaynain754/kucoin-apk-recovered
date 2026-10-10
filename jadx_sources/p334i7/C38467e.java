package p334i7;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: renamed from: i7.e */
/* JADX INFO: compiled from: JsonWriteContext.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38467e extends AbstractC6302f {

    /* JADX INFO: renamed from: c */
    public final C38467e f86328c;

    /* JADX INFO: renamed from: d */
    public C38464b f86329d;

    /* JADX INFO: renamed from: e */
    public C38467e f86330e;

    /* JADX INFO: renamed from: f */
    public String f86331f;

    /* JADX INFO: renamed from: g */
    public Object f86332g;

    /* JADX INFO: renamed from: h */
    public boolean f86333h;

    public C38467e(int i11, C38467e c38467e, C38464b c38464b) {
        this.f10050a = i11;
        this.f86328c = c38467e;
        this.f86329d = c38464b;
        this.f10051b = -1;
    }

    /* JADX INFO: renamed from: l */
    public C38467e m86810l() {
        this.f86332g = null;
        return this.f86328c;
    }

    /* JADX INFO: renamed from: q */
    public static C38467e m86809q(C38464b c38464b) {
        return new C38467e(0, null, c38464b);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: b */
    public final String mo10933b() {
        return this.f86331f;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: c */
    public Object mo10934c() {
        return this.f86332g;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: i */
    public void mo10940i(Object obj) {
        this.f86332g = obj;
    }

    /* JADX INFO: renamed from: m */
    public C38467e m86811m() {
        C38467e c38467e = this.f86330e;
        if (c38467e != null) {
            return c38467e.m86817t(1);
        }
        C38464b c38464b = this.f86329d;
        C38467e c38467e2 = new C38467e(1, this, c38464b == null ? null : c38464b.m86790a());
        this.f86330e = c38467e2;
        return c38467e2;
    }

    /* JADX INFO: renamed from: n */
    public C38467e m86812n(Object obj) {
        C38467e c38467e = this.f86330e;
        if (c38467e != null) {
            return c38467e.m86818u(1, obj);
        }
        C38464b c38464b = this.f86329d;
        C38467e c38467e2 = new C38467e(1, this, c38464b == null ? null : c38464b.m86790a(), obj);
        this.f86330e = c38467e2;
        return c38467e2;
    }

    /* JADX INFO: renamed from: o */
    public C38467e m86813o() {
        C38467e c38467e = this.f86330e;
        if (c38467e != null) {
            return c38467e.m86817t(2);
        }
        C38464b c38464b = this.f86329d;
        C38467e c38467e2 = new C38467e(2, this, c38464b == null ? null : c38464b.m86790a());
        this.f86330e = c38467e2;
        return c38467e2;
    }

    /* JADX INFO: renamed from: p */
    public C38467e m86814p(Object obj) {
        C38467e c38467e = this.f86330e;
        if (c38467e != null) {
            return c38467e.m86818u(2, obj);
        }
        C38464b c38464b = this.f86329d;
        C38467e c38467e2 = new C38467e(2, this, c38464b == null ? null : c38464b.m86790a(), obj);
        this.f86330e = c38467e2;
        return c38467e2;
    }

    /* JADX INFO: renamed from: r */
    public C38464b m86815r() {
        return this.f86329d;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C38467e mo10936e() {
        return this.f86328c;
    }

    /* JADX INFO: renamed from: t */
    public C38467e m86817t(int i11) {
        this.f10050a = i11;
        this.f10051b = -1;
        this.f86331f = null;
        this.f86333h = false;
        this.f86332g = null;
        C38464b c38464b = this.f86329d;
        if (c38464b != null) {
            c38464b.m86793d();
        }
        return this;
    }

    /* JADX INFO: renamed from: u */
    public C38467e m86818u(int i11, Object obj) {
        this.f10050a = i11;
        this.f10051b = -1;
        this.f86331f = null;
        this.f86333h = false;
        this.f86332g = obj;
        C38464b c38464b = this.f86329d;
        if (c38464b != null) {
            c38464b.m86793d();
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C38467e m86819v(C38464b c38464b) {
        this.f86329d = c38464b;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public int m86820w(String str) throws JsonProcessingException {
        if (this.f10050a != 2 || this.f86333h) {
            return 4;
        }
        this.f86333h = true;
        this.f86331f = str;
        C38464b c38464b = this.f86329d;
        if (c38464b != null) {
            m86808k(c38464b, str);
        }
        return this.f10051b < 0 ? 0 : 1;
    }

    /* JADX INFO: renamed from: x */
    public int m86821x() {
        int i11 = this.f10050a;
        if (i11 == 2) {
            if (!this.f86333h) {
                return 5;
            }
            this.f86333h = false;
            this.f10051b++;
            return 2;
        }
        if (i11 == 1) {
            int i12 = this.f10051b;
            this.f10051b = i12 + 1;
            return i12 < 0 ? 0 : 1;
        }
        int i13 = this.f10051b + 1;
        this.f10051b = i13;
        return i13 == 0 ? 0 : 3;
    }

    /* JADX INFO: renamed from: k */
    private final void m86808k(C38464b c38464b, String str) throws JsonProcessingException {
        JsonGenerator jsonGenerator;
        if (c38464b.m86792c(str)) {
            Object objM86791b = c38464b.m86791b();
            String str2 = "Duplicate field '" + str + "'";
            if (objM86791b instanceof JsonGenerator) {
                jsonGenerator = (JsonGenerator) objM86791b;
            } else {
                jsonGenerator = null;
            }
            throw new JsonGenerationException(str2, jsonGenerator);
        }
    }

    public C38467e(int i11, C38467e c38467e, C38464b c38464b, Object obj) {
        this.f10050a = i11;
        this.f86328c = c38467e;
        this.f86329d = c38464b;
        this.f10051b = -1;
        this.f86332g = obj;
    }
}
