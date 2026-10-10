package cn.jiguang.cloud.analytics.api;

import android.text.TextUtils;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.utils.JAnalyticsHelper;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class BrowseEvent extends Event {
    private static final int CUSTOM_SIZE = 4;
    private static final String TAG = "BrowseEvent";
    private float browseDuration;
    private String browseId;
    private String browseName;
    private String browseType;

    public BrowseEvent() {
        super(JAnalysisConstants.TYPE_BROWSE);
        this.browseId = "";
        this.browseName = "";
        this.browseType = "";
        this.browseDuration = 0.0f;
        super.putExtraAttr(JAnalysisConstants.BROWSE_ID, "");
        super.putExtraAttr(JAnalysisConstants.BROWSE_NAME, (Object) this.browseName);
        super.putExtraAttr(JAnalysisConstants.BROWSE_TYPE, (Object) this.browseType);
        super.putExtraAttr(JAnalysisConstants.BROWSE_DURATION, (Object) Float.valueOf(this.browseDuration));
    }

    public float getBrowseDuration() {
        return this.browseDuration;
    }

    public String getBrowseId() {
        return this.browseId;
    }

    public String getBrowseName() {
        return this.browseName;
    }

    public String getBrowseType() {
        return this.browseType;
    }

    @Override // cn.jiguang.privates.analysis.api.Event
    public BrowseEvent putExtraAttr(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        str.getClass();
        switch (str) {
            case "browse_content_id":
            case "browse_duration":
            case "browse_name":
            case "browse_type":
                JCommonLog.m5430d(TAG, "key [" + str + "] is invalid");
                return this;
            default:
                if (this.extraAttrMap.size() < 50) {
                    return (BrowseEvent) super.putExtraAttr(str, obj);
                }
                JCommonLog.m5430d(TAG, "can't put [" + str + "], browse event extraAttrMap size can't be no more than 46");
                return this;
        }
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
                switch (key) {
                    case "browse_content_id":
                    case "browse_duration":
                    case "browse_name":
                    case "browse_type":
                        JCommonLog.m5430d(TAG, "key [" + next.getKey() + "] is invalid");
                        break;
                    default:
                        it.remove();
                        break;
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
                switch (key) {
                    case "browse_content_id":
                    case "browse_duration":
                    case "browse_name":
                    case "browse_type":
                        JCommonLog.m5430d(TAG, "key [" + entry.getKey() + "] is invalid");
                        break;
                    default:
                        putExtraAttr(entry.getKey(), entry.getValue());
                        break;
                }
            }
        }
        return this;
    }

    public BrowseEvent addKeyValue(String str, Object obj) {
        return putExtraAttr(str, obj);
    }

    public BrowseEvent setBrowseDuration(float f11) {
        if (JAnalyticsHelper.isValidValue(Float.valueOf(f11))) {
            this.browseDuration = f11;
            super.putExtraAttr(JAnalysisConstants.BROWSE_DURATION, (Object) Float.valueOf(f11));
        }
        return this;
    }

    public BrowseEvent setBrowseId(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.browseId = str;
            super.putExtraAttr(JAnalysisConstants.BROWSE_ID, (Object) str);
        }
        return this;
    }

    public BrowseEvent setBrowseName(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.browseName = str;
            super.putExtraAttr(JAnalysisConstants.BROWSE_NAME, (Object) str);
        }
        return this;
    }

    public BrowseEvent setBrowseType(String str) {
        if (JAnalyticsHelper.isValidValue(str)) {
            this.browseType = str;
            super.putExtraAttr(JAnalysisConstants.BROWSE_TYPE, (Object) str);
        }
        return this;
    }

    public BrowseEvent(String str, String str2, String str3, long j11) {
        super(JAnalysisConstants.TYPE_BROWSE);
        this.browseId = str;
        this.browseName = str2;
        this.browseType = str3;
        this.browseDuration = j11;
        super.putExtraAttr(JAnalysisConstants.BROWSE_ID, (Object) str);
        super.putExtraAttr(JAnalysisConstants.BROWSE_NAME, (Object) this.browseName);
        super.putExtraAttr(JAnalysisConstants.BROWSE_TYPE, (Object) this.browseType);
        super.putExtraAttr(JAnalysisConstants.BROWSE_DURATION, (Object) Float.valueOf(this.browseDuration));
    }
}
