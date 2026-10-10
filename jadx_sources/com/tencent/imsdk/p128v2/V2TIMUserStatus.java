package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.UserStatus;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMUserStatus implements Serializable {
    public static final int V2TIM_USER_STATUS_OFFLINE = 2;
    public static final int V2TIM_USER_STATUS_ONLINE = 1;
    public static final int V2TIM_USER_STATUS_UNKNOWN = 0;
    public static final int V2TIM_USER_STATUS_UNLOGINED = 3;
    private UserStatus userStatus = new UserStatus();

    public String getCustomStatus() {
        return this.userStatus.getCustomStatus();
    }

    public List<String> getOnlineDevices() {
        return this.userStatus.getOnlineDevices();
    }

    public int getStatusType() {
        return this.userStatus.getStatusType();
    }

    public String getUserID() {
        return this.userStatus.getUserID();
    }

    public UserStatus getUserStatus() {
        return this.userStatus;
    }

    public void setCustomStatus(String str) {
        this.userStatus.setCustomStatus(str);
    }

    public void setUserStatus(UserStatus userStatus) {
        if (userStatus == null) {
            return;
        }
        this.userStatus = userStatus;
    }
}
