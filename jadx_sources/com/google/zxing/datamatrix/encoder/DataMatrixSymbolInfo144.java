package com.google.zxing.datamatrix.encoder;

import com.tencent.bugly.proguard.C33556b3;
import org.tensorflow.lite.schema.BuiltinOperator;

/* JADX INFO: loaded from: classes56.dex */
final class DataMatrixSymbolInfo144 extends SymbolInfo {
    public DataMatrixSymbolInfo144() {
        super(false, 1558, C33556b3.f69043g, 22, 22, 36, -1, 62);
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getDataLengthForInterleavedBlock(int i11) {
        if (i11 <= 8) {
            return 156;
        }
        return BuiltinOperator.UNSORTED_SEGMENT_SUM;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getInterleavedBlockCount() {
        return 10;
    }
}
