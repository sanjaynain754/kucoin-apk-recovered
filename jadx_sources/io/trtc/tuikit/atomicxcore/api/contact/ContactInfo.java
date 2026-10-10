package io.trtc.tuikit.atomicxcore.api.contact;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\fHÆ\u0003J^\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010+J\t\u0010,\u001a\u00020-HÖ\u0001J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00068"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;", "Landroid/os/Parcelable;", "contactID", "", "type", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;", "avatarURL", "title", "isContact", "", "isInGroup", "onlineStatus", "Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "getContactID", "setContactID", "()Ljava/lang/Boolean;", "setContact", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setInGroup", "getOnlineStatus", "()Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;", "setOnlineStatus", "(Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;)V", "getTitle", "setTitle", "getType", "()Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;", "setType", "(Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;)Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ContactInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactInfo> CREATOR = new Creator();

    @Nullable
    private String avatarURL;

    @NotNull
    private String contactID;

    @Nullable
    private Boolean isContact;

    @Nullable
    private Boolean isInGroup;

    @NotNull
    private ContactOnlineStatus onlineStatus;

    @Nullable
    private String title;

    @Nullable
    private ContactType type;

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ContactInfo createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            ContactType contactTypeValueOf = parcel.readInt() == 0 ? null : ContactType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContactInfo(string, contactTypeValueOf, string2, string3, boolValueOf, boolValueOf2, ContactOnlineStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ContactInfo[] newArray(int i11) {
            return new ContactInfo[i11];
        }
    }

    public ContactInfo(@NotNull String contactID, @Nullable ContactType contactType, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull ContactOnlineStatus onlineStatus) {
        Intrinsics.checkNotNullParameter(contactID, "contactID");
        Intrinsics.checkNotNullParameter(onlineStatus, "onlineStatus");
        this.contactID = contactID;
        this.type = contactType;
        this.avatarURL = str;
        this.title = str2;
        this.isContact = bool;
        this.isInGroup = bool2;
        this.onlineStatus = onlineStatus;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfo)) {
            return false;
        }
        ContactInfo contactInfo = (ContactInfo) other;
        return Intrinsics.areEqual(this.contactID, contactInfo.contactID) && this.type == contactInfo.type && Intrinsics.areEqual(this.avatarURL, contactInfo.avatarURL) && Intrinsics.areEqual(this.title, contactInfo.title) && Intrinsics.areEqual(this.isContact, contactInfo.isContact) && Intrinsics.areEqual(this.isInGroup, contactInfo.isInGroup) && this.onlineStatus == contactInfo.onlineStatus;
    }

    public static /* synthetic */ ContactInfo copy$default(ContactInfo contactInfo, String str, ContactType contactType, String str2, String str3, Boolean bool, Boolean bool2, ContactOnlineStatus contactOnlineStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactInfo.contactID;
        }
        if ((i11 & 2) != 0) {
            contactType = contactInfo.type;
        }
        if ((i11 & 4) != 0) {
            str2 = contactInfo.avatarURL;
        }
        if ((i11 & 8) != 0) {
            str3 = contactInfo.title;
        }
        if ((i11 & 16) != 0) {
            bool = contactInfo.isContact;
        }
        if ((i11 & 32) != 0) {
            bool2 = contactInfo.isInGroup;
        }
        if ((i11 & 64) != 0) {
            contactOnlineStatus = contactInfo.onlineStatus;
        }
        Boolean bool3 = bool2;
        ContactOnlineStatus contactOnlineStatus2 = contactOnlineStatus;
        Boolean bool4 = bool;
        String str4 = str2;
        return contactInfo.copy(str, contactType, str4, str3, bool4, bool3, contactOnlineStatus2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContactID() {
        return this.contactID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContactType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsContact() {
        return this.isContact;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsInGroup() {
        return this.isInGroup;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ContactOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @NotNull
    public final ContactInfo copy(@NotNull String contactID, @Nullable ContactType type, @Nullable String avatarURL, @Nullable String title, @Nullable Boolean isContact, @Nullable Boolean isInGroup, @NotNull ContactOnlineStatus onlineStatus) {
        Intrinsics.checkNotNullParameter(contactID, "contactID");
        Intrinsics.checkNotNullParameter(onlineStatus, "onlineStatus");
        return new ContactInfo(contactID, type, avatarURL, title, isContact, isInGroup, onlineStatus);
    }

    @Nullable
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final String getContactID() {
        return this.contactID;
    }

    @NotNull
    public final ContactOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final ContactType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.contactID.hashCode() * 31;
        ContactType contactType = this.type;
        int iHashCode2 = (iHashCode + (contactType == null ? 0 : contactType.hashCode())) * 31;
        String str = this.avatarURL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isContact;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInGroup;
        return this.onlineStatus.hashCode() + ((iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @Nullable
    public final Boolean isContact() {
        return this.isContact;
    }

    @Nullable
    public final Boolean isInGroup() {
        return this.isInGroup;
    }

    public final void setAvatarURL(@Nullable String str) {
        this.avatarURL = str;
    }

    public final void setContact(@Nullable Boolean bool) {
        this.isContact = bool;
    }

    public final void setContactID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contactID = str;
    }

    public final void setInGroup(@Nullable Boolean bool) {
        this.isInGroup = bool;
    }

    public final void setOnlineStatus(@NotNull ContactOnlineStatus contactOnlineStatus) {
        Intrinsics.checkNotNullParameter(contactOnlineStatus, "<set-?>");
        this.onlineStatus = contactOnlineStatus;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable ContactType contactType) {
        this.type = contactType;
    }

    @NotNull
    public String toString() {
        return "ContactInfo(contactID=" + this.contactID + ", type=" + this.type + ", avatarURL=" + this.avatarURL + ", title=" + this.title + ", isContact=" + this.isContact + ", isInGroup=" + this.isInGroup + ", onlineStatus=" + this.onlineStatus + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.contactID);
        ContactType contactType = this.type;
        if (contactType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contactType.name());
        }
        parcel.writeString(this.avatarURL);
        parcel.writeString(this.title);
        Boolean bool = this.isContact;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isInGroup;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.onlineStatus.name());
    }

    public /* synthetic */ ContactInfo(String str, ContactType contactType, String str2, String str3, Boolean bool, Boolean bool2, ContactOnlineStatus contactOnlineStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : contactType, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : bool2, (i11 & 64) != 0 ? ContactOnlineStatus.UNKNOWN : contactOnlineStatus);
    }
}
