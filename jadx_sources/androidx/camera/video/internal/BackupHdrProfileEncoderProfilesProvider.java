package androidx.camera.video.internal;

import android.util.Rational;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "BackupHdrProfileEncoderProfilesProvider";
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;
    private final VideoEncoderInfo.Finder mVideoEncoderInfoFinder;

    private EncoderProfilesProxy appendBackupVideoProfile(EncoderProfilesProxy encoderProfilesProxy, int i11, int i12) {
        EncoderProfilesProxy.VideoProfileProxy next;
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(encoderProfilesProxy.getVideoProfiles());
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getHdrFormat() != 0);
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyValidateOrAdapt = validateOrAdapt(generateBackupProfile(next, i11, i12), this.mVideoEncoderInfoFinder);
        if (videoProfileProxyValidateOrAdapt != null) {
            arrayList.add(videoProfileProxyValidateOrAdapt);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    private static int deriveProfile(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 4096;
        }
        if (i11 == 3) {
            return 8192;
        }
        if (i11 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    @VisibleForTesting
    public static EncoderProfilesProxy.VideoProfileProxy validateOrAdapt(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, VideoEncoderInfo.Finder finder) {
        VideoEncoderInfo videoEncoderInfoFind;
        if (videoProfileProxy == null || (videoEncoderInfoFind = finder.find(videoProfileProxy.getMediaType())) == null || !videoEncoderInfoFind.isSizeSupportedAllowSwapping(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())) {
            return null;
        }
        int bitrate = videoProfileProxy.getBitrate();
        int iIntValue = ((Integer) videoEncoderInfoFind.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate))).intValue();
        return iIntValue == bitrate ? videoProfileProxy : modifyBitrate(videoProfileProxy, iIntValue);
    }

    private static int deriveCodec(int i11) {
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    private static EncoderProfilesProxy.VideoProfileProxy generateBackupProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i11, int i12) {
        if (videoProfileProxy == null) {
            return null;
        }
        int codec = videoProfileProxy.getCodec();
        String mediaType = videoProfileProxy.getMediaType();
        int profile = videoProfileProxy.getProfile();
        if (i11 != videoProfileProxy.getHdrFormat()) {
            codec = deriveCodec(i11);
            mediaType = deriveMediaType(codec);
            profile = deriveProfile(i11);
        }
        return EncoderProfilesProxy.VideoProfileProxy.create(codec, mediaType, scaleBitrate(videoProfileProxy.getBitrate(), i12, videoProfileProxy.getBitDepth()), videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), profile, i12, videoProfileProxy.getChromaSubsampling(), i11);
    }

    private EncoderProfilesProxy getProfilesInternal(int i11) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i11)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyAppendBackupVideoProfile = appendBackupVideoProfile(this.mEncoderProfilesProvider.getAll(i11), 1, 10);
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), encoderProfilesProxyAppendBackupVideoProfile);
        return encoderProfilesProxyAppendBackupVideoProfile;
    }

    private static int scaleBitrate(int i11, int i12, int i13) {
        if (i12 == i13) {
            return i11;
        }
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            Logger.m1866d(TAG, String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mEncoderProfilesProvider.hasProfile(i11) && getProfilesInternal(i11) != null;
    }

    public BackupHdrProfileEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, VideoEncoderInfo.Finder finder) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = finder;
    }

    private static String deriveMediaType(int i11) {
        return EncoderProfilesProxy.getVideoCodecMimeType(i11);
    }

    private static EncoderProfilesProxy.VideoProfileProxy modifyBitrate(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i11) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), i11, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }
}
