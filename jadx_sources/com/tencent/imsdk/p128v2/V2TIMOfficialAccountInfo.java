package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.officialaccount.OfficialAccountInfo;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMOfficialAccountInfo {
    private OfficialAccountInfo officialAccountInfo = new OfficialAccountInfo();

    public long getCreateTime() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        if (officialAccountInfo != null) {
            return officialAccountInfo.getCreateTime();
        }
        return 0L;
    }

    public String getCustomData() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getCustomData() : "";
    }

    public String getFaceUrl() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getFaceUrl() : "";
    }

    public String getIntroduction() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getIntroduction() : "";
    }

    public String getOfficialAccountID() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getOfficialAccountID() : "";
    }

    public String getOfficialAccountName() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getName() : "";
    }

    public String getOrganization() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getOrganization() : "";
    }

    public String getOwnerUserID() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        return officialAccountInfo != null ? officialAccountInfo.getOwnerUserID() : "";
    }

    public long getSubscribeTime() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        if (officialAccountInfo != null) {
            return officialAccountInfo.getSelfSubscribeTime();
        }
        return 0L;
    }

    public long getSubscriberCount() {
        OfficialAccountInfo officialAccountInfo = this.officialAccountInfo;
        if (officialAccountInfo != null) {
            return officialAccountInfo.getSubscriberCount();
        }
        return 0L;
    }

    public void setOfficialAccountInfo(OfficialAccountInfo officialAccountInfo) {
        this.officialAccountInfo = officialAccountInfo;
    }

    public String toString() {
        return "V2TIMOfficialAccountInfo|officialAccountID:" + getOfficialAccountID() + ", officialAccountName:" + getOfficialAccountName() + ", faceUrl:" + getFaceUrl() + ", ownerUserID:" + getOwnerUserID() + ", organization:" + getOrganization() + ", introduction:" + getIntroduction() + ", customData:" + getCustomData() + ", createTime:" + getCreateTime() + ", subscriberCount:" + getSubscriberCount() + ", subscribeTime:" + getSubscribeTime();
    }
}
