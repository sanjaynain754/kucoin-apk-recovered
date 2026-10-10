package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.Z */
/* JADX INFO: loaded from: classes61.dex */
public final class C39912Z implements TUIRoomDefine.RequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeviceType f88723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88724c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88725d;

    public C39912Z(C39934k0 c39934k0, DeviceType deviceType, CompletionHandler completionHandler, String str) {
        this.f88722a = c39934k0;
        this.f88723b = deviceType;
        this.f88724c = completionHandler;
        this.f88725d = str;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onAccepted(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        TUIRoomDefine.Request requestM88343a = this.f88722a.f88791y.m88343a(userID, this.f88723b);
        if (requestM88343a != null) {
            C39934k0 c39934k0 = this.f88722a;
            c39934k0.f88791y.m88347c(userID, this.f88723b);
            c39934k0.f88787u.m88249a((Function1) new C39909W(requestM88343a));
        }
        CompletionHandler completionHandler = this.f88724c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onCancelled(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88722a.f88791y.m88347c(userID, this.f88723b);
        CompletionHandler completionHandler = this.f88724c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onError(String str, String str2, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f88722a.f88791y.m88347c(this.f88725d, this.f88723b);
        CompletionHandler completionHandler = this.f88724c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onRejected(String requestID, String userID, String message) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(message, "message");
        TUIRoomDefine.Request requestM88343a = this.f88722a.f88791y.m88343a(userID, this.f88723b);
        if (requestM88343a != null) {
            C39934k0 c39934k0 = this.f88722a;
            c39934k0.f88791y.m88347c(userID, this.f88723b);
            c39934k0.f88787u.m88249a((Function1) new C39910X(requestM88343a));
        }
        CompletionHandler completionHandler = this.f88724c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onTimeout(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        TUIRoomDefine.Request requestM88343a = this.f88722a.f88791y.m88343a(userID, this.f88723b);
        if (requestM88343a != null) {
            C39934k0 c39934k0 = this.f88722a;
            c39934k0.f88791y.m88347c(userID, this.f88723b);
            c39934k0.f88787u.m88249a((Function1) new C39911Y(requestM88343a));
        }
        CompletionHandler completionHandler = this.f88724c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
