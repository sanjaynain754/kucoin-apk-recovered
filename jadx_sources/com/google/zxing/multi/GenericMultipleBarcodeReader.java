package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i11, int i12, int i13) {
        int i14;
        if (i13 > 4) {
            return;
        }
        try {
            Result resultDecode = this.delegate.decode(binaryBitmap, map);
            Iterator<Result> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(translateResultPoints(resultDecode, i11, i12));
                    break;
                }
            } while (!it.next().getText().equals(resultDecode.getText()));
            ResultPoint[] resultPoints = resultDecode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f11 = width;
            float f12 = height;
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x11 = resultPoint.getX();
                    float y11 = resultPoint.getY();
                    if (x11 < f11) {
                        f11 = x11;
                    }
                    if (y11 < f12) {
                        f12 = y11;
                    }
                    if (x11 > f13) {
                        f13 = x11;
                    }
                    if (y11 > f14) {
                        f14 = y11;
                    }
                }
            }
            if (f11 > 100.0f) {
                i14 = 0;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f11, height), map, list, i11, i12, i13 + 1);
            } else {
                i14 = 0;
            }
            if (f12 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(i14, i14, width, (int) f12), map, list, i11, i12, i13 + 1);
            }
            if (f13 < width - 100) {
                int i15 = (int) f13;
                doDecodeMultiple(binaryBitmap.crop(i15, 0, width - i15, height), map, list, i11 + i15, i12, i13 + 1);
            }
            if (f14 < height - 100) {
                int i16 = (int) f14;
                doDecodeMultiple(binaryBitmap.crop(0, i16, width, height - i16), map, list, i11, i12 + i16, i13 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    private static Result translateResultPoints(Result result, int i11, int i12) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i13 = 0; i13 < resultPoints.length; i13++) {
            ResultPoint resultPoint = resultPoints[i13];
            if (resultPoint != null) {
                resultPointArr[i13] = new ResultPoint(resultPoint.getX() + i11, resultPoint.getY() + i12);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }
}
