package p254f7;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.core.p062io.ContentReference;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.core.util.C6330i;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p334i7.C38464b;
import p334i7.C38466d;

/* JADX INFO: renamed from: f7.b */
/* JADX INFO: compiled from: ParserBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC37385b extends AbstractC37386c {

    /* JADX INFO: renamed from: R */
    public static final C6327f<StreamReadCapability> f82943R = JsonParser.f10026d;

    /* JADX INFO: renamed from: A */
    public C38466d f82944A;

    /* JADX INFO: renamed from: B */
    public JsonToken f82945B;

    /* JADX INFO: renamed from: C */
    public final C6330i f82946C;

    /* JADX INFO: renamed from: D */
    public char[] f82947D;

    /* JADX INFO: renamed from: E */
    public boolean f82948E;

    /* JADX INFO: renamed from: F */
    public C6324c f82949F;

    /* JADX INFO: renamed from: G */
    public byte[] f82950G;

    /* JADX INFO: renamed from: H */
    public int f82951H;

    /* JADX INFO: renamed from: I */
    public int f82952I;

    /* JADX INFO: renamed from: J */
    public long f82953J;

    /* JADX INFO: renamed from: K */
    public double f82954K;

    /* JADX INFO: renamed from: L */
    public BigInteger f82955L;

    /* JADX INFO: renamed from: M */
    public BigDecimal f82956M;

    /* JADX INFO: renamed from: N */
    public boolean f82957N;

    /* JADX INFO: renamed from: O */
    public int f82958O;

    /* JADX INFO: renamed from: P */
    public int f82959P;

    /* JADX INFO: renamed from: Q */
    public int f82960Q;

    /* JADX INFO: renamed from: q */
    public final C6310d f82961q;

    /* JADX INFO: renamed from: r */
    public boolean f82962r;

    /* JADX INFO: renamed from: s */
    public int f82963s;

    /* JADX INFO: renamed from: t */
    public int f82964t;

    /* JADX INFO: renamed from: u */
    public long f82965u;

    /* JADX INFO: renamed from: v */
    public int f82966v;

    /* JADX INFO: renamed from: w */
    public int f82967w;

    /* JADX INFO: renamed from: x */
    public long f82968x;

    /* JADX INFO: renamed from: y */
    public int f82969y;

    /* JADX INFO: renamed from: z */
    public int f82970z;

    /* JADX INFO: renamed from: F1 */
    public IllegalArgumentException m84059F1(Base64Variant base64Variant, int i11, int i12) throws IllegalArgumentException {
        return m84060G1(base64Variant, i11, i12, null);
    }

    /* JADX INFO: renamed from: H1 */
    public final JsonToken m84061H1(boolean z11, int i11, int i12, int i13) {
        return (i12 >= 1 || i13 >= 1) ? m84063J1(z11, i11, i12, i13) : m84064K1(z11, i11);
    }

    /* JADX INFO: renamed from: f1 */
    public abstract void mo84066f1() throws IOException;

    /* JADX INFO: renamed from: j1 */
    public abstract char mo84070j1() throws IOException;

    /* JADX INFO: renamed from: u1 */
    public void m84081u1(int i11, String str) throws IOException {
        if (i11 == 1) {
            m84107Y0(str);
        } else {
            m84110b1(str);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public static int[] m84054E1(int[] iArr, int i11) {
        return iArr == null ? new int[i11] : Arrays.copyOf(iArr, iArr.length + i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public JsonParser mo10853A0(int i11) {
        int i12 = this.f10027b ^ i11;
        if (i12 != 0) {
            this.f10027b = i11;
            m84065e1(i11, i12);
        }
        return this;
    }

    /* JADX INFO: renamed from: A1 */
    public void m84055A1() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 16) != 0) {
            this.f82954K = this.f82956M.doubleValue();
        } else if ((i11 & 4) != 0) {
            this.f82954K = this.f82955L.doubleValue();
        } else if ((i11 & 2) != 0) {
            this.f82954K = this.f82953J;
        } else if ((i11 & 1) != 0) {
            this.f82954K = this.f82952I;
        } else {
            m84102T0();
        }
        this.f82951H |= 8;
    }

    /* JADX INFO: renamed from: B1 */
    public void m84056B1() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 2) != 0) {
            long j11 = this.f82953J;
            int i12 = (int) j11;
            if (i12 != j11) {
                m84108Z0(mo10869W(), mo10889k());
            }
            this.f82952I = i12;
        } else if ((i11 & 4) != 0) {
            if (AbstractC37386c.f82973i.compareTo(this.f82955L) > 0 || AbstractC37386c.f82974j.compareTo(this.f82955L) < 0) {
                m84106X0();
            }
            this.f82952I = this.f82955L.intValue();
        } else if ((i11 & 8) != 0) {
            double d11 = this.f82954K;
            if (d11 < -2.147483648E9d || d11 > 2.147483647E9d) {
                m84106X0();
            }
            this.f82952I = (int) this.f82954K;
        } else if ((i11 & 16) != 0) {
            if (AbstractC37386c.f82979o.compareTo(this.f82956M) > 0 || AbstractC37386c.f82980p.compareTo(this.f82956M) < 0) {
                m84106X0();
            }
            this.f82952I = this.f82956M.intValue();
        } else {
            m84102T0();
        }
        this.f82951H |= 1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C */
    public BigDecimal mo10855C() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 16) == 0) {
            if (i11 == 0) {
                m84076p1(16);
            }
            if ((this.f82951H & 16) == 0) {
                m84085y1();
            }
        }
        return this.f82956M;
    }

    /* JADX INFO: renamed from: C1 */
    public void m84057C1() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 1) != 0) {
            this.f82953J = this.f82952I;
        } else if ((i11 & 4) != 0) {
            if (AbstractC37386c.f82975k.compareTo(this.f82955L) > 0 || AbstractC37386c.f82976l.compareTo(this.f82955L) < 0) {
                m84109a1();
            }
            this.f82953J = this.f82955L.longValue();
        } else if ((i11 & 8) != 0) {
            double d11 = this.f82954K;
            if (d11 < -9.223372036854776E18d || d11 > 9.223372036854776E18d) {
                m84109a1();
            }
            this.f82953J = (long) this.f82954K;
        } else if ((i11 & 16) != 0) {
            if (AbstractC37386c.f82977m.compareTo(this.f82956M) > 0 || AbstractC37386c.f82978n.compareTo(this.f82956M) < 0) {
                m84109a1();
            }
            this.f82953J = this.f82956M.longValue();
        } else {
            m84102T0();
        }
        this.f82951H |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public C38466d mo10866T() {
        return this.f82944A;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: E */
    public double mo10857E() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 8) == 0) {
            if (i11 == 0) {
                m84076p1(8);
            }
            if ((this.f82951H & 8) == 0) {
                m84055A1();
            }
        }
        return this.f82954K;
    }

    @Override // p254f7.AbstractC37386c
    /* JADX INFO: renamed from: G0 */
    public void mo11734G0() throws JsonParseException {
        if (this.f82944A.m10939h()) {
            return;
        }
        m84098P0(String.format(": expected close marker for %s (start marker at %s)", this.f82944A.m10937f() ? "Array" : "Object", this.f82944A.m86806u(m84067g1())), null);
    }

    /* JADX INFO: renamed from: G1 */
    public IllegalArgumentException m84060G1(Base64Variant base64Variant, int i11, int i12, String str) throws IllegalArgumentException {
        String str2;
        if (i11 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i11), Integer.valueOf(i12 + 1));
        } else if (base64Variant.usesPaddingChar(i11)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i12 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i11) || Character.isISOControl(i11)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i11) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i11) + "' (code 0x" + Integer.toHexString(i11) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    /* JADX INFO: renamed from: I1 */
    public final JsonToken m84062I1(String str, double d11) {
        this.f82946C.m11089B(str);
        this.f82954K = d11;
        this.f82951H = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* JADX INFO: renamed from: J1 */
    public final JsonToken m84063J1(boolean z11, int i11, int i12, int i13) {
        this.f82957N = z11;
        this.f82958O = i11;
        this.f82959P = i12;
        this.f82960Q = i13;
        this.f82951H = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* JADX INFO: renamed from: K1 */
    public final JsonToken m84064K1(boolean z11, int i11) {
        this.f82957N = z11;
        this.f82958O = i11;
        this.f82959P = 0;
        this.f82960Q = 0;
        this.f82951H = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: M */
    public int mo10860M() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return m84075o1();
            }
            if ((i11 & 1) == 0) {
                m84056B1();
            }
        }
        return this.f82952I;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: O */
    public long mo10861O() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 2) == 0) {
            if (i11 == 0) {
                m84076p1(2);
            }
            if ((this.f82951H & 2) == 0) {
                m84057C1();
            }
        }
        return this.f82953J;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: P */
    public JsonParser.NumberType mo10862P() throws IOException {
        if (this.f82951H == 0) {
            m84076p1(0);
        }
        if (this.f82981e != JsonToken.VALUE_NUMBER_INT) {
            return (this.f82951H & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i11 = this.f82951H;
        if ((i11 & 1) != 0) {
            return JsonParser.NumberType.INT;
        }
        return (i11 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Q */
    public Number mo10863Q() throws IOException {
        if (this.f82951H == 0) {
            m84076p1(0);
        }
        if (this.f82981e == JsonToken.VALUE_NUMBER_INT) {
            int i11 = this.f82951H;
            if ((i11 & 1) != 0) {
                return Integer.valueOf(this.f82952I);
            }
            if ((i11 & 2) != 0) {
                return Long.valueOf(this.f82953J);
            }
            if ((i11 & 4) != 0) {
                return this.f82955L;
            }
            m84102T0();
        }
        int i12 = this.f82951H;
        if ((i12 & 16) != 0) {
            return this.f82956M;
        }
        if ((i12 & 8) == 0) {
            m84102T0();
        }
        return Double.valueOf(this.f82954K);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: R */
    public Number mo10864R() throws IOException {
        if (this.f82981e == JsonToken.VALUE_NUMBER_INT) {
            if (this.f82951H == 0) {
                m84076p1(0);
            }
            int i11 = this.f82951H;
            if ((i11 & 1) != 0) {
                return Integer.valueOf(this.f82952I);
            }
            if ((i11 & 2) != 0) {
                return Long.valueOf(this.f82953J);
            }
            if ((i11 & 4) != 0) {
                return this.f82955L;
            }
            m84102T0();
        }
        if (this.f82951H == 0) {
            m84076p1(16);
        }
        int i12 = this.f82951H;
        if ((i12 & 16) != 0) {
            return this.f82956M;
        }
        if ((i12 & 8) == 0) {
            m84102T0();
        }
        return Double.valueOf(this.f82954K);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f82962r) {
            return;
        }
        this.f82963s = Math.max(this.f82963s, this.f82964t);
        this.f82962r = true;
        try {
            mo84066f1();
        } finally {
            mo84079s1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m84065e1(int i11, int i12) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i12 & mask) == 0 || (i11 & mask) == 0) {
            return;
        }
        if (this.f82944A.m86802q() == null) {
            this.f82944A = this.f82944A.m86807v(C38464b.m86789f(this));
        } else {
            this.f82944A = this.f82944A.m86807v(null);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public ContentReference m84067g1() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.f10027b) ? this.f82961q.m10985l() : ContentReference.unknown();
    }

    /* JADX INFO: renamed from: h1 */
    public final int m84068h1(Base64Variant base64Variant, char c11, int i11) throws IOException {
        if (c11 != '\\') {
            throw m84059F1(base64Variant, c11, i11);
        }
        char cMo84070j1 = mo84070j1();
        if (cMo84070j1 <= ' ' && i11 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char(cMo84070j1);
        if (iDecodeBase64Char >= 0 || (iDecodeBase64Char == -2 && i11 >= 2)) {
            return iDecodeBase64Char;
        }
        throw m84059F1(base64Variant, cMo84070j1, i11);
    }

    /* JADX INFO: renamed from: i1 */
    public final int m84069i1(Base64Variant base64Variant, int i11, int i12) throws IOException {
        if (i11 != 92) {
            throw m84059F1(base64Variant, i11, i12);
        }
        char cMo84070j1 = mo84070j1();
        if (cMo84070j1 <= ' ' && i12 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char((int) cMo84070j1);
        if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
            return iDecodeBase64Char;
        }
        throw m84059F1(base64Variant, cMo84070j1, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j0 */
    public boolean mo10888j0() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f82948E;
        }
        return false;
    }

    /* JADX INFO: renamed from: l1 */
    public C6324c m84072l1() {
        C6324c c6324c = this.f82949F;
        if (c6324c == null) {
            this.f82949F = new C6324c();
        } else {
            c6324c.m11076n();
        }
        return this.f82949F;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: m */
    public JsonParser mo10893m(JsonParser.Feature feature) {
        this.f10027b |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.f82944A.m86802q() == null) {
            this.f82944A = this.f82944A.m86807v(C38464b.m86789f(this));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n */
    public BigInteger mo10895n() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 4) == 0) {
            if (i11 == 0) {
                m84076p1(4);
            }
            if ((this.f82951H & 4) == 0) {
                m84086z1();
            }
        }
        return this.f82955L;
    }

    /* JADX INFO: renamed from: n1 */
    public char m84074n1(char c11) throws JsonProcessingException {
        if (m10894m0(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c11 == '\'' && m10894m0(JsonParser.Feature.ALLOW_SINGLE_QUOTES))) {
            return c11;
        }
        m84093K0("Unrecognized character escape " + AbstractC37386c.m84087F0(c11));
        return c11;
    }

    /* JADX INFO: renamed from: o1 */
    public int m84075o1() throws IOException {
        if (this.f82962r) {
            m84093K0("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f82981e != JsonToken.VALUE_NUMBER_INT || this.f82958O > 9) {
            m84076p1(1);
            if ((this.f82951H & 1) == 0) {
                m84056B1();
            }
            return this.f82952I;
        }
        int iM11104j = this.f82946C.m11104j(this.f82957N);
        this.f82952I = iM11104j;
        this.f82951H = 1;
        return iM11104j;
    }

    /* JADX INFO: renamed from: p1 */
    public void m84076p1(int i11) throws IOException {
        if (this.f82962r) {
            m84093K0("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                m84077q1(i11);
                return;
            } else {
                m84094L0("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i12 = this.f82958O;
        if (i12 <= 9) {
            this.f82952I = this.f82946C.m11104j(this.f82957N);
            this.f82951H = 1;
            return;
        }
        if (i12 > 18) {
            m84078r1(i11);
            return;
        }
        long jM11105k = this.f82946C.m11105k(this.f82957N);
        if (i12 == 10) {
            if (this.f82957N) {
                if (jM11105k >= -2147483648L) {
                    this.f82952I = (int) jM11105k;
                    this.f82951H = 1;
                    return;
                }
            } else if (jM11105k <= 2147483647L) {
                this.f82952I = (int) jM11105k;
                this.f82951H = 1;
                return;
            }
        }
        this.f82953J = jM11105k;
        this.f82951H = 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q0 */
    public boolean mo10902q0() {
        if (this.f82981e != JsonToken.VALUE_NUMBER_FLOAT || (this.f82951H & 8) == 0) {
            return false;
        }
        double d11 = this.f82954K;
        return Double.isNaN(d11) || Double.isInfinite(d11);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m84077q1(int i11) throws IOException {
        try {
            if (i11 == 16) {
                this.f82956M = this.f82946C.m11102h();
                this.f82951H = 16;
            } else {
                this.f82954K = this.f82946C.m11103i();
                this.f82951H = 8;
            }
        } catch (NumberFormatException e11) {
            m84104V0("Malformed numeric value (" + m84092J0(this.f82946C.m11106l()) + ")", e11);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final void m84078r1(int i11) throws IOException {
        String strM11106l = this.f82946C.m11106l();
        try {
            int i12 = this.f82958O;
            char[] cArrM11114u = this.f82946C.m11114u();
            int iM11115v = this.f82946C.m11115v();
            boolean z11 = this.f82957N;
            if (z11) {
                iM11115v++;
            }
            if (C6313g.m11010b(cArrM11114u, iM11115v, i12, z11)) {
                this.f82953J = Long.parseLong(strM11106l);
                this.f82951H = 2;
                return;
            }
            if (i11 == 1 || i11 == 2) {
                m84081u1(i11, strM11106l);
            }
            if (i11 != 8 && i11 != 32) {
                this.f82955L = new BigInteger(strM11106l);
                this.f82951H = 4;
                return;
            }
            this.f82954K = C6313g.m11017i(strM11106l);
            this.f82951H = 8;
        } catch (NumberFormatException e11) {
            m84104V0("Malformed numeric value (" + m84092J0(strM11106l) + ")", e11);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws IOException {
        this.f82946C.m11117x();
        char[] cArr = this.f82947D;
        if (cArr != null) {
            this.f82947D = null;
            this.f82961q.m10990q(cArr);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m84082v1(int i11, String str) throws JsonParseException {
        if (!m10894m0(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i11 > 32) {
            m84093K0("Illegal unquoted character (" + AbstractC37386c.m84087F0((char) i11) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w */
    public String mo10910w() throws IOException {
        C38466d c38466dMo10936e;
        JsonToken jsonToken = this.f82981e;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (c38466dMo10936e = this.f82944A.mo10936e()) != null) ? c38466dMo10936e.mo10933b() : this.f82944A.mo10933b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w0 */
    public JsonParser mo10911w0(int i11, int i12) {
        int i13 = this.f10027b;
        int i14 = (i11 & i12) | ((~i12) & i13);
        int i15 = i13 ^ i14;
        if (i15 != 0) {
            this.f10027b = i14;
            m84065e1(i14, i15);
        }
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public String m84084x1() throws IOException {
        return m10894m0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    /* JADX INFO: renamed from: y1 */
    public void m84085y1() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 8) != 0) {
            this.f82956M = C6313g.m11014f(mo10869W());
        } else if ((i11 & 4) != 0) {
            this.f82956M = new BigDecimal(this.f82955L);
        } else if ((i11 & 2) != 0) {
            this.f82956M = BigDecimal.valueOf(this.f82953J);
        } else if ((i11 & 1) != 0) {
            this.f82956M = BigDecimal.valueOf(this.f82952I);
        } else {
            m84102T0();
        }
        this.f82951H |= 16;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: z0 */
    public void mo10916z0(Object obj) {
        this.f82944A.mo10940i(obj);
    }

    /* JADX INFO: renamed from: z1 */
    public void m84086z1() throws IOException {
        int i11 = this.f82951H;
        if ((i11 & 16) != 0) {
            this.f82955L = this.f82956M.toBigInteger();
        } else if ((i11 & 2) != 0) {
            this.f82955L = BigInteger.valueOf(this.f82953J);
        } else if ((i11 & 1) != 0) {
            this.f82955L = BigInteger.valueOf(this.f82952I);
        } else if ((i11 & 8) != 0) {
            this.f82955L = BigDecimal.valueOf(this.f82954K).toBigInteger();
        } else {
            m84102T0();
        }
        this.f82951H |= 4;
    }

    public AbstractC37385b(C6310d c6310d, int i11) {
        C38464b c38464bM86789f;
        super(i11);
        this.f82966v = 1;
        this.f82969y = 1;
        this.f82951H = 0;
        this.f82961q = c6310d;
        this.f82946C = c6310d.m10984k();
        if (JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i11)) {
            c38464bM86789f = C38464b.m86789f(this);
        } else {
            c38464bM86789f = null;
        }
        this.f82944A = C38466d.m86796o(c38464bM86789f);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: L */
    public float mo10859L() throws IOException {
        return (float) mo10857E();
    }

    /* JADX INFO: renamed from: k1 */
    public final int m84071k1() throws JsonParseException {
        mo11734G0();
        return -1;
    }

    /* JADX INFO: renamed from: m1 */
    public void m84073m1(Base64Variant base64Variant) throws IOException {
        m84093K0(base64Variant.missingPaddingMessage());
    }

    /* JADX INFO: renamed from: t1 */
    public void m84080t1(int i11, char c11) throws JsonParseException {
        C38466d c38466dMo10866T = mo10866T();
        m84093K0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i11), Character.valueOf(c11), c38466dMo10866T.m10941j(), c38466dMo10866T.m86806u(m84067g1())));
    }

    /* JADX INFO: renamed from: w1 */
    public String m84083w1() throws IOException {
        return m84084x1();
    }
}
