package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class TUIConferenceListManagerJni {
    private static final String TAG = "TUIConferenceListManagerJni";
    private long mNativeTUIConferenceListManagerJni;
    private final List<TUIConferenceListManager.Observer> mObserverList = new CopyOnWriteArrayList();

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

    public static class FetchConferenceInfoCallback {
        private TUIConferenceListManager.FetchConferenceInfoCallback mCallback;

        @CalledByNative("FetchConferenceInfoCallback")
        public void onError(int i11, String str) {
            TUIConferenceListManager.FetchConferenceInfoCallback fetchConferenceInfoCallback = this.mCallback;
            if (fetchConferenceInfoCallback != null) {
                fetchConferenceInfoCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("FetchConferenceInfoCallback")
        public void onSuccess(String str) {
            if (this.mCallback != null) {
                try {
                    this.mCallback.onSuccess(TUIConferenceListManagerJni.convertJSONToConferenceInfo(new JSONObject(str)));
                } catch (Exception e11) {
                    LiteavLog.m76083e(TUIConferenceListManagerJni.TAG, "FetchConferenceInfoCallback onSuccess failed, error: " + e11);
                }
            }
        }

        public FetchConferenceInfoCallback(TUIConferenceListManager.FetchConferenceInfoCallback fetchConferenceInfoCallback) {
            this.mCallback = fetchConferenceInfoCallback;
        }
    }

    public static class FetchScheduledAttendeesCallback {
        private TUIConferenceListManager.FetchScheduledAttendeesCallback mCallback;

        @CalledByNative("FetchScheduledAttendeesCallback")
        public void onError(int i11, String str) {
            TUIConferenceListManager.FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback = this.mCallback;
            if (fetchScheduledAttendeesCallback != null) {
                fetchScheduledAttendeesCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("FetchScheduledAttendeesCallback")
        public void onSuccess(TUIConferenceListManager.ScheduledAttendeesResult scheduledAttendeesResult) {
            TUIConferenceListManager.FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback = this.mCallback;
            if (fetchScheduledAttendeesCallback != null) {
                fetchScheduledAttendeesCallback.onSuccess(scheduledAttendeesResult);
            }
        }

        public FetchScheduledAttendeesCallback(TUIConferenceListManager.FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback) {
            this.mCallback = fetchScheduledAttendeesCallback;
        }
    }

    public static class FetchScheduledConferenceListCallback {
        private TUIConferenceListManager.FetchScheduledConferenceListCallback mCallback;

        @CalledByNative("FetchScheduledConferenceListCallback")
        public void onError(int i11, String str) {
            TUIConferenceListManager.FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback = this.mCallback;
            if (fetchScheduledConferenceListCallback != null) {
                fetchScheduledConferenceListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("FetchScheduledConferenceListCallback")
        public void onSuccess(TUIConferenceListManager.ScheduledConferenceListResult scheduledConferenceListResult) {
            TUIConferenceListManager.FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback = this.mCallback;
            if (fetchScheduledConferenceListCallback != null) {
                fetchScheduledConferenceListCallback.onSuccess(scheduledConferenceListResult);
            }
        }

        public FetchScheduledConferenceListCallback(TUIConferenceListManager.FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback) {
            this.mCallback = fetchScheduledConferenceListCallback;
        }
    }

    private static native void nativeAddAttendeesByAdmin(long j11, String str, String[] strArr, ActionCallback actionCallback);

    private static native void nativeCancelConference(long j11, String str, ActionCallback actionCallback);

    private static native void nativeFetchAttendeeList(long j11, String str, String str2, int i11, FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback);

    private static native void nativeFetchConferenceInfo(long j11, String str, FetchConferenceInfoCallback fetchConferenceInfoCallback);

    private static native void nativeFetchScheduledConferenceList(long j11, int i11, String str, int i12, FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback);

    private static native void nativeRemoveAttendeesByAdmin(long j11, String str, String[] strArr, ActionCallback actionCallback);

    private static native void nativeScheduleConference(long j11, String str, ActionCallback actionCallback);

    private static native void nativeSetObserver(long j11, Object obj);

    private static native void nativeTransferConferenceOwner(long j11, String str, String str2, ActionCallback actionCallback);

    private static native void nativeUpdateConferenceInfo(long j11, String str, int i11, ActionCallback actionCallback);

    private static JSONObject convertConferenceInfoToJSON(TUIConferenceListManager.ConferenceInfo conferenceInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TUIConstantDefine.SCHEDULE_START_TIME, conferenceInfo.scheduleStartTime / 1000);
        jSONObject.put(TUIConstantDefine.SCHEDULE_END_TIME, conferenceInfo.scheduleEndTime / 1000);
        jSONObject.put(TUIConstantDefine.REMINDER_SECONDS_BEFORE_START, conferenceInfo.reminderSecondsBeforeStart);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = conferenceInfo.scheduleAttendees.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(TUIConstantDefine.SCHEDULE_ATTENDEES, jSONArray);
        if (conferenceInfo.basicRoomInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("roomId", conferenceInfo.basicRoomInfo.roomId);
            jSONObject2.put(TUIConstantDefine.OWNER_ID, conferenceInfo.basicRoomInfo.ownerId);
            jSONObject2.put(TUIConstantDefine.OWNER_NAME, conferenceInfo.basicRoomInfo.ownerName);
            jSONObject2.put(TUIConstantDefine.OWNER_AVATAR_URL, conferenceInfo.basicRoomInfo.ownerAvatarUrl);
            jSONObject2.put(TUIConstantDefine.ROOM_TYPE, conferenceInfo.basicRoomInfo.roomType.getValue());
            jSONObject2.put("roomName", conferenceInfo.basicRoomInfo.name);
            jSONObject2.put(TUIConstantDefine.CAMERA_DISABLE, conferenceInfo.basicRoomInfo.isCameraDisableForAllUser);
            jSONObject2.put(TUIConstantDefine.MICROPHONE_DISABLE, conferenceInfo.basicRoomInfo.isMicrophoneDisableForAllUser);
            jSONObject2.put(TUIConstantDefine.SCREEN_SHARE_DISABLE, conferenceInfo.basicRoomInfo.isScreenShareDisableForAllUser);
            jSONObject2.put(TUIConstantDefine.MESSAGE_DISABLE, conferenceInfo.basicRoomInfo.isMessageDisableForAllUser);
            jSONObject2.put(TUIConstantDefine.IS_SEAT_ENABLE, conferenceInfo.basicRoomInfo.isSeatEnabled);
            jSONObject2.put(TUIConstantDefine.SEAT_MODE, conferenceInfo.basicRoomInfo.seatMode.getValue());
            jSONObject2.put(TUIConstantDefine.MAX_SEAT_COUNT, conferenceInfo.basicRoomInfo.maxSeatCount);
            jSONObject2.put("password", conferenceInfo.basicRoomInfo.password);
            jSONObject2.put(TUIConstantDefine.CREATE_TIME, conferenceInfo.basicRoomInfo.createTime);
            jSONObject2.put(TUIConstantDefine.MEMBER_COUNT, conferenceInfo.basicRoomInfo.memberCount);
            jSONObject.put(TUIConstantDefine.BASIC_ROOM_INFO, jSONObject2);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TUIConferenceListManager.ConferenceInfo convertJSONToConferenceInfo(JSONObject jSONObject) throws JSONException {
        TUIConferenceListManager.ConferenceInfo conferenceInfo = new TUIConferenceListManager.ConferenceInfo();
        conferenceInfo.scheduleStartTime = jSONObject.getLong(TUIConstantDefine.SCHEDULE_START_TIME) * 1000;
        conferenceInfo.scheduleEndTime = jSONObject.getLong(TUIConstantDefine.SCHEDULE_END_TIME) * 1000;
        conferenceInfo.reminderSecondsBeforeStart = jSONObject.getInt(TUIConstantDefine.REMINDER_SECONDS_BEFORE_START);
        conferenceInfo.status = TUIConferenceListManager.ConferenceStatus.fromInt(jSONObject.getInt("status"));
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        JSONObject jSONObject2 = jSONObject.getJSONObject(TUIConstantDefine.BASIC_ROOM_INFO);
        roomInfo.roomId = jSONObject2.getString("roomId");
        roomInfo.ownerId = jSONObject2.getString(TUIConstantDefine.OWNER_ID);
        roomInfo.ownerName = jSONObject2.getString(TUIConstantDefine.OWNER_NAME);
        roomInfo.ownerAvatarUrl = jSONObject2.getString(TUIConstantDefine.OWNER_AVATAR_URL);
        roomInfo.roomType = TUIRoomDefine.RoomType.fromInt(jSONObject2.getInt(TUIConstantDefine.ROOM_TYPE));
        roomInfo.name = jSONObject2.getString("roomName");
        roomInfo.isCameraDisableForAllUser = jSONObject2.getBoolean(TUIConstantDefine.CAMERA_DISABLE);
        roomInfo.isMicrophoneDisableForAllUser = jSONObject2.getBoolean(TUIConstantDefine.MICROPHONE_DISABLE);
        roomInfo.isScreenShareDisableForAllUser = jSONObject2.getBoolean(TUIConstantDefine.SCREEN_SHARE_DISABLE);
        roomInfo.isMessageDisableForAllUser = jSONObject2.getBoolean(TUIConstantDefine.MESSAGE_DISABLE);
        roomInfo.isSeatEnabled = jSONObject2.getBoolean(TUIConstantDefine.IS_SEAT_ENABLE);
        roomInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(jSONObject2.getInt(TUIConstantDefine.SEAT_MODE));
        roomInfo.maxSeatCount = jSONObject2.getInt(TUIConstantDefine.MAX_SEAT_COUNT);
        roomInfo.password = jSONObject2.optString("password");
        roomInfo.createTime = jSONObject2.getLong(TUIConstantDefine.CREATE_TIME) * 1000;
        roomInfo.memberCount = jSONObject2.getInt(TUIConstantDefine.MEMBER_COUNT);
        conferenceInfo.basicRoomInfo = roomInfo;
        return conferenceInfo;
    }

    private static List<TUIConferenceListManager.ConferenceInfo> convertJSONToConferenceList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(convertJSONToConferenceInfo(new JSONObject(jSONArray.getString(i11))));
        }
        return arrayList;
    }

    private static List<String> convertJSONToUserIdList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        return arrayList;
    }

    private static TUIRoomDefine.UserInfo convertJSONToUserInfo(JSONObject jSONObject) throws JSONException {
        TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
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
    }

    private static List<TUIRoomDefine.UserInfo> convertJSONToUserInfoList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(convertJSONToUserInfo(new JSONObject(jSONArray.getString(i11))));
        }
        return arrayList;
    }

    private TUIConferenceListManager.ConferenceInfo convertToConferenceInfo(String str) {
        try {
            return convertJSONToConferenceInfo(new JSONObject(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return new TUIConferenceListManager.ConferenceInfo();
        }
    }

    private TUIRoomDefine.UserInfo convertToUserInfo(String str) {
        try {
            return convertJSONToUserInfo(new JSONObject(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return new TUIRoomDefine.UserInfo();
        }
    }

    private List<TUIRoomDefine.UserInfo> convertToUserInfoList(String str) {
        try {
            return convertJSONToUserInfoList(new JSONArray(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return new ArrayList();
        }
    }

    private List<TUIConferenceListManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    @CalledByNative
    public static TUIConferenceListManager.ScheduledAttendeesResult createAttendeesResult(int i11, String str, String str2) {
        TUIConferenceListManager.ScheduledAttendeesResult scheduledAttendeesResult = new TUIConferenceListManager.ScheduledAttendeesResult();
        scheduledAttendeesResult.cursor = str;
        scheduledAttendeesResult.totalAttendeeCount = i11;
        try {
            scheduledAttendeesResult.scheduleAttendees = convertJSONToUserInfoList(new JSONArray(str2));
            return scheduledAttendeesResult;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            scheduledAttendeesResult.scheduleAttendees = new ArrayList();
            return scheduledAttendeesResult;
        }
    }

    @CalledByNative
    public static TUIConferenceListManager.ScheduledConferenceListResult createConferenceListResult(String str, String str2) {
        TUIConferenceListManager.ScheduledConferenceListResult scheduledConferenceListResult = new TUIConferenceListManager.ScheduledConferenceListResult();
        scheduledConferenceListResult.cursor = str;
        try {
            scheduledConferenceListResult.conferenceInfoList = convertJSONToConferenceList(new JSONArray(str2));
            return scheduledConferenceListResult;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            scheduledConferenceListResult.conferenceInfoList = new ArrayList();
            return scheduledConferenceListResult;
        }
    }

    private boolean isConferenceListManagerNull(TUIRoomDefine.ActionCallback actionCallback) {
        if (this.mNativeTUIConferenceListManagerJni != 0) {
            return false;
        }
        if (actionCallback == null) {
            return true;
        }
        actionCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        return true;
    }

    public void addObserver(TUIConferenceListManager.Observer observer) {
        if (observer == null || this.mObserverList.contains(observer)) {
            return;
        }
        this.mObserverList.add(observer);
    }

    public void fetchAttendeeList(String str, String str2, int i11, TUIConferenceListManager.FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback) {
        long j11 = this.mNativeTUIConferenceListManagerJni;
        if (j11 != 0) {
            nativeFetchAttendeeList(j11, str, str2, i11, new FetchScheduledAttendeesCallback(fetchScheduledAttendeesCallback));
        } else if (fetchScheduledAttendeesCallback != null) {
            fetchScheduledAttendeesCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        }
    }

    public void fetchConferenceInfo(String str, TUIConferenceListManager.FetchConferenceInfoCallback fetchConferenceInfoCallback) {
        long j11 = this.mNativeTUIConferenceListManagerJni;
        if (j11 != 0) {
            nativeFetchConferenceInfo(j11, str, new FetchConferenceInfoCallback(fetchConferenceInfoCallback));
        } else if (fetchConferenceInfoCallback != null) {
            fetchConferenceInfoCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        }
    }

    public void fetchScheduledConferenceList(List<TUIConferenceListManager.ConferenceStatus> list, String str, int i11, TUIConferenceListManager.FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback) {
        if (this.mNativeTUIConferenceListManagerJni == 0) {
            if (fetchScheduledConferenceListCallback != null) {
                fetchScheduledConferenceListCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
            }
        } else {
            Iterator<TUIConferenceListManager.ConferenceStatus> it = list.iterator();
            int value = 0;
            while (it.hasNext()) {
                value |= it.next().getValue();
            }
            nativeFetchScheduledConferenceList(this.mNativeTUIConferenceListManagerJni, value, str, i11, new FetchScheduledConferenceListCallback(fetchScheduledConferenceListCallback));
        }
    }

    @CalledByNative
    public void onConferenceInfoChanged(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        TUIConferenceListManager.ConferenceModifyFlag conferenceModifyFlag = TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_START_TIME;
        if ((conferenceModifyFlag.getValue() & i11) != 0) {
            arrayList.add(conferenceModifyFlag);
        }
        TUIConferenceListManager.ConferenceModifyFlag conferenceModifyFlag2 = TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_END_TIME;
        if ((conferenceModifyFlag2.getValue() & i11) != 0) {
            arrayList.add(conferenceModifyFlag2);
        }
        TUIConferenceListManager.ConferenceModifyFlag conferenceModifyFlag3 = TUIConferenceListManager.ConferenceModifyFlag.ROOM_NAME;
        if ((i11 & conferenceModifyFlag3.getValue()) != 0) {
            arrayList.add(conferenceModifyFlag3);
        }
        Iterator<TUIConferenceListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConferenceInfoChanged(convertToConferenceInfo(str), arrayList);
        }
    }

    public void removeObserver(TUIConferenceListManager.Observer observer) {
        if (observer == null) {
            return;
        }
        this.mObserverList.remove(observer);
    }

    public TUIConferenceListManagerJni(long j11) {
        this.mNativeTUIConferenceListManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    public void addAttendeesByAdmin(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (isConferenceListManagerNull(actionCallback)) {
            return;
        }
        nativeAddAttendeesByAdmin(this.mNativeTUIConferenceListManagerJni, str, (String[]) list.toArray(new String[0]), new ActionCallback(actionCallback));
    }

    public void cancelConference(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (isConferenceListManagerNull(actionCallback)) {
            return;
        }
        nativeCancelConference(this.mNativeTUIConferenceListManagerJni, str, new ActionCallback(actionCallback));
    }

    @CalledByNative
    public void onConferenceCancelled(String str, int i11, String str2) {
        TUIConferenceListManager.ConferenceInfo conferenceInfoConvertToConferenceInfo = convertToConferenceInfo(str);
        TUIRoomDefine.UserInfo userInfoConvertToUserInfo = convertToUserInfo(str2);
        TUIConferenceListManager.ConferenceCancelReason conferenceCancelReasonFromInt = TUIConferenceListManager.ConferenceCancelReason.fromInt(i11);
        for (TUIConferenceListManager.Observer observer : copyOnReadListeners()) {
            observer.onConferenceDidCancelled(conferenceInfoConvertToConferenceInfo, conferenceCancelReasonFromInt, userInfoConvertToUserInfo);
            observer.onConferenceCancelled(conferenceInfoConvertToConferenceInfo.basicRoomInfo.roomId, conferenceCancelReasonFromInt, userInfoConvertToUserInfo);
        }
    }

    @CalledByNative
    public void onConferenceOwnerChanged(String str, String str2, String str3) {
        TUIConferenceListManager.ConferenceInfo conferenceInfoConvertToConferenceInfo = convertToConferenceInfo(str);
        TUIRoomDefine.UserInfo userInfoConvertToUserInfo = convertToUserInfo(str2);
        TUIRoomDefine.UserInfo userInfoConvertToUserInfo2 = convertToUserInfo(str3);
        Iterator<TUIConferenceListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConferenceOwnerChanged(conferenceInfoConvertToConferenceInfo, userInfoConvertToUserInfo, userInfoConvertToUserInfo2);
        }
    }

    @CalledByNative
    public void onConferenceScheduled(String str) {
        Iterator<TUIConferenceListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConferenceScheduled(convertToConferenceInfo(str));
        }
    }

    @CalledByNative
    public void onConferenceStatusChanged(String str, int i11) {
        TUIConferenceListManager.ConferenceInfo conferenceInfoConvertToConferenceInfo = convertToConferenceInfo(str);
        TUIConferenceListManager.ConferenceStatus conferenceStatusFromInt = TUIConferenceListManager.ConferenceStatus.fromInt(i11);
        for (TUIConferenceListManager.Observer observer : copyOnReadListeners()) {
            observer.onConferenceStatusUpdated(conferenceInfoConvertToConferenceInfo, conferenceStatusFromInt);
            observer.onConferenceStatusChanged(conferenceInfoConvertToConferenceInfo.basicRoomInfo.roomId, conferenceStatusFromInt);
        }
    }

    @CalledByNative
    public void onConferenceWillStart(String str) {
        Iterator<TUIConferenceListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConferenceWillStart(convertToConferenceInfo(str));
        }
    }

    @CalledByNative
    public void onScheduleAttendeesChanged(String str, String str2, String str3) {
        TUIConferenceListManager.ConferenceInfo conferenceInfoConvertToConferenceInfo = convertToConferenceInfo(str);
        List<TUIRoomDefine.UserInfo> listConvertToUserInfoList = convertToUserInfoList(str2);
        List<TUIRoomDefine.UserInfo> listConvertToUserInfoList2 = convertToUserInfoList(str3);
        for (TUIConferenceListManager.Observer observer : copyOnReadListeners()) {
            observer.onScheduleAttendeesUpdated(conferenceInfoConvertToConferenceInfo, listConvertToUserInfoList, listConvertToUserInfoList2);
            observer.onScheduleAttendeesChanged(conferenceInfoConvertToConferenceInfo.basicRoomInfo.roomId, listConvertToUserInfoList, listConvertToUserInfoList2);
        }
    }

    public void removeAttendeesByAdmin(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (isConferenceListManagerNull(actionCallback)) {
            return;
        }
        nativeRemoveAttendeesByAdmin(this.mNativeTUIConferenceListManagerJni, str, (String[]) list.toArray(new String[0]), new ActionCallback(actionCallback));
    }

    public void scheduleConference(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIRoomDefine.ActionCallback actionCallback) {
        if (!isConferenceListManagerNull(actionCallback)) {
            try {
                nativeScheduleConference(this.mNativeTUIConferenceListManagerJni, convertConferenceInfoToJSON(conferenceInfo).toString(), new ActionCallback(actionCallback));
            } catch (JSONException unused) {
                actionCallback.onError(TUICommonDefine.Error.FAILED, "conferenceInfo convert error");
            }
        }
    }

    public void transferConferenceOwner(String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        if (isConferenceListManagerNull(actionCallback)) {
            return;
        }
        nativeTransferConferenceOwner(this.mNativeTUIConferenceListManagerJni, str, str2, new ActionCallback(actionCallback));
    }

    public void updateConferenceInfo(TUIConferenceListManager.ConferenceInfo conferenceInfo, List<TUIConferenceListManager.ConferenceModifyFlag> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (!isConferenceListManagerNull(actionCallback)) {
            if (list == null) {
                actionCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "modifyFlagList is null");
                return;
            }
            Iterator<TUIConferenceListManager.ConferenceModifyFlag> it = list.iterator();
            int value = 0;
            while (it.hasNext()) {
                value |= it.next().getValue();
            }
            try {
                nativeUpdateConferenceInfo(this.mNativeTUIConferenceListManagerJni, convertConferenceInfoToJSON(conferenceInfo).toString(), value, new ActionCallback(actionCallback));
            } catch (JSONException unused) {
                actionCallback.onError(TUICommonDefine.Error.FAILED, "conferenceInfo convert error");
            }
        }
    }
}
