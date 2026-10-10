package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.message.MessageOfflinePushInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMOfflinePushInfo implements Serializable {
    public static final String IOS_OFFLINE_PUSH_DEFAULT_SOUND = "default";
    public static final String IOS_OFFLINE_PUSH_NO_SOUND = "push.no_sound";
    public static final int IOS_OFFLINE_PUSH_TYPE_APNS = 0;
    public static final int IOS_OFFLINE_PUSH_TYPE_VOIP = 1;
    private MessageOfflinePushInfo messageOfflinePushInfo = new MessageOfflinePushInfo();

    public void disablePush(boolean z11) {
        if (z11) {
            this.messageOfflinePushInfo.setPushFlag(1);
        } else {
            this.messageOfflinePushInfo.setPushFlag(0);
        }
    }

    public void enableIOSBackgroundNotification(boolean z11) {
        this.messageOfflinePushInfo.getApnsConfig().setBackgroundNotification(z11 ? 1 : 0);
    }

    public String getAndroidSound() {
        return this.messageOfflinePushInfo.getAndroidConfig().getSoundFilePath();
    }

    public String getDesc() {
        return this.messageOfflinePushInfo.getDescription();
    }

    public byte[] getExt() {
        return this.messageOfflinePushInfo.getExtension();
    }

    public MessageOfflinePushInfo getMessageOfflinePushInfo() {
        return this.messageOfflinePushInfo;
    }

    public String getTitle() {
        return this.messageOfflinePushInfo.getTitle();
    }

    public String getVendorParams() {
        return this.messageOfflinePushInfo.getVendorParams();
    }

    public boolean isDisablePush() {
        return this.messageOfflinePushInfo.getPushFlag() == 1;
    }

    public void setAndroidFCMChannelID(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setFCMChannelID(str);
    }

    public void setAndroidFCMImage(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setFCMImageUrl(str);
    }

    public void setAndroidHonorImage(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setHonorImageUrl(str);
    }

    public void setAndroidHonorImportance(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setHonorImportance(str);
    }

    public void setAndroidHuaWeiCategory(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setHuaWeiCategory(str);
    }

    public void setAndroidHuaWeiImage(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setHuaWeiImageUrl(str);
    }

    public void setAndroidMeizuNotifyType(int i11) {
        this.messageOfflinePushInfo.getAndroidConfig().setMeizuNotifyType(i11);
    }

    public void setAndroidOPPOCategory(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setOppoCategory(str);
    }

    public void setAndroidOPPOChannelID(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setOppoChannelID(str);
    }

    public void setAndroidOPPONotifyLevel(int i11) {
        this.messageOfflinePushInfo.getAndroidConfig().setOppoNotifyLevel(i11);
    }

    public void setAndroidSound(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setSoundFilePath(str);
    }

    public void setAndroidVIVOCategory(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setVivoCategory(str);
    }

    @Deprecated
    public void setAndroidVIVOClassification(int i11) {
        this.messageOfflinePushInfo.getAndroidConfig().setVivoClassification(i11);
    }

    public void setAndroidXiaoMiChannelID(String str) {
        this.messageOfflinePushInfo.getAndroidConfig().setXiaoMiChannelID(str);
    }

    public void setDesc(String str) {
        this.messageOfflinePushInfo.setDescription(str);
    }

    public void setExt(byte[] bArr) {
        this.messageOfflinePushInfo.setExtension(bArr);
    }

    public void setHarmonyCategory(String str) {
        this.messageOfflinePushInfo.getHarmonyConfig().setCategory(str);
    }

    public void setHarmonyImage(String str) {
        this.messageOfflinePushInfo.getHarmonyConfig().setImageUrl(str);
    }

    public void setIOSImage(String str) {
        this.messageOfflinePushInfo.getApnsConfig().setIOSImageUrl(str);
    }

    public void setIOSInterruptionLevel(String str) {
        this.messageOfflinePushInfo.getApnsConfig().setInterruptionLevel(str);
    }

    public void setIOSPushType(int i11) {
        this.messageOfflinePushInfo.getApnsConfig().setIOSPushType(i11);
    }

    public void setIOSSound(String str) {
        this.messageOfflinePushInfo.getApnsConfig().setSoundFilePath(str);
    }

    public void setIgnoreHarmonyBadge(boolean z11) {
        if (z11) {
            this.messageOfflinePushInfo.getHarmonyConfig().setBadgeMode(1);
        } else {
            this.messageOfflinePushInfo.getHarmonyConfig().setBadgeMode(0);
        }
    }

    public void setIgnoreIOSBadge(boolean z11) {
        if (z11) {
            this.messageOfflinePushInfo.getApnsConfig().setBadgeMode(1);
        } else {
            this.messageOfflinePushInfo.getApnsConfig().setBadgeMode(0);
        }
    }

    public void setMessageOfflinePushInfo(MessageOfflinePushInfo messageOfflinePushInfo) {
        if (messageOfflinePushInfo == null) {
            messageOfflinePushInfo = new MessageOfflinePushInfo();
        }
        this.messageOfflinePushInfo = messageOfflinePushInfo;
    }

    public void setTitle(String str) {
        this.messageOfflinePushInfo.setTitle(str);
    }

    public void setVendorParams(String str) {
        this.messageOfflinePushInfo.setVendorParams(str);
    }
}
