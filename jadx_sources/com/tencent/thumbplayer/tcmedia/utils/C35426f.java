package com.tencent.thumbplayer.tcmedia.utils;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.f */
/* JADX INFO: loaded from: classes64.dex */
public class C35426f {

    /* JADX INFO: renamed from: a */
    private static CopyOnWriteArrayList<a> f76584a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo78011a(int i11, int i12, int i13, Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m78865a(int i11, int i12, int i13, Object obj) {
        Iterator<a> it = f76584a.iterator();
        while (it.hasNext()) {
            it.next().mo78011a(i11, i12, i13, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m78866a(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f76584a;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(aVar)) {
            f76584a.add(aVar);
            TPLogUtil.m78796d("TPGlobalEventNofication", "add onNetStatus change listener: " + aVar + ", mListeners: " + f76584a.size());
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m78867b(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f76584a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(aVar);
            TPLogUtil.m78796d("TPGlobalEventNofication", "remove netStatusChangeListener, listener: " + aVar + ", mListeners: " + f76584a.size());
        }
    }
}
