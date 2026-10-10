package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsPriceEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0016\u0010\f¨\u0006,"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/WsPriceEntity;", "Landroid/os/Parcelable;", "granularity", "", "indexPrice", "Ljava/math/BigDecimal;", "markPrice", "fundingRate", "timestamp", "<init>", "(Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getGranularity", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIndexPrice", "()Ljava/math/BigDecimal;", "setIndexPrice", "(Ljava/math/BigDecimal;)V", "getMarkPrice", "setMarkPrice", "getFundingRate", "setFundingRate", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/kumex/data/market/model/WsPriceEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsPriceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsPriceEntity> CREATOR = new C15790a();

    @Nullable
    private BigDecimal fundingRate;

    @Nullable
    private final Long granularity;

    @Nullable
    private BigDecimal indexPrice;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private final Long timestamp;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.WsPriceEntity$a */
    /* JADX INFO: compiled from: WsPriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15790a implements Parcelable.Creator<WsPriceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsPriceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WsPriceEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsPriceEntity[] newArray(int i11) {
            return new WsPriceEntity[i11];
        }
    }

    public WsPriceEntity() {
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
        if (!(other instanceof WsPriceEntity)) {
            return false;
        }
        WsPriceEntity wsPriceEntity = (WsPriceEntity) other;
        return Intrinsics.areEqual(this.granularity, wsPriceEntity.granularity) && Intrinsics.areEqual(this.indexPrice, wsPriceEntity.indexPrice) && Intrinsics.areEqual(this.markPrice, wsPriceEntity.markPrice) && Intrinsics.areEqual(this.fundingRate, wsPriceEntity.fundingRate) && Intrinsics.areEqual(this.timestamp, wsPriceEntity.timestamp);
    }

    public WsPriceEntity(@Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Long l12) {
        this.granularity = l11;
        this.indexPrice = bigDecimal;
        this.markPrice = bigDecimal2;
        this.fundingRate = bigDecimal3;
        this.timestamp = l12;
    }

    public static /* synthetic */ WsPriceEntity copy$default(WsPriceEntity wsPriceEntity, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = wsPriceEntity.granularity;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = wsPriceEntity.indexPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = wsPriceEntity.markPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = wsPriceEntity.fundingRate;
        }
        if ((i11 & 16) != 0) {
            l12 = wsPriceEntity.timestamp;
        }
        Long l13 = l12;
        BigDecimal bigDecimal4 = bigDecimal2;
        return wsPriceEntity.copy(l11, bigDecimal, bigDecimal4, bigDecimal3, l13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final WsPriceEntity copy(@Nullable Long granularity, @Nullable BigDecimal indexPrice, @Nullable BigDecimal markPrice, @Nullable BigDecimal fundingRate, @Nullable Long timestamp) {
        return new WsPriceEntity(granularity, indexPrice, markPrice, fundingRate, timestamp);
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l11 = this.granularity;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        BigDecimal bigDecimal = this.indexPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.markPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fundingRate;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l12 = this.timestamp;
        return iHashCode4 + (l12 != null ? l12.hashCode() : 0);
    }

    public final void setFundingRate(@Nullable BigDecimal bigDecimal) {
        this.fundingRate = bigDecimal;
    }

    public final void setIndexPrice(@Nullable BigDecimal bigDecimal) {
        this.indexPrice = bigDecimal;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "WsPriceEntity(granularity=" + this.granularity + ", indexPrice=" + this.indexPrice + ", markPrice=" + this.markPrice + ", fundingRate=" + this.fundingRate + ", timestamp=" + this.timestamp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.granularity;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.indexPrice);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.fundingRate);
        Long l12 = this.timestamp;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    public /* synthetic */ WsPriceEntity(Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : l12);
    }
}
