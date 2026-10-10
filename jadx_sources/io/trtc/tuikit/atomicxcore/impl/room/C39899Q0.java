package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.Q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39899Q0 implements TUIRoomDefine.GetRoomInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88686b;

    public C39899Q0(C39904T0 c39904t0, CompletionHandler completionHandler) {
        this.f88685a = c39904t0;
        this.f88686b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetRoomInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88685a.f88698d;
        String message2 = "joinRoom onError: " + error + ", " + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        CompletionHandler completionHandler = this.f88686b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetRoomInfoCallback
    public final void onSuccess(TUIRoomDefine.RoomInfo roomInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        C39937a c39937a = this.f88685a.f88698d;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter("joinRoom onSuccess", "message");
        c39937a.m88357a(0, "joinRoom onSuccess");
        DeviceStore.INSTANCE.shared().setFocus$atomicxcore_release(DeviceFocusOwner.LIVE);
        RoomInfo roomInfo2 = AbstractC39939m0.m88365a(roomInfo, RoomStatus.RUNNING);
        this.f88685a.f88697c.setValue(roomInfo2);
        Lazy lazy = C39945p0.f88810b;
        C39945p0 c39945p0M88369a = AbstractC39943o0.m88369a();
        c39945p0M88369a.getClass();
        Intrinsics.checkNotNullParameter(roomInfo2, "roomInfo");
        Map map = (Map) c39945p0M88369a.f88811a.get(roomInfo2.getRoomID());
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C39934k0 c39934k0 = (C39934k0) ((InterfaceC39917c) ((Map.Entry) it.next()).getValue());
                c39934k0.getClass();
                Intrinsics.checkNotNullParameter(roomInfo2, "roomInfo");
                c39934k0.f88785s = roomInfo2;
                RoomUser roomOwner = roomInfo2.getRoomOwner();
                RoomUser roomUser = c39934k0.f88786t.f88738a;
                roomUser.setUserID(roomOwner.getUserID());
                roomUser.setUserName(roomOwner.getUserName());
                roomUser.setAvatarURL(roomOwner.getAvatarURL());
                C41696j.m91104d(c39934k0.f88784r, null, null, new C39884J(c39934k0, roomOwner, null), 3, null);
                UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                String userID = value != null ? value.getUserID() : null;
                if (userID != null && userID.length() != 0) {
                    c39934k0.f88767a.getUserInfo(userID, new C39907V(c39934k0));
                }
            }
        }
        CompletionHandler completionHandler = this.f88686b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
