package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\b\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrValidEntity;", "Landroid/os/Parcelable;", "address", "", "Lcom/kubi/assets/entity/WithdrawAddrValid;", FirebaseAnalytics.Param.CURRENCY, "", "invalidAddress", "isValid", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getAddress", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getInvalidAddress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/WithdrawAddrValidEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrValidEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrValidEntity> CREATOR = new Creator();

    @Nullable
    private final List<WithdrawAddrValid> address;

    @Nullable
    private final String currency;

    @Nullable
    private final List<WithdrawAddrValid> invalidAddress;

    @Nullable
    private final Boolean isValid;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrValidEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(WithdrawAddrValid.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(WithdrawAddrValid.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawAddrValidEntity(arrayList, string, arrayList2, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidEntity[] newArray(int i11) {
            return new WithdrawAddrValidEntity[i11];
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
        if (!(other instanceof WithdrawAddrValidEntity)) {
            return false;
        }
        WithdrawAddrValidEntity withdrawAddrValidEntity = (WithdrawAddrValidEntity) other;
        return Intrinsics.areEqual(this.address, withdrawAddrValidEntity.address) && Intrinsics.areEqual(this.currency, withdrawAddrValidEntity.currency) && Intrinsics.areEqual(this.invalidAddress, withdrawAddrValidEntity.invalidAddress) && Intrinsics.areEqual(this.isValid, withdrawAddrValidEntity.isValid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddrValidEntity copy$default(WithdrawAddrValidEntity withdrawAddrValidEntity, List list, String str, List list2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = withdrawAddrValidEntity.address;
        }
        if ((i11 & 2) != 0) {
            str = withdrawAddrValidEntity.currency;
        }
        if ((i11 & 4) != 0) {
            list2 = withdrawAddrValidEntity.invalidAddress;
        }
        if ((i11 & 8) != 0) {
            bool = withdrawAddrValidEntity.isValid;
        }
        return withdrawAddrValidEntity.copy(list, str, list2, bool);
    }

    @Nullable
    public final List<WithdrawAddrValid> component1() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<WithdrawAddrValid> component3() {
        return this.invalidAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    @NotNull
    public final WithdrawAddrValidEntity copy(@Nullable List<WithdrawAddrValid> address, @Nullable String currency, @Nullable List<WithdrawAddrValid> invalidAddress, @Nullable Boolean isValid) {
        return new WithdrawAddrValidEntity(address, currency, invalidAddress, isValid);
    }

    @Nullable
    public final List<WithdrawAddrValid> getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<WithdrawAddrValid> getInvalidAddress() {
        return this.invalidAddress;
    }

    public int hashCode() {
        List<WithdrawAddrValid> list = this.address;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<WithdrawAddrValid> list2 = this.invalidAddress;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isValid;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrValidEntity(address=" + this.address + ", currency=" + this.currency + ", invalidAddress=" + this.invalidAddress + ", isValid=" + this.isValid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<WithdrawAddrValid> list = this.address;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<WithdrawAddrValid> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.currency);
        List<WithdrawAddrValid> list2 = this.invalidAddress;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<WithdrawAddrValid> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        Boolean bool = this.isValid;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public WithdrawAddrValidEntity(@Nullable List<WithdrawAddrValid> list, @Nullable String str, @Nullable List<WithdrawAddrValid> list2, @Nullable Boolean bool) {
        this.address = list;
        this.currency = str;
        this.invalidAddress = list2;
        this.isValid = bool;
    }
}
