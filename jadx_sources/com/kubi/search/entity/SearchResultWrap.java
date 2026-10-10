package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.search.searchresult.SearchCategory$Companion;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultWrap.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003Jy\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006,"}, m90084d2 = {"Lcom/kubi/search/entity/SearchResultWrap;", "", "success", "", "searchKey", "", "spots", "", "Lcom/kubi/search/entity/SearchItemData;", SearchCategory$Companion.FUTURES, "earns", SearchCategory$Companion.WEB3, "depositInfo", "Lcom/kubi/search/entity/SearchItemDepositInfo;", "alpha", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/search/entity/SearchItemDepositInfo;Ljava/util/List;)V", "getSuccess", "()Z", "getSearchKey", "()Ljava/lang/String;", "getSpots", "()Ljava/util/List;", "getFutures", "getEarns", "getWeb3", "getDepositInfo", "()Lcom/kubi/search/entity/SearchItemDepositInfo;", "getAlpha", "isNotEmpty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchResultWrap {

    @NotNull
    private final List<SearchItemData> alpha;

    @Nullable
    private final SearchItemDepositInfo depositInfo;

    @NotNull
    private final List<SearchItemData> earns;

    @NotNull
    private final List<SearchItemData> futures;

    @NotNull
    private final String searchKey;

    @NotNull
    private final List<SearchItemData> spots;
    private final boolean success;

    @NotNull
    private final List<SearchItemData> web3;

    public SearchResultWrap(boolean z11, @NotNull String searchKey, @NotNull List<SearchItemData> spots, @NotNull List<SearchItemData> futures, @NotNull List<SearchItemData> earns, @NotNull List<SearchItemData> web3, @Nullable SearchItemDepositInfo searchItemDepositInfo, @NotNull List<SearchItemData> alpha) {
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(spots, "spots");
        Intrinsics.checkNotNullParameter(futures, "futures");
        Intrinsics.checkNotNullParameter(earns, "earns");
        Intrinsics.checkNotNullParameter(web3, "web3");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        this.success = z11;
        this.searchKey = searchKey;
        this.spots = spots;
        this.futures = futures;
        this.earns = earns;
        this.web3 = web3;
        this.depositInfo = searchItemDepositInfo;
        this.alpha = alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultWrap copy$default(SearchResultWrap searchResultWrap, boolean z11, String str, List list, List list2, List list3, List list4, SearchItemDepositInfo searchItemDepositInfo, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = searchResultWrap.success;
        }
        if ((i11 & 2) != 0) {
            str = searchResultWrap.searchKey;
        }
        if ((i11 & 4) != 0) {
            list = searchResultWrap.spots;
        }
        if ((i11 & 8) != 0) {
            list2 = searchResultWrap.futures;
        }
        if ((i11 & 16) != 0) {
            list3 = searchResultWrap.earns;
        }
        if ((i11 & 32) != 0) {
            list4 = searchResultWrap.web3;
        }
        if ((i11 & 64) != 0) {
            searchItemDepositInfo = searchResultWrap.depositInfo;
        }
        if ((i11 & 128) != 0) {
            list5 = searchResultWrap.alpha;
        }
        SearchItemDepositInfo searchItemDepositInfo2 = searchItemDepositInfo;
        List list6 = list5;
        List list7 = list3;
        List list8 = list4;
        return searchResultWrap.copy(z11, str, list, list2, list7, list8, searchItemDepositInfo2, list6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultWrap)) {
            return false;
        }
        SearchResultWrap searchResultWrap = (SearchResultWrap) other;
        return this.success == searchResultWrap.success && Intrinsics.areEqual(this.searchKey, searchResultWrap.searchKey) && Intrinsics.areEqual(this.spots, searchResultWrap.spots) && Intrinsics.areEqual(this.futures, searchResultWrap.futures) && Intrinsics.areEqual(this.earns, searchResultWrap.earns) && Intrinsics.areEqual(this.web3, searchResultWrap.web3) && Intrinsics.areEqual(this.depositInfo, searchResultWrap.depositInfo) && Intrinsics.areEqual(this.alpha, searchResultWrap.alpha);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSearchKey() {
        return this.searchKey;
    }

    @NotNull
    public final List<SearchItemData> component3() {
        return this.spots;
    }

    @NotNull
    public final List<SearchItemData> component4() {
        return this.futures;
    }

    @NotNull
    public final List<SearchItemData> component5() {
        return this.earns;
    }

    @NotNull
    public final List<SearchItemData> component6() {
        return this.web3;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SearchItemDepositInfo getDepositInfo() {
        return this.depositInfo;
    }

    @NotNull
    public final List<SearchItemData> component8() {
        return this.alpha;
    }

    @NotNull
    public final SearchResultWrap copy(boolean success, @NotNull String searchKey, @NotNull List<SearchItemData> spots, @NotNull List<SearchItemData> futures, @NotNull List<SearchItemData> earns, @NotNull List<SearchItemData> web3, @Nullable SearchItemDepositInfo depositInfo, @NotNull List<SearchItemData> alpha) {
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(spots, "spots");
        Intrinsics.checkNotNullParameter(futures, "futures");
        Intrinsics.checkNotNullParameter(earns, "earns");
        Intrinsics.checkNotNullParameter(web3, "web3");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        return new SearchResultWrap(success, searchKey, spots, futures, earns, web3, depositInfo, alpha);
    }

    @NotNull
    public final List<SearchItemData> getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final SearchItemDepositInfo getDepositInfo() {
        return this.depositInfo;
    }

    @NotNull
    public final List<SearchItemData> getEarns() {
        return this.earns;
    }

    @NotNull
    public final List<SearchItemData> getFutures() {
        return this.futures;
    }

    @NotNull
    public final String getSearchKey() {
        return this.searchKey;
    }

    @NotNull
    public final List<SearchItemData> getSpots() {
        return this.spots;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final List<SearchItemData> getWeb3() {
        return this.web3;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.success) * 31) + this.searchKey.hashCode()) * 31) + this.spots.hashCode()) * 31) + this.futures.hashCode()) * 31) + this.earns.hashCode()) * 31) + this.web3.hashCode()) * 31;
        SearchItemDepositInfo searchItemDepositInfo = this.depositInfo;
        return ((iHashCode + (searchItemDepositInfo == null ? 0 : searchItemDepositInfo.hashCode())) * 31) + this.alpha.hashCode();
    }

    public final boolean isNotEmpty() {
        return (this.spots.isEmpty() && this.futures.isEmpty() && this.earns.isEmpty() && this.web3.isEmpty() && this.alpha.isEmpty()) ? false : true;
    }

    @NotNull
    public String toString() {
        return "SearchResultWrap(success=" + this.success + ", searchKey=" + this.searchKey + ", spots=" + this.spots + ", futures=" + this.futures + ", earns=" + this.earns + ", web3=" + this.web3 + ", depositInfo=" + this.depositInfo + ", alpha=" + this.alpha + ')';
    }

    public /* synthetic */ SearchResultWrap(boolean z11, String str, List list, List list2, List list3, List list4, SearchItemDepositInfo searchItemDepositInfo, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, list, list2, list3, list4, (i11 & 64) != 0 ? null : searchItemDepositInfo, list5);
    }
}
