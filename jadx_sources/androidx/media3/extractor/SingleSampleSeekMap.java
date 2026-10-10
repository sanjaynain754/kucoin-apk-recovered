package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SingleSampleSeekMap implements SeekMap {
    private final long durationUs;
    private final long startPosition;

    public SingleSampleSeekMap(long j11) {
        this(j11, 0L);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public SingleSampleSeekMap(long j11, long j12) {
        this.durationUs = j11;
        this.startPosition = j12;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return new SeekMap.SeekPoints(new SeekPoint(j11, this.startPosition));
    }
}
