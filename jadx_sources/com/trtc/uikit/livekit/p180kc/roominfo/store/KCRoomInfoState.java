package com.trtc.uikit.livekit.p180kc.roominfo.store;

import androidx.annotation.Keep;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.p180kc.data.entity.TradeCardInfo;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRoomInfoState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006."}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/roominfo/store/KCRoomInfoState;", "", "<init>", "()V", "selfUserId", "", "getSelfUserId", "()Ljava/lang/String;", "setSelfUserId", "(Ljava/lang/String;)V", "roomId", "getRoomId", "setRoomId", "enableFollow", "", "getEnableFollow", "()Z", "setEnableFollow", "(Z)V", TUIConstantDefine.OWNER_ID, "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOwnerId", "()Lkotlinx/coroutines/flow/MutableStateFlow;", TUIConstantDefine.OWNER_NAME, "getOwnerName", TUIConstantDefine.OWNER_AVATAR_URL, "getOwnerAvatarUrl", "hotCount", "", "getHotCount", "refreshHitPeriod", "getRefreshHitPeriod", "tradeCardInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/TradeCardInfo;", "getTradeCardInfo", "showReserveInfo", "getShowReserveInfo", "followButtonState", "Lcom/trtc/uikit/livekit/kc/roominfo/store/FollowButtonState;", "getFollowButtonState", "reserveButtonState", "Lcom/trtc/uikit/livekit/kc/roominfo/store/ReserveButtonState;", "getReserveButtonState", "reserveInfoState", "Lcom/trtc/uikit/livekit/kc/roominfo/store/ReserveInfoState;", "getReserveInfoState", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCRoomInfoState {

    @NotNull
    private String selfUserId = "";

    @NotNull
    private String roomId = "";
    private boolean enableFollow = true;

    @NotNull
    private final InterfaceC41669n<String> ownerId = C41679x.m91009a("");

    @NotNull
    private final InterfaceC41669n<String> ownerName = C41679x.m91009a("");

    @NotNull
    private final InterfaceC41669n<String> ownerAvatarUrl = C41679x.m91009a("");

    @NotNull
    private final InterfaceC41669n<Long> hotCount = C41679x.m91009a(0L);

    @NotNull
    private final InterfaceC41669n<Long> refreshHitPeriod = C41679x.m91009a(0L);

    @NotNull
    private final InterfaceC41669n<TradeCardInfo> tradeCardInfo = C41679x.m91009a(null);

    @NotNull
    private final InterfaceC41669n<Boolean> showReserveInfo = C41679x.m91009a(Boolean.FALSE);

    @NotNull
    private final InterfaceC41669n<FollowButtonState> followButtonState = C41679x.m91009a(null);

    @NotNull
    private final InterfaceC41669n<ReserveButtonState> reserveButtonState = C41679x.m91009a(null);

    @NotNull
    private final InterfaceC41669n<ReserveInfoState> reserveInfoState = C41679x.m91009a(null);

    public final boolean getEnableFollow() {
        return this.enableFollow;
    }

    @NotNull
    public final InterfaceC41669n<FollowButtonState> getFollowButtonState() {
        return this.followButtonState;
    }

    @NotNull
    public final InterfaceC41669n<Long> getHotCount() {
        return this.hotCount;
    }

    @NotNull
    public final InterfaceC41669n<String> getOwnerAvatarUrl() {
        return this.ownerAvatarUrl;
    }

    @NotNull
    public final InterfaceC41669n<String> getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final InterfaceC41669n<String> getOwnerName() {
        return this.ownerName;
    }

    @NotNull
    public final InterfaceC41669n<Long> getRefreshHitPeriod() {
        return this.refreshHitPeriod;
    }

    @NotNull
    public final InterfaceC41669n<ReserveButtonState> getReserveButtonState() {
        return this.reserveButtonState;
    }

    @NotNull
    public final InterfaceC41669n<ReserveInfoState> getReserveInfoState() {
        return this.reserveInfoState;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getSelfUserId() {
        return this.selfUserId;
    }

    @NotNull
    public final InterfaceC41669n<Boolean> getShowReserveInfo() {
        return this.showReserveInfo;
    }

    @NotNull
    public final InterfaceC41669n<TradeCardInfo> getTradeCardInfo() {
        return this.tradeCardInfo;
    }

    public final void setEnableFollow(boolean z11) {
        this.enableFollow = z11;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setSelfUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selfUserId = str;
    }
}
