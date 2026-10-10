package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
abstract class AI01weightDecoder extends AI01decoder {
    public abstract void addWeightCode(StringBuilder sb2, int i11);

    public abstract int checkWeight(int i11);

    public AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public final void encodeCompressedWeight(StringBuilder sb2, int i11, int i12) {
        int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i11, i12);
        addWeightCode(sb2, iExtractNumericValueFromBitArray);
        int iCheckWeight = checkWeight(iExtractNumericValueFromBitArray);
        int i13 = 100000;
        for (int i14 = 0; i14 < 5; i14++) {
            if (iCheckWeight / i13 == 0) {
                sb2.append('0');
            }
            i13 /= 10;
        }
        sb2.append(iCheckWeight);
    }
}
