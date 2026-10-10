package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzny {
    public static final /* synthetic */ int zza = 0;
    private static final zzoh zzb;

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        int i11 = zznt.zza;
        zzb = new zzoj();
    }

    public static zzoh zzA() {
        return zzb;
    }

    public static void zzC(zzlr zzlrVar, Object obj, Object obj2) {
        if (((zzmb) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoh zzohVar, Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        zzoi zzoiVarZzc = zzmeVar.zzc;
        zzoi zzoiVar = ((zzme) obj2).zzc;
        if (!zzoi.zza().equals(zzoiVar)) {
            if (zzoi.zza().equals(zzoiVarZzc)) {
                zzoiVarZzc = zzoi.zzc(zzoiVarZzc, zzoiVar);
            } else {
                zzoiVarZzc.zzl(zzoiVar);
            }
        }
        zzmeVar.zzc = zzoiVarZzc;
    }

    public static Object zzE(Object obj, int i11, int i12, Object obj2, zzoh zzohVar) {
        if (obj2 == null) {
            obj2 = zzohVar.zza(obj);
        }
        ((zzoi) obj2).zzk(i11 << 3, Long.valueOf(i12));
        return obj2;
    }

    public static void zza(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzC(i11, list, z11);
    }

    public static void zzb(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzB(i11, list, z11);
    }

    public static void zzc(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzy(i11, list, z11);
    }

    public static void zzd(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzz(i11, list, z11);
    }

    public static void zze(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzL(i11, list, z11);
    }

    public static void zzf(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzA(i11, list, z11);
    }

    public static void zzg(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzJ(i11, list, z11);
    }

    public static void zzh(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzw(i11, list, z11);
    }

    public static void zzi(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzH(i11, list, z11);
    }

    public static void zzj(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzK(i11, list, z11);
    }

    public static void zzk(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzx(i11, list, z11);
    }

    public static void zzl(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzI(i11, list, z11);
    }

    public static void zzm(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzD(i11, list, z11);
    }

    public static void zzn(int i11, List list, zzou zzouVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzE(i11, list, z11);
    }

    public static int zzz(int i11, Object obj, zznw zznwVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zzmv)) {
            return zzll.zzz(i12) + zzll.zzD((zznl) obj, zznwVar);
        }
        int iZzz = zzll.zzz(i12);
        int iZzb = ((zzmv) obj).zzb();
        return iZzz + zzll.zzz(iZzb) + iZzb;
    }

    public static int zzo(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzll.zzA(zzmzVar.zzc(i11));
                i11++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzll.zzA(((Long) list.get(i11)).longValue());
            i11++;
        }
        return iZzA2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzll.zzA(zzmzVar.zzc(i11));
                i11++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzll.zzA(((Long) list.get(i11)).longValue());
            i11++;
        }
        return iZzA2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i11 < size) {
                long jZzc = zzmzVar.zzc(i11);
                iZzA += zzll.zzA((jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i11 < size) {
            long jLongValue = ((Long) list.get(i11)).longValue();
            iZzA2 += zzll.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i11++;
        }
        return iZzA2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzll.zzA(zzmfVar.zzf(i11));
                i11++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzll.zzA(((Integer) list.get(i11)).intValue());
            i11++;
        }
        return iZzA2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzll.zzA(zzmfVar.zzf(i11));
                i11++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzll.zzA(((Integer) list.get(i11)).intValue());
            i11++;
        }
        return iZzA2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzz = 0;
            while (i11 < size) {
                iZzz += zzll.zzz(zzmfVar.zzf(i11));
                i11++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i11 < size) {
            iZzz2 += zzll.zzz(((Integer) list.get(i11)).intValue());
            i11++;
        }
        return iZzz2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzz = 0;
            while (i11 < size) {
                int iZzf = zzmfVar.zzf(i11);
                iZzz += zzll.zzz((iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i11 < size) {
            int iIntValue = ((Integer) list.get(i11)).intValue();
            iZzz2 += zzll.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i11++;
        }
        return iZzz2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzll.zzz(i11 << 3) + 4);
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzll.zzz(i11 << 3) + 8);
    }
}
