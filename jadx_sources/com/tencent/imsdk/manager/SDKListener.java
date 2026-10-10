package com.tencent.imsdk.manager;

import com.tencent.imsdk.relationship.ReceiveMessageOptInfo;
import com.tencent.imsdk.relationship.UserInfo;
import com.tencent.imsdk.relationship.UserStatus;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public interface SDKListener {
    void onAllReceiveMessageOptChanged(ReceiveMessageOptInfo receiveMessageOptInfo);

    void onConnectFailed(int i11, String str);

    void onConnectSuccess();

    void onConnecting();

    void onExperimentalNotify(String str, Object obj);

    void onKickedOffline();

    void onLog(int i11, String str);

    void onSelfInfoUpdated(UserInfo userInfo);

    void onUserInfoChanged(List<UserInfo> list);

    void onUserSigExpired();

    void onUserStatusChanged(List<UserStatus> list);
}
