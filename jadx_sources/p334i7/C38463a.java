package p334i7;

import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.p062io.C6312f;
import com.fasterxml.jackson.core.p062io.C6316j;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p303h7.InterfaceC38132a;
import p395k7.C40935a;
import p395k7.C40936b;

/* JADX INFO: renamed from: i7.a */
/* JADX INFO: compiled from: ByteSourceJsonBootstrapper.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C38463a {

    /* JADX INFO: renamed from: a */
    public final C6310d f86301a;

    /* JADX INFO: renamed from: b */
    public final InputStream f86302b;

    /* JADX INFO: renamed from: c */
    public final byte[] f86303c;

    /* JADX INFO: renamed from: d */
    public int f86304d;

    /* JADX INFO: renamed from: e */
    public int f86305e;

    /* JADX INFO: renamed from: f */
    public final boolean f86306f;

    /* JADX INFO: renamed from: g */
    public boolean f86307g;

    /* JADX INFO: renamed from: h */
    public int f86308h;

    public C38463a(C6310d c6310d, InputStream inputStream) {
        this.f86307g = true;
        this.f86301a = c6310d;
        this.f86302b = inputStream;
        this.f86303c = c6310d.m10980g();
        this.f86304d = 0;
        this.f86305e = 0;
        this.f86306f = true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX INFO: renamed from: e */
    public JsonEncoding m86784e() throws IOException {
        int i11;
        JsonEncoding jsonEncoding;
        if (m86785f(4)) {
            byte[] bArr = this.f86303c;
            int i12 = this.f86304d;
            int i13 = (bArr[i12 + 3] & 255) | (bArr[i12] << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
            if (m86786g(i13) || m86781b(i13) || m86780a(i13 >>> 16)) {
                i11 = this.f86308h;
                if (i11 != 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i11 != 2) {
                    if (i11 == 4) {
                        throw new RuntimeException("Internal error");
                    }
                    if (this.f86307g) {
                        jsonEncoding = JsonEncoding.UTF32_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF32_LE;
                    }
                } else if (this.f86307g) {
                    jsonEncoding = JsonEncoding.UTF16_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF16_LE;
                }
            } else {
                jsonEncoding = JsonEncoding.UTF8;
            }
        } else {
            if (m86785f(2)) {
                byte[] bArr2 = this.f86303c;
                int i14 = this.f86304d;
                if (m86780a((bArr2[i14 + 1] & 255) | ((bArr2[i14] & 255) << 8))) {
                    i11 = this.f86308h;
                    if (i11 != 1) {
                        jsonEncoding = JsonEncoding.UTF8;
                    } else if (i11 != 2) {
                        if (i11 == 4) {
                            throw new RuntimeException("Internal error");
                        }
                        if (this.f86307g) {
                            jsonEncoding = JsonEncoding.UTF32_BE;
                        } else {
                            jsonEncoding = JsonEncoding.UTF32_LE;
                        }
                    } else if (this.f86307g) {
                        jsonEncoding = JsonEncoding.UTF16_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF16_LE;
                    }
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this.f86301a.m10994u(jsonEncoding);
        return jsonEncoding;
    }

    /* JADX INFO: renamed from: k */
    public static int m86777k(InterfaceC38132a interfaceC38132a, byte b11) throws IOException {
        while (true) {
            int i11 = b11 & 255;
            if (i11 != 32 && i11 != 13 && i11 != 10 && i11 != 9) {
                return i11;
            }
            if (!interfaceC38132a.mo86052a()) {
                return -1;
            }
            b11 = interfaceC38132a.nextByte();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86781b(int i11) throws IOException {
        if ((i11 >> 8) == 0) {
            this.f86307g = true;
        } else if ((16777215 & i11) == 0) {
            this.f86307g = false;
        } else if (((-16711681) & i11) == 0) {
            m86787i("3412");
        } else {
            if ((i11 & (-65281)) != 0) {
                return false;
            }
            m86787i("2143");
        }
        this.f86308h = 4;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public JsonParser m86782c(int i11, AbstractC6304g abstractC6304g, C40935a c40935a, C40936b c40936b, int i12) throws IOException {
        int i13 = this.f86304d;
        JsonEncoding jsonEncodingM86784e = m86784e();
        int i14 = this.f86304d - i13;
        if (jsonEncodingM86784e != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i12)) {
            return new C38469g(this.f86301a, i11, m86783d(), abstractC6304g, c40936b.m89701n(i12));
        }
        return new C38472j(this.f86301a, i11, this.f86302b, abstractC6304g, c40935a.m89653A(i12), this.f86303c, this.f86304d, this.f86305e, i14, this.f86306f);
    }

    /* JADX INFO: renamed from: d */
    public Reader m86783d() throws IOException {
        JsonEncoding jsonEncodingM10986m = this.f86301a.m10986m();
        int iBits = jsonEncodingM10986m.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                throw new RuntimeException("Internal error");
            }
            C6310d c6310d = this.f86301a;
            return new C6316j(c6310d, this.f86302b, this.f86303c, this.f86304d, this.f86305e, c6310d.m10986m().isBigEndian());
        }
        InputStream c6312f = this.f86302b;
        if (c6312f == null) {
            c6312f = new ByteArrayInputStream(this.f86303c, this.f86304d, this.f86305e);
        } else if (this.f86304d < this.f86305e) {
            c6312f = new C6312f(this.f86301a, c6312f, this.f86303c, this.f86304d, this.f86305e);
        }
        return new InputStreamReader(c6312f, jsonEncodingM10986m.getJavaName());
    }

    /* JADX INFO: renamed from: f */
    public boolean m86785f(int i11) throws IOException {
        int i12;
        int i13 = this.f86305e - this.f86304d;
        while (i13 < i11) {
            InputStream inputStream = this.f86302b;
            if (inputStream == null) {
                i12 = -1;
            } else {
                byte[] bArr = this.f86303c;
                int i14 = this.f86305e;
                i12 = inputStream.read(bArr, i14, bArr.length - i14);
            }
            if (i12 < 1) {
                return false;
            }
            this.f86305e += i12;
            i13 += i12;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86786g(int i11) throws IOException {
        if (i11 == -16842752) {
            m86787i("3412");
        } else {
            if (i11 == -131072) {
                this.f86304d += 4;
                this.f86308h = 4;
                this.f86307g = false;
                return true;
            }
            if (i11 == 65279) {
                this.f86307g = true;
                this.f86304d += 4;
                this.f86308h = 4;
                return true;
            }
            if (i11 == 65534) {
                m86787i("2143");
            }
        }
        int i12 = i11 >>> 16;
        if (i12 == 65279) {
            this.f86304d += 2;
            this.f86308h = 2;
            this.f86307g = true;
            return true;
        }
        if (i12 == 65534) {
            this.f86304d += 2;
            this.f86308h = 2;
            this.f86307g = false;
            return true;
        }
        if ((i11 >>> 8) != 15711167) {
            return false;
        }
        this.f86304d += 3;
        this.f86308h = 1;
        this.f86307g = true;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m86787i(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    /* JADX INFO: renamed from: h */
    public static MatchStrength m86775h(InterfaceC38132a interfaceC38132a) throws IOException {
        if (!interfaceC38132a.mo86052a()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bNextByte = interfaceC38132a.nextByte();
        if (bNextByte == -17) {
            if (!interfaceC38132a.mo86052a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC38132a.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC38132a.mo86052a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC38132a.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC38132a.mo86052a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bNextByte = interfaceC38132a.nextByte();
        }
        int iM86777k = m86777k(interfaceC38132a, bNextByte);
        if (iM86777k < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iM86777k == 123) {
            int iM86776j = m86776j(interfaceC38132a);
            if (iM86776j < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iM86776j != 34 && iM86776j != 125) {
                return MatchStrength.NO_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        }
        if (iM86777k == 91) {
            int iM86776j2 = m86776j(interfaceC38132a);
            if (iM86776j2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iM86776j2 != 93 && iM86776j2 != 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iM86777k != 34 && (iM86777k > 57 || iM86777k < 48)) {
            if (iM86777k == 45) {
                int iM86776j3 = m86776j(interfaceC38132a);
                if (iM86776j3 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                if (iM86776j3 > 57 || iM86776j3 < 48) {
                    return MatchStrength.NO_MATCH;
                }
            } else {
                if (iM86777k == 110) {
                    return m86779m(interfaceC38132a, "ull", matchStrength);
                }
                if (iM86777k == 116) {
                    return m86779m(interfaceC38132a, "rue", matchStrength);
                }
                if (iM86777k == 102) {
                    return m86779m(interfaceC38132a, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    /* JADX INFO: renamed from: j */
    public static int m86776j(InterfaceC38132a interfaceC38132a) throws IOException {
        if (!interfaceC38132a.mo86052a()) {
            return -1;
        }
        return m86777k(interfaceC38132a, interfaceC38132a.nextByte());
    }

    /* JADX INFO: renamed from: l */
    public static int m86778l(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 == 187) {
            int unsignedByte3 = dataInput.readUnsignedByte();
            if (unsignedByte3 == 191) {
                return dataInput.readUnsignedByte();
            }
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
    }

    /* JADX INFO: renamed from: m */
    public static MatchStrength m86779m(InterfaceC38132a interfaceC38132a, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!interfaceC38132a.mo86052a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC38132a.nextByte() != str.charAt(i11)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86780a(int i11) {
        if ((65280 & i11) == 0) {
            this.f86307g = true;
        } else {
            if ((i11 & 255) != 0) {
                return false;
            }
            this.f86307g = false;
        }
        this.f86308h = 2;
        return true;
    }

    public C38463a(C6310d c6310d, byte[] bArr, int i11, int i12) {
        this.f86307g = true;
        this.f86301a = c6310d;
        this.f86302b = null;
        this.f86303c = bArr;
        this.f86304d = i11;
        this.f86305e = i11 + i12;
        this.f86306f = false;
    }
}
