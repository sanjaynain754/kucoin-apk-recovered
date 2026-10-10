package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.UserSearchParam;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMFriendSearchParam implements Serializable {
    private static final int SEARCH_FIELD_NICK_NAME = 2;
    private static final int SEARCH_FIELD_REMARK = 4;
    private static final int SEARCH_FIELD_USER_ID = 1;
    private UserSearchParam userSearchParam = new UserSearchParam();

    public void setSearchNickName(boolean z11) {
        if (z11) {
            this.userSearchParam.addSearchField(2);
        } else {
            this.userSearchParam.removeSearchField(2);
        }
    }

    public void setSearchRemark(boolean z11) {
        if (z11) {
            this.userSearchParam.addSearchField(4);
        } else {
            this.userSearchParam.removeSearchField(4);
        }
    }

    public void setSearchUserID(boolean z11) {
        if (z11) {
            this.userSearchParam.addSearchField(1);
        } else {
            this.userSearchParam.removeSearchField(1);
        }
    }

    public List<String> getKeywordList() {
        return this.userSearchParam.getKeywordList();
    }

    public UserSearchParam getUserSearchParam() {
        return this.userSearchParam;
    }

    public void setKeywordList(List<String> list) {
        this.userSearchParam.setKeywordList(list);
    }
}
