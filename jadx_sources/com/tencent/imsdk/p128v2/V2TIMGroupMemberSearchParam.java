package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.group.GroupMemberSearchParam;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupMemberSearchParam implements Serializable {
    private static final int SEARCH_FIELD_MEMBER_NAME_CARD = 8;
    private static final int SEARCH_FIELD_MEMBER_NICK_NAME = 2;
    private static final int SEARCH_FIELD_MEMBER_REMARK = 4;
    private static final int SEARCH_FIELD_MEMBER_USER_ID = 1;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_AND = 1;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_OR = 0;
    private GroupMemberSearchParam groupMemberSearchParam = new GroupMemberSearchParam();

    public void setSearchMemberNickName(boolean z11) {
        if (z11) {
            this.groupMemberSearchParam.addSearchField(2);
        } else {
            this.groupMemberSearchParam.removeSearchField(2);
        }
    }

    public void setSearchMemberRemark(boolean z11) {
        if (z11) {
            this.groupMemberSearchParam.addSearchField(4);
        } else {
            this.groupMemberSearchParam.removeSearchField(4);
        }
    }

    public void setSearchMemberUserID(boolean z11) {
        if (z11) {
            this.groupMemberSearchParam.addSearchField(1);
        } else {
            this.groupMemberSearchParam.removeSearchField(1);
        }
    }

    public List<String> getGroupIDList() {
        return this.groupMemberSearchParam.getGroupIDList();
    }

    public GroupMemberSearchParam getGroupMemberSearchParam() {
        return this.groupMemberSearchParam;
    }

    public List<String> getKeywordList() {
        return this.groupMemberSearchParam.getKeywordList();
    }

    public void setGroupIDList(List<String> list) {
        this.groupMemberSearchParam.setGroupIDList(list);
    }

    public void setKeywordList(List<String> list) {
        this.groupMemberSearchParam.setKeywordList(list);
    }

    public void setKeywordListMatchType(int i11) {
        if (i11 == 0) {
            this.groupMemberSearchParam.setKeywordListMatchType(0);
        } else {
            this.groupMemberSearchParam.setKeywordListMatchType(1);
        }
    }

    public void setSearchCount(int i11) {
        this.groupMemberSearchParam.setSearchCount(i11);
    }

    public void setSearchCursor(String str) {
        this.groupMemberSearchParam.setSearchCursor(str);
    }

    public void setSearchMemberNameCard(boolean z11) {
        if (z11) {
            this.groupMemberSearchParam.addSearchField(8);
        } else {
            this.groupMemberSearchParam.removeSearchField(8);
        }
    }
}
