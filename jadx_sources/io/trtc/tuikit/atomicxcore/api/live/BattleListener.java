package io.trtc.tuikit.atomicxcore.api.live;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "", "()V", "onBattleEnded", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "onBattleRequestAccept", "battleID", "", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitee", "onBattleRequestCancelled", "onBattleRequestReceived", "onBattleRequestReject", "onBattleRequestTimeout", "onBattleStarted", "invitees", "", "onUserExitBattle", "battleUser", "onUserJoinBattle", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class BattleListener {
    public void onBattleEnded(@NotNull BattleInfo battleInfo, @Nullable BattleEndedReason reason) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
    }

    public void onBattleRequestAccept(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onBattleRequestCancelled(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onBattleRequestReceived(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onBattleRequestReject(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onBattleRequestTimeout(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
    }

    public void onBattleStarted(@NotNull BattleInfo battleInfo, @NotNull SeatUserInfo inviter, @NotNull List<SeatUserInfo> invitees) {
        Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitees, "invitees");
    }

    public void onUserExitBattle(@NotNull String battleID, @NotNull SeatUserInfo battleUser) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(battleUser, "battleUser");
    }

    public void onUserJoinBattle(@NotNull String battleID, @NotNull SeatUserInfo battleUser) {
        Intrinsics.checkNotNullParameter(battleID, "battleID");
        Intrinsics.checkNotNullParameter(battleUser, "battleUser");
    }
}
