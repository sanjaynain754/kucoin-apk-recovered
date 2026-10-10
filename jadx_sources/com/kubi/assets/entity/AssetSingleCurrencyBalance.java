package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p311hf.C38185c;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import sa.C44370a;
import y70.C46392a;

/* JADX INFO: compiled from: AssetSingleCurrencyBalance.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u0006\u0010$\u001a\u00020\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006;"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "totalBalance", "Ljava/math/BigDecimal;", "holdBalance", "availableBalance", "digitCost", "faitCost", "digitCurrency", "costUsdt", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getAvailableBalance", "setAvailableBalance", "getDigitCost", "setDigitCost", "getFaitCost", "setFaitCost", "getDigitCurrency", "setDigitCurrency", "getCostUsdt", "setCostUsdt", "getDigitCostStr", "getUsdtCostStr", "getCostStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetSingleCurrencyBalance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetSingleCurrencyBalance.kt\ncom/kubi/assets/entity/AssetSingleCurrencyBalance\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,53:1\n136#2:54\n136#2:55\n*S KotlinDebug\n*F\n+ 1 AssetSingleCurrencyBalance.kt\ncom/kubi/assets/entity/AssetSingleCurrencyBalance\n*L\n34#1:54\n41#1:55\n*E\n"})
public final /* data */ class AssetSingleCurrencyBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetSingleCurrencyBalance> CREATOR = new Creator();

    @NotNull
    private BigDecimal availableBalance;

    @Nullable
    private String costUsdt;

    @Nullable
    private String currency;

    @Nullable
    private String digitCost;

    @Nullable
    private String digitCurrency;

    @Nullable
    private String faitCost;

    @NotNull
    private BigDecimal holdBalance;

    @NotNull
    private BigDecimal totalBalance;

    /* JADX INFO: compiled from: AssetSingleCurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetSingleCurrencyBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSingleCurrencyBalance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetSingleCurrencyBalance(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSingleCurrencyBalance[] newArray(int i11) {
            return new AssetSingleCurrencyBalance[i11];
        }
    }

    public AssetSingleCurrencyBalance() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetSingleCurrencyBalance)) {
            return false;
        }
        AssetSingleCurrencyBalance assetSingleCurrencyBalance = (AssetSingleCurrencyBalance) other;
        return Intrinsics.areEqual(this.currency, assetSingleCurrencyBalance.currency) && Intrinsics.areEqual(this.totalBalance, assetSingleCurrencyBalance.totalBalance) && Intrinsics.areEqual(this.holdBalance, assetSingleCurrencyBalance.holdBalance) && Intrinsics.areEqual(this.availableBalance, assetSingleCurrencyBalance.availableBalance) && Intrinsics.areEqual(this.digitCost, assetSingleCurrencyBalance.digitCost) && Intrinsics.areEqual(this.faitCost, assetSingleCurrencyBalance.faitCost) && Intrinsics.areEqual(this.digitCurrency, assetSingleCurrencyBalance.digitCurrency) && Intrinsics.areEqual(this.costUsdt, assetSingleCurrencyBalance.costUsdt);
    }

    public AssetSingleCurrencyBalance(@Nullable String str, @NotNull BigDecimal totalBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal availableBalance, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        this.currency = str;
        this.totalBalance = totalBalance;
        this.holdBalance = holdBalance;
        this.availableBalance = availableBalance;
        this.digitCost = str2;
        this.faitCost = str3;
        this.digitCurrency = str4;
        this.costUsdt = str5;
    }

    public static /* synthetic */ AssetSingleCurrencyBalance copy$default(AssetSingleCurrencyBalance assetSingleCurrencyBalance, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetSingleCurrencyBalance.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = assetSingleCurrencyBalance.totalBalance;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = assetSingleCurrencyBalance.holdBalance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = assetSingleCurrencyBalance.availableBalance;
        }
        if ((i11 & 16) != 0) {
            str2 = assetSingleCurrencyBalance.digitCost;
        }
        if ((i11 & 32) != 0) {
            str3 = assetSingleCurrencyBalance.faitCost;
        }
        if ((i11 & 64) != 0) {
            str4 = assetSingleCurrencyBalance.digitCurrency;
        }
        if ((i11 & 128) != 0) {
            str5 = assetSingleCurrencyBalance.costUsdt;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return assetSingleCurrencyBalance.copy(str, bigDecimal, bigDecimal2, bigDecimal3, str8, str9, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDigitCost() {
        return this.digitCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFaitCost() {
        return this.faitCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDigitCurrency() {
        return this.digitCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCostUsdt() {
        return this.costUsdt;
    }

    @NotNull
    public final AssetSingleCurrencyBalance copy(@Nullable String currency, @NotNull BigDecimal totalBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal availableBalance, @Nullable String digitCost, @Nullable String faitCost, @Nullable String digitCurrency, @Nullable String costUsdt) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        return new AssetSingleCurrencyBalance(currency, totalBalance, holdBalance, availableBalance, digitCost, faitCost, digitCurrency, costUsdt);
    }

    @NotNull
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final String getCostStr() {
        return AssetApiRemoteConfig.f17838a.m17476e() ? getUsdtCostStr() : getDigitCostStr();
    }

    @Nullable
    public final String getCostUsdt() {
        return this.costUsdt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDigitCost() {
        return this.digitCost;
    }

    @NotNull
    public final String getDigitCostStr() {
        BigDecimal bigDecimalOrNull;
        String strM89933g;
        BigDecimal bigDecimalOrNull2;
        String strM86151c;
        String strM93905f;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            String str = this.digitCost;
            return (str == null || (bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(str)) == null || (strM86151c = C38185c.m86151c(bigDecimalOrNull2, false, 1, null)) == null || (strM93905f = C42828b.m93905f(strM86151c, C38184b.f85884a.m86148c(), true, true)) == null) ? "--" : strM93905f;
        }
        String str2 = this.faitCost;
        return (str2 == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2)) == null || (strM89933g = C41014a.m89933g(bigDecimalOrNull, null, null, 0, false, false, false, 63, null)) == null) ? "--" : strM89933g;
    }

    @Nullable
    public final String getDigitCurrency() {
        return this.digitCurrency;
    }

    @Nullable
    public final String getFaitCost() {
        return this.faitCost;
    }

    @NotNull
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final String getUsdtCostStr() {
        BigDecimal bigDecimalOrNull;
        String strM89933g;
        BigDecimal bigDecimalOrNull2;
        String strM86151c;
        String strM93905f;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            String str = this.costUsdt;
            return (str == null || (bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(str)) == null || (strM86151c = C38185c.m86151c(bigDecimalOrNull2, false, 1, null)) == null || (strM93905f = C42828b.m93905f(strM86151c, C38184b.f85884a.m86148c(), true, true)) == null) ? "--" : strM93905f;
        }
        String str2 = this.costUsdt;
        return (str2 == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2)) == null || (strM89933g = C41014a.m89933g(bigDecimalOrNull, null, null, 0, false, false, false, 63, null)) == null) ? "--" : strM89933g;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.totalBalance.hashCode()) * 31) + this.holdBalance.hashCode()) * 31) + this.availableBalance.hashCode()) * 31;
        String str2 = this.digitCost;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.faitCost;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.digitCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.costUsdt;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAvailableBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.availableBalance = bigDecimal;
    }

    public final void setCostUsdt(@Nullable String str) {
        this.costUsdt = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDigitCost(@Nullable String str) {
        this.digitCost = str;
    }

    public final void setDigitCurrency(@Nullable String str) {
        this.digitCurrency = str;
    }

    public final void setFaitCost(@Nullable String str) {
        this.faitCost = str;
    }

    public final void setHoldBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.holdBalance = bigDecimal;
    }

    public final void setTotalBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "AssetSingleCurrencyBalance(currency=" + this.currency + ", totalBalance=" + this.totalBalance + ", holdBalance=" + this.holdBalance + ", availableBalance=" + this.availableBalance + ", digitCost=" + this.digitCost + ", faitCost=" + this.faitCost + ", digitCurrency=" + this.digitCurrency + ", costUsdt=" + this.costUsdt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.availableBalance);
        dest.writeString(this.digitCost);
        dest.writeString(this.faitCost);
        dest.writeString(this.digitCurrency);
        dest.writeString(this.costUsdt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AssetSingleCurrencyBalance(String str, BigDecimal ZERO, BigDecimal ZERO2, BigDecimal ZERO3, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 1) != 0 ? null : str;
        if ((i11 & 2) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        if ((i11 & 4) != 0) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        }
        if ((i11 & 8) != 0) {
            ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        }
        str2 = (i11 & 16) != 0 ? null : str2;
        str3 = (i11 & 32) != 0 ? null : str3;
        str4 = (i11 & 64) != 0 ? null : str4;
        String str6 = (i11 & 128) != 0 ? null : str5;
        this(str, ZERO, ZERO2, ZERO3, str2, str3, str4, str6);
    }
}
