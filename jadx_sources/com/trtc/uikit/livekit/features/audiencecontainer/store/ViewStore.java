package com.trtc.uikit.livekit.features.audiencecontainer.store;

import android.os.Handler;
import android.os.Looper;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.features.audiencecontainer.store.ViewStore;
import ee0.ViewState;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;", "", "liveID", "", "<init>", "(Ljava/lang/String;)V", "mainHandler", "Landroid/os/Handler;", "coGuestState", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "battleListener", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$BattleEventListener;", "liveBattleStore", "Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;", "_isApplyingToTakeSeat", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_openCameraAfterTakeSeat", "_isOnDisplayResult", "_durationCountDown", "", "viewState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", "getViewState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "updateTakeSeatState", "isApplying", "updateOpenCameraAfterTakeSeatState", "isOpen", "resetOnDisplayResult", "BattleEventListener", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ViewStore {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f78586k = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f78587a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Handler f78588b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CoGuestState f78589c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C36204a f78590d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final BattleStore f78591e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC41669n<Boolean> f78592f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41669n<Boolean> f78593g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41669n<Boolean> f78594h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC41669n<Integer> f78595i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ViewState f78596j;

    /* JADX INFO: compiled from: ViewStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$Companion;", "", "<init>", "()V", "BATTLE_END_INFO_DURATION", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.store.ViewStore$a */
    /* JADX INFO: compiled from: ViewStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore$BattleEventListener;", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;)V", "onBattleEnded", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C36204a extends BattleListener {
        public C36204a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleEnded(@NotNull BattleInfo battleInfo, @Nullable BattleEndedReason reason) {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            if (ViewStore.this.f78589c.getConnected().getValue().isEmpty()) {
                ViewStore.this.f78594h.setValue(null);
                return;
            }
            ViewStore.this.f78594h.setValue(Boolean.TRUE);
            Handler handler = ViewStore.this.f78588b;
            final ViewStore viewStore = ViewStore.this;
            handler.postDelayed(new Runnable() { // from class: ee0.k
                @Override // java.lang.Runnable
                public final void run() {
                    ViewStore.C36204a.m80792b(viewStore);
                }
            }, 5000L);
        }

        /* JADX INFO: renamed from: b */
        public static final void m80792b(ViewStore viewStore) {
            viewStore.f78594h.setValue(Boolean.FALSE);
        }
    }

    public ViewStore(@NotNull String liveID) throws Exception {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        this.f78587a = liveID;
        this.f78588b = new Handler(Looper.getMainLooper());
        this.f78589c = CoGuestStore.INSTANCE.create(liveID).getCoGuestState();
        C36204a c36204a = new C36204a();
        this.f78590d = c36204a;
        BattleStore battleStoreCreate = BattleStore.INSTANCE.create(liveID);
        this.f78591e = battleStoreCreate;
        Boolean bool = Boolean.FALSE;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a = C41679x.m91009a(bool);
        this.f78592f = interfaceC41669nM91009a;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a2 = C41679x.m91009a(bool);
        this.f78593g = interfaceC41669nM91009a2;
        InterfaceC41669n<Boolean> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f78594h = interfaceC41669nM91009a3;
        InterfaceC41669n<Integer> interfaceC41669nM91009a4 = C41679x.m91009a(0);
        this.f78595i = interfaceC41669nM91009a4;
        this.f78596j = new ViewState(interfaceC41669nM91009a, interfaceC41669nM91009a3, interfaceC41669nM91009a2, interfaceC41669nM91009a4);
        battleStoreCreate.addBattleListener(c36204a);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ViewState getF78596j() {
        return this.f78596j;
    }

    /* JADX INFO: renamed from: e */
    public final void m80788e() {
        if (Intrinsics.areEqual(Boolean.TRUE, this.f78594h.getValue())) {
            this.f78594h.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m80789f(boolean z11) {
        this.f78593g.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: g */
    public final void m80790g(boolean z11) {
        this.f78592f.setValue(Boolean.valueOf(z11));
    }
}
