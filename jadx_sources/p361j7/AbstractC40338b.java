package p361j7;

import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6327f;
import java.io.IOException;
import java.io.OutputStream;
import okio.Utf8;
import p254f7.AbstractC37385b;
import p334i7.C38466d;
import p395k7.C40935a;

/* JADX INFO: renamed from: j7.b */
/* JADX INFO: compiled from: NonBlockingJsonParserBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC40338b extends AbstractC37385b {

    /* JADX INFO: renamed from: i0 */
    public static final String[] f89580i0 = {"NaN", "Infinity", "+Infinity", "-Infinity"};

    /* JADX INFO: renamed from: j0 */
    public static final double[] f89581j0 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    /* JADX INFO: renamed from: S */
    public final C40935a f89582S;

    /* JADX INFO: renamed from: T */
    public int[] f89583T;

    /* JADX INFO: renamed from: U */
    public int f89584U;

    /* JADX INFO: renamed from: V */
    public int f89585V;

    /* JADX INFO: renamed from: W */
    public int f89586W;

    /* JADX INFO: renamed from: X */
    public int f89587X;

    /* JADX INFO: renamed from: Y */
    public int f89588Y;

    /* JADX INFO: renamed from: Z */
    public int f89589Z;

    /* JADX INFO: renamed from: a0 */
    public int f89590a0;

    /* JADX INFO: renamed from: b0 */
    public int f89591b0;

    /* JADX INFO: renamed from: c0 */
    public int f89592c0;

    /* JADX INFO: renamed from: d0 */
    public int f89593d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f89594e0;

    /* JADX INFO: renamed from: f0 */
    public int f89595f0;

    /* JADX INFO: renamed from: g0 */
    public int f89596g0;

    /* JADX INFO: renamed from: h0 */
    public int f89597h0;

    /* JADX INFO: renamed from: V1 */
    public static final int m88897V1(int i11, int i12) {
        return i12 == 4 ? i11 : i11 | ((-1) << (i12 << 3));
    }

    /* JADX INFO: renamed from: O1 */
    public final JsonToken m88901O1() throws IOException {
        this.f89590a0 = 7;
        if (!this.f82944A.m10939h()) {
            mo11734G0();
        }
        close();
        this.f82981e = null;
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public final JsonToken m88902P1(String str) throws IOException {
        this.f89590a0 = 4;
        this.f82944A.m86805t(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: T1 */
    public final String m88906T1(JsonToken jsonToken) {
        int iM10917id;
        if (jsonToken == null || (iM10917id = jsonToken.m10917id()) == -1) {
            return null;
        }
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11106l() : jsonToken.asString();
        }
        return this.f82944A.mo10933b();
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: f1 */
    public void mo84066f1() throws IOException {
        this.f89596g0 = 0;
        this.f82964t = 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: J */
    public Object mo10858J() throws IOException {
        if (this.f82981e == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.f82950G;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX INFO: renamed from: L1 */
    public final String m88898L1(int[] iArr, int i11, int i12) throws JsonParseException {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = ((i11 << 2) - 4) + i12;
        int i19 = 3;
        if (i12 < 4) {
            int i21 = i11 - 1;
            i13 = iArr[i21];
            iArr[i21] = i13 << ((4 - i12) << 3);
        } else {
            i13 = 0;
        }
        char[] cArrM11107m = this.f82946C.m11107m();
        int i22 = 0;
        int i23 = 0;
        while (i22 < i18) {
            int i24 = iArr[i22 >> 2] >> ((3 - (i22 & 3)) << i19);
            int i25 = i24 & 255;
            int i26 = i22 + 1;
            if (i25 > 127) {
                i14 = i19;
                if ((i24 & 224) == 192) {
                    i15 = i24 & 31;
                    i16 = 1;
                } else if ((i24 & 240) == 224) {
                    i15 = i24 & 15;
                    i16 = 2;
                } else if ((i24 & 248) == 240) {
                    i15 = i24 & 7;
                    i16 = i14;
                } else {
                    m88909X1(i25);
                    i15 = 1;
                    i16 = 1;
                }
                if (i26 + i16 > i18) {
                    m84098P0(" in field name", JsonToken.FIELD_NAME);
                }
                int i27 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                i26 = i22 + 2;
                if ((i27 & 192) != 128) {
                    m88910Y1(i27);
                }
                int i28 = (i15 << 6) | (i27 & 63);
                if (i16 > 1) {
                    int i29 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                    i26 = i22 + 3;
                    if ((i29 & 192) != 128) {
                        m88910Y1(i29);
                    }
                    int i31 = (i29 & 63) | (i28 << 6);
                    i17 = 2;
                    if (i16 > 2) {
                        int i32 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                        i26 = i22 + 4;
                        if ((i32 & 192) != 128) {
                            m88910Y1(i32 & 255);
                        }
                        i25 = (i31 << 6) | (i32 & 63);
                    } else {
                        i25 = i31;
                    }
                    if (i16 > i17) {
                        int i33 = i25 - 65536;
                        if (i23 >= cArrM11107m.length) {
                            cArrM11107m = this.f82946C.m11109o();
                        }
                        cArrM11107m[i23] = (char) ((i33 >> 10) + 55296);
                        i25 = (i33 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        i23++;
                    }
                } else {
                    i25 = i28;
                }
                i17 = 2;
                if (i16 > i17) {
                    int i34 = i25 - 65536;
                    if (i23 >= cArrM11107m.length) {
                        cArrM11107m = this.f82946C.m11109o();
                    }
                    cArrM11107m[i23] = (char) ((i34 >> 10) + 55296);
                    i25 = (i34 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                    i23++;
                }
            } else {
                i14 = i19;
            }
            i22 = i26;
            if (i23 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11109o();
            }
            cArrM11107m[i23] = (char) i25;
            i23++;
            i19 = i14;
        }
        String str = new String(cArrM11107m, 0, i23);
        if (i12 < 4) {
            iArr[i11 - 1] = i13;
        }
        return this.f89582S.m89678p(str, iArr, i11);
    }

    /* JADX INFO: renamed from: M1 */
    public final JsonToken m88899M1() throws IOException {
        int i11;
        if (!this.f82944A.m10937f()) {
            m84080t1(93, '}');
        }
        C38466d c38466dMo10936e = this.f82944A.mo10936e();
        this.f82944A = c38466dMo10936e;
        if (c38466dMo10936e.m10938g()) {
            i11 = 3;
        } else {
            i11 = c38466dMo10936e.m10937f() ? 6 : 1;
        }
        this.f89590a0 = i11;
        this.f89591b0 = i11;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: N1 */
    public final JsonToken m88900N1() throws IOException {
        int i11;
        if (!this.f82944A.m10938g()) {
            m84080t1(125, ']');
        }
        C38466d c38466dMo10936e = this.f82944A.mo10936e();
        this.f82944A = c38466dMo10936e;
        if (c38466dMo10936e.m10938g()) {
            i11 = 3;
        } else {
            i11 = c38466dMo10936e.m10937f() ? 6 : 1;
        }
        this.f89590a0 = i11;
        this.f89591b0 = i11;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return AbstractC37385b.f82943R;
    }

    /* JADX INFO: renamed from: U1 */
    public final String m88907U1(int i11) {
        return f89580i0[i11];
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() throws IOException {
        JsonToken jsonToken = this.f82981e;
        return jsonToken == JsonToken.VALUE_STRING ? this.f82946C.m11106l() : m88906T1(jsonToken);
    }

    /* JADX INFO: renamed from: W1 */
    public void m88908W1(int i11) throws JsonParseException {
        if (i11 < 32) {
            m84103U0(i11);
        }
        m88909X1(i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public char[] mo10870X() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return null;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11114u() : this.f82981e.asCharArray();
        }
        if (!this.f82948E) {
            String strMo10933b = this.f82944A.mo10933b();
            int length = strMo10933b.length();
            char[] cArr = this.f82947D;
            if (cArr == null) {
                this.f82947D = this.f82961q.m10979f(length);
            } else if (cArr.length < length) {
                this.f82947D = new char[length];
            }
            strMo10933b.getChars(0, length, this.f82947D, 0);
            this.f82948E = true;
        }
        return this.f82947D;
    }

    /* JADX INFO: renamed from: X1 */
    public void m88909X1(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i11));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11093F() : this.f82981e.asCharArray().length;
        }
        return this.f82944A.mo10933b().length();
    }

    /* JADX INFO: renamed from: Y1 */
    public void m88910Y1(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i11));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    public int mo10872Z() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) {
            return this.f82946C.m11115v();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m88911Z1(int i11, int i12) throws JsonParseException {
        this.f82963s = i12;
        m88910Y1(i11);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        return new JsonLocation(m84067g1(), this.f82968x, -1L, this.f82969y, this.f82970z);
    }

    /* JADX INFO: renamed from: a2 */
    public final JsonToken m88912a2() throws IOException {
        this.f82944A = this.f82944A.m86799m(-1, -1);
        this.f89590a0 = 5;
        this.f89591b0 = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: b2 */
    public final JsonToken m88913b2() throws IOException {
        this.f82944A = this.f82944A.m86800n(-1, -1);
        this.f89590a0 = 2;
        this.f89591b0 = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: c2 */
    public final void m88914c2() {
        this.f82969y = Math.max(this.f82966v, this.f89597h0);
        int i11 = this.f82963s;
        this.f82970z = i11 - this.f82967w;
        this.f82968x = this.f82965u + ((long) (i11 - this.f89596g0));
    }

    /* JADX INFO: renamed from: d2 */
    public final JsonToken m88915d2(JsonToken jsonToken) throws IOException {
        this.f89590a0 = this.f89591b0;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: e2 */
    public final JsonToken m88916e2(int i11, String str) throws IOException {
        this.f82946C.m11089B(str);
        this.f82958O = str.length();
        this.f82951H = 1;
        this.f82952I = i11;
        this.f89590a0 = this.f89591b0;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: f2 */
    public final JsonToken m88917f2(int i11) throws IOException {
        String str = f89580i0[i11];
        this.f82946C.m11089B(str);
        if (!m10894m0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            m84094L0("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this.f82958O = 0;
        this.f82951H = 8;
        this.f82954K = f89581j0[i11];
        this.f89590a0 = this.f89591b0;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this.f82981e = jsonToken;
        return jsonToken;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f82946C.m11106l();
        }
        return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(null);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f82946C.m11106l();
        }
        return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(str);
    }

    @Override // p254f7.AbstractC37385b, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j0 */
    public boolean mo10888j0() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f82946C.m11116w();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f82948E;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            m84094L0("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this.f82950G == null) {
            C6324c c6324cM84072l1 = m84072l1();
            m84089E0(mo10869W(), c6324cM84072l1, base64Variant);
            this.f82950G = c6324cM84072l1.m11079q();
        }
        return this.f82950G;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        int i11 = (this.f82963s - this.f82967w) + 1;
        return new JsonLocation(m84067g1(), this.f82965u + ((long) (this.f82963s - this.f89596g0)), -1L, Math.max(this.f82966v, this.f89597h0), i11);
    }

    public AbstractC40338b(C6310d c6310d, int i11, C40935a c40935a) {
        super(c6310d, i11);
        this.f89583T = new int[8];
        this.f89594e0 = false;
        this.f89596g0 = 0;
        this.f89597h0 = 1;
        this.f89582S = c40935a;
        this.f82981e = null;
        this.f89590a0 = 0;
        this.f89591b0 = 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final String m88903Q1(int i11, int i12) throws JsonParseException {
        int iM88897V1 = m88897V1(i11, i12);
        String strM89683w = this.f89582S.m89683w(iM88897V1);
        if (strM89683w != null) {
            return strM89683w;
        }
        int[] iArr = this.f89583T;
        iArr[0] = iM88897V1;
        return m88898L1(iArr, 1, i12);
    }

    /* JADX INFO: renamed from: R1 */
    public final String m88904R1(int i11, int i12, int i13) throws JsonParseException {
        int iM88897V1 = m88897V1(i12, i13);
        String strM89684x = this.f89582S.m89684x(i11, iM88897V1);
        if (strM89684x != null) {
            return strM89684x;
        }
        int[] iArr = this.f89583T;
        iArr[0] = i11;
        iArr[1] = iM88897V1;
        return m88898L1(iArr, 2, i13);
    }

    /* JADX INFO: renamed from: S1 */
    public final String m88905S1(int i11, int i12, int i13, int i14) throws JsonParseException {
        int iM88897V1 = m88897V1(i13, i14);
        String strM89685y = this.f89582S.m89685y(i11, i12, iM88897V1);
        if (strM89685y != null) {
            return strM89685y;
        }
        int[] iArr = this.f89583T;
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = m88897V1(iM88897V1, i14);
        return m88898L1(iArr, 3, i14);
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws IOException {
        super.mo84079s1();
        this.f89582S.m89659G();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] bArrMo10899p = mo10899p(base64Variant);
        outputStream.write(bArrMo10899p);
        return bArrMo10899p.length;
    }
}
