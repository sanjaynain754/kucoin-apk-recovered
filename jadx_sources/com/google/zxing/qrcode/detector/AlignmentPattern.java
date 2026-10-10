package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes56.dex */
public final class AlignmentPattern extends ResultPoint {
    private final float estimatedModuleSize;

    public AlignmentPattern(float f11, float f12, float f13) {
        super(f11, f12);
        this.estimatedModuleSize = f13;
    }

    public boolean aboutEquals(float f11, float f12, float f13) {
        if (Math.abs(f12 - getY()) > f11 || Math.abs(f13 - getX()) > f11) {
            return false;
        }
        float fAbs = Math.abs(f11 - this.estimatedModuleSize);
        if (fAbs > 1.0f && fAbs > this.estimatedModuleSize) {
            return false;
        }
        return true;
    }

    public AlignmentPattern combineEstimate(float f11, float f12, float f13) {
        return new AlignmentPattern((getX() + f12) / 2.0f, (getY() + f11) / 2.0f, (this.estimatedModuleSize + f13) / 2.0f);
    }
}
