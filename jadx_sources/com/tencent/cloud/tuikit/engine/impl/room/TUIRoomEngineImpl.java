package com.tencent.cloud.tuikit.engine.impl.room;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager;
import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.trtc.TRTCCloud;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUIRoomEngineImpl extends TUIRoomEngine {
    private static final String TAG = "TUIRoomEngineImpl";
    private static Context sAppContext;
    private static TUIRoomEngineImpl sInstance;
    private static final Handler sMainHandler = new Handler(Looper.getMainLooper());
    private TUIRoomObserverProxy mObserverProxy;
    private TUIRoomEngineJni mTUIRoomEngineJni;

    public static void setSelfInfo(final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.t1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineJni.setSelfInfo(str, str2, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public Object callExperimentalAPI(String str, final TUIRoomDefine.ExperimentalAPIResponseCallback experimentalAPIResponseCallback) {
        final ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        if (isSyncAPI("callExperimentalAPI", arrayList)) {
            return sMainHandler.getLooper() != Looper.myLooper() ? "" : callAPI("callExperimentalAPI", arrayList, null);
        }
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.s
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75815n0(this.f73183b, arrayList, experimentalAPIResponseCallback);
            }
        });
        return "";
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void enterRoom(final String str, final TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73170b.mTUIRoomEngineJni.enterRoom(str, TUIRoomDefine.RoomType.CONFERENCE, new TUIRoomDefine.EnterRoomOptions(), getRoomInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void fetchRoomInfo(final TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f73129b.mTUIRoomEngineJni.fetchRoomInfo(getRoomInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public void kickUserOffSeatByAdmin(final int i11, final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73037b.mTUIRoomEngineJni.kickUserOffSeatByAdmin(i11, str, "", actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public void responseRemoteRequest(final String str, final boolean z11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73056b.mTUIRoomEngineJni.responseRemoteRequest(str, z11, "", actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setLocalVideoMuteImage(Bitmap bitmap) {
        getTRTCCloud().setVideoMuteImage(bitmap, 5);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public void setLocalVideoView(final TUIRoomDefine.VideoStreamType videoStreamType, final TUIVideoView tUIVideoView) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73134b.mTUIRoomEngineJni.setLocalVideoView(videoStreamType, tUIVideoView);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public TUIRoomDefine.Request takeSeat(int i11, int i12, TUIRoomDefine.RequestCallback requestCallback) {
        return this.mTUIRoomEngineJni.takeSeat(i11, i12, requestCallback);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, TUIRoomDefine.RequestCallback requestCallback) {
        return this.mTUIRoomEngineJni.takeUserOnSeatByAdmin(i11, str, i12, requestCallback);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m75783V(TUIRoomEngineImpl tUIRoomEngineImpl, TUIRoomObserver tUIRoomObserver) {
        tUIRoomEngineImpl.mTUIRoomEngineJni.addObserver(tUIRoomObserver);
        tUIRoomEngineImpl.mObserverProxy.addObserver(tUIRoomObserver);
    }

    private String callAPI(String str, List<Object> list, TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        return this.mTUIRoomEngineJni.getPipelineBridge().callAPI(str, new JSONArray((Collection) list).toString(), aPICallRespondCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callExperimentalAPIResponse(TUIRoomDefine.ExperimentalAPIResponseCallback experimentalAPIResponseCallback, TUICommonDefine.Error error, String str, String str2) {
        if (experimentalAPIResponseCallback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS) {
            experimentalAPIResponseCallback.onResponse((String) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str2), 0, String.class));
            return;
        }
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(error.getValue()));
        if (str == null) {
            str = "";
        }
        map.put("message", str);
        experimentalAPIResponseCallback.onResponse(new JSONObject(map).toString());
    }

    private static TUIRoomEngine createSubRoom() {
        return new TUIRoomEngineImpl(false);
    }

    public static void destroySharedInstance() {
        synchronized (TUIRoomEngineImpl.class) {
            sharedInstance().destroy();
            sInstance = null;
        }
    }

    private static boolean destroySubRoom(Object obj) {
        if (!(obj instanceof TUIRoomEngineImpl)) {
            return false;
        }
        ((TUIRoomEngineImpl) obj).destroy();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getBannedUserListResponse(TUIRoomDefine.GetUserListCallback getUserListCallback, TUICommonDefine.Error error, String str, String str2) {
        if (getUserListCallback == null) {
            return;
        }
        if (TUICommonDefine.Error.SUCCESS != error) {
            getUserListCallback.onError(error, str);
            return;
        }
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str2);
        if (jSONArrayStringToJSONArray == null) {
            getUserListCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, str);
            return;
        }
        Integer num = (Integer) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 0, Integer.class);
        List<TUIRoomDefine.UserInfo> userInfoListFromJSONArray = ParamsParse.getUserInfoListFromJSONArray((JSONArray) ParamsParse.getParamFromJSONArray(jSONArrayStringToJSONArray, 1, JSONArray.class));
        TUIRoomDefine.UserListResult userListResult = new TUIRoomDefine.UserListResult();
        userListResult.nextSequence = num == null ? 0L : num.longValue();
        userListResult.userInfoList = userInfoListFromJSONArray;
        getUserListCallback.onSuccess(userListResult);
    }

    private TUIConferenceInvitationManager getConferenceInvitationManager() {
        return this.mTUIRoomEngineJni.getConferenceInvitationManager();
    }

    private TUIConferenceListManager getConferenceListManager() {
        return this.mTUIRoomEngineJni.getConferenceListManager();
    }

    private TUILiveGiftManager getLiveGiftManager() {
        return this.mTUIRoomEngineJni.getLiveGiftManager();
    }

    private TUILiveLayoutManager getLiveLayoutManager() {
        return this.mTUIRoomEngineJni.getLiveLayoutManager();
    }

    private TUILiveListManager getLiveListManager() {
        return this.mTUIRoomEngineJni.getLiveListManager();
    }

    private boolean isSyncAPI(String str, List<Object> list) {
        return this.mTUIRoomEngineJni.getPipelineBridge().isSyncAPI(str, new JSONArray((Collection) list).toString());
    }

    public static void logout(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.s0
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineJni.logout(actionCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveUserToSeatByAdminResponse(TUIRoomDefine.ActionCallback actionCallback, TUICommonDefine.Error error, String str, String str2) {
        if (actionCallback == null) {
            return;
        }
        if (TUICommonDefine.Error.SUCCESS != error) {
            actionCallback.onError(error, str);
        } else {
            actionCallback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m75821q0(TUIRoomEngineImpl tUIRoomEngineImpl, TUIRoomObserver tUIRoomObserver) {
        tUIRoomEngineImpl.mTUIRoomEngineJni.removeObserver(tUIRoomObserver);
        tUIRoomEngineImpl.mObserverProxy.removeObserver(tUIRoomObserver);
    }

    private static void runOnMainThread(Runnable runnable) {
        Handler handler = sMainHandler;
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchUsersResponse(TUIRoomDefine.UserSearchCallback userSearchCallback, TUICommonDefine.Error error, String str, String str2) {
        if (userSearchCallback == null) {
            return;
        }
        if (TUICommonDefine.Error.SUCCESS != error) {
            userSearchCallback.onError(error, str);
        } else {
            userSearchCallback.onSuccess(ParamsParse.getUserSearchResultFromJSONArray((JSONObject) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCustomMessageResponse(TUIRoomDefine.SendCustomMessageCallback sendCustomMessageCallback, TUICommonDefine.Error error, String str, String str2) {
        if (sendCustomMessageCallback == null) {
            return;
        }
        if (TUICommonDefine.Error.SUCCESS != error) {
            sendCustomMessageCallback.onError(error, str);
        } else {
            sendCustomMessageCallback.onSuccess(ParamsParse.getRoomCustomMessageFromJSONObject((JSONObject) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendTextMessageResponse(TUIRoomDefine.SendTextMessageCallback sendTextMessageCallback, TUICommonDefine.Error error, String str, String str2) {
        if (sendTextMessageCallback == null) {
            return;
        }
        if (TUICommonDefine.Error.SUCCESS != error) {
            sendTextMessageCallback.onError(error, str);
        } else {
            sendTextMessageCallback.onSuccess(ParamsParse.getRoomTextMessageFromJSONObject((JSONObject) ParamsParse.getParamFromJSONArray(ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    public static void setSelfInfo(final TUIRoomDefine.LoginUserInfo loginUserInfo, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.o
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineJni.setLoginInfo(loginUserInfo, actionCallback);
            }
        });
    }

    public static TUIRoomEngineImpl sharedInstance() {
        TUIRoomEngineImpl tUIRoomEngineImpl;
        synchronized (TUIRoomEngineImpl.class) {
            try {
                if (sInstance == null) {
                    sInstance = new TUIRoomEngineImpl(true);
                }
                tUIRoomEngineImpl = sInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tUIRoomEngineImpl;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void addCategoryTagForUsers(final int i11, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f73095b.mTUIRoomEngineJni.addCategoryTagForUsers(i11, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void addObserver(final TUIRoomObserver tUIRoomObserver) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.u0
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75783V(this.f73201b, tUIRoomObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUIRoomDefine.Request applyToAdminToOpenLocalDevice(TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback) {
        return this.mTUIRoomEngineJni.applyToAdminToOpenLocalDevice(mediaDevice, i11, requestCallback);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void cancelRequest(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73063b.mTUIRoomEngineJni.cancelRequest(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void changeUserNameCard(final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73192b.mTUIRoomEngineJni.changeUserNameCard(str, str2, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void changeUserRole(final String str, final TUIRoomDefine.Role role, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f73118b.mTUIRoomEngineJni.changeUserRole(str, role, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void closeLocalCamera() {
        final TUIRoomEngineJni tUIRoomEngineJni = this.mTUIRoomEngineJni;
        Objects.requireNonNull(tUIRoomEngineJni);
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.g1
            @Override // java.lang.Runnable
            public final void run() {
                tUIRoomEngineJni.closeLocalCamera();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void closeLocalMicrophone() {
        final TUIRoomEngineJni tUIRoomEngineJni = this.mTUIRoomEngineJni;
        Objects.requireNonNull(tUIRoomEngineJni);
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.i0
            @Override // java.lang.Runnable
            public final void run() {
                tUIRoomEngineJni.closeLocalMicrophone();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void closeRemoteDeviceByAdmin(final String str, final TUIRoomDefine.MediaDevice mediaDevice, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f73041b.mTUIRoomEngineJni.closeRemoteDeviceByAdmin(str, mediaDevice, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void createRoom(final TUIRoomDefine.RoomInfo roomInfo, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73073b.mTUIRoomEngineJni.createRoom(roomInfo, actionCallback);
            }
        });
    }

    public void destroy() {
        TUIRoomEngineJni tUIRoomEngineJni = this.mTUIRoomEngineJni;
        if (tUIRoomEngineJni != null) {
            tUIRoomEngineJni.destroy();
        }
        sMainHandler.removeCallbacksAndMessages(null);
        this.mObserverProxy.destroy();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void destroyRoom(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73227b.mTUIRoomEngineJni.destroyRoom(actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void disableDeviceForAllUserByAdmin(final TUIRoomDefine.MediaDevice mediaDevice, final boolean z11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f73137b.mTUIRoomEngineJni.disableDeviceForAllUserByAdmin(z11, mediaDevice, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void disableSendingMessageByAdmin(final String str, final boolean z11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f73078b.mTUIRoomEngineJni.disableSendingMessageByAdmin(z11, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void disableSendingMessageForAllUser(final boolean z11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f73206b.mTUIRoomEngineJni.disableSendingMessageForAllUser(z11, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void enableGravitySensor(final boolean z11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73158b.mTUIRoomEngineJni.enableGravitySensor(z11);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void enableSystemAudioSharing(final boolean z11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f73071b.mTUIRoomEngineJni.enableSystemAudioSharing(z11);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void enterRoom(final String str, final TUIRoomDefine.RoomType roomType, final TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73166b.mTUIRoomEngineJni.enterRoom(str, roomType, new TUIRoomDefine.EnterRoomOptions(), getRoomInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void exitRoom(final boolean z11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f73060b.mTUIRoomEngineJni.exitRoom(z11, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void fetchRoomInfo(final String str, final TUIRoomDefine.RoomType roomType, final TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73122b.mTUIRoomEngineJni.fetchRoomInfo(str, roomType, getRoomInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getBannedUserList(final TUIRoomDefine.GetUserListCallback getUserListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.j0
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75797e0(this.f73104b, getUserListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public Object getExtension(TUICommonDefine.ExtensionType extensionType) {
        if (TUICommonDefine.ExtensionType.DEVICE_MANAGER.equals(extensionType)) {
            return getMediaDeviceManager();
        }
        if (TUICommonDefine.ExtensionType.LIVE_LIST_MANAGER.equals(extensionType)) {
            return getLiveListManager();
        }
        if (TUICommonDefine.ExtensionType.CONFERENCE_LIST_MANAGER.equals(extensionType)) {
            return getConferenceListManager();
        }
        if (TUICommonDefine.ExtensionType.CONFERENCE_INVITATION_MANAGER.equals(extensionType)) {
            return getConferenceInvitationManager();
        }
        if (TUICommonDefine.ExtensionType.LIVE_LAYOUT_MANAGER.equals(extensionType)) {
            return getLiveLayoutManager();
        }
        if (TUICommonDefine.ExtensionType.LIVE_GIFT_MANAGER.equals(extensionType)) {
            return getLiveGiftManager();
        }
        return null;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUILiveBattleManager getLiveBattleManager() {
        return this.mTUIRoomEngineJni.getLiveBattleManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUILiveConnectionManager getLiveConnectionManager() {
        return this.mTUIRoomEngineJni.getLiveConnectionManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUIRoomDeviceManager getMediaDeviceManager() {
        return this.mTUIRoomEngineJni.getMediaDeviceManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getRoomMetadata(final List<String> list, final TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73213b.mTUIRoomEngineJni.getRoomMetadata(list, getRoomMetadataCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getSeatApplicationList(final TUIRoomDefine.RequestListCallback requestListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f73199b.mTUIRoomEngineJni.getSeatApplicationList(requestListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getSeatList(final TUIRoomDefine.GetSeatListCallback getSeatListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73143b.mTUIRoomEngineJni.getSeatList(getSeatListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUISongListManager getSongListManager() {
        return this.mTUIRoomEngineJni.getSongListManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TRTCCloud getTRTCCloud() {
        return this.mTUIRoomEngineJni.getTRTCCloud();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getUserInfo(final String str, final TUIRoomDefine.GetUserInfoCallback getUserInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73034b.mTUIRoomEngineJni.getUserInfo(str, getUserInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getUserList(final long j11, final TUIRoomDefine.GetUserListCallback getUserListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73203b.mTUIRoomEngineJni.getUserList(j11, getUserListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void getUserListByTag(final int i11, final long j11, final TUIRoomDefine.GetUserListCallback getUserListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73209b.mTUIRoomEngineJni.getUserListByTag(i11, j11, getUserListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void kickRemoteUserOutOfRoom(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73224b.mTUIRoomEngineJni.kickRemoteUserOutOfRoom(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void kickUserOffSeatByAdmin(final int i11, final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.r1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73178b.mTUIRoomEngineJni.kickUserOffSeatByAdmin(i11, str, str2, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void leaveSeat(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73141b.mTUIRoomEngineJni.leaveSeat(actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void lockSeatByAdmin(final int i11, final TUIRoomDefine.SeatLockParams seatLockParams, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f73162b.mTUIRoomEngineJni.lockSeatByAdmin(i11, seatLockParams, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void moveToSeat(final int i11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73053b.mTUIRoomEngineJni.moveToSeat(i11, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void moveUserToSeatByAdmin(final String str, final int i11, final TUIRoomDefine.MoveSeatPolicy moveSeatPolicy, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.e1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75796e(this.f73066b, str, i11, moveSeatPolicy, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void muteLocalAudio() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f73223b.mTUIRoomEngineJni.muteLocalAudio();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void muteRemoteAudioStream(final String str, final boolean z11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f73173b.mTUIRoomEngineJni.muteRemoteAudioStream(str, z11);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void openLocalCamera(final boolean z11, final TUIRoomDefine.VideoQuality videoQuality, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73147b.mTUIRoomEngineJni.openLocalCamera(z11 ? 1 : 0, videoQuality, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void openLocalMicrophone(final TUIRoomDefine.AudioQuality audioQuality, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73047b.mTUIRoomEngineJni.openLocalMicrophone(audioQuality, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUIRoomDefine.Request openRemoteDeviceByAdmin(String str, TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback) {
        return this.mTUIRoomEngineJni.openRemoteDeviceByAdmin(str, mediaDevice, i11, requestCallback);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public List<TUIRoomDefine.SeatFullInfo> querySeatList() {
        String strCallAPI;
        JSONArray jSONArrayStringToJSONArray;
        ArrayList arrayList = new ArrayList();
        if (sMainHandler.getLooper() == Looper.myLooper() && (strCallAPI = callAPI("querySeatList", new ArrayList(), null)) != null && (jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(strCallAPI)) != null && jSONArrayStringToJSONArray.length() != 0) {
            try {
                return ParamsParse.getSeatListFromJSONArray(jSONArrayStringToJSONArray.getJSONArray(0));
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "parse querySeatList failed, error: " + e11);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void removeCategoryTagForUsers(final int i11, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73026b.mTUIRoomEngineJni.removeCategoryTagForUsers(i11, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void removeObserver(final TUIRoomObserver tUIRoomObserver) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.i1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75821q0(this.f73100b, tUIRoomObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void responseRemoteRequest(final String str, final boolean z11, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f73229b.mTUIRoomEngineJni.responseRemoteRequest(str, z11, str2, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void searchUsers(final TUIRoomDefine.UserSearchParam userSearchParam, final TUIRoomDefine.UserSearchCallback userSearchCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.w
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75768G(this.f73216b, userSearchParam, userSearchCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void sendCustomMessage(final TUIRoomDefine.RoomCustomMessage roomCustomMessage, final TUIRoomDefine.SendCustomMessageCallback sendCustomMessageCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.t
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75824s(this.f73189b, roomCustomMessage, sendCustomMessageCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void sendTextMessage(final TUIRoomDefine.RoomTextMessage roomTextMessage, final TUIRoomDefine.SendTextMessageCallback sendTextMessageCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.k1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75834z(this.f73115b, roomTextMessage, sendTextMessageCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setCustomInfoForUser(final String str, final HashMap<String, byte[]> map, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f73109b.mTUIRoomEngineJni.setCustomInfoForUser(str, map, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setLocalVideoView(final TUIVideoView tUIVideoView) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73176b.mTUIRoomEngineJni.setLocalVideoView(tUIVideoView);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setRemoteVideoView(final String str, final TUIRoomDefine.VideoStreamType videoStreamType, final TUIVideoView tUIVideoView) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f73154b.mTUIRoomEngineJni.setRemoteVideoView(str, videoStreamType, tUIVideoView);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setRoomMetadataByAdmin(final HashMap<String, String> map, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73131b.mTUIRoomEngineJni.setRoomMetadataByAdmin(map, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setVideoResolutionMode(final TUIRoomDefine.VideoStreamType videoStreamType, final TUIRoomDefine.ResolutionMode resolutionMode) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73126b.mTUIRoomEngineJni.setVideoResolutionMode(videoStreamType, resolutionMode);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void startPlayRemoteVideo(final String str, final TUIRoomDefine.VideoStreamType videoStreamType, final TUIRoomDefine.PlayCallback playCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73239b.mTUIRoomEngineJni.startPlayRemoteVideo(str, videoStreamType, playCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void startPushLocalVideo() {
        final TUIRoomEngineJni tUIRoomEngineJni = this.mTUIRoomEngineJni;
        Objects.requireNonNull(tUIRoomEngineJni);
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.h
            @Override // java.lang.Runnable
            public final void run() {
                tUIRoomEngineJni.startPushLocalVideo();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void startScreenSharing() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73030b.mTUIRoomEngineJni.startScreenSharing();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void stopPlayRemoteVideo(final String str, final TUIRoomDefine.VideoStreamType videoStreamType) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.o1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73151b.mTUIRoomEngineJni.stopPlayRemoteVideo(str, videoStreamType);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void stopPushLocalVideo() {
        final TUIRoomEngineJni tUIRoomEngineJni = this.mTUIRoomEngineJni;
        Objects.requireNonNull(tUIRoomEngineJni);
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.z
            @Override // java.lang.Runnable
            public final void run() {
                tUIRoomEngineJni.stopPushLocalVideo();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void stopScreenSharing() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73237b.mTUIRoomEngineJni.stopScreenSharing();
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUIRoomDefine.Request takeSeat(int i11, int i12, String str, TUIRoomDefine.RequestCompletion requestCompletion) {
        return this.mTUIRoomEngineJni.takeSeat(i11, i12, str, requestCompletion);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, String str2, TUIRoomDefine.RequestCompletion requestCompletion) {
        return this.mTUIRoomEngineJni.takeUserOnSeatByAdmin(i11, str, i12, str2, requestCompletion);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void unmuteLocalAudio(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73160b.mTUIRoomEngineJni.unmuteLocalAudio(actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateAudioQuality(final TUIRoomDefine.AudioQuality audioQuality) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73221b.mTUIRoomEngineJni.updateAudioQuality(audioQuality);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateRoomNameByAdmin(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73234b.mTUIRoomEngineJni.updateRoomNameByAdmin(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateRoomPasswordByAdmin(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f73106b.mTUIRoomEngineJni.updateRoomPasswordByAdmin(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateRoomSeatModeByAdmin(final TUIRoomDefine.SeatMode seatMode, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f73031b.mTUIRoomEngineJni.updateRoomSeatModeByAdmin(seatMode, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateVideoQuality(final TUIRoomDefine.VideoQuality videoQuality) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f73102b.mTUIRoomEngineJni.updateVideoQuality(videoQuality);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void updateVideoQualityEx(final TUIRoomDefine.VideoStreamType videoStreamType, final TUIRoomDefine.RoomVideoEncoderParams roomVideoEncoderParams) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f73050b.mTUIRoomEngineJni.updateVideoQualityEx(videoStreamType, roomVideoEncoderParams);
            }
        });
    }

    private TUIRoomEngineImpl(final boolean z11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.f1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineImpl.m75811l0(this.f73076b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m75768G(final TUIRoomEngineImpl tUIRoomEngineImpl, TUIRoomDefine.UserSearchParam userSearchParam, final TUIRoomDefine.UserSearchCallback userSearchCallback) {
        String str;
        tUIRoomEngineImpl.getClass();
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        if (userSearchParam == null) {
            str = "";
        } else {
            str = userSearchParam.keyword;
        }
        arrayList.add(str);
        if (userSearchParam != null) {
            str2 = userSearchParam.cursor;
        }
        arrayList.add(str2);
        tUIRoomEngineImpl.callAPI("searchUsers", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.w0
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str3, String str4) {
                this.f73219a.searchUsersResponse(userSearchCallback, error, str3, str4);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m75796e(final TUIRoomEngineImpl tUIRoomEngineImpl, String str, int i11, TUIRoomDefine.MoveSeatPolicy moveSeatPolicy, final TUIRoomDefine.ActionCallback actionCallback) {
        int value;
        tUIRoomEngineImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        arrayList.add(Integer.valueOf(i11));
        if (moveSeatPolicy != null) {
            value = moveSeatPolicy.getValue();
        } else {
            value = TUIRoomDefine.MoveSeatPolicy.ABORT_WHEN_OCCUPIED.getValue();
        }
        arrayList.add(Integer.valueOf(value));
        tUIRoomEngineImpl.callAPI("moveUserToSeatByAdmin", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.k0
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f73113a.moveUserToSeatByAdminResponse(actionCallback, error, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m75797e0(final TUIRoomEngineImpl tUIRoomEngineImpl, final TUIRoomDefine.GetUserListCallback getUserListCallback) {
        tUIRoomEngineImpl.getClass();
        tUIRoomEngineImpl.callAPI("getBannedUserList", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.s1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f73187a.getBannedUserListResponse(getUserListCallback, error, str, str2);
            }
        });
    }

    public static TUIRoomDefine.LoginUserInfo getSelfInfo() {
        return TUIRoomEngineJni.getSelfInfo();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m75811l0(TUIRoomEngineImpl tUIRoomEngineImpl, boolean z11) {
        tUIRoomEngineImpl.getClass();
        tUIRoomEngineImpl.mTUIRoomEngineJni = new TUIRoomEngineJni(z11);
        tUIRoomEngineImpl.mObserverProxy = new TUIRoomObserverProxy();
        tUIRoomEngineImpl.mTUIRoomEngineJni.getPipelineBridge().addObserver(tUIRoomEngineImpl.mObserverProxy);
    }

    public static void login(Context context, final int i11, final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        sAppContext = context.getApplicationContext();
        ContextProvider.setContext(context.getApplicationContext());
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.h1
            @Override // java.lang.Runnable
            public final void run() {
                TUIRoomEngineJni.login(TUIRoomEngineImpl.sAppContext, i11, str, str2, actionCallback);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m75815n0(final TUIRoomEngineImpl tUIRoomEngineImpl, List list, final TUIRoomDefine.ExperimentalAPIResponseCallback experimentalAPIResponseCallback) {
        tUIRoomEngineImpl.getClass();
        tUIRoomEngineImpl.callAPI("callExperimentalAPI", list, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.a
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f73024a.callExperimentalAPIResponse(experimentalAPIResponseCallback, error, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m75824s(final TUIRoomEngineImpl tUIRoomEngineImpl, TUIRoomDefine.RoomCustomMessage roomCustomMessage, final TUIRoomDefine.SendCustomMessageCallback sendCustomMessageCallback) {
        tUIRoomEngineImpl.getClass();
        HashMap map = new HashMap();
        String str = roomCustomMessage.businessId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("businessId", str);
        String str3 = roomCustomMessage.data;
        if (str3 != null) {
            str2 = str3;
        }
        map.put("data", str2);
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(map);
        tUIRoomEngineImpl.callAPI("sendCustomMessage", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.h0
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str4, String str5) {
                this.f73089a.sendCustomMessageResponse(sendCustomMessageCallback, error, str4, str5);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m75834z(final TUIRoomEngineImpl tUIRoomEngineImpl, TUIRoomDefine.RoomTextMessage roomTextMessage, final TUIRoomDefine.SendTextMessageCallback sendTextMessageCallback) {
        tUIRoomEngineImpl.getClass();
        HashMap map = new HashMap();
        String str = roomTextMessage.textContent;
        if (str == null) {
            str = "";
        }
        map.put("textContent", str);
        Object map2 = roomTextMessage.extensionInfo;
        if (map2 == null) {
            map2 = new HashMap();
        }
        map.put("extensionInfo", map2);
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(map);
        tUIRoomEngineImpl.callAPI("sendTextMessage", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.room.c0
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f73045a.sendTextMessageResponse(sendTextMessageCallback, error, str2, str3);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void enterRoom(final String str, final TUIRoomDefine.RoomType roomType, final TUIRoomDefine.EnterRoomOptions enterRoomOptions, final TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.room.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73082b.mTUIRoomEngineJni.enterRoom(str, roomType, enterRoomOptions, getRoomInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public TXAudioEffectManager getAudioEffectManager() {
        return getTRTCCloud().getAudioEffectManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public TXBeautyManager getBeautyManager() {
        return getTRTCCloud().getBeautyManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public TXDeviceManager getDeviceManager() {
        return getTRTCCloud().getDeviceManager();
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setBeautyLevel(int i11, float f11) {
        TXBeautyManager beautyManager = getTRTCCloud().getBeautyManager();
        beautyManager.setBeautyStyle(i11);
        beautyManager.setBeautyLevel(f11);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomEngine
    public void setWhitenessLevel(float f11) {
        getTRTCCloud().getBeautyManager().setWhitenessLevel(f11);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.DeprecatedRoomEngineAPI
    public int switchCamera(boolean z11) {
        getMediaDeviceManager().switchCamera(z11);
        return 0;
    }

    public static Object callExperimentalAPI(String str, Object obj) {
        try {
            String string = new JSONObject(str).getString("api");
            if ("createSubRoom".equals(string)) {
                return createSubRoom();
            }
            if ("destroySubRoom".equals(string)) {
                return Boolean.valueOf(destroySubRoom(obj));
            }
            TUIRoomEngineJni.callExperimentalAPI(str);
            return null;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }
}
