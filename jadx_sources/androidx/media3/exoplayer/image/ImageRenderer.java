package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ImageRenderer extends BaseRenderer {
    private static final long IMAGE_PRESENTATION_WINDOW_THRESHOLD_US = 30000;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM_THEN_WAIT = 2;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 3;
    private static final String TAG = "ImageRenderer";
    private int currentTileIndex;

    @Nullable
    private ImageDecoder decoder;
    private final ImageDecoder.Factory decoderFactory;
    private int decoderReinitializationState;
    private int firstFrameState;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private ImageOutput imageOutput;

    @Nullable
    private DecoderInputBuffer inputBuffer;

    @Nullable
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long largestQueuedPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;

    @Nullable
    private TileInfo nextTileInfo;

    @Nullable
    private Bitmap outputBitmap;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private boolean readyToOutputTiles;

    @Nullable
    private TileInfo tileInfo;

    public static class TileInfo {
        private final long presentationTimeUs;
        private Bitmap tileBitmap;
        private final int tileIndex;

        public long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        @Nullable
        public Bitmap getTileBitmap() {
            return this.tileBitmap;
        }

        public int getTileIndex() {
            return this.tileIndex;
        }

        public boolean hasTileBitmap() {
            return this.tileBitmap != null;
        }

        public void setTileBitmap(Bitmap bitmap) {
            this.tileBitmap = bitmap;
        }

        public TileInfo(int i11, long j11) {
            this.tileIndex = i11;
            this.presentationTimeUs = j11;
        }
    }

    public ImageRenderer(ImageDecoder.Factory factory, @Nullable ImageOutput imageOutput) {
        super(4);
        this.decoderFactory = factory;
        this.imageOutput = getImageOutput(imageOutput);
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.largestQueuedPresentationTimeUs = C2711C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C2711C.TIME_UNSET;
        this.decoderReinitializationState = 0;
        this.firstFrameState = 1;
    }

    private void releaseDecoderResources() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = C2711C.TIME_UNSET;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.decoder = null;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges.clear();
        releaseDecoderResources();
        this.imageOutput.onDisabled();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        lowerFirstFrameState(1);
        this.outputStreamEnded = false;
        this.inputStreamEnded = false;
        this.outputBitmap = null;
        this.tileInfo = null;
        this.nextTileInfo = null;
        this.readyToOutputTiles = false;
        this.inputBuffer = null;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.pendingOutputStreamChanges.clear();
    }

    public static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        public final long previousStreamLastBufferTimeUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j11, long j12) {
            this.previousStreamLastBufferTimeUs = j11;
            this.streamOffsetUs = j12;
        }
    }

    private boolean canCreateDecoderForFormat(Format format) {
        int iSupportsFormat = this.decoderFactory.supportsFormat(format);
        return iSupportsFormat == RendererCapabilities.create(4) || iSupportsFormat == RendererCapabilities.create(3);
    }

    private Bitmap cropTileFromImageGrid(int i11) {
        Assertions.checkStateNotNull(this.outputBitmap);
        int width = this.outputBitmap.getWidth() / ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal;
        int height = this.outputBitmap.getHeight() / ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical;
        int i12 = this.inputFormat.tileCountHorizontal;
        return Bitmap.createBitmap(this.outputBitmap, (i11 % i12) * width, (i11 / i12) * height, width, height);
    }

    private boolean drainOutput(long j11, long j12) throws ExoPlaybackException, ImageDecoderException {
        if (this.outputBitmap != null && this.tileInfo == null) {
            return false;
        }
        if (this.firstFrameState == 0 && getState() != 2) {
            return false;
        }
        if (this.outputBitmap == null) {
            Assertions.checkStateNotNull(this.decoder);
            ImageOutputBuffer imageOutputBufferDequeueOutputBuffer = this.decoder.dequeueOutputBuffer();
            if (imageOutputBufferDequeueOutputBuffer == null) {
                return false;
            }
            if (((ImageOutputBuffer) Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).isEndOfStream()) {
                if (this.decoderReinitializationState == 3) {
                    releaseDecoderResources();
                    Assertions.checkStateNotNull(this.inputFormat);
                    initDecoder();
                } else {
                    ((ImageOutputBuffer) Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).release();
                    if (this.pendingOutputStreamChanges.isEmpty()) {
                        this.outputStreamEnded = true;
                    }
                }
                return false;
            }
            Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer.bitmap, "Non-EOS buffer came back from the decoder without bitmap.");
            this.outputBitmap = imageOutputBufferDequeueOutputBuffer.bitmap;
            ((ImageOutputBuffer) Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).release();
        }
        if (!this.readyToOutputTiles || this.outputBitmap == null || this.tileInfo == null) {
            return false;
        }
        Assertions.checkStateNotNull(this.inputFormat);
        Format format = this.inputFormat;
        int i11 = format.tileCountHorizontal;
        boolean z11 = ((i11 == 1 && format.tileCountVertical == 1) || i11 == -1 || format.tileCountVertical == -1) ? false : true;
        if (!this.tileInfo.hasTileBitmap()) {
            TileInfo tileInfo = this.tileInfo;
            tileInfo.setTileBitmap(z11 ? cropTileFromImageGrid(tileInfo.getTileIndex()) : (Bitmap) Assertions.checkStateNotNull(this.outputBitmap));
        }
        if (!processOutputBuffer(j11, j12, (Bitmap) Assertions.checkStateNotNull(this.tileInfo.getTileBitmap()), this.tileInfo.getPresentationTimeUs())) {
            return false;
        }
        onProcessedOutputBuffer(((TileInfo) Assertions.checkStateNotNull(this.tileInfo)).getPresentationTimeUs());
        this.firstFrameState = 3;
        if (!z11 || ((TileInfo) Assertions.checkStateNotNull(this.tileInfo)).getTileIndex() == (((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal) - 1) {
            this.outputBitmap = null;
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
        return true;
    }

    private boolean feedInputBuffer(long j11) throws DecoderException {
        if (this.readyToOutputTiles && this.tileInfo != null) {
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder == null || this.decoderReinitializationState == 3 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer decoderInputBufferDequeueInputBuffer = imageDecoder.dequeueInputBuffer();
            this.inputBuffer = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 2) {
            Assertions.checkStateNotNull(this.inputBuffer);
            this.inputBuffer.setFlags(4);
            ((ImageDecoder) Assertions.checkStateNotNull(this.decoder)).queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 3;
            return false;
        }
        int source = readSource(formatHolder, this.inputBuffer, 0);
        if (source == -5) {
            this.inputFormat = (Format) Assertions.checkStateNotNull(formatHolder.format);
            this.decoderReinitializationState = 2;
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.inputBuffer.flip();
        ByteBuffer byteBuffer = this.inputBuffer.data;
        boolean z11 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream();
        if (z11) {
            ((ImageDecoder) Assertions.checkStateNotNull(this.decoder)).queueInputBuffer((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer));
            this.currentTileIndex = 0;
        }
        maybeAdvanceTileInfo(j11, (DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer));
        if (((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream()) {
            this.inputStreamEnded = true;
            this.inputBuffer = null;
            return false;
        }
        this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).timeUs);
        if (z11) {
            this.inputBuffer = null;
        } else {
            ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).clear();
        }
        return !this.readyToOutputTiles;
    }

    private static ImageOutput getImageOutput(@Nullable ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.NO_OP : imageOutput;
    }

    private void initDecoder() throws ExoPlaybackException {
        if (!canCreateDecoderForFormat(this.inputFormat)) {
            throw createRendererException(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.inputFormat, 4005);
        }
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
        }
        this.decoder = this.decoderFactory.createImageDecoder();
    }

    private boolean isTileLastInGrid(TileInfo tileInfo) {
        return ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal == -1 || this.inputFormat.tileCountVertical == -1 || tileInfo.getTileIndex() == (((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * this.inputFormat.tileCountHorizontal) - 1;
    }

    private void lowerFirstFrameState(int i11) {
        this.firstFrameState = Math.min(this.firstFrameState, i11);
    }

    private void onProcessedOutputBuffer(long j11) {
        this.lastProcessedOutputBufferTimeUs = j11;
        while (!this.pendingOutputStreamChanges.isEmpty() && j11 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.removeFirst();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 != 15) {
            super.handleMessage(i11, obj);
        } else {
            setImageOutput(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        int i11 = this.firstFrameState;
        if (i11 != 3) {
            return i11 == 0 && this.readyToOutputTiles;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        this.firstFrameState = z12 ? 1 : 0;
    }

    public boolean processOutputBuffer(long j11, long j12, Bitmap bitmap, long j13) throws ExoPlaybackException {
        long j14 = j13 - j11;
        if (!shouldForceRender() && j14 >= 30000) {
            return false;
        }
        this.imageOutput.onImageAvailable(j13 - this.outputStreamInfo.streamOffsetUs, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            this.inputFormat = (Format) Assertions.checkStateNotNull(formatHolder.format);
            initDecoder();
        }
        try {
            TraceUtil.beginSection("drainAndFeedDecoder");
            while (drainOutput(j11, j12)) {
            }
            while (feedInputBuffer(j11)) {
            }
            TraceUtil.endSection();
        } catch (ImageDecoderException e11) {
            throw createRendererException(e11, null, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return this.decoderFactory.supportsFormat(format);
    }

    private void maybeAdvanceTileInfo(long j11, DecoderInputBuffer decoderInputBuffer) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (decoderInputBuffer.isEndOfStream()) {
            this.readyToOutputTiles = true;
            return;
        }
        TileInfo tileInfo = new TileInfo(this.currentTileIndex, decoderInputBuffer.timeUs);
        this.nextTileInfo = tileInfo;
        this.currentTileIndex++;
        if (!this.readyToOutputTiles) {
            long presentationTimeUs = tileInfo.getPresentationTimeUs();
            if (presentationTimeUs - 30000 <= j11 && j11 <= 30000 + presentationTimeUs) {
                z11 = true;
            } else {
                z11 = false;
            }
            TileInfo tileInfo2 = this.tileInfo;
            if (tileInfo2 != null && tileInfo2.getPresentationTimeUs() <= j11 && j11 < presentationTimeUs) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zIsTileLastInGrid = isTileLastInGrid((TileInfo) Assertions.checkStateNotNull(this.nextTileInfo));
            if (!z11 && !z12 && !zIsTileLastInGrid) {
                z13 = false;
            }
            this.readyToOutputTiles = z13;
            if (z12 && !z11) {
                return;
            }
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
    }

    private void setImageOutput(@Nullable ImageOutput imageOutput) {
        this.imageOutput = getImageOutput(imageOutput);
    }

    private boolean shouldForceRender() {
        boolean z11;
        if (getState() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.firstFrameState;
        if (i11 != 0) {
            if (i11 == 1) {
                return true;
            }
            if (i11 == 3) {
                return false;
            }
            throw new IllegalStateException();
        }
        return z11;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        releaseDecoderResources();
        lowerFirstFrameState(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j11, j12, mediaPeriodId);
        if (this.outputStreamInfo.streamOffsetUs != C2711C.TIME_UNSET) {
            if (this.pendingOutputStreamChanges.isEmpty()) {
                long j13 = this.largestQueuedPresentationTimeUs;
                if (j13 != C2711C.TIME_UNSET) {
                    long j14 = this.lastProcessedOutputBufferTimeUs;
                    if (j14 != C2711C.TIME_UNSET) {
                    }
                }
            }
            this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j12));
            return;
        }
        this.outputStreamInfo = new OutputStreamInfo(C2711C.TIME_UNSET, j12);
    }
}
