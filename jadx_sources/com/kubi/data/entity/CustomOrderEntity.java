package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SingleCurrencyBalance.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/data/entity/CustomOrderEntity;", "Landroid/os/Parcelable;", "totalBalance", "Ljava/math/BigDecimal;", "totalBalanceMinusSub", "baseCurrency", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getTotalBalanceMinusSub", "setTotalBalanceMinusSub", "getBaseCurrency", "()Ljava/lang/String;", "setBaseCurrency", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CustomOrderEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomOrderEntity> CREATOR = new Creator();

    @Nullable
    private String baseCurrency;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    private BigDecimal totalBalanceMinusSub;

    /* JADX INFO: compiled from: SingleCurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomOrderEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomOrderEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomOrderEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomOrderEntity[] newArray(int i11) {
            return new CustomOrderEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomOrderEntity)) {
            return false;
        }
        CustomOrderEntity customOrderEntity = (CustomOrderEntity) other;
        return Intrinsics.areEqual(this.totalBalance, customOrderEntity.totalBalance) && Intrinsics.areEqual(this.totalBalanceMinusSub, customOrderEntity.totalBalanceMinusSub) && Intrinsics.areEqual(this.baseCurrency, customOrderEntity.baseCurrency);
    }

    public static /* synthetic */ CustomOrderEntity copy$default(CustomOrderEntity customOrderEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = customOrderEntity.totalBalance;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = customOrderEntity.totalBalanceMinusSub;
        }
        if ((i11 & 4) != 0) {
            str = customOrderEntity.baseCurrency;
        }
        return customOrderEntity.copy(bigDecimal, bigDecimal2, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalBalanceMinusSub() {
        return this.totalBalanceMinusSub;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final CustomOrderEntity copy(@Nullable BigDecimal totalBalance, @Nullable BigDecimal totalBalanceMinusSub, @Nullable String baseCurrency) {
        return new CustomOrderEntity(totalBalance, totalBalanceMinusSub, baseCurrency);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalanceMinusSub() {
        return this.totalBalanceMinusSub;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.totalBalanceMinusSub;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.baseCurrency;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    public final void setTotalBalanceMinusSub(@Nullable BigDecimal bigDecimal) {
        this.totalBalanceMinusSub = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "CustomOrderEntity(totalBalance=" + this.totalBalance + ", totalBalanceMinusSub=" + this.totalBalanceMinusSub + ", baseCurrency=" + this.baseCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.totalBalanceMinusSub);
        dest.writeString(this.baseCurrency);
    }

    public CustomOrderEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str) {
        this.totalBalance = bigDecimal;
        this.totalBalanceMinusSub = bigDecimal2;
        this.baseCurrency = str;
    }
}
