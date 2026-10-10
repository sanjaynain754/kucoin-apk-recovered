package androidx.media3.exoplayer.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final Ordering<CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = Ordering.natural().onResultOf(new Function() { // from class: androidx.media3.exoplayer.text.a
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).startTimeUs);
        }
    }).compound(Ordering.natural().reverse().onResultOf(new Function() { // from class: androidx.media3.exoplayer.text.b
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).durationUs);
        }
    }));
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j11) {
        int i11 = 0;
        while (i11 < this.cuesWithTimingList.size()) {
            long j12 = this.cuesWithTimingList.get(i11).startTimeUs;
            if (j11 > j12 && j11 > this.cuesWithTimingList.get(i11).endTimeUs) {
                this.cuesWithTimingList.remove(i11);
                i11--;
            } else if (j11 < j12) {
                return;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j11) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C2711C.TIME_UNSET);
        Assertions.checkArgument(cuesWithTiming.durationUs != C2711C.TIME_UNSET);
        boolean z11 = cuesWithTiming.startTimeUs <= j11 && j11 < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z11;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z11;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList<Cue> getCuesAtTimeUs(long j11) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j11 >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i11);
                    if (j11 >= cuesWithTiming.startTimeUs && j11 < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j11 < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i12 = 0; i12 < immutableListSortedCopyOf.size(); i12++) {
                    builder.addAll((Iterable) ((CuesWithTiming) immutableListSortedCopyOf.get(i12)).cues);
                }
                return builder.build();
            }
        }
        return ImmutableList.m13439of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j11) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C2711C.TIME_UNSET;
        }
        if (j11 < this.cuesWithTimingList.get(0).startTimeUs) {
            return C2711C.TIME_UNSET;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
            long j12 = this.cuesWithTimingList.get(i11).startTimeUs;
            long j13 = this.cuesWithTimingList.get(i11).endTimeUs;
            if (j13 > j11) {
                if (j12 > j11) {
                    break;
                }
                jMax = Math.max(jMax, j12);
            } else {
                jMax = Math.max(jMax, j13);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j11) {
        long jMin = -9223372036854775807L;
        for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
            long j12 = this.cuesWithTimingList.get(i11).startTimeUs;
            long j13 = this.cuesWithTimingList.get(i11).endTimeUs;
            if (j11 < j12) {
                if (jMin == C2711C.TIME_UNSET) {
                    jMin = j12;
                    break;
                }
                jMin = Math.min(jMin, j12);
                break;
            }
            if (j11 < j13) {
                if (jMin == C2711C.TIME_UNSET) {
                    jMin = j13;
                } else {
                    jMin = Math.min(jMin, j13);
                }
            }
        }
        if (jMin != C2711C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}
