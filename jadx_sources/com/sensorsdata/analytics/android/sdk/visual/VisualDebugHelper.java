package com.sensorsdata.analytics.android.sdk.visual;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.ThreadUtils;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class VisualDebugHelper {
    private static final String TAG = "SA.VP.VisualDebugHelper";
    private JSONArray mJsonArray;
    private TrackEventAdapter mEventListener = null;
    private final Object object = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handlerEvent(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            SALog.m68589i(TAG, "handlerEvent result " + jSONObject.toString());
            if (VisualizedAutoTrackService.getInstance().isServiceRunning()) {
                VisualConfig visualConfig = VisualPropertiesManager.getInstance().getVisualConfig();
                if (visualConfig == null) {
                    return;
                }
                String strOptString = jSONObject.optString("event");
                if (!TextUtils.equals(AopConstants.APP_CLICK_EVENT_NAME, strOptString)) {
                    SALog.m68589i(TAG, "eventName is " + strOptString + " filter");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("properties");
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                String strOptString2 = jSONObjectOptJSONObject.optString(AopConstants.SCREEN_NAME);
                if (TextUtils.isEmpty(strOptString2)) {
                    SALog.m68589i(TAG, "screenName is empty and return");
                    return;
                }
                if (VisualPropertiesManager.getInstance().checkAppIdAndProject()) {
                    List<VisualConfig.VisualPropertiesConfig> list = visualConfig.events;
                    if (list != null && list.size() != 0) {
                        List<VisualConfig.VisualPropertiesConfig> matchEventConfigList = VisualPropertiesManager.getInstance().getMatchEventConfigList(list, VisualPropertiesManager.VisualEventType.getVisualEventType(strOptString), strOptString2, jSONObjectOptJSONObject.optString(AopConstants.ELEMENT_PATH), jSONObjectOptJSONObject.optString(AopConstants.ELEMENT_POSITION), jSONObjectOptJSONObject.optString(AopConstants.ELEMENT_CONTENT));
                        if (matchEventConfigList.size() > 0) {
                            synchronized (this.object) {
                                try {
                                    for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : matchEventConfigList) {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject2);
                                            jSONObject2.put("event_name", visualPropertiesConfig.eventName);
                                            if (this.mJsonArray == null) {
                                                this.mJsonArray = new JSONArray();
                                            }
                                            this.mJsonArray.put(jSONObject2);
                                        } catch (Exception e11) {
                                            SALog.printStackTrace(e11);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return;
                    }
                    SALog.m68589i(TAG, "propertiesConfigs is empty ");
                }
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public String getDebugInfo() {
        synchronized (this.object) {
            try {
                JSONArray jSONArray = this.mJsonArray;
                if (jSONArray == null) {
                    return null;
                }
                String string = jSONArray.toString();
                this.mJsonArray = null;
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void startMonitor() {
        try {
            if (this.mEventListener == null) {
                final ExecutorService singlePool = ThreadUtils.getSinglePool();
                this.mEventListener = new TrackEventAdapter() { // from class: com.sensorsdata.analytics.android.sdk.visual.VisualDebugHelper.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
                    public void trackEvent(final JSONObject jSONObject) {
                        singlePool.execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.VisualDebugHelper.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                VisualDebugHelper.this.handlerEvent(jSONObject);
                            }
                        });
                    }
                };
            }
            SensorsDataAPI.sharedInstance().addEventListener(this.mEventListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void stopMonitor() {
        try {
            if (this.mEventListener != null) {
                SensorsDataAPI.sharedInstance().removeEventListener(this.mEventListener);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static abstract class TrackEventAdapter implements SAEventListener {
        private TrackEventAdapter() {
        }

        @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
        public void identify() {
        }

        @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
        public void login() {
        }

        @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
        public void logout() {
        }

        @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
        public void resetAnonymousId() {
        }
    }
}
