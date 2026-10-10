package com.google.android.odml.image;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzf implements zzg {
    private final ByteBuffer zza;
    private final ImageProperties zzb;

    public final ByteBuffer zza() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.zzb;
    }

    public zzf(ByteBuffer byteBuffer, int i11) {
        this.zza = byteBuffer;
        zzb zzbVar = new zzb();
        zzbVar.zzb(2);
        zzbVar.zza(i11);
        this.zzb = zzbVar.zzc();
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
    }
}
