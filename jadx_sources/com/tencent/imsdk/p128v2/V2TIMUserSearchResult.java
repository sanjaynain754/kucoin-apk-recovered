package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.UserInfo;
import com.tencent.imsdk.relationship.UserSearchResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMUserSearchResult implements Serializable {
    private UserSearchResult userSearchResult;

    public boolean getIsFinished() {
        UserSearchResult userSearchResult = this.userSearchResult;
        if (userSearchResult != null) {
            return userSearchResult.getIsFinished();
        }
        return false;
    }

    public String getNextCursor() {
        UserSearchResult userSearchResult = this.userSearchResult;
        if (userSearchResult != null) {
            return userSearchResult.getNextCursor();
        }
        return null;
    }

    public int getTotalCount() {
        UserSearchResult userSearchResult = this.userSearchResult;
        if (userSearchResult != null) {
            return userSearchResult.getTotalCount();
        }
        return 0;
    }

    public List<V2TIMUserInfo> getUserList() {
        if (this.userSearchResult == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UserInfo userInfo : this.userSearchResult.getUserList()) {
            V2TIMUserInfo v2TIMUserInfo = new V2TIMUserInfo();
            v2TIMUserInfo.setUserInfo(userInfo);
            arrayList.add(v2TIMUserInfo);
        }
        return arrayList;
    }

    public void setUserSearchResult(UserSearchResult userSearchResult) {
        this.userSearchResult = userSearchResult;
    }
}
