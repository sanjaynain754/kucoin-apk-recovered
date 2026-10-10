package com.tencent.cloud.tuikit.engine.impl.room;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager;
import com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager;
import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.extension.internal.TUIConferenceInvitationManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUIConferenceListManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUILiveBattleManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUILiveConnectionManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUILiveGiftManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUILiveLayoutManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUILiveListManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUIRoomDeviceManagerImpl;
import com.tencent.cloud.tuikit.engine.extension.internal.TUISongListManagerImpl;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridge;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.utils.PathUtils;
import com.tencent.cloud.tuikit.engine.impl.utils.SoLoader;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine")
public class TUIRoomEngineJni {
    private static final String TAG = "TUIRoomEngineJni";
    private TUIConferenceInvitationManager mConferenceInvitationManager;
    private TUIConferenceListManager mConferenceListManager;
    private TUIRoomDeviceManager mDeviceManager;
    private TUILiveBattleManager mLiveBattleManager;
    private TUILiveConnectionManager mLiveConnectionManager;
    private TUILiveGiftManager mLiveGiftManager;
    private TUILiveLayoutManager mLiveLayoutManager;
    private TUILiveListManagerImpl mLiveListManager;
    private long mNativeTUIRoomEngineJni;
    private List<TUIRoomObserver> mObserverList = new CopyOnWriteArrayList();
    private TUIPipelineBridge mPipelineBridge;
    private TUISongListManagerImpl mSongListManager;

    public static class ActionCallback {
        private TUIRoomDefine.ActionCallback mCallback;

        @CalledByNative("ActionCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("ActionCallback")
        public void onSuccess() {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onSuccess();
            }
        }

        public ActionCallback(TUIRoomDefine.ActionCallback actionCallback) {
            this.mCallback = actionCallback;
        }
    }

    public static class EnterRoomOptions {
        private TUIRoomDefine.EnterRoomOptions mOptions;

        @CalledByNative("EnterRoomOptions")
        public String getPassword() {
            return this.mOptions.password;
        }

        public EnterRoomOptions(TUIRoomDefine.EnterRoomOptions enterRoomOptions) {
            this.mOptions = enterRoomOptions;
        }
    }

    public static class GetRoomInfoCallback {
        private TUIRoomDefine.GetRoomInfoCallback mCallback;

