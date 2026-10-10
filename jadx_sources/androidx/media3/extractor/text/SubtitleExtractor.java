package androidx.media3.extractor.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class SubtitleExtractor implements Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    private int bytesRead;
    private final Format format;
    private final SubtitleParser subtitleParser;
    private TrackOutput trackOutput;
    private final CueEncoder cueEncoder = new CueEncoder();
    private byte[] subtitleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray scratchSampleArray = new ParsableByteArray();
    private final List<Sample> samples = new ArrayList();
    private int state = 0;
    private long[] timestamps = Util.EMPTY_LONG_ARRAY;
    private long seekTimeUs = C2711C.TIME_UNSET;

    public static class Sample implements Comparable<Sample> {
        private final byte[] data;
        private final long timeUs;

        private Sample(long j11, byte[] bArr) {
            this.timeUs = j11;
            this.data = bArr;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Long.compare(this.timeUs, sample.timeUs);
        }
    }

    private void writeToOutput() {
        long j11 = this.seekTimeUs;
        for (int iBinarySearchFloor = j11 == C2711C.TIME_UNSET ? 0 : Util.binarySearchFloor(this.timestamps, j11, true, true); iBinarySearchFloor < this.samples.size(); iBinarySearchFloor++) {
            writeToOutput(this.samples.get(iBinarySearchFloor));
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return true;
    }

    private void parseAndWriteToOutput() throws IOException {
        try {
            long j11 = this.seekTimeUs;
            this.subtitleParser.parse(this.subtitleData, 0, this.bytesRead, j11 != C2711C.TIME_UNSET ? SubtitleParser.OutputOptions.cuesAfterThenRemainingCuesBefore(j11) : SubtitleParser.OutputOptions.allCues(), new Consumer() { // from class: androidx.media3.extractor.text.c
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    SubtitleExtractor.m3535a(this.f3530a, (CuesWithTiming) obj);
                }
            });
            Collections.sort(this.samples);
            this.timestamps = new long[this.samples.size()];
            for (int i11 = 0; i11 < this.samples.size(); i11++) {
                this.timestamps[i11] = this.samples.get(i11).timeUs;
            }
            this.subtitleData = Util.EMPTY_BYTE_ARRAY;
        } catch (RuntimeException e11) {
            throw ParserException.createForMalformedContainer("SubtitleParser failed.", e11);
        }
    }

    private boolean readFromInput(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = this.subtitleData;
        if (bArr.length == this.bytesRead) {
            this.subtitleData = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.subtitleData;
        int i11 = this.bytesRead;
        int i12 = extractorInput.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            this.bytesRead += i12;
        }
        long length = extractorInput.getLength();
        return (length != -1 && ((long) this.bytesRead) == length) || i12 == -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        Assertions.checkState(this.state == 0);
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.format);
        extractorOutput.endTracks();
        extractorOutput.seekMap(new IndexSeekMap(new long[]{0}, new long[]{0}, C2711C.TIME_UNSET));
        this.state = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i11 = this.state;
        Assertions.checkState((i11 == 0 || i11 == 5) ? false : true);
        if (this.state == 1) {
            int iCheckedCast = extractorInput.getLength() != -1 ? Ints.checkedCast(extractorInput.getLength()) : 1024;
            if (iCheckedCast > this.subtitleData.length) {
                this.subtitleData = new byte[iCheckedCast];
            }
            this.bytesRead = 0;
            this.state = 2;
        }
        if (this.state == 2 && readFromInput(extractorInput)) {
            parseAndWriteToOutput();
            this.state = 4;
        }
        if (this.state == 3 && skipInput(extractorInput)) {
            writeToOutput();
            this.state = 4;
        }
        return this.state == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        if (this.state == 5) {
            return;
        }
        this.subtitleParser.reset();
        this.state = 5;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        int i11 = this.state;
        Assertions.checkState((i11 == 0 || i11 == 5) ? false : true);
        this.seekTimeUs = j12;
        if (this.state == 2) {
            this.state = 1;
        }
        if (this.state == 4) {
            this.state = 3;
        }
    }

    public SubtitleExtractor(SubtitleParser subtitleParser, Format format) {
        this.subtitleParser = subtitleParser;
        this.format = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setCueReplacementBehavior(subtitleParser.getCueReplacementBehavior()).build();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3535a(SubtitleExtractor subtitleExtractor, CuesWithTiming cuesWithTiming) {
        subtitleExtractor.getClass();
        Sample sample = new Sample(cuesWithTiming.startTimeUs, subtitleExtractor.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs));
        subtitleExtractor.samples.add(sample);
        long j11 = subtitleExtractor.seekTimeUs;
        if (j11 != C2711C.TIME_UNSET && cuesWithTiming.startTimeUs < j11) {
            return;
        }
        subtitleExtractor.writeToOutput(sample);
    }

    private boolean skipInput(ExtractorInput extractorInput) throws IOException {
        int iCheckedCast;
        if (extractorInput.getLength() != -1) {
            iCheckedCast = Ints.checkedCast(extractorInput.getLength());
        } else {
            iCheckedCast = 1024;
        }
        if (extractorInput.skip(iCheckedCast) == -1) {
            return true;
        }
        return false;
    }

    private void writeToOutput(Sample sample) {
        Assertions.checkStateNotNull(this.trackOutput);
        int length = sample.data.length;
        this.scratchSampleArray.reset(sample.data);
        this.trackOutput.sampleData(this.scratchSampleArray, length);
        this.trackOutput.sampleMetadata(sample.timeUs, 1, length, 0, null);
    }
}
