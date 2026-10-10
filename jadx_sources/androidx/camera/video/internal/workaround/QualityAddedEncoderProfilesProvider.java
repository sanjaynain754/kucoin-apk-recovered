package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class QualityAddedEncoderProfilesProvider implements EncoderProfilesProvider {
    private Map<Integer, EncoderProfilesProxy> mExtraQualityToEncoderProfiles;
    private final EncoderProfilesProvider mProvider;

    private EncoderProfilesProxy getProfilesInternal(int i11) {
        Map<Integer, EncoderProfilesProxy> map = this.mExtraQualityToEncoderProfiles;
        return (map == null || !map.containsKey(Integer.valueOf(i11))) ? this.mProvider.getAll(i11) : this.mExtraQualityToEncoderProfiles.get(Integer.valueOf(i11));
    }

    public QualityAddedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks, CameraInfoInternal cameraInfoInternal, VideoEncoderInfo.Finder finder) {
        this.mProvider = encoderProfilesProvider;
        List all = quirks.getAll(ExtraSupportedQualityQuirk.class);
        if (!all.isEmpty()) {
            Preconditions.checkState(all.size() == 1);
            Map<Integer, EncoderProfilesProxy> extraEncoderProfiles = ((ExtraSupportedQualityQuirk) all.get(0)).getExtraEncoderProfiles(cameraInfoInternal, encoderProfilesProvider, finder);
            if (extraEncoderProfiles != null) {
                this.mExtraQualityToEncoderProfiles = new HashMap(extraEncoderProfiles);
            }
        }
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        if (getProfilesInternal(i11) != null) {
            return true;
        }
        return false;
    }
}
