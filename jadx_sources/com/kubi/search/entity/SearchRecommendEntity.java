package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.bugly.proguard.C34052z4;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchRecommendEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/search/entity/SearchRecommendEntity;", "", SearchCategory$Companion.SPOT, "", "Lcom/kubi/search/entity/SpotEntity;", C34052z4.f72599k, "Lcom/kubi/search/entity/FutureEntity;", SearchCategory$Companion.EARN, "Lcom/kubi/search/entity/ExtendEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSpot", "()Ljava/util/List;", "getFeature", "getEarn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchRecommendEntity {

    @Nullable
    private final List<ExtendEntity> earn;

    @Nullable
    private final List<FutureEntity> feature;

    @Nullable
    private final List<SpotEntity> spot;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRecommendEntity)) {
            return false;
        }
        SearchRecommendEntity searchRecommendEntity = (SearchRecommendEntity) other;
        return Intrinsics.areEqual(this.spot, searchRecommendEntity.spot) && Intrinsics.areEqual(this.feature, searchRecommendEntity.feature) && Intrinsics.areEqual(this.earn, searchRecommendEntity.earn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchRecommendEntity copy$default(SearchRecommendEntity searchRecommendEntity, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchRecommendEntity.spot;
        }
        if ((i11 & 2) != 0) {
            list2 = searchRecommendEntity.feature;
        }
        if ((i11 & 4) != 0) {
            list3 = searchRecommendEntity.earn;
        }
        return searchRecommendEntity.copy(list, list2, list3);
    }

    @Nullable
    public final List<SpotEntity> component1() {
        return this.spot;
    }

    @Nullable
    public final List<FutureEntity> component2() {
        return this.feature;
    }

    @Nullable
    public final List<ExtendEntity> component3() {
        return this.earn;
    }

    @NotNull
    public final SearchRecommendEntity copy(@Nullable List<SpotEntity> spot, @Nullable List<FutureEntity> feature, @Nullable List<ExtendEntity> earn) {
        return new SearchRecommendEntity(spot, feature, earn);
    }

    @Nullable
    public final List<ExtendEntity> getEarn() {
        return this.earn;
    }

    @Nullable
    public final List<FutureEntity> getFeature() {
        return this.feature;
    }

    @Nullable
    public final List<SpotEntity> getSpot() {
        return this.spot;
    }

    public int hashCode() {
        List<SpotEntity> list = this.spot;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FutureEntity> list2 = this.feature;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ExtendEntity> list3 = this.earn;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchRecommendEntity(spot=" + this.spot + ", feature=" + this.feature + ", earn=" + this.earn + ')';
    }

    public SearchRecommendEntity(@Nullable List<SpotEntity> list, @Nullable List<FutureEntity> list2, @Nullable List<ExtendEntity> list3) {
        this.spot = list;
        this.feature = list2;
        this.earn = list3;
    }
}
