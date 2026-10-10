package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/ContactAddrdeleteEntity;", "Landroid/os/Parcelable;", "ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getIds", "()Ljava/util/ArrayList;", "setIds", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactAddrdeleteEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactAddrdeleteEntity> CREATOR = new Creator();

    @Nullable
    private ArrayList<String> ids;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAddrdeleteEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrdeleteEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactAddrdeleteEntity(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrdeleteEntity[] newArray(int i11) {
            return new ContactAddrdeleteEntity[i11];
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
        return (other instanceof ContactAddrdeleteEntity) && Intrinsics.areEqual(this.ids, ((ContactAddrdeleteEntity) other).ids);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactAddrdeleteEntity copy$default(ContactAddrdeleteEntity contactAddrdeleteEntity, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = contactAddrdeleteEntity.ids;
        }
        return contactAddrdeleteEntity.copy(arrayList);
    }

    @Nullable
    public final ArrayList<String> component1() {
        return this.ids;
    }

    @NotNull
    public final ContactAddrdeleteEntity copy(@Nullable ArrayList<String> ids) {
        return new ContactAddrdeleteEntity(ids);
    }

    @Nullable
    public final ArrayList<String> getIds() {
        return this.ids;
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.ids;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setIds(@Nullable ArrayList<String> arrayList) {
        this.ids = arrayList;
    }

    @NotNull
    public String toString() {
        return "ContactAddrdeleteEntity(ids=" + this.ids + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.ids);
    }

    public ContactAddrdeleteEntity(@Nullable ArrayList<String> arrayList) {
        this.ids = arrayList;
    }
}
