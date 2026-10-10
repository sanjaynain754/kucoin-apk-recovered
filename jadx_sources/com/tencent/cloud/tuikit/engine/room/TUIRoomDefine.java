package com.tencent.cloud.tuikit.engine.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class TUIRoomDefine {

    public interface ActionCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess();
    }

    public enum AudioQuality {
        SPEECH(0),
        DEFAULT(1),
        MUSIC(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        AudioQuality(int i11) {
            this.mValue = i11;
        }

        public static AudioQuality fromInt(int i11) {
            for (AudioQuality audioQuality : values()) {
                if (audioQuality.mValue == i11) {
                    return audioQuality;
                }
            }
            return DEFAULT;
        }
    }

    public enum ChangeReason {
        BY_SELF(0),
        BY_ADMIN(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ChangeReason(int i11) {
            this.mValue = i11;
        }

        public static ChangeReason fromInt(int i11) {
            for (ChangeReason changeReason : values()) {
                if (changeReason.mValue == i11) {
                    return changeReason;
                }
            }
            return BY_SELF;
        }
    }

    public enum DeviceStatus {
        OPENED(0),
        CLOSED_BY_SELF(1),
        CLOSED_BY_ADMIN(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        DeviceStatus(int i11) {
            this.mValue = i11;
        }

        public static DeviceStatus fromInt(int i11) {
            for (DeviceStatus deviceStatus : values()) {
                if (deviceStatus.mValue == i11) {
                    return deviceStatus;
                }
            }
            return OPENED;
        }
    }

    public static class EnterRoomOptions {
        public String password;
    }

    public interface ExperimentalAPIResponseCallback {
        void onResponse(String str);
    }

    public interface GetRoomInfoCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(RoomInfo roomInfo);
    }

    public interface GetRoomMetadataCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(HashMap<String, String> map);
    }

    public interface GetSeatListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(List<SeatInfo> list);
    }

    public interface GetUserInfoCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(UserInfo userInfo);
    }

    public interface GetUserListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(UserListResult userListResult);
    }

    public enum KickedOutOfRoomReason {
        BY_ADMIN(0),
        BY_LOGGED_ON_OTHER_DEVICE(1),
        BY_SERVER(2),
        NETWORK_DISCONNECTED(3),
        JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE(4),
        COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT(5);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        KickedOutOfRoomReason(int i11) {
            this.mValue = i11;
        }

        public static KickedOutOfRoomReason fromInt(int i11) {
            for (KickedOutOfRoomReason kickedOutOfRoomReason : values()) {
                if (kickedOutOfRoomReason.mValue == i11) {
                    return kickedOutOfRoomReason;
                }
            }
            return BY_ADMIN;
        }
    }

    public static class LoginUserInfo {
        public String avatarUrl;

        @Deprecated
        public HashMap<String, byte[]> customInfo;
        public int level;
        public String userId;
        public String userName;
    }

    public enum MediaDevice {
        MICROPHONE(1),
        CAMERA(2),
        SCREEN_SHARING(3);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        MediaDevice(int i11) {
            this.mValue = i11;
        }

        public static MediaDevice fromInt(int i11) {
            for (MediaDevice mediaDevice : values()) {
                if (mediaDevice.mValue == i11) {
                    return mediaDevice;
                }
            }
            return MICROPHONE;
        }
    }

    public enum MoveSeatPolicy {
        ABORT_WHEN_OCCUPIED(0),
        FORCE_REPLACE(1),
        SWAP_POSITION(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        MoveSeatPolicy(int i11) {
            this.mValue = i11;
        }

        public static MoveSeatPolicy fromInt(int i11) {
            for (MoveSeatPolicy moveSeatPolicy : values()) {
                if (moveSeatPolicy.mValue == i11) {
                    return moveSeatPolicy;
                }
            }
            return ABORT_WHEN_OCCUPIED;
        }
    }

    public interface PlayCallback {
        void onLoading(String str);

        void onPlayError(String str, TUICommonDefine.Error error, String str2);

        void onPlaying(String str);
    }

    public static class Request {

        @Deprecated
        public String avatarUrl;
        public String content;
        public String extensionInfo;
        public UserInfo fromUser;

        @Deprecated
        public String nameCard;
        public RequestAction requestAction;
        public String requestId;
        public long timestamp;
        public UserInfo toUser;

        @Deprecated
        public String userId;

        @Deprecated
        public String userName;
    }

    public enum RequestAction {
        INVALID_ACTION(0),
        REQUEST_TO_OPEN_REMOTE_CAMERA(1),
        REQUEST_TO_OPEN_REMOTE_MICROPHONE(2),
        REQUEST_TO_TAKE_SEAT(4),
        REQUEST_REMOTE_USER_ON_SEAT(5),
        REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_CAMERA(6),
        REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_MICROPHONE(7),
        REQUEST_APPLY_TO_ADMIN_TO_OPEN_LOCAL_SCREEN_SHARE(8),
        REQUEST_TO_CLOSE_REMOTE_CAMERA(9),
        REQUEST_TO_CLOSE_REMOTE_MICROPHONE(10),
        REQUEST_TO_CLOSE_REMOTE_SCREEN_SHARE(11);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        RequestAction(int i11) {
            this.mValue = i11;
        }

        public static RequestAction fromInt(int i11) {
            for (RequestAction requestAction : values()) {
                if (requestAction.mValue == i11) {
                    return requestAction;
                }
            }
            return INVALID_ACTION;
        }
    }

    public interface RequestCallback {
        void onAccepted(String str, String str2);

        void onCancelled(String str, String str2);

        void onError(String str, String str2, TUICommonDefine.Error error, String str3);

        void onRejected(String str, String str2, String str3);

        void onTimeout(String str, String str2);
    }

    public interface RequestCompletion {
        void onAccepted(String str, UserInfo userInfo, String str2);

        void onCancelled(String str, UserInfo userInfo);

        void onError(String str, UserInfo userInfo, TUICommonDefine.Error error, String str2);

        void onRejected(String str, UserInfo userInfo, String str2, String str3);

        void onSuccess(String str, UserInfo userInfo);

        void onTimeout(String str, UserInfo userInfo);
    }

    public interface RequestListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(List<Request> list);
    }

    public enum ResolutionMode {
        LANDSCAPE(0),
        PORTRAIT(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ResolutionMode(int i11) {
            this.mValue = i11;
        }

        public static ResolutionMode fromInt(int i11) {
            for (ResolutionMode resolutionMode : values()) {
                if (resolutionMode.mValue == i11) {
                    return resolutionMode;
                }
            }
            return PORTRAIT;
        }
    }

    public enum Role {
        ROOM_OWNER(0),
        MANAGER(1),
        GENERAL_USER(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        Role(int i11) {
            this.mValue = i11;
        }

        public static Role fromInt(int i11) {
            for (Role role : values()) {
                if (role.mValue == i11) {
                    return role;
                }
            }
            return GENERAL_USER;
        }
    }

    public static class RoomCustomMessage {
        public String businessId;
        public String data;
        public String roomId;
        public UserInfo sender;
        public long sequence;
        public long timestampInSecond;
    }

    public enum RoomDismissedReason {
        BY_OWNER(1),
        BY_SERVER(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        RoomDismissedReason(int i11) {
            this.mValue = i11;
        }

        public static RoomDismissedReason fromInt(int i11) {
            for (RoomDismissedReason roomDismissedReason : values()) {
                if (roomDismissedReason.mValue == i11) {
                    return roomDismissedReason;
                }
            }
            return BY_OWNER;
        }
    }

    public static class RoomInfo {
        public long createTime;
        public int maxSeatCount;
        public int memberCount;
        public String name;
        public String ownerAvatarUrl;
        public String ownerId;
        public String ownerName;
        public String password;
        public String roomId;
        public RoomType roomType = RoomType.CONFERENCE;
        public boolean isCameraDisableForAllUser = false;
        public boolean isMicrophoneDisableForAllUser = false;
        public boolean isScreenShareDisableForAllUser = false;
        public boolean isMessageDisableForAllUser = false;
        public boolean isSeatEnabled = false;
        public SeatMode seatMode = SeatMode.FREE_TO_TAKE;
        public boolean keepOwnerOnSeat = false;
    }

    public static class RoomTextMessage {
        public Map<String, String> extensionInfo;
        public String roomId;
        public UserInfo sender;
        public long sequence;
        public String textContent;
        public long timestampInSecond;
    }

    public enum RoomType {
        CONFERENCE(1),
        LIVE(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        RoomType(int i11) {
            this.mValue = i11;
        }

        public static RoomType fromInt(int i11) {
            for (RoomType roomType : values()) {
                if (roomType.mValue == i11) {
                    return roomType;
                }
            }
            return CONFERENCE;
        }
    }

    public static class RoomVideoEncoderParams {
        public int bitrate;
        public int fps;
        public ResolutionMode resolutionMode;
        public VideoQuality videoResolution;
    }

    public static class SeatFullInfo {
        public int height;
        public boolean isSeatLocked;
        public String roomId;
        public int seatIndex;
        public String userAvatar;
        public DeviceStatus userCameraStatus;
        public String userId;
        public DeviceStatus userMicrophoneStatus;
        public String userName;
        public SuspendStatus userSuspendStatus;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f73243x;

        /* JADX INFO: renamed from: y */
        public int f73244y;
        public int zorder;
    }

    public static class SeatInfo {
        public String avatarUrl;
        public int index;
        public boolean isAudioLocked;
        public boolean isLocked;
        public boolean isVideoLocked;
        public String nameCard;
        public String roomId;
        public String userId;
        public String userName;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class SeatLockFlag {
        private static final /* synthetic */ SeatLockFlag[] $VALUES;
        public static final SeatLockFlag ALL;
        public static final SeatLockFlag AUDIO;
        public static final SeatLockFlag NONE;
        public static final SeatLockFlag SEAT;
        public static final SeatLockFlag VIDEO;
        int mValue;

        static {
            SeatLockFlag seatLockFlag = new SeatLockFlag("NONE", 0, 0);
            NONE = seatLockFlag;
            SeatLockFlag seatLockFlag2 = new SeatLockFlag("SEAT", 1, 1);
            SEAT = seatLockFlag2;
            SeatLockFlag seatLockFlag3 = new SeatLockFlag("VIDEO", 2, 2);
            VIDEO = seatLockFlag3;
            SeatLockFlag seatLockFlag4 = new SeatLockFlag("AUDIO", 3, 4);
            AUDIO = seatLockFlag4;
            SeatLockFlag seatLockFlag5 = new SeatLockFlag("ALL", 4, seatLockFlag2.mValue | seatLockFlag3.mValue | seatLockFlag4.mValue);
            ALL = seatLockFlag5;
            $VALUES = new SeatLockFlag[]{seatLockFlag, seatLockFlag2, seatLockFlag3, seatLockFlag4, seatLockFlag5};
        }

        public static SeatLockFlag valueOf(String str) {
            return (SeatLockFlag) Enum.valueOf(SeatLockFlag.class, str);
        }

        public static SeatLockFlag[] values() {
            return (SeatLockFlag[]) $VALUES.clone();
        }

        public int getValue() {
            return this.mValue;
        }

        public void setValue(int i11) {
            this.mValue = i11;
        }

        private SeatLockFlag(String str, int i11, int i12) {
            super(str, i11);
            this.mValue = i12;
        }
    }

    public static class SeatLockParams {
        public boolean lockSeat = false;
        public boolean lockVideo = false;
        public boolean lockAudio = false;
        public SeatLockFlag lockFlag = SeatLockFlag.ALL;
    }

    public enum SeatMode {
        FREE_TO_TAKE(1),
        APPLY_TO_TAKE(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        SeatMode(int i11) {
            this.mValue = i11;
        }

        public static SeatMode fromInt(int i11) {
            for (SeatMode seatMode : values()) {
                if (seatMode.mValue == i11) {
                    return seatMode;
                }
            }
            return FREE_TO_TAKE;
        }
    }

    public interface SendCustomMessageCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(RoomCustomMessage roomCustomMessage);
    }

    public interface SendTextMessageCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(RoomTextMessage roomTextMessage);
    }

    public enum SuspendStatus {
        NONE(0),
        IN_BACKGROUND(1),
        IN_CALLING(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        SuspendStatus(int i11) {
            this.mValue = i11;
        }

        public static SuspendStatus fromInt(int i11) {
            for (SuspendStatus suspendStatus : values()) {
                if (suspendStatus.mValue == i11) {
                    return suspendStatus;
                }
            }
            return NONE;
        }
    }

    public static class UserInfo {
        public String avatarUrl;
        public boolean hasAudioStream;
        public boolean hasScreenStream;
        public boolean hasVideoStream;
        public boolean isMessageDisabled;
        public int level;
        public String nameCard;
        public HashMap<String, byte[]> roomCustomInfo;
        public String userId;
        public String userName;
        public Role userRole;
    }

    public enum UserInfoModifyFlag {
        NONE(0),
        USER_ROLE(1),
        NAME_CARD(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        UserInfoModifyFlag(int i11) {
            this.mValue = i11;
        }

        public static UserInfoModifyFlag fromInt(int i11) {
            for (UserInfoModifyFlag userInfoModifyFlag : values()) {
                if (userInfoModifyFlag.mValue == i11) {
                    return userInfoModifyFlag;
                }
            }
            return NONE;
        }
    }

    public static class UserListResult {
        public long nextSequence;
        public List<UserInfo> userInfoList;
    }

    public interface UserSearchCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(UserSearchResult userSearchResult);
    }

    public static class UserSearchParam {
        public String cursor;
        public String keyword;
    }

    public static class UserSearchResult {
        public String cursor;
        public List<UserInfo> userInfoList;
    }

    public static class UserVoiceVolume {
        public String userId;
        public int volume;
    }

    public enum VideoQuality {
        Q_360P(1),
        Q_540P(2),
        Q_720P(3),
        Q_1080P(4);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        VideoQuality(int i11) {
            this.mValue = i11;
        }

        public static VideoQuality fromInt(int i11) {
            for (VideoQuality videoQuality : values()) {
                if (videoQuality.mValue == i11) {
                    return videoQuality;
                }
            }
            return Q_720P;
        }
    }

    public enum VideoStreamType {
        CAMERA_STREAM(0),
        SCREEN_STREAM(1),
        CAMERA_STREAM_LOW(2);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        VideoStreamType(int i11) {
            this.mValue = i11;
        }

        public static VideoStreamType fromInt(int i11) {
            for (VideoStreamType videoStreamType : values()) {
                if (videoStreamType.mValue == i11) {
                    return videoStreamType;
                }
            }
            return CAMERA_STREAM;
        }
    }
}
