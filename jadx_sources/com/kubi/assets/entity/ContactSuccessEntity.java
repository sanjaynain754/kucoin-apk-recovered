package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/entity/ContactSuccessEntity;", "Landroid/os/Parcelable;", "validationCode", "", "<init>", "(Ljava/lang/String;)V", "getValidationCode", "()Ljava/lang/String;", "setValidationCode", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactSuccessEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactSuccessEntity> CREATOR = new Creator();

    @NotNull
    private String validationCode;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactSuccessEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactSuccessEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactSuccessEntity(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactSuccessEntity[] newArray(int i11) {
            return new ContactSuccessEntity[i11];
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
        return (other instanceof ContactSuccessEntity) && Intrinsics.areEqual(this.validationCode, ((ContactSuccessEntity) other).validationCode);
    }

    public ContactSuccessEntity(@NotNull String validationCode) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        this.validationCode = validationCode;
    }

    public static /* synthetic */ ContactSuccessEntity copy$default(ContactSuccessEntity contactSuccessEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactSuccessEntity.validationCode;
        }
        return contactSuccessEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValidationCode() {
        return this.validationCode;
    }

    @NotNull
    public final ContactSuccessEntity copy(@NotNull String validationCode) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        return new ContactSuccessEntity(validationCode);
    }

    @NotNull
    public final String getValidationCode() {
        return this.validationCode;
    }

    public int hashCode() {
        return this.validationCode.hashCode();
    }

    public final void setValidationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validationCode = str;
    }

    @NotNull
    public String toString() {
        return "ContactSuccessEntity(validationCode=" + this.validationCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.validationCode);
    }
}
