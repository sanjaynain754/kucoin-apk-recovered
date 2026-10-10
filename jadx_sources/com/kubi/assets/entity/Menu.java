package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0006\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/Menu;", "", "iconCode", "", "iconUrl", "id", "isOn", "", "isShow", "isShowOnOff", "jumpType", "jumpUrl", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconCode", "()Ljava/lang/String;", "getIconUrl", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJumpType", "getJumpUrl", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/Menu;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Menu {

    @Nullable
    private final String iconCode;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isOn;

    @Nullable
    private final Boolean isShow;

    @Nullable
    private final Boolean isShowOnOff;

    @Nullable
    private final String jumpType;

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String title;

    public Menu() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) other;
        return Intrinsics.areEqual(this.iconCode, menu.iconCode) && Intrinsics.areEqual(this.iconUrl, menu.iconUrl) && Intrinsics.areEqual(this.id, menu.id) && Intrinsics.areEqual(this.isOn, menu.isOn) && Intrinsics.areEqual(this.isShow, menu.isShow) && Intrinsics.areEqual(this.isShowOnOff, menu.isShowOnOff) && Intrinsics.areEqual(this.jumpType, menu.jumpType) && Intrinsics.areEqual(this.jumpUrl, menu.jumpUrl) && Intrinsics.areEqual(this.title, menu.title);
    }

    public Menu(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.iconCode = str;
        this.iconUrl = str2;
        this.id = str3;
        this.isOn = bool;
        this.isShow = bool2;
        this.isShowOnOff = bool3;
        this.jumpType = str4;
        this.jumpUrl = str5;
        this.title = str6;
    }

    public static /* synthetic */ Menu copy$default(Menu menu, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = menu.iconCode;
        }
        if ((i11 & 2) != 0) {
            str2 = menu.iconUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = menu.id;
        }
        if ((i11 & 8) != 0) {
            bool = menu.isOn;
        }
        if ((i11 & 16) != 0) {
            bool2 = menu.isShow;
        }
        if ((i11 & 32) != 0) {
            bool3 = menu.isShowOnOff;
        }
        if ((i11 & 64) != 0) {
            str4 = menu.jumpType;
        }
        if ((i11 & 128) != 0) {
            str5 = menu.jumpUrl;
        }
        if ((i11 & 256) != 0) {
            str6 = menu.title;
        }
        String str7 = str5;
        String str8 = str6;
        Boolean bool4 = bool3;
        String str9 = str4;
        Boolean bool5 = bool2;
        String str10 = str3;
        return menu.copy(str, str2, str10, bool, bool5, bool4, str9, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconCode() {
        return this.iconCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsOn() {
        return this.isOn;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsShow() {
        return this.isShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsShowOnOff() {
        return this.isShowOnOff;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Menu copy(@Nullable String iconCode, @Nullable String iconUrl, @Nullable String id2, @Nullable Boolean isOn, @Nullable Boolean isShow, @Nullable Boolean isShowOnOff, @Nullable String jumpType, @Nullable String jumpUrl, @Nullable String title) {
        return new Menu(iconCode, iconUrl, id2, isOn, isShow, isShowOnOff, jumpType, jumpUrl, title);
    }

    @Nullable
    public final String getIconCode() {
        return this.iconCode;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.iconCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOn;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isShow;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isShowOnOff;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.jumpType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpUrl;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOn() {
        return this.isOn;
    }

    @Nullable
    public final Boolean isShow() {
        return this.isShow;
    }

    @Nullable
    public final Boolean isShowOnOff() {
        return this.isShowOnOff;
    }

    @NotNull
    public String toString() {
        return "Menu(iconCode=" + this.iconCode + ", iconUrl=" + this.iconUrl + ", id=" + this.id + ", isOn=" + this.isOn + ", isShow=" + this.isShow + ", isShowOnOff=" + this.isShowOnOff + ", jumpType=" + this.jumpType + ", jumpUrl=" + this.jumpUrl + ", title=" + this.title + ')';
    }

    public /* synthetic */ Menu(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6);
    }
}
