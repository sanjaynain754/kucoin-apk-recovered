package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchEventUploadEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/search/entity/SearchEventUploadEntity;", "", "resourceId", "", "resourceType", "searchResultType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResourceId", "()Ljava/lang/String;", "getResourceType", "getSearchResultType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchEventUploadEntity {

    @NotNull
    private final String resourceId;

    @NotNull
    private final String resourceType;

    @NotNull
    private final String searchResultType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEventUploadEntity)) {
            return false;
        }
        SearchEventUploadEntity searchEventUploadEntity = (SearchEventUploadEntity) other;
        return Intrinsics.areEqual(this.resourceId, searchEventUploadEntity.resourceId) && Intrinsics.areEqual(this.resourceType, searchEventUploadEntity.resourceType) && Intrinsics.areEqual(this.searchResultType, searchEventUploadEntity.searchResultType);
    }

    public SearchEventUploadEntity(@NotNull String resourceId, @NotNull String resourceType, @NotNull String searchResultType) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(searchResultType, "searchResultType");
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.searchResultType = searchResultType;
    }

    public static /* synthetic */ SearchEventUploadEntity copy$default(SearchEventUploadEntity searchEventUploadEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchEventUploadEntity.resourceId;
        }
        if ((i11 & 2) != 0) {
            str2 = searchEventUploadEntity.resourceType;
        }
        if ((i11 & 4) != 0) {
            str3 = searchEventUploadEntity.searchResultType;
        }
        return searchEventUploadEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSearchResultType() {
        return this.searchResultType;
    }

    @NotNull
    public final SearchEventUploadEntity copy(@NotNull String resourceId, @NotNull String resourceType, @NotNull String searchResultType) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(searchResultType, "searchResultType");
        return new SearchEventUploadEntity(resourceId, resourceType, searchResultType);
    }

    @NotNull
    public final String getResourceId() {
        return this.resourceId;
    }

    @NotNull
    public final String getResourceType() {
        return this.resourceType;
    }

    @NotNull
    public final String getSearchResultType() {
        return this.searchResultType;
    }

    public int hashCode() {
        return (((this.resourceId.hashCode() * 31) + this.resourceType.hashCode()) * 31) + this.searchResultType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchEventUploadEntity(resourceId=" + this.resourceId + ", resourceType=" + this.resourceType + ", searchResultType=" + this.searchResultType + ')';
    }
}
