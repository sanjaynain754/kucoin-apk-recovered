package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MiddleGroundResource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007HÆ\u0003JI\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR(\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/data/entities/MiddleGroundResource;", "", "id", "", "title", "url", "srcTextMap", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getSrcTextMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MiddleGroundResource {

    @SerializedName("id")
    @Nullable
    private final String id;

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
        if (!(other instanceof MiddleGroundResource)) {
            return false;
        }
        MiddleGroundResource middleGroundResource = (MiddleGroundResource) other;
        return Intrinsics.areEqual(this.id, middleGroundResource.id) && Intrinsics.areEqual(this.title, middleGroundResource.title) && Intrinsics.areEqual(this.url, middleGroundResource.url) && Intrinsics.areEqual(this.srcTextMap, middleGroundResource.srcTextMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiddleGroundResource copy$default(MiddleGroundResource middleGroundResource, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = middleGroundResource.id;
        }
        if ((i11 & 2) != 0) {
            str2 = middleGroundResource.title;
        }
        if ((i11 & 4) != 0) {
            str3 = middleGroundResource.url;
        }
        if ((i11 & 8) != 0) {
            map = middleGroundResource.srcTextMap;
        }
        return middleGroundResource.copy(str, str2, str3, map);
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
    public final Map<String, String> component4() {
        return this.srcTextMap;
    }

    @NotNull
    public final MiddleGroundResource copy(@Nullable String id2, @Nullable String title, @Nullable String url, @Nullable Map<String, String> srcTextMap) {
        return new MiddleGroundResource(id2, title, url, srcTextMap);
    }

    @Nullable
    public final String getId() {
        return this.id;
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
        Map<String, String> map = this.srcTextMap;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MiddleGroundResource(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", srcTextMap=" + this.srcTextMap + ')';
    }

    public MiddleGroundResource(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.srcTextMap = map;
    }
}
