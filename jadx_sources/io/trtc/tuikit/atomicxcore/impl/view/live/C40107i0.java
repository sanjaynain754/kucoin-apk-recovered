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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40107i0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f89209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C40085V0 f89210c;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Class cls;
        Class cls2;
        LiveSeatStore liveSeatStore;
        Object objPutIfAbsent;
        CoGuestStore coGuestStore;
        Object objPutIfAbsent2;
        CoHostStore coHostStore;
        Object objPutIfAbsent3;
        BattleStore battleStore;
        Object objPutIfAbsent4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f89208a;
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String str = this.f89209b;
        if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            liveSeatStore = (LiveSeatStore) objM88293a;
            cls2 = BattleStore.class;
            cls = LikeStore.class;
        } else {
            cls = LikeStore.class;
            cls2 = BattleStore.class;
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
                }
                liveSeatStore = (LiveSeatStore) objM88294a;
            } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
                }
                liveSeatStore = (LiveSeatStore) objM88298a;
            } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
                }
                liveSeatStore = (LiveSeatStore) objM88331a;
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(LiveSeatStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
                Object c39733e1 = map.get(strM88224a);
                if (c39733e1 == null) {
                    String name = LiveSeatStore.class.getName();
                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(str);
                    } else if (Intrinsics.areEqual(name, cls2.getName())) {
                        c39733e1 = new C39767q(str);
                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(str);
                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(str);
                    } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(str);
                    } else if (Intrinsics.areEqual(name, cls.getName())) {
                        c39733e1 = new C39744i0(str);
                    } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                        c39733e1 = new C39774s0(str);
                    } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(str);
                    } else {
                        if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(str);
                    }
                    map.put(strM88224a, c39733e1);
                }
                liveSeatStore = (LiveSeatStore) c39733e1;
            }
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new C40089Z(this.f89210c, liveSeatStore, null), 3, null);
        C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
        String str2 = this.f89209b;
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy6 = C39647d.f88068h;
            Object objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88293a2;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy7 = C39650g.f88077g;
            Object objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88294a2;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy8 = C39661r.f88102s;
            Object objM88298a2 = AbstractC39654k.m88298a();
            if (objM88298a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88298a2;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy9 = C39695N0.f88198j;
            Object objM88331a2 = AbstractC39782w0.m88331a();
            if (objM88331a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            coGuestStore = (CoGuestStore) objM88331a2;
        } else {
            C39510r c39510r2 = c39772r1M88324a2.f88380b;
            c39510r2.m88251a(1, AbstractC39394d.m88223a(CoGuestStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
            ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
            Object concurrentHashMap4 = concurrentHashMap3.get(str2);
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(str2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map2 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map2, CoGuestStore.class, "getName(...)");
            Object c39733e2 = map2.get(strM88224a2);
            if (c39733e2 == null) {
                String name2 = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                    c39733e2 = new C39468e(str2);
                } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                    c39733e2 = new C39767q(str2);
                } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                    c39733e2 = new C39692M(str2);
                } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                    c39733e2 = new C39726c0(str2);
                } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                    c39733e2 = new C39667f(str2);
                } else if (Intrinsics.areEqual(name2, cls.getName())) {
                    c39733e2 = new C39744i0(str2);
                } else if (Intrinsics.areEqual(name2, LiveAudienceStore.class.getName())) {
                    c39733e2 = new C39774s0(str2);
                } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                    c39733e2 = new C39716Y0(str2);
                } else {
                    if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e2 = new C39733e1(str2);
                }
                map2.put(strM88224a2, c39733e2);
            }
            coGuestStore = (CoGuestStore) c39733e2;
        }
        CoGuestStore coGuestStore2 = coGuestStore;
        C41696j.m91104d(interfaceC41709m0, null, null, new C40091a0(this.f89210c, coGuestStore, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40093b0(this.f89210c, coGuestStore2, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40095c0(this.f89210c, coGuestStore2, null), 3, null);
        C39772r1 c39772r1M88324a3 = AbstractC39769q1.m88324a();
        String str3 = this.f89209b;
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy10 = C39647d.f88068h;
            Object objM88293a3 = AbstractC39646c.m88293a();
            if (objM88293a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a3;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy11 = C39650g.f88077g;
            Object objM88294a3 = AbstractC39649f.m88294a();
            if (objM88294a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a3;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy12 = C39661r.f88102s;
            Object objM88298a3 = AbstractC39654k.m88298a();
            if (objM88298a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a3;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy13 = C39695N0.f88198j;
            Object objM88331a3 = AbstractC39782w0.m88331a();
            if (objM88331a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a3;
        } else {
            C39510r c39510r3 = c39772r1M88324a3.f88380b;
            c39510r3.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r3, "message"));
            ConcurrentHashMap concurrentHashMap5 = c39772r1M88324a3.f88379a;
            Object concurrentHashMap6 = concurrentHashMap5.get(str3);
            if (concurrentHashMap6 == null && (objPutIfAbsent3 = concurrentHashMap5.putIfAbsent(str3, (concurrentHashMap6 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap6 = objPutIfAbsent3;
            }
            Map map3 = (Map) concurrentHashMap6;
            String strM88224a3 = AbstractC39395e.m88224a(map3, CoHostStore.class, "getName(...)");
            Object c39733e3 = map3.get(strM88224a3);
            if (c39733e3 == null) {
                String name3 = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name3, BarrageStore.class.getName())) {
                    c39733e3 = new C39468e(str3);
                } else if (Intrinsics.areEqual(name3, cls2.getName())) {
                    c39733e3 = new C39767q(str3);
                } else if (Intrinsics.areEqual(name3, CoGuestStore.class.getName())) {
                    c39733e3 = new C39692M(str3);
                } else if (Intrinsics.areEqual(name3, CoHostStore.class.getName())) {
                    c39733e3 = new C39726c0(str3);
                } else if (Intrinsics.areEqual(name3, GiftStore.class.getName())) {
                    c39733e3 = new C39667f(str3);
                } else if (Intrinsics.areEqual(name3, cls.getName())) {
                    c39733e3 = new C39744i0(str3);
                } else if (Intrinsics.areEqual(name3, LiveAudienceStore.class.getName())) {
                    c39733e3 = new C39774s0(str3);
                } else if (Intrinsics.areEqual(name3, LiveSeatStore.class.getName())) {
                    c39733e3 = new C39716Y0(str3);
                } else {
                    if (!Intrinsics.areEqual(name3, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e3 = new C39733e1(str3);
                }
                map3.put(strM88224a3, c39733e3);
            }
            coHostStore = (CoHostStore) c39733e3;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new C40097d0(this.f89210c, coHostStore, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40099e0(this.f89210c, coHostStore, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40101f0(this.f89210c, coHostStore, null), 3, null);
        C39772r1 c39772r1M88324a4 = AbstractC39769q1.m88324a();
        String str4 = this.f89209b;
        if (Intrinsics.areEqual(cls2.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy14 = C39647d.f88068h;
            Object objM88293a4 = AbstractC39646c.m88293a();
            if (objM88293a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a4;
        } else if (Intrinsics.areEqual(cls2.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy15 = C39650g.f88077g;
            Object objM88294a4 = AbstractC39649f.m88294a();
            if (objM88294a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a4;
        } else if (Intrinsics.areEqual(cls2.getName(), DeviceStore.class.getName())) {
            Lazy lazy16 = C39661r.f88102s;
            Object objM88298a4 = AbstractC39654k.m88298a();
            if (objM88298a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a4;
        } else if (Intrinsics.areEqual(cls2.getName(), LiveListStore.class.getName())) {
            Lazy lazy17 = C39695N0.f88198j;
            Object objM88331a4 = AbstractC39782w0.m88331a();
            if (objM88331a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a4;
        } else {
            C39510r c39510r4 = c39772r1M88324a4.f88380b;
            Class cls3 = cls2;
            c39510r4.m88251a(1, AbstractC39394d.m88223a(cls3, new StringBuilder("getStore "), " liveID is empty", c39510r4, "message"));
            ConcurrentHashMap concurrentHashMap7 = c39772r1M88324a4.f88379a;
            Object concurrentHashMap8 = concurrentHashMap7.get(str4);
            if (concurrentHashMap8 == null && (objPutIfAbsent4 = concurrentHashMap7.putIfAbsent(str4, (concurrentHashMap8 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap8 = objPutIfAbsent4;
            }
            Map map4 = (Map) concurrentHashMap8;
            String strM88224a4 = AbstractC39395e.m88224a(map4, cls3, "getName(...)");
            Object c39733e4 = map4.get(strM88224a4);
            if (c39733e4 == null) {
                String name4 = cls3.getName();
                if (Intrinsics.areEqual(name4, BarrageStore.class.getName())) {
                    c39733e4 = new C39468e(str4);
                } else if (Intrinsics.areEqual(name4, cls3.getName())) {
                    c39733e4 = new C39767q(str4);
                } else if (Intrinsics.areEqual(name4, CoGuestStore.class.getName())) {
                    c39733e4 = new C39692M(str4);
                } else if (Intrinsics.areEqual(name4, CoHostStore.class.getName())) {
                    c39733e4 = new C39726c0(str4);
                } else if (Intrinsics.areEqual(name4, GiftStore.class.getName())) {
                    c39733e4 = new C39667f(str4);
                } else if (Intrinsics.areEqual(name4, cls.getName())) {
                    c39733e4 = new C39744i0(str4);
                } else if (Intrinsics.areEqual(name4, LiveAudienceStore.class.getName())) {
                    c39733e4 = new C39774s0(str4);
                } else if (Intrinsics.areEqual(name4, LiveSeatStore.class.getName())) {
                    c39733e4 = new C39716Y0(str4);
                } else {
                    if (!Intrinsics.areEqual(name4, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e4 = new C39733e1(str4);
                }
                map4.put(strM88224a4, c39733e4);
            }
            battleStore = (BattleStore) c39733e4;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new C40103g0(this.f89210c, battleStore, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40105h0(this.f89210c, battleStore, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40107i0(String str, C40085V0 c40085v0, Continuation continuation) {
        super(2, continuation);
        this.f89209b = str;
        this.f89210c = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40107i0 c40107i0 = new C40107i0(this.f89209b, this.f89210c, continuation);
        c40107i0.f89208a = obj;
        return c40107i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40107i0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }
}
