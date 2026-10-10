package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException;

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException;
}
