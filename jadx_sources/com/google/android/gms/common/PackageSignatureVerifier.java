package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.kubi.otc.entity.OtcAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@KeepForSdk
public class PackageSignatureVerifier {

    @Nullable
    @VisibleForTesting
    static volatile zzab zza;

    @Nullable
    private static zzac zzb;

    private static zzac zza(Context context) {
        zzac zzacVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new zzac(context);
                }
                zzacVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzacVar;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        String str2;
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (zzn.zzf()) {
            if (true != zHonorsDebugCertificates) {
                str2 = "-0";
            } else {
                str2 = OtcAd.KYC_NOT_PASS;
            }
            String strConcat = String.valueOf(str).concat(str2);
            if (zza != null && zza.zza.equals(strConcat)) {
                return zza.zzb;
            }
            zza(context);
            zzw zzwVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
            if (zzwVarZzc.zza) {
                zza = new zzab(strConcat, PackageVerificationResult.zzd(str, zzwVarZzc.zzd));
                return zza.zzb;
            }
            Preconditions.checkNotNull(zzwVarZzc.zzb);
            return PackageVerificationResult.zza(str, zzwVarZzc.zzb, zzwVarZzc.zzc);
        }
        throw new zzad();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e11) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e11);
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
