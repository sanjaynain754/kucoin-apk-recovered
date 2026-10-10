package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.X0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39714X0 implements TUIRoomDefine.RequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39716Y0 f88230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88231b;

    public C39714X0(C39716Y0 c39716y0, CompletionHandler completionHandler) {
        this.f88230a = c39716y0;
        this.f88231b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onAccepted(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        AbstractC39662a.m88299a("Response: takeSeat onAccepted with userID=", userID, this.f88230a.f88240g, "message", 0);
        CompletionHandler completionHandler = this.f88231b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onCancelled(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        AbstractC39662a.m88299a("Response: takeSeat onCancelled with userID=", userID, this.f88230a.f88240g, "message", 0);
        CompletionHandler completionHandler = this.f88231b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onError(String str, String str2, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88230a.f88240g;
        String message2 = "Response: takeSeat onError with code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        CompletionHandler completionHandler = this.f88231b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onRejected(String requestID, String userID, String message) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88230a.f88240g;
        String message2 = "Response: takeSeat onRejected with userID=" + userID + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        CompletionHandler completionHandler = this.f88231b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onTimeout(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        AbstractC39662a.m88299a("Response: takeSeat onTimeout with userID=", userID, this.f88230a.f88240g, "message", 0);
        CompletionHandler completionHandler = this.f88231b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
