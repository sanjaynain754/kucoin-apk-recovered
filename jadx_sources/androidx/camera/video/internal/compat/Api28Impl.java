package androidx.camera.video.internal.compat;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(28)
public final class Api28Impl {
    private Api28Impl() {
    }

    public static Range<Integer> getQualityRange(MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
