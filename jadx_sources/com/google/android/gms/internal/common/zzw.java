package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzx zzxVar, zzaa zzaaVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzc(int i11) {
        return i11 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzd(int i11) {
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzv.zzb(i11, length, "index");
        while (i11 < length) {
            if (this.zza.zza(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
