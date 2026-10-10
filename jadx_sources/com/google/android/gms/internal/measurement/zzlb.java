package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlb extends zzlf {
    private final int zzc;

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return ((zzlf) this).zza[i11];
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
        sb3.append("Index > length: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(i12);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zzb(int i11) {
        return ((zzlf) this).zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final int zzc() {
        return this.zzc;
    }

    public zzlb(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzlg.zzj(0, i12, bArr.length);
        this.zzc = i12;
    }
}
