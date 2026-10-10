package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes34.dex */
public final class AFk1qSDK extends FilterInputStream {
    private int AFKeystoreWrapper;
    private final byte[] areAllFieldsValid;
    private final byte[][] component1;
    private final int[] component2;
    private final int[] component3;
    private final int component4;
    private final int copy;
    private int copydefault;
    private int equals;
    private final byte[] hashCode;
    private int registerClient;
    private final int toString;
    private static final byte[] AFAdRevenueData = AFk1vSDK.getRevenue;
    private static final int[] getRevenue = AFk1vSDK.AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code = AFk1vSDK.getMediationNetwork;
    private static final int[] getMediationNetwork = AFk1vSDK.getCurrencyIso4217Code;
    private static final int[] getMonetizationNetwork = AFk1vSDK.getMonetizationNetwork;

    public AFk1qSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i11, bArr, bArr2, (byte) 0);
    }

    private static byte[][] getCurrencyIso4217Code(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = new byte[bArr[i11].length];
            int i12 = 0;
            while (true) {
                byte[] bArr3 = bArr[i11];
                if (i12 < bArr3.length) {
                    bArr2[i11][bArr3[i12]] = (byte) i12;
                    i12++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i11 = this.AFKeystoreWrapper;
        if (i11 >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.hashCode;
        this.AFKeystoreWrapper = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    private AFk1qSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2, byte b11) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component2 = new int[4];
        this.areAllFieldsValid = new byte[16];
        this.hashCode = new byte[16];
        this.equals = 1;
        this.copydefault = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 16;
        this.registerClient = 16;
        this.component4 = i11;
        this.component3 = AFk1vSDK.getRevenue(bArr, i11);
        this.component1 = getCurrencyIso4217Code(bArr2);
        this.toString = 100;
        this.copy = 100;
    }

    private int AFAdRevenueData() throws IOException {
        if (this.copydefault == Integer.MAX_VALUE) {
            this.copydefault = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 16) {
            byte[] bArr = this.areAllFieldsValid;
            int i11 = this.copydefault;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i12, 16 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 16);
            if (i12 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.toString;
            if (i14 == this.copy) {
                getMonetizationNetwork(this.areAllFieldsValid, this.hashCode);
            } else {
                if (this.equals <= i14) {
                    getMonetizationNetwork(this.areAllFieldsValid, this.hashCode);
                } else {
                    byte[] bArr2 = this.areAllFieldsValid;
                    System.arraycopy(bArr2, 0, this.hashCode, 0, bArr2.length);
                }
                int i15 = this.equals;
                if (i15 < this.copy) {
                    this.equals = i15 + 1;
                } else {
                    this.equals = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.copydefault = i16;
            this.AFKeystoreWrapper = 0;
            this.registerClient = i16 < 0 ? 16 - (this.hashCode[15] & 255) : 16;
        }
        return this.registerClient;
    }

    private void getMonetizationNetwork(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component2;
        char c11 = 1;
        char c12 = 2;
        char c13 = '\b';
        char c14 = 3;
        int i11 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component3;
        iArr[0] = i11 ^ iArr2[0];
        char c15 = 5;
        char c16 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c17 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i12 = 1;
        int i13 = 4;
        while (i12 < this.component4) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component2;
            char c18 = c11;
            byte[][] bArr3 = this.component1;
            byte[] bArr4 = bArr3[0];
            int i14 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getCurrencyIso4217Code;
            byte[] bArr5 = bArr3[c18];
            char c19 = c12;
            int i15 = i14 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMediationNetwork;
            byte[] bArr6 = bArr3[c19];
            char c21 = c14;
            int i16 = i15 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getMonetizationNetwork;
            byte[] bArr7 = bArr3[c21];
            char c22 = c13;
            int i17 = i16 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component3;
            int i18 = i17 ^ iArr8[i13];
            char c23 = c17;
            char c24 = c15;
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i13 + 1];
            int i21 = (((iArr3[iArr4[bArr4[c19]] >>> 24] ^ iArr5[(iArr4[bArr5[c19]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c19]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c19]] & 255]) ^ iArr8[i13 + 2];
            int i22 = (((iArr3[iArr4[bArr4[c21]] >>> 24] ^ iArr5[(iArr4[bArr5[c21]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c21]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c21]] & 255]) ^ iArr8[i13 + 3];
            iArr4[0] = i18;
            iArr4[c18] = i19;
            iArr4[c19] = i21;
            iArr4[c21] = i22;
            i12++;
            i13 += 4;
            c11 = c18;
            c12 = c19;
            c14 = c21;
            c13 = c22;
            c15 = c24;
            c17 = c23;
            c16 = c16;
        }
        char c25 = c11;
        char c26 = c12;
        char c27 = c14;
        char c28 = c13;
        char c29 = c17;
        int[] iArr9 = this.component3;
        int i23 = iArr9[i13];
        byte[] bArr8 = AFAdRevenueData;
        int[] iArr10 = this.component2;
        byte[][] bArr9 = this.component1;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i23 >>> 24));
        byte[] bArr11 = bArr9[c25];
        bArr2[c25] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i23 >>> 16));
        byte[] bArr12 = bArr9[c26];
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i23 >>> 8));
        byte[] bArr13 = bArr9[c27];
        bArr2[c27] = (byte) (i23 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i24 = iArr9[i13 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c25]] >>> 24] ^ (i24 >>> 24));
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr11[c25]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c16] = (byte) (bArr8[(iArr10[bArr12[c25]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[7] = (byte) (i24 ^ bArr8[iArr10[bArr13[c25]] & 255]);
        int i25 = iArr9[i13 + 2];
        bArr2[c28] = (byte) (bArr8[iArr10[bArr10[c26]] >>> 24] ^ (i25 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c26]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c26]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[11] = (byte) (i25 ^ bArr8[iArr10[bArr13[c26]] & 255]);
        int i26 = iArr9[i13 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c27]] >>> 24] ^ (i26 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c27]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[c29] = (byte) (bArr8[(iArr10[bArr12[c27]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[15] = (byte) (i26 ^ bArr8[iArr10[bArr13[c27]] & 255]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long j12 = 0;
        while (j12 < j11 && read() != -1) {
            j12++;
        }
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.registerClient - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFAdRevenueData();
            int i15 = this.AFKeystoreWrapper;
            if (i15 >= this.registerClient) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.hashCode;
            this.AFKeystoreWrapper = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
