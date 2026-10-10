package com.tencent.imsdk.p128v2;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class V2TIMGroupListener {
    public void onGroupCreated(String str) {
    }

    public void onQuitFromGroup(String str) {
    }

    public void onAllGroupMembersMuted(String str, boolean z11) {
    }

    public void onGroupAttributeChanged(String str, Map<String, String> map) {
    }

    public void onGroupDismissed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
    }

    public void onGroupInfoChanged(String str, List<V2TIMGroupChangeInfo> list) {
    }

    public void onGroupRecycled(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
    }

    public void onMemberEnter(String str, List<V2TIMGroupMemberInfo> list) {
    }

    public void onMemberInfoChanged(String str, List<V2TIMGroupMemberChangeInfo> list) {
    }

    public void onMemberLeave(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
    }

    public void onReceiveRESTCustomData(String str, byte[] bArr) {
    }

    public void onTopicCreated(String str, String str2) {
    }

    public void onTopicDeleted(String str, List<String> list) {
    }

    public void onTopicInfoChanged(String str, V2TIMTopicInfo v2TIMTopicInfo) {
    }

    public void onGrantAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
    }

    public void onGroupCounterChanged(String str, String str2, long j11) {
    }

    public void onMemberInvited(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
    }

    public void onMemberKicked(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
    }

    public void onReceiveJoinApplication(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, String str2) {
    }

    public void onRevokeAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
    }

    public void onApplicationProcessed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, boolean z11, String str2) {
    }

    public void onMemberMarkChanged(String str, List<String> list, int i11, boolean z11) {
    }
}
