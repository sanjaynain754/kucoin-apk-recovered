package androidx.media3.exoplayer.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j11) {
        for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
            if (j11 < this.cuesWithTimingList.get(i11).startTimeUs) {
                return i11;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j11) {
        boolean z11;
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C2711C.TIME_UNSET);
        if (cuesWithTiming.startTimeUs <= j11) {
            long j12 = cuesWithTiming.endTimeUs;
            if (j12 == C2711C.TIME_UNSET || j11 < j12) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z11;
            }
            if (this.cuesWithTimingList.get(size).startTimeUs <= j11) {
                z11 = false;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z11;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j11) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j11 < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i11 = 1; i11 < this.cuesWithTimingList.size(); i11++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i11);
            if (j11 < cuesWithTiming.startTimeUs) {
                long j12 = this.cuesWithTimingList.get(i11 - 1).endTimeUs;
                return (j12 == C2711C.TIME_UNSET || j12 <= j11 || j12 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j12;
            }
        }
        long j13 = ((CuesWithTiming) Iterables.getLast(this.cuesWithTimingList)).endTimeUs;
        if (j13 == C2711C.TIME_UNSET || j11 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j11) {
        if (this.cuesWithTimingList.isEmpty() || j11 < this.cuesWithTimingList.get(0).startTimeUs) {
            return C2711C.TIME_UNSET;
        }
        for (int i11 = 1; i11 < this.cuesWithTimingList.size(); i11++) {
            long j12 = this.cuesWithTimingList.get(i11).startTimeUs;
            if (j11 == j12) {
                return j12;
            }
            if (j11 < j12) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i11 - 1);
                long j13 = cuesWithTiming.endTimeUs;
                return (j13 == C2711C.TIME_UNSET || j13 > j11) ? cuesWithTiming.startTimeUs : j13;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Iterables.getLast(this.cuesWithTimingList);
        long j14 = cuesWithTiming2.endTimeUs;
        return (j14 == C2711C.TIME_UNSET || j11 < j14) ? cuesWithTiming2.startTimeUs : j14;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j11) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j11);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j12 = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1).endTimeUs;
        if (j12 == C2711C.TIME_UNSET || j12 >= j11) {
            indexOfCuesStartingAfter--;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList<Cue> getCuesAtTimeUs(long j11) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j11);
        if (indexOfCuesStartingAfter == 0) {
            return ImmutableList.m13439of();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j12 = cuesWithTiming.endTimeUs;
        if (j12 != C2711C.TIME_UNSET && j11 >= j12) {
            return ImmutableList.m13439of();
        }
        return cuesWithTiming.cues;
    }
}
