package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.g0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39738g0 extends TUILiveGiftManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39744i0 f88306a;

    public C39738g0(C39744i0 c39744i0) {
        this.f88306a = c39744i0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager.Observer
    public final void onReceiveLikesMessage(String roomID, long j11, TUIRoomDefine.UserInfo sender) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.f88306a.f88322b.setValue(Long.valueOf(j11));
        LiveUserInfo liveUserInfoM88322a = AbstractC39747j0.m88322a(sender);
        AbstractC39465b.m88232a(this.f88306a.f88323c, "Listener: onReceiveLikesMessage called", "message", 0, "Listener: onReceiveLikesMessage called");
        this.f88306a.f88324d.m88249a((Function1) new C39735f0(roomID, j11, liveUserInfoM88322a));
    }
}
