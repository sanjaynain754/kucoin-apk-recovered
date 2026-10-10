package com.google.zxing.datamatrix.decoder;

/* JADX INFO: loaded from: classes56.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }

    private DataBlock(int i11, byte[] bArr) {
        this.numDataCodewords = i11;
        this.codewords = bArr;
    }

    public static DataBlock[] getDataBlocks(byte[] bArr, Version version) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        Version.ECBlocks eCBlocks = version.getECBlocks();
        Version.ECB[] eCBlocks2 = eCBlocks.getECBlocks();
        int count = 0;
        for (Version.ECB ecb : eCBlocks2) {
            count += ecb.getCount();
        }
        DataBlock[] dataBlockArr = new DataBlock[count];
        int i14 = 0;
        for (Version.ECB ecb2 : eCBlocks2) {
            int i15 = 0;
            while (i15 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i14] = new DataBlock(dataCodewords, new byte[eCBlocks.getECCodewords() + dataCodewords]);
                i15++;
                i14++;
            }
        }
        int length = dataBlockArr[0].codewords.length - eCBlocks.getECCodewords();
        int i16 = length - 1;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = 0;
            while (i19 < i14) {
                dataBlockArr[i19].codewords[i18] = bArr[i17];
                i19++;
                i17++;
            }
        }
        if (version.getVersionNumber() == 24) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = 8;
        } else {
            i11 = i14;
        }
        int i21 = 0;
        while (i21 < i11) {
            dataBlockArr[i21].codewords[i16] = bArr[i17];
            i21++;
            i17++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (length < length2) {
            int i22 = 0;
            while (i22 < i14) {
                if (z11) {
                    i12 = (i22 + 8) % i14;
                } else {
                    i12 = i22;
                }
                if (z11 && i12 > 7) {
                    i13 = length - 1;
                } else {
                    i13 = length;
                }
                dataBlockArr[i12].codewords[i13] = bArr[i17];
                i22++;
                i17++;
            }
            length++;
        }
        if (i17 == bArr.length) {
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }
}
