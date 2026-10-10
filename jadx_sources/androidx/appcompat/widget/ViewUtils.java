package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ViewUtils {

    @ChecksSdkIntAtLeast(api = 27)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE;
    private static final String TAG = "ViewUtils";
    private static Method sComputeFitSystemWindowsMethod;
    private static boolean sInitComputeFitSystemWindowsMethod;

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static void computeFitSystemWindows(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }

        private Api29Impl() {
        }
    }

    static {
        SDK_LEVEL_SUPPORTS_AUTOSIZE = Build.VERSION.SDK_INT >= 27;
    }

    public static void computeFitSystemWindows(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.computeFitSystemWindows(view, rect, rect2);
            return;
        }
        if (!sInitComputeFitSystemWindowsMethod) {
            sInitComputeFitSystemWindowsMethod = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                sComputeFitSystemWindowsMethod = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    sComputeFitSystemWindowsMethod.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d(TAG, "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = sComputeFitSystemWindowsMethod;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e11) {
                Log.d(TAG, "Could not invoke computeFitSystemWindows", e11);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void makeOptionalFitsSystemWindows(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e11) {
            Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e11);
        } catch (NoSuchMethodException unused) {
            Log.d(TAG, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e12) {
            Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e12);
        }
    }

    private ViewUtils() {
    }

    public static boolean isLayoutRtl(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
