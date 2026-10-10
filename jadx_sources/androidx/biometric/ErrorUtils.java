package androidx.biometric;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
class ErrorUtils {
    public static boolean isLockoutError(int i11) {
        return i11 == 7 || i11 == 9;
    }

    @NonNull
    public static String getFingerprintErrorString(@Nullable Context context, int i11) {
        if (context == null) {
            return "";
        }
        if (i11 == 1) {
            return context.getString(C0640R.string.fingerprint_error_hw_not_available);
        }
        if (i11 != 7) {
            switch (i11) {
                case 9:
                    break;
                case 10:
                    return context.getString(C0640R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(C0640R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(C0640R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i11);
                    return context.getString(C0640R.string.default_error_msg);
            }
        }
        return context.getString(C0640R.string.fingerprint_error_lockout);
    }

    private ErrorUtils() {
    }

    public static boolean isKnownError(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }
}
