package cn.jiguang.cloud.analytics.api;

import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class CalculateEvent extends Event {
    private static final int CUSTOM_SIZE = 2;
    private static final String TAG = "CalculateEvent";
    private String eventId;
    private double eventValue;

    public CalculateEvent() {
        super(JAnalysisConstants.TYPE_CALCULATE);
        this.eventId = "";
        this.eventValue = 0.0d;
        super.putExtraAttr("event_id", "");
        super.putExtraAttr(JAnalysisConstants.CALCULATE_VALUE, (Object) Double.valueOf(this.eventValue));
    }

    public String getEventId() {
        return this.eventId;
    }

    public double getEventValue() {
        return this.eventValue;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public CalculateEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        if (str.equals("event_id") || str.equals(JAnalysisConstants.CALCULATE_VALUE)) {
            JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
            return this;
        }
        if (this.extraAttrMap.size() < 50) {
            return (CalculateEvent) super.putExtraAttr(str, obj);
        }
        JCommonLog.m5430d(TAG, "can't put [" + str + "], calculate event extraAttrMap size can't be no more than 48");
        return this;
    }

    public Event setExtMap(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return this;
        }
        Map<String, Object> extraAttrMap = getExtraAttrMap();
        if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
            Iterator<Map.Entry<String, Object>> it = extraAttrMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                key.getClass();
                if (key.equals("event_id") || key.equals(JAnalysisConstants.CALCULATE_VALUE)) {
                    JCommonLog.m5430d(TAG, "key [" + next.getKey() + "] is invalid");
                } else {
                    it.remove();
                }
            }
        }
        addExtMap(map);
        return this;
    }

    public CalculateEvent addEventValue(double d11) {
        if (JAnalyticsHelper.isValidValue(Double.valueOf(d11))) {
            double d12 = this.eventValue;
            double d13 = d12 + d12;
            this.eventValue = d13;
            super.putExtraAttr(JAnalysisConstants.CALCULATE_VALUE, (Object) Double.valueOf(d13));
        }
        return this;
    }

    public Event addExtMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                key.getClass();
                if (!key.equals("event_id") && !key.equals(JAnalysisConstants.CALCULATE_VALUE)) {
                    putExtraAttr(entry.getKey(), entry.getValue());
                } else {
                    JCommonLog.m5430d(TAG, "key [" + entry.getKey() + "] is invalid");
                }
            }
        }
        return this;
    }

    public CalculateEvent addKeyValue(String str, Object obj) {
        return putExtraAttr(str, obj);
    }

    public CalculateEvent setEventId(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.eventId = str;
            super.putExtraAttr("event_id", (Object) str);
        }
        return this;
    }

    public CalculateEvent setEventValue(double d11) {
        if (JAnalyticsHelper.isValidValue(Double.valueOf(d11))) {
            this.eventValue = d11;
            super.putExtraAttr(JAnalysisConstants.CALCULATE_VALUE, (Object) Double.valueOf(d11));
        }
        return this;
    }

    public CalculateEvent(String str, double d11) {
        super(JAnalysisConstants.TYPE_CALCULATE);
        this.eventId = str;
        this.eventValue = d11;
        super.putExtraAttr("event_id", (Object) str);
        super.putExtraAttr(JAnalysisConstants.CALCULATE_VALUE, (Object) Double.valueOf(this.eventValue));
    }
}
