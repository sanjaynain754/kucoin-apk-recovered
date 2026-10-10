package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.QualityExploredEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RecorderVideoCapabilities implements VideoCapabilities {
    private static final String TAG = "RecorderVideoCapabilities";
    private final Map<DynamicRange, CapabilitiesByQuality> mCapabilitiesMapForFullySpecifiedDynamicRange = new HashMap();
    private final Map<DynamicRange, CapabilitiesByQuality> mCapabilitiesMapForNonFullySpecifiedDynamicRange = new HashMap();
    private final boolean mIsStabilizationSupported;
    private final EncoderProfilesProvider mProfilesProvider;
    private final int mQualitySource;

    @Override // androidx.camera.video.VideoCapabilities
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return this.mCapabilitiesMapForFullySpecifiedDynamicRange.keySet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isStabilizationSupported() {
        return this.mIsStabilizationSupported;
    }

    public RecorderVideoCapabilities(int i11, CameraInfoInternal cameraInfoInternal, int i12, VideoEncoderInfo.Finder finder) {
        boolean z11;
        if (i11 != 0 && i11 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Not a supported video capabilities source: " + i11);
        int i13 = i12 == 2 ? 2 : 1;
        this.mQualitySource = i13;
        this.mProfilesProvider = getEncoderProfilesProvider(i11, cameraInfoInternal, finder, i13);
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.mProfilesProvider, dynamicRange), this.mQualitySource);
            if (!capabilitiesByQuality.getSupportedQualities().isEmpty()) {
                this.mCapabilitiesMapForFullySpecifiedDynamicRange.put(dynamicRange, capabilitiesByQuality);
            }
        }
        this.mIsStabilizationSupported = cameraInfoInternal.isVideoStabilizationSupported();
    }

    private CapabilitiesByQuality generateCapabilitiesForNonFullySpecifiedDynamicRange(DynamicRange dynamicRange) {
        if (!DynamicRanges.canResolve(dynamicRange, getSupportedDynamicRanges())) {
            return null;
        }
        return new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.mProfilesProvider, dynamicRange), this.mQualitySource);
    }

    private CapabilitiesByQuality getCapabilities(DynamicRange dynamicRange) {
        if (dynamicRange.isFullySpecified()) {
            return this.mCapabilitiesMapForFullySpecifiedDynamicRange.get(dynamicRange);
        }
        if (this.mCapabilitiesMapForNonFullySpecifiedDynamicRange.containsKey(dynamicRange)) {
            return this.mCapabilitiesMapForNonFullySpecifiedDynamicRange.get(dynamicRange);
        }
        CapabilitiesByQuality capabilitiesByQualityGenerateCapabilitiesForNonFullySpecifiedDynamicRange = generateCapabilitiesForNonFullySpecifiedDynamicRange(dynamicRange);
        this.mCapabilitiesMapForNonFullySpecifiedDynamicRange.put(dynamicRange, capabilitiesByQualityGenerateCapabilitiesForNonFullySpecifiedDynamicRange);
        return capabilitiesByQualityGenerateCapabilitiesForNonFullySpecifiedDynamicRange;
    }

    private static EncoderProfilesProvider getEncoderProfilesProvider(int i11, CameraInfoInternal cameraInfoInternal, VideoEncoderInfo.Finder finder, int i12) {
        VideoEncoderInfo.Finder finder2;
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        if (i12 == 2) {
            if (!cameraInfoInternal.isHighSpeedSupported()) {
                return EncoderProfilesProvider.EMPTY;
            }
            return encoderProfilesProvider;
        }
        if (!CapabilitiesByQuality.containsSupportedQuality(encoderProfilesProvider, i12)) {
            Logger.m1872w(TAG, "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            encoderProfilesProvider = new DefaultEncoderProfilesProvider(cameraInfoInternal, Arrays.asList(Quality.FHD, Quality.f1930HD, Quality.f1931SD), finder);
        }
        Quirks all = DeviceQuirks.getAll();
        EncoderProfilesProvider qualityAddedEncoderProfilesProvider = new QualityAddedEncoderProfilesProvider(encoderProfilesProvider, all, cameraInfoInternal, finder);
        if (i11 == 1) {
            finder2 = finder;
            qualityAddedEncoderProfilesProvider = new QualityExploredEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, Quality.getSortedQualities(), Collections.singleton(DynamicRange.SDR), cameraInfoInternal.getSupportedResolutions(34), finder2);
        } else {
            finder2 = finder;
        }
        EncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new QualityResolutionModifiedEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, all);
        if (isHlg10SupportedByCamera(cameraInfoInternal)) {
            qualityResolutionModifiedEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, finder2);
        }
        return new QualityValidatedEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, cameraInfoInternal, all);
    }

    private static boolean isHlg10SupportedByCamera(CameraInfoInternal cameraInfoInternal) {
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            Integer numValueOf = Integer.valueOf(dynamicRange.getEncoding());
            int bitDepth = dynamicRange.getBitDepth();
            if (numValueOf.equals(3) && bitDepth == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities == null) {
            return null;
        }
        return capabilities.findNearestHigherSupportedEncoderProfilesFor(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public Quality findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities == null) {
            return Quality.NONE;
        }
        return capabilities.findNearestHigherSupportedQualityFor(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public VideoValidatedEncoderProfilesProxy getProfiles(Quality quality, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities == null) {
            return null;
        }
        return capabilities.getProfiles(quality);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public List<Quality> getSupportedQualities(DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities == null) {
            return new ArrayList();
        }
        return capabilities.getSupportedQualities();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null && capabilities.isQualitySupported(quality)) {
            return true;
        }
        return false;
    }
}
