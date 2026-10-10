package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.utils.NumberUtils;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPackageEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010'\u001a\u00020\u0011J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00105J\u0006\u00106\u001a\u00020\u0011J\u0013\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0011HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006A"}, m90084d2 = {"Lcom/kubi/redpackage/entity/CurrenciesConfig;", "Landroid/os/Parcelable;", "currencyAvatar", "", "supportNewBee", "", AppsFlyerProperties.CURRENCY_CODE, "currencyFullName", "currencyMax", "currencyMaxNum", "currencyMin", "currencyMinNum", "currencyName", "mainCurrencyBalance", "Ljava/math/BigDecimal;", "tradeCurrencyBalance", "codePrecision", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)V", "getCurrencyAvatar", "()Ljava/lang/String;", "getSupportNewBee", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrencyCode", "getCurrencyFullName", "getCurrencyMax", "getCurrencyMaxNum", "getCurrencyMin", "getCurrencyMinNum", "getCurrencyName", "getMainCurrencyBalance", "()Ljava/math/BigDecimal;", "getTradeCurrencyBalance", "getCodePrecision", "()I", "setCodePrecision", "(I)V", "getPrecision", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Lcom/kubi/redpackage/entity/CurrenciesConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrenciesConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrenciesConfig> CREATOR = new Creator();
    private int codePrecision;

    @Nullable
    private final String currencyAvatar;

    @Nullable
    private final String currencyCode;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String currencyMax;

    @Nullable
    private final String currencyMaxNum;

    @Nullable
    private final String currencyMin;

    @Nullable
    private final String currencyMinNum;

    @Nullable
    private final String currencyName;

    @Nullable
    private final BigDecimal mainCurrencyBalance;

    @Nullable
    private final Boolean supportNewBee;

    @Nullable
    private final BigDecimal tradeCurrencyBalance;

    /* JADX INFO: compiled from: RedPackageEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrenciesConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrenciesConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CurrenciesConfig(string, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrenciesConfig[] newArray(int i11) {
            return new CurrenciesConfig[i11];
        }
    }

    public CurrenciesConfig(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, int i11) {
        this.currencyAvatar = str;
        this.supportNewBee = bool;
        this.currencyCode = str2;
        this.currencyFullName = str3;
        this.currencyMax = str4;
        this.currencyMaxNum = str5;
        this.currencyMin = str6;
        this.currencyMinNum = str7;
        this.currencyName = str8;
        this.mainCurrencyBalance = bigDecimal;
        this.tradeCurrencyBalance = bigDecimal2;
        this.codePrecision = i11;
    }

    public static /* synthetic */ CurrenciesConfig copy$default(CurrenciesConfig currenciesConfig, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = currenciesConfig.currencyAvatar;
        }
        if ((i12 & 2) != 0) {
            bool = currenciesConfig.supportNewBee;
        }
        if ((i12 & 4) != 0) {
            str2 = currenciesConfig.currencyCode;
        }
        if ((i12 & 8) != 0) {
            str3 = currenciesConfig.currencyFullName;
        }
        if ((i12 & 16) != 0) {
            str4 = currenciesConfig.currencyMax;
        }
        if ((i12 & 32) != 0) {
            str5 = currenciesConfig.currencyMaxNum;
        }
        if ((i12 & 64) != 0) {
            str6 = currenciesConfig.currencyMin;
        }
        if ((i12 & 128) != 0) {
            str7 = currenciesConfig.currencyMinNum;
        }
        if ((i12 & 256) != 0) {
            str8 = currenciesConfig.currencyName;
        }
        if ((i12 & 512) != 0) {
            bigDecimal = currenciesConfig.mainCurrencyBalance;
        }
        if ((i12 & 1024) != 0) {
            bigDecimal2 = currenciesConfig.tradeCurrencyBalance;
        }
        if ((i12 & 2048) != 0) {
            i11 = currenciesConfig.codePrecision;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        int i13 = i11;
        String str9 = str8;
        BigDecimal bigDecimal4 = bigDecimal;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        return currenciesConfig.copy(str, bool, str2, str3, str12, str13, str10, str11, str9, bigDecimal4, bigDecimal3, i13);
    }

    @NotNull
    public final CurrenciesConfig copy(@Nullable String currencyAvatar, @Nullable Boolean supportNewBee, @Nullable String currencyCode, @Nullable String currencyFullName, @Nullable String currencyMax, @Nullable String currencyMaxNum, @Nullable String currencyMin, @Nullable String currencyMinNum, @Nullable String currencyName, @Nullable BigDecimal mainCurrencyBalance, @Nullable BigDecimal tradeCurrencyBalance, int codePrecision) {
        return new CurrenciesConfig(currencyAvatar, supportNewBee, currencyCode, currencyFullName, currencyMax, currencyMaxNum, currencyMin, currencyMinNum, currencyName, mainCurrencyBalance, tradeCurrencyBalance, codePrecision);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrenciesConfig)) {
            return false;
        }
        CurrenciesConfig currenciesConfig = (CurrenciesConfig) other;
        return Intrinsics.areEqual(this.currencyAvatar, currenciesConfig.currencyAvatar) && Intrinsics.areEqual(this.supportNewBee, currenciesConfig.supportNewBee) && Intrinsics.areEqual(this.currencyCode, currenciesConfig.currencyCode) && Intrinsics.areEqual(this.currencyFullName, currenciesConfig.currencyFullName) && Intrinsics.areEqual(this.currencyMax, currenciesConfig.currencyMax) && Intrinsics.areEqual(this.currencyMaxNum, currenciesConfig.currencyMaxNum) && Intrinsics.areEqual(this.currencyMin, currenciesConfig.currencyMin) && Intrinsics.areEqual(this.currencyMinNum, currenciesConfig.currencyMinNum) && Intrinsics.areEqual(this.currencyName, currenciesConfig.currencyName) && Intrinsics.areEqual(this.mainCurrencyBalance, currenciesConfig.mainCurrencyBalance) && Intrinsics.areEqual(this.tradeCurrencyBalance, currenciesConfig.tradeCurrencyBalance) && this.codePrecision == currenciesConfig.codePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyAvatar() {
        return this.currencyAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getMainCurrencyBalance() {
        return this.mainCurrencyBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getTradeCurrencyBalance() {
        return this.tradeCurrencyBalance;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCodePrecision() {
        return this.codePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSupportNewBee() {
        return this.supportNewBee;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyMax() {
        return this.currencyMax;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrencyMaxNum() {
        return this.currencyMaxNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrencyMin() {
        return this.currencyMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrencyMinNum() {
        return this.currencyMinNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final int getCodePrecision() {
        return this.codePrecision;
    }

    @Nullable
    public final String getCurrencyAvatar() {
        return this.currencyAvatar;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyMax() {
        return this.currencyMax;
    }

    @Nullable
    public final String getCurrencyMaxNum() {
        return this.currencyMaxNum;
    }

    @Nullable
    public final String getCurrencyMin() {
        return this.currencyMin;
    }

    @Nullable
    public final String getCurrencyMinNum() {
        return this.currencyMinNum;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getMainCurrencyBalance() {
        return this.mainCurrencyBalance;
    }

    public final int getPrecision() {
        if (this.codePrecision <= 0) {
            this.codePrecision = NumberUtils.INSTANCE.getPrecisionByNumber(C27041f.m66669i(this.currencyMin, "0"));
        }
        return this.codePrecision;
    }

    @Nullable
    public final Boolean getSupportNewBee() {
        return this.supportNewBee;
    }

    @Nullable
    public final BigDecimal getTradeCurrencyBalance() {
        return this.tradeCurrencyBalance;
    }

    public int hashCode() {
        String str = this.currencyAvatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.supportNewBee;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.currencyCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFullName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyMax;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyMaxNum;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currencyMin;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currencyMinNum;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currencyName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal = this.mainCurrencyBalance;
        int iHashCode10 = (iHashCode9 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.tradeCurrencyBalance;
        return ((iHashCode10 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + Integer.hashCode(this.codePrecision);
    }

    public final void setCodePrecision(int i11) {
        this.codePrecision = i11;
    }

    @NotNull
    public String toString() {
        return "CurrenciesConfig(currencyAvatar=" + this.currencyAvatar + ", supportNewBee=" + this.supportNewBee + ", currencyCode=" + this.currencyCode + ", currencyFullName=" + this.currencyFullName + ", currencyMax=" + this.currencyMax + ", currencyMaxNum=" + this.currencyMaxNum + ", currencyMin=" + this.currencyMin + ", currencyMinNum=" + this.currencyMinNum + ", currencyName=" + this.currencyName + ", mainCurrencyBalance=" + this.mainCurrencyBalance + ", tradeCurrencyBalance=" + this.tradeCurrencyBalance + ", codePrecision=" + this.codePrecision + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currencyAvatar);
        Boolean bool = this.supportNewBee;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.currencyCode);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.currencyMax);
        dest.writeString(this.currencyMaxNum);
        dest.writeString(this.currencyMin);
        dest.writeString(this.currencyMinNum);
        dest.writeString(this.currencyName);
        dest.writeSerializable(this.mainCurrencyBalance);
        dest.writeSerializable(this.tradeCurrencyBalance);
        dest.writeInt(this.codePrecision);
    }

    public /* synthetic */ CurrenciesConfig(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? Boolean.FALSE : bool, str2, str3, str4, str5, str6, str7, str8, (i12 & 512) != 0 ? BigDecimal.ZERO : bigDecimal, (i12 & 1024) != 0 ? BigDecimal.ZERO : bigDecimal2, (i12 & 2048) != 0 ? -1 : i11);
    }
}
