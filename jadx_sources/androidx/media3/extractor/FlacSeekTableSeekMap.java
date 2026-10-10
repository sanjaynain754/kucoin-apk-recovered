package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FlacSeekTableSeekMap implements SeekMap {
    private final long firstFrameOffset;
    private final FlacStreamMetadata flacStreamMetadata;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.flacStreamMetadata.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        Assertions.checkStateNotNull(this.flacStreamMetadata.seekTable);
        FlacStreamMetadata flacStreamMetadata = this.flacStreamMetadata;
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.seekTable;
        long[] jArr = seekTable.pointSampleNumbers;
        long[] jArr2 = seekTable.pointOffsets;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, flacStreamMetadata.getSampleNumber(j11), true, false);
        SeekPoint seekPoint = getSeekPoint(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPoint.timeUs == j11 || iBinarySearchFloor == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i11 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, getSeekPoint(jArr[i11], jArr2[i11]));
    }

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j11) {
        this.flacStreamMetadata = flacStreamMetadata;
        this.firstFrameOffset = j11;
    }

    private SeekPoint getSeekPoint(long j11, long j12) {
        return new SeekPoint((j11 * 1000000) / ((long) this.flacStreamMetadata.sampleRate), this.firstFrameOffset + j12);
    }
}
