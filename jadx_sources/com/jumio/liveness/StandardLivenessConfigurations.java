package com.jumio.liveness;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkflowConfigurations.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/liveness/StandardLivenessConfigurations;", "", "normalizedNearFarCutOffPoint", "", "requiredDistanceMovementRatio", "initialPoseCheckFaceWidthRatioMin", "initialPoseCheckFaceWidthRatioMax", "targetFaceWidthRatioForProfilePicture", "delayMillisecondsBetweenDistance", "", "poseCheck", "Lcom/jumio/liveness/PoseCheckConfigurations;", "<init>", "(FFFFFILcom/jumio/liveness/PoseCheckConfigurations;)V", "getNormalizedNearFarCutOffPoint", "()F", "getRequiredDistanceMovementRatio", "getInitialPoseCheckFaceWidthRatioMin", "getInitialPoseCheckFaceWidthRatioMax", "getTargetFaceWidthRatioForProfilePicture", "getDelayMillisecondsBetweenDistance", "()I", "getPoseCheck", "()Lcom/jumio/liveness/PoseCheckConfigurations;", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class StandardLivenessConfigurations {
    private final int delayMillisecondsBetweenDistance;
    private final float initialPoseCheckFaceWidthRatioMax;
    private final float initialPoseCheckFaceWidthRatioMin;
    private final float normalizedNearFarCutOffPoint;

    @NotNull
    private final PoseCheckConfigurations poseCheck;
    private final float requiredDistanceMovementRatio;
    private final float targetFaceWidthRatioForProfilePicture;

    public StandardLivenessConfigurations(float f11, float f12, float f13, float f14, float f15, int i11, @NotNull PoseCheckConfigurations poseCheck) {
        Intrinsics.checkNotNullParameter(poseCheck, "poseCheck");
        this.normalizedNearFarCutOffPoint = f11;
        this.requiredDistanceMovementRatio = f12;
        this.initialPoseCheckFaceWidthRatioMin = f13;
        this.initialPoseCheckFaceWidthRatioMax = f14;
        this.targetFaceWidthRatioForProfilePicture = f15;
        this.delayMillisecondsBetweenDistance = i11;
        this.poseCheck = poseCheck;
    }

    public final int getDelayMillisecondsBetweenDistance() {
        return this.delayMillisecondsBetweenDistance;
    }

    public final float getInitialPoseCheckFaceWidthRatioMax() {
        return this.initialPoseCheckFaceWidthRatioMax;
    }

    public final float getInitialPoseCheckFaceWidthRatioMin() {
        return this.initialPoseCheckFaceWidthRatioMin;
    }

    public final float getNormalizedNearFarCutOffPoint() {
        return this.normalizedNearFarCutOffPoint;
    }

    @NotNull
    public final PoseCheckConfigurations getPoseCheck() {
        return this.poseCheck;
    }

    public final float getRequiredDistanceMovementRatio() {
        return this.requiredDistanceMovementRatio;
    }

    public final float getTargetFaceWidthRatioForProfilePicture() {
        return this.targetFaceWidthRatioForProfilePicture;
    }
}
