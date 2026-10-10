package com.tencent.cloud.tuikit.engine.impl.utils;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class ParamsParse {
    private static final String TAG = "ParamsParse";

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.tencent.cloud.tuikit.engine.common.TUICommonDefine$RoomId] */
    public static <T> T getParamFromJSONArray(JSONArray jSONArray, int i11, Class<T> cls) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > i11) {
                    if (cls == String.class) {
                        return (T) jSONArray.getString(i11);
                    }
                    if (cls == Integer.class) {
                        return (T) Integer.valueOf(jSONArray.getInt(i11));
                    }
                    if (cls == Boolean.class) {
                        return (T) Boolean.valueOf(jSONArray.getBoolean(i11));
                    }
                    if (cls == JSONObject.class) {
                        return (T) jSONArray.getJSONObject(i11);
                    }
                    if (cls == JSONArray.class) {
                        return (T) jSONArray.getJSONArray(i11);
                    }
                    if (cls == TUICallDefine.MediaType.class) {
                        return (T) TUICallDefine.MediaType.fromInt(jSONArray.getInt(i11));
                    }
                    if (cls == TUICallDefine.Role.class) {
                        return (T) TUICallDefine.Role.fromInt(jSONArray.getInt(i11));
                    }
                    if (cls == TUICallDefine.CallEndReason.class) {
                        return (T) TUICallDefine.CallEndReason.fromInt(jSONArray.getInt(i11));
                    }
                    if (cls != TUICommonDefine.RoomId.class) {
                        return null;
                    }
                    ?? r11 = (T) new TUICommonDefine.RoomId();
                    r11.intRoomId = jSONArray.getInt(i11);
                    r11.strRoomId = jSONArray.getString(i11 + 1);
                    return r11;
                }
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "getParamFromJSONArray json parse fail error" + e11);
            }
        }
        return null;
    }

    public static TUICallDefine.CallRecords getRecordFromJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            LiteavLog.m76093w(TAG, "getRecordFromJSONObject: input jsonObject is null");
            return null;
        }
        try {
            TUICallDefine.CallRecords callRecords = new TUICallDefine.CallRecords();
            callRecords.callId = jSONObject.optString("call_id");
            callRecords.inviter = jSONObject.optString("inviter");
            callRecords.groupId = jSONObject.optString("chat_group_id");
            JSONArray jSONArray = new JSONArray(jSONObject.optString("invitee_list", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
            callRecords.inviteList = arrayList;
            callRecords.scene = TUICallDefine.Scene.fromInt(jSONObject.optInt(TUIConstants.Message.CALLING_TYPE_KEY));
            callRecords.role = TUICallDefine.Role.fromInt(jSONObject.optInt("call_role"));
            callRecords.mediaType = TUICallDefine.MediaType.fromInt(jSONObject.optInt("media_type"));
            callRecords.beginTime = jSONObject.optLong("start_time");
            long jOptLong = jSONObject.optLong(C33675gh.f70010p);
            long jOptLong2 = jSONObject.optLong("accept_time");
            callRecords.totalTime = jOptLong2 > 0 ? Math.max(0L, (jOptLong - jOptLong2) / 1000) : 0L;
            callRecords.result = TUICallDefine.CallRecords.Result.fromInt(jSONObject.optInt("call_result"));
            return callRecords;
        } catch (Exception e11) {
            LiteavLog.m76083e(TAG, "parseSingleRecord error: " + e11.getMessage());
            return null;
        }
    }

    public static <T> List<T> JSONArrayToList(JSONArray jSONArray, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                T tCast = null;
                if (cls == String.class) {
                    try {
                        tCast = cls.cast(jSONArray.getString(i11));
                    } catch (JSONException e11) {
                        LiteavLog.m76083e(TAG, "JSONArrayToList, error: " + e11 + " jsonArray: " + jSONArray);
                    }
                } else if (cls == Integer.class) {
                    tCast = cls.cast(Integer.valueOf(jSONArray.getInt(i11)));
                } else if (cls == Double.class) {
                    tCast = cls.cast(Double.valueOf(jSONArray.getDouble(i11)));
                } else {
                    LiteavLog.m76083e(TAG, "JSONArrayToList, Unsupported type: " + cls.getName());
                }
                arrayList.add(tCast);
            }
        }
        return arrayList;
    }

    public static <T> Map<String, T> JSONObjectToMap(JSONObject jSONObject, Class<T> cls) {
        T tCast;
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (cls == String.class) {
                    try {
                        tCast = cls.cast(jSONObject.getString(next));
                    } catch (JSONException e11) {
                        LiteavLog.m76083e(TAG, "JSONObjectToMap, error: " + e11 + " jsonObject: " + jSONObject);
                    }
                } else if (cls == Integer.class) {
                    tCast = cls.cast(Integer.valueOf(jSONObject.getInt(next)));
                } else if (cls == Double.class) {
                    tCast = cls.cast(Double.valueOf(jSONObject.getDouble(next)));
                } else {
                    LiteavLog.m76083e(TAG, "JSONObjectToMap, Unsupported type: " + cls.getName());
                    tCast = null;
                }
                map.put(next, tCast);
            }
        }
        return map;
    }

    public static JSONArray StringToJSONArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "StringToJSONArray failed, error: " + e11);
            return null;
        }
    }

    public static JSONObject callParamsToJsonObject(TUICallDefine.CallParams callParams) {
        JSONObject jSONObject = new JSONObject();
        if (callParams == null) {
            LiteavLog.m76093w(TAG, "callParams is null, return empty JSONObject");
            return jSONObject;
        }
        try {
            TUICommonDefine.RoomId roomId = callParams.roomId;
            if (roomId != null) {
                jSONObject.put("room_id", roomIdToJsonObject(roomId));
            }
            jSONObject.put("timeout", callParams.timeout);
            jSONObject.put("is_ephemeral_call", callParams.isEphemeralCall);
            jSONObject.put(TrafficInfoTable.COLUMN_USERDATA, callParams.userData);
            if (callParams.offlinePushInfo != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("title", callParams.offlinePushInfo.getTitle());
                jSONObject2.put("desc", callParams.offlinePushInfo.getDesc());
                jSONObject2.put("ignore_ios_badge", callParams.offlinePushInfo.isIgnoreIOSBadge());
                jSONObject2.put("enable_ios_background_notification", callParams.offlinePushInfo.enableIOSBackgroundNotification);
                jSONObject2.put("ios_interruption_level", callParams.offlinePushInfo.iOSInterruptionLevel);
                jSONObject2.put("ios_image", callParams.offlinePushInfo.iOSImage);
                jSONObject2.put("ios_sound", callParams.offlinePushInfo.getIOSSound());
                jSONObject2.put("android_sound", callParams.offlinePushInfo.getAndroidSound());
                jSONObject2.put("android_oppo_channel_id", callParams.offlinePushInfo.getAndroidOPPOChannelID());
                jSONObject2.put("oppo_category", callParams.offlinePushInfo.OPPOCategory);
                jSONObject2.put("oppo_notify_level", callParams.offlinePushInfo.OPPONotifyLevel);
                jSONObject2.put("android_fcm_channel_id", callParams.offlinePushInfo.getAndroidFCMChannelID());
                jSONObject2.put("fcm_image", callParams.offlinePushInfo.fcmImage);
                jSONObject2.put("android_xiaomi_channel_id", callParams.offlinePushInfo.getAndroidXiaoMiChannelID());
                jSONObject2.put("android_vivo_classification", callParams.offlinePushInfo.getAndroidVIVOClassification());
                jSONObject2.put("vivo_category", callParams.offlinePushInfo.VIVOCategory);
                jSONObject2.put("android_huawei_category", callParams.offlinePushInfo.getAndroidHuaWeiCategory());
                jSONObject2.put("huawei_image", callParams.offlinePushInfo.huaweiImage);
                jSONObject2.put("honor_importance", callParams.offlinePushInfo.honorImportance);
                jSONObject2.put("honor_image", callParams.offlinePushInfo.honorImage);
                jSONObject2.put("is_disable_push", callParams.offlinePushInfo.isDisablePush());
                jSONObject2.put("ios_push_type", callParams.offlinePushInfo.getIOSPushType() != null ? callParams.offlinePushInfo.getIOSPushType().getValue() : TUICallDefine.IOSOfflinePushType.APNs.getValue());
                jSONObject2.put("extension", callParams.offlinePushInfo.extraInfo);
                jSONObject.put("offline_push_info", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "callParamsToJsonString failed, error: " + e11);
            return new JSONObject();
        }
    }

    public static List<TUICallDefine.CallRecords> getCallRecordsFromJSONArray(JSONArray jSONArray) {
        TUICallDefine.CallRecords recordFromJSONObject;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            LiteavLog.m76093w(TAG, "parseCallRecords: invalid JSON format");
            return arrayList;
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && (recordFromJSONObject = getRecordFromJSONObject(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(recordFromJSONObject);
                }
            } catch (Exception e11) {
                LiteavLog.m76094w(TAG, "parseCallRecords error at index " + i11, e11);
            }
        }
        LiteavLog.m76087i(TAG, "parseCallRecords: successfully parsed " + arrayList.size() + " records");
        return arrayList;
    }

    public static List<TUICommonDefine.NetworkQualityInfo> getQualityInfoListFromJSONArray(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    TUICommonDefine.NetworkQualityInfo networkQualityInfo = new TUICommonDefine.NetworkQualityInfo();
                    networkQualityInfo.userId = jSONObject.getString("user_id");
                    networkQualityInfo.quality = TUICommonDefine.NetworkQuality.values()[jSONObject.getInt(C33757kf.f70665k)];
                    arrayList.add(networkQualityInfo);
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TAG, "getQualityInfoList failed, error: " + e11);
                }
            }
        }
        return arrayList;
    }

    public static HashMap<String, byte[]> getRoomCustomInfoFromJSONObject(JSONObject jSONObject) {
        HashMap<String, byte[]> map = new HashMap<>();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next).getBytes());
            }
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "getRoomCustomInfo failed, error: " + e11);
        }
        return map;
    }

    public static TUIRoomDefine.RoomCustomMessage getRoomCustomMessageFromJSONObject(JSONObject jSONObject) {
        TUIRoomDefine.RoomCustomMessage roomCustomMessage = new TUIRoomDefine.RoomCustomMessage();
        if (jSONObject != null) {
            try {
                roomCustomMessage.roomId = jSONObject.getString("roomId");
                roomCustomMessage.sender = getUserInfoFromJSONObject(jSONObject.getJSONObject(TUIConstants.TUICalling.SENDER));
                roomCustomMessage.sequence = jSONObject.getLong(JPushConstants.Operation.KEY_SEQUENCE);
                roomCustomMessage.timestampInSecond = jSONObject.getLong("timestampInSecond");
                roomCustomMessage.businessId = jSONObject.getString("businessId");
                roomCustomMessage.data = jSONObject.getString("data");
                return roomCustomMessage;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "getRoomCustomMessageFromJSONObject failed, error: " + e11);
            }
        }
        return roomCustomMessage;
    }

    public static TUIRoomDefine.RoomTextMessage getRoomTextMessageFromJSONObject(JSONObject jSONObject) {
        TUIRoomDefine.RoomTextMessage roomTextMessage = new TUIRoomDefine.RoomTextMessage();
        if (jSONObject != null) {
            try {
                roomTextMessage.roomId = jSONObject.getString("roomId");
                roomTextMessage.sender = getUserInfoFromJSONObject(jSONObject.getJSONObject(TUIConstants.TUICalling.SENDER));
                roomTextMessage.sequence = jSONObject.getLong(JPushConstants.Operation.KEY_SEQUENCE);
                roomTextMessage.timestampInSecond = jSONObject.getLong("timestampInSecond");
                roomTextMessage.textContent = jSONObject.getString("textContent");
                roomTextMessage.extensionInfo = JSONObjectToMap(jSONObject.getJSONObject("extensionInfo"), String.class);
                return roomTextMessage;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "getRoomTextMessageFromJSONObject failed, error: " + e11);
            }
        }
        return roomTextMessage;
    }

    public static TUIRoomDefine.SeatFullInfo getSeatFullInfoFromJSONObject(JSONObject jSONObject) {
        TUIRoomDefine.SeatFullInfo seatFullInfo = new TUIRoomDefine.SeatFullInfo();
        if (jSONObject != null) {
            try {
                seatFullInfo.roomId = jSONObject.getString("roomId");
                seatFullInfo.seatIndex = jSONObject.getInt("index");
                seatFullInfo.isSeatLocked = jSONObject.getBoolean("isLocked");
                seatFullInfo.userId = jSONObject.getString("userId");
                seatFullInfo.userName = jSONObject.getString(TUIConstantDefine.USER_NAME);
                seatFullInfo.userAvatar = jSONObject.getString(TUIConstantDefine.AVATAR_URL);
                seatFullInfo.userMicrophoneStatus = TUIRoomDefine.DeviceStatus.fromInt(jSONObject.getInt("userMicrophoneStatus"));
                seatFullInfo.userCameraStatus = TUIRoomDefine.DeviceStatus.fromInt(jSONObject.getInt("userCameraStatus"));
                seatFullInfo.userSuspendStatus = TUIRoomDefine.SuspendStatus.fromInt(jSONObject.getInt("userSuspendStatus"));
                seatFullInfo.f73243x = jSONObject.getInt("x");
                seatFullInfo.f73244y = jSONObject.getInt("y");
                seatFullInfo.width = jSONObject.getInt("width");
                seatFullInfo.height = jSONObject.getInt("height");
                seatFullInfo.zorder = jSONObject.getInt("zorder");
                return seatFullInfo;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "parse getSeatFullInfoFromJSONObject failed, error: " + e11);
            }
        }
        return seatFullInfo;
    }

    public static List<TUIRoomDefine.SeatFullInfo> getSeatListFromJSONArray(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    if (jSONObject != null) {
                        arrayList.add(getSeatFullInfoFromJSONObject(jSONObject));
                    }
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TAG, "parse getSeatListFromJSONArray failed, error: " + e11);
                }
            }
        }
        return arrayList;
    }

    public static TUIRoomDefine.UserInfo getUserInfoFromJSONObject(JSONObject jSONObject) {
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
            userInfo.roomCustomInfo = getRoomCustomInfoFromJSONObject(jSONObject.getJSONObject("roomCustomInfo"));
            return userInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "getUserInfoFromJSONObject failed, error: " + e11);
            return userInfo;
        }
    }

    public static List<TUIRoomDefine.UserInfo> getUserInfoListFromJSONArray(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    arrayList.add(getUserInfoFromJSONObject(jSONArray.getJSONObject(i11)));
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TAG, "getUserInfoListFromJSONArray failed, error: " + e11);
                }
            }
        }
        return arrayList;
    }

    public static TUIRoomDefine.UserSearchResult getUserSearchResultFromJSONArray(JSONObject jSONObject) {
        TUIRoomDefine.UserSearchResult userSearchResult = new TUIRoomDefine.UserSearchResult();
        userSearchResult.cursor = "";
        userSearchResult.userInfoList = new ArrayList();
        if (jSONObject != null) {
            try {
                userSearchResult.cursor = jSONObject.getString(InterfaceC33953u5.f72198E);
                JSONArray jSONArray = jSONObject.getJSONArray("user_info_list");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    userSearchResult.userInfoList.add(getUserInfoFromJSONObject(jSONArray.getJSONObject(i11)));
                }
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "getUserSearchResultFromJSONArray failed, error: " + e11);
            }
        }
        return userSearchResult;
    }

    public static JSONObject roomIdToJsonObject(TUICommonDefine.RoomId roomId) {
        JSONObject jSONObject = new JSONObject();
        if (roomId == null) {
            LiteavLog.m76093w(TAG, "roomId is null, return empty JSONObject");
            return jSONObject;
        }
        try {
            jSONObject.put("int_room_id", roomId.intRoomId);
            jSONObject.put("str_room_id", roomId.strRoomId);
            return jSONObject;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "callParamsToJsonString failed, error: " + e11);
            return new JSONObject();
        }
    }
}
