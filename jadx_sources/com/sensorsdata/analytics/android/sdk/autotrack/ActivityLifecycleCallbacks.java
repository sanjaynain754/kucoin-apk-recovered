package com.sensorsdata.analytics.android.sdk.autotrack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstDay;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstStart;
import com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkManager;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import com.sensorsdata.analytics.android.sdk.visual.HeatMapService;
import com.sensorsdata.analytics.android.sdk.visual.VisualizedAutoTrackService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class ActivityLifecycleCallbacks implements SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks, SensorsDataExceptionHandler.SAExceptionListener {
    private static final String APP_VERSION = "$app_version";
    private static final String EVENT_TIMER = "event_timer";
    private static final String LIB_VERSION = "$lib_version";
    private static final String TAG = "SA.ActivityLifecycleCallbacks";
    private static final int TIME_INTERVAL = 2000;
    private static final String TRACK_TIMER = "track_timer";
    private final Context mContext;
    private final PersistentFirstDay mFirstDay;
    private final PersistentFirstStart mFirstStart;
    private Handler mHandler;
    private final SensorsDataAPI mSensorsDataInstance;
    private int mStartActivityCount;
    private int mStartTimerCount;
    private boolean resumeFromBackground = false;
    private JSONObject activityProperty = new JSONObject();
    private final JSONObject endDataProperty = new JSONObject();
    private JSONObject mDeepLinkProperty = new JSONObject();
    private final String APP_START_TIME = "app_start_time";
    private final String APP_END_TIME = "app_end_time";
    private final String APP_END_MESSAGE_TIME = "app_end_message_time";
    private final String APP_END_DATA = "app_end_data";
    private final String APP_RESET_STATE = "app_reset_state";
    private final String TIME = "time";
    private final String ELAPSE_TIME = "elapse_time";
    private long messageReceiveTime = 0;
    private final int MESSAGE_CODE_APP_END = 0;
    private final int MESSAGE_CODE_START = 100;
    private final int MESSAGE_CODE_STOP = 200;
    private final int MESSAGE_CODE_TIMER = 300;
    private final DbAdapter mDbAdapter = DbAdapter.getInstance();
    private boolean mDataCollectState = AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable();

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStartedMessage(Message message) {
        boolean z11 = false;
        try {
            int activityCount = this.mDbAdapter.getActivityCount();
            DbAdapter dbAdapter = this.mDbAdapter;
            int i11 = activityCount + 1;
            this.mStartActivityCount = i11;
            dbAdapter.commitActivityCount(i11);
            if (this.mStartActivityCount == 1) {
                if (AbstractSensorsDataAPI.getConfigOptions().isSaveDeepLinkInfo()) {
                    SensorsDataUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), this.endDataProperty);
                }
                this.mHandler.removeMessages(0);
                boolean zIsSessionTimeOut = isSessionTimeOut();
                if (zIsSessionTimeOut) {
                    try {
                        this.mHandler.sendMessage(obtainAppEndMessage(false));
                        checkFirstDay();
                        boolean zBooleanValue = this.mFirstStart.get().booleanValue();
                        try {
                            this.mSensorsDataInstance.appBecomeActive();
                            if (this.resumeFromBackground) {
                                this.mSensorsDataInstance.getRemoteManager().applySDKConfigFromCache();
                                this.mSensorsDataInstance.resumeTrackScreenOrientation();
                            }
                            this.mSensorsDataInstance.getRemoteManager().pullSDKConfigFromServer();
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                        }
                        Bundle data = message.getData();
                        try {
                            if (this.mSensorsDataInstance.isAutoTrackEnabled() && !this.mSensorsDataInstance.isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_START)) {
                                if (zBooleanValue) {
                                    this.mFirstStart.commit(Boolean.FALSE);
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("$resume_from_background", this.resumeFromBackground);
                                jSONObject.put("$is_first_time", zBooleanValue);
                                SensorsDataUtils.mergeJSONObject(this.activityProperty, jSONObject);
                                JSONObject jSONObject2 = this.mDeepLinkProperty;
                                if (jSONObject2 != null) {
                                    SensorsDataUtils.mergeJSONObject(jSONObject2, jSONObject);
                                    this.mDeepLinkProperty = null;
                                }
                                long jCurrentTimeMillis = data.getLong("time");
                                if (jCurrentTimeMillis <= 0) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                jSONObject.put("event_time", jCurrentTimeMillis);
                                this.mSensorsDataInstance.trackAutoEvent("$AppStart", jSONObject);
                                SensorsDataAPI.sharedInstance().flush();
                            }
                        } catch (Exception e12) {
                            SALog.m68591i(TAG, e12);
                        }
                        long jElapsedRealtime = data.getLong("elapse_time");
                        try {
                            this.mDbAdapter.commitAppStartTime(jElapsedRealtime > 0 ? jElapsedRealtime : SystemClock.elapsedRealtime());
                        } catch (Exception unused) {
                            DbAdapter dbAdapter2 = this.mDbAdapter;
                            if (jElapsedRealtime <= 0) {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                            }
                            dbAdapter2.commitAppStartTime(jElapsedRealtime);
                        }
                        if (this.resumeFromBackground) {
                            try {
                                HeatMapService.getInstance().resume();
                                VisualizedAutoTrackService.getInstance().resume();
                            } catch (Exception e13) {
                                SALog.printStackTrace(e13);
                            }
                        }
                        this.resumeFromBackground = true;
                    } catch (Exception e14) {
                        e = e14;
                        z11 = zIsSessionTimeOut;
                        SALog.printStackTrace(e);
                        if (z11) {
                            this.mDbAdapter.commitAppStartTime(SystemClock.elapsedRealtime());
                        }
                    }
                }
            }
        } catch (Exception e15) {
            e = e15;
        }
        try {
            int i12 = this.mStartTimerCount;
            this.mStartTimerCount = i12 + 1;
            if (i12 == 0) {
                this.mHandler.sendEmptyMessage(300);
            }
        } catch (Exception e16) {
            SALog.printStackTrace(e16);
        }
    }

    private void checkFirstDay() {
        if (this.mFirstDay.get() == null && AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable()) {
            this.mFirstDay.commit(TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void generateAppEndData(long j11, long j12) {
        try {
            if (this.mDataCollectState || this.mSensorsDataInstance.getSAContextManager().isAppStartSuccess()) {
                this.mDataCollectState = true;
                if (AbstractSensorsDataAPI.getConfigOptions().isDataCollectEnable()) {
                    if (j11 == 0) {
                        j11 = System.currentTimeMillis();
                    }
                    JSONObject jSONObject = this.endDataProperty;
                    if (j12 == 0) {
                        j12 = SystemClock.elapsedRealtime();
                    }
                    jSONObject.put(EVENT_TIMER, j12);
                    this.endDataProperty.put(TRACK_TIMER, j11);
                    this.endDataProperty.put(APP_VERSION, AppInfoUtils.getAppVersionName(this.mContext));
                    this.endDataProperty.put(LIB_VERSION, SensorsDataAPI.sharedInstance().getSDKVersion());
                    ChannelUtils.mergeUtmToEndData(ChannelUtils.getLatestUtmProperties(), this.endDataProperty);
                    this.mDbAdapter.commitAppEndData(this.endDataProperty.toString());
                    this.mDbAdapter.commitAppEndTime(j11);
                }
            }
        } catch (Throwable th2) {
            SALog.m68587d(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStoppedMessage(Message message) {
        try {
            int i11 = this.mStartTimerCount - 1;
            this.mStartTimerCount = i11;
            int i12 = 0;
            if (i11 <= 0) {
                this.mHandler.removeMessages(300);
                this.mStartTimerCount = 0;
            }
            int activityCount = this.mDbAdapter.getActivityCount();
            this.mStartActivityCount = activityCount;
            if (activityCount > 0) {
                i12 = activityCount - 1;
                this.mStartActivityCount = i12;
            }
            this.mStartActivityCount = i12;
            this.mDbAdapter.commitActivityCount(i12);
            if (this.mStartActivityCount <= 0) {
                this.mSensorsDataInstance.flush();
                Bundle data = message.getData();
                generateAppEndData(data.getLong("time"), data.getLong("elapse_time"));
                this.mHandler.sendMessageDelayed(obtainAppEndMessage(true), this.mSensorsDataInstance.getSessionIntervalTime());
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void initHandler() {
        try {
            HandlerThread handlerThread = new HandlerThread("SENSORS_DATA_THREAD");
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper()) { // from class: com.sensorsdata.analytics.android.sdk.autotrack.ActivityLifecycleCallbacks.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i11 = message.what;
                    if (i11 != 0) {
                        if (i11 == 100) {
                            ActivityLifecycleCallbacks.this.handleStartedMessage(message);
                            return;
                        }
                        if (i11 == 200) {
                            ActivityLifecycleCallbacks.this.handleStoppedMessage(message);
                            return;
                        }
                        if (i11 != 300) {
                            return;
                        }
                        if (ActivityLifecycleCallbacks.this.mSensorsDataInstance.isAutoTrackEnabled() && ActivityLifecycleCallbacks.this.isAutoTrackAppEnd()) {
                            ActivityLifecycleCallbacks.this.generateAppEndData(0L, 0L);
                        }
                        if (ActivityLifecycleCallbacks.this.mStartTimerCount > 0) {
                            ActivityLifecycleCallbacks.this.mHandler.sendEmptyMessageDelayed(300, 2000L);
                            return;
                        }
                        return;
                    }
                    if (ActivityLifecycleCallbacks.this.messageReceiveTime != 0 && SystemClock.elapsedRealtime() - ActivityLifecycleCallbacks.this.messageReceiveTime < ActivityLifecycleCallbacks.this.mSensorsDataInstance.getSessionIntervalTime()) {
                        SALog.m68589i(ActivityLifecycleCallbacks.TAG, "$AppEnd 事件已触发。");
                        return;
                    }
                    ActivityLifecycleCallbacks.this.messageReceiveTime = SystemClock.elapsedRealtime();
                    Bundle data = message.getData();
                    long j11 = data.getLong("app_start_time");
                    long j12 = data.getLong("app_end_time");
                    String string = data.getString("app_end_data");
                    if (!data.getBoolean("app_reset_state")) {
                        ActivityLifecycleCallbacks.this.trackAppEnd(j11, j12 == 0 ? data.getLong("app_end_message_time") : j12 + 2000, string);
                        return;
                    }
                    ActivityLifecycleCallbacks.this.resetState();
                    if (DbAdapter.getInstance().getActivityCount() <= 0) {
                        ActivityLifecycleCallbacks.this.trackAppEnd(j11, j12, string);
                    }
                }
            };
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAutoTrackAppEnd() {
        return !this.mSensorsDataInstance.isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_END);
    }

    private boolean isDeepLinkParseSuccess(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (intent != null && intent.getData() != null && !intent.getBooleanExtra(DeepLinkManager.IS_ANALYTICS_DEEPLINK, false) && DeepLinkManager.parseDeepLink(activity, AbstractSensorsDataAPI.getConfigOptions().isSaveDeepLinkInfo(), this.mSensorsDataInstance.getDeepLinkCallback())) {
                intent.putExtra(DeepLinkManager.IS_ANALYTICS_DEEPLINK, true);
                return true;
            }
        } catch (Throwable th2) {
            SALog.m68589i(TAG, th2.getMessage());
        }
        return false;
    }

    private Message obtainAppEndMessage(boolean z11) {
        Message messageObtain = Message.obtain(this.mHandler);
        messageObtain.what = 0;
        Bundle bundle = new Bundle();
        bundle.putLong("app_start_time", DbAdapter.getInstance().getAppStartTime());
        bundle.putLong("app_end_time", DbAdapter.getInstance().getAppEndTime());
        bundle.putString("app_end_data", DbAdapter.getInstance().getAppEndData());
        bundle.putLong("app_end_message_time", System.currentTimeMillis());
        bundle.putBoolean("app_reset_state", z11);
        messageObtain.setData(bundle);
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetState() {
        try {
            this.mSensorsDataInstance.stopTrackScreenOrientation();
            this.mSensorsDataInstance.getRemoteManager().resetPullSDKConfigTimer();
            HeatMapService.getInstance().stop();
            VisualizedAutoTrackService.getInstance().stop();
            this.mSensorsDataInstance.appEnterBackground();
            this.resumeFromBackground = true;
            this.mSensorsDataInstance.clearLastScreenUrl();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void sendActivityHandleMessage(int i11) {
        Message messageObtainMessage = this.mHandler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putLong("time", System.currentTimeMillis());
        bundle.putLong("elapse_time", SystemClock.elapsedRealtime());
        messageObtainMessage.what = i11;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAppEnd(long j11, long j12, String str) {
        try {
            if (this.mSensorsDataInstance.isAutoTrackEnabled() && isAutoTrackAppEnd() && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                long jOptLong = jSONObject.optLong(EVENT_TIMER);
                long jOptLong2 = jSONObject.optLong(TRACK_TIMER);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AopConstants.SCREEN_NAME, jSONObject.optString(AopConstants.SCREEN_NAME));
                jSONObject2.put(AopConstants.TITLE, jSONObject.optString(AopConstants.TITLE));
                jSONObject2.put(LIB_VERSION, jSONObject.optString(LIB_VERSION));
                jSONObject2.put(APP_VERSION, jSONObject.optString(APP_VERSION));
                if (j11 > 0) {
                    jSONObject2.put("event_duration", TimeUtils.duration(j11, jOptLong));
                }
                if (jOptLong2 != 0) {
                    j12 = jOptLong2;
                }
                jSONObject2.put("event_time", j12);
                ChannelUtils.mergeUtmToEndData(jSONObject, jSONObject2);
                this.mSensorsDataInstance.trackAutoEvent("$AppEnd", jSONObject2);
                this.mDbAdapter.commitAppEndData("");
                this.mSensorsDataInstance.flush();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public ActivityLifecycleCallbacks(SensorsDataAPI sensorsDataAPI, PersistentFirstStart persistentFirstStart, PersistentFirstDay persistentFirstDay, Context context) {
        this.mSensorsDataInstance = sensorsDataAPI;
        this.mFirstStart = persistentFirstStart;
        this.mFirstDay = persistentFirstDay;
        this.mContext = context;
        initHandler();
    }

    private void buildScreenProperties(Activity activity) {
        JSONObject jSONObjectBuildTitleNoAutoTrackerProperties = AopUtil.buildTitleNoAutoTrackerProperties(activity);
        this.activityProperty = jSONObjectBuildTitleNoAutoTrackerProperties;
        SensorsDataUtils.mergeJSONObject(jSONObjectBuildTitleNoAutoTrackerProperties, this.endDataProperty);
        if (!AbstractSensorsDataAPI.getConfigOptions().isDisableSDK() && isDeepLinkParseSuccess(activity)) {
            ChannelUtils.removeDeepLinkInfo(this.endDataProperty);
            if (this.mDeepLinkProperty == null) {
                this.mDeepLinkProperty = new JSONObject();
            }
            DeepLinkManager.mergeDeepLinkProperty(this.mDeepLinkProperty);
        }
    }

    private boolean isSessionTimeOut() {
        long appEndTime;
        boolean z11;
        long jMax = Math.max(System.currentTimeMillis(), 946656000000L);
        long j11 = 0;
        try {
            String appEndData = DbAdapter.getInstance().getAppEndData();
            if (!TextUtils.isEmpty(appEndData)) {
                appEndTime = new JSONObject(appEndData).optLong(TRACK_TIMER);
            } else {
                appEndTime = 0;
            }
            if (appEndTime == 0) {
                try {
                    appEndTime = this.mDbAdapter.getAppEndTime();
                } catch (Exception e11) {
                    long j12 = appEndTime;
                    e = e11;
                    j11 = j12;
                    SALog.printStackTrace(e);
                    appEndTime = j11;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (Math.abs(jMax - appEndTime) > this.mSensorsDataInstance.getSessionIntervalTime()) {
            z11 = true;
        } else {
            z11 = false;
        }
        SALog.m68587d(TAG, "SessionTimeOut:" + z11);
        return z11;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!SensorsDataDialogUtils.isSchemeActivity(activity)) {
            SensorsDataUtils.handleSchemeUrl(activity, activity.getIntent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        JSONObject trackProperties;
        try {
            buildScreenProperties(activity);
            if (this.mSensorsDataInstance.isAutoTrackEnabled() && !this.mSensorsDataInstance.isActivityAutoTrackAppViewScreenIgnored(activity.getClass()) && !this.mSensorsDataInstance.isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN)) {
                JSONObject jSONObject = new JSONObject();
                SensorsDataUtils.mergeJSONObject(this.activityProperty, jSONObject);
                if ((activity instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) activity).getTrackProperties()) != null) {
                    SensorsDataUtils.mergeJSONObject(trackProperties, jSONObject);
                }
                DeepLinkManager.mergeDeepLinkProperty(jSONObject);
                DeepLinkManager.resetDeepLinkProcessor();
                this.mSensorsDataInstance.trackViewScreen(SensorsDataUtils.getScreenUrl(activity), SADataHelper.appendLibMethodAutoTrack(jSONObject));
            }
        } catch (Throwable th2) {
            SALog.m68591i(TAG, th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!SensorsDataDialogUtils.isSchemeActivity(activity)) {
            if (this.mStartActivityCount == 0) {
                buildScreenProperties(activity);
            }
            sendActivityHandleMessage(100);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (!SensorsDataDialogUtils.isSchemeActivity(activity)) {
            sendActivityHandleMessage(200);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataExceptionHandler.SAExceptionListener
    public void uncaughtException(Thread thread, Throwable th2) {
        if (TextUtils.isEmpty(DbAdapter.getInstance().getAppEndData())) {
            DbAdapter.getInstance().commitAppStartTime(SystemClock.elapsedRealtime());
        } else {
            DbAdapter.getInstance().commitAppEndTime(System.currentTimeMillis());
        }
        if (AbstractSensorsDataAPI.getConfigOptions().isMultiProcessFlush()) {
            DbAdapter.getInstance().commitSubProcessFlushState(false);
        }
        DbAdapter.getInstance().commitActivityCount(0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
