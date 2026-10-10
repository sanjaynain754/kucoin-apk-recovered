package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.community.TopicInfo;
import com.tencent.imsdk.conversation.ConversationAtInfo;
import com.tencent.imsdk.group.GroupManager;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.group.GroupMemberInfoModifyParam;
import com.tencent.imsdk.message.DraftMessage;
import com.tencent.imsdk.message.Message;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMTopicInfo implements Serializable {
    public static final int V2TIM_TOPIC_ADD_ANY = 2;
    public static final int V2TIM_TOPIC_ADD_AUTH = 1;
    public static final int V2TIM_TOPIC_ADD_FORBID = 0;
    private TopicInfo topicInfo = new TopicInfo();
    private int modifyFlag = 0;

    public void setTopicAddOpt(int i11) {
        if (2 == i11) {
            this.topicInfo.setTopicAddOpt(TopicInfo.TOPIC_ADD_OPTION_ALLOW_ANY);
        } else if (i11 == 0) {
            this.topicInfo.setTopicAddOpt(TopicInfo.TOPIC_ADD_OPTION_FORBID_ANY);
        } else if (1 == i11) {
            this.topicInfo.setTopicAddOpt(TopicInfo.TOPIC_ADD_OPTION_NEED_AUTHENTICATION);
        }
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_TOPIC_ADD_OPT);
    }

    public void setTopicApproveOpt(int i11) {
        if (2 == i11) {
            this.topicInfo.setTopicApproveOpt(TopicInfo.TOPIC_ADD_OPTION_ALLOW_ANY);
        } else if (i11 == 0) {
            this.topicInfo.setTopicApproveOpt(TopicInfo.TOPIC_ADD_OPTION_FORBID_ANY);
        } else if (1 == i11) {
            this.topicInfo.setTopicApproveOpt(TopicInfo.TOPIC_ADD_OPTION_NEED_AUTHENTICATION);
        }
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_TOPIC_APPROVE_OPT);
    }

    public long getCreateTime() {
        return this.topicInfo.getCreateTime();
    }

    public String getCustomString() {
        return this.topicInfo.getTopicCustomString();
    }

    public Long getDefaultPermissions() {
        return Long.valueOf(this.topicInfo.getDefaultPermissions());
    }

    public String getDraftText() {
        byte[] userDefinedData;
        DraftMessage draftMessage = this.topicInfo.getDraftMessage();
        if (draftMessage == null || (userDefinedData = draftMessage.getUserDefinedData()) == null) {
            return null;
        }
        return new String(userDefinedData);
    }

    public List<V2TIMGroupAtInfo> getGroupAtInfoList() {
        ArrayList arrayList = new ArrayList();
        for (ConversationAtInfo conversationAtInfo : this.topicInfo.getConversationAtInfoList()) {
            V2TIMGroupAtInfo v2TIMGroupAtInfo = new V2TIMGroupAtInfo();
            v2TIMGroupAtInfo.setConversationGroupAtInfo(conversationAtInfo);
            arrayList.add(v2TIMGroupAtInfo);
        }
        return arrayList;
    }

    public String getIntroduction() {
        return this.topicInfo.getIntroduction();
    }

    public V2TIMMessage getLastMessage() {
        Message lastMessage = this.topicInfo.getLastMessage();
        if (lastMessage == null) {
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        v2TIMMessage.setMessage(lastMessage);
        return v2TIMMessage;
    }

    public long getMemberMaxCount() {
        return this.topicInfo.getMemberMaxCount();
    }

    public int getModifyFlag() {
        return this.modifyFlag;
    }

    public String getNotification() {
        return this.topicInfo.getNotification();
    }

    public long getReadSequence() {
        return this.topicInfo.getReadSequence();
    }

    public int getRecvOpt() {
        int messageReceiveOption = this.topicInfo.getMessageReceiveOption();
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_AUTO_RECEIVE) {
            return 0;
        }
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_NOT_RECEIVE) {
            return 1;
        }
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH) {
            return 2;
        }
        if (messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH_EXCEPT_AT) {
            return 3;
        }
        return messageReceiveOption == GroupMemberInfo.MESSAGE_RECEIVE_OPTION_NOT_RECEIVE_EXCEPT_AT ? 4 : 0;
    }

    public long getSelfMuteTime() {
        return this.topicInfo.getSelfMuteTime();
    }

    public int getTopicAddOpt() {
        int topicAddOpt = this.topicInfo.getTopicAddOpt();
        if (topicAddOpt == TopicInfo.TOPIC_ADD_OPTION_ALLOW_ANY) {
            return 2;
        }
        if (topicAddOpt == TopicInfo.TOPIC_ADD_OPTION_FORBID_ANY) {
            return 0;
        }
        return topicAddOpt == TopicInfo.TOPIC_ADD_OPTION_NEED_AUTHENTICATION ? 1 : 2;
    }

    public int getTopicApproveOpt() {
        int topicApproveOpt = this.topicInfo.getTopicApproveOpt();
        if (topicApproveOpt == TopicInfo.TOPIC_ADD_OPTION_ALLOW_ANY) {
            return 2;
        }
        if (topicApproveOpt == TopicInfo.TOPIC_ADD_OPTION_FORBID_ANY) {
            return 0;
        }
        return topicApproveOpt == TopicInfo.TOPIC_ADD_OPTION_NEED_AUTHENTICATION ? 1 : 2;
    }

    public String getTopicFaceUrl() {
        return this.topicInfo.getFaceUrl();
    }

    public String getTopicID() {
        return this.topicInfo.getTopicID();
    }

    public TopicInfo getTopicInfo() {
        return this.topicInfo;
    }

    public String getTopicName() {
        return this.topicInfo.getTopicName();
    }

    public String getTopicType() {
        return this.topicInfo.getTopicType();
    }

    public long getUnreadCount() {
        return this.topicInfo.getUnreadCount();
    }

    public boolean isAllMute() {
        return this.topicInfo.isAllMute();
    }

    public boolean isInheritMessageReceiveOptionFromCommunity() {
        return this.topicInfo.isInheritMessageReceiveOptionFromCommunity();
    }

    public void setAllMute(boolean z11) {
        this.topicInfo.setAllMute(z11);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_MUTE_ALL);
    }

    public void setCustomString(String str) {
        this.topicInfo.setTopicCustomString(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_TOPIC_CUSTOM_STRING);
    }

    public void setDefaultPermissions(long j11) {
        this.topicInfo.setDefaultPermissions(j11);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_DEFAULT_PERMISSIONS);
    }

    public void setDraft(String str) {
        DraftMessage draftMessage = new DraftMessage();
        if (str != null) {
            draftMessage.setUserDefinedData(str.getBytes());
        }
        this.topicInfo.setDraftMessage(draftMessage);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_DRAFT);
    }

    public void setInheritMessageReceiveOptionFromCommunity(final boolean z11, V2TIMCallback v2TIMCallback) {
        GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
        groupMemberInfo.setGroupID(getTopicID());
        groupMemberInfo.setUserID(V2TIMManager.getInstance().getLoginUser());
        groupMemberInfo.setInheritMessageReceiveOptionFromCommunity(z11);
        GroupMemberInfoModifyParam groupMemberInfoModifyParam = new GroupMemberInfoModifyParam();
        groupMemberInfoModifyParam.setModifyFlag(GroupMemberInfo.f73265x7106d36c);
        groupMemberInfoModifyParam.setMemberInfo(groupMemberInfo);
        GroupManager.getInstance().setGroupMemberInfo(groupMemberInfoModifyParam, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMTopicInfo.1
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                V2TIMTopicInfo.this.topicInfo.setInheritMessageReceiveOptionFromCommunity(z11);
                super.success(obj);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    public void setIntroduction(String str) {
        this.topicInfo.setIntroduction(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_INTRODUCTION);
    }

    public void setMemberList(List<V2TIMCreateGroupMemberInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (V2TIMCreateGroupMemberInfo v2TIMCreateGroupMemberInfo : list) {
                GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
                groupMemberInfo.setUserID(v2TIMCreateGroupMemberInfo.getUserID());
                groupMemberInfo.setRole(v2TIMCreateGroupMemberInfo.getRole());
                arrayList.add(groupMemberInfo);
            }
        }
        this.topicInfo.setMemberList(arrayList);
    }

    public void setMemberMaxCount(long j11) {
        this.topicInfo.setMemberMaxCount(j11);
    }

    public void setNotification(String str) {
        this.topicInfo.setNotification(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_NOTIFICATION);
    }

    public void setTopicFaceUrl(String str) {
        this.topicInfo.setFaceUrl(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_FACE_URL);
    }

    public void setTopicID(String str) {
        this.topicInfo.setTopicID(str);
    }

    public void setTopicInfo(TopicInfo topicInfo) {
        if (topicInfo == null) {
            return;
        }
        this.topicInfo = topicInfo;
    }

    public void setTopicName(String str) {
        this.topicInfo.setTopicName(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_NAME);
    }

    public void setTopicType(String str) {
        this.topicInfo.setTopicType(str);
        this.modifyFlag = (int) (((long) this.modifyFlag) | TopicInfo.TOPIC_INFO_MODIFY_FLAG_TOPIC_TYPE);
    }
}
