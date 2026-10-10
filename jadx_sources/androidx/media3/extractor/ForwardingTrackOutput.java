package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ForwardingTrackOutput implements TrackOutput {
    private final TrackOutput trackOutput;

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11) throws IOException {
        return this.trackOutput.sampleData(dataReader, i11, z11);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        this.trackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11) {
        this.trackOutput.sampleData(parsableByteArray, i11);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
        this.trackOutput.sampleMetadata(j11, i11, i12, i13, cryptoData);
    }

    public ForwardingTrackOutput(TrackOutput trackOutput) {
        this.trackOutput = trackOutput;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
        return this.trackOutput.sampleData(dataReader, i11, z11, i12);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
        this.trackOutput.sampleData(parsableByteArray, i11, i12);
    }
}
