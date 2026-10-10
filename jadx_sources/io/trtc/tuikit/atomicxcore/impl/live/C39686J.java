package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C39686J implements TUIRoomDefine.RequestCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88164a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88165b;

    public C39686J(C39692M c39692m, CompletionHandler completionHandler) {
        this.f88164a = c39692m;
        this.f88165b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onAccepted(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M.m88301b(this.f88164a, userID);
        AbstractC39662a.m88299a("Listener: onHostInvitationResponded with accepted=true, userID=", userID, this.f88164a.f88183f, "message", 0);
        this.f88164a.f88186i.m88249a((Function1) new C39680G(userID));
        CompletionHandler completionHandler = this.f88165b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onCancelled(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M.m88301b(this.f88164a, userID);
        AbstractC39662a.m88299a("Response: inviteToSeat onCancelled with userID=", userID, this.f88164a.f88183f, "message", 0);
        CompletionHandler completionHandler = this.f88165b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onError(String str, String str2, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88164a.f88183f;
        String message2 = "Response: inviteToSeat onError with code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        CompletionHandler completionHandler = this.f88165b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onRejected(String requestID, String userID, String message) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(message, "message");
        C39692M.m88301b(this.f88164a, userID);
        AbstractC39662a.m88299a("Listener: onHostInvitationResponded with accepted=false, userID=", userID, this.f88164a.f88183f, "message", 0);
        this.f88164a.f88186i.m88249a((Function1) new C39682H(userID));
        CompletionHandler completionHandler = this.f88165b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestCallback
    public final void onTimeout(String requestID, String userID) {
        Intrinsics.checkNotNullParameter(requestID, "requestID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39692M.m88301b(this.f88164a, userID);
        C39510r c39510r = this.f88164a.f88183f;
        String message = "Listener: onHostInvitationNoResponse with userID=" + userID + ", reason=TIMEOUT";
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88164a.f88186i.m88249a((Function1) new C39684I(userID));
        CompletionHandler completionHandler = this.f88165b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
