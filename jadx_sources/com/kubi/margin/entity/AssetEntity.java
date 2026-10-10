package com.kubi.margin.entity;

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

/* JADX INFO: compiled from: DelegationLiquidationEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016¨\u00064"}, m90084d2 = {"Lcom/kubi/margin/entity/AssetEntity;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "amountUSDT", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyIcon", "balanceCurrency", "balanceCurrencyName", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getAmountUSDT", "setAmountUSDT", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyName", "setCurrencyName", "getCurrencyIcon", "setCurrencyIcon", "getBalanceCurrency", "setBalanceCurrency", "getBalanceCurrencyName", "setBalanceCurrencyName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetEntity> CREATOR = new C17608a();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private BigDecimal amountUSDT;

    @Nullable
    private String balanceCurrency;

    @Nullable
    private String balanceCurrencyName;

    @Nullable
    private String currency;

    @Nullable
    private String currencyIcon;

    @Nullable
    private String currencyName;

    /* JADX INFO: renamed from: com.kubi.margin.entity.AssetEntity$a */
    /* JADX INFO: compiled from: DelegationLiquidationEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17608a implements Parcelable.Creator<AssetEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssetEntity[] newArray(int i11) {
            return new AssetEntity[i11];
        }
    }

    public AssetEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetEntity)) {
            return false;
        }
        AssetEntity assetEntity = (AssetEntity) other;
        return Intrinsics.areEqual(this.amount, assetEntity.amount) && Intrinsics.areEqual(this.amountUSDT, assetEntity.amountUSDT) && Intrinsics.areEqual(this.currency, assetEntity.currency) && Intrinsics.areEqual(this.currencyName, assetEntity.currencyName) && Intrinsics.areEqual(this.currencyIcon, assetEntity.currencyIcon) && Intrinsics.areEqual(this.balanceCurrency, assetEntity.balanceCurrency) && Intrinsics.areEqual(this.balanceCurrencyName, assetEntity.balanceCurrencyName);
    }

    public AssetEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.amount = bigDecimal;
        this.amountUSDT = bigDecimal2;
        this.currency = str;
        this.currencyName = str2;
        this.currencyIcon = str3;
        this.balanceCurrency = str4;
        this.balanceCurrencyName = str5;
    }

    public static /* synthetic */ AssetEntity copy$default(AssetEntity assetEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = assetEntity.amount;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = assetEntity.amountUSDT;
        }
        if ((i11 & 4) != 0) {
            str = assetEntity.currency;
        }
        if ((i11 & 8) != 0) {
            str2 = assetEntity.currencyName;
        }
        if ((i11 & 16) != 0) {
            str3 = assetEntity.currencyIcon;
        }
        if ((i11 & 32) != 0) {
            str4 = assetEntity.balanceCurrency;
        }
        if ((i11 & 64) != 0) {
            str5 = assetEntity.balanceCurrencyName;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return assetEntity.copy(bigDecimal, bigDecimal2, str9, str2, str8, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAmountUSDT() {
        return this.amountUSDT;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBalanceCurrencyName() {
        return this.balanceCurrencyName;
    }

    @NotNull
    public final AssetEntity copy(@Nullable BigDecimal amount, @Nullable BigDecimal amountUSDT, @Nullable String currency, @Nullable String currencyName, @Nullable String currencyIcon, @Nullable String balanceCurrency, @Nullable String balanceCurrencyName) {
        return new AssetEntity(amount, amountUSDT, currency, currencyName, currencyIcon, balanceCurrency, balanceCurrencyName);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final BigDecimal getAmountUSDT() {
        return this.amountUSDT;
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getBalanceCurrencyName() {
        return this.balanceCurrencyName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.amountUSDT;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyIcon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.balanceCurrency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.balanceCurrencyName;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setAmountUSDT(@Nullable BigDecimal bigDecimal) {
        this.amountUSDT = bigDecimal;
    }

    public final void setBalanceCurrency(@Nullable String str) {
        this.balanceCurrency = str;
    }

    public final void setBalanceCurrencyName(@Nullable String str) {
        this.balanceCurrencyName = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyIcon(@Nullable String str) {
        this.currencyIcon = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    @NotNull
    public String toString() {
        return "AssetEntity(amount=" + this.amount + ", amountUSDT=" + this.amountUSDT + ", currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyIcon=" + this.currencyIcon + ", balanceCurrency=" + this.balanceCurrency + ", balanceCurrencyName=" + this.balanceCurrencyName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.amountUSDT);
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyIcon);
        dest.writeString(this.balanceCurrency);
        dest.writeString(this.balanceCurrencyName);
    }

    public /* synthetic */ AssetEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5);
    }
}
