package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzoi {
    private static final zzoi zza = new zzoi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoi(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzoi)) {
            return false;
        }
        zzoi zzoiVar = (zzoi) obj;
        int i11 = this.zzb;
        if (i11 == zzoiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoiVar.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzoiVar.zzd;
            int i13 = this.zzb;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void zzf(zzou zzouVar) throws IOException {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzouVar.zzv(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zzj(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zznn.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    private zzoi() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzoi zza() {
        return zza;
    }

    public static zzoi zzb() {
        return new zzoi(0, new int[8], new Object[8], true);
    }

    public static zzoi zzc(zzoi zzoiVar, zzoi zzoiVar2) {
        int i11 = zzoiVar.zzb + zzoiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzoiVar.zzc, i11);
        System.arraycopy(zzoiVar2.zzc, 0, iArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzoiVar.zzd, i11);
        System.arraycopy(zzoiVar2.zzd, 0, objArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
        return new zzoi(i11, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i11) {
        int[] iArr = this.zzc;
        if (i11 > iArr.length) {
            int i12 = this.zzb;
            int i13 = i12 + (i12 / 2);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i11);
            this.zzd = Arrays.copyOf(this.zzd, i11);
        }
    }

    public final int hashCode() {
        int i11 = this.zzb;
        int i12 = i11 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i12 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzg(zzou zzouVar) throws IOException {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zzouVar.zzc(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzouVar.zzj(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzouVar.zzn(i14, (zzlg) obj);
                } else if (i13 == 3) {
                    zzouVar.zzt(i14);
                    ((zzoi) obj).zzg(zzouVar);
                    zzouVar.zzu(i14);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    zzouVar.zzk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int iZzz = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12] >>> 3;
            zzlg zzlgVar = (zzlg) this.zzd[i12];
            int iZzz2 = zzll.zzz(8);
            int iZzz3 = zzll.zzz(16) + zzll.zzz(i13);
            int iZzz4 = zzll.zzz(24);
            int iZzc = zzlgVar.zzc();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzll.zzz(iZzc) + iZzc;
        }
        this.zze = iZzz;
        return iZzz;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.zzd[i13]).getClass();
                    iZzz2 = zzll.zzz(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zzlg zzlgVar = (zzlg) this.zzd[i13];
                    int iZzz3 = zzll.zzz(i17);
                    int iZzc = zzlgVar.zzc();
                    iZzz2 = iZzz3 + zzll.zzz(iZzc) + iZzc;
                } else if (i16 == 3) {
                    int iZzz4 = zzll.zzz(i15 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzoi) this.zzd[i13]).zzi();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i13]).getClass();
                    iZzz2 = zzll.zzz(i15 << 3) + 4;
                }
                i12 += iZzz2;
            } else {
                int i18 = i15 << 3;
                long jLongValue = ((Long) this.zzd[i13]).longValue();
                iZzz = zzll.zzz(i18);
                iZzA = zzll.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i12 += iZzz2;
        }
        this.zze = i12;
        return i12;
    }

    public final zzoi zzl(zzoi zzoiVar) {
        if (zzoiVar.equals(zza)) {
            return this;
        }
        zze();
        int i11 = this.zzb + zzoiVar.zzb;
        zzm(i11);
        System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
        System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
        this.zzb = i11;
        return this;
    }

    public final void zzk(int i11, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i12 = this.zzb;
        iArr[i12] = i11;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }
}
