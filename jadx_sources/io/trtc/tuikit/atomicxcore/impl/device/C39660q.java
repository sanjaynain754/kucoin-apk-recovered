package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39660q implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39661r f88100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88101b;

    public C39660q(C39661r c39661r, CompletionHandler completionHandler) {
        this.f88100a = c39661r;
        this.f88101b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88100a.f88116n;
        String message2 = "roomEngine openLocalCamera fail, error: " + error + ", message: " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88101b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88100a.f88116n, "roomEngine openLocalCamera success", "message", 0, "roomEngine openLocalCamera success");
        CompletionHandler completionHandler = this.f88101b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
