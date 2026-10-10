package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJT\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001fR.\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u001fR4\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u001f¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/BattleState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "currentBattleInfo", "", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "battleUsers", "", "", "", "battleScore", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/live/BattleState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getCurrentBattleInfo", "setCurrentBattleInfo", "(Lkotlinx/coroutines/flow/w;)V", "getBattleUsers", "setBattleUsers", "getBattleScore", "setBattleScore", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class BattleState {

    @NotNull
    private InterfaceC41678w<? extends Map<String, Integer>> battleScore;

    @NotNull
    private InterfaceC41678w<? extends List<SeatUserInfo>> battleUsers;

    @NotNull
    private InterfaceC41678w<BattleInfo> currentBattleInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleState)) {
            return false;
        }
        BattleState battleState = (BattleState) other;
        return Intrinsics.areEqual(this.currentBattleInfo, battleState.currentBattleInfo) && Intrinsics.areEqual(this.battleUsers, battleState.battleUsers) && Intrinsics.areEqual(this.battleScore, battleState.battleScore);
    }

    public BattleState(@NotNull InterfaceC41678w<BattleInfo> currentBattleInfo, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> battleUsers, @NotNull InterfaceC41678w<? extends Map<String, Integer>> battleScore) {
        Intrinsics.checkNotNullParameter(currentBattleInfo, "currentBattleInfo");
        Intrinsics.checkNotNullParameter(battleUsers, "battleUsers");
        Intrinsics.checkNotNullParameter(battleScore, "battleScore");
        this.currentBattleInfo = currentBattleInfo;
        this.battleUsers = battleUsers;
        this.battleScore = battleScore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BattleState copy$default(BattleState battleState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = battleState.currentBattleInfo;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = battleState.battleUsers;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = battleState.battleScore;
        }
        return battleState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3);
    }

    @NotNull
    public final InterfaceC41678w<BattleInfo> component1() {
        return this.currentBattleInfo;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> component2() {
        return this.battleUsers;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> component3() {
        return this.battleScore;
    }

    @NotNull
    public final BattleState copy(@NotNull InterfaceC41678w<BattleInfo> currentBattleInfo, @NotNull InterfaceC41678w<? extends List<SeatUserInfo>> battleUsers, @NotNull InterfaceC41678w<? extends Map<String, Integer>> battleScore) {
        Intrinsics.checkNotNullParameter(currentBattleInfo, "currentBattleInfo");
        Intrinsics.checkNotNullParameter(battleUsers, "battleUsers");
        Intrinsics.checkNotNullParameter(battleScore, "battleScore");
        return new BattleState(currentBattleInfo, battleUsers, battleScore);
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> getBattleScore() {
        return this.battleScore;
    }

    @NotNull
    public final InterfaceC41678w<List<SeatUserInfo>> getBattleUsers() {
        return this.battleUsers;
    }

    @NotNull
    public final InterfaceC41678w<BattleInfo> getCurrentBattleInfo() {
        return this.currentBattleInfo;
    }

    public int hashCode() {
        return this.battleScore.hashCode() + AbstractC39397b.m88226a(this.battleUsers, this.currentBattleInfo.hashCode() * 31, 31);
    }

    public final void setBattleScore(@NotNull InterfaceC41678w<? extends Map<String, Integer>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.battleScore = interfaceC41678w;
    }

    public final void setBattleUsers(@NotNull InterfaceC41678w<? extends List<SeatUserInfo>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.battleUsers = interfaceC41678w;
    }

    public final void setCurrentBattleInfo(@NotNull InterfaceC41678w<BattleInfo> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.currentBattleInfo = interfaceC41678w;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BattleState(currentBattleInfo=");
        sb2.append(this.currentBattleInfo);
        sb2.append(", battleUsers=");
        sb2.append(this.battleUsers);
        sb2.append(", battleScore=");
        return AbstractC39393c.m88222a(sb2, this.battleScore, ')');
    }
}
