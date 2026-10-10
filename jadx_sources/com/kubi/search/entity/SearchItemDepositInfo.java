package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ISearchResultData.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/search/entity/SearchItemDepositInfo;", "Lcom/kubi/search/entity/ISearchResultData;", "coinName", "", "depositUrl", "otcUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoinName", "()Ljava/lang/String;", "getDepositUrl", "getOtcUrl", "getItemType", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchItemDepositInfo implements ISearchResultData {

    @NotNull
    private final String coinName;

    @Nullable
    private final String depositUrl;

    @Nullable
    private final String otcUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchItemDepositInfo)) {
            return false;
        }
        SearchItemDepositInfo searchItemDepositInfo = (SearchItemDepositInfo) other;
        return Intrinsics.areEqual(this.coinName, searchItemDepositInfo.coinName) && Intrinsics.areEqual(this.depositUrl, searchItemDepositInfo.depositUrl) && Intrinsics.areEqual(this.otcUrl, searchItemDepositInfo.otcUrl);
    }

    public SearchItemDepositInfo(@NotNull String coinName, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        this.coinName = coinName;
        this.depositUrl = str;
        this.otcUrl = str2;
    }

    public static /* synthetic */ SearchItemDepositInfo copy$default(SearchItemDepositInfo searchItemDepositInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchItemDepositInfo.coinName;
        }
        if ((i11 & 2) != 0) {
            str2 = searchItemDepositInfo.depositUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = searchItemDepositInfo.otcUrl;
        }
        return searchItemDepositInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDepositUrl() {
        return this.depositUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOtcUrl() {
        return this.otcUrl;
    }

    @NotNull
    public final SearchItemDepositInfo copy(@NotNull String coinName, @Nullable String depositUrl, @Nullable String otcUrl) {
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        return new SearchItemDepositInfo(coinName, depositUrl, otcUrl);
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    @Nullable
    public final String getDepositUrl() {
        return this.depositUrl;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getType() {
        return 8;
    }

    @Nullable
    public final String getOtcUrl() {
        return this.otcUrl;
    }

    public int hashCode() {
        int iHashCode = this.coinName.hashCode() * 31;
        String str = this.depositUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.otcUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchItemDepositInfo(coinName=" + this.coinName + ", depositUrl=" + this.depositUrl + ", otcUrl=" + this.otcUrl + ')';
    }
}
