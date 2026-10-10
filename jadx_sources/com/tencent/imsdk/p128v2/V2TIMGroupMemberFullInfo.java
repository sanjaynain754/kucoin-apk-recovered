package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.group.GroupMemberInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupMemberFullInfo extends V2TIMGroupMemberInfo {
    public static final int V2TIM_GROUP_MEMBER_FILTER_ADMIN = 2;
    public static final int V2TIM_GROUP_MEMBER_FILTER_ALL = 0;
    public static final int V2TIM_GROUP_MEMBER_FILTER_COMMON = 4;
    public static final int V2TIM_GROUP_MEMBER_FILTER_OWNER = 1;
    public static final int V2TIM_GROUP_MEMBER_ROLE_ADMIN = 300;
    public static final int V2TIM_GROUP_MEMBER_ROLE_MEMBER = 200;
    public static final int V2TIM_GROUP_MEMBER_ROLE_OWNER = 400;
    public static final int V2TIM_GROUP_MEMBER_UNDEFINED = 0;
    private final String TAG = "V2TIMGroupMemberFullInfo";
    private long modifyFlag = 0;

    public Map<String, byte[]> getCustomInfo() {
        return this.groupMemberInfo.getCustomInfo();
    }

    public long getJoinTime() {
        return this.groupMemberInfo.getJoinTime();
    }

    public long getModifyFlag() {
        return this.modifyFlag;
    }

    public long getMuteUntil() {
        return this.groupMemberInfo.getShutUpTime();
    }

    public int getRole() {
        int role = this.groupMemberInfo.getRole();
        if (role == GroupMemberInfo.MEMBER_ROLE_MEMBER) {
            return 200;
        }
        if (role == GroupMemberInfo.MEMBER_ROLE_ADMINISTRATOR) {
            return 300;
        }
        if (role == GroupMemberInfo.MEMBER_ROLE_OWNER) {
            return 400;
        }
        return role;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo
    public String getUserID() {
        return this.groupMemberInfo.getUserID();
    }

    public boolean isOnline() {
        return this.groupMemberInfo.isOnline();
    }

    public void setCustomInfo(Map<String, byte[]> map) {
        if (map == null) {
            return;
        }
        if (!(map instanceof HashMap)) {
            IMLog.m75914e("V2TIMGroupMemberFullInfo", "customInfo must be HashMap");
        } else {
            this.groupMemberInfo.setCustomInfo(map);
            this.modifyFlag |= GroupMemberInfo.GROUP_MEMBER_INFO_MODIFY_FLAG_CUSTOM_INFO;
        }
    }

    public void setNameCard(String str) {
        this.groupMemberInfo.setNameCard(str);
        this.modifyFlag |= GroupMemberInfo.GROUP_MEMBER_INFO_MODIFY_FLAG_NAME_CARD;
    }

    public void setReceiveMessageOpt(int i11) {
        this.groupMemberInfo.setMessageReceiveOption(i11);
        this.modifyFlag |= GroupMemberInfo.GROUP_MEMBER_INFO_MODIFY_FLAG_MESSAGE_RECEIVE_FLAG;
    }

    public void setRole(int i11) {
        if (200 == i11) {
            this.groupMemberInfo.setRole(GroupMemberInfo.MEMBER_ROLE_MEMBER);
        } else if (300 == i11) {
            this.groupMemberInfo.setRole(GroupMemberInfo.MEMBER_ROLE_ADMINISTRATOR);
        } else if (400 == i11) {
            this.groupMemberInfo.setRole(GroupMemberInfo.MEMBER_ROLE_OWNER);
        }
        this.modifyFlag |= GroupMemberInfo.GROUP_MEMBER_INFO_MODIFY_FLAG_MEMBER_ROLE;
    }

    public void setShutUpTime(long j11) {
        this.groupMemberInfo.setShutUpTime(j11);
        this.modifyFlag |= GroupMemberInfo.GROUP_MEMBER_INFO_MODIFY_FLAG_SHUTUP_TIME;
    }

    public void setUserID(String str) {
        this.groupMemberInfo.setUserID(str);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo
    public String toString() {
        return "V2TIMGroupMemberFullInfo--->userID:" + getUserID() + ", nickName:" + getNickName() + ", nameCard:" + getNameCard() + ", friendRemark:" + getFriendRemark() + ", faceUrl:" + getFaceUrl() + ", role:" + getRole() + ", muteUtil:" + getMuteUntil() + ", joinTime:" + getJoinTime() + ", isOnline:" + isOnline();
    }
}
