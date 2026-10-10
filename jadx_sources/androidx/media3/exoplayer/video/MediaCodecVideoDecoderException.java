package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable Surface surface) {
        boolean z11;
        super(th2, mediaCodecInfo);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.isSurfaceValid = z11;
    }
}
