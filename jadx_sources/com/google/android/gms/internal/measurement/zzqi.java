package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqi implements Supplier {
    private static final zzqi zza = new zzqi();
    private final Supplier zzb = Suppliers.ofInstance(new zzqk());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static long zzb() {
        return zza.get().zzb();
    }

    public static double zzc() {
        return zza.get().zzc();
    }

    public static long zzd() {
        return zza.get().zzd();
    }

    public static long zze() {
        return zza.get().zze();
    }

    public static String zzf() {
        return zza.get().zzf();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzqj get() {
        return (zzqj) this.zzb.get();
    }
}
