package com.google.zxing.common;

/* JADX INFO: loaded from: classes56.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i11) {
        if (i11 <= 0 || i11 > 32 || i11 > available()) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        int i12 = this.bitOffset;
        int i13 = 0;
        if (i12 > 0) {
            int i14 = 8 - i12;
            int i15 = i11 < i14 ? i11 : i14;
            int i16 = i14 - i15;
            byte[] bArr = this.bytes;
            int i17 = this.byteOffset;
            int i18 = (((255 >> (8 - i15)) << i16) & bArr[i17]) >> i16;
            i11 -= i15;
            int i19 = i12 + i15;
            this.bitOffset = i19;
            if (i19 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i17 + 1;
            }
            i13 = i18;
        }
        if (i11 > 0) {
            while (i11 >= 8) {
                int i21 = i13 << 8;
                byte[] bArr2 = this.bytes;
                int i22 = this.byteOffset;
                i13 = (bArr2[i22] & 255) | i21;
                this.byteOffset = i22 + 1;
                i11 -= 8;
            }
            if (i11 > 0) {
                int i23 = 8 - i11;
                int i24 = ((((255 >> i23) << i23) & this.bytes[this.byteOffset]) >> i23) | (i13 << i11);
                this.bitOffset += i11;
                return i24;
            }
        }
        return i13;
    }

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }
}
