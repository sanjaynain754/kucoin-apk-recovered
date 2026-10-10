package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    public static int selectSampleRateOrNearestSupported(Range<Integer> range, int i11, int i12, final int i13) {
        ArrayList arrayList = null;
        int i14 = 0;
        int iIntValue = i13;
        while (true) {
            if (!range.contains(Integer.valueOf(iIntValue))) {
                Logger.m1866d(TAG, "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (AudioSource.isSettingsSupported(iIntValue, i11, i12)) {
                    return iIntValue;
                }
                Logger.m1866d(TAG, "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i11 + " and source format " + i12);
            }
            if (arrayList == null) {
                Logger.m1866d(TAG, "Trying common sample rates in proximity order to target " + i13 + "Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AudioConfigUtil.m2182a(i13, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i14 >= arrayList.size()) {
                Logger.m1866d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }

    public static CaptureEncodeRates resolveSampleRates(Range<Integer> range, int i11, int i12, int i13, Rational rational) {
        int iSelectSampleRateOrNearestSupported;
        int encodeRate;
        if (rational == null) {
            iSelectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(range, i12, i13, i11);
            encodeRate = iSelectSampleRateOrNearestSupported;
        } else {
            Range<Integer> rangeCreate = AudioSpec.SAMPLE_RATE_RANGE_AUTO;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(CaptureEncodeRatesKt.toCaptureRate(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(CaptureEncodeRatesKt.toCaptureRate(((Integer) range.getUpper()).intValue(), rational)));
            }
            iSelectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(rangeCreate, i12, i13, CaptureEncodeRatesKt.toCaptureRate(i11, rational));
            encodeRate = CaptureEncodeRatesKt.toEncodeRate(iSelectSampleRateOrNearestSupported, rational);
        }
        Logger.m1866d(TAG, String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(iSelectSampleRateOrNearestSupported), Integer.valueOf(encodeRate), range, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), rational));
        return new CaptureEncodeRates(iSelectSampleRateOrNearestSupported, encodeRate);
    }

    public static int scaleAndClampBitrate(int i11, int i12, int i13, int i14, int i15, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue());
        String str = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(iDoubleValue)) : "";
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        Logger.m1866d(TAG, str);
        return iDoubleValue;
    }

    private AudioConfigUtil() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2182a(int i11, Integer num, Integer num2) {
        float fSignum;
        int iAbs = Math.abs(num.intValue() - i11) - Math.abs(num2.intValue() - i11);
        if (iAbs == 0) {
            fSignum = Math.signum(num.intValue() - num2.intValue());
        } else {
            fSignum = Math.signum(iAbs);
        }
        return (int) fSignum;
    }

    public static AudioEncoderConfig resolveAudioEncoderConfig(AudioMimeInfo audioMimeInfo, Timebase timebase, AudioSettings audioSettings, AudioSpec audioSpec) {
        Supplier audioEncoderConfigDefaultResolver;
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        if (compatibleAudioProfile != null) {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, compatibleAudioProfile);
        } else {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings);
        }
        return (AudioEncoderConfig) audioEncoderConfigDefaultResolver.get();
    }

    public static AudioMimeInfo resolveAudioMimeInfo(MediaSpec mediaSpec, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
        String strOutputFormatToAudioMime = MediaSpec.outputFormatToAudioMime(mediaSpec.getOutputFormat());
        int iOutputFormatToAudioProfile = MediaSpec.outputFormatToAudioProfile(mediaSpec.getOutputFormat());
        if (videoValidatedEncoderProfilesProxy != null && videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() != null) {
            defaultAudioProfile = videoValidatedEncoderProfilesProxy.getDefaultAudioProfile();
            String mediaType = defaultAudioProfile.getMediaType();
            int profile = defaultAudioProfile.getProfile();
            if (Objects.equals(mediaType, EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE)) {
                Logger.m1866d(TAG, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            } else if (mediaSpec.getOutputFormat() == -1) {
                Logger.m1866d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + profile + ")]");
                strOutputFormatToAudioMime = mediaType;
                iOutputFormatToAudioProfile = profile;
            } else if (Objects.equals(strOutputFormatToAudioMime, mediaType) && iOutputFormatToAudioProfile == profile) {
                Logger.m1866d(TAG, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + iOutputFormatToAudioProfile + ")]");
                strOutputFormatToAudioMime = mediaType;
            } else {
                Logger.m1866d(TAG, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + mediaType + "(profile: " + profile + "), chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            }
            defaultAudioProfile = null;
        } else {
            defaultAudioProfile = null;
        }
        AudioMimeInfo.Builder profile2 = AudioMimeInfo.builder(strOutputFormatToAudioMime).setProfile(iOutputFormatToAudioProfile);
        if (defaultAudioProfile != null) {
            profile2.setCompatibleAudioProfile(defaultAudioProfile);
        }
        return profile2.build();
    }

    public static AudioSettings resolveAudioSettings(AudioMimeInfo audioMimeInfo, AudioSpec audioSpec, Rational rational) {
        Supplier audioSettingsDefaultResolver;
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        if (compatibleAudioProfile != null) {
            audioSettingsDefaultResolver = new AudioSettingsAudioProfileResolver(audioSpec, compatibleAudioProfile, rational);
        } else {
            audioSettingsDefaultResolver = new AudioSettingsDefaultResolver(audioSpec, rational);
        }
        return (AudioSettings) audioSettingsDefaultResolver.get();
    }

    public static int resolveAudioSource(AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.m1866d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.m1866d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public static int resolveAudioSourceFormat(AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.m1866d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.m1866d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }
}
