package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchRecommendWrap.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/search/entity/SearchRecommendWrap;", "", "spotList", "", "Lcom/kubi/data/entity/TradeItemBean;", "futureList", "Lcom/kubi/search/entity/ContractTradeItemBean;", "earnList", "Lcom/kubi/search/entity/ExtendEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSpotList", "()Ljava/util/List;", "getFutureList", "getEarnList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchRecommendWrap {

    @NotNull
    private final List<ExtendEntity> earnList;

    @NotNull
    private final List<ContractTradeItemBean> futureList;

    @NotNull
    private final List<TradeItemBean> spotList;

    public SearchRecommendWrap() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRecommendWrap)) {
            return false;
        }
        SearchRecommendWrap searchRecommendWrap = (SearchRecommendWrap) other;
        return Intrinsics.areEqual(this.spotList, searchRecommendWrap.spotList) && Intrinsics.areEqual(this.futureList, searchRecommendWrap.futureList) && Intrinsics.areEqual(this.earnList, searchRecommendWrap.earnList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchRecommendWrap(@NotNull List<? extends TradeItemBean> spotList, @NotNull List<ContractTradeItemBean> futureList, @NotNull List<ExtendEntity> earnList) {
        Intrinsics.checkNotNullParameter(spotList, "spotList");
        Intrinsics.checkNotNullParameter(futureList, "futureList");
        Intrinsics.checkNotNullParameter(earnList, "earnList");
        this.spotList = spotList;
        this.futureList = futureList;
        this.earnList = earnList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchRecommendWrap copy$default(SearchRecommendWrap searchRecommendWrap, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchRecommendWrap.spotList;
        }
        if ((i11 & 2) != 0) {
            list2 = searchRecommendWrap.futureList;
        }
        if ((i11 & 4) != 0) {
            list3 = searchRecommendWrap.earnList;
        }
        return searchRecommendWrap.copy(list, list2, list3);
    }

    @NotNull
    public final List<TradeItemBean> component1() {
        return this.spotList;
    }

    @NotNull
    public final List<ContractTradeItemBean> component2() {
        return this.futureList;
    }

    @NotNull
    public final List<ExtendEntity> component3() {
        return this.earnList;
    }

    @NotNull
    public final SearchRecommendWrap copy(@NotNull List<? extends TradeItemBean> spotList, @NotNull List<ContractTradeItemBean> futureList, @NotNull List<ExtendEntity> earnList) {
        Intrinsics.checkNotNullParameter(spotList, "spotList");
        Intrinsics.checkNotNullParameter(futureList, "futureList");
        Intrinsics.checkNotNullParameter(earnList, "earnList");
        return new SearchRecommendWrap(spotList, futureList, earnList);
    }

    @NotNull
    public final List<ExtendEntity> getEarnList() {
        return this.earnList;
    }

    @NotNull
    public final List<ContractTradeItemBean> getFutureList() {
        return this.futureList;
    }

    @NotNull
    public final List<TradeItemBean> getSpotList() {
        return this.spotList;
    }

    public int hashCode() {
        return (((this.spotList.hashCode() * 31) + this.futureList.hashCode()) * 31) + this.earnList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchRecommendWrap(spotList=" + this.spotList + ", futureList=" + this.futureList + ", earnList=" + this.earnList + ')';
    }

    public /* synthetic */ SearchRecommendWrap(List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
