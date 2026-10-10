package androidx.camera.video.internal.config;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioEncoderConfigAudioProfileResolver implements Supplier<AudioEncoderConfig> {
    private static final String TAG = "AudioEncAdPrflRslvr";
    private final int mAudioProfile;
    private final EncoderProfilesProxy.AudioProfileProxy mAudioProfileProxy;
    private final AudioSettings mAudioSettings;
    private final AudioSpec mAudioSpec;
    private final Timebase mInputTimebase;
    private final String mMimeType;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        Logger.m1866d(TAG, "Using resolved AUDIO bitrate from AudioProfile");
        return AudioEncoderConfig.builder().setMimeType(this.mMimeType).setProfile(this.mAudioProfile).setInputTimebase(this.mInputTimebase).setChannelCount(this.mAudioSettings.getChannelCount()).setCaptureSampleRate(this.mAudioSettings.getCaptureSampleRate()).setEncodeSampleRate(this.mAudioSettings.getEncodeSampleRate()).setBitrate(AudioConfigUtil.scaleAndClampBitrate(this.mAudioProfileProxy.getBitrate(), this.mAudioSettings.getChannelCount(), this.mAudioProfileProxy.getChannels(), this.mAudioSettings.getEncodeSampleRate(), this.mAudioProfileProxy.getSampleRate(), this.mAudioSpec.getBitrate())).build();
    }

    public AudioEncoderConfigAudioProfileResolver(String str, int i11, Timebase timebase, AudioSpec audioSpec, AudioSettings audioSettings, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.mMimeType = str;
        this.mAudioProfile = i11;
        this.mInputTimebase = timebase;
        this.mAudioSpec = audioSpec;
        this.mAudioSettings = audioSettings;
        this.mAudioProfileProxy = audioProfileProxy;
    }
}
