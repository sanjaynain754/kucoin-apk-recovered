package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositAccountEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositAccountEntity;", "Landroid/os/Parcelable;", "accountType", "", "isRiskAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccountType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/DepositAccountEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositAccountEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositAccountEntity> CREATOR = new Creator();

    @Nullable
    private final String accountType;

    @Nullable
    private final Boolean isRiskAccount;

    /* JADX INFO: compiled from: DepositAccountEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositAccountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DepositAccountEntity(string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountEntity[] newArray(int i11) {
            return new DepositAccountEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DepositAccountEntity() {
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
        if (!(other instanceof DepositAccountEntity)) {
            return false;
        }
        DepositAccountEntity depositAccountEntity = (DepositAccountEntity) other;
        return Intrinsics.areEqual(this.accountType, depositAccountEntity.accountType) && Intrinsics.areEqual(this.isRiskAccount, depositAccountEntity.isRiskAccount);
    }

    public DepositAccountEntity(@Nullable String str, @Nullable Boolean bool) {
        this.accountType = str;
        this.isRiskAccount = bool;
    }

    public static /* synthetic */ DepositAccountEntity copy$default(DepositAccountEntity depositAccountEntity, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = depositAccountEntity.accountType;
        }
        if ((i11 & 2) != 0) {
            bool = depositAccountEntity.isRiskAccount;
        }
        return depositAccountEntity.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsRiskAccount() {
        return this.isRiskAccount;
    }

    @NotNull
    public final DepositAccountEntity copy(@Nullable String accountType, @Nullable Boolean isRiskAccount) {
        return new DepositAccountEntity(accountType, isRiskAccount);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    public int hashCode() {
        String str = this.accountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isRiskAccount;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRiskAccount() {
        return this.isRiskAccount;
    }

    @NotNull
    public String toString() {
        return "DepositAccountEntity(accountType=" + this.accountType + ", isRiskAccount=" + this.isRiskAccount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType);
        Boolean bool = this.isRiskAccount;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ DepositAccountEntity(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
    }
}
