package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33641f4;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzma extends zzg {

    @VisibleForTesting
    protected zzlt zza;
    private volatile zzlt zzb;
    private volatile zzlt zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private com.google.android.gms.internal.measurement.zzdf zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzlt zzg;
    private zzlt zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    @WorkerThread
    private final void zzz(zzlt zzltVar, zzlt zzltVar2, long j11, boolean z11, Bundle bundle) {
        boolean z12;
        long j12;
        zzg();
        boolean z13 = false;
        if (zzltVar2 != null) {
            if (zzltVar2.zzc == zzltVar.zzc && Objects.equals(zzltVar2.zzb, zzltVar.zzb) && Objects.equals(zzltVar2.zza, zzltVar.zza)) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = true;
        }
        if (z11 && this.zza != null) {
            z13 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzpo.zzav(zzltVar, bundle2, true);
            if (zzltVar2 != null) {
                String str = zzltVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzltVar2.zzb;
                if (str2 != null) {
                    bundle2.putString(C33641f4.f69835v, str2);
                }
                bundle2.putLong("_pi", zzltVar2.zzc);
            }
            if (z13) {
                zznz zznzVar = this.zzu.zzh().zzb;
                long j13 = j11 - zznzVar.zzb;
                zznzVar.zzb = j11;
                if (j13 > 0) {
                    this.zzu.zzk().zzak(bundle2, j13);
                }
            }
            zzib zzibVar = this.zzu;
            if (!zzibVar.zzc().zzv()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z14 = zzltVar.zze;
            String str3 = true != z14 ? "auto" : "app";
            long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
            if (z14) {
                long j14 = zzltVar.zzf;
                if (j14 == 0) {
                    j12 = jCurrentTimeMillis;
                } else {
                    j12 = j14;
                }
            } else {
                j12 = jCurrentTimeMillis;
            }
            this.zzu.zzj().zzG(str3, "_vs", j12, bundle2);
        }
        if (z13) {
            zzA(this.zza, true, j11);
        }
        this.zza = zzltVar;
        if (zzltVar.zze) {
            this.zzh = zzltVar;
        }
        this.zzu.zzt().zzG(zzltVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final /* synthetic */ void zzu(zzlt zzltVar, zzlt zzltVar2, long j11, boolean z11, Bundle bundle) {
        zzz(zzltVar, zzltVar2, j11, z11, null);
    }

    public final /* synthetic */ void zzv(zzlt zzltVar, boolean z11, long j11) {
        zzA(zzltVar, false, j11);
    }

    public final /* synthetic */ void zzx(zzlt zzltVar) {
        this.zzh = null;
    }

    @WorkerThread
    private final void zzA(zzlt zzltVar, boolean z11, long j11) {
        zzib zzibVar = this.zzu;
        zzibVar.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
        if (!zzibVar.zzh().zzb.zzd(zzltVar != null && zzltVar.zzd, z11, j11) || zzltVar == null) {
            return;
        }
        zzltVar.zzd = false;
    }

    @MainThread
    private final void zzy(String str, zzlt zzltVar, boolean z11) {
        zzlt zzltVar2;
        zzlt zzltVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzltVar.zzb == null) {
            zzltVar2 = new zzlt(zzltVar.zza, str != null ? zzi(str, "Activity") : null, zzltVar.zzc, zzltVar.zze, zzltVar.zzf);
        } else {
            zzltVar2 = zzltVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzltVar2;
        zzib zzibVar = this.zzu;
        zzibVar.zzaW().zzj(new zzlv(this, zzltVar2, zzltVar3, zzibVar.zzaZ().elapsedRealtime(), z11));
    }

    @VisibleForTesting
    public final String zzi(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzib zzibVar = this.zzu;
        return str3.length() > zzibVar.zzc().zze(null, false) ? str3.substring(0, zzibVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(Bundle bundle, long j11) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                    string2 = zzdfVar != null ? zzi(zzdfVar.zzb, "Activity") : "Activity";
                }
                zzlt zzltVar = this.zzb;
                if (this.zzf && zzltVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzltVar.zzb, string2);
                    boolean zEquals2 = Objects.equals(zzltVar.zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzib zzibVar = this.zzu;
                zzibVar.zzaV().zzk().zzc("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                zzlt zzltVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlt zzltVar3 = new zzlt(string, string2, zzibVar.zzk().zzd(), true, j11);
                this.zzb = zzltVar3;
                this.zzc = zzltVar2;
                this.zzg = zzltVar3;
                zzibVar.zzaW().zzj(new zzlu(this, bundle, zzltVar3, zzltVar2, zzibVar.zzaZ().elapsedRealtime()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void zzk(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzv()) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlt zzltVar = this.zzb;
        if (zzltVar == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(numValueOf) == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        String str3 = zzltVar.zzb;
        String str4 = zzltVar.zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzibVar.zzaV().zzk().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzlt zzltVar2 = new zzlt(str, str2, zzibVar.zzk().zzd());
        map.put(numValueOf, zzltVar2);
        zzy(zzdfVar.zzb, zzltVar2, true);
    }

    public final zzlt zzl() {
        return this.zzb;
    }

    @MainThread
    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzdfVar.zza), new zzlt(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    zzib zzibVar = this.zzu;
                    if (zzibVar.zzc().zzv()) {
                        this.zzg = null;
                        zzibVar.zzaW().zzj(new zzlz(this));
                    }
                }
            }
        }
        zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzibVar2.zzaW().zzj(new zzlw(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        zzd zzdVarZzw = this.zzu.zzw();
        zzib zzibVar3 = zzdVarZzw.zzu;
        zzibVar3.zzaW().zzj(new zzc(zzdVarZzw, zzibVar3.zzaZ().elapsedRealtime()));
    }

    @MainThread
    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzib zzibVar = this.zzu;
        long jElapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        if (!zzibVar.zzc().zzv()) {
            this.zzb = null;
            zzibVar.zzaW().zzj(new zzlx(this, jElapsedRealtime));
        } else {
            zzlt zzltVarZzB = zzB(zzdfVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzibVar.zzaW().zzj(new zzly(this, zzltVarZzB, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        zzlt zzltVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzltVar = (zzlt) this.zzd.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzltVar.zzc);
        bundle2.putString("name", zzltVar.zza);
        bundle2.putString("referrer_name", zzltVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzdfVar)) {
                    this.zze = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    public final /* synthetic */ void zzt(Bundle bundle, zzlt zzltVar, zzlt zzltVar2, long j11) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzz(zzltVar, zzltVar2, j11, true, this.zzu.zzk().zzF(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    public final /* synthetic */ zzlt zzw() {
        return this.zzh;
    }

    public zzma(zzib zzibVar) {
        super(zzibVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @MainThread
    private final zzlt zzB(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.zzd;
        zzlt zzltVar = (zzlt) map.get(numValueOf);
        if (zzltVar == null) {
            zzlt zzltVar2 = new zzlt(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(numValueOf, zzltVar2);
            zzltVar = zzltVar2;
        }
        if (this.zzg != null) {
            return this.zzg;
        }
        return zzltVar;
    }

    @WorkerThread
    public final zzlt zzh(boolean z11) {
        zzb();
        zzg();
        if (!z11) {
            return this.zza;
        }
        zzlt zzltVar = this.zza;
        if (zzltVar != null) {
            return zzltVar;
        }
        return this.zzh;
    }
}
