package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositAddressEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/entity/DepositAddressEntity;", "Landroid/os/Parcelable;", "addresses", "", "Lcom/kubi/assets/entity/Addresse;", "maxNum", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getAddresses", "()Ljava/util/List;", "getMaxNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/assets/entity/DepositAddressEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DepositAddressEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DepositAddressEntity> CREATOR = new Creator();

    @Nullable
    private final List<Addresse> addresses;

    @Nullable
    private final Integer maxNum;

    /* JADX INFO: compiled from: DepositAddressEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositAddressEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAddressEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Addresse.CREATOR.createFromParcel(parcel));
                }
            }
            return new DepositAddressEntity(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAddressEntity[] newArray(int i11) {
            return new DepositAddressEntity[i11];
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
        if (!(other instanceof DepositAddressEntity)) {
            return false;
        }
        DepositAddressEntity depositAddressEntity = (DepositAddressEntity) other;
        return Intrinsics.areEqual(this.addresses, depositAddressEntity.addresses) && Intrinsics.areEqual(this.maxNum, depositAddressEntity.maxNum);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositAddressEntity copy$default(DepositAddressEntity depositAddressEntity, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = depositAddressEntity.addresses;
        }
        if ((i11 & 2) != 0) {
            num = depositAddressEntity.maxNum;
        }
        return depositAddressEntity.copy(list, num);
    }

    @Nullable
    public final List<Addresse> component1() {
        return this.addresses;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxNum() {
        return this.maxNum;
    }

    @NotNull
    public final DepositAddressEntity copy(@Nullable List<Addresse> addresses, @Nullable Integer maxNum) {
        return new DepositAddressEntity(addresses, maxNum);
    }

    @Nullable
    public final List<Addresse> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public final Integer getMaxNum() {
        return this.maxNum;
    }

    public int hashCode() {
        List<Addresse> list = this.addresses;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.maxNum;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DepositAddressEntity(addresses=" + this.addresses + ", maxNum=" + this.maxNum + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Addresse> list = this.addresses;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Addresse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Integer num = this.maxNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public DepositAddressEntity(@Nullable List<Addresse> list, @Nullable Integer num) {
        this.addresses = list;
        this.maxNum = num;
    }
}
