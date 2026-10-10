package com.tencent.cloud.tuikit.engine.room;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.extension.TUIRoomDeviceManager;
import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import com.tencent.trtc.TRTCCloud;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUIRoomEngine extends DeprecatedRoomEngineAPI {
    public static void setSelfInfo(String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        TUIRoomEngineImpl.setSelfInfo(str, str2, actionCallback);
    }

    public abstract void addCategoryTagForUsers(int i11, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void addObserver(TUIRoomObserver tUIRoomObserver);

    public abstract TUIRoomDefine.Request applyToAdminToOpenLocalDevice(TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback);

    public abstract Object callExperimentalAPI(String str, TUIRoomDefine.ExperimentalAPIResponseCallback experimentalAPIResponseCallback);

    public abstract void cancelRequest(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void changeUserNameCard(String str, String str2, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void changeUserRole(String str, TUIRoomDefine.Role role, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void closeLocalCamera();

    public abstract void closeLocalMicrophone();

    public abstract void closeRemoteDeviceByAdmin(String str, TUIRoomDefine.MediaDevice mediaDevice, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void createRoom(TUIRoomDefine.RoomInfo roomInfo, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void destroyRoom(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void disableDeviceForAllUserByAdmin(TUIRoomDefine.MediaDevice mediaDevice, boolean z11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void disableSendingMessageByAdmin(String str, boolean z11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void disableSendingMessageForAllUser(boolean z11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void enableGravitySensor(boolean z11);

    public abstract void enableSystemAudioSharing(boolean z11);

    public abstract void enterRoom(String str, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback);

    public abstract void enterRoom(String str, TUIRoomDefine.RoomType roomType, TUIRoomDefine.EnterRoomOptions enterRoomOptions, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback);

    public abstract void enterRoom(String str, TUIRoomDefine.RoomType roomType, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback);

    public abstract void exitRoom(boolean z11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void fetchRoomInfo(TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback);

    public abstract void fetchRoomInfo(String str, TUIRoomDefine.RoomType roomType, TUIRoomDefine.GetRoomInfoCallback getRoomInfoCallback);

    public abstract void getBannedUserList(TUIRoomDefine.GetUserListCallback getUserListCallback);

    public abstract Object getExtension(TUICommonDefine.ExtensionType extensionType);

    public abstract TUILiveBattleManager getLiveBattleManager();

    public abstract TUILiveConnectionManager getLiveConnectionManager();

    public abstract TUIRoomDeviceManager getMediaDeviceManager();

    public abstract void getRoomMetadata(List<String> list, TUIRoomDefine.GetRoomMetadataCallback getRoomMetadataCallback);

    public abstract void getSeatApplicationList(TUIRoomDefine.RequestListCallback requestListCallback);

    public abstract void getSeatList(TUIRoomDefine.GetSeatListCallback getSeatListCallback);

    public abstract TUISongListManager getSongListManager();

    public abstract TRTCCloud getTRTCCloud();

    public abstract void getUserInfo(String str, TUIRoomDefine.GetUserInfoCallback getUserInfoCallback);

    public abstract void getUserList(long j11, TUIRoomDefine.GetUserListCallback getUserListCallback);

    public abstract void getUserListByTag(int i11, long j11, TUIRoomDefine.GetUserListCallback getUserListCallback);

    public abstract void kickRemoteUserOutOfRoom(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void kickUserOffSeatByAdmin(int i11, String str, String str2, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void leaveSeat(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void lockSeatByAdmin(int i11, TUIRoomDefine.SeatLockParams seatLockParams, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void moveToSeat(int i11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void moveUserToSeatByAdmin(String str, int i11, TUIRoomDefine.MoveSeatPolicy moveSeatPolicy, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void muteLocalAudio();

    public abstract void muteRemoteAudioStream(String str, boolean z11);

    public abstract void openLocalCamera(boolean z11, TUIRoomDefine.VideoQuality videoQuality, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void openLocalMicrophone(TUIRoomDefine.AudioQuality audioQuality, TUIRoomDefine.ActionCallback actionCallback);

    public abstract TUIRoomDefine.Request openRemoteDeviceByAdmin(String str, TUIRoomDefine.MediaDevice mediaDevice, int i11, TUIRoomDefine.RequestCallback requestCallback);

    public abstract List<TUIRoomDefine.SeatFullInfo> querySeatList();

    public abstract void removeCategoryTagForUsers(int i11, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(TUIRoomObserver tUIRoomObserver);

    public abstract void responseRemoteRequest(String str, boolean z11, String str2, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void searchUsers(TUIRoomDefine.UserSearchParam userSearchParam, TUIRoomDefine.UserSearchCallback userSearchCallback);

    public abstract void sendCustomMessage(TUIRoomDefine.RoomCustomMessage roomCustomMessage, TUIRoomDefine.SendCustomMessageCallback sendCustomMessageCallback);

    public abstract void sendTextMessage(TUIRoomDefine.RoomTextMessage roomTextMessage, TUIRoomDefine.SendTextMessageCallback sendTextMessageCallback);

    public abstract void setBeautyLevel(int i11, float f11);

    public abstract void setCustomInfoForUser(String str, HashMap<String, byte[]> map, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void setLocalVideoMuteImage(Bitmap bitmap);

    public abstract void setLocalVideoView(TUIVideoView tUIVideoView);

    public abstract void setRemoteVideoView(String str, TUIRoomDefine.VideoStreamType videoStreamType, TUIVideoView tUIVideoView);

    public abstract void setRoomMetadataByAdmin(HashMap<String, String> map, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void setVideoResolutionMode(TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.ResolutionMode resolutionMode);

    public abstract void setWhitenessLevel(float f11);

    public abstract void startPlayRemoteVideo(String str, TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.PlayCallback playCallback);

    public abstract void startPushLocalVideo();

    public abstract void startScreenSharing();

    public abstract void stopPlayRemoteVideo(String str, TUIRoomDefine.VideoStreamType videoStreamType);

    public abstract void stopPushLocalVideo();

    public abstract void stopScreenSharing();

    public abstract TUIRoomDefine.Request takeSeat(int i11, int i12, String str, TUIRoomDefine.RequestCompletion requestCompletion);

    public abstract TUIRoomDefine.Request takeUserOnSeatByAdmin(int i11, String str, int i12, String str2, TUIRoomDefine.RequestCompletion requestCompletion);

    public abstract void unmuteLocalAudio(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void updateAudioQuality(TUIRoomDefine.AudioQuality audioQuality);

    public abstract void updateRoomNameByAdmin(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void updateRoomPasswordByAdmin(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void updateRoomSeatModeByAdmin(TUIRoomDefine.SeatMode seatMode, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void updateVideoQuality(TUIRoomDefine.VideoQuality videoQuality);

    public abstract void updateVideoQualityEx(TUIRoomDefine.VideoStreamType videoStreamType, TUIRoomDefine.RoomVideoEncoderParams roomVideoEncoderParams);

    public static void setSelfInfo(TUIRoomDefine.LoginUserInfo loginUserInfo, TUIRoomDefine.ActionCallback actionCallback) {
        TUIRoomEngineImpl.setSelfInfo(loginUserInfo, actionCallback);
    }

    public static void destroySharedInstance() {
        TUIRoomEngineImpl.destroySharedInstance();
    }

    public static TUIRoomDefine.LoginUserInfo getSelfInfo() {
        return TUIRoomEngineImpl.getSelfInfo();
    }

    public static void login(Context context, int i11, String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        TUIRoomEngineImpl.login(context, i11, str, str2, actionCallback);
    }

    public static void logout(TUIRoomDefine.ActionCallback actionCallback) {
        TUIRoomEngineImpl.logout(actionCallback);
    }

    public static TUIRoomEngine sharedInstance() {
        return TUIRoomEngineImpl.sharedInstance();
    }
}
