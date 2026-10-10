package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/entity/RedeemableEntity;", "Landroid/os/Parcelable;", "availableAmount", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "estimatedExchangeAmount", "estimatedFee", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAvailableAmount", "()Ljava/math/BigDecimal;", "setAvailableAmount", "(Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getEstimatedExchangeAmount", "setEstimatedExchangeAmount", "getEstimatedFee", "setEstimatedFee", "getPrice", "setPrice", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedeemableEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedeemableEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal availableAmount;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal estimatedExchangeAmount;

    @Nullable
    private BigDecimal estimatedFee;

    @Nullable
    private BigDecimal price;

    /* JADX INFO: compiled from: MyAssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedeemableEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedeemableEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedeemableEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedeemableEntity[] newArray(int i11) {
            return new RedeemableEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemableEntity)) {
            return false;
        }
        RedeemableEntity redeemableEntity = (RedeemableEntity) other;
        return Intrinsics.areEqual(this.availableAmount, redeemableEntity.availableAmount) && Intrinsics.areEqual(this.currency, redeemableEntity.currency) && Intrinsics.areEqual(this.estimatedExchangeAmount, redeemableEntity.estimatedExchangeAmount) && Intrinsics.areEqual(this.estimatedFee, redeemableEntity.estimatedFee) && Intrinsics.areEqual(this.price, redeemableEntity.price);
    }

    public static /* synthetic */ RedeemableEntity copy$default(RedeemableEntity redeemableEntity, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = redeemableEntity.availableAmount;
        }
        if ((i11 & 2) != 0) {
            str = redeemableEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = redeemableEntity.estimatedExchangeAmount;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = redeemableEntity.estimatedFee;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = redeemableEntity.price;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal2;
        return redeemableEntity.copy(bigDecimal, str, bigDecimal6, bigDecimal3, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getEstimatedExchangeAmount() {
        return this.estimatedExchangeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getEstimatedFee() {
        return this.estimatedFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final RedeemableEntity copy(@Nullable BigDecimal availableAmount, @Nullable String currency, @Nullable BigDecimal estimatedExchangeAmount, @Nullable BigDecimal estimatedFee, @Nullable BigDecimal price) {
        return new RedeemableEntity(availableAmount, currency, estimatedExchangeAmount, estimatedFee, price);
    }

    @Nullable
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getEstimatedExchangeAmount() {
        return this.estimatedExchangeAmount;
    }

    @Nullable
    public final BigDecimal getEstimatedFee() {
        return this.estimatedFee;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.availableAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.estimatedExchangeAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.estimatedFee;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.price;
        return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    public final void setAvailableAmount(@Nullable BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setEstimatedExchangeAmount(@Nullable BigDecimal bigDecimal) {
        this.estimatedExchangeAmount = bigDecimal;
    }

    public final void setEstimatedFee(@Nullable BigDecimal bigDecimal) {
        this.estimatedFee = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "RedeemableEntity(availableAmount=" + this.availableAmount + ", currency=" + this.currency + ", estimatedExchangeAmount=" + this.estimatedExchangeAmount + ", estimatedFee=" + this.estimatedFee + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.availableAmount);
        dest.writeString(this.currency);
        dest.writeSerializable(this.estimatedExchangeAmount);
        dest.writeSerializable(this.estimatedFee);
        dest.writeSerializable(this.price);
    }

    public RedeemableEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.availableAmount = bigDecimal;
        this.currency = str;
        this.estimatedExchangeAmount = bigDecimal2;
        this.estimatedFee = bigDecimal3;
        this.price = bigDecimal4;
    }
}
