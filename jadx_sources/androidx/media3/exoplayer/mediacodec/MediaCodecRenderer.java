package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.OpusUtil;
import com.tencent.bugly.proguard.C33978va;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, BuiltinOptions.CallOnceOptions, BuiltinOptions.SquareOptions, -64, 11, -38, BuiltinOptions.CastOptions, -112, 0, 0, 1, BuiltinOptions.BroadcastToOptions, -50, 15, 19, 32, 0, 0, 1, BuiltinOptions.BatchMatMulOptions, -120, -124, 13, -50, BuiltinOptions.AssignVariableOptions, 24, -96, 0, BuiltinOptions.SelectOptions, -65, 28, BuiltinOptions.TransposeConvOptions, -61, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMinOptions};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;

    @Nullable
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;

    @Nullable
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @Nullable
    private MediaCodecInfo codecInfo;

    @Nullable
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;

    @Nullable
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private float currentPlaybackSpeed;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private boolean experimentalEnableProcessedStreamChangedAtStart;

    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastOutputBufferProcessedRealtimeMs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;

    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;

    @Nullable
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;

    @Nullable
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;

    @Nullable
    private ExoPlaybackException pendingPlaybackException;

    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;

    @Nullable
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    @Nullable
    private Renderer.WakeupListener wakeupListener;

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;

        @Nullable
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z11, int i11) {
            this("Decoder init failed: [" + i11 + "], " + format, th2, format.sampleMimeType, z11, null, buildCustomDiagnosticInfo(i11), null);
        }

        private static String buildCustomDiagnosticInfo(int i11) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : "") + Math.abs(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z11, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th2, format.sampleMimeType, z11, mediaCodecInfo, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(@Nullable String str, @Nullable Throwable th2, @Nullable String str2, boolean z11, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z11;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        private MediaCodecRendererCodecAdapterListener() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
        this.oggOpusAudioPacketizer.reset();
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            if (!drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || Util.SDK_INT < 23) {
                return true;
            }
            UUID uuid = C2711C.PLAYREADY_UUID;
            if (!uuid.equals(drmSession.getSchemeUuid()) && !uuid.equals(drmSession2.getSchemeUuid())) {
                return !mediaCodecInfo.secure && (drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.requiresSecureDecoder((String) Assertions.checkNotNull(format.sampleMimeType))));
            }
        }
        return true;
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
        } else {
            this.codecOutputMediaFormat = outputFormat;
            this.codecOutputMediaFormatChanged = true;
        }
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.experimentalEnableProcessedStreamChangedAtStart = true;
    }

    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public boolean getCodecNeedsEosPropagation() {
        return false;
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z11) throws MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j11, long j12) {
        return getDurationToProgressUs(this.codecRegisteredOnBufferAvailableListener, j11, j12);
    }

    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f11);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Nullable
    @CallSuper
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        int i11;
        boolean z11 = true;
        this.waitingForFirstSampleInFormat = true;
        Format formatBuild = (Format) Assertions.checkNotNull(formatHolder.format);
        String str = formatBuild.sampleMimeType;
        if (str == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), formatBuild, 4005);
        }
        if (Objects.equals(str, "video/av01") && !formatBuild.initializationData.isEmpty()) {
            formatBuild = formatBuild.buildUpon().setInitializationData(null).build();
        }
        Format format = formatBuild;
        setSourceDrmSession(formatHolder.drmSession);
        this.inputFormat = format;
        if (this.bypassEnabled) {
            this.bypassDrainAndReinitialize = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null) {
            this.availableCodecInfos = null;
            maybeInitCodecOrBypass();
            return null;
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull(this.codecInfo);
        Format format2 = (Format) Assertions.checkNotNull(this.codecInputFormat);
        if (drmNeedsCodecReinitialization(mediaCodecInfo, format, this.codecDrmSession, this.sourceDrmSession)) {
            drainAndReinitializeCodec();
            return new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, 128);
        }
        boolean z12 = this.sourceDrmSession != this.codecDrmSession;
        Assertions.checkState(!z12 || Util.SDK_INT >= 23);
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = canReuseCodec(mediaCodecInfo, format2, format);
        int i12 = decoderReuseEvaluationCanReuseCodec.result;
        if (i12 != 0) {
            i11 = 16;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (updateCodecOperatingRate(format)) {
                        this.codecInputFormat = format;
                        if (z12 && !drainAndUpdateCodecDrmSessionV23()) {
                            i11 = 2;
                        }
                    }
                } else if (updateCodecOperatingRate(format)) {
                    this.codecReconfigured = true;
                    this.codecReconfigurationState = 1;
                    int i13 = this.codecAdaptationWorkaroundMode;
                    if (i13 != 2 && (i13 != 1 || format.width != format2.width || format.height != format2.height)) {
                        z11 = false;
                    }
                    this.codecNeedsAdaptationWorkaroundBuffer = z11;
                    this.codecInputFormat = format;
                    if (z12 && !drainAndUpdateCodecDrmSessionV23()) {
                        i11 = 2;
                    }
                }
            } else if (updateCodecOperatingRate(format)) {
                this.codecInputFormat = format;
                if (!z12 ? !drainAndFlushCodec() : !drainAndUpdateCodecDrmSessionV23()) {
                    i11 = 2;
                }
            }
            return (decoderReuseEvaluationCanReuseCodec.result != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? decoderReuseEvaluationCanReuseCodec : new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, i11);
        }
        drainAndReinitializeCodec();
        i11 = 0;
        if (decoderReuseEvaluationCanReuseCodec.result != 0) {
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
            this.oggOpusAudioPacketizer.reset();
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    public abstract boolean processOutputBuffer(long j11, long j12, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, Format format) throws ExoPlaybackException;

    /* JADX WARN: Multi-variable type inference failed */
    public void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(((MediaCodecInfo) Assertions.checkNotNull(this.codecInfo)).name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.mediaCrypto = null;
                setCodecDrmSession(null);
                resetCodecStateForRelease();
            }
        } catch (Throwable th2) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.mediaCrypto = null;
                setCodecDrmSession(null);
                resetCodecStateForRelease();
            }
        }
    }

    public final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean shouldReinitCodec() {
        return false;
    }

    public boolean shouldSkipDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e11) {
            throw createRendererException(e11, format, 4002);
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    public final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
            }
        }
    }

    public static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(C2711C.TIME_UNSET, C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        public final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j11, long j12, long j13) {
            this.previousStreamLastBufferTimeUs = j11;
            this.startPositionUs = j12;
            this.streamOffsetUs = j13;
        }
    }

    private void bypassRead() throws ExoPlaybackException {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int source = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source == -4) {
                if (!this.bypassSampleBuffer.isEndOfStream()) {
                    this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                    if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                        this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    }
                    if (this.waitingForFirstSampleInFormat) {
                        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                        this.outputFormat = format;
                        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && !this.outputFormat.initializationData.isEmpty()) {
                            this.outputFormat = ((Format) Assertions.checkNotNull(this.outputFormat)).buildUpon().setEncoderDelay(OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0))).build();
                        }
                        onOutputFormatChanged(this.outputFormat, null);
                        this.waitingForFirstSampleInFormat = false;
                    }
                    this.bypassSampleBuffer.flip();
                    Format format2 = this.outputFormat;
                    if (format2 != null && Objects.equals(format2.sampleMimeType, MimeTypes.AUDIO_OPUS)) {
                        if (this.bypassSampleBuffer.hasSupplementalData()) {
                            DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
                            decoderInputBuffer.format = this.outputFormat;
                            handleInputBufferSupplementalData(decoderInputBuffer);
                        }
                        if (OpusUtil.needToDecodeOpusFrame(getLastResetPositionUs(), this.bypassSampleBuffer.timeUs)) {
                            this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, ((Format) Assertions.checkNotNull(this.outputFormat)).initializationData);
                        }
                    }
                    if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                        break;
                    }
                } else {
                    this.inputStreamEnded = true;
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
            } else {
                if (source != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                return;
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean bypassRender(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            z11 = false;
            if (!processOutputBuffer(j11, j12, null, batchBuffer.data, this.outputIndex, 0, batchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs()), this.bypassBatchBuffer.isEndOfStream(), (Format) Assertions.checkNotNull(this.outputFormat))) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        } else {
            z11 = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z11;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z11;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z11;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z11;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z11;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i11 = Util.SDK_INT;
        if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i11 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Util.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        int i11 = Util.SDK_INT;
        if (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i11 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure;
        }
        return true;
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    @TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBufferIndex;
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    iDequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                long j13 = this.lastOutputBufferProcessedRealtimeMs;
                if (j13 != C2711C.TIME_UNSET && j13 + 100 < getClock().currentTimeMillis()) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(iDequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.isDecodeOnlyOutputBuffer = this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs();
            long j14 = this.lastBufferInStreamPresentationTimeUs;
            this.isLastOutputBuffer = j14 != C2711C.TIME_UNSET && j14 <= this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                ByteBuffer byteBuffer2 = this.outputBuffer;
                int i11 = this.outputIndex;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                z11 = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(j11, j12, mediaCodecAdapter, byteBuffer2, i11, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z11 = false;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i12 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
            zProcessOutputBuffer = processOutputBuffer(j11, j12, mediaCodecAdapter, byteBuffer3, i12, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z12 = (this.outputBufferInfo.flags & 4) != 0 ? true : z11;
            if (!z12 && this.codecReceivedEos && this.isLastOutputBuffer) {
                this.lastOutputBufferProcessedRealtimeMs = getClock().currentTimeMillis();
            }
            resetOutputBuffer();
            if (!z12) {
                return true;
            }
            processEndOfStream();
        }
        return z11;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int i11;
        if (this.codec == null || (i11 = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i11 == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (this.inputIndex < 0) {
            int iDequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = mediaCodecAdapter.getInputBuffer(iDequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.buffer.data);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i12 = 0; i12 < ((Format) Assertions.checkNotNull(this.codecInputFormat)).initializationData.size(); i12++) {
                ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).put(this.codecInputFormat.initializationData.get(i12));
            }
            this.codecReconfigurationState = 2;
        }
        int iPosition = ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int source = readSource(formatHolder, this.buffer, 0);
            if (source == -3) {
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                return false;
            }
            if (source == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            if (shouldSkipDecoderInputBuffer(this.buffer)) {
                this.buffer.clear();
                this.decoderCounters.skippedInputBufferCount++;
                return true;
            }
            boolean zIsEncrypted = this.buffer.isEncrypted();
            if (zIsEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            long j11 = this.buffer.timeUs;
            if (this.waitingForFirstSampleInFormat) {
                if (this.pendingOutputStreamChanges.isEmpty()) {
                    this.outputStreamInfo.formatQueue.add(j11, (Format) Assertions.checkNotNull(this.inputFormat));
                } else {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j11, (Format) Assertions.checkNotNull(this.inputFormat));
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j11);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            int codecBufferFlags = getCodecBufferFlags(this.buffer);
            if (zIsEncrypted) {
                ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j11, codecBufferFlags);
            } else {
                ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueInputBuffer(this.inputIndex, 0, ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).limit(), j11, codecBufferFlags);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.queuedInputBufferCount++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e11) {
            onCodecError(e11);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            ((MediaCodecAdapter) Assertions.checkStateNotNull(this.codec)).flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z11) throws MediaCodecUtil.DecoderQueryException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z11);
        if (!decoderInfos.isEmpty() || !z11) {
            return decoderInfos;
        }
        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.mediaCodecSelector, format, false);
        if (!decoderInfos2.isEmpty()) {
            Log.m2961w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos2 + C33978va.f72339h);
        }
        return decoderInfos2;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, @Nullable MediaCrypto mediaCrypto) throws Exception {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        String str = mediaCodecInfo.name;
        int i11 = Util.SDK_INT;
        float codecOperatingRateV23 = i11 < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        float f11 = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        onReadyToInitializeCodec(format);
        long jElapsedRealtime = getClock().elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, f11);
        if (i11 >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodecAdapter mediaCodecAdapterCreateAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = mediaCodecAdapterCreateAdapter;
            this.codecRegisteredOnBufferAvailableListener = mediaCodecAdapterCreateAdapter.registerOnBufferAvailableListener(new MediaCodecRendererCodecAdapterListener());
            TraceUtil.endSection();
            long jElapsedRealtime2 = getClock().elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(format)) {
                Log.m2961w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(format), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f11;
            this.codecInputFormat = format;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            TraceUtil.endSection();
            throw th2;
        }
    }

    private boolean initMediaCryptoIfDrmSessionReady() throws ExoPlaybackException {
        Assertions.checkState(this.mediaCrypto == null);
        DrmSession drmSession = this.codecDrmSession;
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSession.getError());
                throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (MediaCryptoException e11) {
                throw createRendererException(e11, this.inputFormat, 6006);
            }
        }
        return true;
    }

    private boolean isDecodeOnly(long j11, long j12) {
        if (j12 >= j11) {
            return false;
        }
        Format format = this.outputFormat;
        return (format != null && Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && OpusUtil.needToDecodeOpusFrame(j11, j12)) ? false : true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void maybeInitCodecWithFallback(@Nullable MediaCrypto mediaCrypto, boolean z11) throws DecoderInitializationException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z11);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e11) {
                throw new DecoderInitializationException(format, e11, z11, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format, (Throwable) null, z11, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) Assertions.checkNotNull(this.availableCodecInfos);
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull((MediaCodecInfo) arrayDeque2.peekFirst());
            if (!shouldInitCodec(mediaCodecInfo)) {
                return;
            }
            try {
                initCodec(mediaCodecInfo, mediaCrypto);
            } catch (Exception e12) {
                Log.m2962w(TAG, "Failed to initialize decoder: " + mediaCodecInfo, e12);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(format, e12, z11, mediaCodecInfo);
                onCodecError(decoderInitializationException);
                if (this.preferredDecoderInitializationException == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    @TargetApi(23)
    private void processEndOfStream() throws ExoPlaybackException {
        int i11 = this.codecDrainAction;
        if (i11 == 1) {
            flushCodec();
            return;
        }
        if (i11 == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i11 == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void setCodecDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        long j11 = outputStreamInfo.streamOffsetUs;
        if (j11 != C2711C.TIME_UNSET) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(j11);
        }
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueRendering(long j11) {
        return this.renderTimeLimitMs == C2711C.TIME_UNSET || getClock().elapsedRealtime() - j11 < this.renderTimeLimitMs;
    }

    public static boolean supportsFormatDrm(Format format) {
        int i11 = format.cryptoType;
        return i11 == 0 || i11 == 2;
    }

    private boolean updateCodecOperatingRate(@Nullable Format format) throws ExoPlaybackException {
        if (Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, (Format) Assertions.checkNotNull(format), getStreamFormats());
            float f11 = this.codecOperatingRate;
            if (f11 == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f11 == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    @RequiresApi(23)
    private void updateDrmSessionV23() throws ExoPlaybackException {
        CryptoConfig cryptoConfig = ((DrmSession) Assertions.checkNotNull(this.sourceDrmSession)).getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                ((MediaCrypto) Assertions.checkNotNull(this.mediaCrypto)).setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e11) {
                throw createRendererException(e11, this.inputFormat, 6006);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    public MediaCodecDecoderException createDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th2, mediaCodecInfo);
    }

    public boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i11 = this.codecDrainAction;
        if (i11 == 3 || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i11 == 2) {
            int i12 = Util.SDK_INT;
            Assertions.checkState(i12 >= 23);
            if (i12 >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ExoPlaybackException e11) {
                    Log.m2962w(TAG, "Failed to update the DRM session, releasing the codec instead.", e11);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    @Nullable
    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    @Nullable
    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    public float getCodecOperatingRateV23(float f11, Format format, Format[] formatArr) {
        return -1.0f;
    }

    @Nullable
    public final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    public long getDurationToProgressUs(boolean z11, long j11, long j12) {
        return super.getDurationToProgressUs(j11, j12);
    }

    public long getLastBufferInStreamPresentationTimeUs() {
        return this.lastBufferInStreamPresentationTimeUs;
    }

    public final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    public final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    public float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    @Nullable
    public final Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 == 11) {
            this.wakeupListener = (Renderer.WakeupListener) obj;
        } else {
            super.handleMessage(i11, obj);
        }
    }

    public final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    public final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat == null) {
            return false;
        }
        if (isSourceReady() || hasOutputBuffer()) {
            return true;
        }
        return this.codecHotswapDeadlineMs != C2711C.TIME_UNSET && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    public final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        boolean z11;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                DrmSession drmSession = this.codecDrmSession;
                if (drmSession == null || !(drmSession.getState() == 3 || this.codecDrmSession.getState() == 4)) {
                    z11 = false;
                } else if (this.codecDrmSession.requiresSecureDecoder((String) Assertions.checkStateNotNull(format.sampleMimeType))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                maybeInitCodecWithFallback(this.mediaCrypto, z11);
            } catch (DecoderInitializationException e11) {
                throw createRendererException(e11, format, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    @CallSuper
    public void onProcessedOutputBuffer(long j11) {
        this.lastProcessedOutputBufferTimeUs = j11;
        while (!this.pendingOutputStreamChanges.isEmpty() && j11 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo((OutputStreamInfo) Assertions.checkNotNull(this.pendingOutputStreamChanges.poll()));
            onProcessedStreamChange();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        if (this.outputStreamInfo.streamOffsetUs == C2711C.TIME_UNSET) {
            setOutputStreamInfo(new OutputStreamInfo(C2711C.TIME_UNSET, j11, j12));
            if (this.experimentalEnableProcessedStreamChangedAtStart) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        if (this.pendingOutputStreamChanges.isEmpty()) {
            long j13 = this.largestQueuedPresentationTimeUs;
            if (j13 != C2711C.TIME_UNSET) {
                long j14 = this.lastProcessedOutputBufferTimeUs;
                if (j14 != C2711C.TIME_UNSET) {
                }
            }
            setOutputStreamInfo(new OutputStreamInfo(C2711C.TIME_UNSET, j11, j12));
            if (this.outputStreamInfo.streamOffsetUs != C2711C.TIME_UNSET) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j11, j12));
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        boolean z11 = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j11, j12)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long jElapsedRealtime = getClock().elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j11, j12) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j11);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e11) {
            throw createRendererException(e11, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e11.getErrorCode()));
        } catch (IllegalStateException e12) {
            if (!isMediaCodecException(e12)) {
                throw e12;
            }
            onCodecError(e12);
            if ((e12 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e12).isRecoverable()) {
                z11 = true;
            }
            if (z11) {
                releaseCodec();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionCreateDecoderException = createDecoderException(e12, getCodecInfo());
            throw createRendererException(mediaCodecDecoderExceptionCreateDecoderException, this.inputFormat, z11, mediaCodecDecoderExceptionCreateDecoderException.errorCode == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
        }
    }

    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f11, float f12) throws ExoPlaybackException {
        this.currentPlaybackSpeed = f11;
        this.targetPlaybackSpeed = f12;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void setRenderTimeLimitMs(long j11) {
        this.renderTimeLimitMs = j11;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final void updateOutputFormatForTime(long j11) throws ExoPlaybackException {
        Format formatPollFloor = this.outputStreamInfo.formatQueue.pollFloor(j11);
        if (formatPollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            formatPollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        onOutputFormatChanged((Format) Assertions.checkNotNull(this.outputFormat), this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    public MediaCodecRenderer(int i11, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z11, float f11) {
        super(i11);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z11;
        this.assumedMinimumCodecOperatingRate = f11;
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = C2711C.TIME_UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = C2711C.TIME_UNSET;
        this.largestQueuedPresentationTimeUs = C2711C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C2711C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C2711C.TIME_UNSET;
        this.lastOutputBufferProcessedRealtimeMs = C2711C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if (!"audio/mp4a-latm".equals(str) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        }
        this.bypassEnabled = true;
    }

    private boolean readSourceOmittingSampleData(int i11) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int source = readSource(formatHolder, this.noDataBuffer, i11 | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source == -4 && this.noDataBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            processEndOfStream();
            return false;
        }
        return false;
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    @CallSuper
    public void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = C2711C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.lastOutputBufferProcessedRealtimeMs = C2711C.TIME_UNSET;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.largestQueuedPresentationTimeUs = C2711C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C2711C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C2711C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    @CallSuper
    public void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    public void onProcessedStreamChange() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public void onCodecError(Exception exc) {
    }

    public void onCodecReleased(String str) {
    }

    public void onOutputStreamOffsetUsChanged(long j11) {
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public void onReadyToInitializeCodec(Format format) throws ExoPlaybackException {
    }

    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j11, long j12) {
    }
}
