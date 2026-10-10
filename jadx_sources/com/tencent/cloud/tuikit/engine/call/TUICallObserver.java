package com.tencent.cloud.tuikit.engine.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUICallObserver {
    @Deprecated
    public void onCallBegin(TUICommonDefine.RoomId roomId, TUICallDefine.MediaType mediaType, TUICallDefine.Role role) {
    }

    @Deprecated
    public void onCallEnd(TUICommonDefine.RoomId roomId, TUICallDefine.MediaType mediaType, TUICallDefine.Role role, long j11) {
    }

    public void onCallReceived(String str, String str2, List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
    }

    public void onCallBegin(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
    }

    public void onCallEnd(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2, long j11, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
    }

    @Deprecated
    public void onCallReceived(String str, List<String> list, String str2, TUICallDefine.MediaType mediaType) {
    }

    @Deprecated
    public void onCallReceived(String str, List<String> list, String str2, TUICallDefine.MediaType mediaType, String str3) {
    }

    public void onKickedOffline() {
    }

    public void onUserSigExpired() {
    }

    @Deprecated
    public void onCallCancelled(String str) {
    }

    public void onUserInviting(String str) {
    }

    public void onUserJoin(String str) {
    }

    public void onUserLeave(String str) {
    }

    public void onUserLineBusy(String str) {
    }

    public void onUserNetworkQualityChanged(List<TUICommonDefine.NetworkQualityInfo> list) {
    }

    public void onUserNoResponse(String str) {
    }

    public void onUserReject(String str) {
    }

    public void onUserVoiceVolumeChanged(Map<String, Integer> map) {
    }

    public void onCallMediaTypeChanged(TUICallDefine.MediaType mediaType, TUICallDefine.MediaType mediaType2) {
    }

    public void onError(int i11, String str) {
    }

    public void onUserAudioAvailable(String str, boolean z11) {
    }

    public void onUserVideoAvailable(String str, boolean z11) {
    }

    public void onCallNotConnected(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
    }
}
