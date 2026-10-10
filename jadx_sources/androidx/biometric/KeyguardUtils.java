package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
class KeyguardUtils {

    @RequiresApi(23)
    public static class Api23Impl {
        @Nullable
        public static KeyguardManager getKeyguardManager(@NonNull Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        private Api23Impl() {
        }

        public static boolean isDeviceSecure(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    @RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
        }

        public static boolean isKeyguardSecure(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    private KeyguardUtils() {
    }

    @Nullable
    public static KeyguardManager getKeyguardManager(@NonNull Context context) {
        return Api23Impl.getKeyguardManager(context);
    }

    public static boolean isDeviceSecuredWithCredential(@NonNull Context context) {
        KeyguardManager keyguardManager = getKeyguardManager(context);
        if (keyguardManager == null) {
            return false;
        }
        return Api23Impl.isDeviceSecure(keyguardManager);
    }
}
