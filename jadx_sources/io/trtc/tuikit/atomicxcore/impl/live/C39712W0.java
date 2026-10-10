package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.W0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39712W0 extends TRTCCloudListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39716Y0 f88228a;

    public C39712W0(C39716Y0 c39716y0) {
        this.f88228a = c39716y0;
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public final void onStatistics(TRTCStatistics statistics) {
        Object value;
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        ArrayList arrayList = new ArrayList();
        for (TRTCStatistics.TRTCLocalStatistics localStatistics : statistics.localArray) {
            Intrinsics.checkNotNull(localStatistics);
            Intrinsics.checkNotNullParameter(localStatistics, "localStatistics");
            arrayList.add(new AVStatistics("", localStatistics.videoBitrate, localStatistics.width, localStatistics.height, localStatistics.frameRate, localStatistics.audioSampleRate, localStatistics.audioBitrate));
        }
        for (TRTCStatistics.TRTCRemoteStatistics remoteStatistics : statistics.remoteArray) {
            Intrinsics.checkNotNull(remoteStatistics);
            Intrinsics.checkNotNullParameter(remoteStatistics, "remoteStatistics");
            String userId = remoteStatistics.userId;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            arrayList.add(new AVStatistics(userId, remoteStatistics.videoBitrate, remoteStatistics.width, remoteStatistics.height, remoteStatistics.frameRate, remoteStatistics.audioSampleRate, remoteStatistics.audioBitrate));
        }
        InterfaceC41669n interfaceC41669n = this.f88228a.f88239f;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }
}
