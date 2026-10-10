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
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/ContactAddrAddEntity;", "Landroid/os/Parcelable;", "contactInfos", "", "Lcom/kubi/assets/entity/ContactAddrAddChild;", "<init>", "(Ljava/util/List;)V", "getContactInfos", "()Ljava/util/List;", "setContactInfos", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactAddrAddEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactAddrAddEntity> CREATOR = new Creator();

    @Nullable
    private List<ContactAddrAddChild> contactInfos;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAddrAddEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrAddEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(ContactAddrAddChild.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ContactAddrAddEntity(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrAddEntity[] newArray(int i11) {
            return new ContactAddrAddEntity[i11];
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
        return (other instanceof ContactAddrAddEntity) && Intrinsics.areEqual(this.contactInfos, ((ContactAddrAddEntity) other).contactInfos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactAddrAddEntity copy$default(ContactAddrAddEntity contactAddrAddEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = contactAddrAddEntity.contactInfos;
        }
        return contactAddrAddEntity.copy(list);
    }

    @Nullable
    public final List<ContactAddrAddChild> component1() {
        return this.contactInfos;
    }

    @NotNull
    public final ContactAddrAddEntity copy(@Nullable List<ContactAddrAddChild> contactInfos) {
        return new ContactAddrAddEntity(contactInfos);
    }

    @Nullable
    public final List<ContactAddrAddChild> getContactInfos() {
        return this.contactInfos;
    }

    public int hashCode() {
        List<ContactAddrAddChild> list = this.contactInfos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setContactInfos(@Nullable List<ContactAddrAddChild> list) {
        this.contactInfos = list;
    }

    @NotNull
    public String toString() {
        return "ContactAddrAddEntity(contactInfos=" + this.contactInfos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<ContactAddrAddChild> list = this.contactInfos;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ContactAddrAddChild> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public ContactAddrAddEntity(@Nullable List<ContactAddrAddChild> list) {
        this.contactInfos = list;
    }
}
