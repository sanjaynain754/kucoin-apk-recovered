package com.kubi.lite.tab.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabConfigResponse;", "", "tabs", "", "Lcom/kubi/lite/tab/bean/TabConfig;", "<init>", "(Ljava/util/List;)V", "getTabs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabConfigResponse {

    @SerializedName("tabs")
    @Nullable
    private final List<TabConfig> tabs;

    /* JADX WARN: Multi-variable type inference failed */
    public TabConfigResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TabConfigResponse) && Intrinsics.areEqual(this.tabs, ((TabConfigResponse) other).tabs);
    }

    public TabConfigResponse(@Nullable List<TabConfig> list) {
        this.tabs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabConfigResponse copy$default(TabConfigResponse tabConfigResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tabConfigResponse.tabs;
        }
        return tabConfigResponse.copy(list);
    }

    @Nullable
    public final List<TabConfig> component1() {
        return this.tabs;
    }

    @NotNull
    public final TabConfigResponse copy(@Nullable List<TabConfig> tabs) {
        return new TabConfigResponse(tabs);
    }

    @Nullable
    public final List<TabConfig> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        List<TabConfig> list = this.tabs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabConfigResponse(tabs=" + this.tabs + ')';
    }

    public /* synthetic */ TabConfigResponse(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
