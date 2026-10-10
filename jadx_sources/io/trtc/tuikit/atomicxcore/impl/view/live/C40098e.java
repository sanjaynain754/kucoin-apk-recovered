package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C40098e implements TUILiveListManager.LiveInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.GetRoomInfoCallback f89189a;

    public C40098e(TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        this.f89189a = getRoomInfoCallback;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback = this.f89189a;
        if (getRoomInfoCallback != null) {
            getRoomInfoCallback.onError(error, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onSuccess(TUILiveListManager.LiveInfo liveInfo) {
        TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback = this.f89189a;
        if (getRoomInfoCallback != null) {
            getRoomInfoCallback.onSuccess(liveInfo != null ? liveInfo.roomInfo : null);
        }
    }
}
