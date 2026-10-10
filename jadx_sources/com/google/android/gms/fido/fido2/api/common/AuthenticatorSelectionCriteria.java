package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();

    @Nullable
    @SafeParcelable.Field(getter = "getAttachmentAsString", m12889id = 2, type = "java.lang.String")
    private final Attachment zza;

    @Nullable
    @SafeParcelable.Field(getter = "getRequireResidentKey", m12889id = 3)
    private final Boolean zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", m12889id = 4, type = "java.lang.String")
    private final UserVerificationRequirement zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", m12889id = 5, type = "java.lang.String")
    private final ResidentKeyRequirement zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class Builder {

        @Nullable
        private Attachment zza;

        @Nullable
        private Boolean zzb;

        @Nullable
        private ResidentKeyRequirement zzc;

        @NonNull
        public AuthenticatorSelectionCriteria build() {
            Attachment attachment = this.zza;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.zzb;
            ResidentKeyRequirement residentKeyRequirement = this.zzc;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        public Builder setAttachment(@Nullable Attachment attachment) {
            this.zza = attachment;
            return this;
        }

        @NonNull
        public Builder setRequireResidentKey(@Nullable Boolean bool) {
            this.zzb = bool;
            return this;
        }

        @NonNull
        public Builder setResidentKeyRequirement(@Nullable ResidentKeyRequirement residentKeyRequirement) {
            this.zzc = residentKeyRequirement;
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.equal(this.zza, authenticatorSelectionCriteria.zza) && Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) && Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) && Objects.equal(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    @Nullable
    public Attachment getAttachment() {
        return this.zza;
    }

    @Nullable
    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    @Nullable
    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    @Nullable
    public ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, getResidentKeyRequirement());
    }

    @NonNull
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.zza) + ", \n requireResidentKey=" + this.zzb + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    @SafeParcelable.Constructor
    public AuthenticatorSelectionCriteria(@Nullable @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) Boolean bool, @Nullable @SafeParcelable.Param(m12890id = 4) String str2, @Nullable @SafeParcelable.Param(m12890id = 5) String str3) {
        Attachment attachmentFromString;
        UserVerificationRequirement userVerificationRequirementFromString;
        ResidentKeyRequirement residentKeyRequirementFromString = null;
        if (str == null) {
            attachmentFromString = null;
        } else {
            try {
                attachmentFromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        this.zza = attachmentFromString;
        this.zzb = bool;
        if (str2 == null) {
            userVerificationRequirementFromString = null;
        } else {
            userVerificationRequirementFromString = UserVerificationRequirement.fromString(str2);
        }
        this.zzc = userVerificationRequirementFromString;
        if (str3 != null) {
            residentKeyRequirementFromString = ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirementFromString;
    }

    @Nullable
    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        String string;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        if (userVerificationRequirement == null) {
            string = null;
        } else {
            string = userVerificationRequirement.toString();
        }
        SafeParcelWriter.writeString(parcel, 4, string, false);
        SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
