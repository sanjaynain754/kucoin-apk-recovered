package com.kubi.search.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchGuideWordEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/search/entity/SearchGuideWordEntity;", "", "type", "", "value", "valueList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getValue", "getValueList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchGuideWordEntity {

    @Nullable
    private final String type;

    @Nullable
    private final String value;

    @Nullable
    private final List<String> valueList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchGuideWordEntity)) {
            return false;
        }
        SearchGuideWordEntity searchGuideWordEntity = (SearchGuideWordEntity) other;
        return Intrinsics.areEqual(this.type, searchGuideWordEntity.type) && Intrinsics.areEqual(this.value, searchGuideWordEntity.value) && Intrinsics.areEqual(this.valueList, searchGuideWordEntity.valueList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchGuideWordEntity copy$default(SearchGuideWordEntity searchGuideWordEntity, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchGuideWordEntity.type;
        }
        if ((i11 & 2) != 0) {
            str2 = searchGuideWordEntity.value;
        }
        if ((i11 & 4) != 0) {
            list = searchGuideWordEntity.valueList;
        }
        return searchGuideWordEntity.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final List<String> component3() {
        return this.valueList;
    }

    @NotNull
    public final SearchGuideWordEntity copy(@Nullable String type, @Nullable String value, @Nullable List<String> valueList) {
        return new SearchGuideWordEntity(type, value, valueList);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final List<String> getValueList() {
        return this.valueList;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.valueList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchGuideWordEntity(type=" + this.type + ", value=" + this.value + ", valueList=" + this.valueList + ')';
    }

    public SearchGuideWordEntity(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        this.type = str;
        this.value = str2;
        this.valueList = list;
    }
}
