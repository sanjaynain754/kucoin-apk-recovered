package com.sensorsdata.analytics.android.sdk.autotrack;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler;
import com.sensorsdata.analytics.android.sdk.autotrack.utils.AutoTrackUtils;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class FragmentPageLeaveCallbacks implements SAFragmentLifecycleCallbacks, SensorsDataExceptionHandler.SAExceptionListener {
    private static final String START_TIME = "sa_start_time";
    private final HashMap<Integer, JSONObject> mResumedFragments = new HashMap<>();

    private void trackFragmentStart(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(START_TIME, SystemClock.elapsedRealtime());
            String screenUrl = SensorsDataUtils.getScreenUrl(obj);
            jSONObject.put("$url", screenUrl);
            String lastScreenUrl = AutoTrackUtils.getLastScreenUrl();
            if (!TextUtils.isEmpty(lastScreenUrl)) {
                jSONObject.put("$referrer", lastScreenUrl);
            }
            AopUtil.getScreenNameAndTitleFromFragment(jSONObject, obj, null);
            this.mResumedFragments.put(Integer.valueOf(obj.hashCode()), jSONObject);
            AutoTrackUtils.setLastScreenUrl(screenUrl);
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler.SAExceptionListener
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            Iterator<Integer> it = this.mResumedFragments.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                next.intValue();
                JSONObject jSONObject = this.mResumedFragments.get(next);
                if (jSONObject != null) {
                    trackPageLeaveEvent(jSONObject);
                    it.remove();
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void trackAppPageLeave(Object obj) {
        try {
            int iHashCode = obj.hashCode();
            if (this.mResumedFragments.containsKey(Integer.valueOf(iHashCode))) {
                JSONObject jSONObject = this.mResumedFragments.get(Integer.valueOf(iHashCode));
                this.mResumedFragments.remove(Integer.valueOf(iHashCode));
                if (jSONObject != null) {
                    trackPageLeaveEvent(jSONObject);
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void trackPageLeaveEvent(JSONObject jSONObject) {
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

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onHiddenChanged(Object obj, boolean z11) {
        if (SAFragmentUtils.isFragmentVisible(obj)) {
            trackFragmentStart(obj);
        } else {
            trackAppPageLeave(obj);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onPause(Object obj) {
        try {
            if (this.mResumedFragments.containsKey(Integer.valueOf(obj.hashCode()))) {
                trackAppPageLeave(obj);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onResume(Object obj) {
        if (SAFragmentUtils.isFragmentVisible(obj)) {
            trackFragmentStart(obj);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void setUserVisibleHint(Object obj, boolean z11) {
        if (SAFragmentUtils.isFragmentVisible(obj)) {
            trackFragmentStart(obj);
        } else {
            trackAppPageLeave(obj);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onCreate(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onStart(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onStop(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onViewCreated(Object obj, View view, Bundle bundle) {
    }
}
