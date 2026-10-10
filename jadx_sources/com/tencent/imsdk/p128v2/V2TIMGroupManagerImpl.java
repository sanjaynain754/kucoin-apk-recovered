package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.group.GroupApplicationResult;
import com.tencent.imsdk.group.GroupInfo;
import com.tencent.imsdk.group.GroupInfoGetResult;
import com.tencent.imsdk.group.GroupInfoModifyParam;
import com.tencent.imsdk.group.GroupManager;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.group.GroupMemberInfoModifyParam;
import com.tencent.imsdk.group.GroupMemberInfoResult;
import com.tencent.imsdk.group.GroupMemberOperationResult;
import com.tencent.imsdk.group.GroupMemberSearchResult;
import com.tencent.imsdk.group.GroupSearchResult;
import com.tencent.imsdk.manager.BaseManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupManagerImpl extends V2TIMGroupManager {
    private static final String TAG = "V2TIMAdvGroupMgrImpl";

    public static class V2TIMGroupManagerImplHolder {
        private static final V2TIMGroupManagerImpl v2TIMGroupManagerImpl = new V2TIMGroupManagerImpl();

        private V2TIMGroupManagerImplHolder() {
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void kickGroupMember(String str, List<String> list, String str2, final V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> v2TIMValueCallback) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            GroupManager.getInstance().kickGroupMember(str, list, str2, new IMCallback<List<GroupMemberOperationResult>>(new V2TIMValueCallback<List<GroupMemberOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.31
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str3) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str3);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupMemberOperationResult> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupMemberOperationResult groupMemberOperationResult : list2) {
                            V2TIMGroupMemberOperationResult v2TIMGroupMemberOperationResult = new V2TIMGroupMemberOperationResult();
                            v2TIMGroupMemberOperationResult.setGroupMemberOperationResult(groupMemberOperationResult);
                            arrayList.add(v2TIMGroupMemberOperationResult);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.32
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupMemberOperationResult> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str3) {
                    super.fail(i11, str3);
                }
            });
        } else {
            IMLog.m75914e(TAG, "kickGroupMember error, groupID or memberList is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or memberList is empty");
            }
        }
    }

    private V2TIMGroupManagerImpl() {
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void acceptGroupApplication(V2TIMGroupApplication v2TIMGroupApplication, String str, V2TIMCallback v2TIMCallback) {
        if (v2TIMGroupApplication != null) {
            GroupManager.getInstance().acceptGroupApplication(v2TIMGroupApplication.getGroupApplication(), str, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.44
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "acceptGroupApplication err, v2TIMGroupApplication is null");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "v2TIMGroupApplication is null");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void createGroup(V2TIMGroupInfo v2TIMGroupInfo, List<V2TIMCreateGroupMemberInfo> list, V2TIMValueCallback<String> v2TIMValueCallback) {
        if (v2TIMGroupInfo == null) {
            IMLog.m75914e(TAG, "createGroup, null info");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "info is null");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (V2TIMCreateGroupMemberInfo v2TIMCreateGroupMemberInfo : list) {
                GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
                groupMemberInfo.setUserID(v2TIMCreateGroupMemberInfo.getUserID());
                groupMemberInfo.setRole(v2TIMCreateGroupMemberInfo.getRole());
                arrayList.add(groupMemberInfo);
            }
        }
        GroupManager.getInstance().createGroup(v2TIMGroupInfo.getGroupInfo(), arrayList, new IMCallback<String>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.1
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(String str) {
                super.success(str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupApplicationList(final V2TIMValueCallback<V2TIMGroupApplicationResult> v2TIMValueCallback) {
        GroupManager.getInstance().getGroupApplicationList(new IMCallback<GroupApplicationResult>(new V2TIMValueCallback<GroupApplicationResult>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.42
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(GroupApplicationResult groupApplicationResult) {
                if (v2TIMValueCallback != null) {
                    V2TIMGroupApplicationResult v2TIMGroupApplicationResult = new V2TIMGroupApplicationResult();
                    v2TIMGroupApplicationResult.setGroupApplicationResult(groupApplicationResult);
                    v2TIMValueCallback.onSuccess(v2TIMGroupApplicationResult);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.43
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(GroupApplicationResult groupApplicationResult) {
                super.success(groupApplicationResult);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupMembersInfo(String str, List<String> list, final V2TIMValueCallback<List<V2TIMGroupMemberFullInfo>> v2TIMValueCallback) {
        if (list != null && list.size() != 0) {
            GroupManager.getInstance().getGroupMembersInfo(str, list, new IMCallback<List<GroupMemberInfo>>(new V2TIMValueCallback<List<GroupMemberInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.20
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupMemberInfo> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupMemberInfo groupMemberInfo : list2) {
                            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
                            v2TIMGroupMemberFullInfo.setGroupMemberInfo(groupMemberInfo);
                            arrayList.add(v2TIMGroupMemberFullInfo);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.21
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupMemberInfo> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        } else {
            IMLog.m75914e(TAG, "getGroupMembersInfo fail, memberList is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "memberList is empty");
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupsInfo(List<String> list, final V2TIMValueCallback<List<V2TIMGroupInfoResult>> v2TIMValueCallback) {
        if (list != null && list.size() != 0) {
            GroupManager.getInstance().getGroupsInfo(list, new IMCallback<List<GroupInfoGetResult>>(new V2TIMValueCallback<List<GroupInfoGetResult>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.2
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupInfoGetResult> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupInfoGetResult groupInfoGetResult : list2) {
                            V2TIMGroupInfoResult v2TIMGroupInfoResult = new V2TIMGroupInfoResult();
                            v2TIMGroupInfoResult.setGroupInfoGetResult(groupInfoGetResult);
                            arrayList.add(v2TIMGroupInfoResult);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.3
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupInfoGetResult> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else {
            IMLog.m75914e(TAG, "getGroupsInfo error, empty groupIDList");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty groupIDList");
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getJoinedCommunityList(final V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
        GroupManager.getInstance().getJoinedCommunityList(new IMCallback<List<GroupInfo>>(new V2TIMValueCallback<List<GroupInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.40
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<GroupInfo> list) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList = new ArrayList();
                    for (GroupInfo groupInfo : list) {
                        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
                        v2TIMGroupInfo.setGroupInfo(groupInfo);
                        arrayList.add(v2TIMGroupInfo);
                    }
                    v2TIMValueCallback.onSuccess(arrayList);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.41
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<GroupInfo> list) {
                super.success(list);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
        BaseManager.getInstance().reportTUIComponentUsage(8L);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getJoinedGroupList(final V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
        GroupManager.getInstance().getJoinedGroupList(new IMCallback<List<GroupInfo>>(new V2TIMValueCallback<List<GroupInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.38
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<GroupInfo> list) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList = new ArrayList();
                    for (GroupInfo groupInfo : list) {
                        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
                        v2TIMGroupInfo.setGroupInfo(groupInfo);
                        arrayList.add(v2TIMGroupInfo);
                    }
                    v2TIMValueCallback.onSuccess(arrayList);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.39
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<GroupInfo> list) {
                super.success(list);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void refuseGroupApplication(V2TIMGroupApplication v2TIMGroupApplication, String str, V2TIMCallback v2TIMCallback) {
        if (v2TIMGroupApplication != null) {
            GroupManager.getInstance().refuseGroupApplication(v2TIMGroupApplication.getGroupApplication(), str, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.45
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "acceptGroupApplication err, v2TIMGroupApplication is null");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "v2TIMGroupApplication is null");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void searchCloudGroupMembers(V2TIMGroupMemberSearchParam v2TIMGroupMemberSearchParam, final V2TIMValueCallback<V2TIMGroupMemberSearchResult> v2TIMValueCallback) {
        if (v2TIMGroupMemberSearchParam == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "searchParam is null");
            }
        } else if (v2TIMGroupMemberSearchParam.getKeywordList() == null || v2TIMGroupMemberSearchParam.getKeywordList().size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty keywordList");
            }
        } else {
            GroupManager.getInstance().searchCloudGroupMembers(v2TIMGroupMemberSearchParam.getGroupMemberSearchParam(), new IMCallback<GroupMemberSearchResult>(new V2TIMValueCallback<GroupMemberSearchResult>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.24
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(GroupMemberSearchResult groupMemberSearchResult) {
                    V2TIMGroupMemberSearchResult v2TIMGroupMemberSearchResult = new V2TIMGroupMemberSearchResult();
                    v2TIMGroupMemberSearchResult.setGroupMemberSearchResult(groupMemberSearchResult);
                    v2TIMValueCallback.onSuccess(v2TIMGroupMemberSearchResult);
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.25
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(GroupMemberSearchResult groupMemberSearchResult) {
                    super.success(groupMemberSearchResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
            BaseManager.getInstance().reportTUIComponentUsage(6L);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void searchCloudGroups(V2TIMGroupSearchParam v2TIMGroupSearchParam, final V2TIMValueCallback<V2TIMGroupSearchResult> v2TIMValueCallback) {
        if (v2TIMGroupSearchParam == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "searchParam is null");
            }
        } else if (v2TIMGroupSearchParam.getKeywordList() == null || v2TIMGroupSearchParam.getKeywordList().size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty keywordList");
            }
        } else {
            GroupManager.getInstance().searchCloudGroups(v2TIMGroupSearchParam.getGroupSearchParam(), new IMCallback<GroupSearchResult>(new V2TIMValueCallback<GroupSearchResult>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.6
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(GroupSearchResult groupSearchResult) {
                    V2TIMGroupSearchResult v2TIMGroupSearchResult = new V2TIMGroupSearchResult();
                    v2TIMGroupSearchResult.setGroupSearchResult(groupSearchResult);
                    v2TIMValueCallback.onSuccess(v2TIMGroupSearchResult);
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.7
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(GroupSearchResult groupSearchResult) {
                    super.success(groupSearchResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
            BaseManager.getInstance().reportTUIComponentUsage(6L);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void searchGroupMembers(V2TIMGroupMemberSearchParam v2TIMGroupMemberSearchParam, final V2TIMValueCallback<HashMap<String, List<V2TIMGroupMemberFullInfo>>> v2TIMValueCallback) {
        if (v2TIMGroupMemberSearchParam == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "searchParam is null");
            }
        } else if (v2TIMGroupMemberSearchParam.getKeywordList() == null || v2TIMGroupMemberSearchParam.getKeywordList().isEmpty()) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "keywordList cannot be empty");
            }
        } else {
            GroupManager.getInstance().searchLocalGroupMembersInfo(v2TIMGroupMemberSearchParam.getGroupMemberSearchParam(), new IMCallback<HashMap<String, List<GroupMemberInfo>>>(new V2TIMValueCallback<HashMap<String, List<GroupMemberInfo>>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.22
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(HashMap<String, List<GroupMemberInfo>> map) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry<String, List<GroupMemberInfo>> entry : map.entrySet()) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupMemberInfo groupMemberInfo : entry.getValue()) {
                            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
                            v2TIMGroupMemberFullInfo.setGroupMemberInfo(groupMemberInfo);
                            arrayList.add(v2TIMGroupMemberFullInfo);
                        }
                        map2.put(entry.getKey(), arrayList);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(map2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.23
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(HashMap<String, List<GroupMemberInfo>> map) {
                    super.success(map);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
            BaseManager.getInstance().reportTUIComponentUsage(6L);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void searchGroups(V2TIMGroupSearchParam v2TIMGroupSearchParam, final V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
        if (v2TIMGroupSearchParam == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "searchParam is null");
            }
        } else if (v2TIMGroupSearchParam.getKeywordList() == null || v2TIMGroupSearchParam.getKeywordList().size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty keywordList");
            }
        } else {
            GroupManager.getInstance().searchLocalGroups(v2TIMGroupSearchParam.getGroupSearchParam(), new IMCallback<List<GroupInfo>>(new V2TIMValueCallback<List<GroupInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.4
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupInfo> list) {
                    ArrayList arrayList = new ArrayList();
                    for (GroupInfo groupInfo : list) {
                        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
                        v2TIMGroupInfo.setGroupInfo(groupInfo);
                        arrayList.add(v2TIMGroupInfo);
                    }
                    v2TIMValueCallback.onSuccess(arrayList);
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.5
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupInfo> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
            BaseManager.getInstance().reportTUIComponentUsage(6L);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupInfo(V2TIMGroupInfo v2TIMGroupInfo, V2TIMCallback v2TIMCallback) {
        if (v2TIMGroupInfo == null) {
            IMLog.m75914e(TAG, "setGroupInfo error, null info");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "null info");
                return;
            }
            return;
        }
        long modifyFlag = v2TIMGroupInfo.getModifyFlag();
        GroupInfo groupInfo = v2TIMGroupInfo.getGroupInfo();
        GroupInfoModifyParam groupInfoModifyParam = new GroupInfoModifyParam();
        groupInfoModifyParam.setGroupInfo(groupInfo);
        groupInfoModifyParam.setModifyFlag(modifyFlag);
        GroupManager.getInstance().setGroupInfo(groupInfoModifyParam, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.8
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    public static V2TIMGroupManagerImpl getInstance() {
        return V2TIMGroupManagerImplHolder.v2TIMGroupManagerImpl;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void createTopicInCommunity(String str, V2TIMTopicInfo v2TIMTopicInfo, V2TIMValueCallback<String> v2TIMValueCallback) {
        V2TIMCommunityManagerImpl.getInstance().createTopicInCommunity(str, v2TIMTopicInfo, v2TIMValueCallback);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void decreaseGroupCounter(String str, String str2, long j11, V2TIMValueCallback<Map<String, Long>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setGroupCounters error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            IMLog.m75914e(TAG, "setGroupCounters error, key is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "key is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().decreaseGroupCounter(str, str2, j11, new IMCallback<Map<String, Long>>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.17
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Map<String, Long> map) {
                super.success(map);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str3) {
                super.fail(i11, str3);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void deleteGroupAttributes(String str, List<String> list, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "deleteGroupAttributes error, groupID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().deleteGroupAttributes(str, list, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.11
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void deleteTopicFromCommunity(String str, List<String> list, V2TIMValueCallback<List<V2TIMTopicOperationResult>> v2TIMValueCallback) {
        V2TIMCommunityManagerImpl.getInstance().deleteTopicFromCommunity(str, list, v2TIMValueCallback);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupAttributes(String str, List<String> list, V2TIMValueCallback<Map<String, String>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "getGroupAttributes error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().getGroupAttributes(str, list, new IMCallback<Map<String, String>>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.12
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Map<String, String> map) {
                super.success(map);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupCounters(String str, List<String> list, V2TIMValueCallback<Map<String, Long>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setGroupCounters error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().getGroupCounters(str, list, new IMCallback<Map<String, Long>>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.15
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Map<String, Long> map) {
                super.success(map);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupMemberList(String str, int i11, long j11, final V2TIMValueCallback<V2TIMGroupMemberInfoResult> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "getGroupMemberList error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        int i12 = GroupMemberInfo.MEMBER_ROLE_MEMBER;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 4) {
                        i11 = GroupMemberInfo.GROUP_MEMBER_FILTER_FLAG_MEMBER;
                    }
                } else {
                    i11 = GroupMemberInfo.GROUP_MEMBER_FILTER_FLAG_ADMINISTRATOR;
                }
            } else {
                i11 = GroupMemberInfo.GROUP_MEMBER_FILTER_FLAG_OWNER;
            }
        } else {
            i11 = GroupMemberInfo.GROUP_MEMBER_FILTER_FLAG_ALL;
        }
        int i13 = i11;
        GroupManager.getInstance().getGroupMemberList(str, i13, j11, new IMCallback<GroupMemberInfoResult>(new V2TIMValueCallback<GroupMemberInfoResult>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.18
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i14, String str2) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i14, str2);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(GroupMemberInfoResult groupMemberInfoResult) {
                if (v2TIMValueCallback != null) {
                    V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult = new V2TIMGroupMemberInfoResult();
                    v2TIMGroupMemberInfoResult.setGroupMemberInfoResult(groupMemberInfoResult);
                    v2TIMValueCallback.onSuccess(v2TIMGroupMemberInfoResult);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.19
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(GroupMemberInfoResult groupMemberInfoResult) {
                super.success(groupMemberInfoResult);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i14, String str2) {
                super.fail(i14, str2);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getGroupOnlineMemberCount(String str, V2TIMValueCallback<Integer> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().getGroupOnlineMemberCount(str, new IMCallback<Integer>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.13
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Integer num) {
                super.success(num);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void getTopicInfoList(String str, List<String> list, V2TIMValueCallback<List<V2TIMTopicInfoResult>> v2TIMValueCallback) {
        V2TIMCommunityManagerImpl.getInstance().getTopicInfoList(str, list, v2TIMValueCallback);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void increaseGroupCounter(String str, String str2, long j11, V2TIMValueCallback<Map<String, Long>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setGroupCounters error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            IMLog.m75914e(TAG, "setGroupCounters error, key is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "key is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().increaseGroupCounter(str, str2, j11, new IMCallback<Map<String, Long>>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.16
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Map<String, Long> map) {
                super.success(map);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str3) {
                super.fail(i11, str3);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void initGroupAttributes(String str, HashMap<String, String> map, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "initGroupAttributes error, groupID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().initGroupAttributes(str, map, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.9
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void inviteUserToGroup(String str, List<String> list, final V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> v2TIMValueCallback) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            GroupManager.getInstance().inviteUserToGroup(str, list, new IMCallback<List<GroupMemberOperationResult>>(new V2TIMValueCallback<List<GroupMemberOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.29
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupMemberOperationResult> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupMemberOperationResult groupMemberOperationResult : list2) {
                            V2TIMGroupMemberOperationResult v2TIMGroupMemberOperationResult = new V2TIMGroupMemberOperationResult();
                            v2TIMGroupMemberOperationResult.setGroupMemberOperationResult(groupMemberOperationResult);
                            arrayList.add(v2TIMGroupMemberOperationResult);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.30
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupMemberOperationResult> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        } else {
            IMLog.m75914e(TAG, "inviteUserToGroup error, groupID or userList is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or userList is empty");
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void markGroupMemberList(String str, List<String> list, int i11, boolean z11, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid groupID");
            }
        } else if (list != null && !list.isEmpty()) {
            GroupManager.getInstance().markGroupMemberList(str, list, i11, z11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.36
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str2) {
                    super.fail(i12, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty member list");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void muteAllGroupMembers(String str, boolean z11, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        GroupManager.getInstance().muteAllGroupMembers(str, z11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.28
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void muteGroupMember(String str, String str2, int i11, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            GroupManager.getInstance().muteGroupMember(str, str2, i11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.27
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str3) {
                    super.fail(i12, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or userID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupApplicationRead(V2TIMCallback v2TIMCallback) {
        GroupManager.getInstance().setGroupApplicationRead(new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.46
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupAttributes(String str, HashMap<String, String> map, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setGroupAttributes error, groupID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        if (map != null && map.size() != 0) {
            GroupManager.getInstance().setGroupAttributes(str, map, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.10
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "setGroupAttributes error, attributes is empty");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "attributes is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupCounters(String str, HashMap<String, Long> map, V2TIMValueCallback<Map<String, Long>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setGroupCounters error, groupID is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        if (map != null && !map.isEmpty()) {
            GroupManager.getInstance().setGroupCounters(str, map, new IMCallback<Map<String, Long>>(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.14
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Map<String, Long> map2) {
                    super.success(map2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "setGroupCounters error, counters is empty");
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "counters is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupMemberInfo(String str, V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str) && v2TIMGroupMemberFullInfo != null) {
            GroupMemberInfoModifyParam groupMemberInfoModifyParam = new GroupMemberInfoModifyParam();
            groupMemberInfoModifyParam.setModifyFlag(v2TIMGroupMemberFullInfo.getModifyFlag());
            groupMemberInfoModifyParam.setMemberInfo(v2TIMGroupMemberFullInfo.getGroupMemberInfo());
            groupMemberInfoModifyParam.getMemberInfo().setGroupID(str);
            GroupManager.getInstance().setGroupMemberInfo(groupMemberInfoModifyParam, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.26
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "setGroupMemberInfo error, groupID is empty or profile is null");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty or profile is null");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setGroupMemberRole(String str, String str2, int i11, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int i12 = GroupMemberInfo.MEMBER_ROLE_MEMBER;
            if (400 == i11) {
                i11 = GroupMemberInfo.MEMBER_ROLE_OWNER;
            } else if (300 == i11) {
                i11 = GroupMemberInfo.MEMBER_ROLE_ADMINISTRATOR;
            }
            GroupManager.getInstance().setGroupMemberRole(str, str2, i11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.35
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i13, String str3) {
                    super.fail(i13, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "setGroupMemberRole error, groupID or userID is empty");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or userID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void setTopicInfo(V2TIMTopicInfo v2TIMTopicInfo, V2TIMCallback v2TIMCallback) {
        V2TIMCommunityManagerImpl.getInstance().setTopicInfo(v2TIMTopicInfo, v2TIMCallback);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void transferGroupOwner(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            GroupManager.getInstance().transferGroupOwner(str, str2, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.37
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str3) {
                    super.fail(i11, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
            return;
        }
        IMLog.m75914e(TAG, "transferGroupOwner error, groupID or userID is empty");
        if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or userID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupManager
    public void kickGroupMember(String str, List<String> list, String str2, int i11, final V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> v2TIMValueCallback) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            GroupManager.getInstance().banGroupMember(str, list, str2, i11, new IMCallback<List<GroupMemberOperationResult>>(new V2TIMValueCallback<List<GroupMemberOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.33
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str3) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i12, str3);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupMemberOperationResult> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (GroupMemberOperationResult groupMemberOperationResult : list2) {
                            V2TIMGroupMemberOperationResult v2TIMGroupMemberOperationResult = new V2TIMGroupMemberOperationResult();
                            v2TIMGroupMemberOperationResult.setGroupMemberOperationResult(groupMemberOperationResult);
                            arrayList.add(v2TIMGroupMemberOperationResult);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMGroupManagerImpl.34
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupMemberOperationResult> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str3) {
                    super.fail(i12, str3);
                }
            });
        } else {
            IMLog.m75914e(TAG, "kickGroupMember error, groupID or memberList is empty");
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID or memberList is empty");
            }
        }
    }
}
