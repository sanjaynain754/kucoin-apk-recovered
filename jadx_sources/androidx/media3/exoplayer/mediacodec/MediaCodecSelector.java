package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.r
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.getDecoderInfos(str, z11, z12);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z11, boolean z12) throws MediaCodecUtil.DecoderQueryException;
}
