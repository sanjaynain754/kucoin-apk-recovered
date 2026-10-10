package com.tencent.imsdk.relationship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class UserSearchParam implements Serializable {
    public static final int FIELD_ID_NICK_NAME = 2;
    public static final int FIELD_ID_REMARK = 4;
    public static final int FIELD_ID_USER_ID = 1;
    private List<String> keywordList;
    private String searchCursor;
    private int gender = 0;
    private int minBirthday = 0;
    private int maxBirthday = 0;
    private int keywordListMatchType = 0;
    private List<Integer> searchFieldList = new ArrayList();
    private int searchCount = 20;

    public void addSearchField(int i11) {
        this.searchFieldList.add(Integer.valueOf(i11));
    }

    public int getGender() {
        return this.gender;
    }

    public List<String> getKeywordList() {
        return this.keywordList;
    }

    public int getKeywordListMatchType() {
        return this.keywordListMatchType;
    }

    public int getMaxBirthday() {
        return this.maxBirthday;
    }

    public int getMinBirthday() {
        return this.minBirthday;
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

    public void setGender(int i11) {
        this.gender = i11;
    }

    public void setKeywordList(List<String> list) {
        this.keywordList = list;
    }

    public void setKeywordListMatchType(int i11) {
        this.keywordListMatchType = i11;
    }

    public void setMaxBirthday(int i11) {
        this.maxBirthday = i11;
    }

    public void setMinBirthday(int i11) {
        this.minBirthday = i11;
    }

    public void setSearchCount(int i11) {
        this.searchCount = i11;
    }

    public void setSearchCursor(String str) {
        this.searchCursor = str;
    }
}
