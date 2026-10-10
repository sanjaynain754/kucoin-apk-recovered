package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getToken", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", m12889id = 3)
    private final Long zzc;

    @SafeParcelable.Field(getter = "isCached", m12889id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isSnowballed", m12889id = 5)
    private final boolean zze;

    @Nullable
    @SafeParcelable.Field(getter = "getGrantedScopes", m12889id = 6)
    private final List zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getScopeData", m12889id = 7)
    private final String zzg;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.zzb, tokenData.zzb) && Objects.equal(this.zzc, tokenData.zzc) && this.zzd == tokenData.zzd && this.zze == tokenData.zze && Objects.equal(this.zzf, tokenData.zzf) && Objects.equal(this.zzg, tokenData.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg);
    }

    @NonNull
    public final String zza() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) Long l11, @SafeParcelable.Param(m12890id = 4) boolean z11, @SafeParcelable.Param(m12890id = 5) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 6) List list, @Nullable @SafeParcelable.Param(m12890id = 7) String str2) {
        this.zza = i11;
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzc = l11;
        this.zzd = z11;
        this.zze = z12;
        this.zzf = list;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
