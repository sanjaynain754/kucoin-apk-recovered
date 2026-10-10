package com.tencent.cloud.tuikit.engine.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUIRoomObserver {
    @Deprecated
    public void onKickedOffSeat(int i11, TUIRoomDefine.UserInfo userInfo) {
    }

    public void onSeatListChanged(String str, List<TUIRoomDefine.SeatFullInfo> list, List<TUIRoomDefine.UserInfo> list2, List<TUIRoomDefine.UserInfo> list3) {
    }

    public void onKickedOffSeat(int i11, TUIRoomDefine.UserInfo userInfo, String str) {
    }

    @Deprecated
    public void onSeatListChanged(List<TUIRoomDefine.SeatInfo> list, List<TUIRoomDefine.SeatInfo> list2, List<TUIRoomDefine.SeatInfo> list3) {
    }

    public void onUserSigExpired() {
    }

    public void onKickedOffLine(String str) {
    }

    public void onReceiveCustomMessage(TUIRoomDefine.RoomCustomMessage roomCustomMessage) {
    }

    public void onReceiveTextMessage(TUIRoomDefine.RoomTextMessage roomTextMessage) {
    }

    public void onRequestReceived(TUIRoomDefine.Request request) {
    }

    public void onUserNetworkQualityChanged(Map<String, TUICommonDefine.NetworkInfo> map) {
    }

    public void onUserScreenCaptureStopped(int i11) {
    }

    public void onUserVoiceVolumeChanged(Map<String, Integer> map) {
    }

    public void onAllUserCameraDisableChanged(String str, boolean z11) {
    }

    public void onAllUserMicrophoneDisableChanged(String str, boolean z11) {
    }

    public void onError(TUICommonDefine.Error error, String str) {
    }

    public void onRemoteUserEnterRoom(String str, TUIRoomDefine.UserInfo userInfo) {
    }

    public void onRemoteUserLeaveRoom(String str, TUIRoomDefine.UserInfo userInfo) {
    }

    public void onRequestCancelled(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
    }

    public void onRequestProcessed(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
    }

    public void onRoomDismissed(String str, TUIRoomDefine.RoomDismissedReason roomDismissedReason) {
    }

    public void onRoomMetadataChanged(String str, String str2) {
    }

    public void onRoomNameChanged(String str, String str2) {
    }

    public void onRoomSeatModeChanged(String str, TUIRoomDefine.SeatMode seatMode) {
    }

    public void onRoomUserCountChanged(String str, int i11) {
    }

    public void onScreenShareForAllUserDisableChanged(String str, boolean z11) {
    }

    public void onSendMessageForAllUserDisableChanged(String str, boolean z11) {
    }

    public void onUserInfoChanged(TUIRoomDefine.UserInfo userInfo, List<TUIRoomDefine.UserInfoModifyFlag> list) {
    }

    public void onKickedOutOfRoom(String str, TUIRoomDefine.KickedOutOfRoomReason kickedOutOfRoomReason, String str2) {
    }

    public void onSendMessageForUserDisableChanged(String str, String str2, boolean z11) {
    }

    public void onUserAudioStateChanged(String str, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
    }

    public void onUserVideoStateChanged(String str, TUIRoomDefine.VideoStreamType videoStreamType, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
    }

    public void onUserVideoSizeChanged(String str, String str2, TUIRoomDefine.VideoStreamType videoStreamType, int i11, int i12) {
    }
}
