package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioEncoderConfigDefaultResolver implements Supplier<AudioEncoderConfig> {
    private static final int AUDIO_BITRATE_BASE = 156000;
    private static final int AUDIO_CHANNEL_COUNT_BASE = 2;
    private static final int AUDIO_SAMPLE_RATE_BASE = 48000;
    private static final String TAG = "AudioEncCfgDefaultRslvr";
    private final int mAudioProfile;
    private final AudioSettings mAudioSettings;
    private final AudioSpec mAudioSpec;
    private final Timebase mInputTimeBase;
    private final String mMimeType;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        Range<Integer> bitrate = this.mAudioSpec.getBitrate();
        Logger.m1866d(TAG, "Using fallback AUDIO bitrate");
        return AudioEncoderConfig.builder().setMimeType(this.mMimeType).setProfile(this.mAudioProfile).setInputTimebase(this.mInputTimeBase).setChannelCount(this.mAudioSettings.getChannelCount()).setCaptureSampleRate(this.mAudioSettings.getCaptureSampleRate()).setEncodeSampleRate(this.mAudioSettings.getEncodeSampleRate()).setBitrate(AudioConfigUtil.scaleAndClampBitrate(AUDIO_BITRATE_BASE, this.mAudioSettings.getChannelCount(), 2, this.mAudioSettings.getEncodeSampleRate(), 48000, bitrate)).build();
    }

    public AudioEncoderConfigDefaultResolver(String str, int i11, Timebase timebase, AudioSpec audioSpec, AudioSettings audioSettings) {
        this.mMimeType = str;
        this.mAudioProfile = i11;
        this.mInputTimeBase = timebase;
        this.mAudioSpec = audioSpec;
        this.mAudioSettings = audioSettings;
    }
}
