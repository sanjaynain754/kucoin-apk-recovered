package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
public class SwappedVideoEncoderInfo implements VideoEncoderInfo {
    private final VideoEncoderInfo mVideoEncoderInfo;

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.mVideoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.mVideoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return this.mVideoEncoderInfo.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedBitrateRange() {
        return this.mVideoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeights() {
        return this.mVideoEncoderInfo.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeightsFor(int i11) {
        return this.mVideoEncoderInfo.getSupportedWidthsFor(i11);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidths() {
        return this.mVideoEncoderInfo.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidthsFor(int i11) {
        return this.mVideoEncoderInfo.getSupportedHeightsFor(i11);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.mVideoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i11, int i12) {
        return this.mVideoEncoderInfo.isSizeSupported(i12, i11);
    }

    public SwappedVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo) {
        Preconditions.checkArgument(videoEncoderInfo.canSwapWidthHeight());
        this.mVideoEncoderInfo = videoEncoderInfo;
    }
}
