package io.trtc.tuikit.atomicxcore.impl.live;

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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.r1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39772r1 {

    /* JADX INFO: renamed from: c */
    public static final Lazy f88378c = LazyKt.lazy(C39766p1.f88365a);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f88379a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final C39510r f88380b = AbstractC39398a.m88229a("StoreFactory", "file", "AtomicXCore-Live", "StoreFactory");

    /* JADX INFO: renamed from: a */
    public final C39510r m88325a() {
        return this.f88380b;
    }

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap m88327b() {
        return this.f88379a;
    }

    /* JADX WARN: Code duplicated, block: B:514:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:528:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:530:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:531:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:533:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:535:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:537:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:538:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:540:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:542:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:545:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:547:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:558:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:560:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:563:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b67  */
    /* JADX WARN: Code duplicated, block: B:566:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:573:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:576:0x0ba7  */
    /* JADX WARN: Code duplicated, block: B:578:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:579:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:581:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:588:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:589:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:591:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:594:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:596:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:597:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:599:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:601:0x0c14  */
    /* JADX WARN: Code duplicated, block: B:603:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:604:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c34  */
    /* JADX WARN: Code duplicated, block: B:610:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:611:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:615:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:617:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:618:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:620:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:622:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:628:0x0ca5  */
    /* JADX WARN: Code duplicated, block: B:630:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:632:0x0cbb  */
    /* JADX WARN: Code duplicated, block: B:634:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:635:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:637:0x0cd5  */
    /* JADX WARN: Code duplicated, block: B:638:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:640:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:641:0x0ceb  */
    /* JADX WARN: Code duplicated, block: B:643:0x0cf5  */
    /* JADX WARN: Code duplicated, block: B:644:0x0cfb  */
    /* JADX WARN: Code duplicated, block: B:646:0x0d05  */
    /* JADX WARN: Code duplicated, block: B:647:0x0d0b  */
    /* JADX WARN: Code duplicated, block: B:649:0x0d15  */
    /* JADX WARN: Code duplicated, block: B:650:0x0d1b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0d25  */
    /* JADX WARN: Code duplicated, block: B:653:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:655:0x0d35  */
    /* JADX WARN: Code duplicated, block: B:657:0x0d40  */
    /* JADX WARN: Code duplicated, block: B:662:0x0d4d  */
    /* JADX WARN: Code duplicated, block: B:663:0x0d51  */
    /* JADX WARN: Code duplicated, block: B:665:0x0d54  */
    /* JADX WARN: Code duplicated, block: B:667:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:547:0x0af2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:620:0x0c66, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m88326a(String liveID) {
        Class cls;
        String str;
        Class cls2;
        Object obj;
        Object c39733e1;
        Object objPutIfAbsent;
        Object obj2;
        Object c39733e2;
        Object objPutIfAbsent2;
        Object obj3;
        Object objPutIfAbsent3;
        Object obj4;
        Object objPutIfAbsent4;
        Object obj5;
        Object objPutIfAbsent5;
        Object obj6;
        Object objPutIfAbsent6;
        Class cls3;
        Object obj7;
        Object objPutIfAbsent7;
        Object obj8;
        InterfaceC39729d0 interfaceC39729d0;
        Object concurrentHashMap;
        Map map;
        Class cls4;
        String strM88224a;
        Object c39733e3;
        Object obj9;
        String name;
        Object objPutIfAbsent8;
        Object objM88331a;
        Object obj10;
        Object objM88298a;
        Object objM88294a;
        InterfaceC39729d0 interfaceC39729d1;
        Object concurrentHashMap2;
        Map map2;
        String strM88224a2;
        Object obj11;
        LiveSummaryStore liveSummaryStore;
        String name2;
        Object c39733e4;
        Object objPutIfAbsent9;
        Object objM88331a2;
        Object objM88298a2;
        Object objM88294a2;
        InterfaceC39729d0 interfaceC39729d2;
        Object objM88293a;
        Object objM88293a2;
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy = C39647d.f88068h;
            Object objM88293a3 = AbstractC39646c.m88293a();
            if (objM88293a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            str = "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LikeStore";
            cls2 = BattleStore.class;
            obj = (BattleStore) objM88293a3;
            cls = LikeStore.class;
        } else {
            cls = LikeStore.class;
            str = "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LikeStore";
            if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy2 = C39650g.f88077g;
                Object objM88294a3 = AbstractC39649f.m88294a();
                if (objM88294a3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                obj = (BattleStore) objM88294a3;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy3 = C39661r.f88102s;
                Object objM88298a3 = AbstractC39654k.m88298a();
                if (objM88298a3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                obj = (BattleStore) objM88298a3;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy4 = C39695N0.f88198j;
                Object objM88331a3 = AbstractC39782w0.m88331a();
                if (objM88331a3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                obj = (BattleStore) objM88331a3;
            } else {
                m88325a().m88252a("getStore " + BattleStore.class.getName() + " liveID is empty");
                ConcurrentHashMap concurrentHashMapM88327b = m88327b();
                Object concurrentHashMap3 = concurrentHashMapM88327b.get(liveID);
                if (concurrentHashMap3 == null && (objPutIfAbsent = concurrentHashMapM88327b.putIfAbsent(liveID, (concurrentHashMap3 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap3 = objPutIfAbsent;
                }
                Map map3 = (Map) concurrentHashMap3;
                String strM88224a3 = AbstractC39395e.m88224a(map3, BattleStore.class, "getName(...)");
                Object obj12 = map3.get(strM88224a3);
                if (obj12 == null) {
                    String name3 = BattleStore.class.getName();
                    cls2 = BattleStore.class;
                    if (Intrinsics.areEqual(name3, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(liveID);
                    } else if (Intrinsics.areEqual(name3, cls2.getName())) {
                        c39733e1 = new C39767q(liveID);
                    } else if (Intrinsics.areEqual(name3, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(liveID);
                    } else if (Intrinsics.areEqual(name3, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(liveID);
                    } else if (Intrinsics.areEqual(name3, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(liveID);
                    } else if (Intrinsics.areEqual(name3, cls.getName())) {
                        c39733e1 = new C39744i0(liveID);
                    } else if (Intrinsics.areEqual(name3, LiveAudienceStore.class.getName())) {
                        c39733e1 = new C39774s0(liveID);
                    } else if (Intrinsics.areEqual(name3, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(liveID);
                    } else {
                        if (!Intrinsics.areEqual(name3, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(liveID);
                    }
                    obj12 = c39733e1;
                    map3.put(strM88224a3, obj12);
                } else {
                    cls2 = BattleStore.class;
                }
                obj = (BattleStore) obj12;
            }
            cls2 = BattleStore.class;
        }
        InterfaceC39729d0 interfaceC39729d3 = obj instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj : null;
        if (interfaceC39729d3 != null) {
            interfaceC39729d3.mo88236b(liveID);
            Unit unit = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(CoGuestStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy5 = C39647d.f88068h;
            Object objM88293a4 = AbstractC39646c.m88293a();
            if (objM88293a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            obj2 = (CoGuestStore) objM88293a4;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy6 = C39650g.f88077g;
            Object objM88294a4 = AbstractC39649f.m88294a();
            if (objM88294a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            obj2 = (CoGuestStore) objM88294a4;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy7 = C39661r.f88102s;
            Object objM88298a4 = AbstractC39654k.m88298a();
            if (objM88298a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            obj2 = (CoGuestStore) objM88298a4;
        } else if (Intrinsics.areEqual(CoGuestStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy8 = C39695N0.f88198j;
            Object objM88331a4 = AbstractC39782w0.m88331a();
            if (objM88331a4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoGuestStore");
            }
            obj2 = (CoGuestStore) objM88331a4;
        } else {
            m88325a().m88252a("getStore " + CoGuestStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b2 = m88327b();
            Object concurrentHashMap4 = concurrentHashMapM88327b2.get(liveID);
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMapM88327b2.putIfAbsent(liveID, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map4 = (Map) concurrentHashMap4;
            String strM88224a4 = AbstractC39395e.m88224a(map4, CoGuestStore.class, "getName(...)");
            Object obj13 = map4.get(strM88224a4);
            if (obj13 == null) {
                String name4 = CoGuestStore.class.getName();
                if (Intrinsics.areEqual(name4, BarrageStore.class.getName())) {
                    c39733e2 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name4, cls2.getName())) {
                    c39733e2 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name4, CoGuestStore.class.getName())) {
                    c39733e2 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name4, CoHostStore.class.getName())) {
                    c39733e2 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name4, GiftStore.class.getName())) {
                    c39733e2 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name4, cls.getName())) {
                    c39733e2 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name4, LiveAudienceStore.class.getName())) {
                    c39733e2 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name4, LiveSeatStore.class.getName())) {
                    c39733e2 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name4, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e2 = new C39733e1(liveID);
                }
                obj13 = c39733e2;
                map4.put(strM88224a4, obj13);
            }
            obj2 = (CoGuestStore) obj13;
        }
        InterfaceC39729d0 interfaceC39729d4 = obj2 instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj2 : null;
        if (interfaceC39729d4 != null) {
            interfaceC39729d4.mo88236b(liveID);
            Unit unit2 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy9 = C39647d.f88068h;
            Object objM88293a5 = AbstractC39646c.m88293a();
            if (objM88293a5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            obj3 = (CoHostStore) objM88293a5;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy10 = C39650g.f88077g;
            Object objM88294a5 = AbstractC39649f.m88294a();
            if (objM88294a5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            obj3 = (CoHostStore) objM88294a5;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy11 = C39661r.f88102s;
            Object objM88298a5 = AbstractC39654k.m88298a();
            if (objM88298a5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            obj3 = (CoHostStore) objM88298a5;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy12 = C39695N0.f88198j;
            Object objM88331a5 = AbstractC39782w0.m88331a();
            if (objM88331a5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            obj3 = (CoHostStore) objM88331a5;
        } else {
            m88325a().m88252a("getStore " + CoHostStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b3 = m88327b();
            Object concurrentHashMap5 = concurrentHashMapM88327b3.get(liveID);
            if (concurrentHashMap5 == null && (objPutIfAbsent3 = concurrentHashMapM88327b3.putIfAbsent(liveID, (concurrentHashMap5 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap5 = objPutIfAbsent3;
            }
            Map map5 = (Map) concurrentHashMap5;
            String strM88224a5 = AbstractC39395e.m88224a(map5, CoHostStore.class, "getName(...)");
            Object c39733e5 = map5.get(strM88224a5);
            if (c39733e5 == null) {
                String name5 = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name5, BarrageStore.class.getName())) {
                    c39733e5 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name5, cls2.getName())) {
                    c39733e5 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name5, CoGuestStore.class.getName())) {
                    c39733e5 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name5, CoHostStore.class.getName())) {
                    c39733e5 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name5, GiftStore.class.getName())) {
                    c39733e5 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name5, cls.getName())) {
                    c39733e5 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name5, LiveAudienceStore.class.getName())) {
                    c39733e5 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name5, LiveSeatStore.class.getName())) {
                    c39733e5 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name5, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e5 = new C39733e1(liveID);
                }
                map5.put(strM88224a5, c39733e5);
            }
            obj3 = (CoHostStore) c39733e5;
        }
        InterfaceC39729d0 interfaceC39729d5 = obj3 instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj3 : null;
        if (interfaceC39729d5 != null) {
            interfaceC39729d5.mo88236b(liveID);
            Unit unit3 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy13 = C39647d.f88068h;
            Object objM88293a6 = AbstractC39646c.m88293a();
            if (objM88293a6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            obj4 = (LiveSeatStore) objM88293a6;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy14 = C39650g.f88077g;
            Object objM88294a6 = AbstractC39649f.m88294a();
            if (objM88294a6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            obj4 = (LiveSeatStore) objM88294a6;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy15 = C39661r.f88102s;
            Object objM88298a6 = AbstractC39654k.m88298a();
            if (objM88298a6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            obj4 = (LiveSeatStore) objM88298a6;
        } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy16 = C39695N0.f88198j;
            Object objM88331a6 = AbstractC39782w0.m88331a();
            if (objM88331a6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
            }
            obj4 = (LiveSeatStore) objM88331a6;
        } else {
            m88325a().m88252a("getStore " + LiveSeatStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b4 = m88327b();
            Object concurrentHashMap6 = concurrentHashMapM88327b4.get(liveID);
            if (concurrentHashMap6 == null && (objPutIfAbsent4 = concurrentHashMapM88327b4.putIfAbsent(liveID, (concurrentHashMap6 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap6 = objPutIfAbsent4;
            }
            Map map6 = (Map) concurrentHashMap6;
            String strM88224a6 = AbstractC39395e.m88224a(map6, LiveSeatStore.class, "getName(...)");
            Object c39733e6 = map6.get(strM88224a6);
            if (c39733e6 == null) {
                String name6 = LiveSeatStore.class.getName();
                if (Intrinsics.areEqual(name6, BarrageStore.class.getName())) {
                    c39733e6 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name6, cls2.getName())) {
                    c39733e6 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name6, CoGuestStore.class.getName())) {
                    c39733e6 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name6, CoHostStore.class.getName())) {
                    c39733e6 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name6, GiftStore.class.getName())) {
                    c39733e6 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name6, cls.getName())) {
                    c39733e6 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name6, LiveAudienceStore.class.getName())) {
                    c39733e6 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name6, LiveSeatStore.class.getName())) {
                    c39733e6 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name6, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e6 = new C39733e1(liveID);
                }
                map6.put(strM88224a6, c39733e6);
            }
            obj4 = (LiveSeatStore) c39733e6;
        }
        InterfaceC39729d0 interfaceC39729d6 = obj4 instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj4 : null;
        if (interfaceC39729d6 != null) {
            interfaceC39729d6.mo88236b(liveID);
            Unit unit4 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(BarrageStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy17 = C39647d.f88068h;
            Object objM88293a7 = AbstractC39646c.m88293a();
            if (objM88293a7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore");
            }
            obj5 = (BarrageStore) objM88293a7;
        } else if (Intrinsics.areEqual(BarrageStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy18 = C39650g.f88077g;
            Object objM88294a7 = AbstractC39649f.m88294a();
            if (objM88294a7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore");
            }
            obj5 = (BarrageStore) objM88294a7;
        } else if (Intrinsics.areEqual(BarrageStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy19 = C39661r.f88102s;
            Object objM88298a7 = AbstractC39654k.m88298a();
            if (objM88298a7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore");
            }
            obj5 = (BarrageStore) objM88298a7;
        } else if (Intrinsics.areEqual(BarrageStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy20 = C39695N0.f88198j;
            Object objM88331a7 = AbstractC39782w0.m88331a();
            if (objM88331a7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore");
            }
            obj5 = (BarrageStore) objM88331a7;
        } else {
            m88325a().m88252a("getStore " + BarrageStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b5 = m88327b();
            Object concurrentHashMap7 = concurrentHashMapM88327b5.get(liveID);
            if (concurrentHashMap7 == null && (objPutIfAbsent5 = concurrentHashMapM88327b5.putIfAbsent(liveID, (concurrentHashMap7 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap7 = objPutIfAbsent5;
            }
            Map map7 = (Map) concurrentHashMap7;
            String strM88224a7 = AbstractC39395e.m88224a(map7, BarrageStore.class, "getName(...)");
            Object c39733e7 = map7.get(strM88224a7);
            if (c39733e7 == null) {
                String name7 = BarrageStore.class.getName();
                if (Intrinsics.areEqual(name7, BarrageStore.class.getName())) {
                    c39733e7 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name7, cls2.getName())) {
                    c39733e7 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name7, CoGuestStore.class.getName())) {
                    c39733e7 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name7, CoHostStore.class.getName())) {
                    c39733e7 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name7, GiftStore.class.getName())) {
                    c39733e7 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name7, cls.getName())) {
                    c39733e7 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name7, LiveAudienceStore.class.getName())) {
                    c39733e7 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name7, LiveSeatStore.class.getName())) {
                    c39733e7 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name7, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e7 = new C39733e1(liveID);
                }
                map7.put(strM88224a7, c39733e7);
            }
            obj5 = (BarrageStore) c39733e7;
        }
        InterfaceC39729d0 interfaceC39729d7 = obj5 instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj5 : null;
        if (interfaceC39729d7 != null) {
            interfaceC39729d7.mo88236b(liveID);
            Unit unit5 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(GiftStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy21 = C39647d.f88068h;
            Object objM88293a8 = AbstractC39646c.m88293a();
            if (objM88293a8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.gift.GiftStore");
            }
            obj6 = (GiftStore) objM88293a8;
        } else if (Intrinsics.areEqual(GiftStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy22 = C39650g.f88077g;
            Object objM88294a8 = AbstractC39649f.m88294a();
            if (objM88294a8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.gift.GiftStore");
            }
            obj6 = (GiftStore) objM88294a8;
        } else if (Intrinsics.areEqual(GiftStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy23 = C39661r.f88102s;
            Object objM88298a8 = AbstractC39654k.m88298a();
            if (objM88298a8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.gift.GiftStore");
            }
            obj6 = (GiftStore) objM88298a8;
        } else if (Intrinsics.areEqual(GiftStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy24 = C39695N0.f88198j;
            Object objM88331a8 = AbstractC39782w0.m88331a();
            if (objM88331a8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.gift.GiftStore");
            }
            obj6 = (GiftStore) objM88331a8;
        } else {
            m88325a().m88252a("getStore " + GiftStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b6 = m88327b();
            Object concurrentHashMap8 = concurrentHashMapM88327b6.get(liveID);
            if (concurrentHashMap8 == null && (objPutIfAbsent6 = concurrentHashMapM88327b6.putIfAbsent(liveID, (concurrentHashMap8 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap8 = objPutIfAbsent6;
            }
            Map map8 = (Map) concurrentHashMap8;
            String strM88224a8 = AbstractC39395e.m88224a(map8, GiftStore.class, "getName(...)");
            Object c39733e8 = map8.get(strM88224a8);
            if (c39733e8 == null) {
                String name8 = GiftStore.class.getName();
                if (Intrinsics.areEqual(name8, BarrageStore.class.getName())) {
                    c39733e8 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name8, cls2.getName())) {
                    c39733e8 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name8, CoGuestStore.class.getName())) {
                    c39733e8 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name8, CoHostStore.class.getName())) {
                    c39733e8 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name8, GiftStore.class.getName())) {
                    c39733e8 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name8, cls.getName())) {
                    c39733e8 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name8, LiveAudienceStore.class.getName())) {
                    c39733e8 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name8, LiveSeatStore.class.getName())) {
                    c39733e8 = new C39716Y0(liveID);
                } else {
                    if (!Intrinsics.areEqual(name8, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e8 = new C39733e1(liveID);
                }
                map8.put(strM88224a8, c39733e8);
            }
            obj6 = (GiftStore) c39733e8;
        }
        InterfaceC39729d0 interfaceC39729d8 = obj6 instanceof InterfaceC39729d0 ? (InterfaceC39729d0) obj6 : null;
        if (interfaceC39729d8 != null) {
            interfaceC39729d8.mo88236b(liveID);
            Unit unit6 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(cls.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy25 = C39647d.f88068h;
            Object objM88293a9 = AbstractC39646c.m88293a();
            if (objM88293a9 == null) {
                throw new NullPointerException(str);
            }
            obj8 = (LikeStore) objM88293a9;
        } else {
            String str2 = str;
            if (Intrinsics.areEqual(cls.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy26 = C39650g.f88077g;
                Object objM88294a9 = AbstractC39649f.m88294a();
                if (objM88294a9 == null) {
                    throw new NullPointerException(str2);
                }
                obj8 = (LikeStore) objM88294a9;
            } else {
                if (!Intrinsics.areEqual(cls.getName(), DeviceStore.class.getName())) {
                    if (Intrinsics.areEqual(cls.getName(), LiveListStore.class.getName())) {
                        Lazy lazy27 = C39695N0.f88198j;
                        Object objM88331a9 = AbstractC39782w0.m88331a();
                        if (objM88331a9 == null) {
                            throw new NullPointerException(str2);
                        }
                        obj8 = (LikeStore) objM88331a9;
                    } else {
                        m88325a().m88252a("getStore " + cls.getName() + " liveID is empty");
                        ConcurrentHashMap concurrentHashMapM88327b7 = m88327b();
                        Object concurrentHashMap9 = concurrentHashMapM88327b7.get(liveID);
                        if (concurrentHashMap9 == null && (objPutIfAbsent7 = concurrentHashMapM88327b7.putIfAbsent(liveID, (concurrentHashMap9 = new ConcurrentHashMap()))) != null) {
                            concurrentHashMap9 = objPutIfAbsent7;
                        }
                        Map map9 = (Map) concurrentHashMap9;
                        cls3 = cls;
                        String strM88224a9 = AbstractC39395e.m88224a(map9, cls3, "getName(...)");
                        Object c39733e9 = map9.get(strM88224a9);
                        if (c39733e9 == null) {
                            String name9 = cls3.getName();
                            if (Intrinsics.areEqual(name9, BarrageStore.class.getName())) {
                                c39733e9 = new C39468e(liveID);
                            } else if (Intrinsics.areEqual(name9, cls2.getName())) {
                                c39733e9 = new C39767q(liveID);
                            } else if (Intrinsics.areEqual(name9, CoGuestStore.class.getName())) {
                                c39733e9 = new C39692M(liveID);
                            } else if (Intrinsics.areEqual(name9, CoHostStore.class.getName())) {
                                c39733e9 = new C39726c0(liveID);
                            } else if (Intrinsics.areEqual(name9, GiftStore.class.getName())) {
                                c39733e9 = new C39667f(liveID);
                            } else if (Intrinsics.areEqual(name9, cls3.getName())) {
                                c39733e9 = new C39744i0(liveID);
                            } else if (Intrinsics.areEqual(name9, LiveAudienceStore.class.getName())) {
                                c39733e9 = new C39774s0(liveID);
                            } else if (Intrinsics.areEqual(name9, LiveSeatStore.class.getName())) {
                                c39733e9 = new C39716Y0(liveID);
                            } else {
                                if (!Intrinsics.areEqual(name9, LiveSummaryStore.class.getName())) {
                                    throw new Exception("type is not supported");
                                }
                                c39733e9 = new C39733e1(liveID);
                            }
                            map9.put(strM88224a9, c39733e9);
                        }
                        obj7 = (LikeStore) c39733e9;
                    }
                    if (obj7 instanceof InterfaceC39729d0) {
                        interfaceC39729d0 = (InterfaceC39729d0) obj7;
                    } else {
                        interfaceC39729d0 = null;
                    }
                    if (interfaceC39729d0 != null) {
                        interfaceC39729d0.mo88236b(liveID);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), AudioEffectStore.class.getName())) {
                        Lazy lazy28 = C39647d.f88068h;
                        objM88293a2 = AbstractC39646c.m88293a();
                        if (objM88293a2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
                        }
                        obj10 = (LiveAudienceStore) objM88293a2;
                    } else if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), BaseBeautyStore.class.getName())) {
                        Lazy lazy29 = C39650g.f88077g;
                        objM88294a = AbstractC39649f.m88294a();
                        if (objM88294a != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
                        }
                        obj10 = (LiveAudienceStore) objM88294a;
                    } else {
                        if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), DeviceStore.class.getName())) {
                            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), LiveListStore.class.getName())) {
                                Lazy lazy30 = C39695N0.f88198j;
                                objM88331a = AbstractC39782w0.m88331a();
                                if (objM88331a != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
                                }
                                obj10 = (LiveAudienceStore) objM88331a;
                            } else {
                                m88325a().m88252a("getStore " + LiveAudienceStore.class.getName() + " liveID is empty");
                                ConcurrentHashMap concurrentHashMapM88327b8 = m88327b();
                                concurrentHashMap = concurrentHashMapM88327b8.get(liveID);
                                if (concurrentHashMap == null && (objPutIfAbsent8 = concurrentHashMapM88327b8.putIfAbsent(liveID, (concurrentHashMap = new ConcurrentHashMap()))) != null) {
                                    concurrentHashMap = objPutIfAbsent8;
                                }
                                map = (Map) concurrentHashMap;
                                cls4 = LiveAudienceStore.class;
                                strM88224a = AbstractC39395e.m88224a(map, cls4, "getName(...)");
                                c39733e3 = map.get(strM88224a);
                                if (c39733e3 == null) {
                                    name = cls4.getName();
                                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                                        c39733e3 = new C39468e(liveID);
                                    } else if (Intrinsics.areEqual(name, cls2.getName())) {
                                        c39733e3 = new C39767q(liveID);
                                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                                        c39733e3 = new C39692M(liveID);
                                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                                        c39733e3 = new C39726c0(liveID);
                                    } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                                        c39733e3 = new C39667f(liveID);
                                    } else if (Intrinsics.areEqual(name, cls3.getName())) {
                                        c39733e3 = new C39744i0(liveID);
                                    } else if (Intrinsics.areEqual(name, cls4.getName())) {
                                        c39733e3 = new C39774s0(liveID);
                                    } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                                        c39733e3 = new C39716Y0(liveID);
                                    } else {
                                        if (Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                                            throw new Exception("type is not supported");
                                        }
                                        c39733e3 = new C39733e1(liveID);
                                    }
                                    map.put(strM88224a, c39733e3);
                                }
                                obj9 = (LiveAudienceStore) c39733e3;
                            }
                            if (obj9 instanceof InterfaceC39729d0) {
                                interfaceC39729d1 = (InterfaceC39729d0) obj9;
                            } else {
                                interfaceC39729d1 = null;
                            }
                            if (interfaceC39729d1 != null) {
                                interfaceC39729d1.mo88236b(liveID);
                                Unit unit8 = Unit.INSTANCE;
                            }
                            if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), AudioEffectStore.class.getName())) {
                                Lazy lazy31 = C39647d.f88068h;
                                objM88293a = AbstractC39646c.m88293a();
                                if (objM88293a != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                                }
                                liveSummaryStore = (LiveSummaryStore) objM88293a;
                            } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), BaseBeautyStore.class.getName())) {
                                Lazy lazy32 = C39650g.f88077g;
                                objM88294a2 = AbstractC39649f.m88294a();
                                if (objM88294a2 != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                                }
                                liveSummaryStore = (LiveSummaryStore) objM88294a2;
                            } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), DeviceStore.class.getName())) {
                                Lazy lazy33 = C39661r.f88102s;
                                objM88298a2 = AbstractC39654k.m88298a();
                                if (objM88298a2 != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                                }
                                liveSummaryStore = (LiveSummaryStore) objM88298a2;
                            } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), LiveListStore.class.getName())) {
                                Lazy lazy34 = C39695N0.f88198j;
                                objM88331a2 = AbstractC39782w0.m88331a();
                                if (objM88331a2 != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                                }
                                liveSummaryStore = (LiveSummaryStore) objM88331a2;
                            } else {
                                m88325a().m88252a("getStore " + LiveSummaryStore.class.getName() + " liveID is empty");
                                ConcurrentHashMap concurrentHashMapM88327b9 = m88327b();
                                concurrentHashMap2 = concurrentHashMapM88327b9.get(liveID);
                                if (concurrentHashMap2 == null && (objPutIfAbsent9 = concurrentHashMapM88327b9.putIfAbsent(liveID, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                                    concurrentHashMap2 = objPutIfAbsent9;
                                }
                                map2 = (Map) concurrentHashMap2;
                                strM88224a2 = AbstractC39395e.m88224a(map2, LiveSummaryStore.class, "getName(...)");
                                obj11 = map2.get(strM88224a2);
                                if (obj11 == null) {
                                    name2 = LiveSummaryStore.class.getName();
                                    if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                                        c39733e4 = new C39468e(liveID);
                                    } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                                        c39733e4 = new C39767q(liveID);
                                    } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                                        c39733e4 = new C39692M(liveID);
                                    } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                                        c39733e4 = new C39726c0(liveID);
                                    } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                                        c39733e4 = new C39667f(liveID);
                                    } else if (Intrinsics.areEqual(name2, cls3.getName())) {
                                        c39733e4 = new C39744i0(liveID);
                                    } else if (Intrinsics.areEqual(name2, cls4.getName())) {
                                        c39733e4 = new C39774s0(liveID);
                                    } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                                        c39733e4 = new C39716Y0(liveID);
                                    } else {
                                        if (Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                                            throw new Exception("type is not supported");
                                        }
                                        c39733e4 = new C39733e1(liveID);
                                    }
                                    obj11 = c39733e4;
                                    map2.put(strM88224a2, obj11);
                                }
                                liveSummaryStore = (LiveSummaryStore) obj11;
                            }
                            if (liveSummaryStore instanceof InterfaceC39729d0) {
                                interfaceC39729d2 = (InterfaceC39729d0) liveSummaryStore;
                            } else {
                                interfaceC39729d2 = null;
                            }
                            if (interfaceC39729d2 != null) {
                                interfaceC39729d2.mo88236b(liveID);
                                Unit unit9 = Unit.INSTANCE;
                            }
                        }
                        Lazy lazy35 = C39661r.f88102s;
                        objM88298a = AbstractC39654k.m88298a();
                        if (objM88298a != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
                        }
                        obj10 = (LiveAudienceStore) objM88298a;
                    }
                    obj9 = obj10;
                    cls4 = LiveAudienceStore.class;
                    if (obj9 instanceof InterfaceC39729d0) {
                        interfaceC39729d1 = (InterfaceC39729d0) obj9;
                    } else {
                        interfaceC39729d1 = null;
                    }
                    if (interfaceC39729d1 != null) {
                        interfaceC39729d1.mo88236b(liveID);
                        Unit unit10 = Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), AudioEffectStore.class.getName())) {
                        Lazy lazy36 = C39647d.f88068h;
                        objM88293a = AbstractC39646c.m88293a();
                        if (objM88293a != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                        }
                        liveSummaryStore = (LiveSummaryStore) objM88293a;
                    } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), BaseBeautyStore.class.getName())) {
                        Lazy lazy37 = C39650g.f88077g;
                        objM88294a2 = AbstractC39649f.m88294a();
                        if (objM88294a2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                        }
                        liveSummaryStore = (LiveSummaryStore) objM88294a2;
                    } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), DeviceStore.class.getName())) {
                        Lazy lazy38 = C39661r.f88102s;
                        objM88298a2 = AbstractC39654k.m88298a();
                        if (objM88298a2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                        }
                        liveSummaryStore = (LiveSummaryStore) objM88298a2;
                    } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), LiveListStore.class.getName())) {
                        Lazy lazy39 = C39695N0.f88198j;
                        objM88331a2 = AbstractC39782w0.m88331a();
                        if (objM88331a2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                        }
                        liveSummaryStore = (LiveSummaryStore) objM88331a2;
                    } else {
                        m88325a().m88252a("getStore " + LiveSummaryStore.class.getName() + " liveID is empty");
                        ConcurrentHashMap concurrentHashMapM88327b10 = m88327b();
                        concurrentHashMap2 = concurrentHashMapM88327b10.get(liveID);
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = objPutIfAbsent9;
                        }
                        map2 = (Map) concurrentHashMap2;
                        strM88224a2 = AbstractC39395e.m88224a(map2, LiveSummaryStore.class, "getName(...)");
                        obj11 = map2.get(strM88224a2);
                        if (obj11 == null) {
                            name2 = LiveSummaryStore.class.getName();
                            if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                                c39733e4 = new C39468e(liveID);
                            } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                                c39733e4 = new C39767q(liveID);
                            } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                                c39733e4 = new C39692M(liveID);
                            } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                                c39733e4 = new C39726c0(liveID);
                            } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                                c39733e4 = new C39667f(liveID);
                            } else if (Intrinsics.areEqual(name2, cls3.getName())) {
                                c39733e4 = new C39744i0(liveID);
                            } else if (Intrinsics.areEqual(name2, cls4.getName())) {
                                c39733e4 = new C39774s0(liveID);
                            } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                                c39733e4 = new C39716Y0(liveID);
                            } else {
                                if (Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                                    throw new Exception("type is not supported");
                                }
                                c39733e4 = new C39733e1(liveID);
                            }
                            obj11 = c39733e4;
                            map2.put(strM88224a2, obj11);
                        }
                        liveSummaryStore = (LiveSummaryStore) obj11;
                    }
                    if (liveSummaryStore instanceof InterfaceC39729d0) {
                        interfaceC39729d2 = (InterfaceC39729d0) liveSummaryStore;
                    } else {
                        interfaceC39729d2 = null;
                    }
                    if (interfaceC39729d2 != null) {
                        interfaceC39729d2.mo88236b(liveID);
                        Unit unit11 = Unit.INSTANCE;
                    }
                }
                Lazy lazy40 = C39661r.f88102s;
                Object objM88298a9 = AbstractC39654k.m88298a();
                if (objM88298a9 == null) {
                    throw new NullPointerException(str2);
                }
                obj8 = (LikeStore) objM88298a9;
            }
        }
        obj7 = obj8;
        cls3 = cls;
        if (obj7 instanceof InterfaceC39729d0) {
            interfaceC39729d0 = (InterfaceC39729d0) obj7;
        } else {
            interfaceC39729d0 = null;
        }
        if (interfaceC39729d0 != null) {
            interfaceC39729d0.mo88236b(liveID);
            Unit unit12 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy210 = C39647d.f88068h;
            objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            obj10 = (LiveAudienceStore) objM88293a2;
        } else if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy211 = C39650g.f88077g;
            objM88294a = AbstractC39649f.m88294a();
            if (objM88294a != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            obj10 = (LiveAudienceStore) objM88294a;
        } else {
            if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), DeviceStore.class.getName())) {
                if (Intrinsics.areEqual(LiveAudienceStore.class.getName(), LiveListStore.class.getName())) {
                    Lazy lazy310 = C39695N0.f88198j;
                    objM88331a = AbstractC39782w0.m88331a();
                    if (objM88331a != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
                    }
                    obj10 = (LiveAudienceStore) objM88331a;
                } else {
                    m88325a().m88252a("getStore " + LiveAudienceStore.class.getName() + " liveID is empty");
                    ConcurrentHashMap concurrentHashMapM88327b11 = m88327b();
                    concurrentHashMap = concurrentHashMapM88327b11.get(liveID);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = objPutIfAbsent8;
                    }
                    map = (Map) concurrentHashMap;
                    cls4 = LiveAudienceStore.class;
                    strM88224a = AbstractC39395e.m88224a(map, cls4, "getName(...)");
                    c39733e3 = map.get(strM88224a);
                    if (c39733e3 == null) {
                        name = cls4.getName();
                        if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                            c39733e3 = new C39468e(liveID);
                        } else if (Intrinsics.areEqual(name, cls2.getName())) {
                            c39733e3 = new C39767q(liveID);
                        } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                            c39733e3 = new C39692M(liveID);
                        } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                            c39733e3 = new C39726c0(liveID);
                        } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                            c39733e3 = new C39667f(liveID);
                        } else if (Intrinsics.areEqual(name, cls3.getName())) {
                            c39733e3 = new C39744i0(liveID);
                        } else if (Intrinsics.areEqual(name, cls4.getName())) {
                            c39733e3 = new C39774s0(liveID);
                        } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                            c39733e3 = new C39716Y0(liveID);
                        } else {
                            if (Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                                throw new Exception("type is not supported");
                            }
                            c39733e3 = new C39733e1(liveID);
                        }
                        map.put(strM88224a, c39733e3);
                    }
                    obj9 = (LiveAudienceStore) c39733e3;
                }
                if (obj9 instanceof InterfaceC39729d0) {
                    interfaceC39729d1 = (InterfaceC39729d0) obj9;
                } else {
                    interfaceC39729d1 = null;
                }
                if (interfaceC39729d1 != null) {
                    interfaceC39729d1.mo88236b(liveID);
                    Unit unit13 = Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), AudioEffectStore.class.getName())) {
                    Lazy lazy311 = C39647d.f88068h;
                    objM88293a = AbstractC39646c.m88293a();
                    if (objM88293a != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                    }
                    liveSummaryStore = (LiveSummaryStore) objM88293a;
                } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), BaseBeautyStore.class.getName())) {
                    Lazy lazy312 = C39650g.f88077g;
                    objM88294a2 = AbstractC39649f.m88294a();
                    if (objM88294a2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                    }
                    liveSummaryStore = (LiveSummaryStore) objM88294a2;
                } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), DeviceStore.class.getName())) {
                    Lazy lazy313 = C39661r.f88102s;
                    objM88298a2 = AbstractC39654k.m88298a();
                    if (objM88298a2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                    }
                    liveSummaryStore = (LiveSummaryStore) objM88298a2;
                } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), LiveListStore.class.getName())) {
                    Lazy lazy314 = C39695N0.f88198j;
                    objM88331a2 = AbstractC39782w0.m88331a();
                    if (objM88331a2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
                    }
                    liveSummaryStore = (LiveSummaryStore) objM88331a2;
                } else {
                    m88325a().m88252a("getStore " + LiveSummaryStore.class.getName() + " liveID is empty");
                    ConcurrentHashMap concurrentHashMapM88327b12 = m88327b();
                    concurrentHashMap2 = concurrentHashMapM88327b12.get(liveID);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = objPutIfAbsent9;
                    }
                    map2 = (Map) concurrentHashMap2;
                    strM88224a2 = AbstractC39395e.m88224a(map2, LiveSummaryStore.class, "getName(...)");
                    obj11 = map2.get(strM88224a2);
                    if (obj11 == null) {
                        name2 = LiveSummaryStore.class.getName();
                        if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                            c39733e4 = new C39468e(liveID);
                        } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                            c39733e4 = new C39767q(liveID);
                        } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                            c39733e4 = new C39692M(liveID);
                        } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                            c39733e4 = new C39726c0(liveID);
                        } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                            c39733e4 = new C39667f(liveID);
                        } else if (Intrinsics.areEqual(name2, cls3.getName())) {
                            c39733e4 = new C39744i0(liveID);
                        } else if (Intrinsics.areEqual(name2, cls4.getName())) {
                            c39733e4 = new C39774s0(liveID);
                        } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                            c39733e4 = new C39716Y0(liveID);
                        } else {
                            if (Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                                throw new Exception("type is not supported");
                            }
                            c39733e4 = new C39733e1(liveID);
                        }
                        obj11 = c39733e4;
                        map2.put(strM88224a2, obj11);
                    }
                    liveSummaryStore = (LiveSummaryStore) obj11;
                }
                if (liveSummaryStore instanceof InterfaceC39729d0) {
                    interfaceC39729d2 = (InterfaceC39729d0) liveSummaryStore;
                } else {
                    interfaceC39729d2 = null;
                }
                if (interfaceC39729d2 != null) {
                    interfaceC39729d2.mo88236b(liveID);
                    Unit unit14 = Unit.INSTANCE;
                }
            }
            Lazy lazy315 = C39661r.f88102s;
            objM88298a = AbstractC39654k.m88298a();
            if (objM88298a != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore");
            }
            obj10 = (LiveAudienceStore) objM88298a;
        }
        obj9 = obj10;
        cls4 = LiveAudienceStore.class;
        if (obj9 instanceof InterfaceC39729d0) {
            interfaceC39729d1 = (InterfaceC39729d0) obj9;
        } else {
            interfaceC39729d1 = null;
        }
        if (interfaceC39729d1 != null) {
            interfaceC39729d1.mo88236b(liveID);
            Unit unit15 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy316 = C39647d.f88068h;
            objM88293a = AbstractC39646c.m88293a();
            if (objM88293a != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
            }
            liveSummaryStore = (LiveSummaryStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy317 = C39650g.f88077g;
            objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
            }
            liveSummaryStore = (LiveSummaryStore) objM88294a2;
        } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy318 = C39661r.f88102s;
            objM88298a2 = AbstractC39654k.m88298a();
            if (objM88298a2 != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
            }
            liveSummaryStore = (LiveSummaryStore) objM88298a2;
        } else if (Intrinsics.areEqual(LiveSummaryStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy319 = C39695N0.f88198j;
            objM88331a2 = AbstractC39782w0.m88331a();
            if (objM88331a2 != null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore");
            }
            liveSummaryStore = (LiveSummaryStore) objM88331a2;
        } else {
            m88325a().m88252a("getStore " + LiveSummaryStore.class.getName() + " liveID is empty");
            ConcurrentHashMap concurrentHashMapM88327b13 = m88327b();
            concurrentHashMap2 = concurrentHashMapM88327b13.get(liveID);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = objPutIfAbsent9;
            }
            map2 = (Map) concurrentHashMap2;
            strM88224a2 = AbstractC39395e.m88224a(map2, LiveSummaryStore.class, "getName(...)");
            obj11 = map2.get(strM88224a2);
            if (obj11 == null) {
                name2 = LiveSummaryStore.class.getName();
                if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                    c39733e4 = new C39468e(liveID);
                } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                    c39733e4 = new C39767q(liveID);
                } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                    c39733e4 = new C39692M(liveID);
                } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                    c39733e4 = new C39726c0(liveID);
                } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                    c39733e4 = new C39667f(liveID);
                } else if (Intrinsics.areEqual(name2, cls3.getName())) {
                    c39733e4 = new C39744i0(liveID);
                } else if (Intrinsics.areEqual(name2, cls4.getName())) {
                    c39733e4 = new C39774s0(liveID);
                } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                    c39733e4 = new C39716Y0(liveID);
                } else {
                    if (Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e4 = new C39733e1(liveID);
                }
                obj11 = c39733e4;
                map2.put(strM88224a2, obj11);
            }
            liveSummaryStore = (LiveSummaryStore) obj11;
        }
        if (liveSummaryStore instanceof InterfaceC39729d0) {
            interfaceC39729d2 = (InterfaceC39729d0) liveSummaryStore;
        } else {
            interfaceC39729d2 = null;
        }
        if (interfaceC39729d2 != null) {
            interfaceC39729d2.mo88236b(liveID);
            Unit unit16 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m88328b(String liveID) {
        Class cls;
        Class cls2;
        BaseBeautyStore baseBeautyStore;
        Object c39733e1;
        Object objPutIfAbsent;
        AudioEffectStore audioEffectStoreM88293a;
        Object objPutIfAbsent2;
        DeviceStore deviceStoreM88298a;
        Object c39733e2;
        Object objPutIfAbsent3;
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Map map = (Map) this.f88379a.remove(liveID);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC39729d0) ((Map.Entry) it.next()).getValue()).mo88235a(liveID);
            }
        }
        Class<BaseBeautyStore> cls3 = BaseBeautyStore.class;
        if (Intrinsics.areEqual(cls3.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
            }
            cls3 = cls3;
            cls2 = CoHostStore.class;
            baseBeautyStore = (BaseBeautyStore) objM88293a;
            cls = GiftStore.class;
        } else {
            cls = GiftStore.class;
            cls2 = CoHostStore.class;
            if (Intrinsics.areEqual(cls3.getName(), cls3.getName())) {
                Lazy lazy2 = C39650g.f88077g;
                C39650g c39650gM88294a = AbstractC39649f.m88294a();
                if (c39650gM88294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
                }
                cls3 = cls3;
                baseBeautyStore = c39650gM88294a;
            } else {
                if (Intrinsics.areEqual(cls3.getName(), DeviceStore.class.getName())) {
                    Lazy lazy3 = C39661r.f88102s;
                    Object objM88298a = AbstractC39654k.m88298a();
                    if (objM88298a == null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
                    }
                    baseBeautyStore = (BaseBeautyStore) objM88298a;
                } else if (Intrinsics.areEqual(cls3.getName(), LiveListStore.class.getName())) {
                    Lazy lazy4 = C39695N0.f88198j;
                    Object objM88331a = AbstractC39782w0.m88331a();
                    if (objM88331a == null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore");
                    }
                    baseBeautyStore = (BaseBeautyStore) objM88331a;
                } else {
                    C39510r c39510r = this.f88380b;
                    c39510r.m88251a(1, AbstractC39394d.m88223a(cls3, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                    ConcurrentHashMap concurrentHashMap = this.f88379a;
                    Object concurrentHashMap2 = concurrentHashMap.get("");
                    if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("", (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                        concurrentHashMap2 = objPutIfAbsent;
                    }
                    Map map2 = (Map) concurrentHashMap2;
                    String strM88224a = AbstractC39395e.m88224a(map2, cls3, "getName(...)");
                    Object obj = map2.get(strM88224a);
                    if (obj == null) {
                        String name = cls3.getName();
                        if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                            c39733e1 = new C39468e("");
                        } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                            c39733e1 = new C39767q("");
                        } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                            c39733e1 = new C39692M("");
                        } else if (Intrinsics.areEqual(name, cls2.getName())) {
                            c39733e1 = new C39726c0("");
                        } else if (Intrinsics.areEqual(name, cls.getName())) {
                            c39733e1 = new C39667f("");
                        } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                            c39733e1 = new C39744i0("");
                        } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                            c39733e1 = new C39774s0("");
                        } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                            c39733e1 = new C39716Y0("");
                        } else {
                            if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                                throw new Exception("type is not supported");
                            }
                            c39733e1 = new C39733e1("");
                        }
                        obj = c39733e1;
                        map2.put(strM88224a, obj);
                    }
                    baseBeautyStore = (BaseBeautyStore) obj;
                }
                cls3 = cls3;
            }
        }
        baseBeautyStore.reset();
        if (Intrinsics.areEqual(AudioEffectStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy5 = C39647d.f88068h;
            audioEffectStoreM88293a = AbstractC39646c.m88293a();
            if (audioEffectStoreM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore");
            }
        } else if (Intrinsics.areEqual(AudioEffectStore.class.getName(), cls3.getName())) {
            Lazy lazy6 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore");
            }
            audioEffectStoreM88293a = (AudioEffectStore) objM88294a;
        } else if (Intrinsics.areEqual(AudioEffectStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy7 = C39661r.f88102s;
            Object objM88298a2 = AbstractC39654k.m88298a();
            if (objM88298a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore");
            }
            audioEffectStoreM88293a = (AudioEffectStore) objM88298a2;
        } else if (Intrinsics.areEqual(AudioEffectStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy8 = C39695N0.f88198j;
            Object objM88331a2 = AbstractC39782w0.m88331a();
            if (objM88331a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore");
            }
            audioEffectStoreM88293a = (AudioEffectStore) objM88331a2;
        } else {
            C39510r c39510r2 = this.f88380b;
            c39510r2.m88251a(1, AbstractC39394d.m88223a(AudioEffectStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
            ConcurrentHashMap concurrentHashMap3 = this.f88379a;
            Object concurrentHashMap4 = concurrentHashMap3.get("");
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent("", (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map3 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map3, AudioEffectStore.class, "getName(...)");
            Object c39733e3 = map3.get(strM88224a2);
            if (c39733e3 == null) {
                String name2 = AudioEffectStore.class.getName();
                if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                    c39733e3 = new C39468e("");
                } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                    c39733e3 = new C39767q("");
                } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                    c39733e3 = new C39692M("");
                } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                    c39733e3 = new C39726c0("");
                } else if (Intrinsics.areEqual(name2, cls.getName())) {
                    c39733e3 = new C39667f("");
                } else if (Intrinsics.areEqual(name2, LikeStore.class.getName())) {
                    c39733e3 = new C39744i0("");
                } else if (Intrinsics.areEqual(name2, LiveAudienceStore.class.getName())) {
                    c39733e3 = new C39774s0("");
                } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                    c39733e3 = new C39716Y0("");
                } else {
                    if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e3 = new C39733e1("");
                }
                map3.put(strM88224a2, c39733e3);
            }
            audioEffectStoreM88293a = (AudioEffectStore) c39733e3;
        }
        audioEffectStoreM88293a.reset();
        if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy9 = C39647d.f88068h;
            Object objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88293a2;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), cls3.getName())) {
            Lazy lazy10 = C39650g.f88077g;
            Object objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88294a2;
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy11 = C39661r.f88102s;
            deviceStoreM88298a = AbstractC39654k.m88298a();
            if (deviceStoreM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
        } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy12 = C39695N0.f88198j;
            Object objM88331a3 = AbstractC39782w0.m88331a();
            if (objM88331a3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
            }
            deviceStoreM88298a = (DeviceStore) objM88331a3;
        } else {
            C39510r c39510r3 = this.f88380b;
            c39510r3.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r3, "message"));
            ConcurrentHashMap concurrentHashMap5 = this.f88379a;
            Object concurrentHashMap6 = concurrentHashMap5.get("");
            if (concurrentHashMap6 == null && (objPutIfAbsent3 = concurrentHashMap5.putIfAbsent("", (concurrentHashMap6 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap6 = objPutIfAbsent3;
            }
            Map map4 = (Map) concurrentHashMap6;
            String strM88224a3 = AbstractC39395e.m88224a(map4, DeviceStore.class, "getName(...)");
            Object obj2 = map4.get(strM88224a3);
            if (obj2 == null) {
                String name3 = DeviceStore.class.getName();
                if (Intrinsics.areEqual(name3, BarrageStore.class.getName())) {
                    c39733e2 = new C39468e("");
                } else if (Intrinsics.areEqual(name3, BattleStore.class.getName())) {
                    c39733e2 = new C39767q("");
                } else if (Intrinsics.areEqual(name3, CoGuestStore.class.getName())) {
                    c39733e2 = new C39692M("");
                } else if (Intrinsics.areEqual(name3, cls2.getName())) {
                    c39733e2 = new C39726c0("");
                } else if (Intrinsics.areEqual(name3, cls.getName())) {
                    c39733e2 = new C39667f("");
                } else if (Intrinsics.areEqual(name3, LikeStore.class.getName())) {
                    c39733e2 = new C39744i0("");
                } else if (Intrinsics.areEqual(name3, LiveAudienceStore.class.getName())) {
                    c39733e2 = new C39774s0("");
                } else if (Intrinsics.areEqual(name3, LiveSeatStore.class.getName())) {
                    c39733e2 = new C39716Y0("");
                } else {
                    if (!Intrinsics.areEqual(name3, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e2 = new C39733e1("");
                }
                obj2 = c39733e2;
                map4.put(strM88224a3, obj2);
            }
            deviceStoreM88298a = (DeviceStore) obj2;
        }
        deviceStoreM88298a.reset();
    }

    public C39772r1() {
        C39760n1.f88350d.m88323a();
    }
}
