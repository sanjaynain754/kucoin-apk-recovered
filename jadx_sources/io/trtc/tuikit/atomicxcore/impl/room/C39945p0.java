package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.impl.live.C39760n1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.p0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39945p0 {

    /* JADX INFO: renamed from: b */
    public static final Lazy f88810b = LazyKt.lazy(C39941n0.f88807a);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f88811a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final void m88370a(String roomID) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Map map = (Map) this.f88811a.remove(roomID);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C39934k0 c39934k0 = (C39934k0) ((InterfaceC39917c) ((Map.Entry) it.next()).getValue());
                c39934k0.getClass();
                Intrinsics.checkNotNullParameter(roomID, "roomID");
                c39934k0.f88785s = null;
                c39934k0.f88780n = false;
                c39934k0.f88767a.removeObserver(c39934k0.f88788v);
                c39934k0.f88765A.removeObserver(c39934k0.f88790x);
                c39934k0.f88792z.removeObserver(c39934k0.f88789w);
                C39915b c39915b = c39934k0.f88791y;
                c39915b.f88729c.clear();
                c39915b.f88730d.clear();
                c39915b.f88731e.clear();
                c39915b.f88732f.clear();
                c39915b.f88728b.setValue(CollectionsKt.emptyList());
                c39915b.f88727a.setValue(CollectionsKt.emptyList());
            }
        }
        DeviceStore.INSTANCE.shared().reset();
    }

    public C39945p0() {
        C39760n1.f88350d.m88323a();
    }
}
