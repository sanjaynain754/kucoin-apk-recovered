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
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f¨\u0006)"}, m90084d2 = {"Lcom/kubi/data/entity/SubAssetEntity;", "Landroid/os/Parcelable;", "totalBalance", "Ljava/math/BigDecimal;", "hasSubAccount", "", "showSubAccountBalanceSwitch", "execute", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHasSubAccount", "()Ljava/lang/Boolean;", "setHasSubAccount", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowSubAccountBalanceSwitch", "setShowSubAccountBalanceSwitch", "getExecute", "component1", "component2", "component3", "component4", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/data/entity/SubAssetEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubAssetEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubAssetEntity> CREATOR = new Creator();

    @Nullable
    private final Boolean execute;

    @Nullable
    private Boolean hasSubAccount;

    @Nullable
    private Boolean showSubAccountBalanceSwitch;

    @Nullable
    private BigDecimal totalBalance;

    /* JADX INFO: compiled from: SingleCurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<SubAssetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubAssetEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf3 = null;
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
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SubAssetEntity(bigDecimal, boolValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubAssetEntity[] newArray(int i11) {
            return new SubAssetEntity[i11];
        }
    }

    public SubAssetEntity(@Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.totalBalance = bigDecimal;
        this.hasSubAccount = bool;
        this.showSubAccountBalanceSwitch = bool2;
        this.execute = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubAssetEntity)) {
            return false;
        }
        SubAssetEntity subAssetEntity = (SubAssetEntity) other;
        return Intrinsics.areEqual(this.totalBalance, subAssetEntity.totalBalance) && Intrinsics.areEqual(this.hasSubAccount, subAssetEntity.hasSubAccount) && Intrinsics.areEqual(this.showSubAccountBalanceSwitch, subAssetEntity.showSubAccountBalanceSwitch) && Intrinsics.areEqual(this.execute, subAssetEntity.execute);
    }

    public static /* synthetic */ SubAssetEntity copy$default(SubAssetEntity subAssetEntity, BigDecimal bigDecimal, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = subAssetEntity.totalBalance;
        }
        if ((i11 & 2) != 0) {
            bool = subAssetEntity.hasSubAccount;
        }
        if ((i11 & 4) != 0) {
            bool2 = subAssetEntity.showSubAccountBalanceSwitch;
        }
        if ((i11 & 8) != 0) {
            bool3 = subAssetEntity.execute;
        }
        return subAssetEntity.copy(bigDecimal, bool, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasSubAccount() {
        return this.hasSubAccount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getShowSubAccountBalanceSwitch() {
        return this.showSubAccountBalanceSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final SubAssetEntity copy(@Nullable BigDecimal totalBalance, @Nullable Boolean hasSubAccount, @Nullable Boolean showSubAccountBalanceSwitch, @Nullable Boolean execute) {
        return new SubAssetEntity(totalBalance, hasSubAccount, showSubAccountBalanceSwitch, execute);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final Boolean getHasSubAccount() {
        return this.hasSubAccount;
    }

    @Nullable
    public final Boolean getShowSubAccountBalanceSwitch() {
        return this.showSubAccountBalanceSwitch;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.hasSubAccount;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showSubAccountBalanceSwitch;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.execute;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setHasSubAccount(@Nullable Boolean bool) {
        this.hasSubAccount = bool;
    }

    public final void setShowSubAccountBalanceSwitch(@Nullable Boolean bool) {
        this.showSubAccountBalanceSwitch = bool;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "SubAssetEntity(totalBalance=" + this.totalBalance + ", hasSubAccount=" + this.hasSubAccount + ", showSubAccountBalanceSwitch=" + this.showSubAccountBalanceSwitch + ", execute=" + this.execute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalBalance);
        Boolean bool = this.hasSubAccount;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showSubAccountBalanceSwitch;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.execute;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ SubAssetEntity(BigDecimal bigDecimal, Boolean bool, Boolean bool2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i11 & 2) != 0 ? Boolean.FALSE : bool, (i11 & 4) != 0 ? Boolean.FALSE : bool2, (i11 & 8) != 0 ? Boolean.TRUE : bool3);
    }
}
