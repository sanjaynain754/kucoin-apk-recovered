package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39394d;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.C39468e;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39646c;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39649f;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39654k;
import io.trtc.tuikit.atomicxcore.impl.device.C39647d;
import io.trtc.tuikit.atomicxcore.impl.device.C39650g;
import io.trtc.tuikit.atomicxcore.impl.device.C39661r;
import io.trtc.tuikit.atomicxcore.impl.gift.C39667f;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39769q1;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39782w0;
import io.trtc.tuikit.atomicxcore.impl.live.C39692M;
import io.trtc.tuikit.atomicxcore.impl.live.C39695N0;
import io.trtc.tuikit.atomicxcore.impl.live.C39716Y0;
import io.trtc.tuikit.atomicxcore.impl.live.C39726c0;
import io.trtc.tuikit.atomicxcore.impl.live.C39733e1;
import io.trtc.tuikit.atomicxcore.impl.live.C39744i0;
import io.trtc.tuikit.atomicxcore.impl.live.C39767q;
import io.trtc.tuikit.atomicxcore.impl.live.C39772r1;
import io.trtc.tuikit.atomicxcore.impl.live.C39774s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.Y */
/* JADX INFO: loaded from: classes61.dex */
public final class C40088Y {

    /* JADX INFO: renamed from: a */
    public final C39510r f89161a = AbstractC39398a.m88229a("LiveCoreViewImplObserverDeprecated", "file", "AtomicXCore-Live", "LiveCoreViewImplObserverDeprecated");

    /* JADX INFO: renamed from: b */
    public final int f89162b = hashCode();

    /* JADX INFO: renamed from: c */
    public WeakReference f89163c = new WeakReference(null);

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f89164d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f89165e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public final C40080T f89166f = new C40080T(this);

    /* JADX INFO: renamed from: g */
    public final C40087X f89167g = new C40087X(this);

    /* JADX INFO: renamed from: h */
    public final C40082U f89168h = new C40082U(this);

    /* JADX INFO: renamed from: i */
    public final C40078S f89169i = new C40078S(this);

    /* JADX INFO: renamed from: a */
    public final void m88488a(String liveId) throws Exception {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        TUIRoomEngineImpl tUIRoomEngineImplSharedInstance = TUIRoomEngineImpl.sharedInstance();
        tUIRoomEngineImplSharedInstance.addObserver(this.f89167g);
        tUIRoomEngineImplSharedInstance.getLiveConnectionManager().addObserver(this.f89168h);
        tUIRoomEngineImplSharedInstance.getLiveBattleManager().addObserver(this.f89169i);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.addGuestListener(this.f89166f);
    }

    /* JADX INFO: renamed from: b */
    public final void m88489b(String liveId) {
        CoGuestStore coGuestStore;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        TUIRoomEngineImpl tUIRoomEngineImplSharedInstance = TUIRoomEngineImpl.sharedInstance();
        tUIRoomEngineImplSharedInstance.removeObserver(this.f89167g);
        tUIRoomEngineImplSharedInstance.getLiveConnectionManager().removeObserver(this.f89168h);
        tUIRoomEngineImplSharedInstance.getLiveBattleManager().removeObserver(this.f89169i);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, CoGuestStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            coGuestStore = (CoGuestStore) obj;
        }
        coGuestStore.removeGuestListener(this.f89166f);
    }

    /* JADX INFO: renamed from: a */
    public final void m88487a(InterfaceC40075Q callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : this.f89164d) {
            LiveCoreViewDefine.ConnectionObserver connectionObserver = (LiveCoreViewDefine.ConnectionObserver) weakReference.get();
            if (connectionObserver == null) {
                Intrinsics.checkNotNull(weakReference);
                arrayList.add(weakReference);
            } else {
                callback.mo87176a(connectionObserver);
            }
        }
        this.f89164d.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m88486a(InterfaceC40073P callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : this.f89165e) {
            LiveCoreViewDefine.BattleObserver battleObserver = (LiveCoreViewDefine.BattleObserver) weakReference.get();
            if (battleObserver == null) {
                Intrinsics.checkNotNull(weakReference);
                arrayList.add(weakReference);
            } else {
                callback.mo87175a(battleObserver);
            }
        }
        this.f89165e.removeAll(arrayList);
    }
}
