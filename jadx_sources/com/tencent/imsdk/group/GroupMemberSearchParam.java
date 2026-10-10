package com.tencent.imsdk.group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class GroupMemberSearchParam implements Serializable {
    private List<String> groupIDList;
    private List<String> keywordList;
    private String searchCursor;
    private List<Integer> searchFieldList = new ArrayList();
    private int keywordListMatchType = 0;
    private int searchCount = 20;

    public void addSearchField(int i11) {
        this.searchFieldList.add(Integer.valueOf(i11));
    }

    public List<String> getGroupIDList() {
        return this.groupIDList;
    }

    public List<String> getKeywordList() {
        return this.keywordList;
    }

    public int getKeywordListMatchType() {
        return this.keywordListMatchType;
    }

    public int getSearchCount() {
        return this.searchCount;
    }

    public String getSearchCursor() {
        return this.searchCursor;
    }

    public void removeSearchField(int i11) {
        this.searchFieldList.remove(Integer.valueOf(i11));
    }

    public void setGroupIDList(List<String> list) {
        this.groupIDList = list;
    }

    public void setKeywordList(List<String> list) {
        this.keywordList = list;
    }

    public void setKeywordListMatchType(int i11) {
        this.keywordListMatchType = i11;
    }

    public void setSearchCount(int i11) {
        this.searchCount = i11;
    }

    public void setSearchCursor(String str) {
        this.searchCursor = str;
    }
}
