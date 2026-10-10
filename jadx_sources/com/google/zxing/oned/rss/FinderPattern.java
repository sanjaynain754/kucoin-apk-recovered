package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes56.dex */
public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.value == ((FinderPattern) obj).value;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public FinderPattern(int i11, int[] iArr, int i12, int i13, int i14) {
        this.value = i11;
        this.startEnd = iArr;
        float f11 = i12;
        float f12 = i14;
        this.resultPoints = new ResultPoint[]{new ResultPoint(f11, f12), new ResultPoint(i13, f12)};
    }
}
