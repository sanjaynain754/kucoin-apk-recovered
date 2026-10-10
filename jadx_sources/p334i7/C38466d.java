package p334i7;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p062io.ContentReference;

/* JADX INFO: renamed from: i7.d */
/* JADX INFO: compiled from: JsonReadContext.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C38466d extends AbstractC6302f {

    /* JADX INFO: renamed from: c */
    public final C38466d f86321c;

    /* JADX INFO: renamed from: d */
    public C38464b f86322d;

    /* JADX INFO: renamed from: e */
    public C38466d f86323e;

    /* JADX INFO: renamed from: f */
    public String f86324f;

    /* JADX INFO: renamed from: g */
    public Object f86325g;

    /* JADX INFO: renamed from: h */
    public int f86326h;

    /* JADX INFO: renamed from: i */
    public int f86327i;

    /* JADX INFO: renamed from: l */
    public C38466d m86798l() {
        this.f86325g = null;
        return this.f86321c;
    }

    /* JADX INFO: renamed from: o */
    public static C38466d m86796o(C38464b c38464b) {
        return new C38466d(null, c38464b, 0, 1, 0);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: b */
    public String mo10933b() {
        return this.f86324f;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: c */
    public Object mo10934c() {
        return this.f86325g;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: i */
    public void mo10940i(Object obj) {
        this.f86325g = obj;
    }

    /* JADX INFO: renamed from: m */
    public C38466d m86799m(int i11, int i12) {
        C38466d c38466d = this.f86323e;
        if (c38466d != null) {
            c38466d.m86804s(1, i11, i12);
            return c38466d;
        }
        C38464b c38464b = this.f86322d;
        C38466d c38466d2 = new C38466d(this, c38464b == null ? null : c38464b.m86790a(), 1, i11, i12);
        this.f86323e = c38466d2;
        return c38466d2;
    }

    /* JADX INFO: renamed from: n */
    public C38466d m86800n(int i11, int i12) {
        C38466d c38466d = this.f86323e;
        if (c38466d != null) {
            c38466d.m86804s(2, i11, i12);
            return c38466d;
        }
        C38464b c38464b = this.f86322d;
        C38466d c38466d2 = new C38466d(this, c38464b == null ? null : c38464b.m86790a(), 2, i11, i12);
        this.f86323e = c38466d2;
        return c38466d2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m86801p() {
        int i11 = this.f10051b + 1;
        this.f10051b = i11;
        return this.f10050a != 0 && i11 > 0;
    }

    /* JADX INFO: renamed from: q */
    public C38464b m86802q() {
        return this.f86322d;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C38466d mo10936e() {
        return this.f86321c;
    }

    /* JADX INFO: renamed from: s */
    public void m86804s(int i11, int i12, int i13) {
        this.f10050a = i11;
        this.f10051b = -1;
        this.f86326h = i12;
        this.f86327i = i13;
        this.f86324f = null;
        this.f86325g = null;
        C38464b c38464b = this.f86322d;
        if (c38464b != null) {
            c38464b.m86793d();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m86805t(String str) throws JsonProcessingException {
        this.f86324f = str;
        C38464b c38464b = this.f86322d;
        if (c38464b != null) {
            m86797k(c38464b, str);
        }
    }

    /* JADX INFO: renamed from: u */
    public JsonLocation m86806u(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this.f86326h, this.f86327i);
    }

    /* JADX INFO: renamed from: v */
    public C38466d m86807v(C38464b c38464b) {
        this.f86322d = c38464b;
        return this;
    }

    public C38466d(C38466d c38466d, C38464b c38464b, int i11, int i12, int i13) {
        this.f86321c = c38466d;
        this.f86322d = c38464b;
        this.f10050a = i11;
        this.f86326h = i12;
        this.f86327i = i13;
        this.f10051b = -1;
    }

    /* JADX INFO: renamed from: k */
    public final void m86797k(C38464b c38464b, String str) throws JsonProcessingException {
        JsonParser jsonParser;
        if (c38464b.m86792c(str)) {
            Object objM86791b = c38464b.m86791b();
            if (objM86791b instanceof JsonParser) {
                jsonParser = (JsonParser) objM86791b;
            } else {
                jsonParser = null;
            }
            throw new JsonParseException(jsonParser, "Duplicate field '" + str + "'");
        }
    }
}
