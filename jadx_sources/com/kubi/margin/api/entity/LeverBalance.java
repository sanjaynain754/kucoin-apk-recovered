package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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

/* JADX INFO: compiled from: LeverBalance.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0006\u00104\u001a\u00020\fJ\u0018\u00105\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\fJ\b\u0010;\u001a\u0004\u0018\u00010\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÎ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u000208J\u0013\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u000208HÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u000208R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b\u000e\u0010)\"\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b2\u0010)R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0012\u0010)R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0013\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006Y"}, m90084d2 = {"Lcom/kubi/margin/api/entity/LeverBalance;", "Landroid/os/Parcelable;", "liabilityRate", "Ljava/math/BigDecimal;", "status", "", "statusBizType", "totalBalance", "totalLiability", "marginCoefficientTotalAsset", "collateralAssetsAmount", "latest", "", "openFlag", "isAutoRepay", "userLeverage", "valuableCurrency", "execute", "isOneClickLiquidationOpen", "isSignAgreement", "agreementUrl", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "()V", "getLiabilityRate", "()Ljava/math/BigDecimal;", "setLiabilityRate", "(Ljava/math/BigDecimal;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getStatusBizType", "setStatusBizType", "getTotalBalance", "getTotalLiability", "getMarginCoefficientTotalAsset", "setMarginCoefficientTotalAsset", "getCollateralAssetsAmount", "setCollateralAssetsAmount", "getLatest", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOpenFlag", "setAutoRepay", "(Ljava/lang/Boolean;)V", "getUserLeverage", "setUserLeverage", "getValuableCurrency", "setValuableCurrency", "getExecute", "getAgreementUrl", "isOpenStatus", "getRealBalanceString", "coinOrSymbol", "precision", "", "getRealBalancePriceString", "isLiability", "getCrossCoefficientTotalAsset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/margin/api/entity/LeverBalance;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverBalance> CREATOR = new C17483a();

    @Nullable
    private final String agreementUrl;

    @Nullable
    private BigDecimal collateralAssetsAmount;

    @Nullable
    private final Boolean execute;

    @Nullable
    private Boolean isAutoRepay;

    @Nullable
    private final Boolean isOneClickLiquidationOpen;

    @Nullable
    private final Boolean isSignAgreement;

    @Nullable
    private final Boolean latest;

    @Nullable
    private BigDecimal liabilityRate;

    @Nullable
    private BigDecimal marginCoefficientTotalAsset;

    @Nullable
    private final Boolean openFlag;

    @Nullable
    private String status;

    @Nullable
    private String statusBizType;

    @Nullable
    private final BigDecimal totalBalance;

    @Nullable
    private final BigDecimal totalLiability;

    @Nullable
    private BigDecimal userLeverage;

    @Nullable
    private String valuableCurrency;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.LeverBalance$a */
    /* JADX INFO: compiled from: LeverBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17483a implements Parcelable.Creator<LeverBalance> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverBalance createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf6 = null;
            Boolean bool = boolValueOf3;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeverBalance(bigDecimal, string, string2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, boolValueOf, boolValueOf2, bool, bigDecimal6, string3, boolValueOf4, boolValueOf5, boolValueOf6, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverBalance[] newArray(int i11) {
            return new LeverBalance[i11];
        }
    }

    public LeverBalance(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BigDecimal bigDecimal6, @Nullable String str3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable String str4) {
        this.liabilityRate = bigDecimal;
        this.status = str;
        this.statusBizType = str2;
        this.totalBalance = bigDecimal2;
        this.totalLiability = bigDecimal3;
        this.marginCoefficientTotalAsset = bigDecimal4;
        this.collateralAssetsAmount = bigDecimal5;
        this.latest = bool;
        this.openFlag = bool2;
        this.isAutoRepay = bool3;
        this.userLeverage = bigDecimal6;
        this.valuableCurrency = str3;
        this.execute = bool4;
        this.isOneClickLiquidationOpen = bool5;
        this.isSignAgreement = bool6;
        this.agreementUrl = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverBalance)) {
            return false;
        }
        LeverBalance leverBalance = (LeverBalance) other;
        return Intrinsics.areEqual(this.liabilityRate, leverBalance.liabilityRate) && Intrinsics.areEqual(this.status, leverBalance.status) && Intrinsics.areEqual(this.statusBizType, leverBalance.statusBizType) && Intrinsics.areEqual(this.totalBalance, leverBalance.totalBalance) && Intrinsics.areEqual(this.totalLiability, leverBalance.totalLiability) && Intrinsics.areEqual(this.marginCoefficientTotalAsset, leverBalance.marginCoefficientTotalAsset) && Intrinsics.areEqual(this.collateralAssetsAmount, leverBalance.collateralAssetsAmount) && Intrinsics.areEqual(this.latest, leverBalance.latest) && Intrinsics.areEqual(this.openFlag, leverBalance.openFlag) && Intrinsics.areEqual(this.isAutoRepay, leverBalance.isAutoRepay) && Intrinsics.areEqual(this.userLeverage, leverBalance.userLeverage) && Intrinsics.areEqual(this.valuableCurrency, leverBalance.valuableCurrency) && Intrinsics.areEqual(this.execute, leverBalance.execute) && Intrinsics.areEqual(this.isOneClickLiquidationOpen, leverBalance.isOneClickLiquidationOpen) && Intrinsics.areEqual(this.isSignAgreement, leverBalance.isSignAgreement) && Intrinsics.areEqual(this.agreementUrl, leverBalance.agreementUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsAutoRepay() {
        return this.isAutoRepay;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getUserLeverage() {
        return this.userLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsOneClickLiquidationOpen() {
        return this.isOneClickLiquidationOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsSignAgreement() {
        return this.isSignAgreement;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAgreementUrl() {
        return this.agreementUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMarginCoefficientTotalAsset() {
        return this.marginCoefficientTotalAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getCollateralAssetsAmount() {
        return this.collateralAssetsAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getLatest() {
        return this.latest;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getOpenFlag() {
        return this.openFlag;
    }

    @NotNull
    public final LeverBalance copy(@Nullable BigDecimal liabilityRate, @Nullable String status, @Nullable String statusBizType, @Nullable BigDecimal totalBalance, @Nullable BigDecimal totalLiability, @Nullable BigDecimal marginCoefficientTotalAsset, @Nullable BigDecimal collateralAssetsAmount, @Nullable Boolean latest, @Nullable Boolean openFlag, @Nullable Boolean isAutoRepay, @Nullable BigDecimal userLeverage, @Nullable String valuableCurrency, @Nullable Boolean execute, @Nullable Boolean isOneClickLiquidationOpen, @Nullable Boolean isSignAgreement, @Nullable String agreementUrl) {
        return new LeverBalance(liabilityRate, status, statusBizType, totalBalance, totalLiability, marginCoefficientTotalAsset, collateralAssetsAmount, latest, openFlag, isAutoRepay, userLeverage, valuableCurrency, execute, isOneClickLiquidationOpen, isSignAgreement, agreementUrl);
    }

    @Nullable
    public final String getAgreementUrl() {
        return this.agreementUrl;
    }

    @Nullable
    public final BigDecimal getCollateralAssetsAmount() {
        return this.collateralAssetsAmount;
    }

    @Nullable
    public final BigDecimal getCrossCoefficientTotalAsset() {
        BigDecimal bigDecimal = this.collateralAssetsAmount;
        return bigDecimal == null ? this.marginCoefficientTotalAsset : bigDecimal;
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final Boolean getLatest() {
        return this.latest;
    }

    @Nullable
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final BigDecimal getMarginCoefficientTotalAsset() {
        return this.marginCoefficientTotalAsset;
    }

    @Nullable
    public final Boolean getOpenFlag() {
        return this.openFlag;
    }

    @NotNull
    public final String getRealBalancePriceString() {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal = this.totalBalance;
        String strM89950x = null;
        if (bigDecimal != null && (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(this.totalLiability, null, 1, null))) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalSubtract, this.valuableCurrency), null, null, 0, false, true, false, true, 47, null);
        }
        return C27041f.m66669i(strM89950x, "--");
    }

    @NotNull
    public final String getRealBalanceString(@Nullable String coinOrSymbol, int precision) {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal = this.totalBalance;
        String strM85562a = null;
        if (bigDecimal != null && (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(this.totalLiability, null, 1, null))) != null) {
            strM85562a = C37885i.m85562a(bigDecimalSubtract, coinOrSymbol, precision);
        }
        return C27041f.m66669i(strM85562a, "--");
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final BigDecimal getUserLeverage() {
        return this.userLeverage;
    }

    @Nullable
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.liabilityRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusBizType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalLiability;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.marginCoefficientTotalAsset;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.collateralAssetsAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Boolean bool = this.latest;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.openFlag;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAutoRepay;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.userLeverage;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str3 = this.valuableCurrency;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.execute;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isOneClickLiquidationOpen;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isSignAgreement;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str4 = this.agreementUrl;
        return iHashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAutoRepay() {
        return this.isAutoRepay;
    }

    public final boolean isLiability() {
        return Intrinsics.areEqual(this.status, "LIABILITY");
    }

    @Nullable
    public final Boolean isOneClickLiquidationOpen() {
        return this.isOneClickLiquidationOpen;
    }

    public final boolean isOpenStatus() {
        return (C27039d.m66647g(this.totalBalance) == 0.0d && C27039d.m66647g(this.totalLiability) == 0.0d) ? false : true;
    }

    @Nullable
    public final Boolean isSignAgreement() {
        return this.isSignAgreement;
    }

    public final void setAutoRepay(@Nullable Boolean bool) {
        this.isAutoRepay = bool;
    }

    public final void setCollateralAssetsAmount(@Nullable BigDecimal bigDecimal) {
        this.collateralAssetsAmount = bigDecimal;
    }

    public final void setLiabilityRate(@Nullable BigDecimal bigDecimal) {
        this.liabilityRate = bigDecimal;
    }

    public final void setMarginCoefficientTotalAsset(@Nullable BigDecimal bigDecimal) {
        this.marginCoefficientTotalAsset = bigDecimal;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setStatusBizType(@Nullable String str) {
        this.statusBizType = str;
    }

    public final void setUserLeverage(@Nullable BigDecimal bigDecimal) {
        this.userLeverage = bigDecimal;
    }

    public final void setValuableCurrency(@Nullable String str) {
        this.valuableCurrency = str;
    }

    @NotNull
    public String toString() {
        return "LeverBalance(liabilityRate=" + this.liabilityRate + ", status=" + this.status + ", statusBizType=" + this.statusBizType + ", totalBalance=" + this.totalBalance + ", totalLiability=" + this.totalLiability + ", marginCoefficientTotalAsset=" + this.marginCoefficientTotalAsset + ", collateralAssetsAmount=" + this.collateralAssetsAmount + ", latest=" + this.latest + ", openFlag=" + this.openFlag + ", isAutoRepay=" + this.isAutoRepay + ", userLeverage=" + this.userLeverage + ", valuableCurrency=" + this.valuableCurrency + ", execute=" + this.execute + ", isOneClickLiquidationOpen=" + this.isOneClickLiquidationOpen + ", isSignAgreement=" + this.isSignAgreement + ", agreementUrl=" + this.agreementUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.liabilityRate);
        dest.writeString(this.status);
        dest.writeString(this.statusBizType);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.totalLiability);
        dest.writeSerializable(this.marginCoefficientTotalAsset);
        dest.writeSerializable(this.collateralAssetsAmount);
        Boolean bool = this.latest;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.openFlag;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isAutoRepay;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.userLeverage);
        dest.writeString(this.valuableCurrency);
        Boolean bool4 = this.execute;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isOneClickLiquidationOpen;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isSignAgreement;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.agreementUrl);
    }

    public /* synthetic */ LeverBalance(BigDecimal bigDecimal, String str, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Boolean bool, Boolean bool2, Boolean bool3, BigDecimal bigDecimal6, String str3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bool, bool2, bool3, bigDecimal6, str3, (i11 & 4096) != 0 ? Boolean.TRUE : bool4, (i11 & 8192) != 0 ? Boolean.FALSE : bool5, (i11 & 16384) != 0 ? Boolean.FALSE : bool6, str4);
    }

    public LeverBalance() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
