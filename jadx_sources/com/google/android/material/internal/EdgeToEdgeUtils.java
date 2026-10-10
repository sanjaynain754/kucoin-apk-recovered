package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    public static void applyEdgeToEdge(@NonNull Window window, boolean z11) {
        applyEdgeToEdge(window, z11, null, null);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z11, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z12 = num == null || num.intValue() == 0;
        boolean z13 = num2 == null || num2.intValue() == 0;
        if (z12 || z13) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
            if (z12) {
                num = Integer.valueOf(color);
            }
            if (z13) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z11);
        int statusBarColor = getStatusBarColor(window.getContext(), z11);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z11);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }

    private static int getNavigationBarColor(Context context, boolean z11) {
        if (z11 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
        }
        if (z11) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    private static int getStatusBarColor(Context context, boolean z11) {
        if (z11) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    private EdgeToEdgeUtils() {
    }

    private static boolean isUsingLightSystemBar(int i11, boolean z11) {
        if (!MaterialColors.isColorLight(i11)) {
            if (i11 != 0 || !z11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z11) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z11);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z11) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z11);
    }
}
