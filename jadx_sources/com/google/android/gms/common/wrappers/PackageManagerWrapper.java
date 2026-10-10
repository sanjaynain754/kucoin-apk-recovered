package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class PackageManagerWrapper {

    @NonNull
    protected final Context zza;

    @KeepForSdk
    public int checkCallingOrSelfPermission(@NonNull String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i11) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i11);
    }

    @NonNull
    @KeepForSdk
    public CharSequence getApplicationLabel(@NonNull String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @KeepForSdk
    public Pair<CharSequence, Drawable> getApplicationLabelAndIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return Pair.create(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @KeepForSdk
    public PackageInfo getPackageInfo(@NonNull String str, int i11) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i11);
    }

    @NonNull
    @KeepForSdk
    public String[] getPackagesForUid(int i11) {
        return this.zza.getPackageManager().getPackagesForUid(i11);
    }

    @TargetApi(19)
    public final boolean zza(int i11, @NonNull String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i11, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public PackageManagerWrapper(@NonNull Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (PlatformVersion.isAtLeastO() && (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.zza.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
