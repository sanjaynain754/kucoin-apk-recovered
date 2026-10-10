package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Decoder {
    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder = new ReedSolomonDecoder(GenericGF.MAXICODE_FIELD_64);

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, null);
    }

    private void correctErrors(byte[] bArr, int i11, int i12, int i13, int i14) throws ChecksumException {
        int i15 = i12 + i13;
        int i16 = i14 == 0 ? 1 : 2;
        int[] iArr = new int[i15 / i16];
        for (int i17 = 0; i17 < i15; i17++) {
            if (i14 == 0 || i17 % 2 == i14 - 1) {
                iArr[i17 / i16] = bArr[i17 + i11] & 255;
            }
        }
        try {
            this.rsDecoder.decode(iArr, i13 / i16);
            for (int i18 = 0; i18 < i12; i18++) {
                if (i14 == 0 || i18 % 2 == i14 - 1) {
                    bArr[i18 + i11] = (byte) iArr[i18 / i16];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        byte[] bArr;
        byte[] codewords = new BitMatrixParser(bitMatrix).readCodewords();
        correctErrors(codewords, 0, 10, 10, 0);
        int i11 = codewords[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            correctErrors(codewords, 20, 84, 40, 1);
            correctErrors(codewords, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i11 != 5) {
                throw FormatException.getFormatInstance();
            }
            correctErrors(codewords, 20, 68, 56, 1);
            correctErrors(codewords, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(codewords, 0, bArr, 0, 10);
        System.arraycopy(codewords, 20, bArr, 10, bArr.length - 10);
        return DecodedBitStreamParser.decode(bArr, i11);
    }
}
