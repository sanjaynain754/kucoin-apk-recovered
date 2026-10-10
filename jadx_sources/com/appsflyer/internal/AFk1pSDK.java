package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes34.dex */
public final class AFk1pSDK extends FilterInputStream {
    private static final short getRevenue = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int AFInAppEventType;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private final int copy;
    private int copydefault;
    private int equals;
    private int getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private final int hashCode;
    private int toString;

    public AFk1pSDK(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13) throws IOException {
        this(inputStream, iArr, i11, bArr, i12, i13, (byte) 0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i11 = this.getCurrencyIso4217Code;
        if (i11 >= this.component3) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getCurrencyIso4217Code = i11 + 1;
        return bArr[i11] & 255;
    }

    private AFk1pSDK(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13, byte b11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = Integer.MAX_VALUE;
        this.AFInAppEventType = 1;
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getCurrencyIso4217Code = 8;
        this.component3 = 8;
        this.component4 = Math.min(Math.max(i12, 5), 16);
        this.component1 = i13;
        if (i13 == 3) {
            System.arraycopy(bArr, 0, this.getMonetizationNetwork, 0, 8);
        }
        long j11 = (((long) iArr[1]) & KeyboardMap.kValueMask) | ((((long) iArr[0]) & KeyboardMap.kValueMask) << 32);
        if (i11 == 0) {
            this.component2 = (int) j11;
            long j12 = j11 >> 3;
            short s11 = getRevenue;
            this.equals = (int) ((((long) s11) * j12) >> 32);
            this.copydefault = (int) (j11 >> 32);
            this.toString = (int) (j12 + ((long) s11));
        } else {
            int i14 = (int) j11;
            this.component2 = i14;
            this.equals = i14 * i11;
            this.copydefault = i11 ^ i14;
            this.toString = (int) (j11 >> 32);
        }
        this.hashCode = 100;
        this.copy = 100;
    }

    private void AFAdRevenueData() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z11 = true;
        char c11 = 2;
        int i11 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = 0;
        while (true) {
            int i14 = this.component4;
            if (i13 >= i14) {
                break;
            }
            short s11 = getRevenue;
            i12 -= ((((i14 - i13) * s11) + i11) ^ ((i11 << 4) + this.copydefault)) ^ ((i11 >>> 5) + this.toString);
            i11 -= (((i12 << 4) + this.component2) ^ ((s11 * (i14 - i13)) + i12)) ^ ((i12 >>> 5) + this.equals);
            i13++;
            c11 = c11;
            z11 = z11;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i11 >> 24);
        bArr3[z11 ? 1 : 0] = (byte) (i11 >> 16);
        bArr3[c11] = (byte) (i11 >> 8);
        bArr3[3] = (byte) i11;
        bArr3[4] = (byte) (i12 >> 24);
        bArr3[5] = (byte) (i12 >> 16);
        bArr3[6] = (byte) (i12 >> 8);
        bArr3[7] = (byte) i12;
        if (this.component1 == 3) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.getMonetizationNetwork[i15]);
            }
            byte[] bArr5 = this.AFAdRevenueData;
            System.arraycopy(bArr5, 0, this.getMonetizationNetwork, 0, bArr5.length);
        }
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.getCurrencyIso4217Code == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i11 = this.areAllFieldsValid;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.hashCode;
            if (i14 == this.copy) {
                AFAdRevenueData();
            } else {
                if (this.AFInAppEventType <= i14) {
                    AFAdRevenueData();
                }
                int i15 = this.AFInAppEventType;
                if (i15 < this.copy) {
                    this.AFInAppEventType = i15 + 1;
                } else {
                    this.AFInAppEventType = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i16;
            this.getCurrencyIso4217Code = 0;
            this.component3 = i16 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component3;
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
        getMonetizationNetwork();
        return this.component3 - this.getCurrencyIso4217Code;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getMonetizationNetwork();
            int i15 = this.getCurrencyIso4217Code;
            if (i15 >= this.component3) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getCurrencyIso4217Code = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
