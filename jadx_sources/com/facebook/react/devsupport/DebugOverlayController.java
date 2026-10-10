package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
class DebugOverlayController {

    @Nullable
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    private static boolean hasPermission(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            C45999a.m101508n(ReactConstants.TAG, "Error while retrieving package info", e11);
        }
        return false;
    }

    public void setFpsDebugViewVisible(final boolean z11) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DebugOverlayController.1
            @Override // java.lang.Runnable
            public void run() {
                if (!z11 || DebugOverlayController.this.mFPSDebugViewContainer != null) {
                    if (z11 || DebugOverlayController.this.mFPSDebugViewContainer == null) {
                        return;
                    }
                    DebugOverlayController.this.mFPSDebugViewContainer.removeAllViews();
                    DebugOverlayController.this.mWindowManager.removeView(DebugOverlayController.this.mFPSDebugViewContainer);
                    DebugOverlayController.this.mFPSDebugViewContainer = null;
                    return;
                }
                if (!DebugOverlayController.permissionCheck(DebugOverlayController.this.mReactContext)) {
                    C45999a.m101496b(ReactConstants.TAG, "Wait for overlay permission to be set");
                    return;
                }
                DebugOverlayController.this.mFPSDebugViewContainer = new FpsView(DebugOverlayController.this.mReactContext);
                DebugOverlayController.this.mWindowManager.addView(DebugOverlayController.this.mFPSDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
            }
        });
    }

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService(InterfaceC33953u5.f72199F);
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean permissionCheck(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void requestPermission(Context context) {
        if (!Settings.canDrawOverlays(context)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            C45999a.m101488I(ReactConstants.TAG, "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }
    }
}
