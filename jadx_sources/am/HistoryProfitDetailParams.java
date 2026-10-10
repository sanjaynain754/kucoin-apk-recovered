package am;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: am.b, reason: from toString */
/* JADX INFO: compiled from: HistoryPageParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;", "", "id", "", "currentPage", "", "pageSize", "isTrialFunds", "", "openTime", "closeTime", "<init>", "(Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCurrentPage", "()I", "getPageSize", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOpenTime", "getCloseTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;", "equals", "other", "hashCode", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HistoryProfitDetailParams {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int currentPage;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int pageSize;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean isTrialFunds;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String openTime;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String closeTime;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryProfitDetailParams)) {
            return false;
        }
        HistoryProfitDetailParams historyProfitDetailParams = (HistoryProfitDetailParams) other;
        return Intrinsics.areEqual(this.id, historyProfitDetailParams.id) && this.currentPage == historyProfitDetailParams.currentPage && this.pageSize == historyProfitDetailParams.pageSize && Intrinsics.areEqual(this.isTrialFunds, historyProfitDetailParams.isTrialFunds) && Intrinsics.areEqual(this.openTime, historyProfitDetailParams.openTime) && Intrinsics.areEqual(this.closeTime, historyProfitDetailParams.closeTime);
    }

    public HistoryProfitDetailParams(@NotNull String id2, int i11, int i12, @Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.currentPage = i11;
        this.pageSize = i12;
        this.isTrialFunds = bool;
        this.openTime = str;
        this.closeTime = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCloseTime() {
        return this.closeTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOpenTime() {
        return this.openTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageSize)) * 31;
        Boolean bool = this.isTrialFunds;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.openTime;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.closeTime;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HistoryProfitDetailParams(id=" + this.id + ", currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", isTrialFunds=" + this.isTrialFunds + ", openTime=" + this.openTime + ", closeTime=" + this.closeTime + ')';
    }
}
