package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.E0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39677E0 implements TUILiveListManager.StopLiveCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StopLiveCompletionHandler f88151b;

    public C39677E0(C39695N0 c39695n0, StopLiveCompletionHandler stopLiveCompletionHandler) {
        this.f88150a = c39695n0;
        this.f88151b = stopLiveCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.StopLiveCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88150a.f88203d;
        String message2 = "endLive onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        this.f88150a.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        StopLiveCompletionHandler stopLiveCompletionHandler = this.f88151b;
        if (stopLiveCompletionHandler != null) {
            stopLiveCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.StopLiveCallback
    public final void onSuccess(TUILiveListManager.LiveStatisticsData statisticData) {
        Intrinsics.checkNotNullParameter(statisticData, "statisticData");
        AbstractC39465b.m88232a(this.f88150a.f88203d, "endLive onSuccess", "message", 0, "endLive onSuccess");
        this.f88150a.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        StopLiveCompletionHandler stopLiveCompletionHandler = this.f88151b;
        if (stopLiveCompletionHandler != null) {
            stopLiveCompletionHandler.onSuccess(statisticData);
        }
    }
}
