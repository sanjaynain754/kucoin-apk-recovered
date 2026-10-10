package io.trtc.tuikit.atomicxcore.impl.device;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39657n implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39661r f88093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88094b;

    public C39657n(C39661r c39661r, CompletionHandler completionHandler) {
        this.f88093a = c39661r;
        this.f88094b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f88093a.f88116n;
        String message = "Response: callEngine openMicrophone failed code=" + i11 + ", message=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        this.f88093a.f88103a.setValue(DeviceStatus.OFF);
        InterfaceC41669n interfaceC41669n = this.f88093a.f88104b;
        TUICommonDefine.Error errorFromInt = TUICommonDefine.Error.fromInt(i11);
        Intrinsics.checkNotNullExpressionValue(errorFromInt, "fromInt(...)");
        interfaceC41669n.setValue(AbstractC39652i.m88296a(errorFromInt));
        CompletionHandler completionHandler = this.f88094b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88093a.f88116n, "Response: callEngine openMicrophone success", "message", 0, "Response: callEngine openMicrophone success");
        this.f88093a.f88103a.setValue(DeviceStatus.ON);
        this.f88093a.f88104b.setValue(DeviceError.NO_ERROR);
        CompletionHandler completionHandler = this.f88094b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
