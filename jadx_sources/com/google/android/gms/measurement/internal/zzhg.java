package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33577c3;
import com.tencent.bugly.proguard.C33695hg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhg extends zzje {
    static final Pair zza = new Pair("", 0L);
    public zzhe zzb;
    public final zzhd zzc;
    public final zzhd zzd;
    public final zzhf zze;
    public final zzhd zzf;
    public final zzhb zzg;
    public final zzhf zzh;
    public final zzhc zzi;
    public final zzhb zzj;
    public final zzhd zzk;
    public final zzhd zzl;
    public boolean zzm;
    public final zzhb zzn;
    public final zzhb zzo;
    public final zzhd zzp;
    public final zzhf zzq;
    public final zzhf zzr;
    public final zzhd zzs;
    public final zzhc zzt;
    private SharedPreferences zzv;
    private SharedPreferences zzw;
    private String zzx;
    private boolean zzy;
    private long zzz;

    @Override // com.google.android.gms.measurement.internal.zzje
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    @WorkerThread
    public final void zzba() {
        zzib zzibVar = this.zzu;
        SharedPreferences sharedPreferences = zzibVar.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z11 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z11;
        if (!z11) {
            SharedPreferences.Editor editorEdit = this.zzv.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zzibVar.zzc();
        this.zzb = new zzhe(this, "health_monitor", Math.max(0L, ((Long) zzfx.zzc.zzb(null)).longValue()), null);
    }

    public final SparseArray zzf() {
        Bundle bundleZza = this.zzi.zza();
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.zzu.zzaV().zzb().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i11 = 0; i11 < intArray.length; i11++) {
            sparseArray.put(intArray[i11], Long.valueOf(longArray[i11]));
        }
        return sparseArray;
    }

    @WorkerThread
    public final boolean zzo() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean zzp(long j11) {
        return j11 - this.zzf.zza() > this.zzk.zza();
    }

    public zzhg(zzib zzibVar) {
        super(zzibVar);
        this.zzf = new zzhd(this, "session_timeout", C33536a4.f68797g);
        this.zzg = new zzhb(this, "start_new_session", true);
        this.zzk = new zzhd(this, C33695hg.f70129j, 0L);
        this.zzl = new zzhd(this, "session_id", 0L);
        this.zzh = new zzhf(this, "non_personalized_ads", null);
        this.zzi = new zzhc(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzhb(this, "allow_remote_dynamite", false);
        this.zzc = new zzhd(this, "first_open_time", 0L);
        this.zzd = new zzhd(this, "app_install_time", 0L);
        this.zze = new zzhf(this, "app_instance_id", null);
        this.zzn = new zzhb(this, "app_backgrounded", false);
        this.zzo = new zzhb(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhd(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzhf(this, "firebase_feature_rollouts", null);
        this.zzr = new zzhf(this, "deferred_attribution_cache", null);
        this.zzs = new zzhd(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzhc(this, "default_event_parameters", null);
    }

    @WorkerThread
    public final Pair zzb(String str) {
        zzg();
        if (zzl().zzo(zzjj.AD_STORAGE)) {
            zzib zzibVar = this.zzu;
            long jElapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
            String str2 = this.zzx;
            if (str2 != null && jElapsedRealtime < this.zzz) {
                return new Pair(str2, Boolean.valueOf(this.zzy));
            }
            this.zzz = jElapsedRealtime + zzibVar.zzc().zzl(str, zzfx.zza);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzibVar.zzaY());
                this.zzx = "";
                String id2 = advertisingIdInfo.getId();
                if (id2 != null) {
                    this.zzx = id2;
                }
                this.zzy = advertisingIdInfo.isLimitAdTrackingEnabled();
            } catch (Exception e11) {
                this.zzu.zzaV().zzj().zzb("Unable to get advertising id", e11);
                this.zzx = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(this.zzx, Boolean.valueOf(this.zzy));
        }
        return new Pair("", Boolean.FALSE);
    }

    @VisibleForTesting
    @WorkerThread
    public final SharedPreferences zzd() {
        zzg();
        zzw();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @WorkerThread
    public final SharedPreferences zze() {
        zzg();
        zzw();
        if (this.zzw == null) {
            zzib zzibVar = this.zzu;
            String strValueOf = String.valueOf(zzibVar.zzaY().getPackageName());
            zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
            String strConcat = strValueOf.concat("_preferences");
            zzgrVarZzk.zzb("Default prefs file", strConcat);
            this.zzw = zzibVar.zzaY().getSharedPreferences(strConcat, 0);
        }
        return this.zzw;
    }

    @WorkerThread
    public final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = zzd().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    public final Boolean zzi() {
        zzg();
        if (zzd().contains("measurement_enabled")) {
            return Boolean.valueOf(zzd().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final zzaz zzj() {
        zzg();
        return zzaz.zzg(zzd().getString("dma_consent_settings", null));
    }

    @WorkerThread
    public final boolean zzk(int i11) {
        return zzjk.zzu(i11, zzd().getInt("consent_source", 100));
    }

    @WorkerThread
    public final zzjk zzl() {
        zzg();
        return zzjk.zzf(zzd().getString("consent_settings", C33577c3.f69354k), zzd().getInt("consent_source", 100));
    }

    @WorkerThread
    public final boolean zzm(zzoc zzocVar) {
        zzg();
        String string = zzd().getString("stored_tcf_param", "");
        String strZza = zzocVar.zza();
        if (!strZza.equals(string)) {
            SharedPreferences.Editor editorEdit = zzd().edit();
            editorEdit.putString("stored_tcf_param", strZza);
            editorEdit.apply();
            return true;
        }
        return false;
    }

    @WorkerThread
    public final void zzn(boolean z11) {
        zzg();
        this.zzu.zzaV().zzk().zzb("App measurement setting deferred collection", Boolean.valueOf(z11));
        SharedPreferences.Editor editorEdit = zzd().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z11);
        editorEdit.apply();
    }
}