        @CalledByNative("GetRoomInfoCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback = this.mCallback;
            if (getRoomInfoCallback != null) {
                getRoomInfoCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetRoomInfoCallback")
        public void onSuccess(TUIRoomDefine.RoomInfo roomInfo) {
            TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback = this.mCallback;
            if (getRoomInfoCallback != null) {
                getRoomInfoCallback.onSuccess(roomInfo);
            }
        }

        public GetRoomInfoCallback(TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
            this.mCallback = getRoomInfoCallback;
        }
    }

    public static class GetRoomMetadataCallback {
        private final TUIRoomDefine.GetRoomMetadataCallback mCallback;

        @CalledByNative("GetRoomMetadataCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback = this.mCallback;
            if (getRoomMetadataCallback != null) {
                getRoomMetadataCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        public GetRoomMetadataCallback(TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback) {
            this.mCallback = getRoomMetadataCallback;
        }

        @CalledByNative("GetRoomMetadataCallback")
        public void onSuccess(String str) {
            HashMap<String, String> mapJsonStringToMap = TUIRoomEngineJni.jsonStringToMap(str);
            TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback = this.mCallback;
            if (getRoomMetadataCallback != null) {
                getRoomMetadataCallback.onSuccess(mapJsonStringToMap);
            }
        }
    }

    public static class GetSeatListJniCallback {
        private TUIRoomDefine.GetSeatListCallback mCallback;

        @CalledByNative("GetSeatListJniCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.GetSeatListCallback getSeatListCallback = this.mCallback;
            if (getSeatListCallback != null) {
                getSeatListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetSeatListJniCallback")
        public void onSuccess(List<TUIRoomDefine.SeatInfo> list) {
            TUIRoomDefine.GetSeatListCallback getSeatListCallback = this.mCallback;
            if (getSeatListCallback != null) {
                getSeatListCallback.onSuccess(list);
            }
        }

        public GetSeatListJniCallback(TUIRoomDefine.GetSeatListCallback getSeatListCallback) {
            this.mCallback = getSeatListCallback;
        }
    }

    public static class GetUserInfoCallback {
        private TUIRoomDefine.GetUserInfoCallback mCallback;

        @CalledByNative("GetUserInfoCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.GetUserInfoCallback getUserInfoCallback = this.mCallback;
            if (getUserInfoCallback != null) {
                getUserInfoCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetUserInfoCallback")
        public void onSuccess(TUIRoomDefine.UserInfo userInfo) {
            TUIRoomDefine.GetUserInfoCallback getUserInfoCallback = this.mCallback;
            if (getUserInfoCallback != null) {
                getUserInfoCallback.onSuccess(userInfo);
            }
        }

        public GetUserInfoCallback(TUIRoomDefine.GetUserInfoCallback getUserInfoCallback) {
            this.mCallback = getUserInfoCallback;
        }
    }

    public static class GetUserListJniCallback {
        private TUIRoomDefine.GetUserListCallback mCallback;

        @CalledByNative("GetUserListJniCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.GetUserListCallback getUserListCallback = this.mCallback;
            if (getUserListCallback != null) {
                getUserListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetUserListJniCallback")
        public void onSuccess(TUIRoomDefine.UserListResult userListResult) {
            TUIRoomDefine.GetUserListCallback getUserListCallback = this.mCallback;
            if (getUserListCallback != null) {
                getUserListCallback.onSuccess(userListResult);
            }
        }

        public GetUserListJniCallback(TUIRoomDefine.GetUserListCallback getUserListCallback) {
            this.mCallback = getUserListCallback;
        }
    }

    public static class LoginUserInfo {
        private TUIRoomDefine.LoginUserInfo mUserInfo;

        @CalledByNative("LoginUserInfo")
        public static TUIRoomDefine.LoginUserInfo createLoginUserInfo(String str, String str2, String str3, int i11, HashMap<String, byte[]> map) {
            TUIRoomDefine.LoginUserInfo loginUserInfo = new TUIRoomDefine.LoginUserInfo();
            loginUserInfo.userId = str;
            loginUserInfo.userName = str2;
            loginUserInfo.avatarUrl = str3;
            loginUserInfo.level = i11;
            loginUserInfo.customInfo = map;
            return loginUserInfo;
        }

        @CalledByNative("LoginUserInfo")
        public String getAvatarUrl() {
            return this.mUserInfo.avatarUrl;
        }

        @CalledByNative("LoginUserInfo")
        public HashMap getCustomInfo() {
            return this.mUserInfo.customInfo;
        }

        @CalledByNative("LoginUserInfo")
        public int getLevel() {
            return this.mUserInfo.level;
        }

        @CalledByNative("LoginUserInfo")
        public String getUserId() {
            return this.mUserInfo.userId;
        }

        @CalledByNative("LoginUserInfo")
        public String getUserName() {
            return this.mUserInfo.userName;
        }

        public LoginUserInfo(TUIRoomDefine.LoginUserInfo loginUserInfo) {
            this.mUserInfo = loginUserInfo;
        }
    }

    public static class PlayCallback {
        private TUIRoomDefine.PlayCallback mCallback;

        @CalledByNative("PlayCallback")
        public void onLoading(String str) {
            TUIRoomDefine.PlayCallback playCallback = this.mCallback;
            if (playCallback != null) {
                playCallback.onLoading(str);
            }
        }

        @CalledByNative("PlayCallback")
        public void onPlayError(String str, int i11, String str2) {
            TUIRoomDefine.PlayCallback playCallback = this.mCallback;
            if (playCallback != null) {
                playCallback.onPlayError(str, TUICommonDefine.Error.fromInt(i11), str2);
            }
        }

        @CalledByNative("PlayCallback")
        public void onPlaying(String str) {
            TUIRoomDefine.PlayCallback playCallback = this.mCallback;
            if (playCallback != null) {
                playCallback.onPlaying(str);
            }
        }

        public PlayCallback(TUIRoomDefine.PlayCallback playCallback) {
            this.mCallback = playCallback;
        }
    }

    public static class Request {
        private TUIRoomDefine.Request mRequest;

        @CalledByNative("Request")
        public static TUIRoomDefine.Request createRequest(int i11, long j11, String str, TUIRoomDefine.UserInfo userInfo, TUIRoomDefine.UserInfo userInfo2, TUIRoomDefine.UserInfo userInfo3, String str2, String str3) {
            TUIRoomDefine.Request request = new TUIRoomDefine.Request();
            request.requestAction = TUIRoomDefine.RequestAction.fromInt(i11);
            request.timestamp = j11;
            request.requestId = str;
            request.userId = userInfo.userId;
            request.userName = userInfo.userName;
            request.nameCard = userInfo.nameCard;
            request.avatarUrl = userInfo.avatarUrl;
            request.content = str2;
            request.extensionInfo = str3;
            request.fromUser = userInfo2;
            request.toUser = userInfo3;
            return request;
        }

        public Request(TUIRoomDefine.Request request) {
            this.mRequest = request;
        }
    }

    public static class RequestCallback {
        private TUIRoomDefine.RequestCallback mCallback;
        private TUIRoomDefine.RequestCompletion mCompletion;

        public RequestCallback(TUIRoomDefine.RequestCallback requestCallback) {
            this.mCallback = requestCallback;
        }

        @CalledByNative("RequestCallback")
        public void onAccepted(String str, TUIRoomDefine.UserInfo userInfo, String str2) {
            TUIRoomDefine.RequestCallback requestCallback = this.mCallback;
            if (requestCallback != null) {
                requestCallback.onAccepted(str, userInfo.userId);
                return;
            }
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onAccepted(str, userInfo, str2);
            }
        }

        @CalledByNative("RequestCallback")
        public void onCancelled(String str, TUIRoomDefine.UserInfo userInfo) {
            TUIRoomDefine.RequestCallback requestCallback = this.mCallback;
            if (requestCallback != null) {
                requestCallback.onCancelled(str, userInfo.userId);
                return;
            }
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onCancelled(str, userInfo);
            }
        }

        @CalledByNative("RequestCallback")
        public void onError(String str, TUIRoomDefine.UserInfo userInfo, int i11, String str2) {
            TUIRoomDefine.RequestCallback requestCallback = this.mCallback;
            if (requestCallback != null) {
                requestCallback.onError(str, userInfo.userId, TUICommonDefine.Error.fromInt(i11), str2);
                return;
            }
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onError(str, userInfo, TUICommonDefine.Error.fromInt(i11), str2);
            }
        }

        @CalledByNative("RequestCallback")
        public void onRejected(String str, TUIRoomDefine.UserInfo userInfo, String str2, String str3) {
            TUIRoomDefine.RequestCallback requestCallback = this.mCallback;
            if (requestCallback != null) {
                requestCallback.onRejected(str, userInfo.userId, str2);
                return;
            }
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onRejected(str, userInfo, str2, str3);
            }
        }

        @CalledByNative("RequestCallback")
        public void onSuccess(String str, TUIRoomDefine.UserInfo userInfo) {
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onSuccess(str, userInfo);
            }
        }

        @CalledByNative("RequestCallback")
        public void onTimeout(String str, TUIRoomDefine.UserInfo userInfo) {
            TUIRoomDefine.RequestCallback requestCallback = this.mCallback;
            if (requestCallback != null) {
                requestCallback.onTimeout(str, userInfo.userId);
                return;
            }
            TUIRoomDefine.RequestCompletion requestCompletion = this.mCompletion;
            if (requestCompletion != null) {
                requestCompletion.onTimeout(str, userInfo);
            }
        }

        public RequestCallback(TUIRoomDefine.RequestCompletion requestCompletion) {
            this.mCompletion = requestCompletion;
        }
    }

    public static class RequestListCallback {
        private TUIRoomDefine.RequestListCallback mCallback;

        @CalledByNative("RequestListCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.RequestListCallback requestListCallback = this.mCallback;
            if (requestListCallback != null) {
                requestListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("RequestListCallback")
        public void onSuccess(List<TUIRoomDefine.Request> list) {
            TUIRoomDefine.RequestListCallback requestListCallback = this.mCallback;
            if (requestListCallback != null) {
                requestListCallback.onSuccess(list);
            }
        }

        public RequestListCallback(TUIRoomDefine.RequestListCallback requestListCallback) {
            this.mCallback = requestListCallback;
        }
    }

    public static class RoomInfo {
        private TUIRoomDefine.RoomInfo mRoomInfo;

        @CalledByNative("RoomInfo")
        public int getMaxSeatCount() {
            return this.mRoomInfo.maxSeatCount;
        }

        @CalledByNative("RoomInfo")
        public String getName() {
            return this.mRoomInfo.name;
        }

        @CalledByNative("RoomInfo")
        public String getPassword() {
            return this.mRoomInfo.password;
        }

        @CalledByNative("RoomInfo")
        public String getRoomId() {
            return this.mRoomInfo.roomId;
        }

        @CalledByNative("RoomInfo")
        public int getRoomType() {
            return this.mRoomInfo.roomType.getValue();
        }

        @CalledByNative("RoomInfo")
        public int getSeatMode() {
            return this.mRoomInfo.seatMode.getValue();
        }

        @CalledByNative("RoomInfo")
        public boolean isCameraDisableForAllUser() {
            return this.mRoomInfo.isCameraDisableForAllUser;
        }

        @CalledByNative("RoomInfo")
        public boolean isMessageDisableForAllUser() {
            return this.mRoomInfo.isMessageDisableForAllUser;
        }

        @CalledByNative("RoomInfo")
        public boolean isMicrophoneDisableForAllUser() {
            return this.mRoomInfo.isMicrophoneDisableForAllUser;
        }

        @CalledByNative("RoomInfo")
        public boolean isScreenShareDisableForAllUser() {
            return this.mRoomInfo.isScreenShareDisableForAllUser;
        }

        @CalledByNative("RoomInfo")
        public boolean isSeatEnabled() {
            return this.mRoomInfo.isSeatEnabled;
        }

        @CalledByNative("RoomInfo")
        public boolean keepOwnerOnSeat() {
            return this.mRoomInfo.keepOwnerOnSeat;
        }

        public RoomInfo(TUIRoomDefine.RoomInfo roomInfo) {
            this.mRoomInfo = roomInfo;
        }
    }

    public static class SeatLockParams {
        private TUIRoomDefine.SeatLockParams mLockParams;

        @CalledByNative("SeatLockParams")
        public int getLockFlag() {
            return this.mLockParams.lockFlag.getValue();
        }

        @CalledByNative("SeatLockParams")
        public boolean isAudioLock() {
            return this.mLockParams.lockAudio;
        }

        @CalledByNative("SeatLockParams")
        public boolean isSeatLock() {
            return this.mLockParams.lockSeat;
        }

        @CalledByNative("SeatLockParams")
        public boolean isVideoLock() {
            return this.mLockParams.lockVideo;
        }

        public SeatLockParams(TUIRoomDefine.SeatLockParams seatLockParams) {
            this.mLockParams = seatLockParams;
        }
    }

    public static class UserInfo {
        private TUIRoomDefine.UserInfo mUserInfo;

        @CalledByNative("UserInfo")
        public static TUIRoomDefine.UserInfo createUserInfo(String str, String str2, String str3, String str4, int i11, boolean z11, boolean z12, boolean z13, boolean z14, int i12, HashMap<String, byte[]> map) {
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = str;
            userInfo.userName = str2;
            userInfo.nameCard = str3;
            userInfo.avatarUrl = str4;
            userInfo.userRole = TUIRoomDefine.Role.fromInt(i11);
            userInfo.hasAudioStream = z11;
            userInfo.hasVideoStream = z12;
            userInfo.hasScreenStream = z13;
            userInfo.isMessageDisabled = z14;
            userInfo.level = i12;
            userInfo.roomCustomInfo = map;
            return userInfo;
        }

        public UserInfo(TUIRoomDefine.UserInfo userInfo) {
            this.mUserInfo = userInfo;
        }
    }

    public static class UserListResult {
        private TUIRoomDefine.UserListResult mUserListResult;

        @CalledByNative("UserListResult")
        public static TUIRoomDefine.UserListResult createUserListResult(long j11, List<TUIRoomDefine.UserInfo> list) {
            TUIRoomDefine.UserListResult userListResult = new TUIRoomDefine.UserListResult();
            userListResult.nextSequence = j11;
            userListResult.userInfoList = list;
            return userListResult;
        }

        public UserListResult(TUIRoomDefine.UserListResult userListResult) {
            this.mUserListResult = userListResult;
        }
    }

    public static class VideoEncoderParams {
        private TUIRoomDefine.RoomVideoEncoderParams mVideoEncoderParams;

        @CalledByNative("VideoEncoderParams")
        public int getBitrate() {
            return this.mVideoEncoderParams.bitrate;
        }

        @CalledByNative("VideoEncoderParams")
        public int getFps() {
            return this.mVideoEncoderParams.fps;
        }

        @CalledByNative("VideoEncoderParams")
        public int getResMode() {
            return this.mVideoEncoderParams.resolutionMode.getValue();
        }

        @CalledByNative("VideoEncoderParams")
        public int getVideoResolution() {
            return this.mVideoEncoderParams.videoResolution.getValue();
        }

        public VideoEncoderParams(TUIRoomDefine.RoomVideoEncoderParams roomVideoEncoderParams) {
            this.mVideoEncoderParams = roomVideoEncoderParams;
        }
    }

    private boolean checkPipeline() {
        return this.mNativeTUIRoomEngineJni != 0;
    }

    private static native void nativeAddCategoryTagForUsers(long j11, int i11, String[] strArr, ActionCallback actionCallback);

    private static native TUIRoomDefine.Request nativeApplyToAdminToOpenLocalDevice(long j11, int i11, int i12, RequestCallback requestCallback);

    private static native void nativeCallExperimentalAPI(String str);

    private static native void nativeCancelRequest(long j11, String str, ActionCallback actionCallback);

    private static native void nativeChangeUserNameCard(long j11, String str, String str2, ActionCallback actionCallback);

    private static native void nativeChangeUserRole(long j11, String str, int i11, ActionCallback actionCallback);

    private static native void nativeCloseLocalCamera(long j11);

    private static native void nativeCloseLocalMicrophone(long j11);

    private static native void nativeCloseRemoteDeviceByAdmin(long j11, String str, int i11, ActionCallback actionCallback);

    private static native long nativeCreatePipeline(TUIRoomEngineJni tUIRoomEngineJni, boolean z11, long j11);

    private static native void nativeCreateRoom(long j11, RoomInfo roomInfo, ActionCallback actionCallback);

    private static native void nativeDestroyPipeline(long j11);

    private static native void nativeDestroyRoom(long j11, ActionCallback actionCallback);

    private static native void nativeDisableDeviceForAllUserByAdmin(long j11, boolean z11, int i11, ActionCallback actionCallback);

    private static native void nativeDisableSendingMessageByAdmin(long j11, boolean z11, String str, ActionCallback actionCallback);

    private static native void nativeDisableSendingMessageForAllUser(long j11, boolean z11, ActionCallback actionCallback);

    private static native void nativeEnableGravitySensor(long j11, boolean z11);

    private static native void nativeEnableSystemAudioSharing(long j11, boolean z11);

    private static native void nativeEnterRoom(long j11, String str, int i11, EnterRoomOptions enterRoomOptions, GetRoomInfoCallback getRoomInfoCallback);

    private static native void nativeExitRoom(long j11, boolean z11, ActionCallback actionCallback);

    private static native void nativeFetchRoomInfo(long j11, GetRoomInfoCallback getRoomInfoCallback);

    private static native void nativeFetchRoomInfoById(long j11, String str, int i11, GetRoomInfoCallback getRoomInfoCallback);

    private static native void nativeFreeJObjectByAddress(long j11);

    private static native long nativeGetConferenceInvitationManager(long j11);

    private static native long nativeGetConferenceListManager(long j11);

    private static native long nativeGetExtension(long j11, int i11);

    private static native long nativeGetJObjectAddress(Object obj);

    private static native long nativeGetLiveBattleManager(long j11);

    private static native long nativeGetLiveConnectionManager(long j11);

    private static native long nativeGetLiveGiftManager(long j11);

    private static native long nativeGetLiveLayoutManager(long j11);

    private static native long nativeGetLiveListManager(long j11);

    private static native long nativeGetMediaDeviceManager(long j11);

    private static native void nativeGetRoomMetadata(long j11, String[] strArr, GetRoomMetadataCallback getRoomMetadataCallback);

    private static native void nativeGetSeatApplicationList(long j11, RequestListCallback requestListCallback);

    private static native void nativeGetSeatList(long j11, GetSeatListJniCallback getSeatListJniCallback);

    private static native TUIRoomDefine.LoginUserInfo nativeGetSelfInfo();

    private static native long nativeGetSongListManager(long j11);

    private static native TRTCCloud nativeGetTRTCCloud(long j11);

    private static native void nativeGetUserInfo(long j11, String str, GetUserInfoCallback getUserInfoCallback);

    private static native void nativeGetUserList(long j11, long j12, GetUserListJniCallback getUserListJniCallback);

    private static native void nativeGetUserListByTag(long j11, int i11, long j12, GetUserListJniCallback getUserListJniCallback);

    private static native void nativeKickRemoteUserOutOfRoom(long j11, String str, ActionCallback actionCallback);

    public static native void nativeKickUserOffSeatByAdmin(long j11, int i11, String str, String str2, ActionCallback actionCallback);

    private static native void nativeLeaveSeat(long j11, ActionCallback actionCallback);

    private static native void nativeLockSeatByAdmin(long j11, int i11, SeatLockParams seatLockParams, ActionCallback actionCallback);

    private static native void nativeLogin(int i11, String str, String str2, String str3, String str4, ActionCallback actionCallback);

    private static native void nativeLogout(ActionCallback actionCallback);

    private static native void nativeMoveToSeat(long j11, int i11, ActionCallback actionCallback);

    private static native void nativeMuteLocalAudio(long j11);

    private static native void nativeMuteRemoteAudioStream(long j11, String str, boolean z11);

    private static native void nativeOpenLocalCamera(long j11, int i11, int i12, ActionCallback actionCallback);

    private static native void nativeOpenLocalMicrophone(long j11, int i11, ActionCallback actionCallback);

    private static native TUIRoomDefine.Request nativeOpenRemoteDeviceByAdmin(long j11, String str, int i11, int i12, RequestCallback requestCallback);

    private static native void nativeRemoveCategoryTagForUsers(long j11, int i11, String[] strArr, ActionCallback actionCallback);

    private static native void nativeResponseRemoteRequest(long j11, String str, boolean z11, String str2, ActionCallback actionCallback);

    private static native void nativeSetCustomInfoForUser(long j11, String str, HashMap<String, byte[]> map, ActionCallback actionCallback);

    private static native void nativeSetLocalVideoView(long j11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeSetLocalVideoViewDeprecated(long j11, int i11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeSetLoginInfo(LoginUserInfo loginUserInfo, ActionCallback actionCallback);

    private static native void nativeSetRemoteVideoView(long j11, String str, int i11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeSetRoomMetadataByAdmin(long j11, String str, ActionCallback actionCallback);

    private static native void nativeSetSelfInfo(String str, String str2, ActionCallback actionCallback);

    private static native void nativeSetVideoResolutionMode(long j11, int i11, int i12);

    private static native void nativeStartPlayRemoteVideo(long j11, String str, int i11, PlayCallback playCallback);

    private static native void nativeStartPushLocalVideo(long j11);

    private static native void nativeStartScreenSharing(long j11);

    private static native void nativeStopPlayRemoteVideo(long j11, String str, int i11);

    private static native void nativeStopPushLocalVideo(long j11);

    private static native void nativeStopScreenSharing(long j11);

    private static native TUIRoomDefine.Request nativeTakeSeat(long j11, int i11, int i12, String str, RequestCallback requestCallback);

    public static native TUIRoomDefine.Request nativeTakeUserOnSeatByAdmin(long j11, int i11, String str, int i12, String str2, RequestCallback requestCallback);

    private static native void nativeUnmuteLocalAudio(long j11, ActionCallback actionCallback);

    private static native void nativeUpdateAudioQuality(long j11, int i11);

    private static native void nativeUpdateRoomNameByAdmin(long j11, String str, ActionCallback actionCallback);

    private static native void nativeUpdateRoomPasswordByAdmin(long j11, String str, ActionCallback actionCallback);

    private static native void nativeUpdateRoomSeatModeByAdmin(long j11, int i11, ActionCallback actionCallback);

    private static native void nativeUpdateVideoQuality(long j11, int i11);

    private static native void nativeUpdateVideoQualityEx(long j11, int i11, VideoEncoderParams videoEncoderParams);

    public void fetchRoomInfo(TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        if (checkPipeline(getRoomInfoCallback)) {
            nativeFetchRoomInfo(this.mNativeTUIRoomEngineJni, new GetRoomInfoCallback(getRoomInfoCallback));
        }
    }

    public void setLocalVideoView(TUIRoomDefine.VideoStreamType videoStreamType, TXCloudVideoView tXCloudVideoView) {
        if (checkPipeline()) {
            nativeSetLocalVideoViewDeprecated(this.mNativeTUIRoomEngineJni, videoStreamType.getValue(), tXCloudVideoView);
        }
    }

    public TUIRoomDefine.Request takeSeat(int i11, int i12, TUIRoomDefine.RequestCallback requestCallback) {
        return !checkPipeline(requestCallback) ? new TUIRoomDefine.Request() : nativeTakeSeat(this.mNativeTUIRoomEngineJni, i11, i12, "", new RequestCallback(requestCallback));
    }

    public TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, TUIRoomDefine.RequestCallback requestCallback) {
        return !checkPipeline(requestCallback) ? new TUIRoomDefine.Request() : nativeTakeUserOnSeatByAdmin(this.mNativeTUIRoomEngineJni, i11, str, i12, "", new RequestCallback(requestCallback));
    }

    private boolean checkPipeline(TUIRoomDefine.ActionCallback actionCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (actionCallback == null) {
            return false;
        }
        actionCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private List<TUIRoomObserver> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    @CalledByNative
    public static HashMap createCustomInfo() {
        return new HashMap();
    }

    @CalledByNative
    public static HashMap createNetWorkMap(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            TUICommonDefine.NetworkInfo networkInfo = new TUICommonDefine.NetworkInfo();
            networkInfo.userId = strArr2[i11];
            networkInfo.quality = TUICommonDefine.NetworkQuality.fromInt(iArr[i11]);
            networkInfo.upLoss = iArr2[i11];
            networkInfo.downLoss = iArr3[i11];
            networkInfo.delay = iArr4[i11];
            map.put(strArr[i11], networkInfo);
        }
        return map;
    }

    @CalledByNative
    public static ArrayList createRequestList(int[] iArr, int[] iArr2, String[] strArr, ArrayList<TUIRoomDefine.UserInfo> arrayList, ArrayList<TUIRoomDefine.UserInfo> arrayList2, ArrayList<TUIRoomDefine.UserInfo> arrayList3, String[] strArr2, String[] strArr3) {
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            TUIRoomDefine.Request request = new TUIRoomDefine.Request();
            request.requestAction = TUIRoomDefine.RequestAction.fromInt(iArr[i11]);
            request.timestamp = iArr2[i11];
            request.requestId = strArr[i11];
            request.userId = arrayList.get(i11).userId;
            request.userName = arrayList.get(i11).userName;
            request.nameCard = arrayList.get(i11).nameCard;
            request.avatarUrl = arrayList.get(i11).avatarUrl;
            request.content = strArr2[i11];
            request.extensionInfo = strArr3[i11];
            request.fromUser = arrayList2.get(i11);
            request.toUser = arrayList3.get(i11);
            arrayList4.add(request);
        }
        return arrayList4;
    }

    @CalledByNative
    public static TUIRoomDefine.RoomInfo createRoomInfo(String str, String str2, String str3, long j11, int i11, String str4, int i12, String str5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, String str6) {
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        roomInfo.roomId = str4;
        roomInfo.roomType = TUIRoomDefine.RoomType.fromInt(i12);
        roomInfo.name = str5;
        roomInfo.isCameraDisableForAllUser = z11;
        roomInfo.isMicrophoneDisableForAllUser = z12;
        roomInfo.isScreenShareDisableForAllUser = z13;
        roomInfo.isMessageDisableForAllUser = z14;
        roomInfo.isSeatEnabled = z15;
        roomInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(i13);
        roomInfo.maxSeatCount = i14;
        roomInfo.ownerId = str;
        roomInfo.ownerName = str2;
        roomInfo.ownerAvatarUrl = str3;
        roomInfo.memberCount = i11;
        roomInfo.keepOwnerOnSeat = z16;
        roomInfo.createTime = j11;
        roomInfo.password = str6;
        return roomInfo;
    }

    @CalledByNative
    public static ArrayList createSeatInfoList(int[] iArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, boolean[] zArr, boolean[] zArr2, boolean[] zArr3) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            TUIRoomDefine.SeatInfo seatInfo = new TUIRoomDefine.SeatInfo();
            seatInfo.roomId = strArr[i11];
            seatInfo.index = iArr[i11];
            seatInfo.userId = strArr2[i11];
            seatInfo.userName = strArr3[i11];
            seatInfo.nameCard = strArr4[i11];
            seatInfo.avatarUrl = strArr5[i11];
            seatInfo.isLocked = zArr[i11];
            seatInfo.isVideoLocked = zArr2[i11];
            seatInfo.isAudioLocked = zArr3[i11];
            arrayList.add(seatInfo);
        }
        return arrayList;
    }

    @CalledByNative
    public static ArrayList<TUIRoomDefine.UserInfo> createUserInfoList() {
        return new ArrayList<>();
    }

    @CalledByNative
    public static HashMap createVolumeMap(String[] strArr, int[] iArr) {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            map.put(strArr[i11], Integer.valueOf(iArr[i11]));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, String> jsonStringToMap(String str) {
        HashMap<String, String> map = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "jsonStringToMap error:" + e11.getMessage());
            }
        }
        return map;
    }

    public static void logout(TUIRoomDefine.ActionCallback actionCallback) {
        nativeLogout(new ActionCallback(actionCallback));
    }

    public static void setLoginInfo(TUIRoomDefine.LoginUserInfo loginUserInfo, TUIRoomDefine.ActionCallback actionCallback) {
        nativeSetLoginInfo(new LoginUserInfo(loginUserInfo), new ActionCallback(actionCallback));
    }

    public static void setSelfInfo(String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        nativeSetSelfInfo(str, str2, new ActionCallback(actionCallback));
    }

    public void addObserver(TUIRoomObserver tUIRoomObserver) {
        if (tUIRoomObserver == null || this.mObserverList.contains(tUIRoomObserver)) {
            return;
        }
        this.mObserverList.add(tUIRoomObserver);
    }

    public void destroy() {
        if (this.mNativeTUIRoomEngineJni != 0) {
            ((TUILiveBattleManagerImpl) getLiveBattleManager()).destroy();
            ((TUILiveConnectionManagerImpl) getLiveConnectionManager()).destroy();
            ((TUILiveLayoutManagerImpl) getLiveLayoutManager()).destroy();
            ((TUILiveGiftManagerImpl) getLiveGiftManager()).destroy();
            nativeDestroyPipeline(this.mNativeTUIRoomEngineJni);
            this.mNativeTUIRoomEngineJni = 0L;
        }
        this.mObserverList.clear();
        this.mPipelineBridge.destroy();
    }

    public TUIConferenceInvitationManager getConferenceInvitationManager() {
        if (this.mConferenceInvitationManager == null) {
            this.mConferenceInvitationManager = new TUIConferenceInvitationManagerImpl(nativeGetConferenceInvitationManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mConferenceInvitationManager;
    }

    public TUIConferenceListManager getConferenceListManager() {
        if (this.mConferenceListManager == null) {
            this.mConferenceListManager = new TUIConferenceListManagerImpl(nativeGetConferenceListManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mConferenceListManager;
    }

    public TUILiveBattleManager getLiveBattleManager() {
        if (this.mLiveBattleManager == null) {
            this.mLiveBattleManager = new TUILiveBattleManagerImpl(nativeGetLiveBattleManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mLiveBattleManager;
    }

    public TUILiveConnectionManager getLiveConnectionManager() {
        if (this.mLiveConnectionManager == null) {
            this.mLiveConnectionManager = new TUILiveConnectionManagerImpl(nativeGetLiveConnectionManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mLiveConnectionManager;
    }

    public TUILiveGiftManager getLiveGiftManager() {
        if (this.mLiveGiftManager == null) {
            this.mLiveGiftManager = new TUILiveGiftManagerImpl(nativeGetLiveGiftManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mLiveGiftManager;
    }

    public TUILiveLayoutManager getLiveLayoutManager() {
        if (this.mLiveLayoutManager == null) {
            this.mLiveLayoutManager = new TUILiveLayoutManagerImpl(nativeGetLiveLayoutManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mLiveLayoutManager;
    }

    public TUILiveListManagerImpl getLiveListManager() {
        if (this.mLiveListManager == null) {
            this.mLiveListManager = new TUILiveListManagerImpl(this, nativeGetLiveListManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mLiveListManager;
    }

    public TUIRoomDeviceManager getMediaDeviceManager() {
        if (this.mDeviceManager == null) {
            this.mDeviceManager = new TUIRoomDeviceManagerImpl(nativeGetMediaDeviceManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mDeviceManager;
    }

    public TUIPipelineBridge getPipelineBridge() {
        return this.mPipelineBridge;
    }

    public TUISongListManager getSongListManager() {
        if (this.mSongListManager == null) {
            this.mSongListManager = new TUISongListManagerImpl(this, nativeGetSongListManager(this.mNativeTUIRoomEngineJni));
        }
        return this.mSongListManager;
    }

    public void removeObserver(TUIRoomObserver tUIRoomObserver) {
        if (tUIRoomObserver == null || !this.mObserverList.contains(tUIRoomObserver)) {
            return;
        }
        this.mObserverList.remove(tUIRoomObserver);
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TUIRoomEngineJni(boolean z11) {
        TUIPipelineBridge tUIPipelineBridge = new TUIPipelineBridge(TUIPipelineBridgeDefine.PipelineType.Room, z11);
        this.mPipelineBridge = tUIPipelineBridge;
        this.mNativeTUIRoomEngineJni = nativeCreatePipeline(this, z11, tUIPipelineBridge.getNativePipelineBridge());
    }

    public static void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(str);
    }

    public static void freeJObjectByAddress(long j11) {
        nativeFreeJObjectByAddress(j11);
    }

    public static long getJObjectAddress(Object obj) {
        return nativeGetJObjectAddress(obj);
    }

    @CalledByNative
    public static String[] getMapKeys(Map<String, byte[]> map) {
        String[] strArr = new String[map.size()];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        return strArr;
    }

    @CalledByNative
    public static byte[] getMapValue(HashMap<String, byte[]> map, String str) {
        return map.get(str);
    }

    public static TUIRoomDefine.LoginUserInfo getSelfInfo() {
        return nativeGetSelfInfo();
    }

    @CalledByNative
    public static void insertCustomInfo(HashMap<String, byte[]> map, String str, byte[] bArr) {
        map.put(str, bArr);
    }

    @CalledByNative
    public static void insertUserInfo(ArrayList<TUIRoomDefine.UserInfo> arrayList, TUIRoomDefine.UserInfo userInfo) {
        arrayList.add(userInfo);
    }

    public static void login(Context context, int i11, String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        nativeLogin(i11, str, str2, PathUtils.getSDKInitPath(context), PathUtils.getSDKLogPath(context), new ActionCallback(actionCallback));
    }

    public void addCategoryTagForUsers(int i11, List<String> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeAddCategoryTagForUsers(this.mNativeTUIRoomEngineJni, i11, (String[]) list.toArray(new String[list.size()]), new ActionCallback(actionCallback));
    }

    public TUIRoomDefine.Request applyToAdminToOpenLocalDevice(TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback) {
        if (!checkPipeline(requestCallback)) {
            return new TUIRoomDefine.Request();
        }
        return nativeApplyToAdminToOpenLocalDevice(this.mNativeTUIRoomEngineJni, mediaDevice.getValue(), i11, new RequestCallback(requestCallback));
    }

    public void cancelRequest(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeCancelRequest(this.mNativeTUIRoomEngineJni, str, new ActionCallback(actionCallback));
    }

    public void changeUserNameCard(String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeChangeUserNameCard(this.mNativeTUIRoomEngineJni, str, str2, new ActionCallback(actionCallback));
    }

    public void changeUserRole(String str, TUIRoomDefine.Role role, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeChangeUserRole(this.mNativeTUIRoomEngineJni, str, role.getValue(), new ActionCallback(actionCallback));
    }

    public void closeLocalCamera() {
        if (!checkPipeline()) {
            return;
        }
        nativeCloseLocalCamera(this.mNativeTUIRoomEngineJni);
    }

    public void closeLocalMicrophone() {
        if (!checkPipeline()) {
            return;
        }
        nativeCloseLocalMicrophone(this.mNativeTUIRoomEngineJni);
    }

    public void closeRemoteDeviceByAdmin(String str, TUIRoomDefine.MediaDevice mediaDevice, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeCloseRemoteDeviceByAdmin(this.mNativeTUIRoomEngineJni, str, mediaDevice.getValue(), new ActionCallback(actionCallback));
    }

    @CalledByNative
    public TUIRoomDefine.ChangeReason createChangeReason(int i11) {
        return TUIRoomDefine.ChangeReason.fromInt(i11);
    }

    @CalledByNative
    public TUIRoomDefine.KickedOutOfRoomReason createKickedOutOfRoomReason(int i11) {
        return TUIRoomDefine.KickedOutOfRoomReason.fromInt(i11);
    }

    public void createRoom(TUIRoomDefine.RoomInfo roomInfo, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeCreateRoom(this.mNativeTUIRoomEngineJni, new RoomInfo(roomInfo), new ActionCallback(actionCallback));
    }

    @CalledByNative
    public TUIRoomDefine.SeatMode createSeatMode(int i11) {
        return TUIRoomDefine.SeatMode.fromInt(i11);
    }

    @CalledByNative
    public TUIRoomDefine.VideoStreamType createVideoStreamType(int i11) {
        return TUIRoomDefine.VideoStreamType.fromInt(i11);
    }

    public void destroyRoom(TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeDestroyRoom(this.mNativeTUIRoomEngineJni, new ActionCallback(actionCallback));
    }

    public void disableDeviceForAllUserByAdmin(boolean z11, TUIRoomDefine.MediaDevice mediaDevice, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeDisableDeviceForAllUserByAdmin(this.mNativeTUIRoomEngineJni, z11, mediaDevice.getValue(), new ActionCallback(actionCallback));
    }

    public void disableSendingMessageByAdmin(boolean z11, String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeDisableSendingMessageByAdmin(this.mNativeTUIRoomEngineJni, z11, str, new ActionCallback(actionCallback));
    }

    public void disableSendingMessageForAllUser(boolean z11, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeDisableSendingMessageForAllUser(this.mNativeTUIRoomEngineJni, z11, new ActionCallback(actionCallback));
    }

    public void enableGravitySensor(boolean z11) {
        if (!checkPipeline()) {
            return;
        }
        nativeEnableGravitySensor(this.mNativeTUIRoomEngineJni, z11);
    }

    public void enableSystemAudioSharing(boolean z11) {
        if (!checkPipeline()) {
            return;
        }
        nativeEnableSystemAudioSharing(this.mNativeTUIRoomEngineJni, z11);
    }

    public void enterRoom(String str, TUIRoomDefine.RoomType roomType, TUIRoomDefine.EnterRoomOptions enterRoomOptions, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        if (!checkPipeline(getRoomInfoCallback)) {
            return;
        }
        nativeEnterRoom(this.mNativeTUIRoomEngineJni, str, roomType.getValue(), new EnterRoomOptions(enterRoomOptions), new GetRoomInfoCallback(getRoomInfoCallback));
    }

    public void exitRoom(boolean z11, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeExitRoom(this.mNativeTUIRoomEngineJni, z11, new ActionCallback(actionCallback));
    }

    public void fetchRoomInfo(String str, TUIRoomDefine.RoomType roomType, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        if (checkPipeline(getRoomInfoCallback)) {
            nativeFetchRoomInfoById(this.mNativeTUIRoomEngineJni, str, roomType.getValue(), new GetRoomInfoCallback(getRoomInfoCallback));
        }
    }

    public void getRoomMetadata(List<String> list, TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback) {
        if (!checkPipeline(getRoomMetadataCallback)) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        nativeGetRoomMetadata(this.mNativeTUIRoomEngineJni, (String[]) list.toArray(new String[0]), new GetRoomMetadataCallback(getRoomMetadataCallback));
    }

    public void getSeatApplicationList(TUIRoomDefine.RequestListCallback requestListCallback) {
        if (!checkPipeline(requestListCallback)) {
            return;
        }
        nativeGetSeatApplicationList(this.mNativeTUIRoomEngineJni, new RequestListCallback(requestListCallback));
    }

    public void getSeatList(TUIRoomDefine.GetSeatListCallback getSeatListCallback) {
        if (!checkPipeline(getSeatListCallback)) {
            return;
        }
        nativeGetSeatList(this.mNativeTUIRoomEngineJni, new GetSeatListJniCallback(getSeatListCallback));
    }

    public TRTCCloud getTRTCCloud() {
        if (!checkPipeline()) {
            return null;
        }
        return nativeGetTRTCCloud(this.mNativeTUIRoomEngineJni);
    }

    public void getUserInfo(String str, TUIRoomDefine.GetUserInfoCallback getUserInfoCallback) {
        if (!checkPipeline(getUserInfoCallback)) {
            return;
        }
        nativeGetUserInfo(this.mNativeTUIRoomEngineJni, str, new GetUserInfoCallback(getUserInfoCallback));
    }

    public void getUserList(long j11, TUIRoomDefine.GetUserListCallback getUserListCallback) {
        if (!checkPipeline(getUserListCallback)) {
            return;
        }
        nativeGetUserList(this.mNativeTUIRoomEngineJni, j11, new GetUserListJniCallback(getUserListCallback));
    }

    public void getUserListByTag(int i11, long j11, TUIRoomDefine.GetUserListCallback getUserListCallback) {
        if (!checkPipeline(getUserListCallback)) {
            return;
        }
        nativeGetUserListByTag(this.mNativeTUIRoomEngineJni, i11, j11, new GetUserListJniCallback(getUserListCallback));
    }

    public void kickRemoteUserOutOfRoom(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeKickRemoteUserOutOfRoom(this.mNativeTUIRoomEngineJni, str, new ActionCallback(actionCallback));
    }

    public void kickUserOffSeatByAdmin(int i11, String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeKickUserOffSeatByAdmin(this.mNativeTUIRoomEngineJni, i11, str, str2, new ActionCallback(actionCallback));
    }

    public void leaveSeat(TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeLeaveSeat(this.mNativeTUIRoomEngineJni, new ActionCallback(actionCallback));
    }

    public void lockSeatByAdmin(int i11, TUIRoomDefine.SeatLockParams seatLockParams, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeLockSeatByAdmin(this.mNativeTUIRoomEngineJni, i11, new SeatLockParams(seatLockParams), new ActionCallback(actionCallback));
    }

    public void moveToSeat(int i11, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeMoveToSeat(this.mNativeTUIRoomEngineJni, i11, new ActionCallback(actionCallback));
    }

    public void muteLocalAudio() {
        if (!checkPipeline()) {
            return;
        }
        nativeMuteLocalAudio(this.mNativeTUIRoomEngineJni);
    }

    public void muteRemoteAudioStream(String str, boolean z11) {
        if (!checkPipeline()) {
            return;
        }
        nativeMuteRemoteAudioStream(this.mNativeTUIRoomEngineJni, str, z11);
    }

    @CalledByNative
    public void onAllUserCameraDisableChanged(String str, boolean z11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAllUserCameraDisableChanged(str, z11);
        }
    }

    @CalledByNative
    public void onAllUserMicrophoneDisableChanged(String str, boolean z11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAllUserMicrophoneDisableChanged(str, z11);
        }
    }

    @CalledByNative
    public void onError(int i11, String str) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(TUICommonDefine.Error.fromInt(i11), str);
        }
    }

    @CalledByNative
    public void onKickedOffLine(String str) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onKickedOffLine(str);
        }
    }

    @CalledByNative
    public void onKickedOffSeat(int i11, TUIRoomDefine.UserInfo userInfo, String str) {
        for (TUIRoomObserver tUIRoomObserver : copyOnReadListeners()) {
            tUIRoomObserver.onKickedOffSeat(i11, userInfo);
            tUIRoomObserver.onKickedOffSeat(i11, userInfo, str);
        }
    }

    @CalledByNative
    public void onKickedOutOfRoom(String str, TUIRoomDefine.KickedOutOfRoomReason kickedOutOfRoomReason, String str2) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onKickedOutOfRoom(str, kickedOutOfRoomReason, str2);
        }
    }

    @CalledByNative
    public void onRemoteUserEnterRoom(String str, TUIRoomDefine.UserInfo userInfo) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserEnterRoom(str, userInfo);
        }
    }

    @CalledByNative
    public void onRemoteUserLeaveRoom(String str, TUIRoomDefine.UserInfo userInfo) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserLeaveRoom(str, userInfo);
        }
    }

    @CalledByNative
    public void onRequestCancelled(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRequestCancelled(request, userInfo);
        }
    }

    @CalledByNative
    public void onRequestProcessed(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRequestProcessed(request, userInfo);
        }
    }

    @CalledByNative
    public void onRequestReceived(TUIRoomDefine.Request request) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRequestReceived(request);
        }
    }

    @CalledByNative
    public void onRoomDismissed(String str, int i11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRoomDismissed(str, TUIRoomDefine.RoomDismissedReason.fromInt(i11));
        }
    }

    @CalledByNative
    public void onRoomMetadataChanged(String str, String str2) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRoomMetadataChanged(str, str2);
        }
    }

