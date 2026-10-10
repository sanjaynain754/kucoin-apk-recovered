package com.kubi.lite.tab.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabLargeExtra;", "", "icons", "Lcom/kubi/lite/tab/bean/TabIcons;", "lotties", "Lcom/kubi/lite/tab/bean/TabFullLotties;", "<init>", "(Lcom/kubi/lite/tab/bean/TabIcons;Lcom/kubi/lite/tab/bean/TabFullLotties;)V", "getIcons", "()Lcom/kubi/lite/tab/bean/TabIcons;", "getLotties", "()Lcom/kubi/lite/tab/bean/TabFullLotties;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabLargeExtra {

    @Nullable
    private final TabIcons icons;

    @Nullable
    private final TabFullLotties lotties;

    /* JADX WARN: Multi-variable type inference failed */
    public TabLargeExtra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabLargeExtra)) {
            return false;
        }
        TabLargeExtra tabLargeExtra = (TabLargeExtra) other;
        return Intrinsics.areEqual(this.icons, tabLargeExtra.icons) && Intrinsics.areEqual(this.lotties, tabLargeExtra.lotties);
    }

    public TabLargeExtra(@Nullable TabIcons tabIcons, @Nullable TabFullLotties tabFullLotties) {
        this.icons = tabIcons;
        this.lotties = tabFullLotties;
    }

    public static /* synthetic */ TabLargeExtra copy$default(TabLargeExtra tabLargeExtra, TabIcons tabIcons, TabFullLotties tabFullLotties, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tabIcons = tabLargeExtra.icons;
        }
        if ((i11 & 2) != 0) {
            tabFullLotties = tabLargeExtra.lotties;
        }
        return tabLargeExtra.copy(tabIcons, tabFullLotties);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TabIcons getIcons() {
        return this.icons;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TabFullLotties getLotties() {
        return this.lotties;
    }

    @NotNull
    public final TabLargeExtra copy(@Nullable TabIcons icons, @Nullable TabFullLotties lotties) {
        return new TabLargeExtra(icons, lotties);
    }

    @Nullable
    public final TabIcons getIcons() {
        return this.icons;
    }

    @Nullable
    public final TabFullLotties getLotties() {
        return this.lotties;
    }

    public int hashCode() {
        TabIcons tabIcons = this.icons;
        int iHashCode = (tabIcons == null ? 0 : tabIcons.hashCode()) * 31;
        TabFullLotties tabFullLotties = this.lotties;
        return iHashCode + (tabFullLotties != null ? tabFullLotties.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TabLargeExtra(icons=" + this.icons + ", lotties=" + this.lotties + ')';
    }

    public /* synthetic */ TabLargeExtra(TabIcons tabIcons, TabFullLotties tabFullLotties, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : tabIcons, (i11 & 2) != 0 ? null : tabFullLotties);
    }
}
