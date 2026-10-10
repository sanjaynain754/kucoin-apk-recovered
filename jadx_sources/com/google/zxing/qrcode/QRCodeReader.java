package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class QRCodeReader implements Reader {
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        ResultPoint[] points;
        DecoderResult decoderResultDecode;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            DetectorResult detectorResultDetect = new Detector(binaryBitmap.getBlackMatrix()).detect(map);
            DecoderResult decoderResultDecode2 = this.decoder.decode(detectorResultDetect.getBits(), map);
            points = detectorResultDetect.getPoints();
            decoderResultDecode = decoderResultDecode2;
        } else {
            decoderResultDecode = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()), map);
            points = NO_POINTS;
        }
        if (decoderResultDecode.getOther() instanceof QRCodeDecoderMetaData) {
            ((QRCodeDecoderMetaData) decoderResultDecode.getOther()).applyMirroredCorrection(points);
        }
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), points, BarcodeFormat.QR_CODE);
        List<byte[]> byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        if (decoderResultDecode.hasStructuredAppend()) {
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(decoderResultDecode.getStructuredAppendSequenceNumber()));
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(decoderResultDecode.getStructuredAppendParity()));
        }
        return result;
    }

    public final Decoder getDecoder() {
        return this.decoder;
    }

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
        int[] topLeftOnBit = bitMatrix.getTopLeftOnBit();
        int[] bottomRightOnBit = bitMatrix.getBottomRightOnBit();
        if (topLeftOnBit != null && bottomRightOnBit != null) {
            float fModuleSize = moduleSize(topLeftOnBit, bitMatrix);
            int i11 = topLeftOnBit[1];
            int i12 = bottomRightOnBit[1];
            int i13 = topLeftOnBit[0];
            int i14 = bottomRightOnBit[0];
            if (i13 < i14 && i11 < i12) {
                int i15 = i12 - i11;
                if (i15 != i14 - i13 && (i14 = i13 + i15) >= bitMatrix.getWidth()) {
                    throw NotFoundException.getNotFoundInstance();
                }
                int iRound = Math.round(((i14 - i13) + 1) / fModuleSize);
                int iRound2 = Math.round((i15 + 1) / fModuleSize);
                if (iRound > 0 && iRound2 > 0) {
                    if (iRound2 == iRound) {
                        int i16 = (int) (fModuleSize / 2.0f);
                        int i17 = i11 + i16;
                        int i18 = i13 + i16;
                        int i19 = (((int) ((iRound - 1) * fModuleSize)) + i18) - i14;
                        if (i19 > 0) {
                            if (i19 <= i16) {
                                i18 -= i19;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        int i21 = (((int) ((iRound2 - 1) * fModuleSize)) + i17) - i12;
                        if (i21 > 0) {
                            if (i21 <= i16) {
                                i17 -= i21;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        BitMatrix bitMatrix2 = new BitMatrix(iRound, iRound2);
                        for (int i22 = 0; i22 < iRound2; i22++) {
                            int i23 = ((int) (i22 * fModuleSize)) + i17;
                            for (int i24 = 0; i24 < iRound; i24++) {
                                if (bitMatrix.get(((int) (i24 * fModuleSize)) + i18, i23)) {
                                    bitMatrix2.set(i24, i22);
                                }
                            }
                        }
                        return bitMatrix2;
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static float moduleSize(int[] iArr, BitMatrix bitMatrix) throws NotFoundException {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        int i11 = iArr[0];
        boolean z11 = true;
        int i12 = iArr[1];
        int i13 = 0;
        while (i11 < width && i12 < height) {
            if (z11 != bitMatrix.get(i11, i12)) {
                i13++;
                if (i13 == 5) {
                    break;
                }
                z11 = !z11;
            }
            i11++;
            i12++;
        }
        if (i11 != width && i12 != height) {
            return (i11 - iArr[0]) / 7.0f;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
