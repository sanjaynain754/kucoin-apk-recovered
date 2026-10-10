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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Utf8;
import p254f7.AbstractC37385b;
import p254f7.AbstractC37386c;
import p395k7.C40935a;

/* JADX INFO: renamed from: i7.j */
/* JADX INFO: compiled from: UTF8StreamJsonParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38472j extends AbstractC37385b {

    /* JADX INFO: renamed from: d0 */
    public static final int f86384d0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* JADX INFO: renamed from: e0 */
    public static final int f86385e0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* JADX INFO: renamed from: f0 */
    public static final int f86386f0 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* JADX INFO: renamed from: g0 */
    public static final int f86387g0 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* JADX INFO: renamed from: h0 */
    public static final int f86388h0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* JADX INFO: renamed from: i0 */
    public static final int f86389i0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* JADX INFO: renamed from: j0 */
    public static final int f86390j0 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* JADX INFO: renamed from: k0 */
    public static final int f86391k0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* JADX INFO: renamed from: l0 */
    public static final int[] f86392l0 = C6308b.m10970j();

    /* JADX INFO: renamed from: m0 */
    public static final int[] f86393m0 = C6308b.m10968h();

    /* JADX INFO: renamed from: S */
    public AbstractC6304g f86394S;

    /* JADX INFO: renamed from: T */
    public final C40935a f86395T;

    /* JADX INFO: renamed from: U */
    public int[] f86396U;

    /* JADX INFO: renamed from: V */
    public boolean f86397V;

    /* JADX INFO: renamed from: W */
    public int f86398W;

    /* JADX INFO: renamed from: X */
    public int f86399X;

    /* JADX INFO: renamed from: Y */
    public int f86400Y;

    /* JADX INFO: renamed from: Z */
    public int f86401Z;

    /* JADX INFO: renamed from: a0 */
    public InputStream f86402a0;

    /* JADX INFO: renamed from: b0 */
    public byte[] f86403b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f86404c0;

    /* JADX INFO: renamed from: Y2 */
    private final String m86988Y2(int[] iArr, int i11, int i12, int i13) throws JsonParseException {
        if (i11 >= iArr.length) {
            iArr = AbstractC37385b.m84054E1(iArr, iArr.length);
            this.f86396U = iArr;
        }
        int i14 = i11 + 1;
        iArr[i11] = m86995m2(i12, i13);
        String strM89686z = this.f86395T.m89686z(iArr, i14);
        return strM89686z == null ? m86984U2(iArr, i14, i13) : strM89686z;
    }

    /* JADX INFO: renamed from: k2 */
    private final JsonToken m86993k2() {
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

    /* JADX INFO: renamed from: m2 */
    private static final int m86995m2(int i11, int i12) {
        return i12 == 4 ? i11 : i11 | ((-1) << (i12 << 3));
    }

    /* JADX INFO: renamed from: H2 */
    public void m86999H2() throws IOException {
        this.f86397V = false;
        int[] iArr = f86392l0;
        byte[] bArr = this.f86403b0;
        while (true) {
            int i11 = this.f82963s;
            int i12 = this.f82964t;
            if (i11 >= i12) {
                m87023e2();
                i11 = this.f82963s;
                i12 = this.f82964t;
            }
            while (true) {
                if (i11 >= i12) {
                    this.f82963s = i11;
                    break;
                }
                int i13 = i11 + 1;
                int i14 = bArr[i11] & 255;
                int i15 = iArr[i14];
                if (i15 != 0) {
                    this.f82963s = i13;
                    if (i14 != 34) {
                        if (i15 == 1) {
                            mo84070j1();
                            break;
                        }
                        if (i15 == 2) {
                            m86971I2();
                            break;
                        }
                        if (i15 == 3) {
                            m86972J2();
                            break;
                        }
                        if (i15 == 4) {
                            m87000K2(i14);
                            break;
                        } else if (i14 >= 32) {
                            m87036v2(i14);
                            break;
                        } else {
                            m84082v1(i14, "string value");
                            break;
                        }
                    }
                    return;
                }
                i11 = i13;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: r0 */
    public String mo10903r0() throws IOException {
        JsonToken jsonTokenM87032r2;
        this.f82951H = 0;
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            m86993k2();
            return null;
        }
        if (this.f86397V) {
            m86999H2();
        }
        int iM86975N2 = m86975N2();
        if (iM86975N2 < 0) {
            close();
            this.f82981e = null;
            return null;
        }
        this.f82950G = null;
        if (iM86975N2 == 93) {
            m87001M1();
            this.f82981e = JsonToken.END_ARRAY;
            return null;
        }
        if (iM86975N2 == 125) {
            m87003N1();
            this.f82981e = JsonToken.END_OBJECT;
            return null;
        }
        if (this.f82944A.m86801p()) {
            if (iM86975N2 != 44) {
                m84101S0(iM86975N2, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
            }
            iM86975N2 = m86974L2();
            if ((this.f10027b & f86384d0) != 0 && (iM86975N2 == 93 || iM86975N2 == 125)) {
                m87004O1(iM86975N2);
                return null;
            }
        }
        if (!this.f82944A.m10938g()) {
            m86978Q2();
            m86994l2(iM86975N2);
            return null;
        }
        m86980R2();
        String strM87031q2 = m87031q2(iM86975N2);
        this.f82944A.m86805t(strM87031q2);
        this.f82981e = jsonToken2;
        int iM86967D2 = m86967D2();
        m86978Q2();
        if (iM86967D2 == 34) {
            this.f86397V = true;
            this.f82945B = JsonToken.VALUE_STRING;
            return strM87031q2;
        }
        if (iM86967D2 == 45) {
            jsonTokenM87032r2 = m87032r2();
        } else if (iM86967D2 == 46) {
            jsonTokenM87032r2 = m87030p2();
        } else if (iM86967D2 == 91) {
            jsonTokenM87032r2 = JsonToken.START_ARRAY;
        } else if (iM86967D2 == 102) {
            m87024f2();
            jsonTokenM87032r2 = JsonToken.VALUE_FALSE;
        } else if (iM86967D2 == 110) {
            m87025g2();
            jsonTokenM87032r2 = JsonToken.VALUE_NULL;
        } else if (iM86967D2 == 116) {
            m87028j2();
            jsonTokenM87032r2 = JsonToken.VALUE_TRUE;
        } else if (iM86967D2 != 123) {
            switch (iM86967D2) {
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
                    jsonTokenM87032r2 = m87034t2(iM86967D2);
                    break;
                default:
                    jsonTokenM87032r2 = m87019c2(iM86967D2);
                    break;
            }
        } else {
            jsonTokenM87032r2 = JsonToken.START_OBJECT;
        }
        this.f82945B = jsonTokenM87032r2;
        return strM87031q2;
    }

    /* JADX INFO: renamed from: s2 */
    public final JsonToken m87033s2(char[] cArr, int i11, boolean z11, int i12) throws IOException {
        char[] cArrM11110p = cArr;
        int i13 = i11;
        int i14 = i12;
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                this.f82946C.m11092E(i13);
                return m84064K1(z11, i14);
            }
            byte[] bArr = this.f86403b0;
            int i15 = this.f82963s;
            this.f82963s = i15 + 1;
            int i16 = bArr[i15] & 255;
            if (i16 > 57 || i16 < 48) {
                if (i16 == 46 || i16 == 101 || i16 == 69) {
                    return m86996o2(cArrM11110p, i13, i16, z11, i14);
                }
                this.f82963s = i15;
                this.f82946C.m11092E(i13);
                if (this.f82944A.m10939h()) {
                    m86982T2(this.f86403b0[this.f82963s] & 255);
                }
                return m84064K1(z11, i14);
            }
            if (i13 >= cArrM11110p.length) {
                i13 = 0;
                cArrM11110p = this.f82946C.m11110p();
            }
            cArrM11110p[i13] = (char) i16;
            i14++;
            i13++;
        }
    }

    /* JADX INFO: renamed from: D2 */
    private final int m86967D2() throws IOException {
        int i11 = this.f82963s;
        if (i11 + 4 >= this.f82964t) {
            return m86968E2(false);
        }
        byte[] bArr = this.f86403b0;
        byte b11 = bArr[i11];
        if (b11 == 58) {
            int i12 = i11 + 1;
            this.f82963s = i12;
            byte b12 = bArr[i12];
            if (b12 > 32) {
                if (b12 == 47 || b12 == 35) {
                    return m86968E2(true);
                }
                this.f82963s = i11 + 2;
                return b12;
            }
            if (b12 == 32 || b12 == 9) {
                int i13 = i11 + 2;
                this.f82963s = i13;
                byte b13 = bArr[i13];
                if (b13 > 32) {
                    if (b13 == 47 || b13 == 35) {
                        return m86968E2(true);
                    }
                    this.f82963s = i11 + 3;
                    return b13;
                }
            }
            return m86968E2(true);
        }
        if (b11 == 32 || b11 == 9) {
            int i14 = i11 + 1;
            this.f82963s = i14;
            b11 = bArr[i14];
        }
        if (b11 != 58) {
            return m86968E2(false);
        }
        int i15 = this.f82963s;
        int i16 = i15 + 1;
        this.f82963s = i16;
        byte b14 = bArr[i16];
        if (b14 > 32) {
            if (b14 == 47 || b14 == 35) {
                return m86968E2(true);
            }
            this.f82963s = i15 + 2;
            return b14;
        }
        if (b14 == 32 || b14 == 9) {
            int i17 = i15 + 2;
            this.f82963s = i17;
            byte b15 = bArr[i17];
            if (b15 > 32) {
                if (b15 == 47 || b15 == 35) {
                    return m86968E2(true);
                }
                this.f82963s = i15 + 3;
                return b15;
            }
        }
        return m86968E2(true);
    }

    /* JADX INFO: renamed from: E2 */
    private final int m86968E2(boolean z11) throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84098P0(" within/between " + this.f82944A.m10941j() + " entries", null);
                return -1;
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            if (i13 > 32) {
                if (i13 == 47) {
                    m86969F2();
                } else if (i13 != 35 || !m86977P2()) {
                    if (z11) {
                        return i13;
                    }
                    if (i13 != 58) {
                        m84101S0(i13, "was expecting a colon to separate field name and value");
                    }
                    z11 = true;
                }
            } else if (i13 != 32) {
                if (i13 == 10) {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (i13 == 13) {
                    m86998C2();
                } else if (i13 != 9) {
                    m84103U0(i13);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F2 */
    private final void m86969F2() throws IOException {
        if ((this.f10027b & f86390j0) == 0) {
            m84101S0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f82963s >= this.f82964t && !m87021d2()) {
            m84098P0(" in a comment", null);
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        int i12 = bArr[i11] & 255;
        if (i12 == 47) {
            m86970G2();
        } else if (i12 == 42) {
            m86966B2();
        } else {
            m84101S0(i12, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX INFO: renamed from: I2 */
    private final void m86971I2() throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        this.f82963s = i12;
        byte b11 = bArr[i11];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i12);
        }
    }

    /* JADX INFO: renamed from: J2 */
    private final void m86972J2() throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        this.f82963s = i12;
        byte b11 = bArr[i11];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i12);
        }
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr2 = this.f86403b0;
        int i13 = this.f82963s;
        int i14 = i13 + 1;
        this.f82963s = i14;
        byte b12 = bArr2[i13];
        if ((b12 & 192) != 128) {
            m87039y2(b12 & 255, i14);
        }
    }

    /* JADX INFO: renamed from: L2 */
    private final int m86974L2() throws IOException {
        while (true) {
            int i11 = this.f82963s;
            if (i11 >= this.f82964t) {
                return m87002M2();
            }
            byte[] bArr = this.f86403b0;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            if (i13 > 32) {
                if (i13 != 47 && i13 != 35) {
                    return i13;
                }
                this.f82963s = i11;
                return m87002M2();
            }
            if (i13 != 32) {
                if (i13 == 10) {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (i13 == 13) {
                    m86998C2();
                } else if (i13 != 9) {
                    m84103U0(i13);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    private final int m86975N2() throws IOException {
        if (this.f82963s >= this.f82964t && !m87021d2()) {
            return m84071k1();
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        this.f82963s = i12;
        int i13 = bArr[i11] & 255;
        if (i13 > 32) {
            if (i13 != 47 && i13 != 35) {
                return i13;
            }
            this.f82963s = i11;
            return m86976O2();
        }
        if (i13 != 32) {
            if (i13 == 10) {
                this.f82966v++;
                this.f82967w = i12;
            } else if (i13 == 13) {
                m86998C2();
            } else if (i13 != 9) {
                m84103U0(i13);
            }
        }
        while (true) {
            int i14 = this.f82963s;
            if (i14 >= this.f82964t) {
                return m86976O2();
            }
            byte[] bArr2 = this.f86403b0;
            int i15 = i14 + 1;
            this.f82963s = i15;
            int i16 = bArr2[i14] & 255;
            if (i16 > 32) {
                if (i16 != 47 && i16 != 35) {
                    return i16;
                }
                this.f82963s = i14;
                return m86976O2();
            }
            if (i16 != 32) {
                if (i16 == 10) {
                    this.f82966v++;
                    this.f82967w = i15;
                } else if (i16 == 13) {
                    m86998C2();
                } else if (i16 != 9) {
                    m84103U0(i16);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O2 */
    private final int m86976O2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                return m84071k1();
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            if (i13 > 32) {
                if (i13 == 47) {
                    m86969F2();
                } else if (i13 != 35 || !m86977P2()) {
                    return i13;
                }
            } else if (i13 != 32) {
                if (i13 == 10) {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (i13 == 13) {
                    m86998C2();
                } else if (i13 != 9) {
                    m84103U0(i13);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    private final boolean m86977P2() throws IOException {
        if ((this.f10027b & f86391k0) == 0) {
            return false;
        }
        m86970G2();
        return true;
    }

    /* JADX INFO: renamed from: Q2 */
    private final void m86978Q2() {
        this.f82969y = this.f82966v;
        int i11 = this.f82963s;
        this.f82968x = this.f82965u + ((long) i11);
        this.f82970z = i11 - this.f82967w;
    }

    /* JADX INFO: renamed from: R1 */
    private final int m86979R1(int i11) throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i12 = this.f82963s;
        int i13 = i12 + 1;
        this.f82963s = i13;
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i13);
        }
        return ((i11 & 31) << 6) | (b11 & 63);
    }

    /* JADX INFO: renamed from: R2 */
    private final void m86980R2() {
        this.f86400Y = this.f82966v;
        int i11 = this.f82963s;
        this.f86399X = i11;
        this.f86401Z = i11 - this.f82967w;
    }

    /* JADX INFO: renamed from: S1 */
    private final int m86981S1(int i11) throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        int i12 = i11 & 15;
        byte[] bArr = this.f86403b0;
        int i13 = this.f82963s;
        int i14 = i13 + 1;
        this.f82963s = i14;
        byte b11 = bArr[i13];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i14);
        }
        int i15 = (i12 << 6) | (b11 & 63);
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr2 = this.f86403b0;
        int i16 = this.f82963s;
        int i17 = i16 + 1;
        this.f82963s = i17;
        byte b12 = bArr2[i16];
        if ((b12 & 192) != 128) {
            m87039y2(b12 & 255, i17);
        }
        return (i15 << 6) | (b12 & 63);
    }

    /* JADX INFO: renamed from: T2 */
    private final void m86982T2(int i11) throws IOException {
        int i12 = this.f82963s + 1;
        this.f82963s = i12;
        if (i11 != 9) {
            if (i11 == 10) {
                this.f82966v++;
                this.f82967w = i12;
            } else if (i11 == 13) {
                m86998C2();
            } else if (i11 != 32) {
                m84100R0(i11);
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    private final int m86983U1(int i11) throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i12 = this.f82963s;
        int i13 = i12 + 1;
        this.f82963s = i13;
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i13);
        }
        int i14 = ((i11 & 7) << 6) | (b11 & 63);
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr2 = this.f86403b0;
        int i15 = this.f82963s;
        int i16 = i15 + 1;
        this.f82963s = i16;
        byte b12 = bArr2[i15];
        if ((b12 & 192) != 128) {
            m87039y2(b12 & 255, i16);
        }
        int i17 = (i14 << 6) | (b12 & 63);
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr3 = this.f86403b0;
        int i18 = this.f82963s;
        int i19 = i18 + 1;
        this.f82963s = i19;
        byte b13 = bArr3[i18];
        if ((b13 & 192) != 128) {
            m87039y2(b13 & 255, i19);
        }
        return ((i17 << 6) | (b13 & 63)) - 65536;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX INFO: renamed from: U2 */
    private final String m86984U2(int[] iArr, int i11, int i12) throws JsonParseException {
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
                    m87037w2(i25);
                    i15 = 1;
                    i16 = 1;
                }
                if (i26 + i16 > i18) {
                    m84098P0(" in field name", JsonToken.FIELD_NAME);
                }
                int i27 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                i26 = i22 + 2;
                if ((i27 & 192) != 128) {
                    m87038x2(i27);
                }
                int i28 = (i15 << 6) | (i27 & 63);
                if (i16 > 1) {
                    int i29 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                    i26 = i22 + 3;
                    if ((i29 & 192) != 128) {
                        m87038x2(i29);
                    }
                    int i31 = (i29 & 63) | (i28 << 6);
                    i17 = 2;
                    if (i16 > 2) {
                        int i32 = iArr[i26 >> 2] >> ((3 - (i26 & 3)) << 3);
                        i26 = i22 + 4;
                        if ((i32 & 192) != 128) {
                            m87038x2(i32 & 255);
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
        return this.f86395T.m89678p(str, iArr, i11);
    }

    /* JADX INFO: renamed from: e3 */
    private final String m86989e3(int i11, int i12, int i13) throws IOException {
        return m87016a3(this.f86396U, 0, i11, i12, i13);
    }

    /* JADX INFO: renamed from: f3 */
    private final String m86990f3(int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f86396U;
        iArr[0] = i11;
        return m87016a3(iArr, 1, i12, i13, i14);
    }

    /* JADX INFO: renamed from: g3 */
    private final String m86991g3(int i11, int i12, int i13, int i14, int i15) throws IOException {
        int[] iArr = this.f86396U;
        iArr[0] = i11;
        iArr[1] = i12;
        return m87016a3(iArr, 2, i13, i14, i15);
    }

    /* JADX INFO: renamed from: l2 */
    private final JsonToken m86994l2(int i11) throws IOException {
        if (i11 == 34) {
            this.f86397V = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        if (i11 == 45) {
            JsonToken jsonTokenM87032r2 = m87032r2();
            this.f82981e = jsonTokenM87032r2;
            return jsonTokenM87032r2;
        }
        if (i11 == 46) {
            JsonToken jsonTokenM87030p2 = m87030p2();
            this.f82981e = jsonTokenM87030p2;
            return jsonTokenM87030p2;
        }
        if (i11 == 91) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f82981e = jsonToken2;
            return jsonToken2;
        }
        if (i11 == 102) {
            m87024f2();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f82981e = jsonToken3;
            return jsonToken3;
        }
        if (i11 == 110) {
            m87025g2();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f82981e = jsonToken4;
            return jsonToken4;
        }
        if (i11 == 116) {
            m87028j2();
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
                JsonToken jsonTokenM87034t2 = m87034t2(i11);
                this.f82981e = jsonTokenM87034t2;
                return jsonTokenM87034t2;
            default:
                JsonToken jsonTokenM87019c2 = m87019c2(i11);
                this.f82981e = jsonTokenM87019c2;
                return jsonTokenM87019c2;
        }
    }

    /* JADX INFO: renamed from: o2 */
    private final JsonToken m86996o2(char[] cArr, int i11, int i12, boolean z11, int i13) throws IOException {
        int i14;
        boolean z12;
        int i15 = 0;
        if (i12 == 46) {
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11110p();
                i11 = 0;
            }
            cArr[i11] = (char) i12;
            i11++;
            i14 = 0;
            while (true) {
                if (this.f82963s >= this.f82964t && !m87021d2()) {
                    z12 = true;
                    break;
                }
                byte[] bArr = this.f86403b0;
                int i16 = this.f82963s;
                this.f82963s = i16 + 1;
                i12 = bArr[i16] & 255;
                if (i12 < 48 || i12 > 57) {
                    z12 = false;
                    break;
                }
                i14++;
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    i11 = 0;
                }
                cArr[i11] = (char) i12;
                i11++;
            }
            if (i14 == 0) {
                m84112d1(i12, "Decimal point not followed by a digit");
            }
        } else {
            i14 = 0;
            z12 = false;
        }
        if (i12 == 101 || i12 == 69) {
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11110p();
                i11 = 0;
            }
            int i17 = i11 + 1;
            cArr[i11] = (char) i12;
            if (this.f82963s >= this.f82964t) {
                m87023e2();
            }
            byte[] bArr2 = this.f86403b0;
            int i18 = this.f82963s;
            this.f82963s = i18 + 1;
            int i19 = bArr2[i18] & 255;
            if (i19 == 45 || i19 == 43) {
                if (i17 >= cArr.length) {
                    cArr = this.f82946C.m11110p();
                    i17 = 0;
                }
                int i21 = i17 + 1;
                cArr[i17] = (char) i19;
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr3 = this.f86403b0;
                int i22 = this.f82963s;
                this.f82963s = i22 + 1;
                i19 = bArr3[i22] & 255;
                i17 = i21;
            }
            i12 = i19;
            int i23 = 0;
            while (true) {
                if (i12 >= 48 && i12 <= 57) {
                    i23++;
                    if (i17 >= cArr.length) {
                        cArr = this.f82946C.m11110p();
                        i17 = 0;
                    }
                    int i24 = i17 + 1;
                    cArr[i17] = (char) i12;
                    if (this.f82963s >= this.f82964t && !m87021d2()) {
                        i15 = i23;
                        z12 = true;
                        i11 = i24;
                        break;
                    }
                    byte[] bArr4 = this.f86403b0;
                    int i25 = this.f82963s;
                    this.f82963s = i25 + 1;
                    i12 = bArr4[i25] & 255;
                    i17 = i24;
                } else {
                    i15 = i23;
                    i11 = i17;
                    break;
                }
            }
            if (i15 == 0) {
                m84112d1(i12, "Exponent indicator not followed by a digit");
            }
        }
        if (!z12) {
            this.f82963s--;
            if (this.f82944A.m10939h()) {
                m86982T2(i12);
            }
        }
        this.f82946C.m11092E(i11);
        return m84063J1(z11, i13, i14, i15);
    }

    /* JADX INFO: renamed from: A2 */
    public void m86997A2(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.f82963s < this.f82964t || m87021d2()) {
                byte[] bArr = this.f86403b0;
                int i11 = this.f82963s;
                this.f82963s = i11 + 1;
                char cM87006Q1 = (char) m87006Q1(bArr[i11]);
                if (Character.isJavaIdentifierPart(cM87006Q1)) {
                    sb2.append(cM87006Q1);
                }
            }
            m84095M0("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        m84095M0("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m86998C2() throws IOException {
        if (this.f82963s < this.f82964t || m87021d2()) {
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            if (bArr[i11] == 10) {
                this.f82963s = i11 + 1;
            }
        }
        this.f82966v++;
        this.f82967w = this.f82963s;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m87000K2(int i11) throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i12 = this.f82963s;
        int i13 = i12 + 1;
        this.f82963s = i13;
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i13);
        }
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr2 = this.f86403b0;
        int i14 = this.f82963s;
        int i15 = i14 + 1;
        this.f82963s = i15;
        byte b12 = bArr2[i14];
        if ((b12 & 192) != 128) {
            m87039y2(b12 & 255, i15);
        }
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr3 = this.f86403b0;
        int i16 = this.f82963s;
        int i17 = i16 + 1;
        this.f82963s = i17;
        byte b13 = bArr3[i16];
        if ((b13 & 192) != 128) {
            m87039y2(b13 & 255, i17);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final int m87002M2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                throw m10873a("Unexpected end-of-input within/between " + this.f82944A.m10941j() + " entries");
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            if (i13 > 32) {
                if (i13 == 47) {
                    m86969F2();
                } else if (i13 != 35 || !m86977P2()) {
                    return i13;
                }
            } else if (i13 != 32) {
                if (i13 == 10) {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (i13 == 13) {
                    m86998C2();
                } else if (i13 != 9) {
                    m84103U0(i13);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final JsonToken m87004O1(int i11) throws JsonParseException {
        if (i11 == 125) {
            m87003N1();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        m87001M1();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this.f82981e = jsonToken2;
        return jsonToken2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX INFO: renamed from: Q1 */
    public int m87006Q1(int i11) throws IOException {
        char c11;
        int iM87014Z2;
        int iM87014Z3;
        int iM87014Z4;
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
                    m87037w2(i11 & 255);
                }
                iM87014Z2 = m87014Z2();
                if ((iM87014Z2 & 192) != 128) {
                    m87038x2(iM87014Z2 & 255);
                }
                i12 = (i12 << 6) | (iM87014Z2 & 63);
                if (c11 > 1) {
                    iM87014Z3 = m87014Z2();
                    if ((iM87014Z3 & 192) != 128) {
                        m87038x2(iM87014Z3 & 255);
                    }
                    i12 = (i12 << 6) | (iM87014Z3 & 63);
                    if (c11 > 2) {
                        iM87014Z4 = m87014Z2();
                        if ((iM87014Z4 & 192) != 128) {
                            m87038x2(iM87014Z4 & 255);
                        }
                        return (iM87014Z4 & 63) | (i12 << 6);
                    }
                }
            }
            c11 = 1;
            iM87014Z2 = m87014Z2();
            if ((iM87014Z2 & 192) != 128) {
                m87038x2(iM87014Z2 & 255);
            }
            i12 = (i12 << 6) | (iM87014Z2 & 63);
            if (c11 > 1) {
                iM87014Z3 = m87014Z2();
                if ((iM87014Z3 & 192) != 128) {
                    m87038x2(iM87014Z3 & 255);
                }
                i12 = (i12 << 6) | (iM87014Z3 & 63);
                if (c11 > 2) {
                    iM87014Z4 = m87014Z2();
                    if ((iM87014Z4 & 192) != 128) {
                        m87038x2(iM87014Z4 & 255);
                    }
                    return (iM87014Z4 & 63) | (i12 << 6);
                }
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: S2 */
    public final int m87007S2() throws IOException {
        int i11;
        if ((this.f82963s >= this.f82964t && !m87021d2()) || (i11 = this.f86403b0[this.f82963s] & 255) < 48 || i11 > 57) {
            return 48;
        }
        if ((this.f10027b & f86385e0) == 0) {
            m84105W0("Leading zeroes not allowed");
        }
        this.f82963s++;
        if (i11 != 48) {
            return i11;
        }
        do {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                return i11;
            }
            byte[] bArr = this.f86403b0;
            int i12 = this.f82963s;
            i11 = bArr[i12] & 255;
            if (i11 < 48 || i11 > 57) {
                return 48;
            }
            this.f82963s = i12 + 1;
        } while (i11 == 48);
        return i11;
    }

    /* JADX INFO: renamed from: T1 */
    public final int m87008T1(int i11) throws IOException {
        int i12 = i11 & 15;
        byte[] bArr = this.f86403b0;
        int i13 = this.f82963s;
        int i14 = i13 + 1;
        this.f82963s = i14;
        byte b11 = bArr[i13];
        if ((b11 & 192) != 128) {
            m87039y2(b11 & 255, i14);
        }
        int i15 = (i12 << 6) | (b11 & 63);
        byte[] bArr2 = this.f86403b0;
        int i16 = this.f82963s;
        int i17 = i16 + 1;
        this.f82963s = i17;
        byte b12 = bArr2[i16];
        if ((b12 & 192) != 128) {
            m87039y2(b12 & 255, i17);
        }
        return (i15 << 6) | (b12 & 63);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return AbstractC37385b.f82943R;
    }

    /* JADX INFO: renamed from: V1 */
    public String m87009V1() throws IOException {
        int i11 = this.f82963s;
        if (i11 >= this.f82964t) {
            m87023e2();
            i11 = this.f82963s;
        }
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86392l0;
        int iMin = Math.min(this.f82964t, cArrM11107m.length + i11);
        byte[] bArr = this.f86403b0;
        int i12 = 0;
        while (i11 < iMin) {
            int i13 = bArr[i11] & 255;
            if (iArr[i13] != 0) {
                if (i13 != 34) {
                    break;
                }
                this.f82963s = i11 + 1;
                return this.f82946C.m11091D(i12);
            }
            i11++;
            cArrM11107m[i12] = (char) i13;
            i12++;
        }
        this.f82963s = i11;
        m87011X1(cArrM11107m, i12);
        return this.f82946C.m11106l();
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return m87012Y1(jsonToken);
        }
        if (!this.f86397V) {
            return this.f82946C.m11106l();
        }
        this.f86397V = false;
        return m87009V1();
    }

    /* JADX INFO: renamed from: W1 */
    public void m87010W1() throws IOException {
        int i11 = this.f82963s;
        if (i11 >= this.f82964t) {
            m87023e2();
            i11 = this.f82963s;
        }
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86392l0;
        int iMin = Math.min(this.f82964t, cArrM11107m.length + i11);
        byte[] bArr = this.f86403b0;
        int i12 = 0;
        while (i11 < iMin) {
            int i13 = bArr[i11] & 255;
            if (iArr[i13] != 0) {
                if (i13 != 34) {
                    break;
                }
                this.f82963s = i11 + 1;
                this.f82946C.m11092E(i12);
                return;
            }
            i11++;
            cArrM11107m[i12] = (char) i13;
            i12++;
        }
        this.f82963s = i11;
        m87011X1(cArrM11107m, i12);
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
            } else if (this.f86397V) {
                this.f86397V = false;
                m87010W1();
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
    public final void m87011X1(char[] cArr, int i11) throws IOException {
        int[] iArr = f86392l0;
        byte[] bArr = this.f86403b0;
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                m87023e2();
                i12 = this.f82963s;
            }
            int i13 = 0;
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11110p();
                i11 = 0;
            }
            int iMin = Math.min(this.f82964t, (cArr.length - i11) + i12);
            while (true) {
                if (i12 >= iMin) {
                    this.f82963s = i12;
                    break;
                }
                int i14 = i12 + 1;
                int iMo84070j1 = bArr[i12] & 255;
                int i15 = iArr[iMo84070j1];
                if (i15 != 0) {
                    this.f82963s = i14;
                    if (iMo84070j1 != 34) {
                        if (i15 == 1) {
                            iMo84070j1 = mo84070j1();
                        } else if (i15 == 2) {
                            iMo84070j1 = m86979R1(iMo84070j1);
                        } else if (i15 == 3) {
                            iMo84070j1 = this.f82964t - i14 >= 2 ? m87008T1(iMo84070j1) : m86981S1(iMo84070j1);
                        } else if (i15 == 4) {
                            int iM86983U1 = m86983U1(iMo84070j1);
                            int i16 = i11 + 1;
                            cArr[i11] = (char) ((iM86983U1 >> 10) | 55296);
                            if (i16 >= cArr.length) {
                                cArr = this.f82946C.m11110p();
                                i11 = 0;
                            } else {
                                i11 = i16;
                            }
                            iMo84070j1 = (iM86983U1 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        } else if (iMo84070j1 < 32) {
                            m84082v1(iMo84070j1, "string value");
                        } else {
                            m87036v2(iMo84070j1);
                        }
                        if (i11 >= cArr.length) {
                            cArr = this.f82946C.m11110p();
                        } else {
                            i13 = i11;
                        }
                        i11 = i13 + 1;
                        cArr[i13] = (char) iMo84070j1;
                        break;
                    }
                    this.f82946C.m11092E(i11);
                    return;
                }
                cArr[i11] = (char) iMo84070j1;
                i12 = i14;
                i11++;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id == 5) {
            return this.f82944A.mo10933b().length();
        }
        if (iM10917id != 6) {
            if (iM10917id != 7 && iM10917id != 8) {
                return this.f82981e.asCharArray().length;
            }
        } else if (this.f86397V) {
            this.f86397V = false;
            m87010W1();
        }
        return this.f82946C.m11093F();
    }

    /* JADX INFO: renamed from: Y1 */
    public final String m87012Y1(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11106l() : jsonToken.asString();
        }
        return this.f82944A.mo10933b();
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
            } else if (this.f86397V) {
                this.f86397V = false;
                m87010W1();
            }
            return this.f82946C.m11115v();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z1 */
    public JsonToken m87013Z1() throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f86392l0;
        byte[] bArr = this.f86403b0;
        int i11 = 0;
        while (true) {
            if (this.f82963s >= this.f82964t) {
                m87023e2();
            }
            if (i11 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11110p();
                i11 = 0;
            }
            int i12 = this.f82964t;
            int length = this.f82963s + (cArrM11107m.length - i11);
            if (length < i12) {
                i12 = length;
            }
            while (true) {
                int i13 = this.f82963s;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i13 + 1;
                this.f82963s = i14;
                int iMo84070j1 = bArr[i13] & 255;
                if (iMo84070j1 != 39) {
                    int i15 = iArr[iMo84070j1];
                    if (i15 != 0 && iMo84070j1 != 34) {
                        if (i15 == 1) {
                            iMo84070j1 = mo84070j1();
                        } else if (i15 == 2) {
                            iMo84070j1 = m86979R1(iMo84070j1);
                        } else if (i15 == 3) {
                            iMo84070j1 = this.f82964t - i14 >= 2 ? m87008T1(iMo84070j1) : m86981S1(iMo84070j1);
                        } else if (i15 != 4) {
                            if (iMo84070j1 < 32) {
                                m84082v1(iMo84070j1, "string value");
                            }
                            m87036v2(iMo84070j1);
                        } else {
                            int iM86983U1 = m86983U1(iMo84070j1);
                            int i16 = i11 + 1;
                            cArrM11107m[i11] = (char) ((iM86983U1 >> 10) | 55296);
                            if (i16 >= cArrM11107m.length) {
                                cArrM11107m = this.f82946C.m11110p();
                                i11 = 0;
                            } else {
                                i11 = i16;
                            }
                            iMo84070j1 = 56320 | (iM86983U1 & 1023);
                        }
                        if (i11 >= cArrM11107m.length) {
                            cArrM11107m = this.f82946C.m11110p();
                            i11 = 0;
                        }
                        cArrM11107m[i11] = (char) iMo84070j1;
                        i11++;
                        break;
                    }
                    cArrM11107m[i11] = (char) iMo84070j1;
                    i11++;
                } else {
                    this.f82946C.m11092E(i11);
                    return JsonToken.VALUE_STRING;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final int m87014Z2() throws IOException {
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        if (this.f82981e != JsonToken.FIELD_NAME) {
            return new JsonLocation(m84067g1(), this.f82968x - 1, -1L, this.f82969y, this.f82970z);
        }
        return new JsonLocation(m84067g1(), this.f82965u + ((long) (this.f86399X - 1)), -1L, this.f86400Y, this.f86401Z);
    }

    /* JADX INFO: renamed from: a2 */
    public JsonToken m87015a2(int i11, boolean z11) throws IOException {
        String str;
        while (i11 == 73) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84099Q0(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.f86403b0;
            int i12 = this.f82963s;
            this.f82963s = i12 + 1;
            i11 = bArr[i12];
            if (i11 != 78) {
                if (i11 != 110) {
                    break;
                }
                str = z11 ? "-Infinity" : "+Infinity";
            } else {
                str = z11 ? "-INF" : "+INF";
            }
            m87026h2(str, 3);
            if ((this.f10027b & f86386f0) != 0) {
                return m84062I1(str, z11 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            m84094L0("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        m84112d1(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    /* JADX INFO: renamed from: a3 */
    public final String m87016a3(int[] iArr, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr2 = f86393m0;
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
                            iArr = AbstractC37385b.m84054E1(iArr, iArr.length);
                            this.f86396U = iArr;
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
                                iArr = AbstractC37385b.m84054E1(iArr, iArr.length);
                                this.f86396U = iArr;
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
                    iArr = AbstractC37385b.m84054E1(iArr, iArr.length);
                    this.f86396U = iArr;
                }
                iArr[i11] = i12;
                i12 = i13;
                i11++;
                i14 = 1;
            }
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84098P0(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.f86403b0;
            int i18 = this.f82963s;
            this.f82963s = i18 + 1;
            i13 = bArr[i18] & 255;
        }
        if (i14 > 0) {
            if (i11 >= iArr.length) {
                iArr = AbstractC37385b.m84054E1(iArr, iArr.length);
                this.f86396U = iArr;
            }
            iArr[i11] = m86995m2(i12, i14);
            i11++;
        }
        String strM89686z = this.f86395T.m89686z(iArr, i11);
        return strM89686z == null ? m86984U2(iArr, i11, i14) : strM89686z;
    }

    /* JADX INFO: renamed from: b2 */
    public String m87017b2(int i11) throws IOException {
        if (i11 == 39 && (this.f10027b & f86388h0) != 0) {
            return m87029n2();
        }
        if ((this.f10027b & f86389i0) == 0) {
            m84101S0((char) m87006Q1(i11), "was expecting double-quote to start field name");
        }
        int[] iArrM10971k = C6308b.m10971k();
        if (iArrM10971k[i11] != 0) {
            m84101S0(i11, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrM84054E1 = this.f86396U;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 < 4) {
                i12++;
                i11 |= i14 << 8;
            } else {
                if (i13 >= iArrM84054E1.length) {
                    iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                    this.f86396U = iArrM84054E1;
                }
                iArrM84054E1[i13] = i14;
                i13++;
                i12 = 1;
            }
            i14 = i11;
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84098P0(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.f86403b0;
            int i15 = this.f82963s;
            i11 = bArr[i15] & 255;
            if (iArrM10971k[i11] != 0) {
                break;
            }
            this.f82963s = i15 + 1;
        }
        if (i12 > 0) {
            if (i13 >= iArrM84054E1.length) {
                iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                this.f86396U = iArrM84054E1;
            }
            iArrM84054E1[i13] = i14;
            i13++;
        }
        String strM89686z = this.f86395T.m89686z(iArrM84054E1, i13);
        return strM89686z == null ? m86984U2(iArrM84054E1, i13, i12) : strM89686z;
    }

    /* JADX INFO: renamed from: b3 */
    public final String m87018b3(int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f86396U;
        iArr[0] = this.f86398W;
        int i14 = 1;
        iArr[1] = i12;
        iArr[2] = i13;
        byte[] bArr = this.f86403b0;
        int[] iArr2 = f86393m0;
        int i15 = i11;
        int i16 = 3;
        while (true) {
            int i17 = this.f82963s;
            if (i17 + 4 > this.f82964t) {
                return m87016a3(this.f86396U, i16, 0, i15, 0);
            }
            int i18 = i17 + 1;
            this.f82963s = i18;
            int i19 = bArr[i17] & 255;
            if (iArr2[i19] != 0) {
                if (i19 == 34) {
                    return m86988Y2(this.f86396U, i16, i15, i14);
                }
                return m87016a3(this.f86396U, i16, i15, i19, 1);
            }
            int i21 = i15;
            int i22 = i14;
            int i23 = i16;
            int[] iArr3 = iArr2;
            int i24 = (i21 << 8) | i19;
            int i25 = i17 + 2;
            this.f82963s = i25;
            int i26 = bArr[i18] & 255;
            if (iArr3[i26] != 0) {
                return i26 == 34 ? m86988Y2(this.f86396U, i23, i24, 2) : m87016a3(this.f86396U, i23, i24, i26, 2);
            }
            int i27 = (i24 << 8) | i26;
            int i28 = i17 + 3;
            this.f82963s = i28;
            int i29 = bArr[i25] & 255;
            if (iArr3[i29] != 0) {
                return i29 == 34 ? m86988Y2(this.f86396U, i23, i27, 3) : m87016a3(this.f86396U, i23, i27, i29, 3);
            }
            int i31 = (i27 << 8) | i29;
            this.f82963s = i17 + 4;
            int i32 = bArr[i28] & 255;
            if (iArr3[i32] != 0) {
                return i32 == 34 ? m86988Y2(this.f86396U, i23, i31, 4) : m87016a3(this.f86396U, i23, i31, i32, 4);
            }
            int[] iArr4 = this.f86396U;
            if (i23 >= iArr4.length) {
                this.f86396U = AbstractC37385b.m84054E1(iArr4, i23);
            }
            int i33 = i23 + 1;
            this.f86396U[i23] = i31;
            i14 = i22;
            i15 = i32;
            iArr2 = iArr3;
            i16 = i33;
        }
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

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.f82944A.m10937f() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3.f82944A.m10939h() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3.f10027b & p334i7.C38472j.f86387g0) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3.f82963s--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX INFO: renamed from: c2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken m87019c2(int i11) throws IOException {
        if (i11 == 39) {
            if ((this.f10027b & f86388h0) != 0) {
                return m87013Z1();
            }
        } else if (i11 == 73) {
            m87026h2("Infinity", 1);
            if ((this.f10027b & f86386f0) != 0) {
                return m84062I1("Infinity", Double.POSITIVE_INFINITY);
            }
            m84093K0("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i11 == 78) {
            m87026h2("NaN", 1);
            if ((this.f10027b & f86386f0) != 0) {
                return m84062I1("NaN", Double.NaN);
            }
            m84093K0("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i11 != 93) {
            if (i11 == 125) {
                m84101S0(i11, "expected a value");
                if ((this.f10027b & f86388h0) != 0) {
                    return m87013Z1();
                }
            } else if (i11 == 43) {
                if (this.f82963s >= this.f82964t && !m87021d2()) {
                    m84099Q0(JsonToken.VALUE_NUMBER_INT);
                }
                byte[] bArr = this.f86403b0;
                int i12 = this.f82963s;
                this.f82963s = i12 + 1;
                return m87015a2(bArr[i12] & 255, false);
            }
        }
        if (Character.isJavaIdentifierStart(i11)) {
            m86997A2("" + ((char) i11), m84083w1());
        }
        m84101S0(i11, "expected a valid value " + m84084x1());
        return null;
    }

    /* JADX INFO: renamed from: c3 */
    public final String m87020c3(int i11) throws IOException {
        byte[] bArr = this.f86403b0;
        int[] iArr = f86393m0;
        int i12 = this.f82963s;
        int i13 = i12 + 1;
        this.f82963s = i13;
        int i14 = bArr[i12] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? m86986W2(this.f86398W, i11, 1) : m86990f3(this.f86398W, i11, i14, 1);
        }
        int i15 = (i11 << 8) | i14;
        int i16 = i12 + 2;
        this.f82963s = i16;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            return i17 == 34 ? m86986W2(this.f86398W, i15, 2) : m86990f3(this.f86398W, i15, i17, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i12 + 3;
        this.f82963s = i19;
        int i21 = bArr[i16] & 255;
        if (iArr[i21] != 0) {
            return i21 == 34 ? m86986W2(this.f86398W, i18, 3) : m86990f3(this.f86398W, i18, i21, 3);
        }
        int i22 = (i18 << 8) | i21;
        this.f82963s = i12 + 4;
        int i23 = bArr[i19] & 255;
        if (iArr[i23] != 0) {
            return i23 == 34 ? m86986W2(this.f86398W, i22, 4) : m86990f3(this.f86398W, i22, i23, 4);
        }
        return m87022d3(i23, i22);
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

    /* JADX INFO: renamed from: d2 */
    public final boolean m87021d2() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.f86402a0;
        if (inputStream == null || (length = (bArr = this.f86403b0).length) == 0) {
            return false;
        }
        int i11 = inputStream.read(bArr, 0, length);
        if (i11 > 0) {
            int i12 = this.f82964t;
            this.f82965u += (long) i12;
            this.f82967w -= i12;
            this.f86399X -= i12;
            this.f82963s = 0;
            this.f82964t = i11;
            return true;
        }
        mo84066f1();
        if (i11 == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.f86403b0.length + " bytes");
        }
        return false;
    }

    /* JADX INFO: renamed from: d3 */
    public final String m87022d3(int i11, int i12) throws IOException {
        byte[] bArr = this.f86403b0;
        int[] iArr = f86393m0;
        int i13 = this.f82963s;
        int i14 = i13 + 1;
        this.f82963s = i14;
        int i15 = bArr[i13] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? m86987X2(this.f86398W, i12, i11, 1) : m86991g3(this.f86398W, i12, i11, i15, 1);
        }
        int i16 = (i11 << 8) | i15;
        int i17 = i13 + 2;
        this.f82963s = i17;
        int i18 = bArr[i14] & 255;
        if (iArr[i18] != 0) {
            return i18 == 34 ? m86987X2(this.f86398W, i12, i16, 2) : m86991g3(this.f86398W, i12, i16, i18, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i21 = i13 + 3;
        this.f82963s = i21;
        int i22 = bArr[i17] & 255;
        if (iArr[i22] != 0) {
            return i22 == 34 ? m86987X2(this.f86398W, i12, i19, 3) : m86991g3(this.f86398W, i12, i19, i22, 3);
        }
        int i23 = (i19 << 8) | i22;
        this.f82963s = i13 + 4;
        int i24 = bArr[i21] & 255;
        if (iArr[i24] != 0) {
            return i24 == 34 ? m86987X2(this.f86398W, i12, i23, 4) : m86991g3(this.f86398W, i12, i23, i24, 4);
        }
        return m87018b3(i24, i12, i23);
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: f1 */
    public void mo84066f1() throws IOException {
        if (this.f86402a0 != null) {
            if (this.f82961q.m10987n() || m10894m0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f86402a0.close();
            }
            this.f86402a0 = null;
        }
    }

    /* JADX INFO: renamed from: f2 */
    public final void m87024f2() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 4 < this.f82964t) {
            byte[] bArr = this.f86403b0;
            int i13 = i12 + 1;
            if (bArr[i12] == 97) {
                int i14 = i12 + 2;
                if (bArr[i13] == 108) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 115) {
                        int i16 = i12 + 4;
                        if (bArr[i15] == 101 && ((i11 = bArr[i16] & 255) < 48 || i11 == 93 || i11 == 125)) {
                            this.f82963s = i16;
                            return;
                        }
                    }
                }
            }
        }
        m86992i2(CredentialEntry.FALSE_STRING, 1);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(null);
        }
        if (!this.f86397V) {
            return this.f82946C.m11106l();
        }
        this.f86397V = false;
        return m87009V1();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m87025g2() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            byte[] bArr = this.f86403b0;
            int i13 = i12 + 1;
            if (bArr[i12] == 117) {
                int i14 = i12 + 2;
                if (bArr[i13] == 108) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 108 && ((i11 = bArr[i15] & 255) < 48 || i11 == 93 || i11 == 125)) {
                        this.f82963s = i15;
                        return;
                    }
                }
            }
        }
        m86992i2("null", 1);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public String mo10884h0(String str) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(str);
        }
        if (!this.f86397V) {
            return this.f82946C.m11106l();
        }
        this.f86397V = false;
        return m87009V1();
    }

    /* JADX INFO: renamed from: h3 */
    public String m87027h3() throws IOException {
        if (this.f82963s >= this.f82964t && !m87021d2()) {
            m84098P0(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        int i12 = bArr[i11] & 255;
        return i12 == 34 ? "" : m87016a3(this.f86396U, 0, 0, i12, 0);
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: j1 */
    public char mo84070j1() throws IOException {
        if (this.f82963s >= this.f82964t && !m87021d2()) {
            m84098P0(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 == 34 || b11 == 47 || b11 == 92) {
            return (char) b11;
        }
        if (b11 == 98) {
            return '\b';
        }
        if (b11 == 102) {
            return '\f';
        }
        if (b11 == 110) {
            return '\n';
        }
        if (b11 == 114) {
            return '\r';
        }
        if (b11 == 116) {
            return '\t';
        }
        if (b11 != 117) {
            return m84074n1((char) m87006Q1(b11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84098P0(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this.f86403b0;
            int i14 = this.f82963s;
            this.f82963s = i14 + 1;
            byte b12 = bArr2[i14];
            int iM10962b = C6308b.m10962b(b12);
            if (iM10962b < 0) {
                m84101S0(b12 & 255, "expected a hex-digit for character escape sequence");
            }
            i12 = (i12 << 4) | iM10962b;
        }
        return (char) i12;
    }

    /* JADX INFO: renamed from: j2 */
    public final void m87028j2() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            byte[] bArr = this.f86403b0;
            int i13 = i12 + 1;
            if (bArr[i12] == 114) {
                int i14 = i12 + 2;
                if (bArr[i13] == 117) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 101 && ((i11 = bArr[i15] & 255) < 48 || i11 == 93 || i11 == 125)) {
                        this.f82963s = i15;
                        return;
                    }
                }
            }
        }
        m86992i2(CredentialEntry.TRUE_STRING, 1);
    }

    /* JADX INFO: renamed from: n2 */
    public String m87029n2() throws IOException {
        if (this.f82963s >= this.f82964t && !m87021d2()) {
            m84098P0(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        int iMo84070j1 = bArr[i11] & 255;
        if (iMo84070j1 == 39) {
            return "";
        }
        int[] iArrM84054E1 = this.f86396U;
        int[] iArr = f86393m0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (iMo84070j1 != 39) {
            if (iArr[iMo84070j1] != 0 && iMo84070j1 != 34) {
                if (iMo84070j1 != 92) {
                    m84082v1(iMo84070j1, "name");
                } else {
                    iMo84070j1 = mo84070j1();
                }
                if (iMo84070j1 > 127) {
                    if (i12 >= 4) {
                        if (i13 >= iArrM84054E1.length) {
                            iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                            this.f86396U = iArrM84054E1;
                        }
                        iArrM84054E1[i13] = i14;
                        i14 = 0;
                        i13++;
                        i12 = 0;
                    }
                    if (iMo84070j1 < 2048) {
                        i14 = (i14 << 8) | (iMo84070j1 >> 6) | 192;
                        i12++;
                    } else {
                        int i15 = (i14 << 8) | (iMo84070j1 >> 12) | 224;
                        int i16 = i12 + 1;
                        if (i16 >= 4) {
                            if (i13 >= iArrM84054E1.length) {
                                iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                                this.f86396U = iArrM84054E1;
                            }
                            iArrM84054E1[i13] = i15;
                            i15 = 0;
                            i13++;
                            i16 = 0;
                        }
                        i14 = (i15 << 8) | ((iMo84070j1 >> 6) & 63) | 128;
                        i12 = i16 + 1;
                    }
                    iMo84070j1 = (iMo84070j1 & 63) | 128;
                }
            }
            if (i12 < 4) {
                i12++;
                iMo84070j1 |= i14 << 8;
            } else {
                if (i13 >= iArrM84054E1.length) {
                    iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                    this.f86396U = iArrM84054E1;
                }
                iArrM84054E1[i13] = i14;
                i13++;
                i12 = 1;
            }
            i14 = iMo84070j1;
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                m84098P0(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.f86403b0;
            int i17 = this.f82963s;
            this.f82963s = i17 + 1;
            iMo84070j1 = bArr2[i17] & 255;
        }
        if (i12 > 0) {
            if (i13 >= iArrM84054E1.length) {
                iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                this.f86396U = iArrM84054E1;
            }
            iArrM84054E1[i13] = m86995m2(i14, i12);
            i13++;
        }
        String strM89686z = this.f86395T.m89686z(iArrM84054E1, i13);
        return strM89686z == null ? m86984U2(iArrM84054E1, i13, i12) : strM89686z;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f82950G == null)) {
            m84093K0("Current token (" + this.f82981e + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f86397V) {
            try {
                this.f82950G = m87005P1(base64Variant);
                this.f86397V = false;
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
    public final JsonToken m87030p2() throws IOException {
        return !m10894m0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature()) ? m87019c2(46) : m86996o2(this.f82946C.m11107m(), 0, 46, false, 0);
    }

    /* JADX INFO: renamed from: q2 */
    public final String m87031q2(int i11) throws IOException {
        if (i11 != 34) {
            return m87017b2(i11);
        }
        int i12 = this.f82963s;
        if (i12 + 13 > this.f82964t) {
            return m87027h3();
        }
        byte[] bArr = this.f86403b0;
        int[] iArr = f86393m0;
        int i13 = i12 + 1;
        this.f82963s = i13;
        int i14 = bArr[i12] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? "" : m86989e3(0, i14, 0);
        }
        int i15 = i12 + 2;
        this.f82963s = i15;
        int i16 = bArr[i13] & 255;
        if (iArr[i16] != 0) {
            return i16 == 34 ? m86985V2(i14, 1) : m86989e3(i14, i16, 1);
        }
        int i17 = i16 | (i14 << 8);
        int i18 = i12 + 3;
        this.f82963s = i18;
        int i19 = bArr[i15] & 255;
        if (iArr[i19] != 0) {
            return i19 == 34 ? m86985V2(i17, 2) : m86989e3(i17, i19, 2);
        }
        int i21 = (i17 << 8) | i19;
        int i22 = i12 + 4;
        this.f82963s = i22;
        int i23 = bArr[i18] & 255;
        if (iArr[i23] != 0) {
            return i23 == 34 ? m86985V2(i21, 3) : m86989e3(i21, i23, 3);
        }
        int i24 = (i21 << 8) | i23;
        this.f82963s = i12 + 5;
        int i25 = bArr[i22] & 255;
        if (iArr[i25] != 0) {
            return i25 == 34 ? m86985V2(i24, 4) : m86989e3(i24, i25, 4);
        }
        this.f86398W = i24;
        return m87020c3(i25);
    }

    /* JADX INFO: renamed from: r2 */
    public JsonToken m87032r2() throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        cArrM11107m[0] = '-';
        if (this.f82963s >= this.f82964t) {
            m87023e2();
        }
        byte[] bArr = this.f86403b0;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        int iM87007S2 = bArr[i11] & 255;
        if (iM87007S2 <= 48) {
            if (iM87007S2 != 48) {
                return m87015a2(iM87007S2, true);
            }
            iM87007S2 = m87007S2();
        } else if (iM87007S2 > 57) {
            return m87015a2(iM87007S2, true);
        }
        cArrM11107m[1] = (char) iM87007S2;
        int i12 = 2;
        int iMin = Math.min(this.f82964t, (this.f82963s + cArrM11107m.length) - 2);
        int i13 = 1;
        while (true) {
            int i14 = this.f82963s;
            if (i14 >= iMin) {
                return m87033s2(cArrM11107m, i12, true, i13);
            }
            byte[] bArr2 = this.f86403b0;
            this.f82963s = i14 + 1;
            int i15 = bArr2[i14] & 255;
            if (i15 < 48 || i15 > 57) {
                if (i15 == 46 || i15 == 101 || i15 == 69) {
                    return m86996o2(cArrM11107m, i12, i15, true, i13);
                }
                this.f82963s = i14;
                this.f82946C.m11092E(i12);
                if (this.f82944A.m10939h()) {
                    m86982T2(i15);
                }
                return m84064K1(true, i13);
            }
            i13++;
            cArrM11107m[i12] = (char) i15;
            i12++;
        }
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
            if (!this.f86397V) {
                return this.f82946C.m11106l();
            }
            this.f86397V = false;
            return m87009V1();
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
        JsonToken jsonTokenM87032r2;
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return m86993k2();
        }
        this.f82951H = 0;
        if (this.f86397V) {
            m86999H2();
        }
        int iM86975N2 = m86975N2();
        if (iM86975N2 < 0) {
            close();
            this.f82981e = null;
            return null;
        }
        this.f82950G = null;
        if (iM86975N2 == 93) {
            m87001M1();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this.f82981e = jsonToken3;
            return jsonToken3;
        }
        if (iM86975N2 == 125) {
            m87003N1();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this.f82981e = jsonToken4;
            return jsonToken4;
        }
        if (this.f82944A.m86801p()) {
            if (iM86975N2 != 44) {
                m84101S0(iM86975N2, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
            }
            iM86975N2 = m86974L2();
            if ((this.f10027b & f86384d0) != 0 && (iM86975N2 == 93 || iM86975N2 == 125)) {
                return m87004O1(iM86975N2);
            }
        }
        if (!this.f82944A.m10938g()) {
            m86978Q2();
            return m86994l2(iM86975N2);
        }
        m86980R2();
        this.f82944A.m86805t(m87031q2(iM86975N2));
        this.f82981e = jsonToken2;
        int iM86967D2 = m86967D2();
        m86978Q2();
        if (iM86967D2 == 34) {
            this.f86397V = true;
            this.f82945B = JsonToken.VALUE_STRING;
            return this.f82981e;
        }
        if (iM86967D2 == 45) {
            jsonTokenM87032r2 = m87032r2();
        } else if (iM86967D2 == 46) {
            jsonTokenM87032r2 = m87030p2();
        } else if (iM86967D2 == 91) {
            jsonTokenM87032r2 = JsonToken.START_ARRAY;
        } else if (iM86967D2 == 102) {
            m87024f2();
            jsonTokenM87032r2 = JsonToken.VALUE_FALSE;
        } else if (iM86967D2 == 110) {
            m87025g2();
            jsonTokenM87032r2 = JsonToken.VALUE_NULL;
        } else if (iM86967D2 == 116) {
            m87028j2();
            jsonTokenM87032r2 = JsonToken.VALUE_TRUE;
        } else if (iM86967D2 != 123) {
            switch (iM86967D2) {
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
                    jsonTokenM87032r2 = m87034t2(iM86967D2);
                    break;
                default:
                    jsonTokenM87032r2 = m87019c2(iM86967D2);
                    break;
            }
        } else {
            jsonTokenM87032r2 = JsonToken.START_OBJECT;
        }
        this.f82945B = jsonTokenM87032r2;
        return this.f82981e;
    }

    /* JADX INFO: renamed from: t2 */
    public JsonToken m87034t2(int i11) throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        if (i11 == 48) {
            i11 = m87007S2();
        }
        cArrM11107m[0] = (char) i11;
        int iMin = Math.min(this.f82964t, (this.f82963s + cArrM11107m.length) - 1);
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int i14 = this.f82963s;
            if (i14 >= iMin) {
                return m87033s2(cArrM11107m, i12, false, i13);
            }
            byte[] bArr = this.f86403b0;
            this.f82963s = i14 + 1;
            int i15 = bArr[i14] & 255;
            if (i15 < 48 || i15 > 57) {
                if (i15 == 46 || i15 == 101 || i15 == 69) {
                    return m86996o2(cArrM11107m, i12, i15, false, i13);
                }
                this.f82963s = i14;
                this.f82946C.m11092E(i12);
                if (this.f82944A.m10939h()) {
                    m86982T2(i15);
                }
                return m84064K1(false, i13);
            }
            i13++;
            cArrM11107m[i12] = (char) i15;
            i12++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return this.f86394S;
    }

    /* JADX INFO: renamed from: u2 */
    public int m87035u2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (this.f82963s >= this.f82964t) {
                m87023e2();
            }
            byte[] bArr2 = this.f86403b0;
            int i13 = this.f82963s;
            this.f82963s = i13 + 1;
            int i14 = bArr2[i13] & 255;
            if (i14 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i14);
                if (iDecodeBase64Char < 0) {
                    if (i14 == 34) {
                        break;
                    }
                    iDecodeBase64Char = m84069i1(base64Variant, i14, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i11 > length) {
                    i12 += i11;
                    outputStream.write(bArr, 0, i11);
                    i11 = 0;
                }
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr3 = this.f86403b0;
                int i15 = this.f82963s;
                this.f82963s = i15 + 1;
                int i16 = bArr3[i15] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i16);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84069i1(base64Variant, i16, 1);
                }
                int i17 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr4 = this.f86403b0;
                int i18 = this.f82963s;
                this.f82963s = i18 + 1;
                int i19 = bArr4[i18] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i19);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i19 == 34) {
                            int i21 = i11 + 1;
                            bArr[i11] = (byte) (i17 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            i11 = i21;
                            break;
                        }
                        iDecodeBase64Char3 = m84069i1(base64Variant, i19, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f82963s >= this.f82964t) {
                            m87023e2();
                        }
                        byte[] bArr5 = this.f86403b0;
                        int i22 = this.f82963s;
                        this.f82963s = i22 + 1;
                        int i23 = bArr5[i22] & 255;
                        if (!base64Variant.usesPaddingChar(i23) && m84069i1(base64Variant, i23, 3) != -2) {
                            throw m84060G1(base64Variant, i23, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i11] = (byte) (i17 >> 4);
                        i11++;
                    }
                }
                int i24 = (i17 << 6) | iDecodeBase64Char3;
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr6 = this.f86403b0;
                int i25 = this.f82963s;
                this.f82963s = i25 + 1;
                int i26 = bArr6[i25] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i26);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i26 == 34) {
                            int i27 = i11 + 1;
                            bArr[i11] = (byte) (i24 >> 10);
                            i11 += 2;
                            bArr[i27] = (byte) (i24 >> 2);
                            if (!base64Variant.usesPadding()) {
                                break;
                            }
                            this.f82963s--;
                            m84073m1(base64Variant);
                            break;
                        }
                        iDecodeBase64Char4 = m84069i1(base64Variant, i26, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i28 = i11 + 1;
                        bArr[i11] = (byte) (i24 >> 10);
                        i11 += 2;
                        bArr[i28] = (byte) (i24 >> 2);
                    }
                }
                int i29 = (i24 << 6) | iDecodeBase64Char4;
                bArr[i11] = (byte) (i29 >> 16);
                int i31 = i11 + 2;
                bArr[i11 + 1] = (byte) (i29 >> 8);
                i11 += 3;
                bArr[i31] = (byte) i29;
            }
        }
        this.f86397V = false;
        if (i11 <= 0) {
            return i12;
        }
        int i32 = i12 + i11;
        outputStream.write(bArr, 0, i11);
        return i32;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        return new JsonLocation(m84067g1(), this.f82965u + ((long) this.f82963s), -1L, this.f82966v, (this.f82963s - this.f82967w) + 1);
    }

    /* JADX INFO: renamed from: v2 */
    public void m87036v2(int i11) throws JsonParseException {
        if (i11 < 32) {
            m84103U0(i11);
        }
        m87037w2(i11);
    }

    /* JADX INFO: renamed from: w2 */
    public void m87037w2(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i11));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f86397V || this.f82981e != JsonToken.VALUE_STRING) {
            byte[] bArrMo10899p = mo10899p(base64Variant);
            outputStream.write(bArrMo10899p);
            return bArrMo10899p.length;
        }
        byte[] bArrM10977d = this.f82961q.m10977d();
        try {
            return m87035u2(base64Variant, outputStream, bArrM10977d);
        } finally {
            this.f82961q.m10988o(bArrM10977d);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m87038x2(int i11) throws JsonParseException {
        m84093K0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i11));
    }

    /* JADX INFO: renamed from: y2 */
    public void m87039y2(int i11, int i12) throws JsonParseException {
        this.f82963s = i12;
        m87038x2(i11);
    }

    public C38472j(C6310d c6310d, int i11, InputStream inputStream, AbstractC6304g abstractC6304g, C40935a c40935a, byte[] bArr, int i12, int i13, int i14, boolean z11) {
        super(c6310d, i11);
        this.f86396U = new int[16];
        this.f86402a0 = inputStream;
        this.f86394S = abstractC6304g;
        this.f86395T = c40935a;
        this.f86403b0 = bArr;
        this.f82963s = i12;
        this.f82964t = i13;
        this.f82967w = i12 - i14;
        this.f82965u = (-i12) + i14;
        this.f86404c0 = z11;
    }

    /* JADX INFO: renamed from: B2 */
    private final void m86966B2() throws IOException {
        int[] iArrM10967g = C6308b.m10967g();
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                break;
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            int i14 = iArrM10967g[i13];
            if (i14 != 0) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 10) {
                                if (i14 != 13) {
                                    if (i14 != 42) {
                                        m87036v2(i13);
                                    } else {
                                        if (i12 >= this.f82964t && !m87021d2()) {
                                            break;
                                        }
                                        byte[] bArr2 = this.f86403b0;
                                        int i15 = this.f82963s;
                                        if (bArr2[i15] == 47) {
                                            this.f82963s = i15 + 1;
                                            return;
                                        }
                                    }
                                } else {
                                    m86998C2();
                                }
                            } else {
                                this.f82966v++;
                                this.f82967w = i12;
                            }
                        } else {
                            m87000K2(i13);
                        }
                    } else {
                        m86972J2();
                    }
                } else {
                    m86971I2();
                }
            }
        }
        m84098P0(" in a comment", null);
    }

    /* JADX INFO: renamed from: G2 */
    private final void m86970G2() throws IOException {
        int[] iArrM10967g = C6308b.m10967g();
        while (true) {
            if (this.f82963s >= this.f82964t && !m87021d2()) {
                return;
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            int i13 = bArr[i11] & 255;
            int i14 = iArrM10967g[i13];
            if (i14 != 0) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 10) {
                                if (i14 != 13) {
                                    if (i14 != 42 && i14 < 0) {
                                        m87036v2(i13);
                                    }
                                } else {
                                    m86998C2();
                                    return;
                                }
                            } else {
                                this.f82966v++;
                                this.f82967w = i12;
                                return;
                            }
                        } else {
                            m87000K2(i13);
                        }
                    } else {
                        m86972J2();
                    }
                } else {
                    m86971I2();
                }
            }
        }
    }

    /* JADX INFO: renamed from: L1 */
    private final void m86973L1(String str, int i11, int i12) throws IOException {
        if (Character.isJavaIdentifierPart((char) m87006Q1(i12))) {
            m87040z2(str.substring(0, i11));
        }
    }

    /* JADX INFO: renamed from: V2 */
    private final String m86985V2(int i11, int i12) throws JsonParseException {
        int iM86995m2 = m86995m2(i11, i12);
        String strM89683w = this.f86395T.m89683w(iM86995m2);
        if (strM89683w != null) {
            return strM89683w;
        }
        int[] iArr = this.f86396U;
        iArr[0] = iM86995m2;
        return m86984U2(iArr, 1, i12);
    }

    /* JADX INFO: renamed from: W2 */
    private final String m86986W2(int i11, int i12, int i13) throws JsonParseException {
        int iM86995m2 = m86995m2(i12, i13);
        String strM89684x = this.f86395T.m89684x(i11, iM86995m2);
        if (strM89684x != null) {
            return strM89684x;
        }
        int[] iArr = this.f86396U;
        iArr[0] = i11;
        iArr[1] = iM86995m2;
        return m86984U2(iArr, 2, i13);
    }

    /* JADX INFO: renamed from: X2 */
    private final String m86987X2(int i11, int i12, int i13, int i14) throws JsonParseException {
        int iM86995m2 = m86995m2(i13, i14);
        String strM89685y = this.f86395T.m89685y(i11, i12, iM86995m2);
        if (strM89685y != null) {
            return strM89685y;
        }
        int[] iArr = this.f86396U;
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = m86995m2(iM86995m2, i14);
        return m86984U2(iArr, 3, i14);
    }

    /* JADX INFO: renamed from: i2 */
    private final void m86992i2(String str, int i11) throws IOException {
        int i12;
        int i13;
        int length = str.length();
        do {
            if ((this.f82963s >= this.f82964t && !m87021d2()) || this.f86403b0[this.f82963s] != str.charAt(i11)) {
                m87040z2(str.substring(0, i11));
            }
            i12 = this.f82963s + 1;
            this.f82963s = i12;
            i11++;
        } while (i11 < length);
        if ((i12 < this.f82964t || m87021d2()) && (i13 = this.f86403b0[this.f82963s] & 255) >= 48 && i13 != 93 && i13 != 125) {
            m86973L1(str, i11, i13);
        }
    }

    /* JADX INFO: renamed from: M1 */
    public final void m87001M1() throws JsonParseException {
        m86978Q2();
        if (!this.f82944A.m10937f()) {
            m84080t1(93, '}');
        }
        this.f82944A = this.f82944A.m86798l();
    }

    /* JADX INFO: renamed from: N1 */
    public final void m87003N1() throws JsonParseException {
        m86978Q2();
        if (!this.f82944A.m10938g()) {
            m84080t1(125, ']');
        }
        this.f82944A = this.f82944A.m86798l();
    }

    /* JADX INFO: renamed from: P1 */
    public final byte[] m87005P1(Base64Variant base64Variant) throws IOException {
        C6324c c6324cM84072l1 = m84072l1();
        while (true) {
            if (this.f82963s >= this.f82964t) {
                m87023e2();
            }
            byte[] bArr = this.f86403b0;
            int i11 = this.f82963s;
            this.f82963s = i11 + 1;
            int i12 = bArr[i11] & 255;
            if (i12 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char < 0) {
                    if (i12 == 34) {
                        return c6324cM84072l1.m11079q();
                    }
                    iDecodeBase64Char = m84069i1(base64Variant, i12, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr2 = this.f86403b0;
                int i13 = this.f82963s;
                this.f82963s = i13 + 1;
                int i14 = bArr2[i13] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i14);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84069i1(base64Variant, i14, 1);
                }
                int i15 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr3 = this.f86403b0;
                int i16 = this.f82963s;
                this.f82963s = i16 + 1;
                int i17 = bArr3[i16] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i17);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i17 == 34) {
                            c6324cM84072l1.m11069b(i15 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char3 = m84069i1(base64Variant, i17, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f82963s >= this.f82964t) {
                            m87023e2();
                        }
                        byte[] bArr4 = this.f86403b0;
                        int i18 = this.f82963s;
                        this.f82963s = i18 + 1;
                        int i19 = bArr4[i18] & 255;
                        if (!base64Variant.usesPaddingChar(i19) && m84069i1(base64Variant, i19, 3) != -2) {
                            throw m84060G1(base64Variant, i19, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        c6324cM84072l1.m11069b(i15 >> 4);
                    }
                }
                int i21 = (i15 << 6) | iDecodeBase64Char3;
                if (this.f82963s >= this.f82964t) {
                    m87023e2();
                }
                byte[] bArr5 = this.f86403b0;
                int i22 = this.f82963s;
                this.f82963s = i22 + 1;
                int i23 = bArr5[i22] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i23);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i23 == 34) {
                            c6324cM84072l1.m11071h(i21 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char4 = m84069i1(base64Variant, i23, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c6324cM84072l1.m11071h(i21 >> 2);
                    }
                }
                c6324cM84072l1.m11070g((i21 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m87023e2() throws IOException {
        if (!m87021d2()) {
            m84097O0();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m87026h2(String str, int i11) throws IOException {
        int i12;
        int length = str.length();
        if (this.f82963s + length >= this.f82964t) {
            m86992i2(str, i11);
            return;
        }
        do {
            if (this.f86403b0[this.f82963s] != str.charAt(i11)) {
                m87040z2(str.substring(0, i11));
            }
            i12 = this.f82963s + 1;
            this.f82963s = i12;
            i11++;
        } while (i11 < length);
        int i13 = this.f86403b0[i12] & 255;
        if (i13 >= 48 && i13 != 93 && i13 != 125) {
            m86973L1(str, i11, i13);
        }
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super.mo84079s1();
        this.f86395T.m89659G();
        if (this.f86404c0 && (bArr = this.f86403b0) != null && bArr != (bArr2 = AbstractC37386c.f82971g)) {
            this.f86403b0 = bArr2;
            this.f82961q.m10991r(bArr);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m87040z2(String str) throws IOException {
        m86997A2(str, m84083w1());
    }
}
