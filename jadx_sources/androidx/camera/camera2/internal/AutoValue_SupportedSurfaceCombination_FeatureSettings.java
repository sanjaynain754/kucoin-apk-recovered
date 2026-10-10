package androidx.camera.camera2.internal;

import android.util.Range;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {
    private final int getCameraMode;
    private final int getRequiredMaxBitDepth;
    private final Range<Integer> getTargetFpsRange;
    private final boolean hasVideoCapture;
    private final boolean isFeatureComboInvocation;
    private final boolean isHighSpeedOn;
    private final boolean isPreviewStabilizationOn;
    private final boolean isStrictFpsRequired;
    private final boolean isUltraHdrOn;
    private final boolean requiresFeatureComboQuery;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SupportedSurfaceCombination.FeatureSettings) {
            SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
            if (this.getCameraMode == featureSettings.getCameraMode() && this.hasVideoCapture == featureSettings.hasVideoCapture() && this.getRequiredMaxBitDepth == featureSettings.getRequiredMaxBitDepth() && this.isPreviewStabilizationOn == featureSettings.isPreviewStabilizationOn() && this.isUltraHdrOn == featureSettings.isUltraHdrOn() && this.isHighSpeedOn == featureSettings.isHighSpeedOn() && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation() && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery() && this.getTargetFpsRange.equals(featureSettings.getTargetFpsRange()) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getCameraMode() {
        return this.getCameraMode;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getRequiredMaxBitDepth() {
        return this.getRequiredMaxBitDepth;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public Range<Integer> getTargetFpsRange() {
        return this.getTargetFpsRange;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean hasVideoCapture() {
        return this.hasVideoCapture;
    }

    public int hashCode() {
        return ((((((((((((((((((this.getCameraMode ^ 1000003) * 1000003) ^ (this.hasVideoCapture ? 1231 : 1237)) * 1000003) ^ this.getRequiredMaxBitDepth) * 1000003) ^ (this.isPreviewStabilizationOn ? 1231 : 1237)) * 1000003) ^ (this.isUltraHdrOn ? 1231 : 1237)) * 1000003) ^ (this.isHighSpeedOn ? 1231 : 1237)) * 1000003) ^ (this.isFeatureComboInvocation ? 1231 : 1237)) * 1000003) ^ (this.requiresFeatureComboQuery ? 1231 : 1237)) * 1000003) ^ this.getTargetFpsRange.hashCode()) * 1000003) ^ (this.isStrictFpsRequired ? 1231 : 1237);
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isFeatureComboInvocation() {
        return this.isFeatureComboInvocation;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isHighSpeedOn() {
        return this.isHighSpeedOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isPreviewStabilizationOn() {
        return this.isPreviewStabilizationOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isStrictFpsRequired() {
        return this.isStrictFpsRequired;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isUltraHdrOn() {
        return this.isUltraHdrOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean requiresFeatureComboQuery() {
        return this.requiresFeatureComboQuery;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.getCameraMode + ", hasVideoCapture=" + this.hasVideoCapture + ", getRequiredMaxBitDepth=" + this.getRequiredMaxBitDepth + ", isPreviewStabilizationOn=" + this.isPreviewStabilizationOn + ", isUltraHdrOn=" + this.isUltraHdrOn + ", isHighSpeedOn=" + this.isHighSpeedOn + ", isFeatureComboInvocation=" + this.isFeatureComboInvocation + ", requiresFeatureComboQuery=" + this.requiresFeatureComboQuery + ", getTargetFpsRange=" + this.getTargetFpsRange + ", isStrictFpsRequired=" + this.isStrictFpsRequired + "}";
    }

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i11, boolean z11, int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Range<Integer> range, boolean z17) {
        this.getCameraMode = i11;
        this.hasVideoCapture = z11;
        this.getRequiredMaxBitDepth = i12;
        this.isPreviewStabilizationOn = z12;
        this.isUltraHdrOn = z13;
        this.isHighSpeedOn = z14;
        this.isFeatureComboInvocation = z15;
        this.requiresFeatureComboQuery = z16;
        if (range != null) {
            this.getTargetFpsRange = range;
            this.isStrictFpsRequired = z17;
            return;
        }
        throw new NullPointerException("Null getTargetFpsRange");
    }
}
