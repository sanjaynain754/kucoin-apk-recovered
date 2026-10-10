package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    public abstract EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile();

    public abstract EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile();

    public static VideoValidatedEncoderProfilesProxy create(int i11, int i12, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        Preconditions.checkArgument(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = list2.get(0);
        if (!list.isEmpty()) {
            audioProfileProxy = list.get(0);
        } else {
            audioProfileProxy = null;
        }
        return new AutoValue_VideoValidatedEncoderProfilesProxy(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), audioProfileProxy, videoProfileProxy);
    }

    public static VideoValidatedEncoderProfilesProxy from(EncoderProfilesProxy encoderProfilesProxy) {
        return create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), encoderProfilesProxy.getVideoProfiles());
    }
}
