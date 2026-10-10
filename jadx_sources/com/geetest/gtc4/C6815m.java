package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.geetest.gtc4.m */
/* JADX INFO: loaded from: classes45.dex */
public final class C6815m extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final int f11431a;

    /* JADX INFO: renamed from: b */
    public final boolean f11432b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f11433c;

    public C6815m(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    /* JADX INFO: renamed from: a */
    public static char[] m12680a(C6774h3 c6774h3) throws IOException {
        int i11 = c6774h3.f11382d;
        if ((i11 & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i12 = i11 / 2;
        char[] cArr = new char[i12];
        byte[] bArr = new byte[8];
        int i13 = 0;
        int i14 = 0;
        while (i11 >= 8) {
            if (AbstractC6814l7.m12675a(c6774h3, bArr, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i14] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i14 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i14 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i14 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i14 += 4;
            i11 -= 8;
        }
        if (i11 > 0) {
            if (AbstractC6814l7.m12675a(c6774h3, bArr, i11) != i11) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i15 = i13 + 1;
                int i16 = bArr[i13] << 8;
                i13 += 2;
                cArr[i14] = (char) ((bArr[i15] & 255) | i16);
                i14++;
            } while (i13 < i11);
        }
        if (c6774h3.f11382d == 0 && i12 == i14) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: b */
    public final C6761g m12683b(C6774h3 c6774h3) throws IOException {
        int i11 = c6774h3.f11382d;
        if (i11 < 1) {
            return new C6761g(0);
        }
        C6815m c6815m = new C6815m(c6774h3, i11, this.f11432b, this.f11433c);
        AbstractC6905w abstractC6905wM12681a = c6815m.m12681a();
        if (abstractC6905wM12681a == null) {
            return new C6761g(0);
        }
        C6761g c6761g = new C6761g(10);
        do {
            c6761g.m12634a(abstractC6905wM12681a);
            abstractC6905wM12681a = c6815m.m12681a();
        } while (abstractC6905wM12681a != null);
        return c6761g;
    }

    public C6815m(ByteArrayInputStream byteArrayInputStream, int i11, boolean z11) {
        super(byteArrayInputStream);
        this.f11431a = i11;
        this.f11432b = z11;
        this.f11433c = new byte[11][];
    }

    public C6815m(C6774h3 c6774h3, int i11, boolean z11, byte[][] bArr) {
        super(c6774h3);
        this.f11431a = i11;
        this.f11432b = z11;
        this.f11433c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12679a(C6774h3 c6774h3, byte[][] bArr) throws IOException {
        int i11 = c6774h3.f11382d;
        if (i11 >= bArr.length) {
            return c6774h3.m12654b();
        }
        byte[] bArr2 = bArr[i11];
        if (bArr2 == null) {
            bArr2 = new byte[i11];
            bArr[i11] = bArr2;
        }
        if (i11 != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i11 == 0) {
            return bArr2;
        }
        int i12 = c6774h3.f11451b;
        if (i11 < i12) {
            int iM12675a = i11 - AbstractC6814l7.m12675a(c6774h3.f11450a, bArr2, bArr2.length);
            c6774h3.f11382d = iM12675a;
            if (iM12675a == 0) {
                c6774h3.m12689a();
                return bArr2;
            }
            throw new EOFException("DEF length " + c6774h3.f11381c + " object truncated by " + c6774h3.f11382d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + c6774h3.f11382d + " >= " + i12);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6905w m12682a(int i11, int i12, int i13) throws IOException {
        C6934z2 c6934z2;
        C6934z2 c6934z3;
        C6774h3 c6774h3 = new C6774h3(this, i13, this.f11431a);
        if ((i11 & 224) == 0) {
            return m12678a(i12, c6774h3, this.f11433c);
        }
        int i14 = i11 & 192;
        int i15 = 0;
        if (i14 != 0) {
            if ((i11 & 32) != 0) {
                C6761g c6761gM12683b = m12683b(c6774h3);
                int i16 = c6761gM12683b.f11365b;
                if (i16 == 1) {
                    return new C6738d3(3, i14, i12, c6761gM12683b.m12633a(0));
                }
                C6934z2 c6934z4 = AbstractC6917x2.f11550a;
                if (i16 < 1) {
                    c6934z3 = AbstractC6917x2.f11550a;
                } else {
                    c6934z3 = new C6934z2(c6761gM12683b);
                }
                return new C6738d3(4, i14, i12, c6934z3);
            }
            return new C6738d3(4, i14, i12, new C6782i2(c6774h3.m12654b()));
        }
        if (i12 == 3) {
            C6761g c6761gM12683b2 = m12683b(c6774h3);
            int i17 = c6761gM12683b2.f11365b;
            AbstractC6716b[] abstractC6716bArr = new AbstractC6716b[i17];
            while (i15 != i17) {
                InterfaceC6752f interfaceC6752fM12633a = c6761gM12683b2.m12633a(i15);
                if (interfaceC6752fM12633a instanceof AbstractC6716b) {
                    abstractC6716bArr[i15] = (AbstractC6716b) interfaceC6752fM12633a;
                    i15++;
                } else {
                    throw new C6779i("unknown object encountered in constructed BIT STRING: " + interfaceC6752fM12633a.getClass());
                }
            }
            return new C6718b1(abstractC6716bArr);
        }
        if (i12 == 4) {
            C6761g c6761gM12683b3 = m12683b(c6774h3);
            int i18 = c6761gM12683b3.f11365b;
            AbstractC6869s[] abstractC6869sArr = new AbstractC6869s[i18];
            while (i15 != i18) {
                InterfaceC6752f interfaceC6752fM12633a2 = c6761gM12683b3.m12633a(i15);
                if (interfaceC6752fM12633a2 instanceof AbstractC6869s) {
                    abstractC6869sArr[i15] = (AbstractC6869s) interfaceC6752fM12633a2;
                    i15++;
                } else {
                    throw new C6779i("unknown object encountered in constructed OCTET STRING: " + interfaceC6752fM12633a2.getClass());
                }
            }
            return new C6745e1(abstractC6869sArr);
        }
        if (i12 == 8) {
            C6761g c6761gM12683b4 = m12683b(c6774h3);
            C6934z2 c6934z5 = AbstractC6917x2.f11550a;
            if (c6761gM12683b4.f11365b < 1) {
                c6934z2 = AbstractC6917x2.f11550a;
            } else {
                c6934z2 = new C6934z2(c6761gM12683b4);
            }
            return new C6908w2(c6934z2);
        }
        if (i12 != 16) {
            if (i12 == 17) {
                return AbstractC6917x2.m12743a(m12683b(c6774h3));
            }
            throw new IOException("unknown tag " + i12 + " encountered");
        }
        if (c6774h3.f11382d < 1) {
            return AbstractC6917x2.f11550a;
        }
        if (this.f11432b) {
            return new C6812l5(c6774h3.m12654b());
        }
        C6761g c6761gM12683b5 = m12683b(c6774h3);
        C6934z2 c6934z6 = AbstractC6917x2.f11550a;
        if (c6761gM12683b5.f11365b < 1) {
            return AbstractC6917x2.f11550a;
        }
        return new C6934z2(c6761gM12683b5);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6905w m12681a() throws IOException {
        int i11 = read();
        if (i11 <= 0) {
            if (i11 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iM12676a = m12676a(this, i11);
        int iM12677a = m12677a((InputStream) this, this.f11431a, false);
        if (iM12677a >= 0) {
            try {
                return m12682a(i11, iM12676a, iM12677a);
            } catch (IllegalArgumentException e11) {
                throw new C6779i("corrupted stream detected", e11);
            }
        }
        if ((i11 & 32) != 0) {
            C6726c0 c6726c0 = new C6726c0(new C6794j5(this, this.f11431a), this.f11431a, this.f11433c);
            int i12 = i11 & 192;
            if (i12 != 0) {
                return c6726c0.m12618a(i12, iM12676a);
            }
            if (iM12676a == 3) {
                C6880t1 c6880t1 = new C6880t1(c6726c0);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i13 = c6880t1.read(bArr, 0, 4096);
                    if (i13 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i13);
                    } else {
                        return new C6718b1(byteArrayOutputStream.toByteArray(), c6880t1.f11514c);
                    }
                }
            } else {
                if (iM12676a != 4) {
                    if (iM12676a == 8) {
                        try {
                            return new C6908w2(new C6934z2(c6726c0.m12617a()));
                        } catch (IllegalArgumentException e12) {
                            throw new C6779i(e12.getMessage(), e12);
                        }
                    }
                    if (iM12676a == 16) {
                        return new C6763g1(c6726c0.m12617a());
                    }
                    if (iM12676a == 17) {
                        return new C6781i1(c6726c0.m12617a());
                    }
                    throw new IOException("unknown BER object encountered");
                }
                C6889u1 c6889u1 = new C6889u1(c6726c0);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i14 = c6889u1.read(bArr2, 0, 4096);
                    if (i14 >= 0) {
                        byteArrayOutputStream2.write(bArr2, 0, i14);
                    } else {
                        return new C6745e1(byteArrayOutputStream2.toByteArray());
                    }
                }
            }
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m12676a(InputStream inputStream, int i11) throws IOException {
        int i12 = i11 & 31;
        if (i12 != 31) {
            return i12;
        }
        int i13 = inputStream.read();
        if (i13 < 31) {
            if (i13 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i14 = i13 & 127;
        if (i14 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i13 & 128) != 0) {
            if ((i14 >>> 24) == 0) {
                int i15 = i14 << 7;
                int i16 = inputStream.read();
                if (i16 < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                i14 = i15 | (i16 & 127);
                i13 = i16;
            } else {
                throw new IOException("Tag number more than 31 bits");
            }
        }
        return i14;
    }

    /* JADX INFO: renamed from: a */
    public static int m12677a(InputStream inputStream, int i11, boolean z11) throws IOException {
        int i12 = inputStream.read();
        if ((i12 >>> 7) == 0) {
            return i12;
        }
        if (128 == i12) {
            return -1;
        }
        if (i12 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i12) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i13 = i12 & 127;
        int i14 = 0;
        int i15 = 0;
        do {
            int i16 = inputStream.read();
            if (i16 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i14 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i14 = (i14 << 8) + i16;
            i15++;
        } while (i15 < i13);
        if (i14 < i11 || z11) {
            return i14;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i14 + " >= " + i11);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6905w m12678a(int i11, C6774h3 c6774h3, byte[][] bArr) throws IOException {
        try {
            switch (i11) {
                case 1:
                    byte[] bArrM12679a = m12679a(c6774h3, bArr);
                    if (bArrM12679a.length == 1) {
                        byte b11 = bArrM12679a[0];
                        if (b11 == -1) {
                            return C6743e.f11341c;
                        }
                        if (b11 != 0) {
                            return new C6743e(b11);
                        }
                        return C6743e.f11340b;
                    }
                    throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                case 2:
                    return new C6824n(c6774h3.m12654b());
                case 3:
                    return AbstractC6716b.m12604a(c6774h3.m12654b());
                case 4:
                    return new C6782i2(c6774h3.m12654b());
                case 5:
                    if (c6774h3.m12654b().length == 0) {
                        return C6764g2.f11367a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    int i12 = c6774h3.f11382d;
                    ConcurrentHashMap concurrentHashMap = C6851q.f11469c;
                    if (i12 <= 4096) {
                        byte[] bArrM12679a2 = m12679a(c6774h3, bArr);
                        if (bArrM12679a2.length <= 4096) {
                            C6851q c6851q = (C6851q) C6851q.f11469c.get(new C6842p(bArrM12679a2));
                            if (c6851q != null) {
                                return c6851q;
                            }
                            if (C6914x.m12742a(bArrM12679a2)) {
                                return new C6851q(AbstractC6834o0.m12687a(bArrM12679a2));
                            }
                            throw new IllegalArgumentException("invalid OID contents");
                        }
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    throw new IllegalArgumentException("exceeded OID contents length limit");
                case 7:
                    return new C6833o(new C6746e2(c6774h3.m12654b()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i11 + " encountered");
                case 10:
                    return C6770h.m12653a(m12679a(c6774h3, bArr), true);
                case 12:
                    return new C6854q2(c6774h3.m12654b());
                case 13:
                    int i13 = c6774h3.f11382d;
                    ConcurrentHashMap concurrentHashMap2 = C6914x.f11545c;
                    if (i13 <= 4096) {
                        byte[] bArrM12679a3 = m12679a(c6774h3, bArr);
                        if (bArrM12679a3.length <= 4096) {
                            C6914x c6914x = (C6914x) C6914x.f11545c.get(new C6842p(bArrM12679a3));
                            if (c6914x != null) {
                                return c6914x;
                            }
                            if (C6914x.m12742a(bArrM12679a3)) {
                                return new C6914x(AbstractC6834o0.m12687a(bArrM12679a3));
                            }
                            throw new IllegalArgumentException("invalid relative OID contents");
                        }
                        throw new IllegalArgumentException("exceeded relative OID contents length limit");
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i11 + " encountered");
                case 18:
                    return new C6773h2(c6774h3.m12654b());
                case 19:
                    return new C6809l2(c6774h3.m12654b());
                case 20:
                    return new C6836o2(c6774h3.m12654b());
                case 21:
                    return new C6872s2(c6774h3.m12654b());
                case 22:
                    return new C6755f2(c6774h3.m12654b());
                case 23:
                    return new C6744e0(c6774h3.m12654b());
                case 24:
                    return new C6797k(c6774h3.m12654b());
                case 25:
                    return new C6746e2(c6774h3.m12654b());
                case 26:
                    return new C6881t2(c6774h3.m12654b());
                case 27:
                    return new C6728c2(c6774h3.m12654b());
                case 28:
                    return new C6863r2(c6774h3.m12654b());
                case 30:
                    return new C6925y1(m12680a(c6774h3));
            }
        } catch (IllegalArgumentException e11) {
            throw new C6779i(e11.getMessage(), e11);
        } catch (IllegalStateException e12) {
            throw new C6779i(e12.getMessage(), e12);
        }
    }
}
