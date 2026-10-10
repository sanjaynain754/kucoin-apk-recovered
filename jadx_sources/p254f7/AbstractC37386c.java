package p254f7;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.core.p062io.JsonEOFException;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6332k;
import com.tencent.bugly.proguard.C33820nf;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: f7.c */
/* JADX INFO: compiled from: ParserMinimalBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC37386c extends JsonParser {

    /* JADX INFO: renamed from: g */
    public static final byte[] f82971g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final int[] f82972h = new int[0];

    /* JADX INFO: renamed from: i */
    public static final BigInteger f82973i;

    /* JADX INFO: renamed from: j */
    public static final BigInteger f82974j;

    /* JADX INFO: renamed from: k */
    public static final BigInteger f82975k;

    /* JADX INFO: renamed from: l */
    public static final BigInteger f82976l;

    /* JADX INFO: renamed from: m */
    public static final BigDecimal f82977m;

    /* JADX INFO: renamed from: n */
    public static final BigDecimal f82978n;

    /* JADX INFO: renamed from: o */
    public static final BigDecimal f82979o;

    /* JADX INFO: renamed from: p */
    public static final BigDecimal f82980p;

    /* JADX INFO: renamed from: e */
    public JsonToken f82981e;

    /* JADX INFO: renamed from: f */
    public JsonToken f82982f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f82973i = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f82974j = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f82975k = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f82976l = bigIntegerValueOf4;
        f82977m = new BigDecimal(bigIntegerValueOf3);
        f82978n = new BigDecimal(bigIntegerValueOf4);
        f82979o = new BigDecimal(bigIntegerValueOf);
        f82980p = new BigDecimal(bigIntegerValueOf2);
    }

    /* JADX INFO: renamed from: F0 */
    public static final String m84087F0(int i11) {
        char c11 = (char) i11;
        if (Character.isISOControl(c11)) {
            return "(CTRL-CHAR, code " + i11 + ")";
        }
        if (i11 <= 255) {
            return "'" + c11 + "' (code " + i11 + ")";
        }
        return "'" + c11 + "' (code " + i11 + " / 0x" + Integer.toHexString(i11) + ")";
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo11734G0() throws JsonParseException;

    /* JADX INFO: renamed from: U0 */
    public void m84103U0(int i11) throws JsonParseException {
        m84093K0("Illegal character (" + m84087F0((char) i11) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public abstract String mo10869W() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        return mo10884h0(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public abstract JsonToken mo10905t0() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w */
    public abstract String mo10910w() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C0 */
    public JsonParser mo10856C0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i11 = 1;
            while (true) {
                JsonToken jsonTokenMo10905t0 = mo10905t0();
                if (jsonTokenMo10905t0 == null) {
                    mo11734G0();
                    return this;
                }
                if (jsonTokenMo10905t0.isStructStart()) {
                    i11++;
                } else if (jsonTokenMo10905t0.isStructEnd()) {
                    i11--;
                    if (i11 == 0) {
                    }
                } else if (jsonTokenMo10905t0 == JsonToken.NOT_AVAILABLE) {
                    m84094L0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: D0 */
    public final JsonParseException m84088D0(String str, Throwable th2) {
        return new JsonParseException(this, str, th2);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m84090H0(String str) {
        return "null".equals(str);
    }

    /* JADX INFO: renamed from: N0 */
    public void m84096N0(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    /* JADX INFO: renamed from: O0 */
    public void m84097O0() throws JsonParseException {
        m84098P0(" in " + this.f82981e, this.f82981e);
    }

    /* JADX INFO: renamed from: P0 */
    public void m84098P0(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m84099Q0(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        m84098P0(str, jsonToken);
    }

    /* JADX INFO: renamed from: R0 */
    public void m84100R0(int i11) throws JsonParseException {
        m84101S0(i11, "Expected space separating root-level values");
    }

    /* JADX INFO: renamed from: S0 */
    public void m84101S0(int i11, String str) throws JsonParseException {
        if (i11 < 0) {
            m84097O0();
        }
        String str2 = String.format("Unexpected character (%s)", m84087F0(i11));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        m84093K0(str2);
    }

    /* JADX INFO: renamed from: W0 */
    public void m84105W0(String str) throws JsonParseException {
        m84093K0("Invalid numeric value: " + str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: c0 */
    public int mo10877c0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? mo10860M() : mo10878d0(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: d0 */
    public int mo10878d0(int i11) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo10860M();
        }
        if (jsonToken == null) {
            return i11;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id == 6) {
            String strMo10869W = mo10869W();
            if (m84090H0(strMo10869W)) {
                return 0;
            }
            return C6313g.m11012d(strMo10869W, i11);
        }
        switch (iM10917id) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                Object objMo10858J = mo10858J();
                return objMo10858J instanceof Number ? ((Number) objMo10858J).intValue() : i11;
            default:
                return i11;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: e0 */
    public long mo10879e0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? mo10861O() : mo10880f0(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: f0 */
    public long mo10880f0(long j11) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo10861O();
        }
        if (jsonToken == null) {
            return j11;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id == 6) {
            String strMo10869W = mo10869W();
            if (m84090H0(strMo10869W)) {
                return 0L;
            }
            return C6313g.m11013e(strMo10869W, j11);
        }
        switch (iM10917id) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                Object objMo10858J = mo10858J();
                return objMo10858J instanceof Number ? ((Number) objMo10858J).longValue() : j11;
            default:
                return j11;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return mo10869W();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return mo10910w();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : mo10869W();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i */
    public void mo10885i() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != null) {
            this.f82982f = jsonToken;
            this.f82981e = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: i0 */
    public boolean mo10886i0() {
        return this.f82981e != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k */
    public JsonToken mo10889k() {
        return this.f82981e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: k0 */
    public boolean mo10890k0(JsonToken jsonToken) {
        return this.f82981e == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l */
    public int mo10891l() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m10917id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: l0 */
    public boolean mo10892l0(int i11) {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return i11 == 0;
        }
        return jsonToken.m10917id() == i11;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n0 */
    public boolean mo10896n0() {
        return this.f82981e == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: o0 */
    public boolean mo10898o0() {
        return this.f82981e == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p0 */
    public boolean mo10900p0() {
        return this.f82981e == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x */
    public JsonToken mo10912x() {
        return this.f82981e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    /* JADX INFO: renamed from: z */
    public int mo10915z() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m10917id();
    }

    public AbstractC37386c(int i11) {
        super(i11);
    }

    /* JADX INFO: renamed from: E0 */
    public void m84089E0(String str, C6324c c6324c, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, c6324c);
        } catch (IllegalArgumentException e11) {
            m84093K0(e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: I0 */
    public String m84091I0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(C33820nf.f71144W)) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    /* JADX INFO: renamed from: J0 */
    public String m84092J0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith(C33820nf.f71144W)) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m84093K0(String str) throws JsonParseException {
        throw m10873a(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m84094L0(String str, Object obj) throws JsonParseException {
        throw m10873a(String.format(str, obj));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m84095M0(String str, Object obj, Object obj2) throws JsonParseException {
        throw m10873a(String.format(str, obj, obj2));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m84102T0() {
        C6332k.m11125c();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m84104V0(String str, Throwable th2) throws JsonParseException {
        throw m84088D0(str, th2);
    }

    /* JADX INFO: renamed from: X0 */
    public void m84106X0() throws IOException {
        m84107Y0(mo10869W());
    }

    /* JADX INFO: renamed from: Y0 */
    public void m84107Y0(String str) throws IOException {
        m84108Z0(str, mo10889k());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m84108Z0(String str, JsonToken jsonToken) throws IOException {
        m84096N0(String.format("Numeric value (%s) out of range of int (%d - %s)", m84091I0(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    /* JADX INFO: renamed from: a1 */
    public void m84109a1() throws IOException {
        m84110b1(mo10869W());
    }

    /* JADX INFO: renamed from: b1 */
    public void m84110b1(String str) throws IOException {
        m84111c1(str, mo10889k());
    }

    /* JADX INFO: renamed from: c1 */
    public void m84111c1(String str, JsonToken jsonToken) throws IOException {
        m84096N0(String.format("Numeric value (%s) out of range of long (%d - %s)", m84091I0(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    /* JADX INFO: renamed from: d1 */
    public void m84112d1(int i11, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", m84087F0(i11));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        m84093K0(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u0 */
    public JsonToken mo10907u0() throws IOException {
        JsonToken jsonTokenMo10905t0 = mo10905t0();
        if (jsonTokenMo10905t0 == JsonToken.FIELD_NAME) {
            return mo10905t0();
        }
        return jsonTokenMo10905t0;
    }
}
