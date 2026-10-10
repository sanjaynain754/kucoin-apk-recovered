package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
abstract class TagPayloadReader {
    protected final TrackOutput output;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public abstract boolean parseHeader(ParsableByteArray parsableByteArray) throws ParserException;

    public abstract boolean parsePayload(ParsableByteArray parsableByteArray, long j11) throws ParserException;

    public abstract void seek();

    public TagPayloadReader(TrackOutput trackOutput) {
        this.output = trackOutput;
    }

    public final boolean consume(ParsableByteArray parsableByteArray, long j11) throws ParserException {
        if (parseHeader(parsableByteArray) && parsePayload(parsableByteArray, j11)) {
            return true;
        }
        return false;
    }
}
