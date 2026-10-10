package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
public final class ByteMatrix {
    private final byte[][] bytes;
    private final int height;
    private final int width;

    public void set(int i11, int i12, byte b11) {
        this.bytes[i12][i11] = b11;
    }

    public void clear(byte b11) {
        for (byte[] bArr : this.bytes) {
            Arrays.fill(bArr, b11);
        }
    }

    public byte get(int i11, int i12) {
        return this.bytes[i12][i11];
    }

    public byte[][] getArray() {
        return this.bytes;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void set(int i11, int i12, int i13) {
        this.bytes[i12][i11] = (byte) i13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.width * 2 * this.height) + 2);
        for (int i11 = 0; i11 < this.height; i11++) {
            byte[] bArr = this.bytes[i11];
            for (int i12 = 0; i12 < this.width; i12++) {
                byte b11 = bArr[i12];
                if (b11 == 0) {
                    sb2.append(" 0");
                } else if (b11 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public ByteMatrix(int i11, int i12) {
        this.bytes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.width = i11;
        this.height = i12;
    }

    public void set(int i11, int i12, boolean z11) {
        this.bytes[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }
}
