package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
public class CommonUtils {
    private static final GmsLogger zza = new GmsLogger("CommonUtils", "");

    private CommonUtils() {
    }

    @NonNull
    @KeepForSdk
    public static String getAppVersion(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e11) {
            zza.m12880e("CommonUtils", "Exception thrown when trying to get app version ".concat(e11.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    public static String languageTagFromLocale(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append(C33820nf.f71144W);
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append(C33820nf.f71144W);
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
