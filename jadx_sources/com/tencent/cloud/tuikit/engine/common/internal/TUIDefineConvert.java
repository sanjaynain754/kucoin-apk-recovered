package com.tencent.cloud.tuikit.engine.common.internal;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUIDefineConvert {
    private static final String TAG = "TUIDefineConvert";

    public static TUIRoomDefine.RoomInfo convertJSONToRoomInfo(JSONObject jSONObject) {
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        try {
            roomInfo.roomId = jSONObject.getString("roomId");
            roomInfo.ownerId = jSONObject.getString(TUIConstantDefine.OWNER_ID);
            roomInfo.ownerName = jSONObject.getString(TUIConstantDefine.OWNER_NAME);
            roomInfo.ownerAvatarUrl = jSONObject.getString(TUIConstantDefine.OWNER_AVATAR_URL);
            roomInfo.roomType = TUIRoomDefine.RoomType.fromInt(jSONObject.getInt(TUIConstantDefine.ROOM_TYPE));
            roomInfo.name = jSONObject.getString("roomName");
            roomInfo.isCameraDisableForAllUser = jSONObject.getBoolean(TUIConstantDefine.CAMERA_DISABLE);
            roomInfo.isMicrophoneDisableForAllUser = jSONObject.getBoolean(TUIConstantDefine.MICROPHONE_DISABLE);
            roomInfo.isScreenShareDisableForAllUser = jSONObject.getBoolean(TUIConstantDefine.SCREEN_SHARE_DISABLE);
            roomInfo.isMessageDisableForAllUser = jSONObject.getBoolean(TUIConstantDefine.MESSAGE_DISABLE);
            roomInfo.isSeatEnabled = jSONObject.getBoolean(TUIConstantDefine.IS_SEAT_ENABLE);
            roomInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(jSONObject.getInt(TUIConstantDefine.SEAT_MODE));
            roomInfo.maxSeatCount = jSONObject.getInt(TUIConstantDefine.MAX_SEAT_COUNT);
            roomInfo.password = jSONObject.optString("password");
            roomInfo.createTime = jSONObject.getLong(TUIConstantDefine.CREATE_TIME) * 1000;
            roomInfo.memberCount = jSONObject.getInt(TUIConstantDefine.MEMBER_COUNT);
            return roomInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertJSONToRoomInfo error:" + e11.getMessage());
            return roomInfo;
        }
    }

    public static TUIRoomDefine.UserInfo convertJSONToUserInfo(JSONObject jSONObject) {
        TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
        try {
            userInfo.userId = jSONObject.getString("userId");
            userInfo.userName = jSONObject.getString(TUIConstantDefine.USER_NAME);
            userInfo.nameCard = jSONObject.getString(TUIConstantDefine.NAME_CARD);
            userInfo.avatarUrl = jSONObject.getString(TUIConstantDefine.AVATAR_URL);
            userInfo.userRole = TUIRoomDefine.Role.fromInt(jSONObject.getInt(TUIConstantDefine.USER_ROLE));
            userInfo.hasAudioStream = jSONObject.getBoolean(TUIConstantDefine.HAS_AUDIO_STREAM);
            userInfo.hasVideoStream = jSONObject.getBoolean(TUIConstantDefine.HAS_VIDEO_STREAM);
            userInfo.hasScreenStream = jSONObject.getBoolean(TUIConstantDefine.HAS_SCREEN_STREAM);
            userInfo.isMessageDisabled = jSONObject.getBoolean(TUIConstantDefine.IS_MESSAGE_DISABLED);
            return userInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertJSONToUserInfo error:" + e11.getMessage());
            return userInfo;
        }
    }

    public static TUIRoomDefine.RoomInfo convertStringToRoomInfo(String str) {
        try {
            return convertJSONToRoomInfo(new JSONObject(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertStringToRoomInfo error:" + e11.getMessage());
            return new TUIRoomDefine.RoomInfo();
        }
    }

    public static TUIRoomDefine.UserInfo convertStringToUserInfo(String str) {
        try {
            return convertJSONToUserInfo(new JSONObject(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertStringToUserInfo error:" + e11.getMessage());
            return new TUIRoomDefine.UserInfo();
        }
    }
}
