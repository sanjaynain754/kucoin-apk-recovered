package com.trtc.uikit.livekit.features.anchorboardcast.store;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorBoardcastState;
import com.trtc.uikit.livekit.features.anchorboardcast.AnchorViewListener;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryData;
import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryStore;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wd0.AnchorBattleState;
import wd0.AnchorCoHostState;
import wd0.AnchorState;
import wd0.C45802f;
import wd0.C45804h;
import wd0.C45812p;
import wd0.MediaState;
import wd0.UserState;
import xd0.C46151a;
import yd0.C46468a;
import yd0.C46469b;

/* JADX INFO: compiled from: AnchorStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 Q2\u00020\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020\u0015J\u0006\u0010*\u001a\u00020\u0017J\u0006\u0010+\u001a\u00020\u0019J\u0006\u0010,\u001a\u00020\u001bJ\u0006\u0010-\u001a\u00020\rJ\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\tJ\u000e\u00108\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u00109\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020#J\u000e\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020%2\b\u0010B\u001a\u0004\u0018\u00010CJ\b\u0010D\u001a\u00020%H\u0002J\u0006\u0010E\u001a\u00020%J\u0010\u0010F\u001a\u00020%2\b\b\u0002\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020%2\u0006\u0010J\u001a\u00020KJ\u0014\u0010M\u001a\u00020%2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OR$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "_lockAudioUserList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "_lockVideoUserList", "state", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;", "liveAudienceStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "liveSummaryStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "userStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;", "mediaStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;", "anchorCoHostStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;", "anchorBattleStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;", "listenerDispatcher", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/dispatcher/AnchorViewListenerDispatcher;", "roomEngineObserver", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/RoomEngineObserver;", "imFriendshipListener", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/IMFriendshipListener;", "externalState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorBoardcastState;", "addObserver", "", "removeObserver", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getLiveAudienceStore", "getUserStore", "getMediaStore", "getAnchorCoHostStore", "getAnchorBattleStore", "getState", "getCoHostState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "getBattleState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "getUserState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "getMediaState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", "setRoomId", "roomId", "initCreateRoomState", "updateRoomState", "enablePipMode", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "getExternalState", "setExternalState", "messageCount", "", "setLiveStatisticsData", "data", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;", "initExternalState", "notifyPictureInPictureClick", "notifyRoomExit", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "addAnchorViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorViewListener;", "removeAnchorViewListener", "onSeatLockStateChanged", "seatList", "", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnchorStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,246:1\n230#2,5:247\n230#2,5:252\n*S KotlinDebug\n*F\n+ 1 AnchorStore.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore\n*L\n235#1:247,5\n243#1:252,5\n*E\n"})
public final class AnchorStore {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f78167o = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<LinkedHashSet<String>> f78168a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<LinkedHashSet<String>> f78169b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AnchorState f78170c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public LiveAudienceStore f78171d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public LiveSummaryStore f78172e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final LiveKitLogger f78173f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C45812p f78174g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final MediaStore f78175h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C45802f f78176i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AnchorBattleStore f78177j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final C46151a f78178k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final C46469b f78179l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C46468a f78180m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AnchorBoardcastState f78181n;

    /* JADX INFO: compiled from: AnchorStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore$Companion;", "", "<init>", "()V", "disableHeaderLiveData", "", "disable", "", "disableHeaderVisitorCnt", "disableFooterCoGuest", "disableFooterCoHost", "disableFooterBattle", "disableFooterSoundEffect", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void disableFooterBattle(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101154a().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101154a().setValue(Boolean.valueOf(disable));
        }

        public final void disableFooterCoGuest(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101155b().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101155b().setValue(Boolean.valueOf(disable));
        }

        public final void disableFooterCoHost(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101156c().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101156c().setValue(Boolean.valueOf(disable));
        }

        public final void disableFooterSoundEffect(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101157d().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101157d().setValue(Boolean.valueOf(disable));
        }

        public final void disableHeaderLiveData(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101158e().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101158e().setValue(Boolean.valueOf(disable));
        }

        public final void disableHeaderVisitorCnt(boolean disable) {
            C45804h c45804h = C45804h.f103238a;
            if (c45804h.m101159f().getValue().booleanValue() == disable) {
                return;
            }
            c45804h.m101159f().setValue(Boolean.valueOf(disable));
        }
    }

    public AnchorStore(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        InterfaceC41669n<LinkedHashSet<String>> interfaceC41669nM91009a = C41679x.m91009a(new LinkedHashSet());
        this.f78168a = interfaceC41669nM91009a;
        InterfaceC41669n<LinkedHashSet<String>> interfaceC41669nM91009a2 = C41679x.m91009a(new LinkedHashSet());
        this.f78169b = interfaceC41669nM91009a2;
        this.f78170c = new AnchorState(liveInfo.getLiveID(), liveInfo, interfaceC41669nM91009a, interfaceC41669nM91009a2);
        this.f78173f = LiveKitLogger.f77564c.getFeaturesLogger("AnchorStore");
        this.f78174g = new C45812p();
        MediaStore mediaStore = new MediaStore();
        this.f78175h = mediaStore;
        this.f78176i = new C45802f(liveInfo);
        this.f78177j = new AnchorBattleStore(liveInfo);
        this.f78178k = new C46151a();
        this.f78179l = new C46469b(this);
        this.f78180m = new C46468a(this);
        m80227d();
        m80224D(liveInfo.getLiveID());
        this.f78171d = LiveAudienceStore.INSTANCE.create(liveInfo.getLiveID());
        this.f78172e = LiveSummaryStore.INSTANCE.create(liveInfo.getLiveID());
        mediaStore.m80257j();
        mediaStore.m80253f(true);
        m80241r(liveInfo);
        this.f78181n = new AnchorBoardcastState();
        m80242s();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m80218u(AnchorViewListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.mo80184u();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m80219w(AnchorStore anchorStore, LiveEndedReason liveEndedReason, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            liveEndedReason = LiveEndedReason.ENDED_BY_HOST;
        }
        anchorStore.m80244v(liveEndedReason);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m80220x(AnchorStore anchorStore, AnchorViewListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.mo80185w(anchorStore.f78181n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m80222B(int i11) {
        this.f78181n.m80178g(System.currentTimeMillis() - this.f78170c.getLiveInfo().getCreateTime());
        this.f78181n.m80182k(i11);
    }

    /* JADX INFO: renamed from: C */
    public final void m80223C(@Nullable TUILiveListManager.LiveStatisticsData liveStatisticsData) {
        if (liveStatisticsData == null) {
            return;
        }
        this.f78181n.m80183l(liveStatisticsData.totalViewers);
        this.f78181n.m80180i(liveStatisticsData.totalUniqueGiftSenders);
        this.f78181n.m80179h(liveStatisticsData.totalGiftCoins);
        this.f78181n.m80181j(liveStatisticsData.totalLikesReceived);
    }

    /* JADX INFO: renamed from: D */
    public final void m80224D(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f78170c.m101165f(roomId);
        this.f78173f.m79404b(hashCode() + " setRoomId:[mRoomId=" + roomId + "],mLiveObserver:" + this.f78179l.hashCode() + ']');
    }

    /* JADX INFO: renamed from: E */
    public final void m80225E(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78170c.m101164e(liveInfo);
    }

    /* JADX INFO: renamed from: c */
    public final void m80226c(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78178k.m101743a(listener);
    }

    /* JADX INFO: renamed from: f */
    public final void m80229f(boolean z11) {
        this.f78175h.m80254g(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final AnchorBattleStore getF78177j() {
        return this.f78177j;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final C45802f getF78176i() {
        return this.f78176i;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final AnchorBoardcastState getF78181n() {
        return this.f78181n;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final LiveAudienceStore getF78171d() {
        return this.f78171d;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final MediaStore getF78175h() {
        return this.f78175h;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final AnchorState getF78170c() {
        return this.f78170c;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final C45812p getF78174g() {
        return this.f78174g;
    }

    /* JADX INFO: renamed from: r */
    public final void m80241r(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78173f.m79404b("initCreateRoomState roomId [roomId: " + liveInfo.getLiveID() + ", roomName:" + liveInfo.getLiveName());
        this.f78170c.m101165f(liveInfo.getLiveID());
    }

    /* JADX INFO: renamed from: s */
    public final void m80242s() {
        this.f78181n.m80178g(0L);
        this.f78181n.m80183l(0L);
        this.f78181n.m80182k(0L);
    }

    /* JADX INFO: renamed from: t */
    public final void m80243t() {
        this.f78178k.m101745c(new Function1() { // from class: wd0.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorStore.m80218u((AnchorViewListener) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m80244v(@NotNull LiveEndedReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason == LiveEndedReason.ENDED_BY_SERVER) {
            LiveSummaryData value = this.f78172e.getLiveSummaryState().getSummaryData().getValue();
            this.f78181n.m80183l(value.getTotalViewers());
            this.f78181n.m80178g(value.getTotalDuration());
            this.f78181n.m80182k(value.getTotalMessageSent());
            this.f78181n.m80179h(value.getTotalGiftCoins());
            this.f78181n.m80180i(value.getTotalGiftUniqueSenders());
            this.f78181n.m80181j(value.getTotalLikesReceived());
        }
        this.f78178k.m101745c(new Function1() { // from class: wd0.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorStore.m80220x(this.f103249b, (AnchorViewListener) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m80245y(@NotNull List<? extends TUIRoomDefine.SeatFullInfo> seatList) {
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        HashMap map = new HashMap();
        for (TUIRoomDefine.SeatFullInfo seatFullInfo : seatList) {
            if (!TextUtils.isEmpty(seatFullInfo.userId)) {
                map.put(seatFullInfo.userId, seatFullInfo);
                LinkedHashSet<String> value = this.f78170c.m101161b().getValue();
                if (seatFullInfo.userMicrophoneStatus == TUIRoomDefine.DeviceStatus.CLOSED_BY_ADMIN) {
                    value.add(seatFullInfo.userId);
                } else {
                    value.remove(seatFullInfo.userId);
                }
                InterfaceC41669n<LinkedHashSet<String>> interfaceC41669n = this.f78168a;
                while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), value)) {
                }
                LinkedHashSet<String> value2 = this.f78170c.m101162c().getValue();
                if (seatFullInfo.userCameraStatus == TUIRoomDefine.DeviceStatus.CLOSED_BY_ADMIN) {
                    value2.add(seatFullInfo.userId);
                } else {
                    value2.remove(seatFullInfo.userId);
                }
                InterfaceC41669n<LinkedHashSet<String>> interfaceC41669n2 = this.f78169b;
                while (!interfaceC41669n2.compareAndSet(interfaceC41669n2.getValue(), value2)) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m80246z(@NotNull AnchorViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78178k.m101746d(listener);
    }

    /* JADX INFO: renamed from: A */
    public final void m80221A() {
        TUIRoomEngine.sharedInstance().removeObserver(this.f78179l);
        V2TIMManager.getFriendshipManager().removeFriendListener(this.f78180m);
    }

    /* JADX INFO: renamed from: d */
    public final void m80227d() {
        TUIRoomEngine.sharedInstance().addObserver(this.f78179l);
        V2TIMManager.getFriendshipManager().addFriendListener(this.f78180m);
    }

    /* JADX INFO: renamed from: e */
    public final void m80228e() {
        m80221A();
        this.f78175h.m80251d();
        this.f78177j.m80195e();
        this.f78178k.m101744b();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final AnchorBattleState m80232i() {
        return getF78177j().getF78164i();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final AnchorCoHostState m80233j() {
        return getF78176i().getF103236c();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final MediaState m80236m() {
        return getF78175h().getF78188e();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final UserState m80239p() {
        return getF78174g().getF103271c();
    }
}
