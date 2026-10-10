package com.tencent.liteav.audio2.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34745j;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class PermissionActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private static final Map<PermissionActivity, AbstractC34682a> f73362a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m76020a(Context context, String[] strArr, AbstractC34682a abstractC34682a) {
        try {
            Intent intent = new Intent(context, (Class<?>) PermissionActivity.class);
            intent.putExtra("KEY_PERMISSIONS", strArr);
            intent.putExtra("KEY_CALLBACK", abstractC34682a);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th2) {
            Log.m76033e("PermissionActivity", "start activity failed. ".concat(String.valueOf(th2)), new Object[0]);
            try {
                Activity activityM76127c = C34745j.m76118a().m76127c();
                if (activityM76127c != null) {
                    activityM76127c.requestPermissions(strArr, 1000);
                    abstractC34682a.onRequestPermissionsResult(strArr, new int[1]);
                }
            } catch (Throwable th3) {
                Log.m76033e("PermissionActivity", "requestPermissions failed. ".concat(String.valueOf(th3)), new Object[0]);
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC34682a abstractC34682a = f73362a.get(this);
        if (abstractC34682a == null) {
            return;
        }
        abstractC34682a.onRequestPermissionsResult(strArr, iArr);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        try {
            Intent intent = getIntent();
            f73362a.put(this, (AbstractC34682a) intent.getSerializableExtra("KEY_CALLBACK"));
            String[] stringArrayExtra = intent.getStringArrayExtra("KEY_PERMISSIONS");
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
                requestPermissions(stringArrayExtra, 1000);
            }
        } catch (Throwable th2) {
            Log.m76033e("PermissionActivity", "requestPermissions failed. ".concat(String.valueOf(th2)), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.permission.PermissionActivity$a */
    public static abstract class AbstractC34682a implements Serializable {
        public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        }
    }
}
