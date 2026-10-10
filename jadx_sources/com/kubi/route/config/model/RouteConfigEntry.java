package com.kubi.route.config.model;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RouteConfigEntry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/route/config/model/RouteConfigEntry;", "", "version", "", "routes", "", "Lcom/kubi/route/config/model/RouteEntry;", "(Ljava/lang/String;Ljava/util/Map;)V", "getRoutes", "()Ljava/util/Map;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RouteConfigEntry {

    @Nullable
    private final Map<String, RouteEntry> routes;

    @Nullable
    private final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteConfigEntry() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteConfigEntry)) {
            return false;
        }
        RouteConfigEntry routeConfigEntry = (RouteConfigEntry) other;
        return Intrinsics.areEqual(this.version, routeConfigEntry.version) && Intrinsics.areEqual(this.routes, routeConfigEntry.routes);
    }

    public RouteConfigEntry(@Nullable String str, @Nullable Map<String, RouteEntry> map) {
        this.version = str;
        this.routes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteConfigEntry copy$default(RouteConfigEntry routeConfigEntry, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = routeConfigEntry.version;
        }
        if ((i11 & 2) != 0) {
            map = routeConfigEntry.routes;
        }
        return routeConfigEntry.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final Map<String, RouteEntry> component2() {
        return this.routes;
    }

    @NotNull
    public final RouteConfigEntry copy(@Nullable String version, @Nullable Map<String, RouteEntry> routes) {
        return new RouteConfigEntry(version, routes);
    }

    @Nullable
    public final Map<String, RouteEntry> getRoutes() {
        return this.routes;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, RouteEntry> map = this.routes;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RouteConfigEntry(version=" + this.version + ", routes=" + this.routes + ')';
    }

    public /* synthetic */ RouteConfigEntry(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : map);
    }
}
