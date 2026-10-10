package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
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
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView.BattleListenerImpl;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView.LeaveRoomListenerImpl;
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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Lazy;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C40051E implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreView f89100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveListStore f89101b;

    public C40051E(LiveCoreView liveCoreView, LiveListStore liveListStore) {
        this.f89100a = liveCoreView;
        this.f89101b = liveListStore;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) throws Exception {
        Class cls;
        Class cls2;
        LiveSeatStore liveSeatStore;
        Object objPutIfAbsent;
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent2;
        LiveInfo liveInfo = (LiveInfo) obj;
        C39510r logger = this.f89100a.getLogger();
        String message = "onCurrentLiveInfoChanged new OID:" + this.f89100a.getOid() + ",liveId:" + this.f89100a.getLiveId();
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        if (Intrinsics.areEqual(this.f89101b.getLiveState().getCurrentLive().getValue().getLiveID(), this.f89100a.getLiveId()) && this.f89100a.getLiveId().length() > 0) {
            LiveCoreView liveCoreView = this.f89100a;
            Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
            C39510r logger2 = liveCoreView.getLogger();
            String message2 = "subscribeDataAfterEnterRoom new OID:" + liveCoreView.getOid() + ",liveId:" + liveCoreView.getLiveId();
            logger2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            logger2.m88251a(0, message2);
            InterfaceC41775x1 subscribeStateAfterEnterRoomJob = liveCoreView.getSubscribeStateAfterEnterRoomJob();
            if (subscribeStateAfterEnterRoomJob != null) {
                InterfaceC41775x1.a.m91377a(subscribeStateAfterEnterRoomJob, null, 1, null);
            }
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            String liveId = liveCoreView.getLiveId();
            if (Intrinsics.areEqual(LiveSeatStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore");
                }
                liveSeatStore = (LiveSeatStore) objM88293a;
                cls = LiveAudienceStore.class;
                cls2 = LikeStore.class;
            } else {
                cls = LiveAudienceStore.class;
                cls2 = LikeStore.class;
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
                    Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                    if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                        concurrentHashMap2 = objPutIfAbsent;
                    }
                    Map map = (Map) concurrentHashMap2;
                    String strM88224a = AbstractC39395e.m88224a(map, LiveSeatStore.class, "getName(...)");
                    Object c39733e2 = map.get(strM88224a);
                    if (c39733e2 == null) {
                        String name = LiveSeatStore.class.getName();
                        if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                            c39733e2 = new C39468e(liveId);
                        } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                            c39733e2 = new C39767q(liveId);
                        } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                            c39733e2 = new C39692M(liveId);
                        } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                            c39733e2 = new C39726c0(liveId);
                        } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                            c39733e2 = new C39667f(liveId);
                        } else if (Intrinsics.areEqual(name, cls2.getName())) {
                            c39733e2 = new C39744i0(liveId);
                        } else if (Intrinsics.areEqual(name, cls.getName())) {
                            c39733e2 = new C39774s0(liveId);
                        } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                            c39733e2 = new C39716Y0(liveId);
                        } else {
                            if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                                throw new Exception("type is not supported");
                            }
                            c39733e2 = new C39733e1(liveId);
                        }
                        map.put(strM88224a, c39733e2);
                    }
                    liveSeatStore = (LiveSeatStore) c39733e2;
                }
            }
            Iterator<T> it = liveSeatStore.getHasVideoStreamUserList$atomicxcore_release().iterator();
            while (it.hasNext()) {
                AbstractC40069N.m88435a(liveCoreView, (String) it.next(), TUIRoomDefine.VideoStreamType.CAMERA_STREAM, true);
            }
            liveCoreView.setLiveCoreViewImplObserver$atomicxcore_release(new C40071O(liveCoreView));
            TUIRoomEngine.sharedInstance().addObserver(liveCoreView.getLiveCoreViewImplObserver());
            Lazy lazy6 = C39772r1.f88378c;
            C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
            String liveId2 = liveCoreView.getLiveId();
            if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy7 = C39647d.f88068h;
                Object objM88293a2 = AbstractC39646c.m88293a();
                if (objM88293a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88293a2;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy8 = C39650g.f88077g;
                Object objM88294a2 = AbstractC39649f.m88294a();
                if (objM88294a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88294a2;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy9 = C39661r.f88102s;
                Object objM88298a2 = AbstractC39654k.m88298a();
                if (objM88298a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88298a2;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy10 = C39695N0.f88198j;
                Object objM88331a2 = AbstractC39782w0.m88331a();
                if (objM88331a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88331a2;
            } else {
                C39510r c39510r2 = c39772r1M88324a2.f88380b;
                c39510r2.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
                ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
                Object concurrentHashMap4 = concurrentHashMap3.get(liveId2);
                if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(liveId2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap4 = objPutIfAbsent2;
                }
                Map map2 = (Map) concurrentHashMap4;
                String strM88224a2 = AbstractC39395e.m88224a(map2, BattleStore.class, "getName(...)");
                Object obj2 = map2.get(strM88224a2);
                if (obj2 == null) {
                    String name2 = BattleStore.class.getName();
                    if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(liveId2);
                    } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                        c39733e1 = new C39767q(liveId2);
                    } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(liveId2);
                    } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(liveId2);
                    } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(liveId2);
                    } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                        c39733e1 = new C39744i0(liveId2);
                    } else if (Intrinsics.areEqual(name2, cls.getName())) {
                        c39733e1 = new C39774s0(liveId2);
                    } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(liveId2);
                    } else {
                        if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(liveId2);
                    }
                    obj2 = c39733e1;
                    map2.put(strM88224a2, obj2);
                }
                battleStore = (BattleStore) obj2;
            }
            liveCoreView.setBattleListenerImpl$atomicxcore_release(liveCoreView.new BattleListenerImpl());
            battleStore.addBattleListener(liveCoreView.getBattleListenerImpl());
            liveCoreView.setLeaveRoomListenerImpl$atomicxcore_release(liveCoreView.new LeaveRoomListenerImpl());
            Lazy lazy11 = C39695N0.f88198j;
            AbstractC39782w0.m88331a().f88207h.m88248a(liveCoreView.getLeaveRoomListenerImpl());
            liveCoreView.setSubscribeStateAfterEnterRoomJob$atomicxcore_release(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40061J(liveCoreView, null), 3, null));
        } else if (liveInfo.getLiveID().length() == 0) {
            AbstractC40069N.m88442d(this.f89100a);
        }
        return Unit.INSTANCE;
    }
}
