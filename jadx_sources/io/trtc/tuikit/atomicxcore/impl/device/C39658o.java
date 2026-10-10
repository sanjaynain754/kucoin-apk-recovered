package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C39658o implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39661r f88095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88096b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88097c;

    public C39658o(C39661r c39661r, boolean z11, CompletionHandler completionHandler) {
        this.f88095a = c39661r;
        this.f88096b = z11;
        this.f88097c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f88095a.f88108f.setValue(DeviceStatus.OFF);
        this.f88095a.f88109g.setValue(AbstractC39652i.m88296a(error));
        C39510r c39510r = this.f88095a.f88116n;
        String message2 = "roomEngine openLocalCamera fail, error: " + error + ", message: " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88097c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88095a.f88116n, "roomEngine openLocalCamera success", "message", 0, "roomEngine openLocalCamera success");
        this.f88095a.f88108f.setValue(DeviceStatus.ON);
        this.f88095a.f88109g.setValue(DeviceError.NO_ERROR);
        this.f88095a.f88110h.setValue(Boolean.valueOf(this.f88096b));
        CompletionHandler completionHandler = this.f88097c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
