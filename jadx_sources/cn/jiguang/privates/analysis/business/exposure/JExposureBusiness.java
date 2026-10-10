package cn.jiguang.privates.analysis.business.exposure;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.media3.common.C2711C;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.api.ExposureEvent;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.analysis.business.exposure.listener.JExposureListener;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class JExposureBusiness {
    private static final String TAG = "JExposureBusiness";
    private static volatile JExposureBusiness instance;
    private Activity exposureActivity;
    private String exposureActivityName;
    private JExposureListener exposureListener;
    private int screenHeight;
    private int screenWidth;
    private final ConcurrentHashMap<String, View> exposures = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Map<String, Object>> exposureExtras = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Boolean> exposureFlags = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> exposureCounts = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Long> exposureTimes = new ConcurrentHashMap<>();

    public void onActivityDestroyed(Context context, Bundle bundle) {
        this.exposureActivity = null;
        this.exposureActivityName = null;
        this.exposures.clear();
        this.exposureExtras.clear();
        this.exposureFlags.clear();
        this.exposureTimes.clear();
        this.exposureCounts.clear();
        this.screenWidth = 0;
        this.screenHeight = 0;
    }

    public static JExposureBusiness getInstance() {
        if (instance == null) {
            synchronized (JExposureBusiness.class) {
                instance = new JExposureBusiness();
            }
        }
        return instance;
    }

    private void leaveScreen(Context context, String str) {
        if (this.exposureFlags.containsKey(str) && this.exposureFlags.get(str).booleanValue()) {
            JCommonLog.m5430d(TAG, "out screen tag:" + str + ",currentCount:" + this.exposureCounts.get(str));
            this.exposureFlags.put(str, Boolean.FALSE);
        }
    }

    private void returnScreen(Context context, String str) {
        int iIntValue;
        if (this.exposureFlags.containsKey(str) && this.exposureFlags.get(str).booleanValue()) {
            return;
        }
        this.exposureFlags.put(str, Boolean.TRUE);
        int iIntValue2 = (this.exposureCounts.containsKey(str) ? this.exposureCounts.get(str).intValue() : 0) + 1;
        JCommonLog.m5430d(TAG, "in screen tag:" + str + ",currentCount:" + iIntValue2);
        this.exposureCounts.put(str, Integer.valueOf(iIntValue2));
        long jLongValue = this.exposureTimes.containsKey(str) ? this.exposureTimes.get(str).longValue() : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue > C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            if (!TextUtils.isEmpty(str) && (iIntValue = this.exposureCounts.get(str).intValue()) > 0) {
                report(context, str, iIntValue);
            }
            this.exposureCounts.put(str, 0);
            this.exposureTimes.put(str, Long.valueOf(jCurrentTimeMillis));
        }
    }

    public void onActivityCreated(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.exposureActivity = null;
        this.exposureActivityName = null;
        this.exposures.clear();
        this.exposureExtras.clear();
        this.exposureFlags.clear();
        this.exposureTimes.clear();
        this.exposureCounts.clear();
        this.screenWidth = 0;
        this.screenHeight = 0;
    }

    public void onActivityPaused(Context context, Bundle bundle) {
        if (this.exposureActivity == null) {
            return;
        }
        if (TextUtils.equals(this.exposureActivityName, bundle.getString("activity"))) {
            View decorView = this.exposureActivity.getWindow().getDecorView();
            if (this.exposureListener == null) {
                return;
            }
            decorView.getViewTreeObserver().removeOnDrawListener(this.exposureListener);
            this.exposureListener = null;
        }
    }

    public void onActivityResumed(Context context, Bundle bundle) {
        if (this.exposureActivity == null) {
            return;
        }
        if (TextUtils.equals(this.exposureActivityName, bundle.getString("activity"))) {
            View decorView = this.exposureActivity.getWindow().getDecorView();
            if (this.exposureListener != null) {
                return;
            }
            this.exposureListener = new JExposureListener(this.exposureActivity.getApplicationContext());
            decorView.getViewTreeObserver().addOnDrawListener(this.exposureListener);
        }
    }

    public void onDrawDone(Context context) {
        try {
            if (this.exposureActivity != null && !this.exposures.isEmpty()) {
                if (this.screenWidth == 0 && this.screenHeight == 0) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    this.exposureActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    this.screenWidth = displayMetrics.widthPixels;
                    this.screenHeight = displayMetrics.heightPixels;
                }
                for (Map.Entry<String, View> entry : this.exposures.entrySet()) {
                    String key = entry.getKey();
                    View value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        if (isLeaveScreen(value)) {
                            leaveScreen(context, key);
                        } else {
                            returnScreen(context, key);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onDrawDone failed " + th2.getMessage());
        }
    }

    public void onExposure(Context context, ExposureEvent exposureEvent) {
        Activity activity = exposureEvent.activity;
        if (activity == null) {
            return;
        }
        this.exposureActivity = activity;
        this.exposureActivityName = activity.getClass().getCanonicalName();
        exposureEvent.activity = null;
        String str = exposureEvent.tag;
        if (TextUtils.isEmpty(str)) {
            this.exposureActivity = null;
            return;
        }
        if (exposureEvent.view == null) {
            this.exposureActivity = null;
            return;
        }
        Map<String, Object> extraAttrMap = exposureEvent.getExtraAttrMap();
        if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
            this.exposureExtras.put(str, extraAttrMap);
        }
        this.exposures.put(exposureEvent.tag, exposureEvent.view);
        if (this.exposureListener != null) {
            return;
        }
        this.exposureListener = new JExposureListener(this.exposureActivity.getApplicationContext());
        this.exposureActivity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(this.exposureListener);
    }

    private boolean isLeaveScreen(View view) {
        if (view.getVisibility() == 4 || view.getAlpha() < 0.1d || !view.getGlobalVisibleRect(new Rect(0, 0, this.screenWidth, this.screenHeight))) {
            return true;
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (this.screenWidth - i11) - measuredWidth;
        int i14 = (this.screenHeight - i12) - measuredHeight;
        if (i11 < 0 || i12 < 0 || i13 < 0 || i14 < 0) {
            return true;
        }
        return false;
    }

    private void report(Context context, String str, int i11) {
        Map<String, Object> map;
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5433w(TAG, "view tag can't be null");
            return;
        }
        if (i11 <= 0) {
            return;
        }
        JCommonLog.m5430d(TAG, "onEvent exposure tag:" + str + ",count:" + i11 + ",thread:" + Thread.currentThread().getName());
        Event event = new Event(JAnalysisConstants.TYPE_EXPOSURE);
        event.putExtraAttr("tag", str);
        event.putExtraAttr("count", Integer.valueOf(i11));
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = this.exposureExtras;
        if (concurrentHashMap != null && (map = concurrentHashMap.get(str)) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                event.putExtraAttr(entry.getKey(), entry.getValue());
            }
        }
        JEventBusiness.getInstance().onEvent(context, event);
    }
}
