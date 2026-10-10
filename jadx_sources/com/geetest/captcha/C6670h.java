package com.geetest.captcha;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.h */
/* JADX INFO: loaded from: classes45.dex */
public final class C6670h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static C6705y m12541a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new C6705y(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
            return new C6705y(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
        }
        WindowMetrics maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "windowManager.maximumWindowMetrics");
        Rect bounds = maximumWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
        return new C6705y(bounds.width(), bounds.height());
    }
}
