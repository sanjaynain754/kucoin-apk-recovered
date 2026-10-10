package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositAccountEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u0005J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositAccountNameEntity;", "Landroid/os/Parcelable;", "accountType", "Lcom/kubi/data/coin/AccountType;", "accountName", "", "isRiskAccount", "", "isSelected", "isolatedName", "", "<init>", "(Lcom/kubi/data/coin/AccountType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "getAccountName", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "getIsolatedName", "()Ljava/lang/String;", "setIsolatedName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/kubi/data/coin/AccountType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/assets/entity/DepositAccountNameEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositAccountNameEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositAccountNameEntity> CREATOR = new Creator();

    @Nullable
    private final Integer accountName;

    @Nullable
    private final AccountType accountType;

    @Nullable
    private final Boolean isRiskAccount;

    @Nullable
    private Boolean isSelected;

    @Nullable
    private String isolatedName;

    /* JADX INFO: compiled from: DepositAccountEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositAccountNameEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountNameEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            AccountType accountTypeValueOf = parcel.readInt() == 0 ? null : AccountType.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DepositAccountNameEntity(accountTypeValueOf, numValueOf, boolValueOf, boolValueOf2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountNameEntity[] newArray(int i11) {
            return new DepositAccountNameEntity[i11];
        }
    }

    public DepositAccountNameEntity() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositAccountNameEntity)) {
            return false;
        }
        DepositAccountNameEntity depositAccountNameEntity = (DepositAccountNameEntity) other;
        return this.accountType == depositAccountNameEntity.accountType && Intrinsics.areEqual(this.accountName, depositAccountNameEntity.accountName) && Intrinsics.areEqual(this.isRiskAccount, depositAccountNameEntity.isRiskAccount) && Intrinsics.areEqual(this.isSelected, depositAccountNameEntity.isSelected) && Intrinsics.areEqual(this.isolatedName, depositAccountNameEntity.isolatedName);
    }

    public DepositAccountNameEntity(@Nullable AccountType accountType, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str) {
        this.accountType = accountType;
        this.accountName = num;
        this.isRiskAccount = bool;
        this.isSelected = bool2;
        this.isolatedName = str;
    }

    public static /* synthetic */ DepositAccountNameEntity copy$default(DepositAccountNameEntity depositAccountNameEntity, AccountType accountType, Integer num, Boolean bool, Boolean bool2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = depositAccountNameEntity.accountType;
        }
        if ((i11 & 2) != 0) {
            num = depositAccountNameEntity.accountName;
        }
        if ((i11 & 4) != 0) {
            bool = depositAccountNameEntity.isRiskAccount;
        }
        if ((i11 & 8) != 0) {
            bool2 = depositAccountNameEntity.isSelected;
        }
        if ((i11 & 16) != 0) {
            str = depositAccountNameEntity.isolatedName;
        }
        String str2 = str;
        Boolean bool3 = bool;
        return depositAccountNameEntity.copy(accountType, num, bool3, bool2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsRiskAccount() {
        return this.isRiskAccount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsolatedName() {
        return this.isolatedName;
    }

    @NotNull
    public final DepositAccountNameEntity copy(@Nullable AccountType accountType, @Nullable Integer accountName, @Nullable Boolean isRiskAccount, @Nullable Boolean isSelected, @Nullable String isolatedName) {
        return new DepositAccountNameEntity(accountType, accountName, isRiskAccount, isSelected, isolatedName);
    }

    @Nullable
    public final Integer getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getIsolatedName() {
        return this.isolatedName;
    }

    public int hashCode() {
        AccountType accountType = this.accountType;
        int iHashCode = (accountType == null ? 0 : accountType.hashCode()) * 31;
        Integer num = this.accountName;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isRiskAccount;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSelected;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.isolatedName;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRiskAccount() {
        return this.isRiskAccount;
    }

    @Nullable
    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setIsolatedName(@Nullable String str) {
        this.isolatedName = str;
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.isSelected = bool;
    }

    @NotNull
    public String toString() {
        return "DepositAccountNameEntity(accountType=" + this.accountType + ", accountName=" + this.accountName + ", isRiskAccount=" + this.isRiskAccount + ", isSelected=" + this.isSelected + ", isolatedName=" + this.isolatedName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AccountType accountType = this.accountType;
        if (accountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(accountType.name());
        }
        Integer num = this.accountName;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.isRiskAccount;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSelected;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.isolatedName);
    }

    public /* synthetic */ DepositAccountNameEntity(AccountType accountType, Integer num, Boolean bool, Boolean bool2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accountType, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2, (i11 & 16) != 0 ? null : str);
    }
}
