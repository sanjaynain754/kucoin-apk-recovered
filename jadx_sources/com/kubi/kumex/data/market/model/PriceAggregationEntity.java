package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarkPriceEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "Landroid/os/Parcelable;", "symbol", "", "markPrice", "Ljava/math/BigDecimal;", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "bestAskPrice", "bestBidPrice", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getMarkPrice", "()Ljava/math/BigDecimal;", "getLatestPrice", "getBestAskPrice", "getBestBidPrice", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PriceAggregationEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PriceAggregationEntity> CREATOR = new C15783a();

    @Nullable
    private final BigDecimal bestAskPrice;

    @Nullable
    private final BigDecimal bestBidPrice;

    @Nullable
    private final BigDecimal latestPrice;

    @Nullable
    private final BigDecimal markPrice;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.PriceAggregationEntity$a */
    /* JADX INFO: compiled from: MarkPriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15783a implements Parcelable.Creator<PriceAggregationEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PriceAggregationEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceAggregationEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PriceAggregationEntity[] newArray(int i11) {
            return new PriceAggregationEntity[i11];
        }
    }

    public PriceAggregationEntity() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceAggregationEntity)) {
            return false;
        }
        PriceAggregationEntity priceAggregationEntity = (PriceAggregationEntity) other;
        return Intrinsics.areEqual(this.symbol, priceAggregationEntity.symbol) && Intrinsics.areEqual(this.markPrice, priceAggregationEntity.markPrice) && Intrinsics.areEqual(this.latestPrice, priceAggregationEntity.latestPrice) && Intrinsics.areEqual(this.bestAskPrice, priceAggregationEntity.bestAskPrice) && Intrinsics.areEqual(this.bestBidPrice, priceAggregationEntity.bestBidPrice);
    }

    public PriceAggregationEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.symbol = str;
        this.markPrice = bigDecimal;
        this.latestPrice = bigDecimal2;
        this.bestAskPrice = bigDecimal3;
        this.bestBidPrice = bigDecimal4;
    }

    public static /* synthetic */ PriceAggregationEntity copy$default(PriceAggregationEntity priceAggregationEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = priceAggregationEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = priceAggregationEntity.markPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = priceAggregationEntity.latestPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = priceAggregationEntity.bestAskPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = priceAggregationEntity.bestBidPrice;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal2;
        return priceAggregationEntity.copy(str, bigDecimal, bigDecimal6, bigDecimal3, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @NotNull
    public final PriceAggregationEntity copy(@Nullable String symbol, @Nullable BigDecimal markPrice, @Nullable BigDecimal latestPrice, @Nullable BigDecimal bestAskPrice, @Nullable BigDecimal bestBidPrice) {
        return new PriceAggregationEntity(symbol, markPrice, latestPrice, bestAskPrice, bestBidPrice);
    }

    @Nullable
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.markPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.latestPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.bestAskPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.bestBidPrice;
        return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceAggregationEntity(symbol=" + this.symbol + ", markPrice=" + this.markPrice + ", latestPrice=" + this.latestPrice + ", bestAskPrice=" + this.bestAskPrice + ", bestBidPrice=" + this.bestBidPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.latestPrice);
        dest.writeSerializable(this.bestAskPrice);
        dest.writeSerializable(this.bestBidPrice);
    }

    public /* synthetic */ PriceAggregationEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4);
    }
}
