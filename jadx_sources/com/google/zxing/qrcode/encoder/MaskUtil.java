package com.google.zxing.qrcode.encoder;

/* JADX INFO: loaded from: classes56.dex */
final class MaskUtil {

    /* JADX INFO: renamed from: N1 */
    private static final int f12810N1 = 3;

    /* JADX INFO: renamed from: N2 */
    private static final int f12811N2 = 3;

    /* JADX INFO: renamed from: N3 */
    private static final int f12812N3 = 40;

    /* JADX INFO: renamed from: N4 */
    private static final int f12813N4 = 10;

    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        return applyMaskPenaltyRule1Internal(byteMatrix, true) + applyMaskPenaltyRule1Internal(byteMatrix, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    public static boolean getDataMaskBit(int i11, int i12, int i13) {
        int i14;
        int i15;
        switch (i11) {
            case 0:
                i13 += i12;
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 1:
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 2:
                i14 = i12 % 3;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 3:
                i14 = (i13 + i12) % 3;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 4:
                i13 /= 2;
                i12 /= 3;
                i13 += i12;
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i16 = i13 * i12;
                i14 = (i16 & 1) + (i16 % 3);
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i17 = i13 * i12;
                i15 = (i17 & 1) + (i17 % 3);
                i14 = i15 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 7:
                i15 = ((i13 * i12) % 3) + ((i13 + i12) & 1);
                i14 = i15 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i11)));
        }
    }

    private static boolean isWhiteHorizontal(byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, bArr.length);
        for (int iMax = Math.max(i11, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWhiteVertical(byte[][] bArr, int i11, int i12, int i13) {
        int iMin = Math.min(i13, bArr.length);
        for (int iMax = Math.max(i12, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i11] == 1) {
                return false;
            }
        }
        return true;
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix byteMatrix, boolean z11) {
        int height = z11 ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z11 ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        int i11 = 0;
        for (int i12 = 0; i12 < height; i12++) {
            byte b11 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < width; i14++) {
                byte b12 = z11 ? array[i12][i14] : array[i14][i12];
                if (b12 == b11) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += i13 - 2;
                    }
                    i13 = 1;
                    b11 = b12;
                }
            }
            if (i13 >= 5) {
                i11 += i13 - 2;
            }
        }
        return i11;
    }

    private MaskUtil() {
    }

    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i11 = 0;
        for (int i12 = 0; i12 < height - 1; i12++) {
            byte[] bArr = array[i12];
            int i13 = 0;
            while (i13 < width - 1) {
                byte b11 = bArr[i13];
                int i14 = i13 + 1;
                if (b11 == bArr[i14]) {
                    byte[] bArr2 = array[i12 + 1];
                    if (b11 == bArr2[i13] && b11 == bArr2[i14]) {
                        i11++;
                    }
                }
                i13 = i14;
            }
        }
        return i11 * 3;
    }

    public static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i11 = 0;
        for (int i12 = 0; i12 < height; i12++) {
            for (int i13 = 0; i13 < width; i13++) {
                byte[] bArr = array[i12];
                int i14 = i13 + 6;
                if (i14 < width && bArr[i13] == 1 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 1 && bArr[i13 + 3] == 1 && bArr[i13 + 4] == 1 && bArr[i13 + 5] == 0 && bArr[i14] == 1 && (isWhiteHorizontal(bArr, i13 - 4, i13) || isWhiteHorizontal(bArr, i13 + 7, i13 + 11))) {
                    i11++;
                }
                int i15 = i12 + 6;
                if (i15 < height && array[i12][i13] == 1 && array[i12 + 1][i13] == 0 && array[i12 + 2][i13] == 1 && array[i12 + 3][i13] == 1 && array[i12 + 4][i13] == 1 && array[i12 + 5][i13] == 0 && array[i15][i13] == 1 && (isWhiteVertical(array, i13, i12 - 4, i12) || isWhiteVertical(array, i13, i12 + 7, i12 + 11))) {
                    i11++;
                }
            }
        }
        return i11 * 40;
    }

    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i11 = 0;
        for (int i12 = 0; i12 < height; i12++) {
            byte[] bArr = array[i12];
            for (int i13 = 0; i13 < width; i13++) {
                if (bArr[i13] == 1) {
                    i11++;
                }
            }
        }
        int height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        return ((Math.abs((i11 << 1) - height2) * 10) / height2) * 10;
    }
}
