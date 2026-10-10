package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlj extends zzll {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlj(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzw(byte[] bArr, int i11, int i12) throws IOException {
        zzv(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(int i11, int i12) throws IOException {
        zzr((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzb(int i11, int i12) throws IOException {
        zzr(i11 << 3);
        zzq(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(int i11, int i12) throws IOException {
        zzr(i11 << 3);
        zzr(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzd(int i11, int i12) throws IOException {
        zzr((i11 << 3) | 5);
        zzs(i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zze(int i11, long j11) throws IOException {
        zzr(i11 << 3);
        zzt(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzf(int i11, long j11) throws IOException {
        zzr((i11 << 3) | 1);
        zzu(j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzg(int i11, boolean z11) throws IOException {
        zzr(i11 << 3);
        zzp(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzh(int i11, String str) throws IOException {
        zzr((i11 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzi(int i11, zzlg zzlgVar) throws IOException {
        zzr((i11 << 3) | 2);
        zzj(zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzl(int i11, zznl zznlVar, zznw zznwVar) throws IOException {
        zzr((i11 << 3) | 2);
        zzr(((zzkr) zznlVar).zzcd(zznwVar));
        zznwVar.zzf(zznlVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzm(int i11, zznl zznlVar) throws IOException {
        zzr(11);
        zzc(2, i11);
        zzr(26);
        zzo(zznlVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzn(int i11, zzlg zzlgVar) throws IOException {
        zzr(11);
        zzc(2, i11);
        zzi(3, zzlgVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzp(byte b11) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        try {
            int i12 = i11 + 1;
            try {
                this.zzc[i11] = b11;
                this.zze = i12;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i11 = i12;
                throw new zzlk(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e12) {
            indexOutOfBoundsException = e12;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzq(int i11) throws IOException {
        if (i11 >= 0) {
            zzr(i11);
        } else {
            zzt(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzr(int i11) throws IOException {
        int i12;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i13 = this.zze;
        while ((i11 & (-128)) != 0) {
            try {
                i12 = i13 + 1;
                try {
                    this.zzc[i13] = (byte) (i11 | 128);
                    i11 >>>= 7;
                    i13 = i12;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i13 = i12;
                    throw new zzlk(i13, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                throw new zzlk(i13, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i12 = i13 + 1;
        this.zzc[i13] = (byte) i11;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzs(int i11) throws IOException {
        int i12 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.zze = i12 + 4;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzlk(i12, this.zzd, 4, e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzu(long j11) throws IOException {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.zze = i11 + 8;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzlk(i11, this.zzd, 8, e11);
        }
    }

    public final void zzv(byte[] bArr, int i11, int i12) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i12);
            this.zze += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzlk(this.zze, this.zzd, i12, e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzx(String str) throws IOException {
        int i11 = this.zze;
        try {
            int iZzz = zzll.zzz(str.length() * 3);
            int iZzz2 = zzll.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzor.zzb(str));
                byte[] bArr = this.zzc;
                int i12 = this.zze;
                this.zze = zzor.zzc(str, bArr, i12, this.zzd - i12);
                return;
            }
            int i13 = i11 + iZzz2;
            this.zze = i13;
            int iZzc = zzor.zzc(str, this.zzc, i13, this.zzd - i13);
            this.zze = i11;
            zzr((iZzc - i11) - iZzz2);
            this.zze = iZzc;
        } catch (zzoq e11) {
            this.zze = i11;
            zzF(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zzlk(e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzj(zzlg zzlgVar) throws IOException {
        zzr(zzlgVar.zzc());
        zzlgVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzk(byte[] bArr, int i11, int i12) throws IOException {
        zzr(i12);
        zzv(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzo(zznl zznlVar) throws IOException {
        zzr(zznlVar.zzcn());
        zznlVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzt(long j11) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z11 = zzll.zzd;
        int i12 = this.zze;
        if (z11 && this.zzd - i12 >= 10) {
            while ((j11 & (-128)) != 0) {
                zzoo.zzp(this.zzc, i12, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i12++;
            }
            i11 = i12 + 1;
            zzoo.zzp(this.zzc, i12, (byte) j11);
        } else {
            while ((j11 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.zzc[i12] = (byte) (((int) j11) | 128);
                        j11 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e11) {
                        indexOutOfBoundsException = e11;
                        i12 = i13;
                        throw new zzlk(i12, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    indexOutOfBoundsException = e12;
                }
            }
            i11 = i12 + 1;
            try {
                this.zzc[i12] = (byte) j11;
            } catch (IndexOutOfBoundsException e13) {
                indexOutOfBoundsException = e13;
                i12 = i11;
                throw new zzlk(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        this.zze = i11;
    }
}
