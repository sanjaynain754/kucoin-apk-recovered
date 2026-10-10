package com.tencent.cloud.tuikit.engine.room;

import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;

/* JADX INFO: loaded from: classes59.dex */
public abstract class DeprecatedRoomEngineAPI {
    @Deprecated
    public abstract TXAudioEffectManager getAudioEffectManager();

    @Deprecated
    public abstract TXBeautyManager getBeautyManager();

    @Deprecated
    public abstract TXDeviceManager getDeviceManager();

    @Deprecated
    public abstract void kickUserOffSeatByAdmin(int i11, String str, TUIRoomDefine.ActionCallback actionCallback);

    @Deprecated
    public abstract void responseRemoteRequest(String str, boolean z11, TUIRoomDefine.ActionCallback actionCallback);

    @Deprecated
    public abstract void setLocalVideoView(TUIRoomDefine.VideoStreamType videoStreamType, TUIVideoView tUIVideoView);

    @Deprecated
    public abstract int switchCamera(boolean z11);

    @Deprecated
    public abstract TUIRoomDefine.Request takeSeat(int i11, int i12, TUIRoomDefine.RequestCallback requestCallback);

    @Deprecated
    public abstract TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, TUIRoomDefine.RequestCallback requestCallback);

    @Deprecated
    public static Object callExperimentalAPI(String str) {
        return TUIRoomEngineImpl.callExperimentalAPI(str, "");
    }
}
