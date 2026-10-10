package com.kubi.kumex.data.market.model;

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

/* JADX INFO: compiled from: DistributionQuoteEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "amount", "Ljava/math/BigDecimal;", "withdrawAmount", "withDrawNumber", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getWithdrawAmount", "getWithDrawNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DistributionRetentionEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DistributionRetentionEntity> CREATOR = new C15777a();

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private String currency;

    @Nullable
    private final Integer withDrawNumber;

    @Nullable
    private final BigDecimal withdrawAmount;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.DistributionRetentionEntity$a */
    /* JADX INFO: compiled from: DistributionQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15777a implements Parcelable.Creator<DistributionRetentionEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DistributionRetentionEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DistributionRetentionEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DistributionRetentionEntity[] newArray(int i11) {
            return new DistributionRetentionEntity[i11];
        }
    }

    public DistributionRetentionEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Integer num) {
        this.currency = str;
        this.amount = bigDecimal;
        this.withdrawAmount = bigDecimal2;
        this.withDrawNumber = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistributionRetentionEntity)) {
            return false;
        }
        DistributionRetentionEntity distributionRetentionEntity = (DistributionRetentionEntity) other;
        return Intrinsics.areEqual(this.currency, distributionRetentionEntity.currency) && Intrinsics.areEqual(this.amount, distributionRetentionEntity.amount) && Intrinsics.areEqual(this.withdrawAmount, distributionRetentionEntity.withdrawAmount) && Intrinsics.areEqual(this.withDrawNumber, distributionRetentionEntity.withDrawNumber);
    }

    public static /* synthetic */ DistributionRetentionEntity copy$default(DistributionRetentionEntity distributionRetentionEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = distributionRetentionEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = distributionRetentionEntity.amount;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = distributionRetentionEntity.withdrawAmount;
        }
        if ((i11 & 8) != 0) {
            num = distributionRetentionEntity.withDrawNumber;
        }
        return distributionRetentionEntity.copy(str, bigDecimal, bigDecimal2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getWithdrawAmount() {
        return this.withdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getWithDrawNumber() {
        return this.withDrawNumber;
    }

    @NotNull
    public final DistributionRetentionEntity copy(@Nullable String currency, @Nullable BigDecimal amount, @Nullable BigDecimal withdrawAmount, @Nullable Integer withDrawNumber) {
        return new DistributionRetentionEntity(currency, amount, withdrawAmount, withDrawNumber);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getWithDrawNumber() {
        return this.withDrawNumber;
    }

    @Nullable
    public final BigDecimal getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.withdrawAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num = this.withDrawNumber;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    @NotNull
    public String toString() {
        return "DistributionRetentionEntity(currency=" + this.currency + ", amount=" + this.amount + ", withdrawAmount=" + this.withdrawAmount + ", withDrawNumber=" + this.withDrawNumber + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.withdrawAmount);
        Integer num = this.withDrawNumber;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ DistributionRetentionEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, bigDecimal, bigDecimal2, num);
    }
}
