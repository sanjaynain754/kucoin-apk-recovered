package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    /* JADX INFO: loaded from: classes23.dex */
    public static class Api16Impl {
        private Api16Impl() {
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
            int i11;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z11) {
                i11 = systemUiVisibility & (-1793);
            } else {
                i11 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i11);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static <T> T requireViewById(Window window, int i11) {
            return (T) window.requireViewById(i11);
        }
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
            int i11;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z11) {
                i11 = systemUiVisibility & (-257);
            } else {
                i11 = systemUiVisibility | 256;
            }
            decorView.setSystemUiVisibility(i11);
            window.setDecorFitsSystemWindows(z11);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(35)
    public static class Api35Impl {
        private Api35Impl() {
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
            window.setDecorFitsSystemWindows(z11);
        }
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(window, i11);
        }
        T t11 = (T) window.findViewById(i11);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            Api35Impl.setDecorFitsSystemWindows(window, z11);
        } else if (i11 >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z11);
        } else {
            Api16Impl.setDecorFitsSystemWindows(window, z11);
        }
    }

    private WindowCompat() {
    }
}
