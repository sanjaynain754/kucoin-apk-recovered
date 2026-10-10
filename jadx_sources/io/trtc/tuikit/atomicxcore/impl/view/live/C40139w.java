package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C40139w implements StopLiveCompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUILiveListManager.StopLiveCallback f89279a;

    public C40139w(TUILiveListManager.StopLiveCallback stopLiveCallback) {
        this.f89279a = stopLiveCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        TUILiveListManager.StopLiveCallback stopLiveCallback = this.f89279a;
        if (stopLiveCallback != null) {
            stopLiveCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
    public final void onSuccess(TUILiveListManager.LiveStatisticsData statisticsData) {
        Intrinsics.checkNotNullParameter(statisticsData, "statisticsData");
        TUILiveListManager.StopLiveCallback stopLiveCallback = this.f89279a;
        if (stopLiveCallback != null) {
            stopLiveCallback.onSuccess(statisticsData);
        }
    }
}
