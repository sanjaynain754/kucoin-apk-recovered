package io.trtc.tuikit.atomicxcore.impl.view.live;

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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Lazy;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.v0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40138v0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40138v0(C40085V0 c40085v0, Continuation continuation) {
        super(2, continuation);
        this.f89278b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40138v0 c40138v0 = new C40138v0(this.f89278b, continuation);
        c40138v0.f89277a = obj;
        return c40138v0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40138v0 c40138v0 = new C40138v0(this.f89278b, (Continuation) obj2);
        c40138v0.f89277a = (InterfaceC41709m0) obj;
        return c40138v0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC41709m0 interfaceC41709m0;
        Class cls;
        LiveListStore liveListStoreM88331a;
        Object objPutIfAbsent;
        DeviceStore deviceStoreM88298a;
        Object c39733e1;
        Object objPutIfAbsent2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f89277a;
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
            interfaceC41709m0 = interfaceC41709m1;
            cls = LiveSeatStore.class;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
            cls = LiveSeatStore.class;
            if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
                liveListStoreM88331a = (LiveListStore) objM88294a;
            } else if (Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
                liveListStoreM88331a = (LiveListStore) objM88298a;
            } else if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                liveListStoreM88331a = AbstractC39782w0.m88331a();
                if (liveListStoreM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get("");
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
                Object c39733e2 = map.get(strM88224a);
                if (c39733e2 == null) {
                    String name = LiveListStore.class.getName();
                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                        c39733e2 = new C39468e("");
                    } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                        c39733e2 = new C39767q("");
                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                        c39733e2 = new C39692M("");
                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                        c39733e2 = new C39726c0("");
                    } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                        c39733e2 = new C39667f("");
                    } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                        c39733e2 = new C39744i0("");
                    } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                        c39733e2 = new C39774s0("");
                    } else if (Intrinsics.areEqual(name, cls.getName())) {
                        c39733e2 = new C39716Y0("");
                    } else {
                        if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e2 = new C39733e1("");
                    }
                    map.put(strM88224a, c39733e2);
                }
                liveListStoreM88331a = (LiveListStore) c39733e2;
            }
        }
        InterfaceC41709m0 interfaceC41709m2 = interfaceC41709m0;
        C41696j.m91104d(interfaceC41709m2, null, null, new C40126p0(this.f89278b, liveListStoreM88331a, null), 3, null);
        C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy6 = C39647d.f88068h;
            Object objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a2;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy7 = C39650g.f88077g;
            Object objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a2;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy8 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy9 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a;
        } else {
            C39510r c39510r2 = c39772r1M88324a2.f88380b;
            c39510r2.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
            ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
            Object concurrentHashMap4 = concurrentHashMap3.get("");
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent("", (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map2 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map2, DeviceStore.class, "getName(...)");
            Object obj2 = map2.get(strM88224a2);
            if (obj2 == null) {
                String name2 = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e("");
                } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                    c39733e1 = new C39767q("");
                } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M("");
                } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0("");
                } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                    c39733e1 = new C39667f("");
                } else if (Intrinsics.areEqual(name2, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0("");
                } else if (Intrinsics.areEqual(name2, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0("");
                } else if (Intrinsics.areEqual(name2, cls.getName())) {
                    c39733e1 = new C39716Y0("");
                } else {
                    if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1("");
                }
                obj2 = c39733e1;
                map2.put(strM88224a2, obj2);
            }
            deviceStoreM88298a = (DeviceStore) obj2;
        }
        C41696j.m91104d(interfaceC41709m2, null, null, new C40128q0(this.f89278b, deviceStoreM88298a, null), 3, null);
        C41696j.m91104d(interfaceC41709m2, null, null, new C40130r0(this.f89278b, deviceStoreM88298a, null), 3, null);
        C41696j.m91104d(interfaceC41709m2, null, null, new C40132s0(this.f89278b, deviceStoreM88298a, null), 3, null);
        C41696j.m91104d(interfaceC41709m2, null, null, new C40134t0(this.f89278b, deviceStoreM88298a, null), 3, null);
        C41696j.m91104d(interfaceC41709m2, null, null, new C40136u0(this.f89278b, deviceStoreM88298a, null), 3, null);
        return Unit.INSTANCE;
    }
}
