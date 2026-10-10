package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkf {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkf(String str, Uri uri, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, Function function) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z11;
        this.zze = z13;
    }

    public zzkf(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzkf zza() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkf(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzkf zzb() {
        return new zzkf(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzkl zze(String str, double d11) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i11 = zzkl.zzc;
        return new zzkd(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final zzkl zzf(String str, String str2) {
        int i11 = zzkl.zzc;
        return new zzke(this, str, str2, true);
    }

    public final zzkl zzc(String str, long j11) {
        Long lValueOf = Long.valueOf(j11);
        int i11 = zzkl.zzc;
        return new zzkb(this, str, lValueOf, true);
    }

    public final zzkl zzd(String str, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        int i11 = zzkl.zzc;
        return new zzkc(this, str, boolValueOf, true);
    }
}
