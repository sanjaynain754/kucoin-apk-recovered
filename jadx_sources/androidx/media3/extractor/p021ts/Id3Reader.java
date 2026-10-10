package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Id3Reader implements ElementaryStreamReader {
    private static final String TAG = "Id3Reader";
    private TrackOutput output;
    private int sampleBytesRead;
    private int sampleSize;
    private boolean writingSample;
    private final ParsableByteArray id3Header = new ParsableByteArray(10);
    private long sampleTimeUs = C2711C.TIME_UNSET;

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        if (this.writingSample) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            int i11 = this.sampleBytesRead;
            if (i11 < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i11);
                System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), this.id3Header.getData(), this.sampleBytesRead, iMin);
                if (this.sampleBytesRead + iMin == 10) {
                    this.id3Header.setPosition(0);
                    if (73 != this.id3Header.readUnsignedByte() || 68 != this.id3Header.readUnsignedByte() || 51 != this.id3Header.readUnsignedByte()) {
                        Log.m2961w(TAG, "Discarding invalid ID3 tag");
                        this.writingSample = false;
                        return;
                    } else {
                        this.id3Header.skipBytes(3);
                        this.sampleSize = this.id3Header.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.sampleSize - this.sampleBytesRead);
            this.output.sampleData(parsableByteArray, iMin2);
            this.sampleBytesRead += iMin2;
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        int i11;
        Assertions.checkStateNotNull(this.output);
        if (this.writingSample && (i11 = this.sampleSize) != 0 && this.sampleBytesRead == i11) {
            Assertions.checkState(this.sampleTimeUs != C2711C.TIME_UNSET);
            this.output.sampleMetadata(this.sampleTimeUs, 1, this.sampleSize, 0, null);
            this.writingSample = false;
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.writingSample = true;
        this.sampleTimeUs = j11;
        this.sampleSize = 0;
        this.sampleBytesRead = 0;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }
}
