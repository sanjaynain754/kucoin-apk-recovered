package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryData;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.c1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39727c1 implements TUILiveListManager.LiveStatisticsCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39733e1 f88275a;

    public C39727c1(C39733e1 c39733e1) {
        this.f88275a = c39733e1;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveStatisticsCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        C39510r c39510r = this.f88275a.f88287c;
        String message = "Response: getLiveStatistics failed error=" + error + ", message=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveStatisticsCallback
    public final void onSuccess(TUILiveListManager.LiveStatisticsData statisticData) {
        Intrinsics.checkNotNullParameter(statisticData, "statisticData");
        AbstractC39465b.m88232a(this.f88275a.f88287c, "Response: getLiveStatistics success", "message", 0, "Response: getLiveStatistics success");
        this.f88275a.f88286b.setValue(new LiveSummaryData(statisticData.liveDuration, statisticData.totalViewers, statisticData.totalGiftsSent, statisticData.totalUniqueGiftSenders, statisticData.totalGiftCoins, statisticData.totalLikesReceived, statisticData.totalMessageCount));
        C39733e1 c39733e1 = this.f88275a;
        InterfaceC41775x1 interfaceC41775x1 = c39733e1.f88291g;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        c39733e1.f88291g = null;
        c39733e1.f88291g = C41696j.m91104d(c39733e1.f88290f, null, null, new C39730d1(c39733e1, null), 3, null);
    }
}
