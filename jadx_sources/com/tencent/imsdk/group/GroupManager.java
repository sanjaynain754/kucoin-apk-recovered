package com.tencent.imsdk.group;

import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.community.TopicInfo;
import com.tencent.imsdk.manager.BaseManager;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class GroupManager {
    private GroupListener mGroupInternalListener;
    private GroupListener mGroupListener;

    public static class GroupManagerHolder {
        private static final GroupManager groupManager = new GroupManager();

        private GroupManagerHolder() {
        }
    }

    public void createGroup(String str, String str2, String str3, IMCallback<String> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
            }
        } else {
            GroupInfo groupInfo = new GroupInfo();
            groupInfo.setGroupID(str2);
            groupInfo.setGroupType(str);
            groupInfo.setGroupName(str3);
            nativeCreateGroup(groupInfo, null, iMCallback);
        }
    }

    public native void nativeBanGroupMembers(String str, List<String> list, String str2, int i11, IMCallback iMCallback);

    public native void nativeCreateGroup(GroupInfo groupInfo, List<GroupMemberInfo> list, IMCallback<String> iMCallback);

    public native void nativeDecreaseGroupCounter(String str, String str2, long j11, IMCallback iMCallback);

    public native void nativeDeleteGroupAttributes(String str, List<String> list, IMCallback iMCallback);

    public native void nativeDeleteGroupMembers(String str, List<String> list, String str2, IMCallback iMCallback);

    public native void nativeDeleteRichStatus(String str, List<String> list, IMCallback iMCallback);

    public native void nativeDismissGroup(String str, IMCallback iMCallback);

    public native void nativeGetGroupApplicationList(IMCallback iMCallback);

    public native void nativeGetGroupAttributes(String str, List<String> list, IMCallback iMCallback);

    public native void nativeGetGroupCounters(String str, List<String> list, IMCallback iMCallback);

    public native void nativeGetGroupMemberList(String str, int i11, long j11, IMCallback iMCallback);

    public native void nativeGetGroupMembersInfo(String str, List<String> list, IMCallback iMCallback);

    public native void nativeGetGroupOnlineMemberCount(String str, IMCallback iMCallback);

    public native void nativeGetGroupsInfo(List<String> list, IMCallback iMCallback);

    public native void nativeGetJoinedCommunityList(IMCallback iMCallback);

    public native void nativeGetJoinedGroupList(IMCallback iMCallback);

    public native void nativeIncreaseGroupCounter(String str, String str2, long j11, IMCallback iMCallback);

    public native void nativeInitGroupAttributes(String str, Map<String, String> map, IMCallback iMCallback);

    public native void nativeInviteGroupMembers(String str, List<String> list, String str2, IMCallback iMCallback);

    public native void nativeJoinGroup(String str, byte[] bArr, IMCallback iMCallback);

    public native void nativeMarkGroupMemberList(String str, List<String> list, int i11, boolean z11, IMCallback iMCallback);

    public native void nativeMuteGroupMember(String str, String str2, int i11, IMCallback iMCallback);

    public native void nativeQuitGroup(String str, IMCallback iMCallback);

    public native void nativeResponseGroupApplication(GroupApplication groupApplication, IMCallback iMCallback);

    public native void nativeSearchCloudGroupMembers(GroupMemberSearchParam groupMemberSearchParam, IMCallback iMCallback);

    public native void nativeSearchCloudGroups(GroupSearchParam groupSearchParam, IMCallback iMCallback);

    public native void nativeSearchLocalGroupMembers(GroupMemberSearchParam groupMemberSearchParam, IMCallback iMCallback);

    public native void nativeSearchLocalGroups(GroupSearchParam groupSearchParam, IMCallback iMCallback);

    public native void nativeSetGroupApplicationListRead(IMCallback iMCallback);

    public native void nativeSetGroupCounters(String str, Map<String, Long> map, IMCallback iMCallback);

    public native void nativeSetGroupInfo(GroupInfoModifyParam groupInfoModifyParam, IMCallback iMCallback);

    public native void nativeSetGroupListener(GroupListener groupListener);

    public native void nativeSetGroupMemberInfo(GroupMemberInfoModifyParam groupMemberInfoModifyParam, IMCallback iMCallback);

    public native void nativeSetGroupMemberRole(String str, String str2, int i11, IMCallback iMCallback);

    public native void nativeSetGroupMessageReceiveOption(String str, int i11, IMCallback iMCallback);

    public native void nativeSetGroupOwner(String str, String str2, IMCallback iMCallback);

    public native void nativeSetRichStatus(String str, Map<String, String> map, IMCallback iMCallback);

    public native void nativeUpdateGroupAttributes(String str, Map<String, String> map, IMCallback iMCallback);

    private void initGroupListener() {
        if (this.mGroupInternalListener == null) {
            this.mGroupInternalListener = new GroupListener() { // from class: com.tencent.imsdk.group.GroupManager.1
                @Override // com.tencent.imsdk.group.GroupListener
                public void onApplicationProcessed(final String str, final GroupMemberInfo groupMemberInfo, final boolean z11, final String str2) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.12
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onApplicationProcessed(str, groupMemberInfo, z11, str2);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGrantAdministrator(final String str, final GroupMemberInfo groupMemberInfo, final List<GroupMemberInfo> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.14
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGrantAdministrator(str, groupMemberInfo, list);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupAttributeChanged(final String str, final Map<String, String> map, final boolean z11) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.18
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupAttributeChanged(str, map, z11);
                            }
                            if (z11) {
                                HashMap map2 = new HashMap();
                                map2.put("groupID", str);
                                map2.put("groupAttributes", map);
                                BaseManager.getInstance().notifyExperimentalNotify("onRichStatusChanged", map2);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupCounterChanged(final String str, final Map<String, Long> map) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.19
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupCounterChanged(str, map);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupCounterDeleted(final String str, final List<String> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.20
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupCounterDeleted(str, list);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupCreated(final String str) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.7
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupCreated(str);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupDismissed(final String str, final GroupMemberInfo groupMemberInfo) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.8
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupDismissed(str, groupMemberInfo);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupInfoChanged(final String str, final List<GroupInfoChangeItem> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.10
                        @Override // java.lang.Runnable
                        public void run() {
                            GroupInfoChangeItem groupInfoChangeItem;
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupInfoChanged(str, list);
                            }
                            Iterator it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    groupInfoChangeItem = null;
                                    break;
                                }
                                groupInfoChangeItem = (GroupInfoChangeItem) it.next();
                            } while (groupInfoChangeItem.getGroupInfoChangeType() != 8);
                            if (groupInfoChangeItem == null || GroupManager.this.mGroupListener == null) {
                                return;
                            }
                            GroupManager.this.mGroupListener.onAllGroupMembersMuted(str, groupInfoChangeItem.getBoolValueChanged());
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupOnlineMemberCountChanged(final String str, final int i11) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.21
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("groupID", str);
                                jSONObject.put("onlineMemberCount", i11);
                                BaseManager.getInstance().notifyExperimentalNotify("onGroupOnlineMemberCountChanged", jSONObject);
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onGroupRecycled(final String str, final GroupMemberInfo groupMemberInfo) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.9
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onGroupRecycled(str, groupMemberInfo);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberEnter(final String str, final List<GroupMemberInfo> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberEnter(str, list);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberInfoChanged(final String str, final List<GroupMemberInfoChangeItem> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberInfoChanged(str, list);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberInvited(final String str, final GroupMemberInfo groupMemberInfo, final List<GroupMemberInfo> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberInvited(str, groupMemberInfo, list);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberKicked(final String str, final GroupMemberInfo groupMemberInfo, final List<GroupMemberInfo> list, final String str2) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberKicked(str, groupMemberInfo, list, str2);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberLeave(final String str, final GroupMemberInfo groupMemberInfo) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberLeave(str, groupMemberInfo);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onMemberMarkChanged(final String str, final List<String> list, final int i11, final boolean z11) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.6
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onMemberMarkChanged(str, list, i11, z11);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onQuitFromGroup(final String str) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.16
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onQuitFromGroup(str);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onReceiveInviteApplication(final String str, final int i11, final GroupMemberInfo groupMemberInfo, final List<GroupMemberInfo> list, final String str2) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.13
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onReceiveInviteApplication(str, i11, groupMemberInfo, list, str2);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onReceiveJoinApplication(final String str, final GroupMemberInfo groupMemberInfo, final String str2) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.11
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onReceiveJoinApplication(str, groupMemberInfo, str2);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onReceiveRESTCustomData(final String str, final byte[] bArr) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.17
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onReceiveRESTCustomData(str, bArr);
                            }
                        }
                    });
                }

                @Override // com.tencent.imsdk.group.GroupListener
                public void onRevokeAdministrator(final String str, final GroupMemberInfo groupMemberInfo, final List<GroupMemberInfo> list) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.group.GroupManager.1.15
                        @Override // java.lang.Runnable
                        public void run() {
                            if (GroupManager.this.mGroupListener != null) {
                                GroupManager.this.mGroupListener.onRevokeAdministrator(str, groupMemberInfo, list);
                            }
                        }
                    });
                }
            };
        }
        nativeSetGroupListener(this.mGroupInternalListener);
    }

    public void muteAllGroupMembers(String str, boolean z11, IMCallback iMCallback) {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setGroupID(str);
        groupInfo.setAllShutUp(z11);
        GroupInfoModifyParam groupInfoModifyParam = new GroupInfoModifyParam();
        groupInfoModifyParam.setGroupInfo(groupInfo);
        groupInfoModifyParam.setModifyFlag(GroupInfo.GROUP_INFO_MODIFY_FLAG_SHUTUP_ALL);
        setGroupInfo(groupInfoModifyParam, iMCallback);
    }

    public void notifyReceiveRESTCustomData(String str, byte[] bArr) {
        GroupListener groupListener = this.mGroupListener;
        if (groupListener != null) {
            groupListener.onReceiveRESTCustomData(str, bArr);
        }
    }

    public void notifyTopicCreated(String str, String str2) {
        GroupListener groupListener = this.mGroupListener;
        if (groupListener != null) {
            groupListener.onTopicCreated(str, str2);
        }
    }

    public void notifyTopicDeleted(String str, List<String> list) {
        GroupListener groupListener = this.mGroupListener;
        if (groupListener != null) {
            groupListener.onTopicDeleted(str, list);
        }
    }

    public void notifyTopicInfoChanged(String str, TopicInfo topicInfo) {
        GroupListener groupListener = this.mGroupListener;
        if (groupListener != null) {
            groupListener.onTopicInfoChanged(str, topicInfo);
        }
    }

    public void setGroupListener(GroupListener groupListener) {
        this.mGroupListener = groupListener;
    }

    public static GroupManager getInstance() {
        return GroupManagerHolder.groupManager;
    }

    public void acceptGroupApplication(GroupApplication groupApplication, String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
            }
        } else {
            groupApplication.setResponseType(GroupApplication.RESPONSE_TYPE_AGREE);
            groupApplication.setResponseMessage(str);
            nativeResponseGroupApplication(groupApplication, iMCallback);
        }
    }

    public void banGroupMember(String str, List<String> list, String str2, int i11, IMCallback<List<GroupMemberOperationResult>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeBanGroupMembers(str, list, str2, i11, iMCallback);
    }

    public void decreaseGroupCounter(String str, String str2, long j11, IMCallback<Map<String, Long>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDecreaseGroupCounter(str, str2, j11, iMCallback);
    }

    public void deleteGroupAttributes(String str, List<String> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteGroupAttributes(str, list, iMCallback);
    }

    public void deleteRichStatus(String str, List<String> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteRichStatus(str, list, iMCallback);
    }

    public void dismissGroup(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDismissGroup(str, iMCallback);
    }

    public void getGroupApplicationList(IMCallback<GroupApplicationResult> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupApplicationList(iMCallback);
    }

    public void getGroupAttributes(String str, List<String> list, IMCallback<Map<String, String>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupAttributes(str, list, iMCallback);
    }

    public void getGroupCounters(String str, List<String> list, IMCallback<Map<String, Long>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupCounters(str, list, iMCallback);
    }

    public void getGroupMemberList(String str, int i11, long j11, IMCallback<GroupMemberInfoResult> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupMemberList(str, i11, j11, iMCallback);
    }

    public void getGroupMembersInfo(String str, List<String> list, IMCallback<List<GroupMemberInfo>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupMembersInfo(str, list, iMCallback);
    }

    public void getGroupOnlineMemberCount(String str, IMCallback<Integer> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupOnlineMemberCount(str, iMCallback);
    }

    public void getGroupsInfo(List<String> list, IMCallback<List<GroupInfoGetResult>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupsInfo(list, iMCallback);
    }

    public void getJoinedCommunityList(IMCallback<List<GroupInfo>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetJoinedCommunityList(iMCallback);
    }

    public void getJoinedGroupList(IMCallback<List<GroupInfo>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetJoinedGroupList(iMCallback);
    }

    public void increaseGroupCounter(String str, String str2, long j11, IMCallback<Map<String, Long>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeIncreaseGroupCounter(str, str2, j11, iMCallback);
    }

    public void init() {
        initGroupListener();
    }

    public void initGroupAttributes(String str, HashMap<String, String> map, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeInitGroupAttributes(str, map, iMCallback);
    }

    public void inviteUserToGroup(String str, List<String> list, IMCallback<List<GroupMemberOperationResult>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeInviteGroupMembers(str, list, "", iMCallback);
    }

    public void joinGroup(String str, String str2, IMCallback iMCallback) {
        byte[] bytes;
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                bytes = str2.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
                bytes = new byte[0];
            }
        } else {
            bytes = new byte[0];
        }
        nativeJoinGroup(str, bytes, iMCallback);
    }

    public void kickGroupMember(String str, List<String> list, String str2, IMCallback<List<GroupMemberOperationResult>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteGroupMembers(str, list, str2, iMCallback);
    }

    public void markGroupMemberList(String str, List<String> list, int i11, boolean z11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeMarkGroupMemberList(str, list, i11, z11, iMCallback);
    }

    public void muteGroupMember(String str, String str2, int i11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeMuteGroupMember(str, str2, i11, iMCallback);
    }

    public void quitGroup(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeQuitGroup(str, iMCallback);
    }

    public void refuseGroupApplication(GroupApplication groupApplication, String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
            }
        } else {
            groupApplication.setResponseType(GroupApplication.RESPONSE_TYPE_REFUSE);
            groupApplication.setResponseMessage(str);
            nativeResponseGroupApplication(groupApplication, iMCallback);
        }
    }

    public void searchCloudGroupMembers(GroupMemberSearchParam groupMemberSearchParam, IMCallback<GroupMemberSearchResult> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchCloudGroupMembers(groupMemberSearchParam, iMCallback);
    }

    public void searchCloudGroups(GroupSearchParam groupSearchParam, IMCallback<GroupSearchResult> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchCloudGroups(groupSearchParam, iMCallback);
    }

    public void searchLocalGroupMembersInfo(GroupMemberSearchParam groupMemberSearchParam, IMCallback<HashMap<String, List<GroupMemberInfo>>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchLocalGroupMembers(groupMemberSearchParam, iMCallback);
    }

    public void searchLocalGroups(GroupSearchParam groupSearchParam, IMCallback<List<GroupInfo>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchLocalGroups(groupSearchParam, iMCallback);
    }

    public void setGroupApplicationRead(IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupApplicationListRead(iMCallback);
    }

    public void setGroupAttributes(String str, HashMap<String, String> map, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeUpdateGroupAttributes(str, map, iMCallback);
    }

    public void setGroupCounters(String str, HashMap<String, Long> map, IMCallback<Map<String, Long>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupCounters(str, map, iMCallback);
    }

    public void setGroupInfo(GroupInfoModifyParam groupInfoModifyParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupInfo(groupInfoModifyParam, iMCallback);
    }

    public void setGroupMemberInfo(GroupMemberInfoModifyParam groupMemberInfoModifyParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupMemberInfo(groupMemberInfoModifyParam, iMCallback);
    }

    public void setGroupMemberRole(String str, String str2, int i11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupMemberRole(str, str2, i11, iMCallback);
    }

    public void setGroupReceiveMessageOpt(String str, int i11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupMessageReceiveOption(str, i11, iMCallback);
    }

    public void setRichStatus(String str, HashMap<String, String> map, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetRichStatus(str, map, iMCallback);
    }

    public void transferGroupOwner(String str, String str2, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupOwner(str, str2, iMCallback);
    }

    public void createGroup(GroupInfo groupInfo, List<GroupMemberInfo> list, IMCallback<String> iMCallback) {
        if (BaseManager.getInstance().isInited()) {
            nativeCreateGroup(groupInfo, list, iMCallback);
        } else if (iMCallback != null) {
            iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
        }
    }
}
