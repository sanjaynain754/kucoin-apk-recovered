package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhe {

    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzhg zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    @WorkerThread
    private final void zzc() {
        zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        long jCurrentTimeMillis = zzhgVar.zzu.zzaZ().currentTimeMillis();
        SharedPreferences.Editor editorEdit = zzhgVar.zzd().edit();
        editorEdit.remove(this.zzc);
        editorEdit.remove(this.zzd);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @WorkerThread
    private final long zzd() {
        return this.zzb.zzd().getLong(this.zza, 0L);
    }

    @WorkerThread
    public final void zza(String str, long j11) {
        zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        if (zzd() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesZzd = zzhgVar.zzd();
        String str2 = this.zzc;
        long j12 = sharedPreferencesZzd.getLong(str2, 0L);
        if (j12 <= 0) {
            SharedPreferences.Editor editorEdit = zzhgVar.zzd().edit();
            editorEdit.putString(this.zzd, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = zzhgVar.zzu.zzk().zzf().nextLong() & Long.MAX_VALUE;
        long j13 = j12 + 1;
        long j14 = Long.MAX_VALUE / j13;
        SharedPreferences.Editor editorEdit2 = zzhgVar.zzd().edit();
        if (jNextLong < j14) {
            editorEdit2.putString(this.zzd, str);
        }
        editorEdit2.putLong(str2, j13);
        editorEdit2.apply();
    }

    @WorkerThread
    public final Pair zzb() {
        long jAbs;
        zzhg zzhgVar = this.zzb;
        zzhgVar.zzg();
        zzhgVar.zzg();
        long jZzd = zzd();
        if (jZzd == 0) {
            zzc();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzd - zzhgVar.zzu.zzaZ().currentTimeMillis());
        }
        long j11 = this.zze;
        if (jAbs < j11) {
            return null;
        }
        if (jAbs > j11 + j11) {
            zzc();
            return null;
        }
        String string = zzhgVar.zzd().getString(this.zzd, null);
        long j12 = zzhgVar.zzd().getLong(this.zzc, 0L);
        zzc();
        return (string == null || j12 <= 0) ? zzhg.zza : new Pair(string, Long.valueOf(j12));
    }

    public /* synthetic */ zzhe(zzhg zzhgVar, String str, long j11, byte[] bArr) {
        boolean z11;
        Objects.requireNonNull(zzhgVar);
        this.zzb = zzhgVar;
        Preconditions.checkNotEmpty("health_monitor");
        if (j11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j11;
    }
}
