package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class ITFWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: N */
    private static final int f12797N = 1;

    /* JADX INFO: renamed from: W */
    private static final int f12798W = 3;
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[] END_PATTERN = {3, 1, 1};
    private static final int[][] PATTERNS = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.encode(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length <= 80) {
            boolean[] zArr = new boolean[(length * 9) + 9];
            int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, START_PATTERN, true);
            for (int i11 = 0; i11 < length; i11 += 2) {
                int iDigit = Character.digit(str.charAt(i11), 10);
                int iDigit2 = Character.digit(str.charAt(i11 + 1), 10);
                int[] iArr = new int[10];
                for (int i12 = 0; i12 < 5; i12++) {
                    int i13 = i12 * 2;
                    int[][] iArr2 = PATTERNS;
                    iArr[i13] = iArr2[iDigit][i12];
                    iArr[i13 + 1] = iArr2[iDigit2][i12];
                }
                iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr, true);
            }
            OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, END_PATTERN, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
