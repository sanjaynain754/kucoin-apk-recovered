package com.tencent.cloud.tuikit.engine.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes59.dex */
public class TUICallDefine {
    public static int ERROR_INIT_FAIL = -1201;
    public static int ERROR_PACKAGE_NOT_PURCHASED = -1001;
    public static int ERROR_PACKAGE_NOT_SUPPORTED = -1002;
    public static int ERROR_PARAM_INVALID = -1202;
    public static int ERROR_PERMISSION_DENIED = -1101;
    public static int ERROR_REQUEST_REFUSED = -1203;
    public static int ERROR_REQUEST_REPEATED = -1204;
    public static int ERROR_SCENE_NOT_SUPPORTED = -1205;
    public static int ERROR_SIGNALING_SEND_FAIL = -1401;
    public static int ERROR_TIM_VERSION_OUTDATED = -1003;
    public static String VERSION = "0.0.0.0";

    public enum CallEndReason {
        UNKNOWN(0),
        HANGUP(1),
        REJECT(2),
        NO_RESPONSE(3),
        OFFLINE(4),
        LINE_BUSY(5),
        CANCELED(6),
        OTHER_DEVICE_ACCEPTED(7),
        OTHER_DEVICE_REJECT(8),
        END_BY_SERVER(9);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        CallEndReason(int i11) {
            this.mValue = i11;
        }

        public static CallEndReason fromInt(int i11) {
            for (CallEndReason callEndReason : values()) {
                if (callEndReason.mValue == i11) {
                    return callEndReason;
                }
            }
            return UNKNOWN;
        }
    }

    public static class CallObserverExtraInfo {
        public String chatGroupId;
        public boolean isEphemeralCall;
        public Role role;
        public TUICommonDefine.RoomId roomId;
        public String userData;

        public String toString() {
            return "CallObserverExtraInfo{roomId=" + this.roomId + ", role=" + this.role + ", userData=" + this.userData + ", chatGroupId=" + this.chatGroupId + ", isEphemeralCall=" + this.isEphemeralCall + '}';
        }
    }

    public static class CallParams {
        public String chatGroupId;
        public boolean isEphemeralCall;
        public OfflinePushInfo offlinePushInfo;
        public TUICommonDefine.RoomId roomId;
        public int timeout = 30;
        public String userData;

        public String toString() {
            return "CallParams{roomId=" + this.roomId + ", timeout=" + this.timeout + ", userData=" + this.userData + ", isEphemeralCall=" + this.isEphemeralCall + ", chatGroupId=" + this.chatGroupId + ", offlinePushInfo=" + this.offlinePushInfo + '}';
        }
    }

    public static class CallRecords {
        public long beginTime;
        public String callId;
        public String groupId;
        public List<String> inviteList;
        public String inviter;
        public MediaType mediaType;
        public Result result;
        public Role role;
        public Scene scene;
        public long totalTime;

        public enum Result {
            Unknown(0),
            Missed(1),
            Incoming(2),
            Outgoing(3);

            final int mValue;

            public int getValue() {
                return this.mValue;
            }

            Result(int i11) {
                this.mValue = i11;
            }

            public static Result fromInt(int i11) {
                for (Result result : values()) {
                    if (result.mValue == i11) {
                        return result;
                    }
                }
                return Unknown;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.callId, ((CallRecords) obj).callId);
        }

        public String toString() {
            return "CallRecords{callId=" + this.callId + ", inviter=" + this.inviter + ", inviteList=" + this.inviteList + ", groupId=" + this.groupId + ", scene=" + this.scene + ", mediaType=" + this.mediaType + ", role=" + this.role + ", result=" + this.result + ", beginTime=" + this.beginTime + ", totalTime=" + this.totalTime + '}';
        }
    }

    public enum IOSOfflinePushType {
        APNs(0),
        VoIP(1);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        IOSOfflinePushType(int i11) {
            this.mValue = i11;
        }

        public static IOSOfflinePushType fromInt(int i11) {
            for (IOSOfflinePushType iOSOfflinePushType : values()) {
                if (iOSOfflinePushType.mValue == i11) {
                    return iOSOfflinePushType;
                }
            }
            return APNs;
        }
    }

    public enum MediaType {
        Unknown(0),
        Audio(1),
        Video(2);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        MediaType(int i11) {
            this.mValue = i11;
        }

        public static MediaType fromInt(int i11) {
            for (MediaType mediaType : values()) {
                if (mediaType.mValue == i11) {
                    return mediaType;
                }
            }
            return Unknown;
        }
    }

    public static class OfflinePushInfo {
        public String OPPOCategory;
        public int OPPONotifyLevel;
        public String VIVOCategory;
        public String androidFCMChannelID;
        public String androidHuaWeiCategory;
        public String androidOPPOChannelID;
        public String androidSound;

