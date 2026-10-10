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
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositNormalAccountEntity;", "Landroid/os/Parcelable;", "accountType", "Lcom/kubi/data/coin/AccountType;", "isReplaceAll", "", "<init>", "(Lcom/kubi/data/coin/AccountType;Ljava/lang/Boolean;)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/kubi/data/coin/AccountType;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/DepositNormalAccountEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositNormalAccountEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositNormalAccountEntity> CREATOR = new Creator();

    @Nullable
    private final AccountType accountType;

    @Nullable
    private final Boolean isReplaceAll;

    /* JADX INFO: compiled from: DepositAccountEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositNormalAccountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositNormalAccountEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            AccountType accountTypeValueOf = parcel.readInt() == 0 ? null : AccountType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DepositNormalAccountEntity(accountTypeValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositNormalAccountEntity[] newArray(int i11) {
            return new DepositNormalAccountEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DepositNormalAccountEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositNormalAccountEntity)) {
            return false;
        }
        DepositNormalAccountEntity depositNormalAccountEntity = (DepositNormalAccountEntity) other;
        return this.accountType == depositNormalAccountEntity.accountType && Intrinsics.areEqual(this.isReplaceAll, depositNormalAccountEntity.isReplaceAll);
    }

    public DepositNormalAccountEntity(@Nullable AccountType accountType, @Nullable Boolean bool) {
        this.accountType = accountType;
        this.isReplaceAll = bool;
    }

    public static /* synthetic */ DepositNormalAccountEntity copy$default(DepositNormalAccountEntity depositNormalAccountEntity, AccountType accountType, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = depositNormalAccountEntity.accountType;
        }
        if ((i11 & 2) != 0) {
            bool = depositNormalAccountEntity.isReplaceAll;
        }
        return depositNormalAccountEntity.copy(accountType, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsReplaceAll() {
        return this.isReplaceAll;
    }

    @NotNull
    public final DepositNormalAccountEntity copy(@Nullable AccountType accountType, @Nullable Boolean isReplaceAll) {
        return new DepositNormalAccountEntity(accountType, isReplaceAll);
    }

    @Nullable
    public final AccountType getAccountType() {
        return this.accountType;
    }

    public int hashCode() {
        AccountType accountType = this.accountType;
        int iHashCode = (accountType == null ? 0 : accountType.hashCode()) * 31;
        Boolean bool = this.isReplaceAll;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isReplaceAll() {
        return this.isReplaceAll;
    }

    @NotNull
    public String toString() {
        return "DepositNormalAccountEntity(accountType=" + this.accountType + ", isReplaceAll=" + this.isReplaceAll + ')';
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
        Boolean bool = this.isReplaceAll;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ DepositNormalAccountEntity(AccountType accountType, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accountType, (i11 & 2) != 0 ? null : bool);
    }
}
