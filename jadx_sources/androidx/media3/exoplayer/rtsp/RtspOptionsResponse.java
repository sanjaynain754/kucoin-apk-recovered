package androidx.media3.exoplayer.rtsp;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class RtspOptionsResponse {
    public final int status;
    public final ImmutableList<Integer> supportedMethods;

    public RtspOptionsResponse(int i11, List<Integer> list) {
        this.status = i11;
        this.supportedMethods = ImmutableList.copyOf((Collection) list);
    }
}
