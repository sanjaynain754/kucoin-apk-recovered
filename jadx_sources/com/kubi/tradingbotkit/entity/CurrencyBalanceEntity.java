package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyBalanceEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010#\u001a\u0004\u0018\u00010\u0006J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÂ\u0003Ju\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/CurrencyBalanceEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "totalBalance", "Ljava/math/BigDecimal;", "holdBalance", "markPrice", "liability", "liabilityInterest", "liabilityPrincipal", "latestMarkPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyName", "setCurrencyName", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getMarkPrice", "setMarkPrice", "getLiability", "setLiability", "getLiabilityInterest", "setLiabilityInterest", "getLiabilityPrincipal", "setLiabilityPrincipal", "getAvailableBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyBalanceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyBalanceEntity> CREATOR = new C26212a();

    @Nullable
    private String currency;

    @Nullable
    private String currencyName;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private BigDecimal latestMarkPrice;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal liabilityInterest;

    @Nullable
    private BigDecimal liabilityPrincipal;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private BigDecimal totalBalance;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.CurrencyBalanceEntity$a */
    /* JADX INFO: compiled from: CurrencyBalanceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26212a implements Parcelable.Creator<CurrencyBalanceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalanceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyBalanceEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalanceEntity[] newArray(int i11) {
            return new CurrencyBalanceEntity[i11];
        }
    }

    public CurrencyBalanceEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyBalanceEntity)) {
            return false;
        }
        CurrencyBalanceEntity currencyBalanceEntity = (CurrencyBalanceEntity) other;
        return Intrinsics.areEqual(this.currency, currencyBalanceEntity.currency) && Intrinsics.areEqual(this.currencyName, currencyBalanceEntity.currencyName) && Intrinsics.areEqual(this.totalBalance, currencyBalanceEntity.totalBalance) && Intrinsics.areEqual(this.holdBalance, currencyBalanceEntity.holdBalance) && Intrinsics.areEqual(this.markPrice, currencyBalanceEntity.markPrice) && Intrinsics.areEqual(this.liability, currencyBalanceEntity.liability) && Intrinsics.areEqual(this.liabilityInterest, currencyBalanceEntity.liabilityInterest) && Intrinsics.areEqual(this.liabilityPrincipal, currencyBalanceEntity.liabilityPrincipal) && Intrinsics.areEqual(this.latestMarkPrice, currencyBalanceEntity.latestMarkPrice);
    }

    public CurrencyBalanceEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.currency = str;
        this.currencyName = str2;
        this.totalBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.markPrice = bigDecimal3;
        this.liability = bigDecimal4;
        this.liabilityInterest = bigDecimal5;
        this.liabilityPrincipal = bigDecimal6;
        this.latestMarkPrice = bigDecimal7;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final BigDecimal getLatestMarkPrice() {
        return this.latestMarkPrice;
    }

    public static /* synthetic */ CurrencyBalanceEntity copy$default(CurrencyBalanceEntity currencyBalanceEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = currencyBalanceEntity.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = currencyBalanceEntity.currencyName;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = currencyBalanceEntity.totalBalance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = currencyBalanceEntity.holdBalance;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = currencyBalanceEntity.markPrice;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = currencyBalanceEntity.liability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal5 = currencyBalanceEntity.liabilityInterest;
        }
        if ((i11 & 128) != 0) {
            bigDecimal6 = currencyBalanceEntity.liabilityPrincipal;
        }
        if ((i11 & 256) != 0) {
            bigDecimal7 = currencyBalanceEntity.latestMarkPrice;
        }
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal5;
        BigDecimal bigDecimal12 = bigDecimal3;
        BigDecimal bigDecimal13 = bigDecimal;
        return currencyBalanceEntity.copy(str, str2, bigDecimal13, bigDecimal2, bigDecimal12, bigDecimal10, bigDecimal11, bigDecimal8, bigDecimal9);
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
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @NotNull
    public final CurrencyBalanceEntity copy(@Nullable String currency, @Nullable String currencyName, @Nullable BigDecimal totalBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal markPrice, @Nullable BigDecimal liability, @Nullable BigDecimal liabilityInterest, @Nullable BigDecimal liabilityPrincipal, @Nullable BigDecimal latestMarkPrice) {
        return new CurrencyBalanceEntity(currency, currencyName, totalBalance, holdBalance, markPrice, liability, liabilityInterest, liabilityPrincipal, latestMarkPrice);
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        BigDecimal bigDecimal = this.totalBalance;
        if (bigDecimal != null) {
            return bigDecimal.subtract(C41014a.m89922G(this.holdBalance, null, 1, null));
        }
        return null;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.markPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.liability;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liabilityInterest;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liabilityPrincipal;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.latestMarkPrice;
        return iHashCode8 + (bigDecimal7 != null ? bigDecimal7.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setLiabilityInterest(@Nullable BigDecimal bigDecimal) {
        this.liabilityInterest = bigDecimal;
    }

    public final void setLiabilityPrincipal(@Nullable BigDecimal bigDecimal) {
        this.liabilityPrincipal = bigDecimal;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "CurrencyBalanceEntity(currency=" + this.currency + ", currencyName=" + this.currencyName + ", totalBalance=" + this.totalBalance + ", holdBalance=" + this.holdBalance + ", markPrice=" + this.markPrice + ", liability=" + this.liability + ", liabilityInterest=" + this.liabilityInterest + ", liabilityPrincipal=" + this.liabilityPrincipal + ", latestMarkPrice=" + this.latestMarkPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.liabilityInterest);
        dest.writeSerializable(this.liabilityPrincipal);
        dest.writeSerializable(this.latestMarkPrice);
    }

    public /* synthetic */ CurrencyBalanceEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7);
    }
}
