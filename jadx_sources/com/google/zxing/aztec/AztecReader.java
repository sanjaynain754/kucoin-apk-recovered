package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.DecoderResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class AztecReader implements Reader {
    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPoint[] points;
        NotFoundException notFoundException;
        ResultPoint[] resultPointArr;
        FormatException formatException;
        ResultPoint[] resultPointArr2;
        ResultPointCallback resultPointCallback;
        Detector detector = new Detector(binaryBitmap.getBlackMatrix());
        DecoderResult decoderResultDecode = null;
        try {
            AztecDetectorResult aztecDetectorResultDetect = detector.detect(false);
            points = aztecDetectorResultDetect.getPoints();
            try {
                formatException = null;
                decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect);
                resultPointArr = points;
                notFoundException = null;
            } catch (FormatException e11) {
                e = e11;
                formatException = e;
                resultPointArr = points;
                notFoundException = null;
            } catch (NotFoundException e12) {
                e = e12;
                ResultPoint[] resultPointArr3 = points;
                notFoundException = e;
                resultPointArr = resultPointArr3;
                formatException = null;
            }
        } catch (FormatException e13) {
            e = e13;
            points = null;
        } catch (NotFoundException e14) {
            e = e14;
            points = null;
        }
        if (decoderResultDecode == null) {
            try {
                AztecDetectorResult aztecDetectorResultDetect2 = detector.detect(true);
                ResultPoint[] points2 = aztecDetectorResultDetect2.getPoints();
                decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect2);
                resultPointArr2 = points2;
            } catch (FormatException | NotFoundException e15) {
                if (notFoundException != null) {
                    throw notFoundException;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e15;
            }
        } else {
            resultPointArr2 = resultPointArr;
        }
        if (map != null && (resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (ResultPoint resultPoint : resultPointArr2) {
                resultPointCallback.foundPossibleResultPoint(resultPoint);
            }
        }
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result;
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }
}
