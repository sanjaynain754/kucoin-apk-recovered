package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FeeEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m90084d2 = {"Lcom/kubi/margin/api/entity/FeeEntity;", "Landroid/os/Parcelable;", "makerFeeRate", "Ljava/math/BigDecimal;", "takerFeeRate", "sellTaxRate", "", "buyTaxRate", "complianceTaxHelpCenterUrl", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMakerFeeRate", "()Ljava/math/BigDecimal;", "getTakerFeeRate", "getSellTaxRate", "()Ljava/lang/String;", "getBuyTaxRate", "getComplianceTaxHelpCenterUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FeeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeeEntity> CREATOR = new C17479a();

    @Nullable
    private final String buyTaxRate;

    @Nullable
    private final String complianceTaxHelpCenterUrl;

    @NotNull
    private final BigDecimal makerFeeRate;

    @Nullable
    private final String sellTaxRate;

    @NotNull
    private final BigDecimal takerFeeRate;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.FeeEntity$a */
    /* JADX INFO: compiled from: FeeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17479a implements Parcelable.Creator<FeeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FeeEntity[] newArray(int i11) {
            return new FeeEntity[i11];
        }
    }

    public FeeEntity(@NotNull BigDecimal makerFeeRate, @NotNull BigDecimal takerFeeRate, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        this.makerFeeRate = makerFeeRate;
        this.takerFeeRate = takerFeeRate;
        this.sellTaxRate = str;
        this.buyTaxRate = str2;
        this.complianceTaxHelpCenterUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeEntity)) {
            return false;
        }
        FeeEntity feeEntity = (FeeEntity) other;
        return Intrinsics.areEqual(this.makerFeeRate, feeEntity.makerFeeRate) && Intrinsics.areEqual(this.takerFeeRate, feeEntity.takerFeeRate) && Intrinsics.areEqual(this.sellTaxRate, feeEntity.sellTaxRate) && Intrinsics.areEqual(this.buyTaxRate, feeEntity.buyTaxRate) && Intrinsics.areEqual(this.complianceTaxHelpCenterUrl, feeEntity.complianceTaxHelpCenterUrl);
    }

    public static /* synthetic */ FeeEntity copy$default(FeeEntity feeEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = feeEntity.makerFeeRate;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = feeEntity.takerFeeRate;
        }
        if ((i11 & 4) != 0) {
            str = feeEntity.sellTaxRate;
        }
        if ((i11 & 8) != 0) {
            str2 = feeEntity.buyTaxRate;
        }
        if ((i11 & 16) != 0) {
            str3 = feeEntity.complianceTaxHelpCenterUrl;
        }
        String str4 = str3;
        String str5 = str;
        return feeEntity.copy(bigDecimal, bigDecimal2, str5, str2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSellTaxRate() {
        return this.sellTaxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBuyTaxRate() {
        return this.buyTaxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getComplianceTaxHelpCenterUrl() {
        return this.complianceTaxHelpCenterUrl;
    }

    @NotNull
    public final FeeEntity copy(@NotNull BigDecimal makerFeeRate, @NotNull BigDecimal takerFeeRate, @Nullable String sellTaxRate, @Nullable String buyTaxRate, @Nullable String complianceTaxHelpCenterUrl) {
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        return new FeeEntity(makerFeeRate, takerFeeRate, sellTaxRate, buyTaxRate, complianceTaxHelpCenterUrl);
    }

    @Nullable
    public final String getBuyTaxRate() {
        return this.buyTaxRate;
    }

    @Nullable
    public final String getComplianceTaxHelpCenterUrl() {
        return this.complianceTaxHelpCenterUrl;
    }

    @NotNull
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final String getSellTaxRate() {
        return this.sellTaxRate;
    }

    @NotNull
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    public int hashCode() {
        int iHashCode = ((this.makerFeeRate.hashCode() * 31) + this.takerFeeRate.hashCode()) * 31;
        String str = this.sellTaxRate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buyTaxRate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.complianceTaxHelpCenterUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FeeEntity(makerFeeRate=" + this.makerFeeRate + ", takerFeeRate=" + this.takerFeeRate + ", sellTaxRate=" + this.sellTaxRate + ", buyTaxRate=" + this.buyTaxRate + ", complianceTaxHelpCenterUrl=" + this.complianceTaxHelpCenterUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.makerFeeRate);
        dest.writeSerializable(this.takerFeeRate);
        dest.writeString(this.sellTaxRate);
        dest.writeString(this.buyTaxRate);
        dest.writeString(this.complianceTaxHelpCenterUrl);
    }

    public /* synthetic */ FeeEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new BigDecimal("0.001") : bigDecimal, (i11 & 2) != 0 ? new BigDecimal("0.001") : bigDecimal2, str, str2, str3);
    }
}
