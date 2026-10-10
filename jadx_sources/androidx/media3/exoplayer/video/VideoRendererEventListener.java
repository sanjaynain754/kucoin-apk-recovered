package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final VideoRendererEventListener listener;

        public void decoderInitialized(final String str, final long j11, final long j12) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3457b.listener)).onVideoDecoderInitialized(str, j11, j12);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3486b.listener)).onVideoDecoderReleased(str);
                    }
                });
            }
        }

        public void droppedFrames(final int i11, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3463b.listener)).onDroppedFrames(i11, j11);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3474b.listener)).onVideoEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3476b.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3466b.listener)).onRenderedFirstFrame(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j11, final int i11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3469b.listener)).onVideoFrameProcessingOffset(j11, i11);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3472b.listener)).onVideoCodecError(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f3461b.listener)).onVideoSizeChanged(videoSize);
                    }
                });
            }
        }

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            Handler handler2;
            if (videoRendererEventListener != null) {
                handler2 = (Handler) Assertions.checkNotNull(handler);
            } else {
                handler2 = null;
            }
            this.handler = handler2;
            this.listener = videoRendererEventListener;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m3499d(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoDisabled(decoderCounters);
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.m3499d(this.f3479b, decoderCounters);
                    }
                });
            }
        }
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void onDroppedFrames(int i11, long j11) {
    }

    default void onRenderedFirstFrame(Object obj, long j11) {
    }

    default void onVideoFrameProcessingOffset(long j11, int i11) {
    }

    default void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoDecoderInitialized(String str, long j11, long j12) {
    }
}
