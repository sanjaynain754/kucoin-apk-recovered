package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzll extends zzky {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzll.class.getName());
    private static final boolean zzd = zzoo.zza();
    zzlm zza;

    private zzll() {
        throw null;
    }

    public abstract void zza(int i11, int i12) throws IOException;

    public abstract void zzb(int i11, int i12) throws IOException;

    public abstract void zzc(int i11, int i12) throws IOException;

    public abstract void zzd(int i11, int i12) throws IOException;

    public abstract void zze(int i11, long j11) throws IOException;

    public abstract void zzf(int i11, long j11) throws IOException;

    public abstract void zzg(int i11, boolean z11) throws IOException;

    public abstract void zzh(int i11, String str) throws IOException;

    public abstract void zzi(int i11, zzlg zzlgVar) throws IOException;

    public abstract void zzj(zzlg zzlgVar) throws IOException;

    public abstract void zzk(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void zzl(int i11, zznl zznlVar, zznw zznwVar) throws IOException;

    public abstract void zzm(int i11, zznl zznlVar) throws IOException;

    public abstract void zzn(int i11, zzlg zzlgVar) throws IOException;

    public abstract void zzo(zznl zznlVar) throws IOException;

    public abstract void zzp(byte b11) throws IOException;

    public abstract void zzq(int i11) throws IOException;

    public abstract void zzr(int i11) throws IOException;

    public abstract void zzs(int i11) throws IOException;

    public abstract void zzt(long j11) throws IOException;

    public abstract void zzu(long j11) throws IOException;

    public abstract void zzw(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract int zzy();

    public /* synthetic */ zzll(byte[] bArr) {
    }

    public static int zzD(zznl zznlVar, zznw zznwVar) {
        int iZzcd = ((zzkr) zznlVar).zzcd(zznwVar);
        return zzz(iZzcd) + iZzcd;
    }

    @Deprecated
    public static int zzG(int i11, zznl zznlVar, zznw zznwVar) {
        int iZzz = zzz(i11 << 3);
        return iZzz + iZzz + ((zzkr) zznlVar).zzcd(zznwVar);
    }

    public final void zzF(String str, zzoq zzoqVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzoqVar);
        byte[] bytes = str.getBytes(zzmo.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzlk(e11);
        }
    }

    public static int zzA(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzor.zzb(str);
        } catch (zzoq unused) {
            length = str.getBytes(zzmo.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zznl zznlVar) {
        int iZzcn = zznlVar.zzcn();
        return zzz(iZzcn) + iZzcn;
    }

    public static int zzz(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
