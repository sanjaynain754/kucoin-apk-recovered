package com.kubi.route.config.model;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RouteConfigEntry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/route/config/model/RouteEntry;", "", "path", "", Constants.BIZ, "mode", "", "siteTypeList", "fallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getFallback", "getMode", "()Ljava/util/List;", "getPath", "getSiteTypeList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RouteEntry {

    @Nullable
    private final String biz;

    @Nullable
    private final String fallback;

    @Nullable
    private final List<String> mode;

    @Nullable
    private final String path;

    @Nullable
    private final List<String> siteTypeList;

    public RouteEntry() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteEntry)) {
            return false;
        }
        RouteEntry routeEntry = (RouteEntry) other;
        return Intrinsics.areEqual(this.path, routeEntry.path) && Intrinsics.areEqual(this.biz, routeEntry.biz) && Intrinsics.areEqual(this.mode, routeEntry.mode) && Intrinsics.areEqual(this.siteTypeList, routeEntry.siteTypeList) && Intrinsics.areEqual(this.fallback, routeEntry.fallback);
    }

    public RouteEntry(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str3) {
        this.path = str;
        this.biz = str2;
        this.mode = list;
        this.siteTypeList = list2;
        this.fallback = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteEntry copy$default(RouteEntry routeEntry, String str, String str2, List list, List list2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = routeEntry.path;
        }
        if ((i11 & 2) != 0) {
            str2 = routeEntry.biz;
        }
        if ((i11 & 4) != 0) {
            list = routeEntry.mode;
        }
        if ((i11 & 8) != 0) {
            list2 = routeEntry.siteTypeList;
        }
        if ((i11 & 16) != 0) {
            str3 = routeEntry.fallback;
        }
        String str4 = str3;
        List list3 = list;
        return routeEntry.copy(str, str2, list3, list2, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final List<String> component3() {
        return this.mode;
    }

    @Nullable
    public final List<String> component4() {
        return this.siteTypeList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    @NotNull
    public final RouteEntry copy(@Nullable String path, @Nullable String biz, @Nullable List<String> mode, @Nullable List<String> siteTypeList, @Nullable String fallback) {
        return new RouteEntry(path, biz, mode, siteTypeList, fallback);
    }

    @Nullable
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final String getFallback() {
        return this.fallback;
    }

    @Nullable
    public final List<String> getMode() {
        return this.mode;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final List<String> getSiteTypeList() {
        return this.siteTypeList;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biz;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.mode;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.siteTypeList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.fallback;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RouteEntry(path=" + this.path + ", biz=" + this.biz + ", mode=" + this.mode + ", siteTypeList=" + this.siteTypeList + ", fallback=" + this.fallback + ')';
    }

    public /* synthetic */ RouteEntry(String str, String str2, List list, List list2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? null : str3);
    }
}
