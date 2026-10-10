package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioSettingsDefaultResolver implements Supplier<AudioSettings> {
    private static final String TAG = "DefAudioResolver";
    private final AudioSpec mAudioSpec;
    private final Rational mCaptureToEncodeRatio;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioSettings get() {
        int iResolveAudioSource = AudioConfigUtil.resolveAudioSource(this.mAudioSpec);
        int iResolveAudioSourceFormat = AudioConfigUtil.resolveAudioSourceFormat(this.mAudioSpec);
        int channelCount = this.mAudioSpec.getChannelCount();
        if (channelCount == -1) {
            Logger.m1866d(TAG, "Using fallback AUDIO channel count: 1");
            channelCount = 1;
        } else {
            Logger.m1866d(TAG, "Using supplied AUDIO channel count: " + channelCount);
        }
        Range<Integer> sampleRate = this.mAudioSpec.getSampleRate();
        CaptureEncodeRates captureEncodeRatesResolveSampleRates = AudioConfigUtil.resolveSampleRates(sampleRate, AudioSpec.SAMPLE_RATE_RANGE_AUTO.equals(sampleRate) ? 44100 : ((Integer) sampleRate.getUpper()).intValue(), channelCount, iResolveAudioSource, this.mCaptureToEncodeRatio);
        Logger.m1866d(TAG, "Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: " + captureEncodeRatesResolveSampleRates.getCaptureRate() + "Hz. Encode sample rate: " + captureEncodeRatesResolveSampleRates.getEncodeRate() + "Hz.");
        return AudioSettings.builder().setAudioSource(iResolveAudioSource).setAudioFormat(iResolveAudioSourceFormat).setChannelCount(channelCount).setCaptureSampleRate(captureEncodeRatesResolveSampleRates.getCaptureRate()).setEncodeSampleRate(captureEncodeRatesResolveSampleRates.getEncodeRate()).build();
    }

    public AudioSettingsDefaultResolver(AudioSpec audioSpec, Rational rational) {
        this.mAudioSpec = audioSpec;
        this.mCaptureToEncodeRatio = rational;
    }
}
