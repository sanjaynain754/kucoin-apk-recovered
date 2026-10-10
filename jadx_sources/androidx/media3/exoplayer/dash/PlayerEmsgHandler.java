package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = Util.createHandlerForCurrentLooper(this);
    private final EventMessageDecoder decoder = new EventMessageDecoder();

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j11);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final MetadataInputBuffer buffer = new MetadataInputBuffer();
        private long maxLoadedChunkEndTimeUs = C2711C.TIME_UNSET;

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
            return this.sampleQueue.sampleData(dataReader, i11, z11);
        }

        public PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = SampleQueue.createWithoutDrm(allocator);
        }

        @Nullable
        private MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void onManifestExpiredMessageEncountered(long j11, long j12) {
            PlayerEmsgHandler.this.handler.sendMessage(PlayerEmsgHandler.this.handler.obtainMessage(1, new ManifestExpiryEventInfo(j11, j12)));
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                MetadataInputBuffer metadataInputBufferDequeueSample = dequeueSample();
                if (metadataInputBufferDequeueSample != null) {
                    long j11 = metadataInputBufferDequeueSample.timeUs;
                    Metadata metadataDecode = PlayerEmsgHandler.this.decoder.decode(metadataInputBufferDequeueSample);
                    if (metadataDecode != null) {
                        EventMessage eventMessage = (EventMessage) metadataDecode.get(0);
                        if (PlayerEmsgHandler.isPlayerEmsgEvent(eventMessage.schemeIdUri, eventMessage.value)) {
                            parsePlayerEmsgEvent(j11, eventMessage);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            this.sampleQueue.format(format);
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j11) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j11);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            long j11 = this.maxLoadedChunkEndTimeUs;
            if (j11 == C2711C.TIME_UNSET || chunk.endTimeUs > j11) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public boolean onChunkLoadError(Chunk chunk) {
            long j11 = this.maxLoadedChunkEndTimeUs;
            return PlayerEmsgHandler.this.onChunkLoadError(j11 != C2711C.TIME_UNSET && j11 < chunk.startTimeUs);
        }

        public void release() {
            this.sampleQueue.release();
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
            this.sampleQueue.sampleData(parsableByteArray, i11);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j11, i11, i12, i13, cryptoData);
            parseAndDiscardSamples();
        }

        private void parsePlayerEmsgEvent(long j11, EventMessage eventMessage) {
            long manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventMessage);
            if (manifestPublishTimeMsInEmsg == C2711C.TIME_UNSET) {
                return;
            }
            onManifestExpiredMessageEncountered(j11, manifestPublishTimeMsInEmsg);
        }
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    public void updateManifest(DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = C2711C.TIME_UNSET;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }

    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j11, long j12) {
            this.eventTimeUs = j11;
            this.manifestPublishTimeMsInEmsg = j12;
        }
    }

    @Nullable
    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j11) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
        try {
            return Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (ParserException unused) {
            return C2711C.TIME_UNSET;
        }
    }

    private void handleManifestExpiredMessage(long j11, long j12) {
        Long l11 = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j12));
        if (l11 == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j12), Long.valueOf(j11));
        } else if (l11.longValue() > j11) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j12), Long.valueOf(j11));
        }
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j11) {
        DashManifest dashManifest = this.manifest;
        boolean z11 = false;
        if (!dashManifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(dashManifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j11) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z11 = true;
        }
        if (z11) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z11;
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.allocator);
    }

    public boolean onChunkLoadError(boolean z11) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z11) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            if ("1".equals(str2) || "2".equals(str2) || "3".equals(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
