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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EvmRepeatAddressResponseEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "Landroid/os/Parcelable;", "id", "", "address", "memo", "addressList", "", "Lcom/kubi/assets/entity/EvmRepeatAddressItemEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getAddress", "getMemo", "getAddressList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EvmRepeatAddressResponseEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EvmRepeatAddressResponseEntity> CREATOR = new Creator();

    @Nullable
    private final String address;

    @Nullable
    private final List<EvmRepeatAddressItemEntity> addressList;

    @Nullable
    private final String id;

    @Nullable
    private final String memo;

    /* JADX INFO: compiled from: EvmRepeatAddressResponseEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EvmRepeatAddressResponseEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmRepeatAddressResponseEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(EvmRepeatAddressItemEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new EvmRepeatAddressResponseEntity(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmRepeatAddressResponseEntity[] newArray(int i11) {
            return new EvmRepeatAddressResponseEntity[i11];
        }
    }

    public EvmRepeatAddressResponseEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvmRepeatAddressResponseEntity)) {
            return false;
        }
        EvmRepeatAddressResponseEntity evmRepeatAddressResponseEntity = (EvmRepeatAddressResponseEntity) other;
        return Intrinsics.areEqual(this.id, evmRepeatAddressResponseEntity.id) && Intrinsics.areEqual(this.address, evmRepeatAddressResponseEntity.address) && Intrinsics.areEqual(this.memo, evmRepeatAddressResponseEntity.memo) && Intrinsics.areEqual(this.addressList, evmRepeatAddressResponseEntity.addressList);
    }

    public EvmRepeatAddressResponseEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<EvmRepeatAddressItemEntity> list) {
        this.id = str;
        this.address = str2;
        this.memo = str3;
        this.addressList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvmRepeatAddressResponseEntity copy$default(EvmRepeatAddressResponseEntity evmRepeatAddressResponseEntity, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = evmRepeatAddressResponseEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = evmRepeatAddressResponseEntity.address;
        }
        if ((i11 & 4) != 0) {
            str3 = evmRepeatAddressResponseEntity.memo;
        }
        if ((i11 & 8) != 0) {
            list = evmRepeatAddressResponseEntity.addressList;
        }
        return evmRepeatAddressResponseEntity.copy(str, str2, str3, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final List<EvmRepeatAddressItemEntity> component4() {
        return this.addressList;
    }

    @NotNull
    public final EvmRepeatAddressResponseEntity copy(@Nullable String id2, @Nullable String address, @Nullable String memo, @Nullable List<EvmRepeatAddressItemEntity> addressList) {
        return new EvmRepeatAddressResponseEntity(id2, address, memo, addressList);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final List<EvmRepeatAddressItemEntity> getAddressList() {
        return this.addressList;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<EvmRepeatAddressItemEntity> list = this.addressList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EvmRepeatAddressResponseEntity(id=" + this.id + ", address=" + this.address + ", memo=" + this.memo + ", addressList=" + this.addressList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.address);
        dest.writeString(this.memo);
        List<EvmRepeatAddressItemEntity> list = this.addressList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<EvmRepeatAddressItemEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ EvmRepeatAddressResponseEntity(String str, String str2, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : list);
    }
}
