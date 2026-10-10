package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUIConferenceInvitationManager {

    public interface GetInvitationListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(InvitationListResult invitationListResult);
    }

    public static class Invitation {
        public TUIRoomDefine.UserInfo invitee;
        public TUIRoomDefine.UserInfo inviter;
        public InvitationStatus status = InvitationStatus.NONE;
    }

    public enum InvitationCode {
        SUCCESS(0),
        ALREADY_IN_INVITATION_LIST(1),
        ALREADY_IN_CONFERENCE(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        InvitationCode(int i11) {
            this.mValue = i11;
        }

        public static InvitationCode fromInt(int i11) {
            for (InvitationCode invitationCode : values()) {
                if (invitationCode.mValue == i11) {
                    return invitationCode;
                }
            }
            return SUCCESS;
        }
    }

    public static class InvitationListResult {
        public String cursor;
        public List<Invitation> invitationList;
    }

    public enum InvitationStatus {
        NONE(0),
        PENDING(1),
        TIMEOUT(2),
        ACCEPTED(3),
        REJECTED(4);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        InvitationStatus(int i11) {
            this.mValue = i11;
        }

        public static InvitationStatus fromInt(int i11) {
            for (InvitationStatus invitationStatus : values()) {
                if (invitationStatus.mValue == i11) {
                    return invitationStatus;
                }
            }
            return NONE;
        }
    }

    public interface InviteUsersCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(Map<String, InvitationCode> map);
    }

    public enum RejectedReason {
        REJECT_TO_ENTER(0),
        IN_OTHER_CONFERENCE(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        RejectedReason(int i11) {
            this.mValue = i11;
        }

        public static RejectedReason fromInt(int i11) {
            for (RejectedReason rejectedReason : values()) {
                if (rejectedReason.mValue == i11) {
                    return rejectedReason;
                }
            }
            return REJECT_TO_ENTER;
        }
    }

    public abstract void accept(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void addObserver(Observer observer);

    public abstract void cancelInvitation(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void getInvitationList(String str, String str2, int i11, GetInvitationListCallback getInvitationListCallback);

    public abstract void inviteUsers(String str, List<String> list, int i11, String str2, InviteUsersCallback inviteUsersCallback);

    public abstract void reject(String str, RejectedReason rejectedReason, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public static abstract class Observer {
        public void onInvitationAccepted(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation) {
        }

        public void onInvitationAdded(String str, Invitation invitation) {
        }

        public void onInvitationCancelled(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation) {
        }

        public void onInvitationHandledByOtherDevice(TUIRoomDefine.RoomInfo roomInfo, boolean z11) {
        }

        public void onInvitationRemoved(String str, Invitation invitation) {
        }

        public void onInvitationStatusChanged(String str, Invitation invitation) {
        }

        public void onInvitationTimeout(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation) {
        }

        public void onInvitationRejected(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation, RejectedReason rejectedReason) {
        }

        public void onInvitationRevokedByAdmin(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation, TUIRoomDefine.UserInfo userInfo) {
        }

        public void onReceiveInvitation(TUIRoomDefine.RoomInfo roomInfo, Invitation invitation, String str) {
        }
    }
}
