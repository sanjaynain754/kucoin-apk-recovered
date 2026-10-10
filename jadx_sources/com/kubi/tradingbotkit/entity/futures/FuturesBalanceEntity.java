package com.kubi.tradingbotkit.entity.futures;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesBalanceEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00104J¶\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020IJ\u0013\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020IHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020IR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006T"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FuturesBalanceEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "availableBalance", "Ljava/math/BigDecimal;", "holdBalance", "maintMargin", ViewProps.MARGIN, "orderMargin", "totalBalance", "unrealisedPNL", "walletBalance", "withdrawHold", "trialBalance", "trialLimit", "withdrawBalance", "trialHistory", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getAvailableBalance", "()Ljava/math/BigDecimal;", "setAvailableBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getMaintMargin", "setMaintMargin", "getMargin", "setMargin", "getOrderMargin", "setOrderMargin", "getTotalBalance", "setTotalBalance", "getUnrealisedPNL", "setUnrealisedPNL", "getWalletBalance", "setWalletBalance", "getWithdrawHold", "setWithdrawHold", "getTrialBalance", "setTrialBalance", "getTrialLimit", "setTrialLimit", "getWithdrawBalance", "setWithdrawBalance", "getTrialHistory", "()Ljava/lang/Boolean;", "setTrialHistory", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/kubi/tradingbotkit/entity/futures/FuturesBalanceEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesBalanceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesBalanceEntity> CREATOR = new C26222a();

    @Nullable
    private BigDecimal availableBalance;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private BigDecimal maintMargin;

    @Nullable
    private BigDecimal margin;

    @Nullable
    private BigDecimal orderMargin;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    private BigDecimal trialBalance;

    @Nullable
    private Boolean trialHistory;

    @Nullable
    private BigDecimal trialLimit;

    @Nullable
    private BigDecimal unrealisedPNL;

    @Nullable
    private BigDecimal walletBalance;

    @Nullable
    private BigDecimal withdrawBalance;

    @Nullable
    private BigDecimal withdrawHold;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.futures.FuturesBalanceEntity$a */
    /* JADX INFO: compiled from: FuturesBalanceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26222a implements Parcelable.Creator<FuturesBalanceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesBalanceEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FuturesBalanceEntity(string, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesBalanceEntity[] newArray(int i11) {
            return new FuturesBalanceEntity[i11];
        }
    }

    public FuturesBalanceEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @NotNull
    public final FuturesBalanceEntity copy(@Nullable String currency, @Nullable BigDecimal availableBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal maintMargin, @Nullable BigDecimal margin, @Nullable BigDecimal orderMargin, @Nullable BigDecimal totalBalance, @Nullable BigDecimal unrealisedPNL, @Nullable BigDecimal walletBalance, @Nullable BigDecimal withdrawHold, @Nullable BigDecimal trialBalance, @Nullable BigDecimal trialLimit, @Nullable BigDecimal withdrawBalance, @Nullable Boolean trialHistory) {
        return new FuturesBalanceEntity(currency, availableBalance, holdBalance, maintMargin, margin, orderMargin, totalBalance, unrealisedPNL, walletBalance, withdrawHold, trialBalance, trialLimit, withdrawBalance, trialHistory);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesBalanceEntity)) {
            return false;
        }
        FuturesBalanceEntity futuresBalanceEntity = (FuturesBalanceEntity) other;
        return Intrinsics.areEqual(this.currency, futuresBalanceEntity.currency) && Intrinsics.areEqual(this.availableBalance, futuresBalanceEntity.availableBalance) && Intrinsics.areEqual(this.holdBalance, futuresBalanceEntity.holdBalance) && Intrinsics.areEqual(this.maintMargin, futuresBalanceEntity.maintMargin) && Intrinsics.areEqual(this.margin, futuresBalanceEntity.margin) && Intrinsics.areEqual(this.orderMargin, futuresBalanceEntity.orderMargin) && Intrinsics.areEqual(this.totalBalance, futuresBalanceEntity.totalBalance) && Intrinsics.areEqual(this.unrealisedPNL, futuresBalanceEntity.unrealisedPNL) && Intrinsics.areEqual(this.walletBalance, futuresBalanceEntity.walletBalance) && Intrinsics.areEqual(this.withdrawHold, futuresBalanceEntity.withdrawHold) && Intrinsics.areEqual(this.trialBalance, futuresBalanceEntity.trialBalance) && Intrinsics.areEqual(this.trialLimit, futuresBalanceEntity.trialLimit) && Intrinsics.areEqual(this.withdrawBalance, futuresBalanceEntity.withdrawBalance) && Intrinsics.areEqual(this.trialHistory, futuresBalanceEntity.trialHistory);
    }

    public FuturesBalanceEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable Boolean bool) {
        this.currency = str;
        this.availableBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.maintMargin = bigDecimal3;
        this.margin = bigDecimal4;
        this.orderMargin = bigDecimal5;
        this.totalBalance = bigDecimal6;
        this.unrealisedPNL = bigDecimal7;
        this.walletBalance = bigDecimal8;
        this.withdrawHold = bigDecimal9;
        this.trialBalance = bigDecimal10;
        this.trialLimit = bigDecimal11;
        this.withdrawBalance = bigDecimal12;
        this.trialHistory = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getWithdrawHold() {
        return this.withdrawHold;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getTrialBalance() {
        return this.trialBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getTrialLimit() {
        return this.trialLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getWithdrawBalance() {
        return this.withdrawBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getTrialHistory() {
        return this.trialHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getOrderMargin() {
        return this.orderMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getUnrealisedPNL() {
        return this.unrealisedPNL;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getWalletBalance() {
        return this.walletBalance;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getMaintMargin() {
        return this.maintMargin;
    }

    @Nullable
    public final BigDecimal getMargin() {
        return this.margin;
    }

    @Nullable
    public final BigDecimal getOrderMargin() {
        return this.orderMargin;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTrialBalance() {
        return this.trialBalance;
    }

    @Nullable
    public final Boolean getTrialHistory() {
        return this.trialHistory;
    }

    @Nullable
    public final BigDecimal getTrialLimit() {
        return this.trialLimit;
    }

    @Nullable
    public final BigDecimal getUnrealisedPNL() {
        return this.unrealisedPNL;
    }

    @Nullable
    public final BigDecimal getWalletBalance() {
        return this.walletBalance;
    }

    @Nullable
    public final BigDecimal getWithdrawBalance() {
        return this.withdrawBalance;
    }

    @Nullable
    public final BigDecimal getWithdrawHold() {
        return this.withdrawHold;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.availableBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maintMargin;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.margin;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.orderMargin;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalBalance;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.unrealisedPNL;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.walletBalance;
        int iHashCode9 = (iHashCode8 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.withdrawHold;
        int iHashCode10 = (iHashCode9 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.trialBalance;
        int iHashCode11 = (iHashCode10 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.trialLimit;
        int iHashCode12 = (iHashCode11 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.withdrawBalance;
        int iHashCode13 = (iHashCode12 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        Boolean bool = this.trialHistory;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAvailableBalance(@Nullable BigDecimal bigDecimal) {
        this.availableBalance = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setMaintMargin(@Nullable BigDecimal bigDecimal) {
        this.maintMargin = bigDecimal;
    }

    public final void setMargin(@Nullable BigDecimal bigDecimal) {
        this.margin = bigDecimal;
    }

    public final void setOrderMargin(@Nullable BigDecimal bigDecimal) {
        this.orderMargin = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    public final void setTrialBalance(@Nullable BigDecimal bigDecimal) {
        this.trialBalance = bigDecimal;
    }

    public final void setTrialHistory(@Nullable Boolean bool) {
        this.trialHistory = bool;
    }

    public final void setTrialLimit(@Nullable BigDecimal bigDecimal) {
        this.trialLimit = bigDecimal;
    }

    public final void setUnrealisedPNL(@Nullable BigDecimal bigDecimal) {
        this.unrealisedPNL = bigDecimal;
    }

    public final void setWalletBalance(@Nullable BigDecimal bigDecimal) {
        this.walletBalance = bigDecimal;
    }

    public final void setWithdrawBalance(@Nullable BigDecimal bigDecimal) {
        this.withdrawBalance = bigDecimal;
    }

    public final void setWithdrawHold(@Nullable BigDecimal bigDecimal) {
        this.withdrawHold = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "FuturesBalanceEntity(currency=" + this.currency + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", maintMargin=" + this.maintMargin + ", margin=" + this.margin + ", orderMargin=" + this.orderMargin + ", totalBalance=" + this.totalBalance + ", unrealisedPNL=" + this.unrealisedPNL + ", walletBalance=" + this.walletBalance + ", withdrawHold=" + this.withdrawHold + ", trialBalance=" + this.trialBalance + ", trialLimit=" + this.trialLimit + ", withdrawBalance=" + this.withdrawBalance + ", trialHistory=" + this.trialHistory + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.maintMargin);
        dest.writeSerializable(this.margin);
        dest.writeSerializable(this.orderMargin);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.unrealisedPNL);
        dest.writeSerializable(this.walletBalance);
        dest.writeSerializable(this.withdrawHold);
        dest.writeSerializable(this.trialBalance);
        dest.writeSerializable(this.trialLimit);
        dest.writeSerializable(this.withdrawBalance);
        Boolean bool = this.trialHistory;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ FuturesBalanceEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? null : bigDecimal6, (i11 & 128) != 0 ? null : bigDecimal7, (i11 & 256) != 0 ? null : bigDecimal8, (i11 & 512) != 0 ? null : bigDecimal9, (i11 & 1024) != 0 ? null : bigDecimal10, (i11 & 2048) != 0 ? null : bigDecimal11, (i11 & 4096) != 0 ? null : bigDecimal12, (i11 & 8192) != 0 ? null : bool);
    }
}
