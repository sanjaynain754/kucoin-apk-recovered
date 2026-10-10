package com.google.android.odml.image;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
final class zzc extends ImageProperties {
    private final int zza;
    private final int zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.zza == imageProperties.getImageFormat() && this.zzb == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(i11);
        sb2.append(", storageType=");
        sb2.append(i12);
        sb2.append("}");
        return sb2.toString();
    }

    public /* synthetic */ zzc(int i11, int i12, zza zzaVar) {
        this.zza = i11;
        this.zzb = i12;
    }
}
