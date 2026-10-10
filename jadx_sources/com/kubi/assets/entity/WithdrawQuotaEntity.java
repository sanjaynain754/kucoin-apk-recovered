package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\bJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000f¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawQuotaEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "withdrawMinSize", "Ljava/math/BigDecimal;", "remainAmount", "precision", "", "limitQuotaCurrencyAmount", "usedQuotaCurrencyAmount", "quotaCurrency", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getWithdrawMinSize", "()Ljava/math/BigDecimal;", "setWithdrawMinSize", "(Ljava/math/BigDecimal;)V", "getRemainAmount", "setRemainAmount", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimitQuotaCurrencyAmount", "setLimitQuotaCurrencyAmount", "getUsedQuotaCurrencyAmount", "setUsedQuotaCurrencyAmount", "getQuotaCurrency", "isEmpty", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawQuotaEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawQuotaEntity> CREATOR = new Creator();

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal limitQuotaCurrencyAmount;

    @Nullable
    private final Integer precision;

    @Nullable
    private final String quotaCurrency;

    @Nullable
    private BigDecimal remainAmount;

    @Nullable
    private BigDecimal usedQuotaCurrencyAmount;

    @Nullable
    private BigDecimal withdrawMinSize;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawQuotaEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawQuotaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawQuotaEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawQuotaEntity[] newArray(int i11) {
            return new WithdrawQuotaEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getLimitQuotaCurrencyAmount() {
        return this.limitQuotaCurrencyAmount;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getQuotaCurrency() {
        return this.quotaCurrency;
    }

    @Nullable
    public final BigDecimal getRemainAmount() {
        return this.remainAmount;
    }

    @Nullable
    public final BigDecimal getUsedQuotaCurrencyAmount() {
        return this.usedQuotaCurrencyAmount;
    }

    @Nullable
    public final BigDecimal getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public final boolean isEmpty() {
        String str = this.currency;
        return str == null || str.length() == 0;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setLimitQuotaCurrencyAmount(@Nullable BigDecimal bigDecimal) {
        this.limitQuotaCurrencyAmount = bigDecimal;
    }

    public final void setRemainAmount(@Nullable BigDecimal bigDecimal) {
        this.remainAmount = bigDecimal;
    }

    public final void setUsedQuotaCurrencyAmount(@Nullable BigDecimal bigDecimal) {
        this.usedQuotaCurrencyAmount = bigDecimal;
    }

    public final void setWithdrawMinSize(@Nullable BigDecimal bigDecimal) {
        this.withdrawMinSize = bigDecimal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.withdrawMinSize);
        dest.writeSerializable(this.remainAmount);
        Integer num = this.precision;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeSerializable(this.limitQuotaCurrencyAmount);
        dest.writeSerializable(this.usedQuotaCurrencyAmount);
        dest.writeString(this.quotaCurrency);
    }

    public WithdrawQuotaEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Integer num, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str2) {
        this.currency = str;
        this.withdrawMinSize = bigDecimal;
        this.remainAmount = bigDecimal2;
        this.precision = num;
        this.limitQuotaCurrencyAmount = bigDecimal3;
        this.usedQuotaCurrencyAmount = bigDecimal4;
        this.quotaCurrency = str2;
    }
}
