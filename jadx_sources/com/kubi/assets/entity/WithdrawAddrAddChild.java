package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrAddChild;", "Landroid/os/Parcelable;", "address", "", "memo", "remark", "chainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getMemo", "setMemo", "getRemark", "setRemark", "getChainId", "setChainId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrAddChild implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrAddChild> CREATOR = new Creator();

    @Nullable
    private String address;

    @Nullable
    private String chainId;

    @Nullable
    private String memo;

    @Nullable
    private String remark;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrAddChild> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrAddChild createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawAddrAddChild(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrAddChild[] newArray(int i11) {
            return new WithdrawAddrAddChild[i11];
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
        if (!(other instanceof WithdrawAddrAddChild)) {
            return false;
        }
        WithdrawAddrAddChild withdrawAddrAddChild = (WithdrawAddrAddChild) other;
        return Intrinsics.areEqual(this.address, withdrawAddrAddChild.address) && Intrinsics.areEqual(this.memo, withdrawAddrAddChild.memo) && Intrinsics.areEqual(this.remark, withdrawAddrAddChild.remark) && Intrinsics.areEqual(this.chainId, withdrawAddrAddChild.chainId);
    }

    public static /* synthetic */ WithdrawAddrAddChild copy$default(WithdrawAddrAddChild withdrawAddrAddChild, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawAddrAddChild.address;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawAddrAddChild.memo;
        }
        if ((i11 & 4) != 0) {
            str3 = withdrawAddrAddChild.remark;
        }
        if ((i11 & 8) != 0) {
            str4 = withdrawAddrAddChild.chainId;
        }
        return withdrawAddrAddChild.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @NotNull
    public final WithdrawAddrAddChild copy(@Nullable String address, @Nullable String memo, @Nullable String remark, @Nullable String chainId) {
        return new WithdrawAddrAddChild(address, memo, remark, chainId);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chainId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setChainId(@Nullable String str) {
        this.chainId = str;
    }

    public final void setMemo(@Nullable String str) {
        this.memo = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrAddChild(address=" + this.address + ", memo=" + this.memo + ", remark=" + this.remark + ", chainId=" + this.chainId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.memo);
        dest.writeString(this.remark);
        dest.writeString(this.chainId);
    }

    public WithdrawAddrAddChild(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.address = str;
        this.memo = str2;
        this.remark = str3;
        this.chainId = str4;
    }
}
