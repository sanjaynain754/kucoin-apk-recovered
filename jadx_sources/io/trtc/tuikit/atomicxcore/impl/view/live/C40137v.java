package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C40137v implements StopLiveCompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.ActionCallback f89276a;

    public C40137v(TUIRoomDefine.ActionCallback actionCallback) {
        this.f89276a = actionCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        TUIRoomDefine.ActionCallback actionCallback = this.f89276a;
        if (actionCallback != null) {
            actionCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.StopLiveCompletionHandler
    public final void onSuccess(TUILiveListManager.LiveStatisticsData statisticsData) {
        Intrinsics.checkNotNullParameter(statisticsData, "statisticsData");
        TUIRoomDefine.ActionCallback actionCallback = this.f89276a;
        if (actionCallback != null) {
            actionCallback.onSuccess();
        }
    }
}
