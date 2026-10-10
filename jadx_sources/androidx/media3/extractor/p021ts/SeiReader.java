package androidx.media3.extractor.p021ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final TrackOutput[] outputs;
    private final ReorderingSeiMessageQueue reorderingSeiMessageQueue = new ReorderingSeiMessageQueue(new ReorderingSeiMessageQueue.SeiConsumer() { // from class: androidx.media3.extractor.ts.e
        @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
        public final void consume(long j11, ParsableByteArray parsableByteArray) {
            CeaUtil.consume(j11, parsableByteArray, this.f3543a.outputs);
        }
    });

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i11 = 0; i11 < this.outputs.length; i11++) {
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i11);
            String str = format.sampleMimeType;
            Assertions.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String formatId = format.f2788id;
            if (formatId == null) {
                formatId = trackIdGenerator.getFormatId();
            }
            trackOutputTrack.format(new Format.Builder().setId(formatId).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i11] = trackOutputTrack;
        }
    }

    public void consume(long j11, ParsableByteArray parsableByteArray) {
        this.reorderingSeiMessageQueue.add(j11, parsableByteArray);
    }

    public void flush() {
        this.reorderingSeiMessageQueue.flush();
    }

    public void setReorderingQueueSize(int i11) {
        this.reorderingSeiMessageQueue.setMaxSize(i11);
    }

    public SeiReader(List<Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new TrackOutput[list.size()];
    }
}
