package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.L0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39889L0 implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88654b;

    public C39889L0(C39904T0 c39904t0, CompletionHandler completionHandler) {
        this.f88653a = c39904t0;
        this.f88654b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88653a.f88698d;
        String message2 = "leaveRoom onError: " + error + ", " + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        CompletionHandler completionHandler = this.f88654b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        C39937a c39937a = this.f88653a.f88698d;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter("leaveRoom onSuccess", "message");
        c39937a.m88357a(0, "leaveRoom onSuccess");
        Lazy lazy = C39945p0.f88810b;
        AbstractC39943o0.m88369a().m88370a(((RoomInfo) this.f88653a.f88697c.getValue()).getRoomID());
        this.f88653a.f88697c.setValue(new RoomInfo(null, null, null, 0, 0L, null, 0L, 0L, 0, null, null, false, false, false, false, 32767, null));
        CompletionHandler completionHandler = this.f88654b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
