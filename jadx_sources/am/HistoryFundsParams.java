package am;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: am.a, reason: from toString */
/* JADX INFO: compiled from: HistoryPageParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJh\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;", "", "side", "", "type", "fundsType", FirebaseAnalytics.Param.CURRENCY, "pageSize", "", "currentPage", "beginTime", "", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/Long;)V", "getSide", "()Ljava/lang/String;", "getType", "getFundsType", "getCurrency", "getPageSize", "()I", "getCurrentPage", "getBeginTime", "()J", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/Long;)Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;", "equals", "", "other", "hashCode", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HistoryFundsParams {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String side;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String type;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String fundsType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String currency;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int pageSize;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int currentPage;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final long beginTime;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final Long endTime;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryFundsParams)) {
            return false;
        }
        HistoryFundsParams historyFundsParams = (HistoryFundsParams) other;
        return Intrinsics.areEqual(this.side, historyFundsParams.side) && Intrinsics.areEqual(this.type, historyFundsParams.type) && Intrinsics.areEqual(this.fundsType, historyFundsParams.fundsType) && Intrinsics.areEqual(this.currency, historyFundsParams.currency) && this.pageSize == historyFundsParams.pageSize && this.currentPage == historyFundsParams.currentPage && this.beginTime == historyFundsParams.beginTime && Intrinsics.areEqual(this.endTime, historyFundsParams.endTime);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.side;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fundsType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Long.hashCode(this.beginTime)) * 31;
        Long l11 = this.endTime;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HistoryFundsParams(side=" + this.side + ", type=" + this.type + ", fundsType=" + this.fundsType + ", currency=" + this.currency + ", pageSize=" + this.pageSize + ", currentPage=" + this.currentPage + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ')';
    }

    public HistoryFundsParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i11, int i12, long j11, @Nullable Long l11) {
        this.side = str;
        this.type = str2;
        this.fundsType = str3;
        this.currency = str4;
        this.pageSize = i11;
        this.currentPage = i12;
        this.beginTime = j11;
        this.endTime = l11;
    }
}
