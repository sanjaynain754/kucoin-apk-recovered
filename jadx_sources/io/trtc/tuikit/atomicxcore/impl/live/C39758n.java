package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39758n implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39767q f88346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88347b;

    public C39758n(C39767q c39767q, CompletionHandler completionHandler) {
        this.f88346a = c39767q;
        this.f88347b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String s11) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(s11, "s");
        C39510r c39510r = this.f88346a.f88369d;
        String message = "Response: exitBattle failed code=" + error.getValue() + ", message=" + s11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        CompletionHandler completionHandler = this.f88347b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), s11);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88346a.f88369d, "Response: exitBattle success", "message", 0, "Response: exitBattle success");
        CompletionHandler completionHandler = this.f88347b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
