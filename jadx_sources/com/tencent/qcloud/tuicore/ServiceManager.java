package com.tencent.qcloud.tuicore;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes56.dex */
class ServiceManager {
    private static final String TAG = "ServiceManager";
    private final Map<String, ITUIService> serviceMap;

    public static class ServiceManagerHolder {
        private static final ServiceManager serviceManager = new ServiceManager();

        private ServiceManagerHolder() {
        }
    }

    public Object callService(String str, String str2, Map<String, Object> map) {
        String str3 = TAG;
        Log.d(str3, "callService : " + str + " method : " + str2);
        ITUIService iTUIService = this.serviceMap.get(str);
        if (iTUIService != null) {
            return iTUIService.onCall(str2, map);
        }
        Log.w(str3, "can't find service : " + str);
        return null;
    }

    private ServiceManager() {
        this.serviceMap = new ConcurrentHashMap();
    }

    public ITUIService getService(String str) {
        Log.d(TAG, "getService : " + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.serviceMap.get(str);
    }

    public void registerService(String str, ITUIService iTUIService) {
        Log.i(TAG, "registerService : " + str + "  " + iTUIService);
        if (TextUtils.isEmpty(str) || iTUIService == null) {
            return;
        }
        this.serviceMap.put(str, iTUIService);
    }

    public void unregisterService(String str) {
        Log.i(TAG, "unregisterService : " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.serviceMap.remove(str);
    }

    public static ServiceManager getInstance() {
        return ServiceManagerHolder.serviceManager;
    }

    public Object callService(String str, String str2, Map<String, Object> map, TUIServiceCallback tUIServiceCallback) {
        String str3 = TAG;
        Log.d(str3, "callService : " + str + " method : " + str2);
        ITUIService iTUIService = this.serviceMap.get(str);
        if (iTUIService != null) {
            return iTUIService.onCall(str2, map, tUIServiceCallback);
        }
        Log.w(str3, "can't find service : " + str);
        if (tUIServiceCallback == null) {
            return null;
        }
        tUIServiceCallback.onServiceCallback(-1, "can't find service : " + str, new Bundle());
        return null;
    }
}
