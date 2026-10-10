package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.util.Supplier;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final String TAG = "ViewConfigCompat";
    private static Method sGetScaledScrollFactorMethod;

    private static int getCompatFlingVelocityThreshold(Resources resources, int i11, Supplier<Integer> supplier, int i12) {
        int dimensionPixelSize;
        if (i11 != -1) {
            return (i11 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i11)) < 0) ? i12 : dimensionPixelSize;
        }
        return supplier.get().intValue();
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static float getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static int getScaledHoverSlop(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static int getScaledMaximumFlingVelocity(@NonNull ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i11, i12, i13);
        }

        public static int getScaledMinimumFlingVelocity(@NonNull ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i11, i12, i13);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                sGetScaledScrollFactorMethod = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static float getLegacyScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = sGetScaledScrollFactorMethod) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int getPlatformResId(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int getPreApi34MaximumFlingVelocityResId(Resources resources, int i11, int i12) {
        if (i11 == 4194304 && i12 == 26) {
            return getPlatformResId(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getPreApi34MinimumFlingVelocityResId(Resources resources, int i11, int i12) {
        if (i11 == 4194304 && i12 == 26) {
            return getPlatformResId(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.getScaledHorizontalScrollFactor(viewConfiguration) : getLegacyScrollFactor(viewConfiguration, context);
    }

    public static int getScaledHoverSlop(@NonNull ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.getScaledHoverSlop(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int getScaledMaximumFlingVelocity(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getScaledMaximumFlingVelocity(viewConfiguration, i11, i12, i13);
        }
        if (!isInputDeviceInfoValid(i11, i12, i13)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MaximumFlingVelocityResId = getPreApi34MaximumFlingVelocityResId(resources, i13, i12);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MaximumFlingVelocityResId, new Supplier() { // from class: androidx.core.view.h0
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int getScaledMinimumFlingVelocity(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getScaledMinimumFlingVelocity(viewConfiguration, i11, i12, i13);
        }
        if (!isInputDeviceInfoValid(i11, i12, i13)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MinimumFlingVelocityResId = getPreApi34MinimumFlingVelocityResId(resources, i13, i12);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MinimumFlingVelocityResId, new Supplier() { // from class: androidx.core.view.i0
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.getScaledVerticalScrollFactor(viewConfiguration) : getLegacyScrollFactor(viewConfiguration, context);
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(viewConfiguration);
        }
        Resources resources = context.getResources();
        int platformResId = getPlatformResId(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return platformResId != 0 && resources.getBoolean(platformResId);
    }

    private ViewConfigurationCompat() {
    }

    @ReplaceWith(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    @ReplaceWith(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    private static boolean isInputDeviceInfoValid(int i11, int i12, int i13) {
        InputDevice device = InputDevice.getDevice(i11);
        if (device != null && device.getMotionRange(i12, i13) != null) {
            return true;
        }
        return false;
    }
}
