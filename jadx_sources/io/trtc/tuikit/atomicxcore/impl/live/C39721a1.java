package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryData;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.a1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39721a1 extends TUILiveListManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39733e1 f88252a;

    public C39721a1(C39733e1 c39733e1) {
        this.f88252a = c39733e1;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.Observer
    public final void onLiveStatisticsChanged(String str, TUILiveListManager.LiveStatisticsData statisticData, List modifyFlagList) {
        Intrinsics.checkNotNullParameter(statisticData, "statisticData");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        if (!Intrinsics.areEqual(str, this.f88252a.f88285a)) {
            return;
        }
        LiveSummaryData liveSummaryDataCopy$default = LiveSummaryData.copy$default((LiveSummaryData) this.f88252a.f88286b.getValue(), 0L, 0, 0, 0, 0, 0, 0, 127, null);
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_VIEWERS)) {
            liveSummaryDataCopy$default.setTotalViewers(statisticData.totalViewers);
        }
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_GIFTS_SENT)) {
            liveSummaryDataCopy$default.setTotalGiftsSent(statisticData.totalGiftsSent);
        }
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_GIFT_COINS)) {
            liveSummaryDataCopy$default.setTotalGiftCoins(statisticData.totalGiftCoins);
        }
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_UNIQUE_GIFT_SENDERS)) {
            liveSummaryDataCopy$default.setTotalGiftUniqueSenders(statisticData.totalUniqueGiftSenders);
        }
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_LIKES_RECEIVED)) {
            liveSummaryDataCopy$default.setTotalLikesReceived(statisticData.totalLikesReceived);
        }
        if (modifyFlagList.contains(TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_MESSAGE_COUNT)) {
            liveSummaryDataCopy$default.setTotalMessageSent(statisticData.totalMessageCount);
        }
        this.f88252a.f88286b.setValue(liveSummaryDataCopy$default);
    }
}
