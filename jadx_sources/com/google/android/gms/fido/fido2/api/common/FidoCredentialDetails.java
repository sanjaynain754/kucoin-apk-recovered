package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();

    @Nullable
    @SafeParcelable.Field(getter = "getUserName", m12889id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getUserDisplayName", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getUserId", m12889id = 3, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getCredentialId", m12889id = 4, type = "byte[]")
    private final zzgx zzd;

    @SafeParcelable.Field(getter = "getIsDiscoverable", m12889id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIsPaymentCredential", m12889id = 6)
    private final boolean zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getLastUsedTime", m12889id = 7)
    private final long zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getOwningAccount", m12889id = 8)
    private final Account zzh;

    @SafeParcelable.Field(getter = "getIsCryptauthSigninCredentialForAccount", m12889id = 9)
    private final boolean zzi;

    @SafeParcelable.Constructor
    public FidoCredentialDetails(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) String str2, @Nullable @SafeParcelable.Param(m12890id = 3) byte[] bArr, @NonNull @SafeParcelable.Param(m12890id = 4) byte[] bArr2, @SafeParcelable.Param(m12890id = 5) boolean z11, @SafeParcelable.Param(m12890id = 6) boolean z12, @SafeParcelable.Param(m12890id = 7) long j11, @Nullable @SafeParcelable.Param(m12890id = 8) Account account, @SafeParcelable.Param(m12890id = 9) boolean z13) {
        zzgx zzgxVarZzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVarZzl;
        this.zzd = zzgxVarZzl2;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = j11;
        this.zzh = account;
        this.zzi = z13;
    }

    @NonNull
    public static FidoCredentialDetails deserializeFromBytes(@NonNull byte[] bArr) {
        return (FidoCredentialDetails) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return Objects.equal(this.zza, fidoCredentialDetails.zza) && Objects.equal(this.zzb, fidoCredentialDetails.zzb) && Objects.equal(this.zzc, fidoCredentialDetails.zzc) && Objects.equal(this.zzd, fidoCredentialDetails.zzd) && this.zze == fidoCredentialDetails.zze && this.zzf == fidoCredentialDetails.zzf && this.zzi == fidoCredentialDetails.zzi && this.zzg == fidoCredentialDetails.zzg && Objects.equal(this.zzh, fidoCredentialDetails.zzh);
    }

    @NonNull
    public byte[] getCredentialId() {
        return this.zzd.zzm();
    }

    public zzgx getCredentialIdAsByteString() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public long getLastUsedTime() {
        return this.zzg;
    }

    @Nullable
    public String getUserDisplayName() {
        return this.zzb;
    }

    @Nullable
    public byte[] getUserId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @Nullable
    public zzgx getUserIdAsByteString() {
        return this.zzc;
    }

    @Nullable
    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzi), Long.valueOf(this.zzg), this.zzh);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        SafeParcelWriter.writeLong(parcel, 7, getLastUsedTime());
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
