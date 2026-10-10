package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUIConferenceListManager {

    public enum ConferenceCancelReason {
        CANCELLED_BY_ADMIN(0),
        REMOVED_FROM_ATTENDEES(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ConferenceCancelReason(int i11) {
            this.mValue = i11;
        }

        public static ConferenceCancelReason fromInt(int i11) {
            for (ConferenceCancelReason conferenceCancelReason : values()) {
                if (conferenceCancelReason.mValue == i11) {
                    return conferenceCancelReason;
                }
            }
            return CANCELLED_BY_ADMIN;
        }
    }

    public static class ConferenceInfo {
        public TUIRoomDefine.RoomInfo basicRoomInfo;
        public int reminderSecondsBeforeStart;
        public long scheduleEndTime;
        public long scheduleStartTime;
        public List<String> scheduleAttendees = new ArrayList();
        public ConferenceStatus status = ConferenceStatus.NONE;
    }

    public enum ConferenceModifyFlag {
        NONE(0),
        ROOM_NAME(1),
        SCHEDULE_START_TIME(65536),
        SCHEDULE_END_TIME(131072);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ConferenceModifyFlag(int i11) {
            this.mValue = i11;
        }

        public static ConferenceModifyFlag fromInt(int i11) {
            for (ConferenceModifyFlag conferenceModifyFlag : values()) {
                if (conferenceModifyFlag.mValue == i11) {
                    return conferenceModifyFlag;
                }
            }
            return NONE;
        }
    }

    public enum ConferenceStatus {
        NONE(0),
        NOT_STARTED(1),
        RUNNING(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ConferenceStatus(int i11) {
            this.mValue = i11;
        }

        public static ConferenceStatus fromInt(int i11) {
            for (ConferenceStatus conferenceStatus : values()) {
                if (conferenceStatus.mValue == i11) {
                    return conferenceStatus;
                }
            }
            return NONE;
        }
    }

    public interface FetchConferenceInfoCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(ConferenceInfo conferenceInfo);
    }

    public interface FetchScheduledAttendeesCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(ScheduledAttendeesResult scheduledAttendeesResult);
    }

    public interface FetchScheduledConferenceListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(ScheduledConferenceListResult scheduledConferenceListResult);
    }

    public static class ScheduledAttendeesResult {
        public String cursor;
        public List<TUIRoomDefine.UserInfo> scheduleAttendees;
        public int totalAttendeeCount;
    }

    public static class ScheduledConferenceListResult {
        public List<ConferenceInfo> conferenceInfoList;
        public String cursor;
    }

    public abstract void addAttendeesByAdmin(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void addObserver(Observer observer);

    public abstract void cancelConference(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void fetchAttendeeList(String str, String str2, int i11, FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback);

    public abstract void fetchConferenceInfo(String str, FetchConferenceInfoCallback fetchConferenceInfoCallback);

    public abstract void fetchScheduledConferenceList(List<ConferenceStatus> list, String str, int i11, FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback);

    public abstract void removeAttendeesByAdmin(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void scheduleConference(ConferenceInfo conferenceInfo, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void transferConferenceOwner(String str, String str2, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void updateConferenceInfo(ConferenceInfo conferenceInfo, List<ConferenceModifyFlag> list, TUIRoomDefine.ActionCallback actionCallback);

    public static abstract class Observer {
        public void onConferenceScheduled(ConferenceInfo conferenceInfo) {
        }

        public void onConferenceWillStart(ConferenceInfo conferenceInfo) {
        }

        public void onConferenceInfoChanged(ConferenceInfo conferenceInfo, List<ConferenceModifyFlag> list) {
        }

        @Deprecated
        public void onConferenceStatusChanged(String str, ConferenceStatus conferenceStatus) {
        }

        public void onConferenceStatusUpdated(ConferenceInfo conferenceInfo, ConferenceStatus conferenceStatus) {
        }

        @Deprecated
        public void onConferenceCancelled(String str, ConferenceCancelReason conferenceCancelReason, TUIRoomDefine.UserInfo userInfo) {
        }

        public void onConferenceDidCancelled(ConferenceInfo conferenceInfo, ConferenceCancelReason conferenceCancelReason, TUIRoomDefine.UserInfo userInfo) {
        }

        public void onConferenceOwnerChanged(ConferenceInfo conferenceInfo, TUIRoomDefine.UserInfo userInfo, TUIRoomDefine.UserInfo userInfo2) {
        }

        @Deprecated
        public void onScheduleAttendeesChanged(String str, List<TUIRoomDefine.UserInfo> list, List<TUIRoomDefine.UserInfo> list2) {
        }

        public void onScheduleAttendeesUpdated(ConferenceInfo conferenceInfo, List<TUIRoomDefine.UserInfo> list, List<TUIRoomDefine.UserInfo> list2) {
        }
    }
}
