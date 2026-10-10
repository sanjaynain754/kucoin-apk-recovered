package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzgu {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public static zzgu zza(zzbg zzbgVar) {
        return new zzgu(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }

    public final zzbg zzb() {
        return new zzbg(this.zza, new zzbe(new Bundle(this.zzd)), this.zzb, this.zzc);
    }

    public zzgu(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j11;
    }
}
