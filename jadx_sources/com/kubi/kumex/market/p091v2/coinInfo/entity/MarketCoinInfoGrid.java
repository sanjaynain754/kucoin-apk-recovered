package com.kubi.kumex.market.p091v2.coinInfo.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006+"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoGrid;", "Landroid/os/Parcelable;", "maxLeverage", "", "minAmount", "todayTopProfitRateYear", "symbol", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "changeRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMaxLeverage", "()Ljava/lang/String;", "getMinAmount", "getTodayTopProfitRateYear", "getSymbol", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getChangeRate", "setChangeRate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoGrid implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfoGrid> CREATOR = new C16397a();

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private final String maxLeverage;

    @Nullable
    private final String minAmount;

    @Nullable
    private BigDecimal price;

    @Nullable
    private final String symbol;

    @Nullable
    private final String todayTopProfitRateYear;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.MarketCoinInfoGrid$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16397a implements Parcelable.Creator<MarketCoinInfoGrid> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoGrid createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketCoinInfoGrid(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoGrid[] newArray(int i11) {
            return new MarketCoinInfoGrid[i11];
        }
    }

    public MarketCoinInfoGrid(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.maxLeverage = str;
        this.minAmount = str2;
        this.todayTopProfitRateYear = str3;
        this.symbol = str4;
        this.price = bigDecimal;
        this.changeRate = bigDecimal2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCoinInfoGrid)) {
            return false;
        }
        MarketCoinInfoGrid marketCoinInfoGrid = (MarketCoinInfoGrid) other;
        return Intrinsics.areEqual(this.maxLeverage, marketCoinInfoGrid.maxLeverage) && Intrinsics.areEqual(this.minAmount, marketCoinInfoGrid.minAmount) && Intrinsics.areEqual(this.todayTopProfitRateYear, marketCoinInfoGrid.todayTopProfitRateYear) && Intrinsics.areEqual(this.symbol, marketCoinInfoGrid.symbol) && Intrinsics.areEqual(this.price, marketCoinInfoGrid.price) && Intrinsics.areEqual(this.changeRate, marketCoinInfoGrid.changeRate);
    }

    public static /* synthetic */ MarketCoinInfoGrid copy$default(MarketCoinInfoGrid marketCoinInfoGrid, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketCoinInfoGrid.maxLeverage;
        }
        if ((i11 & 2) != 0) {
            str2 = marketCoinInfoGrid.minAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = marketCoinInfoGrid.todayTopProfitRateYear;
        }
        if ((i11 & 8) != 0) {
            str4 = marketCoinInfoGrid.symbol;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = marketCoinInfoGrid.price;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = marketCoinInfoGrid.changeRate;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        return marketCoinInfoGrid.copy(str, str2, str3, str4, bigDecimal3, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTodayTopProfitRateYear() {
        return this.todayTopProfitRateYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @NotNull
    public final MarketCoinInfoGrid copy(@Nullable String maxLeverage, @Nullable String minAmount, @Nullable String todayTopProfitRateYear, @Nullable String symbol, @Nullable BigDecimal price, @Nullable BigDecimal changeRate) {
        return new MarketCoinInfoGrid(maxLeverage, minAmount, todayTopProfitRateYear, symbol, price, changeRate);
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTodayTopProfitRateYear() {
        return this.todayTopProfitRateYear;
    }

    public int hashCode() {
        String str = this.maxLeverage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.minAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.todayTopProfitRateYear;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.changeRate;
        return iHashCode5 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoGrid(maxLeverage=" + this.maxLeverage + ", minAmount=" + this.minAmount + ", todayTopProfitRateYear=" + this.todayTopProfitRateYear + ", symbol=" + this.symbol + ", price=" + this.price + ", changeRate=" + this.changeRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.maxLeverage);
        dest.writeString(this.minAmount);
        dest.writeString(this.todayTopProfitRateYear);
        dest.writeString(this.symbol);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.changeRate);
    }

    public /* synthetic */ MarketCoinInfoGrid(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2);
    }
}
