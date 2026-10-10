package androidx.media3.extractor.text;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class CuesWithTiming {
    public final ImmutableList<Cue> cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j11, long j12) {
        this.cues = ImmutableList.copyOf((Collection) list);
        this.startTimeUs = j11;
        this.durationUs = j12;
        long j13 = C2711C.TIME_UNSET;
        if (j11 != C2711C.TIME_UNSET && j12 != C2711C.TIME_UNSET) {
            j13 = j11 + j12;
        }
        this.endTimeUs = j13;
    }
}
