package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class AudioEncoderInfoImpl extends EncoderInfoImpl implements AudioEncoderInfo {
    private final MediaCodecInfo.AudioCapabilities mAudioCapabilities;

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    public Range<Integer> getBitrateRange() {
        return this.mAudioCapabilities.getBitrateRange();
    }

    public AudioEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.mCodecCapabilities.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.mAudioCapabilities = audioCapabilities;
    }
}
