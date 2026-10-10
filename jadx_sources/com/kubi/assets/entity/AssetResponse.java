package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u0006\u0010$\u001a\u00020\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J]\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006:"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetResponse;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyFullName", "iconUrl", "totalAmount", "Ljava/math/BigDecimal;", "availableAmount", "holdAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyName", "setCurrencyName", "getCurrencyFullName", "setCurrencyFullName", "getIconUrl", "setIconUrl", "getTotalAmount", "()Ljava/math/BigDecimal;", "setTotalAmount", "(Ljava/math/BigDecimal;)V", "getAvailableAmount", "setAvailableAmount", "getHoldAmount", "setHoldAmount", "getAvailableBalanceStr", "getAvailableBalancePriceStr", "getTotalBalanceStr", "getTotalBalancePriceStr", "getLiabilityStr", "getLiabilityPriceStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetResponse> CREATOR = new Creator();

    @Nullable
    private BigDecimal availableAmount;

    @Nullable
    private String currency;

    @Nullable
    private String currencyFullName;

    @Nullable
    private String currencyName;

    @Nullable
    private BigDecimal holdAmount;

    @Nullable
    private String iconUrl;

    @Nullable
    private BigDecimal totalAmount;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetResponse[] newArray(int i11) {
            return new AssetResponse[i11];
        }
    }

    public AssetResponse() {
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
        if (!(other instanceof AssetResponse)) {
            return false;
        }
        AssetResponse assetResponse = (AssetResponse) other;
        return Intrinsics.areEqual(this.currency, assetResponse.currency) && Intrinsics.areEqual(this.currencyName, assetResponse.currencyName) && Intrinsics.areEqual(this.currencyFullName, assetResponse.currencyFullName) && Intrinsics.areEqual(this.iconUrl, assetResponse.iconUrl) && Intrinsics.areEqual(this.totalAmount, assetResponse.totalAmount) && Intrinsics.areEqual(this.availableAmount, assetResponse.availableAmount) && Intrinsics.areEqual(this.holdAmount, assetResponse.holdAmount);
    }

    public AssetResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.currency = str;
        this.currencyName = str2;
        this.currencyFullName = str3;
        this.iconUrl = str4;
        this.totalAmount = bigDecimal;
        this.availableAmount = bigDecimal2;
        this.holdAmount = bigDecimal3;
    }

    public static /* synthetic */ AssetResponse copy$default(AssetResponse assetResponse, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetResponse.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = assetResponse.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = assetResponse.currencyFullName;
        }
        if ((i11 & 8) != 0) {
            str4 = assetResponse.iconUrl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = assetResponse.totalAmount;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = assetResponse.availableAmount;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = assetResponse.holdAmount;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        BigDecimal bigDecimal6 = bigDecimal;
        String str5 = str3;
        return assetResponse.copy(str, str2, str5, str4, bigDecimal6, bigDecimal4, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getHoldAmount() {
        return this.holdAmount;
    }

    @NotNull
    public final AssetResponse copy(@Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String iconUrl, @Nullable BigDecimal totalAmount, @Nullable BigDecimal availableAmount, @Nullable BigDecimal holdAmount) {
        return new AssetResponse(currency, currencyName, currencyFullName, iconUrl, totalAmount, availableAmount, holdAmount);
    }

    @Nullable
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @NotNull
    public final String getAvailableBalancePriceStr() {
        BigDecimal bigDecimal = this.availableAmount;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getAvailableBalanceStr() {
        BigDecimal bigDecimal = this.availableAmount;
        return C27041f.m66669i(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null, "--");
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getHoldAmount() {
        return this.holdAmount;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLiabilityPriceStr() {
        BigDecimal bigDecimal = this.holdAmount;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getLiabilityStr() {
        BigDecimal bigDecimal = this.holdAmount;
        return C27041f.m66669i(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null, "--");
    }

    @Nullable
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    public final String getTotalBalancePriceStr() {
        BigDecimal bigDecimal = this.totalAmount;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getTotalBalanceStr() {
        BigDecimal bigDecimal = this.totalAmount;
        return C27041f.m66669i(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null, "--");
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.availableAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.holdAmount;
        return iHashCode6 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public final void setAvailableAmount(@Nullable BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyFullName(@Nullable String str) {
        this.currencyFullName = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    public final void setHoldAmount(@Nullable BigDecimal bigDecimal) {
        this.holdAmount = bigDecimal;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setTotalAmount(@Nullable BigDecimal bigDecimal) {
        this.totalAmount = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "AssetResponse(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", iconUrl=" + this.iconUrl + ", totalAmount=" + this.totalAmount + ", availableAmount=" + this.availableAmount + ", holdAmount=" + this.holdAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.iconUrl);
        dest.writeSerializable(this.totalAmount);
        dest.writeSerializable(this.availableAmount);
        dest.writeSerializable(this.holdAmount);
    }

    public /* synthetic */ AssetResponse(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : bigDecimal3);
    }
}
