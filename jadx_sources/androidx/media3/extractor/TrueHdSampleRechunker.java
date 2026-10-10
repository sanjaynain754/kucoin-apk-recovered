package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TrueHdSampleRechunker {
    private int chunkFlags;
    private int chunkOffset;
    private int chunkSampleCount;
    private int chunkSize;
    private long chunkTimeUs;
    private boolean foundSyncframe;
    private final byte[] syncframePrefix = new byte[10];

    public void reset() {
        this.foundSyncframe = false;
        this.chunkSampleCount = 0;
    }

    public void outputPendingSampleMetadata(TrackOutput trackOutput, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.chunkSampleCount > 0) {
            trackOutput.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, cryptoData);
            this.chunkSampleCount = 0;
        }
    }

    public void sampleMetadata(TrackOutput trackOutput, long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
        Assertions.checkState(this.chunkOffset <= i12 + i13, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.foundSyncframe) {
            int i14 = this.chunkSampleCount;
            int i15 = i14 + 1;
            this.chunkSampleCount = i15;
            if (i14 == 0) {
                this.chunkTimeUs = j11;
                this.chunkFlags = i11;
                this.chunkSize = 0;
            }
            this.chunkSize += i12;
            this.chunkOffset = i13;
            if (i15 >= 16) {
                outputPendingSampleMetadata(trackOutput, cryptoData);
            }
        }
    }

    public void startSample(ExtractorInput extractorInput) throws IOException {
        if (this.foundSyncframe) {
            return;
        }
        extractorInput.peekFully(this.syncframePrefix, 0, 10);
        extractorInput.resetPeekPosition();
        if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == 0) {
            return;
        }
        this.foundSyncframe = true;
    }
}
