package com.tencent.liteav.audio2.permission;

import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class PermissionRequesterAndroid extends PermissionActivity.AbstractC34682a {
    private static final String TAG = "PermissionRequesterAndroid";
    private static final List<String> mRequestedPermissions = new ArrayList();
    private final long mNativePermissionRequesterAndroid;

    private void handleRequestPermissionsResult(String[] strArr) {
        for (String str : strArr) {
            nativeNotifyPermissionsResultFromJava(this.mNativePermissionRequesterAndroid, hasPermission(str));
        }
    }

    private static native void nativeNotifyPermissionsResultFromJava(long j11, boolean z11);

    public void requestPermission(String str) {
        if (str == null || str.isEmpty()) {
            Log.m76036w(TAG, "request permission is null.", new Object[0]);
            return;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            handleRequestPermissionsResult(new String[]{str});
            return;
        }
        List<String> list = mRequestedPermissions;
        if (list.contains(str)) {
            handleRequestPermissionsResult((String[]) list.toArray(new String[0]));
        } else {
            PermissionActivity.m76020a(ContextUtils.getApplicationContext(), new String[]{str}, this);
        }
    }

    private boolean hasPermission(String str) {
        if (str == null || str.isEmpty()) {
            Log.m76036w(TAG, "check permission is null.", new Object[0]);
            return true;
        }
        try {
            return LiteavSystemInfo.getSystemOSVersionInt() < 23 || ContextUtils.getApplicationContext().checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th2) {
            Log.m76033e(TAG, "check permission exception, " + th2.getMessage(), new Object[0]);
            return true;
        }
    }

    public PermissionRequesterAndroid(long j11) {
        this.mNativePermissionRequesterAndroid = j11;
    }

    @Override // com.tencent.liteav.audio2.permission.PermissionActivity.AbstractC34682a
    public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        handleRequestPermissionsResult(strArr);
        for (String str : strArr) {
            List<String> list = mRequestedPermissions;
            if (!list.contains(str)) {
                list.add(str);
            }
        }
    }
}
