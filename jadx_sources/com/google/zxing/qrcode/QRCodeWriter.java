package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class QRCodeWriter implements Writer {
    private static final int QUIET_ZONE_SIZE = 4;

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return encode(str, barcodeFormat, i11, i12, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i11 + 'x' + i12);
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        int i13 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i13 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        return renderResult(Encoder.encode(str, errorCorrectionLevelValueOf, map), i11, i12, i13);
    }

    private static BitMatrix renderResult(QRCode qRCode, int i11, int i12, int i13) {
        ByteMatrix matrix = qRCode.getMatrix();
        if (matrix != null) {
            int width = matrix.getWidth();
            int height = matrix.getHeight();
            int i14 = i13 << 1;
            int i15 = width + i14;
            int i16 = i14 + height;
            int iMax = Math.max(i11, i15);
            int iMax2 = Math.max(i12, i16);
            int iMin = Math.min(iMax / i15, iMax2 / i16);
            int i17 = (iMax - (width * iMin)) / 2;
            int i18 = (iMax2 - (height * iMin)) / 2;
            BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
            int i19 = 0;
            while (i19 < height) {
                int i21 = 0;
                int i22 = i17;
                while (i21 < width) {
                    if (matrix.get(i21, i19) == 1) {
                        bitMatrix.setRegion(i22, i18, iMin, iMin);
                    }
                    i21++;
                    i22 += iMin;
                }
                i19++;
                i18 += iMin;
            }
            return bitMatrix;
        }
        throw new IllegalStateException();
    }
}
