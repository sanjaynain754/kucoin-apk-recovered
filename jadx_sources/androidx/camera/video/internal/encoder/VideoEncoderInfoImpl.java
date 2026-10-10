package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class VideoEncoderInfoImpl extends EncoderInfoImpl implements VideoEncoderInfo {
    public static final VideoEncoderInfo.Finder FINDER = new VideoEncoderInfo.Finder() { // from class: androidx.camera.video.internal.encoder.s0
        @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder
        public final VideoEncoderInfo find(String str) {
            return VideoEncoderInfoImpl.m2223a(str);
        }
    };
    private static final String TAG = "VideoEncoderInfoImpl";
    private final MediaCodecInfo.VideoCapabilities mVideoCapabilities;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ VideoEncoderInfo m2223a(String str) {
        try {
            return VideoEncoderInfoWrapper.from(new VideoEncoderInfoImpl(CodecUtil.findCodecAndGetCodecInfo(str), str), null);
        } catch (InvalidConfigException e11) {
            Logger.m1873w(TAG, "Unable to find a VideoEncoderInfoImpl", e11);
            return null;
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return true;
    }

    private static IllegalArgumentException toIllegalArgumentException(Throwable th2) {
        return th2 instanceof IllegalArgumentException ? (IllegalArgumentException) th2 : new IllegalArgumentException(th2);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.mVideoCapabilities.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedBitrateRange() {
        return this.mVideoCapabilities.getBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeights() {
        return this.mVideoCapabilities.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeightsFor(int i11) {
        try {
            return this.mVideoCapabilities.getSupportedHeightsFor(i11);
        } catch (Throwable th2) {
            throw toIllegalArgumentException(th2);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidths() {
        return this.mVideoCapabilities.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidthsFor(int i11) {
        try {
            return this.mVideoCapabilities.getSupportedWidthsFor(i11);
        } catch (Throwable th2) {
            throw toIllegalArgumentException(th2);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.mVideoCapabilities.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i11, int i12) {
        return this.mVideoCapabilities.isSizeSupported(i11, i12);
    }

    public VideoEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.mCodecCapabilities.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.mVideoCapabilities = videoCapabilities;
    }
}
