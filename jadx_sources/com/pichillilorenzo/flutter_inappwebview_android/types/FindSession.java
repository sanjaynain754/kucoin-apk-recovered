package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class FindSession {
    private int highlightedResultIndex;
    private int resultCount;
    private int searchResultDisplayStyle = 2;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FindSession findSession = (FindSession) obj;
            if (this.resultCount == findSession.resultCount && this.highlightedResultIndex == findSession.highlightedResultIndex && this.searchResultDisplayStyle == findSession.searchResultDisplayStyle) {
                return true;
            }
        }
        return false;
    }

    public int getHighlightedResultIndex() {
        return this.highlightedResultIndex;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public int getSearchResultDisplayStyle() {
        return this.searchResultDisplayStyle;
    }

    public int hashCode() {
        return (((this.resultCount * 31) + this.highlightedResultIndex) * 31) + this.searchResultDisplayStyle;
    }

    public void setHighlightedResultIndex(int i11) {
        this.highlightedResultIndex = i11;
    }

    public void setResultCount(int i11) {
        this.resultCount = i11;
    }

    public void setSearchResultDisplayStyle(int i11) {
        this.searchResultDisplayStyle = i11;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("resultCount", Integer.valueOf(this.resultCount));
        map.put("highlightedResultIndex", Integer.valueOf(this.highlightedResultIndex));
        map.put("searchResultDisplayStyle", Integer.valueOf(this.searchResultDisplayStyle));
        return map;
    }

    public String toString() {
        return "FindSession{resultCount=" + this.resultCount + ", highlightedResultIndex=" + this.highlightedResultIndex + ", searchResultDisplayStyle=" + this.searchResultDisplayStyle + '}';
    }

    public FindSession(int i11, int i12) {
        this.resultCount = i11;
        this.highlightedResultIndex = i12;
    }
}
