package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes34.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j11);

    void clear();

    void discardCuesBeforeTimeUs(long j11);

    ImmutableList<Cue> getCuesAtTimeUs(long j11);

    long getNextCueChangeTimeUs(long j11);

    long getPreviousCueChangeTimeUs(long j11);
}
