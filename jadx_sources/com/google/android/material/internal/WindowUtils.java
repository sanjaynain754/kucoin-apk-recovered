package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.tencent.bugly.proguard.InterfaceC33953u5;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WindowUtils {

    public static class Api17Impl {
        private Api17Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @RequiresApi(api = 30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private WindowUtils() {
    }

    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getCurrentWindowBounds(windowManager);
        }
        return Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
