package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpq;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.zzb();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i11, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i11);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l11, Long l12, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z11) {
        Object[] objArr;
        Object obj;
        zzpq.zza();
        zzib zzibVar = this.zza.zzu;
        boolean zZzp = zzibVar.zzc().zzp(this.zzb, zzfx.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zZze = zzfnVar.zze();
        boolean zZzf = zzfnVar.zzf();
        boolean zZzh = zzfnVar.zzh();
        if (zZze || zZzf || zZzh) {
            objArr = true;
        } else {
            objArr = false;
        }
        Boolean boolZze = null;
        Integer numValueOf = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        if (z11 && objArr == false) {
            zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
            Integer numValueOf2 = Integer.valueOf(this.zzc);
            if (zzfnVar.zza()) {
                numValueOf = Integer.valueOf(zzfnVar.zzb());
            }
            zzgrVarZzk.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", numValueOf2, numValueOf);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfnVar.zzd();
        boolean zZzf2 = zzfhVarZzd.zzf();
        if (zziuVar.zzf()) {
            if (!zzfhVarZzd.zzc()) {
                zzibVar.zzaV().zze().zzb("No number filter for long property. property", zzibVar.zzl().zzc(zziuVar.zzc()));
            } else {
                boolZze = zzab.zze(zzab.zzg(zziuVar.zzg(), zzfhVarZzd.zzd()), zZzf2);
            }
        } else if (zziuVar.zzj()) {
            if (!zzfhVarZzd.zzc()) {
                zzibVar.zzaV().zze().zzb("No number filter for double property. property", zzibVar.zzl().zzc(zziuVar.zzc()));
            } else {
                boolZze = zzab.zze(zzab.zzh(zziuVar.zzk(), zzfhVarZzd.zzd()), zZzf2);
            }
        } else if (zziuVar.zzd()) {
            if (!zzfhVarZzd.zza()) {
                if (!zzfhVarZzd.zzc()) {
                    zzibVar.zzaV().zze().zzb("No string or number filter defined. property", zzibVar.zzl().zzc(zziuVar.zzc()));
                } else if (zzpj.zzm(zziuVar.zze())) {
                    boolZze = zzab.zze(zzab.zzi(zziuVar.zze(), zzfhVarZzd.zzd()), zZzf2);
                } else {
                    zzibVar.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzibVar.zzl().zzc(zziuVar.zzc()), zziuVar.zze());
                }
            } else {
                boolZze = zzab.zze(zzab.zzf(zziuVar.zze(), zzfhVarZzd.zzb(), zzibVar.zzaV()), zZzf2);
            }
        } else {
            zzibVar.zzaV().zze().zzb("User property has no value, property", zzibVar.zzl().zzc(zziuVar.zzc()));
        }
        zzgr zzgrVarZzk2 = zzibVar.zzaV().zzk();
        if (boolZze == null) {
            obj = "null";
        } else {
            obj = boolZze;
        }
        zzgrVarZzk2.zzb("Property filter result", obj);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzh && !boolZze.booleanValue()) {
            return true;
        }
        if (!z11 || zzfnVar.zze()) {
            this.zze = boolZze;
        }
        if (boolZze.booleanValue() && objArr != false && zziuVar.zza()) {
            long jZzb = zziuVar.zzb();
            if (l11 != null) {
                jZzb = l11.longValue();
            }
            if (zZzp && zzfnVar.zze() && !zzfnVar.zzf() && l12 != null) {
                jZzb = l12.longValue();
            }
            if (zzfnVar.zzf()) {
                this.zzg = Long.valueOf(jZzb);
            } else {
                this.zzf = Long.valueOf(jZzb);
            }
        }
        return true;
    }
}
