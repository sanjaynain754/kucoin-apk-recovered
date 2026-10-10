package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.group.GroupInfo;
import com.tencent.imsdk.group.GroupMemberInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupInfo implements Serializable {
    static final String GROUP_TYPE_INTERNAL_CHATROOM = "ChatRoom";
    static final String GROUP_TYPE_INTERNAL_PRIVATE = "Private";
    public static final int V2TIM_GROUP_ADD_ANY = 2;
    public static final int V2TIM_GROUP_ADD_AUTH = 1;
    public static final int V2TIM_GROUP_ADD_FORBID = 0;
    private final String TAG = "V2TIMGroupInfo";
    private GroupInfo groupInfo = new GroupInfo();
    private int modifyFlag = 0;

    public void setGroupAddOpt(int i11) {
        if (2 == i11) {
            this.groupInfo.setApplyApproveOption(GroupInfo.GROUP_ADD_OPTION_ALLOW_ANY);
        } else if (i11 == 0) {
            this.groupInfo.setApplyApproveOption(GroupInfo.GROUP_ADD_OPTION_FORBID_ANY);
        } else if (1 == i11) {
            this.groupInfo.setApplyApproveOption(GroupInfo.GROUP_ADD_OPTION_NEED_AUTHENTICATION);
        }
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_APPLY_APPROVE_OPTION);
    }

    public void setGroupApproveOpt(int i11) {
        if (2 == i11) {
            this.groupInfo.setInviteApproveOption(GroupInfo.GROUP_ADD_OPTION_ALLOW_ANY);
        } else if (i11 == 0) {
            this.groupInfo.setInviteApproveOption(GroupInfo.GROUP_ADD_OPTION_FORBID_ANY);
        } else if (1 == i11) {
            this.groupInfo.setInviteApproveOption(GroupInfo.GROUP_ADD_OPTION_NEED_AUTHENTICATION);
        }
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_INVITE_APPROVE_OPTION);
    }

    public long getCreateTime() {
        return this.groupInfo.getCreateTime();
    }

    public Map<String, byte[]> getCustomInfo() {
        return this.groupInfo.getCustomInfo();
    }

    public long getDefaultPermissions() {
        return this.groupInfo.getDefaultPermissions();
    }

    public String getFaceUrl() {
        return this.groupInfo.getFaceUrl();
    }

    public int getGroupAddOpt() {
        int applyApproveOption = this.groupInfo.getApplyApproveOption();
        if (applyApproveOption == GroupInfo.GROUP_ADD_OPTION_ALLOW_ANY) {
            return 2;
        }
        if (applyApproveOption == GroupInfo.GROUP_ADD_OPTION_FORBID_ANY) {
            return 0;
        }
        return applyApproveOption == GroupInfo.GROUP_ADD_OPTION_NEED_AUTHENTICATION ? 1 : 2;
    }

    public int getGroupApproveOpt() {
        int inviteApproveOption = this.groupInfo.getInviteApproveOption();
        if (inviteApproveOption == GroupInfo.GROUP_ADD_OPTION_ALLOW_ANY) {
            return 2;
        }
        if (inviteApproveOption == GroupInfo.GROUP_ADD_OPTION_FORBID_ANY) {
            return 0;
        }
        return inviteApproveOption == GroupInfo.GROUP_ADD_OPTION_NEED_AUTHENTICATION ? 1 : 2;
    }

    public String getGroupID() {
        return this.groupInfo.getGroupID();
    }

    public GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public String getGroupName() {
        return this.groupInfo.getGroupName();
    }

    public String getGroupType() {
        String groupType = this.groupInfo.getGroupType();
        if (groupType.equals("Private")) {
            return "Work";
        }
        return groupType.equals("ChatRoom") ? "Meeting" : groupType;
    }

    public String getIntroduction() {
        return this.groupInfo.getIntroduction();
    }

    public long getJoinTime() {
        return this.groupInfo.getGroupSelfInfo().getJoinTime();
    }

    public long getLastInfoTime() {
        return this.groupInfo.getGroupInfoTimestamp();
    }

    public long getLastMessageTime() {
        return this.groupInfo.getLastMessageTimestamp();
    }

    public int getMemberCount() {
        return (int) this.groupInfo.getMemberCount();
    }

    public long getMemberMaxCount() {
        return this.groupInfo.getMemberMaxCount();
    }

    public int getModifyFlag() {
        return this.modifyFlag;
    }

    public String getNotification() {
        return this.groupInfo.getNotification();
    }

    @Deprecated
    public int getOnlineCount() {
        return (int) this.groupInfo.getMemberOnlineCount();
    }

    public String getOwner() {
        return this.groupInfo.getOwnerUserID();
    }

    public int getRecvOpt() {
        int messageReceiveOption = this.groupInfo.getGroupSelfInfo().getMessageReceiveOption();
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_AUTO_RECEIVE) {
            return 0;
        }
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_NOT_RECEIVE) {
            return 1;
        }
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH) {
            return 2;
        }
        return messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH_EXCEPT_AT ? 3 : 0;
    }

    public int getRole() {
        int role = this.groupInfo.getGroupSelfInfo().getRole();
        if (role == GroupMemberInfo.MEMBER_ROLE_MEMBER) {
            return 200;
        }
        if (role == GroupMemberInfo.MEMBER_ROLE_ADMINISTRATOR) {
            return 300;
        }
        return role == GroupMemberInfo.MEMBER_ROLE_OWNER ? 400 : 0;
    }

    public boolean isAllMuted() {
        return this.groupInfo.isAllShutUp();
    }

    public boolean isEnablePermissionGroup() {
        return this.groupInfo.isEnablePermissionGroup();
    }

    public boolean isSupportTopic() {
        return this.groupInfo.isSupportTopic();
    }

    public void setAllMuted(boolean z11) {
        this.groupInfo.setAllShutUp(z11);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_SHUTUP_ALL);
    }

    public void setCustomInfo(Map<String, byte[]> map) {
        if (map == null) {
            return;
        }
        if (!(map instanceof HashMap)) {
            IMLog.m75914e("V2TIMGroupInfo", "customInfoMap must be HashMap");
        } else {
            this.groupInfo.setCustomInfo(map);
            this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_CUSTOM_INFO);
        }
    }

    public void setDefaultPermissions(long j11) {
        this.groupInfo.setDefaultPermissions(j11);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_DEFAULT_PERMISSIONS);
    }

    public void setEnablePermissionGroup(boolean z11) {
        this.groupInfo.setEnablePermissionGroup(z11);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_ENABLE_PERMISSION_GROUP);
    }

    public void setFaceUrl(String str) {
        this.groupInfo.setFaceUrl(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_FACE_URL);
    }

    public void setGroupID(String str) {
        this.groupInfo.setGroupID(str);
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public void setGroupName(String str) {
        this.groupInfo.setGroupName(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_NAME);
    }

    public void setIntroduction(String str) {
        this.groupInfo.setIntroduction(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_INTRODUCTION);
    }

    public void setModifyFlag(int i11) {
        this.modifyFlag = i11;
    }

    public void setNotification(String str) {
        this.groupInfo.setNotification(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | GroupInfo.GROUP_INFO_MODIFY_FLAG_NOTIFICATION);
    }

    public void setSupportTopic(boolean z11) {
        this.groupInfo.setSupportTopic(z11);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d A[PHI: r0
      0x003d: PHI (r0v9 java.lang.String) = (r0v7 java.lang.String), (r0v8 java.lang.String) binds: [B:19:0x003b, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public void setGroupType(String str) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e("V2TIMGroupInfo", "setGroupType error type is null");
            return;
        }
        if (str.equalsIgnoreCase("Work")) {
            str = "Private";
        } else if (str.equalsIgnoreCase("Meeting")) {
            str = "ChatRoom";
        } else if (str.equalsIgnoreCase("Private")) {
            str = "Private";
        } else if (str.equalsIgnoreCase("ChatRoom")) {
            str = "ChatRoom";
        } else {
            String str2 = "Public";
            if (str.equalsIgnoreCase("Public")) {
                str = str2;
            } else {
                str2 = V2TIMManager.GROUP_TYPE_AVCHATROOM;
                if (str.equalsIgnoreCase(V2TIMManager.GROUP_TYPE_AVCHATROOM)) {
                    str = str2;
                }
            }
        }
        this.groupInfo.setGroupType(str);
    }
}
