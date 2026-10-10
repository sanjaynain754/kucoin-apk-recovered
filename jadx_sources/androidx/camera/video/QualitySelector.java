package androidx.camera.video;

import android.annotation.SuppressLint;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class QualitySelector {
    private static final String TAG = "QualitySelector";
    private final FallbackStrategy mFallbackStrategy;
    private final List<Quality> mPreferredQualityList;

    private static void checkQualityConstantsOrThrow(List<Quality> list) {
        for (Quality quality : list) {
            Preconditions.checkArgument(Quality.containsQuality(quality), "qualities contain invalid quality: " + quality);
        }
    }

    public static QualitySelector from(Quality quality) {
        return from(quality, FallbackStrategy.NONE);
    }

    public static QualitySelector fromOrderedList(List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.NONE);
    }

    public static QualitySelector from(Quality quality, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        checkQualityConstantsOrThrow(quality);
        return new QualitySelector(Collections.singletonList(quality), fallbackStrategy);
    }

    public static QualitySelector fromOrderedList(List<Quality> list, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        checkQualityConstantsOrThrow(list);
        return new QualitySelector(list, fallbackStrategy);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Map<Quality, Size> getQualityToResolutionMap(VideoCapabilities videoCapabilities, DynamicRange dynamicRange) {
        HashMap map = new HashMap();
        for (Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(quality, dynamicRange);
            Objects.requireNonNull(profiles);
            map.put(quality, getProfileVideoSize(profiles));
        }
        return map;
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.mPreferredQualityList + ", fallbackStrategy=" + this.mFallbackStrategy + "}";
    }

    public QualitySelector(List<Quality> list, FallbackStrategy fallbackStrategy) {
        boolean z11;
        if (list.isEmpty() && fallbackStrategy == FallbackStrategy.NONE) {
            z11 = false;
        } else {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "No preferred quality and fallback strategy.");
        this.mPreferredQualityList = Collections.unmodifiableList(new ArrayList(list));
        this.mFallbackStrategy = fallbackStrategy;
    }

    private void addByFallbackStrategy(List<Quality> list, Set<Quality> set) {
        Quality fallbackQuality;
        if (!list.isEmpty() && !set.containsAll(list)) {
            Logger.m1866d(TAG, "Select quality by fallbackStrategy = " + this.mFallbackStrategy);
            FallbackStrategy fallbackStrategy = this.mFallbackStrategy;
            if (fallbackStrategy != FallbackStrategy.NONE) {
                Preconditions.checkState(fallbackStrategy instanceof FallbackStrategy.RuleStrategy, "Currently only support type RuleStrategy");
                FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) this.mFallbackStrategy;
                List<Quality> sortedQualities = Quality.getSortedQualities();
                boolean z11 = false;
                if (ruleStrategy.getFallbackQuality() == Quality.HIGHEST) {
                    fallbackQuality = sortedQualities.get(0);
                } else if (ruleStrategy.getFallbackQuality() == Quality.LOWEST) {
                    fallbackQuality = sortedQualities.get(sortedQualities.size() - 1);
                } else {
                    fallbackQuality = ruleStrategy.getFallbackQuality();
                }
                int iIndexOf = sortedQualities.indexOf(fallbackQuality);
                if (iIndexOf != -1) {
                    z11 = true;
                }
                Preconditions.checkState(z11);
                ArrayList arrayList = new ArrayList();
                for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                    Quality quality = sortedQualities.get(i11);
                    if (list.contains(quality)) {
                        arrayList.add(quality);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = iIndexOf + 1; i12 < sortedQualities.size(); i12++) {
                    Quality quality2 = sortedQualities.get(i12);
                    if (list.contains(quality2)) {
                        arrayList2.add(quality2);
                    }
                }
                Logger.m1866d(TAG, "sizeSortedQualities = " + sortedQualities + ", fallback quality = " + fallbackQuality + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
                int fallbackRule = ruleStrategy.getFallbackRule();
                if (fallbackRule != 0) {
                    if (fallbackRule != 1) {
                        if (fallbackRule != 2) {
                            if (fallbackRule != 3) {
                                if (fallbackRule == 4) {
                                    set.addAll(arrayList2);
                                    return;
                                }
                                throw new AssertionError("Unhandled fallback strategy: " + this.mFallbackStrategy);
                            }
                            set.addAll(arrayList2);
                            set.addAll(arrayList);
                            return;
                        }
                        set.addAll(arrayList);
                        return;
                    }
                    set.addAll(arrayList);
                    set.addAll(arrayList2);
                }
            }
        }
    }

    private static void checkQualityConstantsOrThrow(Quality quality) {
        Preconditions.checkArgument(Quality.containsQuality(quality), "Invalid quality: " + quality);
    }

    private static Size getProfileVideoSize(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        return videoValidatedEncoderProfilesProxy.getDefaultVideoProfile().getResolution();
    }

    public static Size getResolution(CameraInfo cameraInfo, Quality quality) {
        checkQualityConstantsOrThrow(quality);
        VideoValidatedEncoderProfilesProxy profiles = Recorder.getVideoCapabilities(cameraInfo).getProfiles(quality, DynamicRange.SDR);
        if (profiles != null) {
            return getProfileVideoSize(profiles);
        }
        return null;
    }

    @Deprecated
    public static List<Quality> getSupportedQualities(CameraInfo cameraInfo) {
        return Recorder.getVideoCapabilities(cameraInfo).getSupportedQualities(DynamicRange.SDR);
    }

    @Deprecated
    public static boolean isQualitySupported(CameraInfo cameraInfo, Quality quality) {
        return Recorder.getVideoCapabilities(cameraInfo).isQualitySupported(quality, DynamicRange.SDR);
    }

    @SuppressLint({"UsesNonDefaultVisibleForTesting"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting(otherwise = 3)
    public List<Quality> getPrioritizedQualities(List<Quality> list) {
        if (list.isEmpty()) {
            Logger.m1872w(TAG, "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.m1866d(TAG, "supportedQualities = " + list);
        Set<Quality> linkedHashSet = new LinkedHashSet<>();
        for (Quality quality : this.mPreferredQualityList) {
            if (quality == Quality.HIGHEST) {
                linkedHashSet.addAll(list);
                break;
            }
            if (quality == Quality.LOWEST) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(quality)) {
                linkedHashSet.add(quality);
            } else {
                Logger.m1872w(TAG, "quality is not supported and will be ignored: " + quality);
            }
        }
        addByFallbackStrategy(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }
}
