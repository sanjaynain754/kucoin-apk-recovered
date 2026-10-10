package androidx.media3.exoplayer.rtsp;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final ImmutableList<RtspTrackTiming> trackTimingList;

    public RtspPlayResponse(int i11, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i11;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = ImmutableList.copyOf((Collection) list);
    }
}
