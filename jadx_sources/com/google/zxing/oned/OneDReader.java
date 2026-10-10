package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public abstract class OneDReader implements Reader {
    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            float f16 = iArr2[i14] * f13;
            float f17 = i15;
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }

    public static void recordPattern(BitArray bitArray, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i12 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i11 >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z11 = !bitArray.get(i11);
        while (i11 < size) {
            if (bitArray.get(i11) == z11) {
                i12++;
                if (i12 == length) {
                    break;
                }
                iArr[i12] = 1;
                z11 = !z11;
            } else {
                iArr[i12] = iArr[i12] + 1;
            }
            i11++;
        }
        if (i12 != length) {
            if (i12 != length - 1 || i11 != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z11 = bitArray.get(i11);
        while (i11 > 0 && length >= 0) {
            i11--;
            if (bitArray.get(i11) != z11) {
                length--;
                z11 = !z11;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i11 + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i11;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i12 = 1;
        boolean z11 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, height >> (z11 ? 8 : 5));
        int i13 = z11 ? height : 15;
        int i14 = height / 2;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 + 1;
            int i17 = i16 / 2;
            if ((i15 & 1) != 0) {
                i17 = -i17;
            }
            int i18 = (i17 * iMax) + i14;
            if (i18 < 0 || i18 >= height) {
                break;
            }
            try {
                bitArray = binaryBitmap.getBlackRow(i18, bitArray);
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == i12) {
                        bitArray.reverse();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultDecodeRow = decodeRow(i18, bitArray, map3);
                        if (i19 == i12) {
                            try {
                                resultDecodeRow.putMetadata(ResultMetadataType.ORIENTATION, 180);
                                ResultPoint[] resultPoints = resultDecodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    i11 = i12;
                                    float f11 = width;
                                    try {
                                        map2 = map3;
                                        try {
                                            try {
                                                resultPoints[0] = new ResultPoint((f11 - resultPoints[0].getX()) - 1.0f, resultPoints[0].getY());
                                                resultPoints[i11] = new ResultPoint((f11 - resultPoints[i11].getX()) - 1.0f, resultPoints[i11].getY());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i19++;
                                                map3 = map2;
                                                i12 = i11;
                                                width = width;
                                            }
                                        } catch (ReaderException unused2) {
                                            i19++;
                                            map3 = map2;
                                            i12 = i11;
                                            width = width;
                                        }
                                    } catch (ReaderException unused3) {
                                        map2 = map3;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i11 = i12;
                            }
                        }
                        return resultDecodeRow;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i11 = i12;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i15 = i16;
            i12 = i12;
            width = width;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e11) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e11;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultDoDecode = doDecode(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultDoDecode.getResultMetadata();
            int iIntValue = 270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + 270) % TXVodDownloadDataSource.QUALITY_360P;
                }
            }
            resultDoDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultDoDecode.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i11 = 0; i11 < resultPoints.length; i11++) {
                    resultPoints[i11] = new ResultPoint((height - resultPoints[i11].getY()) - 1.0f, resultPoints[i11].getX());
                }
            }
            return resultDoDecode;
        }
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
