package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();

    @Nullable
    @SafeParcelable.Field(getter = "getId", m12889id = 1)
    private final String zza;

    @NonNull
    @SafeParcelable.Field(getter = "getType", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getRawId", m12889id = 3, type = "byte[]")
    private final zzgx zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getRegisterResponse", m12889id = 4)
    private final AuthenticatorAttestationResponse zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getSignResponse", m12889id = 5)
    private final AuthenticatorAssertionResponse zze;

    @Nullable
    @SafeParcelable.Field(getter = "getErrorResponse", m12889id = 6)
    private final AuthenticatorErrorResponse zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getClientExtensionResults", m12889id = 7)
    private final AuthenticationExtensionsClientOutputs zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getAuthenticatorAttachment", m12889id = 8)
    private final String zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getJsonString", m12889id = 9)
    private String zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class Builder {

        @Nullable
        private String zza;

        @Nullable
        private zzgx zzb;
        private AuthenticatorResponse zzc;

        @Nullable
        private AuthenticationExtensionsClientOutputs zzd;

        @Nullable
        private String zze;

        public Builder setRawId(@Nullable zzgx zzgxVar) {
            this.zzb = zzgxVar;
            return this;
        }

        @NonNull
        public PublicKeyCredential build() {
            AuthenticatorResponse authenticatorResponse = this.zzc;
            return new PublicKeyCredential(this.zza, PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, authenticatorResponse instanceof AuthenticatorAttestationResponse ? (AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorAssertionResponse ? (AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorErrorResponse ? (AuthenticatorErrorResponse) authenticatorResponse : null, this.zzd, this.zze);
        }

        @NonNull
        public Builder setAuthenticationExtensionsClientOutputs(@Nullable AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.zzd = authenticationExtensionsClientOutputs;
            return this;
        }

        @NonNull
        public Builder setAuthenticatorAttachment(@Nullable String str) {
            this.zze = str;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setRawId(@Nullable byte[] bArr) {
            this.zzb = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
            return this;
        }

        @NonNull
        public Builder setResponse(@NonNull AuthenticatorResponse authenticatorResponse) {
            this.zzc = authenticatorResponse;
            return this;
        }
    }

    private PublicKeyCredential(@Nullable String str, @NonNull String str2, @Nullable zzgx zzgxVar, @Nullable AuthenticatorAttestationResponse authenticatorAttestationResponse, @Nullable AuthenticatorAssertionResponse authenticatorAssertionResponse, @Nullable AuthenticatorErrorResponse authenticatorErrorResponse, @Nullable AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @Nullable String str3, @Nullable String str4) {
        boolean z11 = false;
        Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Must provide id and rawId if not an error response.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVar;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
        this.zzi = null;
    }

    @NonNull
    public static PublicKeyCredential deserializeFromBytes(@NonNull byte[] bArr) {
        return (PublicKeyCredential) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.equal(this.zza, publicKeyCredential.zza) && Objects.equal(this.zzb, publicKeyCredential.zzb) && Objects.equal(this.zzc, publicKeyCredential.zzc) && Objects.equal(this.zzd, publicKeyCredential.zzd) && Objects.equal(this.zze, publicKeyCredential.zze) && Objects.equal(this.zzf, publicKeyCredential.zzf) && Objects.equal(this.zzg, publicKeyCredential.zzg) && Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    @Nullable
    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    @Nullable
    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    @Nullable
    public String getId() {
        return this.zza;
    }

    @Nullable
    public byte[] getRawId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @Nullable
    public zzgx getRawIdAsByteString() {
        return this.zzc;
    }

    @NonNull
    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    @NonNull
    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    @NonNull
    public final String toString() {
        zzgx zzgxVar = this.zzc;
        byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.zzb;
        String str2 = this.zza;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        String str3 = this.zzh;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + Base64Utils.encodeUrlSafeNoPadding(bArrZzm) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @NonNull
    public final JSONObject zza() {
        JSONObject jSONObjectZza;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.zzc;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", Base64Utils.encodeUrlSafeNoPadding(this.zzc.zzm()));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z11 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectZza = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectZza = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z11 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectZza = authenticatorErrorResponse.zza();
                        str4 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                    } else {
                        jSONObjectZza = null;
                    }
                }
            }
            if (jSONObjectZza != null) {
                jSONObject.put(str4, jSONObjectZza);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                return jSONObject;
            }
            if (z11) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
        }
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toJson() {
        return zza().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        if (zzia.zzc()) {
            this.zzi = zza().toString();
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i11, false);
        SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zzi = null;
    }

    @SafeParcelable.Constructor
    public PublicKeyCredential(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @NonNull @SafeParcelable.Param(m12890id = 2) String str2, @Nullable @SafeParcelable.Param(m12890id = 3) byte[] bArr, @Nullable @SafeParcelable.Param(m12890id = 4) AuthenticatorAttestationResponse authenticatorAttestationResponse, @Nullable @SafeParcelable.Param(m12890id = 5) AuthenticatorAssertionResponse authenticatorAssertionResponse, @Nullable @SafeParcelable.Param(m12890id = 6) AuthenticatorErrorResponse authenticatorErrorResponse, @Nullable @SafeParcelable.Param(m12890id = 7) AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @Nullable @SafeParcelable.Param(m12890id = 8) String str3, @Nullable @SafeParcelable.Param(m12890id = 9) String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
