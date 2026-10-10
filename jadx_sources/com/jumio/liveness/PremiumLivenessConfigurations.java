package com.jumio.liveness;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkflowConfigurations.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/liveness/PremiumLivenessConfigurations;", "Lcom/jumio/liveness/StandardLivenessConfigurations;", "normalizedNearFarCutOffPoint", "", "requiredDistanceMovementRatio", "initialPoseCheckFaceWidthRatioMin", "initialPoseCheckFaceWidthRatioMax", "targetFaceWidthRatioForProfilePicture", "delayMillisecondsBetweenDistance", "", "poseCheck", "Lcom/jumio/liveness/PoseCheckConfigurations;", "nearPhotinus", "Lcom/jumio/liveness/PhotinusConfigurations;", "<init>", "(FFFFFILcom/jumio/liveness/PoseCheckConfigurations;Lcom/jumio/liveness/PhotinusConfigurations;)V", "getNearPhotinus", "()Lcom/jumio/liveness/PhotinusConfigurations;", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PremiumLivenessConfigurations extends StandardLivenessConfigurations {

    @NotNull
    private final PhotinusConfigurations nearPhotinus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumLivenessConfigurations(float f11, float f12, float f13, float f14, float f15, int i11, @NotNull PoseCheckConfigurations poseCheck, @NotNull PhotinusConfigurations nearPhotinus) {
        super(f11, f12, f13, f14, f15, i11, poseCheck);
        Intrinsics.checkNotNullParameter(poseCheck, "poseCheck");
        Intrinsics.checkNotNullParameter(nearPhotinus, "nearPhotinus");
        this.nearPhotinus = nearPhotinus;
    }

    @NotNull
    public final PhotinusConfigurations getNearPhotinus() {
        return this.nearPhotinus;
    }
}
