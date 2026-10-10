package p334i7;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.p062io.C6314h;
import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: i7.k */
/* JADX INFO: compiled from: WriterBasedJsonGenerator.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38473k extends AbstractC38465c {

    /* JADX INFO: renamed from: C */
    public static final char[] f86405C = C6308b.m10964d();

    /* JADX INFO: renamed from: A */
    public InterfaceC6306i f86406A;

    /* JADX INFO: renamed from: B */
    public char[] f86407B;

    /* JADX INFO: renamed from: t */
    public final Writer f86408t;

    /* JADX INFO: renamed from: u */
    public char f86409u;

    /* JADX INFO: renamed from: v */
    public char[] f86410v;

    /* JADX INFO: renamed from: w */
    public int f86411w;

    /* JADX INFO: renamed from: x */
    public int f86412x;

    /* JADX INFO: renamed from: y */
    public int f86413y;

    /* JADX INFO: renamed from: z */
    public char[] f86414z;

    /* JADX INFO: renamed from: T0 */
    private int m87041T0(InputStream inputStream, byte[] bArr, int i11, int i12, int i13) throws IOException {
        int i14;
        int i15 = 0;
        while (i11 < i12) {
            bArr[i15] = bArr[i11];
            i15++;
            i11++;
        }
        int iMin = Math.min(i13, bArr.length);
        do {
            int i16 = iMin - i15;
            if (i16 == 0 || (i14 = inputStream.read(bArr, i15, i16)) < 0) {
                return i15;
            }
            i15 += i14;
        } while (i15 < 3);
        return i15;
    }

    /* JADX INFO: renamed from: R0 */
    public final int m87050R0(char[] cArr, int i11, int i12, char c11, int i13) throws IOException {
        String value;
        int i14;
        if (i13 >= 0) {
            if (i11 > 1 && i11 < i12) {
                int i15 = i11 - 2;
                cArr[i15] = '\\';
                cArr[i11 - 1] = (char) i13;
                return i15;
            }
            char[] cArrM87047O0 = this.f86414z;
            if (cArrM87047O0 == null) {
                cArrM87047O0 = m87047O0();
            }
            cArrM87047O0[1] = (char) i13;
            this.f86408t.write(cArrM87047O0, 0, 2);
            return i11;
        }
        if (i13 == -2) {
            InterfaceC6306i interfaceC6306i = this.f86406A;
            if (interfaceC6306i == null) {
                value = this.f86318o.getEscapeSequence(c11).getValue();
            } else {
                value = interfaceC6306i.getValue();
                this.f86406A = null;
            }
            int length = value.length();
            if (i11 < length || i11 >= i12) {
                this.f86408t.write(value);
                return i11;
            }
            int i16 = i11 - length;
            value.getChars(0, length, cArr, i16);
            return i16;
        }
        if (i11 <= 5 || i11 >= i12) {
            char[] cArrM87047O1 = this.f86414z;
            if (cArrM87047O1 == null) {
                cArrM87047O1 = m87047O0();
            }
            this.f86411w = this.f86412x;
            if (c11 <= 255) {
                char[] cArr2 = f86405C;
                cArrM87047O1[6] = cArr2[c11 >> 4];
                cArrM87047O1[7] = cArr2[c11 & 15];
                this.f86408t.write(cArrM87047O1, 2, 6);
                return i11;
            }
            int i17 = c11 >> '\b';
            char[] cArr3 = f86405C;
            cArrM87047O1[10] = cArr3[(i17 & 255) >> 4];
            cArrM87047O1[11] = cArr3[i17 & 15];
            cArrM87047O1[12] = cArr3[(c11 & 255) >> 4];
            cArrM87047O1[13] = cArr3[c11 & 15];
            this.f86408t.write(cArrM87047O1, 8, 6);
            return i11;
        }
        cArr[i11 - 6] = '\\';
        int i18 = i11 - 4;
        cArr[i11 - 5] = 'u';
        if (c11 > 255) {
            int i19 = c11 >> '\b';
            int i21 = i11 - 3;
            char[] cArr4 = f86405C;
            cArr[i18] = cArr4[(i19 & 255) >> 4];
            i14 = i11 - 2;
            cArr[i21] = cArr4[i19 & 15];
            c11 = (char) (c11 & 255);
        } else {
            int i22 = i11 - 3;
            cArr[i18] = '0';
            i14 = i11 - 2;
            cArr[i22] = '0';
        }
        char[] cArr5 = f86405C;
        cArr[i14] = cArr5[c11 >> 4];
        cArr[i14 + 1] = cArr5[c11 & 15];
        return i14 - 4;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m87051S0(char c11, int i11) throws IOException {
        String value;
        int i12;
        if (i11 >= 0) {
            int i13 = this.f86412x;
            if (i13 >= 2) {
                int i14 = i13 - 2;
                this.f86411w = i14;
                char[] cArr = this.f86410v;
                cArr[i14] = '\\';
                cArr[i13 - 1] = (char) i11;
                return;
            }
            char[] cArrM87047O0 = this.f86414z;
            if (cArrM87047O0 == null) {
                cArrM87047O0 = m87047O0();
            }
            this.f86411w = this.f86412x;
            cArrM87047O0[1] = (char) i11;
            this.f86408t.write(cArrM87047O0, 0, 2);
            return;
        }
        if (i11 == -2) {
            InterfaceC6306i interfaceC6306i = this.f86406A;
            if (interfaceC6306i == null) {
                value = this.f86318o.getEscapeSequence(c11).getValue();
            } else {
                value = interfaceC6306i.getValue();
                this.f86406A = null;
            }
            int length = value.length();
            int i15 = this.f86412x;
            if (i15 < length) {
                this.f86411w = i15;
                this.f86408t.write(value);
                return;
            } else {
                int i16 = i15 - length;
                this.f86411w = i16;
                value.getChars(0, length, this.f86410v, i16);
                return;
            }
        }
        int i17 = this.f86412x;
        if (i17 < 6) {
            char[] cArrM87047O1 = this.f86414z;
            if (cArrM87047O1 == null) {
                cArrM87047O1 = m87047O0();
            }
            this.f86411w = this.f86412x;
            if (c11 <= 255) {
                char[] cArr2 = f86405C;
                cArrM87047O1[6] = cArr2[c11 >> 4];
                cArrM87047O1[7] = cArr2[c11 & 15];
                this.f86408t.write(cArrM87047O1, 2, 6);
                return;
            }
            int i18 = c11 >> '\b';
            char[] cArr3 = f86405C;
            cArrM87047O1[10] = cArr3[(i18 & 255) >> 4];
            cArrM87047O1[11] = cArr3[i18 & 15];
            cArrM87047O1[12] = cArr3[(c11 & 255) >> 4];
            cArrM87047O1[13] = cArr3[c11 & 15];
            this.f86408t.write(cArrM87047O1, 8, 6);
            return;
        }
        char[] cArr4 = this.f86410v;
        int i19 = i17 - 6;
        this.f86411w = i19;
        cArr4[i19] = '\\';
        cArr4[i17 - 5] = 'u';
        if (c11 > 255) {
            int i21 = c11 >> '\b';
            char[] cArr5 = f86405C;
            cArr4[i17 - 4] = cArr5[(i21 & 255) >> 4];
            i12 = i17 - 3;
            cArr4[i12] = cArr5[i21 & 15];
            c11 = (char) (c11 & 255);
        } else {
            cArr4[i17 - 4] = '0';
            i12 = i17 - 3;
            cArr4[i12] = '0';
        }
        char[] cArr6 = f86405C;
        cArr4[i12 + 1] = cArr6[c11 >> 4];
        cArr4[i12 + 2] = cArr6[c11 & 15];
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r1 */
    public final void m87070r1(char[] cArr, int i11, int i12, int i13) throws IOException {
        char c11;
        int i14 = i12 + i11;
        int[] iArr = this.f86316m;
        int iMin = Math.min(iArr.length, i13 + 1);
        int i15 = 0;
        while (i11 < i14) {
            int i16 = i11;
            do {
                c11 = cArr[i16];
                if (c11 < iMin) {
                    i15 = iArr[c11];
                    if (i15 != 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    if (c11 > i13) {
                        i15 = -1;
                        break;
                    }
                    i16++;
                }
            } while (i16 < i14);
            int i17 = i16 - i11;
            if (i17 < 32) {
                if (this.f86412x + i17 > this.f86413y) {
                    m87049Q0();
                }
                if (i17 > 0) {
                    System.arraycopy(cArr, i11, this.f86410v, this.f86412x, i17);
                    this.f86412x += i17;
                }
            } else {
                m87049Q0();
                this.f86408t.write(cArr, i11, i17);
            }
            if (i16 >= i14) {
                return;
            }
            i11 = i16 + 1;
            m87048P0(c11, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[PHI: r4
      0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t1 */
    public final void m87072t1(char[] cArr, int i11, int i12) throws IOException {
        char c11;
        int i13 = i12 + i11;
        int[] iArr = this.f86316m;
        int i14 = this.f86317n;
        if (i14 < 1) {
            i14 = 65535;
        }
        int iMin = Math.min(iArr.length, i14 + 1);
        CharacterEscapes characterEscapes = this.f86318o;
        int i15 = 0;
        while (i11 < i13) {
            int i16 = i11;
            do {
                c11 = cArr[i16];
                if (c11 < iMin) {
                    i15 = iArr[c11];
                    if (i15 != 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    if (c11 > i14) {
                        i15 = -1;
                        break;
                    }
                    InterfaceC6306i escapeSequence = characterEscapes.getEscapeSequence(c11);
                    this.f86406A = escapeSequence;
                    if (escapeSequence != null) {
                        i15 = -2;
                        break;
                    }
                    i16++;
                }
            } while (i16 < i13);
            int i17 = i16 - i11;
            if (i17 < 32) {
                if (this.f86412x + i17 > this.f86413y) {
                    m87049Q0();
                }
                if (i17 > 0) {
                    System.arraycopy(cArr, i11, this.f86410v, this.f86412x, i17);
                    this.f86412x += i17;
                }
            } else {
                m87049Q0();
                this.f86408t.write(cArr, i11, i17);
            }
            if (i16 >= i13) {
                return;
            }
            i11 = i16 + 1;
            m87048P0(c11, i15);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m87042c1() throws IOException {
        if (this.f86412x + 4 >= this.f86413y) {
            m87049Q0();
        }
        int i11 = this.f86412x;
        char[] cArr = this.f86410v;
        cArr[i11] = 'n';
        cArr[i11 + 1] = 'u';
        cArr[i11 + 2] = 'l';
        cArr[i11 + 3] = 'l';
        this.f86412x = i11 + 4;
    }

    /* JADX INFO: renamed from: f1 */
    private void m87043f1(int i11) throws IOException {
        if (this.f86412x + 13 >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i12 = this.f86412x;
        int i13 = i12 + 1;
        this.f86412x = i13;
        cArr[i12] = this.f86409u;
        int iM11039r = C6314h.m11039r(i11, cArr, i13);
        char[] cArr2 = this.f86410v;
        this.f86412x = iM11039r + 1;
        cArr2[iM11039r] = this.f86409u;
    }

    /* JADX INFO: renamed from: g1 */
    private void m87044g1(long j11) throws IOException {
        if (this.f86412x + 23 >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        int i12 = i11 + 1;
        this.f86412x = i12;
        cArr[i11] = this.f86409u;
        int iM11041t = C6314h.m11041t(j11, cArr, i12);
        char[] cArr2 = this.f86410v;
        this.f86412x = iM11041t + 1;
        cArr2[iM11041t] = this.f86409u;
    }

    /* JADX INFO: renamed from: h1 */
    private void m87045h1(String str) throws IOException {
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
        mo10838q0(str);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr2[i12] = this.f86409u;
    }

    /* JADX INFO: renamed from: i1 */
    private void m87046i1(short s11) throws IOException {
        if (this.f86412x + 8 >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        int i12 = i11 + 1;
        this.f86412x = i12;
        cArr[i11] = this.f86409u;
        int iM11039r = C6314h.m11039r(s11, cArr, i12);
        char[] cArr2 = this.f86410v;
        this.f86412x = iM11039r + 1;
        cArr2[iM11039r] = this.f86409u;
    }

    @Override // p254f7.AbstractC37384a
    /* JADX INFO: renamed from: L0 */
    public final void mo84053L0(String str) throws IOException {
        char c11;
        int iM86821x = this.f82941i.m86821x();
        if (this.f10022b != null) {
            m86795N0(str, iM86821x);
            return;
        }
        if (iM86821x == 1) {
            c11 = ',';
        } else {
            if (iM86821x != 2) {
                if (iM86821x != 3) {
                    if (iM86821x != 5) {
                        return;
                    }
                    m86794M0(str);
                    return;
                } else {
                    InterfaceC6306i interfaceC6306i = this.f86319p;
                    if (interfaceC6306i != null) {
                        mo10838q0(interfaceC6306i.getValue());
                        return;
                    }
                    return;
                }
            }
            c11 = ':';
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = c11;
    }

    /* JADX INFO: renamed from: O0 */
    public final char[] m87047O0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.f86414z = cArr;
        return cArr;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m87048P0(char c11, int i11) throws IOException {
        String value;
        int i12;
        if (i11 >= 0) {
            if (this.f86412x + 2 > this.f86413y) {
                m87049Q0();
            }
            char[] cArr = this.f86410v;
            int i13 = this.f86412x;
            int i14 = i13 + 1;
            this.f86412x = i14;
            cArr[i13] = '\\';
            this.f86412x = i13 + 2;
            cArr[i14] = (char) i11;
            return;
        }
        if (i11 == -2) {
            InterfaceC6306i interfaceC6306i = this.f86406A;
            if (interfaceC6306i == null) {
                value = this.f86318o.getEscapeSequence(c11).getValue();
            } else {
                value = interfaceC6306i.getValue();
                this.f86406A = null;
            }
            int length = value.length();
            if (this.f86412x + length > this.f86413y) {
                m87049Q0();
                if (length > this.f86413y) {
                    this.f86408t.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.f86410v, this.f86412x);
            this.f86412x += length;
            return;
        }
        if (this.f86412x + 5 >= this.f86413y) {
            m87049Q0();
        }
        int i15 = this.f86412x;
        char[] cArr2 = this.f86410v;
        cArr2[i15] = '\\';
        int i16 = i15 + 2;
        cArr2[i15 + 1] = 'u';
        if (c11 > 255) {
            int i17 = c11 >> '\b';
            int i18 = i15 + 3;
            char[] cArr3 = f86405C;
            cArr2[i16] = cArr3[(i17 & 255) >> 4];
            i12 = i15 + 4;
            cArr2[i18] = cArr3[i17 & 15];
            c11 = (char) (c11 & 255);
        } else {
            int i19 = i15 + 3;
            cArr2[i16] = '0';
            i12 = i15 + 4;
            cArr2[i19] = '0';
        }
        char[] cArr4 = f86405C;
        cArr2[i12] = cArr4[c11 >> 4];
        cArr2[i12 + 1] = cArr4[c11 & 15];
        this.f86412x = i12 + 2;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m87049Q0() throws IOException {
        int i11 = this.f86412x;
        int i12 = this.f86411w;
        int i13 = i11 - i12;
        if (i13 > 0) {
            this.f86411w = 0;
            this.f86412x = 0;
            this.f86408t.write(this.f86410v, i12, i13);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m87052U0() {
        char[] cArr = this.f86410v;
        if (cArr != null) {
            this.f86410v = null;
            this.f86315l.m10989p(cArr);
        }
        char[] cArr2 = this.f86407B;
        if (cArr2 != null) {
            this.f86407B = null;
            this.f86315l.m10990q(cArr2);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final int m87053V0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f86413y - 6;
        int i12 = 2;
        int i13 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i14 = 0;
        int iM87041T0 = 0;
        int i15 = 0;
        while (true) {
            if (i14 > i13) {
                iM87041T0 = m87041T0(inputStream, bArr, i14, iM87041T0, bArr.length);
                if (iM87041T0 < 3) {
                    break;
                }
                i13 = iM87041T0 - 3;
                i14 = 0;
            }
            if (this.f86412x > i11) {
                m87049Q0();
            }
            int i16 = i14 + 2;
            int i17 = ((bArr[i14 + 1] & 255) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i15 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr[i16] & 255), this.f86410v, this.f86412x);
            this.f86412x = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f86410v;
                int i18 = iEncodeBase64Chunk + 1;
                this.f86412x = i18;
                cArr[iEncodeBase64Chunk] = '\\';
                this.f86412x = iEncodeBase64Chunk + 2;
                cArr[i18] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iM87041T0 <= 0) {
            return i15;
        }
        if (this.f86412x > i11) {
            m87049Q0();
        }
        int i19 = bArr[0] << 16;
        if (1 < iM87041T0) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        int i21 = i15 + i12;
        this.f86412x = base64Variant.encodeBase64Partial(i19, i12, this.f86410v, this.f86412x);
        return i21;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: W */
    public void mo10805W() throws IOException {
        if (!this.f82941i.m10937f()) {
            m10809a("Current context not Array but " + this.f82941i.m10941j());
        }
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeEndArray(this, this.f82941i.m10935d());
        } else {
            if (this.f86412x >= this.f86413y) {
                m87049Q0();
            }
            char[] cArr = this.f86410v;
            int i11 = this.f86412x;
            this.f86412x = i11 + 1;
            cArr[i11] = ']';
        }
        this.f82941i = this.f82941i.m86810l();
    }

    /* JADX INFO: renamed from: W0 */
    public final int m87054W0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i11) throws IOException {
        int iM87041T0;
        int i12 = this.f86413y - 6;
        int i13 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i14 = -3;
        int i15 = i11;
        int i16 = 0;
        int iM87041T1 = 0;
        while (i15 > 2) {
            if (i16 > i14) {
                iM87041T1 = m87041T0(inputStream, bArr, i16, iM87041T1, i15);
                if (iM87041T1 < 3) {
                    i16 = 0;
                    break;
                }
                i14 = iM87041T1 - 3;
                i16 = 0;
            }
            if (this.f86412x > i12) {
                m87049Q0();
            }
            int i17 = i16 + 2;
            int i18 = ((bArr[i16 + 1] & 255) | (bArr[i16] << 8)) << 8;
            i16 += 3;
            i15 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i18 | (bArr[i17] & 255), this.f86410v, this.f86412x);
            this.f86412x = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f86410v;
                int i19 = iEncodeBase64Chunk + 1;
                this.f86412x = i19;
                cArr[iEncodeBase64Chunk] = '\\';
                this.f86412x = iEncodeBase64Chunk + 2;
                cArr[i19] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i15 <= 0 || (iM87041T0 = m87041T0(inputStream, bArr, i16, iM87041T1, i15)) <= 0) {
            return i15;
        }
        if (this.f86412x > i12) {
            m87049Q0();
        }
        int i21 = bArr[0] << 16;
        if (1 < iM87041T0) {
            i21 |= (bArr[1] & 255) << 8;
        } else {
            i13 = 1;
        }
        this.f86412x = base64Variant.encodeBase64Partial(i21, i13, this.f86410v, this.f86412x);
        return i15 - i13;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: X */
    public void mo10806X() throws IOException {
        if (!this.f82941i.m10938g()) {
            m10809a("Current context not Object but " + this.f82941i.m10941j());
        }
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeEndObject(this, this.f82941i.m10935d());
        } else {
            if (this.f86412x >= this.f86413y) {
                m87049Q0();
            }
            char[] cArr = this.f86410v;
            int i11 = this.f86412x;
            this.f86412x = i11 + 1;
            cArr[i11] = '}';
        }
        this.f82941i = this.f82941i.m86810l();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m87055X0(Base64Variant base64Variant, byte[] bArr, int i11, int i12) throws IOException {
        int iEncodeBase64Chunk;
        int i13 = i12 - 3;
        int i14 = this.f86413y - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i15 = maxLineLength >> 2;
            do {
                if (i11 > i13) {
                    break loop0;
                }
                if (this.f86412x > i14) {
                    m87049Q0();
                }
                int i16 = i11 + 2;
                int i17 = ((bArr[i11 + 1] & 255) | (bArr[i11] << 8)) << 8;
                i11 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr[i16] & 255), this.f86410v, this.f86412x);
                this.f86412x = iEncodeBase64Chunk;
                i15--;
            } while (i15 > 0);
            char[] cArr = this.f86410v;
            int i18 = iEncodeBase64Chunk + 1;
            this.f86412x = i18;
            cArr[iEncodeBase64Chunk] = '\\';
            this.f86412x = iEncodeBase64Chunk + 2;
            cArr[i18] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i19 = i12 - i11;
        if (i19 > 0) {
            if (this.f86412x > i14) {
                m87049Q0();
            }
            int i21 = i11 + 1;
            int i22 = bArr[i11] << 16;
            if (i19 == 2) {
                i22 |= (bArr[i21] & 255) << 8;
            }
            this.f86412x = base64Variant.encodeBase64Partial(i22, i19, this.f86410v, this.f86412x);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m87056Y0(InterfaceC6306i interfaceC6306i, boolean z11) throws IOException {
        if (this.f10022b != null) {
            m87060d1(interfaceC6306i, z11);
            return;
        }
        if (this.f86412x + 1 >= this.f86413y) {
            m87049Q0();
        }
        if (z11) {
            char[] cArr = this.f86410v;
            int i11 = this.f86412x;
            this.f86412x = i11 + 1;
            cArr[i11] = ',';
        }
        if (this.f86320q) {
            char[] cArrAsQuotedChars = interfaceC6306i.asQuotedChars();
            mo10839r0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        int i13 = i12 + 1;
        this.f86412x = i13;
        cArr2[i12] = this.f86409u;
        int iAppendQuoted = interfaceC6306i.appendQuoted(cArr2, i13);
        if (iAppendQuoted < 0) {
            m87058a1(interfaceC6306i);
            return;
        }
        int i14 = this.f86412x + iAppendQuoted;
        this.f86412x = i14;
        if (i14 >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr3 = this.f86410v;
        int i15 = this.f86412x;
        this.f86412x = i15 + 1;
        cArr3[i15] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: Z */
    public void mo10808Z(InterfaceC6306i interfaceC6306i) throws IOException {
        int iM86820w = this.f82941i.m86820w(interfaceC6306i.getValue());
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        m87056Y0(interfaceC6306i, iM86820w == 1);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m87057Z0(String str, boolean z11) throws IOException {
        if (this.f10022b != null) {
            m87061e1(str, z11);
            return;
        }
        if (this.f86412x + 1 >= this.f86413y) {
            m87049Q0();
        }
        if (z11) {
            char[] cArr = this.f86410v;
            int i11 = this.f86412x;
            this.f86412x = i11 + 1;
            cArr[i11] = ',';
        }
        if (this.f86320q) {
            m87065m1(str);
            return;
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr2[i12] = this.f86409u;
        m87065m1(str);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr3 = this.f86410v;
        int i13 = this.f86412x;
        this.f86412x = i13 + 1;
        cArr3[i13] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: a0 */
    public void mo10810a0(String str) throws IOException {
        int iM86820w = this.f82941i.m86820w(str);
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        m87057Z0(str, iM86820w == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: c0 */
    public void mo10813c0(double d11) throws IOException {
        if (this.f82940h || (C6314h.m11036o(d11) && mo10837q(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo10787C0(String.valueOf(d11));
        } else {
            mo84053L0("write a number");
            mo10838q0(String.valueOf(d11));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: d0 */
    public void mo10814d0(float f11) throws IOException {
        if (this.f82940h || (C6314h.m11037p(f11) && mo10837q(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo10787C0(String.valueOf(f11));
        } else {
            mo84053L0("write a number");
            mo10838q0(String.valueOf(f11));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m87060d1(InterfaceC6306i interfaceC6306i, boolean z11) throws IOException {
        if (z11) {
            this.f10022b.writeObjectEntrySeparator(this);
        } else {
            this.f10022b.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = interfaceC6306i.asQuotedChars();
        if (this.f86320q) {
            mo10839r0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
        mo10839r0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr2[i12] = this.f86409u;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m87061e1(String str, boolean z11) throws IOException {
        if (z11) {
            this.f10022b.writeObjectEntrySeparator(this);
        } else {
            this.f10022b.beforeObjectEntries(this);
        }
        if (this.f86320q) {
            m87065m1(str);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
        m87065m1(str);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr2[i12] = this.f86409u;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m87062j1(int i11) throws IOException {
        char[] cArr;
        char c11;
        int[] iArr = this.f86316m;
        int length = iArr.length;
        int i12 = 0;
        int iM87050R0 = 0;
        while (i12 < i11) {
            do {
                cArr = this.f86410v;
                c11 = cArr[i12];
                if (c11 < length && iArr[c11] != 0) {
                    break;
                } else {
                    i12++;
                }
            } while (i12 < i11);
            int i13 = i12 - iM87050R0;
            if (i13 > 0) {
                this.f86408t.write(cArr, iM87050R0, i13);
                if (i12 >= i11) {
                    return;
                }
            }
            int i14 = i12 + 1;
            iM87050R0 = m87050R0(this.f86410v, i14, i11, c11, iArr[c11]);
            i12 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[PHI: r4
      0x001e: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k1 */
    public final void m87063k1(int i11, int i12) throws IOException {
        char[] cArr;
        char c11;
        int[] iArr = this.f86316m;
        int iMin = Math.min(iArr.length, i12 + 1);
        int i13 = 0;
        int iM87050R0 = 0;
        int i14 = 0;
        while (i13 < i11) {
            do {
                cArr = this.f86410v;
                c11 = cArr[i13];
                if (c11 < iMin) {
                    i14 = iArr[c11];
                    if (i14 != 0) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    if (c11 > i12) {
                        i14 = -1;
                        break;
                    }
                    i13++;
                }
            } while (i13 < i11);
            int i15 = i14;
            int i16 = i13 - iM87050R0;
            if (i16 > 0) {
                this.f86408t.write(cArr, iM87050R0, i16);
                if (i13 >= i11) {
                    return;
                }
            }
            int i17 = i13 + 1;
            iM87050R0 = m87050R0(this.f86410v, i17, i11, c11, i15);
            i13 = i17;
            i14 = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[PHI: r6
      0x0032: PHI (r6v8 int) = (r6v2 int), (r6v9 int) binds: [B:15:0x002e, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: l1 */
    public final void m87064l1(int i11) throws IOException {
        char c11;
        int[] iArr = this.f86316m;
        int i12 = this.f86317n;
        if (i12 < 1) {
            i12 = 65535;
        }
        int iMin = Math.min(iArr.length, i12 + 1);
        CharacterEscapes characterEscapes = this.f86318o;
        int i13 = 0;
        int iM87050R0 = 0;
        int i14 = 0;
        while (i13 < i11) {
            do {
                c11 = this.f86410v[i13];
                if (c11 < iMin) {
                    i14 = iArr[c11];
                    if (i14 != 0) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    if (c11 > i12) {
                        i14 = -1;
                        break;
                    }
                    InterfaceC6306i escapeSequence = characterEscapes.getEscapeSequence(c11);
                    this.f86406A = escapeSequence;
                    if (escapeSequence != null) {
                        i14 = -2;
                        break;
                    }
                    i13++;
                }
            } while (i13 < i11);
            int i15 = i14;
            int i16 = i13 - iM87050R0;
            if (i16 > 0) {
                this.f86408t.write(this.f86410v, iM87050R0, i16);
                if (i13 >= i11) {
                    return;
                }
            }
            int i17 = i13 + 1;
            iM87050R0 = m87050R0(this.f86410v, i17, i11, c11, i15);
            i13 = i17;
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m87066n1(char[] cArr, int i11, int i12) throws IOException {
        if (this.f86318o != null) {
            m87072t1(cArr, i11, i12);
            return;
        }
        int i13 = this.f86317n;
        if (i13 != 0) {
            m87070r1(cArr, i11, i12, i13);
            return;
        }
        int i14 = i12 + i11;
        int[] iArr = this.f86316m;
        int length = iArr.length;
        while (i11 < i14) {
            int i15 = i11;
            do {
                char c11 = cArr[i15];
                if (c11 < length && iArr[c11] != 0) {
                    break;
                } else {
                    i15++;
                }
            } while (i15 < i14);
            int i16 = i15 - i11;
            if (i16 < 32) {
                if (this.f86412x + i16 > this.f86413y) {
                    m87049Q0();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i11, this.f86410v, this.f86412x, i16);
                    this.f86412x += i16;
                }
            } else {
                m87049Q0();
                this.f86408t.write(cArr, i11, i16);
            }
            if (i15 >= i14) {
                return;
            }
            i11 = i15 + 1;
            char c12 = cArr[i15];
            m87048P0(c12, iArr[c12]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: o0 */
    public void mo10834o0(char c11) throws IOException {
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = c11;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m87067o1(int i11) throws IOException {
        int i12;
        int i13 = this.f86412x + i11;
        int[] iArr = this.f86316m;
        int length = iArr.length;
        while (this.f86412x < i13) {
            do {
                char[] cArr = this.f86410v;
                int i14 = this.f86412x;
                char c11 = cArr[i14];
                if (c11 >= length || iArr[c11] == 0) {
                    i12 = i14 + 1;
                    this.f86412x = i12;
                } else {
                    int i15 = this.f86411w;
                    int i16 = i14 - i15;
                    if (i16 > 0) {
                        this.f86408t.write(cArr, i15, i16);
                    }
                    char[] cArr2 = this.f86410v;
                    int i17 = this.f86412x;
                    this.f86412x = i17 + 1;
                    char c12 = cArr2[i17];
                    m87051S0(c12, iArr[c12]);
                }
            } while (i12 < i13);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: p0 */
    public void mo10836p0(InterfaceC6306i interfaceC6306i) throws IOException {
        int iAppendUnquoted = interfaceC6306i.appendUnquoted(this.f86410v, this.f86412x);
        if (iAppendUnquoted < 0) {
            mo10838q0(interfaceC6306i.getValue());
        } else {
            this.f86412x += iAppendUnquoted;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: q1 */
    public final void m87069q1(int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f86412x + i11;
        int[] iArr = this.f86316m;
        int iMin = Math.min(iArr.length, i12 + 1);
        while (this.f86412x < i17) {
            do {
                char[] cArr = this.f86410v;
                int i18 = this.f86412x;
                char c11 = cArr[i18];
                if (c11 < iMin) {
                    i13 = iArr[c11];
                    if (i13 != 0) {
                        i14 = this.f86411w;
                        i15 = i18 - i14;
                        if (i15 > 0) {
                            this.f86408t.write(cArr, i14, i15);
                        }
                        this.f86412x++;
                        m87051S0(c11, i13);
                    }
                    i16 = i18 + 1;
                    this.f86412x = i16;
                } else {
                    if (c11 > i12) {
                        i13 = -1;
                        i14 = this.f86411w;
                        i15 = i18 - i14;
                        if (i15 > 0) {
                            this.f86408t.write(cArr, i14, i15);
                        }
                        this.f86412x++;
                        m87051S0(c11, i13);
                    }
                    i16 = i18 + 1;
                    this.f86412x = i16;
                }
            } while (i16 < i17);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: r0 */
    public void mo10839r0(char[] cArr, int i11, int i12) throws IOException {
        if (i12 >= 32) {
            m87049Q0();
            this.f86408t.write(cArr, i11, i12);
        } else {
            if (i12 > this.f86413y - this.f86412x) {
                m87049Q0();
            }
            System.arraycopy(cArr, i11, this.f86410v, this.f86412x, i12);
            this.f86412x += i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[SYNTHETIC] */
    /* JADX INFO: renamed from: s1 */
    public final void m87071s1(int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f86412x + i11;
        int[] iArr = this.f86316m;
        int i17 = this.f86317n;
        if (i17 < 1) {
            i17 = 65535;
        }
        int iMin = Math.min(iArr.length, i17 + 1);
        CharacterEscapes characterEscapes = this.f86318o;
        while (this.f86412x < i16) {
            do {
                char c11 = this.f86410v[this.f86412x];
                if (c11 < iMin) {
                    i12 = iArr[c11];
                    if (i12 != 0) {
                        int i18 = this.f86412x;
                        i13 = this.f86411w;
                        i14 = i18 - i13;
                        if (i14 > 0) {
                            this.f86408t.write(this.f86410v, i13, i14);
                        }
                        this.f86412x++;
                        m87051S0(c11, i12);
                    }
                    i15 = this.f86412x + 1;
                    this.f86412x = i15;
                } else {
                    if (c11 > i17) {
                        i12 = -1;
                    } else {
                        InterfaceC6306i escapeSequence = characterEscapes.getEscapeSequence(c11);
                        this.f86406A = escapeSequence;
                        if (escapeSequence != null) {
                            i12 = -2;
                        }
                        i15 = this.f86412x + 1;
                        this.f86412x = i15;
                    }
                    int i19 = this.f86412x;
                    i13 = this.f86411w;
                    i14 = i19 - i13;
                    if (i14 > 0) {
                        this.f86408t.write(this.f86410v, i13, i14);
                    }
                    this.f86412x++;
                    m87051S0(c11, i12);
                }
            } while (i15 < i16);
            return;
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m87073u1(String str) throws IOException {
        int i11 = this.f86413y;
        int i12 = this.f86412x;
        int i13 = i11 - i12;
        str.getChars(0, i13, this.f86410v, i12);
        this.f86412x += i13;
        m87049Q0();
        int length = str.length() - i13;
        while (true) {
            int i14 = this.f86413y;
            if (length <= i14) {
                str.getChars(i13, i13 + length, this.f86410v, 0);
                this.f86411w = 0;
                this.f86412x = length;
                return;
            } else {
                int i15 = i13 + i14;
                str.getChars(i13, i15, this.f86410v, 0);
                this.f86411w = 0;
                this.f86412x = i14;
                m87049Q0();
                length -= i14;
                i13 = i15;
            }
        }
    }

    public C38473k(C6310d c6310d, int i11, AbstractC6304g abstractC6304g, Writer writer, char c11) {
        super(c6310d, i11, abstractC6304g);
        this.f86408t = writer;
        char[] cArrM10978e = c6310d.m10978e();
        this.f86410v = cArrM10978e;
        this.f86413y = cArrM10978e.length;
        this.f86409u = c11;
        if (c11 != '\"') {
            this.f86316m = C6308b.m10966f(c11);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: B0 */
    public void mo10785B0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo84053L0("write a string");
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        int i12 = i11 + 1;
        this.f86412x = i12;
        cArr[i11] = this.f86409u;
        int iAppendQuoted = interfaceC6306i.appendQuoted(cArr, i12);
        if (iAppendQuoted < 0) {
            m87068p1(interfaceC6306i);
            return;
        }
        int i13 = this.f86412x + iAppendQuoted;
        this.f86412x = i13;
        if (i13 >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i14 = this.f86412x;
        this.f86412x = i14 + 1;
        cArr2[i14] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: C0 */
    public void mo10787C0(String str) throws IOException {
        mo84053L0("write a string");
        if (str == null) {
            m87042c1();
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
        m87065m1(str);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr2[i12] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: D0 */
    public void mo10788D0(char[] cArr, int i11, int i12) throws IOException {
        mo84053L0("write a string");
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i13 = this.f86412x;
        this.f86412x = i13 + 1;
        cArr2[i13] = this.f86409u;
        m87066n1(cArr, i11, i12);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr3 = this.f86410v;
        int i14 = this.f86412x;
        this.f86412x = i14 + 1;
        cArr3[i14] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: P */
    public int mo10798P(Base64Variant base64Variant, InputStream inputStream, int i11) throws IOException {
        mo84053L0("write a binary value");
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr[i12] = this.f86409u;
        byte[] bArrM10977d = this.f86315l.m10977d();
        try {
            if (i11 < 0) {
                i11 = m87053V0(base64Variant, inputStream, bArrM10977d);
            } else {
                int iM87054W0 = m87054W0(base64Variant, inputStream, bArrM10977d, i11);
                if (iM87054W0 > 0) {
                    m10809a("Too few bytes available: missing " + iM87054W0 + " bytes (out of " + i11 + ")");
                }
            }
            this.f86315l.m10988o(bArrM10977d);
            if (this.f86412x >= this.f86413y) {
                m87049Q0();
            }
            char[] cArr2 = this.f86410v;
            int i13 = this.f86412x;
            this.f86412x = i13 + 1;
            cArr2[i13] = this.f86409u;
            return i11;
        } catch (Throwable th2) {
            this.f86315l.m10988o(bArrM10977d);
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: R */
    public void mo10800R(Base64Variant base64Variant, byte[] bArr, int i11, int i12) throws IOException {
        mo84053L0("write a binary value");
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i13 = this.f86412x;
        this.f86412x = i13 + 1;
        cArr[i13] = this.f86409u;
        m87055X0(base64Variant, bArr, i11, i12 + i11);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr2 = this.f86410v;
        int i14 = this.f86412x;
        this.f86412x = i14 + 1;
        cArr2[i14] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: U */
    public void mo10803U(boolean z11) throws IOException {
        int i11;
        mo84053L0("write a boolean value");
        if (this.f86412x + 5 >= this.f86413y) {
            m87049Q0();
        }
        int i12 = this.f86412x;
        char[] cArr = this.f86410v;
        if (z11) {
            cArr[i12] = 't';
            cArr[i12 + 1] = 'r';
            cArr[i12 + 2] = 'u';
            i11 = i12 + 3;
            cArr[i11] = 'e';
        } else {
            cArr[i12] = 'f';
            cArr[i12 + 1] = 'a';
            cArr[i12 + 2] = 'l';
            cArr[i12 + 3] = 's';
            i11 = i12 + 4;
            cArr[i11] = 'e';
        }
        this.f86412x = i11 + 1;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m87058a1(InterfaceC6306i interfaceC6306i) throws IOException {
        char[] cArrAsQuotedChars = interfaceC6306i.asQuotedChars();
        mo10839r0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: b0 */
    public void mo10812b0() throws IOException {
        mo84053L0("write a null");
        m87042c1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m87059b1(String str) throws IOException {
        m87049Q0();
        int length = str.length();
        int i11 = 0;
        while (true) {
            int i12 = this.f86413y;
            if (i11 + i12 > length) {
                i12 = length - i11;
            }
            int i13 = i11 + i12;
            str.getChars(i11, i13, this.f86410v, 0);
            if (this.f86318o != null) {
                m87064l1(i12);
            } else {
                int i14 = this.f86317n;
                if (i14 != 0) {
                    m87063k1(i12, i14);
                } else {
                    m87062j1(i12);
                }
            }
            if (i13 >= length) {
                return;
            } else {
                i11 = i13;
            }
        }
    }

    @Override // p254f7.AbstractC37384a, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f86410v != null && mo10837q(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                AbstractC6302f abstractC6302fMo10833o = mo10833o();
                if (abstractC6302fMo10833o.m10937f()) {
                    mo10805W();
                } else if (!abstractC6302fMo10833o.m10938g()) {
                    break;
                } else {
                    mo10806X();
                }
            }
        }
        m87049Q0();
        this.f86411w = 0;
        this.f86412x = 0;
        if (this.f86408t != null) {
            if (!this.f86315l.m10987n() && !mo10837q(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                if (mo10837q(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this.f86408t.flush();
                }
            } else {
                this.f86408t.close();
            }
        }
        m87052U0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: e0 */
    public void mo10815e0(int i11) throws IOException {
        mo84053L0("write a number");
        if (this.f82940h) {
            m87043f1(i11);
            return;
        }
        if (this.f86412x + 11 >= this.f86413y) {
            m87049Q0();
        }
        this.f86412x = C6314h.m11039r(i11, this.f86410v, this.f86412x);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: f0 */
    public void mo10816f0(long j11) throws IOException {
        mo84053L0("write a number");
        if (this.f82940h) {
            m87044g1(j11);
            return;
        }
        if (this.f86412x + 21 >= this.f86413y) {
            m87049Q0();
        }
        this.f86412x = C6314h.m11041t(j11, this.f86410v, this.f86412x);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        m87049Q0();
        if (this.f86408t != null && mo10837q(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f86408t.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: g0 */
    public void mo10818g0(String str) throws IOException {
        mo84053L0("write a number");
        if (str == null) {
            m87042c1();
        } else if (this.f82940h) {
            m87045h1(str);
        } else {
            mo10838q0(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: h0 */
    public void mo10820h0(BigDecimal bigDecimal) throws IOException {
        mo84053L0("write a number");
        if (bigDecimal == null) {
            m87042c1();
        } else if (this.f82940h) {
            m87045h1(m84050I0(bigDecimal));
        } else {
            mo10838q0(m84050I0(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: i0 */
    public void mo10822i0(BigInteger bigInteger) throws IOException {
        mo84053L0("write a number");
        if (bigInteger == null) {
            m87042c1();
        } else if (this.f82940h) {
            m87045h1(bigInteger.toString());
        } else {
            mo10838q0(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: j0 */
    public void mo10824j0(short s11) throws IOException {
        mo84053L0("write a number");
        if (this.f82940h) {
            m87046i1(s11);
            return;
        }
        if (this.f86412x + 6 >= this.f86413y) {
            m87049Q0();
        }
        this.f86412x = C6314h.m11039r(s11, this.f86410v, this.f86412x);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m87065m1(String str) throws IOException {
        int length = str.length();
        int i11 = this.f86413y;
        if (length > i11) {
            m87059b1(str);
            return;
        }
        if (this.f86412x + length > i11) {
            m87049Q0();
        }
        str.getChars(0, length, this.f86410v, this.f86412x);
        if (this.f86318o != null) {
            m87071s1(length);
            return;
        }
        int i12 = this.f86317n;
        if (i12 != 0) {
            m87069q1(length, i12);
        } else {
            m87067o1(length);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m87068p1(InterfaceC6306i interfaceC6306i) throws IOException {
        char[] cArrAsQuotedChars = interfaceC6306i.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this.f86413y - this.f86412x) {
                m87049Q0();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this.f86410v, this.f86412x, length);
            this.f86412x += length;
        } else {
            m87049Q0();
            this.f86408t.write(cArrAsQuotedChars, 0, length);
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = this.f86409u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: q0 */
    public void mo10838q0(String str) throws IOException {
        int length = str.length();
        int i11 = this.f86413y - this.f86412x;
        if (i11 == 0) {
            m87049Q0();
            i11 = this.f86413y - this.f86412x;
        }
        if (i11 >= length) {
            str.getChars(0, length, this.f86410v, this.f86412x);
            this.f86412x += length;
        } else {
            m87073u1(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: u0 */
    public void mo10843u0() throws IOException {
        mo84053L0("start an array");
        this.f82941i = this.f82941i.m86811m();
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartArray(this);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: w0 */
    public void mo10847w0(Object obj) throws IOException {
        mo84053L0("start an array");
        this.f82941i = this.f82941i.m86812n(obj);
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartArray(this);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: x0 */
    public void mo10849x0(Object obj, int i11) throws IOException {
        mo84053L0("start an array");
        this.f82941i = this.f82941i.m86812n(obj);
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartArray(this);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i12 = this.f86412x;
        this.f86412x = i12 + 1;
        cArr[i12] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: y0 */
    public void mo10850y0() throws IOException {
        mo84053L0("start an object");
        this.f82941i = this.f82941i.m86813o();
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartObject(this);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: z0 */
    public void mo10852z0(Object obj) throws IOException {
        mo84053L0("start an object");
        this.f82941i = this.f82941i.m86814p(obj);
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartObject(this);
            return;
        }
        if (this.f86412x >= this.f86413y) {
            m87049Q0();
        }
        char[] cArr = this.f86410v;
        int i11 = this.f86412x;
        this.f86412x = i11 + 1;
        cArr[i11] = '{';
    }
}
