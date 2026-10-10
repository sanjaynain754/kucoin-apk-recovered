package wd0;

import io.trtc.tuikit.atomicxcore.api.live.BattleConfig;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.a, reason: from toString */
/* JADX INFO: compiled from: AnchorBattleStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J«\u0001\u0010/\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\"\"\u0004\b#\u0010$¨\u00064"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "", "battledUsers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "sentBattleRequests", "", "receivedBattleRequest", "isInWaiting", "", "isBattleRunning", "isOnDisplayResult", "durationCountDown", "", "battleConfig", "Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;", "battleId", "isShowingStartView", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;Ljava/lang/String;Z)V", "getBattledUsers", "()Lkotlinx/coroutines/flow/StateFlow;", "getSentBattleRequests", "getReceivedBattleRequest", "getDurationCountDown", "getBattleConfig", "()Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;", "setBattleConfig", "(Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;)V", "getBattleId", "()Ljava/lang/String;", "setBattleId", "(Ljava/lang/String;)V", "()Z", "setShowingStartView", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AnchorBattleState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41678w<List<BattleUser>> battledUsers;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC41678w<List<String>> sentBattleRequests;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC41678w<BattleUser> receivedBattleRequest;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isInWaiting;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isBattleRunning;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isOnDisplayResult;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Integer> durationCountDown;

    /* JADX INFO: renamed from: h, reason: from toString */
    @NotNull
    public BattleConfig battleConfig;

    /* JADX INFO: renamed from: i, reason: from toString */
    @NotNull
    public String battleId;

    /* JADX INFO: renamed from: j, reason: from toString */
    public boolean isShowingStartView;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorBattleState)) {
            return false;
        }
        AnchorBattleState anchorBattleState = (AnchorBattleState) other;
        return Intrinsics.areEqual(this.battledUsers, anchorBattleState.battledUsers) && Intrinsics.areEqual(this.sentBattleRequests, anchorBattleState.sentBattleRequests) && Intrinsics.areEqual(this.receivedBattleRequest, anchorBattleState.receivedBattleRequest) && Intrinsics.areEqual(this.isInWaiting, anchorBattleState.isInWaiting) && Intrinsics.areEqual(this.isBattleRunning, anchorBattleState.isBattleRunning) && Intrinsics.areEqual(this.isOnDisplayResult, anchorBattleState.isOnDisplayResult) && Intrinsics.areEqual(this.durationCountDown, anchorBattleState.durationCountDown) && Intrinsics.areEqual(this.battleConfig, anchorBattleState.battleConfig) && Intrinsics.areEqual(this.battleId, anchorBattleState.battleId) && this.isShowingStartView == anchorBattleState.isShowingStartView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorBattleState(@NotNull InterfaceC41678w<? extends List<BattleUser>> battledUsers, @NotNull InterfaceC41678w<? extends List<String>> sentBattleRequests, @NotNull InterfaceC41678w<BattleUser> receivedBattleRequest, @NotNull InterfaceC41678w<Boolean> isInWaiting, @NotNull InterfaceC41678w<Boolean> isBattleRunning, @NotNull InterfaceC41678w<Boolean> isOnDisplayResult, @NotNull InterfaceC41678w<Integer> durationCountDown, @NotNull BattleConfig battleConfig, @NotNull String battleId, boolean z11) {
        Intrinsics.checkNotNullParameter(battledUsers, "battledUsers");
        Intrinsics.checkNotNullParameter(sentBattleRequests, "sentBattleRequests");
        Intrinsics.checkNotNullParameter(receivedBattleRequest, "receivedBattleRequest");
        Intrinsics.checkNotNullParameter(isInWaiting, "isInWaiting");
        Intrinsics.checkNotNullParameter(isBattleRunning, "isBattleRunning");
        Intrinsics.checkNotNullParameter(isOnDisplayResult, "isOnDisplayResult");
        Intrinsics.checkNotNullParameter(durationCountDown, "durationCountDown");
        Intrinsics.checkNotNullParameter(battleConfig, "battleConfig");
        Intrinsics.checkNotNullParameter(battleId, "battleId");
        this.battledUsers = battledUsers;
        this.sentBattleRequests = sentBattleRequests;
        this.receivedBattleRequest = receivedBattleRequest;
        this.isInWaiting = isInWaiting;
        this.isBattleRunning = isBattleRunning;
        this.isOnDisplayResult = isOnDisplayResult;
        this.durationCountDown = durationCountDown;
        this.battleConfig = battleConfig;
        this.battleId = battleId;
        this.isShowingStartView = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBattleId() {
        return this.battleId;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w<List<BattleUser>> m101126b() {
        return this.battledUsers;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w<Integer> m101127c() {
        return this.durationCountDown;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w<BattleUser> m101128d() {
        return this.receivedBattleRequest;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41678w<Boolean> m101129e() {
        return this.isBattleRunning;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41678w<Boolean> m101130f() {
        return this.isInWaiting;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41678w<Boolean> m101131g() {
        return this.isOnDisplayResult;
    }

    /* JADX INFO: renamed from: h */
    public final void m101132h(@NotNull BattleConfig battleConfig) {
        Intrinsics.checkNotNullParameter(battleConfig, "<set-?>");
        this.battleConfig = battleConfig;
    }

    public int hashCode() {
        return (((((((((((((((((this.battledUsers.hashCode() * 31) + this.sentBattleRequests.hashCode()) * 31) + this.receivedBattleRequest.hashCode()) * 31) + this.isInWaiting.hashCode()) * 31) + this.isBattleRunning.hashCode()) * 31) + this.isOnDisplayResult.hashCode()) * 31) + this.durationCountDown.hashCode()) * 31) + this.battleConfig.hashCode()) * 31) + this.battleId.hashCode()) * 31) + Boolean.hashCode(this.isShowingStartView);
    }

    /* JADX INFO: renamed from: i */
    public final void m101133i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.battleId = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m101134j(boolean z11) {
        this.isShowingStartView = z11;
    }

    @NotNull
    public String toString() {
        return "AnchorBattleState(battledUsers=" + this.battledUsers + ", sentBattleRequests=" + this.sentBattleRequests + ", receivedBattleRequest=" + this.receivedBattleRequest + ", isInWaiting=" + this.isInWaiting + ", isBattleRunning=" + this.isBattleRunning + ", isOnDisplayResult=" + this.isOnDisplayResult + ", durationCountDown=" + this.durationCountDown + ", battleConfig=" + this.battleConfig + ", battleId=" + this.battleId + ", isShowingStartView=" + this.isShowingStartView + ')';
    }
}
