package com.sensorsdata.analytics.android.sdk.dialog;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPIEmptyImplementation;
import com.sensorsdata.analytics.android.sdk.SensorsDataIgnoreTrackAppViewScreen;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;

/* JADX INFO: loaded from: classes23.dex */
@SensorsDataIgnoreTrackAppViewScreen
public class SchemeActivity extends Activity {
    private static final String TAG = "SA.SchemeActivity";
    public static boolean isPopWindow;
    private boolean isStartApp = false;

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SALog.m68589i(TAG, "onCreate");
        try {
            requestWindowFeature(1);
            setTheme(R.style.Theme.DeviceDefault.Light);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        if (SensorsDataAPI.sharedInstance() instanceof SensorsDataAPIEmptyImplementation) {
            SensorsDataDialogUtils.startLaunchActivity(this);
        } else {
            SensorsDataUtils.handleSchemeUrl(this, getIntent());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (SensorsDataAPI.sharedInstance() instanceof SensorsDataAPIEmptyImplementation) {
            SensorsDataDialogUtils.startLaunchActivity(this);
        } else {
            SensorsDataUtils.handleSchemeUrl(this, getIntent());
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        SALog.m68589i(TAG, "onPause");
        if (isPopWindow) {
            isPopWindow = false;
            this.isStartApp = true;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        SALog.m68589i(TAG, "onResume");
        if (this.isStartApp) {
            this.isStartApp = false;
            SensorsDataDialogUtils.startLaunchActivity(this);
        }
    }
}
