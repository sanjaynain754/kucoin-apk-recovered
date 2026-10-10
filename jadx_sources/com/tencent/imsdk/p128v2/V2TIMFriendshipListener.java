package com.tencent.imsdk.p128v2;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class V2TIMFriendshipListener {
    public void onFriendApplicationListRead() {
    }

    public void onBlackListAdd(List<V2TIMFriendInfo> list) {
    }

    public void onBlackListDeleted(List<String> list) {
    }

    public void onFriendApplicationListAdded(List<V2TIMFriendApplication> list) {
    }

    public void onFriendApplicationListDeleted(List<String> list) {
    }

    public void onFriendGroupDeleted(List<String> list) {
    }

    public void onFriendInfoChanged(List<V2TIMFriendInfo> list) {
    }

    public void onFriendListAdded(List<V2TIMFriendInfo> list) {
    }

    public void onFriendListDeleted(List<String> list) {
    }

    public void onOfficialAccountDeleted(String str) {
    }

    public void onOfficialAccountInfoChanged(V2TIMOfficialAccountInfo v2TIMOfficialAccountInfo) {
    }

    public void onOfficialAccountSubscribed(V2TIMOfficialAccountInfo v2TIMOfficialAccountInfo) {
    }

    public void onOfficialAccountUnsubscribed(String str) {
    }

    public void onFriendGroupCreated(String str, List<V2TIMFriendInfo> list) {
    }

    public void onFriendGroupNameChanged(String str, String str2) {
    }

    public void onFriendsAddedToGroup(String str, List<V2TIMFriendInfo> list) {
    }

    public void onFriendsDeletedFromGroup(String str, List<String> list) {
    }

    public void onMutualFollowersListChanged(List<V2TIMUserFullInfo> list, boolean z11) {
    }

    public void onMyFollowersListChanged(List<V2TIMUserFullInfo> list, boolean z11) {
    }

    public void onMyFollowingListChanged(List<V2TIMUserFullInfo> list, boolean z11) {
    }
}
