package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.FriendAddApplication;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMFriendAddApplication implements Serializable {
    private FriendAddApplication friendAddApplication;

    public void setAddType(int i11) {
        if (i11 != 1 && i11 != 2) {
            i11 = 2;
        }
        this.friendAddApplication.setAddType(i11);
    }

    public FriendAddApplication getFriendAddApplication() {
        return this.friendAddApplication;
    }

    public void setAddSource(String str) {
        this.friendAddApplication.setAddSource(str);
    }

    public void setAddWording(String str) {
        this.friendAddApplication.setAddWording(str);
    }

    public void setFriendGroup(String str) {
        this.friendAddApplication.setGroupName(str);
    }

    public void setFriendRemark(String str) {
        this.friendAddApplication.setRemark(str);
    }

    public void setUserID(String str) {
        this.friendAddApplication.setUserID(str);
    }

    public V2TIMFriendAddApplication(String str) {
        FriendAddApplication friendAddApplication = new FriendAddApplication();
        this.friendAddApplication = friendAddApplication;
        friendAddApplication.setUserID(str);
        this.friendAddApplication.setAddType(2);
    }
}
