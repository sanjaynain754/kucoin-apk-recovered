package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes56.dex */
final class UPCEANExtensionSupport {
    private static final int[] EXTENSION_START_PATTERN = {1, 1, 2};
    private final UPCEANExtension2Support twoSupport = new UPCEANExtension2Support();
    private final UPCEANExtension5Support fiveSupport = new UPCEANExtension5Support();

    public Result decodeRow(int i11, BitArray bitArray, int i12) throws NotFoundException {
        int[] iArrFindGuardPattern = UPCEANReader.findGuardPattern(bitArray, i12, false, EXTENSION_START_PATTERN);
        try {
            return this.fiveSupport.decodeRow(i11, bitArray, iArrFindGuardPattern);
        } catch (ReaderException unused) {
            return this.twoSupport.decodeRow(i11, bitArray, iArrFindGuardPattern);
        }
    }
}
