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
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositAccountWithTagEntity;", "Landroid/os/Parcelable;", "accountType", "Lcom/kubi/data/coin/AccountType;", "toAccountTag", "", "<init>", "(Lcom/kubi/data/coin/AccountType;Ljava/lang/String;)V", "getAccountType", "()Lcom/kubi/data/coin/AccountType;", "getToAccountTag", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositAccountWithTagEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositAccountWithTagEntity> CREATOR = new Creator();

    @Nullable
    private final AccountType accountType;

    @Nullable
    private final String toAccountTag;

    /* JADX INFO: compiled from: DepositAccountEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositAccountWithTagEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountWithTagEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositAccountWithTagEntity(parcel.readInt() == 0 ? null : AccountType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAccountWithTagEntity[] newArray(int i11) {
            return new DepositAccountWithTagEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DepositAccountWithTagEntity() {
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
        if (!(other instanceof DepositAccountWithTagEntity)) {
            return false;
        }
        DepositAccountWithTagEntity depositAccountWithTagEntity = (DepositAccountWithTagEntity) other;
        return this.accountType == depositAccountWithTagEntity.accountType && Intrinsics.areEqual(this.toAccountTag, depositAccountWithTagEntity.toAccountTag);
    }

    public DepositAccountWithTagEntity(@Nullable AccountType accountType, @Nullable String str) {
        this.accountType = accountType;
        this.toAccountTag = str;
    }

    public static /* synthetic */ DepositAccountWithTagEntity copy$default(DepositAccountWithTagEntity depositAccountWithTagEntity, AccountType accountType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountType = depositAccountWithTagEntity.accountType;
        }
        if ((i11 & 2) != 0) {
            str = depositAccountWithTagEntity.toAccountTag;
        }
        return depositAccountWithTagEntity.copy(accountType, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @NotNull
    public final DepositAccountWithTagEntity copy(@Nullable AccountType accountType, @Nullable String toAccountTag) {
        return new DepositAccountWithTagEntity(accountType, toAccountTag);
    }

    @Nullable
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    public int hashCode() {
        AccountType accountType = this.accountType;
        int iHashCode = (accountType == null ? 0 : accountType.hashCode()) * 31;
        String str = this.toAccountTag;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DepositAccountWithTagEntity(accountType=" + this.accountType + ", toAccountTag=" + this.toAccountTag + ')';
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
        dest.writeString(this.toAccountTag);
    }

    public /* synthetic */ DepositAccountWithTagEntity(AccountType accountType, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accountType, (i11 & 2) != 0 ? null : str);
    }
}
