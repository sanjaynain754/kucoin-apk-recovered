package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.C6328g;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import p285g7.C37830b;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.filter.a */
/* JADX INFO: compiled from: FilteringParserDelegate.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6303a extends C6328g {

    /* JADX INFO: renamed from: f */
    public TokenFilter f10054f;

    /* JADX INFO: renamed from: g */
    public boolean f10055g;

    /* JADX INFO: renamed from: h */
    public TokenFilter.Inclusion f10056h;

    /* JADX INFO: renamed from: i */
    public JsonToken f10057i;

    /* JADX INFO: renamed from: j */
    public JsonToken f10058j;

    /* JADX INFO: renamed from: k */
    public C37830b f10059k;

    /* JADX INFO: renamed from: l */
    public C37830b f10060l;

    /* JADX INFO: renamed from: m */
    public TokenFilter f10061m;

    /* JADX INFO: renamed from: n */
    public int f10062n;

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C */
    public BigDecimal mo10855C() throws IOException {
        return this.f10161e.mo10855C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C0 */
    public JsonParser mo10856C0() throws IOException {
        JsonToken jsonToken = this.f10057i;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i11 = 1;
            while (true) {
                JsonToken jsonTokenMo10905t0 = mo10905t0();
                if (jsonTokenMo10905t0 == null) {
                    break;
                }
                if (!jsonTokenMo10905t0.isStructStart()) {
                    if (jsonTokenMo10905t0.isStructEnd() && (i11 = i11 - 1) == 0) {
                        break;
                    }
                } else {
                    i11++;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: D0 */
    public AbstractC6302f m10950D0() {
        C37830b c37830b = this.f10060l;
        return c37830b != null ? c37830b : this.f10059k;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: E */
    public double mo10857E() throws IOException {
        return this.f10161e.mo10857E();
    }

    /* JADX INFO: renamed from: E0 */
    public final JsonToken m10951E0(C37830b c37830b) throws IOException {
        this.f10060l = c37830b;
        JsonToken jsonTokenM85395t = c37830b.m85395t();
        if (jsonTokenM85395t != null) {
            return jsonTokenM85395t;
        }
        while (c37830b != this.f10059k) {
            c37830b = this.f10060l.m85391p(c37830b);
            this.f10060l = c37830b;
            if (c37830b == null) {
                throw m10873a("Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenM85395t2 = c37830b.m85395t();
            if (jsonTokenM85395t2 != null) {
                return jsonTokenM85395t2;
            }
        }
        throw m10873a("Internal error: failed to locate expected buffered tokens");
    }

    /* JADX INFO: renamed from: F0 */
    public final JsonToken m10952F0() throws IOException {
        TokenFilter tokenFilterM85388l;
        JsonToken jsonTokenM10953G0;
        JsonToken jsonTokenM10953G1;
        JsonToken jsonTokenM10953G2;
        while (true) {
            JsonToken jsonTokenMo10905t0 = this.f10161e.mo10905t0();
            if (jsonTokenMo10905t0 == null) {
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
            int iM10917id = jsonTokenMo10905t0.m10917id();
            if (iM10917id != 1) {
                if (iM10917id != 2) {
                    if (iM10917id == 3) {
                        TokenFilter tokenFilter = this.f10061m;
                        TokenFilter tokenFilter2 = TokenFilter.f10052a;
                        if (tokenFilter == tokenFilter2) {
                            this.f10059k = this.f10059k.m85389m(tokenFilter, true);
                            this.f10057i = jsonTokenMo10905t0;
                            return jsonTokenMo10905t0;
                        }
                        if (tokenFilter == null) {
                            this.f10161e.mo10856C0();
                        } else {
                            TokenFilter tokenFilterM85388l2 = this.f10059k.m85388l(tokenFilter);
                            if (tokenFilterM85388l2 == null) {
                                this.f10161e.mo10856C0();
                            } else {
                                if (tokenFilterM85388l2 != tokenFilter2) {
                                    tokenFilterM85388l2 = tokenFilterM85388l2.mo10944c();
                                }
                                this.f10061m = tokenFilterM85388l2;
                                if (tokenFilterM85388l2 == tokenFilter2) {
                                    this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                                    this.f10057i = jsonTokenMo10905t0;
                                    return jsonTokenMo10905t0;
                                }
                                if (tokenFilterM85388l2 != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                                    this.f10057i = jsonTokenMo10905t0;
                                    return jsonTokenMo10905t0;
                                }
                                C37830b c37830bM85389m = this.f10059k.m85389m(tokenFilterM85388l2, false);
                                this.f10059k = c37830bM85389m;
                                if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenM10953G1 = m10953G0(c37830bM85389m)) != null) {
                                    this.f10057i = jsonTokenM10953G1;
                                    return jsonTokenM10953G1;
                                }
                            }
                        }
                    } else if (iM10917id != 4) {
                        if (iM10917id != 5) {
                            TokenFilter tokenFilter3 = this.f10061m;
                            TokenFilter tokenFilter4 = TokenFilter.f10052a;
                            if (tokenFilter3 == tokenFilter4) {
                                this.f10057i = jsonTokenMo10905t0;
                                return jsonTokenMo10905t0;
                            }
                            if (tokenFilter3 != null && ((tokenFilterM85388l = this.f10059k.m85388l(tokenFilter3)) == tokenFilter4 || (tokenFilterM85388l != null && tokenFilterM85388l.m10949h(this.f10161e)))) {
                                if (m10954H0()) {
                                    this.f10057i = jsonTokenMo10905t0;
                                    return jsonTokenMo10905t0;
                                }
                            }
                        } else {
                            String strMo10910w = this.f10161e.mo10910w();
                            TokenFilter tokenFilterM85397v = this.f10059k.m85397v(strMo10910w);
                            TokenFilter tokenFilter5 = TokenFilter.f10052a;
                            if (tokenFilterM85397v == tokenFilter5) {
                                this.f10061m = tokenFilterM85397v;
                                this.f10057i = jsonTokenMo10905t0;
                                return jsonTokenMo10905t0;
                            }
                            if (tokenFilterM85397v == null) {
                                this.f10161e.mo10905t0();
                                this.f10161e.mo10856C0();
                            } else {
                                TokenFilter tokenFilterMo10947f = tokenFilterM85397v.mo10947f(strMo10910w);
                                if (tokenFilterMo10947f == null) {
                                    this.f10161e.mo10905t0();
                                    this.f10161e.mo10856C0();
                                } else {
                                    this.f10061m = tokenFilterMo10947f;
                                    if (tokenFilterMo10947f == tokenFilter5) {
                                        if (!m10954H0()) {
                                            this.f10161e.mo10905t0();
                                            this.f10161e.mo10856C0();
                                        } else if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.f10057i = jsonTokenMo10905t0;
                                            return jsonTokenMo10905t0;
                                        }
                                    } else if (this.f10056h != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenM10953G0 = m10953G0(this.f10059k)) != null) {
                                        this.f10057i = jsonTokenM10953G0;
                                        return jsonTokenM10953G0;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zM85394s = this.f10059k.m85394s();
                TokenFilter tokenFilterM85392q = this.f10059k.m85392q();
                if (tokenFilterM85392q != null && tokenFilterM85392q != TokenFilter.f10052a) {
                    tokenFilterM85392q.m10943b();
                }
                C37830b c37830bMo10936e = this.f10059k.mo10936e();
                this.f10059k = c37830bMo10936e;
                this.f10061m = c37830bMo10936e.m85392q();
                if (zM85394s) {
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
            } else {
                TokenFilter tokenFilter6 = this.f10061m;
                TokenFilter tokenFilter7 = TokenFilter.f10052a;
                if (tokenFilter6 == tokenFilter7) {
                    this.f10059k = this.f10059k.m85390n(tokenFilter6, true);
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
                if (tokenFilter6 == null) {
                    this.f10161e.mo10856C0();
                } else {
                    TokenFilter tokenFilterM85388l3 = this.f10059k.m85388l(tokenFilter6);
                    if (tokenFilterM85388l3 == null) {
                        this.f10161e.mo10856C0();
                    } else {
                        if (tokenFilterM85388l3 != tokenFilter7) {
                            tokenFilterM85388l3 = tokenFilterM85388l3.mo10945d();
                        }
                        this.f10061m = tokenFilterM85388l3;
                        if (tokenFilterM85388l3 == tokenFilter7) {
                            this.f10059k = this.f10059k.m85390n(tokenFilterM85388l3, true);
                            this.f10057i = jsonTokenMo10905t0;
                            return jsonTokenMo10905t0;
                        }
                        if (tokenFilterM85388l3 != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.f10059k = this.f10059k.m85390n(tokenFilterM85388l3, true);
                            this.f10057i = jsonTokenMo10905t0;
                            return jsonTokenMo10905t0;
                        }
                        C37830b c37830bM85390n = this.f10059k.m85390n(tokenFilterM85388l3, false);
                        this.f10059k = c37830bM85390n;
                        if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenM10953G2 = m10953G0(c37830bM85390n)) != null) {
                            this.f10057i = jsonTokenM10953G2;
                            return jsonTokenM10953G2;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final JsonToken m10953G0(C37830b c37830b) throws IOException {
        TokenFilter tokenFilterM85388l;
        while (true) {
            JsonToken jsonTokenMo10905t0 = this.f10161e.mo10905t0();
            if (jsonTokenMo10905t0 == null) {
                return jsonTokenMo10905t0;
            }
            int iM10917id = jsonTokenMo10905t0.m10917id();
            boolean z11 = false;
            if (iM10917id != 1) {
                if (iM10917id != 2) {
                    if (iM10917id == 3) {
                        TokenFilter tokenFilterM85388l2 = this.f10059k.m85388l(this.f10061m);
                        if (tokenFilterM85388l2 == null) {
                            this.f10161e.mo10856C0();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.f10052a;
                            if (tokenFilterM85388l2 != tokenFilter) {
                                tokenFilterM85388l2 = tokenFilterM85388l2.mo10944c();
                            }
                            this.f10061m = tokenFilterM85388l2;
                            if (tokenFilterM85388l2 == tokenFilter) {
                                this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                                return m10951E0(c37830b);
                            }
                            if (tokenFilterM85388l2 != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                                return m10951E0(c37830b);
                            }
                            this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, false);
                        }
                    } else if (iM10917id != 4) {
                        if (iM10917id != 5) {
                            TokenFilter tokenFilter2 = this.f10061m;
                            TokenFilter tokenFilter3 = TokenFilter.f10052a;
                            if (tokenFilter2 == tokenFilter3) {
                                return m10951E0(c37830b);
                            }
                            if (tokenFilter2 != null && ((tokenFilterM85388l = this.f10059k.m85388l(tokenFilter2)) == tokenFilter3 || (tokenFilterM85388l != null && tokenFilterM85388l.m10949h(this.f10161e)))) {
                                if (m10954H0()) {
                                    return m10951E0(c37830b);
                                }
                            }
                        } else {
                            String strMo10910w = this.f10161e.mo10910w();
                            TokenFilter tokenFilterM85397v = this.f10059k.m85397v(strMo10910w);
                            TokenFilter tokenFilter4 = TokenFilter.f10052a;
                            if (tokenFilterM85397v == tokenFilter4) {
                                this.f10061m = tokenFilterM85397v;
                                return m10951E0(c37830b);
                            }
                            if (tokenFilterM85397v == null) {
                                this.f10161e.mo10905t0();
                                this.f10161e.mo10856C0();
                            } else {
                                TokenFilter tokenFilterMo10947f = tokenFilterM85397v.mo10947f(strMo10910w);
                                if (tokenFilterMo10947f == null) {
                                    this.f10161e.mo10905t0();
                                    this.f10161e.mo10856C0();
                                } else {
                                    this.f10061m = tokenFilterMo10947f;
                                    if (tokenFilterMo10947f != tokenFilter4) {
                                        continue;
                                    } else {
                                        if (m10954H0()) {
                                            return m10951E0(c37830b);
                                        }
                                        this.f10061m = this.f10059k.m85397v(strMo10910w);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter tokenFilterM85392q = this.f10059k.m85392q();
                if (tokenFilterM85392q != null && tokenFilterM85392q != TokenFilter.f10052a) {
                    tokenFilterM85392q.m10943b();
                }
                C37830b c37830b2 = this.f10059k;
                if (c37830b2 == c37830b && c37830b2.m85394s()) {
                    z11 = true;
                }
                C37830b c37830bMo10936e = this.f10059k.mo10936e();
                this.f10059k = c37830bMo10936e;
                this.f10061m = c37830bMo10936e.m85392q();
                if (z11) {
                    return jsonTokenMo10905t0;
                }
            } else {
                TokenFilter tokenFilter5 = this.f10061m;
                TokenFilter tokenFilter6 = TokenFilter.f10052a;
                if (tokenFilter5 == tokenFilter6) {
                    this.f10059k = this.f10059k.m85390n(tokenFilter5, true);
                    return jsonTokenMo10905t0;
                }
                if (tokenFilter5 == null) {
                    this.f10161e.mo10856C0();
                } else {
                    TokenFilter tokenFilterM85388l3 = this.f10059k.m85388l(tokenFilter5);
                    if (tokenFilterM85388l3 == null) {
                        this.f10161e.mo10856C0();
                    } else {
                        if (tokenFilterM85388l3 != tokenFilter6) {
                            tokenFilterM85388l3 = tokenFilterM85388l3.mo10945d();
                        }
                        this.f10061m = tokenFilterM85388l3;
                        if (tokenFilterM85388l3 == tokenFilter6) {
                            this.f10059k = this.f10059k.m85390n(tokenFilterM85388l3, true);
                            return m10951E0(c37830b);
                        }
                        if (tokenFilterM85388l3 != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.f10059k = this.f10059k.m85389m(tokenFilterM85388l3, true);
                            return m10951E0(c37830b);
                        }
                        this.f10059k = this.f10059k.m85390n(tokenFilterM85388l3, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m10954H0() throws IOException {
        int i11 = this.f10062n;
        if (i11 != 0 && !this.f10055g) {
            return false;
        }
        this.f10062n = i11 + 1;
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: J */
    public Object mo10858J() throws IOException {
        return this.f10161e.mo10858J();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: L */
    public float mo10859L() throws IOException {
        return this.f10161e.mo10859L();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: M */
    public int mo10860M() throws IOException {
        return this.f10161e.mo10860M();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: O */
    public long mo10861O() throws IOException {
        return this.f10161e.mo10861O();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: P */
    public JsonParser.NumberType mo10862P() throws IOException {
        return this.f10161e.mo10862P();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Q */
    public Number mo10863Q() throws IOException {
        return this.f10161e.mo10863Q();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: V */
    public short mo10868V() throws IOException {
        return this.f10161e.mo10868V();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() throws IOException {
        return this.f10057i == JsonToken.FIELD_NAME ? mo10887j() : this.f10161e.mo10869W();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public char[] mo10870X() throws IOException {
        return this.f10057i == JsonToken.FIELD_NAME ? mo10887j().toCharArray() : this.f10161e.mo10870X();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        return this.f10057i == JsonToken.FIELD_NAME ? mo10887j().length() : this.f10161e.mo10871Y();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    public int mo10872Z() throws IOException {
        if (this.f10057i == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.f10161e.mo10872Z();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        return this.f10161e.mo10874a0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: c0 */
    public int mo10877c0() throws IOException {
        return this.f10161e.mo10877c0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: d0 */
    public int mo10878d0(int i11) throws IOException {
        return this.f10161e.mo10878d0(i11);
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: e0 */
    public long mo10879e0() throws IOException {
        return this.f10161e.mo10879e0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: f0 */
    public long mo10880f0(long j11) throws IOException {
        return this.f10161e.mo10880f0(j11);
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        return this.f10057i == JsonToken.FIELD_NAME ? mo10887j() : this.f10161e.mo10882g0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        return this.f10057i == JsonToken.FIELD_NAME ? mo10887j() : this.f10161e.mo10884h0(str);
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i */
    public void mo10885i() {
        JsonToken jsonToken = this.f10057i;
        if (jsonToken != null) {
            this.f10058j = jsonToken;
            this.f10057i = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i0 */
    public boolean mo10886i0() {
        return this.f10057i != null;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j0 */
    public boolean mo10888j0() {
        if (this.f10057i == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.f10161e.mo10888j0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k */
    public JsonToken mo10889k() {
        return this.f10057i;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k0 */
    public final boolean mo10890k0(JsonToken jsonToken) {
        return this.f10057i == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l */
    public final int mo10891l() {
        JsonToken jsonToken = this.f10057i;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m10917id();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l0 */
    public boolean mo10892l0(int i11) {
        JsonToken jsonToken = this.f10057i;
        if (jsonToken == null) {
            return i11 == 0;
        }
        return jsonToken.m10917id() == i11;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n */
    public BigInteger mo10895n() throws IOException {
        return this.f10161e.mo10895n();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: o0 */
    public boolean mo10898o0() {
        return this.f10057i == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        return this.f10161e.mo10899p(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p0 */
    public boolean mo10900p0() {
        return this.f10057i == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q */
    public byte mo10901q() throws IOException {
        return this.f10161e.mo10901q();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public JsonToken mo10905t0() throws IOException {
        TokenFilter tokenFilterM85388l;
        JsonToken jsonTokenM10953G0;
        boolean zM85394s;
        TokenFilter tokenFilterM85392q;
        TokenFilter tokenFilterM85388l2;
        JsonToken jsonTokenM10953G1;
        TokenFilter tokenFilterMo10947f;
        JsonToken jsonTokenM10953G2;
        TokenFilter tokenFilterM85388l3;
        JsonToken jsonToken;
        if (!this.f10055g && (jsonToken = this.f10057i) != null && this.f10060l == null && jsonToken.isScalarValue() && !this.f10059k.m85394s() && this.f10056h == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this.f10061m == TokenFilter.f10052a) {
            this.f10057i = null;
            return null;
        }
        C37830b c37830bM85391p = this.f10060l;
        if (c37830bM85391p != null) {
            while (true) {
                JsonToken jsonTokenM85395t = c37830bM85391p.m85395t();
                if (jsonTokenM85395t != null) {
                    this.f10057i = jsonTokenM85395t;
                    return jsonTokenM85395t;
                }
                C37830b c37830b = this.f10059k;
                if (c37830bM85391p == c37830b) {
                    this.f10060l = null;
                    if (!c37830bM85391p.m10937f()) {
                        JsonToken jsonTokenMo10889k = this.f10161e.mo10889k();
                        if (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
                            break;
                        }
                        this.f10057i = jsonTokenMo10889k;
                        return jsonTokenMo10889k;
                    }
                    JsonToken jsonTokenMo10912x = this.f10161e.mo10912x();
                    this.f10057i = jsonTokenMo10912x;
                    return jsonTokenMo10912x;
                }
                c37830bM85391p = c37830b.m85391p(c37830bM85391p);
                this.f10060l = c37830bM85391p;
                if (c37830bM85391p == null) {
                    throw m10873a("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        JsonToken jsonTokenMo10905t0 = this.f10161e.mo10905t0();
        if (jsonTokenMo10905t0 == null) {
            this.f10057i = jsonTokenMo10905t0;
            return jsonTokenMo10905t0;
        }
        int iM10917id = jsonTokenMo10905t0.m10917id();
        if (iM10917id == 1) {
            TokenFilter tokenFilter = this.f10061m;
            TokenFilter tokenFilter2 = TokenFilter.f10052a;
            if (tokenFilter == tokenFilter2) {
                this.f10059k = this.f10059k.m85390n(tokenFilter, true);
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
            if (tokenFilter == null || (tokenFilterM85388l = this.f10059k.m85388l(tokenFilter)) == null) {
                this.f10161e.mo10856C0();
            } else {
                if (tokenFilterM85388l != tokenFilter2) {
                    tokenFilterM85388l = tokenFilterM85388l.mo10945d();
                }
                this.f10061m = tokenFilterM85388l;
                if (tokenFilterM85388l == tokenFilter2) {
                    this.f10059k = this.f10059k.m85390n(tokenFilterM85388l, true);
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
                if (tokenFilterM85388l != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.f10059k = this.f10059k.m85390n(tokenFilterM85388l, true);
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
                C37830b c37830bM85390n = this.f10059k.m85390n(tokenFilterM85388l, false);
                this.f10059k = c37830bM85390n;
                if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenM10953G0 = m10953G0(c37830bM85390n)) != null) {
                    this.f10057i = jsonTokenM10953G0;
                    return jsonTokenM10953G0;
                }
            }
        } else if (iM10917id == 2) {
            zM85394s = this.f10059k.m85394s();
            tokenFilterM85392q = this.f10059k.m85392q();
            if (tokenFilterM85392q != null && tokenFilterM85392q != TokenFilter.f10052a) {
                tokenFilterM85392q.m10943b();
            }
            C37830b c37830bMo10936e = this.f10059k.mo10936e();
            this.f10059k = c37830bMo10936e;
            this.f10061m = c37830bMo10936e.m85392q();
            if (zM85394s) {
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
        } else if (iM10917id == 3) {
            TokenFilter tokenFilter3 = this.f10061m;
            TokenFilter tokenFilter4 = TokenFilter.f10052a;
            if (tokenFilter3 == tokenFilter4) {
                this.f10059k = this.f10059k.m85389m(tokenFilter3, true);
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
            if (tokenFilter3 == null || (tokenFilterM85388l2 = this.f10059k.m85388l(tokenFilter3)) == null) {
                this.f10161e.mo10856C0();
            } else {
                if (tokenFilterM85388l2 != tokenFilter4) {
                    tokenFilterM85388l2 = tokenFilterM85388l2.mo10944c();
                }
                this.f10061m = tokenFilterM85388l2;
                if (tokenFilterM85388l2 == tokenFilter4) {
                    this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
                if (tokenFilterM85388l2 != null && this.f10056h == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.f10059k = this.f10059k.m85389m(tokenFilterM85388l2, true);
                    this.f10057i = jsonTokenMo10905t0;
                    return jsonTokenMo10905t0;
                }
                C37830b c37830bM85389m = this.f10059k.m85389m(tokenFilterM85388l2, false);
                this.f10059k = c37830bM85389m;
                if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenM10953G1 = m10953G0(c37830bM85389m)) != null) {
                    this.f10057i = jsonTokenM10953G1;
                    return jsonTokenM10953G1;
                }
            }
        } else if (iM10917id == 4) {
            zM85394s = this.f10059k.m85394s();
            tokenFilterM85392q = this.f10059k.m85392q();
            if (tokenFilterM85392q != null) {
                tokenFilterM85392q.m10943b();
            }
            C37830b c37830bMo10936e2 = this.f10059k.mo10936e();
            this.f10059k = c37830bMo10936e2;
            this.f10061m = c37830bMo10936e2.m85392q();
            if (zM85394s) {
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
        } else if (iM10917id != 5) {
            TokenFilter tokenFilter5 = this.f10061m;
            TokenFilter tokenFilter6 = TokenFilter.f10052a;
            if (tokenFilter5 == tokenFilter6) {
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
            if (tokenFilter5 != null && (((tokenFilterM85388l3 = this.f10059k.m85388l(tokenFilter5)) == tokenFilter6 || (tokenFilterM85388l3 != null && tokenFilterM85388l3.m10949h(this.f10161e))) && m10954H0())) {
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
        } else {
            String strMo10910w = this.f10161e.mo10910w();
            TokenFilter tokenFilterM85397v = this.f10059k.m85397v(strMo10910w);
            TokenFilter tokenFilter7 = TokenFilter.f10052a;
            if (tokenFilterM85397v == tokenFilter7) {
                this.f10061m = tokenFilterM85397v;
                this.f10057i = jsonTokenMo10905t0;
                return jsonTokenMo10905t0;
            }
            if (tokenFilterM85397v == null || (tokenFilterMo10947f = tokenFilterM85397v.mo10947f(strMo10910w)) == null) {
                this.f10161e.mo10905t0();
                this.f10161e.mo10856C0();
            } else {
                this.f10061m = tokenFilterMo10947f;
                if (tokenFilterMo10947f == tokenFilter7) {
                    if (!m10954H0()) {
                        this.f10161e.mo10905t0();
                        this.f10161e.mo10856C0();
                    } else if (this.f10056h == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                        this.f10057i = jsonTokenMo10905t0;
                        return jsonTokenMo10905t0;
                    }
                }
                if (this.f10056h != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenM10953G2 = m10953G0(this.f10059k)) != null) {
                    this.f10057i = jsonTokenM10953G2;
                    return jsonTokenM10953G2;
                }
            }
        }
        return m10952F0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        return this.f10161e.mo10908v();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x */
    public JsonToken mo10912x() {
        return this.f10057i;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.f10161e.mo10913x0(base64Variant, outputStream);
    }

    public C6303a(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z11) {
        super(jsonParser);
        this.f10054f = tokenFilter;
        this.f10061m = tokenFilter;
        this.f10059k = C37830b.m85386o(tokenFilter);
        this.f10056h = inclusion;
        this.f10055g = z11;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: T */
    public AbstractC6302f mo10866T() {
        return m10950D0();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j */
    public String mo10887j() throws IOException {
        AbstractC6302f abstractC6302fM10950D0 = m10950D0();
        JsonToken jsonToken = this.f10057i;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return abstractC6302fM10950D0.mo10933b();
        }
        AbstractC6302f abstractC6302fMo10936e = abstractC6302fM10950D0.mo10936e();
        if (abstractC6302fMo10936e == null) {
            return null;
        }
        return abstractC6302fMo10936e.mo10933b();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u0 */
    public JsonToken mo10907u0() throws IOException {
        JsonToken jsonTokenMo10905t0 = mo10905t0();
        if (jsonTokenMo10905t0 == JsonToken.FIELD_NAME) {
            return mo10905t0();
        }
        return jsonTokenMo10905t0;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w */
    public String mo10910w() throws IOException {
        AbstractC6302f abstractC6302fM10950D0 = m10950D0();
        JsonToken jsonToken = this.f10057i;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return abstractC6302fM10950D0.mo10933b();
        }
        AbstractC6302f abstractC6302fMo10936e = abstractC6302fM10950D0.mo10936e();
        if (abstractC6302fMo10936e == null) {
            return null;
        }
        return abstractC6302fMo10936e.mo10933b();
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    /* JADX INFO: renamed from: z */
    public final int mo10915z() {
        return mo10891l();
    }
}
