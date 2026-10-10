package com.tencent.cloud.tuikit.engine.impl.call;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.call.TUICallObserver;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeObserver;
import com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUICallObserverProxy extends TUIPipelineBridgeObserver {
    private static final String TAG = "TUICallObserverProxy";
    private final List<TUICallObserver> mObserverList = new CopyOnWriteArrayList();
    private final HashMap<String, String> mFunctionMap = new HashMap<>();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    @FunctionalInterface
    public interface CallBackExecutor<R> {
        void execute(TUICallObserver tUICallObserver, R r11);
    }

    private <R> void notifyObservers(final CallBackExecutor<R> callBackExecutor) {
        for (final TUICallObserver tUICallObserver : this.mObserverList) {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.w0
                @Override // java.lang.Runnable
                public final void run() {
                    callBackExecutor.execute(tUICallObserver, null);
                }
            });
        }
    }

    private void onKickedOfflineHandler(String str) {
        LiteavLog.m76087i(TAG, "call_engine - onKickedOffline");
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.b0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onKickedOffline();
            }
        });
    }

    private void onUserSigExpiredHandler(String str) {
        LiteavLog.m76087i(TAG, "call_engine - onUserSigExpired");
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.l0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserSigExpired();
            }
        });
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    public void addObserver(TUICallObserver tUICallObserver) {
        if (tUICallObserver == null || this.mObserverList.contains(tUICallObserver)) {
            return;
        }
        this.mObserverList.add(tUICallObserver);
    }

    public void destroy() {
        this.mObserverList.clear();
        this.mFunctionMap.clear();
    }

    @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeObserver
    public void onReceiveEventFromPipeline(String str, String str2) {
        String str3 = this.mFunctionMap.get(str);
        if (str3 != null) {
            try {
                TUICallObserverProxy.class.getDeclaredMethod(str3, String.class).invoke(this, str2);
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "call_engine - onReceiveEventFromPipeline invoke error: " + e11);
            }
        }
    }

    public void removeObserver(TUICallObserver tUICallObserver) {
        if (tUICallObserver != null) {
            this.mObserverList.remove(tUICallObserver);
        }
    }

    public TUICallObserverProxy() {
        registerEventHandler();
    }

    private void bindEventHandler(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mFunctionMap.put(str, str2);
        }
    }

    private void onCallBeginHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final TUICommonDefine.RoomId roomId = (TUICommonDefine.RoomId) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, TUICommonDefine.RoomId.class);
        final TUICallDefine.MediaType mediaType = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 2, TUICallDefine.MediaType.class);
        final TUICallDefine.Role role = (TUICallDefine.Role) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 3, TUICallDefine.Role.class);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 4, String.class);
        String str3 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 5, String.class);
        final TUICallDefine.CallObserverExtraInfo callObserverExtraInfo = new TUICallDefine.CallObserverExtraInfo();
        callObserverExtraInfo.roomId = roomId;
        callObserverExtraInfo.role = role;
        callObserverExtraInfo.chatGroupId = str3;
        LiteavLog.m76087i(TAG, "call_engine - onCallBegin callId:" + str2 + ", mediaType:" + mediaType + ", extraInfo:" + callObserverExtraInfo);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.c0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallBegin(str2, mediaType, callObserverExtraInfo);
            }
        });
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.d0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallBegin(roomId, mediaType, role);
            }
        });
    }

    private void onCallEndHandler(String str) {
        long jLongValue;
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final TUICommonDefine.RoomId roomId = (TUICommonDefine.RoomId) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, TUICommonDefine.RoomId.class);
        final TUICallDefine.MediaType mediaType = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 2, TUICallDefine.MediaType.class);
        final TUICallDefine.Role role = (TUICallDefine.Role) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 3, TUICallDefine.Role.class);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 4, String.class);
        Integer num = (Integer) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 5, Integer.class);
        final TUICallDefine.CallEndReason callEndReason = (TUICallDefine.CallEndReason) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 6, TUICallDefine.CallEndReason.class);
        final String str3 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 7, String.class);
        String str4 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 8, String.class);
        if (num != null) {
            jLongValue = num.longValue();
        } else {
            jLongValue = 0;
        }
        final long j11 = jLongValue;
        final TUICallDefine.CallObserverExtraInfo callObserverExtraInfo = new TUICallDefine.CallObserverExtraInfo();
        callObserverExtraInfo.roomId = roomId;
        callObserverExtraInfo.role = role;
        callObserverExtraInfo.chatGroupId = str4;
        LiteavLog.m76087i(TAG, "call_engine - onCallEnd callId:" + str2 + ", mediaType:" + mediaType + ", reason:" + callEndReason + ", userId:" + str3 + ", extraInfo:" + callObserverExtraInfo);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.r0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallEnd(str2, mediaType, callEndReason, str3, j11, callObserverExtraInfo);
            }
        });
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.s0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallEnd(roomId, mediaType, role, j11);
            }
        });
    }

    private void onCallMediaTypeChangedHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final TUICallDefine.MediaType mediaType = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, TUICallDefine.MediaType.class);
        final TUICallDefine.MediaType mediaType2 = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, TUICallDefine.MediaType.class);
        LiteavLog.m76087i(TAG, "call_engine - onCallMediaTypeChanged oldMediaType:" + mediaType + ", newMediaType:" + mediaType2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.k0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallMediaTypeChanged(mediaType, mediaType2);
            }
        });
    }

    private void onCallNotConnectedHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, String.class);
        final String str3 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, String.class);
        TUICommonDefine.RoomId roomId = (TUICommonDefine.RoomId) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 2, TUICommonDefine.RoomId.class);
        final TUICallDefine.MediaType mediaType = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 4, TUICallDefine.MediaType.class);
        TUICallDefine.Role role = (TUICallDefine.Role) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 5, TUICallDefine.Role.class);
        final TUICallDefine.CallEndReason callEndReason = (TUICallDefine.CallEndReason) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 6, TUICallDefine.CallEndReason.class);
        String str4 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 7, String.class);
        final TUICallDefine.CallObserverExtraInfo callObserverExtraInfo = new TUICallDefine.CallObserverExtraInfo();
        callObserverExtraInfo.roomId = roomId;
        callObserverExtraInfo.role = role;
        callObserverExtraInfo.chatGroupId = str4;
        LiteavLog.m76087i(TAG, "call_engine - onCallNotConnected callId:" + str3 + ", mediaType:" + mediaType + ", reason:" + callEndReason + ", userId:" + str2 + ", extraInfo:" + callObserverExtraInfo);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.p0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallNotConnected(str3, mediaType, callEndReason, str2, callObserverExtraInfo);
            }
        });
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.q0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallCancelled(str2);
            }
        });
    }

    private void onCallReceivedHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, String.class);
        final List listJSONArrayToList = ParamsParse.JSONArrayToList((JSONArray) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, JSONArray.class), String.class);
        final String str3 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 2, String.class);
        final TUICallDefine.MediaType mediaType = (TUICallDefine.MediaType) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 3, TUICallDefine.MediaType.class);
        final String str4 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 4, String.class);
        TUICommonDefine.RoomId roomId = (TUICommonDefine.RoomId) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 5, TUICommonDefine.RoomId.class);
        final String str5 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 7, String.class);
        TUICallDefine.Role role = (TUICallDefine.Role) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 8, TUICallDefine.Role.class);
        boolean zEquals = Boolean.TRUE.equals(ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 9, Boolean.class));
        final TUICallDefine.CallObserverExtraInfo callObserverExtraInfo = new TUICallDefine.CallObserverExtraInfo();
        callObserverExtraInfo.roomId = roomId;
        callObserverExtraInfo.role = role;
        callObserverExtraInfo.userData = str4;
        callObserverExtraInfo.chatGroupId = str3;
        callObserverExtraInfo.isEphemeralCall = zEquals;
        LiteavLog.m76087i(TAG, "call_engine - onCallReceived callId:" + str5 + ", callerId:" + str2 + ", calleeIdList:" + listJSONArrayToList + ", mediaType:" + mediaType + ", extraInfo:" + callObserverExtraInfo);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.f0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallReceived(str5, str2, (List<String>) listJSONArrayToList, mediaType, callObserverExtraInfo);
            }
        });
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.g0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallReceived(str2, (List<String>) listJSONArrayToList, str3, mediaType, str4);
            }
        });
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.h0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onCallReceived(str2, listJSONArrayToList, str3, mediaType);
            }
        });
    }

    private void onErrorHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final Integer num = (Integer) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, Integer.class);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, String.class);
        LiteavLog.m76083e(TAG, "call_engine - onError code:" + num + ", message:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.n0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onError(num.intValue(), str2);
            }
        });
    }

    private void onUserAudioAvailableHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, String.class);
        final boolean zEquals = Boolean.TRUE.equals(ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, Boolean.class));
        LiteavLog.m76087i(TAG, "call_engine - onUserAudioAvailable userId:" + str2 + ", isAudioAvailable:" + zEquals);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.o0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserAudioAvailable(str2, zEquals);
            }
        });
    }

    private void onUserInvitingHandler(String str) {
        final String str2 = (String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, String.class);
        LiteavLog.m76087i(TAG, "call_engine - onUserInviting userId:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.x0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserInviting(str2);
            }
        });
    }

    private void onUserJoinHandler(String str) {
        final String str2 = (String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, String.class);
        LiteavLog.m76087i(TAG, "call_engine - onUserJoin userId:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.i0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserJoin(str2);
            }
        });
    }

    private void onUserLeaveHandler(String str) {
        final String str2 = (String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, String.class);
        LiteavLog.m76087i(TAG, "call_engine - onUserLeave userId:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.u0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserLeave(str2);
            }
        });
    }

    private void onUserLineBusyHandler(String str) {
        final String str2 = (String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, String.class);
        LiteavLog.m76087i(TAG, "call_engine - onUserLineBusy userId:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.y0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserLineBusy(str2);
            }
        });
    }

    private void onUserNetworkQualityChangedHandler(String str) {
        final JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.t0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserNetworkQualityChanged(ParamsParse.getQualityInfoListFromJSONArray(jSONArrayStringToJSONArray));
            }
        });
    }

    private void onUserNoResponseHandler(String str) {
        int i11 = 0;
        JSONArray jSONArray = (JSONArray) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, JSONArray.class);
        while (true) {
            Objects.requireNonNull(jSONArray);
            if (i11 < jSONArray.length()) {
                final String strOptString = jSONArray.optString(i11);
                LiteavLog.m76087i(TAG, "call_engine - onUserNoResponse userId:" + strOptString);
                notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.j0
                    @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
                    public final void execute(TUICallObserver tUICallObserver, Object obj) {
                        tUICallObserver.onUserNoResponse(strOptString);
                    }
                });
                i11++;
            } else {
                return;
            }
        }
    }

    private void onUserRejectHandler(String str) {
        final String str2 = (String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, String.class);
        LiteavLog.m76087i(TAG, "call_engine - onUserReject userId:" + str2);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.e0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserReject(str2);
            }
        });
    }

    private void onUserVideoAvailableHandler(String str) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str);
        final String str2 = (String) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, String.class);
        final boolean zEquals = Boolean.TRUE.equals(ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, Boolean.class));
        LiteavLog.m76087i(TAG, "call_engine - onUserVideoAvailable userId:" + str2 + ", isVideoAvailable:" + zEquals);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.v0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserVideoAvailable(str2, zEquals);
            }
        });
    }

    private void onUserVoiceVolumeChangedHandler(String str) {
        final Map mapJSONObjectToMap = ParamsParse.JSONObjectToMap((JSONObject) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str), 0, JSONObject.class), Integer.class);
        notifyObservers(new CallBackExecutor() { // from class: com.tencent.cloud.tuikit.engine.impl.call.m0
            @Override // com.tencent.cloud.tuikit.engine.impl.call.TUICallObserverProxy.CallBackExecutor
            public final void execute(TUICallObserver tUICallObserver, Object obj) {
                tUICallObserver.onUserVoiceVolumeChanged(mapJSONObjectToMap);
            }
        });
    }

    private void registerEventHandler() {
        bindEventHandler("onError", "onErrorHandler");
        bindEventHandler("onCallReceived", "onCallReceivedHandler");
        bindEventHandler("onCallNotConnected", "onCallNotConnectedHandler");
        bindEventHandler("onCallBegin", "onCallBeginHandler");
        bindEventHandler("onCallEnd", "onCallEndHandler");
        bindEventHandler("onCallMediaTypeChanged", "onCallMediaTypeChangedHandler");
        bindEventHandler("onUserReject", "onUserRejectHandler");
        bindEventHandler("onUserNoResponse", "onUserNoResponseHandler");
        bindEventHandler("onUserInviting", "onUserInvitingHandler");
        bindEventHandler("onUserLineBusy", "onUserLineBusyHandler");
        bindEventHandler("onUserJoin", "onUserJoinHandler");
        bindEventHandler("onUserLeave", "onUserLeaveHandler");
        bindEventHandler("onUserVideoAvailable", "onUserVideoAvailableHandler");
        bindEventHandler("onUserAudioAvailable", "onUserAudioAvailableHandler");
        bindEventHandler("onUserVoiceVolumeChanged", "onUserVoiceVolumeChangedHandler");
        bindEventHandler("onUserNetworkQualityChanged", "onUserNetworkQualityChangedHandler");
        bindEventHandler("onKickedOffline", "onKickedOfflineHandler");
        bindEventHandler("onUserSigExpired", "onUserSigExpiredHandler");
    }
}
