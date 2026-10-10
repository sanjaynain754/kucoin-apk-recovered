package com.sensorsdata.abtest.service;

import android.app.IntentService;
import android.content.Intent;
import com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper;
import com.sensorsdata.abtest.util.AlarmManagerUtils;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes23.dex */
public class GlobalLoopService extends IntentService {
    private static final String TAG = "SAB.GlobalLoopService";

    public GlobalLoopService(String str) {
        super(str);
    }

    public GlobalLoopService() {
        super("GlobalLoopService");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        SALog.m68589i(TAG, "GlobalLoopService receive");
        new SensorsABTestApiRequestHelper().requestExperimentsAndUpdateCache();
        AlarmManagerUtils.getInstance(this).setUpAlarmOnReceiver();
    }
}
