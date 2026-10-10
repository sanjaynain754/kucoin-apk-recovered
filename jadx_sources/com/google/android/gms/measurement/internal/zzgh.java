package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgh extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:46:0x0148  */
    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:55:0x0188 A[Catch: IllegalStateException -> 0x019a, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x019a, blocks: (B:49:0x016e, B:53:0x0184, B:55:0x0188), top: B:81:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4 A[EDGE_INSN: B:71:0x01f4->B:72:0x01f6 BREAK  A[LOOP:0: B:66:0x01db->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4 A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzg
    @WorkerThread
    public final void zzf() {
        String str;
        String string;
        int iZzC;
        zzib zzibVar;
        zzib zzibVar2;
        List listZzs;
        Iterator it;
        String strZza;
        zzib zzibVar3 = this.zzu;
        zzibVar3.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzibVar3.zzaY().getPackageName();
        PackageManager packageManager = zzibVar3.zzaY().getPackageManager();
        String str2 = "";
        int i11 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgt.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i11 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgt.zzl(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i11;
                this.zze = string;
                this.zzf = 0L;
                zzib zzibVar4 = this.zzu;
                iZzC = zzibVar4.zzC();
                if (iZzC != 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (iZzC != 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC != 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC != 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC != 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (iZzC != 8) {
                    zzib zzibVar5 = this.zzu;
                    zzibVar5.zzaV().zzi().zza("App measurement disabled");
                    zzibVar5.zzaV().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                zzibVar = this.zzu;
                zzibVar.zzaU();
                strZza = zzls.zza(zzibVar.zzaY(), "google_app_id", zzibVar4.zzq());
                if (TextUtils.isEmpty(strZza)) {
                    str2 = strZza;
                }
                this.zzl = str2;
                if (iZzC == 0) {
                    zzibVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzibVar2 = this.zzu;
                zzibVar2.zzaU();
                listZzs = zzibVar2.zzc().zzs("analytics.safelisted_events");
                if (listZzs != null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    it = listZzs.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzibVar2.zzk().zzk("safelisted event", (String) it.next()));
                } else {
                    zzibVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzk = InstantApps.isInstantApp(zzibVar2.zzaY()) ? 1 : 0;
                } else {
                    this.zzk = 0;
                }
            }
            zzibVar3.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgt.zzl(packageName));
            strZza = zzls.zza(zzibVar.zzaY(), "google_app_id", zzibVar4.zzq());
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzl = str2;
            if (iZzC == 0) {
                zzibVar.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
            }
        } catch (IllegalStateException e11) {
            this.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgt.zzl(packageName), e11);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i11;
        this.zze = string;
        this.zzf = 0L;
        zzib zzibVar6 = this.zzu;
        iZzC = zzibVar6.zzC();
        if (iZzC != 0) {
            this.zzu.zzaV().zzk().zza("App measurement collection enabled");
        } else if (iZzC != 1) {
            this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC != 3) {
            this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC != 4) {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC != 6) {
            this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
        } else if (iZzC != 8) {
            zzib zzibVar7 = this.zzu;
            zzibVar7.zzaV().zzi().zza("App measurement disabled");
            zzibVar7.zzaV().zzc().zza("Invalid scion state in identity");
        } else {
            this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
        }
        this.zzl = "";
        zzibVar = this.zzu;
        zzibVar.zzaU();
        this.zzi = null;
        zzibVar2 = this.zzu;
        zzibVar2.zzaU();
        listZzs = zzibVar2.zzc().zzs("analytics.safelisted_events");
        if (listZzs != null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            it = listZzs.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzibVar2.zzk().zzk("safelisted event", (String) it.next()));
        } else {
            zzibVar2.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzk = InstantApps.isInstantApp(zzibVar2.zzaY()) ? 1 : 0;
        } else {
            this.zzk = 0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0184: MOVE (r21v0 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:390)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0172: MOVE (r21v2 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:372)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x014d: MOVE (r21v3 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:335)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x00f9: MOVE (r21v6 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:251)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzr zzh(java.lang.String r45) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgh.zzh(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final long zzn() {
        return this.zzh;
    }

    @WorkerThread
    public final List zzp() {
        return this.zzi;
    }

    public final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z11 = false;
        if (str2 != null && !str2.equals(str)) {
            z11 = true;
        }
        this.zzo = str;
        return z11;
    }

    public zzgh(zzib zzibVar, long j11, long j12) {
        super(zzibVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j11;
        this.zzh = j12;
    }

    @WorkerThread
    public final void zzi() {
        String str;
        String str2;
        zzg();
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzd().zzl().zzo(zzjj.ANALYTICS_STORAGE)) {
            zzibVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            zzibVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzgr zzgrVarZzj = zzibVar.zzaV().zzj();
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        zzgrVarZzj.zza(String.format("Resetting session stitching token to %s", str2));
        this.zzm = str;
        this.zzn = zzibVar.zzaZ().currentTimeMillis();
    }

    @WorkerThread
    public final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    @WorkerThread
    public final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    @WorkerThread
    public final int zzm() {
        zzb();
        return this.zzc;
    }

    @WorkerThread
    public final int zzo() {
        zzb();
        return this.zzk;
    }
}
