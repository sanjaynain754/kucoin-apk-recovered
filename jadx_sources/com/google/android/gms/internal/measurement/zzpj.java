package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpj implements zzpi {
    public static final zzkl zza;
    public static final zzkl zzb;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzkfVarZzb.zzd("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        zzb = zzkfVarZzb.zzd("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzb() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}
