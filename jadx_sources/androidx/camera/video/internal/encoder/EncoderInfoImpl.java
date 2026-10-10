package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {
    protected final MediaCodecInfo.CodecCapabilities mCodecCapabilities;
    private final MediaCodecInfo mMediaCodecInfo;

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return this.mMediaCodecInfo.getName();
    }

    public EncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.mMediaCodecInfo = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.mCodecCapabilities = capabilitiesForType;
        } catch (RuntimeException e11) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: " + str, e11);
        }
    }
}
