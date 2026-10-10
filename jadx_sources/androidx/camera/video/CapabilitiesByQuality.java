package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CapabilitiesByQuality {
    private static final String TAG = "CapabilitiesByQuality";
    private final VideoValidatedEncoderProfilesProxy mHighestProfiles;
    private final VideoValidatedEncoderProfilesProxy mLowestProfiles;
    private final Map<Quality, VideoValidatedEncoderProfilesProxy> mSupportedProfilesMap = new LinkedHashMap();
    private final TreeMap<Size, Quality> mAreaSortedSizeToQualityMap = new TreeMap<>(new CompareSizesByArea());

    public static boolean containsSupportedQuality(EncoderProfilesProvider encoderProfilesProvider, int i11) {
        return !new CapabilitiesByQuality(encoderProfilesProvider, i11).getSupportedQualities().isEmpty();
    }

    private EncoderProfilesProxy getEncoderProfiles(Quality quality, EncoderProfilesProvider encoderProfilesProvider, int i11) {
        Preconditions.checkState(quality instanceof Quality.ConstantQuality, "Currently only support ConstantQuality");
        return encoderProfilesProvider.getAll(((Quality.ConstantQuality) quality).getQualityValue(i11));
    }

    public Quality findNearestHigherSupportedQualityFor(Size size) {
        Quality quality = (Quality) SizeUtil.findNearestHigherFor(size, this.mAreaSortedSizeToQualityMap);
        return quality != null ? quality : Quality.NONE;
    }

    public List<Quality> getSupportedQualities() {
        return new ArrayList(this.mSupportedProfilesMap.keySet());
    }

    public CapabilitiesByQuality(EncoderProfilesProvider encoderProfilesProvider, int i11) {
        for (Quality quality : Quality.getSortedQualities()) {
            EncoderProfilesProxy encoderProfiles = getEncoderProfiles(quality, encoderProfilesProvider, i11);
            if (encoderProfiles != null) {
                Logger.m1866d(TAG, "profiles = " + encoderProfiles);
                VideoValidatedEncoderProfilesProxy validatedProfiles = toValidatedProfiles(encoderProfiles);
                if (validatedProfiles == null) {
                    Logger.m1872w(TAG, "EncoderProfiles of quality " + quality + " has no video validated profiles.");
                } else {
                    this.mAreaSortedSizeToQualityMap.put(validatedProfiles.getDefaultVideoProfile().getResolution(), quality);
                    this.mSupportedProfilesMap.put(quality, validatedProfiles);
                }
            }
        }
        if (this.mSupportedProfilesMap.isEmpty()) {
            Logger.m1868e(TAG, "No supported EncoderProfiles");
            this.mLowestProfiles = null;
            this.mHighestProfiles = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.mSupportedProfilesMap.values());
            this.mHighestProfiles = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.mLowestProfiles = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }
    }

    private static void checkQualityConstantsOrThrow(Quality quality) {
        Preconditions.checkArgument(Quality.containsQuality(quality), "Unknown quality: " + quality);
    }

    private VideoValidatedEncoderProfilesProxy toValidatedProfiles(EncoderProfilesProxy encoderProfilesProxy) {
        if (encoderProfilesProxy.getVideoProfiles().isEmpty()) {
            return null;
        }
        return VideoValidatedEncoderProfilesProxy.from(encoderProfilesProxy);
    }

    public VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size) {
        Quality qualityFindNearestHigherSupportedQualityFor = findNearestHigherSupportedQualityFor(size);
        Logger.m1866d(TAG, "Using supported quality of " + qualityFindNearestHigherSupportedQualityFor + " for size " + size);
        if (qualityFindNearestHigherSupportedQualityFor != Quality.NONE) {
            VideoValidatedEncoderProfilesProxy profiles = getProfiles(qualityFindNearestHigherSupportedQualityFor);
            if (profiles != null) {
                return profiles;
            }
            throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }

    public VideoValidatedEncoderProfilesProxy getProfiles(Quality quality) {
        checkQualityConstantsOrThrow(quality);
        if (quality == Quality.HIGHEST) {
            return this.mHighestProfiles;
        }
        if (quality == Quality.LOWEST) {
            return this.mLowestProfiles;
        }
        return this.mSupportedProfilesMap.get(quality);
    }

    public boolean isQualitySupported(Quality quality) {
        checkQualityConstantsOrThrow(quality);
        if (getProfiles(quality) != null) {
            return true;
        }
        return false;
    }
}
