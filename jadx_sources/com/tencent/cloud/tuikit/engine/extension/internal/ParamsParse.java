package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class ParamsParse {
    private static final String TAG = "ParamsParse";

    public static TUILiveListManager.LiveInfo JsonToLiveInfo(JSONObject jSONObject) {
        TUILiveListManager.LiveInfo liveInfo = new TUILiveListManager.LiveInfo();
        try {
            liveInfo.roomId = jSONObject.getString("roomId");
            liveInfo.name = jSONObject.getString("name");
            liveInfo.notice = jSONObject.getString(TUIConstants.TUIChat.NOTICE);
            liveInfo.isMessageDisableForAllUser = jSONObject.getBoolean("isMessageDisableForAllUser");
            liveInfo.isPublicVisible = jSONObject.getBoolean("isPublicVisible");
            liveInfo.isSeatEnabled = jSONObject.getBoolean(TUIConstantDefine.IS_SEAT_ENABLE);
            liveInfo.keepOwnerOnSeat = jSONObject.getBoolean("keepOwnerOnSeat");
            liveInfo.maxSeatCount = jSONObject.getInt(TUIConstantDefine.MAX_SEAT_COUNT);
            liveInfo.seatLayoutTemplateId = jSONObject.getInt("seatLayoutTemplateId");
            liveInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(jSONObject.getInt(TUIConstantDefine.SEAT_MODE));
            liveInfo.coverUrl = jSONObject.getString("coverUrl");
            liveInfo.backgroundUrl = jSONObject.getString("backgroundUrl");
            JSONArray jSONArray = jSONObject.getJSONArray("categoryList");
            liveInfo.categoryList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                liveInfo.categoryList.add(Integer.valueOf(jSONArray.getInt(i11)));
            }
            liveInfo.activityStatus = jSONObject.getInt("activityStatus");
            liveInfo.ownerId = jSONObject.getString("roomOwner");
            liveInfo.ownerName = jSONObject.getString(TUIConstantDefine.OWNER_NAME);
            liveInfo.ownerAvatarUrl = jSONObject.getString(TUIConstantDefine.OWNER_AVATAR_URL);
            liveInfo.createTime = jSONObject.getLong(TUIConstantDefine.CREATE_TIME);
            liveInfo.viewCount = jSONObject.getInt("totalViewers");
            TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
            roomInfo.roomId = liveInfo.roomId;
            roomInfo.ownerId = liveInfo.ownerId;
            roomInfo.ownerName = liveInfo.ownerName;
            roomInfo.ownerAvatarUrl = liveInfo.ownerAvatarUrl;
            roomInfo.roomType = TUIRoomDefine.RoomType.LIVE;
            roomInfo.name = liveInfo.name;
            roomInfo.isMessageDisableForAllUser = liveInfo.isMessageDisableForAllUser;
            roomInfo.isSeatEnabled = liveInfo.isSeatEnabled;
            roomInfo.seatMode = liveInfo.seatMode;
            roomInfo.maxSeatCount = liveInfo.maxSeatCount;
            roomInfo.keepOwnerOnSeat = liveInfo.keepOwnerOnSeat;
            roomInfo.createTime = liveInfo.createTime;
            liveInfo.roomInfo = roomInfo;
            return liveInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "parse JsonToLiveInfo failed, error: " + e11);
            return liveInfo;
        }
    }

    public static TUILiveListManager.LiveStatisticsData JsonToLiveStatisticsData(JSONObject jSONObject) {
        TUILiveListManager.LiveStatisticsData liveStatisticsData = new TUILiveListManager.LiveStatisticsData();
        try {
            liveStatisticsData.totalViewers = jSONObject.getInt("totalViewers");
            liveStatisticsData.totalGiftsSent = jSONObject.getInt("totalGiftsSent");
            liveStatisticsData.totalGiftCoins = jSONObject.getInt("totalGiftCoins");
            liveStatisticsData.totalUniqueGiftSenders = jSONObject.getInt("totalUniqueGiftSenders");
            liveStatisticsData.totalLikesReceived = jSONObject.getInt("totalLikesReceived");
            liveStatisticsData.totalMessageCount = jSONObject.getInt("totalMessageCount");
            liveStatisticsData.liveDuration = jSONObject.getInt("liveDuration");
            return liveStatisticsData;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "parse JsonToLiveStatisticsData failed, error: " + e11);
            return liveStatisticsData;
        }
    }

    public static JSONObject liveInfoToJson(TUILiveListManager.LiveInfo liveInfo) {
        JSONObject jSONObject = new JSONObject();
        if (liveInfo != null) {
            try {
                jSONObject.put("roomId", liveInfo.roomId);
                jSONObject.put("name", liveInfo.name);
                jSONObject.put(TUIConstants.TUIChat.NOTICE, liveInfo.notice);
                jSONObject.put("isMessageDisableForAllUser", liveInfo.isMessageDisableForAllUser);
                jSONObject.put("isPublicVisible", liveInfo.isPublicVisible);
                jSONObject.put(TUIConstantDefine.IS_SEAT_ENABLE, liveInfo.isSeatEnabled);
                jSONObject.put("keepOwnerOnSeat", liveInfo.keepOwnerOnSeat);
                jSONObject.put(TUIConstantDefine.MAX_SEAT_COUNT, liveInfo.maxSeatCount);
                jSONObject.put("seatLayoutTemplateId", liveInfo.seatLayoutTemplateId);
                TUIRoomDefine.SeatMode seatMode = liveInfo.seatMode;
                if (seatMode != null) {
                    jSONObject.put(TUIConstantDefine.SEAT_MODE, seatMode.getValue());
                }
                jSONObject.put("coverUrl", liveInfo.coverUrl);
                jSONObject.put("backgroundUrl", liveInfo.backgroundUrl);
                JSONArray jSONArray = new JSONArray();
                if (liveInfo.categoryList != null) {
                    for (int i11 = 0; i11 < liveInfo.categoryList.size(); i11++) {
                        jSONArray.put(liveInfo.categoryList.get(i11));
                    }
                }
                jSONObject.put("categoryList", jSONArray);
                jSONObject.put("activityStatus", liveInfo.activityStatus);
                jSONObject.put("roomOwner", liveInfo.ownerId);
                jSONObject.put(TUIConstantDefine.OWNER_NAME, liveInfo.ownerName);
                jSONObject.put(TUIConstantDefine.OWNER_AVATAR_URL, liveInfo.ownerAvatarUrl);
                jSONObject.put(TUIConstantDefine.CREATE_TIME, liveInfo.createTime);
                jSONObject.put("totalViewers", liveInfo.viewCount);
                return jSONObject;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "parse liveInfoToJson failed, error: " + e11);
            }
        }
        return jSONObject;
    }
}
