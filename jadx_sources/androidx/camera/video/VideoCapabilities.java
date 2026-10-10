package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface VideoCapabilities {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final VideoCapabilities EMPTY = new VideoCapabilities() { // from class: androidx.camera.video.VideoCapabilities.1
        @Override // androidx.camera.video.VideoCapabilities
        public boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
            return false;
        }

        @Override // androidx.camera.video.VideoCapabilities
        public Set<DynamicRange> getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public List<Quality> getSupportedQualities(DynamicRange dynamicRange) {
            return new ArrayList();
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default VideoValidatedEncoderProfilesProxy getProfiles(Quality quality, DynamicRange dynamicRange) {
        return null;
    }

    Set<DynamicRange> getSupportedDynamicRanges();

    List<Quality> getSupportedQualities(DynamicRange dynamicRange);

    boolean isQualitySupported(Quality quality, DynamicRange dynamicRange);

    default boolean isStabilizationSupported() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Quality findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
        return Quality.NONE;
    }
}
