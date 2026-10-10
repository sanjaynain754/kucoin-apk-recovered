package androidx.media3.extractor.p021ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface ElementaryStreamReader {
    void consume(ParsableByteArray parsableByteArray) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void packetFinished(boolean z11);

    void packetStarted(long j11, int i11);

    void seek();
}
