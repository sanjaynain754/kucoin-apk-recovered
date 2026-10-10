package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrInnerChainEntity;", "Landroid/os/Parcelable;", "chainId", "", "chainName", "isOurAddress", "", "isWithdrawChainIdEnable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getChainId", "()Ljava/lang/String;", "setChainId", "(Ljava/lang/String;)V", "getChainName", "setChainName", "()Ljava/lang/Boolean;", "setOurAddress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setWithdrawChainIdEnable", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/WithdrawAddrInnerChainEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrInnerChainEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrInnerChainEntity> CREATOR = new Creator();

    @Nullable
    private String chainId;

    @Nullable
    private String chainName;

    @Nullable
    private Boolean isOurAddress;

    @Nullable
    private Boolean isWithdrawChainIdEnable;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrInnerChainEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrInnerChainEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WithdrawAddrInnerChainEntity(string, string2, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrInnerChainEntity[] newArray(int i11) {
            return new WithdrawAddrInnerChainEntity[i11];
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
        if (!(other instanceof WithdrawAddrInnerChainEntity)) {
            return false;
        }
        WithdrawAddrInnerChainEntity withdrawAddrInnerChainEntity = (WithdrawAddrInnerChainEntity) other;
        return Intrinsics.areEqual(this.chainId, withdrawAddrInnerChainEntity.chainId) && Intrinsics.areEqual(this.chainName, withdrawAddrInnerChainEntity.chainName) && Intrinsics.areEqual(this.isOurAddress, withdrawAddrInnerChainEntity.isOurAddress) && Intrinsics.areEqual(this.isWithdrawChainIdEnable, withdrawAddrInnerChainEntity.isWithdrawChainIdEnable);
    }

    public static /* synthetic */ WithdrawAddrInnerChainEntity copy$default(WithdrawAddrInnerChainEntity withdrawAddrInnerChainEntity, String str, String str2, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawAddrInnerChainEntity.chainId;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawAddrInnerChainEntity.chainName;
        }
        if ((i11 & 4) != 0) {
            bool = withdrawAddrInnerChainEntity.isOurAddress;
        }
        if ((i11 & 8) != 0) {
            bool2 = withdrawAddrInnerChainEntity.isWithdrawChainIdEnable;
        }
        return withdrawAddrInnerChainEntity.copy(str, str2, bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsOurAddress() {
        return this.isOurAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsWithdrawChainIdEnable() {
        return this.isWithdrawChainIdEnable;
    }

    @NotNull
    public final WithdrawAddrInnerChainEntity copy(@Nullable String chainId, @Nullable String chainName, @Nullable Boolean isOurAddress, @Nullable Boolean isWithdrawChainIdEnable) {
        return new WithdrawAddrInnerChainEntity(chainId, chainName, isOurAddress, isWithdrawChainIdEnable);
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    public int hashCode() {
        String str = this.chainId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chainName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOurAddress;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWithdrawChainIdEnable;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isOurAddress() {
        return this.isOurAddress;
    }

    @Nullable
    public final Boolean isWithdrawChainIdEnable() {
        return this.isWithdrawChainIdEnable;
    }

    public final void setChainId(@Nullable String str) {
        this.chainId = str;
    }

    public final void setChainName(@Nullable String str) {
        this.chainName = str;
    }

    public final void setOurAddress(@Nullable Boolean bool) {
        this.isOurAddress = bool;
    }

    public final void setWithdrawChainIdEnable(@Nullable Boolean bool) {
        this.isWithdrawChainIdEnable = bool;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrInnerChainEntity(chainId=" + this.chainId + ", chainName=" + this.chainName + ", isOurAddress=" + this.isOurAddress + ", isWithdrawChainIdEnable=" + this.isWithdrawChainIdEnable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        Boolean bool = this.isOurAddress;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isWithdrawChainIdEnable;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public WithdrawAddrInnerChainEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.chainId = str;
        this.chainName = str2;
        this.isOurAddress = bool;
        this.isWithdrawChainIdEnable = bool2;
    }
}
