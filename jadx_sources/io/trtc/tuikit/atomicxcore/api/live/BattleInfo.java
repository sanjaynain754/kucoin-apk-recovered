package io.trtc.tuikit.atomicxcore.api.live;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "", "battleID", "", "config", "Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;", "startTime", "", "endTime", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;JJ)V", "getBattleID", "()Ljava/lang/String;", "getConfig", "()Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;", "getEndTime", "()J", "getStartTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class BattleInfo {

    @NotNull
    private final String battleID;

    @NotNull
    private final BattleConfig config;
    private final long endTime;
    private final long startTime;

    public BattleInfo() {
        this(null, null, 0L, 0L, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleInfo)) {
            return false;
        }
        BattleInfo battleInfo = (BattleInfo) other;
        return Intrinsics.areEqual(this.battleID, battleInfo.battleID) && Intrinsics.areEqual(this.config, battleInfo.config) && this.startTime == battleInfo.startTime && this.endTime == battleInfo.endTime;
    }

    public BattleInfo(@NotNull String battleID, @NotNull BattleConfig config, long j11, long j12) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(config, "config");
        this.battleID = battleID;
        this.config = config;
        this.startTime = j11;
        this.endTime = j12;
    }

    public static /* synthetic */ BattleInfo copy$default(BattleInfo battleInfo, String str, BattleConfig battleConfig, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = battleInfo.battleID;
        }
        if ((i11 & 2) != 0) {
            battleConfig = battleInfo.config;
        }
        if ((i11 & 4) != 0) {
            j11 = battleInfo.startTime;
        }
        if ((i11 & 8) != 0) {
            j12 = battleInfo.endTime;
        }
        long j13 = j12;
        return battleInfo.copy(str, battleConfig, j11, j13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBattleID() {
        return this.battleID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BattleConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final BattleInfo copy(@NotNull String battleID, @NotNull BattleConfig config, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(config, "config");
        return new BattleInfo(battleID, config, startTime, endTime);
    }

    @NotNull
    public final String getBattleID() {
        return this.battleID;
    }

    @NotNull
    public final BattleConfig getConfig() {
        return this.config;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Long.hashCode(this.endTime) + ((Long.hashCode(this.startTime) + ((this.config.hashCode() + (this.battleID.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BattleInfo(battleID=" + this.battleID + ", config=" + this.config + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    public /* synthetic */ BattleInfo(String str, BattleConfig battleConfig, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new BattleConfig(0, false, null, 7, null) : battleConfig, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12);
    }
}
