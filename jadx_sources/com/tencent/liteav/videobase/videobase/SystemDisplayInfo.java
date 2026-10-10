package com.tencent.liteav.videobase.videobase;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34745j;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class SystemDisplayInfo {
    private static final String TAG = "SystemDisplayInfo";

    private static Display getDefaultDisplayByWindowManager() {
        return getDefaultDisplayByWindowManager(ContextUtils.getApplicationContext());
    }

    private static native synchronized int nativeGetDisplayRotationCorrection();

    private static native synchronized int nativeGetDisplayRotationObtainMethod();

    private static EnumC34747l surfaceRotationEnumToRotation(int i11) {
        if (i11 == 1) {
            return EnumC34747l.ROTATION_90;
        }
        if (i11 != 2) {
            return i11 != 3 ? EnumC34747l.NORMAL : EnumC34747l.ROTATION_270;
        }
        return EnumC34747l.ROTATION_180;
    }

    private static Display getDefaultDisplayByWindowManager(Context context) {
        if (context == null) {
            LiteavLog.m76083e(TAG, "context is null.");
            return null;
        }
        try {
            return ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay();
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "error getting display from window service.", th2);
            return null;
        }
    }

    public static Display getDisplay() {
        if (nativeGetDisplayRotationObtainMethod() == 0) {
            return getDisplayByDisplayManager();
        }
        Display defaultDisplayByWindowManager = getDefaultDisplayByWindowManager();
        if (defaultDisplayByWindowManager != null) {
            return defaultDisplayByWindowManager;
        }
        return getDisplayByDisplayManager();
    }

    private static Display getDisplayByDisplayManager() {
        Context contextM76127c = C34745j.m76118a().m76127c();
        if (contextM76127c == null) {
            contextM76127c = ContextUtils.getApplicationContext();
        }
        if (contextM76127c == null) {
            LiteavLog.m76083e(TAG, "context is null.");
            return null;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 32) {
            return getDefaultDisplayByWindowManager(contextM76127c);
        }
        try {
            return ((DisplayManager) contextM76127c.getSystemService("display")).getDisplay(0);
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "error getting display from display service.", th2);
            return getDefaultDisplayByWindowManager(contextM76127c);
        }
    }

    public static EnumC34747l getDisplayRotation() {
        EnumC34747l displayRotationCorrection = getDisplayRotationCorrection();
        if (displayRotationCorrection != null) {
            return displayRotationCorrection;
        }
        try {
            Display display = getDisplay();
            if (display != null) {
                return surfaceRotationEnumToRotation(display.getRotation());
            }
        } catch (Exception e11) {
            LiteavLog.m76084e(TAG, "error getting display rotation.", e11);
        }
        return EnumC34747l.NORMAL;
    }

    private static EnumC34747l getDisplayRotationCorrection() {
        int iNativeGetDisplayRotationCorrection = nativeGetDisplayRotationCorrection();
        if (EnumC34747l.m76132b(iNativeGetDisplayRotationCorrection)) {
            return EnumC34747l.m76131a(iNativeGetDisplayRotationCorrection);
        }
        return null;
    }

    public static int getDisplayRotationDegree() {
        return getDisplayRotation().mValue;
    }

    public static Size getDisplaySize() {
        try {
            Display display = getDisplay();
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (Exception e11) {
            LiteavLog.m76084e(TAG, "error getting display size.", e11);
        }
        return new Size(720, 1280);
    }
}
