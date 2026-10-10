package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.relationship.UserSearchParam;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMUserSearchParam implements Serializable {
    public static final int V2TIM_GENDER_FEMALE = 2;
    public static final int V2TIM_GENDER_MALE = 1;
    public static final int V2TIM_GENDER_UNKNOWN = 0;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_AND = 1;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_OR = 0;
    private UserSearchParam userSearchParam = new UserSearchParam();

    public List<String> getKeywordList() {
        return this.userSearchParam.getKeywordList();
    }

    public UserSearchParam getUserSearchParam() {
        return this.userSearchParam;
    }

    public void setGender(int i11) {
        this.userSearchParam.setGender(i11);
    }

    public void setKeywordList(List<String> list) {
        this.userSearchParam.setKeywordList(list);
    }

    public void setKeywordListMatchType(int i11) {
        if (i11 == 0) {
            this.userSearchParam.setKeywordListMatchType(0);
        } else {
            this.userSearchParam.setKeywordListMatchType(1);
        }
    }

    public void setMaxBirthday(int i11) {
        this.userSearchParam.setMaxBirthday(i11);
    }

    public void setMinBirthday(int i11) {
        this.userSearchParam.setMinBirthday(i11);
    }

    public void setSearchCount(int i11) {
        this.userSearchParam.setSearchCount(i11);
    }

    public void setSearchCursor(String str) {
        this.userSearchParam.setSearchCursor(str);
    }
}
