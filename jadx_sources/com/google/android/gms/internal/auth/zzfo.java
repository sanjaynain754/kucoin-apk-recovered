package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzfo implements zzfv {
    private final zzfv[] zza;

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzfv zzfvVar = zzfvVarArr[i11];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzfvVarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public zzfo(zzfv... zzfvVarArr) {
        this.zza = zzfvVarArr;
    }
}
