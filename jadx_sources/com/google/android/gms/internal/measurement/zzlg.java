package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzlg implements Iterable, Serializable {
    public static final zzlg zzb = new zzlf(zzmo.zzb);
    private int zza = 0;

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i11);

    public abstract byte zzb(int i11);

    public abstract int zzc();

    public abstract zzlg zze(int i11, int i12);

    public abstract void zzf(zzky zzkyVar) throws IOException;

    public abstract int zzg(int i11, int i12, int i13);

    static {
        int i11 = zzku.zza;
    }

    public static zzlg zzh(byte[] bArr, int i11, int i12) {
        zzj(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzlf(bArr2);
    }

    public static int zzj(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < i11) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 44 + String.valueOf(i12).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 15 + String.valueOf(i13).length());
        sb4.append("End index: ");
        sb4.append(i12);
        sb4.append(" >= ");
        sb4.append(i13);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkz(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzof.zza(this) : zzof.zza(zze(0, 47)).concat("..."));
    }

    public final int zzi() {
        return this.zza;
    }
}
