package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;

    @Nullable
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;

    @Nullable
    public final ProgramInformation programInformation;
    public final long publishTimeMs;

    @Nullable
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;

    @Nullable
    public final UtcTimingElement utcTiming;

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final DashManifest copy(List<StreamKey> list) {
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i11 = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j11 = C2711C.TIME_UNSET;
            if (i11 >= periodCount) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i11) {
                long periodDurationMs = getPeriodDurationMs(i11);
                if (periodDurationMs != C2711C.TIME_UNSET) {
                    j12 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i11);
                arrayList.add(new Period(period.f3166id, period.startMs - j12, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i11++;
        }
        long j13 = this.durationMs;
        if (j13 != C2711C.TIME_UNSET) {
            j11 = j13 - j12;
        }
        return new DashManifest(this.availabilityStartTimeMs, j11, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }

    public final Period getPeriod(int i11) {
        return this.periods.get(i11);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i11) {
        long j11;
        long j12;
        if (i11 == this.periods.size() - 1) {
            j11 = this.durationMs;
            if (j11 == C2711C.TIME_UNSET) {
                return C2711C.TIME_UNSET;
            }
            j12 = this.periods.get(i11).startMs;
        } else {
            j11 = this.periods.get(i11 + 1).startMs;
            j12 = this.periods.get(i11).startMs;
        }
        return j11 - j12;
    }

    public DashManifest(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        List<Period> list2;
        this.availabilityStartTimeMs = j11;
        this.durationMs = j12;
        this.minBufferTimeMs = j13;
        this.dynamic = z11;
        this.minUpdatePeriodMs = j14;
        this.timeShiftBufferDepthMs = j15;
        this.suggestedPresentationDelayMs = j16;
        this.publishTimeMs = j17;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            list2 = list;
        }
        this.periods = list2;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i11 = streamKeyPoll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i12 = streamKeyPoll.groupIndex;
            AdaptationSet adaptationSet = list.get(i12);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i11) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i12);
            arrayList.add(new AdaptationSet(adaptationSet.f3164id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i11);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    public final long getPeriodDurationUs(int i11) {
        return Util.msToUs(getPeriodDurationMs(i11));
    }
}
