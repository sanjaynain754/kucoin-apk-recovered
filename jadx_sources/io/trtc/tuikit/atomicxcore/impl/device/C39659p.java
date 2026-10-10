package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39659p implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39661r f88098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88099b;

    public C39659p(C39661r c39661r, CompletionHandler completionHandler) {
        this.f88098a = c39661r;
        this.f88099b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        C39510r c39510r = this.f88098a.f88116n;
        String message = "roomEngine openLocalMicrophone fail, error: " + error + ", message: " + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        this.f88098a.f88103a.setValue(DeviceStatus.OFF);
        this.f88098a.f88104b.setValue(AbstractC39652i.m88296a(error));
        CompletionHandler completionHandler = this.f88099b;
        if (completionHandler != null) {
            int value = error.getValue();
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(value, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88098a.f88116n, "roomEngine openLocalMicrophone success", "message", 0, "roomEngine openLocalMicrophone success");
        this.f88098a.f88103a.setValue(DeviceStatus.ON);
        this.f88098a.f88104b.setValue(DeviceError.NO_ERROR);
        CompletionHandler completionHandler = this.f88099b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
