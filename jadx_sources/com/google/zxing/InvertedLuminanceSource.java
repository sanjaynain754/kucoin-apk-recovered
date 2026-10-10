package com.google.zxing;

/* JADX INFO: loaded from: classes56.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    private final LuminanceSource delegate;

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i11, int i12, int i13, int i14) {
        return new InvertedLuminanceSource(this.delegate.crop(i11, i12, i13, i14));
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] matrix = this.delegate.getMatrix();
        int width = getWidth() * getHeight();
        byte[] bArr = new byte[width];
        for (int i11 = 0; i11 < width; i11++) {
            bArr[i11] = (byte) (255 - (matrix[i11] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i11, byte[] bArr) {
        byte[] row = this.delegate.getRow(i11, bArr);
        int width = getWidth();
        for (int i12 = 0; i12 < width; i12++) {
            row[i12] = (byte) (255 - (row[i12] & 255));
        }
        return row;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
        return this.delegate;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.delegate.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.delegate.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise45());
    }

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.delegate = luminanceSource;
    }
}
