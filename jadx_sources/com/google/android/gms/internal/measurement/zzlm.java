package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlm implements zzou {
    private final zzll zza;

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzG(int i11, List list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zza.zzi(i11, (zzlg) list.get(i12));
        }
    }

    public static zzlm zza(zzll zzllVar) {
        zzlm zzlmVar = zzllVar.zza;
        return zzlmVar != null ? zzlmVar : new zzlm(zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzA(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzu(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z11) {
            while (i12 < zzmzVar.size()) {
                this.zza.zzf(i11, zzmzVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmzVar.size(); i16++) {
            zzmzVar.zzc(i16);
            i15 += 8;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzB(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzlx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzs(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zzlx zzlxVar = (zzlx) list;
        if (!z11) {
            while (i12 < zzlxVar.size()) {
                this.zza.zzd(i11, Float.floatToRawIntBits(zzlxVar.zze(i12)));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzlxVar.size(); i16++) {
            zzlxVar.zze(i16);
            i15 += 4;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzlxVar.size()) {
            zzllVar2.zzs(Float.floatToRawIntBits(zzlxVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzC(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzln)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zzln zzlnVar = (zzln) list;
        if (!z11) {
            while (i12 < zzlnVar.size()) {
                this.zza.zzf(i11, Double.doubleToRawLongBits(zzlnVar.zze(i12)));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzlnVar.size(); i16++) {
            zzlnVar.zze(i16);
            i15 += 8;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzlnVar.size()) {
            zzllVar2.zzu(Double.doubleToRawLongBits(zzlnVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzD(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzb(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzll.zzA(((Integer) list.get(i13)).intValue());
            }
            zzllVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                this.zza.zzb(i11, zzmfVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            iZzA2 += zzll.zzA(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(iZzA2);
        while (i12 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i12));
            i12++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzE(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzkx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzg(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzp(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zzkx zzkxVar = (zzkx) list;
        if (!z11) {
            while (i12 < zzkxVar.size()) {
                this.zza.zzg(i11, zzkxVar.zze(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzkxVar.size(); i16++) {
            zzkxVar.zze(i16);
            i15++;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzkxVar.size()) {
            zzllVar2.zzp(zzkxVar.zze(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzF(int i11, List list) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmw)) {
            while (i12 < list.size()) {
                this.zza.zzh(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        while (i12 < list.size()) {
            Object objZzc = zzmwVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i11, (String) objZzc);
            } else {
                this.zza.zzi(i11, (zzlg) objZzc);
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzH(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzc(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int iZzz = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzz += zzll.zzz(((Integer) list.get(i13)).intValue());
            }
            zzllVar.zzr(iZzz);
            while (i12 < list.size()) {
                zzllVar.zzr(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                this.zza.zzc(i11, zzmfVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int iZzz2 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            iZzz2 += zzll.zzz(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(iZzz2);
        while (i12 < zzmfVar.size()) {
            zzllVar2.zzr(zzmfVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzI(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                this.zza.zzd(i11, zzmfVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmfVar.size(); i16++) {
            zzmfVar.zzf(i16);
            i15 += 4;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzJ(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzu(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z11) {
            while (i12 < zzmzVar.size()) {
                this.zza.zzf(i11, zzmzVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmzVar.size(); i16++) {
            zzmzVar.zzc(i16);
            i15 += 8;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzK(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzll zzllVar = this.zza;
                    int iIntValue = ((Integer) list.get(i12)).intValue();
                    zzllVar.zzc(i11, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i11, 2);
            int iZzz = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iZzz += zzll.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzllVar2.zzr(iZzz);
            while (i12 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i12)).intValue();
                zzllVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                zzll zzllVar3 = this.zza;
                int iZzf = zzmfVar.zzf(i12);
                zzllVar3.zzc(i11, (iZzf >> 31) ^ (iZzf + iZzf));
                i12++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i11, 2);
        int iZzz2 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            int iZzf2 = zzmfVar.zzf(i14);
            iZzz2 += zzll.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzllVar4.zzr(iZzz2);
        while (i12 < zzmfVar.size()) {
            int iZzf3 = zzmfVar.zzf(i12);
            zzllVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzL(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzll zzllVar = this.zza;
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    zzllVar.zze(i11, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iZzA += zzll.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzllVar2.zzr(iZzA);
            while (i12 < list.size()) {
                long jLongValue3 = ((Long) list.get(i12)).longValue();
                zzllVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i12++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z11) {
            while (i12 < zzmzVar.size()) {
                zzll zzllVar3 = this.zza;
                long jZzc = zzmzVar.zzc(i12);
                zzllVar3.zze(i11, (jZzc >> 63) ^ (jZzc + jZzc));
                i12++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            long jZzc2 = zzmzVar.zzc(i14);
            iZzA2 += zzll.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzllVar4.zzr(iZzA2);
        while (i12 < zzmzVar.size()) {
            long jZzc3 = zzmzVar.zzc(i12);
            zzllVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzb(int i11, int i12) throws IOException {
        this.zza.zzd(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzc(int i11, long j11) throws IOException {
        this.zza.zze(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzd(int i11, long j11) throws IOException {
        this.zza.zzf(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zze(int i11, float f11) throws IOException {
        this.zza.zzd(i11, Float.floatToRawIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzf(int i11, double d11) throws IOException {
        this.zza.zzf(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzg(int i11, int i12) throws IOException {
        this.zza.zzb(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzh(int i11, long j11) throws IOException {
        this.zza.zze(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzi(int i11, int i12) throws IOException {
        this.zza.zzb(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzj(int i11, long j11) throws IOException {
        this.zza.zzf(i11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzk(int i11, int i12) throws IOException {
        this.zza.zzd(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzl(int i11, boolean z11) throws IOException {
        this.zza.zzg(i11, z11);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzm(int i11, String str) throws IOException {
        this.zza.zzh(i11, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzn(int i11, zzlg zzlgVar) throws IOException {
        this.zza.zzi(i11, zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzo(int i11, int i12) throws IOException {
        this.zza.zzc(i11, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzp(int i11, int i12) throws IOException {
        this.zza.zzc(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzq(int i11, long j11) throws IOException {
        this.zza.zze(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzr(int i11, Object obj, zznw zznwVar) throws IOException {
        this.zza.zzl(i11, (zznl) obj, zznwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzs(int i11, Object obj, zznw zznwVar) throws IOException {
        zzll zzllVar = this.zza;
        zzllVar.zza(i11, 3);
        zznwVar.zzf((zznl) obj, zzllVar.zza);
        zzllVar.zza(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzt(int i11) throws IOException {
        this.zza.zza(i11, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzu(int i11) throws IOException {
        this.zza.zza(i11, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzv(int i11, Object obj) throws IOException {
        if (obj instanceof zzlg) {
            this.zza.zzn(i11, (zzlg) obj);
        } else {
            this.zza.zzm(i11, (zznl) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzw(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzb(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzll.zzA(((Integer) list.get(i13)).intValue());
            }
            zzllVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                this.zza.zzb(i11, zzmfVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            iZzA2 += zzll.zzA(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(iZzA2);
        while (i12 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzx(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmf)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzllVar.zzr(i13);
            while (i12 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z11) {
            while (i12 < zzmfVar.size()) {
                this.zza.zzd(i11, zzmfVar.zzf(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmfVar.size(); i16++) {
            zzmfVar.zzf(i16);
            i15 += 4;
        }
        zzllVar2.zzr(i15);
        while (i12 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzy(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zze(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzll.zzA(((Long) list.get(i13)).longValue());
            }
            zzllVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzllVar.zzt(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z11) {
            while (i12 < zzmzVar.size()) {
                this.zza.zze(i11, zzmzVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            iZzA2 += zzll.zzA(zzmzVar.zzc(i14));
        }
        zzllVar2.zzr(iZzA2);
        while (i12 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzz(int i11, List list, boolean z11) throws IOException {
        int i12 = 0;
        if (!(list instanceof zzmz)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zze(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzll.zzA(((Long) list.get(i13)).longValue());
            }
            zzllVar.zzr(iZzA);
            while (i12 < list.size()) {
                zzllVar.zzt(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z11) {
            while (i12 < zzmzVar.size()) {
                this.zza.zze(i11, zzmzVar.zzc(i12));
                i12++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            iZzA2 += zzll.zzA(zzmzVar.zzc(i14));
        }
        zzllVar2.zzr(iZzA2);
        while (i12 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i12));
            i12++;
        }
    }

    private zzlm(zzll zzllVar) {
        byte[] bArr = zzmo.zzb;
        this.zza = zzllVar;
        zzllVar.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzM(int i11, zznd zzndVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzll zzllVar = this.zza;
            zzllVar.zza(i11, 2);
            zzllVar.zzr(zzne.zzc(zzndVar, entry.getKey(), entry.getValue()));
            zzne.zzb(zzllVar, zzndVar, entry.getKey(), entry.getValue());
        }
    }
}
