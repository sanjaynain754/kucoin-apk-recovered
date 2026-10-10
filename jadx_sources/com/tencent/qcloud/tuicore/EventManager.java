package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes56.dex */
class EventManager {
    private static final String TAG = "EventManager";
    private final Map<Pair<String, String>, List<ITUINotification>> eventMap;

    public static class EventManagerHolder {
        private static final EventManager eventManager = new EventManager();

        private EventManagerHolder() {
        }
    }

    public void unRegisterEvent(String str, String str2, ITUINotification iTUINotification) {
        Log.i(TAG, "removeEvent : key : " + str + ", subKey : " + str2 + " notification : " + iTUINotification);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iTUINotification == null) {
            return;
        }
        List<ITUINotification> list = this.eventMap.get(new Pair(str, str2));
        if (list == null) {
            return;
        }
        list.remove(iTUINotification);
    }

    private EventManager() {
        this.eventMap = new ConcurrentHashMap();
    }

    public void notifyEvent(String str, String str2, Map<String, Object> map) {
        Log.d(TAG, "notifyEvent : key : " + str + ", subKey : " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        List<ITUINotification> list = this.eventMap.get(new Pair(str, str2));
        if (list != null) {
            Iterator<ITUINotification> it = list.iterator();
            while (it.hasNext()) {
                it.next().onNotifyEvent(str, str2, map);
            }
        }
    }

    public void registerEvent(String str, String str2, ITUINotification iTUINotification) {
        Log.i(TAG, "registerEvent : key : " + str + ", subKey : " + str2 + ", notification : " + iTUINotification);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iTUINotification == null) {
            return;
        }
        Pair<String, String> pair = new Pair<>(str, str2);
        List<ITUINotification> copyOnWriteArrayList = this.eventMap.get(pair);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.eventMap.put(pair, copyOnWriteArrayList);
        }
        if (copyOnWriteArrayList.contains(iTUINotification)) {
            return;
        }
        copyOnWriteArrayList.add(iTUINotification);
    }

    public static EventManager getInstance() {
        return EventManagerHolder.eventManager;
    }

    public void unRegisterEvent(ITUINotification iTUINotification) {
        Log.i(TAG, "removeEvent : notification : " + iTUINotification);
        if (iTUINotification == null) {
            return;
        }
        Iterator<Pair<String, String>> it = this.eventMap.keySet().iterator();
        while (it.hasNext()) {
            List<ITUINotification> list = this.eventMap.get(it.next());
            if (list != null) {
                for (ITUINotification iTUINotification2 : list) {
                    if (iTUINotification2 == iTUINotification) {
                        list.remove(iTUINotification2);
                        break;
                    }
                }
            }
        }
    }
}
