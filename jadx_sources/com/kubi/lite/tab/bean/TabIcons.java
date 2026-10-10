package com.kubi.lite.tab.bean;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabIcons;", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "iconNight", "iconSelected", "iconSelectedNight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getIconNight", "getIconSelected", "getIconSelectedNight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabIcons {

    @NotNull
    private final String icon;

    @NotNull
    private final String iconNight;

    @NotNull
    private final String iconSelected;

    @NotNull
    private final String iconSelectedNight;

    public TabIcons() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TabIcons copy$default(TabIcons tabIcons, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabIcons.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = tabIcons.iconNight;
        }
        if ((i11 & 4) != 0) {
            str3 = tabIcons.iconSelected;
        }
        if ((i11 & 8) != 0) {
            str4 = tabIcons.iconSelectedNight;
        }
        return tabIcons.copy(str, str2, str3, str4);
    }

    @NotNull
    public final TabIcons copy(@NotNull String icon, @NotNull String iconNight, @NotNull String iconSelected, @NotNull String iconSelectedNight) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconNight, "iconNight");
        Intrinsics.checkNotNullParameter(iconSelected, "iconSelected");
        Intrinsics.checkNotNullParameter(iconSelectedNight, "iconSelectedNight");
        return new TabIcons(icon, iconNight, iconSelected, iconSelectedNight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabIcons)) {
            return false;
        }
        TabIcons tabIcons = (TabIcons) other;
        return Intrinsics.areEqual(this.icon, tabIcons.icon) && Intrinsics.areEqual(this.iconNight, tabIcons.iconNight) && Intrinsics.areEqual(this.iconSelected, tabIcons.iconSelected) && Intrinsics.areEqual(this.iconSelectedNight, tabIcons.iconSelectedNight);
    }

    public TabIcons(@NotNull String icon, @NotNull String iconNight, @NotNull String iconSelected, @NotNull String iconSelectedNight) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconNight, "iconNight");
        Intrinsics.checkNotNullParameter(iconSelected, "iconSelected");
        Intrinsics.checkNotNullParameter(iconSelectedNight, "iconSelectedNight");
        this.icon = icon;
        this.iconNight = iconNight;
        this.iconSelected = iconSelected;
        this.iconSelectedNight = iconSelectedNight;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconNight() {
        return this.iconNight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconSelected() {
        return this.iconSelected;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconSelectedNight() {
        return this.iconSelectedNight;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconNight() {
        return this.iconNight;
    }

    @NotNull
    public final String getIconSelected() {
        return this.iconSelected;
    }

    @NotNull
    public final String getIconSelectedNight() {
        return this.iconSelectedNight;
    }

    public int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.iconNight.hashCode()) * 31) + this.iconSelected.hashCode()) * 31) + this.iconSelectedNight.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabIcons(icon=" + this.icon + ", iconNight=" + this.iconNight + ", iconSelected=" + this.iconSelected + ", iconSelectedNight=" + this.iconSelectedNight + ')';
    }

    public /* synthetic */ TabIcons(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4);
    }
}
