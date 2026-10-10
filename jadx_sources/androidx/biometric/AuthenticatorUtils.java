package androidx.biometric;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
class AuthenticatorUtils {
    private static final int BIOMETRIC_CLASS_MASK = 32767;

    public static String convertToString(int i11) {
        if (i11 == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i11 == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i11 == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i11 != 32783) {
            return i11 != 33023 ? String.valueOf(i11) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        }
        return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
    }

    public static boolean isSomeBiometricAllowed(int i11) {
        return (i11 & BIOMETRIC_CLASS_MASK) != 0;
    }

    public static boolean isSupportedCombination(int i11) {
        if (i11 != 15 && i11 != 255) {
            if (i11 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i11 != 32783) {
                return i11 == 33023 || i11 == 0;
            }
            int i12 = Build.VERSION.SDK_INT;
            return i12 < 28 || i12 > 29;
        }
        return true;
    }

    public static boolean isWeakBiometricAllowed(int i11) {
        return (i11 & 255) == 255;
    }

    private AuthenticatorUtils() {
    }

    public static int getConsolidatedAuthenticators(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        int i11;
        if (promptInfo.getAllowedAuthenticators() != 0) {
            return promptInfo.getAllowedAuthenticators();
        }
        if (cryptoObject != null) {
            i11 = 15;
        } else {
            i11 = 255;
        }
        if (promptInfo.isDeviceCredentialAllowed()) {
            return 32768 | i11;
        }
        return i11;
    }

    public static boolean isDeviceCredentialAllowed(int i11) {
        if ((i11 & 32768) != 0) {
            return true;
        }
        return false;
    }
}
