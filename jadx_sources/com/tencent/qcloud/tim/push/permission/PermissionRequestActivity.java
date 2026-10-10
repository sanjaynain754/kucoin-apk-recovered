package com.tencent.qcloud.tim.push.permission;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tuicore.util.TUIBuild;

/* JADX INFO: loaded from: classes56.dex */
public class PermissionRequestActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final String f75158a = "PermissionRequestActivity";

    /* JADX INFO: renamed from: b */
    public static final int f75159b = 101;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TIMPushLog.m77016d(f75158a, "onCreate");
        if (TUIBuild.getVersionInt() >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 101) {
            if (iArr.length > 0 && iArr[0] == 0) {
                TIMPushLog.m77016d(f75158a, "PERMISSION_GRANTED");
            } else {
                TIMPushLog.m77016d(f75158a, "PERMISSION_DENIED");
                TIMPushConfig.getInstance().setNotificationPermissionDenied(true);
            }
        }
        finish();
    }
}
