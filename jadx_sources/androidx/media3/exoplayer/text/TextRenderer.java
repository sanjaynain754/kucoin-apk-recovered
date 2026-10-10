package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final CueDecoder cueDecoder;
    private final DecoderInputBuffer cueDecoderInputBuffer;
    private CuesResolver cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;

    @Nullable
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;

    @Nullable
    private SubtitleInputBuffer nextSubtitleInputBuffer;
    private final TextOutput output;

    @Nullable
    private final Handler outputHandler;
    private boolean outputStreamEnded;

    @Nullable
    private IOException streamError;

    @Nullable
    private Format streamFormat;

    @Nullable
    private SubtitleOutputBuffer subtitle;

    @Nullable
    private SubtitleDecoder subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    public TextRenderer(TextOutput textOutput, @Nullable Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }

    private static boolean hasNoEventsAfter(@Nullable Subtitle subtitle, long j11) {
        return subtitle == null || subtitle.getEventTime(subtitle.getEventTimeCount() - 1) <= j11;
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        SubtitleDecoder subtitleDecoderCreateDecoder = this.subtitleDecoderFactory.createDecoder((Format) Assertions.checkNotNull(this.streamFormat));
        this.subtitleDecoder = subtitleDecoderCreateDecoder;
        subtitleDecoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = C2711C.TIME_UNSET;
        clearOutput();
        this.lastRendererPositionUs = C2711C.TIME_UNSET;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) {
        Format format = formatArr[0];
        this.streamFormat = format;
        if (isCuesWithTiming(format)) {
            this.cuesResolver = this.streamFormat.cueReplacementBehavior == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    public TextRenderer(TextOutput textOutput, @Nullable Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.output = (TextOutput) Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new CueDecoder();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = C2711C.TIME_UNSET;
        this.lastRendererPositionUs = C2711C.TIME_UNSET;
        this.legacyDecodingEnabled = false;
    }

    private void assertLegacyDecodingEnabledIfRequired() {
        Assertions.checkState(this.legacyDecodingEnabled || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.streamFormat.sampleMimeType, MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.streamFormat.sampleMimeType + " samples (expected " + MimeTypes.APPLICATION_MEDIA3_CUES + ").");
    }

    private void clearOutput() {
        updateOutput(new CueGroup(ImmutableList.m13439of(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    private long getCurrentEventTimeUs(long j11) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j11);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex != -1) {
            return this.subtitle.getEventTime(nextEventTimeIndex - 1);
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        return subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        Log.m2958e(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private static boolean isCuesWithTiming(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_MEDIA3_CUES);
    }

    private boolean readAndDecodeCuesWithTiming(long j11) {
        if (this.inputStreamEnded || readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.flip();
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.cueDecoderInputBuffer.data);
        CuesWithTiming cuesWithTimingDecode = this.cueDecoder.decode(this.cueDecoderInputBuffer.timeUs, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.cueDecoderInputBuffer.clear();
        return this.cuesResolver.addCues(cuesWithTimingDecode, j11);
    }

    private void renderFromSubtitles(long j11) throws DecoderException {
        boolean z11;
        this.lastRendererPositionUs = j11;
        if (this.nextSubtitle == null) {
            ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).setPositionUs(j11);
            try {
                this.nextSubtitle = ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e11) {
                handleDecoderError(e11);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z11 = false;
            while (nextEventTime <= j11) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.nextSubtitle;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z11 && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j11) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.subtitle;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j11);
                this.subtitle = subtitleOutputBuffer;
                this.nextSubtitle = null;
                z11 = true;
            }
        }
        if (z11) {
            Assertions.checkNotNull(this.subtitle);
            updateOutput(new CueGroup(this.subtitle.getCues(j11), getPresentationTimeUs(getCurrentEventTimeUs(j11))));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                SubtitleInputBuffer subtitleInputBufferDequeueInputBuffer = this.nextSubtitleInputBuffer;
                if (subtitleInputBufferDequeueInputBuffer == null) {
                    subtitleInputBufferDequeueInputBuffer = ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).dequeueInputBuffer();
                    if (subtitleInputBufferDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = subtitleInputBufferDequeueInputBuffer;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    subtitleInputBufferDequeueInputBuffer.setFlags(4);
                    ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int source = readSource(this.formatHolder, subtitleInputBufferDequeueInputBuffer, 0);
                if (source == -4) {
                    if (subtitleInputBufferDequeueInputBuffer.isEndOfStream()) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                    } else {
                        Format format = this.formatHolder.format;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBufferDequeueInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                        subtitleInputBufferDequeueInputBuffer.flip();
                        this.waitingForKeyFrame &= !subtitleInputBufferDequeueInputBuffer.isKeyFrame();
                    }
                    if (!this.waitingForKeyFrame) {
                        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBufferDequeueInputBuffer);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (source == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e12) {
                handleDecoderError(e12);
                return;
            }
        }
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z11) {
        this.legacyDecodingEnabled = z11;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeUpdateOutputInternal((CueGroup) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.streamFormat == null) {
            return true;
        }
        if (this.streamError == null) {
            try {
                maybeThrowStreamError();
            } catch (IOException e11) {
                this.streamError = e11;
            }
        }
        if (this.streamError != null) {
            if (isCuesWithTiming((Format) Assertions.checkNotNull(this.streamFormat))) {
                return ((CuesResolver) Assertions.checkNotNull(this.cuesResolver)).getNextCueChangeTimeUs(this.lastRendererPositionUs) != Long.MIN_VALUE;
            }
            if (this.outputStreamEnded || (this.inputStreamEnded && hasNoEventsAfter(this.subtitle, this.lastRendererPositionUs) && hasNoEventsAfter(this.nextSubtitle, this.lastRendererPositionUs) && this.nextSubtitleInputBuffer != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) {
        this.lastRendererPositionUs = j11;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = C2711C.TIME_UNSET;
        Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = (SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder);
        subtitleDecoder.flush();
        subtitleDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void renderFromCuesWithTiming(long j11) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j11);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !andDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j11) {
            andDecodeCuesWithTiming = true;
        }
        if (andDecodeCuesWithTiming) {
            ImmutableList<Cue> cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j11);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j11);
            updateOutput(new CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j11;
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws DecoderException {
        if (isCurrentStreamFinal()) {
            long j13 = this.finalStreamEndPositionUs;
            if (j13 != C2711C.TIME_UNSET && j11 >= j13) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        if (isCuesWithTiming((Format) Assertions.checkNotNull(this.streamFormat))) {
            Assertions.checkNotNull(this.cuesResolver);
            renderFromCuesWithTiming(j11);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j11);
        }
    }

    public void setFinalStreamEndPositionUs(long j11) {
        Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j11;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        int i11;
        if (!isCuesWithTiming(format) && !this.subtitleDecoderFactory.supportsFormat(format)) {
            if (MimeTypes.isText(format.sampleMimeType)) {
                return RendererCapabilities.create(1);
            }
            return RendererCapabilities.create(0);
        }
        if (format.cryptoType == 0) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        return RendererCapabilities.create(i11);
    }

    private long getPresentationTimeUs(long j11) {
        boolean z11;
        if (j11 != C2711C.TIME_UNSET) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        return j11 - getStreamOffsetUs();
    }
}
