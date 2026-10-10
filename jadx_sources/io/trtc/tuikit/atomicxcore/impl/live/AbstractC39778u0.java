package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.TakeSeatMode;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.u0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39778u0 {
    /* JADX INFO: renamed from: a */
    public static final LiveInfo m88330a(TUILiveListManager.LiveInfo liveInfo) {
        TakeSeatMode takeSeatMode;
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        LiveUserInfo liveUserInfo = new LiveUserInfo(null, null, null, 7, null);
        String str = liveInfo.ownerId;
        if (str == null) {
            str = "";
        } else {
            Intrinsics.checkNotNull(str);
        }
        liveUserInfo.setUserID(str);
        String str2 = liveInfo.ownerName;
        if (str2 == null) {
            str2 = "";
        } else {
            Intrinsics.checkNotNull(str2);
        }
        liveUserInfo.setUserName(str2);
        String str3 = liveInfo.ownerAvatarUrl;
        if (str3 == null) {
            str3 = "";
        } else {
            Intrinsics.checkNotNull(str3);
        }
        liveUserInfo.setAvatarURL(str3);
        String str4 = liveInfo.roomId;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = liveInfo.name;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = liveInfo.notice;
        if (str6 == null) {
            str6 = "";
        }
        boolean z11 = liveInfo.isMessageDisableForAllUser;
        boolean z12 = liveInfo.isPublicVisible;
        boolean z13 = liveInfo.isSeatEnabled;
        boolean z14 = liveInfo.keepOwnerOnSeat;
        int i11 = liveInfo.maxSeatCount;
        TUIRoomDefine.SeatMode seatMode = liveInfo.seatMode;
        Intrinsics.checkNotNullExpressionValue(seatMode, "seatMode");
        Intrinsics.checkNotNullParameter(seatMode, "seatMode");
        int i12 = AbstractC39776t0.f88398d[seatMode.ordinal()];
        if (i12 == 1) {
            takeSeatMode = TakeSeatMode.FREE;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            takeSeatMode = TakeSeatMode.APPLY;
        }
        int i13 = liveInfo.seatLayoutTemplateId;
        String str7 = liveInfo.coverUrl;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = liveInfo.backgroundUrl;
        if (str8 == null) {
            str8 = "";
        }
        List<Integer> listEmptyList = liveInfo.categoryList;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new LiveInfo(str4, str5, str6, z11, z12, z13, z14, i11, takeSeatMode, i13, str7, str8, listEmptyList, liveInfo.activityStatus, liveUserInfo, liveInfo.createTime, liveInfo.viewCount, true, MapsKt.emptyMap());
    }

    /* JADX INFO: renamed from: a */
    public static final TUILiveListManager.LiveInfo m88329a(LiveInfo liveInfo) {
        TUIRoomDefine.SeatMode seatMode;
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        TUILiveListManager.LiveInfo liveInfo2 = new TUILiveListManager.LiveInfo();
        liveInfo2.roomId = liveInfo.getLiveID();
        liveInfo2.name = liveInfo.getLiveName();
        liveInfo2.notice = liveInfo.getNotice();
        liveInfo2.isMessageDisableForAllUser = liveInfo.isMessageDisable();
        liveInfo2.isPublicVisible = liveInfo.isPublicVisible();
        liveInfo2.isSeatEnabled = liveInfo.isSeatEnabled();
        liveInfo2.keepOwnerOnSeat = liveInfo.getKeepOwnerOnSeat();
        liveInfo2.maxSeatCount = liveInfo.getMaxSeatCount();
        TakeSeatMode seatMode2 = liveInfo.getSeatMode();
        Intrinsics.checkNotNullParameter(seatMode2, "seatMode");
        int i11 = AbstractC39776t0.f88397c[seatMode2.ordinal()];
        if (i11 == 1) {
            seatMode = TUIRoomDefine.SeatMode.FREE_TO_TAKE;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            seatMode = TUIRoomDefine.SeatMode.APPLY_TO_TAKE;
        }
        liveInfo2.seatMode = seatMode;
        liveInfo2.seatLayoutTemplateId = liveInfo.getSeatLayoutTemplateID();
        liveInfo2.coverUrl = liveInfo.getCoverURL();
        liveInfo2.backgroundUrl = liveInfo.getBackgroundURL();
        liveInfo2.categoryList = liveInfo.getCategoryList();
        liveInfo2.activityStatus = liveInfo.getActivityStatus();
        liveInfo2.ownerId = liveInfo.getLiveOwner().getUserID();
        liveInfo2.ownerName = liveInfo.getLiveOwner().getUserName();
        liveInfo2.ownerAvatarUrl = liveInfo.getLiveOwner().getAvatarURL();
        liveInfo2.createTime = liveInfo.getCreateTime();
        liveInfo2.viewCount = liveInfo.getTotalViewerCount();
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        roomInfo.roomId = liveInfo.getLiveID();
        roomInfo.ownerId = liveInfo.getLiveOwner().getUserID();
        roomInfo.ownerName = liveInfo.getLiveOwner().getUserName();
        roomInfo.ownerAvatarUrl = liveInfo.getLiveOwner().getAvatarURL();
        roomInfo.name = liveInfo.getLiveName();
        roomInfo.isMessageDisableForAllUser = liveInfo.isMessageDisable();
        roomInfo.isSeatEnabled = liveInfo.isSeatEnabled();
        roomInfo.keepOwnerOnSeat = liveInfo.getKeepOwnerOnSeat();
        roomInfo.maxSeatCount = liveInfo.getMaxSeatCount();
        roomInfo.seatMode = liveInfo.getSeatMode() == TakeSeatMode.FREE ? TUIRoomDefine.SeatMode.FREE_TO_TAKE : TUIRoomDefine.SeatMode.APPLY_TO_TAKE;
        roomInfo.createTime = liveInfo.getCreateTime();
        liveInfo2.roomInfo = roomInfo;
        return liveInfo2;
    }
}
