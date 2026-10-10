package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DiscardingTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
        int i13 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i11));
        if (i13 != -1) {
            return i13;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
        parsableByteArray.skipBytes(i11);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
    }
}
