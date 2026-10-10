package androidx.biometric;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
class DeviceUtils {
    private static boolean isModelInList(@NonNull Context context, String str, int i11) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i11)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isModelInPrefixList(@NonNull Context context, String str, int i11) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i11)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVendorInList(@NonNull Context context, String str, int i11) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i11)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canAssumeStrongBiometrics(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return isModelInList(context, str, C0640R.array.assume_strong_biometrics_models);
    }

    public static boolean shouldDelayShowingPrompt(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return isModelInList(context, str, C0640R.array.delay_showing_prompt_models);
    }

    public static boolean shouldHideFingerprintDialog(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isModelInPrefixList(context, str, C0640R.array.hide_fingerprint_instantly_prefixes);
    }

    public static boolean shouldUseFingerprintForCrypto(@NonNull Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isVendorInList(context, str, C0640R.array.crypto_fingerprint_fallback_vendors) || isModelInPrefixList(context, str2, C0640R.array.crypto_fingerprint_fallback_prefixes);
    }

    private DeviceUtils() {
    }
}
