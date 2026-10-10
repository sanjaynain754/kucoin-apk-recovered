package cn.jiguang.privates.analysis.business.event;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.business.report.JReportBusiness;
import cn.jiguang.privates.analysis.cache.JAnalysisConfig;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JEventBusiness {
    private static final String TAG = "EventBusiness";
    private static volatile JEventBusiness instance;
    private Map<String, Object> commonProperty = new HashMap();
    private Map<String, Object> dynamicProperty = new HashMap();
    private Map<String, Object> property;

    public void onEvent(Context context, Bundle bundle) {
        onEvent(context, (Event) bundle.getParcelable("event"));
    }

    public void setCommonProperty(Context context, Bundle bundle) {
        try {
            HashMap map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
            setCommonProperty(context, map);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setCommonProperty failed " + th2.getMessage());
        }
    }

    public void setDynamicProperty(Context context, Bundle bundle) {
        try {
            HashMap map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
            setDynamicProperty(context, map);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setDynamicProperty failed " + th2.getMessage());
        }
    }

    public static JEventBusiness getInstance() {
        if (instance == null) {
            synchronized (JEventBusiness.class) {
                instance = new JEventBusiness();
            }
        }
        return instance;
    }

    public void clearCommonProperty(Context context) {
        this.commonProperty.clear();
        JAnalysisConfig.setStaticProperty(context, null);
    }

    public void clearDynamicProperty(Context context) {
        this.dynamicProperty.clear();
    }

    public Map<String, Object> getCommonProperty() {
        if (JGlobal.context == null) {
            return this.commonProperty;
        }
        Map<String, Object> map = this.commonProperty;
        if (map == null || map.isEmpty()) {
            this.commonProperty = JAnalysisConfig.getStaticProperty(JGlobal.context);
        }
        return this.commonProperty;
    }

    public Map<String, Object> getDynamicProperty() {
        return this.dynamicProperty;
    }

    public Map<String, Object> getProperty(Context context) {
        Map<String, Object> map = this.property;
        if (map == null) {
            this.property = new HashMap();
        } else {
            map.clear();
        }
        Map<String, Object> commonProperty = getInstance().getCommonProperty();
        Map<String, Object> dynamicProperty = getInstance().getDynamicProperty();
        this.property.putAll(commonProperty);
        this.property.putAll(dynamicProperty);
        return this.property;
    }

    public void onEvent(Context context, Event event) {
        JSONObject jSONObjectPackageJson = packageJson(context, event);
        if (jSONObjectPackageJson == null) {
            return;
        }
        JReportBusiness.getInstance().report(context, jSONObjectPackageJson);
    }

    public JSONObject packageJson(Context context, Event event) {
        try {
            Map<String, Object> property = getProperty(context);
            Map<String, Object> extraAttrMap = event.getExtraAttrMap();
            JSONObject jSONObject = new JSONObject();
            if (property != null && !property.isEmpty()) {
                for (Map.Entry<String, Object> entry : property.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (JAnalyticsHelper.isValidParam(key, value)) {
                        jSONObject.put("_" + key, value);
                    }
                }
            }
            if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
                for (Map.Entry<String, Object> entry2 : extraAttrMap.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (JAnalyticsHelper.isValidParam(key2, value2)) {
                        jSONObject.put("_" + key2, value2);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", event.getName());
            if (jSONObject.length() > 0) {
                jSONObject2.put(JAnalysisConstants.EVENT_ATTRIBUTES, jSONObject);
            }
            return JReportBusiness.getInstance().prepareReportJson(context, "custom_event", jSONObject2);
        } catch (Exception e11) {
            JCommonLog.m5433w(TAG, "packageJson e:" + e11.getMessage());
            return null;
        }
    }

    private void setCommonProperty(Context context, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            JCommonLog.m5433w(TAG, "setCommonProperty failed, map is empty");
            return;
        }
        this.commonProperty = getCommonProperty();
        this.dynamicProperty = getDynamicProperty();
        for (String str : map.keySet()) {
            Object objCutoutValue = JAnalyticsHelper.cutoutValue(map.get(str));
            if (JAnalyticsHelper.isValidParam(str, objCutoutValue)) {
                if (this.commonProperty.size() < 10) {
                    if (!this.dynamicProperty.isEmpty() && this.dynamicProperty.containsKey(str)) {
                        JCommonLog.m5433w(TAG, "dynamicProperty containsKey " + str + ", will not set in commonProperty");
                    } else {
                        this.commonProperty.put(str, objCutoutValue);
                        JCommonLog.m5430d(TAG, "commonMap put key:" + str + ",value:" + objCutoutValue);
                    }
                } else if (!this.commonProperty.containsKey(str)) {
                    JCommonLog.m5433w(TAG, "config commonProperty size can't be no more than 10");
                } else {
                    this.commonProperty.put(str, objCutoutValue);
                    JCommonLog.m5430d(TAG, "commonMap override key:" + str + ",value:" + objCutoutValue);
                }
            }
        }
        JAnalysisConfig.setStaticProperty(context, this.commonProperty);
    }

    private void setDynamicProperty(Context context, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            JCommonLog.m5433w(TAG, "setDynamicProperty failed, map is empty");
            return;
        }
        this.commonProperty = getCommonProperty();
        this.dynamicProperty = getDynamicProperty();
        for (String str : map.keySet()) {
            Object objCutoutValue = JAnalyticsHelper.cutoutValue(map.get(str));
            if (JAnalyticsHelper.isValidParam(str, objCutoutValue)) {
                if (this.dynamicProperty.size() < 10) {
                    if (!this.commonProperty.isEmpty() && this.commonProperty.containsKey(str)) {
                        JCommonLog.m5433w(TAG, "commonProperty containsKey " + str + ", will not set in dynamicProperty");
                    } else {
                        this.dynamicProperty.put(str, objCutoutValue);
                        JCommonLog.m5430d(TAG, "dynamicMap put key:" + str + ",value:" + objCutoutValue);
                    }
                } else if (!this.dynamicProperty.containsKey(str)) {
                    JCommonLog.m5433w(TAG, "config dynamicProperty size can't be no more than 10");
                } else {
                    this.dynamicProperty.put(str, objCutoutValue);
                    JCommonLog.m5430d(TAG, "dynamicMap override key:" + str + ",value:" + objCutoutValue);
                }
            }
        }
    }
}
