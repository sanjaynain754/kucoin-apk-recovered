package com.tencent.imsdk.message;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class MessageOfflinePushInfo implements Serializable {
    public static final int OFFLINE_APNS_BADGE_MODE_DEFAULT = 0;
    public static final int OFFLINE_APNS_BADGE_MODE_IGNORE = 1;
    public static final int OFFLINE_HARMONY_BADGE_MODE_DEFAULT = 0;
    public static final int OFFLINE_HARMONY_BADGE_MODE_IGNORE = 1;
    public static final int OFFLINE_PUSH_FLAG_DEFAULT = 0;
    public static final int OFFLINE_PUSH_FLAG_NO_PUSH = 1;
    private String description;
    private byte[] extension;
    private int pushFlag;
    private String soundFilePath;
    private String title;
    private String vendorParams;
    private APNSOfflinePushInfo apnsConfig = new APNSOfflinePushInfo();
    private AndroidOfflinePushInfo androidConfig = new AndroidOfflinePushInfo();
    private HarmonyOfflinePushInfo harmonyConfig = new HarmonyOfflinePushInfo();

    public class APNSOfflinePushInfo implements Serializable {
        private int backgroundNotification;
        private int badgeMode;
        private String description;
        private String iOSImageUrl;
        private int iOSPushType = 0;
        private String interruptionLevel;
        private String soundFilePath;
        private String title;

        public APNSOfflinePushInfo() {
        }

        public void setBackgroundNotification(int i11) {
            this.backgroundNotification = i11;
        }

        public void setBadgeMode(int i11) {
            this.badgeMode = i11;
        }

        public void setIOSImageUrl(String str) {
            this.iOSImageUrl = str;
        }

        public void setIOSPushType(int i11) {
            this.iOSPushType = i11;
        }

        public void setInterruptionLevel(String str) {
            this.interruptionLevel = str;
        }

        public void setSoundFilePath(String str) {
            this.soundFilePath = str;
        }
    }

    public class AndroidOfflinePushInfo implements Serializable {
        private String description;
        private String fcmChannelID;
        private String fcmImageUrl;
        private String honorImageUrl;
        private String honorImportance;
        private String huaweiCategory;
        private String huaweiImageUrl;
        private int notifyMode;
        private String oppoCategory;
        private String oppoChannelID;
        private int oppoNotifyLevel;
        private String soundFilePath;
        private String title;
        private String vivoCategory;
        private String xiaomiChannelID;
        private int vivoClassification = 1;
        private int meizuNotifyType = -1;

        public AndroidOfflinePushInfo() {
        }

        public String getSoundFilePath() {
            return this.soundFilePath;
        }

        public void setFCMChannelID(String str) {
            this.fcmChannelID = str;
        }

        public void setFCMImageUrl(String str) {
            this.fcmImageUrl = str;
        }

        public void setHonorImageUrl(String str) {
            this.honorImageUrl = str;
        }

        public void setHonorImportance(String str) {
            this.honorImportance = str;
        }

        public void setHuaWeiCategory(String str) {
            this.huaweiCategory = str;
        }

        public void setHuaWeiImageUrl(String str) {
            this.huaweiImageUrl = str;
        }

        public void setMeizuNotifyType(int i11) {
            this.meizuNotifyType = i11;
        }

        public void setOppoCategory(String str) {
            this.oppoCategory = str;
        }

        public void setOppoChannelID(String str) {
            this.oppoChannelID = str;
        }

        public void setOppoNotifyLevel(int i11) {
            this.oppoNotifyLevel = i11;
        }

        public void setSoundFilePath(String str) {
            this.soundFilePath = str;
        }

        public void setVivoCategory(String str) {
            this.vivoCategory = str;
        }

        public void setVivoClassification(int i11) {
            this.vivoClassification = i11;
        }

        public void setXiaoMiChannelID(String str) {
            this.xiaomiChannelID = str;
        }
    }

    public class HarmonyOfflinePushInfo implements Serializable {
        private int badgeMode = 0;
        private String category;
        private String description;
        private String imageUrl;
        private String title;

        public HarmonyOfflinePushInfo() {
        }

        public void setBadgeMode(int i11) {
            this.badgeMode = i11;
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public void setImageUrl(String str) {
            this.imageUrl = str;
        }
    }

    public AndroidOfflinePushInfo getAndroidConfig() {
        return this.androidConfig;
    }

    public APNSOfflinePushInfo getApnsConfig() {
        return this.apnsConfig;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getExtension() {
        return this.extension;
    }

    public HarmonyOfflinePushInfo getHarmonyConfig() {
        return this.harmonyConfig;
    }

    public int getPushFlag() {
        return this.pushFlag;
    }

    public String getSoundFilePath() {
        return this.soundFilePath;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVendorParams() {
        return this.vendorParams;
    }

    public void setAndroidConfig(AndroidOfflinePushInfo androidOfflinePushInfo) {
        this.androidConfig = androidOfflinePushInfo;
    }

    public void setApnsConfig(APNSOfflinePushInfo aPNSOfflinePushInfo) {
        this.apnsConfig = aPNSOfflinePushInfo;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtension(byte[] bArr) {
        this.extension = bArr;
    }

    public void setHarmonyConfig(HarmonyOfflinePushInfo harmonyOfflinePushInfo) {
        this.harmonyConfig = harmonyOfflinePushInfo;
    }

    public void setPushFlag(int i11) {
        this.pushFlag = i11;
    }

    public void setSoundFilePath(String str) {
        this.soundFilePath = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVendorParams(String str) {
        this.vendorParams = str;
    }
}
