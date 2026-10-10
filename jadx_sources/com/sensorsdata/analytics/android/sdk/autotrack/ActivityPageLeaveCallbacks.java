package com.sensorsdata.analytics.android.sdk.autotrack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler;
import com.sensorsdata.analytics.android.sdk.autotrack.utils.AutoTrackUtils;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class ActivityPageLeaveCallbacks implements SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks, SensorsDataExceptionHandler.SAExceptionListener {
    private static final String START_TIME = "sa_start_time";
    private final HashMap<Integer, JSONObject> mResumedActivities = new HashMap<>();
    private final String DIALOG_ACTIVITY = "com.sensorsdata.sf.ui.view.DialogActivity";

    private void trackActivityStart(Activity activity) {
        try {
            if ("com.sensorsdata.sf.ui.view.DialogActivity".equals(activity.getClass().getCanonicalName())) {
                return;
            }
            JSONObject jSONObjectBuildTitleAndScreenName = AopUtil.buildTitleAndScreenName(activity);
            String screenUrl = SensorsDataUtils.getScreenUrl(activity);
            jSONObjectBuildTitleAndScreenName.put("$url", screenUrl);
            String lastScreenUrl = AutoTrackUtils.getLastScreenUrl();
            if (!TextUtils.isEmpty(lastScreenUrl)) {
                jSONObjectBuildTitleAndScreenName.put("$referrer", lastScreenUrl);
            }
            jSONObjectBuildTitleAndScreenName.put(START_TIME, SystemClock.elapsedRealtime());
            this.mResumedActivities.put(Integer.valueOf(activity.hashCode()), jSONObjectBuildTitleAndScreenName);
            AutoTrackUtils.setLastScreenUrl(screenUrl);
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler.SAExceptionListener
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            Iterator<Integer> it = this.mResumedActivities.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                next.intValue();
                JSONObject jSONObject = this.mResumedActivities.get(next);
                if (jSONObject != null) {
                    trackAppPageLeave(jSONObject);
                    it.remove();
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void trackAppPageLeave(JSONObject jSONObject) {
        try {
            long jOptLong = jSONObject.optLong(START_TIME);
            jSONObject.remove(START_TIME);
            double dDuration = TimeUtils.duration(jOptLong, SystemClock.elapsedRealtime());
            if (dDuration >= 0.05d) {
                jSONObject.put("event_duration", dDuration);
                SensorsDataAPI.sharedInstance().trackInternal("$AppPageLeave", jSONObject);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            int iHashCode = activity.hashCode();
            if (this.mResumedActivities.containsKey(Integer.valueOf(iHashCode))) {
                trackAppPageLeave(this.mResumedActivities.get(Integer.valueOf(iHashCode)));
                this.mResumedActivities.remove(Integer.valueOf(iHashCode));
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        trackActivityStart(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
