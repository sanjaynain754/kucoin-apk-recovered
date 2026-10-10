package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
final class AI01320xDecoder extends AI013x0xDecoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public void addWeightCode(StringBuilder sb2, int i11) {
        if (i11 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    public int checkWeight(int i11) {
        return i11 < 10000 ? i11 : i11 - 10000;
    }

    public AI01320xDecoder(BitArray bitArray) {
        super(bitArray);
    }
}
