package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
abstract class AI01decoder extends AbstractExpandedDecoder {
    static final int GTIN_SIZE = 40;

    private static void appendCheckDigit(StringBuilder sb2, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int iCharAt = sb2.charAt(i13 + i11) - '0';
            if ((i13 & 1) == 0) {
                iCharAt *= 3;
            }
            i12 += iCharAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }

    public final void encodeCompressedGtinWithoutAI(StringBuilder sb2, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray((i13 * 10) + i11, 10);
            if (iExtractNumericValueFromBitArray / 100 == 0) {
                sb2.append('0');
            }
            if (iExtractNumericValueFromBitArray / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iExtractNumericValueFromBitArray);
        }
        appendCheckDigit(sb2, i12);
    }

    public final void encodeCompressedGtin(StringBuilder sb2, int i11) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        encodeCompressedGtinWithoutAI(sb2, i11, length);
    }

    public AI01decoder(BitArray bitArray) {
        super(bitArray);
    }
}
