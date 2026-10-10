package p285g7;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: renamed from: g7.b */
/* JADX INFO: compiled from: TokenFilterContext.java */
/* JADX INFO: loaded from: classes45.dex */
public class C37830b extends AbstractC6302f {

    /* JADX INFO: renamed from: c */
    public final C37830b f85207c;

    /* JADX INFO: renamed from: d */
    public C37830b f85208d;

    /* JADX INFO: renamed from: e */
    public String f85209e;

    /* JADX INFO: renamed from: f */
    public TokenFilter f85210f;

    /* JADX INFO: renamed from: g */
    public boolean f85211g;

    /* JADX INFO: renamed from: h */
    public boolean f85212h;

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: c */
    public Object mo10934c() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static C37830b m85386o(TokenFilter tokenFilter) {
        return new C37830b(0, null, tokenFilter, true);
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: b */
    public final String mo10933b() {
        return this.f85209e;
    }

    /* JADX INFO: renamed from: k */
    public void m85387k(StringBuilder sb2) {
        C37830b c37830b = this.f85207c;
        if (c37830b != null) {
            c37830b.m85387k(sb2);
        }
        int i11 = this.f10050a;
        if (i11 != 2) {
            if (i11 != 1) {
                sb2.append("/");
                return;
            }
            sb2.append('[');
            sb2.append(m10932a());
            sb2.append(']');
            return;
        }
        sb2.append('{');
        if (this.f85209e != null) {
            sb2.append('\"');
            sb2.append(this.f85209e);
            sb2.append('\"');
        } else {
            sb2.append('?');
        }
        sb2.append('}');
    }

    /* JADX INFO: renamed from: l */
    public TokenFilter m85388l(TokenFilter tokenFilter) {
        int i11 = this.f10050a;
        if (i11 == 2) {
            return tokenFilter;
        }
        int i12 = this.f10051b + 1;
        this.f10051b = i12;
        return i11 == 1 ? tokenFilter.mo10946e(i12) : tokenFilter.m10948g(i12);
    }

    /* JADX INFO: renamed from: m */
    public C37830b m85389m(TokenFilter tokenFilter, boolean z11) {
        C37830b c37830b = this.f85208d;
        if (c37830b != null) {
            return c37830b.m85396u(1, tokenFilter, z11);
        }
        C37830b c37830b2 = new C37830b(1, this, tokenFilter, z11);
        this.f85208d = c37830b2;
        return c37830b2;
    }

    /* JADX INFO: renamed from: n */
    public C37830b m85390n(TokenFilter tokenFilter, boolean z11) {
        C37830b c37830b = this.f85208d;
        if (c37830b != null) {
            return c37830b.m85396u(2, tokenFilter, z11);
        }
        C37830b c37830b2 = new C37830b(2, this, tokenFilter, z11);
        this.f85208d = c37830b2;
        return c37830b2;
    }

    /* JADX INFO: renamed from: p */
    public C37830b m85391p(C37830b c37830b) {
        C37830b c37830b2 = this.f85207c;
        if (c37830b2 == c37830b) {
            return this;
        }
        while (c37830b2 != null) {
            C37830b c37830b3 = c37830b2.f85207c;
            if (c37830b3 == c37830b) {
                return c37830b2;
            }
            c37830b2 = c37830b3;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public TokenFilter m85392q() {
        return this.f85210f;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C37830b mo10936e() {
        return this.f85207c;
    }

    /* JADX INFO: renamed from: s */
    public boolean m85394s() {
        return this.f85211g;
    }

    /* JADX INFO: renamed from: t */
    public JsonToken m85395t() {
        if (!this.f85211g) {
            this.f85211g = true;
            return this.f10050a == 2 ? JsonToken.START_OBJECT : JsonToken.START_ARRAY;
        }
        if (!this.f85212h || this.f10050a != 2) {
            return null;
        }
        this.f85212h = false;
        return JsonToken.FIELD_NAME;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        m85387k(sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public C37830b m85396u(int i11, TokenFilter tokenFilter, boolean z11) {
        this.f10050a = i11;
        this.f85210f = tokenFilter;
        this.f10051b = -1;
        this.f85209e = null;
        this.f85211g = z11;
        this.f85212h = false;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public TokenFilter m85397v(String str) throws JsonProcessingException {
        this.f85209e = str;
        this.f85212h = true;
        return this.f85210f;
    }

    public C37830b(int i11, C37830b c37830b, TokenFilter tokenFilter, boolean z11) {
        this.f10050a = i11;
        this.f85207c = c37830b;
        this.f85210f = tokenFilter;
        this.f10051b = -1;
        this.f85211g = z11;
        this.f85212h = false;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: i */
    public void mo10940i(Object obj) {
    }
}
