package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.geetest.gtc4.i0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6780i0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f11389a;

    /* JADX INFO: renamed from: b */
    public final C6844p1 f11390b;

    /* JADX INFO: renamed from: a */
    public final int m12657a() throws C6853q1 {
        try {
            int i11 = this.f11389a.read();
            if (i11 != -1) {
                return i11;
            }
            throw new IOException("Unexpected end of stream");
        } catch (IOException e11) {
            throw new C6853q1(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m12660b(int i11) throws C6853q1 {
        switch (AbstractC6771h0.f11377a[EnumC6798k0.ofByte(i11).ordinal()]) {
            case 1:
                return BigInteger.valueOf(i11 & 31);
            case 2:
                return BigInteger.valueOf(m12657a());
            case 3:
                byte[] bArrM12661c = m12661c(2);
                return BigInteger.valueOf(((long) ((bArrM12661c[0] & 255) << 8)) | ((long) (bArrM12661c[1] & 255)));
            case 4:
                byte[] bArrM12661c2 = m12661c(4);
                return BigInteger.valueOf((((long) (bArrM12661c2[1] & 255)) << 16) | (((long) (bArrM12661c2[0] & 255)) << 24) | (((long) (bArrM12661c2[2] & 255)) << 8) | ((long) (bArrM12661c2[3] & 255)));
            case 5:
                BigInteger bigInteger = BigInteger.ZERO;
                byte[] bArrM12661c3 = m12661c(8);
                return bigInteger.or(BigInteger.valueOf(bArrM12661c3[0] & 255).shiftLeft(56)).or(BigInteger.valueOf(bArrM12661c3[1] & 255).shiftLeft(48)).or(BigInteger.valueOf(bArrM12661c3[2] & 255).shiftLeft(40)).or(BigInteger.valueOf(bArrM12661c3[3] & 255).shiftLeft(32)).or(BigInteger.valueOf(bArrM12661c3[4] & 255).shiftLeft(24)).or(BigInteger.valueOf(bArrM12661c3[5] & 255).shiftLeft(16)).or(BigInteger.valueOf(bArrM12661c3[6] & 255).shiftLeft(8)).or(BigInteger.valueOf(bArrM12661c3[7] & 255).shiftLeft(0));
            case 6:
                return BigInteger.valueOf(-1L);
            default:
                throw new C6853q1("Reserved additional information");
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m12661c(int i11) throws C6853q1 {
        try {
            byte[] bArr = new byte[i11];
            int i12 = this.f11389a.read(bArr);
            if (i12 != i11) {
                if (i12 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                int i13 = i11 - i12;
                while (i13 > 0) {
                    int i14 = this.f11389a.read(bArr, i11 - i13, i13);
                    if (i14 == -1) {
                        throw new IOException("Unexpected end of stream");
                    }
                    i13 -= i14;
                }
            }
            return bArr;
        } catch (IOException e11) {
            throw new C6853q1(e11);
        }
    }

    public AbstractC6780i0(C6844p1 c6844p1, InputStream inputStream) {
        this.f11390b = c6844p1;
        this.f11389a = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m12659a(long j11) throws C6853q1 {
        if (j11 <= 2147483647L) {
            int i11 = (int) j11;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.abs(i11));
            if (j11 > 4096) {
                j11 = 4096;
            }
            int i12 = (int) j11;
            byte[] bArr = new byte[i12];
            while (i11 > 0) {
                try {
                    int i13 = this.f11389a.read(bArr, 0, i11 > i12 ? i12 : i11);
                    if (i13 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i13);
                        i11 -= i13;
                    } else {
                        throw new IOException("Unexpected end of stream");
                    }
                } catch (IOException e11) {
                    throw new C6853q1(e11);
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new C6853q1("Decoding fixed size items is limited to INTMAX");
    }

    /* JADX INFO: renamed from: a */
    public final long m12658a(int i11) throws C6853q1 {
        switch (AbstractC6771h0.f11377a[EnumC6798k0.ofByte(i11).ordinal()]) {
            case 1:
                return i11 & 31;
            case 2:
                return m12657a();
            case 3:
                byte[] bArrM12661c = m12661c(2);
                return ((long) ((bArrM12661c[0] & 255) << 8)) | ((long) (bArrM12661c[1] & 255));
            case 4:
                byte[] bArrM12661c2 = m12661c(4);
                return (((long) (bArrM12661c2[1] & 255)) << 16) | (((long) (bArrM12661c2[0] & 255)) << 24) | (((long) (bArrM12661c2[2] & 255)) << 8) | ((long) (bArrM12661c2[3] & 255));
            case 5:
                byte[] bArrM12661c3 = m12661c(8);
                return (((long) (bArrM12661c3[5] & 255)) << 16) | (((long) (bArrM12661c3[4] & 255)) << 24) | (((long) (bArrM12661c3[1] & 255)) << 48) | (((long) (bArrM12661c3[0] & 255)) << 56) | (((long) (bArrM12661c3[2] & 255)) << 40) | (((long) (bArrM12661c3[3] & 255)) << 32) | (((long) (bArrM12661c3[6] & 255)) << 8) | ((long) (bArrM12661c3[7] & 255));
            case 6:
                return -1L;
            default:
                throw new C6853q1("Reserved additional information");
        }
    }
}
