package com.tencent.cloud.tuikit.engine.extension.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class SongListParamsParse {
    private static final String TAG = "SongListParamsParse";

    public static TUISongListManager.SongInfo jsonToSongInfo(JSONObject jSONObject) {
        TUISongListManager.SongInfo songInfo = new TUISongListManager.SongInfo();
        if (jSONObject != null) {
            try {
                songInfo.songId = jSONObject.optString("songId", "");
                songInfo.songName = jSONObject.optString("songName", "");
                songInfo.artistName = jSONObject.optString("artistName", "");
                songInfo.duration = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
                songInfo.coverUrl = jSONObject.optString("coverUrl", "");
                songInfo.requester = jsonToUserInfo(jSONObject.optJSONObject("requester"));
                return songInfo;
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "parse jsonToSongInfo failed, error: " + e11);
            }
        }
        return songInfo;
    }

    public static TUISongListManager.SongListResult jsonToSongListResult(JSONObject jSONObject) {
        TUISongListManager.SongListResult songListResult = new TUISongListManager.SongListResult();
        if (jSONObject != null) {
            try {
                songListResult.cursor = jSONObject.optString(InterfaceC33953u5.f72198E, "");
                songListResult.totalCount = jSONObject.optInt("totalCount", 0);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("songList");
                songListResult.songList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        songListResult.songList.add(jsonToSongInfo(jSONArrayOptJSONArray.getJSONObject(i11)));
                    }
                }
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "parse jsonToSongListResult failed, error: " + e11);
            }
        }
        return songListResult;
    }

    public static TUIRoomDefine.UserInfo jsonToUserInfo(JSONObject jSONObject) {
        TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
        if (jSONObject != null) {
            try {
                userInfo.userId = jSONObject.optString("userId", "");
                userInfo.userName = jSONObject.optString(TUIConstantDefine.USER_NAME, "");
                userInfo.avatarUrl = jSONObject.optString(TUIConstantDefine.AVATAR_URL, "");
                return userInfo;
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "parse jsonToUserInfo failed, error: " + e11);
            }
        }
        return userInfo;
    }

    public static JSONObject songInfoToJson(TUISongListManager.SongInfo songInfo) {
        JSONObject jSONObject = new JSONObject();
        if (songInfo != null) {
            try {
                String str = songInfo.songId;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("SongId", str);
                String str2 = songInfo.songName;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("SongName", str2);
                String str3 = songInfo.artistName;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("ArtistName", str3);
                jSONObject.put("Duration", songInfo.duration);
                String str4 = songInfo.coverUrl;
                jSONObject.put("CoverUrl", str4 != null ? str4 : "");
                jSONObject.put("Requester", userInfoToJson(songInfo.requester));
                return jSONObject;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "parse songInfoToJson failed, error: " + e11);
            }
        }
        return jSONObject;
    }

    public static JSONArray songListToJsonArray(List<TUISongListManager.SongInfo> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                Iterator<TUISongListManager.SongInfo> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(songInfoToJson(it.next()));
                }
            } catch (Exception e11) {
                LiteavLog.m76083e(TAG, "parse songListToJsonArray failed, error: " + e11);
            }
        }
        return jSONArray;
    }

    public static JSONArray stringListToJsonArray(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (String str : list) {
                if (str == null) {
                    str = "";
                }
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }

    public static JSONObject userInfoToJson(TUIRoomDefine.UserInfo userInfo) {
        JSONObject jSONObject = new JSONObject();
        if (userInfo != null) {
            try {
                String str = userInfo.userId;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("UserId", str);
                String str2 = userInfo.userName;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("UserName", str2);
                String str3 = userInfo.avatarUrl;
                jSONObject.put("AvatarUrl", str3 != null ? str3 : "");
                return jSONObject;
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, "parse userInfoToJson failed, error: " + e11);
            }
        }
        return jSONObject;
    }
}
