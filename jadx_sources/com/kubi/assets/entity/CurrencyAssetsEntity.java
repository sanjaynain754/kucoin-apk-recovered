package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyAssetsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/CurrencyAssetsEntity;", "Landroid/os/Parcelable;", "equity", "Ljava/math/BigDecimal;", "balance", "available", "hold", "locked", "liability", "unrealisedPnl", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getEquity", "()Ljava/math/BigDecimal;", "getBalance", "getAvailable", "getHold", "getLocked", "getLiability", "getUnrealisedPnl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyAssetsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyAssetsEntity> CREATOR = new Creator();

    @Nullable
    private final BigDecimal available;

    @Nullable
    private final BigDecimal balance;

    @Nullable
    private final BigDecimal equity;

    @Nullable
    private final BigDecimal hold;

    @Nullable
    private final BigDecimal liability;

    @Nullable
    private final BigDecimal locked;

    @Nullable
    private final BigDecimal unrealisedPnl;

    /* JADX INFO: compiled from: CurrencyAssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencyAssetsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyAssetsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyAssetsEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyAssetsEntity[] newArray(int i11) {
            return new CurrencyAssetsEntity[i11];
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
        if (!(other instanceof CurrencyAssetsEntity)) {
            return false;
        }
        CurrencyAssetsEntity currencyAssetsEntity = (CurrencyAssetsEntity) other;
        return Intrinsics.areEqual(this.equity, currencyAssetsEntity.equity) && Intrinsics.areEqual(this.balance, currencyAssetsEntity.balance) && Intrinsics.areEqual(this.available, currencyAssetsEntity.available) && Intrinsics.areEqual(this.hold, currencyAssetsEntity.hold) && Intrinsics.areEqual(this.locked, currencyAssetsEntity.locked) && Intrinsics.areEqual(this.liability, currencyAssetsEntity.liability) && Intrinsics.areEqual(this.unrealisedPnl, currencyAssetsEntity.unrealisedPnl);
    }

    public static /* synthetic */ CurrencyAssetsEntity copy$default(CurrencyAssetsEntity currencyAssetsEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = currencyAssetsEntity.equity;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = currencyAssetsEntity.balance;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = currencyAssetsEntity.available;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = currencyAssetsEntity.hold;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = currencyAssetsEntity.locked;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = currencyAssetsEntity.liability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = currencyAssetsEntity.unrealisedPnl;
        }
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal5;
        BigDecimal bigDecimal11 = bigDecimal3;
        return currencyAssetsEntity.copy(bigDecimal, bigDecimal2, bigDecimal11, bigDecimal4, bigDecimal10, bigDecimal8, bigDecimal9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLocked() {
        return this.locked;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @NotNull
    public final CurrencyAssetsEntity copy(@Nullable BigDecimal equity, @Nullable BigDecimal balance, @Nullable BigDecimal available, @Nullable BigDecimal hold, @Nullable BigDecimal locked, @Nullable BigDecimal liability, @Nullable BigDecimal unrealisedPnl) {
        return new CurrencyAssetsEntity(equity, balance, available, hold, locked, liability, unrealisedPnl);
    }

    @Nullable
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLocked() {
        return this.locked;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.equity;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.available;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.hold;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.locked;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liability;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.unrealisedPnl;
        return iHashCode6 + (bigDecimal7 != null ? bigDecimal7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencyAssetsEntity(equity=" + this.equity + ", balance=" + this.balance + ", available=" + this.available + ", hold=" + this.hold + ", locked=" + this.locked + ", liability=" + this.liability + ", unrealisedPnl=" + this.unrealisedPnl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.equity);
        dest.writeSerializable(this.balance);
        dest.writeSerializable(this.available);
        dest.writeSerializable(this.hold);
        dest.writeSerializable(this.locked);
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.unrealisedPnl);
    }

    public CurrencyAssetsEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.equity = bigDecimal;
        this.balance = bigDecimal2;
        this.available = bigDecimal3;
        this.hold = bigDecimal4;
        this.locked = bigDecimal5;
        this.liability = bigDecimal6;
        this.unrealisedPnl = bigDecimal7;
    }
}
