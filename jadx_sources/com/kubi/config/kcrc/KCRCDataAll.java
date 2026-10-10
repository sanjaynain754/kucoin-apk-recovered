package com.kubi.config.kcrc;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRCDataAll;", "", "beginId", "", "hasMore", "", "version", "values", "", "", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/Map;)V", "getBeginId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValues", "()Ljava/util/Map;", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/Map;)Lcom/kubi/config/kcrc/KCRCDataAll;", "equals", "other", "hashCode", "", "toString", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class KCRCDataAll {

    @Nullable
    private final Long beginId;

    @Nullable
    private final Boolean hasMore;

    @Nullable
    private final Map<String, Object> values;

    @Nullable
    private final Long version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRCDataAll)) {
            return false;
        }
        KCRCDataAll kCRCDataAll = (KCRCDataAll) other;
        return Intrinsics.areEqual(this.beginId, kCRCDataAll.beginId) && Intrinsics.areEqual(this.hasMore, kCRCDataAll.hasMore) && Intrinsics.areEqual(this.version, kCRCDataAll.version) && Intrinsics.areEqual(this.values, kCRCDataAll.values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCRCDataAll copy$default(KCRCDataAll kCRCDataAll, Long l11, Boolean bool, Long l12, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = kCRCDataAll.beginId;
        }
        if ((i11 & 2) != 0) {
            bool = kCRCDataAll.hasMore;
        }
        if ((i11 & 4) != 0) {
            l12 = kCRCDataAll.version;
        }
        if ((i11 & 8) != 0) {
            map = kCRCDataAll.values;
        }
        return kCRCDataAll.copy(l11, bool, l12, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getBeginId() {
        return this.beginId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getVersion() {
        return this.version;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.values;
    }

    @NotNull
    public final KCRCDataAll copy(@Nullable Long beginId, @Nullable Boolean hasMore, @Nullable Long version, @Nullable Map<String, ? extends Object> values) {
        return new KCRCDataAll(beginId, hasMore, version, values);
    }

    @Nullable
    public final Long getBeginId() {
        return this.beginId;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final Map<String, Object> getValues() {
        return this.values;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l11 = this.beginId;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.version;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, Object> map = this.values;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCRCDataAll(beginId=" + this.beginId + ", hasMore=" + this.hasMore + ", version=" + this.version + ", values=" + this.values + ')';
    }

    public KCRCDataAll(@Nullable Long l11, @Nullable Boolean bool, @Nullable Long l12, @Nullable Map<String, ? extends Object> map) {
        this.beginId = l11;
        this.hasMore = bool;
        this.version = l12;
        this.values = map;
    }
}
