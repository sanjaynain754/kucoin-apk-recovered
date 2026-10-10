package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes56.dex */
public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final ErrorCorrectionLevel[] FOR_BITS;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        ErrorCorrectionLevel errorCorrectionLevel2 = M;
        ErrorCorrectionLevel errorCorrectionLevel3 = Q;
        FOR_BITS = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, H, errorCorrectionLevel3};
    }

    public static ErrorCorrectionLevel forBits(int i11) {
        if (i11 >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = FOR_BITS;
            if (i11 < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i11];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }

    ErrorCorrectionLevel(int i11) {
        this.bits = i11;
    }
}
