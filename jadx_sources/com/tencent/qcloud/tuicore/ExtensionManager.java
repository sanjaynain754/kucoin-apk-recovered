package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.tencent.qcloud.tuicore.interfaces.ITUIExtension;
import com.tencent.qcloud.tuicore.interfaces.TUIExtensionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes56.dex */
class ExtensionManager {
    private static final String TAG = "ExtensionManager";
    private final Map<String, List<ITUIExtension>> extensionHashMap;

    public static class ExtensionManagerHolder {
        private static final ExtensionManager extensionManager = new ExtensionManager();

        private ExtensionManagerHolder() {
        }
    }

    private ExtensionManager() {
        this.extensionHashMap = new ConcurrentHashMap();
    }

    @Deprecated
    public Map<String, Object> getExtensionInfo(String str, Map<String, Object> map) {
        List<ITUIExtension> list;
        Log.d(TAG, "getExtensionInfo key : " + str);
        if (TextUtils.isEmpty(str) || (list = this.extensionHashMap.get(str)) == null) {
            return null;
        }
        Iterator<ITUIExtension> it = list.iterator();
        if (it.hasNext()) {
            return it.next().onGetExtensionInfo(str, map);
        }
        return null;
    }

    public List<TUIExtensionInfo> getExtensionList(String str, Map<String, Object> map) {
        List<ITUIExtension> list;
        Log.d(TAG, "getExtensionInfoList extensionID : " + str);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && (list = this.extensionHashMap.get(str)) != null && !list.isEmpty()) {
            Iterator<ITUIExtension> it = list.iterator();
            while (it.hasNext()) {
                List<TUIExtensionInfo> listOnGetExtension = it.next().onGetExtension(str, map);
                if (listOnGetExtension != null) {
                    arrayList.addAll(listOnGetExtension);
                }
            }
        }
        return arrayList;
    }

    public void raiseExtension(String str, View view, Map<String, Object> map) {
        List<ITUIExtension> list;
        Log.d(TAG, "raiseExtension extensionID : " + str);
        if (TextUtils.isEmpty(str) || (list = this.extensionHashMap.get(str)) == null) {
            return;
        }
        Iterator<ITUIExtension> it = list.iterator();
        while (it.hasNext() && !it.next().onRaiseExtension(str, view, map)) {
        }
    }

    public void registerExtension(String str, ITUIExtension iTUIExtension) {
        Log.i(TAG, "registerExtension extensionID : " + str + ", extension : " + iTUIExtension);
        if (TextUtils.isEmpty(str) || iTUIExtension == null) {
            return;
        }
        List<ITUIExtension> copyOnWriteArrayList = this.extensionHashMap.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.extensionHashMap.put(str, copyOnWriteArrayList);
        }
        if (copyOnWriteArrayList.contains(iTUIExtension)) {
            return;
        }
        copyOnWriteArrayList.add(iTUIExtension);
    }

    public void unRegisterExtension(String str, ITUIExtension iTUIExtension) {
        List<ITUIExtension> list;
        Log.i(TAG, "removeExtension extensionID : " + str + ", extension : " + iTUIExtension);
        if (TextUtils.isEmpty(str) || iTUIExtension == null || (list = this.extensionHashMap.get(str)) == null) {
            return;
        }
        list.remove(iTUIExtension);
    }

    public static ExtensionManager getInstance() {
        return ExtensionManagerHolder.extensionManager;
    }
}
