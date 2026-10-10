package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(19)
final class zzi implements zzg {
    private final Image zza;
    private final ImageProperties zzb;

    public final Image zza() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.zzb;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.zza.close();
    }

    public zzi(Image image) {
        int i11;
        this.zza = image;
        zzb zzbVar = new zzb();
        zzbVar.zzb(3);
        int format = image.getFormat();
        if (format == 42) {
            i11 = 1;
        } else if (format == 41) {
            i11 = 2;
        } else if (format != 35) {
            if (format != 256) {
                i11 = 0;
            } else {
                i11 = 9;
            }
        } else {
            i11 = 7;
        }
        zzbVar.zza(i11);
        this.zzb = zzbVar.zzc();
    }
}
