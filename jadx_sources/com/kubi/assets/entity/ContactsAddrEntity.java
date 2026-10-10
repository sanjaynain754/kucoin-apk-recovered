package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010-\u001a\u00020\tHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#Jd\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\b\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006="}, m90084d2 = {"Lcom/kubi/assets/entity/ContactsAddrEntity;", "Landroid/os/Parcelable;", "id", "", "remark", JAnalysisConstants.Account.KEY_ACCOUNT, "type", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "isRecentlyAdded", "", "isEditing", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getRemark", "setRemark", "getAccount", "setAccount", "getType", "setType", "getCountryCode", "setCountryCode", "()Ljava/lang/Boolean;", "setRecentlyAdded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setEditing", "(Z)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Long;)Lcom/kubi/assets/entity/ContactsAddrEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactsAddrEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactsAddrEntity> CREATOR = new Creator();

    @NotNull
    private String account;

    @Nullable
    private String countryCode;

    @Nullable
    private Long createdAt;

    @NotNull
    private String id;
    private boolean isEditing;

    @Nullable
    private Boolean isRecentlyAdded;

    @NotNull
    private String remark;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactsAddrEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactsAddrEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContactsAddrEntity(string, string2, string3, string4, string5, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactsAddrEntity[] newArray(int i11) {
            return new ContactsAddrEntity[i11];
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
        if (!(other instanceof ContactsAddrEntity)) {
            return false;
        }
        ContactsAddrEntity contactsAddrEntity = (ContactsAddrEntity) other;
        return Intrinsics.areEqual(this.id, contactsAddrEntity.id) && Intrinsics.areEqual(this.remark, contactsAddrEntity.remark) && Intrinsics.areEqual(this.account, contactsAddrEntity.account) && Intrinsics.areEqual(this.type, contactsAddrEntity.type) && Intrinsics.areEqual(this.countryCode, contactsAddrEntity.countryCode) && Intrinsics.areEqual(this.isRecentlyAdded, contactsAddrEntity.isRecentlyAdded) && this.isEditing == contactsAddrEntity.isEditing && Intrinsics.areEqual(this.createdAt, contactsAddrEntity.createdAt);
    }

    public ContactsAddrEntity(@NotNull String id2, @NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String str, @Nullable Boolean bool, boolean z11, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.remark = remark;
        this.account = account;
        this.type = type;
        this.countryCode = str;
        this.isRecentlyAdded = bool;
        this.isEditing = z11;
        this.createdAt = l11;
    }

    public static /* synthetic */ ContactsAddrEntity copy$default(ContactsAddrEntity contactsAddrEntity, String str, String str2, String str3, String str4, String str5, Boolean bool, boolean z11, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactsAddrEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = contactsAddrEntity.remark;
        }
        if ((i11 & 4) != 0) {
            str3 = contactsAddrEntity.account;
        }
        if ((i11 & 8) != 0) {
            str4 = contactsAddrEntity.type;
        }
        if ((i11 & 16) != 0) {
            str5 = contactsAddrEntity.countryCode;
        }
        if ((i11 & 32) != 0) {
            bool = contactsAddrEntity.isRecentlyAdded;
        }
        if ((i11 & 64) != 0) {
            z11 = contactsAddrEntity.isEditing;
        }
        if ((i11 & 128) != 0) {
            l11 = contactsAddrEntity.createdAt;
        }
        boolean z12 = z11;
        Long l12 = l11;
        String str6 = str5;
        Boolean bool2 = bool;
        return contactsAddrEntity.copy(str, str2, str3, str4, str6, bool2, z12, l12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final ContactsAddrEntity copy(@NotNull String id2, @NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String countryCode, @Nullable Boolean isRecentlyAdded, boolean isEditing, @Nullable Long createdAt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ContactsAddrEntity(id2, remark, account, type, countryCode, isRecentlyAdded, isEditing, createdAt);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.remark.hashCode()) * 31) + this.account.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.countryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isRecentlyAdded;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31;
        Long l11 = this.createdAt;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    @Nullable
    public final Boolean isRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    public final void setAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.account = str;
    }

    public final void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setEditing(boolean z11) {
        this.isEditing = z11;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setRecentlyAdded(@Nullable Boolean bool) {
        this.isRecentlyAdded = bool;
    }

    public final void setRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "ContactsAddrEntity(id=" + this.id + ", remark=" + this.remark + ", account=" + this.account + ", type=" + this.type + ", countryCode=" + this.countryCode + ", isRecentlyAdded=" + this.isRecentlyAdded + ", isEditing=" + this.isEditing + ", createdAt=" + this.createdAt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.remark);
        dest.writeString(this.account);
        dest.writeString(this.type);
        dest.writeString(this.countryCode);
        Boolean bool = this.isRecentlyAdded;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.isEditing ? 1 : 0);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }
}
