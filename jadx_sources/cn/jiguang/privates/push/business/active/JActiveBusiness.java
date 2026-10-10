package cn.jiguang.privates.push.business.active;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.DateUtil;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.cache.JPushConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JActiveBusiness {
    private static final String ACTIVE_LAUNCH = "active_launch";
    private static final String ACTIVE_TERMINATE = "active_terminate";
    private static final int APP_DURATION = 30000;
    private static final String DATE = "date";
    private static final String DURATION = "duration";
    private static final String SESSION_ID = "session_id";
    private static final String TAG = "JActiveBusiness";
    private static final String TIME = "time";
    private static volatile JActiveBusiness instance;
    private long lastToForegroundTime = 0;
    private long lastToBackgroundTime = 0;

    private String generateSession(Context context, long j11) {
        StringBuilder sb2 = new StringBuilder();
        String appKey = JGlobal.getAppKey(context);
        if (!TextUtils.isEmpty(appKey)) {
            sb2.append(appKey);
        }
        String deviceId = JGlobal.getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId)) {
            sb2.append(deviceId);
        }
        sb2.append(j11);
        return StringUtil.get32MD5String(sb2.toString());
    }

    public static JActiveBusiness getInstance() {
        if (instance == null) {
            synchronized (JActiveBusiness.class) {
                instance = new JActiveBusiness();
            }
        }
        return instance;
    }

    public void processBackground(Context context, long j11) {
        try {
            String lastLifecycleSession = JPushConfig.getLastLifecycleSession(context);
            if (TextUtils.isEmpty(lastLifecycleSession)) {
                JCommonLog.m5430d(TAG, "session is null");
                return;
            }
            long j12 = (j11 - this.lastToForegroundTime) / 1000;
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SESSION_ID, lastLifecycleSession);
            jSONObject.put(DATE, str);
            jSONObject.put("time", str2);
            jSONObject.put("duration", j12);
            JPushConfig.setLastLifecycleSessionJson(context, jSONObject.toString());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processBackground failed " + th2.getMessage());
        }
    }

    public void processForeground(Context context, long j11) {
        try {
            if (this.lastToForegroundTime == 0) {
                this.lastToBackgroundTime = JPushConfig.getLastToBackgroundTime(context);
            }
            if (j11 - this.lastToBackgroundTime < 30000) {
                return;
            }
            String lastLifecycleSessionJson = JPushConfig.getLastLifecycleSessionJson(context);
            if (!TextUtils.isEmpty(lastLifecycleSessionJson)) {
                JReporter content = new JReporter().setType("active_terminate").setContent(new JSONObject(lastLifecycleSessionJson).toString());
                Bundle bundle = new Bundle();
                bundle.putParcelable("protocol", content);
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle);
            }
            String strGenerateSession = generateSession(context, j11);
            if (TextUtils.isEmpty(strGenerateSession)) {
                JCommonLog.m5430d(TAG, "session is null");
                return;
            }
            JPushConfig.setLastLifecycleSession(context, strGenerateSession);
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SESSION_ID, strGenerateSession);
            jSONObject.put(DATE, str);
            jSONObject.put("time", str2);
            JReporter content2 = new JReporter().setType("active_launch").setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("protocol", content2);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processForeground failed " + th2.getMessage());
        }
    }

    public void toBackground(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        processBackground(context, jCurrentTimeMillis);
        this.lastToBackgroundTime = jCurrentTimeMillis;
        JPushConfig.setLastToBackgroundTime(context, jCurrentTimeMillis);
    }

    public void toForeground(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        processForeground(context, jCurrentTimeMillis);
        this.lastToForegroundTime = jCurrentTimeMillis;
        JPushConfig.setLastToForegroundTime(context, jCurrentTimeMillis);
    }
}
