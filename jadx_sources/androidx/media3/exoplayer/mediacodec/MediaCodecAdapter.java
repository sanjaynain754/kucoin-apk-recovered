package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface MediaCodecAdapter {

    public static final class Configuration {
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final MediaCrypto crypto;
        public final Format format;

        @Nullable
        public final LoudnessCodecController loudnessCodecController;
        public final MediaFormat mediaFormat;

        @Nullable
        public final Surface surface;

        public static Configuration createForAudioDecoding(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, @Nullable MediaCrypto mediaCrypto, @Nullable LoudnessCodecController loudnessCodecController) {
            return new Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto, loudnessCodecController);
        }

        public static Configuration createForVideoDecoding(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new Configuration(mediaCodecInfo, mediaFormat, format, surface, mediaCrypto, null);
        }

        private Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable LoudnessCodecController loudnessCodecController) {
            this.codecInfo = mediaCodecInfo;
            this.mediaFormat = mediaFormat;
            this.format = format;
            this.surface = surface;
            this.crypto = mediaCrypto;
            this.loudnessCodecController = loudnessCodecController;
        }
    }

    public interface Factory {

        @Deprecated
        public static final Factory DEFAULT = new DefaultMediaCodecAdapterFactory();

        MediaCodecAdapter createAdapter(Configuration configuration) throws IOException;

        static Factory getDefault(Context context) {
            return new DefaultMediaCodecAdapterFactory(context);
        }
    }

    public interface OnFrameRenderedListener {
        void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j11, long j12);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(35)
    void detachOutputSurface();

    void flush();

    @Nullable
    ByteBuffer getInputBuffer(int i11);

    @RequiresApi(26)
    PersistableBundle getMetrics();

    @Nullable
    ByteBuffer getOutputBuffer(int i11);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13);

    default boolean registerOnBufferAvailableListener(OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i11, long j11);

    void releaseOutputBuffer(int i11, boolean z11);

    @RequiresApi(23)
    void setOnFrameRenderedListener(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    @RequiresApi(23)
    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i11);

    public interface OnBufferAvailableListener {
        default void onInputBufferAvailable() {
        }

        default void onOutputBufferAvailable() {
        }
    }
}
