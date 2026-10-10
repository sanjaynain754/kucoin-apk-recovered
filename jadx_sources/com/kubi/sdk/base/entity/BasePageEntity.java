package com.kubi.sdk.base.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BasePageEntity<T> {

    @SerializedName("allowCancelAll")
    private Boolean allowCancelAll;

    @SerializedName("context")
    private BaseContext context;

    @SerializedName("hasNext")
    private boolean hasNext;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private List<T> items;

    @SerializedName("totalNum")
    private int totalNum;

    @Keep
    public static class BaseContext {

        @SerializedName("index")
        private int index = -1;

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int i11) {
            this.index = i11;
        }
    }

    public Boolean getAllowCancelAll() {
        return this.allowCancelAll;
    }

    public BaseContext getContext() {
        if (this.context == null) {
            this.context = new BaseContext();
        }
        return this.context;
    }

    public List<T> getItems() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
        return this.items;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public boolean isHasNext() {
        return this.hasNext;
    }

    public void setAllowCancelAll(Boolean bool) {
        this.allowCancelAll = bool;
    }

    public void setContext(BaseContext baseContext) {
        this.context = baseContext;
    }

    public void setHasNext(boolean z11) {
        this.hasNext = z11;
    }

    public void setItems(List<T> list) {
        this.items = list;
    }

    public void setTotalNum(int i11) {
        this.totalNum = i11;
    }
}
