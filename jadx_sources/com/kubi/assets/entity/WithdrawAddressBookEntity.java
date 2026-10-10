package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawAddressBookEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddressBookEntity;", "Landroid/os/Parcelable;", "collectAddressList", "", "Lcom/kubi/assets/entity/WithdrawAddress;", "withdrawAddressList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCollectAddressList", "()Ljava/util/List;", "getWithdrawAddressList", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddressBookEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddressBookEntity> CREATOR = new Creator();

    @Nullable
    private final List<WithdrawAddress> collectAddressList;

    @Nullable
    private final List<WithdrawAddress> withdrawAddressList;

    /* JADX INFO: compiled from: WithdrawAddressBookEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddressBookEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressBookEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readInt() == 0 ? null : WithdrawAddress.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList3.add(parcel.readInt() == 0 ? null : WithdrawAddress.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new WithdrawAddressBookEntity(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressBookEntity[] newArray(int i11) {
            return new WithdrawAddressBookEntity[i11];
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
        if (!(other instanceof WithdrawAddressBookEntity)) {
            return false;
        }
        WithdrawAddressBookEntity withdrawAddressBookEntity = (WithdrawAddressBookEntity) other;
        return Intrinsics.areEqual(this.collectAddressList, withdrawAddressBookEntity.collectAddressList) && Intrinsics.areEqual(this.withdrawAddressList, withdrawAddressBookEntity.withdrawAddressList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddressBookEntity copy$default(WithdrawAddressBookEntity withdrawAddressBookEntity, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = withdrawAddressBookEntity.collectAddressList;
        }
        if ((i11 & 2) != 0) {
            list2 = withdrawAddressBookEntity.withdrawAddressList;
        }
        return withdrawAddressBookEntity.copy(list, list2);
    }

    @Nullable
    public final List<WithdrawAddress> component1() {
        return this.collectAddressList;
    }

    @Nullable
    public final List<WithdrawAddress> component2() {
        return this.withdrawAddressList;
    }

    @NotNull
    public final WithdrawAddressBookEntity copy(@Nullable List<WithdrawAddress> collectAddressList, @Nullable List<WithdrawAddress> withdrawAddressList) {
        return new WithdrawAddressBookEntity(collectAddressList, withdrawAddressList);
    }

    @Nullable
    public final List<WithdrawAddress> getCollectAddressList() {
        return this.collectAddressList;
    }

    @Nullable
    public final List<WithdrawAddress> getWithdrawAddressList() {
        return this.withdrawAddressList;
    }

    public int hashCode() {
        List<WithdrawAddress> list = this.collectAddressList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<WithdrawAddress> list2 = this.withdrawAddressList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawAddressBookEntity(collectAddressList=" + this.collectAddressList + ", withdrawAddressList=" + this.withdrawAddressList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<WithdrawAddress> list = this.collectAddressList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (WithdrawAddress withdrawAddress : list) {
                if (withdrawAddress == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    withdrawAddress.writeToParcel(dest, flags);
                }
            }
        }
        List<WithdrawAddress> list2 = this.withdrawAddressList;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        for (WithdrawAddress withdrawAddress2 : list2) {
            if (withdrawAddress2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                withdrawAddress2.writeToParcel(dest, flags);
            }
        }
    }

    public WithdrawAddressBookEntity(@Nullable List<WithdrawAddress> list, @Nullable List<WithdrawAddress> list2) {
        this.collectAddressList = list;
        this.withdrawAddressList = list2;
    }
}
