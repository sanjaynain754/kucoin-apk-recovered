package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzhj {
    final zzib zza;

    @VisibleForTesting
    public final boolean zza() {
        try {
            zzib zzibVar = this.zza;
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzibVar.zzaY());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzibVar.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e11) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e11);
            return false;
        }
    }

    public zzhj(zzpf zzpfVar) {
        this.zza = zzpfVar.zzaf();
    }
}
