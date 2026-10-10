package com.google.android.odml.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
final class zze implements zzg {
    private final Bitmap zza;
    private final ImageProperties zzb;

    public final Bitmap zza() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.zzb;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.zza.recycle();
    }

    public zze(Bitmap bitmap) {
        int i11;
        this.zza = bitmap;
        zzb zzbVar = new zzb();
        int i12 = zzd.zza[bitmap.getConfig().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 8;
        }
        zzbVar.zza(i11);
        zzbVar.zzb(1);
        this.zzb = zzbVar.zzc();
    }
}