        @Deprecated
        public int androidVIVOClassification = 1;
        public String androidXiaoMiChannelID;
        public String desc;
        public boolean enableIOSBackgroundNotification;
        public String extraInfo;
        public String fcmImage;
        public String honorImage;
        public String honorImportance;
        public String huaweiImage;
        public String iOSImage;
        public String iOSInterruptionLevel;
        public IOSOfflinePushType iOSPushType;
        public String iOSSound;
        public boolean ignoreIOSBadge;
        public boolean isDisablePush;
        public String title;

        public String getAndroidFCMChannelID() {
            return this.androidFCMChannelID;
        }

        public String getAndroidHuaWeiCategory() {
            return this.androidHuaWeiCategory;
        }

        public String getAndroidOPPOChannelID() {
            return this.androidOPPOChannelID;
        }

        public String getAndroidSound() {
            return this.androidSound;
        }

        public int getAndroidVIVOClassification() {
            return this.androidVIVOClassification;
        }

        public String getAndroidXiaoMiChannelID() {
            return this.androidXiaoMiChannelID;
        }

        public String getDesc() {
            return this.desc;
        }

        public IOSOfflinePushType getIOSPushType() {
            return this.iOSPushType;
        }

        public String getIOSSound() {
            return this.iOSSound;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean isDisablePush() {
            return this.isDisablePush;
        }

        public boolean isIgnoreIOSBadge() {
            return this.ignoreIOSBadge;
        }

        public void setAndroidFCMChannelID(String str) {
            this.androidFCMChannelID = str;
        }

        public void setAndroidHuaWeiCategory(String str) {
            this.androidHuaWeiCategory = str;
        }

        public void setAndroidOPPOChannelID(String str) {
            this.androidOPPOChannelID = str;
        }

        public void setAndroidSound(String str) {
            this.androidSound = str;
        }

        public void setAndroidVIVOClassification(int i11) {
            this.androidVIVOClassification = i11;
        }

        public void setAndroidXiaoMiChannelID(String str) {
            this.androidXiaoMiChannelID = str;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setDisablePush(boolean z11) {
            this.isDisablePush = z11;
        }

        public void setIOSPushType(IOSOfflinePushType iOSOfflinePushType) {
            this.iOSPushType = iOSOfflinePushType;
        }

        public void setIOSSound(String str) {
            this.iOSSound = str;
        }

        public void setIgnoreIOSBadge(boolean z11) {
            this.ignoreIOSBadge = z11;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "OfflinePushInfo{title=" + this.title + ", desc=" + this.desc + ", ignoreIOSBadge=" + this.ignoreIOSBadge + ", enableIOSBackgroundNotification=" + this.enableIOSBackgroundNotification + ", iOSInterruptionLevel=" + this.iOSInterruptionLevel + ", iOSImage=" + this.iOSImage + ", iOSSound=" + this.iOSSound + ", androidSound=" + this.androidSound + ", androidOPPOChannelID=" + this.androidOPPOChannelID + ", OPPOCategory=" + this.OPPOCategory + ", OPPONotifyLevel=" + this.OPPONotifyLevel + ", androidFCMChannelID=" + this.androidFCMChannelID + ", fcmImage=" + this.fcmImage + ", androidXiaoMiChannelID=" + this.androidXiaoMiChannelID + ", androidVIVOClassification=" + this.androidVIVOClassification + ", VIVOCategory=" + this.VIVOCategory + ", androidHuaWeiCategory=" + this.androidHuaWeiCategory + ", huaweiImage=" + this.huaweiImage + ", honorImportance=" + this.honorImportance + ", honorImage=" + this.honorImage + ", isDisablePush=" + this.isDisablePush + ", iOSPushType=" + this.iOSPushType + ", extraInfo=" + this.extraInfo + '}';
        }
    }

    public static class RecentCallsFilter {
        public CallRecords.Result result = CallRecords.Result.Unknown;
    }

    public enum Role {
        None(0),
        Caller(1),
        Called(2);

        final int mValue;

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
            return None;
        }
    }

    public enum Scene {
        NONE(0),
        GROUP_CALL(1),
        MULTI_CALL(2),
        SINGLE_CALL(3);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        Scene(int i11) {
            this.mValue = i11;
        }

        public static Scene fromInt(int i11) {
            for (Scene scene : values()) {
                if (scene.mValue == i11) {
                    return scene;
                }
            }
            return NONE;
        }
    }

    public enum Status {
        None(0),
        Waiting(1),
        Accept(2);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        Status(int i11) {
            this.mValue = i11;
        }

        public static Status fromInt(int i11) {
            for (Status status : values()) {
                if (status.mValue == i11) {
                    return status;
                }
            }
            return None;
        }
    }
}
