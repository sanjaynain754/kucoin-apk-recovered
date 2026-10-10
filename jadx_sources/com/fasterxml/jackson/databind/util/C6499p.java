package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InterfaceC6392g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import p254f7.AbstractC37386c;
import p334i7.C38467e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.p */
/* JADX INFO: compiled from: TokenBuffer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6499p extends JsonGenerator {

    /* JADX INFO: renamed from: u */
    public static final int f10756u = JsonGenerator.Feature.collectDefaults();

    /* JADX INFO: renamed from: f */
    public AbstractC6304g f10757f;

    /* JADX INFO: renamed from: g */
    public AbstractC6302f f10758g;

    /* JADX INFO: renamed from: i */
    public boolean f10760i;

    /* JADX INFO: renamed from: j */
    public boolean f10761j;

    /* JADX INFO: renamed from: k */
    public boolean f10762k;

    /* JADX INFO: renamed from: l */
    public boolean f10763l;

    /* JADX INFO: renamed from: m */
    public boolean f10764m;

    /* JADX INFO: renamed from: n */
    public c f10765n;

    /* JADX INFO: renamed from: o */
    public c f10766o;

    /* JADX INFO: renamed from: p */
    public int f10767p;

    /* JADX INFO: renamed from: q */
    public Object f10768q;

    /* JADX INFO: renamed from: r */
    public Object f10769r;

    /* JADX INFO: renamed from: s */
    public boolean f10770s = false;

    /* JADX INFO: renamed from: h */
    public int f10759h = f10756u;

    /* JADX INFO: renamed from: t */
    public C38467e f10771t = C38467e.m86809q(null);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.p$b */
    /* JADX INFO: compiled from: TokenBuffer.java */
    public static final class b extends AbstractC37386c {

        /* JADX INFO: renamed from: q */
        public AbstractC6304g f10774q;

        /* JADX INFO: renamed from: r */
        public final boolean f10775r;

        /* JADX INFO: renamed from: s */
        public final boolean f10776s;

        /* JADX INFO: renamed from: t */
        public final boolean f10777t;

        /* JADX INFO: renamed from: u */
        public c f10778u;

        /* JADX INFO: renamed from: v */
        public int f10779v;

        /* JADX INFO: renamed from: w */
        public C6500q f10780w;

        /* JADX INFO: renamed from: x */
        public boolean f10781x;

        /* JADX INFO: renamed from: y */
        public transient C6324c f10782y;

        /* JADX INFO: renamed from: z */
        public JsonLocation f10783z;

        public b(c cVar, AbstractC6304g abstractC6304g, boolean z11, boolean z12, AbstractC6302f abstractC6302f) {
            super(0);
            this.f10783z = null;
            this.f10778u = cVar;
            this.f10779v = -1;
            this.f10774q = abstractC6304g;
            this.f10780w = C6500q.m12047m(abstractC6302f);
            this.f10775r = z11;
            this.f10776s = z12;
            this.f10777t = z11 || z12;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: Z */
        public int mo10872Z() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: j0 */
        public boolean mo10888j0() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: J */
        public Object mo10858J() {
            if (this.f82981e == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return m12026h1();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: M */
        public int mo10860M() throws IOException {
            Number numberMo10863Q = this.f82981e == JsonToken.VALUE_NUMBER_INT ? (Number) m12026h1() : mo10863Q();
            return ((numberMo10863Q instanceof Integer) || m12027i1(numberMo10863Q)) ? numberMo10863Q.intValue() : m12024f1(numberMo10863Q);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: O */
        public long mo10861O() throws IOException {
            Number numberMo10863Q = this.f82981e == JsonToken.VALUE_NUMBER_INT ? (Number) m12026h1() : mo10863Q();
            return ((numberMo10863Q instanceof Long) || m12028j1(numberMo10863Q)) ? numberMo10863Q.longValue() : m12025g1(numberMo10863Q);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: S */
        public Object mo10865S() {
            return this.f10778u.m12037h(this.f10779v);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: T */
        public AbstractC6302f mo10866T() {
            return this.f10780w;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: U */
        public C6327f<StreamReadCapability> mo10867U() {
            return JsonParser.f10026d;
        }

        @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: W */
        public String mo10869W() {
            JsonToken jsonToken = this.f82981e;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object objM12026h1 = m12026h1();
                return objM12026h1 instanceof String ? (String) objM12026h1 : C6490g.m11925a0(objM12026h1);
            }
            if (jsonToken == null) {
                return null;
            }
            int i11 = a.f10772a[jsonToken.ordinal()];
            return (i11 == 7 || i11 == 8) ? C6490g.m11925a0(m12026h1()) : this.f82981e.asString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: b0 */
        public Object mo10876b0() {
            return this.f10778u.m12038i(this.f10779v);
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f10781x) {
                return;
            }
            this.f10781x = true;
        }

        /* JADX INFO: renamed from: e1 */
        public final void m12023e1() throws JacksonException {
            JsonToken jsonToken = this.f82981e;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw m10873a("Current token (" + this.f82981e + ") not numeric, cannot use numeric value accessors");
            }
        }

        /* JADX INFO: renamed from: f1 */
        public int m12024f1(Number number) throws IOException {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i11 = (int) jLongValue;
                if (i11 != jLongValue) {
                    m84106X0();
                }
                return i11;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (AbstractC37386c.f82973i.compareTo(bigInteger) > 0 || AbstractC37386c.f82974j.compareTo(bigInteger) < 0) {
                    m84106X0();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        m84106X0();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (AbstractC37386c.f82979o.compareTo(bigDecimal) > 0 || AbstractC37386c.f82980p.compareTo(bigDecimal) < 0) {
                        m84106X0();
                    }
                } else {
                    m84102T0();
                }
            }
            return number.intValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: g */
        public boolean mo10881g() {
            return this.f10776s;
        }

        /* JADX INFO: renamed from: g1 */
        public long m12025g1(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (AbstractC37386c.f82975k.compareTo(bigInteger) > 0 || AbstractC37386c.f82976l.compareTo(bigInteger) < 0) {
                    m84109a1();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        m84109a1();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (AbstractC37386c.f82977m.compareTo(bigDecimal) > 0 || AbstractC37386c.f82978n.compareTo(bigDecimal) < 0) {
                        m84109a1();
                    }
                } else {
                    m84102T0();
                }
            }
            return number.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: h */
        public boolean mo10883h() {
            return this.f10775r;
        }

        /* JADX INFO: renamed from: h1 */
        public final Object m12026h1() {
            return this.f10778u.m12039j(this.f10779v);
        }

        /* JADX INFO: renamed from: i1 */
        public final boolean m12027i1(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: j */
        public String mo10887j() {
            JsonToken jsonToken = this.f82981e;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this.f10780w.mo10936e().mo10933b() : this.f10780w.mo10933b();
        }

        /* JADX INFO: renamed from: j1 */
        public final boolean m12028j1(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        /* JADX INFO: renamed from: k1 */
        public void m12029k1(JsonLocation jsonLocation) {
            this.f10783z = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: p */
        public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
            if (this.f82981e == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objM12026h1 = m12026h1();
                if (objM12026h1 instanceof byte[]) {
                    return (byte[]) objM12026h1;
                }
            }
            if (this.f82981e != JsonToken.VALUE_STRING) {
                throw m10873a("Current token (" + this.f82981e + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strMo10869W = mo10869W();
            if (strMo10869W == null) {
                return null;
            }
            C6324c c6324c = this.f10782y;
            if (c6324c == null) {
                c6324c = new C6324c(100);
                this.f10782y = c6324c;
            } else {
                c6324c.m11076n();
            }
            m84089E0(strMo10869W, c6324c, base64Variant);
            return c6324c.m11079q();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: q0 */
        public boolean mo10902q0() {
            if (this.f82981e == JsonToken.VALUE_NUMBER_FLOAT) {
                Object objM12026h1 = m12026h1();
                if (objM12026h1 instanceof Double) {
                    Double d11 = (Double) objM12026h1;
                    return d11.isNaN() || d11.isInfinite();
                }
                if (objM12026h1 instanceof Float) {
                    Float f11 = (Float) objM12026h1;
                    return f11.isNaN() || f11.isInfinite();
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: r0 */
        public String mo10903r0() throws IOException {
            c cVar;
            if (!this.f10781x && (cVar = this.f10778u) != null) {
                int i11 = this.f10779v + 1;
                if (i11 < 16) {
                    JsonToken jsonTokenM12046q = cVar.m12046q(i11);
                    JsonToken jsonToken = JsonToken.FIELD_NAME;
                    if (jsonTokenM12046q == jsonToken) {
                        this.f10779v = i11;
                        this.f82981e = jsonToken;
                        Object objM12039j = this.f10778u.m12039j(i11);
                        String string = objM12039j instanceof String ? (String) objM12039j : objM12039j.toString();
                        this.f10780w.m12051o(string);
                        return string;
                    }
                }
                if (mo10905t0() == JsonToken.FIELD_NAME) {
                    return mo10887j();
                }
            }
            return null;
        }

        @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: t0 */
        public JsonToken mo10905t0() throws IOException {
            c cVar;
            if (this.f10781x || (cVar = this.f10778u) == null) {
                return null;
            }
            int i11 = this.f10779v + 1;
            this.f10779v = i11;
            if (i11 >= 16) {
                this.f10779v = 0;
                c cVarM12041l = cVar.m12041l();
                this.f10778u = cVarM12041l;
                if (cVarM12041l == null) {
                    return null;
                }
            }
            JsonToken jsonTokenM12046q = this.f10778u.m12046q(this.f10779v);
            this.f82981e = jsonTokenM12046q;
            if (jsonTokenM12046q == JsonToken.FIELD_NAME) {
                Object objM12026h1 = m12026h1();
                this.f10780w.m12051o(objM12026h1 instanceof String ? (String) objM12026h1 : objM12026h1.toString());
            } else if (jsonTokenM12046q == JsonToken.START_OBJECT) {
                this.f10780w = this.f10780w.m12049l();
            } else if (jsonTokenM12046q == JsonToken.START_ARRAY) {
                this.f10780w = this.f10780w.m12048k();
            } else if (jsonTokenM12046q == JsonToken.END_OBJECT || jsonTokenM12046q == JsonToken.END_ARRAY) {
                this.f10780w = this.f10780w.m12050n();
            } else {
                this.f10780w.m12052p();
            }
            return this.f82981e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: u */
        public AbstractC6304g mo10906u() {
            return this.f10774q;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: v */
        public JsonLocation mo10908v() {
            JsonLocation jsonLocation = this.f10783z;
            return jsonLocation == null ? JsonLocation.f10025NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: C */
        public BigDecimal mo10855C() throws IOException {
            Number numberMo10863Q = mo10863Q();
            if (numberMo10863Q instanceof BigDecimal) {
                return (BigDecimal) numberMo10863Q;
            }
            int i11 = a.f10773b[mo10862P().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 5) {
                        return BigDecimal.valueOf(numberMo10863Q.doubleValue());
                    }
                } else {
                    return new BigDecimal((BigInteger) numberMo10863Q);
                }
            }
            return BigDecimal.valueOf(numberMo10863Q.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: E */
        public double mo10857E() throws IOException {
            return mo10863Q().doubleValue();
        }

        @Override // p254f7.AbstractC37386c
        /* JADX INFO: renamed from: G0 */
        public void mo11734G0() {
            m84102T0();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: L */
        public float mo10859L() throws IOException {
            return mo10863Q().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: P */
        public JsonParser.NumberType mo10862P() throws IOException {
            Number numberMo10863Q = mo10863Q();
            if (numberMo10863Q instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberMo10863Q instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberMo10863Q instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberMo10863Q instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberMo10863Q instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberMo10863Q instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberMo10863Q instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: Q */
        public final Number mo10863Q() throws IOException {
            m12023e1();
            Object objM12026h1 = m12026h1();
            if (objM12026h1 instanceof Number) {
                return (Number) objM12026h1;
            }
            if (objM12026h1 instanceof String) {
                String str = (String) objM12026h1;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            }
            if (objM12026h1 == null) {
                return null;
            }
            throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + objM12026h1.getClass().getName());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: X */
        public char[] mo10870X() {
            String strMo10869W = mo10869W();
            if (strMo10869W == null) {
                return null;
            }
            return strMo10869W.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: Y */
        public int mo10871Y() {
            String strMo10869W = mo10869W();
            if (strMo10869W == null) {
                return 0;
            }
            return strMo10869W.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: a0 */
        public JsonLocation mo10874a0() {
            return mo10908v();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: n */
        public BigInteger mo10895n() throws IOException {
            Number numberMo10863Q = mo10863Q();
            if (numberMo10863Q instanceof BigInteger) {
                return (BigInteger) numberMo10863Q;
            }
            if (mo10862P() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberMo10863Q).toBigInteger();
            }
            return BigInteger.valueOf(numberMo10863Q.longValue());
        }

        @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: w */
        public String mo10910w() {
            return mo10887j();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        /* JADX INFO: renamed from: x0 */
        public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] bArrMo10899p = mo10899p(base64Variant);
            if (bArrMo10899p == null) {
                return 0;
            }
            outputStream.write(bArrMo10899p, 0, bArrMo10899p.length);
            return bArrMo10899p.length;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.p$c */
    /* JADX INFO: compiled from: TokenBuffer.java */
    public static final class c {

        /* JADX INFO: renamed from: e */
        public static final JsonToken[] f10784e;

        /* JADX INFO: renamed from: a */
        public c f10785a;

        /* JADX INFO: renamed from: b */
        public long f10786b;

        /* JADX INFO: renamed from: c */
        public final Object[] f10787c = new Object[16];

        /* JADX INFO: renamed from: d */
        public TreeMap<Integer, Object> f10788d;

        /* JADX INFO: renamed from: a */
        public final int m12030a(int i11) {
            return i11 + i11 + 1;
        }

        /* JADX INFO: renamed from: b */
        public final int m12031b(int i11) {
            return i11 + i11;
        }

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            f10784e = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        /* JADX INFO: renamed from: c */
        public c m12032c(int i11, JsonToken jsonToken) {
            if (i11 < 16) {
                m12042m(i11, jsonToken);
                return null;
            }
            c cVar = new c();
            this.f10785a = cVar;
            cVar.m12042m(0, jsonToken);
            return this.f10785a;
        }

        /* JADX INFO: renamed from: d */
        public c m12033d(int i11, JsonToken jsonToken, Object obj) {
            if (i11 < 16) {
                m12043n(i11, jsonToken, obj);
                return null;
            }
            c cVar = new c();
            this.f10785a = cVar;
            cVar.m12043n(0, jsonToken, obj);
            return this.f10785a;
        }

        /* JADX INFO: renamed from: e */
        public c m12034e(int i11, JsonToken jsonToken, Object obj, Object obj2) {
            if (i11 < 16) {
                m12044o(i11, jsonToken, obj, obj2);
                return null;
            }
            c cVar = new c();
            this.f10785a = cVar;
            cVar.m12044o(0, jsonToken, obj, obj2);
            return this.f10785a;
        }

        /* JADX INFO: renamed from: f */
        public c m12035f(int i11, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i11 < 16) {
                m12045p(i11, jsonToken, obj, obj2, obj3);
                return null;
            }
            c cVar = new c();
            this.f10785a = cVar;
            cVar.m12045p(0, jsonToken, obj, obj2, obj3);
            return this.f10785a;
        }

        /* JADX INFO: renamed from: g */
        public final void m12036g(int i11, Object obj, Object obj2) {
            if (this.f10788d == null) {
                this.f10788d = new TreeMap<>();
            }
            if (obj != null) {
                this.f10788d.put(Integer.valueOf(m12030a(i11)), obj);
            }
            if (obj2 != null) {
                this.f10788d.put(Integer.valueOf(m12031b(i11)), obj2);
            }
        }

        /* JADX INFO: renamed from: h */
        public Object m12037h(int i11) {
            TreeMap<Integer, Object> treeMap = this.f10788d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(m12030a(i11)));
        }

        /* JADX INFO: renamed from: i */
        public Object m12038i(int i11) {
            TreeMap<Integer, Object> treeMap = this.f10788d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(m12031b(i11)));
        }

        /* JADX INFO: renamed from: j */
        public Object m12039j(int i11) {
            return this.f10787c[i11];
        }

        /* JADX INFO: renamed from: k */
        public boolean m12040k() {
            return this.f10788d != null;
        }

        /* JADX INFO: renamed from: l */
        public c m12041l() {
            return this.f10785a;
        }

        /* JADX INFO: renamed from: n */
        public final void m12043n(int i11, JsonToken jsonToken, Object obj) {
            this.f10787c[i11] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i11 > 0) {
                jOrdinal <<= i11 << 2;
            }
            this.f10786b |= jOrdinal;
        }

        /* JADX INFO: renamed from: p */
        public final void m12045p(int i11, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.f10787c[i11] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i11 > 0) {
                jOrdinal <<= i11 << 2;
            }
            this.f10786b = jOrdinal | this.f10786b;
            m12036g(i11, obj2, obj3);
        }

        /* JADX INFO: renamed from: q */
        public JsonToken m12046q(int i11) {
            long j11 = this.f10786b;
            if (i11 > 0) {
                j11 >>= i11 << 2;
            }
            return f10784e[((int) j11) & 15];
        }

        /* JADX INFO: renamed from: m */
        public final void m12042m(int i11, JsonToken jsonToken) {
            long jOrdinal = jsonToken.ordinal();
            if (i11 > 0) {
                jOrdinal <<= i11 << 2;
            }
            this.f10786b |= jOrdinal;
        }

        /* JADX INFO: renamed from: o */
        public final void m12044o(int i11, JsonToken jsonToken, Object obj, Object obj2) {
            long jOrdinal = jsonToken.ordinal();
            if (i11 > 0) {
                jOrdinal <<= i11 << 2;
            }
            this.f10786b = jOrdinal | this.f10786b;
            m12036g(i11, obj, obj2);
        }
    }

    public C6499p(AbstractC6304g abstractC6304g, boolean z11) {
        this.f10757f = abstractC6304g;
        c cVar = new c();
        this.f10766o = cVar;
        this.f10765n = cVar;
        this.f10767p = 0;
        this.f10761j = z11;
        this.f10762k = z11;
        this.f10763l = z11 || z11;
    }

    /* JADX INFO: renamed from: P0 */
    public void m12009P0(JsonParser jsonParser) throws IOException {
        int i11 = 1;
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 == null) {
                return;
            }
            int i12 = a.f10772a[jsonTokenMo10905t0.ordinal()];
            if (i12 == 1) {
                if (this.f10763l) {
                    m12008O0(jsonParser);
                }
                mo10850y0();
            } else if (i12 == 2) {
                mo10806X();
                i11--;
                if (i11 == 0) {
                    return;
                }
            } else if (i12 == 3) {
                if (this.f10763l) {
                    m12008O0(jsonParser);
                }
                mo10843u0();
            } else if (i12 == 4) {
                mo10805W();
                i11--;
                if (i11 == 0) {
                    return;
                }
            } else if (i12 != 5) {
                m12010Q0(jsonParser, jsonTokenMo10905t0);
            } else {
                if (this.f10763l) {
                    m12008O0(jsonParser);
                }
                mo10810a0(jsonParser.mo10887j());
            }
            i11++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10760i = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: j */
    public boolean mo10823j() {
        return true;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.p$a */
    /* JADX INFO: compiled from: TokenBuffer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10772a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10773b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f10773b = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10773b[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10773b[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10773b[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10773b[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f10772a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10772a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10772a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10772a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10772a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10772a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10772a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10772a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10772a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10772a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10772a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10772a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: A0 */
    public void mo10784A0(Object obj, int i11) throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_OBJECT);
        this.f10771t = this.f10771t.m86814p(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: B0 */
    public void mo10785B0(InterfaceC6306i interfaceC6306i) throws IOException {
        if (interfaceC6306i == null) {
            mo10812b0();
        } else {
            m12007N0(JsonToken.VALUE_STRING, interfaceC6306i);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: C0 */
    public void mo10787C0(String str) throws IOException {
        if (str == null) {
            mo10812b0();
        } else {
            m12007N0(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: D0 */
    public void mo10788D0(char[] cArr, int i11, int i12) throws IOException {
        mo10787C0(new String(cArr, i11, i12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: F0 */
    public void mo10791F0(Object obj) {
        this.f10768q = obj;
        this.f10770s = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m12002I0(JsonToken jsonToken) {
        c cVarM12032c = this.f10766o.m12032c(this.f10767p, jsonToken);
        if (cVarM12032c == null) {
            this.f10767p++;
        } else {
            this.f10766o = cVarM12032c;
            this.f10767p = 1;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m12003J0(Object obj) {
        c cVarM12035f = this.f10770s ? this.f10766o.m12035f(this.f10767p, JsonToken.FIELD_NAME, obj, this.f10769r, this.f10768q) : this.f10766o.m12033d(this.f10767p, JsonToken.FIELD_NAME, obj);
        if (cVarM12035f == null) {
            this.f10767p++;
        } else {
            this.f10766o = cVarM12035f;
            this.f10767p = 1;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m12004K0(StringBuilder sb2) {
        Object objM12037h = this.f10766o.m12037h(this.f10767p - 1);
        if (objM12037h != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(objM12037h));
            sb2.append(']');
        }
        Object objM12038i = this.f10766o.m12038i(this.f10767p - 1);
        if (objM12038i != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(objM12038i));
            sb2.append(']');
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m12005L0(JsonToken jsonToken) {
        c cVarM12034e = this.f10770s ? this.f10766o.m12034e(this.f10767p, jsonToken, this.f10769r, this.f10768q) : this.f10766o.m12032c(this.f10767p, jsonToken);
        if (cVarM12034e == null) {
            this.f10767p++;
        } else {
            this.f10766o = cVarM12034e;
            this.f10767p = 1;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m12006M0(JsonToken jsonToken) {
        this.f10771t.m86821x();
        c cVarM12034e = this.f10770s ? this.f10766o.m12034e(this.f10767p, jsonToken, this.f10769r, this.f10768q) : this.f10766o.m12032c(this.f10767p, jsonToken);
        if (cVarM12034e == null) {
            this.f10767p++;
        } else {
            this.f10766o = cVarM12034e;
            this.f10767p = 1;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m12007N0(JsonToken jsonToken, Object obj) {
        this.f10771t.m86821x();
        c cVarM12035f = this.f10770s ? this.f10766o.m12035f(this.f10767p, jsonToken, obj, this.f10769r, this.f10768q) : this.f10766o.m12033d(this.f10767p, jsonToken, obj);
        if (cVarM12035f == null) {
            this.f10767p++;
        } else {
            this.f10766o = cVarM12035f;
            this.f10767p = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: P */
    public int mo10798P(Base64Variant base64Variant, InputStream inputStream, int i11) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m12010Q0(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this.f10763l) {
            m12008O0(jsonParser);
        }
        switch (a.f10772a[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.mo10888j0()) {
                    mo10788D0(jsonParser.mo10870X(), jsonParser.mo10872Z(), jsonParser.mo10871Y());
                    return;
                } else {
                    mo10787C0(jsonParser.mo10869W());
                    return;
                }
            case 7:
                int i11 = a.f10773b[jsonParser.mo10862P().ordinal()];
                if (i11 == 1) {
                    mo10815e0(jsonParser.mo10860M());
                    return;
                } else if (i11 != 2) {
                    mo10816f0(jsonParser.mo10861O());
                    return;
                } else {
                    mo10822i0(jsonParser.mo10895n());
                    return;
                }
            case 8:
                if (this.f10764m) {
                    mo10820h0(jsonParser.mo10855C());
                    return;
                } else {
                    m12007N0(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.mo10864R());
                    return;
                }
            case 9:
                mo10803U(true);
                return;
            case 10:
                mo10803U(false);
                return;
            case 11:
                mo10812b0();
                return;
            case 12:
                mo10826k0(jsonParser.mo10858J());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: R */
    public void mo10800R(Base64Variant base64Variant, byte[] bArr, int i11, int i12) throws IOException {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        mo10826k0(bArr2);
    }

    /* JADX INFO: renamed from: R0 */
    public void m12011R0() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    /* JADX INFO: renamed from: S0 */
    public C6499p m12012S0(C6499p c6499p) throws IOException {
        if (!this.f10761j) {
            this.f10761j = c6499p.mo10827l();
        }
        if (!this.f10762k) {
            this.f10762k = c6499p.mo10825k();
        }
        this.f10763l = this.f10761j || this.f10762k;
        JsonParser jsonParserM12013T0 = c6499p.m12013T0();
        while (jsonParserM12013T0.mo10905t0() != null) {
            m12017X0(jsonParserM12013T0);
        }
        return this;
    }

    /* JADX INFO: renamed from: T0 */
    public JsonParser m12013T0() {
        return m12015V0(this.f10757f);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: U */
    public void mo10803U(boolean z11) throws IOException {
        m12006M0(z11 ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    /* JADX INFO: renamed from: U0 */
    public JsonParser m12014U0(JsonParser jsonParser) {
        b bVar = new b(this.f10765n, jsonParser.mo10906u(), this.f10761j, this.f10762k, this.f10758g);
        bVar.m12029k1(jsonParser.mo10874a0());
        return bVar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: V */
    public void mo10804V(Object obj) throws IOException {
        m12007N0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    /* JADX INFO: renamed from: V0 */
    public JsonParser m12015V0(AbstractC6304g abstractC6304g) {
        return new b(this.f10765n, abstractC6304g, this.f10761j, this.f10762k, this.f10758g);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: W */
    public final void mo10805W() throws IOException {
        m12002I0(JsonToken.END_ARRAY);
        C38467e c38467eMo10936e = this.f10771t.mo10936e();
        if (c38467eMo10936e != null) {
            this.f10771t = c38467eMo10936e;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public JsonParser m12016W0() throws IOException {
        JsonParser jsonParserM12015V0 = m12015V0(this.f10757f);
        jsonParserM12015V0.mo10905t0();
        return jsonParserM12015V0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: X */
    public final void mo10806X() throws IOException {
        m12002I0(JsonToken.END_OBJECT);
        C38467e c38467eMo10936e = this.f10771t.mo10936e();
        if (c38467eMo10936e != null) {
            this.f10771t = c38467eMo10936e;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public C6499p m12018Y0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenMo10905t0;
        if (!jsonParser.mo10890k0(JsonToken.FIELD_NAME)) {
            m12017X0(jsonParser);
            return this;
        }
        mo10850y0();
        do {
            m12017X0(jsonParser);
            jsonTokenMo10905t0 = jsonParser.mo10905t0();
        } while (jsonTokenMo10905t0 == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (jsonTokenMo10905t0 != jsonToken) {
            deserializationContext.reportWrongTokenException(C6499p.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenMo10905t0, new Object[0]);
        }
        mo10806X();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: Z */
    public void mo10808Z(InterfaceC6306i interfaceC6306i) throws IOException {
        this.f10771t.m86820w(interfaceC6306i.getValue());
        m12003J0(interfaceC6306i);
    }

    /* JADX INFO: renamed from: Z0 */
    public JsonToken m12019Z0() {
        return this.f10765n.m12046q(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: a0 */
    public final void mo10810a0(String str) throws IOException {
        this.f10771t.m86820w(str);
        m12003J0(str);
    }

    /* JADX INFO: renamed from: a1 */
    public C6499p m12020a1(boolean z11) {
        this.f10764m = z11;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: b0 */
    public void mo10812b0() throws IOException {
        m12006M0(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final C38467e mo10833o() {
        return this.f10771t;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: c0 */
    public void mo10813c0(double d11) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d11));
    }

    /* JADX INFO: renamed from: c1 */
    public void m12022c1(JsonGenerator jsonGenerator) throws IOException {
        c cVarM12041l = this.f10765n;
        boolean z11 = this.f10763l;
        boolean z12 = z11 && cVarM12041l.m12040k();
        int i11 = -1;
        while (true) {
            i11++;
            if (i11 >= 16) {
                cVarM12041l = cVarM12041l.m12041l();
                if (cVarM12041l == null) {
                    return;
                }
                z12 = z11 && cVarM12041l.m12040k();
                i11 = 0;
            }
            JsonToken jsonTokenM12046q = cVarM12041l.m12046q(i11);
            if (jsonTokenM12046q == null) {
                return;
            }
            if (z12) {
                Object objM12037h = cVarM12041l.m12037h(i11);
                if (objM12037h != null) {
                    jsonGenerator.mo10828l0(objM12037h);
                }
                Object objM12038i = cVarM12041l.m12038i(i11);
                if (objM12038i != null) {
                    jsonGenerator.mo10791F0(objM12038i);
                }
            }
            switch (a.f10772a[jsonTokenM12046q.ordinal()]) {
                case 1:
                    jsonGenerator.mo10850y0();
                    break;
                case 2:
                    jsonGenerator.mo10806X();
                    break;
                case 3:
                    jsonGenerator.mo10843u0();
                    break;
                case 4:
                    jsonGenerator.mo10805W();
                    break;
                case 5:
                    Object objM12039j = cVarM12041l.m12039j(i11);
                    if (!(objM12039j instanceof InterfaceC6306i)) {
                        jsonGenerator.mo10810a0((String) objM12039j);
                    } else {
                        jsonGenerator.mo10808Z((InterfaceC6306i) objM12039j);
                    }
                    break;
                case 6:
                    Object objM12039j2 = cVarM12041l.m12039j(i11);
                    if (!(objM12039j2 instanceof InterfaceC6306i)) {
                        jsonGenerator.mo10787C0((String) objM12039j2);
                    } else {
                        jsonGenerator.mo10785B0((InterfaceC6306i) objM12039j2);
                    }
                    break;
                case 7:
                    Object objM12039j3 = cVarM12041l.m12039j(i11);
                    if (objM12039j3 instanceof Integer) {
                        jsonGenerator.mo10815e0(((Integer) objM12039j3).intValue());
                    } else if (objM12039j3 instanceof BigInteger) {
                        jsonGenerator.mo10822i0((BigInteger) objM12039j3);
                    } else if (objM12039j3 instanceof Long) {
                        jsonGenerator.mo10816f0(((Long) objM12039j3).longValue());
                    } else if (!(objM12039j3 instanceof Short)) {
                        jsonGenerator.mo10815e0(((Number) objM12039j3).intValue());
                    } else {
                        jsonGenerator.mo10824j0(((Short) objM12039j3).shortValue());
                    }
                    break;
                case 8:
                    Object objM12039j4 = cVarM12041l.m12039j(i11);
                    if (objM12039j4 instanceof Double) {
                        jsonGenerator.mo10813c0(((Double) objM12039j4).doubleValue());
                    } else if (objM12039j4 instanceof BigDecimal) {
                        jsonGenerator.mo10820h0((BigDecimal) objM12039j4);
                    } else if (objM12039j4 instanceof Float) {
                        jsonGenerator.mo10814d0(((Float) objM12039j4).floatValue());
                    } else if (objM12039j4 == null) {
                        jsonGenerator.mo10812b0();
                    } else if (!(objM12039j4 instanceof String)) {
                        m10809a(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", objM12039j4.getClass().getName()));
                    } else {
                        jsonGenerator.mo10818g0((String) objM12039j4);
                    }
                    break;
                case 9:
                    jsonGenerator.mo10803U(true);
                    break;
                case 10:
                    jsonGenerator.mo10803U(false);
                    break;
                case 11:
                    jsonGenerator.mo10812b0();
                    break;
                case 12:
                    Object objM12039j5 = cVarM12041l.m12039j(i11);
                    if (objM12039j5 instanceof C6497n) {
                        ((C6497n) objM12039j5).m11998b(jsonGenerator);
                    } else if (!(objM12039j5 instanceof InterfaceC6392g)) {
                        jsonGenerator.mo10804V(objM12039j5);
                    } else {
                        jsonGenerator.mo10826k0(objM12039j5);
                    }
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: d0 */
    public void mo10814d0(float f11) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f11));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: e0 */
    public void mo10815e0(int i11) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i11));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: f0 */
    public void mo10816f0(long j11) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j11));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: g0 */
    public void mo10818g0(String str) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: h0 */
    public void mo10820h0(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            mo10812b0();
        } else {
            m12007N0(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: i0 */
    public void mo10822i0(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            mo10812b0();
        } else {
            m12007N0(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: j0 */
    public void mo10824j0(short s11) throws IOException {
        m12007N0(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s11));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: k */
    public boolean mo10825k() {
        return this.f10762k;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: k0 */
    public void mo10826k0(Object obj) throws IOException {
        if (obj == null) {
            mo10812b0();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof C6497n)) {
            m12007N0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        AbstractC6304g abstractC6304g = this.f10757f;
        if (abstractC6304g == null) {
            m12007N0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            abstractC6304g.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: l */
    public boolean mo10827l() {
        return this.f10761j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: l0 */
    public void mo10828l0(Object obj) {
        this.f10769r = obj;
        this.f10770s = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: m */
    public JsonGenerator mo10829m(JsonGenerator.Feature feature) {
        this.f10759h = (~feature.getMask()) & this.f10759h;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: n */
    public int mo10831n() {
        return this.f10759h;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: q */
    public boolean mo10837q(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.f10759h) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: t0 */
    public void mo10841t0(String str) throws IOException {
        m12007N0(JsonToken.VALUE_EMBEDDED_OBJECT, new C6497n(str));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[TokenBuffer: ");
        JsonParser jsonParserM12013T0 = m12013T0();
        int i11 = 0;
        boolean z11 = this.f10761j || this.f10762k;
        while (true) {
            try {
                JsonToken jsonTokenMo10905t0 = jsonParserM12013T0.mo10905t0();
                if (jsonTokenMo10905t0 == null) {
                    break;
                }
                if (z11) {
                    m12004K0(sb2);
                }
                if (i11 < 100) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jsonTokenMo10905t0.toString());
                    if (jsonTokenMo10905t0 == JsonToken.FIELD_NAME) {
                        sb2.append('(');
                        sb2.append(jsonParserM12013T0.mo10887j());
                        sb2.append(')');
                    }
                }
                i11++;
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        if (i11 >= 100) {
            sb2.append(" ... (truncated ");
            sb2.append(i11 - 100);
            sb2.append(" entries)");
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: u0 */
    public final void mo10843u0() throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_ARRAY);
        this.f10771t = this.f10771t.m86811m();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: w0 */
    public void mo10847w0(Object obj) throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_ARRAY);
        this.f10771t = this.f10771t.m86812n(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: x0 */
    public void mo10849x0(Object obj, int i11) throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_ARRAY);
        this.f10771t = this.f10771t.m86812n(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: y0 */
    public final void mo10850y0() throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_OBJECT);
        this.f10771t = this.f10771t.m86813o();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    /* JADX INFO: renamed from: z */
    public JsonGenerator mo10851z(int i11) {
        this.f10759h = i11;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: z0 */
    public void mo10852z0(Object obj) throws IOException {
        this.f10771t.m86821x();
        m12005L0(JsonToken.START_OBJECT);
        this.f10771t = this.f10771t.m86814p(obj);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12008O0(JsonParser jsonParser) throws IOException {
        Object objMo10876b0 = jsonParser.mo10876b0();
        this.f10768q = objMo10876b0;
        if (objMo10876b0 != null) {
            this.f10770s = true;
        }
        Object objMo10865S = jsonParser.mo10865S();
        this.f10769r = objMo10865S;
        if (objMo10865S != null) {
            this.f10770s = true;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m12017X0(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            if (this.f10763l) {
                m12008O0(jsonParser);
            }
            mo10810a0(jsonParser.mo10887j());
            jsonTokenMo10889k = jsonParser.mo10905t0();
        } else if (jsonTokenMo10889k == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i11 = a.f10772a[jsonTokenMo10889k.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        m12010Q0(jsonParser, jsonTokenMo10889k);
                        return;
                    } else {
                        mo10805W();
                        return;
                    }
                }
                if (this.f10763l) {
                    m12008O0(jsonParser);
                }
                mo10843u0();
                m12009P0(jsonParser);
                return;
            }
            mo10806X();
            return;
        }
        if (this.f10763l) {
            m12008O0(jsonParser);
        }
        mo10850y0();
        m12009P0(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: o0 */
    public void mo10834o0(char c11) throws IOException {
        m12011R0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: p0 */
    public void mo10836p0(InterfaceC6306i interfaceC6306i) throws IOException {
        m12011R0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: q0 */
    public void mo10838q0(String str) throws IOException {
        m12011R0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: r0 */
    public void mo10839r0(char[] cArr, int i11, int i12) throws IOException {
        m12011R0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: v */
    public JsonGenerator mo10844v(int i11, int i12) {
        this.f10759h = (i11 & i12) | (mo10831n() & (~i12));
        return this;
    }

    public C6499p(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this.f10757f = jsonParser.mo10906u();
        this.f10758g = jsonParser.mo10866T();
        c cVar = new c();
        this.f10766o = cVar;
        this.f10765n = cVar;
        this.f10767p = 0;
        this.f10761j = jsonParser.mo10883h();
        boolean zMo10881g = jsonParser.mo10881g();
        this.f10762k = zMo10881g;
        this.f10763l = this.f10761j || zMo10881g;
        this.f10764m = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }
}
