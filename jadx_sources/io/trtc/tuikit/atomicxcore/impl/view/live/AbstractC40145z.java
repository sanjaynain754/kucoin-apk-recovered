package io.trtc.tuikit.atomicxcore.impl.view.live;

import android.util.Log;
import com.kubi.p110rn.Constants;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
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
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
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
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39778u0;
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
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.z */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40145z {
    /* JADX INFO: renamed from: a */
    public static final void m88492a(LiveCoreViewDeprecated liveCoreViewDeprecated, TUILiveListManager.LiveInfo liveInfo, TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(liveCoreViewDeprecated, "<this>");
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        String roomId = liveInfo.roomId;
        Intrinsics.checkNotNullExpressionValue(roomId, "roomId");
        liveCoreViewDeprecated.setLiveId$atomicxcore_release(roomId);
        C40085V0 coreStateProvider = liveCoreViewDeprecated.getCoreStateProvider();
        String liveId = liveCoreViewDeprecated.getLiveId();
        coreStateProvider.getClass();
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        coreStateProvider.f89157b = liveId;
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40107i0(liveId, coreStateProvider, null), 3, null);
        Intrinsics.checkNotNullParameter(interfaceC41775x1M91104d, "<set-?>");
        coreStateProvider.f89158c = interfaceC41775x1M91104d;
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId2 = liveCoreViewDeprecated.getLiveId();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
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
            Object concurrentHashMap2 = concurrentHashMap.get(liveId2);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId2, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = LiveListStore.class.getName();
                if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                    c39733e1 = new C39468e(liveId2);
                } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                    c39733e1 = new C39767q(liveId2);
                } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                    c39733e1 = new C39692M(liveId2);
                } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                    c39733e1 = new C39726c0(liveId2);
                } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                    c39733e1 = new C39667f(liveId2);
                } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                    c39733e1 = new C39744i0(liveId2);
                } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                    c39733e1 = new C39774s0(liveId2);
                } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                    c39733e1 = new C39716Y0(liveId2);
                } else {
                    if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e1 = new C39733e1(liveId2);
                }
                obj = c39733e1;
                map.put(strM88224a, obj);
            }
            liveListStoreM88331a = (LiveListStore) obj;
        }
        liveCoreViewDeprecated.getCallbackHandler().m88488a(liveCoreViewDeprecated.getLiveId());
        liveListStoreM88331a.createLive(AbstractC39778u0.m88330a(liveInfo), new C40133t(liveCoreViewDeprecated, liveInfoCallback));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88493a(LiveCoreViewDeprecated liveCoreViewDeprecated, String roomId, TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(liveCoreViewDeprecated, "<this>");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        liveCoreViewDeprecated.setLiveId$atomicxcore_release(roomId);
        C40085V0 coreStateProvider = liveCoreViewDeprecated.getCoreStateProvider();
        String liveId = liveCoreViewDeprecated.getLiveId();
        coreStateProvider.getClass();
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        coreStateProvider.f89157b = liveId;
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40107i0(liveId, coreStateProvider, null), 3, null);
        Intrinsics.checkNotNullParameter(interfaceC41775x1M91104d, "<set-?>");
        coreStateProvider.f89158c = interfaceC41775x1M91104d;
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId2 = liveCoreViewDeprecated.getLiveId();
        if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88293a;
        } else if (Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88294a;
        } else if (!Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
            if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy4 = C39695N0.f88198j;
                liveListStoreM88331a = AbstractC39782w0.m88331a();
                if (liveListStoreM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get(liveId2);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId2, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
                Object obj = map.get(strM88224a);
                if (obj == null) {
                    String name = LiveListStore.class.getName();
                    if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(liveId2);
                    } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                        c39733e1 = new C39767q(liveId2);
                    } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(liveId2);
                    } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(liveId2);
                    } else if (Intrinsics.areEqual(name, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(liveId2);
                    } else if (Intrinsics.areEqual(name, LikeStore.class.getName())) {
                        c39733e1 = new C39744i0(liveId2);
                    } else if (Intrinsics.areEqual(name, LiveAudienceStore.class.getName())) {
                        c39733e1 = new C39774s0(liveId2);
                    } else if (Intrinsics.areEqual(name, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(liveId2);
                    } else {
                        if (!Intrinsics.areEqual(name, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(liveId2);
                    }
                    obj = c39733e1;
                    map.put(strM88224a, obj);
                }
                liveListStoreM88331a = (LiveListStore) obj;
            }
        } else {
            Lazy lazy5 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
            }
            liveListStoreM88331a = (LiveListStore) objM88298a;
        }
        liveCoreViewDeprecated.getCallbackHandler().m88488a(liveCoreViewDeprecated.getLiveId());
        liveListStoreM88331a.joinLive(roomId, new C40100f(liveCoreViewDeprecated, liveInfoCallback));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88494a(String jsonStr) {
        Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            String string = jSONObject.getString("api");
            if (Intrinsics.areEqual("setCoHostTemplateId", string)) {
                LiveCoreViewDeprecated.INSTANCE.setCoHostTemplateId(jSONObject.getJSONObject(ReportDataTable.COLUMN_PARAMS).getInt("templateId"));
            } else {
                if (Intrinsics.areEqual(Constants.COMPONENT, string)) {
                    C39695N0.f88199k = jSONObject.getInt(Constants.COMPONENT);
                    return;
                }
                TUIRoomEngine.sharedInstance().callExperimentalAPI(jsonStr, null);
            }
        } catch (JSONException e11) {
            Log.e("LiveCoreView-v1", "API callExperimentalAPI exception:" + e11.getLocalizedMessage());
        }
    }
}
