package p365jb;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jb.b, reason: from toString */
/* JADX INFO: compiled from: UnifiedAccountDetailUiData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\rHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/data/UnifiedAccountDetailUiData;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyIconUrl", "currencyName", "equity", "Ljava/math/BigDecimal;", "availableEquity", "liability", "unrealisedPnl", "unAvailableEquity", "collateralStatus", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyIconUrl", "getCurrencyName", "getEquity", "()Ljava/math/BigDecimal;", "getAvailableEquity", "getLiability", "getUnrealisedPnl", "getUnAvailableEquity", "getCollateralStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/assets/unify/detail/data/UnifiedAccountDetailUiData;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAccountDetailUiData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String currency;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String currencyIconUrl;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String currencyName;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal equity;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final BigDecimal availableEquity;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final BigDecimal liability;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final BigDecimal unrealisedPnl;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final BigDecimal unAvailableEquity;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final Integer collateralStatus;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final String code;

    public UnifiedAccountDetailUiData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Integer num, @Nullable String str4) {
        this.currency = str;
        this.currencyIconUrl = str2;
        this.currencyName = str3;
        this.equity = bigDecimal;
        this.availableEquity = bigDecimal2;
        this.liability = bigDecimal3;
        this.unrealisedPnl = bigDecimal4;
        this.unAvailableEquity = bigDecimal5;
        this.collateralStatus = num;
        this.code = str4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedAccountDetailUiData)) {
            return false;
        }
        UnifiedAccountDetailUiData unifiedAccountDetailUiData = (UnifiedAccountDetailUiData) other;
        return Intrinsics.areEqual(this.currency, unifiedAccountDetailUiData.currency) && Intrinsics.areEqual(this.currencyIconUrl, unifiedAccountDetailUiData.currencyIconUrl) && Intrinsics.areEqual(this.currencyName, unifiedAccountDetailUiData.currencyName) && Intrinsics.areEqual(this.equity, unifiedAccountDetailUiData.equity) && Intrinsics.areEqual(this.availableEquity, unifiedAccountDetailUiData.availableEquity) && Intrinsics.areEqual(this.liability, unifiedAccountDetailUiData.liability) && Intrinsics.areEqual(this.unrealisedPnl, unifiedAccountDetailUiData.unrealisedPnl) && Intrinsics.areEqual(this.unAvailableEquity, unifiedAccountDetailUiData.unAvailableEquity) && Intrinsics.areEqual(this.collateralStatus, unifiedAccountDetailUiData.collateralStatus) && Intrinsics.areEqual(this.code, unifiedAccountDetailUiData.code);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ UnifiedAccountDetailUiData m88950b(UnifiedAccountDetailUiData unifiedAccountDetailUiData, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedAccountDetailUiData.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = unifiedAccountDetailUiData.currencyIconUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = unifiedAccountDetailUiData.currencyName;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = unifiedAccountDetailUiData.equity;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = unifiedAccountDetailUiData.availableEquity;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = unifiedAccountDetailUiData.liability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = unifiedAccountDetailUiData.unrealisedPnl;
        }
        if ((i11 & 128) != 0) {
            bigDecimal5 = unifiedAccountDetailUiData.unAvailableEquity;
        }
        if ((i11 & 256) != 0) {
            num = unifiedAccountDetailUiData.collateralStatus;
        }
        if ((i11 & 512) != 0) {
            str4 = unifiedAccountDetailUiData.code;
        }
        Integer num2 = num;
        String str5 = str4;
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal2;
        BigDecimal bigDecimal9 = bigDecimal3;
        return unifiedAccountDetailUiData.m88951a(str, str2, str3, bigDecimal, bigDecimal8, bigDecimal9, bigDecimal6, bigDecimal7, num2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final UnifiedAccountDetailUiData m88951a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Integer num, @Nullable String str4) {
        return new UnifiedAccountDetailUiData(str, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, num, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCurrencyIconUrl() {
        return this.currencyIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyIconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.equity;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.availableEquity;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.liability;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedPnl;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.unAvailableEquity;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num = this.collateralStatus;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.code;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final BigDecimal getUnAvailableEquity() {
        return this.unAvailableEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @NotNull
    public String toString() {
        return "UnifiedAccountDetailUiData(currency=" + this.currency + ", currencyIconUrl=" + this.currencyIconUrl + ", currencyName=" + this.currencyName + ", equity=" + this.equity + ", availableEquity=" + this.availableEquity + ", liability=" + this.liability + ", unrealisedPnl=" + this.unrealisedPnl + ", unAvailableEquity=" + this.unAvailableEquity + ", collateralStatus=" + this.collateralStatus + ", code=" + this.code + ')';
    }

    public /* synthetic */ UnifiedAccountDetailUiData(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : bigDecimal2, (i11 & 32) != 0 ? null : bigDecimal3, (i11 & 64) != 0 ? null : bigDecimal4, (i11 & 128) != 0 ? null : bigDecimal5, (i11 & 256) != 0 ? null : num, (i11 & 512) != 0 ? null : str4);
    }
}
