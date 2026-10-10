package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResourcePositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b\u0012\u0018\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u001b\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0003J\u001b\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0003J\u0086\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b2\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R(\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "", "id", "", "url", "releasedAtMillis", "", "srcTextMap", "", "daySrcImgMap", "nightSrcImgMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getUrl", "getReleasedAtMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSrcTextMap", "()Ljava/util/Map;", "getDaySrcImgMap", "getNightSrcImgMap", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ResourcePositionEntity {

    @SerializedName("daySrcImgMap")
    @Nullable
    private final Map<String, String> daySrcImgMap;

    @SerializedName("id")
    @Nullable
    private final String id;

    @SerializedName("nightSrcImgMap")
    @Nullable
    private final Map<String, String> nightSrcImgMap;

    @Nullable
    private final Long releasedAtMillis;

    @SerializedName("srcTextMap")
    @Nullable
    private final Map<String, String> srcTextMap;

    @SerializedName("url")
    @Nullable
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourcePositionEntity)) {
            return false;
        }
        ResourcePositionEntity resourcePositionEntity = (ResourcePositionEntity) other;
        return Intrinsics.areEqual(this.id, resourcePositionEntity.id) && Intrinsics.areEqual(this.url, resourcePositionEntity.url) && Intrinsics.areEqual(this.releasedAtMillis, resourcePositionEntity.releasedAtMillis) && Intrinsics.areEqual(this.srcTextMap, resourcePositionEntity.srcTextMap) && Intrinsics.areEqual(this.daySrcImgMap, resourcePositionEntity.daySrcImgMap) && Intrinsics.areEqual(this.nightSrcImgMap, resourcePositionEntity.nightSrcImgMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourcePositionEntity copy$default(ResourcePositionEntity resourcePositionEntity, String str, String str2, Long l11, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = resourcePositionEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = resourcePositionEntity.url;
        }
        if ((i11 & 4) != 0) {
            l11 = resourcePositionEntity.releasedAtMillis;
        }
        if ((i11 & 8) != 0) {
            map = resourcePositionEntity.srcTextMap;
        }
        if ((i11 & 16) != 0) {
            map2 = resourcePositionEntity.daySrcImgMap;
        }
        if ((i11 & 32) != 0) {
            map3 = resourcePositionEntity.nightSrcImgMap;
        }
        Map map4 = map2;
        Map map5 = map3;
        return resourcePositionEntity.copy(str, str2, l11, map, map4, map5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getReleasedAtMillis() {
        return this.releasedAtMillis;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.srcTextMap;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.daySrcImgMap;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.nightSrcImgMap;
    }

    @NotNull
    public final ResourcePositionEntity copy(@Nullable String id2, @Nullable String url, @Nullable Long releasedAtMillis, @Nullable Map<String, String> srcTextMap, @Nullable Map<String, String> daySrcImgMap, @Nullable Map<String, String> nightSrcImgMap) {
        return new ResourcePositionEntity(id2, url, releasedAtMillis, srcTextMap, daySrcImgMap, nightSrcImgMap);
    }

    @Nullable
    public final Map<String, String> getDaySrcImgMap() {
        return this.daySrcImgMap;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, String> getNightSrcImgMap() {
        return this.nightSrcImgMap;
    }

    @Nullable
    public final Long getReleasedAtMillis() {
        return this.releasedAtMillis;
    }

    @Nullable
    public final Map<String, String> getSrcTextMap() {
        return this.srcTextMap;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.releasedAtMillis;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Map<String, String> map = this.srcTextMap;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.daySrcImgMap;
        int iHashCode5 = (iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.nightSrcImgMap;
        return iHashCode5 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResourcePositionEntity(id=" + this.id + ", url=" + this.url + ", releasedAtMillis=" + this.releasedAtMillis + ", srcTextMap=" + this.srcTextMap + ", daySrcImgMap=" + this.daySrcImgMap + ", nightSrcImgMap=" + this.nightSrcImgMap + ')';
    }

    public ResourcePositionEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this.id = str;
        this.url = str2;
        this.releasedAtMillis = l11;
        this.srcTextMap = map;
        this.daySrcImgMap = map2;
        this.nightSrcImgMap = map3;
    }
}
