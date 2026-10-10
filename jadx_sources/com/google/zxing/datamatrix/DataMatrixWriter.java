package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class DataMatrixWriter implements Writer {
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12) {
        return encode(str, barcodeFormat, i11, i12, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i11 + 'x' + i12);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        Dimension dimension2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension3 == null) {
                dimension3 = null;
            }
            dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = dimension3;
        } else {
            dimension = null;
        }
        String strEncodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension2, dimension);
        SymbolInfo symbolInfoLookup = SymbolInfo.lookup(strEncodeHighLevel.length(), symbolShapeHint, dimension2, dimension, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(strEncodeHighLevel, symbolInfoLookup), symbolInfoLookup.getSymbolDataWidth(), symbolInfoLookup.getSymbolDataHeight());
        defaultPlacement.place();
        return encodeLowLevel(defaultPlacement, symbolInfoLookup, i11, i12);
    }

    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int i11, int i12) {
        BitMatrix bitMatrix;
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int iMax = Math.max(i11, width);
        int iMax2 = Math.max(i12, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i13 = (iMax - (width * iMin)) / 2;
        int i14 = (iMax2 - (height * iMin)) / 2;
        if (i12 >= height && i11 >= width) {
            bitMatrix = new BitMatrix(i11, i12);
        } else {
            bitMatrix = new BitMatrix(width, height);
            i13 = 0;
            i14 = 0;
        }
        bitMatrix.clear();
        int i15 = 0;
        while (i15 < height) {
            int i16 = i13;
            int i17 = 0;
            while (i17 < width) {
                if (byteMatrix.get(i17, i15) == 1) {
                    bitMatrix.setRegion(i16, i14, iMin, iMin);
                }
                i17++;
                i16 += iMin;
            }
            i15++;
            i14 += iMin;
        }
        return bitMatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i11, int i12) {
        boolean z11;
        boolean z12;
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i13 = 0;
        for (int i14 = 0; i14 < symbolDataHeight; i14++) {
            if (i14 % symbolInfo.matrixHeight == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < symbolInfo.getSymbolWidth(); i16++) {
                    if (i16 % 2 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    byteMatrix.set(i15, i13, z12);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < symbolDataWidth; i18++) {
                if (i18 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i17, i13, true);
                    i17++;
                }
                byteMatrix.set(i17, i13, defaultPlacement.getBit(i18, i14));
                int i19 = i17 + 1;
                int i21 = symbolInfo.matrixWidth;
                if (i18 % i21 == i21 - 1) {
                    if (i14 % 2 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    byteMatrix.set(i19, i13, z11);
                    i17 += 2;
                } else {
                    i17 = i19;
                }
            }
            int i22 = i13 + 1;
            int i23 = symbolInfo.matrixHeight;
            if (i14 % i23 == i23 - 1) {
                int i24 = 0;
                for (int i25 = 0; i25 < symbolInfo.getSymbolWidth(); i25++) {
                    byteMatrix.set(i24, i22, true);
                    i24++;
                }
                i13 += 2;
            } else {
                i13 = i22;
            }
        }
        return convertByteMatrixToBitMatrix(byteMatrix, i11, i12);
    }
}
