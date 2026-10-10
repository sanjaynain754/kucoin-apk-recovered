package com.kubi.assets.freeze;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetMiddleGroundResource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0003JU\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR(\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/freeze/AssetMiddleGroundResource;", "", "id", "", "title", "url", "releasedAt", "srcTextMap", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getReleasedAt", "getSrcTextMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetMiddleGroundResource {

    @SerializedName("id")
    @Nullable
    private final String id;

    @Nullable
    private final String releasedAt;

    @SerializedName("srcTextMap")
    @Nullable
    private final Map<String, String> srcTextMap;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("url")
    @Nullable
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetMiddleGroundResource)) {
            return false;
        }
        AssetMiddleGroundResource assetMiddleGroundResource = (AssetMiddleGroundResource) other;
        return Intrinsics.areEqual(this.id, assetMiddleGroundResource.id) && Intrinsics.areEqual(this.title, assetMiddleGroundResource.title) && Intrinsics.areEqual(this.url, assetMiddleGroundResource.url) && Intrinsics.areEqual(this.releasedAt, assetMiddleGroundResource.releasedAt) && Intrinsics.areEqual(this.srcTextMap, assetMiddleGroundResource.srcTextMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetMiddleGroundResource copy$default(AssetMiddleGroundResource assetMiddleGroundResource, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetMiddleGroundResource.id;
        }
        if ((i11 & 2) != 0) {
            str2 = assetMiddleGroundResource.title;
        }
        if ((i11 & 4) != 0) {
            str3 = assetMiddleGroundResource.url;
        }
        if ((i11 & 8) != 0) {
            str4 = assetMiddleGroundResource.releasedAt;
        }
        if ((i11 & 16) != 0) {
            map = assetMiddleGroundResource.srcTextMap;
        }
        Map map2 = map;
        String str5 = str3;
        return assetMiddleGroundResource.copy(str, str2, str5, str4, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReleasedAt() {
        return this.releasedAt;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.srcTextMap;
    }

    @NotNull
    public final AssetMiddleGroundResource copy(@Nullable String id2, @Nullable String title, @Nullable String url, @Nullable String releasedAt, @Nullable Map<String, String> srcTextMap) {
        return new AssetMiddleGroundResource(id2, title, url, releasedAt, srcTextMap);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getReleasedAt() {
        return this.releasedAt;
    }

    @Nullable
    public final Map<String, String> getSrcTextMap() {
        return this.srcTextMap;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.releasedAt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.srcTextMap;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetMiddleGroundResource(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", releasedAt=" + this.releasedAt + ", srcTextMap=" + this.srcTextMap + ')';
    }

    public AssetMiddleGroundResource(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.releasedAt = str4;
        this.srcTextMap = map;
    }
}
