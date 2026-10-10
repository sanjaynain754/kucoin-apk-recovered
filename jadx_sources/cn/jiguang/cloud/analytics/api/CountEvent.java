package cn.jiguang.cloud.analytics.api;

import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class CountEvent extends Event {
    private static final int CUSTOM_SIZE = 1;
    private static final String TAG = "CountEvent";
    private String eventId;

    public CountEvent() {
        super(JAnalysisConstants.TYPE_COUNT);
        this.eventId = "";
        super.putExtraAttr("event_id", "");
    }

    public String getEventId() {
        return this.eventId;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public CountEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        if (str.equals("event_id")) {
            JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
            return this;
        }
        if (this.extraAttrMap.size() < 50) {
            return (CountEvent) super.putExtraAttr(str, obj);
        }
        JCommonLog.m5430d(TAG, "can't put [" + str + "], count event extraAttrMap size can't be no more than 49");
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
                if (key.equals("event_id")) {
                    JCommonLog.m5430d(TAG, "key [" + next.getKey() + "] is invalid");
                } else {
                    it.remove();
                }
            }
        }
        addExtMap(map);
        return this;
    }

    public Event addExtMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                String key = entry.getKey();
                key.getClass();
                if (!key.equals("event_id")) {
                    putExtraAttr(entry.getKey(), entry.getValue());
                } else {
                    JCommonLog.m5430d(TAG, "key [" + entry.getKey() + "] is invalid");
                }
            }
        }
        return this;
    }

    public CountEvent addKeyValue(String str, Object obj) {
        return putExtraAttr(str, obj);
    }

    public CountEvent setEventId(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.eventId = str;
            super.putExtraAttr("event_id", (Object) str);
        }
        return this;
    }

    public CountEvent(String str) {
        super(JAnalysisConstants.TYPE_COUNT);
        this.eventId = str;
        super.putExtraAttr("event_id", (Object) str);
    }
}
