package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.h */
/* JADX INFO: loaded from: classes64.dex */
public class C35404h {

    /* JADX INFO: renamed from: a */
    private static final Map<Integer, String> f76391a;

    /* JADX INFO: renamed from: b */
    private int f76392b = 1;

    /* JADX INFO: renamed from: a */
    public synchronized void m78580a(int i11) {
        this.f76392b = i11;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m78581b(int i11) {
        return this.f76392b == i11;
    }

    public synchronized String toString() {
        return "state[ cur : " + f76391a.get(Integer.valueOf(this.f76392b)) + " ]";
    }

    static {
        HashMap map = new HashMap();
        f76391a = map;
        map.put(1, "IDLE");
        map.put(2, "PREPARING");
        map.put(3, "PREPARED");
    }
}
