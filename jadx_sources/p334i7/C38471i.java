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
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: i7.i */
/* JADX INFO: compiled from: UTF8JsonGenerator.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38471i extends AbstractC38465c {

    /* JADX INFO: renamed from: C */
    public static final byte[] f86371C = C6308b.m10963c();

    /* JADX INFO: renamed from: D */
    public static final byte[] f86372D = {BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableFindOptions};

    /* JADX INFO: renamed from: E */
    public static final byte[] f86373E = {BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BatchMatMulOptions};

    /* JADX INFO: renamed from: F */
    public static final byte[] f86374F = {BuiltinOptions.CumsumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BatchMatMulOptions};

    /* JADX INFO: renamed from: A */
    public final int f86375A;

    /* JADX INFO: renamed from: B */
    public boolean f86376B;

    /* JADX INFO: renamed from: t */
    public final OutputStream f86377t;

    /* JADX INFO: renamed from: u */
    public byte f86378u;

    /* JADX INFO: renamed from: v */
    public byte[] f86379v;

    /* JADX INFO: renamed from: w */
    public int f86380w;

    /* JADX INFO: renamed from: x */
    public final int f86381x;

    /* JADX INFO: renamed from: y */
    public final int f86382y;

    /* JADX INFO: renamed from: z */
    public char[] f86383z;

    /* JADX INFO: renamed from: P0 */
    public final int m86932P0(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
        int length = bArr2.length;
        if (i11 + length > i12) {
            this.f86380w = i11;
            m86931O0();
            i11 = this.f86380w;
            if (length > bArr.length) {
                this.f86377t.write(bArr2, 0, length);
                return i11;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i11, length);
        int i14 = i11 + length;
        if ((i13 * 6) + i14 <= i12) {
            return i14;
        }
        this.f86380w = i14;
        m86931O0();
        return this.f86380w;
    }

    /* JADX INFO: renamed from: T0 */
    public final int m86936T0(InputStream inputStream, byte[] bArr, int i11, int i12, int i13) throws IOException {
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

    /* JADX INFO: renamed from: Y0 */
    public final void m86941Y0(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f86380w + length > this.f86381x) {
            m86931O0();
            if (length > 512) {
                this.f86377t.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f86379v, this.f86380w, length);
        this.f86380w += length;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m86955m1(String str, int i11, int i12) throws IOException {
        int i13 = i12 + i11;
        int i14 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        while (i11 < i13) {
            char cCharAt = str.charAt(i11);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i11++;
            i14++;
        }
        this.f86380w = i14;
        if (i11 < i13) {
            if (this.f86318o != null) {
                m86943a1(str, i11, i13);
            } else if (this.f86317n == 0) {
                m86957o1(str, i11, i13);
            } else {
                m86959q1(str, i11, i13);
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m86956n1(char[] cArr, int i11, int i12) throws IOException {
        int i13 = i12 + i11;
        int i14 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        while (i11 < i13) {
            char c11 = cArr[i11];
            if (c11 > 127 || iArr[c11] != 0) {
                break;
            }
            bArr[i14] = (byte) c11;
            i11++;
            i14++;
        }
        this.f86380w = i14;
        if (i11 < i13) {
            if (this.f86318o != null) {
                m86944b1(cArr, i11, i13);
            } else if (this.f86317n == 0) {
                m86958p1(cArr, i11, i13);
            } else {
                m86960r1(cArr, i11, i13);
            }
        }
    }

    @Override // p254f7.AbstractC37384a
    /* JADX INFO: renamed from: L0 */
    public final void mo84053L0(String str) throws IOException {
        byte b11;
        int iM86821x = this.f82941i.m86821x();
        if (this.f10022b != null) {
            m86795N0(str, iM86821x);
            return;
        }
        if (iM86821x == 1) {
            b11 = BuiltinOptions.GreaterOptions;
        } else {
            if (iM86821x != 2) {
                if (iM86821x != 3) {
                    if (iM86821x != 5) {
                        return;
                    }
                    m86794M0(str);
                    return;
                }
                InterfaceC6306i interfaceC6306i = this.f86319p;
                if (interfaceC6306i != null) {
                    byte[] bArrAsUnquotedUTF8 = interfaceC6306i.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        m86941Y0(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b11 = BuiltinOptions.FakeQuantOptions;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = b11;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m86931O0() throws IOException {
        int i11 = this.f86380w;
        if (i11 > 0) {
            this.f86380w = 0;
            this.f86377t.write(this.f86379v, 0, i11);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m86933Q0(int i11, int i12) throws IOException {
        byte[] bArr = this.f86379v;
        if (i11 < 55296 || i11 > 57343) {
            bArr[i12] = (byte) ((i11 >> 12) | 224);
            int i13 = i12 + 2;
            bArr[i12 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            int i14 = i12 + 3;
            bArr[i13] = (byte) ((i11 & 63) | 128);
            return i14;
        }
        bArr[i12] = BuiltinOptions.IfOptions;
        bArr[i12 + 1] = BuiltinOptions.DynamicUpdateSliceOptions;
        byte[] bArr2 = f86371C;
        bArr[i12 + 2] = bArr2[(i11 >> 12) & 15];
        bArr[i12 + 3] = bArr2[(i11 >> 8) & 15];
        int i15 = i12 + 5;
        bArr[i12 + 4] = bArr2[(i11 >> 4) & 15];
        int i16 = i12 + 6;
        bArr[i15] = bArr2[i11 & 15];
        return i16;
    }

    /* JADX INFO: renamed from: U0 */
    public void m86937U0() {
        byte[] bArr = this.f86379v;
        if (bArr != null && this.f86376B) {
            this.f86379v = null;
            this.f86315l.m10993t(bArr);
        }
        char[] cArr = this.f86383z;
        if (cArr != null) {
            this.f86383z = null;
            this.f86315l.m10989p(cArr);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final int m86938V0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f86381x - 6;
        int i12 = 2;
        int i13 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i14 = 0;
        int iM86936T0 = 0;
        int i15 = 0;
        while (true) {
            if (i14 > i13) {
                iM86936T0 = m86936T0(inputStream, bArr, i14, iM86936T0, bArr.length);
                if (iM86936T0 < 3) {
                    break;
                }
                i13 = iM86936T0 - 3;
                i14 = 0;
            }
            if (this.f86380w > i11) {
                m86931O0();
            }
            int i16 = i14 + 2;
            int i17 = ((bArr[i14 + 1] & 255) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i15 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr[i16] & 255), this.f86379v, this.f86380w);
            this.f86380w = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f86379v;
                int i18 = iEncodeBase64Chunk + 1;
                this.f86380w = i18;
                bArr2[iEncodeBase64Chunk] = BuiltinOptions.IfOptions;
                this.f86380w = iEncodeBase64Chunk + 2;
                bArr2[i18] = BuiltinOptions.HashtableSizeOptions;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iM86936T0 <= 0) {
            return i15;
        }
        if (this.f86380w > i11) {
            m86931O0();
        }
        int i19 = bArr[0] << 16;
        if (1 < iM86936T0) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        int i21 = i15 + i12;
        this.f86380w = base64Variant.encodeBase64Partial(i19, i12, this.f86379v, this.f86380w);
        return i21;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: W */
    public final void mo10805W() throws IOException {
        if (!this.f82941i.m10937f()) {
            m10809a("Current context not Array but " + this.f82941i.m10941j());
        }
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeEndArray(this, this.f82941i.m10935d());
        } else {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = BuiltinOptions.WhileOptions;
        }
        this.f82941i = this.f82941i.m86810l();
    }

    /* JADX INFO: renamed from: W0 */
    public final int m86939W0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i11) throws IOException {
        int iM86936T0;
        int i12 = this.f86381x - 6;
        int i13 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i14 = -3;
        int i15 = i11;
        int i16 = 0;
        int iM86936T1 = 0;
        while (i15 > 2) {
            if (i16 > i14) {
                iM86936T1 = m86936T0(inputStream, bArr, i16, iM86936T1, i15);
                if (iM86936T1 < 3) {
                    i16 = 0;
                    break;
                }
                i14 = iM86936T1 - 3;
                i16 = 0;
            }
            if (this.f86380w > i12) {
                m86931O0();
            }
            int i17 = i16 + 2;
            int i18 = ((bArr[i16 + 1] & 255) | (bArr[i16] << 8)) << 8;
            i16 += 3;
            i15 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i18 | (bArr[i17] & 255), this.f86379v, this.f86380w);
            this.f86380w = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f86379v;
                int i19 = iEncodeBase64Chunk + 1;
                this.f86380w = i19;
                bArr2[iEncodeBase64Chunk] = BuiltinOptions.IfOptions;
                this.f86380w = iEncodeBase64Chunk + 2;
                bArr2[i19] = BuiltinOptions.HashtableSizeOptions;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i15 <= 0 || (iM86936T0 = m86936T0(inputStream, bArr, i16, iM86936T1, i15)) <= 0) {
            return i15;
        }
        if (this.f86380w > i12) {
            m86931O0();
        }
        int i21 = bArr[0] << 16;
        if (1 < iM86936T0) {
            i21 |= (bArr[1] & 255) << 8;
        } else {
            i13 = 1;
        }
        this.f86380w = base64Variant.encodeBase64Partial(i21, i13, this.f86379v, this.f86380w);
        return i15 - i13;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: X */
    public final void mo10806X() throws IOException {
        if (!this.f82941i.m10938g()) {
            m10809a("Current context not Object but " + this.f82941i.m10941j());
        }
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeEndObject(this, this.f82941i.m10935d());
        } else {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = BuiltinOptions.BitwiseXorOptions;
        }
        this.f82941i = this.f82941i.m86810l();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m86940X0(Base64Variant base64Variant, byte[] bArr, int i11, int i12) throws IOException {
        int iEncodeBase64Chunk;
        int i13 = i12 - 3;
        int i14 = this.f86381x - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i15 = maxLineLength >> 2;
            do {
                if (i11 > i13) {
                    break loop0;
                }
                if (this.f86380w > i14) {
                    m86931O0();
                }
                int i16 = i11 + 2;
                int i17 = ((bArr[i11 + 1] & 255) | (bArr[i11] << 8)) << 8;
                i11 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr[i16] & 255), this.f86379v, this.f86380w);
                this.f86380w = iEncodeBase64Chunk;
                i15--;
            } while (i15 > 0);
            byte[] bArr2 = this.f86379v;
            int i18 = iEncodeBase64Chunk + 1;
            this.f86380w = i18;
            bArr2[iEncodeBase64Chunk] = BuiltinOptions.IfOptions;
            this.f86380w = iEncodeBase64Chunk + 2;
            bArr2[i18] = BuiltinOptions.HashtableSizeOptions;
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i19 = i12 - i11;
        if (i19 > 0) {
            if (this.f86380w > i14) {
                m86931O0();
            }
            int i21 = i11 + 1;
            int i22 = bArr[i11] << 16;
            if (i19 == 2) {
                i22 |= (bArr[i21] & 255) << 8;
            }
            this.f86380w = base64Variant.encodeBase64Partial(i22, i19, this.f86379v, this.f86380w);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: Z */
    public void mo10808Z(InterfaceC6306i interfaceC6306i) throws IOException {
        if (this.f10022b != null) {
            m86947e1(interfaceC6306i);
            return;
        }
        int iM86820w = this.f82941i.m86820w(interfaceC6306i.getValue());
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        if (iM86820w == 1) {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = BuiltinOptions.GreaterOptions;
        }
        if (this.f86320q) {
            m86964v1(interfaceC6306i);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        int i13 = i12 + 1;
        this.f86380w = i13;
        bArr2[i12] = this.f86378u;
        int iAppendQuotedUTF8 = interfaceC6306i.appendQuotedUTF8(bArr2, i13);
        if (iAppendQuotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asQuotedUTF8());
        } else {
            this.f86380w += iAppendQuotedUTF8;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr3 = this.f86379v;
        int i14 = this.f86380w;
        this.f86380w = i14 + 1;
        bArr3[i14] = this.f86378u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: a0 */
    public void mo10810a0(String str) throws IOException {
        if (this.f10022b != null) {
            m86948f1(str);
            return;
        }
        int iM86820w = this.f82941i.m86820w(str);
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        if (iM86820w == 1) {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = BuiltinOptions.GreaterOptions;
        }
        if (this.f86320q) {
            m86962t1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f86375A) {
            m86962t1(str, true);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        int i13 = i12 + 1;
        this.f86380w = i13;
        bArr2[i12] = this.f86378u;
        if (length <= this.f86382y) {
            if (i13 + length > this.f86381x) {
                m86931O0();
            }
            m86955m1(str, 0, length);
        } else {
            m86961s1(str, 0, length);
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr3 = this.f86379v;
        int i14 = this.f86380w;
        this.f86380w = i14 + 1;
        bArr3[i14] = this.f86378u;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m86943a1(String str, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        int i13 = this.f86317n;
        if (i13 <= 0) {
            i13 = 65535;
        }
        CharacterEscapes characterEscapes = this.f86318o;
        while (i11 < i12) {
            i11++;
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                int i14 = iArr[cCharAt];
                if (i14 == 0) {
                    bArr[iM86933Q0] = (byte) cCharAt;
                    iM86933Q0++;
                } else if (i14 > 0) {
                    int i15 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i15] = (byte) i14;
                } else if (i14 == -2) {
                    InterfaceC6306i escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence == null) {
                        m10809a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    iM86933Q0 = m86942Z0(bArr, iM86933Q0, escapeSequence, i12 - i11);
                } else {
                    iM86933Q0 = m86945c1(cCharAt, iM86933Q0);
                }
            } else if (cCharAt > i13) {
                iM86933Q0 = m86945c1(cCharAt, iM86933Q0);
            } else {
                InterfaceC6306i escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                if (escapeSequence2 != null) {
                    iM86933Q0 = m86942Z0(bArr, iM86933Q0, escapeSequence2, i12 - i11);
                } else if (cCharAt <= 2047) {
                    int i16 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = (byte) ((cCharAt >> 6) | 192);
                    iM86933Q0 += 2;
                    bArr[i16] = (byte) ((cCharAt & '?') | 128);
                } else {
                    iM86933Q0 = m86933Q0(cCharAt, iM86933Q0);
                }
            }
        }
        this.f86380w = iM86933Q0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m86944b1(char[] cArr, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        int i13 = this.f86317n;
        if (i13 <= 0) {
            i13 = 65535;
        }
        CharacterEscapes characterEscapes = this.f86318o;
        while (i11 < i12) {
            i11++;
            char c11 = cArr[i11];
            if (c11 <= 127) {
                int i14 = iArr[c11];
                if (i14 == 0) {
                    bArr[iM86933Q0] = (byte) c11;
                    iM86933Q0++;
                } else if (i14 > 0) {
                    int i15 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i15] = (byte) i14;
                } else if (i14 == -2) {
                    InterfaceC6306i escapeSequence = characterEscapes.getEscapeSequence(c11);
                    if (escapeSequence == null) {
                        m10809a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c11) + ", although was supposed to have one");
                    }
                    iM86933Q0 = m86942Z0(bArr, iM86933Q0, escapeSequence, i12 - i11);
                } else {
                    iM86933Q0 = m86945c1(c11, iM86933Q0);
                }
            } else if (c11 > i13) {
                iM86933Q0 = m86945c1(c11, iM86933Q0);
            } else {
                InterfaceC6306i escapeSequence2 = characterEscapes.getEscapeSequence(c11);
                if (escapeSequence2 != null) {
                    iM86933Q0 = m86942Z0(bArr, iM86933Q0, escapeSequence2, i12 - i11);
                } else if (c11 <= 2047) {
                    int i16 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = (byte) ((c11 >> 6) | 192);
                    iM86933Q0 += 2;
                    bArr[i16] = (byte) ((c11 & '?') | 128);
                } else {
                    iM86933Q0 = m86933Q0(c11, iM86933Q0);
                }
            }
        }
        this.f86380w = iM86933Q0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: c0 */
    public void mo10813c0(double d11) throws IOException {
        if (this.f82940h || (C6314h.m11036o(d11) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f82939g))) {
            mo10787C0(String.valueOf(d11));
        } else {
            mo84053L0("write a number");
            mo10838q0(String.valueOf(d11));
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final int m86945c1(int i11, int i12) throws IOException {
        int i13;
        byte[] bArr = this.f86379v;
        bArr[i12] = BuiltinOptions.IfOptions;
        int i14 = i12 + 2;
        bArr[i12 + 1] = BuiltinOptions.DynamicUpdateSliceOptions;
        if (i11 > 255) {
            int i15 = i11 >> 8;
            int i16 = i12 + 3;
            byte[] bArr2 = f86371C;
            bArr[i14] = bArr2[(i15 & 255) >> 4];
            i13 = i12 + 4;
            bArr[i16] = bArr2[i15 & 15];
            i11 &= 255;
        } else {
            int i17 = i12 + 3;
            bArr[i14] = BuiltinOptions.SliceOptions;
            i13 = i12 + 4;
            bArr[i17] = BuiltinOptions.SliceOptions;
        }
        int i18 = i13 + 1;
        byte[] bArr3 = f86371C;
        bArr[i13] = bArr3[i11 >> 4];
        int i19 = i13 + 2;
        bArr[i18] = bArr3[i11 & 15];
        return i19;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: d0 */
    public void mo10814d0(float f11) throws IOException {
        if (this.f82940h || (C6314h.m11037p(f11) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f82939g))) {
            mo10787C0(String.valueOf(f11));
        } else {
            mo84053L0("write a number");
            mo10838q0(String.valueOf(f11));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m86946d1() throws IOException {
        if (this.f86380w + 4 >= this.f86381x) {
            m86931O0();
        }
        System.arraycopy(f86372D, 0, this.f86379v, this.f86380w, 4);
        this.f86380w += 4;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m86947e1(InterfaceC6306i interfaceC6306i) throws IOException {
        int iM86820w = this.f82941i.m86820w(interfaceC6306i.getValue());
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        if (iM86820w == 1) {
            this.f10022b.writeObjectEntrySeparator(this);
        } else {
            this.f10022b.beforeObjectEntries(this);
        }
        boolean z11 = this.f86320q;
        if (!z11) {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = this.f86378u;
        }
        int iAppendQuotedUTF8 = interfaceC6306i.appendQuotedUTF8(this.f86379v, this.f86380w);
        if (iAppendQuotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asQuotedUTF8());
        } else {
            this.f86380w += iAppendQuotedUTF8;
        }
        if (z11) {
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr2[i12] = this.f86378u;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m86948f1(String str) throws IOException {
        int iM86820w = this.f82941i.m86820w(str);
        if (iM86820w == 4) {
            m10809a("Can not write a field name, expecting a value");
        }
        if (iM86820w == 1) {
            this.f10022b.writeObjectEntrySeparator(this);
        } else {
            this.f10022b.beforeObjectEntries(this);
        }
        if (this.f86320q) {
            m86962t1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f86375A) {
            m86962t1(str, true);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = this.f86378u;
        str.getChars(0, length, this.f86383z, 0);
        if (length <= this.f86382y) {
            if (this.f86380w + length > this.f86381x) {
                m86931O0();
            }
            m86956n1(this.f86383z, 0, length);
        } else {
            m86963u1(this.f86383z, 0, length);
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr2[i12] = this.f86378u;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m86949g1(int i11) throws IOException {
        if (this.f86380w + 13 >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i12 = this.f86380w;
        int i13 = i12 + 1;
        this.f86380w = i13;
        bArr[i12] = this.f86378u;
        int iM11038q = C6314h.m11038q(i11, bArr, i13);
        byte[] bArr2 = this.f86379v;
        this.f86380w = iM11038q + 1;
        bArr2[iM11038q] = this.f86378u;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m86950h1(long j11) throws IOException {
        if (this.f86380w + 23 >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        int i12 = i11 + 1;
        this.f86380w = i12;
        bArr[i11] = this.f86378u;
        int iM11040s = C6314h.m11040s(j11, bArr, i12);
        byte[] bArr2 = this.f86379v;
        this.f86380w = iM11040s + 1;
        bArr2[iM11040s] = this.f86378u;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m86951i1(String str) throws IOException {
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = this.f86378u;
        mo10838q0(str);
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr2[i12] = this.f86378u;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m86952j1(short s11) throws IOException {
        if (this.f86380w + 8 >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        int i12 = i11 + 1;
        this.f86380w = i12;
        bArr[i11] = this.f86378u;
        int iM11038q = C6314h.m11038q(s11, bArr, i12);
        byte[] bArr2 = this.f86379v;
        this.f86380w = iM11038q + 1;
        bArr2[iM11038q] = this.f86378u;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m86953k1(char[] cArr, int i11, int i12) throws IOException {
        while (i11 < i12) {
            do {
                char c11 = cArr[i11];
                if (c11 > 127) {
                    i11++;
                    if (c11 < 2048) {
                        byte[] bArr = this.f86379v;
                        int i13 = this.f86380w;
                        int i14 = i13 + 1;
                        this.f86380w = i14;
                        bArr[i13] = (byte) ((c11 >> 6) | 192);
                        this.f86380w = i13 + 2;
                        bArr[i14] = (byte) ((c11 & '?') | 128);
                    } else {
                        i11 = m86934R0(c11, cArr, i11, i12);
                    }
                } else {
                    byte[] bArr2 = this.f86379v;
                    int i15 = this.f86380w;
                    this.f86380w = i15 + 1;
                    bArr2[i15] = (byte) c11;
                    i11++;
                }
            } while (i11 < i12);
            return;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final void m86954l1(char[] cArr, int i11, int i12) throws IOException {
        int i13 = this.f86381x;
        byte[] bArr = this.f86379v;
        int i14 = i12 + i11;
        while (i11 < i14) {
            do {
                char c11 = cArr[i11];
                if (c11 >= 128) {
                    if (this.f86380w + 3 >= this.f86381x) {
                        m86931O0();
                    }
                    int i15 = i11 + 1;
                    char c12 = cArr[i11];
                    if (c12 < 2048) {
                        int i16 = this.f86380w;
                        int i17 = i16 + 1;
                        this.f86380w = i17;
                        bArr[i16] = (byte) ((c12 >> 6) | 192);
                        this.f86380w = i16 + 2;
                        bArr[i17] = (byte) ((c12 & '?') | 128);
                        i11 = i15;
                    } else {
                        i11 = m86934R0(c12, cArr, i15, i14);
                    }
                } else {
                    if (this.f86380w >= i13) {
                        m86931O0();
                    }
                    int i18 = this.f86380w;
                    this.f86380w = i18 + 1;
                    bArr[i18] = (byte) c11;
                    i11++;
                }
            } while (i11 < i14);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: o0 */
    public void mo10834o0(char c11) throws IOException {
        if (this.f86380w + 3 >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        if (c11 <= 127) {
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = (byte) c11;
        } else {
            if (c11 >= 2048) {
                m86934R0(c11, null, 0, 0);
                return;
            }
            int i12 = this.f86380w;
            int i13 = i12 + 1;
            this.f86380w = i13;
            bArr[i12] = (byte) ((c11 >> 6) | 192);
            this.f86380w = i12 + 2;
            bArr[i13] = (byte) ((c11 & '?') | 128);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m86957o1(String str, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        while (i11 < i12) {
            i11++;
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                int i13 = iArr[cCharAt];
                if (i13 == 0) {
                    bArr[iM86933Q0] = (byte) cCharAt;
                    iM86933Q0++;
                } else if (i13 > 0) {
                    int i14 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iM86933Q0 = m86945c1(cCharAt, iM86933Q0);
                }
            } else if (cCharAt <= 2047) {
                int i15 = iM86933Q0 + 1;
                bArr[iM86933Q0] = (byte) ((cCharAt >> 6) | 192);
                iM86933Q0 += 2;
                bArr[i15] = (byte) ((cCharAt & '?') | 128);
            } else {
                iM86933Q0 = m86933Q0(cCharAt, iM86933Q0);
            }
        }
        this.f86380w = iM86933Q0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: p0 */
    public void mo10836p0(InterfaceC6306i interfaceC6306i) throws IOException {
        int iAppendUnquotedUTF8 = interfaceC6306i.appendUnquotedUTF8(this.f86379v, this.f86380w);
        if (iAppendUnquotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asUnquotedUTF8());
        } else {
            this.f86380w += iAppendUnquotedUTF8;
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m86958p1(char[] cArr, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        while (i11 < i12) {
            i11++;
            char c11 = cArr[i11];
            if (c11 <= 127) {
                int i13 = iArr[c11];
                if (i13 == 0) {
                    bArr[iM86933Q0] = (byte) c11;
                    iM86933Q0++;
                } else if (i13 > 0) {
                    int i14 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iM86933Q0 = m86945c1(c11, iM86933Q0);
                }
            } else if (c11 <= 2047) {
                int i15 = iM86933Q0 + 1;
                bArr[iM86933Q0] = (byte) ((c11 >> 6) | 192);
                iM86933Q0 += 2;
                bArr[i15] = (byte) ((c11 & '?') | 128);
            } else {
                iM86933Q0 = m86933Q0(c11, iM86933Q0);
            }
        }
        this.f86380w = iM86933Q0;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m86959q1(String str, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        int i13 = this.f86317n;
        while (i11 < i12) {
            i11++;
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                int i14 = iArr[cCharAt];
                if (i14 == 0) {
                    bArr[iM86933Q0] = (byte) cCharAt;
                    iM86933Q0++;
                } else if (i14 > 0) {
                    int i15 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    iM86933Q0 = m86945c1(cCharAt, iM86933Q0);
                }
            } else if (cCharAt > i13) {
                iM86933Q0 = m86945c1(cCharAt, iM86933Q0);
            } else if (cCharAt <= 2047) {
                int i16 = iM86933Q0 + 1;
                bArr[iM86933Q0] = (byte) ((cCharAt >> 6) | 192);
                iM86933Q0 += 2;
                bArr[i16] = (byte) ((cCharAt & '?') | 128);
            } else {
                iM86933Q0 = m86933Q0(cCharAt, iM86933Q0);
            }
        }
        this.f86380w = iM86933Q0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: r0 */
    public final void mo10839r0(char[] cArr, int i11, int i12) throws IOException {
        int i13 = i12 + i12 + i12;
        int i14 = this.f86380w + i13;
        int i15 = this.f86381x;
        if (i14 > i15) {
            if (i15 < i13) {
                m86954l1(cArr, i11, i12);
                return;
            }
            m86931O0();
        }
        int i16 = i12 + i11;
        while (i11 < i16) {
            do {
                char c11 = cArr[i11];
                if (c11 > 127) {
                    i11++;
                    if (c11 < 2048) {
                        byte[] bArr = this.f86379v;
                        int i17 = this.f86380w;
                        int i18 = i17 + 1;
                        this.f86380w = i18;
                        bArr[i17] = (byte) ((c11 >> 6) | 192);
                        this.f86380w = i17 + 2;
                        bArr[i18] = (byte) ((c11 & '?') | 128);
                    } else {
                        i11 = m86934R0(c11, cArr, i11, i16);
                    }
                } else {
                    byte[] bArr2 = this.f86379v;
                    int i19 = this.f86380w;
                    this.f86380w = i19 + 1;
                    bArr2[i19] = (byte) c11;
                    i11++;
                }
            } while (i11 < i16);
            return;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final void m86960r1(char[] cArr, int i11, int i12) throws IOException {
        if (this.f86380w + ((i12 - i11) * 6) > this.f86381x) {
            m86931O0();
        }
        int iM86933Q0 = this.f86380w;
        byte[] bArr = this.f86379v;
        int[] iArr = this.f86316m;
        int i13 = this.f86317n;
        while (i11 < i12) {
            i11++;
            char c11 = cArr[i11];
            if (c11 <= 127) {
                int i14 = iArr[c11];
                if (i14 == 0) {
                    bArr[iM86933Q0] = (byte) c11;
                    iM86933Q0++;
                } else if (i14 > 0) {
                    int i15 = iM86933Q0 + 1;
                    bArr[iM86933Q0] = BuiltinOptions.IfOptions;
                    iM86933Q0 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    iM86933Q0 = m86945c1(c11, iM86933Q0);
                }
            } else if (c11 > i13) {
                iM86933Q0 = m86945c1(c11, iM86933Q0);
            } else if (c11 <= 2047) {
                int i16 = iM86933Q0 + 1;
                bArr[iM86933Q0] = (byte) ((c11 >> 6) | 192);
                iM86933Q0 += 2;
                bArr[i16] = (byte) ((c11 & '?') | 128);
            } else {
                iM86933Q0 = m86933Q0(c11, iM86933Q0);
            }
        }
        this.f86380w = iM86933Q0;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m86961s1(String str, int i11, int i12) throws IOException {
        do {
            int iMin = Math.min(this.f86382y, i12);
            if (this.f86380w + iMin > this.f86381x) {
                m86931O0();
            }
            m86955m1(str, i11, iMin);
            i11 += iMin;
            i12 -= iMin;
        } while (i12 > 0);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m86962t1(String str, boolean z11) throws IOException {
        if (z11) {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr = this.f86379v;
            int i11 = this.f86380w;
            this.f86380w = i11 + 1;
            bArr[i11] = this.f86378u;
        }
        int length = str.length();
        int i12 = 0;
        while (length > 0) {
            int iMin = Math.min(this.f86382y, length);
            if (this.f86380w + iMin > this.f86381x) {
                m86931O0();
            }
            m86955m1(str, i12, iMin);
            i12 += iMin;
            length -= iMin;
        }
        if (z11) {
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr2 = this.f86379v;
            int i13 = this.f86380w;
            this.f86380w = i13 + 1;
            bArr2[i13] = this.f86378u;
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m86963u1(char[] cArr, int i11, int i12) throws IOException {
        do {
            int iMin = Math.min(this.f86382y, i12);
            if (this.f86380w + iMin > this.f86381x) {
                m86931O0();
            }
            m86956n1(cArr, i11, iMin);
            i11 += iMin;
            i12 -= iMin;
        } while (i12 > 0);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m86964v1(InterfaceC6306i interfaceC6306i) throws IOException {
        int iAppendQuotedUTF8 = interfaceC6306i.appendQuotedUTF8(this.f86379v, this.f86380w);
        if (iAppendQuotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asQuotedUTF8());
        } else {
            this.f86380w += iAppendQuotedUTF8;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m86965w1(String str, int i11, int i12) throws IOException {
        char c11;
        char[] cArr = this.f86383z;
        int length = cArr.length;
        if (i12 <= length) {
            str.getChars(i11, i11 + i12, cArr, 0);
            mo10839r0(cArr, 0, i12);
            return;
        }
        int i13 = this.f86381x;
        int iMin = Math.min(length, (i13 >> 2) + (i13 >> 4));
        int i14 = iMin * 3;
        while (i12 > 0) {
            int iMin2 = Math.min(iMin, i12);
            str.getChars(i11, i11 + iMin2, cArr, 0);
            if (this.f86380w + i14 > this.f86381x) {
                m86931O0();
            }
            if (iMin2 > 1 && (c11 = cArr[iMin2 - 1]) >= 55296 && c11 <= 56319) {
                iMin2--;
            }
            m86953k1(cArr, 0, iMin2);
            i11 += iMin2;
            i12 -= iMin2;
        }
    }

    public C38471i(C6310d c6310d, int i11, AbstractC6304g abstractC6304g, OutputStream outputStream, char c11) {
        super(c6310d, i11, abstractC6304g);
        this.f86377t = outputStream;
        this.f86378u = (byte) c11;
        if (c11 != '\"') {
            this.f86316m = C6308b.m10966f(c11);
        }
        this.f86376B = true;
        byte[] bArrM10983j = c6310d.m10983j();
        this.f86379v = bArrM10983j;
        int length = bArrM10983j.length;
        this.f86381x = length;
        this.f86382y = length >> 3;
        char[] cArrM10978e = c6310d.m10978e();
        this.f86383z = cArrM10978e;
        this.f86375A = cArrM10978e.length;
        if (mo10837q(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            mo10786C(127);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: B0 */
    public final void mo10785B0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo84053L0("write a string");
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        int i12 = i11 + 1;
        this.f86380w = i12;
        bArr[i11] = this.f86378u;
        int iAppendQuotedUTF8 = interfaceC6306i.appendQuotedUTF8(bArr, i12);
        if (iAppendQuotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asQuotedUTF8());
        } else {
            this.f86380w += iAppendQuotedUTF8;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i13 = this.f86380w;
        this.f86380w = i13 + 1;
        bArr2[i13] = this.f86378u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: C0 */
    public void mo10787C0(String str) throws IOException {
        mo84053L0("write a string");
        if (str == null) {
            m86946d1();
            return;
        }
        int length = str.length();
        if (length > this.f86382y) {
            m86962t1(str, true);
            return;
        }
        if (this.f86380w + length >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = this.f86378u;
        m86955m1(str, 0, length);
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr2[i12] = this.f86378u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: D0 */
    public void mo10788D0(char[] cArr, int i11, int i12) throws IOException {
        mo84053L0("write a string");
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i13 = this.f86380w;
        int i14 = i13 + 1;
        this.f86380w = i14;
        bArr[i13] = this.f86378u;
        if (i12 <= this.f86382y) {
            if (i14 + i12 > this.f86381x) {
                m86931O0();
            }
            m86956n1(cArr, i11, i12);
        } else {
            m86963u1(cArr, i11, i12);
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i15 = this.f86380w;
        this.f86380w = i15 + 1;
        bArr2[i15] = this.f86378u;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: P */
    public int mo10798P(Base64Variant base64Variant, InputStream inputStream, int i11) throws IOException {
        mo84053L0("write a binary value");
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr[i12] = this.f86378u;
        byte[] bArrM10977d = this.f86315l.m10977d();
        try {
            if (i11 < 0) {
                i11 = m86938V0(base64Variant, inputStream, bArrM10977d);
            } else {
                int iM86939W0 = m86939W0(base64Variant, inputStream, bArrM10977d, i11);
                if (iM86939W0 > 0) {
                    m10809a("Too few bytes available: missing " + iM86939W0 + " bytes (out of " + i11 + ")");
                }
            }
            this.f86315l.m10988o(bArrM10977d);
            if (this.f86380w >= this.f86381x) {
                m86931O0();
            }
            byte[] bArr2 = this.f86379v;
            int i13 = this.f86380w;
            this.f86380w = i13 + 1;
            bArr2[i13] = this.f86378u;
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
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr2 = this.f86379v;
        int i13 = this.f86380w;
        this.f86380w = i13 + 1;
        bArr2[i13] = this.f86378u;
        m86940X0(base64Variant, bArr, i11, i12 + i11);
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr3 = this.f86379v;
        int i14 = this.f86380w;
        this.f86380w = i14 + 1;
        bArr3[i14] = this.f86378u;
    }

    /* JADX INFO: renamed from: R0 */
    public final int m86934R0(int i11, char[] cArr, int i12, int i13) throws IOException {
        if (i11 >= 55296 && i11 <= 57343) {
            if (i12 < i13 && cArr != null) {
                m86935S0(i11, cArr[i12]);
            } else {
                m10809a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i11)));
            }
            return i12 + 1;
        }
        byte[] bArr = this.f86379v;
        int i14 = this.f86380w;
        int i15 = i14 + 1;
        this.f86380w = i15;
        bArr[i14] = (byte) ((i11 >> 12) | 224);
        int i16 = i14 + 2;
        this.f86380w = i16;
        bArr[i15] = (byte) (((i11 >> 6) & 63) | 128);
        this.f86380w = i14 + 3;
        bArr[i16] = (byte) ((i11 & 63) | 128);
        return i12;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m86935S0(int i11, int i12) throws IOException {
        int iM84052K0 = m84052K0(i11, i12);
        if (this.f86380w + 4 > this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i13 = this.f86380w;
        int i14 = i13 + 1;
        this.f86380w = i14;
        bArr[i13] = (byte) ((iM84052K0 >> 18) | 240);
        int i15 = i13 + 2;
        this.f86380w = i15;
        bArr[i14] = (byte) (((iM84052K0 >> 12) & 63) | 128);
        int i16 = i13 + 3;
        this.f86380w = i16;
        bArr[i15] = (byte) (((iM84052K0 >> 6) & 63) | 128);
        this.f86380w = i13 + 4;
        bArr[i16] = (byte) ((iM84052K0 & 63) | 128);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: U */
    public void mo10803U(boolean z11) throws IOException {
        byte[] bArr;
        mo84053L0("write a boolean value");
        if (this.f86380w + 5 >= this.f86381x) {
            m86931O0();
        }
        if (z11) {
            bArr = f86373E;
        } else {
            bArr = f86374F;
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f86379v, this.f86380w, length);
        this.f86380w += length;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m86942Z0(byte[] bArr, int i11, InterfaceC6306i interfaceC6306i, int i12) throws IOException {
        byte[] bArrAsUnquotedUTF8 = interfaceC6306i.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return m86932P0(bArr, i11, this.f86381x, bArrAsUnquotedUTF8, i12);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i11, length);
        return i11 + length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: b0 */
    public void mo10812b0() throws IOException {
        mo84053L0("write a null");
        m86946d1();
    }

    @Override // p254f7.AbstractC37384a, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f86379v != null && mo10837q(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
        m86931O0();
        this.f86380w = 0;
        if (this.f86377t != null) {
            if (!this.f86315l.m10987n() && !mo10837q(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                if (mo10837q(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this.f86377t.flush();
                }
            } else {
                this.f86377t.close();
            }
        }
        m86937U0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: e0 */
    public void mo10815e0(int i11) throws IOException {
        mo84053L0("write a number");
        if (this.f86380w + 11 >= this.f86381x) {
            m86931O0();
        }
        if (this.f82940h) {
            m86949g1(i11);
        } else {
            this.f86380w = C6314h.m11038q(i11, this.f86379v, this.f86380w);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: f0 */
    public void mo10816f0(long j11) throws IOException {
        mo84053L0("write a number");
        if (this.f82940h) {
            m86950h1(j11);
            return;
        }
        if (this.f86380w + 21 >= this.f86381x) {
            m86931O0();
        }
        this.f86380w = C6314h.m11040s(j11, this.f86379v, this.f86380w);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        m86931O0();
        if (this.f86377t != null && mo10837q(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f86377t.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: g0 */
    public void mo10818g0(String str) throws IOException {
        mo84053L0("write a number");
        if (str == null) {
            m86946d1();
        } else if (this.f82940h) {
            m86951i1(str);
        } else {
            mo10838q0(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: h0 */
    public void mo10820h0(BigDecimal bigDecimal) throws IOException {
        mo84053L0("write a number");
        if (bigDecimal == null) {
            m86946d1();
        } else if (this.f82940h) {
            m86951i1(m84050I0(bigDecimal));
        } else {
            mo10838q0(m84050I0(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: i0 */
    public void mo10822i0(BigInteger bigInteger) throws IOException {
        mo84053L0("write a number");
        if (bigInteger == null) {
            m86946d1();
        } else if (this.f82940h) {
            m86951i1(bigInteger.toString());
        } else {
            mo10838q0(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: j0 */
    public void mo10824j0(short s11) throws IOException {
        mo84053L0("write a number");
        if (this.f86380w + 6 >= this.f86381x) {
            m86931O0();
        }
        if (this.f82940h) {
            m86952j1(s11);
        } else {
            this.f86380w = C6314h.m11038q(s11, this.f86379v, this.f86380w);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: q0 */
    public void mo10838q0(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f86383z;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            mo10839r0(cArr, 0, length);
        } else {
            m86965w1(str, 0, length);
        }
    }

    @Override // p254f7.AbstractC37384a, com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: s0 */
    public void mo10840s0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo84053L0("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = interfaceC6306i.appendUnquotedUTF8(this.f86379v, this.f86380w);
        if (iAppendUnquotedUTF8 < 0) {
            m86941Y0(interfaceC6306i.asUnquotedUTF8());
        } else {
            this.f86380w += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: u0 */
    public final void mo10843u0() throws IOException {
        mo84053L0("start an array");
        this.f82941i = this.f82941i.m86811m();
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartArray(this);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = BuiltinOptions.HardSwishOptions;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: w0 */
    public final void mo10847w0(Object obj) throws IOException {
        mo84053L0("start an array");
        this.f82941i = this.f82941i.m86812n(obj);
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartArray(this);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = BuiltinOptions.HardSwishOptions;
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
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i12 = this.f86380w;
        this.f86380w = i12 + 1;
        bArr[i12] = BuiltinOptions.HardSwishOptions;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: y0 */
    public final void mo10850y0() throws IOException {
        mo84053L0("start an object");
        this.f82941i = this.f82941i.m86813o();
        InterfaceC6305h interfaceC6305h = this.f10022b;
        if (interfaceC6305h != null) {
            interfaceC6305h.writeStartObject(this);
            return;
        }
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = BuiltinOptions.SignOptions;
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
        if (this.f86380w >= this.f86381x) {
            m86931O0();
        }
        byte[] bArr = this.f86379v;
        int i11 = this.f86380w;
        this.f86380w = i11 + 1;
        bArr[i11] = BuiltinOptions.SignOptions;
    }
}
