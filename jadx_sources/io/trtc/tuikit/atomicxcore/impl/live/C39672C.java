package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C39672C implements TUIRoomDefine.RequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88143b;

    public C39672C(C39692M c39692m, CompletionHandler completionHandler) {
        this.f88142a = c39692m;
        this.f88143b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onAccepted(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M c39692m = this.f88142a;
        c39692m.f88189l = null;
        C39510r c39510r = c39692m.f88183f;
        String message = "Listener: onGuestApplicationResponded with accepted=true,requestId=" + requestID + ",userID=" + userID;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88142a.f88187j.m88249a((Function1) new C39787z(userID));
        CompletionHandler completionHandler = this.f88143b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onCancelled(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M c39692m = this.f88142a;
        c39692m.f88189l = null;
        C39510r c39510r = c39692m.f88183f;
        String message = "Response: applyForSeat onCancelled with requestId=" + requestID + ",userID=" + userID;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        CompletionHandler completionHandler = this.f88143b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onError(String str, String str2, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88142a.f88183f;
        String message2 = "Response: applyForSeat onError with  requestId=" + str + ",code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        CompletionHandler completionHandler = this.f88143b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onRejected(String requestID, String userID, String message) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(message, "message");
        C39692M c39692m = this.f88142a;
        c39692m.f88189l = null;
        C39510r c39510r = c39692m.f88183f;
        String message2 = "Listener: onGuestApplicationResponded with accepted=false,requestId=" + requestID + ",userID=" + userID;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        this.f88142a.f88187j.m88249a((Function1) new C39668A(userID));
        CompletionHandler completionHandler = this.f88143b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onTimeout(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M c39692m = this.f88142a;
        c39692m.f88189l = null;
        C39510r c39510r = c39692m.f88183f;
        String message = "Listener: onTimeout-onGuestApplicationNoResponse with requestId=" + requestID + ",userID=" + userID;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88142a.f88187j.m88249a((Function1) C39670B.f88140a);
        CompletionHandler completionHandler = this.f88143b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
