package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
final class BitArrayBuilder {
    private BitArrayBuilder() {
    }

    public static BitArray buildBitArray(List<ExpandedPair> list) {
        int size = list.size() << 1;
        int i11 = size - 1;
        if (list.get(list.size() - 1).getRightChar() == null) {
            i11 = size - 2;
        }
        BitArray bitArray = new BitArray(i11 * 12);
        int i12 = 0;
        int value = list.get(0).getRightChar().getValue();
        for (int i13 = 11; i13 >= 0; i13--) {
            if (((1 << i13) & value) != 0) {
                bitArray.set(i12);
            }
            i12++;
        }
        for (int i14 = 1; i14 < list.size(); i14++) {
            ExpandedPair expandedPair = list.get(i14);
            int value2 = expandedPair.getLeftChar().getValue();
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & value2) != 0) {
                    bitArray.set(i12);
                }
                i12++;
            }
            if (expandedPair.getRightChar() != null) {
                int value3 = expandedPair.getRightChar().getValue();
                for (int i16 = 11; i16 >= 0; i16--) {
                    if (((1 << i16) & value3) != 0) {
                        bitArray.set(i12);
                    }
                    i12++;
                }
            }
        }
        return bitArray;
    }
}
