package com.kubi.assets.entity;

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

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/entity/SymbolResponse;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyFullName", "iconUrl", "indexPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyName", "setCurrencyName", "getCurrencyFullName", "setCurrencyFullName", "getIconUrl", "setIconUrl", "getIndexPrice", "()Ljava/math/BigDecimal;", "setIndexPrice", "(Ljava/math/BigDecimal;)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SymbolResponse> CREATOR = new Creator();

    @Nullable
    private String currency;

    @Nullable
    private String currencyFullName;

    @Nullable
    private String currencyName;

    @Nullable
    private String iconUrl;

    @Nullable
    private BigDecimal indexPrice;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<SymbolResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SymbolResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SymbolResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SymbolResponse[] newArray(int i11) {
            return new SymbolResponse[i11];
        }
    }

    public SymbolResponse() {
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
        if (!(other instanceof SymbolResponse)) {
            return false;
        }
        SymbolResponse symbolResponse = (SymbolResponse) other;
        return Intrinsics.areEqual(this.currency, symbolResponse.currency) && Intrinsics.areEqual(this.currencyName, symbolResponse.currencyName) && Intrinsics.areEqual(this.currencyFullName, symbolResponse.currencyFullName) && Intrinsics.areEqual(this.iconUrl, symbolResponse.iconUrl) && Intrinsics.areEqual(this.indexPrice, symbolResponse.indexPrice);
    }

    public SymbolResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal) {
        this.currency = str;
        this.currencyName = str2;
        this.currencyFullName = str3;
        this.iconUrl = str4;
        this.indexPrice = bigDecimal;
    }

    public static /* synthetic */ SymbolResponse copy$default(SymbolResponse symbolResponse, String str, String str2, String str3, String str4, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = symbolResponse.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = symbolResponse.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = symbolResponse.currencyFullName;
        }
        if ((i11 & 8) != 0) {
            str4 = symbolResponse.iconUrl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = symbolResponse.indexPrice;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str5 = str3;
        return symbolResponse.copy(str, str2, str5, str4, bigDecimal2);
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
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @NotNull
    public final SymbolResponse copy(@Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String iconUrl, @Nullable BigDecimal indexPrice) {
        return new SymbolResponse(currency, currencyName, currencyFullName, iconUrl, indexPrice);
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
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
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
        BigDecimal bigDecimal = this.indexPrice;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
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

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setIndexPrice(@Nullable BigDecimal bigDecimal) {
        this.indexPrice = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "SymbolResponse(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", iconUrl=" + this.iconUrl + ", indexPrice=" + this.indexPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.iconUrl);
        dest.writeSerializable(this.indexPrice);
    }

    public /* synthetic */ SymbolResponse(String str, String str2, String str3, String str4, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bigDecimal);
    }
}
