package androidx.camera.video.internal;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {
    private final DynamicRange mDynamicRange;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;

    private static EncoderProfilesProxy filterUnmatchedDynamicRange(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange)) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    private EncoderProfilesProxy getProfilesInternal(int i11) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i11)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyFilterUnmatchedDynamicRange = filterUnmatchedDynamicRange(this.mEncoderProfilesProvider.getAll(i11), this.mDynamicRange);
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), encoderProfilesProxyFilterUnmatchedDynamicRange);
        return encoderProfilesProxyFilterUnmatchedDynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mEncoderProfilesProvider.hasProfile(i11) && getProfilesInternal(i11) != null;
    }

    public DynamicRangeMatchedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, DynamicRange dynamicRange) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mDynamicRange = dynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }
}
