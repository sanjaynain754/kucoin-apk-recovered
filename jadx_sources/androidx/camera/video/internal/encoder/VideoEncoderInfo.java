package androidx.camera.video.internal.encoder;

import android.util.Range;

/* JADX INFO: loaded from: classes23.dex */
public interface VideoEncoderInfo extends EncoderInfo {

    public interface Finder {
        VideoEncoderInfo find(String str);
    }

    boolean canSwapWidthHeight();

    int getHeightAlignment();

    Range<Integer> getSupportedBitrateRange();

    Range<Integer> getSupportedHeights();

    Range<Integer> getSupportedHeightsFor(int i11);

    Range<Integer> getSupportedWidths();

    Range<Integer> getSupportedWidthsFor(int i11);

    int getWidthAlignment();

    boolean isSizeSupported(int i11, int i12);

    default boolean isSizeSupportedAllowSwapping(int i11, int i12) {
        if (!isSizeSupported(i11, i12)) {
            if (!canSwapWidthHeight() || !isSizeSupported(i12, i11)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
