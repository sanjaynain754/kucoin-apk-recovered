package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/NavItem;", "", "nav", "", "navChangeRate", "navDate", "", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getNav", "()Ljava/lang/String;", "getNavChangeRate", "getNavDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProductId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/assets/entity/NavItem;", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NavItem {

    @Nullable
    private final String nav;

    @Nullable
    private final String navChangeRate;

    @Nullable
    private final Long navDate;

    @Nullable
    private final String productId;

    public NavItem() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavItem)) {
            return false;
        }
        NavItem navItem = (NavItem) other;
        return Intrinsics.areEqual(this.nav, navItem.nav) && Intrinsics.areEqual(this.navChangeRate, navItem.navChangeRate) && Intrinsics.areEqual(this.navDate, navItem.navDate) && Intrinsics.areEqual(this.productId, navItem.productId);
    }

    public NavItem(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3) {
        this.nav = str;
        this.navChangeRate = str2;
        this.navDate = l11;
        this.productId = str3;
    }

    public static /* synthetic */ NavItem copy$default(NavItem navItem, String str, String str2, Long l11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navItem.nav;
        }
        if ((i11 & 2) != 0) {
            str2 = navItem.navChangeRate;
        }
        if ((i11 & 4) != 0) {
            l11 = navItem.navDate;
        }
        if ((i11 & 8) != 0) {
            str3 = navItem.productId;
        }
        return navItem.copy(str, str2, l11, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNav() {
        return this.nav;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavChangeRate() {
        return this.navChangeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getNavDate() {
        return this.navDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final NavItem copy(@Nullable String nav, @Nullable String navChangeRate, @Nullable Long navDate, @Nullable String productId) {
        return new NavItem(nav, navChangeRate, navDate, productId);
    }

    @Nullable
    public final String getNav() {
        return this.nav;
    }

    @Nullable
    public final String getNavChangeRate() {
        return this.navChangeRate;
    }

    @Nullable
    public final Long getNavDate() {
        return this.navDate;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        String str = this.nav;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.navChangeRate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.navDate;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.productId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NavItem(nav=" + this.nav + ", navChangeRate=" + this.navChangeRate + ", navDate=" + this.navDate + ", productId=" + this.productId + ')';
    }

    public /* synthetic */ NavItem(String str, String str2, Long l11, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3);
    }
}
