package com.sensorsdata.abtest.core;

import android.text.TextUtils;
import com.sensorsdata.abtest.entity.RequestingExperimentInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class RequestExperimentTaskRecorder {
    private final String mAnonymousId;
    private final String mLoginId;
    private final String mParamName;
    private final Map<String, Object> mProperties;
    private final int mTimeoutMillSeconds;
    private final List<RequestingExperimentInfo> mRequestingExperimentInfoList = new ArrayList();
    private boolean mIsMergedTask = false;

    private boolean isSameProperties(Map<String, Object> map) {
        if (map == null && this.mProperties == null) {
            return true;
        }
        if (map == null || this.mProperties == null || map.size() != this.mProperties.size()) {
            return false;
        }
        for (Map.Entry<String, Object> entry : this.mProperties.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!map.containsKey(key) || !value.equals(map.get(key))) {
                return false;
            }
        }
        return true;
    }

    public void addRequestingExperimentInfo(RequestingExperimentInfo requestingExperimentInfo) {
        this.mRequestingExperimentInfoList.add(requestingExperimentInfo);
    }

    public List<RequestingExperimentInfo> getRequestingExperimentList() {
        return this.mRequestingExperimentInfoList;
    }

    public boolean isMergedTask() {
        return this.mIsMergedTask;
    }

    public boolean isSameExperimentTask(String str, String str2, String str3, Map<String, Object> map, int i11) {
        if (TextUtils.equals(str, this.mLoginId) && TextUtils.equals(str2, this.mAnonymousId)) {
            return (map == null || TextUtils.equals(str3, this.mParamName)) && isSameProperties(map) && i11 == this.mTimeoutMillSeconds;
        }
        return false;
    }

    public void setIsMergedTask(boolean z11) {
        this.mIsMergedTask = z11;
    }

    public RequestExperimentTaskRecorder(String str, String str2, String str3, Map<String, Object> map, int i11) {
        this.mLoginId = str;
        this.mAnonymousId = str2;
        this.mParamName = str3;
        this.mProperties = map;
        this.mTimeoutMillSeconds = i11;
    }
}
