package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes56.dex */
public final class FinderPattern extends ResultPoint {
    private final int count;
    private final float estimatedModuleSize;

    public FinderPattern(float f11, float f12, float f13) {
        this(f11, f12, f13, 1);
    }

    private FinderPattern(float f11, float f12, float f13, int i11) {
        super(f11, f12);
        this.estimatedModuleSize = f13;
        this.count = i11;
    }

    public FinderPattern combineEstimate(float f11, float f12, float f13) {
        int i11 = this.count;
        int i12 = i11 + 1;
        float x11 = (i11 * getX()) + f12;
        float f14 = i12;
        return new FinderPattern(x11 / f14, ((this.count * getY()) + f11) / f14, ((this.count * this.estimatedModuleSize) + f13) / f14, i12);
    }

    public int getCount() {
        return this.count;
    }

    public float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
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
}
