package com.facebook.react.views.view;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\n"}, m90084d2 = {"setStatusBarTranslucency", "", "Landroid/view/Window;", "isTranslucent", "", "setStatusBarVisibility", "isHidden", "statusBarHide", "statusBarShow", "setSystemBarsTranslucency", "ReactAndroid_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class WindowUtilKt {
    public static final void setStatusBarTranslucency(@NotNull Window window, boolean z11) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z11) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.g
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        ViewCompat.requestApplyInsets(window.getDecorView());
    }

    public static final void setStatusBarVisibility(@NotNull Window window, boolean z11) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z11) {
            statusBarHide(window);
        } else {
            statusBarShow(window);
        }
    }

    public static final void setSystemBarsTranslucency(@NotNull Window window, boolean z11) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowCompat.setDecorFitsSystemWindows(window, !z11);
        if (z11) {
            int iArgb = 0;
            boolean z12 = (window.getContext().getResources().getConfiguration().uiMode & 48) == 32;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(true);
            }
            window.setStatusBarColor(0);
            if (i11 < 29) {
                iArgb = (i11 < 27 || z12) ? Color.argb(128, 27, 27, 27) : Color.argb(230, 255, 255, 255);
            }
            window.setNavigationBarColor(iArgb);
            new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightNavigationBars(!z12);
            if (i11 >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = i11 >= 30 ? 3 : 1;
            }
        }
    }

    private static final void statusBarHide(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            window.setDecorFitsSystemWindows(false);
        }
        window.addFlags(1024);
        window.clearFlags(2048);
    }

    private static final void statusBarShow(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 0;
            window.setDecorFitsSystemWindows(true);
        }
        window.addFlags(2048);
        window.clearFlags(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setStatusBarTranslucency$lambda$0(View v11, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = v11.onApplyWindowInsets(insets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
