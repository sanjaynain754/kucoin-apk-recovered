package com.kubi.kumex.data.assets.model;

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

/* JADX INFO: compiled from: ProfitDetailItemEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006>"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "Landroid/os/Parcelable;", "symbol", "", FirebaseAnalytics.Param.CURRENCY, "side", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "dealComm", "realisedGrossCost", "realisedGrossCostNew", "createdAt", "", FirebaseAnalytics.Param.TAX, "liquidAmount", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getCurrency", "getSide", "getSize", "()Ljava/math/BigDecimal;", "getPrice", "getDealComm", "getRealisedGrossCost", "getRealisedGrossCostNew", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTax", "getLiquidAmount", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ProfitDetailItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProfitDetailItemEntity> CREATOR = new C15773a();

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal dealComm;

    @Nullable
    private final BigDecimal liquidAmount;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final BigDecimal realisedGrossCost;

    @Nullable
    private final BigDecimal realisedGrossCostNew;

    @NotNull
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.kumex.data.assets.model.ProfitDetailItemEntity$a */
    /* JADX INFO: compiled from: ProfitDetailItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15773a implements Parcelable.Creator<ProfitDetailItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProfitDetailItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfitDetailItemEntity(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProfitDetailItemEntity[] newArray(int i11) {
            return new ProfitDetailItemEntity[i11];
        }
    }

    public ProfitDetailItemEntity(@Nullable String str, @Nullable String str2, @NotNull String side, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Long l11, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.symbol = str;
        this.currency = str2;
        this.side = side;
        this.size = bigDecimal;
        this.price = bigDecimal2;
        this.dealComm = bigDecimal3;
        this.realisedGrossCost = bigDecimal4;
        this.realisedGrossCostNew = bigDecimal5;
        this.createdAt = l11;
        this.tax = bigDecimal6;
        this.liquidAmount = bigDecimal7;
        this.type = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitDetailItemEntity)) {
            return false;
        }
        ProfitDetailItemEntity profitDetailItemEntity = (ProfitDetailItemEntity) other;
        return Intrinsics.areEqual(this.symbol, profitDetailItemEntity.symbol) && Intrinsics.areEqual(this.currency, profitDetailItemEntity.currency) && Intrinsics.areEqual(this.side, profitDetailItemEntity.side) && Intrinsics.areEqual(this.size, profitDetailItemEntity.size) && Intrinsics.areEqual(this.price, profitDetailItemEntity.price) && Intrinsics.areEqual(this.dealComm, profitDetailItemEntity.dealComm) && Intrinsics.areEqual(this.realisedGrossCost, profitDetailItemEntity.realisedGrossCost) && Intrinsics.areEqual(this.realisedGrossCostNew, profitDetailItemEntity.realisedGrossCostNew) && Intrinsics.areEqual(this.createdAt, profitDetailItemEntity.createdAt) && Intrinsics.areEqual(this.tax, profitDetailItemEntity.tax) && Intrinsics.areEqual(this.liquidAmount, profitDetailItemEntity.liquidAmount) && Intrinsics.areEqual(this.type, profitDetailItemEntity.type);
    }

    public static /* synthetic */ ProfitDetailItemEntity copy$default(ProfitDetailItemEntity profitDetailItemEntity, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = profitDetailItemEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = profitDetailItemEntity.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = profitDetailItemEntity.side;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = profitDetailItemEntity.size;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = profitDetailItemEntity.price;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = profitDetailItemEntity.dealComm;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = profitDetailItemEntity.realisedGrossCost;
        }
        if ((i11 & 128) != 0) {
            bigDecimal5 = profitDetailItemEntity.realisedGrossCostNew;
        }
        if ((i11 & 256) != 0) {
            l11 = profitDetailItemEntity.createdAt;
        }
        if ((i11 & 512) != 0) {
            bigDecimal6 = profitDetailItemEntity.tax;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal7 = profitDetailItemEntity.liquidAmount;
        }
        if ((i11 & 2048) != 0) {
            str4 = profitDetailItemEntity.type;
        }
        BigDecimal bigDecimal8 = bigDecimal7;
        String str5 = str4;
        Long l12 = l11;
        BigDecimal bigDecimal9 = bigDecimal6;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal5;
        BigDecimal bigDecimal12 = bigDecimal2;
        BigDecimal bigDecimal13 = bigDecimal3;
        return profitDetailItemEntity.copy(str, str2, str3, bigDecimal, bigDecimal12, bigDecimal13, bigDecimal10, bigDecimal11, l12, bigDecimal9, bigDecimal8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getRealisedGrossCostNew() {
        return this.realisedGrossCostNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final ProfitDetailItemEntity copy(@Nullable String symbol, @Nullable String currency, @NotNull String side, @Nullable BigDecimal size, @Nullable BigDecimal price, @Nullable BigDecimal dealComm, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal realisedGrossCostNew, @Nullable Long createdAt, @Nullable BigDecimal tax, @Nullable BigDecimal liquidAmount, @Nullable String type) {
        Intrinsics.checkNotNullParameter(side, "side");
        return new ProfitDetailItemEntity(symbol, currency, side, size, price, dealComm, realisedGrossCost, realisedGrossCostNew, createdAt, tax, liquidAmount, type);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCostNew() {
        return this.realisedGrossCostNew;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.side.hashCode()) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.dealComm;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.realisedGrossCost;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.realisedGrossCostNew;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.tax;
        int iHashCode9 = (iHashCode8 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.liquidAmount;
        int iHashCode10 = (iHashCode9 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfitDetailItemEntity(symbol=" + this.symbol + ", currency=" + this.currency + ", side=" + this.side + ", size=" + this.size + ", price=" + this.price + ", dealComm=" + this.dealComm + ", realisedGrossCost=" + this.realisedGrossCost + ", realisedGrossCostNew=" + this.realisedGrossCostNew + ", createdAt=" + this.createdAt + ", tax=" + this.tax + ", liquidAmount=" + this.liquidAmount + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.currency);
        dest.writeString(this.side);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.dealComm);
        dest.writeSerializable(this.realisedGrossCost);
        dest.writeSerializable(this.realisedGrossCostNew);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.tax);
        dest.writeSerializable(this.liquidAmount);
        dest.writeString(this.type);
    }

    public /* synthetic */ ProfitDetailItemEntity(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "BUY" : str3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, (i11 & 128) != 0 ? null : bigDecimal5, (i11 & 256) != 0 ? 0L : l11, bigDecimal6, bigDecimal7, str4);
    }
}
