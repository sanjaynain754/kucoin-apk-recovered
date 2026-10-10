package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes56.dex */
@Deprecated
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:40:0x0057  */
    /* JADX WARN: Code duplicated, block: B:68:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0031 A[EDGE_INSN: B:69:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0031 A[EDGE_INSN: B:72:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0068 A[EDGE_INSN: B:86:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0068 A[EDGE_INSN: B:88:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0068 A[EDGE_INSN: B:90:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0053 A[SYNTHETIC] */
    private int[] blackWhiteRange(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        BitMatrix bitMatrix;
        int i16;
        BitMatrix bitMatrix2;
        int i17 = (i13 + i14) / 2;
        int i18 = i17;
        while (i18 >= i13) {
            BitMatrix bitMatrix3 = this.image;
            if (!z11) {
                if (!bitMatrix3.get(i11, i18)) {
                    i16 = i18;
                    while (true) {
                        i16--;
                        if (i16 >= i13) {
                            break;
                            break;
                        }
                        bitMatrix2 = this.image;
                        if (z11) {
                            if (bitMatrix2.get(i16, i11)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix2.get(i11, i16)) {
                            break;
                            break;
                        }
                    }
                    int i19 = i18 - i16;
                    if (i16 < i13) {
                        break;
                    }
                    break;
                    break;
                }
                i18--;
            } else if (bitMatrix3.get(i18, i11)) {
                i18--;
            } else {
                i16 = i18;
                while (true) {
                    i16--;
                    if (i16 >= i13) {
                        break;
                    }
                    bitMatrix2 = this.image;
                    if (z11) {
                        if (bitMatrix2.get(i16, i11)) {
                            break;
                        }
                    } else if (bitMatrix2.get(i11, i16)) {
                        break;
                    }
                }
                int i110 = i18 - i16;
                if (i16 < i13 || i110 > i12) {
                    break;
                }
                i18 = i16;
            }
        }
        int i21 = i18 + 1;
        while (i17 < i14) {
            BitMatrix bitMatrix4 = this.image;
            if (!z11) {
                if (!bitMatrix4.get(i11, i17)) {
                    i15 = i17;
                    while (true) {
                        i15++;
                        if (i15 < i14) {
                            break;
                            break;
                        }
                        bitMatrix = this.image;
                        if (z11) {
                            if (bitMatrix.get(i15, i11)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix.get(i11, i15)) {
                            break;
                            break;
                        }
                    }
                    int i22 = i15 - i17;
                    if (i15 >= i14) {
                        break;
                    }
                    break;
                    break;
                }
                i17++;
            } else if (bitMatrix4.get(i17, i11)) {
                i17++;
            } else {
                i15 = i17;
                while (true) {
                    i15++;
                    if (i15 < i14) {
                        break;
                    }
                    bitMatrix = this.image;
                    if (z11) {
                        if (bitMatrix.get(i15, i11)) {
                            break;
                        }
                    } else if (bitMatrix.get(i11, i15)) {
                        break;
                    }
                }
                int i23 = i15 - i17;
                if (i15 >= i14 || i23 > i12) {
                    break;
                }
                i17 = i15;
            }
        }
        int i24 = i17 - 1;
        if (i24 > i21) {
            return new int[]{i21, i24};
        }
        return null;
    }

    private ResultPoint findCornerFromCenter(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws NotFoundException {
        int[] iArr = null;
        int i21 = i11;
        int i22 = i15;
        while (i22 < i18 && i22 >= i17 && i21 < i14 && i21 >= i13) {
            int[] iArrBlackWhiteRange = i12 == 0 ? blackWhiteRange(i22, i19, i13, i14, true) : blackWhiteRange(i21, i19, i17, i18, false);
            if (iArrBlackWhiteRange == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i12 == 0) {
                    int i23 = i22 - i16;
                    int i24 = iArr[0];
                    if (i24 >= i11) {
                        return new ResultPoint(iArr[1], i23);
                    }
                    if (iArr[1] > i11) {
                        return new ResultPoint(iArr[i16 <= 0 ? (char) 1 : (char) 0], i23);
                    }
                    return new ResultPoint(i24, i23);
                }
                int i25 = i21 - i12;
                int i26 = iArr[0];
                if (i26 >= i15) {
                    return new ResultPoint(i25, iArr[1]);
                }
                if (iArr[1] > i15) {
                    return new ResultPoint(i25, iArr[i12 >= 0 ? (char) 1 : (char) 0]);
                }
                return new ResultPoint(i25, i26);
            }
            i22 += i16;
            i21 += i12;
            iArr = iArrBlackWhiteRange;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i11 = height / 2;
        int i12 = width / 2;
        int iMax = Math.max(1, height / 256);
        int iMax2 = Math.max(1, width / 256);
        int i13 = -iMax;
        int i14 = i12 / 2;
        int y11 = ((int) findCornerFromCenter(i12, 0, 0, width, i11, i13, 0, height, i14).getY()) - 1;
        int i15 = i11 / 2;
        ResultPoint resultPointFindCornerFromCenter = findCornerFromCenter(i12, -iMax2, 0, width, i11, 0, y11, height, i15);
        int x11 = ((int) resultPointFindCornerFromCenter.getX()) - 1;
        ResultPoint resultPointFindCornerFromCenter2 = findCornerFromCenter(i12, iMax2, x11, width, i11, 0, y11, height, i15);
        int x12 = ((int) resultPointFindCornerFromCenter2.getX()) + 1;
        ResultPoint resultPointFindCornerFromCenter3 = findCornerFromCenter(i12, 0, x11, x12, i11, iMax, y11, height, i14);
        return new ResultPoint[]{findCornerFromCenter(i12, 0, x11, x12, i11, i13, y11, ((int) resultPointFindCornerFromCenter3.getY()) + 1, i12 / 4), resultPointFindCornerFromCenter, resultPointFindCornerFromCenter2, resultPointFindCornerFromCenter3};
    }

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }
}
