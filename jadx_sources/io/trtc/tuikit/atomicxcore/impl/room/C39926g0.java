package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.g0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39926g0 implements TUIRoomDefine.RequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeviceType f88747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88748c;

    public C39926g0(C39934k0 c39934k0, DeviceType deviceType, CompletionHandler completionHandler) {
        this.f88746a = c39934k0;
        this.f88747b = deviceType;
        this.f88748c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onAccepted(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39915b c39915b = this.f88746a.f88791y;
        DeviceType device = this.f88747b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) c39915b.f88729c.get(device);
        if (request != null) {
            C39934k0 c39934k0 = this.f88746a;
            DeviceType device2 = this.f88747b;
            C39915b c39915b2 = c39934k0.f88791y;
            c39915b2.getClass();
            Intrinsics.checkNotNullParameter(device2, "device");
            c39915b2.f88729c.remove(device2);
            c39934k0.f88787u.m88249a((Function1) new C39920d0(request));
        }
        CompletionHandler completionHandler = this.f88748c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onCancelled(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39915b c39915b = this.f88746a.f88791y;
        DeviceType device = this.f88747b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        c39915b.f88729c.remove(device);
        CompletionHandler completionHandler = this.f88748c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onError(String str, String str2, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39915b c39915b = this.f88746a.f88791y;
        DeviceType device = this.f88747b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        c39915b.f88729c.remove(device);
        CompletionHandler completionHandler = this.f88748c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onRejected(String requestID, String userID, String message) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(message, "message");
        C39915b c39915b = this.f88746a.f88791y;
        DeviceType device = this.f88747b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) c39915b.f88729c.get(device);
        if (request != null) {
            C39934k0 c39934k0 = this.f88746a;
            DeviceType device2 = this.f88747b;
            C39915b c39915b2 = c39934k0.f88791y;
            c39915b2.getClass();
            Intrinsics.checkNotNullParameter(device2, "device");
            c39915b2.f88729c.remove(device2);
            c39934k0.f88787u.m88249a((Function1) new C39922e0(request));
        }
        CompletionHandler completionHandler = this.f88748c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onTimeout(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39915b c39915b = this.f88746a.f88791y;
        DeviceType device = this.f88747b;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) c39915b.f88729c.get(device);
        if (request != null) {
            C39934k0 c39934k0 = this.f88746a;
            DeviceType device2 = this.f88747b;
            C39915b c39915b2 = c39934k0.f88791y;
            c39915b2.getClass();
            Intrinsics.checkNotNullParameter(device2, "device");
            c39915b2.f88729c.remove(device2);
            c39934k0.f88787u.m88249a((Function1) new C39924f0(request));
        }
        CompletionHandler completionHandler = this.f88748c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
