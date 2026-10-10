package com.google.zxing;

/* JADX INFO: loaded from: classes56.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i11, byte[] bArr);

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource crop(int i11, int i12, int i13, int i14) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c11;
        int i11 = this.width;
        byte[] row = new byte[i11];
        StringBuilder sb2 = new StringBuilder(this.height * (i11 + 1));
        for (int i12 = 0; i12 < this.height; i12++) {
            row = getRow(i12, row);
            for (int i13 = 0; i13 < this.width; i13++) {
                int i14 = row[i13] & 255;
                if (i14 < 64) {
                    c11 = '#';
                } else if (i14 < 128) {
                    c11 = '+';
                } else {
                    c11 = i14 < 192 ? '.' : ' ';
                }
                sb2.append(c11);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public LuminanceSource(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }
}
