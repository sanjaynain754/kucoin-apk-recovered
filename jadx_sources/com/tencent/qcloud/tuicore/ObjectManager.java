package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.qcloud.tuicore.interfaces.ITUIObjectFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes56.dex */
class ObjectManager {
    private static final String TAG = "ObjectManager";
    private final Map<String, ITUIObjectFactory> objectFactoryMap;

    public static class ObjectManagerHolder {
        private static final ObjectManager serviceManager = new ObjectManager();

        private ObjectManagerHolder() {
        }
    }

    private ObjectManager() {
        this.objectFactoryMap = new ConcurrentHashMap();
    }

    public Object createObject(String str, String str2, Map<String, Object> map) {
        String str3 = TAG;
        Log.d(str3, "createObject : " + str + " objectName : " + str2);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ITUIObjectFactory iTUIObjectFactory = this.objectFactoryMap.get(str);
        if (iTUIObjectFactory != null) {
            return iTUIObjectFactory.onCreateObject(str2, map);
        }
        Log.w(str3, "can't find objectFactory : " + str);
        return null;
    }

    public void registerObjectFactory(String str, ITUIObjectFactory iTUIObjectFactory) {
        Log.i(TAG, "registerObjectFactory : " + str + "  " + iTUIObjectFactory);
        if (TextUtils.isEmpty(str) || iTUIObjectFactory == null) {
            return;
        }
        this.objectFactoryMap.put(str, iTUIObjectFactory);
    }

    public void unregisterObjectFactory(String str) {
        Log.i(TAG, "unregisterObjectFactory : " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.objectFactoryMap.remove(str);
    }

    public static ObjectManager getInstance() {
        return ObjectManagerHolder.serviceManager;
    }
}
