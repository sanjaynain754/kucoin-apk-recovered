package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhd {
    final /* synthetic */ zzhg zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    @WorkerThread
    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhg zzhgVar = this.zza;
            this.zze = zzhgVar.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(long j11) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putLong(this.zzb, j11);
        editorEdit.apply();
        this.zze = j11;
    }

    public zzhd(zzhg zzhgVar, String str, long j11) {
        Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j11;
    }
}
