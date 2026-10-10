package ee0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.MediaStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.ViewStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.observer.RoomEngineObserver;
import de0.InterfaceC36664a;
import fe0.C37438a;
import fe0.C37439b;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleState;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostState;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListState;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ee0.f */
/* JADX INFO: compiled from: AudienceStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u0006\u00102\u001a\u00020*J\u0006\u00103\u001a\u00020\u0007J\u0006\u00104\u001a\u00020\tJ\u0006\u00105\u001a\u00020\rJ\u0006\u00106\u001a\u00020\u0011J\u0006\u00107\u001a\u00020\u0013J\u0006\u00108\u001a\u00020\u0015J\u0006\u00109\u001a\u00020\u000fJ\u0006\u0010:\u001a\u00020\u0017J\u0006\u0010;\u001a\u00020\u001bJ\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020FJ\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020$J\u000e\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020\u0003J\u0006\u0010Q\u001a\u00020*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006S"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "", "liveID", "", "<init>", "(Ljava/lang/String;)V", "liveListStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "deviceStore", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;", "roomEngine", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;", "liveSeatStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;", "audienceStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "coGuestStore", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;", "coHostStore", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;", "battleStore", "Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;", "imStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;", "mediaStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;", "viewStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;", "roomEngineObserver", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/RoomEngineObserver;", "audienceViewListenerList", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceViewListenerList;", "audienceContainerViewListenerList", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceContainerViewListenerList;", "_liveInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "audienceState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceState;", "getAudienceState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceState;", "setAudienceContainerViewListenerList", "", "viewListenerList", "addObserver", "removeObserver", "addAudienceViewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "removeAudienceViewListener", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getLiveListStore", "getDeviceStore", "getLiveSeatStore", "getCoGuestStore", "getCoHostStore", "getBattleStore", "getLiveAudienceStore", "getIMStore", "getViewStore", "getMediaStore", "getLiveListState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;", "getLiveSeatState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "getCoGuestState", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "getCoHostState", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;", "getBattleState", "Lio/trtc/tuikit/atomicxcore/api/live/BattleState;", "getIMState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;", "getViewState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", "getMediaState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", "updateLiveInfo", "liveInfo", "notifyOnRoomDismissed", "roomId", "notifyPictureInPictureClick", "AudienceViewListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAudienceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceStore.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n*S KotlinDebug\n*F\n+ 1 AudienceStore.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore\n*L\n159#1:187,5\n*E\n"})
public final class C37144f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveListStore f82419a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeviceStore f82420b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TUIRoomEngine f82421c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final LiveSeatStore f82422d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final LiveAudienceStore f82423e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final CoGuestStore f82424f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final CoHostStore f82425g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final BattleStore f82426h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final IMStore f82427i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final MediaStore f82428j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ViewStore f82429k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final RoomEngineObserver f82430l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37439b f82431m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C37438a f82432n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC41669n<LiveInfo> f82433o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final AudienceState f82434p;

    /* JADX INFO: renamed from: ee0.f$a */
    /* JADX INFO: compiled from: AudienceStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "", "onRoomDismissed", "", "roomId", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        void onRoomDismissed(@NotNull String roomId);
    }

    public C37144f(@NotNull String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        this.f82419a = LiveListStore.INSTANCE.shared();
        this.f82420b = DeviceStore.INSTANCE.shared();
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(tUIRoomEngineSharedInstance, "sharedInstance(...)");
        this.f82421c = tUIRoomEngineSharedInstance;
        InterfaceC41669n<LiveInfo> interfaceC41669nM91009a = C41679x.m91009a(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        this.f82433o = interfaceC41669nM91009a;
        this.f82434p = new AudienceState(interfaceC41669nM91009a);
        this.f82422d = LiveSeatStore.INSTANCE.create(liveID);
        this.f82424f = CoGuestStore.INSTANCE.create(liveID);
        this.f82425g = CoHostStore.INSTANCE.create(liveID);
        this.f82426h = BattleStore.INSTANCE.create(liveID);
        this.f82423e = LiveAudienceStore.INSTANCE.create(liveID);
        this.f82429k = new ViewStore(liveID);
        this.f82427i = new IMStore();
        this.f82428j = new MediaStore(liveID);
        this.f82430l = new RoomEngineObserver(this);
        this.f82431m = new C37439b();
    }

    /* JADX INFO: renamed from: A */
    public static final void m83075A(InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.mo81734f();
    }

    /* JADX INFO: renamed from: x */
    public static final void m83079x(String str, a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onRoomDismissed(str);
    }

    /* JADX INFO: renamed from: y */
    public static final void m83080y(String str, LiveUserInfo liveUserInfo, InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.mo81735m(str, liveUserInfo.getUserName(), liveUserInfo.getAvatarURL());
    }

    /* JADX INFO: renamed from: B */
    public final void m83081B(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82431m.m84234d(listener);
    }

    /* JADX INFO: renamed from: C */
    public final void m83082C() {
        this.f82421c.removeObserver(this.f82430l);
        this.f82431m.m84232b();
    }

    /* JADX INFO: renamed from: D */
    public final void m83083D(@NotNull C37438a viewListenerList) {
        Intrinsics.checkNotNullParameter(viewListenerList, "viewListenerList");
        this.f82432n = viewListenerList;
    }

    /* JADX INFO: renamed from: E */
    public final void m83084E(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        InterfaceC41669n<LiveInfo> interfaceC41669n = this.f82433o;
        while (!interfaceC41669n.compareAndSet(interfaceC41669n.getValue(), liveInfo)) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m83085d(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82431m.m84231a(listener);
    }

    /* JADX INFO: renamed from: e */
    public final void m83086e() {
        this.f82421c.addObserver(this.f82430l);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final BattleState m83087f() {
        return this.f82426h.getBattleState();
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BattleStore getF82426h() {
        return this.f82426h;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final CoGuestState m83089h() {
        return this.f82424f.getCoGuestState();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CoGuestStore getF82424f() {
        return this.f82424f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final CoHostState m83091j() {
        return this.f82425g.getCoHostState();
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final DeviceStore getF82420b() {
        return this.f82420b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final IMState m83093l() {
        return this.f82427i.getF78557d();
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final IMStore getF82427i() {
        return this.f82427i;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final LiveAudienceStore getF82423e() {
        return this.f82423e;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveListState m83096o() {
        return this.f82419a.getLiveState();
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final LiveListStore getF82419a() {
        return this.f82419a;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveSeatState m83098q() {
        return this.f82422d.getLiveSeatState();
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final LiveSeatStore getF82422d() {
        return this.f82422d;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MediaState m83100s() {
        return this.f82428j.getF78584i();
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final MediaStore getF82428j() {
        return this.f82428j;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ViewState m83102u() {
        return this.f82429k.getF78596j();
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final ViewStore getF82429k() {
        return this.f82429k;
    }

    /* JADX INFO: renamed from: w */
    public final void m83104w(@NotNull final String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f82431m.m84233c(new C37439b.a() { // from class: ee0.c
            @Override // fe0.C37439b.a
            /* JADX INFO: renamed from: a */
            public final void mo83073a(C37144f.a aVar) {
                C37144f.m83079x(roomId, aVar);
            }
        });
        C37438a c37438a = this.f82432n;
        if (c37438a != null) {
            final LiveUserInfo liveOwner = this.f82434p.m83072a().getValue().getLiveOwner();
            c37438a.m84229b(new C37438a.a() { // from class: ee0.d
                @Override // fe0.C37438a.a
                /* JADX INFO: renamed from: a */
                public final void mo83074a(InterfaceC36664a interfaceC36664a) {
                    C37144f.m83080y(roomId, liveOwner, interfaceC36664a);
                }
            });
            m83084E(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m83105z() {
        C37438a c37438a = this.f82432n;
        if (c37438a != null) {
            c37438a.m84229b(new C37438a.a() { // from class: ee0.e
                @Override // fe0.C37438a.a
                /* JADX INFO: renamed from: a */
                public final void mo83074a(InterfaceC36664a interfaceC36664a) {
                    C37144f.m83075A(interfaceC36664a);
                }
            });
        }
    }
}
