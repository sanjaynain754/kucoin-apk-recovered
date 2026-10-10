package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupMemberInfo implements Serializable {
    GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
    UserInfo userInfo;

    public String getFaceUrl() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        if (groupMemberInfo != null && !TextUtils.isEmpty(groupMemberInfo.getFaceUrl())) {
            return this.groupMemberInfo.getFaceUrl();
        }
        UserInfo userInfo = this.userInfo;
        return userInfo != null ? userInfo.getFaceUrl() : "";
    }

    public String getFriendRemark() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        return groupMemberInfo != null ? groupMemberInfo.getFriendRemark() : "";
    }

    public GroupMemberInfo getGroupMemberInfo() {
        return this.groupMemberInfo;
    }

    public String getNameCard() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        return groupMemberInfo != null ? groupMemberInfo.getNameCard() : "";
    }

    public String getNickName() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        if (groupMemberInfo != null && !TextUtils.isEmpty(groupMemberInfo.getNickname())) {
            return this.groupMemberInfo.getNickname();
        }
        UserInfo userInfo = this.userInfo;
        return userInfo != null ? userInfo.getNickname() : "";
    }

    public List<String> getOnlineDevices() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        return groupMemberInfo != null ? groupMemberInfo.getOnlineDevices() : new ArrayList();
    }

    public String getUserID() {
        GroupMemberInfo groupMemberInfo = this.groupMemberInfo;
        if (groupMemberInfo != null && !TextUtils.isEmpty(groupMemberInfo.getUserID())) {
            return this.groupMemberInfo.getUserID();
        }
        UserInfo userInfo = this.userInfo;
        return userInfo != null ? userInfo.getUserID() : "";
    }

    public void setGroupMemberInfo(GroupMemberInfo groupMemberInfo) {
        this.groupMemberInfo = groupMemberInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("V2TIMGroupMemberInfo--->");
        sb2.append("userID:");
        sb2.append(getUserID());
        sb2.append(", nickName:");
        sb2.append(getNickName());
        sb2.append(", nameCard:");
        sb2.append(getNameCard());
        sb2.append(", friendRemark:");
        sb2.append(getFriendRemark());
        sb2.append(", faceUrl:");
        sb2.append(getFaceUrl());
        StringBuilder sb3 = new StringBuilder();
        List<String> onlineDevices = getOnlineDevices();
        for (int i11 = 0; i11 < onlineDevices.size(); i11++) {
            sb2.append(onlineDevices.get(i11));
            if (i11 < onlineDevices.size() - 1) {
                sb3.append(", ");
            }
        }
        sb2.append(", onlineDevices:");
        sb2.append(sb3.toString());
        return sb2.toString();
    }
}
