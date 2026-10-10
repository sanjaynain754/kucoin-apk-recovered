package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zznb implements zznj {
    private final zznj[] zza;

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.zza[i11].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final zzni zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            zznj zznjVar = this.zza[i11];
            if (zznjVar.zzb(cls)) {
                return zznjVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public zznb(zznj... zznjVarArr) {
        this.zza = zznjVarArr;
    }
}
