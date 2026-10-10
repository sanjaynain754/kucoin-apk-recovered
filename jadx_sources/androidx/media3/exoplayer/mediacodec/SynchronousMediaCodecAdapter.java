package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;

    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        @SuppressLint({"WrongConstant"})
        public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecCreateCodec = createCodec(configuration);
                try {
                    TraceUtil.beginSection("configureCodec");
                    Surface surface = configuration.surface;
                    mediaCodecCreateCodec.configure(configuration.mediaFormat, surface, configuration.crypto, (surface == null && configuration.codecInfo.detachedSurfaceSupported && Util.SDK_INT >= 35) ? 8 : 0);
                    TraceUtil.endSection();
                    TraceUtil.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    TraceUtil.endSection();
                    return new SynchronousMediaCodecAdapter(mediaCodecCreateCodec, configuration.loudnessCodecController);
                } catch (IOException e11) {
                    e = e11;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e12) {
                    e = e12;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        }

        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            Assertions.checkNotNull(configuration.codecInfo);
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return mediaCodecCreateByCodecName;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.codec.releaseOutputBuffer(i11, z11);
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Util.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(35)
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i11) {
        return this.codec.getInputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i11) {
        return this.codec.getOutputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.codec.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13) {
        this.codec.queueSecureInputBuffer(i11, i12, cryptoInfo.getFrameworkCryptoInfo(), j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        try {
            int i11 = Util.SDK_INT;
            if (i11 >= 30 && i11 < 33) {
                this.codec.stop();
            }
        } finally {
            if (Util.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, long j11) {
        this.codec.releaseOutputBuffer(i11, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.z
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                SynchronousMediaCodecAdapter.m3332a(this.f3267a, onFrameRenderedListener, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i11) {
        this.codec.setVideoScalingMode(i11);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3332a(SynchronousMediaCodecAdapter synchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j11, long j12) {
        synchronousMediaCodecAdapter.getClass();
        onFrameRenderedListener.onFrameRendered(synchronousMediaCodecAdapter, j11, j12);
    }
}
