package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* JADX INFO: loaded from: classes56.dex */
public final class AztecDetectorResult extends DetectorResult {
    private final boolean compact;
    private final int nbDatablocks;
    private final int nbLayers;

    public int getNbDatablocks() {
        return this.nbDatablocks;
    }

    public int getNbLayers() {
        return this.nbLayers;
    }

    public boolean isCompact() {
        return this.compact;
    }

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z11, int i11, int i12) {
        super(bitMatrix, resultPointArr);
        this.compact = z11;
        this.nbDatablocks = i11;
        this.nbLayers = i12;
    }
}
