package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/entity/ContactAccountEntity;", "Landroid/os/Parcelable;", "uid", "", "isFavoriteAddress", "", "favoriteAddressId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "()Z", "setFavoriteAddress", "(Z)V", "getFavoriteAddressId", "setFavoriteAddressId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactAccountEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactAccountEntity> CREATOR = new Creator();

    @NotNull
    private String favoriteAddressId;
    private boolean isFavoriteAddress;

    @NotNull
    private String uid;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAccountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAccountEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactAccountEntity(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAccountEntity[] newArray(int i11) {
            return new ContactAccountEntity[i11];
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
        if (!(other instanceof ContactAccountEntity)) {
            return false;
        }
        ContactAccountEntity contactAccountEntity = (ContactAccountEntity) other;
        return Intrinsics.areEqual(this.uid, contactAccountEntity.uid) && this.isFavoriteAddress == contactAccountEntity.isFavoriteAddress && Intrinsics.areEqual(this.favoriteAddressId, contactAccountEntity.favoriteAddressId);
    }

    public ContactAccountEntity(@NotNull String uid, boolean z11, @NotNull String favoriteAddressId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(favoriteAddressId, "favoriteAddressId");
        this.uid = uid;
        this.isFavoriteAddress = z11;
        this.favoriteAddressId = favoriteAddressId;
    }

    public static /* synthetic */ ContactAccountEntity copy$default(ContactAccountEntity contactAccountEntity, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactAccountEntity.uid;
        }
        if ((i11 & 2) != 0) {
            z11 = contactAccountEntity.isFavoriteAddress;
        }
        if ((i11 & 4) != 0) {
            str2 = contactAccountEntity.favoriteAddressId;
        }
        return contactAccountEntity.copy(str, z11, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFavoriteAddress() {
        return this.isFavoriteAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @NotNull
    public final ContactAccountEntity copy(@NotNull String uid, boolean isFavoriteAddress, @NotNull String favoriteAddressId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(favoriteAddressId, "favoriteAddressId");
        return new ContactAccountEntity(uid, isFavoriteAddress, favoriteAddressId);
    }

    @NotNull
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((this.uid.hashCode() * 31) + Boolean.hashCode(this.isFavoriteAddress)) * 31) + this.favoriteAddressId.hashCode();
    }

    public final boolean isFavoriteAddress() {
        return this.isFavoriteAddress;
    }

    public final void setFavoriteAddress(boolean z11) {
        this.isFavoriteAddress = z11;
    }

    public final void setFavoriteAddressId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.favoriteAddressId = str;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    @NotNull
    public String toString() {
        return "ContactAccountEntity(uid=" + this.uid + ", isFavoriteAddress=" + this.isFavoriteAddress + ", favoriteAddressId=" + this.favoriteAddressId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uid);
        dest.writeInt(this.isFavoriteAddress ? 1 : 0);
        dest.writeString(this.favoriteAddressId);
    }
}
