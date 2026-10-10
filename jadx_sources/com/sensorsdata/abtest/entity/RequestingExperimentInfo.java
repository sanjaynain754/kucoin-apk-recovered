package com.sensorsdata.abtest.entity;

import com.sensorsdata.abtest.OnABTestReceivedData;

/* JADX INFO: loaded from: classes23.dex */
public class RequestingExperimentInfo {
    private final Object defaultValue;
    private final OnABTestReceivedData<?> onABTestReceivedData;
    private final String paramName;

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public String getParamName() {
        return this.paramName;
    }

    public OnABTestReceivedData<?> getResultCallBack() {
        return this.onABTestReceivedData;
    }

    public RequestingExperimentInfo(OnABTestReceivedData<?> onABTestReceivedData, String str, Object obj) {
        this.onABTestReceivedData = onABTestReceivedData;
        this.paramName = str;
        this.defaultValue = obj;
    }
}
