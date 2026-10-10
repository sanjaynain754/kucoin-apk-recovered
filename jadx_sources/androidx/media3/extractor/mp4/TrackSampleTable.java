package androidx.media3.extractor.mp4;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final long[] timestampsUs;
    public final Track track;

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j11) {
        for (int iBinarySearchFloor = Util.binarySearchFloor(this.timestampsUs, j11, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.flags[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j11) {
        for (int iBinarySearchCeil = Util.binarySearchCeil(this.timestampsUs, j11, true, false); iBinarySearchCeil < this.timestampsUs.length; iBinarySearchCeil++) {
            if ((this.flags[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        boolean z11;
        boolean z12;
        if (iArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        if (jArr.length == jArr2.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        Assertions.checkArgument(z12);
        Assertions.checkArgument(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i11;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.durationUs = j11;
        this.sampleCount = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | C2711C.BUFFER_FLAG_LAST_SAMPLE;
        }
    }
}
