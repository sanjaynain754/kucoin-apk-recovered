package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;

/* JADX INFO: renamed from: com.blankj.utilcode.util.e0 */
/* JADX INFO: compiled from: ScreenUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5267e0 {
    /* JADX INFO: renamed from: a */
    public static int m6179a() {
        WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* JADX INFO: renamed from: b */
    public static int m6180b() {
        WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    /* JADX INFO: renamed from: c */
    public static float m6181c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static int m6182d() {
        WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    /* JADX INFO: renamed from: e */
    public static int m6183e() {
        WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6184f() {
        if (C5287o0.m6331a().getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }
}
