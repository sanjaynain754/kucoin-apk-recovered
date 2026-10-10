package com.kubi.lite.tab.bean;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabConfig;", "", "title", "", "url", "tabId", "icons", "Lcom/kubi/lite/tab/bean/TabIcons;", "lotties", "Lcom/kubi/lite/tab/bean/TabMainLotties;", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "Lcom/kubi/lite/tab/bean/TabExtra;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/lite/tab/bean/TabIcons;Lcom/kubi/lite/tab/bean/TabMainLotties;Lcom/kubi/lite/tab/bean/TabExtra;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getTabId", "getIcons", "()Lcom/kubi/lite/tab/bean/TabIcons;", "getLotties", "()Lcom/kubi/lite/tab/bean/TabMainLotties;", "getExtra", "()Lcom/kubi/lite/tab/bean/TabExtra;", "getConfigTabId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabConfig {

    @Nullable
    private final TabExtra extra;

    @Nullable
    private final TabIcons icons;

    @Nullable
    private final TabMainLotties lotties;

    @NotNull
    private final String tabId;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public TabConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TabConfig copy$default(TabConfig tabConfig, String str, String str2, String str3, TabIcons tabIcons, TabMainLotties tabMainLotties, TabExtra tabExtra, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabConfig.title;
        }
        if ((i11 & 2) != 0) {
            str2 = tabConfig.url;
        }
        if ((i11 & 4) != 0) {
            str3 = tabConfig.tabId;
        }
        if ((i11 & 8) != 0) {
            tabIcons = tabConfig.icons;
        }
        if ((i11 & 16) != 0) {
            tabMainLotties = tabConfig.lotties;
        }
        if ((i11 & 32) != 0) {
            tabExtra = tabConfig.extra;
        }
        TabMainLotties tabMainLotties2 = tabMainLotties;
        TabExtra tabExtra2 = tabExtra;
        return tabConfig.copy(str, str2, str3, tabIcons, tabMainLotties2, tabExtra2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabConfig)) {
            return false;
        }
        TabConfig tabConfig = (TabConfig) other;
        return Intrinsics.areEqual(this.title, tabConfig.title) && Intrinsics.areEqual(this.url, tabConfig.url) && Intrinsics.areEqual(this.tabId, tabConfig.tabId) && Intrinsics.areEqual(this.icons, tabConfig.icons) && Intrinsics.areEqual(this.lotties, tabConfig.lotties) && Intrinsics.areEqual(this.extra, tabConfig.extra);
    }

    public TabConfig(@NotNull String title, @NotNull String url, @NotNull String tabId, @Nullable TabIcons tabIcons, @Nullable TabMainLotties tabMainLotties, @Nullable TabExtra tabExtra) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.title = title;
        this.url = url;
        this.tabId = tabId;
        this.icons = tabIcons;
        this.lotties = tabMainLotties;
        this.extra = tabExtra;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TabIcons getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TabMainLotties getLotties() {
        return this.lotties;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TabExtra getExtra() {
        return this.extra;
    }

    @NotNull
    public final TabConfig copy(@NotNull String title, @NotNull String url, @NotNull String tabId, @Nullable TabIcons icons, @Nullable TabMainLotties lotties, @Nullable TabExtra extra) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        return new TabConfig(title, url, tabId, icons, lotties, extra);
    }

    @NotNull
    public final String getConfigTabId() {
        return this.tabId;
    }

    @Nullable
    public final TabExtra getExtra() {
        return this.extra;
    }

    @Nullable
    public final TabIcons getIcons() {
        return this.icons;
    }

    @Nullable
    public final TabMainLotties getLotties() {
        return this.lotties;
    }

    @NotNull
    public final String getTabId() {
        return this.tabId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.url.hashCode()) * 31) + this.tabId.hashCode()) * 31;
        TabIcons tabIcons = this.icons;
        int iHashCode2 = (iHashCode + (tabIcons == null ? 0 : tabIcons.hashCode())) * 31;
        TabMainLotties tabMainLotties = this.lotties;
        int iHashCode3 = (iHashCode2 + (tabMainLotties == null ? 0 : tabMainLotties.hashCode())) * 31;
        TabExtra tabExtra = this.extra;
        return iHashCode3 + (tabExtra != null ? tabExtra.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TabConfig(title=" + this.title + ", url=" + this.url + ", tabId=" + this.tabId + ", icons=" + this.icons + ", lotties=" + this.lotties + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ TabConfig(String str, String str2, String str3, TabIcons tabIcons, TabMainLotties tabMainLotties, TabExtra tabExtra, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : tabIcons, (i11 & 16) != 0 ? null : tabMainLotties, (i11 & 32) != 0 ? null : tabExtra);
    }
}
