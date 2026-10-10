package com.kubi.search.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, m90084d2 = {"Lcom/kubi/search/entity/SearchEntity;", "", "describe", "", "resourceId", "resourceType", "searchResultType", "resourceHits", "", "resourceHitStr", "resourceExtend", "Lcom/kubi/search/entity/ExtendEntity;", "coinLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/kubi/search/entity/ExtendEntity;Ljava/lang/String;)V", "getDescribe", "()Ljava/lang/String;", "getResourceId", "getResourceType", "getSearchResultType", "getResourceHits", "()Ljava/util/List;", "getResourceHitStr", "getResourceExtend", "()Lcom/kubi/search/entity/ExtendEntity;", "getCoinLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchEntity {

    @Nullable
    private final String coinLabel;

    @Nullable
    private final String describe;

    @Nullable
    private final ExtendEntity resourceExtend;

    @Nullable
    private final String resourceHitStr;

    @Nullable
    private final List<String> resourceHits;

    @Nullable
    private final String resourceId;

    @Nullable
    private final String resourceType;

    @Nullable
    private final String searchResultType;

    public SearchEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchEntity copy$default(SearchEntity searchEntity, String str, String str2, String str3, String str4, List list, String str5, ExtendEntity extendEntity, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchEntity.describe;
        }
        if ((i11 & 2) != 0) {
            str2 = searchEntity.resourceId;
        }
        if ((i11 & 4) != 0) {
            str3 = searchEntity.resourceType;
        }
        if ((i11 & 8) != 0) {
            str4 = searchEntity.searchResultType;
        }
        if ((i11 & 16) != 0) {
            list = searchEntity.resourceHits;
        }
        if ((i11 & 32) != 0) {
            str5 = searchEntity.resourceHitStr;
        }
        if ((i11 & 64) != 0) {
            extendEntity = searchEntity.resourceExtend;
        }
        if ((i11 & 128) != 0) {
            str6 = searchEntity.coinLabel;
        }
        ExtendEntity extendEntity2 = extendEntity;
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        return searchEntity.copy(str, str2, str3, str4, list2, str8, extendEntity2, str7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEntity)) {
            return false;
        }
        SearchEntity searchEntity = (SearchEntity) other;
        return Intrinsics.areEqual(this.describe, searchEntity.describe) && Intrinsics.areEqual(this.resourceId, searchEntity.resourceId) && Intrinsics.areEqual(this.resourceType, searchEntity.resourceType) && Intrinsics.areEqual(this.searchResultType, searchEntity.searchResultType) && Intrinsics.areEqual(this.resourceHits, searchEntity.resourceHits) && Intrinsics.areEqual(this.resourceHitStr, searchEntity.resourceHitStr) && Intrinsics.areEqual(this.resourceExtend, searchEntity.resourceExtend) && Intrinsics.areEqual(this.coinLabel, searchEntity.coinLabel);
    }

    public SearchEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable ExtendEntity extendEntity, @Nullable String str6) {
        this.describe = str;
        this.resourceId = str2;
        this.resourceType = str3;
        this.searchResultType = str4;
        this.resourceHits = list;
        this.resourceHitStr = str5;
        this.resourceExtend = extendEntity;
        this.coinLabel = str6;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSearchResultType() {
        return this.searchResultType;
    }

    @Nullable
    public final List<String> component5() {
        return this.resourceHits;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResourceHitStr() {
        return this.resourceHitStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExtendEntity getResourceExtend() {
        return this.resourceExtend;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @NotNull
    public final SearchEntity copy(@Nullable String describe, @Nullable String resourceId, @Nullable String resourceType, @Nullable String searchResultType, @Nullable List<String> resourceHits, @Nullable String resourceHitStr, @Nullable ExtendEntity resourceExtend, @Nullable String coinLabel) {
        return new SearchEntity(describe, resourceId, resourceType, searchResultType, resourceHits, resourceHitStr, resourceExtend, coinLabel);
    }

    @Nullable
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @Nullable
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    public final ExtendEntity getResourceExtend() {
        return this.resourceExtend;
    }

    @Nullable
    public final String getResourceHitStr() {
        return this.resourceHitStr;
    }

    @Nullable
    public final List<String> getResourceHits() {
        return this.resourceHits;
    }

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getSearchResultType() {
        return this.searchResultType;
    }

    public int hashCode() {
        String str = this.describe;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resourceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resourceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchResultType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.resourceHits;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.resourceHitStr;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ExtendEntity extendEntity = this.resourceExtend;
        int iHashCode7 = (iHashCode6 + (extendEntity == null ? 0 : extendEntity.hashCode())) * 31;
        String str6 = this.coinLabel;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchEntity(describe=" + this.describe + ", resourceId=" + this.resourceId + ", resourceType=" + this.resourceType + ", searchResultType=" + this.searchResultType + ", resourceHits=" + this.resourceHits + ", resourceHitStr=" + this.resourceHitStr + ", resourceExtend=" + this.resourceExtend + ", coinLabel=" + this.coinLabel + ')';
    }

    public /* synthetic */ SearchEntity(String str, String str2, String str3, String str4, List list, String str5, ExtendEntity extendEntity, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : extendEntity, (i11 & 128) != 0 ? null : str6);
    }
}
