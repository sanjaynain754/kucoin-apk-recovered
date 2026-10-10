package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DvbSubtitleReader implements ElementaryStreamReader {
    private int bytesToCheck;
    private final TrackOutput[] outputs;
    private int sampleBytesWritten;
    private long sampleTimeUs = C2711C.TIME_UNSET;
    private final List<TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
    private boolean writingSample;

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i11 = 0; i11 < this.outputs.length; i11++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.subtitleInfos.get(i11);
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_DVBSUBS).setInitializationData(Collections.singletonList(dvbSubtitleInfo.initializationData)).setLanguage(dvbSubtitleInfo.language).build());
            this.outputs[i11] = trackOutputTrack;
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        if (this.writingSample) {
            if (this.bytesToCheck != 2 || checkNextByte(parsableByteArray, 32)) {
                if (this.bytesToCheck != 1 || checkNextByte(parsableByteArray, 0)) {
                    int position = parsableByteArray.getPosition();
                    int iBytesLeft = parsableByteArray.bytesLeft();
                    for (TrackOutput trackOutput : this.outputs) {
                        parsableByteArray.setPosition(position);
                        trackOutput.sampleData(parsableByteArray, iBytesLeft);
                    }
                    this.sampleBytesWritten += iBytesLeft;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        if (this.writingSample) {
            Assertions.checkState(this.sampleTimeUs != C2711C.TIME_UNSET);
            for (TrackOutput trackOutput : this.outputs) {
                trackOutput.sampleMetadata(this.sampleTimeUs, 1, this.sampleBytesWritten, 0, null);
            }
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
        this.sampleBytesWritten = 0;
        this.bytesToCheck = 2;
    }

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> list) {
        this.subtitleInfos = list;
        this.outputs = new TrackOutput[list.size()];
    }

    private boolean checkNextByte(ParsableByteArray parsableByteArray, int i11) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray.readUnsignedByte() != i11) {
            this.writingSample = false;
        }
        this.bytesToCheck--;
        return this.writingSample;
    }
}
