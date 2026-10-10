package com.tencent.imsdk.relationship;

import com.tencent.imsdk.officialaccount.OfficialAccountInfo;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class FriendshipListener {
    public void onFriendApplicationListRead() {
    }

    public void onAllReceiveMessageOptChanged(ReceiveMessageOptInfo receiveMessageOptInfo) {
    }

    public void onBlackListAdded(List<FriendInfo> list) {
    }

    public void onBlackListDeleted(List<String> list) {
    }

    public void onFriendApplicationListAdded(List<FriendApplication> list) {
    }

    public void onFriendApplicationListDelete(List<String> list) {
    }

    public void onFriendGroupDeleted(List<String> list) {
    }

    public void onFriendInfoChanged(List<FriendInfo> list) {
    }

    public void onFriendListAdded(List<FriendInfo> list) {
    }

    public void onFriendListDeleted(List<String> list) {
    }

    public void onOfficialAccountDeleted(String str) {
    }

    public void onOfficialAccountInfoChanged(OfficialAccountInfo officialAccountInfo) {
    }

    public void onOfficialAccountSubscribed(OfficialAccountInfo officialAccountInfo) {
    }

    public void onOfficialAccountUnsubscribed(String str) {
    }

    public void onSelfInfoUpdated(UserInfo userInfo) {
    }

    public void onUserInfoChanged(List<UserInfo> list) {
    }

    public void onUserStatusChanged(List<UserStatus> list) {
    }

    public void onFriendGroupCreated(String str, List<FriendInfo> list) {
    }

    public void onFriendGroupNameChanged(String str, String str2) {
    }

    public void onFriendsAddedToGroup(String str, List<FriendInfo> list) {
    }

    public void onFriendsDeletedFromGroup(String str, List<String> list) {
    }

    public void onMutualFollowersListChanged(List<UserInfo> list, boolean z11) {
    }

    public void onMyFollowersListChanged(List<UserInfo> list, boolean z11) {
    }

    public void onMyFollowingListChanged(List<UserInfo> list, boolean z11) {
    }
}
