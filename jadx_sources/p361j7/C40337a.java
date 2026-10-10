package p361j7;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.util.C6330i;
import com.fasterxml.jackson.core.util.C6332k;
import java.io.IOException;
import okio.Utf8;
import p254f7.AbstractC37385b;
import p254f7.AbstractC37386c;
import p395k7.C40935a;

/* JADX INFO: renamed from: j7.a */
/* JADX INFO: compiled from: NonBlockingJsonParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C40337a extends AbstractC40338b {

    /* JADX INFO: renamed from: l0 */
    public static final int f89570l0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* JADX INFO: renamed from: m0 */
    public static final int f89571m0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* JADX INFO: renamed from: n0 */
    public static final int f89572n0 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* JADX INFO: renamed from: o0 */
    public static final int f89573o0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* JADX INFO: renamed from: p0 */
    public static final int f89574p0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* JADX INFO: renamed from: q0 */
    public static final int f89575q0 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* JADX INFO: renamed from: r0 */
    public static final int f89576r0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* JADX INFO: renamed from: s0 */
    public static final int[] f89577s0 = C6308b.m10970j();

    /* JADX INFO: renamed from: t0 */
    public static final int[] f89578t0 = C6308b.m10968h();

    /* JADX INFO: renamed from: k0 */
    public byte[] f89579k0;

    /* JADX INFO: renamed from: I2 */
    public JsonToken m88846I2(int i11) throws IOException {
        if (i11 <= 48) {
            if (i11 == 48) {
                return m88844G2();
            }
            m84112d1(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i11 > 57) {
            if (i11 == 73) {
                return m88841D2(3, 2);
            }
            m84112d1(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrM11107m = this.f82946C.m11107m();
        cArrM11107m[0] = '-';
        cArrM11107m[1] = (char) i11;
        this.f82958O = 1;
        return m88843F2(cArrM11107m, 2);
    }

    /* JADX INFO: renamed from: Y2 */
    public final JsonToken m88862Y2(int i11) throws IOException {
        String strM88886p2;
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 5;
            return this.f82981e;
        }
        if (i11 != 44) {
            if (i11 == 125) {
                return m88900N1();
            }
            if (i11 == 35) {
                return m88838A2(5);
            }
            if (i11 == 47) {
                return m88869f3(5);
            }
            m84101S0(i11, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
        }
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89592c0 = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        int iM88856S2 = this.f89579k0[i12];
        this.f82963s = i12 + 1;
        if (iM88856S2 <= 32 && (iM88856S2 = m88856S2(iM88856S2)) <= 0) {
            this.f89592c0 = 4;
            return this.f82981e;
        }
        m88914c2();
        if (iM88856S2 != 34) {
            return (iM88856S2 != 125 || (this.f10027b & f89570l0) == 0) ? m88851N2(iM88856S2) : m88900N1();
        }
        return (this.f82963s + 13 > this.f82964t || (strM88886p2 = m88886p2()) == null) ? m88852O2(0, 0, 0) : m88902P1(strM88886p2);
    }

    /* JADX INFO: renamed from: a3 */
    public JsonToken m88864a3() throws IOException {
        this.f82957N = false;
        this.f82958O = 0;
        return m88863Z2(this.f82946C.m11107m(), 0, 46);
    }

    /* JADX INFO: renamed from: b3 */
    public JsonToken m88865b3() throws IOException {
        this.f82957N = true;
        int i11 = this.f82963s;
        if (i11 >= this.f82964t) {
            this.f89592c0 = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f89579k0;
        this.f82963s = i11 + 1;
        int i12 = bArr[i11] & 255;
        int i13 = 2;
        if (i12 <= 48) {
            if (i12 == 48) {
                return m88844G2();
            }
            m84112d1(i12, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i12 > 57) {
            if (i12 == 73) {
                return m88841D2(3, 2);
            }
            m84112d1(i12, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrM11107m = this.f82946C.m11107m();
        cArrM11107m[0] = '-';
        cArrM11107m[1] = (char) i12;
        int i14 = this.f82963s;
        if (i14 >= this.f82964t) {
            this.f89592c0 = 26;
            this.f82946C.m11092E(2);
            this.f82958O = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken2;
            return jsonToken2;
        }
        int i15 = this.f89579k0[i14];
        while (i15 >= 48) {
            if (i15 > 57) {
                if (i15 == 101 || i15 == 69) {
                    this.f82958O = i13 - 1;
                    this.f82963s++;
                    return m88863Z2(cArrM11107m, i13, i15);
                }
                this.f82958O = i13 - 1;
                this.f82946C.m11092E(i13);
                return m88915d2(JsonToken.VALUE_NUMBER_INT);
            }
            if (i13 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11109o();
            }
            int i16 = i13 + 1;
            cArrM11107m[i13] = (char) i15;
            int i17 = this.f82963s + 1;
            this.f82963s = i17;
            if (i17 >= this.f82964t) {
                this.f89592c0 = 26;
                this.f82946C.m11092E(i16);
                JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken3;
                return jsonToken3;
            }
            i15 = this.f89579k0[i17] & 255;
            i13 = i16;
        }
        if (i15 == 46) {
            this.f82958O = i13 - 1;
            this.f82963s++;
            return m88863Z2(cArrM11107m, i13, i15);
        }
        this.f82958O = i13 - 1;
        this.f82946C.m11092E(i13);
        return m88915d2(JsonToken.VALUE_NUMBER_INT);
    }

    /* JADX INFO: renamed from: e3 */
    public JsonToken m88868e3(int i11) throws IOException {
        this.f82957N = false;
        char[] cArrM11107m = this.f82946C.m11107m();
        cArrM11107m[0] = (char) i11;
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89592c0 = 26;
            this.f82946C.m11092E(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        int i13 = this.f89579k0[i12] & 255;
        int i14 = 1;
        while (i13 >= 48) {
            if (i13 > 57) {
                if (i13 == 101 || i13 == 69) {
                    this.f82958O = i14;
                    this.f82963s++;
                    return m88863Z2(cArrM11107m, i14, i13);
                }
                this.f82958O = i14;
                this.f82946C.m11092E(i14);
                return m88915d2(JsonToken.VALUE_NUMBER_INT);
            }
            if (i14 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11109o();
            }
            int i15 = i14 + 1;
            cArrM11107m[i14] = (char) i13;
            int i16 = this.f82963s + 1;
            this.f82963s = i16;
            if (i16 >= this.f82964t) {
                this.f89592c0 = 26;
                this.f82946C.m11092E(i15);
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken2;
                return jsonToken2;
            }
            i13 = this.f89579k0[i16] & 255;
            i14 = i15;
        }
        if (i13 == 46) {
            this.f82958O = i14;
            this.f82963s++;
            return m88863Z2(cArrM11107m, i14, i13);
        }
        this.f82958O = i14;
        this.f82946C.m11092E(i14);
        return m88915d2(JsonToken.VALUE_NUMBER_INT);
    }

    /* JADX INFO: renamed from: j2 */
    public final boolean m88876j2(int i11, int i12, boolean z11) throws IOException {
        if (i12 == 1) {
            int iM88874i2 = m88874i2(0, -1);
            if (iM88874i2 < 0) {
                this.f89592c0 = 41;
                return false;
            }
            this.f82946C.m11095a((char) iM88874i2);
            return true;
        }
        if (i12 == 2) {
            if (!z11) {
                this.f89592c0 = 42;
                this.f89586W = i11;
                return false;
            }
            byte[] bArr = this.f89579k0;
            int i13 = this.f82963s;
            this.f82963s = i13 + 1;
            this.f82946C.m11095a((char) m88882m2(i11, bArr[i13]));
            return true;
        }
        if (i12 == 3) {
            int i14 = i11 & 15;
            if (z11) {
                byte[] bArr2 = this.f89579k0;
                int i15 = this.f82963s;
                this.f82963s = i15 + 1;
                return m88878k2(i14, 1, bArr2[i15]);
            }
            this.f89592c0 = 43;
            this.f89586W = i14;
            this.f89587X = 1;
            return false;
        }
        if (i12 != 4) {
            if (i11 < 32) {
                m84082v1(i11, "string value");
            } else {
                m88908W1(i11);
            }
            this.f82946C.m11095a((char) i11);
            return true;
        }
        int i16 = i11 & 7;
        if (z11) {
            byte[] bArr3 = this.f89579k0;
            int i17 = this.f82963s;
            this.f82963s = i17 + 1;
            return m88880l2(i16, 1, bArr3[i17]);
        }
        this.f89586W = i16;
        this.f89587X = 1;
        this.f89592c0 = 44;
        return false;
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m88880l2(int i11, int i12, int i13) throws IOException {
        if (i12 == 1) {
            if ((i13 & 192) != 128) {
                m88911Z1(i13 & 255, this.f82963s);
            }
            i11 = (i11 << 6) | (i13 & 63);
            int i14 = this.f82963s;
            if (i14 >= this.f82964t) {
                this.f89592c0 = 44;
                this.f89586W = i11;
                this.f89587X = 2;
                return false;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i14 + 1;
            i13 = bArr[i14];
            i12 = 2;
        }
        if (i12 == 2) {
            if ((i13 & 192) != 128) {
                m88911Z1(i13 & 255, this.f82963s);
            }
            i11 = (i11 << 6) | (i13 & 63);
            int i15 = this.f82963s;
            if (i15 >= this.f82964t) {
                this.f89592c0 = 44;
                this.f89586W = i11;
                this.f89587X = 3;
                return false;
            }
            byte[] bArr2 = this.f89579k0;
            this.f82963s = i15 + 1;
            i13 = bArr2[i15];
        }
        if ((i13 & 192) != 128) {
            m88911Z1(i13 & 255, this.f82963s);
        }
        int i16 = ((i11 << 6) | (i13 & 63)) - 65536;
        this.f82946C.m11095a((char) ((i16 >> 10) | 55296));
        this.f82946C.m11095a((char) ((i16 & 1023) | Utf8.LOG_SURROGATE_HEADER));
        return true;
    }

    /* JADX INFO: renamed from: A2 */
    public final JsonToken m88838A2(int i11) throws IOException {
        if ((this.f10027b & f89576r0) == 0) {
            m84101S0(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89592c0 = 55;
                this.f89586W = i11;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            this.f82963s = i13;
            int i14 = bArr[i12] & 255;
            if (i14 < 32) {
                if (i14 == 10) {
                    this.f82966v++;
                    this.f82967w = i13;
                } else if (i14 == 13) {
                    this.f89597h0++;
                    this.f82967w = i13;
                } else if (i14 != 9) {
                    m84103U0(i14);
                }
                return m88857T2(i11);
            }
        }
    }

    /* JADX INFO: renamed from: F2 */
    public JsonToken m88843F2(char[] cArr, int i11) throws IOException {
        int i12 = this.f82957N ? -1 : 0;
        while (true) {
            int i13 = this.f82963s;
            if (i13 >= this.f82964t) {
                this.f89592c0 = 26;
                this.f82946C.m11092E(i11);
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            int i14 = this.f89579k0[i13] & 255;
            if (i14 < 48) {
                if (i14 != 46) {
                    break;
                }
                this.f82958O = i12 + i11;
                this.f82963s = i13 + 1;
                return m88863Z2(cArr, i11, i14);
            }
            if (i14 > 57) {
                if (i14 != 101 && i14 != 69) {
                    break;
                }
                this.f82958O = i12 + i11;
                this.f82963s = i13 + 1;
                return m88863Z2(cArr, i11, i14);
            }
            this.f82963s = i13 + 1;
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11109o();
            }
            cArr[i11] = (char) i14;
            i11++;
        }
        this.f82958O = i12 + i11;
        this.f82946C.m11092E(i11);
        return m88915d2(JsonToken.VALUE_NUMBER_INT);
    }

    /* JADX INFO: renamed from: G2 */
    public JsonToken m88844G2() throws IOException {
        int i11;
        do {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89592c0 = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i12 + 1;
            i11 = bArr[i12] & 255;
            if (i11 < 48) {
                if (i11 == 46) {
                    char[] cArrM11107m = this.f82946C.m11107m();
                    cArrM11107m[0] = '-';
                    cArrM11107m[1] = '0';
                    this.f82958O = 1;
                    return m88863Z2(cArrM11107m, 2, i11);
                }
            } else if (i11 > 57) {
                if (i11 == 101 || i11 == 69) {
                    char[] cArrM11107m2 = this.f82946C.m11107m();
                    cArrM11107m2[0] = '-';
                    cArrM11107m2[1] = '0';
                    this.f82958O = 1;
                    return m88863Z2(cArrM11107m2, 2, i11);
                }
                if (i11 != 93 && i11 != 125) {
                    m84112d1(i11, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.f10027b & f89571m0) == 0) {
                m84105W0("Leading zeroes not allowed");
            }
            this.f82963s--;
            return m88916e2(0, "0");
        } while (i11 == 48);
        char[] cArrM11107m3 = this.f82946C.m11107m();
        cArrM11107m3[0] = '-';
        cArrM11107m3[1] = (char) i11;
        this.f82958O = 1;
        return m88843F2(cArrM11107m3, 2);
    }

    /* JADX INFO: renamed from: H2 */
    public JsonToken m88845H2() throws IOException {
        int i11;
        do {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89592c0 = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i12 + 1;
            i11 = bArr[i12] & 255;
            if (i11 < 48) {
                if (i11 == 46) {
                    char[] cArrM11107m = this.f82946C.m11107m();
                    cArrM11107m[0] = '0';
                    this.f82958O = 1;
                    return m88863Z2(cArrM11107m, 1, i11);
                }
            } else if (i11 > 57) {
                if (i11 == 101 || i11 == 69) {
                    char[] cArrM11107m2 = this.f82946C.m11107m();
                    cArrM11107m2[0] = '0';
                    this.f82958O = 1;
                    return m88863Z2(cArrM11107m2, 1, i11);
                }
                if (i11 != 93 && i11 != 125) {
                    m84112d1(i11, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.f10027b & f89571m0) == 0) {
                m84105W0("Leading zeroes not allowed");
            }
            this.f82963s--;
            return m88916e2(0, "0");
        } while (i11 == 48);
        char[] cArrM11107m3 = this.f82946C.m11107m();
        cArrM11107m3[0] = (char) i11;
        this.f82958O = 1;
        return m88843F2(cArrM11107m3, 1);
    }

    /* JADX INFO: renamed from: J2 */
    public final JsonToken m88847J2() throws IOException {
        int[] iArr = f89577s0;
        byte[] bArr = this.f89579k0;
        char[] cArrM11111r = this.f82946C.m11111r();
        int iM11113t = this.f82946C.m11113t();
        int i11 = this.f82963s;
        int i12 = this.f82964t - 5;
        while (i11 < this.f82964t) {
            int i13 = 0;
            if (iM11113t >= cArrM11111r.length) {
                cArrM11111r = this.f82946C.m11110p();
                iM11113t = 0;
            }
            int iMin = Math.min(this.f82964t, (cArrM11111r.length - iM11113t) + i11);
            while (i11 < iMin) {
                int i14 = i11 + 1;
                int iM88872h2 = bArr[i11] & 255;
                int i15 = iArr[iM88872h2];
                if (i15 != 0) {
                    if (iM88872h2 != 34) {
                        if (i14 < i12) {
                            if (i15 == 1) {
                                this.f82963s = i14;
                                iM88872h2 = m88872h2();
                                i11 = this.f82963s;
                            } else if (i15 == 2) {
                                i11 += 2;
                                iM88872h2 = m88882m2(iM88872h2, this.f89579k0[i14]);
                            } else if (i15 == 3) {
                                byte[] bArr2 = this.f89579k0;
                                int i16 = i11 + 2;
                                i11 += 3;
                                iM88872h2 = m88884n2(iM88872h2, bArr2[i14], bArr2[i16]);
                            } else if (i15 != 4) {
                                if (iM88872h2 < 32) {
                                    m84082v1(iM88872h2, "string value");
                                } else {
                                    m88908W1(iM88872h2);
                                }
                                i11 = i14;
                            } else {
                                byte[] bArr3 = this.f89579k0;
                                byte b11 = bArr3[i14];
                                int i17 = i11 + 3;
                                byte b12 = bArr3[i11 + 2];
                                i11 += 4;
                                int iM88885o2 = m88885o2(iM88872h2, b11, b12, bArr3[i17]);
                                int i18 = iM11113t + 1;
                                cArrM11111r[iM11113t] = (char) ((iM88885o2 >> 10) | 55296);
                                if (i18 >= cArrM11111r.length) {
                                    cArrM11111r = this.f82946C.m11110p();
                                    iM11113t = 0;
                                } else {
                                    iM11113t = i18;
                                }
                                iM88872h2 = (iM88885o2 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                            }
                            if (iM11113t >= cArrM11111r.length) {
                                cArrM11111r = this.f82946C.m11110p();
                            } else {
                                i13 = iM11113t;
                            }
                            iM11113t = i13 + 1;
                            cArrM11111r[i13] = (char) iM88872h2;
                            break;
                        }
                        this.f82963s = i14;
                        this.f82946C.m11092E(iM11113t);
                        if (m88876j2(iM88872h2, iArr[iM88872h2], i14 < this.f82964t)) {
                            cArrM11111r = this.f82946C.m11111r();
                            iM11113t = this.f82946C.m11113t();
                            i11 = this.f82963s;
                            break;
                        }
                        this.f89593d0 = 40;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this.f82981e = jsonToken;
                        return jsonToken;
                    }
                    this.f82963s = i14;
                    this.f82946C.m11092E(iM11113t);
                    return m88915d2(JsonToken.VALUE_STRING);
                }
                cArrM11111r[iM11113t] = (char) iM88872h2;
                iM11113t++;
                i11 = i14;
            }
        }
        this.f82963s = i11;
        this.f89592c0 = 40;
        this.f82946C.m11092E(iM11113t);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.f82981e = jsonToken2;
        return jsonToken2;
    }

    /* JADX INFO: renamed from: K2 */
    public final JsonToken m88848K2() throws IOException {
        int i11 = this.f89592c0;
        if (i11 == 1) {
            return m88889s2(this.f89586W);
        }
        if (i11 == 4) {
            byte[] bArr = this.f89579k0;
            int i12 = this.f82963s;
            this.f82963s = i12 + 1;
            return m88861X2(bArr[i12] & 255);
        }
        if (i11 == 5) {
            byte[] bArr2 = this.f89579k0;
            int i13 = this.f82963s;
            this.f82963s = i13 + 1;
            return m88862Y2(bArr2[i13] & 255);
        }
        switch (i11) {
            case 7:
                return m88852O2(this.f89584U, this.f89586W, this.f89587X);
            case 8:
                return m88894x2();
            case 9:
                return m88887q2(this.f89584U, this.f89586W, this.f89587X);
            case 10:
                return m88850M2(this.f89584U, this.f89586W, this.f89587X);
            default:
                switch (i11) {
                    case 12:
                        byte[] bArr3 = this.f89579k0;
                        int i14 = this.f82963s;
                        this.f82963s = i14 + 1;
                        return m88877j3(bArr3[i14] & 255);
                    case 13:
                        byte[] bArr4 = this.f89579k0;
                        int i15 = this.f82963s;
                        this.f82963s = i15 + 1;
                        return m88883m3(bArr4[i15] & 255);
                    case 14:
                        byte[] bArr5 = this.f89579k0;
                        int i16 = this.f82963s;
                        this.f82963s = i16 + 1;
                        return m88881l3(bArr5[i16] & 255);
                    case 15:
                        byte[] bArr6 = this.f89579k0;
                        int i17 = this.f82963s;
                        this.f82963s = i17 + 1;
                        return m88879k3(bArr6[i17] & 255);
                    case 16:
                        return m88839B2("null", this.f89586W, JsonToken.VALUE_NULL);
                    case 17:
                        return m88839B2(CredentialEntry.TRUE_STRING, this.f89586W, JsonToken.VALUE_TRUE);
                    case 18:
                        return m88839B2(CredentialEntry.FALSE_STRING, this.f89586W, JsonToken.VALUE_FALSE);
                    case 19:
                        return m88841D2(this.f89595f0, this.f89586W);
                    default:
                        switch (i11) {
                            case 23:
                                byte[] bArr7 = this.f89579k0;
                                int i18 = this.f82963s;
                                this.f82963s = i18 + 1;
                                return m88846I2(bArr7[i18] & 255);
                            case 24:
                                return m88845H2();
                            case 25:
                                return m88844G2();
                            case 26:
                                return m88843F2(this.f82946C.m11111r(), this.f82946C.m11113t());
                            default:
                                switch (i11) {
                                    case 30:
                                        return m88896z2();
                                    case 31:
                                        byte[] bArr8 = this.f89579k0;
                                        int i19 = this.f82963s;
                                        this.f82963s = i19 + 1;
                                        return m88895y2(true, bArr8[i19] & 255);
                                    case 32:
                                        byte[] bArr9 = this.f89579k0;
                                        int i21 = this.f82963s;
                                        this.f82963s = i21 + 1;
                                        return m88895y2(false, bArr9[i21] & 255);
                                    default:
                                        switch (i11) {
                                            case 40:
                                                return m88847J2();
                                            case 41:
                                                int iM88874i2 = m88874i2(this.f89588Y, this.f89589Z);
                                                if (iM88874i2 < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this.f82946C.m11095a((char) iM88874i2);
                                                return this.f89593d0 == 45 ? m88888r2() : m88847J2();
                                            case 42:
                                                C6330i c6330i = this.f82946C;
                                                int i22 = this.f89586W;
                                                byte[] bArr10 = this.f89579k0;
                                                int i23 = this.f82963s;
                                                this.f82963s = i23 + 1;
                                                c6330i.m11095a((char) m88882m2(i22, bArr10[i23]));
                                                return this.f89593d0 == 45 ? m88888r2() : m88847J2();
                                            case 43:
                                                int i24 = this.f89586W;
                                                int i25 = this.f89587X;
                                                byte[] bArr11 = this.f89579k0;
                                                int i26 = this.f82963s;
                                                this.f82963s = i26 + 1;
                                                if (m88878k2(i24, i25, bArr11[i26])) {
                                                    return this.f89593d0 == 45 ? m88888r2() : m88847J2();
                                                }
                                                return JsonToken.NOT_AVAILABLE;
                                            case 44:
                                                int i27 = this.f89586W;
                                                int i28 = this.f89587X;
                                                byte[] bArr12 = this.f89579k0;
                                                int i29 = this.f82963s;
                                                this.f82963s = i29 + 1;
                                                if (m88880l2(i27, i28, bArr12[i29])) {
                                                    return this.f89593d0 == 45 ? m88888r2() : m88847J2();
                                                }
                                                return JsonToken.NOT_AVAILABLE;
                                            case 45:
                                                return m88888r2();
                                            default:
                                                switch (i11) {
                                                    case 50:
                                                        return m88892v2();
                                                    case 51:
                                                        return m88869f3(this.f89586W);
                                                    case 52:
                                                        return m88890t2(this.f89586W, true);
                                                    case 53:
                                                        return m88890t2(this.f89586W, false);
                                                    case 54:
                                                        return m88891u2(this.f89586W);
                                                    case 55:
                                                        return m88838A2(this.f89586W);
                                                    default:
                                                        C6332k.m11125c();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: L2 */
    public final JsonToken m88849L2() throws IOException {
        JsonToken jsonToken = this.f82981e;
        int i11 = this.f89592c0;
        if (i11 == 3) {
            return m88901O1();
        }
        if (i11 == 12) {
            return m88901O1();
        }
        if (i11 == 50) {
            return m88893w2();
        }
        switch (i11) {
            case 16:
                return m88840C2("null", this.f89586W, JsonToken.VALUE_NULL);
            case 17:
                return m88840C2(CredentialEntry.TRUE_STRING, this.f89586W, JsonToken.VALUE_TRUE);
            case 18:
                return m88840C2(CredentialEntry.FALSE_STRING, this.f89586W, JsonToken.VALUE_FALSE);
            case 19:
                return m88842E2(this.f89595f0, this.f89586W);
            default:
                switch (i11) {
                    case 24:
                    case 25:
                        return m88916e2(0, "0");
                    case 26:
                        int iM11113t = this.f82946C.m11113t();
                        if (this.f82957N) {
                            iM11113t--;
                        }
                        this.f82958O = iM11113t;
                        return m88915d2(JsonToken.VALUE_NUMBER_INT);
                    default:
                        switch (i11) {
                            case 30:
                                this.f82960Q = 0;
                                return m88915d2(JsonToken.VALUE_NUMBER_FLOAT);
                            case 31:
                                m84098P0(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                m84098P0(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                return m88901O1();
                            case 32:
                                return m88915d2(JsonToken.VALUE_NUMBER_FLOAT);
                            default:
                                switch (i11) {
                                    case 52:
                                    case 53:
                                        m84098P0(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                        break;
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        m84098P0(": was expecting rest of token (internal state: " + this.f89592c0 + ")", this.f82981e);
                                        return jsonToken;
                                }
                                return m88901O1();
                        }
                }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final JsonToken m88850M2(int i11, int i12, int i13) throws IOException {
        int[] iArrM84054E1 = this.f89583T;
        int[] iArrM10971k = C6308b.m10971k();
        while (true) {
            int i14 = this.f82963s;
            if (i14 >= this.f82964t) {
                this.f89584U = i11;
                this.f89586W = i12;
                this.f89587X = i13;
                this.f89592c0 = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            int i15 = this.f89579k0[i14] & 255;
            if (iArrM10971k[i15] != 0) {
                if (i13 > 0) {
                    if (i11 >= iArrM84054E1.length) {
                        iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                        this.f89583T = iArrM84054E1;
                    }
                    iArrM84054E1[i11] = i12;
                    i11++;
                }
                String strM89686z = this.f89582S.m89686z(iArrM84054E1, i11);
                if (strM89686z == null) {
                    strM89686z = m88898L1(iArrM84054E1, i11, i13);
                }
                return m88902P1(strM89686z);
            }
            this.f82963s = i14 + 1;
            if (i13 < 4) {
                i13++;
                i12 = (i12 << 8) | i15;
            } else {
                if (i11 >= iArrM84054E1.length) {
                    iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                    this.f89583T = iArrM84054E1;
                }
                iArrM84054E1[i11] = i12;
                i13 = 1;
                i11++;
                i12 = i15;
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final JsonToken m88851N2(int i11) throws IOException {
        if (i11 != 35) {
            if (i11 != 39) {
                if (i11 == 47) {
                    return m88869f3(4);
                }
                if (i11 == 93) {
                    return m88899M1();
                }
            } else if ((this.f10027b & f89573o0) != 0) {
                return m88887q2(0, 0, 0);
            }
        } else if ((this.f10027b & f89576r0) != 0) {
            return m88838A2(4);
        }
        if ((this.f10027b & f89574p0) == 0) {
            m84101S0((char) i11, "was expecting double-quote to start field name");
        }
        if (C6308b.m10971k()[i11] != 0) {
            m84101S0(i11, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return m88850M2(0, i11, 1);
    }

    /* JADX INFO: renamed from: O2 */
    public final JsonToken m88852O2(int i11, int i12, int i13) throws IOException {
        int i14;
        int[] iArrM84054E1 = this.f89583T;
        int[] iArr = f89578t0;
        while (true) {
            int i15 = this.f82963s;
            if (i15 >= this.f82964t) {
                this.f89584U = i11;
                this.f89586W = i12;
                this.f89587X = i13;
                this.f89592c0 = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i15 + 1;
            int iM88870g2 = bArr[i15] & 255;
            if (iArr[iM88870g2] == 0) {
                if (i13 < 4) {
                    i13++;
                    i12 = (i12 << 8) | iM88870g2;
                } else {
                    if (i11 >= iArrM84054E1.length) {
                        int[] iArrM84054E2 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                        this.f89583T = iArrM84054E2;
                        iArrM84054E1 = iArrM84054E2;
                    }
                    i14 = i11 + 1;
                    iArrM84054E1[i11] = i12;
                    i11 = i14;
                    i12 = iM88870g2;
                    i13 = 1;
                }
            } else {
                if (iM88870g2 == 34) {
                    if (i13 > 0) {
                        if (i11 >= iArrM84054E1.length) {
                            iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                            this.f89583T = iArrM84054E1;
                        }
                        iArrM84054E1[i11] = AbstractC40338b.m88897V1(i12, i13);
                        i11++;
                    } else if (i11 == 0) {
                        return m88902P1("");
                    }
                    String strM89686z = this.f89582S.m89686z(iArrM84054E1, i11);
                    if (strM89686z == null) {
                        strM89686z = m88898L1(iArrM84054E1, i11, i13);
                    }
                    return m88902P1(strM89686z);
                }
                if (iM88870g2 != 92) {
                    m84082v1(iM88870g2, "name");
                } else {
                    iM88870g2 = m88870g2();
                    if (iM88870g2 < 0) {
                        this.f89592c0 = 8;
                        this.f89593d0 = 7;
                        this.f89584U = i11;
                        this.f89586W = i12;
                        this.f89587X = i13;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.f82981e = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i11 >= iArrM84054E1.length) {
                    iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                    this.f89583T = iArrM84054E1;
                }
                if (iM88870g2 > 127) {
                    int i16 = 0;
                    if (i13 >= 4) {
                        iArrM84054E1[i11] = i12;
                        i11++;
                        i12 = 0;
                        i13 = 0;
                    }
                    if (iM88870g2 < 2048) {
                        i12 = (i12 << 8) | (iM88870g2 >> 6) | 192;
                        i13++;
                    } else {
                        int i17 = (i12 << 8) | (iM88870g2 >> 12) | 224;
                        int i18 = i13 + 1;
                        if (i18 >= 4) {
                            iArrM84054E1[i11] = i17;
                            i11++;
                            i18 = 0;
                        } else {
                            i16 = i17;
                        }
                        i12 = (i16 << 8) | ((iM88870g2 >> 6) & 63) | 128;
                        i13 = i18 + 1;
                    }
                    iM88870g2 = (iM88870g2 & 63) | 128;
                }
                if (i13 < 4) {
                    i13++;
                    i12 = (i12 << 8) | iM88870g2;
                } else {
                    i14 = i11 + 1;
                    iArrM84054E1[i11] = i12;
                    i11 = i14;
                    i12 = iM88870g2;
                    i13 = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final String m88853P2(int i11, int i12) throws IOException {
        byte[] bArr = this.f89579k0;
        int[] iArr = f89578t0;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            if (i14 != 34) {
                return null;
            }
            this.f82963s = i13;
            return m88904R1(this.f89585V, i12, 1);
        }
        int i15 = (i12 << 8) | i14;
        int i16 = i11 + 2;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            if (i17 != 34) {
                return null;
            }
            this.f82963s = i16;
            return m88904R1(this.f89585V, i15, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i11 + 3;
        int i21 = bArr[i16] & 255;
        if (iArr[i21] != 0) {
            if (i21 != 34) {
                return null;
            }
            this.f82963s = i19;
            return m88904R1(this.f89585V, i18, 3);
        }
        int i22 = (i18 << 8) | i21;
        int i23 = i11 + 4;
        int i24 = bArr[i19] & 255;
        if (iArr[i24] == 0) {
            return m88854Q2(i23, i24, i22);
        }
        if (i24 != 34) {
            return null;
        }
        this.f82963s = i23;
        return m88904R1(this.f89585V, i22, 4);
    }

    /* JADX INFO: renamed from: Q2 */
    public final String m88854Q2(int i11, int i12, int i13) throws IOException {
        byte[] bArr = this.f89579k0;
        int[] iArr = f89578t0;
        int i14 = i11 + 1;
        int i15 = bArr[i11] & 255;
        if (iArr[i15] != 0) {
            if (i15 != 34) {
                return null;
            }
            this.f82963s = i14;
            return m88905S1(this.f89585V, i13, i12, 1);
        }
        int i16 = (i12 << 8) | i15;
        int i17 = i11 + 2;
        int i18 = bArr[i14] & 255;
        if (iArr[i18] != 0) {
            if (i18 != 34) {
                return null;
            }
            this.f82963s = i17;
            return m88905S1(this.f89585V, i13, i16, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i21 = i11 + 3;
        int i22 = bArr[i17] & 255;
        if (iArr[i22] != 0) {
            if (i22 != 34) {
                return null;
            }
            this.f82963s = i21;
            return m88905S1(this.f89585V, i13, i19, 3);
        }
        int i23 = (i19 << 8) | i22;
        int i24 = i11 + 4;
        if ((bArr[i21] & 255) != 34) {
            return null;
        }
        this.f82963s = i24;
        return m88905S1(this.f89585V, i13, i23, 4);
    }

    /* JADX INFO: renamed from: R2 */
    public JsonToken m88855R2(String str) throws IOException {
        m84095M0("Unrecognized token '%s': was expecting %s", this.f82946C.m11106l(), m84083w1());
        return JsonToken.NOT_AVAILABLE;
    }

    /* JADX INFO: renamed from: S2 */
    public final int m88856S2(int i11) throws IOException {
        do {
            if (i11 != 32) {
                if (i11 == 10) {
                    this.f82966v++;
                    this.f82967w = this.f82963s;
                } else if (i11 == 13) {
                    this.f89597h0++;
                    this.f82967w = this.f82963s;
                } else if (i11 != 9) {
                    m84103U0(i11);
                }
            }
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f82981e = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i12 + 1;
            i11 = bArr[i12] & 255;
        } while (i11 <= 32);
        return i11;
    }

    /* JADX INFO: renamed from: T2 */
    public final JsonToken m88857T2(int i11) throws IOException {
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89592c0 = i11;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f89579k0;
        this.f82963s = i12 + 1;
        int i13 = bArr[i12] & 255;
        if (i11 == 4) {
            return m88861X2(i13);
        }
        if (i11 == 5) {
            return m88862Y2(i13);
        }
        switch (i11) {
            case 12:
                return m88877j3(i13);
            case 13:
                return m88883m3(i13);
            case 14:
                return m88881l3(i13);
            case 15:
                return m88879k3(i13);
            default:
                C6332k.m11125c();
                return null;
        }
    }

    /* JADX INFO: renamed from: U2 */
    public JsonToken m88858U2() throws IOException {
        int i11 = this.f82963s;
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f89577s0;
        int iMin = Math.min(this.f82964t, cArrM11107m.length + i11);
        byte[] bArr = this.f89579k0;
        int i12 = 0;
        while (i11 < iMin) {
            int i13 = bArr[i11] & 255;
            if (i13 == 39) {
                this.f82963s = i11 + 1;
                this.f82946C.m11092E(i12);
                return m88915d2(JsonToken.VALUE_STRING);
            }
            if (iArr[i13] != 0) {
                break;
            }
            i11++;
            cArrM11107m[i12] = (char) i13;
            i12++;
        }
        this.f82946C.m11092E(i12);
        this.f82963s = i11;
        return m88888r2();
    }

    /* JADX INFO: renamed from: V2 */
    public final JsonToken m88859V2(int i11) throws IOException {
        int i12 = i11 & 255;
        if (i12 == 239 && this.f89592c0 != 1) {
            return m88889s2(1);
        }
        while (i12 <= 32) {
            if (i12 != 32) {
                if (i12 == 10) {
                    this.f82966v++;
                    this.f82967w = this.f82963s;
                } else if (i12 == 13) {
                    this.f89597h0++;
                    this.f82967w = this.f82963s;
                } else if (i12 != 9) {
                    m84103U0(i12);
                }
            }
            int i13 = this.f82963s;
            if (i13 >= this.f82964t) {
                this.f89592c0 = 3;
                if (this.f82962r) {
                    return null;
                }
                return this.f89594e0 ? m88901O1() : JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i13 + 1;
            i12 = bArr[i13] & 255;
        }
        return m88877j3(i12);
    }

    /* JADX INFO: renamed from: W2 */
    public JsonToken m88860W2() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 4 < this.f82964t) {
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            if (bArr[i12] == 97) {
                int i14 = i12 + 2;
                if (bArr[i13] == 108) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 115) {
                        int i16 = i12 + 4;
                        if (bArr[i15] == 101 && ((i11 = bArr[i16] & 255) < 48 || i11 == 93 || i11 == 125)) {
                            this.f82963s = i16;
                            return m88915d2(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this.f89592c0 = 18;
        return m88839B2(CredentialEntry.FALSE_STRING, 1, JsonToken.VALUE_FALSE);
    }

    /* JADX INFO: renamed from: X2 */
    public final JsonToken m88861X2(int i11) throws IOException {
        String strM88886p2;
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 4;
            return this.f82981e;
        }
        m88914c2();
        if (i11 != 34) {
            return i11 == 125 ? m88900N1() : m88851N2(i11);
        }
        return (this.f82963s + 13 > this.f82964t || (strM88886p2 = m88886p2()) == null) ? m88852O2(0, 0, 0) : m88902P1(strM88886p2);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ee -> B:40:0x009a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: Z2 */
    public JsonToken m88863Z2(char[] cArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        byte b11;
        int i16 = 0;
        if (i12 == 46) {
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11109o();
            }
            cArr[i11] = '.';
            i11++;
            i14 = 0;
            while (true) {
                int i17 = this.f82963s;
                if (i17 >= this.f82964t) {
                    this.f82946C.m11092E(i11);
                    this.f89592c0 = 30;
                    this.f82959P = i14;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this.f82981e = jsonToken;
                    return jsonToken;
                }
                byte[] bArr = this.f89579k0;
                this.f82963s = i17 + 1;
                b11 = bArr[i17];
                if (b11 < 48 || b11 > 57) {
                    break;
                }
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11109o();
                }
                cArr[i11] = (char) b11;
                i14++;
                i11++;
            }
            i13 = b11 & 255;
            if (i14 == 0) {
                m84112d1(i13, "Decimal point not followed by a digit");
            }
        } else {
            i13 = i12;
            i14 = 0;
        }
        this.f82959P = i14;
        if (i13 == 101 || i13 == 69) {
            if (i11 >= cArr.length) {
                cArr = this.f82946C.m11109o();
            }
            int i18 = i11 + 1;
            cArr[i11] = (char) i13;
            int i19 = this.f82963s;
            if (i19 >= this.f82964t) {
                this.f82946C.m11092E(i18);
                this.f89592c0 = 31;
                this.f82960Q = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken2;
                return jsonToken2;
            }
            byte[] bArr2 = this.f89579k0;
            this.f82963s = i19 + 1;
            byte b12 = bArr2[i19];
            if (b12 == 45 || b12 == 43) {
                if (i18 >= cArr.length) {
                    cArr = this.f82946C.m11109o();
                }
                i11 += 2;
                cArr[i18] = (char) b12;
                int i21 = this.f82963s;
                if (i21 >= this.f82964t) {
                    this.f82946C.m11092E(i11);
                    this.f89592c0 = 32;
                    this.f82960Q = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.f82981e = jsonToken3;
                    return jsonToken3;
                }
                byte[] bArr3 = this.f89579k0;
                this.f82963s = i21 + 1;
                b12 = bArr3[i21];
            } else {
                i11 = i18;
            }
            if (b12 >= 48 || b12 > 57) {
                i15 = b12 & 255;
                if (i16 == 0) {
                    m84112d1(i15, "Exponent indicator not followed by a digit");
                }
            } else {
                i16++;
                if (i11 >= cArr.length) {
                    cArr = this.f82946C.m11109o();
                }
                i18 = i11 + 1;
                cArr[i11] = (char) b12;
                int i22 = this.f82963s;
                if (i22 >= this.f82964t) {
                    this.f82946C.m11092E(i18);
                    this.f89592c0 = 32;
                    this.f82960Q = i16;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this.f82981e = jsonToken4;
                    return jsonToken4;
                }
                byte[] bArr4 = this.f89579k0;
                this.f82963s = i22 + 1;
                b12 = bArr4[i22];
                i11 = i18;
                if (b12 >= 48) {
                }
                i15 = b12 & 255;
                if (i16 == 0) {
                    m84112d1(i15, "Exponent indicator not followed by a digit");
                }
            }
        }
        this.f82963s--;
        this.f82946C.m11092E(i11);
        this.f82960Q = i16;
        return m88915d2(JsonToken.VALUE_NUMBER_FLOAT);
    }

    /* JADX INFO: renamed from: c3 */
    public JsonToken m88866c3() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            if (bArr[i12] == 117) {
                int i14 = i12 + 2;
                if (bArr[i13] == 108) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 108 && ((i11 = bArr[i15] & 255) < 48 || i11 == 93 || i11 == 125)) {
                        this.f82963s = i15;
                        return m88915d2(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this.f89592c0 = 16;
        return m88839B2("null", 1, JsonToken.VALUE_NULL);
    }

    /* JADX INFO: renamed from: d3 */
    public JsonToken m88867d3() throws IOException {
        int i11 = this.f82963s;
        if (i11 >= this.f82964t) {
            this.f89592c0 = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        int i12 = i11 + 1;
        int i13 = this.f89579k0[i11] & 255;
        if (i13 < 48) {
            if (i13 == 46) {
                this.f82963s = i12;
                this.f82958O = 1;
                char[] cArrM11107m = this.f82946C.m11107m();
                cArrM11107m[0] = '0';
                return m88863Z2(cArrM11107m, 1, i13);
            }
        } else {
            if (i13 <= 57) {
                return m88845H2();
            }
            if (i13 == 101 || i13 == 69) {
                this.f82963s = i12;
                this.f82958O = 1;
                char[] cArrM11107m2 = this.f82946C.m11107m();
                cArrM11107m2[0] = '0';
                return m88863Z2(cArrM11107m2, 1, i13);
            }
            if (i13 != 93 && i13 != 125) {
                m84112d1(i13, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return m88916e2(0, "0");
    }

    /* JADX INFO: renamed from: f3 */
    public final JsonToken m88869f3(int i11) throws IOException {
        if ((this.f10027b & f89575q0) == 0) {
            m84101S0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89586W = i11;
            this.f89592c0 = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f89579k0;
        this.f82963s = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 == 42) {
            return m88890t2(i11, false);
        }
        if (b11 == 47) {
            return m88891u2(i11);
        }
        m84101S0(b11 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    /* JADX INFO: renamed from: g2 */
    public final int m88870g2() throws IOException {
        return this.f82964t - this.f82963s < 5 ? m88874i2(0, -1) : m88872h2();
    }

    /* JADX INFO: renamed from: g3 */
    public JsonToken m88871g3() throws IOException {
        int i11 = this.f82963s;
        char[] cArrM11107m = this.f82946C.m11107m();
        int[] iArr = f89577s0;
        int iMin = Math.min(this.f82964t, cArrM11107m.length + i11);
        byte[] bArr = this.f89579k0;
        int i12 = 0;
        while (i11 < iMin) {
            int i13 = bArr[i11] & 255;
            if (iArr[i13] != 0) {
                if (i13 != 34) {
                    break;
                }
                this.f82963s = i11 + 1;
                this.f82946C.m11092E(i12);
                return m88915d2(JsonToken.VALUE_STRING);
            }
            i11++;
            cArrM11107m[i12] = (char) i13;
            i12++;
        }
        this.f82946C.m11092E(i12);
        this.f82963s = i11;
        return m88847J2();
    }

    /* JADX INFO: renamed from: h2 */
    public final int m88872h2() throws IOException {
        byte[] bArr = this.f89579k0;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        this.f82963s = i12;
        byte b11 = bArr[i11];
        if (b11 == 34 || b11 == 47 || b11 == 92) {
            return (char) b11;
        }
        if (b11 == 98) {
            return 8;
        }
        if (b11 == 102) {
            return 12;
        }
        if (b11 == 110) {
            return 10;
        }
        if (b11 == 114) {
            return 13;
        }
        if (b11 == 116) {
            return 9;
        }
        if (b11 != 117) {
            return m84074n1((char) b11);
        }
        this.f82963s = i11 + 2;
        byte b12 = bArr[i12];
        int iM10962b = C6308b.m10962b(b12);
        if (iM10962b >= 0) {
            byte[] bArr2 = this.f89579k0;
            int i13 = this.f82963s;
            this.f82963s = i13 + 1;
            b12 = bArr2[i13];
            int iM10962b2 = C6308b.m10962b(b12);
            if (iM10962b2 >= 0) {
                int i14 = (iM10962b << 4) | iM10962b2;
                byte[] bArr3 = this.f89579k0;
                int i15 = this.f82963s;
                this.f82963s = i15 + 1;
                byte b13 = bArr3[i15];
                int iM10962b3 = C6308b.m10962b(b13);
                if (iM10962b3 >= 0) {
                    int i16 = (i14 << 4) | iM10962b3;
                    byte[] bArr4 = this.f89579k0;
                    int i17 = this.f82963s;
                    this.f82963s = i17 + 1;
                    b13 = bArr4[i17];
                    int iM10962b4 = C6308b.m10962b(b13);
                    if (iM10962b4 >= 0) {
                        return (i16 << 4) | iM10962b4;
                    }
                }
                b12 = b13;
            }
        }
        m84101S0(b12 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    /* JADX INFO: renamed from: h3 */
    public JsonToken m88873h3() throws IOException {
        int i11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            if (bArr[i12] == 114) {
                int i14 = i12 + 2;
                if (bArr[i13] == 117) {
                    int i15 = i12 + 3;
                    if (bArr[i14] == 101 && ((i11 = bArr[i15] & 255) < 48 || i11 == 93 || i11 == 125)) {
                        this.f82963s = i15;
                        return m88915d2(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this.f89592c0 = 17;
        return m88839B2(CredentialEntry.TRUE_STRING, 1, JsonToken.VALUE_TRUE);
    }

    /* JADX INFO: renamed from: i2 */
    public final int m88874i2(int i11, int i12) throws IOException {
        int i13 = this.f82963s;
        int i14 = this.f82964t;
        if (i13 >= i14) {
            this.f89588Y = i11;
            this.f89589Z = i12;
            return -1;
        }
        byte[] bArr = this.f89579k0;
        int i15 = i13 + 1;
        this.f82963s = i15;
        byte b11 = bArr[i13];
        if (i12 == -1) {
            if (b11 == 34 || b11 == 47 || b11 == 92) {
                return b11;
            }
            if (b11 == 98) {
                return 8;
            }
            if (b11 == 102) {
                return 12;
            }
            if (b11 == 110) {
                return 10;
            }
            if (b11 == 114) {
                return 13;
            }
            if (b11 == 116) {
                return 9;
            }
            if (b11 != 117) {
                return m84074n1((char) b11);
            }
            i12 = 0;
            if (i15 >= i14) {
                this.f89589Z = 0;
                this.f89588Y = 0;
                return -1;
            }
            this.f82963s = i13 + 2;
            b11 = bArr[i15];
        }
        int i16 = b11 & 255;
        while (true) {
            int iM10962b = C6308b.m10962b(i16);
            if (iM10962b < 0) {
                m84101S0(i16 & 255, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iM10962b;
            i12++;
            if (i12 == 4) {
                return i11;
            }
            int i17 = this.f82963s;
            if (i17 >= this.f82964t) {
                this.f89589Z = i12;
                this.f89588Y = i11;
                return -1;
            }
            byte[] bArr2 = this.f89579k0;
            this.f82963s = i17 + 1;
            i16 = bArr2[i17] & 255;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d  */
    /* JADX INFO: renamed from: i3 */
    public JsonToken m88875i3(boolean z11, int i11) throws IOException {
        if (i11 != 39) {
            if (i11 == 73) {
                return m88841D2(1, 1);
            }
            if (i11 == 78) {
                return m88841D2(0, 1);
            }
            if (i11 != 93) {
                if (i11 != 125) {
                    if (i11 == 43) {
                        return m88841D2(2, 1);
                    }
                    if (i11 == 44) {
                        if (!this.f82944A.m10939h() && (this.f10027b & f89572n0) != 0) {
                            this.f82963s--;
                            return m88915d2(JsonToken.VALUE_NULL);
                        }
                    }
                }
            } else if (this.f82944A.m10937f()) {
                if (!this.f82944A.m10939h()) {
                    this.f82963s--;
                    return m88915d2(JsonToken.VALUE_NULL);
                }
            }
        } else if ((this.f10027b & f89573o0) != 0) {
            return m88858U2();
        }
        m84101S0(i11, "expected a valid value " + m84084x1());
        return null;
    }

    /* JADX INFO: renamed from: j3 */
    public final JsonToken m88877j3(int i11) throws IOException {
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 12;
            return this.f82981e;
        }
        m88914c2();
        this.f82944A.m86801p();
        if (i11 == 34) {
            return m88871g3();
        }
        if (i11 == 35) {
            return m88838A2(12);
        }
        if (i11 == 91) {
            return m88912a2();
        }
        if (i11 == 93) {
            return m88899M1();
        }
        if (i11 == 102) {
            return m88860W2();
        }
        if (i11 == 110) {
            return m88866c3();
        }
        if (i11 == 116) {
            return m88873h3();
        }
        if (i11 == 123) {
            return m88913b2();
        }
        if (i11 == 125) {
            return m88900N1();
        }
        switch (i11) {
            case 45:
                return m88865b3();
            case 46:
                if (m10894m0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    return m88864a3();
                }
                break;
            case 47:
                return m88869f3(12);
            case 48:
                return m88867d3();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return m88868e3(i11);
        }
        return m88875i3(false, i11);
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m88878k2(int i11, int i12, int i13) throws IOException {
        if (i12 == 1) {
            if ((i13 & 192) != 128) {
                m88911Z1(i13 & 255, this.f82963s);
            }
            i11 = (i11 << 6) | (i13 & 63);
            int i14 = this.f82963s;
            if (i14 >= this.f82964t) {
                this.f89592c0 = 43;
                this.f89586W = i11;
                this.f89587X = 2;
                return false;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i14 + 1;
            i13 = bArr[i14];
        }
        if ((i13 & 192) != 128) {
            m88911Z1(i13 & 255, this.f82963s);
        }
        this.f82946C.m11095a((char) ((i11 << 6) | (i13 & 63)));
        return true;
    }

    /* JADX INFO: renamed from: k3 */
    public final JsonToken m88879k3(int i11) throws IOException {
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 15;
            return this.f82981e;
        }
        m88914c2();
        if (i11 == 34) {
            return m88871g3();
        }
        if (i11 == 35) {
            return m88838A2(15);
        }
        if (i11 == 45) {
            return m88865b3();
        }
        if (i11 == 91) {
            return m88912a2();
        }
        if (i11 != 93) {
            if (i11 == 102) {
                return m88860W2();
            }
            if (i11 == 110) {
                return m88866c3();
            }
            if (i11 == 116) {
                return m88873h3();
            }
            if (i11 == 123) {
                return m88913b2();
            }
            if (i11 != 125) {
                switch (i11) {
                    case 47:
                        return m88869f3(15);
                    case 48:
                        return m88867d3();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return m88868e3(i11);
                }
            }
            if ((this.f10027b & f89570l0) != 0) {
                return m88900N1();
            }
        } else if ((this.f10027b & f89570l0) != 0) {
            return m88899M1();
        }
        return m88875i3(true, i11);
    }

    /* JADX INFO: renamed from: l3 */
    public final JsonToken m88881l3(int i11) throws IOException {
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 14;
            return this.f82981e;
        }
        if (i11 != 58) {
            if (i11 == 47) {
                return m88869f3(14);
            }
            if (i11 == 35) {
                return m88838A2(14);
            }
            m84101S0(i11, "was expecting a colon to separate field name and value");
        }
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89592c0 = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        int iM88856S2 = this.f89579k0[i12];
        this.f82963s = i12 + 1;
        if (iM88856S2 <= 32 && (iM88856S2 = m88856S2(iM88856S2)) <= 0) {
            this.f89592c0 = 12;
            return this.f82981e;
        }
        m88914c2();
        if (iM88856S2 == 34) {
            return m88871g3();
        }
        if (iM88856S2 == 35) {
            return m88838A2(12);
        }
        if (iM88856S2 == 45) {
            return m88865b3();
        }
        if (iM88856S2 == 91) {
            return m88912a2();
        }
        if (iM88856S2 == 102) {
            return m88860W2();
        }
        if (iM88856S2 == 110) {
            return m88866c3();
        }
        if (iM88856S2 == 116) {
            return m88873h3();
        }
        if (iM88856S2 == 123) {
            return m88913b2();
        }
        switch (iM88856S2) {
            case 47:
                return m88869f3(12);
            case 48:
                return m88867d3();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return m88868e3(iM88856S2);
            default:
                return m88875i3(false, iM88856S2);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final int m88882m2(int i11, int i12) throws IOException {
        if ((i12 & 192) != 128) {
            m88911Z1(i12 & 255, this.f82963s);
        }
        return ((i11 & 31) << 6) | (i12 & 63);
    }

    /* JADX INFO: renamed from: m3 */
    public final JsonToken m88883m3(int i11) throws IOException {
        if (i11 <= 32 && (i11 = m88856S2(i11)) <= 0) {
            this.f89592c0 = 13;
            return this.f82981e;
        }
        if (i11 != 44) {
            if (i11 == 93) {
                return m88899M1();
            }
            if (i11 == 125) {
                return m88900N1();
            }
            if (i11 == 47) {
                return m88869f3(13);
            }
            if (i11 == 35) {
                return m88838A2(13);
            }
            m84101S0(i11, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
        }
        this.f82944A.m86801p();
        int i12 = this.f82963s;
        if (i12 >= this.f82964t) {
            this.f89592c0 = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        int iM88856S2 = this.f89579k0[i12];
        this.f82963s = i12 + 1;
        if (iM88856S2 <= 32 && (iM88856S2 = m88856S2(iM88856S2)) <= 0) {
            this.f89592c0 = 15;
            return this.f82981e;
        }
        m88914c2();
        if (iM88856S2 == 34) {
            return m88871g3();
        }
        if (iM88856S2 == 35) {
            return m88838A2(15);
        }
        if (iM88856S2 == 45) {
            return m88865b3();
        }
        if (iM88856S2 == 91) {
            return m88912a2();
        }
        if (iM88856S2 != 93) {
            if (iM88856S2 == 102) {
                return m88860W2();
            }
            if (iM88856S2 == 110) {
                return m88866c3();
            }
            if (iM88856S2 == 116) {
                return m88873h3();
            }
            if (iM88856S2 == 123) {
                return m88913b2();
            }
            if (iM88856S2 != 125) {
                switch (iM88856S2) {
                    case 47:
                        return m88869f3(15);
                    case 48:
                        return m88867d3();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return m88868e3(iM88856S2);
                }
            }
            if ((this.f10027b & f89570l0) != 0) {
                return m88900N1();
            }
        } else if ((this.f10027b & f89570l0) != 0) {
            return m88899M1();
        }
        return m88875i3(true, iM88856S2);
    }

    /* JADX INFO: renamed from: n2 */
    public final int m88884n2(int i11, int i12, int i13) throws IOException {
        int i14 = i11 & 15;
        if ((i12 & 192) != 128) {
            m88911Z1(i12 & 255, this.f82963s);
        }
        int i15 = (i14 << 6) | (i12 & 63);
        if ((i13 & 192) != 128) {
            m88911Z1(i13 & 255, this.f82963s);
        }
        return (i15 << 6) | (i13 & 63);
    }

    /* JADX INFO: renamed from: o2 */
    public final int m88885o2(int i11, int i12, int i13, int i14) throws IOException {
        if ((i12 & 192) != 128) {
            m88911Z1(i12 & 255, this.f82963s);
        }
        int i15 = ((i11 & 7) << 6) | (i12 & 63);
        if ((i13 & 192) != 128) {
            m88911Z1(i13 & 255, this.f82963s);
        }
        int i16 = (i15 << 6) | (i13 & 63);
        if ((i14 & 192) != 128) {
            m88911Z1(i14 & 255, this.f82963s);
        }
        return ((i16 << 6) | (i14 & 63)) - 65536;
    }

    /* JADX INFO: renamed from: p2 */
    public final String m88886p2() throws IOException {
        byte[] bArr = this.f89579k0;
        int[] iArr = f89578t0;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        int i13 = bArr[i11] & 255;
        if (iArr[i13] != 0) {
            if (i13 != 34) {
                return null;
            }
            this.f82963s = i12;
            return "";
        }
        int i14 = i11 + 2;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            if (i15 != 34) {
                return null;
            }
            this.f82963s = i14;
            return m88903Q1(i13, 1);
        }
        int i16 = i15 | (i13 << 8);
        int i17 = i11 + 3;
        int i18 = bArr[i14] & 255;
        if (iArr[i18] != 0) {
            if (i18 != 34) {
                return null;
            }
            this.f82963s = i17;
            return m88903Q1(i16, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i21 = i11 + 4;
        int i22 = bArr[i17] & 255;
        if (iArr[i22] != 0) {
            if (i22 != 34) {
                return null;
            }
            this.f82963s = i21;
            return m88903Q1(i19, 3);
        }
        int i23 = (i19 << 8) | i22;
        int i24 = i11 + 5;
        int i25 = bArr[i21] & 255;
        if (iArr[i25] == 0) {
            this.f89585V = i23;
            return m88853P2(i24, i25);
        }
        if (i25 != 34) {
            return null;
        }
        this.f82963s = i24;
        return m88903Q1(i23, 4);
    }

    /* JADX INFO: renamed from: q2 */
    public final JsonToken m88887q2(int i11, int i12, int i13) throws IOException {
        int[] iArrM84054E1 = this.f89583T;
        int[] iArr = f89578t0;
        while (true) {
            int i14 = this.f82963s;
            if (i14 >= this.f82964t) {
                this.f89584U = i11;
                this.f89586W = i12;
                this.f89587X = i13;
                this.f89592c0 = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i14 + 1;
            int iM88870g2 = bArr[i14] & 255;
            if (iM88870g2 == 39) {
                if (i13 > 0) {
                    if (i11 >= iArrM84054E1.length) {
                        iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                        this.f89583T = iArrM84054E1;
                    }
                    iArrM84054E1[i11] = AbstractC40338b.m88897V1(i12, i13);
                    i11++;
                } else if (i11 == 0) {
                    return m88902P1("");
                }
                String strM89686z = this.f89582S.m89686z(iArrM84054E1, i11);
                if (strM89686z == null) {
                    strM89686z = m88898L1(iArrM84054E1, i11, i13);
                }
                return m88902P1(strM89686z);
            }
            if (iM88870g2 != 34 && iArr[iM88870g2] != 0) {
                if (iM88870g2 != 92) {
                    m84082v1(iM88870g2, "name");
                } else {
                    iM88870g2 = m88870g2();
                    if (iM88870g2 < 0) {
                        this.f89592c0 = 8;
                        this.f89593d0 = 9;
                        this.f89584U = i11;
                        this.f89586W = i12;
                        this.f89587X = i13;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.f82981e = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (iM88870g2 > 127) {
                    int i15 = 0;
                    if (i13 >= 4) {
                        if (i11 >= iArrM84054E1.length) {
                            iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                            this.f89583T = iArrM84054E1;
                        }
                        iArrM84054E1[i11] = i12;
                        i11++;
                        i12 = 0;
                        i13 = 0;
                    }
                    if (iM88870g2 < 2048) {
                        i12 = (i12 << 8) | (iM88870g2 >> 6) | 192;
                        i13++;
                    } else {
                        int i16 = (i12 << 8) | (iM88870g2 >> 12) | 224;
                        int i17 = i13 + 1;
                        if (i17 >= 4) {
                            if (i11 >= iArrM84054E1.length) {
                                iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                                this.f89583T = iArrM84054E1;
                            }
                            iArrM84054E1[i11] = i16;
                            i11++;
                            i17 = 0;
                        } else {
                            i15 = i16;
                        }
                        i12 = (i15 << 8) | ((iM88870g2 >> 6) & 63) | 128;
                        i13 = i17 + 1;
                    }
                    iM88870g2 = (iM88870g2 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i12 = (i12 << 8) | iM88870g2;
            } else {
                if (i11 >= iArrM84054E1.length) {
                    iArrM84054E1 = AbstractC37385b.m84054E1(iArrM84054E1, iArrM84054E1.length);
                    this.f89583T = iArrM84054E1;
                }
                iArrM84054E1[i11] = i12;
                i11++;
                i12 = iM88870g2;
                i13 = 1;
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final JsonToken m88888r2() throws IOException {
        int[] iArr = f89577s0;
        byte[] bArr = this.f89579k0;
        char[] cArrM11111r = this.f82946C.m11111r();
        int iM11113t = this.f82946C.m11113t();
        int i11 = this.f82963s;
        int i12 = this.f82964t - 5;
        while (i11 < this.f82964t) {
            int i13 = 0;
            if (iM11113t >= cArrM11111r.length) {
                cArrM11111r = this.f82946C.m11110p();
                iM11113t = 0;
            }
            int iMin = Math.min(this.f82964t, (cArrM11111r.length - iM11113t) + i11);
            while (i11 < iMin) {
                int i14 = i11 + 1;
                int iM88872h2 = bArr[i11] & 255;
                int i15 = iArr[iM88872h2];
                if (i15 != 0 && iM88872h2 != 34) {
                    if (i14 < i12) {
                        if (i15 == 1) {
                            this.f82963s = i14;
                            iM88872h2 = m88872h2();
                            i11 = this.f82963s;
                        } else if (i15 == 2) {
                            i11 += 2;
                            iM88872h2 = m88882m2(iM88872h2, this.f89579k0[i14]);
                        } else if (i15 == 3) {
                            byte[] bArr2 = this.f89579k0;
                            int i16 = i11 + 2;
                            i11 += 3;
                            iM88872h2 = m88884n2(iM88872h2, bArr2[i14], bArr2[i16]);
                        } else if (i15 != 4) {
                            if (iM88872h2 < 32) {
                                m84082v1(iM88872h2, "string value");
                            } else {
                                m88908W1(iM88872h2);
                            }
                            i11 = i14;
                        } else {
                            byte[] bArr3 = this.f89579k0;
                            byte b11 = bArr3[i14];
                            int i17 = i11 + 3;
                            byte b12 = bArr3[i11 + 2];
                            i11 += 4;
                            int iM88885o2 = m88885o2(iM88872h2, b11, b12, bArr3[i17]);
                            int i18 = iM11113t + 1;
                            cArrM11111r[iM11113t] = (char) ((iM88885o2 >> 10) | 55296);
                            if (i18 >= cArrM11111r.length) {
                                cArrM11111r = this.f82946C.m11110p();
                                iM11113t = 0;
                            } else {
                                iM11113t = i18;
                            }
                            iM88872h2 = (iM88885o2 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        }
                        if (iM11113t >= cArrM11111r.length) {
                            cArrM11111r = this.f82946C.m11110p();
                        } else {
                            i13 = iM11113t;
                        }
                        iM11113t = i13 + 1;
                        cArrM11111r[i13] = (char) iM88872h2;
                        break;
                    }
                    this.f82963s = i14;
                    this.f82946C.m11092E(iM11113t);
                    if (m88876j2(iM88872h2, iArr[iM88872h2], i14 < this.f82964t)) {
                        cArrM11111r = this.f82946C.m11111r();
                        iM11113t = this.f82946C.m11113t();
                        i11 = this.f82963s;
                        break;
                    }
                    this.f89593d0 = 45;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this.f82981e = jsonToken;
                    return jsonToken;
                }
                if (iM88872h2 == 39) {
                    this.f82963s = i14;
                    this.f82946C.m11092E(iM11113t);
                    return m88915d2(JsonToken.VALUE_STRING);
                }
                cArrM11111r[iM11113t] = (char) iM88872h2;
                iM11113t++;
                i11 = i14;
            }
        }
        this.f82963s = i11;
        this.f89592c0 = 45;
        this.f82946C.m11092E(iM11113t);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.f82981e = jsonToken2;
        return jsonToken2;
    }

    /* JADX INFO: renamed from: s2 */
    public final JsonToken m88889s2(int i11) throws IOException {
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89586W = i11;
                this.f89592c0 = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i12 + 1;
            int i13 = bArr[i12] & 255;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.f82965u -= 3;
                        return m88859V2(i13);
                    }
                } else if (i13 != 191) {
                    m84094L0("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i13));
                }
            } else if (i13 != 187) {
                m84094L0("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i13));
            }
            i11++;
        }
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public JsonToken mo10905t0() throws IOException {
        int i11 = this.f82963s;
        if (i11 >= this.f82964t) {
            if (this.f82962r) {
                return null;
            }
            if (this.f89594e0) {
                return this.f82981e == JsonToken.NOT_AVAILABLE ? m88849L2() : m88901O1();
            }
            return JsonToken.NOT_AVAILABLE;
        }
        if (this.f82981e == JsonToken.NOT_AVAILABLE) {
            return m88848K2();
        }
        this.f82951H = 0;
        this.f82968x = this.f82965u + ((long) i11);
        this.f82950G = null;
        byte[] bArr = this.f89579k0;
        this.f82963s = i11 + 1;
        int i12 = bArr[i11] & 255;
        switch (this.f89590a0) {
            case 0:
                return m88859V2(i12);
            case 1:
                return m88877j3(i12);
            case 2:
                return m88861X2(i12);
            case 3:
                return m88862Y2(i12);
            case 4:
                return m88881l3(i12);
            case 5:
                return m88877j3(i12);
            case 6:
                return m88883m3(i12);
            default:
                C6332k.m11125c();
                return null;
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final JsonToken m88890t2(int i11, boolean z11) throws IOException {
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89592c0 = z11 ? 52 : 53;
                this.f89586W = i11;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            this.f82963s = i13;
            int i14 = bArr[i12] & 255;
            if (i14 < 32) {
                if (i14 == 10) {
                    this.f82966v++;
                    this.f82967w = i13;
                } else if (i14 == 13) {
                    this.f89597h0++;
                    this.f82967w = i13;
                } else if (i14 != 9) {
                    m84103U0(i14);
                }
            } else if (i14 == 42) {
                z11 = true;
            } else if (i14 == 47 && z11) {
                return m88857T2(i11);
            }
            z11 = false;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final JsonToken m88891u2(int i11) throws IOException {
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89592c0 = 54;
                this.f89586W = i11;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            int i13 = i12 + 1;
            this.f82963s = i13;
            int i14 = bArr[i12] & 255;
            if (i14 < 32) {
                if (i14 == 10) {
                    this.f82966v++;
                    this.f82967w = i13;
                } else if (i14 == 13) {
                    this.f89597h0++;
                    this.f82967w = i13;
                } else if (i14 != 9) {
                    m84103U0(i14);
                }
                return m88857T2(i11);
            }
        }
    }

    /* JADX INFO: renamed from: v2 */
    public JsonToken m88892v2() throws IOException {
        do {
            int i11 = this.f82963s;
            if (i11 >= this.f82964t) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f89579k0;
            this.f82963s = i11 + 1;
            char c11 = (char) bArr[i11];
            if (!Character.isJavaIdentifierPart(c11)) {
                break;
            }
            this.f82946C.m11095a(c11);
        } while (this.f82946C.m11093F() < 256);
        return m88855R2(this.f82946C.m11106l());
    }

    /* JADX INFO: renamed from: w2 */
    public JsonToken m88893w2() throws IOException {
        return m88855R2(this.f82946C.m11106l());
    }

    /* JADX INFO: renamed from: x2 */
    public final JsonToken m88894x2() throws IOException {
        int i11;
        int i12;
        int iM88874i2 = m88874i2(this.f89588Y, this.f89589Z);
        if (iM88874i2 < 0) {
            this.f89592c0 = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i13 = this.f89584U;
        int[] iArr = this.f89583T;
        if (i13 >= iArr.length) {
            this.f89583T = AbstractC37385b.m84054E1(iArr, 32);
        }
        int i14 = this.f89586W;
        int i15 = this.f89587X;
        int i16 = 1;
        if (iM88874i2 > 127) {
            int i17 = 0;
            if (i15 >= 4) {
                int[] iArr2 = this.f89583T;
                int i18 = this.f89584U;
                this.f89584U = i18 + 1;
                iArr2[i18] = i14;
                i14 = 0;
                i15 = 0;
            }
            if (iM88874i2 < 2048) {
                i11 = i14 << 8;
                i12 = (iM88874i2 >> 6) | 192;
            } else {
                int i19 = (i14 << 8) | (iM88874i2 >> 12) | 224;
                i15++;
                if (i15 >= 4) {
                    int[] iArr3 = this.f89583T;
                    int i21 = this.f89584U;
                    this.f89584U = i21 + 1;
                    iArr3[i21] = i19;
                    i15 = 0;
                } else {
                    i17 = i19;
                }
                i11 = i17 << 8;
                i12 = ((iM88874i2 >> 6) & 63) | 128;
            }
            i14 = i11 | i12;
            i15++;
            iM88874i2 = (iM88874i2 & 63) | 128;
        }
        if (i15 < 4) {
            i16 = 1 + i15;
            iM88874i2 |= i14 << 8;
        } else {
            int[] iArr4 = this.f89583T;
            int i22 = this.f89584U;
            this.f89584U = i22 + 1;
            iArr4[i22] = i14;
        }
        return this.f89593d0 == 9 ? m88887q2(this.f89584U, iM88874i2, i16) : m88852O2(this.f89584U, iM88874i2, i16);
    }

    /* JADX INFO: renamed from: y2 */
    public JsonToken m88895y2(boolean z11, int i11) throws IOException {
        if (z11) {
            this.f89592c0 = 32;
            if (i11 == 45 || i11 == 43) {
                this.f82946C.m11095a((char) i11);
                int i12 = this.f82963s;
                if (i12 >= this.f82964t) {
                    this.f89592c0 = 32;
                    this.f82960Q = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this.f89579k0;
                this.f82963s = i12 + 1;
                i11 = bArr[i12];
            }
        }
        char[] cArrM11111r = this.f82946C.m11111r();
        int iM11113t = this.f82946C.m11113t();
        int i13 = this.f82960Q;
        while (i11 >= 48 && i11 <= 57) {
            i13++;
            if (iM11113t >= cArrM11111r.length) {
                cArrM11111r = this.f82946C.m11109o();
            }
            int i14 = iM11113t + 1;
            cArrM11111r[iM11113t] = (char) i11;
            int i15 = this.f82963s;
            if (i15 >= this.f82964t) {
                this.f82946C.m11092E(i14);
                this.f82960Q = i13;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this.f89579k0;
            this.f82963s = i15 + 1;
            i11 = bArr2[i15];
            iM11113t = i14;
        }
        int i16 = i11 & 255;
        if (i13 == 0) {
            m84112d1(i16, "Exponent indicator not followed by a digit");
        }
        this.f82963s--;
        this.f82946C.m11092E(iM11113t);
        this.f82960Q = i13;
        return m88915d2(JsonToken.VALUE_NUMBER_FLOAT);
    }

    /* JADX INFO: renamed from: z2 */
    public JsonToken m88896z2() throws IOException {
        byte b11;
        int i11 = this.f82959P;
        char[] cArrM11111r = this.f82946C.m11111r();
        int iM11113t = this.f82946C.m11113t();
        while (true) {
            byte[] bArr = this.f89579k0;
            int i12 = this.f82963s;
            this.f82963s = i12 + 1;
            b11 = bArr[i12];
            if (b11 < 48 || b11 > 57) {
                break;
            }
            i11++;
            if (iM11113t >= cArrM11111r.length) {
                cArrM11111r = this.f82946C.m11109o();
            }
            int i13 = iM11113t + 1;
            cArrM11111r[iM11113t] = (char) b11;
            if (this.f82963s >= this.f82964t) {
                this.f82946C.m11092E(i13);
                this.f82959P = i11;
                return JsonToken.NOT_AVAILABLE;
            }
            iM11113t = i13;
        }
        if (i11 == 0) {
            m84112d1(b11, "Decimal point not followed by a digit");
        }
        this.f82959P = i11;
        this.f82946C.m11092E(iM11113t);
        if (b11 != 101 && b11 != 69) {
            this.f82963s--;
            this.f82946C.m11092E(iM11113t);
            this.f82960Q = 0;
            return m88915d2(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this.f82946C.m11095a((char) b11);
        this.f82960Q = 0;
        int i14 = this.f82963s;
        if (i14 >= this.f82964t) {
            this.f89592c0 = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this.f89592c0 = 32;
        byte[] bArr2 = this.f89579k0;
        this.f82963s = i14 + 1;
        return m88895y2(true, bArr2[i14] & 255);
    }

    public C40337a(C6310d c6310d, int i11, C40935a c40935a) {
        super(c6310d, i11, c40935a);
        this.f89579k0 = AbstractC37386c.f82971g;
    }

    /* JADX INFO: renamed from: B2 */
    public JsonToken m88839B2(String str, int i11, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                this.f89586W = i11;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken2;
                return jsonToken2;
            }
            byte b11 = this.f89579k0[i12];
            if (i11 == length) {
                if (b11 >= 48 && b11 != 93 && b11 != 125) {
                    break;
                }
                return m88915d2(jsonToken);
            }
            if (b11 != str.charAt(i11)) {
                break;
            }
            i11++;
            this.f82963s++;
        }
        this.f89592c0 = 50;
        this.f82946C.m11118y(str, 0, i11);
        return m88892v2();
    }

    /* JADX INFO: renamed from: C2 */
    public JsonToken m88840C2(String str, int i11, JsonToken jsonToken) throws IOException {
        if (i11 == str.length()) {
            this.f82981e = jsonToken;
            return jsonToken;
        }
        this.f82946C.m11118y(str, 0, i11);
        return m88893w2();
    }

    /* JADX INFO: renamed from: D2 */
    public JsonToken m88841D2(int i11, int i12) throws IOException {
        String strM88907U1 = m88907U1(i11);
        int length = strM88907U1.length();
        while (true) {
            int i13 = this.f82963s;
            if (i13 >= this.f82964t) {
                this.f89595f0 = i11;
                this.f89586W = i12;
                this.f89592c0 = 19;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f82981e = jsonToken;
                return jsonToken;
            }
            byte b11 = this.f89579k0[i13];
            if (i12 == length) {
                if (b11 >= 48 && b11 != 93 && b11 != 125) {
                    break;
                }
                return m88917f2(i11);
            }
            if (b11 != strM88907U1.charAt(i12)) {
                break;
            }
            i12++;
            this.f82963s++;
        }
        this.f89592c0 = 50;
        this.f82946C.m11118y(strM88907U1, 0, i12);
        return m88892v2();
    }

    /* JADX INFO: renamed from: E2 */
    public JsonToken m88842E2(int i11, int i12) throws IOException {
        String strM88907U1 = m88907U1(i11);
        if (i12 == strM88907U1.length()) {
            return m88917f2(i11);
        }
        this.f82946C.m11118y(strM88907U1, 0, i12);
        return m88893w2();
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: j1 */
    public char mo84070j1() throws IOException {
        C6332k.m11125c();
        return ' ';
    }
}
