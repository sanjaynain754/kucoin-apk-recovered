package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
final class AI013x0x1xDecoder extends AI01weightDecoder {
    private static final int DATE_SIZE = 16;
    private static final int HEADER_SIZE = 8;
    private static final int WEIGHT_SIZE = 20;
    private final String dateCode;
    private final String firstAIdigits;

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public void addWeightCode(StringBuilder sb2, int i11) {
        sb2.append('(');
        sb2.append(this.firstAIdigits);
        sb2.append(i11 / 100000);
        sb2.append(')');
    }

    public AI013x0x1xDecoder(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.dateCode = str2;
        this.firstAIdigits = str;
    }

    private void encodeCompressedDate(StringBuilder sb2, int i11) {
        int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i11, 16);
        if (iExtractNumericValueFromBitArray == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.dateCode);
        sb2.append(')');
        int i12 = iExtractNumericValueFromBitArray % 32;
        int i13 = iExtractNumericValueFromBitArray / 32;
        int i14 = (i13 % 12) + 1;
        int i15 = i13 / 12;
        if (i15 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i15);
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i12 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i12);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public int checkWeight(int i11) {
        return i11 % 100000;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException {
        if (getInformation().getSize() == 84) {
            StringBuilder sb2 = new StringBuilder();
            encodeCompressedGtin(sb2, 8);
            encodeCompressedWeight(sb2, 48, 20);
            encodeCompressedDate(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
