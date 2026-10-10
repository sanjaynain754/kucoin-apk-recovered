package i20;

import androidx.room.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i20.a, reason: from toString */
/* JADX INFO: compiled from: CallAuctionInfo.kt */
/* JADX INFO: loaded from: classes47.dex */
@Entity
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;", "", "estimatedOpeningPrice", "", "estimatedOpeningVolume", "buyPriceRangeLowerLimit", "buyPriceRangeUpperLimit", "sellPriceRangeLowerLimit", "sellPriceRangeUpperLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEstimatedOpeningPrice", "()Ljava/lang/String;", "setEstimatedOpeningPrice", "(Ljava/lang/String;)V", "getEstimatedOpeningVolume", "setEstimatedOpeningVolume", "getBuyPriceRangeLowerLimit", "setBuyPriceRangeLowerLimit", "getBuyPriceRangeUpperLimit", "setBuyPriceRangeUpperLimit", "getSellPriceRangeLowerLimit", "setSellPriceRangeLowerLimit", "getSellPriceRangeUpperLimit", "setSellPriceRangeUpperLimit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CallAuctionInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public String estimatedOpeningPrice;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public String estimatedOpeningVolume;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public String buyPriceRangeLowerLimit;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public String buyPriceRangeUpperLimit;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public String sellPriceRangeLowerLimit;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public String sellPriceRangeUpperLimit;

    public CallAuctionInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallAuctionInfo)) {
            return false;
        }
        CallAuctionInfo callAuctionInfo = (CallAuctionInfo) other;
        return Intrinsics.areEqual(this.estimatedOpeningPrice, callAuctionInfo.estimatedOpeningPrice) && Intrinsics.areEqual(this.estimatedOpeningVolume, callAuctionInfo.estimatedOpeningVolume) && Intrinsics.areEqual(this.buyPriceRangeLowerLimit, callAuctionInfo.buyPriceRangeLowerLimit) && Intrinsics.areEqual(this.buyPriceRangeUpperLimit, callAuctionInfo.buyPriceRangeUpperLimit) && Intrinsics.areEqual(this.sellPriceRangeLowerLimit, callAuctionInfo.sellPriceRangeLowerLimit) && Intrinsics.areEqual(this.sellPriceRangeUpperLimit, callAuctionInfo.sellPriceRangeUpperLimit);
    }

    public CallAuctionInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.estimatedOpeningPrice = str;
        this.estimatedOpeningVolume = str2;
        this.buyPriceRangeLowerLimit = str3;
        this.buyPriceRangeUpperLimit = str4;
        this.sellPriceRangeLowerLimit = str5;
        this.sellPriceRangeUpperLimit = str6;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CallAuctionInfo m86646a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new CallAuctionInfo(str, str2, str3, str4, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBuyPriceRangeLowerLimit() {
        return this.buyPriceRangeLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBuyPriceRangeUpperLimit() {
        return this.buyPriceRangeUpperLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEstimatedOpeningPrice() {
        return this.estimatedOpeningPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEstimatedOpeningVolume() {
        return this.estimatedOpeningVolume;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSellPriceRangeLowerLimit() {
        return this.sellPriceRangeLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSellPriceRangeUpperLimit() {
        return this.sellPriceRangeUpperLimit;
    }

    /* JADX INFO: renamed from: h */
    public final void m86653h(@Nullable String str) {
        this.buyPriceRangeLowerLimit = str;
    }

    public int hashCode() {
        String str = this.estimatedOpeningPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.estimatedOpeningVolume;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyPriceRangeLowerLimit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buyPriceRangeUpperLimit;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sellPriceRangeLowerLimit;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellPriceRangeUpperLimit;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m86654i(@Nullable String str) {
        this.buyPriceRangeUpperLimit = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m86655j(@Nullable String str) {
        this.estimatedOpeningPrice = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m86656k(@Nullable String str) {
        this.estimatedOpeningVolume = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m86657l(@Nullable String str) {
        this.sellPriceRangeLowerLimit = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m86658m(@Nullable String str) {
        this.sellPriceRangeUpperLimit = str;
    }

    @NotNull
    public String toString() {
        return "CallAuctionInfo(estimatedOpeningPrice=" + this.estimatedOpeningPrice + ", estimatedOpeningVolume=" + this.estimatedOpeningVolume + ", buyPriceRangeLowerLimit=" + this.buyPriceRangeLowerLimit + ", buyPriceRangeUpperLimit=" + this.buyPriceRangeUpperLimit + ", sellPriceRangeLowerLimit=" + this.sellPriceRangeLowerLimit + ", sellPriceRangeUpperLimit=" + this.sellPriceRangeUpperLimit + ')';
    }

    public /* synthetic */ CallAuctionInfo(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}
