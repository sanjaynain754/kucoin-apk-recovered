package com.google.android.odml.image;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    @Override // com.google.android.odml.image.zzh
    public final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb2.append(" storageType");
        }
        String strValueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(strValueOf);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zza(int i11) {
        this.zza = Integer.valueOf(i11);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zzb(int i11) {
        this.zzb = Integer.valueOf(i11);
        return this;
    }
}
