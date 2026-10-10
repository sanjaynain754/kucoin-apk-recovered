package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.search.utils.SearchTabTitle;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchResultViewData.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m90084d2 = {"Lcom/kubi/search/entity/SearchResultViewData;", "", "searchKey", "", "spotDataList", "", "Lcom/kubi/search/entity/SearchItemData;", "futuresDataList", "earnDataList", "web3DataList", "alphaDataList", "depositInfo", "Lcom/kubi/search/entity/SearchItemDepositInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/search/entity/SearchItemDepositInfo;)V", "getSearchKey", "()Ljava/lang/String;", "getSpotDataList", "()Ljava/util/List;", "getFuturesDataList", "getEarnDataList", "getWeb3DataList", "getAlphaDataList", "getDepositInfo", "()Lcom/kubi/search/entity/SearchItemDepositInfo;", "hasData", "", "convertAll", "Lcom/kubi/search/entity/ISearchResultData;", "isNotOnlyThis", "category", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultViewData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultViewData.kt\ncom/kubi/search/entity/SearchResultViewData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1#2:152\n543#3,6:153\n*S KotlinDebug\n*F\n+ 1 SearchResultViewData.kt\ncom/kubi/search/entity/SearchResultViewData\n*L\n136#1:153,6\n*E\n"})
public final /* data */ class SearchResultViewData {

    @NotNull
    private final List<SearchItemData> alphaDataList;

    @Nullable
    private final SearchItemDepositInfo depositInfo;

    @NotNull
    private final List<SearchItemData> earnDataList;

    @NotNull
    private final List<SearchItemData> futuresDataList;

    @NotNull
    private final String searchKey;

    @NotNull
    private final List<SearchItemData> spotDataList;

    @NotNull
    private final List<SearchItemData> web3DataList;

    public SearchResultViewData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultViewData copy$default(SearchResultViewData searchResultViewData, String str, List list, List list2, List list3, List list4, List list5, SearchItemDepositInfo searchItemDepositInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchResultViewData.searchKey;
        }
        if ((i11 & 2) != 0) {
            list = searchResultViewData.spotDataList;
        }
        if ((i11 & 4) != 0) {
            list2 = searchResultViewData.futuresDataList;
        }
        if ((i11 & 8) != 0) {
            list3 = searchResultViewData.earnDataList;
        }
        if ((i11 & 16) != 0) {
            list4 = searchResultViewData.web3DataList;
        }
        if ((i11 & 32) != 0) {
            list5 = searchResultViewData.alphaDataList;
        }
        if ((i11 & 64) != 0) {
            searchItemDepositInfo = searchResultViewData.depositInfo;
        }
        List list6 = list5;
        SearchItemDepositInfo searchItemDepositInfo2 = searchItemDepositInfo;
        List list7 = list4;
        List list8 = list2;
        return searchResultViewData.copy(str, list, list8, list3, list7, list6, searchItemDepositInfo2);
    }

    @NotNull
    public final List<ISearchResultData> convertAll() {
        ArrayList arrayList = new ArrayList();
        SearchItemDepositInfo searchItemDepositInfo = this.depositInfo;
        if (searchItemDepositInfo != null) {
            arrayList.add(searchItemDepositInfo);
        }
        Object obj = null;
        if (!this.spotDataList.isEmpty()) {
            arrayList.add(new SearchItemHeader(SearchTabTitle.m59597i(SearchTabTitle.f49156a, null, 1, null)));
            if (isNotOnlyThis(SearchCategory$Companion.SPOT)) {
                arrayList.addAll(CollectionsKt.take(this.spotDataList, 3));
                if (this.spotDataList.size() > 3) {
                    arrayList.add(new SearchItemMore(SearchCategory$Companion.SPOT, this.spotDataList.size()));
                }
                arrayList.add(new SearchItemDivider());
            } else {
                arrayList.addAll(this.spotDataList);
            }
        }
        if (!this.alphaDataList.isEmpty()) {
            arrayList.add(new SearchItemHeader(SearchTabTitle.m59594c(SearchTabTitle.f49156a, null, 1, null)));
            if (isNotOnlyThis("alpha")) {
                arrayList.addAll(CollectionsKt.take(this.alphaDataList, 3));
                if (this.alphaDataList.size() > 3) {
                    arrayList.add(new SearchItemMore("alpha", this.alphaDataList.size()));
                }
                arrayList.add(new SearchItemDivider());
            } else {
                arrayList.addAll(this.alphaDataList);
            }
        }
        if (!this.futuresDataList.isEmpty()) {
            arrayList.add(new SearchItemHeader(SearchTabTitle.m59596g(SearchTabTitle.f49156a, null, 1, null)));
            if (isNotOnlyThis(SearchCategory$Companion.FUTURES)) {
                arrayList.addAll(CollectionsKt.take(this.futuresDataList, 3));
                if (this.futuresDataList.size() > 3) {
                    arrayList.add(new SearchItemMore(SearchCategory$Companion.FUTURES, this.futuresDataList.size()));
                }
                arrayList.add(new SearchItemDivider());
            } else {
                arrayList.addAll(this.futuresDataList);
            }
        }
        if (!this.earnDataList.isEmpty()) {
            arrayList.add(new SearchItemHeader(SearchTabTitle.m59595e(SearchTabTitle.f49156a, null, 1, null)));
            if (isNotOnlyThis(SearchCategory$Companion.EARN)) {
                arrayList.addAll(CollectionsKt.take(this.earnDataList, 3));
                if (this.earnDataList.size() > 3) {
                    arrayList.add(new SearchItemMore(SearchCategory$Companion.EARN, this.earnDataList.size()));
                }
                arrayList.add(new SearchItemDivider());
            } else {
                arrayList.addAll(this.earnDataList);
            }
        }
        if (!this.web3DataList.isEmpty()) {
            arrayList.add(new SearchWeb3ItemHeader());
            if (isNotOnlyThis(SearchCategory$Companion.WEB3)) {
                arrayList.addAll(CollectionsKt.take(this.web3DataList, 3));
                if (this.web3DataList.size() > 3) {
                    arrayList.add(new SearchItemMore(SearchCategory$Companion.WEB3, this.web3DataList.size()));
                }
                arrayList.add(new SearchItemDivider());
            } else {
                arrayList.addAll(this.web3DataList);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((ISearchResultData) objPrevious) instanceof SearchItemDivider) {
                obj = objPrevious;
                break;
            }
        }
        ISearchResultData iSearchResultData = (ISearchResultData) obj;
        if (iSearchResultData != null) {
            arrayList.remove(iSearchResultData);
        }
        return CollectionsKt.toList(arrayList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultViewData)) {
            return false;
        }
        SearchResultViewData searchResultViewData = (SearchResultViewData) other;
        return Intrinsics.areEqual(this.searchKey, searchResultViewData.searchKey) && Intrinsics.areEqual(this.spotDataList, searchResultViewData.spotDataList) && Intrinsics.areEqual(this.futuresDataList, searchResultViewData.futuresDataList) && Intrinsics.areEqual(this.earnDataList, searchResultViewData.earnDataList) && Intrinsics.areEqual(this.web3DataList, searchResultViewData.web3DataList) && Intrinsics.areEqual(this.alphaDataList, searchResultViewData.alphaDataList) && Intrinsics.areEqual(this.depositInfo, searchResultViewData.depositInfo);
    }

    public SearchResultViewData(@NotNull String searchKey, @NotNull List<SearchItemData> spotDataList, @NotNull List<SearchItemData> futuresDataList, @NotNull List<SearchItemData> earnDataList, @NotNull List<SearchItemData> web3DataList, @NotNull List<SearchItemData> alphaDataList, @Nullable SearchItemDepositInfo searchItemDepositInfo) {
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(spotDataList, "spotDataList");
        Intrinsics.checkNotNullParameter(futuresDataList, "futuresDataList");
        Intrinsics.checkNotNullParameter(earnDataList, "earnDataList");
        Intrinsics.checkNotNullParameter(web3DataList, "web3DataList");
        Intrinsics.checkNotNullParameter(alphaDataList, "alphaDataList");
        this.searchKey = searchKey;
        this.spotDataList = spotDataList;
        this.futuresDataList = futuresDataList;
        this.earnDataList = earnDataList;
        this.web3DataList = web3DataList;
        this.alphaDataList = alphaDataList;
        this.depositInfo = searchItemDepositInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchKey() {
        return this.searchKey;
    }

    @NotNull
    public final List<SearchItemData> component2() {
        return this.spotDataList;
    }

    @NotNull
    public final List<SearchItemData> component3() {
        return this.futuresDataList;
    }

    @NotNull
    public final List<SearchItemData> component4() {
        return this.earnDataList;
    }

    @NotNull
    public final List<SearchItemData> component5() {
        return this.web3DataList;
    }

    @NotNull
    public final List<SearchItemData> component6() {
        return this.alphaDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SearchItemDepositInfo getDepositInfo() {
        return this.depositInfo;
    }

    @NotNull
    public final SearchResultViewData copy(@NotNull String searchKey, @NotNull List<SearchItemData> spotDataList, @NotNull List<SearchItemData> futuresDataList, @NotNull List<SearchItemData> earnDataList, @NotNull List<SearchItemData> web3DataList, @NotNull List<SearchItemData> alphaDataList, @Nullable SearchItemDepositInfo depositInfo) {
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(spotDataList, "spotDataList");
        Intrinsics.checkNotNullParameter(futuresDataList, "futuresDataList");
        Intrinsics.checkNotNullParameter(earnDataList, "earnDataList");
        Intrinsics.checkNotNullParameter(web3DataList, "web3DataList");
        Intrinsics.checkNotNullParameter(alphaDataList, "alphaDataList");
        return new SearchResultViewData(searchKey, spotDataList, futuresDataList, earnDataList, web3DataList, alphaDataList, depositInfo);
    }

    @NotNull
    public final List<SearchItemData> getAlphaDataList() {
        return this.alphaDataList;
    }

    @Nullable
    public final SearchItemDepositInfo getDepositInfo() {
        return this.depositInfo;
    }

    @NotNull
    public final List<SearchItemData> getEarnDataList() {
        return this.earnDataList;
    }

    @NotNull
    public final List<SearchItemData> getFuturesDataList() {
        return this.futuresDataList;
    }

    @NotNull
    public final String getSearchKey() {
        return this.searchKey;
    }

    @NotNull
    public final List<SearchItemData> getSpotDataList() {
        return this.spotDataList;
    }

    @NotNull
    public final List<SearchItemData> getWeb3DataList() {
        return this.web3DataList;
    }

    public final boolean hasData() {
        return (this.spotDataList.isEmpty() && this.futuresDataList.isEmpty() && this.earnDataList.isEmpty() && this.web3DataList.isEmpty() && this.alphaDataList.isEmpty() && this.depositInfo == null) ? false : true;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.searchKey.hashCode() * 31) + this.spotDataList.hashCode()) * 31) + this.futuresDataList.hashCode()) * 31) + this.earnDataList.hashCode()) * 31) + this.web3DataList.hashCode()) * 31) + this.alphaDataList.hashCode()) * 31;
        SearchItemDepositInfo searchItemDepositInfo = this.depositInfo;
        return iHashCode + (searchItemDepositInfo == null ? 0 : searchItemDepositInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "SearchResultViewData(searchKey=" + this.searchKey + ", spotDataList=" + this.spotDataList + ", futuresDataList=" + this.futuresDataList + ", earnDataList=" + this.earnDataList + ", web3DataList=" + this.web3DataList + ", alphaDataList=" + this.alphaDataList + ", depositInfo=" + this.depositInfo + ')';
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean isNotOnlyThis(String category) {
        switch (category.hashCode()) {
            case -503567600:
                if (category.equals(SearchCategory$Companion.FUTURES)) {
                    if (!this.spotDataList.isEmpty() || !this.earnDataList.isEmpty() || !this.web3DataList.isEmpty() || !this.alphaDataList.isEmpty()) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 3105752:
                if (category.equals(SearchCategory$Companion.EARN)) {
                    if (!this.spotDataList.isEmpty() || !this.futuresDataList.isEmpty() || !this.web3DataList.isEmpty() || !this.alphaDataList.isEmpty()) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 3537154:
                if (category.equals(SearchCategory$Companion.SPOT)) {
                    if (!this.futuresDataList.isEmpty() || !this.earnDataList.isEmpty() || !this.web3DataList.isEmpty() || !this.alphaDataList.isEmpty()) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 3645279:
                if (category.equals(SearchCategory$Companion.WEB3)) {
                    if (!this.spotDataList.isEmpty() || !this.futuresDataList.isEmpty() || !this.earnDataList.isEmpty() || !this.alphaDataList.isEmpty()) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 92909918:
                if (category.equals("alpha")) {
                    if (!this.spotDataList.isEmpty() || !this.futuresDataList.isEmpty() || !this.earnDataList.isEmpty() || !this.web3DataList.isEmpty()) {
                        return true;
                    }
                    return false;
                }
                return false;
            default:
                return false;
        }
    }

    public /* synthetic */ SearchResultViewData(String str, List list, List list2, List list3, List list4, List list5, SearchItemDepositInfo searchItemDepositInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list3, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list4, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list5, (i11 & 64) != 0 ? null : searchItemDepositInfo);
    }
}