    @CalledByNative
    public void onRoomNameChanged(String str, String str2) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRoomNameChanged(str, str2);
        }
    }

    @CalledByNative
    public void onRoomSeatModeChanged(String str, TUIRoomDefine.SeatMode seatMode) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRoomSeatModeChanged(str, seatMode);
        }
    }

    @CalledByNative
    public void onRoomUserCountChanged(String str, int i11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRoomUserCountChanged(str, i11);
        }
    }

    @CalledByNative
    public void onScreenShareForAllUserDisableChanged(String str, boolean z11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenShareForAllUserDisableChanged(str, z11);
        }
    }

    @CalledByNative
    public void onSeatListChanged(List<TUIRoomDefine.SeatInfo> list, List<TUIRoomDefine.SeatInfo> list2, List<TUIRoomDefine.SeatInfo> list3) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSeatListChanged(list, list2, list3);
        }
    }

    @CalledByNative
    public void onSendMessageForAllUserDisableChanged(String str, boolean z11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendMessageForAllUserDisableChanged(str, z11);
        }
    }

    @CalledByNative
    public void onSendMessageForUserDisableChanged(String str, String str2, boolean z11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendMessageForUserDisableChanged(str, str2, z11);
        }
    }

    @CalledByNative
    public void onUserAudioStateChanged(String str, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserAudioStateChanged(str, z11, changeReason);
        }
    }

    @CalledByNative
    public void onUserInfoChanged(TUIRoomDefine.UserInfo userInfo, int i11) {
        for (TUIRoomObserver tUIRoomObserver : copyOnReadListeners()) {
            ArrayList arrayList = new ArrayList();
            TUIRoomDefine.UserInfoModifyFlag userInfoModifyFlag = TUIRoomDefine.UserInfoModifyFlag.USER_ROLE;
            if ((userInfoModifyFlag.getValue() & i11) != 0) {
                arrayList.add(userInfoModifyFlag);
            }
            TUIRoomDefine.UserInfoModifyFlag userInfoModifyFlag2 = TUIRoomDefine.UserInfoModifyFlag.NAME_CARD;
            if ((userInfoModifyFlag2.getValue() & i11) != 0) {
                arrayList.add(userInfoModifyFlag2);
            }
            tUIRoomObserver.onUserInfoChanged(userInfo, arrayList);
        }
    }

    @CalledByNative
    public void onUserNetworkQualityChanged(Map<String, TUICommonDefine.NetworkInfo> map) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserNetworkQualityChanged(map);
        }
    }

    @CalledByNative
    public void onUserScreenCaptureStopped(int i11) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserScreenCaptureStopped(i11);
        }
    }

    @CalledByNative
    public void onUserSigExpired() {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserSigExpired();
        }
    }

    @CalledByNative
    public void onUserVideoSizeChanged(String str, String str2, TUIRoomDefine.VideoStreamType videoStreamType, int i11, int i12) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoSizeChanged(str, str2, videoStreamType, i11, i12);
        }
    }

    @CalledByNative
    public void onUserVideoStateChanged(String str, TUIRoomDefine.VideoStreamType videoStreamType, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoStateChanged(str, videoStreamType, z11, changeReason);
        }
    }

    @CalledByNative
    public void onUserVoiceVolumeChanged(Map<String, Integer> map) {
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVoiceVolumeChanged(map);
        }
    }

    public void openLocalCamera(int i11, TUIRoomDefine.VideoQuality videoQuality, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeOpenLocalCamera(this.mNativeTUIRoomEngineJni, i11, videoQuality.getValue(), new ActionCallback(actionCallback));
    }

    public void openLocalMicrophone(TUIRoomDefine.AudioQuality audioQuality, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeOpenLocalMicrophone(this.mNativeTUIRoomEngineJni, audioQuality.getValue(), new ActionCallback(actionCallback));
    }

    public TUIRoomDefine.Request openRemoteDeviceByAdmin(String str, TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback) {
        if (!checkPipeline(requestCallback)) {
            return new TUIRoomDefine.Request();
        }
        return nativeOpenRemoteDeviceByAdmin(this.mNativeTUIRoomEngineJni, str, mediaDevice.getValue(), i11, new RequestCallback(requestCallback));
    }

    public void removeCategoryTagForUsers(int i11, List<String> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeRemoveCategoryTagForUsers(this.mNativeTUIRoomEngineJni, i11, (String[]) list.toArray(new String[list.size()]), new ActionCallback(actionCallback));
    }

    public void responseRemoteRequest(String str, boolean z11, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeResponseRemoteRequest(this.mNativeTUIRoomEngineJni, str, z11, str2, new ActionCallback(actionCallback));
    }

    public void setCustomInfoForUser(String str, HashMap<String, byte[]> map, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeSetCustomInfoForUser(this.mNativeTUIRoomEngineJni, str, map, new ActionCallback(actionCallback));
    }

    public void setLocalVideoView(TXCloudVideoView tXCloudVideoView) {
        if (checkPipeline()) {
            nativeSetLocalVideoView(this.mNativeTUIRoomEngineJni, tXCloudVideoView);
        }
    }

    public void setRemoteVideoView(String str, TUIRoomDefine.VideoStreamType videoStreamType, TXCloudVideoView tXCloudVideoView) {
        if (!checkPipeline()) {
            return;
        }
        nativeSetRemoteVideoView(this.mNativeTUIRoomEngineJni, str, videoStreamType.getValue(), tXCloudVideoView);
    }

    public void setRoomMetadataByAdmin(HashMap<String, String> map, TUIRoomDefine.ActionCallback actionCallback) {
        if (checkPipeline(actionCallback)) {
            try {
                nativeSetRoomMetadataByAdmin(this.mNativeTUIRoomEngineJni, new JSONObject(map).toString(), new ActionCallback(actionCallback));
            } catch (NullPointerException unused) {
                LiteavLog.m76083e(TAG, "setRoomMetadataByAdmin error:");
                actionCallback.onError(TUICommonDefine.Error.FAILED, "the requested key cannot be empty");
            }
        }
    }

    public void setVideoResolutionMode(TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.ResolutionMode resolutionMode) {
        if (!checkPipeline()) {
            return;
        }
        nativeSetVideoResolutionMode(this.mNativeTUIRoomEngineJni, videoStreamType.getValue(), resolutionMode.getValue());
    }

    public void startPlayRemoteVideo(String str, TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.PlayCallback playCallback) {
        if (!checkPipeline(str, playCallback)) {
            return;
        }
        nativeStartPlayRemoteVideo(this.mNativeTUIRoomEngineJni, str, videoStreamType.getValue(), new PlayCallback(playCallback));
    }

    public void startPushLocalVideo() {
        if (!checkPipeline()) {
            return;
        }
        nativeStartPushLocalVideo(this.mNativeTUIRoomEngineJni);
    }

    public void startScreenSharing() {
        if (!checkPipeline()) {
            return;
        }
        nativeStartScreenSharing(this.mNativeTUIRoomEngineJni);
    }

    public void stopPlayRemoteVideo(String str, TUIRoomDefine.VideoStreamType videoStreamType) {
        if (!checkPipeline()) {
            return;
        }
        nativeStopPlayRemoteVideo(this.mNativeTUIRoomEngineJni, str, videoStreamType.getValue());
    }

    public void stopPushLocalVideo() {
        if (!checkPipeline()) {
            return;
        }
        nativeStopPushLocalVideo(this.mNativeTUIRoomEngineJni);
    }

    public void stopScreenSharing() {
        if (!checkPipeline()) {
            return;
        }
        nativeStopScreenSharing(this.mNativeTUIRoomEngineJni);
    }

    public void unmuteLocalAudio(TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeUnmuteLocalAudio(this.mNativeTUIRoomEngineJni, new ActionCallback(actionCallback));
    }

    public void updateAudioQuality(TUIRoomDefine.AudioQuality audioQuality) {
        if (!checkPipeline()) {
            return;
        }
        nativeUpdateAudioQuality(this.mNativeTUIRoomEngineJni, audioQuality.getValue());
    }

    public void updateRoomNameByAdmin(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeUpdateRoomNameByAdmin(this.mNativeTUIRoomEngineJni, str, new ActionCallback(actionCallback));
    }

    public void updateRoomPasswordByAdmin(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeUpdateRoomPasswordByAdmin(this.mNativeTUIRoomEngineJni, str, new ActionCallback(actionCallback));
    }

    public void updateRoomSeatModeByAdmin(TUIRoomDefine.SeatMode seatMode, TUIRoomDefine.ActionCallback actionCallback) {
        if (!checkPipeline(actionCallback)) {
            return;
        }
        nativeUpdateRoomSeatModeByAdmin(this.mNativeTUIRoomEngineJni, seatMode.getValue(), new ActionCallback(actionCallback));
    }

    public void updateVideoQuality(TUIRoomDefine.VideoQuality videoQuality) {
        if (!checkPipeline()) {
            return;
        }
        nativeUpdateVideoQuality(this.mNativeTUIRoomEngineJni, videoQuality.getValue());
    }

    public void updateVideoQualityEx(TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.RoomVideoEncoderParams roomVideoEncoderParams) {
        if (!checkPipeline()) {
            return;
        }
        nativeUpdateVideoQualityEx(this.mNativeTUIRoomEngineJni, videoStreamType.getValue(), new VideoEncoderParams(roomVideoEncoderParams));
    }

    private boolean checkPipeline(TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (getRoomInfoCallback == null) {
            return false;
        }
        getRoomInfoCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    public TUIRoomDefine.Request takeSeat(int i11, int i12, String str, TUIRoomDefine.RequestCompletion requestCompletion) {
        if (!checkPipeline(requestCompletion)) {
            return new TUIRoomDefine.Request();
        }
        return nativeTakeSeat(this.mNativeTUIRoomEngineJni, i11, i12, str, new RequestCallback(requestCompletion));
    }

    public TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, String str2, TUIRoomDefine.RequestCompletion requestCompletion) {
        if (!checkPipeline(requestCompletion)) {
            return new TUIRoomDefine.Request();
        }
        return nativeTakeUserOnSeatByAdmin(this.mNativeTUIRoomEngineJni, i11, str, i12, str2, new RequestCallback(requestCompletion));
    }

    private boolean checkPipeline(TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (getRoomMetadataCallback == null) {
            return false;
        }
        getRoomMetadataCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.RequestListCallback requestListCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (requestListCallback == null) {
            return false;
        }
        requestListCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.GetUserInfoCallback getUserInfoCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (getUserInfoCallback == null) {
            return false;
        }
        getUserInfoCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.GetUserListCallback getUserListCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (getUserListCallback == null) {
            return false;
        }
        getUserListCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.GetSeatListCallback getSeatListCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (getSeatListCallback == null) {
            return false;
        }
        getSeatListCallback.onError(TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.RequestCallback requestCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (requestCallback == null) {
            return false;
        }
        requestCallback.onError("", "", TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(TUIRoomDefine.RequestCompletion requestCompletion) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (requestCompletion == null) {
            return false;
        }
        requestCompletion.onError("", new TUIRoomDefine.UserInfo(), TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }

    private boolean checkPipeline(String str, TUIRoomDefine.PlayCallback playCallback) {
        if (this.mNativeTUIRoomEngineJni != 0) {
            return true;
        }
        if (playCallback == null) {
            return false;
        }
        playCallback.onPlayError(str, TUICommonDefine.Error.FAILED, "roomEngine is destroyed");
        return false;
    }
}
