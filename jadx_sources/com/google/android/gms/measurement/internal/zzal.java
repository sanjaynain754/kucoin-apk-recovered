package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal extends zzjd {
    private Boolean zza;
    private String zzb;
    private zzak zzc;
    private Boolean zzd;

    @VisibleForTesting
    public final Bundle zzq() {
        try {
            zzib zzibVar = this.zzu;
            if (zzibVar.zzaY().getPackageManager() == null) {
                zzibVar.zzaV().zzb().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzibVar.zzaY()).getApplicationInfo(zzibVar.zzaY().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzibVar.zzaV().zzb().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            this.zzu.zzaV().zzb().zzb("Failed to load metadata: Package name not found", e11);
            return null;
        }
    }

    public static final long zzF() {
        return ((Long) zzfx.zzd.zzb(null)).longValue();
    }

    public static final int zzG() {
        return Math.max(0, ((Integer) zzfx.zzi.zzb(null)).intValue());
    }

    public static final long zzH() {
        return ((Integer) zzfx.zzk.zzb(null)).intValue();
    }

    public static final long zzI() {
        return ((Long) zzfx.zzR.zzb(null)).longValue();
    }

    public static final long zzJ() {
        return ((Long) zzfx.zzM.zzb(null)).longValue();
    }

    private final String zzK(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e11) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties class", e11);
            return "";
        } catch (IllegalAccessException e12) {
            this.zzu.zzaV().zzb().zzb("Could not access SystemProperties.get()", e12);
            return "";
        } catch (NoSuchMethodException e13) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties.get() method", e13);
            return "";
        } catch (InvocationTargetException e14) {
            this.zzu.zzaV().zzb().zzb("SystemProperties.get() threw an exception", e14);
            return "";
        }
    }

    public final String zzA() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final String zzB() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzE() {
        if (this.zza == null) {
            Boolean boolZzr = zzr("app_measurement_lite");
            this.zza = boolZzr;
            if (boolZzr == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzp();
    }

    public final void zza(zzak zzakVar) {
        this.zzc = zzakVar;
    }

    public final String zzb() {
        this.zzu.zzaU();
        return "FA";
    }

    public final int zzc() {
        return this.zzu.zzk().zzag(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzn(str, zzfx.zzX, 25, 100);
    }

    public final int zze(String str, boolean z11) {
        if (z11) {
            return zzn(str, zzfx.zzah, 100, 500);
        }
        return 500;
    }

    public final int zzh(@Size(min = 1) String str) {
        return zzn(str, zzfx.zzW, 500, 2000);
    }

    public final long zzi() {
        this.zzu.zzaU();
        return 130000L;
    }

    public final boolean zzj() {
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        zzib zzibVar = this.zzu;
                        ApplicationInfo applicationInfo = zzibVar.zzaY().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z11 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z11 = true;
                            }
                            this.zzd = Boolean.valueOf(z11);
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzibVar.zzaV().zzb().zza("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzd.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final List zzs(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzq = zzq();
        if (bundleZzq != null) {
            if (bundleZzq.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzq.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzu.zzaY().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e11) {
                    this.zzu.zzaV().zzb().zzb("Failed to load string array from metadata: resource not found", e11);
                }
            }
            return null;
        }
        this.zzu.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzu.zzaY().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final boolean zzt() {
        this.zzu.zzaU();
        Boolean boolZzr = zzr("firebase_analytics_collection_deactivated");
        return boolZzr != null && boolZzr.booleanValue();
    }

    public final boolean zzu() {
        Boolean boolZzr = zzr("google_analytics_adid_collection_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolZzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final boolean zzx() {
        Boolean boolZzr = zzr("google_analytics_sgtm_upload_enabled");
        if (boolZzr == null) {
            return false;
        }
        return boolZzr.booleanValue();
    }

    public final void zzy(String str) {
        this.zzb = str;
    }

    public final String zzz() {
        return this.zzb;
    }

    public zzal(zzib zzibVar) {
        super(zzibVar);
        this.zzc = zzaj.zza;
    }

    public final int zzf(String str, boolean z11) {
        return Math.max(zze(str, z11), 256);
    }

    @WorkerThread
    public final String zzk(String str, zzfw zzfwVar) {
        if (TextUtils.isEmpty(str)) {
            return (String) zzfwVar.zzb(null);
        }
        return (String) zzfwVar.zzb(this.zzc.zza(str, zzfwVar.zza()));
    }

    @WorkerThread
    public final long zzl(String str, zzfw zzfwVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfwVar.zzb(null)).longValue();
        }
        String strZza = this.zzc.zza(str, zzfwVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzfwVar.zzb(null)).longValue();
        }
        try {
            return ((Long) zzfwVar.zzb(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfwVar.zzb(null)).longValue();
        }
    }

    @WorkerThread
    public final int zzm(String str, zzfw zzfwVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfwVar.zzb(null)).intValue();
        }
        String strZza = this.zzc.zza(str, zzfwVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzfwVar.zzb(null)).intValue();
        }
        try {
            return ((Integer) zzfwVar.zzb(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfwVar.zzb(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzn(String str, zzfw zzfwVar, int i11, int i12) {
        return Math.max(Math.min(zzm(str, zzfwVar), i12), i11);
    }

    @WorkerThread
    public final double zzo(String str, zzfw zzfwVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfwVar.zzb(null)).doubleValue();
        }
        String strZza = this.zzc.zza(str, zzfwVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzfwVar.zzb(null)).doubleValue();
        }
        try {
            return ((Double) zzfwVar.zzb(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfwVar.zzb(null)).doubleValue();
        }
    }

    @WorkerThread
    public final boolean zzp(String str, zzfw zzfwVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfwVar.zzb(null)).booleanValue();
        }
        String strZza = this.zzc.zza(str, zzfwVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Boolean) zzfwVar.zzb(null)).booleanValue();
        }
        return ((Boolean) zzfwVar.zzb(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final Boolean zzr(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            this.zzu.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundleZzq.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(bundleZzq.getBoolean(str));
    }

    public final zzjh zzw(String str, boolean z11) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        zzib zzibVar = this.zzu;
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            zzibVar.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzq.get(str);
        }
        if (obj == null) {
            return zzjh.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzjh.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzjh.DENIED;
        }
        if (z11 && "eu_consent_policy".equals(obj)) {
            return zzjh.POLICY;
        }
        zzibVar.zzaV().zze().zzb("Invalid manifest metadata for", str);
        return zzjh.UNINITIALIZED;
    }
}
