package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return this.seekMap.getSeekPoints(j11);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }
}
