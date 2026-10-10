package io.trtc.tuikit.atomicxcore.impl.common;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.t */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39512t {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f87709a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m88253a(String name, InterfaceC39513u observer) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(observer, "observer");
        ConcurrentHashMap concurrentHashMap = f87709a;
        Object copyOnWriteArrayList = concurrentHashMap.get(name);
        if (copyOnWriteArrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(name, (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList = objPutIfAbsent;
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) copyOnWriteArrayList;
        Intrinsics.checkNotNull(copyOnWriteArrayList2);
        CollectionsKt.removeAll((List) copyOnWriteArrayList2, (Function1) C39511s.f87708a);
        if (!copyOnWriteArrayList2.isEmpty()) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == observer) {
                    return;
                }
            }
        }
        copyOnWriteArrayList2.add(new WeakReference(observer));
    }

    /* JADX INFO: renamed from: a */
    public static void m88254a(String name, Object data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) f87709a.get(name);
        if (copyOnWriteArrayList == null) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC39513u interfaceC39513u = (InterfaceC39513u) weakReference.get();
            if (interfaceC39513u == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC39513u.mo82103a(name, data);
            }
        }
    }
}
