package androidx.media3.extractor.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CuesWithTimingSubtitle implements Subtitle {
    private static final Ordering<CuesWithTiming> CUES_BY_START_TIME_ASCENDING = Ordering.natural().onResultOf(new Function() { // from class: androidx.media3.extractor.text.b
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(CuesWithTimingSubtitle.normalizeUnsetStartTimeToZero(((CuesWithTiming) obj).startTimeUs));
        }
    });
    private static final String TAG = "CuesWithTimingSubtitle";
    private final ImmutableList<ImmutableList<Cue>> eventCues;
    private final long[] eventTimesUs;

    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) Iterables.getOnlyElement(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == C2711C.TIME_UNSET) {
                this.eventCues = ImmutableList.m13440of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = ImmutableList.m13441of((ImmutableList) cuesWithTiming.cues, ImmutableList.m13439of());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + jNormalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i11 = 0;
        for (int i12 = 0; i12 < immutableListSortedCopyOf.size(); i12++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) immutableListSortedCopyOf.get(i12);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j11 = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i11 != 0) {
                int i13 = i11 - 1;
                long j12 = this.eventTimesUs[i13];
                if (j12 < jNormalizeUnsetStartTimeToZero2) {
                    this.eventTimesUs[i11] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i11++;
                } else if (j12 == jNormalizeUnsetStartTimeToZero2 && ((ImmutableList) arrayList.get(i13)).isEmpty()) {
                    arrayList.set(i13, cuesWithTiming2.cues);
                } else {
                    Log.m2961w(TAG, "Truncating unsupported overlapping cues.");
                    this.eventTimesUs[i13] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.set(i13, cuesWithTiming2.cues);
                }
            } else {
                this.eventTimesUs[i11] = jNormalizeUnsetStartTimeToZero2;
                arrayList.add(cuesWithTiming2.cues);
                i11++;
            }
            if (cuesWithTiming2.durationUs != C2711C.TIME_UNSET) {
                this.eventTimesUs[i11] = j11;
                arrayList.add(ImmutableList.m13439of());
                i11++;
            }
        }
        this.eventCues = ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public ImmutableList<Cue> getCues(long j11) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j11, true, false);
        return iBinarySearchFloor == -1 ? ImmutableList.m13439of() : this.eventCues.get(iBinarySearchFloor);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i11) {
        Assertions.checkArgument(i11 < this.eventCues.size());
        return this.eventTimesUs[i11];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j11) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j11, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    private static long normalizeUnsetStartTimeToZero(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return 0L;
        }
        return j11;
    }
}
