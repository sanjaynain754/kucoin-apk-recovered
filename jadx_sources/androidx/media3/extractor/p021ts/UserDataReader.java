package androidx.media3.extractor.p021ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class UserDataReader {
    private static final int USER_DATA_START_CODE = 434;
    private final List<Format> closedCaptionFormats;
    private final TrackOutput[] outputs;

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i11 = 0; i11 < this.outputs.length; i11++) {
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i11);
            String str = format.sampleMimeType;
            Assertions.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i11] = trackOutputTrack;
        }
    }

    public UserDataReader(List<Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new TrackOutput[list.size()];
    }

    public void consume(long j11, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 9) {
            int i11 = parsableByteArray.readInt();
            int i12 = parsableByteArray.readInt();
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (i11 == USER_DATA_START_CODE && i12 == 1195456820 && unsignedByte == 3) {
                CeaUtil.consumeCcData(j11, parsableByteArray, this.outputs);
            }
        }
    }
}
