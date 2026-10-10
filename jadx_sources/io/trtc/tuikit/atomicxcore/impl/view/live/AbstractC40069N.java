package io.trtc.tuikit.atomicxcore.impl.view.live;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39394d;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.api.view.VideoViewAdapter;
import io.trtc.tuikit.atomicxcore.api.view.ViewLayer;
import io.trtc.tuikit.atomicxcore.impl.barrage.C39468e;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39646c;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39649f;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39654k;
import io.trtc.tuikit.atomicxcore.impl.device.C39647d;
import io.trtc.tuikit.atomicxcore.impl.device.C39650g;
import io.trtc.tuikit.atomicxcore.impl.device.C39661r;
import io.trtc.tuikit.atomicxcore.impl.gift.C39667f;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39718Z0;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39769q1;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39782w0;
import io.trtc.tuikit.atomicxcore.impl.live.C39692M;
import io.trtc.tuikit.atomicxcore.impl.live.C39695N0;
import io.trtc.tuikit.atomicxcore.impl.live.C39716Y0;
import io.trtc.tuikit.atomicxcore.impl.live.C39726c0;
import io.trtc.tuikit.atomicxcore.impl.live.C39733e1;
import io.trtc.tuikit.atomicxcore.impl.live.C39744i0;
import io.trtc.tuikit.atomicxcore.impl.live.C39763o1;
import io.trtc.tuikit.atomicxcore.impl.live.C39767q;
import io.trtc.tuikit.atomicxcore.impl.live.C39772r1;
import io.trtc.tuikit.atomicxcore.impl.live.C39774s0;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40114a;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40115b;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40116c;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40117d;
import io.trtc.tuikit.atomicxcore.impl.view.live.layer.C40118e;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Lazy;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.N */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40069N {
    /* JADX INFO: renamed from: a */
    public static final void m88431a(LiveCoreView liveCoreView, FrameLayout frameLayout, C39763o1 c39763o1) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(liveCoreView);
        float viewWidth$atomicxcore_release = liveCoreView.getViewWidth() / liveCoreView.getViewHeight();
        float w11 = c39763o1.f88357a.getW() / c39763o1.f88357a.getH();
        if (AbstractC39718Z0.m88317a(c39763o1)) {
            constraintSet.connect(frameLayout.getId(), 4, 0, 4);
            constraintSet.connect(frameLayout.getId(), 2, 0, 2);
            constraintSet.setDimensionRatio(frameLayout.getId(), "");
        } else if (w11 >= viewWidth$atomicxcore_release) {
            constraintSet.clear(frameLayout.getId(), 4);
            constraintSet.setDimensionRatio(frameLayout.getId(), "H," + c39763o1.f88357a.getW() + ':' + c39763o1.f88357a.getH());
        } else {
            constraintSet.clear(frameLayout.getId(), 2);
            constraintSet.setDimensionRatio(frameLayout.getId(), "W," + c39763o1.f88357a.getW() + ':' + c39763o1.f88357a.getH());
        }
        constraintSet.applyTo(liveCoreView);
    }

    /* JADX INFO: renamed from: b */
    public static final ConstraintLayout.LayoutParams m88436b(LiveCoreView liveCoreView) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.startToStart = 0;
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.dimensionRatio = "";
        liveCoreView.setFullScreenLayout$atomicxcore_release(true);
        return layoutParams;
    }

    /* JADX INFO: renamed from: c */
    public static final void m88440c(LiveCoreView liveCoreView) {
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "LiveCoreView new OID:" + liveCoreView.getOid() + ",roomId:" + liveCoreView.getLiveId();
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        Context context = liveCoreView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        liveCoreView.setLayoutMixStreamLayer$atomicxcore_release(new C40117d(context, liveCoreView.getLiveId()));
        liveCoreView.getLayoutMixStreamLayer$atomicxcore_release().setId(View.generateViewId());
        liveCoreView.addView(liveCoreView.getLayoutMixStreamLayer$atomicxcore_release(), m88436b(liveCoreView));
        Context context2 = liveCoreView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        liveCoreView.setLayoutMultiStreamLayer$atomicxcore_release(new C40118e(context2, liveCoreView.getLiveId()));
        liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().setId(View.generateViewId());
        liveCoreView.addView(liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release(), m88436b(liveCoreView));
        Context context3 = liveCoreView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        liveCoreView.setLayoutBackgroundWidgetsLayer$atomicxcore_release(new C40118e(context3, liveCoreView.getLiveId()));
        liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release().setId(View.generateViewId());
        liveCoreView.addView(liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release(), m88436b(liveCoreView));
        Context context4 = liveCoreView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        liveCoreView.setLayoutForegroundWidgetsLayer$atomicxcore_release(new C40118e(context4, liveCoreView.getLiveId()));
        liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release().setId(View.generateViewId());
        liveCoreView.addView(liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release(), m88436b(liveCoreView));
        Context context5 = liveCoreView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        liveCoreView.setLayoutBattleWidgetsLayerLayer$atomicxcore_release(new C40115b(context5, liveCoreView.getLiveId()));
        liveCoreView.getLayoutBattleWidgetsLayerLayer$atomicxcore_release().setId(View.generateViewId());
        liveCoreView.addView(liveCoreView.getLayoutBattleWidgetsLayerLayer$atomicxcore_release(), m88436b(liveCoreView));
    }

    /* JADX INFO: renamed from: d */
    public static final void m88442d(LiveCoreView liveCoreView) throws Exception {
        BattleStore battleStore;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "unsubscribeDataAfterEnterRoom new OID:" + liveCoreView.getOid() + ",liveId:" + liveCoreView.getLiveId();
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        InterfaceC41775x1 subscribeStateAfterEnterRoomJob$atomicxcore_release = liveCoreView.getSubscribeStateAfterEnterRoomJob();
        if (subscribeStateAfterEnterRoomJob$atomicxcore_release != null) {
            InterfaceC41775x1.a.m91377a(subscribeStateAfterEnterRoomJob$atomicxcore_release, null, 1, null);
        }
        if (liveCoreView.getLiveCoreViewImplObserver() != null) {
            TUIRoomEngine.sharedInstance().removeObserver(liveCoreView.getLiveCoreViewImplObserver());
        }
        liveCoreView.setLiveCoreViewImplObserver$atomicxcore_release(null);
        if (liveCoreView.getLiveId().length() > 0) {
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            String liveId = liveCoreView.getLiveId();
            if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88293a;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
                Lazy lazy3 = C39650g.f88077g;
                Object objM88294a = AbstractC39649f.m88294a();
                if (objM88294a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88294a;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
                Lazy lazy4 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88298a;
            } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
                Lazy lazy5 = C39695N0.f88198j;
                Object objM88331a = AbstractC39782w0.m88331a();
                if (objM88331a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
                }
                battleStore = (BattleStore) objM88331a;
            } else {
                C39510r c39510r = c39772r1M88324a.f88380b;
                c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                Map map = (Map) concurrentHashMap2;
                String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
                Object c39733e1 = map.get(strM88224a);
                if (c39733e1 == null) {
                    String name = BattleStore.class.getName();
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
                    map.put(strM88224a, c39733e1);
                }
                battleStore = (BattleStore) c39733e1;
            }
            if (liveCoreView.getBattleListenerImpl() != null) {
                battleStore.removeBattleListener(liveCoreView.getBattleListenerImpl());
            }
            liveCoreView.setBattleListenerImpl$atomicxcore_release(null);
        }
        if (liveCoreView.getLeaveRoomListenerImpl() != null) {
            Lazy lazy6 = C39695N0.f88198j;
            AbstractC39782w0.m88331a().f88207h.m88250b(liveCoreView.getLeaveRoomListenerImpl());
            liveCoreView.setLeaveRoomListenerImpl$atomicxcore_release(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88444e(LiveCoreView liveCoreView, SeatInfo seatInfo) {
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", removeForegroundWidgetsView:region" + seatInfo;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        C40116c c40116c = liveCoreView.getForegroundViewMap$atomicxcore_release().get(m88429a(seatInfo));
        if (c40116c != null && liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release().indexOfChild(c40116c) != -1) {
            liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release().removeView(c40116c);
        }
        liveCoreView.getForegroundViewMap$atomicxcore_release().remove(m88429a(seatInfo));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m88437b(LiveCoreView liveCoreView, ContinuationImpl continuationImpl) throws Exception {
        C40049D c40049d;
        LiveListStore liveListStoreM88331a;
        Object c39733e1;
        Object objPutIfAbsent;
        if (continuationImpl instanceof C40049D) {
            c40049d = (C40049D) continuationImpl;
            int i11 = c40049d.f89098b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40049d.f89098b = i11 - Integer.MIN_VALUE;
            } else {
                c40049d = new C40049D(continuationImpl);
            }
        } else {
            c40049d = new C40049D(continuationImpl);
        }
        Object obj = c40049d.f89097a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40049d.f89098b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            String liveId = liveCoreView.getLiveId();
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
                    Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                    if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                        concurrentHashMap2 = objPutIfAbsent;
                    }
                    Map map = (Map) concurrentHashMap2;
                    String strM88224a = AbstractC39395e.m88224a(map, LiveListStore.class, "getName(...)");
                    Object obj2 = map.get(strM88224a);
                    if (obj2 == null) {
                        String name = LiveListStore.class.getName();
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
                        obj2 = c39733e1;
                        map.put(strM88224a, obj2);
                    }
                    liveListStoreM88331a = (LiveListStore) obj2;
                }
            } else {
                Lazy lazy5 = C39661r.f88102s;
                Object objM88298a = AbstractC39654k.m88298a();
                if (objM88298a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
                liveListStoreM88331a = (LiveListStore) objM88298a;
            }
            InterfaceC41678w<LiveInfo> currentLive = liveListStoreM88331a.getLiveState().getCurrentLive();
            C40051E c40051e = new C40051E(liveCoreView, liveListStoreM88331a);
            c40049d.f89098b = 1;
            if (currentLive.collect(c40051e, c40049d) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m88439c(LiveCoreView liveCoreView, ContinuationImpl continuationImpl) throws Exception {
        C40053F c40053f;
        LiveSeatStore liveSeatStore;
        Object c39733e1;
        Object objPutIfAbsent;
        if (continuationImpl instanceof C40053F) {
            c40053f = (C40053F) continuationImpl;
            int i11 = c40053f.f89106b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40053f.f89106b = i11 - Integer.MIN_VALUE;
            } else {
                c40053f = new C40053F(continuationImpl);
            }
        } else {
            c40053f = new C40053F(continuationImpl);
        }
        Object obj = c40053f.f89105a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40053f.f89106b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
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
            } else if (Intrinsics.areEqual(LiveSeatStore.class.getName(), BaseBeautyStore.class.getName())) {
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
                Object obj2 = map.get(strM88224a);
                if (obj2 == null) {
                    String name = LiveSeatStore.class.getName();
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
                    obj2 = c39733e1;
                    map.put(strM88224a, obj2);
                }
                liveSeatStore = (LiveSeatStore) obj2;
            }
            InterfaceC41678w<List<SeatInfo>> seatList = liveSeatStore.getLiveSeatState().getSeatList();
            C40055G c40055g = new C40055G(liveSeatStore, liveCoreView);
            c40053f.f89106b = 1;
            if (seatList.collect(c40055g, c40053f) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m88428a(LiveCoreView liveCoreView, ContinuationImpl continuationImpl) throws Exception {
        C40045B c40045b;
        Class cls;
        Class cls2;
        DeviceStore deviceStoreM88298a;
        Object objPutIfAbsent;
        DeviceStore deviceStore;
        LiveListStore liveListStoreM88331a;
        Object objPutIfAbsent2;
        if (continuationImpl instanceof C40045B) {
            c40045b = (C40045B) continuationImpl;
            int i11 = c40045b.f89090b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40045b.f89090b = i11 - Integer.MIN_VALUE;
            } else {
                c40045b = new C40045B(continuationImpl);
            }
        } else {
            c40045b = new C40045B(continuationImpl);
        }
        Object obj = c40045b.f89089a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40045b.f89090b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = C39772r1.f88378c;
            C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
            String liveId = liveCoreView.getLiveId();
            if (Intrinsics.areEqual(DeviceStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy2 = C39647d.f88068h;
                Object objM88293a = AbstractC39646c.m88293a();
                if (objM88293a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
                }
                deviceStoreM88298a = (DeviceStore) objM88293a;
                cls = LikeStore.class;
                cls2 = GiftStore.class;
            } else {
                cls = LikeStore.class;
                cls2 = GiftStore.class;
                if (!Intrinsics.areEqual(DeviceStore.class.getName(), BaseBeautyStore.class.getName())) {
                    if (Intrinsics.areEqual(DeviceStore.class.getName(), DeviceStore.class.getName())) {
                        Lazy lazy3 = C39661r.f88102s;
                        deviceStoreM88298a = AbstractC39654k.m88298a();
                        if (deviceStoreM88298a == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
                        }
                    } else if (Intrinsics.areEqual(DeviceStore.class.getName(), LiveListStore.class.getName())) {
                        Lazy lazy4 = C39695N0.f88198j;
                        Object objM88331a = AbstractC39782w0.m88331a();
                        if (objM88331a == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
                        }
                        deviceStoreM88298a = (DeviceStore) objM88331a;
                    } else {
                        C39510r c39510r = c39772r1M88324a.f88380b;
                        c39510r.m88251a(1, AbstractC39394d.m88223a(DeviceStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
                        ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
                        Object concurrentHashMap2 = concurrentHashMap.get(liveId);
                        if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                            concurrentHashMap2 = objPutIfAbsent;
                        }
                        Map map = (Map) concurrentHashMap2;
                        String strM88224a = AbstractC39395e.m88224a(map, DeviceStore.class, "getName(...)");
                        Object c39733e1 = map.get(strM88224a);
                        if (c39733e1 == null) {
                            String name = DeviceStore.class.getName();
                            if (Intrinsics.areEqual(name, BarrageStore.class.getName())) {
                                c39733e1 = new C39468e(liveId);
                            } else if (Intrinsics.areEqual(name, BattleStore.class.getName())) {
                                c39733e1 = new C39767q(liveId);
                            } else if (Intrinsics.areEqual(name, CoGuestStore.class.getName())) {
                                c39733e1 = new C39692M(liveId);
                            } else if (Intrinsics.areEqual(name, CoHostStore.class.getName())) {
                                c39733e1 = new C39726c0(liveId);
                            } else if (Intrinsics.areEqual(name, cls2.getName())) {
                                c39733e1 = new C39667f(liveId);
                            } else if (Intrinsics.areEqual(name, cls.getName())) {
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
                            map.put(strM88224a, c39733e1);
                        }
                        deviceStoreM88298a = (DeviceStore) c39733e1;
                    }
                } else {
                    Lazy lazy5 = C39650g.f88077g;
                    Object objM88294a = AbstractC39649f.m88294a();
                    if (objM88294a == null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore");
                    }
                    deviceStoreM88298a = (DeviceStore) objM88294a;
                }
            }
            C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
            String liveId2 = liveCoreView.getLiveId();
            if (Intrinsics.areEqual(LiveListStore.class.getName(), AudioEffectStore.class.getName())) {
                Lazy lazy6 = C39647d.f88068h;
                Object objM88293a2 = AbstractC39646c.m88293a();
                if (objM88293a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                }
                liveListStoreM88331a = (LiveListStore) objM88293a2;
                deviceStore = deviceStoreM88298a;
            } else {
                deviceStore = deviceStoreM88298a;
                if (!Intrinsics.areEqual(LiveListStore.class.getName(), BaseBeautyStore.class.getName())) {
                    if (Intrinsics.areEqual(LiveListStore.class.getName(), DeviceStore.class.getName())) {
                        Lazy lazy7 = C39661r.f88102s;
                        Object objM88298a = AbstractC39654k.m88298a();
                        if (objM88298a == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                        }
                        liveListStoreM88331a = (LiveListStore) objM88298a;
                    } else if (Intrinsics.areEqual(LiveListStore.class.getName(), LiveListStore.class.getName())) {
                        Lazy lazy8 = C39695N0.f88198j;
                        liveListStoreM88331a = AbstractC39782w0.m88331a();
                        if (liveListStoreM88331a == null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                        }
                    } else {
                        C39510r c39510r2 = c39772r1M88324a2.f88380b;
                        c39510r2.m88251a(1, AbstractC39394d.m88223a(LiveListStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
                        ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
                        Object concurrentHashMap4 = concurrentHashMap3.get(liveId2);
                        if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(liveId2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                            concurrentHashMap4 = objPutIfAbsent2;
                        }
                        Map map2 = (Map) concurrentHashMap4;
                        String strM88224a2 = AbstractC39395e.m88224a(map2, LiveListStore.class, "getName(...)");
                        Object c39733e2 = map2.get(strM88224a2);
                        if (c39733e2 == null) {
                            String name2 = LiveListStore.class.getName();
                            if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                                c39733e2 = new C39468e(liveId2);
                            } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                                c39733e2 = new C39767q(liveId2);
                            } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                                c39733e2 = new C39692M(liveId2);
                            } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                                c39733e2 = new C39726c0(liveId2);
                            } else if (Intrinsics.areEqual(name2, cls2.getName())) {
                                c39733e2 = new C39667f(liveId2);
                            } else if (Intrinsics.areEqual(name2, cls.getName())) {
                                c39733e2 = new C39744i0(liveId2);
                            } else if (Intrinsics.areEqual(name2, LiveAudienceStore.class.getName())) {
                                c39733e2 = new C39774s0(liveId2);
                            } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                                c39733e2 = new C39716Y0(liveId2);
                            } else {
                                if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                                    throw new Exception("type is not supported");
                                }
                                c39733e2 = new C39733e1(liveId2);
                            }
                            map2.put(strM88224a2, c39733e2);
                        }
                        liveListStoreM88331a = (LiveListStore) c39733e2;
                    }
                } else {
                    Lazy lazy9 = C39650g.f88077g;
                    Object objM88294a2 = AbstractC39649f.m88294a();
                    if (objM88294a2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore");
                    }
                    liveListStoreM88331a = (LiveListStore) objM88294a2;
                }
            }
            InterfaceC41678w<DeviceStatus> cameraStatus = deviceStore.getDeviceState().getCameraStatus();
            C40047C c40047c = new C40047C(liveCoreView, liveListStoreM88331a);
            c40045b.f89090b = 1;
            if (cameraStatus.collect(c40047c, c40045b) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public static final void m88438b(LiveCoreView liveCoreView, SeatInfo seatInfo) {
        View view;
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", addBackgroundWidgetsView:region" + seatInfo;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        C40116c c40116c = liveCoreView.getForegroundViewMap$atomicxcore_release().get(m88429a(seatInfo));
        if (c40116c == null) {
            Context context = liveCoreView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C40116c c40116c2 = new C40116c(context);
            if (liveCoreView.getVideoViewAdapter() != null) {
                if (Intrinsics.areEqual(seatInfo.getUserInfo().getLiveID(), liveCoreView.getLiveId())) {
                    C39510r logger$atomicxcore_release2 = liveCoreView.getLogger();
                    String message2 = "oid:" + liveCoreView.getOid() + ", createCoGuestView FOREGROUND:userInfo" + seatInfo;
                    logger$atomicxcore_release2.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    logger$atomicxcore_release2.m88251a(0, message2);
                    VideoViewAdapter videoViewAdapter$atomicxcore_release = liveCoreView.getVideoViewAdapter();
                    view = videoViewAdapter$atomicxcore_release != null ? videoViewAdapter$atomicxcore_release.createCoGuestView(seatInfo, ViewLayer.FOREGROUND) : null;
                    if (view != null) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
                        C39510r c39510r = c40116c2.f89231d;
                        String message3 = "addCoGuestView OID:" + c40116c2.f89228a + " view:" + view + " seatInfo:" + seatInfo;
                        c39510r.getClass();
                        Intrinsics.checkNotNullParameter(message3, "message");
                        c39510r.m88251a(0, message3);
                        c40116c2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                } else {
                    C39510r logger$atomicxcore_release3 = liveCoreView.getLogger();
                    String message4 = "oid:" + liveCoreView.getOid() + ", createCoHostView FOREGROUND:userInfo" + seatInfo;
                    logger$atomicxcore_release3.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    logger$atomicxcore_release3.m88251a(0, message4);
                    VideoViewAdapter videoViewAdapter$atomicxcore_release2 = liveCoreView.getVideoViewAdapter();
                    view = videoViewAdapter$atomicxcore_release2 != null ? videoViewAdapter$atomicxcore_release2.createCoHostView(seatInfo, ViewLayer.FOREGROUND) : null;
                    if (view != null) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
                        C39510r c39510r2 = c40116c2.f89231d;
                        String message5 = "addCoHostView OID:" + c40116c2.f89228a + " view:" + view + " userInfo:" + seatInfo;
                        c39510r2.getClass();
                        Intrinsics.checkNotNullParameter(message5, "message");
                        c39510r2.m88251a(0, message5);
                        c40116c2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
            }
            liveCoreView.getForegroundViewMap$atomicxcore_release().put(m88429a(seatInfo), c40116c2);
            c40116c2.setTag(seatInfo);
            c40116c2.setElevation(liveCoreView.getElevationBaseline() + seatInfo.getRegion().getZorder());
            liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release().addView(c40116c2);
            return;
        }
        C39510r logger$atomicxcore_release4 = liveCoreView.getLogger();
        String message6 = "oid:" + liveCoreView.getOid() + ", addForegroundWidgetsView foregroundView has been added to foregroundViewMap. :foregroundView" + c40116c;
        logger$atomicxcore_release4.getClass();
        Intrinsics.checkNotNullParameter(message6, "message");
        logger$atomicxcore_release4.m88251a(0, message6);
    }

    /* JADX INFO: renamed from: d */
    public static final void m88443d(LiveCoreView liveCoreView, SeatInfo seatInfo) {
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", removeBackgroundWidgetsView:region" + seatInfo;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        C40114a c40114a = liveCoreView.getBackgroundViewMap$atomicxcore_release().get(m88429a(seatInfo));
        if (c40114a != null && liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release().indexOfChild(c40114a) != -1) {
            liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release().removeView(c40114a);
        }
        liveCoreView.getBackgroundViewMap$atomicxcore_release().remove(m88429a(seatInfo));
    }

    /* JADX INFO: renamed from: c */
    public static final void m88441c(LiveCoreView liveCoreView, SeatInfo seatInfo) {
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", addSeatRegionView:region" + seatInfo;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        m88432a(liveCoreView, seatInfo);
        C39510r logger$atomicxcore_release2 = liveCoreView.getLogger();
        String message2 = "oid:" + liveCoreView.getOid() + ", addVideoView:region" + seatInfo;
        logger$atomicxcore_release2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        logger$atomicxcore_release2.m88251a(0, message2);
        TUIVideoView tUIVideoViewM88427a = m88427a(liveCoreView, seatInfo.getUserInfo().getUserID(), seatInfo);
        if (Intrinsics.areEqual(TUIRoomEngineImpl.getSelfInfo().userId, seatInfo.getUserInfo().getUserID())) {
            TUIRoomEngine.sharedInstance().setLocalVideoView(tUIVideoViewM88427a);
        } else if (!TextUtils.isEmpty(seatInfo.getUserInfo().getUserID())) {
            TUIRoomEngine.sharedInstance().setRemoteVideoView(seatInfo.getUserInfo().getUserID(), TUIRoomDefine.VideoStreamType.CAMERA_STREAM, tUIVideoViewM88427a);
        }
        if (tUIVideoViewM88427a.getParent() != liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release()) {
            tUIVideoViewM88427a.setTag(seatInfo);
            liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().addView(tUIVideoViewM88427a);
        }
        m88438b(liveCoreView, seatInfo);
    }

    /* JADX INFO: renamed from: a */
    public static final void m88434a(LiveCoreView liveCoreView, C39763o1 c39763o1) throws Exception {
        BattleStore battleStore;
        Object c39733e1;
        Object objPutIfAbsent;
        SeatInfo seatInfo;
        C39763o1 lastSeatLayout$atomicxcore_release;
        List<SeatInfo> list;
        SeatInfo seatInfo2;
        boolean zM88317a = AbstractC39718Z0.m88317a(c39763o1);
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", updateSeatLayout,isFullScreenLayout:" + liveCoreView.getIsFullScreenLayout() + ",currentIsFullScreen:" + zM88317a;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        if (liveCoreView.getIsFullScreenLayout() != zM88317a) {
            m88431a(liveCoreView, liveCoreView.getLayoutMixStreamLayer$atomicxcore_release(), c39763o1);
            m88431a(liveCoreView, liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release(), c39763o1);
            m88431a(liveCoreView, liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release(), c39763o1);
            m88431a(liveCoreView, liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release(), c39763o1);
            m88431a(liveCoreView, liveCoreView.getLayoutBattleWidgetsLayerLayer$atomicxcore_release(), c39763o1);
            liveCoreView.requestLayout();
            liveCoreView.setFullScreenLayout$atomicxcore_release(zM88317a);
        }
        liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release().setTemplate(c39763o1);
        liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().setTemplate(c39763o1);
        liveCoreView.getLayoutForegroundWidgetsLayer$atomicxcore_release().setTemplate(c39763o1);
        if (liveCoreView.getLastSeatLayout() != null && (lastSeatLayout$atomicxcore_release = liveCoreView.getLastSeatLayout()) != null && (list = lastSeatLayout$atomicxcore_release.f88358b) != null) {
            for (SeatInfo seatInfo3 : list) {
                Iterator it = c39763o1.f88358b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        seatInfo2 = null;
                        break;
                    }
                    seatInfo2 = (SeatInfo) it.next();
                    if (seatInfo2.getIndex() == seatInfo3.getIndex() && Intrinsics.areEqual(seatInfo2.getUserInfo().getLiveID(), seatInfo3.getUserInfo().getLiveID())) {
                        break;
                    }
                }
                if (seatInfo2 == null) {
                    C39510r logger$atomicxcore_release2 = liveCoreView.getLogger();
                    String message2 = "oid:" + liveCoreView.getOid() + ", removeSeatRegionView:region" + seatInfo3;
                    logger$atomicxcore_release2.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    logger$atomicxcore_release2.m88251a(0, message2);
                    m88443d(liveCoreView, seatInfo3);
                    C39510r logger$atomicxcore_release3 = liveCoreView.getLogger();
                    String message3 = "oid:" + liveCoreView.getOid() + ", removeVideoView:region" + seatInfo3;
                    logger$atomicxcore_release3.getClass();
                    Intrinsics.checkNotNullParameter(message3, "message");
                    logger$atomicxcore_release3.m88251a(0, message3);
                    if (TextUtils.isEmpty(seatInfo3.getUserInfo().getUserID())) {
                        TUIVideoView tUIVideoView = liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().get(m88429a(seatInfo3));
                        if (tUIVideoView != null && liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().indexOfChild(tUIVideoView) != -1) {
                            liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().removeView(tUIVideoView);
                        }
                        liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().remove(m88429a(seatInfo3));
                    } else {
                        TUIVideoView tUIVideoView2 = liveCoreView.getTuiVideoViewMap$atomicxcore_release().get(seatInfo3.getUserInfo().getUserID());
                        if (tUIVideoView2 != null && liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().indexOfChild(tUIVideoView2) != -1) {
                            liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().removeView(tUIVideoView2);
                        }
                        liveCoreView.getTuiVideoViewMap$atomicxcore_release().remove(seatInfo3.getUserInfo().getUserID());
                    }
                    m88444e(liveCoreView, seatInfo3);
                }
            }
        }
        for (SeatInfo seatInfo4 : c39763o1.f88358b) {
            if (liveCoreView.getLastSeatLayout() != null) {
                C39763o1 lastSeatLayout$atomicxcore_release2 = liveCoreView.getLastSeatLayout();
                if ((lastSeatLayout$atomicxcore_release2 != null ? lastSeatLayout$atomicxcore_release2.f88358b : null) != null) {
                    C39763o1 lastSeatLayout$atomicxcore_release3 = liveCoreView.getLastSeatLayout();
                    Intrinsics.checkNotNull(lastSeatLayout$atomicxcore_release3);
                    Iterator it2 = lastSeatLayout$atomicxcore_release3.f88358b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            seatInfo = null;
                            break;
                        }
                        seatInfo = (SeatInfo) it2.next();
                        if (seatInfo.getIndex() == seatInfo4.getIndex() && Intrinsics.areEqual(seatInfo.getUserInfo().getLiveID(), seatInfo4.getUserInfo().getLiveID())) {
                            break;
                        }
                    }
                    C39510r logger$atomicxcore_release4 = liveCoreView.getLogger();
                    String message4 = "oid:" + liveCoreView.getOid() + ", updateSeatLayout,isSame:" + Intrinsics.areEqual(seatInfo, seatInfo4) + ",oldRegion:" + seatInfo + ",newRegion:" + seatInfo4;
                    logger$atomicxcore_release4.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    logger$atomicxcore_release4.m88251a(0, message4);
                    if (seatInfo == null) {
                        m88441c(liveCoreView, seatInfo4);
                    } else if (!(seatInfo4 != null ? Intrinsics.areEqual(seatInfo, seatInfo4) : false)) {
                        C39510r logger$atomicxcore_release5 = liveCoreView.getLogger();
                        String message5 = "oid:" + liveCoreView.getOid() + ", updateSeatRegionView:oldRegion" + seatInfo + ",newRegion:" + seatInfo4;
                        logger$atomicxcore_release5.getClass();
                        Intrinsics.checkNotNullParameter(message5, "message");
                        logger$atomicxcore_release5.m88251a(0, message5);
                        C39510r logger$atomicxcore_release6 = liveCoreView.getLogger();
                        String message6 = "oid:" + liveCoreView.getOid() + ", updateBackgroundWidgetsView:region" + seatInfo + ",newRegion:" + seatInfo4;
                        logger$atomicxcore_release6.getClass();
                        Intrinsics.checkNotNullParameter(message6, "message");
                        logger$atomicxcore_release6.m88251a(0, message6);
                        m88443d(liveCoreView, seatInfo);
                        m88432a(liveCoreView, seatInfo4);
                        C39510r logger$atomicxcore_release7 = liveCoreView.getLogger();
                        String message7 = "oid:" + liveCoreView.getOid() + ", updateVideoView:oldSeatInfo" + seatInfo + ",newSeatInfo:" + seatInfo4;
                        logger$atomicxcore_release7.getClass();
                        Intrinsics.checkNotNullParameter(message7, "message");
                        logger$atomicxcore_release7.m88251a(0, message7);
                        TUIVideoView tUIVideoViewM88427a = liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().get(m88429a(seatInfo));
                        if (tUIVideoViewM88427a == null) {
                            tUIVideoViewM88427a = liveCoreView.getTuiVideoViewMap$atomicxcore_release().get(seatInfo.getUserInfo().getUserID());
                        }
                        if (tUIVideoViewM88427a == null) {
                            tUIVideoViewM88427a = m88427a(liveCoreView, seatInfo4.getUserInfo().getUserID(), (SeatInfo) null);
                        }
                        if (Intrinsics.areEqual(TUIRoomEngineImpl.getSelfInfo().userId, seatInfo4.getUserInfo().getUserID())) {
                            TUIRoomEngine.sharedInstance().setLocalVideoView(tUIVideoViewM88427a);
                        } else {
                            TUIRoomEngine.sharedInstance().setRemoteVideoView(seatInfo4.getUserInfo().getUserID(), TUIRoomDefine.VideoStreamType.CAMERA_STREAM, tUIVideoViewM88427a);
                        }
                        liveCoreView.getTuiVideoViewMap$atomicxcore_release().put(seatInfo4.getUserInfo().getUserID(), tUIVideoViewM88427a);
                        if (!Intrinsics.areEqual(seatInfo.getRegion(), seatInfo4.getRegion())) {
                            tUIVideoViewM88427a.setTag(seatInfo4);
                            if (liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().indexOfChild(tUIVideoViewM88427a) != -1) {
                                liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().removeView(tUIVideoViewM88427a);
                            }
                            liveCoreView.getLayoutMultiStreamLayer$atomicxcore_release().addView(tUIVideoViewM88427a);
                        }
                        C39510r logger$atomicxcore_release8 = liveCoreView.getLogger();
                        String message8 = "oid:" + liveCoreView.getOid() + ", updateForegroundWidgetsView:region" + seatInfo + ",newRegion:" + seatInfo4;
                        logger$atomicxcore_release8.getClass();
                        Intrinsics.checkNotNullParameter(message8, "message");
                        logger$atomicxcore_release8.m88251a(0, message8);
                        m88444e(liveCoreView, seatInfo);
                        m88438b(liveCoreView, seatInfo4);
                    }
                }
            }
            m88441c(liveCoreView, seatInfo4);
        }
        liveCoreView.setLastSeatLayout$atomicxcore_release(c39763o1);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        String liveId = liveCoreView.getLiveId();
        if (Intrinsics.areEqual(BattleStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy2 = C39647d.f88068h;
            Object objM88293a = AbstractC39646c.m88293a();
            if (objM88293a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88293a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy3 = C39650g.f88077g;
            Object objM88294a = AbstractC39649f.m88294a();
            if (objM88294a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88294a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy4 = C39661r.f88102s;
            Object objM88298a = AbstractC39654k.m88298a();
            if (objM88298a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88298a;
        } else if (Intrinsics.areEqual(BattleStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy5 = C39695N0.f88198j;
            Object objM88331a = AbstractC39782w0.m88331a();
            if (objM88331a == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore");
            }
            battleStore = (BattleStore) objM88331a;
        } else {
            C39510r c39510r = c39772r1M88324a.f88380b;
            c39510r.m88251a(1, AbstractC39394d.m88223a(BattleStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r, "message"));
            ConcurrentHashMap concurrentHashMap = c39772r1M88324a.f88379a;
            Object concurrentHashMap2 = concurrentHashMap.get(liveId);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(liveId, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, BattleStore.class, "getName(...)");
            Object obj = map.get(strM88224a);
            if (obj == null) {
                String name = BattleStore.class.getName();
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
            battleStore = (BattleStore) obj;
        }
        if (battleStore.getBattleState().getBattleUsers().getValue().size() <= 1 || !liveCoreView.getIsBattleStartedWaitingSEI()) {
            return;
        }
        liveCoreView.setBattleStartedWaitingSEI$atomicxcore_release(false);
        battleStore.getBattleState().getCurrentBattleInfo().getValue();
        m88433a(liveCoreView, battleStore.getBattleState().getBattleUsers().getValue().get(0), battleStore.getBattleState().getBattleUsers().getValue().subList(1, battleStore.getBattleState().getBattleUsers().getValue().size()));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88432a(LiveCoreView liveCoreView, SeatInfo user) {
        View view;
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", addBackgroundWidgetsView:region" + user;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        C40114a c40114a = liveCoreView.getBackgroundViewMap$atomicxcore_release().get(m88429a(user));
        if (c40114a == null) {
            Context context = liveCoreView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C40114a c40114a2 = new C40114a(context, liveCoreView.getLiveId(), user);
            if (liveCoreView.getVideoViewAdapter() != null) {
                if (user.getUserInfo().getLiveID().equals(liveCoreView.getLiveId())) {
                    C39510r logger$atomicxcore_release2 = liveCoreView.getLogger();
                    String message2 = "oid:" + liveCoreView.getOid() + ", createCoGuestView BACKGROUND userInfo:" + user;
                    logger$atomicxcore_release2.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    logger$atomicxcore_release2.m88251a(0, message2);
                    VideoViewAdapter videoViewAdapter$atomicxcore_release = liveCoreView.getVideoViewAdapter();
                    view = videoViewAdapter$atomicxcore_release != null ? videoViewAdapter$atomicxcore_release.createCoGuestView(user, ViewLayer.BACKGROUND) : null;
                    if (view != null) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(user, "user");
                        C39510r c39510r = c40114a2.f89223b;
                        String message3 = "addCoGuestView OID:" + c40114a2.f89222a + " view:" + view + " userInfo:" + user;
                        c39510r.getClass();
                        Intrinsics.checkNotNullParameter(message3, "message");
                        c39510r.m88251a(0, message3);
                        c40114a2.f89224c = user;
                        c40114a2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                } else {
                    C39510r logger$atomicxcore_release3 = liveCoreView.getLogger();
                    String message4 = "oid:" + liveCoreView.getOid() + ", createCoHostView BACKGROUND userInfo:" + user;
                    logger$atomicxcore_release3.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    logger$atomicxcore_release3.m88251a(0, message4);
                    VideoViewAdapter videoViewAdapter$atomicxcore_release2 = liveCoreView.getVideoViewAdapter();
                    view = videoViewAdapter$atomicxcore_release2 != null ? videoViewAdapter$atomicxcore_release2.createCoHostView(user, ViewLayer.BACKGROUND) : null;
                    if (view != null) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(user, "user");
                        C39510r c39510r2 = c40114a2.f89223b;
                        String message5 = "addCoHostView OID:" + c40114a2.f89222a + " view:" + view + " userInfo:" + user;
                        c39510r2.getClass();
                        Intrinsics.checkNotNullParameter(message5, "message");
                        c39510r2.m88251a(0, message5);
                        c40114a2.f89224c = user;
                        c40114a2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
            }
            liveCoreView.getBackgroundViewMap$atomicxcore_release().put(m88429a(user), c40114a2);
            c40114a2.setTag(user);
            c40114a2.setElevation(liveCoreView.getElevationBaseline() + user.getRegion().getZorder());
            liveCoreView.getLayoutBackgroundWidgetsLayer$atomicxcore_release().addView(c40114a2);
            return;
        }
        C39510r logger$atomicxcore_release4 = liveCoreView.getLogger();
        String message6 = "oid:" + liveCoreView.getOid() + ", addBackgroundWidgetsView backgroundView has been added to mBackgroundViewMap. :backgroundView" + c40114a;
        logger$atomicxcore_release4.getClass();
        Intrinsics.checkNotNullParameter(message6, "message");
        logger$atomicxcore_release4.m88251a(0, message6);
    }

    /* JADX INFO: renamed from: a */
    public static final String m88429a(SeatInfo seatInfo) {
        if (seatInfo == null) {
            return "";
        }
        return seatInfo.getUserInfo().getLiveID() + '_' + seatInfo.getIndex();
    }

    /* JADX INFO: renamed from: a */
    public static final TUIVideoView m88427a(LiveCoreView liveCoreView, String userId, SeatInfo seatInfo) {
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", createTUIVideoViewByUserId userId:" + userId + ",seatInfo:" + seatInfo;
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
        if (TextUtils.isEmpty(userId)) {
            TUIVideoView tUIVideoView = liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().get(m88429a(seatInfo));
            if (tUIVideoView != null) {
                return tUIVideoView;
            }
            TUIVideoView tUIVideoView2 = new TUIVideoView(liveCoreView.getContext().getApplicationContext());
            liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().put(m88429a(seatInfo), tUIVideoView2);
            return tUIVideoView2;
        }
        TUIVideoView tUIVideoView3 = liveCoreView.getTuiVideoViewMap$atomicxcore_release().get(userId);
        if (tUIVideoView3 != null) {
            return tUIVideoView3;
        }
        TUIVideoView tUIVideoView4 = new TUIVideoView(liveCoreView.getContext().getApplicationContext());
        liveCoreView.getTuiVideoViewMap$atomicxcore_release().put(userId, tUIVideoView4);
        return tUIVideoView4;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88433a(LiveCoreView liveCoreView, SeatUserInfo inviter, List invitees) throws Exception {
        Class cls;
        String str;
        LiveSeatStore liveSeatStore;
        Object objPutIfAbsent;
        CoHostStore coHostStore;
        Object objPutIfAbsent2;
        String str2;
        View view;
        View view2;
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
        C39510r logger$atomicxcore_release = liveCoreView.getLogger();
        String message = "oid:" + liveCoreView.getOid() + ", onBattleStart";
        logger$atomicxcore_release.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger$atomicxcore_release.m88251a(0, message);
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
            str = TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW;
            cls = LiveAudienceStore.class;
        } else {
            cls = LiveAudienceStore.class;
            String name = LiveSeatStore.class.getName();
            str = TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW;
            if (Intrinsics.areEqual(name, BaseBeautyStore.class.getName())) {
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
                Object c39733e1 = map.get(strM88224a);
                if (c39733e1 == null) {
                    String name2 = LiveSeatStore.class.getName();
                    if (Intrinsics.areEqual(name2, BarrageStore.class.getName())) {
                        c39733e1 = new C39468e(liveId);
                    } else if (Intrinsics.areEqual(name2, BattleStore.class.getName())) {
                        c39733e1 = new C39767q(liveId);
                    } else if (Intrinsics.areEqual(name2, CoGuestStore.class.getName())) {
                        c39733e1 = new C39692M(liveId);
                    } else if (Intrinsics.areEqual(name2, CoHostStore.class.getName())) {
                        c39733e1 = new C39726c0(liveId);
                    } else if (Intrinsics.areEqual(name2, GiftStore.class.getName())) {
                        c39733e1 = new C39667f(liveId);
                    } else if (Intrinsics.areEqual(name2, LikeStore.class.getName())) {
                        c39733e1 = new C39744i0(liveId);
                    } else if (Intrinsics.areEqual(name2, cls.getName())) {
                        c39733e1 = new C39774s0(liveId);
                    } else if (Intrinsics.areEqual(name2, LiveSeatStore.class.getName())) {
                        c39733e1 = new C39716Y0(liveId);
                    } else {
                        if (!Intrinsics.areEqual(name2, LiveSummaryStore.class.getName())) {
                            throw new Exception("type is not supported");
                        }
                        c39733e1 = new C39733e1(liveId);
                    }
                    map.put(strM88224a, c39733e1);
                }
                liveSeatStore = (LiveSeatStore) c39733e1;
            }
        }
        C39772r1 c39772r1M88324a2 = AbstractC39769q1.m88324a();
        String liveId2 = liveCoreView.getLiveId();
        if (Intrinsics.areEqual(CoHostStore.class.getName(), AudioEffectStore.class.getName())) {
            Lazy lazy6 = C39647d.f88068h;
            Object objM88293a2 = AbstractC39646c.m88293a();
            if (objM88293a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88293a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), BaseBeautyStore.class.getName())) {
            Lazy lazy7 = C39650g.f88077g;
            Object objM88294a2 = AbstractC39649f.m88294a();
            if (objM88294a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88294a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), DeviceStore.class.getName())) {
            Lazy lazy8 = C39661r.f88102s;
            Object objM88298a2 = AbstractC39654k.m88298a();
            if (objM88298a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88298a2;
        } else if (Intrinsics.areEqual(CoHostStore.class.getName(), LiveListStore.class.getName())) {
            Lazy lazy9 = C39695N0.f88198j;
            Object objM88331a2 = AbstractC39782w0.m88331a();
            if (objM88331a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.CoHostStore");
            }
            coHostStore = (CoHostStore) objM88331a2;
        } else {
            C39510r c39510r2 = c39772r1M88324a2.f88380b;
            c39510r2.m88251a(1, AbstractC39394d.m88223a(CoHostStore.class, new StringBuilder("getStore "), " liveID is empty", c39510r2, "message"));
            ConcurrentHashMap concurrentHashMap3 = c39772r1M88324a2.f88379a;
            Object concurrentHashMap4 = concurrentHashMap3.get(liveId2);
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(liveId2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map2 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map2, CoHostStore.class, "getName(...)");
            Object c39733e2 = map2.get(strM88224a2);
            if (c39733e2 == null) {
                String name3 = CoHostStore.class.getName();
                if (Intrinsics.areEqual(name3, BarrageStore.class.getName())) {
                    c39733e2 = new C39468e(liveId2);
                } else if (Intrinsics.areEqual(name3, BattleStore.class.getName())) {
                    c39733e2 = new C39767q(liveId2);
                } else if (Intrinsics.areEqual(name3, CoGuestStore.class.getName())) {
                    c39733e2 = new C39692M(liveId2);
                } else if (Intrinsics.areEqual(name3, CoHostStore.class.getName())) {
                    c39733e2 = new C39726c0(liveId2);
                } else if (Intrinsics.areEqual(name3, GiftStore.class.getName())) {
                    c39733e2 = new C39667f(liveId2);
                } else if (Intrinsics.areEqual(name3, LikeStore.class.getName())) {
                    c39733e2 = new C39744i0(liveId2);
                } else if (Intrinsics.areEqual(name3, cls.getName())) {
                    c39733e2 = new C39774s0(liveId2);
                } else if (Intrinsics.areEqual(name3, LiveSeatStore.class.getName())) {
                    c39733e2 = new C39716Y0(liveId2);
                } else {
                    if (!Intrinsics.areEqual(name3, LiveSummaryStore.class.getName())) {
                        throw new Exception("type is not supported");
                    }
                    c39733e2 = new C39733e1(liveId2);
                }
                map2.put(strM88224a2, c39733e2);
            }
            coHostStore = (CoHostStore) c39733e2;
        }
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(inviter), (Iterable) invitees);
        if (liveSeatStore.getLiveSeatState().getSeatList().getValue().isEmpty()) {
            liveCoreView.setBattleStartedWaitingSEI$atomicxcore_release(true);
        }
        if (liveCoreView.getVideoViewAdapter() != null) {
            if (listPlus.isEmpty()) {
                C39510r logger$atomicxcore_release2 = liveCoreView.getLogger();
                String message2 = "oid:" + liveCoreView.getOid() + ", onBattleStart battleUserList is null";
                logger$atomicxcore_release2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                logger$atomicxcore_release2.m88251a(1, message2);
                return;
            }
            Iterator<SeatUserInfo> it = coHostStore.getCoHostState().getConnected().getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SeatUserInfo battleUserInfo = it.next();
                C40116c c40116c = liveCoreView.getForegroundViewMap$atomicxcore_release().get(m88429a(AbstractC39718Z0.m88316a(liveSeatStore, battleUserInfo.getUserID())));
                C39510r logger$atomicxcore_release3 = liveCoreView.getLogger();
                String message3 = "oid:" + liveCoreView.getOid() + ", createBattleView battleUser:" + battleUserInfo;
                logger$atomicxcore_release3.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                logger$atomicxcore_release3.m88251a(0, message3);
                Intrinsics.checkNotNullParameter(battleUserInfo, "battleUserInfo");
                TUILiveBattleManager.BattleUser user = new TUILiveBattleManager.BattleUser();
                user.roomId = battleUserInfo.getLiveID();
                user.userId = battleUserInfo.getUserID();
                user.userName = battleUserInfo.getUserName();
                user.avatarUrl = battleUserInfo.getAvatarURL();
                VideoViewAdapter videoViewAdapter$atomicxcore_release = liveCoreView.getVideoViewAdapter();
                View viewCreateBattleView = videoViewAdapter$atomicxcore_release != null ? videoViewAdapter$atomicxcore_release.createBattleView(new SeatInfo(0, false, battleUserInfo, null, 11, null)) : null;
                if (c40116c != null && viewCreateBattleView != null) {
                    str2 = str;
                    Intrinsics.checkNotNullParameter(viewCreateBattleView, str2);
                    Intrinsics.checkNotNullParameter(user, "user");
                    C39510r c39510r3 = c40116c.f89231d;
                    String message4 = "addBattleView OID:" + c40116c.f89228a + " view:" + viewCreateBattleView + " userInfo:" + user;
                    c39510r3.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    c39510r3.m88251a(0, message4);
                    WeakReference weakReference = c40116c.f89230c;
                    if ((weakReference != null ? (View) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = c40116c.f89230c;
                        if (((weakReference2 == null || (view2 = (View) weakReference2.get()) == null) ? null : view2.getParent()) != null) {
                            WeakReference weakReference3 = c40116c.f89230c;
                            if (Intrinsics.areEqual((weakReference3 == null || (view = (View) weakReference3.get()) == null) ? null : view.getParent(), c40116c)) {
                                WeakReference weakReference4 = c40116c.f89230c;
                                c40116c.removeView(weakReference4 != null ? (View) weakReference4.get() : null);
                            }
                        }
                    }
                    c40116c.f89229b = user;
                    c40116c.f89230c = new WeakReference(viewCreateBattleView);
                    c40116c.addView(viewCreateBattleView, new FrameLayout.LayoutParams(-1, -1));
                } else {
                    str2 = str;
                    C39510r logger$atomicxcore_release4 = liveCoreView.getLogger();
                    String message5 = "oid:" + liveCoreView.getOid() + ", createBattleView battleUser:" + battleUserInfo + ",foregroundView:#" + c40116c + ",battleView#" + viewCreateBattleView;
                    logger$atomicxcore_release4.getClass();
                    Intrinsics.checkNotNullParameter(message5, "message");
                    logger$atomicxcore_release4.m88251a(0, message5);
                }
                str = str2;
            }
            String str3 = str;
            C39510r logger$atomicxcore_release5 = liveCoreView.getLogger();
            String message6 = "oid:" + liveCoreView.getOid() + ", createBattleContainerView";
            logger$atomicxcore_release5.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            logger$atomicxcore_release5.m88251a(0, message6);
            VideoViewAdapter videoViewAdapter$atomicxcore_release2 = liveCoreView.getVideoViewAdapter();
            View viewCreateBattleContainerView = videoViewAdapter$atomicxcore_release2 != null ? videoViewAdapter$atomicxcore_release2.createBattleContainerView() : null;
            if (viewCreateBattleContainerView != null) {
                LiveCanvas value = liveSeatStore.getLiveSeatState().getCanvas().getValue();
                List<SeatInfo> value2 = liveSeatStore.getLiveSeatState().getSeatList().getValue();
                C39763o1 seatLayout = new C39763o1(value, value2);
                C40115b layoutBattleWidgetsLayerLayer$atomicxcore_release = liveCoreView.getLayoutBattleWidgetsLayerLayer$atomicxcore_release();
                layoutBattleWidgetsLayerLayer$atomicxcore_release.getClass();
                Intrinsics.checkNotNullParameter(viewCreateBattleContainerView, str3);
                Intrinsics.checkNotNullParameter(seatLayout, "seatLayout");
                layoutBattleWidgetsLayerLayer$atomicxcore_release.removeAllViews();
                Rect rect = new Rect();
                rect.left = Integer.MAX_VALUE;
                rect.top = Integer.MAX_VALUE;
                rect.right = 0;
                rect.bottom = 0;
                for (SeatInfo seatInfo : value2) {
                    rect.left = Math.min(rect.left, seatInfo.getRegion().getX());
                    rect.top = Math.min(rect.top, seatInfo.getRegion().getY());
                    rect.right = Math.max(rect.right, seatInfo.getRegion().getW() + seatInfo.getRegion().getX());
                    rect.bottom = Math.max(rect.bottom, seatInfo.getRegion().getH() + seatInfo.getRegion().getY());
                }
                float w11 = layoutBattleWidgetsLayerLayer$atomicxcore_release.f89227c / seatLayout.f88357a.getW();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (rect.width() * w11), (int) (rect.height() * w11));
                layoutParams.topMargin = (int) (rect.top * w11);
                layoutParams.leftMargin = (int) (rect.left * w11);
                C39510r c39510r4 = layoutBattleWidgetsLayerLayer$atomicxcore_release.f89226b;
                String message7 = "addFillScreenView OID:" + layoutBattleWidgetsLayerLayer$atomicxcore_release.f89225a + " l:" + layoutParams.leftMargin + ",t:" + layoutParams.topMargin + ",w:" + layoutParams.width + ",h:" + layoutParams.height;
                c39510r4.getClass();
                Intrinsics.checkNotNullParameter(message7, "message");
                c39510r4.m88251a(0, message7);
                layoutBattleWidgetsLayerLayer$atomicxcore_release.addView(viewCreateBattleContainerView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88430a(LiveCoreView liveCoreView) {
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        String mixStreamUserId = liveCoreView.getLayoutMixStreamLayer$atomicxcore_release().getMixStreamUserId();
        if (!TextUtils.isEmpty(mixStreamUserId)) {
            TUIRoomEngine.sharedInstance().setRemoteVideoView(mixStreamUserId, TUIRoomDefine.VideoStreamType.CAMERA_STREAM, null);
        }
        if (!liveCoreView.getTuiVideoViewMap$atomicxcore_release().isEmpty()) {
            for (String str : liveCoreView.getTuiVideoViewMap$atomicxcore_release().keySet()) {
                if (Intrinsics.areEqual(str, TUIRoomEngine.getSelfInfo().userId)) {
                    TUIRoomEngine.sharedInstance().setLocalVideoView(null);
                } else {
                    TUIRoomEngine.sharedInstance().setRemoteVideoView(str, TUIRoomDefine.VideoStreamType.CAMERA_STREAM, null);
                }
            }
            liveCoreView.getTuiVideoViewMap$atomicxcore_release().clear();
        }
        if (liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().isEmpty()) {
            return;
        }
        liveCoreView.getVideoPlaceHolderMap$atomicxcore_release().clear();
    }

    /* JADX INFO: renamed from: a */
    public static final void m88435a(LiveCoreView liveCoreView, String userId, TUIRoomDefine.VideoStreamType streamType, boolean z11) {
        Intrinsics.checkNotNullParameter(liveCoreView, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        boolean zContains$default = StringsKt.contains$default((CharSequence) userId, (CharSequence) "_feedback_", false, 2, (Object) null);
        if (Intrinsics.areEqual(userId, TUIRoomEngine.getSelfInfo().userId)) {
            return;
        }
        if (z11) {
            if (zContains$default) {
                TUIRoomEngine.sharedInstance().setRemoteVideoView(userId, TUIRoomDefine.VideoStreamType.CAMERA_STREAM, liveCoreView.getLayoutMixStreamLayer$atomicxcore_release().getTUIVideoView());
                liveCoreView.getLayoutMixStreamLayer$atomicxcore_release().setMixStreamUserId(userId);
                TUIRoomEngine.sharedInstance().muteRemoteAudioStream(userId, false);
            } else {
                TUIVideoView tUIVideoViewM88427a = liveCoreView.getTuiVideoViewMap$atomicxcore_release().get(userId);
                if (tUIVideoViewM88427a == null) {
                    tUIVideoViewM88427a = m88427a(liveCoreView, userId, (SeatInfo) null);
                }
                TUIRoomEngine.sharedInstance().setRemoteVideoView(userId, TUIRoomDefine.VideoStreamType.CAMERA_STREAM, tUIVideoViewM88427a);
            }
            TUIRoomEngine.sharedInstance().startPlayRemoteVideo(userId, TUIRoomDefine.VideoStreamType.CAMERA_STREAM, new C40057H(liveCoreView));
            return;
        }
        TUIRoomEngine.sharedInstance().stopPlayRemoteVideo(userId, TUIRoomDefine.VideoStreamType.CAMERA_STREAM);
    }
}
