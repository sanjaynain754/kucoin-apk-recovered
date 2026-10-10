package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class ByQuadrantReader implements Reader {
    private final Reader delegate;

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    private static void makeAbsolute(ResultPoint[] resultPointArr, int i11, int i12) {
        if (resultPointArr != null) {
            for (int i13 = 0; i13 < resultPointArr.length; i13++) {
                ResultPoint resultPoint = resultPointArr[i13];
                resultPointArr[i13] = new ResultPoint(resultPoint.getX() + i11, resultPoint.getY() + i12);
            }
        }
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int width = binaryBitmap.getWidth() / 2;
        int height = binaryBitmap.getHeight() / 2;
        try {
            try {
                try {
                    try {
                        return this.delegate.decode(binaryBitmap.crop(0, 0, width, height), map);
                    } catch (NotFoundException unused) {
                        int i11 = width / 2;
                        int i12 = height / 2;
                        Result resultDecode = this.delegate.decode(binaryBitmap.crop(i11, i12, width, height), map);
                        makeAbsolute(resultDecode.getResultPoints(), i11, i12);
                        return resultDecode;
                    }
                } catch (NotFoundException unused2) {
                    Result resultDecode2 = this.delegate.decode(binaryBitmap.crop(width, height, width, height), map);
                    makeAbsolute(resultDecode2.getResultPoints(), width, height);
                    return resultDecode2;
                }
            } catch (NotFoundException unused3) {
                Result resultDecode3 = this.delegate.decode(binaryBitmap.crop(0, height, width, height), map);
                makeAbsolute(resultDecode3.getResultPoints(), 0, height);
                return resultDecode3;
            }
        } catch (NotFoundException unused4) {
            Result resultDecode4 = this.delegate.decode(binaryBitmap.crop(width, 0, width, height), map);
            makeAbsolute(resultDecode4.getResultPoints(), width, 0);
            return resultDecode4;
        }
    }

    @Override // com.google.zxing.Reader
    public void reset() {
        this.delegate.reset();
    }

    public ByQuadrantReader(Reader reader) {
        this.delegate = reader;
    }
}
