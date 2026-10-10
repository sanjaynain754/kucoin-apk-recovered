package androidx.media3.exoplayer.rtsp.reader;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface RtpPayloadReader {

    public interface Factory {
        @Nullable
        RtpPayloadReader createPayloadReader(RtpPayloadFormat rtpPayloadFormat);
    }

    void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, int i11);

    void onReceivingFirstPacket(long j11, int i11);

    void seek(long j11, long j12);
}
