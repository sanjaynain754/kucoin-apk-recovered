package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.bugly.proguard.C33556b3;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineImpl;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.RegionInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.view.CoreViewType;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.C39763o1;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C40047C implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreView f89092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveListStore f89093b;

    public C40047C(LiveCoreView liveCoreView, LiveListStore liveListStore) {
        this.f89092a = liveCoreView;
        this.f89093b = liveListStore;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) throws Exception {
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        TUIRoomDefine.LoginUserInfo selfInfo = TUIRoomEngineImpl.getSelfInfo();
        LiveCanvas liveCanvas = new LiveCanvas(720, 1280, 0);
        ArrayList arrayList = new ArrayList();
        String userId = selfInfo.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        String userName = selfInfo.userName;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        String avatarUrl = selfInfo.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "avatarUrl");
        String str = "live_" + selfInfo.userId;
        DeviceStatus deviceStatus2 = DeviceStatus.OFF;
        arrayList.add(new SeatInfo(0, false, new SeatUserInfo(userId, userName, avatarUrl, null, str, deviceStatus2, false, deviceStatus2, false, null, C33556b3.f69067m, null), new RegionInfo(0, 0, 720, 1280, 0)));
        C39763o1 c39763o1 = new C39763o1(liveCanvas, arrayList);
        if (deviceStatus == DeviceStatus.ON && this.f89092a.getViewType() == CoreViewType.PUSH_VIEW && this.f89093b.getLiveState().getCurrentLive().getValue().getLiveID().length() == 0 && !Intrinsics.areEqual(c39763o1, this.f89092a.getLastSeatLayout())) {
            C39510r logger = this.f89092a.getLogger();
            String message = "oid:" + this.f89092a.getOid() + ", onCameraStatusChanged updateSeatLayout " + c39763o1;
            logger.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            logger.m88251a(0, message);
            AbstractC40069N.m88434a(this.f89092a, c39763o1);
        }
        return Unit.INSTANCE;
    }
}
