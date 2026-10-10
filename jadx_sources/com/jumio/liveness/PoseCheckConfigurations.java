package com.jumio.liveness;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: WorkflowConfigurations.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/liveness/PoseCheckConfigurations;", "", "pseudoPitchMin", "", "pseudoPitchMax", "pseudoYawMin", "pseudoYawMax", "normalizedOffCenterThreshold", "<init>", "(FFFFF)V", "getPseudoPitchMin", "()F", "getPseudoPitchMax", "getPseudoYawMin", "getPseudoYawMax", "getNormalizedOffCenterThreshold", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PoseCheckConfigurations {
    private final float normalizedOffCenterThreshold;
    private final float pseudoPitchMax;
    private final float pseudoPitchMin;
    private final float pseudoYawMax;
    private final float pseudoYawMin;

    public final float getNormalizedOffCenterThreshold() {
        return this.normalizedOffCenterThreshold;
    }

    public final float getPseudoPitchMax() {
        return this.pseudoPitchMax;
    }

    public final float getPseudoPitchMin() {
        return this.pseudoPitchMin;
    }

    public final float getPseudoYawMax() {
        return this.pseudoYawMax;
    }

    public final float getPseudoYawMin() {
        return this.pseudoYawMin;
    }

    public PoseCheckConfigurations(float f11, float f12, float f13, float f14, float f15) {
        this.pseudoPitchMin = f11;
        this.pseudoPitchMax = f12;
        this.pseudoYawMin = f13;
        this.pseudoYawMax = f14;
        this.normalizedOffCenterThreshold = f15;
    }
}
