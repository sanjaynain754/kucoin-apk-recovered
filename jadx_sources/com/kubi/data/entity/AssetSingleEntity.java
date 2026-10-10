package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SingleCurrencyBalance.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u0006,"}, m90084d2 = {"Lcom/kubi/data/entity/AssetSingleEntity;", "Landroid/os/Parcelable;", "totalBalance", "Ljava/math/BigDecimal;", "holdBalance", "availableBalance", "netAmountBtc", "obligatoryRightAmountBtc", "lendIncomeAmountBtc", "realizedIncomeAmountBtc", "unrealizedIncomeAmountBtc", "valuableCurrency", "", "execute", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getAvailableBalance", "setAvailableBalance", "getNetAmountBtc", "getObligatoryRightAmountBtc", "getLendIncomeAmountBtc", "getRealizedIncomeAmountBtc", "getUnrealizedIncomeAmountBtc", "getValuableCurrency", "()Ljava/lang/String;", "setValuableCurrency", "(Ljava/lang/String;)V", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetSingleEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetSingleEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal availableBalance;

    @Nullable
    private final Boolean execute;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private final BigDecimal lendIncomeAmountBtc;

    @Nullable
    private final BigDecimal netAmountBtc;

    @Nullable
    private final BigDecimal obligatoryRightAmountBtc;

    @Nullable
    private final BigDecimal realizedIncomeAmountBtc;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    private final BigDecimal unrealizedIncomeAmountBtc;

    @Nullable
    private String valuableCurrency;

    /* JADX INFO: compiled from: SingleCurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetSingleEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSingleEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AssetSingleEntity(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSingleEntity[] newArray(int i11) {
            return new AssetSingleEntity[i11];
        }
    }

    public AssetSingleEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AssetSingleEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable String str, @Nullable Boolean bool) {
        this.totalBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.availableBalance = bigDecimal3;
        this.netAmountBtc = bigDecimal4;
        this.obligatoryRightAmountBtc = bigDecimal5;
        this.lendIncomeAmountBtc = bigDecimal6;
        this.realizedIncomeAmountBtc = bigDecimal7;
        this.unrealizedIncomeAmountBtc = bigDecimal8;
        this.valuableCurrency = str;
        this.execute = bool;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getLendIncomeAmountBtc() {
        return this.lendIncomeAmountBtc;
    }

    @Nullable
    public final BigDecimal getNetAmountBtc() {
        return this.netAmountBtc;
    }

    @Nullable
    public final BigDecimal getObligatoryRightAmountBtc() {
        return this.obligatoryRightAmountBtc;
    }

    @Nullable
    public final BigDecimal getRealizedIncomeAmountBtc() {
        return this.realizedIncomeAmountBtc;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getUnrealizedIncomeAmountBtc() {
        return this.unrealizedIncomeAmountBtc;
    }

    @Nullable
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    public final void setAvailableBalance(@Nullable BigDecimal bigDecimal) {
        this.availableBalance = bigDecimal;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    public final void setValuableCurrency(@Nullable String str) {
        this.valuableCurrency = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.netAmountBtc);
        dest.writeSerializable(this.obligatoryRightAmountBtc);
        dest.writeSerializable(this.lendIncomeAmountBtc);
        dest.writeSerializable(this.realizedIncomeAmountBtc);
        dest.writeSerializable(this.unrealizedIncomeAmountBtc);
        dest.writeString(this.valuableCurrency);
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ AssetSingleEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 16) != 0 ? null : bigDecimal5, (i11 & 32) != 0 ? null : bigDecimal6, (i11 & 64) != 0 ? null : bigDecimal7, (i11 & 128) != 0 ? null : bigDecimal8, (i11 & 256) != 0 ? null : str, (i11 & 512) != 0 ? Boolean.TRUE : bool);
    }
}
