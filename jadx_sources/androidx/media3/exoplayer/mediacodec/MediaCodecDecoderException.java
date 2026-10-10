package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(sb2.toString(), th2);
        this.codecInfo = mediaCodecInfo;
        String diagnosticInfo = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.diagnosticInfo = diagnosticInfo;
        this.errorCode = Util.SDK_INT >= 23 ? getErrorCodeV23(th2) : Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfo);
    }

    @RequiresApi(23)
    private static int getErrorCodeV23(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
