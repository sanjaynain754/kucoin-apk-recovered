package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes34.dex */
public final class AFk1uSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private short component1;
    private byte[] component2;
    private long[] component3;
    private int component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private long[] getMonetizationNetwork;
    private int getRevenue;

    public AFk1uSDK(InputStream inputStream, int i11, int i12, short s11, int i13, int i14) throws IOException {
        this(inputStream, i11, i12, s11, i13, i14, (byte) 0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i11 = this.component4;
        if (i11 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component2;
        this.component4 = i11 + 1;
        return bArr[i11] & 255;
    }

    private AFk1uSDK(InputStream inputStream, int i11, int i12, short s11, int i13, int i14, byte b11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.areAllFieldsValid = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s11, 4), 8);
        this.AFAdRevenueData = iMin;
        this.component2 = new byte[iMin];
        this.getMonetizationNetwork = new long[4];
        this.component3 = new long[4];
        this.component4 = iMin;
        this.equals = iMin;
        this.getMonetizationNetwork = AFk1rSDK.AFAdRevenueData(i11 ^ i14, iMin ^ i14);
        this.component3 = AFk1rSDK.AFAdRevenueData(i12 ^ i14, i13 ^ i14);
        this.getMediationNetwork = 100;
        this.getCurrencyIso4217Code = 100;
    }

    private int AFAdRevenueData() throws IOException {
        int i11;
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == this.AFAdRevenueData) {
            byte[] bArr = this.component2;
            int i12 = this.areAllFieldsValid;
            bArr[0] = (byte) i12;
            if (i12 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = 1;
            do {
                int i14 = ((FilterInputStream) this).in.read(this.component2, i13, this.AFAdRevenueData - i13);
                if (i14 <= 0) {
                    break;
                }
                i13 += i14;
            } while (i13 < this.AFAdRevenueData);
            if (i13 < this.AFAdRevenueData) {
                throw new IllegalStateException("unexpected block size");
            }
            int i15 = this.getMediationNetwork;
            if (i15 == this.getCurrencyIso4217Code) {
                getMediationNetwork();
            } else {
                if (this.getRevenue <= i15) {
                    getMediationNetwork();
                }
                int i16 = this.getRevenue;
                if (i16 < this.getCurrencyIso4217Code) {
                    this.getRevenue = i16 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i17 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i17;
            this.component4 = 0;
            if (i17 < 0) {
                int i18 = this.AFAdRevenueData;
                i11 = i18 - (this.component2[i18 - 1] & 255);
            } else {
                i11 = this.AFAdRevenueData;
            }
            this.equals = i11;
        }
        return this.equals;
    }

    private void getMediationNetwork() {
        long[] jArr = this.getMonetizationNetwork;
        long[] jArr2 = this.component3;
        short s11 = this.component1;
        long j11 = jArr[s11 % 4] * 2147483085;
        long j12 = jArr2[(s11 + 2) % 4];
        int i11 = (s11 + 3) % 4;
        jArr2[i11] = ((jArr[i11] * 2147483085) + j12) / 2147483647L;
        jArr[i11] = (j11 + j12) % 2147483647L;
        for (int i12 = 0; i12 < this.AFAdRevenueData; i12++) {
            byte[] bArr = this.component2;
            bArr[i12] = (byte) (((long) bArr[i12]) ^ ((this.getMonetizationNetwork[this.component1] >> (i12 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
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
        return this.equals - this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFAdRevenueData();
            int i15 = this.component4;
            if (i15 >= this.equals) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.component2;
            this.component4 = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
