package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
class zzlf extends zzle {
    protected final byte[] zza;

    public zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlg) || zzc() != ((zzlg) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlf)) {
            return obj.equals(this);
        }
        zzlf zzlfVar = (zzlf) obj;
        int iZzi = zzi();
        int iZzi2 = zzlfVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzlfVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb2.append("Length too large: ");
            sb2.append(iZzc);
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iZzc > zzlfVar.zzc()) {
            int iZzc3 = zzlfVar.zzc();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iZzc);
            sb3.append(", ");
            sb3.append(iZzc3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlfVar.zza;
        zzlfVar.zzd();
        int i11 = 0;
        int i12 = 0;
        while (i11 < iZzc) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zza(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zzb(int i11) {
        return this.zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public int zzc() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzg(int i11, int i12, int i13) {
        return zzmo.zzc(i11, this.zza, 0, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlg zze(int i11, int i12) {
        int iZzj = zzlg.zzj(0, i12, zzc());
        if (iZzj == 0) {
            return zzlg.zzb;
        }
        return new zzlb(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final void zzf(zzky zzkyVar) throws IOException {
        ((zzlj) zzkyVar).zzv(this.zza, 0, zzc());
    }
}
