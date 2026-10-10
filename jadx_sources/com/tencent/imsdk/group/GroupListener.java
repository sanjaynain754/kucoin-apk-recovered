package com.tencent.imsdk.group;

import com.tencent.imsdk.community.TopicInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class GroupListener {
    public void onGroupCreated(String str) {
    }

    public void onQuitFromGroup(String str) {
    }

    public void onAllGroupMembersMuted(String str, boolean z11) {
    }

    public void onGroupCounterChanged(String str, Map<String, Long> map) {
    }

    public void onGroupCounterDeleted(String str, List<String> list) {
    }

    public void onGroupDismissed(String str, GroupMemberInfo groupMemberInfo) {
    }

    public void onGroupInfoChanged(String str, List<GroupInfoChangeItem> list) {
    }

    public void onGroupOnlineMemberCountChanged(String str, int i11) {
    }

    public void onGroupRecycled(String str, GroupMemberInfo groupMemberInfo) {
    }

    public void onMemberEnter(String str, List<GroupMemberInfo> list) {
    }

    public void onMemberInfoChanged(String str, List<GroupMemberInfoChangeItem> list) {
    }

    public void onMemberLeave(String str, GroupMemberInfo groupMemberInfo) {
    }

    public void onReceiveRESTCustomData(String str, byte[] bArr) {
    }

    public void onTopicCreated(String str, String str2) {
    }

    public void onTopicDeleted(String str, List<String> list) {
    }

    public void onTopicInfoChanged(String str, TopicInfo topicInfo) {
    }

    public void onGrantAdministrator(String str, GroupMemberInfo groupMemberInfo, List<GroupMemberInfo> list) {
    }

    public void onGroupAttributeChanged(String str, Map<String, String> map, boolean z11) {
    }

    public void onMemberInvited(String str, GroupMemberInfo groupMemberInfo, List<GroupMemberInfo> list) {
    }

    public void onReceiveJoinApplication(String str, GroupMemberInfo groupMemberInfo, String str2) {
    }

    public void onRevokeAdministrator(String str, GroupMemberInfo groupMemberInfo, List<GroupMemberInfo> list) {
    }

    public void onApplicationProcessed(String str, GroupMemberInfo groupMemberInfo, boolean z11, String str2) {
    }

    public void onMemberKicked(String str, GroupMemberInfo groupMemberInfo, List<GroupMemberInfo> list, String str2) {
    }

    public void onMemberMarkChanged(String str, List<String> list, int i11, boolean z11) {
    }

    public void onReceiveInviteApplication(String str, int i11, GroupMemberInfo groupMemberInfo, List<GroupMemberInfo> list, String str2) {
    }
}
