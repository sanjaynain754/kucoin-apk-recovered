package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhf {
    final /* synthetic */ zzhg zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;

    @WorkerThread
    public final String zza() {
        if (!this.zzc) {
            this.zzc = true;
            zzhg zzhgVar = this.zza;
            this.zzd = zzhgVar.zzd().getString(this.zzb, null);
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putString(this.zzb, str);
        editorEdit.apply();
        this.zzd = str;
    }

    public zzhf(zzhg zzhgVar, String str, String str2) {
        Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }
}
