package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final SparseArray<SubtitleTranscodingTrackOutput> textTrackOutputs = new SparseArray<>();

    public void resetSubtitleParsers() {
        for (int i11 = 0; i11 < this.textTrackOutputs.size(); i11++) {
            this.textTrackOutputs.valueAt(i11).resetSubtitleParser();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        if (i12 != 3) {
            return this.delegate.track(i11, i12);
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.textTrackOutputs.get(i11);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(this.delegate.track(i11, i12), this.subtitleParserFactory);
        this.textTrackOutputs.put(i11, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.delegate.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }
}
