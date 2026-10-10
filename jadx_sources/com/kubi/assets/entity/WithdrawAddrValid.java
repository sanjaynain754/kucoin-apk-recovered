package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JW\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrValid;", "Landroid/os/Parcelable;", "address", "", "memo", "remark", "chainId", "invalidType", "validChainList", "", "Lcom/kubi/assets/entity/WithdrawAddrInnerChainEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getMemo", "getRemark", "getChainId", "getInvalidType", "getValidChainList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrValid implements Parcelable {

    @NotNull
    public static final String TYPE_INVALID_ADDR = "address";

    @NotNull
    public static final String TYPE_INVALID_CONTRACT_ADDR = "contract address";

    @NotNull
    public static final String TYPE_INVALID_MEMO = "memo";

    @Nullable
    private final String address;

    @Nullable
    private final String chainId;

    @Nullable
    private final String invalidType;

    @Nullable
    private final String memo;

    @Nullable
    private final String remark;

    @Nullable
    private final List<WithdrawAddrInnerChainEntity> validChainList;

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrValid> CREATOR = new Creator();

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrValid> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValid createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(WithdrawAddrInnerChainEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WithdrawAddrValid(string, string2, string3, string4, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValid[] newArray(int i11) {
            return new WithdrawAddrValid[i11];
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
        if (!(other instanceof WithdrawAddrValid)) {
            return false;
        }
        WithdrawAddrValid withdrawAddrValid = (WithdrawAddrValid) other;
        return Intrinsics.areEqual(this.address, withdrawAddrValid.address) && Intrinsics.areEqual(this.memo, withdrawAddrValid.memo) && Intrinsics.areEqual(this.remark, withdrawAddrValid.remark) && Intrinsics.areEqual(this.chainId, withdrawAddrValid.chainId) && Intrinsics.areEqual(this.invalidType, withdrawAddrValid.invalidType) && Intrinsics.areEqual(this.validChainList, withdrawAddrValid.validChainList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddrValid copy$default(WithdrawAddrValid withdrawAddrValid, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawAddrValid.address;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawAddrValid.memo;
        }
        if ((i11 & 4) != 0) {
            str3 = withdrawAddrValid.remark;
        }
        if ((i11 & 8) != 0) {
            str4 = withdrawAddrValid.chainId;
        }
        if ((i11 & 16) != 0) {
            str5 = withdrawAddrValid.invalidType;
        }
        if ((i11 & 32) != 0) {
            list = withdrawAddrValid.validChainList;
        }
        String str6 = str5;
        List list2 = list;
        return withdrawAddrValid.copy(str, str2, str3, str4, str6, list2);
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInvalidType() {
        return this.invalidType;
    }

    @Nullable
    public final List<WithdrawAddrInnerChainEntity> component6() {
        return this.validChainList;
    }

    @NotNull
    public final WithdrawAddrValid copy(@Nullable String address, @Nullable String memo, @Nullable String remark, @Nullable String chainId, @Nullable String invalidType, @Nullable List<WithdrawAddrInnerChainEntity> validChainList) {
        return new WithdrawAddrValid(address, memo, remark, chainId, invalidType, validChainList);
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
    public final String getInvalidType() {
        return this.invalidType;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final List<WithdrawAddrInnerChainEntity> getValidChainList() {
        return this.validChainList;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chainId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.invalidType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<WithdrawAddrInnerChainEntity> list = this.validChainList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrValid(address=" + this.address + ", memo=" + this.memo + ", remark=" + this.remark + ", chainId=" + this.chainId + ", invalidType=" + this.invalidType + ", validChainList=" + this.validChainList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.memo);
        dest.writeString(this.remark);
        dest.writeString(this.chainId);
        dest.writeString(this.invalidType);
        List<WithdrawAddrInnerChainEntity> list = this.validChainList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<WithdrawAddrInnerChainEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public WithdrawAddrValid(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<WithdrawAddrInnerChainEntity> list) {
        this.address = str;
        this.memo = str2;
        this.remark = str3;
        this.chainId = str4;
        this.invalidType = str5;
        this.validChainList = list;
    }
}
