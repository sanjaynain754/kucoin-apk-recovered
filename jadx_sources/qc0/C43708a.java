package qc0;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: qc0.a */
/* JADX INFO: compiled from: EventManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C43708a {

    /* JADX INFO: renamed from: b */
    public static final String f96619b = "a";

    /* JADX INFO: renamed from: a */
    public final Map<Pair<String, String>, List<InterfaceC43709b>> f96620a;

    /* JADX INFO: renamed from: qc0.a$b */
    /* JADX INFO: compiled from: EventManager.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C43708a f96621a = new C43708a();
    }

    public C43708a() {
        this.f96620a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public void m96264b(String str, String str2, Map<String, Object> map) {
        Log.d(f96619b, "notifyEvent : key : " + str + ", subKey : " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        List<InterfaceC43709b> list = this.f96620a.get(new Pair(str, str2));
        if (list != null) {
            Iterator<InterfaceC43709b> it = list.iterator();
            while (it.hasNext()) {
                it.next().onNotifyEvent(str, str2, map);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m96265c(String str, String str2, InterfaceC43709b interfaceC43709b) {
        Log.i(f96619b, "registerEvent : key : " + str + ", subKey : " + str2 + ", notification : " + interfaceC43709b);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || interfaceC43709b == null) {
            return;
        }
        Pair<String, String> pair = new Pair<>(str, str2);
        List<InterfaceC43709b> copyOnWriteArrayList = this.f96620a.get(pair);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f96620a.put(pair, copyOnWriteArrayList);
        }
        if (copyOnWriteArrayList.contains(interfaceC43709b)) {
            return;
        }
        copyOnWriteArrayList.add(interfaceC43709b);
    }

    /* JADX INFO: renamed from: d */
    public void m96266d(String str, String str2, InterfaceC43709b interfaceC43709b) {
        Log.i(f96619b, "removeEvent : key : " + str + ", subKey : " + str2 + " notification : " + interfaceC43709b);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || interfaceC43709b == null) {
            return;
        }
        List<InterfaceC43709b> list = this.f96620a.get(new Pair(str, str2));
        if (list == null) {
            return;
        }
        list.remove(interfaceC43709b);
    }

    /* JADX INFO: renamed from: a */
    public static C43708a m96263a() {
        return b.f96621a;
    }
}
