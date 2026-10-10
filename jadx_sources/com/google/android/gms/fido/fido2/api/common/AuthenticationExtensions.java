package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();

    @Nullable
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", m12889id = 2)
    private final FidoAppIdExtension zza;

    @Nullable
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", m12889id = 3)
    private final zzs zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", m12889id = 4)
    private final UserVerificationMethodExtension zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", m12889id = 5)
    private final zzz zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", m12889id = 6)
    private final zzab zze;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", m12889id = 7)
    private final zzad zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", m12889id = 8)
    private final zzu zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", m12889id = 9)
    private final zzag zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", m12889id = 10)
    private final GoogleThirdPartyPaymentExtension zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getPrfExtension", m12889id = 11)
    private final zzak zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getSimpleTransactionAuthorizationExtension", m12889id = 12)
    private final zzaw zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getHmacSecretExtension", m12889id = 13)
    private final zzai zzl;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {

        @Nullable
        private FidoAppIdExtension zza;

        @Nullable
        private UserVerificationMethodExtension zzb;

        @Nullable
        private zzs zzc;

        @Nullable
        private zzz zzd;

        @Nullable
        private zzab zze;

        @Nullable
        private zzad zzf;

        @Nullable
        private zzu zzg;

        @Nullable
        private zzag zzh;

        @Nullable
        private GoogleThirdPartyPaymentExtension zzi;

        @Nullable
        private zzak zzj;

        @Nullable
        private zzaw zzk;

        @Nullable
        private zzai zzl;

        public Builder() {
        }

        public Builder(@Nullable AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zzb();
                this.zzd = authenticationExtensions.zzd();
                this.zze = authenticationExtensions.zze();
                this.zzf = authenticationExtensions.zzf();
                this.zzg = authenticationExtensions.zzc();
                this.zzh = authenticationExtensions.zzh();
                this.zzi = authenticationExtensions.zzg();
                this.zzj = authenticationExtensions.zzj();
                this.zzk = authenticationExtensions.zzk();
                this.zzl = authenticationExtensions.zzi();
            }
        }

        @NonNull
        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }

        @NonNull
        public Builder setFido2Extension(@Nullable FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public Builder setGoogleThirdPartyPaymentExtension(@Nullable GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethodExtension(@Nullable UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }

        public final Builder zza(@Nullable zzs zzsVar) {
            this.zzc = zzsVar;
            return this;
        }

        public final Builder zzb(@Nullable zzu zzuVar) {
            this.zzg = zzuVar;
            return this;
        }

        public final Builder zzc(@Nullable zzz zzzVar) {
            this.zzd = zzzVar;
            return this;
        }

        public final Builder zzd(@Nullable zzab zzabVar) {
            this.zze = zzabVar;
            return this;
        }

        public final Builder zze(@Nullable zzad zzadVar) {
            this.zzf = zzadVar;
            return this;
        }

        public final Builder zzf(@Nullable zzag zzagVar) {
            this.zzh = zzagVar;
            return this;
        }

        public final Builder zzg(@Nullable zzak zzakVar) {
            this.zzj = zzakVar;
            return this;
        }

        public final Builder zzh(@Nullable zzaw zzawVar) {
            this.zzk = zzawVar;
            return this;
        }
    }

    @NonNull
    public static AuthenticationExtensions zza(@NonNull JSONObject jSONObject) throws JSONException {
        Builder builder = new Builder();
        if (jSONObject.has("fidoAppIdExtension")) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString(AppsFlyerProperties.APP_ID)));
        }
        if (jSONObject.has(AppsFlyerProperties.APP_ID)) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getString(AppsFlyerProperties.APP_ID)));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            builder.zzg(zzak.zza(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            builder.zzg(zzak.zza(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            builder.zza(new zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            builder.setUserVerificationMethodExtension(new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            builder.zzc(new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            builder.zzd(new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            builder.zze(new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            builder.zzb(new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            builder.zzf(new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            builder.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            builder.zzh(new zzaw(jSONObject.getString("txAuthSimple")));
        }
        return builder.build();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.equal(this.zza, authenticationExtensions.zza) && Objects.equal(this.zzb, authenticationExtensions.zzb) && Objects.equal(this.zzc, authenticationExtensions.zzc) && Objects.equal(this.zzd, authenticationExtensions.zzd) && Objects.equal(this.zze, authenticationExtensions.zze) && Objects.equal(this.zzf, authenticationExtensions.zzf) && Objects.equal(this.zzg, authenticationExtensions.zzg) && Objects.equal(this.zzh, authenticationExtensions.zzh) && Objects.equal(this.zzi, authenticationExtensions.zzi) && Objects.equal(this.zzj, authenticationExtensions.zzj) && Objects.equal(this.zzk, authenticationExtensions.zzk) && Objects.equal(this.zzl, authenticationExtensions.zzl);
    }

    @Nullable
    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    @Nullable
    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.zzk;
        zzak zzakVar = this.zzj;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.zzi;
        zzag zzagVar = this.zzh;
        zzu zzuVar = this.zzg;
        zzad zzadVar = this.zzf;
        zzab zzabVar = this.zze;
        zzz zzzVar = this.zzd;
        UserVerificationMethodExtension userVerificationMethodExtension = this.zzc;
        zzs zzsVar = this.zzb;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.zza) + ", \n cableAuthenticationExtension=" + String.valueOf(zzsVar) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(zzzVar) + ", \n googleSessionIdExtension=" + String.valueOf(zzabVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(zzadVar) + ", \n devicePublicKeyExtension=" + String.valueOf(zzuVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(zzagVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(zzakVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(zzawVar) + "}";
    }

    @Nullable
    public final zzs zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzu zzc() {
        return this.zzg;
    }

    @Nullable
    public final zzz zzd() {
        return this.zzd;
    }

    @Nullable
    public final zzab zze() {
        return this.zze;
    }

    @Nullable
    public final zzad zzf() {
        return this.zzf;
    }

    @Nullable
    public final GoogleThirdPartyPaymentExtension zzg() {
        return this.zzi;
    }

    @Nullable
    public final zzag zzh() {
        return this.zzh;
    }

    @Nullable
    public final zzai zzi() {
        return this.zzl;
    }

    @Nullable
    public final zzak zzj() {
        return this.zzj;
    }

    @Nullable
    public final zzaw zzk() {
        return this.zzk;
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensions(@Nullable @SafeParcelable.Param(m12890id = 2) FidoAppIdExtension fidoAppIdExtension, @Nullable @SafeParcelable.Param(m12890id = 3) zzs zzsVar, @Nullable @SafeParcelable.Param(m12890id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @Nullable @SafeParcelable.Param(m12890id = 5) zzz zzzVar, @Nullable @SafeParcelable.Param(m12890id = 6) zzab zzabVar, @Nullable @SafeParcelable.Param(m12890id = 7) zzad zzadVar, @Nullable @SafeParcelable.Param(m12890id = 8) zzu zzuVar, @Nullable @SafeParcelable.Param(m12890id = 9) zzag zzagVar, @Nullable @SafeParcelable.Param(m12890id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @Nullable @SafeParcelable.Param(m12890id = 11) zzak zzakVar, @Nullable @SafeParcelable.Param(m12890id = 12) zzaw zzawVar, @Nullable @SafeParcelable.Param(m12890id = 13) zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzakVar;
        this.zzk = zzawVar;
        this.zzl = zzaiVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
