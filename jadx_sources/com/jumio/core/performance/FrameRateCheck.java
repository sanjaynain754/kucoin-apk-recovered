package com.jumio.core.performance;

import androidx.core.math.MathUtils;
import com.jumio.commons.log.Log;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateCheck;", "", "frameRateThreshold", "", "maxViolations", "<init>", "(II)V", "violations", "checkFrameRate", "", "frameRate", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FrameRateCheck {
    private final int frameRateThreshold;
    private final int maxViolations;
    private int violations;

    public final boolean checkFrameRate(int frameRate) {
        if (FrameRateUtils.INSTANCE.checkThresholdForFrameRate(frameRate, this.frameRateThreshold)) {
            Log.m14479v("FrameRateCheck", "Frame Rate is " + frameRate + ", threshold is " + this.frameRateThreshold);
            int i11 = this.violations + (-1);
            this.violations = i11;
            this.violations = MathUtils.clamp(i11, 0, this.maxViolations);
            return true;
        }
        Log.m14484w("FrameRateCheck", "Frame Rate is " + frameRate + ", threshold is " + this.frameRateThreshold);
        int i12 = this.violations + 1;
        this.violations = i12;
        if (i12 < this.maxViolations) {
            return true;
        }
        Log.m14484w("FrameRateCheck", "Frame Rate below threshold " + this.violations + " times, falling back to other extraction method");
        return false;
    }

    public FrameRateCheck(int i11, int i12) {
        this.frameRateThreshold = i11;
        this.maxViolations = i12;
    }
}
