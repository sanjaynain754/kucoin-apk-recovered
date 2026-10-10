package cn.jiguang.privates.analysis.business.active;

import android.content.Context;
import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.analysis.business.report.JReportBusiness;
import cn.jiguang.privates.analysis.cache.JAnalysisConfig;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.DateUtil;
import cn.jiguang.privates.common.utils.StringUtil;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JActiveBusiness {
    private static final int APP_DURATION = 30000;
    private static final String DATE = "date";
    private static final String DURATION = "duration";
    private static final int FIRST_LAUNCH = 0;
    private static final int FIRST_TIME = 1;
    private static final String KEY_FIRST_TIME = "fir_t";
    private static final String KEY_LAUNCH_TIME = "launch_t";
    private static final int NOT_FIRST_LAUNCH = 1;
    private static final int NOT_FIRST_TIME = 0;
    private static final String SESSION_ID = "session_id";
    private static final String TAG = "JActiveBusiness";
    private static final String TIME = "time";
    private static volatile JActiveBusiness instance;
    private boolean firstLaunch = true;
    private long lastToForegroundTime = 0;
    private long lastToBackgroundTime = 0;

    private Event convertToEvent(JSONObject jSONObject) {
        Event event = new Event("active");
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals(next, "type") && !TextUtils.equals(next, "itime") && !TextUtils.equals(next, JReportBusiness.KEY_RANDOM_ID) && !TextUtils.equals(next, "account_id")) {
                    event.putExtraAttr(next, JAnalyticsHelper.cutoutValue(jSONObject.opt(next)));
                }
            }
        }
        return event;
    }

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

    public void init(Context context) {
        try {
            String activeCommonJson = JAnalysisConfig.getActiveCommonJson(context);
            String activeEventJson = JAnalysisConfig.getActiveEventJson(context);
            if (!TextUtils.isEmpty(activeCommonJson) && !TextUtils.isEmpty(activeEventJson)) {
                JCommonLog.m5430d(TAG, "there are cache active json");
                JReportBusiness.getInstance().report(context, new JSONObject(activeCommonJson));
                JReportBusiness.getInstance().report(context, new JSONObject(activeEventJson));
                return;
            }
            JCommonLog.m5430d(TAG, "there are no cache active json");
            JSONObject deviceInfo = JAnalyticsHelper.getDeviceInfo(context);
            JSONObject jSONObjectPrepareReportJson = JReportBusiness.getInstance().prepareReportJson(context, "active", deviceInfo);
            JAnalysisConfig.setActiveCommonJson(context, jSONObjectPrepareReportJson.toString());
            JReportBusiness.getInstance().report(context, jSONObjectPrepareReportJson);
            JSONObject jSONObjectPackageJson = JEventBusiness.getInstance().packageJson(context, convertToEvent(deviceInfo));
            JAnalysisConfig.setActiveEventJson(context, jSONObjectPackageJson.toString());
            JReportBusiness.getInstance().report(context, jSONObjectPackageJson);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "init failed " + th2.getMessage());
        }
    }

    public void processBackground(Context context, long j11) {
        try {
            String lastSession = JAnalysisConfig.getLastSession(context);
            if (TextUtils.isEmpty(lastSession)) {
                JCommonLog.m5430d(TAG, "session is null");
                return;
            }
            long j12 = (j11 - this.lastToForegroundTime) / 1000;
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SESSION_ID, lastSession);
            jSONObject.put(DATE, str);
            jSONObject.put("time", str2);
            jSONObject.put("duration", j12);
            JAnalysisConfig.setLastSessionJson(context, jSONObject.toString());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processBackground failed " + th2.getMessage());
        }
    }

    public void processForeground(Context context, long j11) {
        try {
            if (this.lastToForegroundTime == 0) {
                this.lastToBackgroundTime = JAnalysisConfig.getLastToBackgroundTime(context);
            }
            if (j11 - this.lastToBackgroundTime < 30000) {
                return;
            }
            String lastSessionJson = JAnalysisConfig.getLastSessionJson(context);
            if (!TextUtils.isEmpty(lastSessionJson)) {
                JSONObject jSONObject = new JSONObject(lastSessionJson);
                Event event = new Event(JAnalysisConstants.TYPE_ACTIVE_TERMINATE);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    event.putExtraAttr(next, jSONObject.opt(next));
                }
                JEventBusiness.getInstance().onEvent(context, event);
            }
            String strGenerateSession = generateSession(context, j11);
            if (TextUtils.isEmpty(strGenerateSession)) {
                JCommonLog.m5430d(TAG, "session is null");
                return;
            }
            JAnalysisConfig.setLastSession(context, strGenerateSession);
            String todayDateTimeForReport = DateUtil.getTodayDateTimeForReport();
            String str = todayDateTimeForReport.split("_")[0];
            String str2 = todayDateTimeForReport.split("_")[1];
            Event event2 = new Event(JAnalysisConstants.TYPE_ACTIVE_LAUNCH);
            int i11 = 1 ^ (this.firstLaunch ? 1 : 0);
            boolean firstTime = JAnalysisConfig.getFirstTime(context);
            event2.putExtraAttr(KEY_LAUNCH_TIME, Integer.valueOf(i11));
            event2.putExtraAttr(KEY_FIRST_TIME, Integer.valueOf(firstTime ? 1 : 0));
            event2.putExtraAttr(SESSION_ID, strGenerateSession);
            event2.putExtraAttr(DATE, str);
            event2.putExtraAttr("time", str2);
            this.firstLaunch = false;
            JAnalysisConfig.setFirstTime(context, false);
            JEventBusiness.getInstance().onEvent(context, event2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processForeground failed " + th2.getMessage());
        }
    }

    public void toBackground(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        processBackground(context, jCurrentTimeMillis);
        this.lastToBackgroundTime = jCurrentTimeMillis;
        JAnalysisConfig.setLastToBackgroundTime(context, jCurrentTimeMillis);
    }

    public void toForeground(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        processForeground(context, jCurrentTimeMillis);
        this.lastToForegroundTime = jCurrentTimeMillis;
        JAnalysisConfig.setLastToForegroundTime(context, jCurrentTimeMillis);
    }
}
