package p334i7;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6327f;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import okio.Utf8;
import p254f7.AbstractC37385b;
import p395k7.C40935a;

/* JADX INFO: renamed from: i7.h */
/* JADX INFO: compiled from: UTF8DataInputJsonParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38470h extends AbstractC37385b {

    /* JADX INFO: renamed from: Z */
    public static final int f86354Z = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* JADX INFO: renamed from: a0 */
    public static final int f86355a0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* JADX INFO: renamed from: b0 */
    public static final int f86356b0 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* JADX INFO: renamed from: c0 */
    public static final int f86357c0 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* JADX INFO: renamed from: d0 */
    public static final int f86358d0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* JADX INFO: renamed from: e0 */
    public static final int f86359e0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* JADX INFO: renamed from: f0 */
    public static final int f86360f0 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* JADX INFO: renamed from: g0 */
    public static final int f86361g0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* JADX INFO: renamed from: h0 */
    public static final int[] f86362h0 = C6308b.m10970j();

    /* JADX INFO: renamed from: i0 */
    public static final int[] f86363i0 = C6308b.m10968h();

    /* JADX INFO: renamed from: S */
    public AbstractC6304g f86364S;

    /* JADX INFO: renamed from: T */
    public final C40935a f86365T;

    /* JADX INFO: renamed from: U */
    public int[] f86366U;

    /* JADX INFO: renamed from: V */
    public boolean f86367V;

    /* JADX INFO: renamed from: W */
    public int f86368W;

    /* JADX INFO: renamed from: X */
    public DataInput f86369X;

    /* JADX INFO: renamed from: Y */
    public int f86370Y;

    /* JADX INFO: renamed from: N2 */
    public static final int m86876N2(int i11, int i12) {
        return i12 == 4 ? i11 : i11 | ((-1) << (i12 << 3));
    }

    /* JADX INFO: renamed from: d2 */
    private final JsonToken m86879d2() {
        this.f82948E = false;
        JsonToken jsonToken = this.f82945B;
        this.f82945B = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
        }
        this.f82981e = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: renamed from: M2 */
    public final String m86896M2(int[] iArr, int i11, int i12, int i13) throws JsonParseException {
        if (i11 >= iArr.length) {
            iArr = m86878W1(iArr, iArr.length);
            this.f86366U = iArr;
        }
        int i14 = i11 + 1;
        iArr[i11] = m86876N2(i12, i13);
        String strM89686z = this.f86365T.m89686z(iArr, i14);
        return strM89686z == null ? m86892I2(iArr, i14, i13) : strM89686z;
    }

    /* JADX INFO: renamed from: o2 */
    public int m86924o2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iDecodeBase64Char = m84069i1(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i11 > length) {
                    i12 += i11;
                    outputStream.write(bArr, 0, i11);
                    i11 = 0;
                }
                int unsignedByte2 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84069i1(base64Variant, unsignedByte2, 1);
                }
                int i13 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            int i14 = i11 + 1;
                            bArr[i11] = (byte) (i13 >> 4);
                            if (base64Variant.usesPadding()) {
                                m84073m1(base64Variant);
                            }
                            i11 = i14;
                            break;
                        }
                        iDecodeBase64Char3 = m84069i1(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.f86369X.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || m84069i1(base64Variant, unsignedByte4, 3) != -2)) {
                            throw m84060G1(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i11] = (byte) (i13 >> 4);
                        i11++;
                    }
                }
                int i15 = (i13 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            int i16 = i11 + 1;
                            bArr[i11] = (byte) (i15 >> 10);
                            i11 += 2;
                            bArr[i16] = (byte) (i15 >> 2);
                            if (!base64Variant.usesPadding()) {
                                break;
                            }
                            m84073m1(base64Variant);
                            break;
                        }
                        iDecodeBase64Char4 = m84069i1(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i17 = i11 + 1;
                        bArr[i11] = (byte) (i15 >> 10);
                        i11 += 2;
                        bArr[i17] = (byte) (i15 >> 2);
                    }
                }
                int i18 = (i15 << 6) | iDecodeBase64Char4;
                bArr[i11] = (byte) (i18 >> 16);
                int i19 = i11 + 2;
                bArr[i11 + 1] = (byte) (i18 >> 8);
                i11 += 3;
                bArr[i19] = (byte) i18;
            }
        }
        this.f86367V = false;
        if (i11 <= 0) {
            return i12;
        }
        int i21 = i12 + i11;
        outputStream.write(bArr, 0, i11);
        return i21;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: r0 */
    public String mo10903r0() throws IOException {
        JsonToken jsonTokenM86922m2;
        this.f82951H = 0;
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            m86879d2();
            return null;
        }
        if (this.f86367V) {
            m86930z2();
        }
        int iM86889D2 = m86889D2();
        this.f82950G = null;
        this.f82969y = this.f82966v;
        if (iM86889D2 == 93 || iM86889D2 == 125) {
            m86875M1(iM86889D2);
            return null;
        }
        if (this.f82944A.m86801p()) {
            if (iM86889D2 != 44) {
                m84101S0(iM86889D2, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
            }
            iM86889D2 = m86889D2();
            if ((this.f10027b & f86354Z) != 0 && (iM86889D2 == 93 || iM86889D2 == 125)) {
                m86875M1(iM86889D2);
                return null;
            }
        }
        if (!this.f82944A.m10938g()) {
            m86880e2(iM86889D2);
            return null;
        }
        String strM86921l2 = m86921l2(iM86889D2);
        this.f82944A.m86805t(strM86921l2);
        this.f82981e = jsonToken2;
        int iM86883v2 = m86883v2();
        if (iM86883v2 == 34) {
            this.f86367V = true;
            this.f82945B = JsonToken.VALUE_STRING;
            return strM86921l2;
        }
        if (iM86883v2 != 45) {
            if (iM86883v2 == 46) {
                m86917h2();
            } else if (iM86883v2 == 91) {
                jsonTokenM86922m2 = JsonToken.START_ARRAY;
            } else if (iM86883v2 == 102) {
                m86914c2(CredentialEntry.FALSE_STRING, 1);
                jsonTokenM86922m2 = JsonToken.VALUE_FALSE;
            } else if (iM86883v2 == 110) {
                m86914c2("null", 1);
                jsonTokenM86922m2 = JsonToken.VALUE_NULL;
            } else if (iM86883v2 == 116) {
                m86914c2(CredentialEntry.TRUE_STRING, 1);
                jsonTokenM86922m2 = JsonToken.VALUE_TRUE;
            } else if (iM86883v2 != 123) {
                switch (iM86883v2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    default:
                        jsonTokenM86922m2 = m86913b2(iM86883v2);
                        break;
                }
            } else {
                jsonTokenM86922m2 = JsonToken.START_OBJECT;
            }
            jsonTokenM86922m2 = m86923n2(iM86883v2);
        } else {
            jsonTokenM86922m2 = m86922m2();
        }
        this.f82945B = jsonTokenM86922m2;
        return strM86921l2;
    }

    /* JADX INFO: renamed from: z2 */
    public void m86930z2() throws IOException {
        this.f86367V = false;
        int[] iArr = f86362h0;
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            int i11 = iArr[unsignedByte];
            if (i11 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i11 == 1) {
                    mo84070j1();
                } else if (i11 == 2) {
                    m86886A2();
                } else if (i11 == 3) {
                    m86887B2();
                } else if (i11 == 4) {
                    m86888C2();
                } else if (unsignedByte < 32) {
                    m84082v1(unsignedByte, "string value");
                } else {
                    m86925p2(unsignedByte);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F2 */
    private final int m86872F2() throws IOException {
        int unsignedByte = this.f86370Y;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this.f86369X.readUnsignedByte();
            } catch (EOFException unused) {
                return m84071k1();
            }
        } else {
            this.f86370Y = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.f82966v++;
            }
            try {
                unsignedByte = this.f86369X.readUnsignedByte();
            } catch (EOFException unused2) {
                return m84071k1();
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? m86890E2(unsignedByte) : unsignedByte;
    }

    /* JADX INFO: renamed from: G2 */
    private final boolean m86873G2() throws IOException {
        if ((this.f10027b & f86361g0) == 0) {
            return false;
        }
        m86885y2();
        return true;
    }

    /* JADX INFO: renamed from: M1 */
    private void m86875M1(int i11) throws JsonParseException {
        if (i11 == 93) {
            if (!this.f82944A.m10937f()) {
                m84080t1(i11, '}');
            }
            this.f82944A = this.f82944A.m86798l();
            this.f82981e = JsonToken.END_ARRAY;
        }
        if (i11 == 125) {
            if (!this.f82944A.m10938g()) {
                m84080t1(i11, ']');
            }
            this.f82944A = this.f82944A.m86798l();
            this.f82981e = JsonToken.END_OBJECT;
        }
    }

    /* JADX INFO: renamed from: S1 */
    private String m86877S1() throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86362h0;
        int length = cArrM11107m.length;
        int i11 = 0;
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this.f82946C.m11091D(i11);
                }
                m86907U1(cArrM11107m, i11, unsignedByte);
                return this.f82946C.m11106l();
            }
            int i12 = i11 + 1;
            cArrM11107m[i11] = (char) unsignedByte;
            if (i12 >= length) {
                m86907U1(cArrM11107m, i12, this.f86369X.readUnsignedByte());
                return this.f82946C.m11106l();
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static int[] m86878W1(int[] iArr, int i11) {
        return iArr == null ? new int[i11] : Arrays.copyOf(iArr, iArr.length + i11);
    }

    /* JADX INFO: renamed from: e2 */
    private final JsonToken m86880e2(int i11) throws IOException {
        if (i11 == 34) {
            this.f86367V = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        if (i11 == 45) {
            JsonToken jsonTokenM86922m2 = m86922m2();
            this.f82981e = jsonTokenM86922m2;
            return jsonTokenM86922m2;
        }
        if (i11 == 46) {
            JsonToken jsonTokenM86917h2 = m86917h2();
            this.f82981e = jsonTokenM86917h2;
            return jsonTokenM86917h2;
        }
        if (i11 == 91) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f82981e = jsonToken2;
            return jsonToken2;
        }
        if (i11 == 102) {
            m86914c2(CredentialEntry.FALSE_STRING, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f82981e = jsonToken3;
            return jsonToken3;
        }
        if (i11 == 110) {
            m86914c2("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f82981e = jsonToken4;
            return jsonToken4;
        }
        if (i11 == 116) {
            m86914c2(CredentialEntry.TRUE_STRING, 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f82981e = jsonToken5;
            return jsonToken5;
        }
        if (i11 == 123) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f82981e = jsonToken6;
            return jsonToken6;
        }
        switch (i11) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonTokenM86923n2 = m86923n2(i11);
                this.f82981e = jsonTokenM86923n2;
                return jsonTokenM86923n2;
            default:
                JsonToken jsonTokenM86913b2 = m86913b2(i11);
                this.f82981e = jsonTokenM86913b2;
                return jsonTokenM86913b2;
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m86881r2(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i11));
    }

    /* JADX INFO: renamed from: v2 */
    private final int m86883v2() throws IOException {
        int unsignedByte = this.f86370Y;
        if (unsignedByte < 0) {
            unsignedByte = this.f86369X.readUnsignedByte();
        } else {
            this.f86370Y = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this.f86369X.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? m86929w2(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this.f86369X.readUnsignedByte()) > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? m86929w2(unsignedByte2, true) : unsignedByte2;
            }
            return m86929w2(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this.f86369X.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return m86929w2(unsignedByte, false);
        }
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if (unsignedByte3 > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? m86929w2(unsignedByte3, true) : unsignedByte3;
        }
        if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this.f86369X.readUnsignedByte()) > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? m86929w2(unsignedByte3, true) : unsignedByte3;
        }
        return m86929w2(unsignedByte3, true);
    }

    /* JADX INFO: renamed from: x2 */
    private final void m86884x2() throws IOException {
        if ((this.f10027b & f86360f0) == 0) {
            m84101S0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (unsignedByte == 47) {
            m86885y2();
        } else if (unsignedByte == 42) {
            m86882u2();
        } else {
            m84101S0(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final void m86886A2() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final void m86887B2() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            m86881r2(unsignedByte2 & 255);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final void m86888C2() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            m86881r2(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            m86881r2(unsignedByte3 & 255);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final int m86889D2() throws IOException {
        int unsignedByte = this.f86370Y;
        if (unsignedByte < 0) {
            unsignedByte = this.f86369X.readUnsignedByte();
        } else {
            this.f86370Y = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.f82966v++;
            }
            unsignedByte = this.f86369X.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? m86890E2(unsignedByte) : unsignedByte;
    }

    /* JADX INFO: renamed from: E2 */
    public final int m86890E2(int i11) throws IOException {
        while (true) {
            if (i11 > 32) {
                if (i11 == 47) {
                    m86884x2();
                } else if (i11 != 35 || !m86873G2()) {
                    break;
                }
            } else if (i11 == 13 || i11 == 10) {
                this.f82966v++;
            }
            i11 = this.f86369X.readUnsignedByte();
        }
        return i11;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m86891H2() throws IOException {
        int i11 = this.f86370Y;
        if (i11 > 32) {
            m84100R0(i11);
            return;
        }
        this.f86370Y = -1;
        if (i11 == 13 || i11 == 10) {
            this.f82966v++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX INFO: renamed from: I2 */
    public final String m86892I2(int[] iArr, int i11, int i12) throws JsonParseException {
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
                    m86926q2(i25);
                    i15 = 1;
                    i16 = 1;
                }
                if (i26 + i16 > i18) {
                    m84098P0(" in field name", JsonToken.FIELD_NAME);
                }
                int i27 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                i26 = i22 + 2;
                if ((i27 & 192) != 128) {
                    m86881r2(i27);
                }
                int i28 = (i15 << 6) | (i27 & 63);
                if (i16 > 1) {
                    int i29 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                    i26 = i22 + 3;
                    if ((i29 & 192) != 128) {
                        m86881r2(i29);
                    }
                    int i31 = (i29 & 63) | (i28 << 6);
                    i17 = 2;
                    if (i16 > 2) {
                        int i32 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                        i26 = i22 + 4;
                        if ((i32 & 192) != 128) {
                            m86881r2(i32 & 255);
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
        return this.f86365T.m89678p(str, iArr, i11);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX INFO: renamed from: O1 */
    public int m86898O1(int i11) throws IOException {
        char c11;
        int unsignedByte;
        int unsignedByte2;
        int unsignedByte3;
        int i12 = i11 & 255;
        if (i12 > 127) {
            if ((i11 & 224) == 192) {
                i12 = i11 & 31;
            } else {
                if ((i11 & 240) == 224) {
                    i12 = i11 & 15;
                    c11 = 2;
                } else if ((i11 & 248) == 240) {
                    i12 = i11 & 7;
                    c11 = 3;
                } else {
                    m86926q2(i11 & 255);
                }
                unsignedByte = this.f86369X.readUnsignedByte();
                if ((unsignedByte & 192) != 128) {
                    m86881r2(unsignedByte & 255);
                }
                i12 = (i12 << 6) | (unsignedByte & 63);
                if (c11 > 1) {
                    unsignedByte2 = this.f86369X.readUnsignedByte();
                    if ((unsignedByte2 & 192) != 128) {
                        m86881r2(unsignedByte2 & 255);
                    }
                    i12 = (i12 << 6) | (unsignedByte2 & 63);
                    if (c11 > 2) {
                        unsignedByte3 = this.f86369X.readUnsignedByte();
                        if ((unsignedByte3 & 192) != 128) {
                            m86881r2(unsignedByte3 & 255);
                        }
                        return (unsignedByte3 & 63) | (i12 << 6);
                    }
                }
            }
            c11 = 1;
            unsignedByte = this.f86369X.readUnsignedByte();
            if ((unsignedByte & 192) != 128) {
                m86881r2(unsignedByte & 255);
            }
            i12 = (i12 << 6) | (unsignedByte & 63);
            if (c11 > 1) {
                unsignedByte2 = this.f86369X.readUnsignedByte();
                if ((unsignedByte2 & 192) != 128) {
                    m86881r2(unsignedByte2 & 255);
                }
                i12 = (i12 << 6) | (unsignedByte2 & 63);
                if (c11 > 2) {
                    unsignedByte3 = this.f86369X.readUnsignedByte();
                    if ((unsignedByte3 & 192) != 128) {
                        m86881r2(unsignedByte3 & 255);
                    }
                    return (unsignedByte3 & 63) | (i12 << 6);
                }
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: O2 */
    public final String m86899O2(int[] iArr, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr2 = f86363i0;
        while (true) {
            if (iArr2[i13] != 0) {
                if (i13 == 34) {
                    break;
                }
                if (i13 != 92) {
                    m84082v1(i13, "name");
                } else {
                    i13 = mo84070j1();
                }
                if (i13 > 127) {
                    int i15 = 0;
                    if (i14 >= 4) {
                        if (i11 >= iArr.length) {
                            iArr = m86878W1(iArr, iArr.length);
                            this.f86366U = iArr;
                        }
                        iArr[i11] = i12;
                        i11++;
                        i12 = 0;
                        i14 = 0;
                    }
                    if (i13 < 2048) {
                        i12 = (i12 << 8) | (i13 >> 6) | 192;
                        i14++;
                    } else {
                        int i16 = (i12 << 8) | (i13 >> 12) | 224;
                        int i17 = i14 + 1;
                        if (i17 >= 4) {
                            if (i11 >= iArr.length) {
                                iArr = m86878W1(iArr, iArr.length);
                                this.f86366U = iArr;
                            }
                            iArr[i11] = i16;
                            i11++;
                            i17 = 0;
                        } else {
                            i15 = i16;
                        }
                        i12 = (i15 << 8) | ((i13 >> 6) & 63) | 128;
                        i14 = i17 + 1;
                    }
                    i13 = (i13 & 63) | 128;
                }
            }
            if (i14 < 4) {
                i14++;
                i12 = (i12 << 8) | i13;
            } else {
                if (i11 >= iArr.length) {
                    iArr = m86878W1(iArr, iArr.length);
                    this.f86366U = iArr;
                }
                iArr[i11] = i12;
                i12 = i13;
                i11++;
                i14 = 1;
            }
            i13 = this.f86369X.readUnsignedByte();
        }
        if (i14 > 0) {
            if (i11 >= iArr.length) {
                iArr = m86878W1(iArr, iArr.length);
                this.f86366U = iArr;
            }
            iArr[i11] = m86876N2(i12, i14);
            i11++;
        }
        String strM89686z = this.f86365T.m89686z(iArr, i11);
        return strM89686z == null ? m86892I2(iArr, i11, i14) : strM89686z;
    }

    /* JADX INFO: renamed from: P1 */
    public final int m86900P1(int i11) throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
        return ((i11 & 31) << 6) | (unsignedByte & 63);
    }

    /* JADX INFO: renamed from: P2 */
    public final String m86901P2(int i11, int i12, int i13) throws IOException {
        return m86899O2(this.f86366U, 0, i11, i12, i13);
    }

    /* JADX INFO: renamed from: Q1 */
    public final int m86902Q1(int i11) throws IOException {
        int i12 = i11 & 15;
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
        int i13 = (i12 << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            m86881r2(unsignedByte2 & 255);
        }
        return (i13 << 6) | (unsignedByte2 & 63);
    }

    /* JADX INFO: renamed from: Q2 */
    public final String m86903Q2(int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f86366U;
        iArr[0] = i11;
        return m86899O2(iArr, 1, i12, i13, i14);
    }

    /* JADX INFO: renamed from: R1 */
    public final int m86904R1(int i11) throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            m86881r2(unsignedByte & 255);
        }
        int i12 = ((i11 & 7) << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            m86881r2(unsignedByte2 & 255);
        }
        int i13 = (i12 << 6) | (unsignedByte2 & 63);
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            m86881r2(unsignedByte3 & 255);
        }
        return ((i13 << 6) | (unsignedByte3 & 63)) - 65536;
    }

    /* JADX INFO: renamed from: R2 */
    public final String m86905R2(int i11, int i12, int i13, int i14, int i15) throws IOException {
        int[] iArr = this.f86366U;
        iArr[0] = i11;
        iArr[1] = i12;
        return m86899O2(iArr, 2, i13, i14, i15);
    }

    /* JADX INFO: renamed from: T1 */
    public void m86906T1() throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86362h0;
        int length = cArrM11107m.length;
        int i11 = 0;
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this.f82946C.m11092E(i11);
                    return;
                } else {
                    m86907U1(cArrM11107m, i11, unsignedByte);
                    return;
                }
            }
            int i12 = i11 + 1;
            cArrM11107m[i11] = (char) unsignedByte;
            if (i12 >= length) {
                m86907U1(cArrM11107m, i12, this.f86369X.readUnsignedByte());
                return;
            }
            i11 = i12;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return AbstractC37385b.f82943R;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m86907U1(char[] cArr, int i11, int i12) throws IOException {
        int[] iArr = f86362h0;
        int length = cArr.length;
        while (true) {
            int i13 = iArr[i12];
            int i14 = 0;
            if (i13 == 0) {
                if (i11 >= length) {
                    cArr = this.f82946C.m11110p();
                    length = cArr.length;
                    i11 = 0;
                }
                cArr[i11] = (char) i12;
                i12 = this.f86369X.readUnsignedByte();
                i11++;
            } else {
                if (i12 == 34) {
                    this.f82946C.m11092E(i11);
                    return;
                }
                if (i13 == 1) {
                    i12 = mo84070j1();
                } else if (i13 == 2) {
                    i12 = m86900P1(i12);
                } else if (i13 == 3) {
                    i12 = m86902Q1(i12);
                } else if (i13 == 4) {
                    int iM86904R1 = m86904R1(i12);
                    if (i11 >= cArr.length) {
                        cArr = this.f82946C.m11110p();
                        length = cArr.length;
                        i11 = 0;
                    }
                    cArr[i11] = (char) ((iM86904R1 >> 10) | 55296);
                    i12 = 56320 | (iM86904R1 & 1023);
                    i11++;
                } else if (i12 < 32) {
                    m84082v1(i12, "string value");
                } else {
                    m86925p2(i12);
                }
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    length = cArr.length;
                } else {
                    i14 = i11;
                }
                i11 = i14 + 1;
                cArr[i14] = (char) i12;
                i12 = this.f86369X.readUnsignedByte();
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final String m86908V1(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11106l() : jsonToken.asString();
        }
        return this.f82944A.mo10933b();
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return m86908V1(jsonToken);
        }
        if (!this.f86367V) {
            return this.f82946C.m11106l();
        }
        this.f86367V = false;
        return m86877S1();
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
            if (iM10917id != 6) {
                if (iM10917id != 7 && iM10917id != 8) {
                    return this.f82981e.asCharArray();
                }
            } else if (this.f86367V) {
                this.f86367V = false;
                m86906T1();
            }
            return this.f82946C.m11114u();
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
    public JsonToken m86909X1() throws IOException {
        int i11;
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86362h0;
        int i12 = 0;
        while (true) {
            int length = cArrM11107m.length;
            if (i12 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11110p();
                length = cArrM11107m.length;
                i12 = 0;
            }
            do {
                int unsignedByte = this.f86369X.readUnsignedByte();
                if (unsignedByte != 39) {
                    int i13 = iArr[unsignedByte];
                    if (i13 != 0 && unsignedByte != 34) {
                        if (i13 == 1) {
                            unsignedByte = mo84070j1();
                        } else if (i13 == 2) {
                            unsignedByte = m86900P1(unsignedByte);
                        } else if (i13 == 3) {
                            unsignedByte = m86902Q1(unsignedByte);
                        } else if (i13 != 4) {
                            if (unsignedByte < 32) {
                                m84082v1(unsignedByte, "string value");
                            }
                            m86925p2(unsignedByte);
                        } else {
                            int iM86904R1 = m86904R1(unsignedByte);
                            int i14 = i12 + 1;
                            cArrM11107m[i12] = (char) ((iM86904R1 >> 10) | 55296);
                            if (i14 >= cArrM11107m.length) {
                                cArrM11107m = this.f82946C.m11110p();
                                i12 = 0;
                            } else {
                                i12 = i14;
                            }
                            unsignedByte = 56320 | (iM86904R1 & 1023);
                        }
                        if (i12 >= cArrM11107m.length) {
                            cArrM11107m = this.f82946C.m11110p();
                            i12 = 0;
                        }
                        cArrM11107m[i12] = (char) unsignedByte;
                        i12++;
                        break;
                    }
                    i11 = i12 + 1;
                    cArrM11107m[i12] = (char) unsignedByte;
                    i12 = i11;
                } else {
                    this.f82946C.m11092E(i12);
                    return JsonToken.VALUE_STRING;
                }
            } while (i11 < length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f86367V) {
                this.f86367V = false;
                m86906T1();
            }
            return this.f82946C.m11093F();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f82944A.mo10933b().length();
        }
        if (jsonToken != null) {
            return jsonToken.isNumeric() ? this.f82946C.m11093F() : this.f82981e.asCharArray().length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y1 */
    public JsonToken m86910Y1(int i11, boolean z11) throws IOException {
        String str;
        while (i11 == 73) {
            i11 = this.f86369X.readUnsignedByte();
            if (i11 != 78) {
                if (i11 != 110) {
                    break;
                }
                str = z11 ? "-Infinity" : "+Infinity";
            } else {
                str = z11 ? "-INF" : "+INF";
            }
            m86914c2(str, 3);
            if ((this.f10027b & f86356b0) != 0) {
                return m84062I1(str, z11 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            m84093K0("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        m84112d1(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo10872Z() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != null) {
            int iM10917id = jsonToken.m10917id();
            if (iM10917id != 6) {
                if (iM10917id != 7) {
                }
            } else if (this.f86367V) {
                this.f86367V = false;
                m86906T1();
            }
            return this.f82946C.m11115v();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z1 */
    public final int m86911Z1() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if ((this.f10027b & f86355a0) == 0) {
                m84105W0("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this.f86369X.readUnsignedByte();
            }
        }
        return unsignedByte;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        return new JsonLocation(m84067g1(), -1L, -1L, this.f82969y, -1);
    }

    /* JADX INFO: renamed from: a2 */
    public String m86912a2(int i11) throws IOException {
        if (i11 == 39 && (this.f10027b & f86358d0) != 0) {
            return m86915f2();
        }
        if ((this.f10027b & f86359e0) == 0) {
            m84101S0((char) m86898O1(i11), "was expecting double-quote to start field name");
        }
        int[] iArrM10971k = C6308b.m10971k();
        if (iArrM10971k[i11] != 0) {
            m84101S0(i11, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrM86878W1 = this.f86366U;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        do {
            if (i12 < 4) {
                i12++;
                i11 |= i14 << 8;
            } else {
                if (i13 >= iArrM86878W1.length) {
                    iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                    this.f86366U = iArrM86878W1;
                }
                iArrM86878W1[i13] = i14;
                i13++;
                i12 = 1;
            }
            i14 = i11;
            i11 = this.f86369X.readUnsignedByte();
        } while (iArrM10971k[i11] == 0);
        this.f86370Y = i11;
        if (i12 > 0) {
            if (i13 >= iArrM86878W1.length) {
                iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                this.f86366U = iArrM86878W1;
            }
            iArrM86878W1[i13] = i14;
            i13++;
        }
        String strM89686z = this.f86365T.m89686z(iArrM86878W1, i13);
        return strM89686z == null ? m86892I2(iArrM86878W1, i13, i12) : strM89686z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3.f82944A.m10937f() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r3.f82944A.m10939h() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if ((r3.f10027b & p334i7.C38470h.f86357c0) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r3.f86370Y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX INFO: renamed from: b2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken m86913b2(int i11) throws IOException {
        if (i11 == 39) {
            if ((this.f10027b & f86358d0) != 0) {
                return m86909X1();
            }
        } else if (i11 == 73) {
            m86914c2("Infinity", 1);
            if ((this.f10027b & f86356b0) != 0) {
                return m84062I1("Infinity", Double.POSITIVE_INFINITY);
            }
            m84093K0("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i11 == 78) {
            m86914c2("NaN", 1);
            if ((this.f10027b & f86356b0) != 0) {
                return m84062I1("NaN", Double.NaN);
            }
            m84093K0("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i11 != 93) {
            if (i11 == 125) {
                m84101S0(i11, "expected a value");
                if ((this.f10027b & f86358d0) != 0) {
                    return m86909X1();
                }
            } else if (i11 == 43) {
                return m86910Y1(this.f86369X.readUnsignedByte(), false);
            }
        }
        if (Character.isJavaIdentifierStart(i11)) {
            m86928t2(i11, "" + ((char) i11), m84083w1());
        }
        m84101S0(i11, "expected a valid value " + m84084x1());
        return null;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: c0 */
    public int mo10877c0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.mo10878d0(0);
        }
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

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: d0 */
    public int mo10878d0(int i11) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.mo10878d0(i11);
        }
        int i12 = this.f82951H;
        if ((i12 & 1) == 0) {
            if (i12 == 0) {
                return m84075o1();
            }
            if ((i12 & 1) == 0) {
                m84056B1();
            }
        }
        return this.f82952I;
    }

    /* JADX INFO: renamed from: f2 */
    public String m86915f2() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrM86878W1 = this.f86366U;
        int[] iArr = f86363i0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    m84082v1(unsignedByte, "name");
                } else {
                    unsignedByte = mo84070j1();
                }
                if (unsignedByte > 127) {
                    if (i11 >= 4) {
                        if (i12 >= iArrM86878W1.length) {
                            iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                            this.f86366U = iArrM86878W1;
                        }
                        iArrM86878W1[i12] = i13;
                        i13 = 0;
                        i12++;
                        i11 = 0;
                    }
                    if (unsignedByte < 2048) {
                        i13 = (i13 << 8) | (unsignedByte >> 6) | 192;
                        i11++;
                    } else {
                        int i14 = (i13 << 8) | (unsignedByte >> 12) | 224;
                        int i15 = i11 + 1;
                        if (i15 >= 4) {
                            if (i12 >= iArrM86878W1.length) {
                                iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                                this.f86366U = iArrM86878W1;
                            }
                            iArrM86878W1[i12] = i14;
                            i14 = 0;
                            i12++;
                            i15 = 0;
                        }
                        i13 = (i14 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i11 = i15 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i11 < 4) {
                i11++;
                unsignedByte |= i13 << 8;
            } else {
                if (i12 >= iArrM86878W1.length) {
                    iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                    this.f86366U = iArrM86878W1;
                }
                iArrM86878W1[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = unsignedByte;
            unsignedByte = this.f86369X.readUnsignedByte();
        }
        if (i11 > 0) {
            if (i12 >= iArrM86878W1.length) {
                iArrM86878W1 = m86878W1(iArrM86878W1, iArrM86878W1.length);
                this.f86366U = iArrM86878W1;
            }
            iArrM86878W1[i12] = m86876N2(i13, i11);
            i12++;
        }
        String strM89686z = this.f86365T.m89686z(iArrM86878W1, i12);
        return strM89686z == null ? m86892I2(iArrM86878W1, i12, i11) : strM89686z;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(null);
        }
        if (!this.f86367V) {
            return this.f82946C.m11106l();
        }
        this.f86367V = false;
        return m86877S1();
    }

    /* JADX INFO: renamed from: g2 */
    public final JsonToken m86916g2(char[] cArr, int i11, int i12, boolean z11, int i13) throws IOException {
        int i14;
        int unsignedByte;
        int i15 = 0;
        if (i12 == 46) {
            cArr[i11] = (char) i12;
            i11++;
            int i16 = 0;
            while (true) {
                unsignedByte = this.f86369X.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i16++;
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    i11 = 0;
                }
                cArr[i11] = (char) unsignedByte;
                i11++;
            }
            if (i16 == 0) {
                m84112d1(unsignedByte, "Decimal point not followed by a digit");
            }
            i14 = i16;
            i12 = unsignedByte;
        } else {
            i14 = 0;
        }
        if (i12 == 101 || i12 == 69) {
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11110p();
                i11 = 0;
            }
            int i17 = i11 + 1;
            cArr[i11] = (char) i12;
            int unsignedByte2 = this.f86369X.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i17 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    i17 = 0;
                }
                cArr[i17] = (char) unsignedByte2;
                unsignedByte2 = this.f86369X.readUnsignedByte();
                i17++;
            }
            i12 = unsignedByte2;
            i11 = i17;
            int i18 = 0;
            while (i12 <= 57 && i12 >= 48) {
                i18++;
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    i11 = 0;
                }
                cArr[i11] = (char) i12;
                i12 = this.f86369X.readUnsignedByte();
                i11++;
            }
            if (i18 == 0) {
                m84112d1(i12, "Exponent indicator not followed by a digit");
            }
            i15 = i18;
        }
        this.f86370Y = i12;
        if (this.f82944A.m10939h()) {
            m86891H2();
        }
        this.f82946C.m11092E(i11);
        return m84063J1(z11, i13, i14, i15);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(str);
        }
        if (!this.f86367V) {
            return this.f82946C.m11106l();
        }
        this.f86367V = false;
        return m86877S1();
    }

    /* JADX INFO: renamed from: h2 */
    public final JsonToken m86917h2() throws IOException {
        return !m10894m0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature()) ? m86913b2(46) : m86916g2(this.f82946C.m11107m(), 0, 46, false, 0);
    }

    /* JADX INFO: renamed from: i2 */
    public final String m86918i2(int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f86366U;
        iArr[0] = this.f86368W;
        iArr[1] = i12;
        iArr[2] = i13;
        int[] iArr2 = f86363i0;
        int i14 = i11;
        int i15 = 3;
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                return unsignedByte == 34 ? m86896M2(this.f86366U, i15, i14, 1) : m86899O2(this.f86366U, i15, i14, unsignedByte, 1);
            }
            int i16 = (i14 << 8) | unsignedByte;
            int unsignedByte2 = this.f86369X.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                return unsignedByte2 == 34 ? m86896M2(this.f86366U, i15, i16, 2) : m86899O2(this.f86366U, i15, i16, unsignedByte2, 2);
            }
            int i17 = (i16 << 8) | unsignedByte2;
            int unsignedByte3 = this.f86369X.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                return unsignedByte3 == 34 ? m86896M2(this.f86366U, i15, i17, 3) : m86899O2(this.f86366U, i15, i17, unsignedByte3, 3);
            }
            int i18 = (i17 << 8) | unsignedByte3;
            int unsignedByte4 = this.f86369X.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                return unsignedByte4 == 34 ? m86896M2(this.f86366U, i15, i18, 4) : m86899O2(this.f86366U, i15, i18, unsignedByte4, 4);
            }
            int[] iArr3 = this.f86366U;
            if (i15 >= iArr3.length) {
                this.f86366U = m86878W1(iArr3, i15);
            }
            this.f86366U[i15] = i18;
            i15++;
            i14 = unsignedByte4;
        }
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: j1 */
    public char mo84070j1() throws IOException {
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return m84074n1((char) m86898O1(unsignedByte));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int unsignedByte2 = this.f86369X.readUnsignedByte();
            int iM10962b = C6308b.m10962b(unsignedByte2);
            if (iM10962b < 0) {
                m84101S0(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iM10962b;
        }
        return (char) i11;
    }

    /* JADX INFO: renamed from: j2 */
    public final String m86919j2(int i11) throws IOException {
        int[] iArr = f86363i0;
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? m86894K2(this.f86368W, i11, 1) : m86903Q2(this.f86368W, i11, unsignedByte, 1);
        }
        int i12 = (i11 << 8) | unsignedByte;
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? m86894K2(this.f86368W, i12, 2) : m86903Q2(this.f86368W, i12, unsignedByte2, 2);
        }
        int i13 = (i12 << 8) | unsignedByte2;
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? m86894K2(this.f86368W, i13, 3) : m86903Q2(this.f86368W, i13, unsignedByte3, 3);
        }
        int i14 = (i13 << 8) | unsignedByte3;
        int unsignedByte4 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? m86894K2(this.f86368W, i14, 4) : m86903Q2(this.f86368W, i14, unsignedByte4, 4);
        }
        return m86920k2(unsignedByte4, i14);
    }

    /* JADX INFO: renamed from: k2 */
    public final String m86920k2(int i11, int i12) throws IOException {
        int[] iArr = f86363i0;
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? m86895L2(this.f86368W, i12, i11, 1) : m86905R2(this.f86368W, i12, i11, unsignedByte, 1);
        }
        int i13 = (i11 << 8) | unsignedByte;
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? m86895L2(this.f86368W, i12, i13, 2) : m86905R2(this.f86368W, i12, i13, unsignedByte2, 2);
        }
        int i14 = (i13 << 8) | unsignedByte2;
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? m86895L2(this.f86368W, i12, i14, 3) : m86905R2(this.f86368W, i12, i14, unsignedByte3, 3);
        }
        int i15 = (i14 << 8) | unsignedByte3;
        int unsignedByte4 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? m86895L2(this.f86368W, i12, i15, 4) : m86905R2(this.f86368W, i12, i15, unsignedByte4, 4);
        }
        return m86918i2(unsignedByte4, i12, i15);
    }

    /* JADX INFO: renamed from: l2 */
    public final String m86921l2(int i11) throws IOException {
        if (i11 != 34) {
            return m86912a2(i11);
        }
        int[] iArr = f86363i0;
        int unsignedByte = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : m86901P2(0, unsignedByte, 0);
        }
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? m86893J2(unsignedByte, 1) : m86901P2(unsignedByte, unsignedByte2, 1);
        }
        int i12 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? m86893J2(i12, 2) : m86901P2(i12, unsignedByte3, 2);
        }
        int i13 = (i12 << 8) | unsignedByte3;
        int unsignedByte4 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? m86893J2(i13, 3) : m86901P2(i13, unsignedByte4, 3);
        }
        int i14 = (i13 << 8) | unsignedByte4;
        int unsignedByte5 = this.f86369X.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? m86893J2(i14, 4) : m86901P2(i14, unsignedByte5, 4);
        }
        this.f86368W = i14;
        return m86919j2(unsignedByte5);
    }

    /* JADX INFO: renamed from: m2 */
    public JsonToken m86922m2() throws IOException {
        int unsignedByte;
        char[] cArrM11107m = this.f82946C.m11107m();
        cArrM11107m[0] = '-';
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        cArrM11107m[1] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return m86910Y1(unsignedByte2, true);
            }
            unsignedByte = m86911Z1();
        } else {
            if (unsignedByte2 > 57) {
                return m86910Y1(unsignedByte2, true);
            }
            unsignedByte = this.f86369X.readUnsignedByte();
        }
        int i11 = 2;
        int i12 = 1;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i12++;
            cArrM11107m[i11] = (char) unsignedByte;
            unsignedByte = this.f86369X.readUnsignedByte();
            i11++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return m86916g2(cArrM11107m, i11, unsignedByte, true, i12);
        }
        this.f82946C.m11092E(i11);
        this.f86370Y = unsignedByte;
        if (this.f82944A.m10939h()) {
            m86891H2();
        }
        return m84064K1(true, i12);
    }

    /* JADX INFO: renamed from: n2 */
    public JsonToken m86923n2(int i11) throws IOException {
        int unsignedByte;
        char[] cArrM11107m = this.f82946C.m11107m();
        int i12 = 1;
        if (i11 == 48) {
            unsignedByte = m86911Z1();
            if (unsignedByte > 57 || unsignedByte < 48) {
                cArrM11107m[0] = '0';
            } else {
                i12 = 0;
            }
        } else {
            cArrM11107m[0] = (char) i11;
            unsignedByte = this.f86369X.readUnsignedByte();
        }
        int unsignedByte2 = unsignedByte;
        char[] cArrM11110p = cArrM11107m;
        int i13 = i12;
        int i14 = i13;
        while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
            i14++;
            if (i13 >= cArrM11110p.length) {
                cArrM11110p = this.f82946C.m11110p();
                i13 = 0;
            }
            cArrM11110p[i13] = (char) unsignedByte2;
            unsignedByte2 = this.f86369X.readUnsignedByte();
            i13++;
        }
        if (unsignedByte2 == 46 || unsignedByte2 == 101 || unsignedByte2 == 69) {
            return m86916g2(cArrM11110p, i13, unsignedByte2, false, i14);
        }
        this.f82946C.m11092E(i13);
        if (this.f82944A.m10939h()) {
            m86891H2();
        } else {
            this.f86370Y = unsignedByte2;
        }
        return m84064K1(false, i14);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f82950G == null)) {
            m84093K0("Current token (" + this.f82981e + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f86367V) {
            try {
                this.f82950G = m86897N1(base64Variant);
                this.f86367V = false;
            } catch (IllegalArgumentException e11) {
                throw m10873a("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e11.getMessage());
            }
        } else if (this.f82950G == null) {
            C6324c c6324cM84072l1 = m84072l1();
            m84089E0(mo10869W(), c6324cM84072l1, base64Variant);
            this.f82950G = c6324cM84072l1.m11079q();
        }
        return this.f82950G;
    }

    /* JADX INFO: renamed from: p2 */
    public void m86925p2(int i11) throws JsonParseException {
        if (i11 < 32) {
            m84103U0(i11);
        }
        m86926q2(i11);
    }

    /* JADX INFO: renamed from: q2 */
    public void m86926q2(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i11));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: s0 */
    public String mo10904s0() throws IOException {
        if (this.f82981e != JsonToken.FIELD_NAME) {
            if (mo10905t0() == JsonToken.VALUE_STRING) {
                return mo10869W();
            }
            return null;
        }
        this.f82948E = false;
        JsonToken jsonToken = this.f82945B;
        this.f82945B = null;
        this.f82981e = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.f86367V) {
                return this.f82946C.m11106l();
            }
            this.f86367V = false;
            return m86877S1();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
        }
        return null;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public JsonToken mo10905t0() throws IOException {
        JsonToken jsonTokenM86922m2;
        if (this.f82962r) {
            return null;
        }
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return m86879d2();
        }
        this.f82951H = 0;
        if (this.f86367V) {
            m86930z2();
        }
        int iM86872F2 = m86872F2();
        if (iM86872F2 < 0) {
            close();
            this.f82981e = null;
            return null;
        }
        this.f82950G = null;
        this.f82969y = this.f82966v;
        if (iM86872F2 == 93 || iM86872F2 == 125) {
            m86875M1(iM86872F2);
            return this.f82981e;
        }
        if (this.f82944A.m86801p()) {
            if (iM86872F2 != 44) {
                m84101S0(iM86872F2, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
            }
            iM86872F2 = m86889D2();
            if ((this.f10027b & f86354Z) != 0 && (iM86872F2 == 93 || iM86872F2 == 125)) {
                m86875M1(iM86872F2);
                return this.f82981e;
            }
        }
        if (!this.f82944A.m10938g()) {
            return m86880e2(iM86872F2);
        }
        this.f82944A.m86805t(m86921l2(iM86872F2));
        this.f82981e = jsonToken2;
        int iM86883v2 = m86883v2();
        if (iM86883v2 == 34) {
            this.f86367V = true;
            this.f82945B = JsonToken.VALUE_STRING;
            return this.f82981e;
        }
        if (iM86883v2 == 45) {
            jsonTokenM86922m2 = m86922m2();
        } else if (iM86883v2 == 46) {
            jsonTokenM86922m2 = m86917h2();
        } else if (iM86883v2 == 91) {
            jsonTokenM86922m2 = JsonToken.START_ARRAY;
        } else if (iM86883v2 == 102) {
            m86914c2(CredentialEntry.FALSE_STRING, 1);
            jsonTokenM86922m2 = JsonToken.VALUE_FALSE;
        } else if (iM86883v2 == 110) {
            m86914c2("null", 1);
            jsonTokenM86922m2 = JsonToken.VALUE_NULL;
        } else if (iM86883v2 == 116) {
            m86914c2(CredentialEntry.TRUE_STRING, 1);
            jsonTokenM86922m2 = JsonToken.VALUE_TRUE;
        } else if (iM86883v2 != 123) {
            switch (iM86883v2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenM86922m2 = m86923n2(iM86883v2);
                    break;
                default:
                    jsonTokenM86922m2 = m86913b2(iM86883v2);
                    break;
            }
        } else {
            jsonTokenM86922m2 = JsonToken.START_OBJECT;
        }
        this.f82945B = jsonTokenM86922m2;
        return this.f82981e;
    }

    /* JADX INFO: renamed from: t2 */
    public void m86928t2(int i11, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char cM86898O1 = (char) m86898O1(i11);
            if (!Character.isJavaIdentifierPart(cM86898O1)) {
                m84093K0("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
                return;
            }
            sb2.append(cM86898O1);
            i11 = this.f86369X.readUnsignedByte();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return this.f86364S;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        return new JsonLocation(m84067g1(), -1L, -1L, this.f82966v, -1);
    }

    /* JADX INFO: renamed from: w2 */
    public final int m86929w2(int i11, boolean z11) throws IOException {
        while (true) {
            if (i11 > 32) {
                if (i11 == 47) {
                    m86884x2();
                } else if (i11 != 35 || !m86873G2()) {
                    if (z11) {
                        return i11;
                    }
                    if (i11 != 58) {
                        m84101S0(i11, "was expecting a colon to separate field name and value");
                    }
                    z11 = true;
                }
            } else if (i11 == 13 || i11 == 10) {
                this.f82966v++;
            }
            i11 = this.f86369X.readUnsignedByte();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f86367V || this.f82981e != JsonToken.VALUE_STRING) {
            byte[] bArrMo10899p = mo10899p(base64Variant);
            outputStream.write(bArrMo10899p);
            return bArrMo10899p.length;
        }
        byte[] bArrM10977d = this.f82961q.m10977d();
        try {
            return m86924o2(base64Variant, outputStream, bArrM10977d);
        } finally {
            this.f82961q.m10988o(bArrM10977d);
        }
    }

    public C38470h(C6310d c6310d, int i11, DataInput dataInput, AbstractC6304g abstractC6304g, C40935a c40935a, int i12) {
        super(c6310d, i11);
        this.f86366U = new int[16];
        this.f86364S = abstractC6304g;
        this.f86365T = c40935a;
        this.f86369X = dataInput;
        this.f86370Y = i12;
    }

    /* JADX INFO: renamed from: L1 */
    private final void m86874L1(String str, int i11, int i12) throws IOException {
        char cM86898O1 = (char) m86898O1(i12);
        if (Character.isJavaIdentifierPart(cM86898O1)) {
            m86927s2(cM86898O1, str.substring(0, i11));
        }
    }

    /* JADX INFO: renamed from: u2 */
    private final void m86882u2() throws IOException {
        int[] iArrM10967g = C6308b.m10967g();
        int unsignedByte = this.f86369X.readUnsignedByte();
        while (true) {
            int i11 = iArrM10967g[unsignedByte];
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 10 && i11 != 13) {
                                if (i11 != 42) {
                                    m86925p2(unsignedByte);
                                } else {
                                    unsignedByte = this.f86369X.readUnsignedByte();
                                    if (unsignedByte == 47) {
                                        return;
                                    }
                                }
                            } else {
                                this.f82966v++;
                            }
                        } else {
                            m86888C2();
                        }
                    } else {
                        m86887B2();
                    }
                } else {
                    m86886A2();
                }
            }
            unsignedByte = this.f86369X.readUnsignedByte();
        }
    }

    /* JADX INFO: renamed from: y2 */
    private final void m86885y2() throws IOException {
        int[] iArrM10967g = C6308b.m10967g();
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            int i11 = iArrM10967g[unsignedByte];
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 10 || i11 == 13) {
                                break;
                            } else if (i11 != 42 && i11 < 0) {
                                m86925p2(unsignedByte);
                            }
                        } else {
                            m86888C2();
                        }
                    } else {
                        m86887B2();
                    }
                } else {
                    m86886A2();
                }
            }
        }
        this.f82966v++;
    }

    /* JADX INFO: renamed from: J2 */
    public final String m86893J2(int i11, int i12) throws JsonParseException {
        int iM86876N2 = m86876N2(i11, i12);
        String strM89683w = this.f86365T.m89683w(iM86876N2);
        if (strM89683w != null) {
            return strM89683w;
        }
        int[] iArr = this.f86366U;
        iArr[0] = iM86876N2;
        return m86892I2(iArr, 1, i12);
    }

    /* JADX INFO: renamed from: K2 */
    public final String m86894K2(int i11, int i12, int i13) throws JsonParseException {
        int iM86876N2 = m86876N2(i12, i13);
        String strM89684x = this.f86365T.m89684x(i11, iM86876N2);
        if (strM89684x != null) {
            return strM89684x;
        }
        int[] iArr = this.f86366U;
        iArr[0] = i11;
        iArr[1] = iM86876N2;
        return m86892I2(iArr, 2, i13);
    }

    /* JADX INFO: renamed from: L2 */
    public final String m86895L2(int i11, int i12, int i13, int i14) throws JsonParseException {
        int iM86876N2 = m86876N2(i13, i14);
        String strM89685y = this.f86365T.m89685y(i11, i12, iM86876N2);
        if (strM89685y != null) {
            return strM89685y;
        }
        int[] iArr = this.f86366U;
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = m86876N2(iM86876N2, i14);
        return m86892I2(iArr, 3, i14);
    }

    /* JADX INFO: renamed from: N1 */
    public final byte[] m86897N1(Base64Variant base64Variant) throws IOException {
        C6324c c6324cM84072l1 = m84072l1();
        while (true) {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        return c6324cM84072l1.m11079q();
                    }
                    iDecodeBase64Char = m84069i1(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84069i1(base64Variant, unsignedByte2, 1);
                }
                int i11 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            c6324cM84072l1.m11069b(i11 >> 4);
                            if (base64Variant.usesPadding()) {
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char3 = m84069i1(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.f86369X.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || m84069i1(base64Variant, unsignedByte4, 3) != -2)) {
                            throw m84060G1(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        c6324cM84072l1.m11069b(i11 >> 4);
                    }
                }
                int i12 = (i11 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.f86369X.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            c6324cM84072l1.m11071h(i12 >> 2);
                            if (base64Variant.usesPadding()) {
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char4 = m84069i1(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c6324cM84072l1.m11071h(i12 >> 2);
                    }
                }
                c6324cM84072l1.m11070g((i12 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final void m86914c2(String str, int i11) throws IOException {
        int length = str.length();
        do {
            int unsignedByte = this.f86369X.readUnsignedByte();
            if (unsignedByte != str.charAt(i11)) {
                m86927s2(unsignedByte, str.substring(0, i11));
            }
            i11++;
        } while (i11 < length);
        int unsignedByte2 = this.f86369X.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            m86874L1(str, i11, unsignedByte2);
        }
        this.f86370Y = unsignedByte2;
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws IOException {
        super.mo84079s1();
        this.f86365T.m89659G();
    }

    /* JADX INFO: renamed from: s2 */
    public void m86927s2(int i11, String str) throws IOException {
        m86928t2(i11, str, m84083w1());
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: f1 */
    public void mo84066f1() throws IOException {
    }
}
