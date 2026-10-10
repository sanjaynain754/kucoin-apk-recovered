package wd0;

import android.graphics.Rect;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.d */
/* JADX INFO: compiled from: AnchorBattleStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"convertToBattleUser", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "seatUserInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45800d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BattleUser m101135a(@NotNull SeatUserInfo seatUserInfo) {
        Intrinsics.checkNotNullParameter(seatUserInfo, "seatUserInfo");
        return new BattleUser(seatUserInfo.getLiveID(), seatUserInfo.getUserID(), seatUserInfo.getUserName(), seatUserInfo.getAvatarURL(), 0, 0, new Rect());
    }
}
