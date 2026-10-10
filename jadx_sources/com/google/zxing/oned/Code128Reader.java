package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:102:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0172  */
    /* JADX WARN: Code duplicated, block: B:104:0x0175  */
    /* JADX WARN: Code duplicated, block: B:107:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0181  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[LOOP:1: B:23:0x007b->B:24:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r3 r9 r17 r21
      0x00a3: PHI (r3v7 boolean) = 
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v12 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
     binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r9v4 boolean) = 
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v11 boolean)
      (r9v12 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
     binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r17v2 boolean) = 
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v5 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
     binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r21v3 boolean) = 
      (r21v2 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v11 boolean)
      (r21v14 boolean)
      (r21v17 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
     binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[PHI: r21
      0x00da: PHI (r21v16 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:81:0x0134, B:52:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1 A[PHI: r21
      0x00e1: PHI (r21v15 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:84:0x0139, B:55:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[PHI: r21
      0x00e3: PHI (r21v14 boolean) = (r21v9 boolean), (r21v9 boolean), (r21v18 boolean), (r21v18 boolean) binds: [B:83:0x0137, B:84:0x0139, B:54:0x00dd, B:55:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[PHI: r21
      0x00ed: PHI (r21v12 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:70:0x0114, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[PHI: r21
      0x00f9: PHI (r21v11 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:69:0x0112, B:43:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e A[PHI: r10 r21
      0x012e: PHI (r10v7 char) = (r10v5 char), (r10v9 char) binds: [B:96:0x0159, B:77:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r21v8 boolean) = (r21v5 boolean), (r21v9 boolean) binds: [B:96:0x0159, B:77:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0141  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:93:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0155  */
    /* JADX WARN: Code duplicated, block: B:96:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x00b3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int r27, com.google.zxing.common.BitArray r28, java.util.Map<com.google.zxing.DecodeHintType, ?> r29) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Reader.decodeRow(int, com.google.zxing.common.BitArray, java.util.Map):com.google.zxing.Result");
    }

    private static int decodeCode(BitArray bitArray, int[] iArr, int i11) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i11, iArr);
        float f11 = MAX_AVG_VARIANCE;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i13 >= iArr2.length) {
                break;
            }
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i13], 0.7f);
            if (fPatternMatchVariance < f11) {
                i12 = i13;
                f11 = fPatternMatchVariance;
            }
            i13++;
        }
        if (i12 >= 0) {
            return i12;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        boolean z11 = false;
        int i11 = 0;
        int i12 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z11) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == 5) {
                    int i13 = -1;
                    float f11 = MAX_AVG_VARIANCE;
                    for (int i14 = 103; i14 <= 105; i14++) {
                        float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i14], 0.7f);
                        if (fPatternMatchVariance < f11) {
                            i13 = i14;
                            f11 = fPatternMatchVariance;
                        }
                    }
                    if (i13 >= 0 && bitArray.isRange(Math.max(0, i12 - ((nextSet - i12) / 2)), i12, false)) {
                        return new int[]{i12, nextSet, i13};
                    }
                    i12 += iArr[0] + iArr[1];
                    int i15 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i15);
                    iArr[i15] = 0;
                    iArr[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z11 = !z11;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
