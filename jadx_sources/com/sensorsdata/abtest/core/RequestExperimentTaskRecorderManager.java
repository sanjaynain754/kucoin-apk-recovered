package com.sensorsdata.abtest.core;

import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.entity.RequestingExperimentInfo;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class RequestExperimentTaskRecorderManager {
    private static final String TAG = "SAB.RequestExperimentTaskManager";
    private final List<RequestExperimentTaskRecorder> mTaskList;

    public static class SingleHolder {
        private static final RequestExperimentTaskRecorderManager INSTANCE = new RequestExperimentTaskRecorderManager();

        private SingleHolder() {
        }
    }

    public synchronized <T> RequestExperimentTaskRecorder createRequest(String str, String str2, String str3, Map<String, Object> map, int i11, OnABTestReceivedData<T> onABTestReceivedData, T t11) {
        RequestExperimentTaskRecorder requestExperimentTaskRecorder;
        SALog.m68589i(TAG, "create new request task");
        requestExperimentTaskRecorder = new RequestExperimentTaskRecorder(str, str2, str3, map, i11);
        this.mTaskList.add(requestExperimentTaskRecorder);
        requestExperimentTaskRecorder.addRequestingExperimentInfo(new RequestingExperimentInfo(onABTestReceivedData, str3, t11));
        requestExperimentTaskRecorder.setIsMergedTask(false);
        return requestExperimentTaskRecorder;
    }

    public synchronized <T> RequestExperimentTaskRecorder mergeRequest(String str, String str2, String str3, Map<String, Object> map, int i11, OnABTestReceivedData<T> onABTestReceivedData, T t11) {
        boolean z11;
        RequestExperimentTaskRecorder next;
        boolean z12;
        try {
            Iterator<RequestExperimentTaskRecorder> it = this.mTaskList.iterator();
            while (true) {
                z11 = false;
                if (!it.hasNext()) {
                    next = null;
                    z12 = false;
                    break;
                }
                next = it.next();
                if (next.isSameExperimentTask(str, str2, str3, map, i11)) {
                    z12 = true;
                    break;
                }
            }
            if (next == null) {
                RequestExperimentTaskRecorder requestExperimentTaskRecorder = new RequestExperimentTaskRecorder(str, str2, str3, map, i11);
                this.mTaskList.add(requestExperimentTaskRecorder);
                next = requestExperimentTaskRecorder;
            } else {
                z11 = z12;
            }
            SALog.m68589i(TAG, "create new request task if not exist, task is exist = " + z11);
            next.addRequestingExperimentInfo(new RequestingExperimentInfo(onABTestReceivedData, str3, t11));
            next.setIsMergedTask(z11);
        } catch (Throwable th2) {
            throw th2;
        }
        return next;
    }

    public synchronized void removeTask(RequestExperimentTaskRecorder requestExperimentTaskRecorder) {
        this.mTaskList.remove(requestExperimentTaskRecorder);
    }

    private RequestExperimentTaskRecorderManager() {
        this.mTaskList = new LinkedList();
    }

    public static RequestExperimentTaskRecorderManager getInstance() {
        return SingleHolder.INSTANCE;
    }
}
