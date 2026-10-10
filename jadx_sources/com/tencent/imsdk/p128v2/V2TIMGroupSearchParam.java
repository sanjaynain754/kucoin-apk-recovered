package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.group.GroupSearchParam;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupSearchParam implements Serializable {
    private static final int SEARCH_FIELD_GROUP_ID = 1;
    private static final int SEARCH_FIELD_GROUP_NAME = 2;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_AND = 1;
    public static final int V2TIM_KEYWORD_LIST_MATCH_TYPE_OR = 0;
    private GroupSearchParam groupSearchParam = new GroupSearchParam();

    public void setSearchGroupID(boolean z11) {
        if (z11) {
            this.groupSearchParam.addSearchField(1);
        } else {
            this.groupSearchParam.removeSearchField(1);
        }
    }

    public void setSearchGroupName(boolean z11) {
        if (z11) {
            this.groupSearchParam.addSearchField(2);
        } else {
            this.groupSearchParam.removeSearchField(2);
        }
    }

    public GroupSearchParam getGroupSearchParam() {
        return this.groupSearchParam;
    }

    public List<String> getKeywordList() {
        return this.groupSearchParam.getKeywordList();
    }

    public void setKeywordList(List<String> list) {
        this.groupSearchParam.setKeywordList(list);
    }

    public void setKeywordListMatchType(int i11) {
        if (i11 == 0) {
            this.groupSearchParam.setKeywordListMatchType(0);
        } else {
            this.groupSearchParam.setKeywordListMatchType(1);
        }
    }

    public void setSearchCount(int i11) {
        this.groupSearchParam.setSearchCount(i11);
    }

    public void setSearchCursor(String str) {
        this.groupSearchParam.setSearchCursor(str);
    }
}
